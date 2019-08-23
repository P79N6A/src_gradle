package com.ss.android.push.daemon;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.MessageReceiver;
import com.ss.android.message.NotifyService;
import com.ss.android.push.daemon.b;
import org.json.JSONObject;

public class c {

    /* renamed from: c  reason: collision with root package name */
    static b f30416c;

    /* renamed from: f  reason: collision with root package name */
    private static volatile c f30417f;

    /* renamed from: a  reason: collision with root package name */
    Context f30418a;

    /* renamed from: b  reason: collision with root package name */
    e f30419b;

    /* renamed from: d  reason: collision with root package name */
    boolean f30420d;

    /* renamed from: e  reason: collision with root package name */
    a f30421e;

    class a {

        /* renamed from: a  reason: collision with root package name */
        long f30422a;

        /* renamed from: b  reason: collision with root package name */
        long f30423b;

        /* renamed from: c  reason: collision with root package name */
        long f30424c;

        /* access modifiers changed from: package-private */
        public final void a() {
            try {
                if (this.f30423b > 0) {
                    if (this.f30424c > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("start", this.f30423b);
                        jSONObject.put("end", this.f30424c);
                        jSONObject.put("duration", this.f30422a);
                        com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
                        String jSONObject2 = jSONObject.toString();
                        if (PatchProxy.isSupport(new Object[]{jSONObject2}, a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19199, new Class[]{String.class}, Void.TYPE)) {
                            com.ss.android.pushmanager.setting.b bVar = a2;
                            PatchProxy.accessDispatch(new Object[]{jSONObject2}, bVar, com.ss.android.pushmanager.setting.b.f2543a, false, 19199, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        a2.f2546c.a().a("push_daemon_monitor", jSONObject2).a();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        a(Context context) {
            String str;
            try {
                com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
                if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19200, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19200, new Class[0], String.class);
                } else {
                    str = a2.f2546c.a("push_daemon_monitor", "");
                }
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f30423b = jSONObject.optLong("start", 0);
                    if (DateUtils.isToday(this.f30423b)) {
                        this.f30422a = jSONObject.optLong("duration", 0);
                        this.f30424c = jSONObject.optLong("end", 0);
                        return;
                    }
                    com.ss.android.pushmanager.setting.b.a().a(str);
                    this.f30423b = 0;
                    this.f30424c = 0;
                    this.f30422a = 0;
                }
            } catch (Throwable unused) {
            }
        }
    }

    class b implements b.C0368b {
        public final void a() {
            if (c.this.f30421e != null) {
                a aVar = c.this.f30421e;
                Context context = c.this.f30418a;
                aVar.f30424c = System.currentTimeMillis();
                if (aVar.f30424c >= aVar.f30423b) {
                    aVar.f30422a += aVar.f30424c - aVar.f30423b;
                }
                aVar.a();
            }
        }

        public final void c(Context context) {
            Logger.debug();
        }

        b() {
        }

        public final void b(Context context) {
            Logger.debug();
            if (c.this.f30421e != null) {
                a aVar = c.this.f30421e;
                Context context2 = c.this.f30418a;
                long currentTimeMillis = System.currentTimeMillis();
                if (!DateUtils.isToday(aVar.f30423b)) {
                    aVar.f30422a = 0;
                }
                aVar.f30423b = currentTimeMillis;
                aVar.f30424c = currentTimeMillis;
                aVar.a();
            }
        }
    }

    private static boolean b() {
        return com.ss.android.pushmanager.setting.b.a().k();
    }

    private static boolean c() {
        return com.ss.android.pushmanager.setting.b.a().f();
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 21 && Boolean.valueOf(com.ss.android.pushmanager.setting.b.a().i()).booleanValue() && c() && !b()) {
            try {
                if (!this.f30420d) {
                    this.f30419b.a(this.f30418a);
                    this.f30420d = true;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static c a(Context context) {
        if (f30417f == null) {
            synchronized (c.class) {
                if (f30417f == null) {
                    f30417f = new c(context);
                }
            }
        }
        return f30417f;
    }

    private c(Context context) {
        this.f30418a = context;
        try {
            if (f30416c == null) {
                b.a aVar = new b.a(this.f30418a.getPackageName() + ":push", NotifyService.class.getCanonicalName(), MessageReceiver.class.getCanonicalName());
                f30416c = new b(aVar, new b.a(this.f30418a.getPackageName() + ":pushservice", PushService.class.getCanonicalName(), PushReceiver.class.getCanonicalName()), new b());
            }
            this.f30419b = new a(f30416c);
            this.f30421e = new a(context);
        } catch (Throwable unused) {
        }
    }
}
