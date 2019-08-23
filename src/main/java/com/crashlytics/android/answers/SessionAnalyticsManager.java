package com.crashlytics.android.answers;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager;
import com.crashlytics.android.answers.SessionEvent;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import io.fabric.sdk.android.a;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.o;
import io.fabric.sdk.android.services.b.s;
import io.fabric.sdk.android.services.f.b;
import java.util.concurrent.ScheduledExecutorService;

public class SessionAnalyticsManager implements BackgroundManager.Listener {
    final BackgroundManager backgroundManager;
    final AnswersEventsHandler eventsHandler;
    private final long installedAt;
    final a lifecycleManager;
    final AnswersPreferenceManager preferenceManager;

    public void onError(String str) {
    }

    public void onBackground() {
        this.eventsHandler.flushEvents();
    }

    /* access modifiers changed from: package-private */
    public boolean isFirstLaunch() {
        if (!this.preferenceManager.hasAnalyticsLaunched()) {
            return true;
        }
        return false;
    }

    public void disable() {
        a aVar = this.lifecycleManager;
        if (aVar.f83123a != null) {
            a.C0881a aVar2 = aVar.f83123a;
            for (Application.ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : aVar2.f83125a) {
                aVar2.f83126b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }
        this.eventsHandler.disable();
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.a(new AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch()) {
            onInstall(this.installedAt);
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    public void onInstall(long j) {
        this.eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(j));
    }

    public void onCustom(CustomEvent customEvent) {
        new StringBuilder("Logged custom event: ").append(customEvent);
        this.eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customEvent));
    }

    public void onPredefined(PredefinedEvent predefinedEvent) {
        new StringBuilder("Logged predefined event: ").append(predefinedEvent);
        this.eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void setAnalyticsSettingsData(b bVar, String str) {
        this.backgroundManager.setFlushOnBackground(bVar.j);
        this.eventsHandler.setAnalyticsSettingsData(bVar, str);
    }

    public void onCrash(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.eventsHandler.processEventSync(SessionEvent.crashEventBuilder(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    public void onLifecycle(Activity activity, SessionEvent.Type type) {
        new StringBuilder("Logged lifecycle event: ").append(type.name());
        this.eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
    }

    SessionAnalyticsManager(AnswersEventsHandler answersEventsHandler, a aVar, BackgroundManager backgroundManager2, AnswersPreferenceManager answersPreferenceManager, long j) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = aVar;
        this.backgroundManager = backgroundManager2;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j;
    }

    public static SessionAnalyticsManager build(i iVar, Context context, s sVar, String str, String str2, long j) {
        Context context2 = context;
        s sVar2 = sVar;
        SessionMetadataCollector sessionMetadataCollector = new SessionMetadataCollector(context, sVar, str, str2);
        AnswersFilesManagerProvider answersFilesManagerProvider = new AnswersFilesManagerProvider(context, new io.fabric.sdk.android.services.e.b(iVar));
        io.fabric.sdk.android.services.d.b bVar = new io.fabric.sdk.android.services.d.b(c.a());
        a aVar = new a(context);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a(o.a("Answers Events Handler")).a());
        o.a("Answers Events Handler", scheduledExecutorService);
        BackgroundManager backgroundManager2 = new BackgroundManager(scheduledExecutorService);
        AnswersEventsHandler answersEventsHandler = new AnswersEventsHandler(iVar, context, answersFilesManagerProvider, sessionMetadataCollector, bVar, scheduledExecutorService, new FirebaseAnalyticsApiAdapter(context));
        SessionAnalyticsManager sessionAnalyticsManager = new SessionAnalyticsManager(answersEventsHandler, aVar, backgroundManager2, AnswersPreferenceManager.build(context), j);
        return sessionAnalyticsManager;
    }
}
