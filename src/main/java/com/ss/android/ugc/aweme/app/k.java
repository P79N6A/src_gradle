package com.ss.android.ugc.aweme.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.a;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.concurrent.TTExecutors;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.frameworks.plugin.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.c.c;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.config.AppConfig;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.d.d;
import com.ss.android.downloadlib.c.f;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.ugc.aweme.ag.g;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.application.task.CommonLogReportInitTask;
import com.ss.android.ugc.aweme.base.activity.CustomErrorActivity;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.framework.core.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.lego.LegoService;
import com.ss.android.ugc.aweme.legoImp.service.DouDouService;
import com.ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask;
import com.ss.android.ugc.aweme.legoImp.task.EventBusInstallTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceForAllProcessTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadResForAllProcessTask;
import com.ss.android.ugc.aweme.legoImp.task.ReplaceDrawableTask;
import com.ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask;
import com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.port.in.ac;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.aweme.port.in.ai;
import com.ss.android.ugc.aweme.port.in.aj;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.port.in.al;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.port.in.an;
import com.ss.android.ugc.aweme.port.in.ao;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.u;
import com.ss.android.ugc.aweme.port.in.w;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.NetworkServiceImpl;
import com.ss.android.ugc.aweme.thread.i;
import com.ss.android.ugc.aweme.thread.j;
import com.ss.android.ugc.aweme.thread.l;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.android.ugc.aweme.tools.a.d;
import com.ss.android.ugc.aweme.utils.dk;
import com.ss.android.ugc.aweme.utils.dl;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.x;
import com.ss.android.ugc.common.a.a;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2659a = null;
    private static String i = "com.ss.android.ugc.aweme.app.AwemeApplicationReflectionHelper";
    @SuppressLint({"CI_StaticFieldLeak"})
    private static Context j;
    @SuppressLint({"CI_StaticFieldLeak"})
    private static k k;

    /* renamed from: b  reason: collision with root package name */
    a f2660b;
    private long l;

    public static k a() {
        return k;
    }

    public static Context b() {
        return j;
    }

    public static long f() {
        return f2673d;
    }

    public static Context g() {
        if (PatchProxy.isSupport(new Object[0], null, f2659a, true, 22311, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f2659a, true, 22311, new Class[0], Context.class);
        }
        return e.a();
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f2659a, false, 22301, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.g.a.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22301, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final Activity e() {
        if (!PatchProxy.isSupport(new Object[0], this, f2659a, false, 22306, new Class[0], Activity.class)) {
            return AwemeAppData.p().f();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22306, new Class[0], Activity.class);
    }

    public Resources getResources() {
        if (!PatchProxy.isSupport(new Object[0], this, f2659a, false, 22307, new Class[0], Resources.class)) {
            return super.getResources();
        }
        return (Resources) PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22307, new Class[0], Resources.class);
    }

    public void onLowMemory() {
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22305, new Class[0], Void.TYPE);
            return;
        }
        super.onLowMemory();
    }

    public void onTerminate() {
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22304, new Class[0], Void.TYPE);
            return;
        }
        super.onTerminate();
        this.f2660b.d();
    }

    @MeasureFunction
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22299, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22299, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        com.ss.android.c.a.f2426a = "aweme.snssdk.com";
        com.ss.android.c.a.f2427b = "aweme.snssdk.com";
        com.ss.android.c.a.f2428c = com.ss.android.c.a.f2426a;
        com.ss.android.c.a.f2429d = com.ss.android.c.a.f2426a;
        com.ss.android.c.a.f2430e = com.ss.android.c.a.f2426a;
        com.ss.android.c.a.f2431f = com.ss.android.c.a.f2426a;
        com.ss.android.c.a.g = com.ss.android.c.a.f2426a;
        com.ss.android.c.a.h = "aweme.snssdk.com";
        com.ss.android.c.a.i = "aweme.snssdk.com";
        AppConfig.setDomainConfigUrl("/ies/network/aweme/");
        com.ss.android.c.a.j = "aweme";
        c.s = "2882303761517509924";
        c.t = "5571750917924";
    }

    @MeasureFunction
    public void onCreate() {
        Class<?> cls;
        Object obj;
        Throwable th;
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22294, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            ag i2 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40156, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40156, new Class[0], Void.TYPE);
            } else if (i2.f3145e > 0) {
                i2.h();
            } else {
                i2.f3145e = SystemClock.uptimeMillis();
            }
        }
        h = this;
        k = this;
        if (this.g) {
            if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22295, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22295, new Class[0], Void.TYPE);
            } else {
                h.a((Application) a());
                h.a();
                h.f2588c = new com.ss.android.ugc.aweme.app.g.a();
            }
        }
        com.ss.android.ugc.aweme.app.accountsdk.a.a(this);
        com.ss.android.ugc.aweme.lego.a.i.a().a(new SettingsReaderInitTask()).a(new SharePreferencePreloadForAllProcessTask()).a(new PreloadInstanceForAllProcessTask()).a(new PreloadResForAllProcessTask()).a(new DvmLinearAllocOptTask()).a(new ReplaceDrawableTask()).a();
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22309, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22309, new Class[0], Void.TYPE);
        } else {
            b.a aVar = new b.a();
            aVar.f3313a = "douyin";
            aVar.f3317e = new g();
            aVar.f3314b = i.a().getChannel();
            aVar.f3315c = false;
            aVar.f3316d = this;
            if (PatchProxy.isSupport(new Object[]{aVar}, null, b.f3310a, true, 45897, new Class[]{b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, null, b.f3310a, true, 45897, new Class[]{b.a.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.framework.core.a.b().f3305c = aVar.f3313a;
                com.ss.android.ugc.aweme.framework.core.a.b().f3304b = aVar.f3314b;
                com.ss.android.ugc.aweme.framework.core.a.b().f3306d = aVar.f3315c;
                com.ss.android.ugc.aweme.framework.core.a.b().f3307e = aVar.f3316d;
                com.ss.android.ugc.aweme.video.b.a((Context) aVar.f3316d);
                if (aVar.f3317e != null) {
                    h.a aVar2 = aVar.f3317e;
                    if (PatchProxy.isSupport(new Object[]{aVar2}, null, h.f2586a, true, 70948, new Class[]{h.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar2}, null, h.f2586a, true, 70948, new Class[]{h.a.class}, Void.TYPE);
                    } else {
                        h.f2587b.add(aVar2);
                    }
                }
                if (PatchProxy.isSupport(new Object[0], null, b.f3310a, true, 45898, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, b.f3310a, true, 45898, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e);
                    com.ss.android.e.b.a(true);
                    com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e).f2461a = new com.ss.android.e.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f3312a;

                        public final void onEvent(Map<String, String> map) {
                            Map<String, String> map2 = map;
                            if (PatchProxy.isSupport(new Object[]{map2}, this, f3312a, false, 45900, new Class[]{Map.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{map2}, this, f3312a, false, 45900, new Class[]{Map.class}, Void.TYPE);
                                return;
                            }
                            q.a("launch_log", map2);
                        }
                    };
                }
                if (PatchProxy.isSupport(new Object[]{aVar}, null, b.f3310a, true, 45899, new Class[]{b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, null, b.f3310a, true, 45899, new Class[]{b.a.class}, Void.TYPE);
                } else if (!TextUtils.isEmpty(aVar.f3318f)) {
                    b.f3311b = aVar.f3318f;
                }
                x a2 = x.a();
                Application application = aVar.f3316d;
                if (PatchProxy.isSupport(new Object[]{application}, a2, x.f4298a, false, 88025, new Class[]{Context.class}, Void.TYPE)) {
                    x xVar = a2;
                    PatchProxy.accessDispatch(new Object[]{application}, xVar, x.f4298a, false, 88025, new Class[]{Context.class}, Void.TYPE);
                } else if (application != null && a2.f4301c == null) {
                    new Thread(new Runnable(application) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f4302a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ Context f4303b;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f4302a, false, 88027, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f4302a, false, 88027, new Class[0], Void.TYPE);
                                return;
                            }
                            String a2 = x.this.a(this.f4303b.getApplicationContext(), "assets/ttnet_config.json");
                            if (!TextUtils.isEmpty(a2)) {
                                try {
                                    x.this.f4301c = new JSONObject(a2);
                                    x.this.f4300b = x.this.f4301c.optBoolean("boe_proxy_enabled", false);
                                } catch (JSONException unused) {
                                }
                            }
                        }

                        {
                            this.f4303b = r2;
                        }
                    }).start();
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, null, j.f4240a, true, 86901, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, null, j.f4240a, true, 86901, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, null, j.f4240a, true, 86900, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 0}, null, j.f4240a, true, 86900, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(p.IO);
                arrayList.add(p.DEFAULT);
                arrayList.add(p.SERIAL);
                arrayList.add(p.BACKGROUND);
                i.a a3 = i.a();
                a3.f4235b = false;
                a3.f4236c = arrayList;
                a3.f4237d = j.f4241b;
                a3.f4238e = TimeUnit.MINUTES.toMillis(5);
                a3.f4239f = TimeUnit.MINUTES.toMillis(5);
                a3.g = TimeUnit.MINUTES.toMillis(15);
                com.ss.android.ugc.aweme.thread.h.f4223b = a3.a();
            }
            f.f2458a = 4;
            com.ss.android.ugc.aweme.thread.h.f4224c = new l();
            com.ss.android.ugc.aweme.net.x.f3640a = com.ss.android.ugc.aweme.thread.h.c();
            if (PatchProxy.isSupport(new Object[0], null, dk.f4290a, true, 88522, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, dk.f4290a, true, 88522, new Class[0], Void.TYPE);
            } else {
                com.ss.android.b.a.a.a.a(dl.f4292b);
            }
            com.ss.android.ugc.aweme.net.a.j.f3636b = com.ss.android.ugc.aweme.thread.h.c();
            ThreadPlus.setExecutorService(com.ss.android.ugc.aweme.thread.h.c());
            TTExecutors.setNormalThreadPool(com.ss.android.ugc.aweme.thread.h.d());
            if (PatchProxy.isSupport(new Object[0], null, j.f4240a, true, 86903, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, j.f4240a, true, 86903, new Class[0], Void.TYPE);
            } else {
                RxJavaPlugins.setIoSchedulerHandler(com.ss.android.ugc.aweme.thread.k.f4243b);
            }
            com.ss.android.linkselector.d.a.f2484a = com.ss.android.ugc.aweme.thread.h.c();
        }
        if (this.g) {
            if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22297, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22297, new Class[0], Void.TYPE);
            } else {
                m.a().a(new m.a().a(com.ss.android.ugc.aweme.thread.h.c()));
            }
            com.ss.android.ugc.aweme.lego.a.i.a().a(com.ss.android.ugc.aweme.legoImp.task.g.b()).a(com.ss.android.ugc.aweme.legoImp.task.g.a()).a(new EventBusInstallTask()).a(com.ss.android.ugc.aweme.legoImp.task.g.c()).a(new PreloadInstanceTask()).a();
            com.ss.android.ugc.aweme.o.f fVar = com.ss.android.ugc.aweme.o.f.f3702b;
            if (PatchProxy.isSupport(new Object[0], fVar, com.ss.android.ugc.aweme.o.f.f3701a, false, 54508, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], fVar, com.ss.android.ugc.aweme.o.f.f3701a, false, 54508, new Class[0], Void.TYPE);
            } else {
                ServiceManager.get().bind(IAVServiceProxy.class, new com.ss.android.ugc.aweme.o.g(new IAVServiceProxy() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f3703a;
                    private com.ss.android.ugc.aweme.port.in.o A;
                    private ai B;
                    private ap C;
                    private ac D;

                    /* renamed from: c  reason: collision with root package name */
                    private com.ss.android.ugc.aweme.port.in.m f3705c;

                    /* renamed from: d  reason: collision with root package name */
                    private com.ss.android.ugc.aweme.port.in.q f3706d;

                    /* renamed from: e  reason: collision with root package name */
                    private al f3707e;

                    /* renamed from: f  reason: collision with root package name */
                    private com.ss.android.ugc.aweme.port.in.p f3708f;
                    private y g;
                    private aa h;
                    private ao i;
                    private af j;
                    private com.ss.android.ugc.aweme.port.in.i k;
                    private com.ss.android.ugc.aweme.port.in.t l;
                    private am m;
                    private ae n;
                    private com.ss.android.ugc.aweme.port.in.r o;
                    private ah p;
                    private w q;
                    private com.ss.android.ugc.aweme.port.in.n r;
                    private an s;
                    private com.ss.android.ugc.aweme.account.f t;
                    private ak u;
                    private u v;
                    private com.ss.android.ugc.aweme.port.in.s w;
                    private com.ss.android.ugc.aweme.port.in.ag x;
                    private ab y;
                    private com.ss.android.ugc.aweme.port.in.j z;

                    public final aj getStickerShareService() {
                        return i.f58290a;
                    }

                    public final com.ss.android.ugc.aweme.port.in.j getAVConverter() {
                        if (this.z == null) {
                            this.z = j.f58292b;
                        }
                        return this.z;
                    }

                    public final com.ss.android.ugc.aweme.port.in.i getABService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54520, new Class[0], com.ss.android.ugc.aweme.port.in.i.class)) {
                            return (com.ss.android.ugc.aweme.port.in.i) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54520, new Class[0], com.ss.android.ugc.aweme.port.in.i.class);
                        }
                        if (this.k == null) {
                            this.k = new a((byte) 0);
                        }
                        return this.k;
                    }

                    public final com.ss.android.ugc.aweme.account.f getAccountService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54529, new Class[0], com.ss.android.ugc.aweme.account.f.class)) {
                            return (com.ss.android.ugc.aweme.account.f) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54529, new Class[0], com.ss.android.ugc.aweme.account.f.class);
                        }
                        if (this.t == null) {
                            this.t = new a();
                        }
                        return this.t;
                    }

                    public final Application getApplication() {
                        if (!PatchProxy.isSupport(new Object[0], this, f3703a, false, 54511, new Class[0], Application.class)) {
                            return com.ss.android.ugc.aweme.app.k.a();
                        }
                        return (Application) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54511, new Class[0], Application.class);
                    }

                    public final com.ss.android.ugc.aweme.port.in.m getApplicationService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54512, new Class[0], com.ss.android.ugc.aweme.port.in.m.class)) {
                            return (com.ss.android.ugc.aweme.port.in.m) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54512, new Class[0], com.ss.android.ugc.aweme.port.in.m.class);
                        }
                        if (this.f3705c == null) {
                            this.f3705c = new b((byte) 0);
                        }
                        return this.f3705c;
                    }

                    public final com.ss.android.ugc.aweme.port.in.n getBridgeService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54527, new Class[0], com.ss.android.ugc.aweme.port.in.n.class)) {
                            return (com.ss.android.ugc.aweme.port.in.n) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54527, new Class[0], com.ss.android.ugc.aweme.port.in.n.class);
                        }
                        if (this.r == null) {
                            this.r = new c((byte) 0);
                        }
                        return this.r;
                    }

                    public final com.ss.android.ugc.aweme.port.in.o getBusinessGoodsService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54535, new Class[0], com.ss.android.ugc.aweme.port.in.o.class)) {
                            return (com.ss.android.ugc.aweme.port.in.o) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54535, new Class[0], com.ss.android.ugc.aweme.port.in.o.class);
                        }
                        if (this.A == null) {
                            this.A = new com.ss.android.ugc.aweme.port.in.o() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58169a;

                                public final void a(@NotNull String str) {
                                    if (PatchProxy.isSupport(new Object[]{str}, this, f58169a, false, 54541, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str}, this, f58169a, false, 54541, new Class[]{String.class}, Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.shortvideo.util.h.a(str);
                                }
                            };
                        }
                        return this.A;
                    }

                    public final com.ss.android.ugc.aweme.port.in.p getCaptureService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54515, new Class[0], com.ss.android.ugc.aweme.port.in.p.class)) {
                            return (com.ss.android.ugc.aweme.port.in.p) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54515, new Class[0], com.ss.android.ugc.aweme.port.in.p.class);
                        }
                        if (this.f3708f == null) {
                            this.f3708f = new d((byte) 0);
                        }
                        return this.f3708f;
                    }

                    public final com.ss.android.ugc.aweme.port.in.q getChallengeService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54513, new Class[0], com.ss.android.ugc.aweme.port.in.q.class)) {
                            return (com.ss.android.ugc.aweme.port.in.q) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54513, new Class[0], com.ss.android.ugc.aweme.port.in.q.class);
                        }
                        if (this.f3706d == null) {
                            this.f3706d = new e((byte) 0);
                        }
                        return this.f3706d;
                    }

                    public final com.ss.android.ugc.aweme.port.in.r getCommerceService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54524, new Class[0], com.ss.android.ugc.aweme.port.in.r.class)) {
                            return (com.ss.android.ugc.aweme.port.in.r) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54524, new Class[0], com.ss.android.ugc.aweme.port.in.r.class);
                        }
                        if (this.o == null) {
                            this.o = new C0654f((byte) 0);
                        }
                        return this.o;
                    }

                    public final com.ss.android.ugc.aweme.port.in.s getDuoShanService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54532, new Class[0], com.ss.android.ugc.aweme.port.in.s.class)) {
                            return (com.ss.android.ugc.aweme.port.in.s) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54532, new Class[0], com.ss.android.ugc.aweme.port.in.s.class);
                        }
                        if (this.w == null) {
                            this.w = new g((byte) 0);
                        }
                        return this.w;
                    }

                    public final com.ss.android.ugc.aweme.port.in.t getHashTagService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54521, new Class[0], com.ss.android.ugc.aweme.port.in.t.class)) {
                            return (com.ss.android.ugc.aweme.port.in.t) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54521, new Class[0], com.ss.android.ugc.aweme.port.in.t.class);
                        }
                        if (this.l == null) {
                            this.l = new i((byte) 0);
                        }
                        return this.l;
                    }

                    public final u getIMService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54531, new Class[0], u.class)) {
                            return (u) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54531, new Class[0], u.class);
                        }
                        if (this.v == null) {
                            this.v = new j((byte) 0);
                        }
                        return this.v;
                    }

                    public final ai getIStickerPropService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54536, new Class[0], ai.class)) {
                            return (ai) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54536, new Class[0], ai.class);
                        }
                        if (this.B == null) {
                            this.B = new com.ss.android.ugc.aweme.sticker.prop.api.a();
                        }
                        return this.B;
                    }

                    public final w getLiveService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54526, new Class[0], w.class)) {
                            return (w) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54526, new Class[0], w.class);
                        }
                        if (this.q == null) {
                            this.q = new l((byte) 0);
                        }
                        return this.q;
                    }

                    public final y getLocationService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54516, new Class[0], y.class)) {
                            return (y) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54516, new Class[0], y.class);
                        }
                        if (this.g == null) {
                            this.g = new n((byte) 0);
                        }
                        return this.g;
                    }

                    public final aa getMusicService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54517, new Class[0], aa.class)) {
                            return (aa) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54517, new Class[0], aa.class);
                        }
                        if (this.h == null) {
                            this.h = new s();
                        }
                        return this.h;
                    }

                    public final ab getNetworkService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54534, new Class[0], ab.class)) {
                            return (ab) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54534, new Class[0], ab.class);
                        }
                        if (this.y == null) {
                            this.y = new NetworkServiceImpl();
                        }
                        return this.y;
                    }

                    public final ae getPoiService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54523, new Class[0], ae.class)) {
                            return (ae) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54523, new Class[0], ae.class);
                        }
                        if (this.n == null) {
                            this.n = new o((byte) 0);
                        }
                        return this.n;
                    }

                    public final af getPublishService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54519, new Class[0], af.class)) {
                            return (af) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54519, new Class[0], af.class);
                        }
                        if (this.j == null) {
                            this.j = new t();
                        }
                        return this.j;
                    }

                    public final com.ss.android.ugc.aweme.port.in.ag getSettingService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54533, new Class[0], com.ss.android.ugc.aweme.port.in.ag.class)) {
                            return (com.ss.android.ugc.aweme.port.in.ag) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54533, new Class[0], com.ss.android.ugc.aweme.port.in.ag.class);
                        }
                        if (this.x == null) {
                            this.x = new p((byte) 0);
                        }
                        return this.x;
                    }

                    public final ah getSpServcie() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54525, new Class[0], ah.class)) {
                            return (ah) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54525, new Class[0], ah.class);
                        }
                        if (this.p == null) {
                            this.p = new q((byte) 0);
                        }
                        return this.p;
                    }

                    public final ak getStoryPublishService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54530, new Class[0], ak.class)) {
                            return (ak) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54530, new Class[0], ak.class);
                        }
                        if (this.u == null) {
                            this.u = new v();
                        }
                        return this.u;
                    }

                    public final al getSummonFriendService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54514, new Class[0], al.class)) {
                            return (al) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54514, new Class[0], al.class);
                        }
                        if (this.f3707e == null) {
                            this.f3707e = new r((byte) 0);
                        }
                        return this.f3707e;
                    }

                    public final am getSyncShareService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54522, new Class[0], am.class)) {
                            return (am) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54522, new Class[0], am.class);
                        }
                        if (this.m == null) {
                            this.m = new s((byte) 0);
                        }
                        return this.m;
                    }

                    public final an getTimeLockService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54528, new Class[0], an.class)) {
                            return (an) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54528, new Class[0], an.class);
                        }
                        if (this.s == null) {
                            this.s = new t((byte) 0);
                        }
                        return this.s;
                    }

                    public final ao getToolsComponentService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54518, new Class[0], ao.class)) {
                            return (ao) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54518, new Class[0], ao.class);
                        }
                        if (this.i == null) {
                            this.i = new w();
                        }
                        return this.i;
                    }

                    public final ac openSDKService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54538, new Class[0], ac.class)) {
                            return (ac) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54538, new Class[0], ac.class);
                        }
                        if (this.D == null) {
                            this.D = new com.ss.android.ugc.aweme.opensdk.share.b();
                        }
                        return this.D;
                    }

                    public final ap unlockStickerService() {
                        if (PatchProxy.isSupport(new Object[0], this, f3703a, false, 54537, new Class[0], ap.class)) {
                            return (ap) PatchProxy.accessDispatch(new Object[0], this, f3703a, false, 54537, new Class[0], ap.class);
                        }
                        if (this.C == null) {
                            this.C = new com.ss.android.ugc.aweme.shortvideo.sticker.unlock.l();
                        }
                        return this.C;
                    }
                })).asSingleton();
                ServiceManager.get().bind(com.ss.android.ugc.aweme.draft.a.h.class, com.ss.android.ugc.aweme.o.h.f3714b);
                ((IAVInitializer) ServiceManager.get().getService(IAVInitializer.class)).initialize(a());
                ((Integer) x.a().ae().c()).intValue();
                com.ss.android.ugc.aweme.tools.a.f fVar2 = com.ss.android.ugc.aweme.tools.a.f.MAIN_BUSINESS;
                com.ss.android.ugc.aweme.tools.a.c bVar = new com.ss.android.ugc.aweme.tools.a.a.b();
                if (PatchProxy.isSupport(new Object[]{fVar2, bVar}, null, com.ss.android.ugc.aweme.tools.a.g.f4269a, true, 87033, new Class[]{com.ss.android.ugc.aweme.tools.a.f.class, com.ss.android.ugc.aweme.tools.a.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fVar2, bVar}, null, com.ss.android.ugc.aweme.tools.a.g.f4269a, true, 87033, new Class[]{com.ss.android.ugc.aweme.tools.a.f.class, com.ss.android.ugc.aweme.tools.a.c.class}, Void.TYPE);
                } else {
                    if (com.ss.android.ugc.aweme.tools.a.g.f4271c) {
                        bVar = new d(bVar);
                    }
                    com.ss.android.ugc.aweme.tools.a.g.f4270b.put(fVar2, bVar);
                }
            }
            com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class, (LegoService) new DouDouService());
            com.ss.android.ugc.aweme.lego.a.i.b().a(DouDouService.class).a();
        }
        if (PatchProxy.isSupport(new Object[0], null, ef.f4293a, true, 88610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, ef.f4293a, true, 88610, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 28) {
            com.ss.android.ugc.aweme.framework.a.a.a("WatchDogKiller", "stopWatchDog, do not support after Android P, just return");
        } else if (ef.f4294b) {
            com.ss.android.ugc.aweme.framework.a.a.a("WatchDogKiller", "stopWatchDog, already stopped, just return");
        } else {
            ef.f4294b = true;
            com.ss.android.ugc.aweme.framework.a.a.a("WatchDogKiller", "stopWatchDog, try to stop watchdog");
            try {
                cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
                Field declaredField = cls.getDeclaredField("INSTANCE");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
                Field declaredField2 = cls.getSuperclass().getDeclaredField("thread");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, null);
            } catch (Throwable th2) {
                com.ss.android.ugc.aweme.framework.a.a.a("WatchDogKiller", "stopWatchDog, stop occur error:" + th);
                com.ss.android.ugc.aweme.framework.a.a.a(th2);
            }
        }
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.utils.ai.f4286a, true, 88073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.utils.ai.f4286a, true, 88073, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.utils.ai.f4287b != null) {
            com.ss.android.ugc.aweme.framework.a.a.a("class_not_found_message_handler", (Map<String, String>) null);
            com.ss.android.ugc.aweme.framework.a.a.a(com.ss.android.ugc.aweme.utils.ai.f4287b);
            ExceptionMonitor.ensureNotReachHere(com.ss.android.ugc.aweme.utils.ai.f4287b, "class_not_found_message_handler");
            com.ss.android.ugc.aweme.utils.ai.f4287b = null;
        }
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22308, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22308, new Class[0], Void.TYPE);
        } else {
            LinkSelector.a((Context) this);
            AppConfig.getInstance(a()).setDebug(com.ss.android.ugc.aweme.g.a.a());
        }
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22310, new Class[0], Void.TYPE);
        } else if (f() != -1) {
            n.a("aweme_app_performance", "application_create_time", (float) (System.currentTimeMillis() - f()));
        }
        ap a4 = ap.a(this);
        if (PatchProxy.isSupport(new Object[0], a4, ap.f2634a, false, 22960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a4, ap.f2634a, false, 22960, new Class[0], Void.TYPE);
        } else if (a4.f2637b && a4.f2639d == -1) {
            a4.f2638c.c();
            a4.f2639d = 0;
        }
        com.ss.android.b.a.a.a.a(l.f2664b, PushConstants.WORK_RECEIVER_EVENTCORE_ERROR);
        com.ss.android.ugc.aweme.sec.k.f3852b = new com.ss.android.ugc.aweme.sec.h();
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22296, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22296, new Class[0], Void.TYPE);
        } else {
            ToolUtils.isMainProcess(this);
        }
        com.ss.android.ugc.aweme.framework.e.a.f3319a = this;
        super.onCreate();
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22300, new Class[0], Void.TYPE);
        } else {
            com.ss.android.d.d.a((d.a) new com.ss.android.ugc.aweme.app.application.b.c());
            ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).installCommonParams();
            AppLog.setAppContext(i.a());
            AppConfig.getInstance(this).setFirstActivityCreate();
            com.ss.android.ugc.aweme.lego.a.i.a().a(new CommonLogReportInitTask(new com.ss.android.ugc.aweme.app.application.b.h())).a();
        }
        if (PatchProxy.isSupport(new Object[0], this, f2659a, false, 22298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2659a, false, 22298, new Class[0], Void.TYPE);
        } else if (getResources() == null) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) a(), "getResource is null!", 0).a();
            int myPid = Process.myPid();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(myPid)}, null, m.f2665a, true, 22316, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(myPid)}, null, m.f2665a, true, 22316, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
                if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                    Process.killProcess(myPid);
                } else {
                    throw new RuntimeException("Process killed, pid is " + myPid);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.app.h.a.f2652a, true, 23750, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.app.h.a.f2652a, true, 23750, new Class[]{Context.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.g.a.a() && ToolUtils.isMainProcess(this)) {
            cat.ereza.customactivityoncrash.a.a(CustomErrorActivity.class);
            cat.ereza.customactivityoncrash.a.a(getApplicationContext());
        }
        n.a("aweme_app_performance", "multidex_time", (float) this.l);
        this.f2660b.p_();
        p.a();
        ap a5 = ap.a(this);
        if (a5.f2637b && a5.f2639d == 0) {
            a5.f2639d = 1;
        }
        com.bytedance.apm.trace.c cVar = new com.bytedance.apm.trace.c();
        cVar.f2085b = true;
        cVar.f2084a = 50000;
        com.bytedance.apm.a aVar3 = a.C0005a.f1873a;
        ApmDelegate.getInstance().setTraceConfig(cVar);
        ApmDelegate.getInstance().init(this);
        new com.ss.android.ugc.aweme.k().a(this);
        if (this.g) {
            ag i3 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i3, ag.f3141a, false, 40157, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i3, ag.f3141a, false, 40157, new Class[0], Void.TYPE);
            } else if (i3.f3146f > 0) {
                i3.h();
            } else {
                i3.f3146f = SystemClock.uptimeMillis();
            }
            p.a();
        }
        com.bytedance.jedi.model.i.f.f2303a = false;
    }

    public static void a(long j2) {
        f2673d = -1;
    }

    public void onTrimMemory(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2659a, false, 22303, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2659a, false, 22303, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onTrimMemory(i2);
        this.f2660b.a(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0288  */
    @com.ss.android.ugc.thermometer.annotation.MeasureFunction
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachBaseContext(android.content.Context r26) {
        /*
            r25 = this;
            r8 = r25
            r0 = r26
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f2659a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 22302(0x571e, float:3.1252E-41)
            r2 = r25
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f2659a
            r4 = 0
            r5 = 22302(0x571e, float:3.1252E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            j = r0
            com.bytedance.aweme.AwemeSoLoader.init(r26)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.q.a.f3831a
            r14 = 1
            r15 = 54880(0xd660, float:7.6903E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0070
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.q.a.f3831a
            r14 = 1
            r15 = 54880(0xd660, float:7.6903E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00f2
        L_0x0070:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.q.c.f3834a
            r21 = 1
            r22 = 54890(0xd66a, float:7.6917E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r1
            r23 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r1 == 0) goto L_0x00a8
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.q.c.f3834a
            r14 = 1
            r15 = 54890(0xd66a, float:7.6917E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00d7
        L_0x00a8:
            java.lang.String r1 = "keva_switch_repo"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r10)
            java.lang.String r2 = "keva_switch"
            boolean r2 = r1.getBoolean(r2, r9)
            com.ss.android.ugc.aweme.q.c.f3835b = r2
            java.util.HashSet<java.lang.String> r2 = com.ss.android.ugc.aweme.q.c.f3836c
            java.lang.String[] r3 = com.ss.android.ugc.aweme.q.c.f3837d
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.addAll(r3)
            java.lang.String r2 = "keva_blacklist"
            java.util.Set r3 = java.util.Collections.emptySet()
            java.util.Set r1 = r1.getStringSet(r2, r3)
            java.util.HashSet<java.lang.String> r2 = com.ss.android.ugc.aweme.q.c.f3836c
            r2.addAll(r1)
            boolean r1 = com.ss.android.ugc.aweme.q.c.f3835b
            if (r1 != 0) goto L_0x00d7
            com.ss.android.ugc.aweme.q.c.a((android.content.Context) r26)
        L_0x00d7:
            com.bytedance.keva.KevaBuilder r1 = com.bytedance.keva.KevaBuilder.getInstance()
            r1.setContext(r0)
            com.ss.android.ugc.aweme.q.b r2 = new com.ss.android.ugc.aweme.q.b
            r2.<init>()
            r1.setMonitor(r2)
            java.lang.String r2 = "aweme_ported_sp_repo"
            r1.setPortedRepoName(r2)
            java.util.concurrent.ExecutorService r2 = com.ss.android.ugc.aweme.thread.h.c()
            r1.setExecutor(r2)
        L_0x00f2:
            super.attachBaseContext(r26)
            k = r8
            java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            com.ss.android.ugc.aweme.app.y r1 = new com.ss.android.ugc.aweme.app.y
            r1.<init>()
            r0.setRejectedExecutionHandler(r1)
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.feed.aq.f3150c = r0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.aq.f3148a
            r14 = 1
            r15 = 40258(0x9d42, float:5.6413E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r1 = 0
            if (r0 == 0) goto L_0x0133
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.aq.f3148a
            r14 = 1
            r15 = 40258(0x9d42, float:5.6413E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x013f
        L_0x0133:
            long r3 = com.ss.android.ugc.aweme.feed.aq.f3149b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x013f
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.feed.aq.f3149b = r3
        L_0x013f:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.services.e.f2679a
            r14 = 1
            r15 = 23595(0x5c2b, float:3.3064E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            r0[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r11 = 0
            r12 = 2
            if (r0 == 0) goto L_0x0175
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r8
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.services.e.f2679a
            r16 = 1
            r17 = 23595(0x5c2b, float:3.3064E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            r0[r10] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0294
        L_0x0175:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 20
            if (r0 >= r3) goto L_0x0294
            boolean r0 = com.ss.android.ugc.aweme.app.services.g.a(r25)
            java.lang.String r3 = "bmd_monitor"
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r8, r3, r10)
            com.ss.android.ugc.aweme.app.services.e.i = r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.io.File r4 = new java.io.File
            android.content.pm.ApplicationInfo r5 = r25.getApplicationInfo()
            java.lang.String r5 = r5.sourceDir
            r4.<init>(r5)
            long r4 = r4.lastModified()
            android.content.SharedPreferences r6 = com.ss.android.ugc.aweme.app.services.e.i
            java.lang.String r7 = "version"
            int r6 = r6.getInt(r7, r10)
            android.content.SharedPreferences r7 = com.ss.android.ugc.aweme.app.services.e.i
            java.lang.String r13 = "apk_time"
            long r13 = r7.getLong(r13, r1)
            r7 = 750(0x2ee, float:1.051E-42)
            if (r7 != r6) goto L_0x01b5
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r6 = 0
            goto L_0x01b6
        L_0x01b5:
            r6 = 1
        L_0x01b6:
            com.ss.android.ugc.aweme.app.services.e.h = r6
            if (r6 == 0) goto L_0x01c4
            java.lang.String r6 = "version"
            r3.putInt(r6, r7)
            java.lang.String r6 = "apk_time"
            r3.putLong(r6, r4)
        L_0x01c4:
            boolean r4 = com.ss.android.ugc.aweme.app.services.e.h
            r5 = 90
            if (r4 == 0) goto L_0x01de
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            int r4 = r4.nextInt(r12)
            int r4 = r4 + r5
            com.ss.android.ugc.aweme.app.services.e.g = r4
            java.lang.String r4 = "type"
            int r6 = com.ss.android.ugc.aweme.app.services.e.g
            r3.putInt(r4, r6)
            goto L_0x01e8
        L_0x01de:
            android.content.SharedPreferences r4 = com.ss.android.ugc.aweme.app.services.e.i
            java.lang.String r6 = "type"
            int r4 = r4.getInt(r6, r10)
            com.ss.android.ugc.aweme.app.services.e.g = r4
        L_0x01e8:
            int r4 = com.ss.android.ugc.aweme.app.services.e.g
            long r6 = (long) r4
            boolean r4 = com.ss.android.ugc.aweme.app.services.e.h
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = android.os.Build.BRAND
            r13.append(r14)
            java.lang.String r14 = "/"
            r13.append(r14)
            java.lang.String r14 = android.os.Build.PRODUCT
            r13.append(r14)
            java.lang.String r14 = "/"
            r13.append(r14)
            java.lang.String r14 = android.os.Build.MANUFACTURER
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.ss.android.ugc.aweme.app.services.g.a(r6, r4, r13, r11)
            long r6 = java.lang.System.nanoTime()
            int r4 = com.ss.android.ugc.aweme.app.services.e.g
            if (r4 != r5) goto L_0x0237
            if (r0 != 0) goto L_0x0237
            com.ss.android.ugc.aweme.app.services.e$1 r4 = new com.ss.android.ugc.aweme.app.services.e$1
            r4.<init>()
            com.bytedance.boost_multidex.Result r4 = com.bytedance.boost_multidex.BoostMultiDex.install(r8, r4)
            com.ss.android.ugc.aweme.app.services.e.f2683e = r4
            if (r4 == 0) goto L_0x023a
            com.bytedance.boost_multidex.Result r4 = com.ss.android.ugc.aweme.app.services.e.f2683e
            boolean r4 = r4.continuousInterruptHappened
            if (r4 != 0) goto L_0x0235
            com.bytedance.boost_multidex.Result r4 = com.ss.android.ugc.aweme.app.services.e.f2683e
            java.lang.Throwable r4 = r4.fatalThrowable
            if (r4 == 0) goto L_0x023a
        L_0x0235:
            com.ss.android.ugc.aweme.app.services.e.f2684f = r9
        L_0x0237:
            android.support.multidex.MultiDex.install(r25)
        L_0x023a:
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r6
            com.ss.android.ugc.aweme.app.services.e.f2681c = r4
            boolean r4 = com.ss.android.ugc.aweme.app.services.e.h
            if (r4 == 0) goto L_0x0254
            long r1 = com.ss.android.ugc.aweme.app.services.e.f2681c
            com.ss.android.ugc.aweme.app.services.e.f2682d = r1
            java.lang.String r1 = "first_cost_time"
            long r4 = com.ss.android.ugc.aweme.app.services.e.f2682d
            r3.putLong(r1, r4)
            r3.commit()
            goto L_0x025e
        L_0x0254:
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.app.services.e.i
            java.lang.String r4 = "first_cost_time"
            long r1 = r3.getLong(r4, r1)
            com.ss.android.ugc.aweme.app.services.e.f2682d = r1
        L_0x025e:
            com.bytedance.boost_multidex.Result r1 = com.ss.android.ugc.aweme.app.services.e.f2683e
            if (r1 == 0) goto L_0x0288
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.boost_multidex.Result r1 = com.ss.android.ugc.aweme.app.services.e.f2683e
            java.util.List<java.lang.Throwable> r1 = r1.unFatalThrowable
            java.util.Iterator r1 = r1.iterator()
        L_0x026f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0283
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r2 = com.ss.android.ugc.aweme.app.services.e.a(r2)
            r0.append(r2)
            goto L_0x026f
        L_0x0283:
            java.lang.String r0 = r0.toString()
            goto L_0x028c
        L_0x0288:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x028c:
            int r1 = com.ss.android.ugc.aweme.app.services.e.g
            long r1 = (long) r1
            boolean r3 = com.ss.android.ugc.aweme.app.services.e.h
            com.ss.android.ugc.aweme.app.services.g.a(r1, r3, r0, r11)
        L_0x0294:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = f2673d
            long r0 = r0 - r2
            r8.l = r0
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f2659a
            r4 = 0
            r5 = 22313(0x5729, float:3.1267E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x02c1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f2659a
            r4 = 0
            r5 = 22313(0x5729, float:3.1267E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02cd
        L_0x02c1:
            com.ss.android.ugc.webpcompat.WebpCompatManager r0 = com.ss.android.ugc.webpcompat.WebpCompatManager.getInstance()
            com.ss.android.ugc.aweme.app.k$1 r1 = new com.ss.android.ugc.aweme.app.k$1
            r1.<init>()
            r0.init(r1)
        L_0x02cd:
            java.lang.String r13 = i
            java.lang.String r14 = "attachBaseContextAfterMultiDex"
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.app.k> r1 = com.ss.android.ugc.aweme.app.k.class
            r0[r10] = r1
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r15[r10] = r8
            r7 = 4
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r10] = r13
            r1[r9] = r14
            r1[r12] = r0
            r16 = 3
            r1[r16] = r15
            com.meituan.robust.ChangeQuickRedirect r3 = f2659a
            r4 = 0
            r5 = 22312(0x5728, float:3.1266E-41)
            java.lang.Class[] r6 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class<java.lang.Class[]> r2 = java.lang.Class[].class
            r6[r12] = r2
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            r6[r16] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r2 = r25
            r11 = 4
            r7 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0335
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r13
            r1[r9] = r14
            r1[r12] = r0
            r1[r16] = r15
            com.meituan.robust.ChangeQuickRedirect r3 = f2659a
            r4 = 0
            r5 = 22312(0x5728, float:3.1266E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            r6[r12] = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r6[r16] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0335:
            java.lang.ClassLoader r1 = r25.getClassLoader()     // Catch:{ Exception -> 0x0346 }
            java.lang.Class r1 = r1.loadClass(r13)     // Catch:{ Exception -> 0x0346 }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r14, r0)     // Catch:{ Exception -> 0x0346 }
            r1 = 0
            r0.invoke(r1, r15)     // Catch:{ Exception -> 0x0346 }
            return
        L_0x0346:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "call reflect method "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r3 = "."
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " fail"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.k.attachBaseContext(android.content.Context):void");
    }
}
