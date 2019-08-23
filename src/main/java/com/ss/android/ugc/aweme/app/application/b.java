package com.ss.android.ugc.aweme.app.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.amap.api.maps2d.MapsInitializer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.linkselector.c.c;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.application.initialization.a;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.component.LoginActivityComponent;
import com.ss.android.ugc.aweme.crossplatform.base.SystemPrintHookTask;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.g;
import com.ss.android.ugc.aweme.lego.LegoService;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.legoImp.inflate.d;
import com.ss.android.ugc.aweme.legoImp.inflate.h;
import com.ss.android.ugc.aweme.legoImp.inflate.j;
import com.ss.android.ugc.aweme.legoImp.inflate.m;
import com.ss.android.ugc.aweme.legoImp.inflate.o;
import com.ss.android.ugc.aweme.legoImp.inflate.p;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.CheckNoticeTask;
import com.ss.android.ugc.aweme.legoImp.task.ExperienceKitInitTask;
import com.ss.android.ugc.aweme.legoImp.task.FabricInitTask;
import com.ss.android.ugc.aweme.legoImp.task.FetchCombineSettingsTask;
import com.ss.android.ugc.aweme.legoImp.task.FlipChatInitTask;
import com.ss.android.ugc.aweme.legoImp.task.GeckoTask;
import com.ss.android.ugc.aweme.legoImp.task.MiniAppInitTask;
import com.ss.android.ugc.aweme.legoImp.task.MobileFlowTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthTask;
import com.ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadCityTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadDmtSecSoTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.ss.android.ugc.aweme.legoImp.task.ScreenshotActivityLifeCycleTask;
import com.ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.StorageTask;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.ss.android.ugc.aweme.legoImp.task.UploadTeenStatusTask;
import com.ss.android.ugc.aweme.legoImp.task.VideoCachePreloaderInitTask;
import com.ss.android.ugc.aweme.legoImp.task.WXPayInitTask;
import com.ss.android.ugc.aweme.legoImp.task.WaterMarkDownloadTask;
import com.ss.android.ugc.aweme.legoImp.task.WebSocketTask;
import com.ss.android.ugc.aweme.login.SessionExpireReceiver;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.ss.android.ugc.aweme.share.be;
import com.ss.android.ugc.aweme.u;
import com.ss.android.ugc.aweme.utils.imm.RomUtils;
import com.ss.android.ugc.aweme.video.l;
import com.ss.android.ugc.playerkit.c.b;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.OkHttpClient;

public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33924a;

    /* renamed from: e  reason: collision with root package name */
    private k f33925e;

    /* renamed from: f  reason: collision with root package name */
    private final SessionExpireReceiver f33926f = new SessionExpireReceiver();

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23211, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f4325d.unregisterReceiver(this.f33926f);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23204, new Class[0], Void.TYPE);
            return;
        }
        a.i.a().a(new NpthTask()).a(new GeckoTask(i.a().getVersion())).a();
        a(d.f33937b);
        a(new com.ss.android.ugc.aweme.app.application.task.a());
        if (!com.ss.android.g.a.a()) {
            com.ss.android.f.a.a.f29095a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new com.ss.android.f.a.a());
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23205, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23205, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23209, new Class[0], Void.TYPE);
            return;
        }
        LinkSelector.a().f2476e = new com.ss.android.linkselector.c.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33927a;

            public final void a(com.ss.android.linkselector.c.b bVar) {
                com.ss.android.linkselector.c.b bVar2 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar2}, this, f33927a, false, 23219, new Class[]{com.ss.android.linkselector.c.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar2}, this, f33927a, false, 23219, new Class[]{com.ss.android.linkselector.c.b.class}, Void.TYPE);
                    return;
                }
                if (bVar2.f29295a == 0 && (bVar2.f29296b instanceof c)) {
                    c cVar = (c) bVar2.f29296b;
                    if (!cVar.h) {
                        n.b(cVar.f29300d, cVar.f29301e, cVar.f29297a, null, cVar.f29302f, cVar.f29299c, null);
                    }
                    n.a(cVar.f29300d, cVar.f29301e, cVar.f29297a, null, cVar.f29302f, cVar.f29299c, null);
                }
            }
        };
    }

    @MeasureFunction
    public final void a() {
        com.ss.android.ugc.playerkit.videoview.b bVar;
        boolean z;
        List list;
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23195, new Class[0], Void.TYPE);
            return;
        }
        a.i.a(com.ss.android.ugc.aweme.legoImp.inflate.b.class, (com.ss.android.ugc.aweme.lego.c) new d()).a(com.ss.android.ugc.aweme.legoImp.inflate.a.class, (com.ss.android.ugc.aweme.lego.c) new com.ss.android.ugc.aweme.legoImp.inflate.c()).a(com.ss.android.ugc.aweme.legoImp.inflate.i.class, (com.ss.android.ugc.aweme.lego.c) new com.ss.android.ugc.aweme.legoImp.inflate.i()).a(h.class, (com.ss.android.ugc.aweme.lego.c) new h()).a(j.class, (com.ss.android.ugc.aweme.lego.c) new j()).a(com.ss.android.ugc.aweme.legoImp.inflate.n.class, (com.ss.android.ugc.aweme.lego.c) new com.ss.android.ugc.aweme.legoImp.inflate.n()).a(p.class, (com.ss.android.ugc.aweme.lego.c) new p()).a(o.class, (com.ss.android.ugc.aweme.lego.c) new o()).a(m.class, (com.ss.android.ugc.aweme.lego.c) new m()).a(q.class, (com.ss.android.ugc.aweme.lego.c) new q()).a(MainLooperOptService.class, (LegoService) new MainLooperOptService()).a(AOTOptimizeService.class, (LegoService) new AOTOptimizeService());
        a.i.c().a(com.ss.android.ugc.aweme.legoImp.inflate.i.class).a(com.ss.android.ugc.aweme.legoImp.inflate.b.class).a(h.class).a();
        a.i.b().a(AOTOptimizeService.class).a(MainLooperOptService.class).a();
        a.i.a().a(new MiniAppInitTask()).a(new PlayerInitTask()).a(new PreloadCityTask()).a(new UploadTeenStatusTask()).a(new CheckNoticeTask()).a(new MobileFlowTask()).a(new ScreenshotActivityLifeCycleTask()).a(new WebSocketTask()).a(new WXPayInitTask()).a(new PerformanceHelperTask()).a(new WaterMarkDownloadTask()).a(new SetAppTrackTask()).a(new FlipChatInitTask()).a();
        com.ss.android.ugc.aweme.video.b.a((Context) this.f4325d);
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23200, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            String string = com.ss.android.ugc.aweme.q.c.a(this.f33925e, "test_data", 0).getString("host", "");
            if (!TextUtils.isEmpty(string)) {
                AwemeAppData.p().f(string);
            }
        }
        Application application = this.f4325d;
        if (PatchProxy.isSupport(new Object[]{application}, null, com.ss.android.ugc.aweme.utils.imm.a.f75895a, true, 88741, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, null, com.ss.android.ugc.aweme.utils.imm.a.f75895a, true, 88741, new Class[]{Application.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT <= 25) {
            if (PatchProxy.isSupport(new Object[]{application}, null, com.ss.android.ugc.aweme.utils.imm.a.f75895a, true, 88743, new Class[]{Context.class}, List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[]{application}, null, com.ss.android.ugc.aweme.utils.imm.a.f75895a, true, 88743, new Class[]{Context.class}, List.class);
            } else {
                list = new ArrayList();
                list.addAll(Arrays.asList(com.ss.android.ugc.aweme.utils.imm.a.f75896b));
                if (RomUtils.a() && Build.VERSION.SDK_INT >= 23) {
                    list.add("mLastSrvView");
                }
            }
            application.registerActivityLifecycleCallbacks(new com.ss.android.ugc.aweme.utils.imm.b(list) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75897a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ List f75898b;

                {
                    this.f75898b = r1;
                }

                public final void onActivityDestroyed(Activity activity) {
                    InputMethodManager inputMethodManager;
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity2}, this, f75897a, false, 88744, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, this, f75897a, false, 88744, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    super.onActivityDestroyed(activity);
                    List<String> list = this.f75898b;
                    if (PatchProxy.isSupport(new Object[]{activity2, list}, null, a.f75895a, true, 88742, new Class[]{Context.class, List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2, list}, null, a.f75895a, true, 88742, new Class[]{Context.class, List.class}, Void.TYPE);
                    } else if (activity2 != null && list != null) {
                        try {
                            inputMethodManager = (InputMethodManager) activity.getApplicationContext().getSystemService("input_method");
                        } catch (Throwable unused) {
                            inputMethodManager = null;
                        }
                        if (inputMethodManager != null) {
                            for (String declaredField : list) {
                                try {
                                    Field declaredField2 = inputMethodManager.getClass().getDeclaredField(declaredField);
                                    if (declaredField2 != null) {
                                        if (!declaredField2.isAccessible()) {
                                            declaredField2.setAccessible(true);
                                        }
                                        Object obj = declaredField2.get(inputMethodManager);
                                        if (obj != null) {
                                            if (obj instanceof View) {
                                                if (((View) obj).getContext() == activity2) {
                                                    declaredField2.set(inputMethodManager, null);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23199, new Class[0], Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.video.j.f76115a, true, 88934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.video.j.f76115a, true, 88934, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.playerkit.c.a.r().f77711a = new com.ss.android.ugc.playerkit.c.d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76117a;

                /* renamed from: b  reason: collision with root package name */
                Boolean f76118b;

                public final b m() {
                    return v.Normal;
                }

                public final boolean j() {
                    if (g.f52958b || j.f76116b) {
                        return true;
                    }
                    return false;
                }

                public final c.a a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88941, new Class[0], c.a.class)) {
                        return h.b();
                    }
                    return (c.a) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88941, new Class[0], c.a.class);
                }

                public final boolean c() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88943, new Class[0], Boolean.TYPE)) {
                        return AbTestManager.a().bf();
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88943, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean e() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88945, new Class[0], Boolean.TYPE)) {
                        return AbTestManager.a().bd();
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88945, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean f() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88947, new Class[0], Boolean.TYPE)) {
                        return com.ss.android.ugc.aweme.video.local.h.a();
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88947, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final double g() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88950, new Class[0], Double.TYPE)) {
                        return AbTestManager.a().d().bitrateModelThreshold;
                    }
                    return ((Double) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88950, new Class[0], Double.TYPE)).doubleValue();
                }

                public final int h() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88951, new Class[0], Integer.TYPE)) {
                        return AbTestManager.a().ai();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88951, new Class[0], Integer.TYPE)).intValue();
                }

                public final boolean i() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88952, new Class[0], Boolean.TYPE)) {
                        return com.ss.android.ugc.aweme.video.e.c.c();
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88952, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean k() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88953, new Class[0], Boolean.TYPE)) {
                        return VideoBitRateABManager.a().c();
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88953, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final Context l() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88954, new Class[0], Context.class)) {
                        return AwemeAppData.p().c().getContext();
                    }
                    return (Context) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88954, new Class[0], Context.class);
                }

                public final boolean n() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88955, new Class[0], Boolean.TYPE)) {
                        return AbTestManager.a().d().forceToKeepSurfaceBelowKITKAT;
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88955, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean o() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88956, new Class[0], Boolean.TYPE)) {
                        return AbTestManager.a().d().isTTPlayerAsyncInit;
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88956, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final int p() {
                    if (!PatchProxy.isSupport(new Object[0], this, f76117a, false, 88957, new Class[0], Integer.TYPE)) {
                        return AbTestManager.a().d().playerFramesWait;
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88957, new Class[0], Integer.TYPE)).intValue();
                }

                public final int b() {
                    if (PatchProxy.isSupport(new Object[0], this, f76117a, false, 88942, new Class[0], Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88942, new Class[0], Integer.TYPE)).intValue();
                    }
                    AbTestManager a2 = AbTestManager.a();
                    if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71900, new Class[0], Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71900, new Class[0], Integer.TYPE)).intValue();
                    }
                    AbTestModel d2 = a2.d();
                    if (d2 != null) {
                        return d2.ttplayerRenderType;
                    }
                    return 0;
                }

                public final boolean d() {
                    if (PatchProxy.isSupport(new Object[0], this, f76117a, false, 88944, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88944, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    AbTestManager a2 = AbTestManager.a();
                    if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71908, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71908, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    AbTestModel d2 = a2.d();
                    if (d2 == null) {
                        return false;
                    }
                    return d2.enableH265;
                }

                public final boolean q() {
                    boolean z;
                    if (PatchProxy.isSupport(new Object[0], this, f76117a, false, 88958, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88958, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (AbTestManager.a().d().playerUseVideoTextureRenderer && !f()) {
                        if (PatchProxy.isSupport(new Object[0], this, f76117a, false, 88959, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76117a, false, 88959, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            if (this.f76118b == null) {
                                this.f76118b = Boolean.valueOf(com.ss.android.newmedia.p.a());
                            }
                            z = this.f76118b.booleanValue();
                        }
                        if ((!z || Build.VERSION.SDK_INT < 27) && Build.VERSION.SDK_INT >= 26 && AbTestManager.a().d().ttplayerHardwareMediaRenderType != 0) {
                            return true;
                        }
                    }
                    return false;
                }
            };
            com.ss.android.ugc.playerkit.videoview.c playUrlBuilder = com.ss.android.ugc.playerkit.videoview.c.INSTANCE.setBitrateManager(com.ss.android.ugc.aweme.video.k.f76120b).setHttpsHelper(l.f76122b).setPlayUrlBuilder(com.ss.android.ugc.aweme.video.m.f76175b);
            com.ss.android.ugc.aweme.video.preload.g f2 = com.ss.android.ugc.aweme.video.preload.g.f();
            f2.getClass();
            if (PatchProxy.isSupport(new Object[]{f2}, null, com.ss.android.ugc.aweme.video.n.f76176a, true, 88939, new Class[]{com.ss.android.ugc.aweme.video.preload.g.class}, com.ss.android.ugc.playerkit.videoview.b.class)) {
                bVar = (com.ss.android.ugc.playerkit.videoview.b) PatchProxy.accessDispatch(new Object[]{f2}, null, com.ss.android.ugc.aweme.video.n.f76176a, true, 88939, new Class[]{com.ss.android.ugc.aweme.video.preload.g.class}, com.ss.android.ugc.playerkit.videoview.b.class);
            } else {
                bVar = new com.ss.android.ugc.aweme.video.n(f2);
            }
            playUrlBuilder.setCacheChecker(bVar).setPlayInfoCallback(new com.ss.android.ugc.aweme.video.g());
            com.ss.android.ugc.playerkit.b.b.f77706c = new com.ss.android.ugc.aweme.t.a();
            com.ss.android.ugc.playerkit.videoview.c.a.a().f77760b = new com.ss.android.ugc.aweme.video.c.a();
            if (AbTestManager.a().ai() == 2) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.playerkit.videoview.c.a.a().f77759a = new com.ss.android.ugc.aweme.video.c.b(z);
        }
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23203, new Class[0], Void.TYPE);
        } else {
            try {
                com.ss.android.ugc.aweme.live.a.c();
            } catch (Exception unused) {
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23201, new Class[0], Void.TYPE);
        } else if (((Integer) x.a().ae().c()).intValue() <= 182) {
            SharePrefCache.inst().getUseNewFFmpeg().a(Boolean.FALSE);
        }
        com.bytedance.ies.dmt.ui.common.d.a().a(com.ss.android.g.a.a(), com.ss.android.g.a.b());
        a.i.a().a(new FabricInitTask()).a(new SystemPrintHookTask()).a(new VideoCachePreloaderInitTask()).a(new StorageTask()).a();
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23207, new Class[0], Void.TYPE);
        } else {
            ServiceManager.get().bind(OkHttpClient.class, e.f33939b);
            Application application2 = this.f4325d;
            if (PatchProxy.isSupport(new Object[]{application2}, null, com.ss.android.ugc.aweme.app.application.initialization.a.f33947a, true, 23252, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{application2}, null, com.ss.android.ugc.aweme.app.application.initialization.a.f33947a, true, 23252, new Class[]{Context.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.app.application.initialization.a.f33948b.set(application2);
            }
            a.C0436a aVar = f.f33941b;
            if (PatchProxy.isSupport(new Object[]{aVar}, null, com.ss.android.ugc.aweme.app.application.initialization.a.f33947a, true, 23253, new Class[]{a.C0436a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, null, com.ss.android.ugc.aweme.app.application.initialization.a.f33947a, true, 23253, new Class[]{a.C0436a.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.app.application.initialization.a.f33949c.set(aVar);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23212, new Class[0], Void.TYPE);
        } else {
            IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
            com.ss.android.ugc.b.c a2 = com.ss.android.ugc.b.c.a();
            Application application3 = this.f4325d;
            g gVar = new g(shortVideoConfig);
            h hVar = new h(shortVideoConfig);
            a2.f77144c = application3;
            com.ss.android.ugc.a.b.a().a((Context) application3);
            if (a2.f77145d != null) {
                com.ss.android.ugc.a.b.a().a(a2.f77145d);
            }
            a2.f77142a = hVar;
            a2.f77143b = gVar;
            com.ss.android.ugc.b.c.a().f77146e = false;
        }
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23206, new Class[0], Void.TYPE);
        } else {
            this.f4325d.registerReceiver(this.f33926f, new IntentFilter("session_expire"));
        }
        com.ss.android.ugc.aweme.login.c.a.f53752a = "1462309810";
        com.ss.android.sdk.a.a.f30607a = "1105602870";
        com.facebook.imageutils.b.f2352a = new c(this);
        BaseAppData.a().b((Context) k.a());
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23202, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            LocalAbTestModel localAbTestModel = new LocalAbTestModel();
            com.ss.android.ugc.aweme.setting.ui.n.b().a((Context) k.a(), "local_ab_test_model", (Object) localAbTestModel);
            AbTestManager.a().n = localAbTestModel;
        }
        e.a(new LoginActivityComponent());
        this.f4325d.registerActivityLifecycleCallbacks(new com.ss.android.ugc.aweme.app.application.b.a());
        u.f50724a = new be();
        this.f4325d.registerActivityLifecycleCallbacks(new com.ss.android.ugc.aweme.app.fabric.a());
        this.f4325d.registerActivityLifecycleCallbacks(new com.ss.android.ugc.aweme.cloudcontrol.a());
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23198, new Class[0], Void.TYPE);
        } else {
            com.bytedance.sdk.account.open.tt.impl.a.a(new com.bytedance.sdk.account.a.b.c("fc169c8d3a2eec4a"));
        }
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.map.b.f55049a, true, 58314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.map.b.f55049a, true, 58314, new Class[0], Void.TYPE);
        } else {
            MapsInitializer.loadWorldGridMap(true);
        }
        com.ss.android.ugc.aweme.util.d.a(this.f4325d);
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23197, new Class[0], Void.TYPE);
        } else {
            com.bytedance.ies.dmt.ui.common.b.a().f20312a = com.ss.android.g.a.b() ^ true ? 1 : 0;
        }
        if (PatchProxy.isSupport(new Object[0], this, f33924a, false, 23196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33924a, false, 23196, new Class[0], Void.TYPE);
        } else {
            ag i = ag.i();
            if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40189, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40189, new Class[0], Void.TYPE);
            } else if (i.B <= 0) {
                i.B = SystemClock.uptimeMillis();
            }
            com.ss.android.ugc.aweme.lego.a.i.a(com.ss.android.ugc.aweme.legoImp.task.g.a());
            ag i2 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40190, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40190, new Class[0], Void.TYPE);
            } else if (i2.C <= 0) {
                i2.C = SystemClock.uptimeMillis();
            }
            ag i3 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i3, ag.f3141a, false, 40191, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i3, ag.f3141a, false, 40191, new Class[0], Void.TYPE);
            } else if (i3.D <= 0) {
                i3.D = SystemClock.uptimeMillis();
            }
            com.ss.android.ugc.aweme.lego.a.i.a(com.ss.android.ugc.aweme.legoImp.task.g.c());
            ag i4 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i4, ag.f3141a, false, 40192, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i4, ag.f3141a, false, 40192, new Class[0], Void.TYPE);
            } else if (i4.E <= 0) {
                i4.E = SystemClock.uptimeMillis();
            }
            ag i5 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i5, ag.f3141a, false, 40193, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i5, ag.f3141a, false, 40193, new Class[0], Void.TYPE);
            } else if (i5.F <= 0) {
                i5.F = SystemClock.uptimeMillis();
            }
            com.ss.android.ugc.aweme.lego.a.i.a(com.ss.android.ugc.aweme.legoImp.task.g.b());
            ag i6 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i6, ag.f3141a, false, 40194, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i6, ag.f3141a, false, 40194, new Class[0], Void.TYPE);
            } else if (i6.G <= 0) {
                i6.G = SystemClock.uptimeMillis();
            }
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new FetchCombineSettingsTask()).a();
    }

    public b(k kVar) {
        super(kVar);
        this.f33925e = kVar;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f33924a, false, 23210, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f33924a, false, 23210, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i);
        com.ss.android.ugc.aweme.lego.a.i.a().a(new TrimMemoryTask(i)).a();
    }

    @MeasureFunction
    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f33924a, false, 23194, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f33924a, false, 23194, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.a(context);
        com.ss.android.ugc.aweme.lego.a.i.a().a(new ExperienceKitInitTask()).a(new PreloadDmtSecSoTask()).a(new PreloadWireFieldNoEnumClassTask()).a(new SharePreferencePreloadTask()).a();
    }
}
