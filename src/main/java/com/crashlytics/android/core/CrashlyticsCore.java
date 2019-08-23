package com.crashlytics.android.core;

import android.content.Context;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import com.crashlytics.android.answers.EventLogger;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.g;
import io.fabric.sdk.android.services.b.l;
import io.fabric.sdk.android.services.b.r;
import io.fabric.sdk.android.services.b.s;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.d;
import io.fabric.sdk.android.services.concurrency.f;
import io.fabric.sdk.android.services.concurrency.k;
import io.fabric.sdk.android.services.d.e;
import io.fabric.sdk.android.services.e.b;
import io.fabric.sdk.android.services.f.q;
import io.fabric.sdk.android.services.f.t;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

@DependsOn(a = {CrashlyticsNdkDataProvider.class})
public class CrashlyticsCore extends i<Void> {
    private final ConcurrentHashMap<String, String> attributes;
    private CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    private float delay;
    private boolean disabled;
    private e httpRequestFactory;
    public CrashlyticsFileMarker initializationMarker;
    private CrashlyticsListener listener;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;

    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = 1.0f;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public Builder delay(float f2) {
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("delay must be greater than 0");
            } else if (this.delay <= 0.0f) {
                this.delay = f2;
                return this;
            } else {
                throw new IllegalStateException("delay already set.");
            }
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.listener == null) {
                this.listener = crashlyticsListener;
                return this;
            } else {
                throw new IllegalStateException("listener already set.");
            }
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider2) {
            if (pinningInfoProvider2 == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            } else if (this.pinningInfoProvider == null) {
                this.pinningInfoProvider = pinningInfoProvider2;
                return this;
            } else {
                throw new IllegalStateException("pinningInfoProvider already set.");
            }
        }
    }

    static final class CrashMarkerCheck implements Callable<Boolean> {
        private final CrashlyticsFileMarker crashMarker;

        public final Boolean call() throws Exception {
            if (!this.crashMarker.isPresent()) {
                return Boolean.FALSE;
            }
            this.crashMarker.remove();
            return Boolean.TRUE;
        }

        public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }
    }

    static final class NoOpListener implements CrashlyticsListener {
        public final void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }

        private NoOpListener() {
        }
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public String getVersion() {
        return "2.7.0.33";
    }

    /* access modifiers changed from: package-private */
    public CrashlyticsController getController() {
        return this.controller;
    }

    public CrashlyticsCore() {
        this(1.0f, null, null, false);
    }

    /* access modifiers changed from: package-private */
    public void createCrashMarker() {
        this.crashMarker.create();
    }

    /* access modifiers changed from: package-private */
    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    public boolean onPreExecute() {
        return onPreExecute(this.context);
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) c.a(CrashlyticsCore.class);
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    /* access modifiers changed from: package-private */
    public CrashlyticsNdkData getNativeCrashData() {
        if (this.crashlyticsNdkDataProvider != null) {
            return this.crashlyticsNdkDataProvider.getCrashlyticsNdkData();
        }
        return null;
    }

    public PinningInfoProvider getPinningInfoProvider() {
        if (!this.disabled) {
            return this.pinningInfo;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String getUserEmail() {
        if (this.idManager.f83193a) {
            return this.userEmail;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String getUserIdentifier() {
        if (this.idManager.f83193a) {
            return this.userId;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String getUserName() {
        if (this.idManager.f83193a) {
            return this.userName;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void markInitializationComplete() {
        this.backgroundWorker.submit((Callable<T>) new Callable<Boolean>() {
            public Boolean call() throws Exception {
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    new StringBuilder("Initialization marker file removed: ").append(remove);
                    return Boolean.valueOf(remove);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void markInitializationStarted() {
        this.backgroundWorker.submitAndWait(new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsCore.this.initializationMarker.create();
                return null;
            }
        });
    }

    private void checkForPreviousCrash() {
        if (Boolean.TRUE.equals((Boolean) this.backgroundWorker.submitAndWait(new CrashMarkerCheck(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Exception unused) {
            }
        }
    }

    private void finishInitSynchronously() {
        AnonymousClass1 r0 = new f<Void>() {
            public d getPriority() {
                return d.IMMEDIATE;
            }

            public Void call() throws Exception {
                return CrashlyticsCore.this.doInBackground();
            }
        };
        for (k addDependency : getDependencies()) {
            r0.addDependency(addDependency);
        }
        try {
            this.fabric.f83132c.submit(r0).get(4, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException unused) {
        } catch (TimeoutException unused2) {
        }
    }

    /* access modifiers changed from: protected */
    public Void doInBackground() {
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            this.controller.registerDevicePowerStateListener();
            t b2 = q.a().b();
            if (b2 == null) {
                markInitializationComplete();
                return null;
            }
            this.controller.registerAnalyticsEventListener(b2);
            if (!b2.f83356d.f83329c) {
                markInitializationComplete();
                return null;
            } else if (!l.a(this.context).a()) {
                markInitializationComplete();
                return null;
            } else {
                CrashlyticsNdkData nativeCrashData = getNativeCrashData();
                if (nativeCrashData != null) {
                    this.controller.finalizeNativeReport(nativeCrashData);
                }
                this.controller.finalizeSessions(b2.f83354b);
                this.controller.submitAllReports(this.delay, b2);
                markInitializationComplete();
                return null;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            markInitializationComplete();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider2) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider2;
    }

    public void log(String str) {
        doLog(3, "CrashlyticsCore", str);
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore instance = getInstance();
        if (instance != null && instance.controller != null) {
            return true;
        }
        new StringBuilder("Crashlytics must be initialized by calling Fabric.with(Context) ").append(str);
        return false;
    }

    private static String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.length() > 1024) {
            return trim.substring(0, 1024);
        }
        return trim;
    }

    public void logException(Throwable th) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging exceptions.") && th != null) {
            this.controller.writeNonFatalException(Thread.currentThread(), th);
        }
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        if (crashlyticsListener != null) {
            this.listener = crashlyticsListener;
        } else {
            throw new IllegalArgumentException("listener must not be null.");
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userEmail = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userId = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userName = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() == null) {
            return false;
        }
        io.fabric.sdk.android.services.d.d a2 = this.httpRequestFactory.a(io.fabric.sdk.android.services.d.c.GET, url.toString());
        ((HttpsURLConnection) a2.a()).setInstanceFollowRedirects(false);
        a2.b();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean onPreExecute(Context context) {
        CrashlyticsPinningInfoProvider crashlyticsPinningInfoProvider;
        Context context2 = context;
        if (!l.a(context).a()) {
            this.disabled = true;
        }
        if (this.disabled) {
            return false;
        }
        String a2 = new g().a(context2);
        if (a2 == null) {
            return false;
        }
        String h = io.fabric.sdk.android.services.b.i.h(context);
        if (isBuildIdValid(h, io.fabric.sdk.android.services.b.i.a(context2, "com.crashlytics.RequireBuildId", true))) {
            try {
                new StringBuilder("Initializing Crashlytics Core ").append(getVersion());
                b bVar = new b(this);
                this.crashMarker = new CrashlyticsFileMarker("crash_marker", bVar);
                this.initializationMarker = new CrashlyticsFileMarker("initialization_marker", bVar);
                PreferenceManager create = PreferenceManager.create(new io.fabric.sdk.android.services.e.d(this.context, "com.crashlytics.android.core.CrashlyticsCore"), this);
                if (this.pinningInfo != null) {
                    crashlyticsPinningInfoProvider = new CrashlyticsPinningInfoProvider(this.pinningInfo);
                } else {
                    crashlyticsPinningInfoProvider = null;
                }
                this.httpRequestFactory = new io.fabric.sdk.android.services.d.b(c.a());
                this.httpRequestFactory.a(crashlyticsPinningInfoProvider);
                s sVar = this.idManager;
                AppData create2 = AppData.create(context2, sVar, a2, h);
                ResourceUnityVersionProvider resourceUnityVersionProvider = new ResourceUnityVersionProvider(context2, new ManifestUnityVersionProvider(context2, create2.packageName));
                DefaultAppMeasurementEventListenerRegistrar defaultAppMeasurementEventListenerRegistrar = new DefaultAppMeasurementEventListenerRegistrar(this);
                EventLogger eventLogger = AppMeasurementEventLogger.getEventLogger(context);
                CrashlyticsController crashlyticsController = r0;
                CrashlyticsController crashlyticsController2 = new CrashlyticsController(this, this.backgroundWorker, this.httpRequestFactory, sVar, create, bVar, create2, resourceUnityVersionProvider, defaultAppMeasurementEventListenerRegistrar, eventLogger);
                this.controller = crashlyticsController;
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                this.controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), new r().a(context2));
                if (!didPreviousInitializationFail || !io.fabric.sdk.android.services.b.i.j(context)) {
                    return true;
                }
                finishInitSynchronously();
                return false;
            } catch (Exception unused) {
                this.controller = null;
                return false;
            }
        } else {
            throw new io.fabric.sdk.android.services.concurrency.l("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    public void setDouble(String str, double d2) {
        setString(str, Double.toString(d2));
    }

    public void setFloat(String str, float f2) {
        setString(str, Float.toString(f2));
    }

    public void setInt(String str, int i) {
        setString(str, Integer.toString(i));
    }

    public void setLong(String str, long j) {
        setString(str, Long.toString(j));
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (z && io.fabric.sdk.android.services.b.i.b(str)) {
            return false;
        }
        return true;
    }

    public void setString(String str, String str2) {
        String str3;
        if (this.disabled || !ensureFabricWithCalled("prior to setting keys.")) {
            return;
        }
        if (str == null) {
            Context context = this.context;
            if (context != null && io.fabric.sdk.android.services.b.i.e(context)) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            return;
        }
        String sanitizeAttribute = sanitizeAttribute(str);
        if (this.attributes.size() < 64 || this.attributes.containsKey(sanitizeAttribute)) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = sanitizeAttribute(str2);
            }
            this.attributes.put(sanitizeAttribute, str3);
            this.controller.cacheKeyData(this.attributes);
        }
    }

    private void doLog(int i, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.controller.writeToLog(System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    public void log(int i, String str, String str2) {
        doLog(i, str, str2);
        new StringBuilder().append(str);
        new StringBuilder().append(str2);
    }

    private static String formatLogMessage(int i, String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 2:
                str3 = "V";
                break;
            case 3:
                str3 = "D";
                break;
            case 4:
                str3 = "I";
                break;
            case 5:
                str3 = "W";
                break;
            case 6:
                str3 = "E";
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                str3 = "A";
                break;
            default:
                str3 = "?";
                break;
        }
        sb.append(str3);
        sb.append("/");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CrashlyticsCore(float r9, com.crashlytics.android.core.CrashlyticsListener r10, com.crashlytics.android.core.PinningInfoProvider r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "Crashlytics Exception Handler"
            java.util.concurrent.ThreadFactory r1 = io.fabric.sdk.android.services.b.o.a(r0)
            com.ss.android.ugc.aweme.thread.p r2 = com.ss.android.ugc.aweme.thread.p.FIXED
            com.ss.android.ugc.aweme.thread.m$a r2 = com.ss.android.ugc.aweme.thread.m.a(r2)
            r3 = 1
            com.ss.android.ugc.aweme.thread.m$a r2 = r2.a((int) r3)
            com.ss.android.ugc.aweme.thread.m$a r1 = r2.a((java.util.concurrent.ThreadFactory) r1)
            com.ss.android.ugc.aweme.thread.m r1 = r1.a()
            java.util.concurrent.ExecutorService r7 = com.ss.android.ugc.aweme.thread.h.a((com.ss.android.ugc.aweme.thread.m) r1)
            io.fabric.sdk.android.services.b.o.a(r0, r7)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsCore.<init>(float, com.crashlytics.android.core.CrashlyticsListener, com.crashlytics.android.core.PinningInfoProvider, boolean):void");
    }

    CrashlyticsCore(float f2, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.delay = f2;
        this.listener = crashlyticsListener == null ? new NoOpListener() : crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.attributes = new ConcurrentHashMap<>();
        this.startTime = System.currentTimeMillis();
    }
}
