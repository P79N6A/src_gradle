package com.bytedance.apm.internal;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.apm.c.b;
import com.bytedance.apm.c.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.d;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.apm.impl.SlardarConfigManagerImpl;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.i;
import com.bytedance.apm.perf.d;
import com.bytedance.apm.perf.e;
import com.bytedance.apm.perf.f;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.LooperPrinterUtils;
import com.bytedance.frameworks.baselib.a.d;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.apm.api.g;
import com.bytedance.services.apm.api.h;
import com.bytedance.services.slardar.config.IConfigManager;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class ApmDelegate implements com.bytedance.services.slardar.config.a {
    private b mApmInitConfig;
    public c mApmStartConfig;
    private com.bytedance.apm.g.b mApmStartListener;
    private com.bytedance.apm.battery.b mBatteryConfig;
    private volatile boolean mConfigReady;
    private List<String> mDefaultCongfigUrlsCompat;
    private List<String> mDefaultLogReportUrlsCompat;
    private List<String> mExceptionLogReportUrlsCompat;
    private volatile ExecutorService mExecutors;
    private volatile boolean mInited;
    private boolean mIsMainProcess;
    public SlardarConfigManagerImpl mSlardarConfigManager;
    private volatile boolean mStarted;
    private com.bytedance.apm.trace.c mTraceConfig;
    private com.bytedance.apm.trace.a mTraceListener;
    public Set<g> mWidgetSet;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ApmDelegate f2037a = new ApmDelegate();
    }

    private void initMethodTrace(Application application) {
    }

    public static ApmDelegate getInstance() {
        return a.f2037a;
    }

    public com.bytedance.apm.trace.c getTraceConfig() {
        return this.mTraceConfig;
    }

    public com.bytedance.apm.trace.a getTraceListener() {
        return this.mTraceListener;
    }

    public boolean isConfigReady() {
        return this.mConfigReady;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void startInternalSafely() {
        try {
            startInternal();
        } catch (Exception unused) {
        }
    }

    public void onReady() {
        this.mConfigReady = true;
        if (this.mApmStartListener != null) {
            this.mApmStartListener.a();
        }
    }

    private ApmDelegate() {
        this.mTraceConfig = new com.bytedance.apm.trace.c();
        this.mBatteryConfig = new com.bytedance.apm.battery.b();
    }

    public void destroyAllPlugins() {
        if (this.mWidgetSet != null) {
            com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
                public final void run() {
                    for (g a2 : ApmDelegate.this.mWidgetSet) {
                        try {
                            a2.a();
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    public void startAllPlugins() {
        if (this.mWidgetSet != null) {
            Iterator<g> it2 = this.mWidgetSet.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void stopAllPlugins() {
        if (this.mWidgetSet != null) {
            com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
                public final void run() {
                    Iterator<g> it2 = ApmDelegate.this.mWidgetSet.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            });
        }
    }

    private void checkWhetherFirstInstall() {
        String string = a.a().f2038a.getString("update_version_code", null);
        String optString = com.bytedance.apm.c.f().optString("update_version_code");
        if (!TextUtils.equals(string, optString)) {
            com.bytedance.apm.c.a(1);
            a.a().f2038a.edit().putString("update_version_code", optString).apply();
            return;
        }
        com.bytedance.apm.c.a(2);
    }

    private void registerServiceWhenStart() {
        this.mSlardarConfigManager = new SlardarConfigManagerImpl();
        this.mSlardarConfigManager.registerConfigListener(this);
        com.bytedance.news.common.service.manager.c.a(IConfigManager.class, this.mSlardarConfigManager);
        com.bytedance.news.common.service.manager.c.a(IMonitorLogManager.class, (com.bytedance.news.common.service.manager.a<T>) new com.bytedance.news.common.service.manager.a<IMonitorLogManager>() {
            public final /* synthetic */ Object a() {
                return new MonitorLogManagerImpl();
            }
        });
        com.bytedance.news.common.service.manager.c.a(IActivityLifeManager.class, (com.bytedance.news.common.service.manager.a<T>) new com.bytedance.news.common.service.manager.a<IActivityLifeManager>() {
            public final /* synthetic */ Object a() {
                return ActivityLifeObserver.getInstance();
            }
        });
        com.bytedance.news.common.service.manager.c.a(IApmAgent.class, (com.bytedance.news.common.service.manager.a<T>) new com.bytedance.news.common.service.manager.a<IApmAgent>() {
            public final /* synthetic */ Object a() {
                return new ApmAgentServiceImpl();
            }
        });
    }

    private void compatV4() {
        if (i.a(this.mApmStartConfig.f1930a) && !i.a(this.mDefaultCongfigUrlsCompat)) {
            this.mApmStartConfig.f1930a = this.mDefaultCongfigUrlsCompat;
        }
        if (i.a(this.mApmStartConfig.f1931b) && !i.a(this.mDefaultLogReportUrlsCompat)) {
            this.mApmStartConfig.f1931b = this.mDefaultLogReportUrlsCompat;
        }
        if (i.a(this.mApmStartConfig.f1932c) && !i.a(this.mExceptionLogReportUrlsCompat)) {
            this.mApmStartConfig.f1932c = this.mExceptionLogReportUrlsCompat;
        }
    }

    private void initPerfMonitor() {
        if (this.mBatteryConfig.f1927b && this.mBatteryConfig.f1920a) {
            com.bytedance.apm.battery.a.a().f();
        }
        new com.bytedance.apm.perf.c().f();
        new d().f();
        if (this.mIsMainProcess) {
            new e().f();
            new f().f();
            if (this.mApmStartConfig.f1934e) {
                com.bytedance.apm.b.a aVar = new com.bytedance.apm.b.a();
                LooperPrinterUtils.init();
                ActivityLifeObserver.getInstance().register(aVar);
                ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(aVar);
                if (ActivityLifeObserver.getInstance().isForeground()) {
                    com.bytedance.apm.b.a.a();
                }
            }
            if (this.mApmStartConfig.f1935f) {
                new com.bytedance.apm.perf.b().f();
            }
            com.bytedance.article.common.monitor.a a2 = com.bytedance.article.common.monitor.a.a();
            com.bytedance.apm.j.b.a().a((b.C0006b) a2);
            ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(a2);
        }
    }

    private void startInternal() {
        com.bytedance.apm.c.g = System.currentTimeMillis();
        compatV4();
        com.bytedance.apm.d.a().f1946a = new d.a() {
            public final void a(String str) {
                ExceptionMonitor.ensureNotReachHere(str);
            }

            public final void a(Throwable th, String str) {
                ExceptionMonitor.ensureNotReachHere(th, str);
            }
        };
        com.bytedance.apm.c.a(this.mApmStartConfig.g);
        com.bytedance.apm.c.a(this.mApmStartConfig.h);
        IHttpService iHttpService = this.mApmStartConfig.i;
        if (iHttpService != null) {
            com.bytedance.apm.c.f1923c = iHttpService;
        }
        com.bytedance.apm.c.f1925e = this.mApmStartConfig.f1933d;
        this.mWidgetSet = this.mApmStartConfig.j;
        com.bytedance.apm.d.d a2 = com.bytedance.apm.d.d.a();
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(a2);
        JSONObject f2 = com.bytedance.apm.c.f();
        if (f2 != null) {
            com.bytedance.apm.f.f fVar = new com.bytedance.apm.f.f(f2.optString("version_code"), f2.optString("version_name"), f2.optString("manifest_version_code"), f2.optString("update_version_code"), f2.optString("app_version"));
            a2.f1978d.a(fVar);
        }
        a2.f1976b = ToolUtils.isMainProcess(com.bytedance.apm.c.a());
        a2.f1977c = System.currentTimeMillis();
        if (this.mIsMainProcess) {
            com.bytedance.apm.i.c a3 = com.bytedance.apm.i.c.a();
            c cVar = this.mApmStartConfig;
            com.bytedance.frameworks.baselib.a.d.a((d.b) new d.b() {
                public final boolean a(
/*
Method generation error in method: com.bytedance.apm.i.c.1.a(android.content.Context):boolean, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.apm.i.c.1.a(android.content.Context):boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            });
            ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(a3);
            ActivityLifeObserver.getInstance().register(a3);
            com.bytedance.apm.i.a.c.f2003a = a3;
            List<String> list = cVar.f1931b;
            if (!i.a(list)) {
                a3.f2010a = list;
            }
            List<String> list2 = cVar.f1932c;
            if (!i.a(list2)) {
                a3.f2011b = list2;
            }
            com.bytedance.apm.i.b.d.f2009b = a3;
            com.bytedance.apm.i.b.d.a("monitor", new com.bytedance.apm.i.b.a("monitor"));
            com.bytedance.apm.i.b.d.a("exception", new com.bytedance.apm.i.b.a("exception"));
            a3.f2012c = cVar.k;
        }
        initPerfMonitor();
        com.bytedance.apm.d.a.a.b().a(this.mApmStartConfig.m);
        com.bytedance.apm.d.a.c.b().a(this.mApmStartConfig.m);
        com.bytedance.apm.d.a.b.b().a(this.mApmStartConfig.m);
        com.bytedance.apm.a.a.f1874a = com.bytedance.apm.c.a();
        com.bytedance.apm.a.a.f1875b = new com.bytedance.apm.a.b();
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(new com.bytedance.apm.a.a());
        long j = this.mApmStartConfig.k;
        com.bytedance.apm.j.b.a().f2040a.a((Runnable) new Runnable() {
            public final void run() {
                ApmDelegate.this.mSlardarConfigManager.initParams(new com.bytedance.apm.core.c() {
                    public final Map<String, String> a() {
                        return com.bytedance.apm.c.e();
                    }
                }, ApmDelegate.this.mApmStartConfig.f1930a);
                ApmDelegate.this.mSlardarConfigManager.fetchConfig();
            }
        }, j * 1000);
        checkWhetherFirstInstall();
        initAllPlugins(com.bytedance.apm.c.a());
        h hVar = new h();
        hVar.f2319a = this.mApmStartConfig.f1931b;
        notifyPluginsParams(hVar);
        startAllPlugins();
        this.mExecutors = this.mApmStartConfig.n;
        this.mApmStartListener = this.mApmStartConfig.l;
    }

    public void setBatteryConfig(com.bytedance.apm.battery.b bVar) {
        this.mBatteryConfig = bVar;
    }

    public void setTraceConfig(com.bytedance.apm.trace.c cVar) {
        this.mTraceConfig = cVar;
    }

    public void setTraceListener(com.bytedance.apm.trace.a aVar) {
        this.mTraceListener = aVar;
    }

    public void init(@NonNull Context context) {
        init(context, new com.bytedance.apm.c.b(new b.a((byte) 0)));
    }

    public void setConfigUrlCompat(@NonNull List<String> list) {
        if (!this.mStarted && !i.a(list)) {
            this.mDefaultCongfigUrlsCompat = list;
        }
    }

    public void setDefaultLogReportUrlsCompat(@NonNull List<String> list) {
        if (!this.mStarted && !i.a(list)) {
            this.mDefaultLogReportUrlsCompat = list;
        }
    }

    public void setExceptionLogReportUrlsCompat(@NonNull List<String> list) {
        if (!this.mStarted && !i.a(list)) {
            this.mExceptionLogReportUrlsCompat = list;
        }
    }

    private void initAllPlugins(Context context) {
        if (this.mWidgetSet != null) {
            for (g a2 : this.mWidgetSet) {
                try {
                    a2.a(context);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean getLogTypeSwitch(String str) {
        if (!this.mConfigReady || this.mSlardarConfigManager == null) {
            return false;
        }
        return this.mSlardarConfigManager.getLogTypeSwitch(str);
    }

    public boolean getMetricsTypeSwitch(String str) {
        if (!this.mConfigReady || this.mSlardarConfigManager == null) {
            return false;
        }
        return this.mSlardarConfigManager.getMetricTypeSwitch(str);
    }

    public boolean getServiceNameSwitch(String str) {
        if (!this.mConfigReady || this.mSlardarConfigManager == null) {
            return false;
        }
        return this.mSlardarConfigManager.getServiceSwitch(str);
    }

    public void notifyPluginsParams(h hVar) {
        if (this.mWidgetSet != null) {
            for (g a2 : this.mWidgetSet) {
                try {
                    a2.a(hVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void start(@NonNull c cVar) {
        if (!this.mInited) {
            throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start(). If you have any questions, pls lark wangkai.android");
        } else if (cVar == null) {
            throw new IllegalArgumentException("startConfig must not be allowed");
        } else if (!this.mStarted) {
            this.mStarted = true;
            this.mApmStartConfig = cVar;
            com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
                public final void run() {
                    ApmDelegate.this.startInternalSafely();
                }
            });
        }
    }

    public void submitTask(Runnable runnable) {
        if (this.mExecutors == null) {
            synchronized (this) {
                if (this.mExecutors == null) {
                    this.mExecutors = com.ss.android.ugc.aweme.thread.h.a(m.a(p.FIXED).a(1).a());
                }
            }
        }
        this.mExecutors.submit(runnable);
    }

    public void onRefresh(JSONObject jSONObject, boolean z) {
        com.bytedance.apm.trace.c cVar = this.mTraceConfig;
        if (!jSONObject.isNull("drop_frame_block_threshold")) {
            cVar.f2086c = jSONObject.optInt("drop_frame_block_threshold");
        }
        if (!jSONObject.isNull("drop_frame_report_stack_switch")) {
            cVar.f2087d = jSONObject.optBoolean("drop_frame_report_stack_switch");
        }
    }

    public void init(@NonNull Context context, @NonNull com.bytedance.apm.c.b bVar) {
        if (!this.mInited) {
            this.mInited = true;
            Application a2 = com.bytedance.apm.k.a.a(context);
            if (a2 != null) {
                com.bytedance.apm.c.f1921a = com.bytedance.apm.k.a.a(a2);
            }
            ActivityLifeObserver.init(a2);
            registerServiceWhenStart();
            this.mIsMainProcess = ToolUtils.isMainProcess(a2);
            if (this.mTraceConfig.f2085b && this.mIsMainProcess) {
                com.bytedance.apm.trace.b bVar2 = new com.bytedance.apm.trace.b();
                bVar2.f2083f = getInstance().getTraceConfig().f2084a;
                bVar2.g = getInstance().getTraceConfig().f2085b;
                ActivityLifeObserver.getInstance().register(bVar2);
            }
            if (this.mBatteryConfig.f1927b && !this.mBatteryConfig.f1920a) {
                com.bytedance.apm.battery.a.a().f();
            }
            if (this.mIsMainProcess) {
                initMethodTrace(a2);
            }
            com.bytedance.apm.c.f1926f = System.currentTimeMillis();
        }
    }

    public void activeUploadAlog(String str, long j, long j2, String str2, com.bytedance.apm.a.c cVar) {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        final String str3 = str;
        final long j3 = j;
        final long j4 = j2;
        final String str4 = str2;
        final com.bytedance.apm.a.c cVar2 = cVar;
        AnonymousClass9 r1 = new Runnable() {
            public final void run() {
                com.bytedance.apm.a.a.a(str3, j3, j4, str4, cVar2);
            }
        };
        executor.execute(r1);
    }
}
