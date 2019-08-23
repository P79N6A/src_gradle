package com.ss.android.ugc.awemepushlib.manager;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.f;
import com.ss.android.pushmanager.app.b;
import com.ss.android.pushmanager.client.MessageAppManager;
import com.ss.android.pushmanager.client.e;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.awemepushlib.interaction.j;
import com.ss.android.ugc.awemepushlib.interaction.k;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private static volatile a D;
    private static int E = 0;
    private static boolean F = false;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77064a;
    @SuppressLint({"SimpleDateFormat"})
    static final SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    private int A;
    private int B = -1;
    private boolean C;

    /* renamed from: b  reason: collision with root package name */
    public String f77065b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f77066c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f77067d;

    /* renamed from: e  reason: collision with root package name */
    public String f77068e;

    /* renamed from: f  reason: collision with root package name */
    public long f77069f;
    public long g;
    public long h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    protected boolean q;
    public boolean r;
    protected b t;
    final SharedPreferences u;
    public int v;
    public int w;
    public int x;
    protected boolean y;
    public int z;

    public final boolean a(Context context, JSONObject jSONObject, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, jSONObject2, Integer.valueOf(i2)}, this, f77064a, false, 90292, new Class[]{Context.class, JSONObject.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, jSONObject2, Integer.valueOf(i2)}, this, f77064a, false, 90292, new Class[]{Context.class, JSONObject.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject2 == null) {
            return false;
        } else {
            int optInt = jSONObject2.optInt("allow_settings_notify_enable", a().f77066c ? 1 : 0);
            if (optInt == a().x || optInt < 0) {
                z2 = false;
            } else {
                a().x = a().x;
                boolean e2 = a().e(context2);
                a().f(context2);
                e a2 = e.a();
                if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(e2 ? (byte) 1 : 0)}, a2, e.f30552a, false, 19086, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(e2)}, a2, e.f30552a, false, 19086, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    boolean p2 = com.ss.android.pushmanager.setting.b.a().p();
                    com.ss.android.pushmanager.setting.b a3 = com.ss.android.pushmanager.setting.b.a();
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(e2)}, a3, com.ss.android.pushmanager.setting.b.f2543a, false, 19228, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(e2)}, a3, com.ss.android.pushmanager.setting.b.f2543a, false, 19228, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        a3.f2546c.a().a("allow_settings_notify_enable", e2).a();
                    }
                    if (!p2 && e2) {
                        MessageAppManager.inst().registerAllThirdPush(context2);
                        MessageAppManager.inst().registerSelfPush(context2);
                    }
                }
                if (e2 && a().a(context2)) {
                    e.a().a(context2, i2 > 0);
                    Map<String, String> a4 = k.a();
                    if (!com.ss.android.ugc.awemepushlib.c.a.a((Map) a4)) {
                        com.ss.android.ugc.awemepushlib.c.a.a((Runnable) new b(context2, a4));
                    }
                }
                e.a().b(context2, a().a(context2));
                z2 = true;
            }
            int optInt2 = jSONObject2.optInt("shut_push_on_stop_service", a().g() == 1 ? 1 : 0);
            if (optInt2 != a().z && optInt2 >= 0) {
                a().z = optInt2;
                z2 = true;
            }
            if (c.a()) {
                int optInt3 = jSONObject2.optInt("push_clear_switch", 1);
                if (optInt3 != a().w && optInt3 >= 0) {
                    a().a(optInt3);
                    z2 = true;
                }
            }
            int optInt4 = jSONObject2.optInt("allow_off_alive", 0);
            if (optInt4 >= 0) {
                com.ss.android.pushmanager.setting.b.a().a(optInt4 > 0);
                z2 = true;
            }
            String optString = jSONObject2.optString("uninstall_question_url", j.a().getDefaultUninstallQuestionUrl());
            if (optString != null && !optString.equals(a().c())) {
                a().f77065b = optString;
                z2 = true;
            }
            com.ss.android.newmedia.message.localpush.b a5 = com.ss.android.newmedia.message.localpush.b.a(context);
            if (PatchProxy.isSupport(new Object[]{jSONObject2}, a5, com.ss.android.newmedia.message.localpush.b.f30242a, false, 18713, new Class[]{JSONObject.class}, Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, a5, com.ss.android.newmedia.message.localpush.b.f30242a, false, 18713, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
            } else if (a5.f30243b) {
                int optInt5 = jSONObject2.optInt("ies_main_local_push_enable", 1);
                if (optInt5 < 0 || optInt5 == a5.f30246e) {
                    z3 = false;
                } else {
                    a5.f30246e = optInt5;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("ies_main_local_push_enable", Boolean.valueOf(a5.f30246e > 0));
                    if (a5.f30244c != null) {
                        a5.f30244c.a(a5.f30245d, linkedHashMap);
                    }
                    z3 = true;
                }
                long optLong = jSONObject2.optLong("local_push_get_interval");
                if (optLong > -1 && optLong != a5.f30247f) {
                    a5.f30247f = optLong;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("local_push_get_interval", Long.valueOf(a5.f30247f));
                    if (a5.f30244c != null) {
                        a5.f30244c.a(a5.f30245d, linkedHashMap2);
                    }
                    z3 = true;
                }
            } else {
                throw new IllegalStateException("LocalPushClick#init MUST be called first");
            }
            boolean z6 = z2 | z3;
            AwemeRedBadgerManager a6 = AwemeRedBadgerManager.a();
            if (PatchProxy.isSupport(new Object[]{jSONObject2, context2}, a6, AwemeRedBadgerManager.f77048a, false, 90307, new Class[]{JSONObject.class, Context.class}, Boolean.TYPE)) {
                z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, context2}, a6, AwemeRedBadgerManager.f77048a, false, 90307, new Class[]{JSONObject.class, Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                boolean a7 = com.ss.android.newmedia.redbadge.b.a.a(context).a();
                String b2 = com.ss.android.newmedia.redbadge.b.a.a(context).b();
                boolean z7 = jSONObject2.optInt("is_desktop_red_badge_show", 0) > 0;
                if (z7 != a7) {
                    com.ss.android.newmedia.redbadge.b.a a8 = com.ss.android.newmedia.redbadge.b.a.a(context);
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z7 ? (byte) 1 : 0)}, a8, com.ss.android.newmedia.redbadge.b.a.f30323a, false, 18831, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z7)}, a8, com.ss.android.newmedia.redbadge.b.a.f30323a, false, 18831, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        a8.f30325b.a().a("is_desktop_red_badge_show", z7).a();
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
                String optString2 = jSONObject2.optString("desktop_red_badge_args", "");
                if (optString2 != null && !optString2.equals(b2)) {
                    com.ss.android.newmedia.redbadge.b.a a9 = com.ss.android.newmedia.redbadge.b.a.a(context);
                    if (PatchProxy.isSupport(new Object[]{optString2}, a9, com.ss.android.newmedia.redbadge.b.a.f30323a, false, 18833, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{optString2}, a9, com.ss.android.newmedia.redbadge.b.a.f30323a, false, 18833, new Class[]{String.class}, Void.TYPE);
                    } else {
                        a9.f30325b.a().a("desktop_red_badge_args", optString2).a();
                    }
                    z4 = true;
                }
                if (!com.ss.android.newmedia.redbadge.b.a.a(context).a()) {
                    f.a().a(context2);
                }
            }
            boolean z8 = z6 | z4;
            com.ss.android.push.window.oppo.c a10 = com.ss.android.push.window.oppo.c.a(context);
            String optString3 = jSONObject2.optString("tt_push_pop_window_rule", "");
            if (optString3 == null || optString3.equals(a10.g)) {
                z5 = false;
            } else {
                a10.g = optString3;
                z5 = true;
            }
            boolean a11 = z5 | z8 | a().a(jSONObject2);
            if (!c.a()) {
                String optString4 = jSONObject2.optString("aweme_push_config");
                if (!TextUtils.equals(optString4, a().f77068e) && !TextUtils.isEmpty(optString4)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(optString4);
                        a().g = (long) jSONObject3.optInt("show_float_window");
                        a().f77069f = (long) jSONObject3.optInt("float_window_show_time");
                        a().h = (long) jSONObject3.optInt("redbadge_use_last");
                        a().A = jSONObject3.optInt("turn_screen_on");
                        a().i = jSONObject3.optInt("key_play_sound_id");
                        a().v = jSONObject3.optInt("oppo_unify_style");
                        a().j = jSONObject3.getInt("oppo_push_style");
                        a().k = jSONObject3.optInt("wait_screen_on_duration");
                        a().a(jSONObject3.optInt("push_clear_switch"));
                        a().f77068e = optString4;
                        com.ss.android.pushmanager.setting.b a12 = com.ss.android.pushmanager.setting.b.a();
                        long optInt6 = (long) jSONObject3.optInt("date_change_delay_interval");
                        if (PatchProxy.isSupport(new Object[]{new Long(optInt6)}, a12, com.ss.android.pushmanager.setting.b.f2543a, false, 19186, new Class[]{Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(optInt6)}, a12, com.ss.android.pushmanager.setting.b.f2543a, false, 19186, new Class[]{Long.TYPE}, Void.TYPE);
                        } else {
                            a12.f2546c.a().a("date_change_delay_interval", optInt6).a();
                        }
                        a11 = true;
                    } catch (JSONException unused) {
                    }
                }
            }
            return a11;
        }
    }

    public final boolean f() {
        if (!this.q) {
            return true;
        }
        return false;
    }

    private int g() {
        if (this.f77066c) {
            return E;
        }
        return 1;
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f77064a, false, 90276, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f77064a, false, 90276, new Class[0], String.class);
        }
        if (this.f77065b == null) {
            this.f77065b = j.a().getDefaultUninstallQuestionUrl();
        }
        return this.f77065b;
    }

    public final int d() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f77064a, false, 90279, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f77064a, false, 90279, new Class[0], Integer.TYPE)).intValue();
        }
        if (h()) {
            i2 = this.u.getInt("notification_show_count_today", 0);
        }
        return i2;
    }

    public a() {
        int i2 = 1;
        this.f77066c = true;
        this.f77067d = true;
        this.f77068e = "";
        this.f77069f = 6000;
        this.k = 300000;
        this.q = true;
        this.r = true;
        this.t = new b(20);
        this.v = 1;
        this.w = 1;
        this.x = -1;
        this.y = true;
        this.z = g() != 1 ? 0 : i2;
        this.u = com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "app_setting", 0);
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f77064a, false, 90278, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f77064a, false, 90278, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String string = this.u.getString("notification_show_date", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            Date parse = s.parse(string);
            if (parse == null) {
                return false;
            }
            Date date = new Date();
            if (parse.getYear() == date.getYear() && parse.getMonth() == date.getMonth() && parse.getDate() == date.getDate()) {
                return true;
            }
            return false;
        } catch (ParseException unused) {
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f77064a, false, 90268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77064a, false, 90268, new Class[0], Void.TYPE);
            return;
        }
        this.l = this.u.getInt("live_push_system_max_show_count", 8);
        this.m = this.u.getInt("live_push_nonsystem_max_show_count", 6);
        this.q = this.u.getBoolean("close_active_push_alert", true);
        this.o = this.u.getInt("keep_notify_count", 0);
        this.n = this.u.getInt("max_notify_count", 0);
        this.p = this.u.getInt("notify_fresh_period", 0);
        this.r = this.u.getBoolean("forbid_show_notification", true);
        this.t.a(this.u.getString("notify_message_ids", ""));
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f77064a, false, 90281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77064a, false, 90281, new Class[0], Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.u.edit();
        edit.putInt("live_push_system_max_show_count", this.l);
        edit.putInt("live_push_nonsystem_max_show_count", this.m);
        edit.putBoolean("close_active_push_alert", this.q);
        edit.putInt("keep_notify_count", this.o);
        edit.putInt("max_notify_count", this.n);
        edit.putInt("notify_fresh_period", this.p);
        edit.putString("notify_message_ids", this.t.a());
        edit.putBoolean("forbid_show_notification", this.r);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f77064a, true, 90265, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f77064a, true, 90265, new Class[0], a.class);
        }
        if (D == null) {
            synchronized (a.class) {
                if (D == null) {
                    D = new a();
                }
            }
        }
        return D;
    }

    private a a(int i2) {
        this.w = i2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean g(android.content.Context r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005a }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x005a }
            com.meituan.robust.ChangeQuickRedirect r3 = f77064a     // Catch:{ all -> 0x005a }
            r4 = 0
            r5 = 90267(0x1609b, float:1.26491E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005a }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2     // Catch:{ all -> 0x005a }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005a }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x003b
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005a }
            r1[r9] = r11     // Catch:{ all -> 0x005a }
            com.meituan.robust.ChangeQuickRedirect r3 = f77064a     // Catch:{ all -> 0x005a }
            r4 = 0
            r5 = 90267(0x1609b, float:1.26491E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005a }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0     // Catch:{ all -> 0x005a }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005a }
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005a }
            monitor-exit(r10)
            return r0
        L_0x003b:
            int r1 = r10.x     // Catch:{ Exception -> 0x0058 }
            r2 = -1
            if (r1 != r2) goto L_0x0050
            java.lang.String r1 = "push_setting"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r11, r1, r9)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = "allow_settings_notify_enable"
            boolean r2 = r10.f77066c     // Catch:{ Exception -> 0x0058 }
            int r0 = r0.getInt(r1, r2)     // Catch:{ Exception -> 0x0058 }
            r10.x = r0     // Catch:{ Exception -> 0x0058 }
        L_0x0050:
            int r0 = r10.x     // Catch:{ Exception -> 0x0058 }
            if (r0 <= 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r8 = 0
        L_0x0056:
            monitor-exit(r10)
            return r8
        L_0x0058:
            monitor-exit(r10)
            return r8
        L_0x005a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.a.g(android.content.Context):boolean");
    }

    public final SharedPreferences.Editor c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f77064a, false, 90271, new Class[]{Context.class}, SharedPreferences.Editor.class)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[]{context}, this, f77064a, false, 90271, new Class[]{Context.class}, SharedPreferences.Editor.class);
        } else if (context == null) {
            return null;
        } else {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "push_setting", 0).edit();
            if (edit != null) {
                edit.putInt("shut_push_on_stop_service", this.z);
                edit.putInt("allow_settings_notify_enable", this.x);
                edit.putBoolean("notify_enabled", this.y);
                edit.putString("uninstall_question_url", this.f77065b);
                if (!c.a()) {
                    edit.putString("aweme_push_config", this.f77068e);
                }
            }
            return edit;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean d(android.content.Context r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005f }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x005f }
            com.meituan.robust.ChangeQuickRedirect r3 = f77064a     // Catch:{ all -> 0x005f }
            r4 = 0
            r5 = 90272(0x160a0, float:1.26498E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005f }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2     // Catch:{ all -> 0x005f }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005f }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x003b
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005f }
            r1[r9] = r11     // Catch:{ all -> 0x005f }
            com.meituan.robust.ChangeQuickRedirect r3 = f77064a     // Catch:{ all -> 0x005f }
            r4 = 0
            r5 = 90272(0x160a0, float:1.26498E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005f }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0     // Catch:{ all -> 0x005f }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005f }
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005f }
            monitor-exit(r10)
            return r0
        L_0x003b:
            int r1 = r10.B     // Catch:{ Exception -> 0x005d }
            r2 = -1
            if (r1 != r2) goto L_0x0055
            boolean r1 = F     // Catch:{ Exception -> 0x005d }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = "push_setting"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r11, r1, r9)     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = "confirm_push"
            int r0 = r0.getInt(r1, r9)     // Catch:{ Exception -> 0x005d }
            r10.B = r0     // Catch:{ Exception -> 0x005d }
            goto L_0x0055
        L_0x0053:
            r10.B = r8     // Catch:{ Exception -> 0x005d }
        L_0x0055:
            int r0 = r10.B     // Catch:{ Exception -> 0x005d }
            if (r0 <= 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            monitor-exit(r10)
            return r8
        L_0x005d:
            monitor-exit(r10)
            return r8
        L_0x005f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.a.d(android.content.Context):boolean");
    }

    public final synchronized void f(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f77064a, false, 90277, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f77064a, false, 90277, new Class[]{Context.class}, Void.TYPE);
        } else if (g(context)) {
            this.f77066c = true;
        } else {
            this.f77066c = false;
        }
    }

    public final boolean e(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f77064a, false, 90275, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f77064a, false, 90275, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (g(context)) {
            return this.y;
        } else {
            return false;
        }
    }

    private boolean a(JSONObject jSONObject) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f77064a, false, 90282, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f77064a, false, 90282, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        int a2 = a(jSONObject, "live_push_system_max_show_count");
        if (a2 < 0 || a2 == this.l) {
            z2 = false;
        } else {
            this.l = a2;
            z2 = true;
        }
        int a3 = a(jSONObject, "live_push_nonsystem_max_show_count");
        if (a3 >= 0 && a3 != this.m) {
            this.m = a3;
            z2 = true;
        }
        int a4 = a(jSONObject, "close_active_push_alert");
        if (a4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a4 >= 0 && z3 != this.q) {
            this.q = z3;
            z2 = true;
        }
        int a5 = a(jSONObject, "max_notify_count");
        if (a5 > 0 && a5 != this.n) {
            this.n = a5;
            z2 = true;
        }
        int a6 = a(jSONObject, "notify_fresh_period");
        if (a6 > 0 && a6 != this.p) {
            this.p = a6;
            z2 = true;
        }
        try {
            if (jSONObject.optJSONObject("aweme_push_config").optInt("forbid_show_notification", 1) > 0) {
                z4 = true;
            }
            if (this.r != z4) {
                this.r = z4;
                z2 = true;
            }
        } catch (Exception unused) {
        }
        return z2;
    }

    public void b(Context context) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{context}, this, f77064a, false, 90269, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f77064a, false, 90269, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(context, "push_setting", 0);
            if (PatchProxy.isSupport(new Object[]{context}, this, f77064a, false, 90270, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f77064a, false, 90270, new Class[]{Context.class}, Void.TYPE);
            } else if (!this.C && Build.VERSION.SDK_INT >= 26 && context != null) {
                NotificationChannel notificationChannel = new NotificationChannel("com.ss.android.ugc.aweme.server", "Notification", 4);
                notificationChannel.enableLights(true);
                notificationChannel.enableVibration(true);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setShowBadge(true);
                notificationChannel.setLightColor(-16711936);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                notificationManager.createNotificationChannel(notificationChannel);
                NotificationChannel notificationChannel2 = new NotificationChannel("com.ss.android.ugc.aweme.server.important.low", "Notification", 2);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel2);
                this.C = true;
            }
            if (c.a()) {
                if (a2 != null) {
                    if (g() == 1) {
                        i2 = 1;
                    }
                    this.z = a2.getInt("shut_push_on_stop_service", i2);
                    this.x = a2.getInt("allow_settings_notify_enable", this.f77066c ? 1 : 0);
                    this.y = a2.getBoolean("notify_enabled", true);
                    this.f77065b = a2.getString("uninstall_question_url", j.a().getDefaultUninstallQuestionUrl());
                    this.w = a2.getInt("push_clear_switch", 1);
                }
            } else if (a2 != null) {
                if (g() == 1) {
                    i2 = 1;
                }
                this.z = a2.getInt("shut_push_on_stop_service", i2);
                this.x = a2.getInt("allow_settings_notify_enable", this.f77066c ? 1 : 0);
                this.y = a2.getBoolean("notify_enabled", true);
                this.f77065b = a2.getString("uninstall_question_url", j.a().getDefaultUninstallQuestionUrl());
                this.f77068e = a2.getString("aweme_push_config", "");
                try {
                    JSONObject jSONObject = new JSONObject(this.f77068e);
                    this.g = (long) jSONObject.optInt("show_float_window");
                    this.h = (long) jSONObject.optInt("redbadge_use_last");
                    this.A = jSONObject.optInt("turn_screen_on");
                    this.f77069f = (long) jSONObject.optInt("float_window_show_time");
                    this.i = jSONObject.optInt("key_play_sound_id");
                    this.v = jSONObject.optInt("oppo_unify_style");
                    this.j = jSONObject.optInt("oppo_push_style");
                    this.k = jSONObject.optInt("wait_screen_on_duration");
                    this.w = jSONObject.optInt("push_clear_switch");
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f77064a, false, 90266, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f77064a, false, 90266, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!g(context)) {
            return true;
        } else if (this.z > 0) {
            return true;
        } else {
            return false;
        }
    }

    private int a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{jSONObject2, str2}, this, f77064a, false, 90283, new Class[]{JSONObject.class, String.class}, Integer.TYPE)) {
            return jSONObject2.optInt(str2, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{jSONObject2, str2}, this, f77064a, false, 90283, new Class[]{JSONObject.class, String.class}, Integer.TYPE)).intValue();
    }

    public final void b(Context context, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f77064a, false, 90274, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z2)}, this, f77064a, false, 90274, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.y = z2;
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "push_setting", 0).edit();
        edit.putBoolean("notify_enabled", this.y);
        SharedPrefsEditorCompat.apply(edit);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r12, boolean r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0073 }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x0073 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r13)     // Catch:{ all -> 0x0073 }
            r10 = 1
            r1[r10] = r2     // Catch:{ all -> 0x0073 }
            com.meituan.robust.ChangeQuickRedirect r3 = f77064a     // Catch:{ all -> 0x0073 }
            r4 = 0
            r5 = 90273(0x160a1, float:1.265E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0073 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2     // Catch:{ all -> 0x0073 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0073 }
            r6[r10] = r2     // Catch:{ all -> 0x0073 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0073 }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0049
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0073 }
            r1[r9] = r12     // Catch:{ all -> 0x0073 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r13)     // Catch:{ all -> 0x0073 }
            r1[r10] = r0     // Catch:{ all -> 0x0073 }
            com.meituan.robust.ChangeQuickRedirect r3 = f77064a     // Catch:{ all -> 0x0073 }
            r4 = 0
            r5 = 90273(0x160a1, float:1.265E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0073 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0     // Catch:{ all -> 0x0073 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0073 }
            r6[r10] = r0     // Catch:{ all -> 0x0073 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0073 }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0073 }
            monitor-exit(r11)
            return
        L_0x0049:
            int r1 = r11.B     // Catch:{ Exception -> 0x0071 }
            if (r1 == r13) goto L_0x006f
            r11.B = r13     // Catch:{ Exception -> 0x0071 }
            java.lang.String r1 = "push_setting"
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r12, r1, r9)     // Catch:{ Exception -> 0x0071 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r2 = "confirm_push"
            int r3 = r11.B     // Catch:{ Exception -> 0x0071 }
            r1.putInt(r2, r3)     // Catch:{ Exception -> 0x0071 }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r1)     // Catch:{ Exception -> 0x0071 }
            com.ss.android.pushmanager.client.e r1 = com.ss.android.pushmanager.client.e.a()     // Catch:{ Exception -> 0x0071 }
            int r2 = r11.B     // Catch:{ Exception -> 0x0071 }
            if (r2 <= 0) goto L_0x006c
            r9 = 1
        L_0x006c:
            r1.a((android.content.Context) r12, (boolean) r9)     // Catch:{ Exception -> 0x0071 }
        L_0x006f:
            monitor-exit(r11)
            return
        L_0x0071:
            monitor-exit(r11)
            return
        L_0x0073:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.a.a(android.content.Context, boolean):void");
    }

    public final boolean a(int i2, long j2) {
        b.a aVar;
        boolean a2;
        b.a aVar2;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f77064a, false, 90291, new Class[]{Integer.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f77064a, false, 90291, new Class[]{Integer.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        long j4 = (long) i2;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j3)}, this, f77064a, false, 90287, new Class[]{Long.TYPE, Long.TYPE}, b.a.class)) {
            aVar = (b.a) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j3)}, this, f77064a, false, 90287, new Class[]{Long.TYPE, Long.TYPE}, b.a.class);
        } else {
            b bVar = this.t;
            bVar.getClass();
            aVar = new b.a();
            aVar.f30498b = Long.valueOf(j4);
            aVar.f30499c = j3;
        }
        b.a aVar3 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar3}, this, f77064a, false, 90288, new Class[]{b.a.class}, Boolean.TYPE)) {
            a2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar3}, this, f77064a, false, 90288, new Class[]{b.a.class}, Boolean.TYPE)).booleanValue();
        } else {
            a2 = this.t.a(aVar3);
        }
        boolean z2 = a2;
        if (z2) {
            if (PatchProxy.isSupport(new Object[]{aVar3}, this, f77064a, false, 90289, new Class[]{b.a.class}, b.a.class)) {
                aVar2 = (b.a) PatchProxy.accessDispatch(new Object[]{aVar3}, this, f77064a, false, 90289, new Class[]{b.a.class}, b.a.class);
            } else {
                aVar2 = this.t.b(aVar3);
            }
            if (aVar2 != null) {
                Logger.debug();
                if (aVar3.f30499c - aVar2.f30499c > 43200000) {
                    z2 = false;
                }
            }
        }
        Logger.debug();
        if (PatchProxy.isSupport(new Object[]{aVar3}, this, f77064a, false, 90290, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar3}, this, f77064a, false, 90290, new Class[]{b.a.class}, Void.TYPE);
        } else {
            this.t.c(aVar3);
        }
        e();
        return z2;
    }
}
