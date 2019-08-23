package com.ss.android.newmedia;

import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.AsyncTaskUtils;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.ies.uikit.base.AppHooks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.alive.monitor.d;
import com.ss.android.common.AppContext;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.config.AppConfig;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.newmedia.app.e;
import com.ss.android.newmedia.j;
import com.ss.android.newmedia.logsdk.b;
import com.ss.android.newmedia.thread.GetSettingThread;
import com.ss.android.sdk.c.g;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.antiaddic.b.c;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.net.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class BaseAppData implements WeakHandler.IHandler, AppHooks.ActivityLifeCycleHook, AppHooks.ActivityResultHook, AppHooks.AppBackgroundHook, AppLog.j, b.a, IAccountService.a {
    static final AtomicLong W = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2496a;
    private static int al = -1;
    private static int am = -1;
    private static boolean an = false;
    private static boolean ao = false;
    private static boolean ap = false;
    private static boolean aq = false;
    private static boolean ar = true;
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat au = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: d  reason: collision with root package name */
    public static BaseAppData f2497d;

    /* renamed from: e  reason: collision with root package name */
    protected static final ColorFilter f2498e = new ColorMatrixColorFilter(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    protected boolean A = false;
    public String B = "";
    protected int C = 0;
    public long D = 0;
    protected boolean E = false;
    protected long F = 0;
    protected long G = 0;
    protected boolean H = false;
    public long I = 0;
    protected boolean J = false;
    public boolean K = false;
    public long L = -1;
    public long M = -1;
    protected j N = new j(20);
    public String O;
    protected WeakHandler P = new WeakHandler(Looper.getMainLooper(), this);
    protected WeakReference<Activity> Q;
    protected long R = 0;
    protected long S = 0;
    protected volatile long T = 0;
    public volatile long U = 0;
    public final c V;
    public boolean X = false;
    protected List<String> Y = new ArrayList();
    protected boolean Z = true;
    protected long aa = 0;
    public com.ss.android.newmedia.logsdk.b ab;
    public b ac;
    private final Object ad = new Object();
    private int ae = 1;
    private int af = 1;
    private int ag = -1;
    private long ah;
    private int ai = 2;
    private String aj;
    private String ak;
    private int as;
    private int at;
    private List<a> av = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2499b;

    /* renamed from: c  reason: collision with root package name */
    protected int f2500c = 1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2501f;
    public boolean g = true;
    protected String h = "";
    protected List<String> i = new ArrayList();
    protected List<String> j = new ArrayList();
    protected int k = -1;
    public boolean l = true;
    protected int m = -1;
    protected int n = -1;
    protected int o = -1;
    protected String p = null;
    protected int q = -1;
    protected String r = "";
    protected final AppContext s;
    protected int t;
    protected final Context u;
    protected final String v;
    public long w;
    public long x;
    protected AtomicBoolean y = new AtomicBoolean(false);
    protected long z = 0;

    static class InitTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;
        private BaseAppData baseAppData;
        private b listener;

        @NotNull
        public f type() {
            return f.BOOT_FINISH;
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 18366, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 18366, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.a("InitTask");
            this.baseAppData.d(context);
            this.baseAppData.c(context);
        }

        InitTask(b bVar, BaseAppData baseAppData2) {
            this.listener = bVar;
            this.baseAppData = baseAppData2;
        }
    }

    static class ResumeTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;
        private c alertManager;
        private BaseAppData baseAppData;

        @NotNull
        public f type() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 18367, new Class[0], f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 18367, new Class[0], f.class);
            } else if (com.ss.android.g.a.a()) {
                return f.BOOT_FINISH;
            } else {
                return f.BACKGROUND;
            }
        }

        public void run(@NotNull Context context) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 18368, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 18368, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            Context context2 = this.baseAppData.c().getContext();
            this.alertManager.a(context2);
            AppConfig.onActivityResume(context2);
            if (PatchProxy.isSupport(new Object[]{context2}, null, k.f30217a, true, 18395, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, null, k.f30217a, true, 18395, new Class[]{Context.class}, Void.TYPE);
            } else if (context2 != null) {
                k.a().b();
            }
            if (PatchProxy.isSupport(new Object[0], null, z.f47066a, true, 40128, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, z.f47066a, true, 40128, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = TextUtils.isEmpty(com.ss.android.common.applog.z.a());
            }
            if (!z) {
                this.baseAppData.h();
            }
        }

        ResumeTask(c cVar, BaseAppData baseAppData2) {
            this.alertManager = cVar;
            this.baseAppData = baseAppData2;
        }
    }

    public static abstract class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void handleMsg(Message message) {
        }

        public void onAccountRefresh(boolean z, int i, Context context) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onLoadData(Context context) {
        }

        public void onSaveData(Context context) {
        }
    }

    public interface b {
        boolean a();
    }

    public static String e(String str) {
        return str;
    }

    public abstract com.ss.android.sdk.c.f a(Context context);

    public void a(long j2, String str, JSONObject jSONObject) {
    }

    public boolean a(JSONObject jSONObject, boolean z2) {
        return !z2 ? false : false;
    }

    public void b(long j2, String str, JSONObject jSONObject) {
    }

    public g o() {
        return null;
    }

    public boolean onActivityResult(Activity activity, int i2, int i3, Intent intent) {
        return i2 == 32973;
    }

    public void onAppBackgoundSwitch(boolean z2) {
    }

    public static ColorFilter i() {
        return f2498e;
    }

    public int b() {
        return this.C;
    }

    public void a(SharedPreferences sharedPreferences) {
        if (PatchProxy.isSupport(new Object[]{sharedPreferences}, this, f2496a, false, 18308, new Class[]{SharedPreferences.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sharedPreferences}, this, f2496a, false, 18308, new Class[]{SharedPreferences.class}, Void.TYPE);
            return;
        }
        if (this.h == null) {
            this.h = "";
        }
        try {
            this.i.clear();
            if (this.h.length() > 0) {
                a(new JSONArray(this.h), this.i);
            }
        } catch (Exception unused) {
        }
        com.ss.android.newmedia.app.g.f30177b = this.m;
        com.ss.android.newmedia.app.g.f30178c = this.n;
        com.ss.android.newmedia.app.g.f30179d = this.o;
        this.as = sharedPreferences.getInt("live_push_system_max_show_count", 8);
        this.at = sharedPreferences.getInt("live_push_nonsystem_max_show_count", 6);
        this.r = sharedPreferences.getString("share_templates", "");
        this.aa = sharedPreferences.getLong("last_sign_time", 0);
        this.ak = sharedPreferences.getString("js_actlog_url", "");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.ah < 0 || this.ah > currentTimeMillis) {
            this.ah = currentTimeMillis;
            this.A = true;
        }
        p();
    }

    public void a(SharedPreferences.Editor editor) {
        if (PatchProxy.isSupport(new Object[]{editor}, this, f2496a, false, 18312, new Class[]{SharedPreferences.Editor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editor}, this, f2496a, false, 18312, new Class[]{SharedPreferences.Editor.class}, Void.TYPE);
            return;
        }
        editor.putString("share_templates", this.r);
        editor.putInt("live_push_system_max_show_count", this.as);
        editor.putInt("live_push_nonsystem_max_show_count", this.at);
        editor.putInt("has_local_cache", 1);
    }

    public final boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2496a, false, 18318, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f2496a, false, 18318, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null || e.a(str)) {
            return false;
        } else {
            for (String startsWith : this.i) {
                if (str2.startsWith(startsWith)) {
                    return true;
                }
            }
            return false;
        }
    }

    public String a(Context context, WebView webView) {
        if (PatchProxy.isSupport(new Object[]{context, webView}, this, f2496a, false, 18320, new Class[]{Context.class, WebView.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, webView}, this, f2496a, false, 18320, new Class[]{Context.class, WebView.class}, String.class);
        }
        String a2 = e.a(context, webView);
        if (a2 == null) {
            a2 = "";
        }
        if (!StringUtils.isEmpty(a2)) {
            a2 = a2 + " JsSdk/2";
        }
        return a2;
    }

    public boolean a(JSONObject jSONObject) {
        boolean z2;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f2496a, false, 18339, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f2496a, false, 18339, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        System.currentTimeMillis();
        String b2 = b(jSONObject2, "share_templates");
        if (b2 == null) {
            b2 = "";
        }
        if (!b2.equals(this.r)) {
            this.r = b2;
            z2 = true;
        } else {
            z2 = false;
        }
        int a2 = a(jSONObject2, "live_push_system_max_show_count");
        if (a2 >= 0 && a2 != this.as) {
            this.as = a2;
            z2 = true;
        }
        int a3 = a(jSONObject2, "live_push_nonsystem_max_show_count");
        if (a3 >= 0 && a3 != this.at) {
            this.at = a3;
            z2 = true;
        }
        if (this.ac != null) {
            z2 |= this.ac.a();
        }
        i.a((Callable<TResult>) new g<TResult>(jSONObject2));
        String b3 = b(jSONObject2, "js_actlog_url");
        if (!TextUtils.equals(b3, this.ak)) {
            this.ak = b3;
            z2 = true;
        }
        boolean tryUpdateAppSetting = z2 | com.ss.android.di.push.a.a().tryUpdateAppSetting(this.u, jSONObject2, am);
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, com.ss.android.ugc.aweme.ae.b.f33211a, true, 70327, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, com.ss.android.ugc.aweme.ae.b.f33211a, true, 70327, new Class[]{JSONObject.class}, Void.TYPE);
        } else {
            String str = null;
            if (jSONObject2 != null) {
                str = jSONObject2.optString("aweme_push_monitor_config", null);
            }
            if (str != null) {
                d a4 = d.a((Context) com.ss.android.ugc.aweme.framework.e.a.a());
                Intrinsics.checkExpressionValueIsNotNull(a4, "MonitorLiveSetting.getIn…nce(AppProvider.getApp())");
                a4.a(str);
            }
        }
        return tryUpdateAppSetting;
    }

    public final void a(View view, Resources resources, boolean z2, Activity activity) {
        View view2 = view;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{view2, resources, Byte.valueOf(z2 ? (byte) 1 : 0), activity2}, this, f2496a, false, 18343, new Class[]{View.class, Resources.class, Boolean.TYPE, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, resources, Byte.valueOf(z2), activity2}, this, f2496a, false, 18343, new Class[]{View.class, Resources.class, Boolean.TYPE, Activity.class}, Void.TYPE);
            return;
        }
        View findViewById = activity2.findViewById(C0906R.id.mw);
        int i2 = z2 ? 2130838349 : 2130838348;
        int i3 = z2 ? 2130838347 : 2130838346;
        UIUtils.setViewBackgroundWithPadding(view2, i2);
        UIUtils.setViewBackgroundWithPadding(findViewById, i3);
    }

    public void a(int i2, boolean z2, int i3, @Nullable User user) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i3), user}, this, f2496a, false, 18344, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Integer.valueOf(i3), user}, this, f2496a, false, 18344, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE);
            return;
        }
        boolean z3 = z2;
        a(z2, -1, this.u);
    }

    public void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f2496a, false, 18347, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f2496a, false, 18347, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.P.sendEmptyMessage(103);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.newmedia.BaseAppData.a r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0041 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x0041 }
            com.meituan.robust.ChangeQuickRedirect r3 = f2496a     // Catch:{ all -> 0x0041 }
            r4 = 0
            r5 = 18356(0x47b4, float:2.5722E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0041 }
            java.lang.Class<com.ss.android.newmedia.BaseAppData$a> r2 = com.ss.android.newmedia.BaseAppData.a.class
            r6[r9] = r2     // Catch:{ all -> 0x0041 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0041 }
            r1[r9] = r11     // Catch:{ all -> 0x0041 }
            com.meituan.robust.ChangeQuickRedirect r3 = f2496a     // Catch:{ all -> 0x0041 }
            r4 = 0
            r5 = 18356(0x47b4, float:2.5722E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0041 }
            java.lang.Class<com.ss.android.newmedia.BaseAppData$a> r0 = com.ss.android.newmedia.BaseAppData.a.class
            r6[r9] = r0     // Catch:{ all -> 0x0041 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
            monitor-exit(r10)
            return
        L_0x0032:
            java.util.List<com.ss.android.newmedia.BaseAppData$a> r1 = r10.av     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.contains(r11)     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x003f
            java.util.List<com.ss.android.newmedia.BaseAppData$a> r1 = r10.av     // Catch:{ all -> 0x0041 }
            r1.add(r11)     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r10)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.BaseAppData.a(com.ss.android.newmedia.BaseAppData$a):void");
    }

    private void a(boolean z2, int i2, Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), -1, context2}, this, f2496a, false, 18363, new Class[]{Boolean.TYPE, Integer.TYPE, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), -1, context2}, this, f2496a, false, 18363, new Class[]{Boolean.TYPE, Integer.TYPE, Context.class}, Void.TYPE);
            return;
        }
        for (a onAccountRefresh : this.av) {
            onAccountRefresh.onAccountRefresh(z2, -1, context2);
        }
    }

    public final boolean m() {
        synchronized (this.ad) {
            if (this.ae > 0) {
                return true;
            }
            return false;
        }
    }

    public final int n() {
        if (this.ai == 1 || this.ai == 0 || this.ai == 2) {
            return this.ai;
        }
        return 2;
    }

    public static BaseAppData a() {
        if (PatchProxy.isSupport(new Object[0], null, f2496a, true, 18303, new Class[0], BaseAppData.class)) {
            return (BaseAppData) PatchProxy.accessDispatch(new Object[0], null, f2496a, true, 18303, new Class[0], BaseAppData.class);
        }
        if (f2497d != null) {
            return f2497d;
        }
        throw new IllegalStateException("BaseAppData not init");
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18353, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18353, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != 0) {
            NetworkUtils.setDefaultUserAgent(r());
        }
    }

    private String r() {
        if (!PatchProxy.isSupport(new Object[0], this, f2496a, false, 18354, new Class[0], String.class)) {
            return System.getProperty("http.agent");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18354, new Class[0], String.class);
    }

    public final AppContext c() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18323, new Class[0], AppContext.class)) {
            return (AppContext) PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18323, new Class[0], AppContext.class);
        } else if (this.s != null) {
            return this.s;
        } else {
            throw new IllegalStateException("appContxt not init");
        }
    }

    public final Activity f() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18327, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18327, new Class[0], Activity.class);
        } else if (this.Q != null) {
            return (Activity) this.Q.get();
        } else {
            return null;
        }
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18333, new Class[0], Void.TYPE);
            return;
        }
        this.P.sendEmptyMessage(102);
    }

    public final boolean k() {
        if (!PatchProxy.isSupport(new Object[0], this, f2496a, false, 18340, new Class[0], Boolean.TYPE)) {
            return e(this.u).getBoolean("live_plugin_enable", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18340, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18309, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18309, new Class[0], Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(this.aj)) {
            try {
                JSONArray jSONArray = new JSONArray(this.aj);
                if (jSONArray.length() > 0) {
                    this.Y.clear();
                    a(jSONArray, this.Y);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18324, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18324, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(NotifyType.VIBRATE);
        String version = this.s.getVersion();
        if (version == null) {
            version = "1.0";
        }
        sb.append(version);
        sb.append(" Build ");
        sb.append(this.s.getChannel());
        sb.append("_");
        sb.append(e.a(this.u).a("release_build", ""));
        return sb.toString();
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18326, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18326, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = 1;
        if (this.t == -1 || this.t == 0 || this.t == 1) {
            if (this.s != null) {
                i2 = this.s.getVersionCode();
            }
            this.t = i2;
        }
        return this.t;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2496a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 18342(0x47a6, float:2.5703E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2496a
            r5 = 0
            r6 = 18342(0x47a6, float:2.5703E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            com.ss.android.common.AppContext r1 = r9.s
            java.lang.String r1 = r1.getChannel()
            java.lang.String[] r2 = com.ss.android.newmedia.a.J
            int r3 = r2.length
            r4 = 0
        L_0x0034:
            if (r4 >= r3) goto L_0x0042
            r5 = r2[r4]
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x003f
            return r0
        L_0x003f:
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0042:
            boolean r1 = ao
            if (r1 == 0) goto L_0x0047
            return r0
        L_0x0047:
            java.lang.String r1 = "miui.os.Build"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0050 }
            if (r1 == 0) goto L_0x0050
            return r0
        L_0x0050:
            java.lang.String r1 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = "Flyme"
            int r1 = r1.indexOf(r2)     // Catch:{ Exception -> 0x0065 }
            if (r1 >= 0) goto L_0x0064
            java.lang.String r1 = android.os.Build.USER     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = "flyme"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0065 }
            if (r1 == 0) goto L_0x0065
        L_0x0064:
            return r0
        L_0x0065:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.BaseAppData.l():boolean");
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18328, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.V;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f30182a, false, 18229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f30182a, false, 18229, new Class[0], Void.TYPE);
            return;
        }
        cVar.h = 0;
        cVar.i.clear();
        cVar.f30185d.g = true;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f2496a, false, 18330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2496a, false, 18330, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c().getContext() != null && !this.H) {
            this.F = com.ss.android.ugc.aweme.aj.b.b().d(this.u, "last_fetch_setting_time");
            if (currentTimeMillis - this.F <= 21600000 || !NetworkUtils.isNetworkAvailable(c().getContext())) {
                bg.b(new c());
            } else if (currentTimeMillis - this.G > 120000) {
                this.G = currentTimeMillis;
                com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.requesttask.a.c(this.P, this.E)).a();
            } else {
                bg.b(new c());
            }
        }
    }

    public final void a(boolean z2) {
        this.K = true;
        this.A = true;
    }

    public final SharedPreferences e(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f2496a, false, 18310, new Class[]{Context.class}, SharedPreferences.class)) {
            return com.ss.android.ugc.aweme.q.c.a(context2, "app_setting", 0);
        }
        return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context2}, this, f2496a, false, 18310, new Class[]{Context.class}, SharedPreferences.class);
    }

    public static synchronized boolean g(Context context) {
        Context context2 = context;
        synchronized (BaseAppData.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f2496a, true, 18314, new Class[]{Context.class}, Boolean.TYPE)) {
                boolean booleanValue = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f2496a, true, 18314, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                return booleanValue;
            }
            boolean confirmPush = com.ss.android.di.push.a.a().getConfirmPush(context2);
            return confirmPush;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean h(android.content.Context r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.newmedia.BaseAppData> r1 = com.ss.android.newmedia.BaseAppData.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0065 }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x0065 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f2496a     // Catch:{ all -> 0x0065 }
            r6 = 1
            r7 = 18315(0x478b, float:2.5665E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0065 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r10] = r9     // Catch:{ all -> 0x0065 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0065 }
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0065 }
            if (r3 == 0) goto L_0x003f
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x0065 }
            r11[r10] = r0     // Catch:{ all -> 0x0065 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f2496a     // Catch:{ all -> 0x0065 }
            r14 = 1
            r15 = 18315(0x478b, float:2.5665E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0065 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r10] = r2     // Catch:{ all -> 0x0065 }
            java.lang.Class r17 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0065 }
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0065 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0065 }
            monitor-exit(r1)
            return r0
        L_0x003f:
            int r3 = al     // Catch:{ Exception -> 0x0063 }
            r4 = -1
            if (r3 != r4) goto L_0x005b
            boolean r3 = ap     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0059
            java.lang.String r3 = "app_setting"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r3, r10)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r3 = "select_checkbox"
            boolean r4 = ar     // Catch:{ Exception -> 0x0063 }
            int r0 = r0.getInt(r3, r4)     // Catch:{ Exception -> 0x0063 }
            al = r0     // Catch:{ Exception -> 0x0063 }
            goto L_0x005b
        L_0x0059:
            al = r2     // Catch:{ Exception -> 0x0063 }
        L_0x005b:
            int r0 = al     // Catch:{ Exception -> 0x0063 }
            if (r0 <= 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            monitor-exit(r1)
            return r2
        L_0x0063:
            monitor-exit(r1)
            return r2
        L_0x0065:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.BaseAppData.h(android.content.Context):boolean");
    }

    public final void c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f2496a, false, 18306, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f2496a, false, 18306, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        AppConfig.getInstance(context).tryRefreshConfig(context2 instanceof Activity);
        com.ss.android.image.b.f29223a = this.v;
    }

    public void onActivityResumed(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f2496a, false, 18329, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f2496a, false, 18329, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.Q = new WeakReference<>(activity);
        this.T = currentTimeMillis;
        if (currentTimeMillis - this.U > 180000) {
            this.S = 0;
        }
        Logger.debug();
        com.ss.android.ugc.aweme.lego.a.i.a().a(new ResumeTask(this.V, this)).a();
        a(activity);
    }

    private void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f2496a, false, 18360, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f2496a, false, 18360, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        for (a onActivityResumed : this.av) {
            onActivityResumed.onActivityResumed(activity2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean i(android.content.Context r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.newmedia.BaseAppData> r1 = com.ss.android.newmedia.BaseAppData.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x007f }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f2496a     // Catch:{ all -> 0x007f }
            r6 = 1
            r7 = 18350(0x47ae, float:2.5714E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x007f }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r10] = r9     // Catch:{ all -> 0x007f }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007f }
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x003f
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            r11[r10] = r0     // Catch:{ all -> 0x007f }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f2496a     // Catch:{ all -> 0x007f }
            r14 = 1
            r15 = 18350(0x47ae, float:2.5714E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x007f }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r10] = r2     // Catch:{ all -> 0x007f }
            java.lang.Class r17 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007f }
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x007f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x007f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007f }
            monitor-exit(r1)
            return r0
        L_0x003f:
            int r3 = am     // Catch:{ Exception -> 0x007d }
            r4 = -1
            if (r3 != r4) goto L_0x0075
            boolean r3 = an     // Catch:{ Exception -> 0x007d }
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = "app_setting"
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r0, r3, r10)     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = "allow_network"
            int r3 = r3.getInt(r4, r10)     // Catch:{ Exception -> 0x007d }
            am = r3     // Catch:{ Exception -> 0x007d }
            com.ss.android.ugc.awemepushapi.IPushApi r3 = com.ss.android.di.push.a.a()     // Catch:{ Exception -> 0x007d }
            int r4 = am     // Catch:{ Exception -> 0x007d }
            if (r4 <= 0) goto L_0x0060
            r4 = 1
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            r3.notifyAllowNetwork(r0, r4)     // Catch:{ Exception -> 0x007d }
            goto L_0x0075
        L_0x0065:
            am = r2     // Catch:{ Exception -> 0x007d }
            com.ss.android.ugc.awemepushapi.IPushApi r3 = com.ss.android.di.push.a.a()     // Catch:{ Exception -> 0x007d }
            int r4 = am     // Catch:{ Exception -> 0x007d }
            if (r4 <= 0) goto L_0x0071
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r3.notifyAllowNetwork(r0, r4)     // Catch:{ Exception -> 0x007d }
        L_0x0075:
            int r0 = am     // Catch:{ Exception -> 0x007d }
            if (r0 <= 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            monitor-exit(r1)
            return r2
        L_0x007d:
            monitor-exit(r1)
            return r2
        L_0x007f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.BaseAppData.i(android.content.Context):boolean");
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2496a, false, 18322, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2496a, false, 18322, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.B = str;
        SharedPreferences.Editor edit = e(this.u).edit();
        edit.putString("contact_info", this.B);
        SharedPrefsEditorCompat.apply(edit);
    }

    public void d(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f2496a, false, 18307, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f2496a, false, 18307, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a(com.ss.android.ugc.aweme.q.c.a(context, "app_setting", 0));
        q();
        if (PatchProxy.isSupport(new Object[]{context}, this, f2496a, false, 18362, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f2496a, false, 18362, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        for (a onLoadData : this.av) {
            onLoadData.onLoadData(context);
        }
    }

    public final void f(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f2496a, false, 18311, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f2496a, false, 18311, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.A = false;
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "app_setting", 0).edit();
        a(edit);
        SharedPrefsEditorCompat.apply(edit);
        if (PatchProxy.isSupport(new Object[]{context}, this, f2496a, false, 18361, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f2496a, false, 18361, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        for (a onSaveData : this.av) {
            onSaveData.onSaveData(context);
        }
    }

    @MeasureFunction
    public final void b(Context context) {
        boolean z2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f2496a, false, 18304, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f2496a, false, 18304, new Class[]{Context.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a() || i(context)) {
            if (PatchProxy.isSupport(new Object[]{context2}, this, f2496a, false, 18351, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, this, f2496a, false, 18351, new Class[]{Context.class}, Void.TYPE);
            } else {
                com.ss.android.common.applog.g a2 = com.ss.android.common.applog.g.a(context);
                if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.common.applog.g.f28152a, false, 15488, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.common.applog.g.f28152a, false, 15488, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!StringUtils.isEmpty(a2.f28154c)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    com.ss.android.common.applog.g.a(context).e();
                    com.ss.android.common.applog.g.a(context).a(a().c());
                }
            }
            if (this.y.compareAndSet(false, true)) {
                if (!(context2 instanceof Activity) || !com.ss.android.g.a.a()) {
                    d(context);
                    c(context);
                } else {
                    com.ss.android.ugc.aweme.lego.a.i.a().a(new InitTask(this.ac, this)).a();
                }
            }
            if (PatchProxy.isSupport(new Object[]{context2}, this, f2496a, false, 18305, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, this, f2496a, false, 18305, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            if (context2 instanceof Activity) {
                AppLog.onActivityCreate(context);
            }
        }
    }

    public final boolean d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2496a, false, 18331, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f2496a, false, 18331, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.Y == null || this.Y.isEmpty() || StringUtils.isEmpty(str) || !e.a(str)) {
            return true;
        } else {
            try {
                if (o.a(o.a(str), str)) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f2496a, false, 18332, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f2496a, false, 18332, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Activity activity3 = null;
        if (this.Q != null) {
            activity3 = (Activity) this.Q.get();
        }
        long j2 = 5;
        if (activity3 != null && activity3 == activity2) {
            j2 = (currentTimeMillis - this.T) / 1000;
            if (j2 <= 0) {
                j2 = 2;
            }
        }
        this.R += j2;
        this.S += j2;
        this.U = currentTimeMillis;
        if (this.Q != null) {
            this.Q.clear();
        }
        c cVar = this.V;
        if (PatchProxy.isSupport(new Object[]{activity2}, cVar, c.f30182a, false, 18228, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, cVar, c.f30182a, false, 18228, new Class[]{Activity.class}, Void.TYPE);
        } else {
            cVar.f30184c.removeCallbacks(cVar.j);
            if (cVar.f30187f != null) {
                cVar.f30187f.c();
            }
            com.ss.android.image.g c2 = cVar.c();
            if (c2 != null) {
                c2.b();
            }
        }
        if (this.A) {
            f(activity);
            this.A = false;
        }
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f2496a, false, 18359, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f2496a, false, 18359, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        for (a onActivityPaused : this.av) {
            onActivityPaused.onActivityPaused(activity2);
        }
    }

    private void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f2496a, false, 18358, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f2496a, false, 18358, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        for (a handleMsg : this.av) {
            handleMsg.handleMsg(message2);
        }
    }

    public final boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2496a, false, 18319, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f2496a, false, 18319, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return true;
        } else {
            if (this.j.isEmpty()) {
                return false;
            }
            for (String indexOf : this.j) {
                if (str.indexOf(indexOf) >= 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public void handleMsg(Message message) {
        Activity activity;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{message}, this, f2496a, false, 18334, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f2496a, false, 18334, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message.what) {
            case BaseLoginOrRegisterActivity.o /*101*/:
                if (message.arg1 == 0) {
                    this.z = System.currentTimeMillis();
                    break;
                }
                break;
            case 102:
                if (this.Q != null) {
                    activity = (Activity) this.Q.get();
                } else {
                    activity = null;
                }
                if (activity == null && System.currentTimeMillis() - this.U >= 20000) {
                    z3 = false;
                }
                if (z3) {
                    k.a().b();
                }
                if (!StringUtils.isEmpty(AppLog.getClientId()) && !StringUtils.isEmpty(AppLog.getServerDeviceId())) {
                    AsyncTaskUtils.executeAsyncTask(new AsyncTask<Void, Void, Void>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f30087a;

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void doInBackground(Void... voidArr) {
                            if (PatchProxy.isSupport(new Object[]{voidArr}, this, f30087a, false, 18365, new Class[]{Void[].class}, Void.class)) {
                                return (Void) PatchProxy.accessDispatch(new Object[]{voidArr}, this, f30087a, false, 18365, new Class[]{Void[].class}, Void.class);
                            }
                            HashMap hashMap = new HashMap();
                            AppLog.getSSIDs(hashMap);
                            Context context = BaseAppData.this.u;
                            if (PatchProxy.isSupport(new Object[]{context, hashMap}, null, com.ss.android.common.util.e.f2451a, true, 15947, new Class[]{Context.class, Map.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context, hashMap}, null, com.ss.android.common.util.e.f2451a, true, 15947, new Class[]{Context.class, Map.class}, Void.TYPE);
                            } else if (context != null) {
                                Logger.debug();
                                try {
                                    com.ss.android.common.util.e.a(context, 1, StringUtils.mapToString(hashMap));
                                } catch (Exception unused) {
                                }
                            }
                            return null;
                        }
                    }, new Void[0]);
                    break;
                }
            case 106:
                this.J = false;
                if (message.obj instanceof String) {
                    this.aj = (String) message.obj;
                    p();
                    break;
                }
                break;
            case 107:
                this.J = false;
                break;
            case 10005:
                long currentTimeMillis = System.currentTimeMillis();
                if (!PatchProxy.isSupport(new Object[]{new Long(currentTimeMillis)}, this, f2496a, false, 18325, new Class[]{Long.TYPE}, Void.TYPE)) {
                    SharedPreferences.Editor edit = e(this.u).edit();
                    edit.putLong("last_send_user_settings_time", currentTimeMillis);
                    SharedPrefsEditorCompat.apply(edit);
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[]{new Long(currentTimeMillis)}, this, f2496a, false, 18325, new Class[]{Long.TYPE}, Void.TYPE);
                    break;
                }
            case 10008:
                this.H = false;
                if (message.obj instanceof GetSettingThread.a) {
                    GetSettingThread.a aVar = (GetSettingThread.a) message.obj;
                    if (!PatchProxy.isSupport(new Object[]{aVar}, this, f2496a, false, 18335, new Class[]{GetSettingThread.a.class}, Void.TYPE)) {
                        this.F = System.currentTimeMillis();
                        com.ss.android.ugc.aweme.aj.b.b().a(this.u, "last_fetch_setting_time", this.F);
                        if (!aVar.f30363a || this.E) {
                            z2 = false;
                        } else {
                            this.E = true;
                            z2 = true;
                            z4 = true;
                        }
                        if (aVar.f30364b != null && a(aVar.f30364b, z4)) {
                            z2 = true;
                        }
                        if (aVar.f30365c != null && a(aVar.f30365c)) {
                            z2 = true;
                        }
                        if (z2) {
                            f(this.u);
                        }
                        q();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f2496a, false, 18335, new Class[]{GetSettingThread.a.class}, Void.TYPE);
                        break;
                    }
                }
                break;
            case 10009:
                this.H = false;
                this.G = 0;
                this.F = 0;
                com.ss.android.ugc.aweme.aj.b.b().a(this.u, "last_fetch_setting_time", this.F);
                break;
            case 10010:
                if (message.obj instanceof j.a) {
                    int i2 = message.arg1;
                    j.a aVar2 = (j.a) message.obj;
                    Logger.debug();
                    if (i2 == 1) {
                        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2496a, false, 18345, new Class[]{j.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2496a, false, 18345, new Class[]{j.a.class}, Void.TYPE);
                        } else {
                            this.N.a(aVar2);
                        }
                        f(this.u);
                        break;
                    }
                } else {
                    return;
                }
                break;
        }
        a(message);
    }

    public static void a(BaseAppData baseAppData) {
        if (PatchProxy.isSupport(new Object[]{baseAppData}, null, f2496a, true, 18302, new Class[]{BaseAppData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseAppData}, null, f2496a, true, 18302, new Class[]{BaseAppData.class}, Void.TYPE);
        } else if (baseAppData == null) {
            throw new IllegalArgumentException("BaseAppData can not be null");
        } else if (f2497d == null) {
            f2497d = baseAppData;
            if (Logger.debug()) {
                Logger.debug();
            }
        }
    }

    private int a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{jSONObject2, str2}, this, f2496a, false, 18336, new Class[]{JSONObject.class, String.class}, Integer.TYPE)) {
            return jSONObject2.optInt(str2, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{jSONObject2, str2}, this, f2496a, false, 18336, new Class[]{JSONObject.class, String.class}, Integer.TYPE)).intValue();
    }

    private String b(JSONObject jSONObject, String str) {
        if (!PatchProxy.isSupport(new Object[]{jSONObject, str}, this, f2496a, false, 18337, new Class[]{JSONObject.class, String.class}, String.class)) {
            return jSONObject.optString(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{jSONObject, str}, this, f2496a, false, 18337, new Class[]{JSONObject.class, String.class}, String.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void b(android.content.Context r20, boolean r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<com.ss.android.newmedia.BaseAppData> r2 = com.ss.android.newmedia.BaseAppData.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x007a }
            java.lang.Byte r5 = java.lang.Byte.valueOf(r21)     // Catch:{ all -> 0x007a }
            r12 = 1
            r4[r12] = r5     // Catch:{ all -> 0x007a }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f2496a     // Catch:{ all -> 0x007a }
            r7 = 1
            r8 = 18352(0x47b0, float:2.5717E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x007a }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r11] = r10     // Catch:{ all -> 0x007a }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007a }
            r9[r12] = r10     // Catch:{ all -> 0x007a }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x007a }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0050
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            r13[r11] = r0     // Catch:{ all -> 0x007a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r21)     // Catch:{ all -> 0x007a }
            r13[r12] = r0     // Catch:{ all -> 0x007a }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f2496a     // Catch:{ all -> 0x007a }
            r16 = 1
            r17 = 18352(0x47b0, float:2.5717E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x007a }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1     // Catch:{ all -> 0x007a }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007a }
            r0[r12] = r1     // Catch:{ all -> 0x007a }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x007a }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x007a }
            monitor-exit(r2)
            return
        L_0x0050:
            int r3 = am     // Catch:{ Exception -> 0x0078 }
            if (r3 == r1) goto L_0x0076
            am = r1     // Catch:{ Exception -> 0x0078 }
            java.lang.String r1 = "app_setting"
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r0, r1, r11)     // Catch:{ Exception -> 0x0078 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r3 = "allow_network"
            int r4 = am     // Catch:{ Exception -> 0x0078 }
            r1.putInt(r3, r4)     // Catch:{ Exception -> 0x0078 }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r1)     // Catch:{ Exception -> 0x0078 }
            com.ss.android.ugc.awemepushapi.IPushApi r1 = com.ss.android.di.push.a.a()     // Catch:{ Exception -> 0x0078 }
            int r3 = am     // Catch:{ Exception -> 0x0078 }
            if (r3 <= 0) goto L_0x0073
            r11 = 1
        L_0x0073:
            r1.notifyAllowNetwork(r0, r11)     // Catch:{ Exception -> 0x0078 }
        L_0x0076:
            monitor-exit(r2)
            return
        L_0x0078:
            monitor-exit(r2)
            return
        L_0x007a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.BaseAppData.b(android.content.Context, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r20, boolean r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<com.ss.android.newmedia.BaseAppData> r2 = com.ss.android.newmedia.BaseAppData.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x006e }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x006e }
            java.lang.Byte r5 = java.lang.Byte.valueOf(r21)     // Catch:{ all -> 0x006e }
            r12 = 1
            r4[r12] = r5     // Catch:{ all -> 0x006e }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f2496a     // Catch:{ all -> 0x006e }
            r7 = 1
            r8 = 18316(0x478c, float:2.5666E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x006e }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r11] = r10     // Catch:{ all -> 0x006e }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006e }
            r9[r12] = r10     // Catch:{ all -> 0x006e }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0050
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x006e }
            r13[r11] = r0     // Catch:{ all -> 0x006e }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r21)     // Catch:{ all -> 0x006e }
            r13[r12] = r0     // Catch:{ all -> 0x006e }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f2496a     // Catch:{ all -> 0x006e }
            r16 = 1
            r17 = 18316(0x478c, float:2.5666E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x006e }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1     // Catch:{ all -> 0x006e }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006e }
            r0[r12] = r1     // Catch:{ all -> 0x006e }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x006e }
            monitor-exit(r2)
            return
        L_0x0050:
            int r3 = al     // Catch:{ Exception -> 0x006c }
            if (r3 == r1) goto L_0x006a
            al = r1     // Catch:{ Exception -> 0x006c }
            java.lang.String r1 = "app_setting"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r1, r11)     // Catch:{ Exception -> 0x006c }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x006c }
            java.lang.String r1 = "select_checkbox"
            int r3 = al     // Catch:{ Exception -> 0x006c }
            r0.putInt(r1, r3)     // Catch:{ Exception -> 0x006c }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r0)     // Catch:{ Exception -> 0x006c }
        L_0x006a:
            monitor-exit(r2)
            return
        L_0x006c:
            monitor-exit(r2)
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.BaseAppData.a(android.content.Context, boolean):void");
    }

    private void a(JSONArray jSONArray, List<String> list) {
        JSONArray jSONArray2 = jSONArray;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{jSONArray2, list2}, this, f2496a, false, 18338, new Class[]{JSONArray.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray2, list2}, this, f2496a, false, 18338, new Class[]{JSONArray.class, List.class}, Void.TYPE);
            return;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String optString = jSONArray2.optString(i2);
            if (optString != null && optString.length() > 0) {
                list2.add(optString);
            }
        }
    }

    public BaseAppData(AppContext appContext, String str, String str2) {
        int i2;
        this.s = appContext;
        if (this.s != null) {
            i2 = this.s.getVersionCode();
        } else {
            i2 = 1;
        }
        this.t = i2;
        this.u = appContext.getContext();
        this.v = str;
        this.O = str2;
        this.V = new c(this.u, this);
        this.ab = new com.ss.android.newmedia.logsdk.b();
        com.ss.android.newmedia.logsdk.b bVar = this.ab;
        if (PatchProxy.isSupport(new Object[]{this}, bVar, com.ss.android.newmedia.logsdk.b.f2516a, false, 18649, new Class[]{b.a.class}, Void.TYPE)) {
            com.ss.android.newmedia.logsdk.b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{this}, bVar2, com.ss.android.newmedia.logsdk.b.f2516a, false, 18649, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        bVar.f2518c.add(this);
    }
}
