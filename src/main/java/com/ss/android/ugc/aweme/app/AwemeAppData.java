package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.EventsSender;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.sdk.c.g;
import com.ss.android.statistic.d;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feedback.s;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask;
import com.ss.android.ugc.aweme.legoImp.task.RefreshLocationTask;
import com.ss.android.ugc.aweme.m.e;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.ss.android.ugc.aweme.music.ui.a.b;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.ss.android.ugc.aweme.requesttask.idle.i;
import com.ss.android.ugc.aweme.requesttask.idle.k;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.splash.SplashAdActivity;
import com.ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.ss.android.ugc.aweme.update.m;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.web.l;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class AwemeAppData extends BaseAppData {
    public static ChangeQuickRedirect ad;
    public String ae = "";
    public long af;
    public boolean ag;
    public Set<String> ah;
    public boolean ai = true;
    public boolean aj;
    public String ak;
    public volatile long al;
    public volatile String am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public boolean au;
    public boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;

    class RedPointTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BACKGROUND;
        }

        private RedPointTask() {
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 22292, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 22292, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            a.a("RedPointTask");
            AwemeAppData.this.b(true);
            c.a().a(true, 4);
        }
    }

    public static Class<? extends AdsAppBaseActivity> r() {
        return AdsAppActivity.class;
    }

    public final boolean a(JSONObject jSONObject) {
        e eVar;
        an<Boolean> anVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, ad, false, 22265, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, ad, false, 22265, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        boolean a2 = super.a(jSONObject);
        if (PatchProxy.isSupport(new Object[0], null, e.f54111a, true, 49496, new Class[0], e.class)) {
            eVar = (e) PatchProxy.accessDispatch(new Object[0], null, e.f54111a, true, 49496, new Class[0], e.class);
        } else {
            eVar = (e) e.f54112c.b();
        }
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, eVar, e.f54111a, false, 49497, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, eVar, e.f54111a, false, 49497, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("aweme_uniqueid_settings");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            Message obtainMessage = eVar.f54114b.obtainMessage(1);
            obtainMessage.obj = optJSONObject;
            eVar.f54114b.sendMessage(obtainMessage);
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("aweme_uniqueid_settings");
        if (optJSONObject2 != null) {
            boolean z = optJSONObject2.optInt("enable_push_deduplication", 1) > 0;
            if (z != this.an) {
                this.an = z;
                a2 = true;
            }
        }
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("aweme_music_ailab");
        if (optJSONObject3 != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).initAIMusicSettings(optJSONObject3.toString());
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).initAIMusicSettings("");
        }
        x.a().s().a(Integer.valueOf(jSONObject2.optInt("teens_mode_alert_count")));
        x.a().t().a(Boolean.valueOf(jSONObject2.optBoolean("teens_mode_match_alert_switch")));
        x a3 = x.a();
        if (PatchProxy.isSupport(new Object[0], a3, x.f2698a, false, 22376, new Class[0], an.class)) {
            anVar = (an) PatchProxy.accessDispatch(new Object[0], a3, x.f2698a, false, 22376, new Class[0], an.class);
        } else {
            if (a3.h == null) {
                a3.h = new an<>("minor_protection_third_edition_switch", Boolean.FALSE);
            }
            anVar = a3.h;
        }
        anVar.a(Boolean.valueOf(jSONObject2.optBoolean("minor_protection_third_edition_switch")));
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("aweme_live_podcast");
        if (optJSONObject4 != null) {
            this.ar = optJSONObject4.optBoolean("can_be_obs_live_podcast");
        }
        b bVar = b.f56658c;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, bVar, b.f56656a, false, 60564, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, bVar, b.f56656a, false, 60564, new Class[]{JSONObject.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(jSONObject2, "data");
            JSONObject optJSONObject5 = jSONObject2.optJSONObject("aweme_third_party_music_cover");
            if (optJSONObject5 != null) {
                try {
                    b.f56657b = (ThirdMusicCoverItem) new Gson().fromJson(optJSONObject5.toString(), ThirdMusicCoverItem.class);
                    com.ss.android.ugc.aweme.music.util.a.f56791b.a("third_music_cover_info", optJSONObject5.toString(), "music_sp");
                } catch (Throwable unused) {
                    String jSONObject3 = optJSONObject5.toString();
                    Intrinsics.checkExpressionValueIsNotNull(jSONObject3, "jsonObject.toString()");
                    bVar.b(jSONObject3);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, com.ss.android.ugc.aweme.commerce.setting.b.f38320a, true, 30124, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, com.ss.android.ugc.aweme.commerce.setting.b.f38320a, true, 30124, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            try {
                JSONObject optJSONObject6 = jSONObject2.optJSONObject("shopping_desc");
                if (optJSONObject6 != null) {
                    com.ss.android.ugc.aweme.commerce.service.h.a a4 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(k.g());
                    if (a4 != null) {
                        String jSONObject4 = optJSONObject6.toString();
                        Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "it.toString()");
                        a4.h(jSONObject4);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        bg.b(new com.ss.android.ugc.aweme.antiaddic.b.c());
        return a2;
    }

    public final void a(SharedPreferences sharedPreferences) {
        if (PatchProxy.isSupport(new Object[]{sharedPreferences}, this, ad, false, 22281, new Class[]{SharedPreferences.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sharedPreferences}, this, ad, false, 22281, new Class[]{SharedPreferences.class}, Void.TYPE);
            return;
        }
        super.a(sharedPreferences);
        this.an = sharedPreferences.getBoolean("enable_push_deduplication", true);
        this.ar = sharedPreferences.getBoolean("aweme_live_podcast", false);
    }

    public final boolean a(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, Byte.valueOf(z ? (byte) 1 : 0)}, this, ad, false, 22282, new Class[]{JSONObject.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, Byte.valueOf(z)}, this, ad, false, 22282, new Class[]{JSONObject.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        m a2 = m.a();
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, a2, m.f4275a, false, 87465, new Class[]{JSONObject.class}, Void.TYPE)) {
            m mVar = a2;
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, mVar, m.f4275a, false, 87465, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            s sVar = new s();
            sVar.f47213a = jSONObject2.optInt("update_sdk", 1);
            sVar.f47214b = jSONObject2.optInt("pre_download_version", 0);
            sVar.f47215c = jSONObject2.optInt("pre_download_start_time", 0);
            sVar.f47216d = jSONObject2.optInt("pre_download_delay_days", 0);
            sVar.f47217e = jSONObject2.optLong("pre_download_delay_second", -1);
            com.ss.android.ugc.aweme.aj.b.b().a(a2.i, "update_params", (Object) sVar);
        }
        return super.a(jSONObject, z);
    }

    public static AwemeAppData p() {
        if (PatchProxy.isSupport(new Object[0], null, ad, true, 22261, new Class[0], AwemeAppData.class)) {
            return (AwemeAppData) PatchProxy.accessDispatch(new Object[0], null, ad, true, 22261, new Class[0], AwemeAppData.class);
        }
        if (f2497d instanceof AwemeAppData) {
            return (AwemeAppData) f2497d;
        }
        throw new IllegalStateException("AppData not init or invalid");
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, ad, false, 22284, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, ad, false, 22284, new Class[0], Integer.TYPE)).intValue();
        }
        this.C = e(this.u).getInt("last_version_code", 0);
        return this.C;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, ad, false, 22285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ad, false, 22285, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        SplashAdManagerHolder.b(this.u).c();
    }

    public final g o() {
        if (!PatchProxy.isSupport(new Object[0], this, ad, false, 22288, new Class[0], g.class)) {
            return l.c();
        }
        return (g) PatchProxy.accessDispatch(new Object[0], this, ad, false, 22288, new Class[0], g.class);
    }

    public final boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, ad, false, 22262, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ad, false, 22262, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Context context = this.s.getContext();
        return com.ss.android.newmedia.e.a(context, context.getPackageName(), (BaseAppData) this);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, ad, false, 22289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ad, false, 22289, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        if (!this.ay && !TextUtils.isEmpty(AppLog.getServerDeviceId())) {
            com.ss.android.ugc.aweme.lego.a.i.a().a(new MonitorInitTask()).a();
            com.ss.android.ugc.aweme.lego.a.i.d().a(new k()).a();
            com.ss.android.ugc.aweme.lego.a.i.d().a(new i()).a();
            this.ay = true;
        }
        if (PatchProxy.isSupport(new Object[0], this, ad, false, 22290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ad, false, 22290, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.requesttask.b.e()).a();
    }

    public final com.ss.android.sdk.c.f a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, ad, false, 22287, new Class[]{Context.class}, com.ss.android.sdk.c.f.class)) {
            return new com.ss.android.ugc.aweme.web.b(context2, this);
        }
        return (com.ss.android.sdk.c.f) PatchProxy.accessDispatch(new Object[]{context2}, this, ad, false, 22287, new Class[]{Context.class}, com.ss.android.sdk.c.f.class);
    }

    public final void d(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, ad, false, 22280, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, ad, false, 22280, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.d(context);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ad, false, 22283, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ad, false, 22283, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = e(this.u).edit();
        edit.putInt("last_version_code", i);
        SharedPrefsEditorCompat.apply(edit);
    }

    public void onAppBackgoundSwitch(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ad, false, 22275, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ad, false, 22275, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onAppBackgoundSwitch(z);
        this.as = z;
        if (z) {
            SplashAdManagerHolder.b(this.u).b();
            SplashAdManagerHolder.a(this.u).b(0);
            this.ag = true;
            this.ax = true;
        } else {
            SplashAdManagerHolder.b(this.u).a();
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33649a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f33649a, false, 22291, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f33649a, false, 22291, new Class[0], Void.TYPE);
                    return;
                }
                MonitorUtils.setIsBackGround(z);
            }
        });
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ad, false, 22264, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ad, false, 22264, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if ((z || q()) && !StringUtils.isEmpty(AppLog.getServerDeviceId())) {
            com.ss.android.ugc.aweme.message.d.f.d().f();
        }
    }

    public final void f(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, ad, false, 22271, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, ad, false, 22271, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null && !str.equals(this.ae)) {
            this.ae = str;
            this.af = System.currentTimeMillis();
            this.A = true;
        }
        if (StringUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[0], this, ad, false, 22273, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, ad, false, 22273, new Class[0], Void.TYPE);
            } else {
                EventsSender.inst().setHost(this.ae);
                EventsSender.inst().setSenderEnable(false);
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, ad, false, 22272, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, ad, false, 22272, new Class[0], Void.TYPE);
                return;
            }
            EventsSender.inst().setHost(this.ae);
            EventsSender.inst().setSenderEnable(true);
        }
    }

    public void onActivityPaused(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, ad, false, 22270, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, ad, false, 22270, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onActivityPaused(activity);
        ag i = ag.i();
        if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40183, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper() && i.z <= 0) {
            i.z = SystemClock.uptimeMillis();
        }
        d a2 = d.a();
        if (a2.b()) {
            for (com.ss.android.statistic.c.b b2 : a2.f2562a.f31119a) {
                b2.b(activity2);
            }
        }
        ag i2 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40184, new Class[0], Void.TYPE);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && i2.A <= 0) {
            i2.A = SystemClock.uptimeMillis();
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, ad, false, 22277, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, ad, false, 22277, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        super.a(j);
        this.al = j;
        if (!this.aw) {
            this.aw = true;
            com.ss.android.common.lib.a.a(c().getContext(), "monitor", "launch");
        }
    }

    public void onActivityResumed(Activity activity) {
        boolean z;
        boolean z2;
        boolean z3;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, ad, false, 22267, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, ad, false, 22267, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onActivityResumed(activity);
        this.at = false;
        this.au = false;
        this.av = activity2 instanceof MainActivity;
        if (!(activity2 == null && activity.getIntent() == null)) {
            Intent intent = activity.getIntent();
            this.at = intent.getBooleanExtra("from_notification", false);
            Uri data = intent.getData();
            if (intent.getBooleanExtra("ads_app_activity_by_wap_click", false) || !(data == null || data.getQueryParameter("gd_label") == null || !data.getQueryParameter("gd_label").startsWith("click_wap"))) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.au = z3;
        }
        if (this.Z && !(activity2 instanceof SplashAdActivity) && !(activity2 instanceof SplashActivity)) {
            com.ss.android.ugc.aweme.lego.a.i.a().a(new RefreshLocationTask()).a();
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new RedPointTask()).a();
        ag i = ag.i();
        if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40181, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper() && i.x <= 0) {
            i.x = SystemClock.uptimeMillis();
        }
        d a2 = d.a();
        if (a2.b()) {
            for (com.ss.android.statistic.c.b a3 : a2.f2562a.f31119a) {
                a3.a(activity2);
            }
        }
        ag i2 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40182, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper() && i2.y <= 0) {
            i2.y = SystemClock.uptimeMillis();
        }
        Activity f2 = f();
        if (this.ag && !this.ao) {
            if (PatchProxy.isSupport(new Object[]{f2}, null, ad, true, 22268, new Class[]{Activity.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{f2}, null, ad, true, 22268, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (!TimeLockRuler.isTeenModeON() && f2 != null) {
                    if (PatchProxy.isSupport(new Object[]{f2}, null, ad, true, 22269, new Class[]{Object.class}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{f2}, null, ad, true, 22269, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                    } else if (!(f2 instanceof com.ss.android.ugc.aweme.splash.a) || !((com.ss.android.ugc.aweme.splash.a) f2).isSplashShowing()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 && !(f2 instanceof AwemeAuthorizedActivity)) {
                        z = SplashAdManagerHolder.a((Context) f2).e();
                    }
                }
                z = false;
            }
            if (z) {
                try {
                    SplashAdActivity.b bVar = SplashAdActivity.f71563b;
                    if (PatchProxy.isSupport(new Object[]{f2}, bVar, SplashAdActivity.b.f71574a, false, 81882, new Class[]{Context.class}, Boolean.TYPE)) {
                        SplashAdActivity.b bVar2 = bVar;
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{f2}, bVar2, SplashAdActivity.b.f71574a, false, 81882, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                    } else if (f2 == null) {
                        bVar.a();
                    } else if (AbTestManager.a().bt() != 0 || !p().aj) {
                        bVar.f71575b = SplashAdManagerHolder.a(f2.getApplicationContext()).d();
                        bVar.f71577d = new SplashAdActivity.a((byte) 0);
                        bVar.f71575b.a((com.ss.android.ad.splash.c) bVar.f71577d);
                        com.ss.android.ugc.aweme.commercialize.splash.a.a().b();
                        bVar.f71576c = bVar.f71575b.a((Context) f2);
                        if (bVar.f71576c == null) {
                            bVar.a();
                        } else {
                            ((MainLooperOptService) com.ss.android.ugc.aweme.lego.a.i.a(MainLooperOptService.class)).enable(false);
                            Intent intent2 = new Intent(f2, SplashAdActivity.class);
                            if (f2 instanceof Activity) {
                                intent2.putExtra("from", f2.getClass().getName());
                            } else {
                                intent2.addFlags(268435456);
                            }
                            f2.startActivity(intent2);
                        }
                    } else {
                        p().aj = false;
                    }
                } catch (Exception e2) {
                    a.a((Throwable) e2);
                }
            }
            this.ag = false;
        } else if (AbTestManager.a().bt() == 0) {
            p().aj = false;
        }
        if (this.ao) {
            this.ao = false;
        }
        if (this.ax) {
            if (com.ss.android.ugc.aweme.aj.b.b().b((Context) activity2, "is_hot_start_gps", false)) {
                cg.b(true);
            }
            this.ax = false;
        }
        if (!com.ss.android.ugc.aweme.requestcombine.a.f63567e.a()) {
            com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.requesttask.idle.e()).a();
        }
    }

    public final void a(SharedPreferences.Editor editor) {
        if (PatchProxy.isSupport(new Object[]{editor}, this, ad, false, 22266, new Class[]{SharedPreferences.Editor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editor}, this, ad, false, 22266, new Class[]{SharedPreferences.Editor.class}, Void.TYPE);
            return;
        }
        super.a(editor);
        editor.putBoolean("enable_push_deduplication", this.an);
        editor.putBoolean("aweme_live_podcast", this.ar);
    }

    public final String a(Context context, WebView webView) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context, webView}, this, ad, false, 22276, new Class[]{Context.class, WebView.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, webView}, this, ad, false, 22276, new Class[]{Context.class, WebView.class}, String.class);
        }
        String a2 = com.ss.android.newmedia.e.a(context, webView);
        if (a2 == null) {
            a2 = "";
        }
        String str2 = a2 + " aweme_" + this.s.getVersionCode() + " JsSdk/1.0 NetType/" + NetworkUtils.getNetworkAccessType(this.s.getContext()).toUpperCase() + " Channel/" + this.s.getChannel() + " app_version/" + this.s.getVersion();
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 21) {
            str = str2 + " ByteLocale/" + locale.toLanguageTag();
        } else {
            str = str2 + " ByteLocale/" + locale.toString().replace("_", "-");
        }
        return str + " Region/" + com.ss.android.ugc.aweme.language.e.b();
    }

    public AwemeAppData(AppContext appContext, String str, String str2) {
        super(appContext, str, str2);
        this.Z = true;
        this.ah = new HashSet();
        this.f2499b = true;
    }

    public final void b(long j, String str, JSONObject jSONObject) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2, jSONObject}, this, ad, false, 22278, new Class[]{Long.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2, jSONObject}, this, ad, false, 22278, new Class[]{Long.TYPE, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        super.b(j, str, jSONObject);
        this.am = str2;
        MultiAccountViewModel.a(false);
    }

    public final void a(long j, String str, JSONObject jSONObject) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str, jSONObject}, this, ad, false, 22279, new Class[]{Long.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str, jSONObject}, this, ad, false, 22279, new Class[]{Long.TYPE, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        super.a(j, str, jSONObject);
        com.ss.android.common.lib.a.a(c().getContext(), "monitor", "terminate");
        this.aw = false;
    }

    public final void a(int i, boolean z, int i2, @Nullable User user) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), user}, this, ad, false, 22263, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2), user}, this, ad, false, 22263, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE);
            return;
        }
        super.a(i, z, i2, user);
        b(true);
    }
}
