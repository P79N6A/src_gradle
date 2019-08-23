package com.crashlytics.android.answers;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.g;
import io.fabric.sdk.android.services.c.f;
import io.fabric.sdk.android.services.d.e;
import io.fabric.sdk.android.services.f.b;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class EnabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    g apiKey = new g();
    private final Context context;
    boolean customEventsEnabled = true;
    EventFilter eventFilter = new KeepAllEventFilter();
    private final ScheduledExecutorService executorService;
    private final SessionAnalyticsFilesManager filesManager;
    f filesSender;
    private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    boolean forwardToFirebaseAnalyticsEnabled = false;
    private final e httpRequestFactory;
    boolean includePurchaseEventsInForwardedEvents = false;
    private final i kit;
    final SessionEventMetadata metadata;
    boolean predefinedEventsEnabled = true;
    private final AtomicReference<ScheduledFuture<?>> rolloverFutureRef = new AtomicReference<>();
    volatile int rolloverIntervalSeconds = -1;

    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (IOException unused) {
            io.fabric.sdk.android.services.b.i.b(this.context, "Failed to roll file over.");
            return false;
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
        boolean z;
        if (this.rolloverIntervalSeconds != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            scheduleTimeBasedFileRollOver((long) this.rolloverIntervalSeconds, (long) this.rolloverIntervalSeconds);
        }
    }

    public void cancelTimeBasedFileRollOver() {
        if (this.rolloverFutureRef.get() != null) {
            io.fabric.sdk.android.services.b.i.a(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            this.rolloverFutureRef.get().cancel(false);
            this.rolloverFutureRef.set(null);
        }
    }

    public void sendEvents() {
        if (this.filesSender == null) {
            io.fabric.sdk.android.services.b.i.a(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        io.fabric.sdk.android.services.b.i.a(this.context, "Sending all files");
        List batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int i = 0;
        while (batchOfFilesToSend.size() > 0) {
            try {
                io.fabric.sdk.android.services.b.i.a(this.context, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(batchOfFilesToSend.size())}));
                boolean send = this.filesSender.send(batchOfFilesToSend);
                if (send) {
                    i += batchOfFilesToSend.size();
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                }
                if (!send) {
                    break;
                }
                batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
            } catch (Exception e2) {
                Context context2 = this.context;
                io.fabric.sdk.android.services.b.i.b(context2, "Failed to send batch of analytics files to server: " + e2.getMessage());
            }
        }
        if (i == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    public void processEvent(SessionEvent.Builder builder) {
        boolean z;
        SessionEvent build = builder.build(this.metadata);
        if (!this.customEventsEnabled && SessionEvent.Type.CUSTOM.equals(build.type)) {
            new StringBuilder("Custom events tracking disabled - skipping event: ").append(build);
        } else if (!this.predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(build.type)) {
            new StringBuilder("Predefined events tracking disabled - skipping event: ").append(build);
        } else if (this.eventFilter.skipEvent(build)) {
            new StringBuilder("Skipping filtered event: ").append(build);
        } else {
            try {
                this.filesManager.writeEvent(build);
            } catch (IOException unused) {
                new StringBuilder("Failed to write event: ").append(build);
            }
            scheduleTimeBasedRollOverIfNeeded();
            if (SessionEvent.Type.CUSTOM.equals(build.type) || SessionEvent.Type.PREDEFINED.equals(build.type)) {
                z = true;
            } else {
                z = false;
            }
            boolean equals = "purchase".equals(build.predefinedType);
            if (this.forwardToFirebaseAnalyticsEnabled && z) {
                if (!equals || this.includePurchaseEventsInForwardedEvents) {
                    try {
                        this.firebaseAnalyticsApiAdapter.processEvent(build);
                    } catch (Exception unused2) {
                        new StringBuilder("Failed to map event to Firebase: ").append(build);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void scheduleTimeBasedFileRollOver(long j, long j2) {
        boolean z;
        if (this.rolloverFutureRef.get() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            io.fabric.sdk.android.services.c.i iVar = new io.fabric.sdk.android.services.c.i(this.context, this);
            Context context2 = this.context;
            io.fabric.sdk.android.services.b.i.a(context2, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.rolloverFutureRef.set(this.executorService.scheduleAtFixedRate(iVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException unused) {
                io.fabric.sdk.android.services.b.i.b(this.context, "Failed to schedule time based file roll over");
            }
        }
    }

    public void setAnalyticsSettingsData(b bVar, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        SessionAnalyticsFilesSender sessionAnalyticsFilesSender = new SessionAnalyticsFilesSender(this.kit, str, bVar.f83297a, this.httpRequestFactory, this.apiKey.a(this.context));
        this.filesSender = AnswersRetryFilesSender.build(sessionAnalyticsFilesSender);
        this.filesManager.setAnalyticsSettingsData(bVar);
        this.forwardToFirebaseAnalyticsEnabled = bVar.f83302f;
        this.includePurchaseEventsInForwardedEvents = bVar.g;
        StringBuilder sb = new StringBuilder("Firebase analytics forwarding ");
        if (this.forwardToFirebaseAnalyticsEnabled) {
            str2 = "enabled";
        } else {
            str2 = "disabled";
        }
        sb.append(str2);
        StringBuilder sb2 = new StringBuilder("Firebase analytics including purchase events ");
        if (this.includePurchaseEventsInForwardedEvents) {
            str3 = "enabled";
        } else {
            str3 = "disabled";
        }
        sb2.append(str3);
        this.customEventsEnabled = bVar.h;
        StringBuilder sb3 = new StringBuilder("Custom event tracking ");
        if (this.customEventsEnabled) {
            str4 = "enabled";
        } else {
            str4 = "disabled";
        }
        sb3.append(str4);
        this.predefinedEventsEnabled = bVar.i;
        StringBuilder sb4 = new StringBuilder("Predefined event tracking ");
        if (this.predefinedEventsEnabled) {
            str5 = "enabled";
        } else {
            str5 = "disabled";
        }
        sb4.append(str5);
        if (bVar.k > 1) {
            this.eventFilter = new SamplingEventFilter(bVar.k);
        }
        this.rolloverIntervalSeconds = bVar.f83298b;
        scheduleTimeBasedFileRollOver(0, (long) this.rolloverIntervalSeconds);
    }

    public EnabledSessionAnalyticsManagerStrategy(i iVar, Context context2, ScheduledExecutorService scheduledExecutorService, SessionAnalyticsFilesManager sessionAnalyticsFilesManager, e eVar, SessionEventMetadata sessionEventMetadata, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter2) {
        this.kit = iVar;
        this.context = context2;
        this.executorService = scheduledExecutorService;
        this.filesManager = sessionAnalyticsFilesManager;
        this.httpRequestFactory = eVar;
        this.metadata = sessionEventMetadata;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter2;
    }
}
