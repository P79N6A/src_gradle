package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.at;
import com.xiaomi.push.dz;
import com.xiaomi.push.fz;
import com.xiaomi.push.ik;
import com.xiaomi.push.il;
import com.xiaomi.push.io;
import com.xiaomi.push.ip;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.jg;
import com.xiaomi.push.jj;
import com.xiaomi.push.jk;
import com.xiaomi.push.jq;
import com.xiaomi.push.ju;
import com.xiaomi.push.jv;
import com.xiaomi.push.m;
import com.xiaomi.push.service.ag;
import com.xiaomi.push.service.aj;
import com.xiaomi.push.service.ap;
import com.xiaomi.push.service.as;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ay {

    /* renamed from: a  reason: collision with root package name */
    private static ay f81766a;

    /* renamed from: a  reason: collision with other field name */
    private static final ArrayList<a> f103a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f81767b;

    /* renamed from: a  reason: collision with other field name */
    private Context f104a;

    /* renamed from: a  reason: collision with other field name */
    private Intent f105a = null;

    /* renamed from: a  reason: collision with other field name */
    private Handler f106a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public Messenger f107a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public Integer f108a = null;

    /* renamed from: a  reason: collision with other field name */
    private String f109a;

    /* renamed from: a  reason: collision with other field name */
    private List<Message> f110a = new ArrayList();

    /* renamed from: a  reason: collision with other field name */
    private boolean f111a;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f81768c = false;

    static class a<T extends jv<T, ?>> {

        /* renamed from: a  reason: collision with root package name */
        ik f81769a;

        /* renamed from: a  reason: collision with other field name */
        T f112a;

        /* renamed from: a  reason: collision with other field name */
        boolean f113a;

        a() {
        }
    }

    private ay(Context context) {
        this.f104a = context.getApplicationContext();
        this.f109a = null;
        this.f111a = c();
        f81767b = d();
        this.f106a = new az(this, Looper.getMainLooper());
        Intent b2 = b();
        if (b2 != null) {
            b(b2);
        }
    }

    private int a() {
        int i;
        synchronized (this) {
            i = c.a(this.f104a, "mipush_extra", 0).getInt("service_boot_mode", -1);
        }
        return i;
    }

    /* renamed from: a  reason: collision with other method in class */
    private Intent m40a() {
        return (!a() || "com.xiaomi.xmsf".equals(this.f104a.getPackageName())) ? e() : d();
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    public static ay a(Context context) {
        ay ayVar;
        synchronized (ay.class) {
            try {
                if (f81766a == null) {
                    f81766a = new ay(context);
                }
                ayVar = f81766a;
            } catch (Throwable th) {
                Class<ay> cls = ay.class;
                throw th;
            }
        }
        return ayVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private String m41a() {
        try {
            if (this.f104a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* access modifiers changed from: private */
    public void a(String str, bd bdVar, boolean z, HashMap<String, String> hashMap) {
        jj jjVar;
        String str2;
        if (d.a(this.f104a).b() && at.b(this.f104a)) {
            jj jjVar2 = new jj();
            jjVar2.a(true);
            Intent a2 = a();
            if (TextUtils.isEmpty(str)) {
                str = aj.a();
                jjVar2.a(str);
                jjVar = z ? new jj(str, true) : null;
                synchronized (ao.class) {
                    try {
                        ao.a(this.f104a).a(str);
                    } catch (Throwable th) {
                        Class<ao> cls = ao.class;
                        throw th;
                    }
                }
            } else {
                jjVar2.a(str);
                jjVar = z ? new jj(str, true) : null;
            }
            switch (bc.f81774a[bdVar.ordinal()]) {
                case 1:
                    jjVar2.c(iu.DisablePushMessage.f570a);
                    jjVar.c(iu.DisablePushMessage.f570a);
                    if (hashMap != null) {
                        jjVar2.a((Map<String, String>) hashMap);
                        jjVar.a((Map<String, String>) hashMap);
                    }
                    str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                    break;
                case 2:
                    jjVar2.c(iu.EnablePushMessage.f570a);
                    jjVar.c(iu.EnablePushMessage.f570a);
                    if (hashMap != null) {
                        jjVar2.a((Map<String, String>) hashMap);
                        jjVar.a((Map<String, String>) hashMap);
                    }
                    str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    jjVar2.c(iu.ThirdPartyRegUpdate.f570a);
                    if (hashMap != null) {
                        jjVar2.a((Map<String, String>) hashMap);
                        break;
                    }
                    break;
            }
            a2.setAction(str2);
            jjVar2.b(d.a(this.f104a).a());
            jjVar2.d(this.f104a.getPackageName());
            a((T) jjVar2, ik.Notification, false, (ix) null);
            if (z) {
                jjVar.b(d.a(this.f104a).a());
                jjVar.d(this.f104a.getPackageName());
                byte[] a3 = ju.a(ar.a(this.f104a, jjVar, ik.Notification, false, this.f104a.getPackageName(), d.a(this.f104a).a()));
                if (a3 != null) {
                    dz.a(this.f104a.getPackageName(), this.f104a, jjVar, ik.Notification, a3.length);
                    a2.putExtra("mipush_payload", a3);
                    a2.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    a2.putExtra("mipush_app_id", d.a(this.f104a).a());
                    a2.putExtra("mipush_app_token", d.a(this.f104a).b());
                    c(a2);
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 19;
            int ordinal = bdVar.ordinal();
            obtain.obj = str;
            obtain.arg1 = ordinal;
            this.f106a.sendMessageDelayed(obtain, 5000);
        }
    }

    private Intent b() {
        if (!"com.xiaomi.xmsf".equals(this.f104a.getPackageName())) {
            return c();
        }
        b.c("pushChannel xmsf create own channel");
        return e();
    }

    private void b(Intent intent) {
        try {
            if (m.a() || Build.VERSION.SDK_INT < 26) {
                this.f104a.startService(intent);
            } else {
                d(intent);
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
    }

    private Intent c() {
        if (a()) {
            b.c("pushChannel app start miui china channel");
            return d();
        }
        b.c("pushChannel app start  own channel");
        return e();
    }

    private void c(int i) {
        synchronized (this) {
            c.a(this.f104a, "mipush_extra", 0).edit().putInt("service_boot_mode", i).commit();
        }
    }

    private void c(Intent intent) {
        int a2 = ag.a(this.f104a).a(ip.ServiceBootMode.a(), il.START.a());
        int a3 = a();
        boolean z = a2 == il.BIND.a() && f81767b;
        int a4 = (z ? il.BIND : il.START).a();
        if (a4 != a3) {
            a(a4);
        }
        if (z) {
            d(intent);
        } else {
            b(intent);
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    private boolean m42c() {
        try {
            PackageInfo packageInfo = this.f104a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo != null) {
                if (packageInfo.versionCode >= 105) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private Intent d() {
        Intent intent = new Intent();
        String packageName = this.f104a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", a());
        intent.putExtra("mipush_app_package", packageName);
        f();
        return intent;
    }

    private void d(Intent intent) {
        Message a2;
        List<Message> list;
        synchronized (this) {
            if (this.f81768c) {
                a2 = a(intent);
                if (this.f110a.size() >= 50) {
                    this.f110a.remove(0);
                }
                list = this.f110a;
            } else if (this.f107a == null) {
                this.f104a.bindService(intent, new bb(this), 1);
                this.f81768c = true;
                this.f110a.clear();
                a2 = a(intent);
                list = this.f110a;
            } else {
                try {
                    this.f107a.send(a(intent));
                } catch (RemoteException unused) {
                    this.f107a = null;
                    this.f81768c = false;
                }
            }
            list.add(a2);
        }
        return;
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m43d() {
        if (!a()) {
            return true;
        }
        try {
            return this.f104a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
        } catch (Exception unused) {
            return true;
        }
    }

    private Intent e() {
        Intent intent = new Intent();
        String packageName = this.f104a.getPackageName();
        g();
        intent.setComponent(new ComponentName(this.f104a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* renamed from: e  reason: collision with other method in class */
    private boolean m44e() {
        String packageName = this.f104a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f104a.getApplicationInfo().flags & 1) != 0;
    }

    private void f() {
        try {
            this.f104a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f104a, "com.xiaomi.push.service.XMPushService"), 2, 1);
        } catch (Throwable unused) {
        }
    }

    private void g() {
        try {
            this.f104a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f104a, "com.xiaomi.push.service.XMPushService"), 1, 1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m45a() {
        b(a());
    }

    public void a(int i) {
        Intent a2 = a();
        a2.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a2.putExtra(ap.z, this.f104a.getPackageName());
        a2.putExtra(ap.A, i);
        c(a2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i, String str) {
        Intent a2 = a();
        a2.setAction("com.xiaomi.mipush.thirdparty");
        a2.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        a2.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        b(a2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m46a(Intent intent) {
        intent.fillIn(a(), 24);
        c(intent);
    }

    public final void a(io ioVar) {
        Intent a2 = a();
        byte[] a3 = ju.a(ioVar);
        if (a3 == null) {
            b.a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        a2.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        a2.putExtra("mipush_payload", a3);
        b(a2);
    }

    public final void a(jk jkVar, boolean z) {
        fz.a(this.f104a.getApplicationContext()).a(this.f104a.getPackageName(), "E100003", jkVar.a(), 6001, "construct a register message");
        this.f105a = null;
        d.a(this.f104a).f118a = jkVar.a();
        Intent a2 = a();
        byte[] a3 = ju.a(ar.a(this.f104a, jkVar, ik.Registration));
        if (a3 == null) {
            b.a("register fail, because msgBytes is null.");
            return;
        }
        a2.setAction("com.xiaomi.mipush.REGISTER_APP");
        a2.putExtra("mipush_app_id", d.a(this.f104a).a());
        a2.putExtra("mipush_payload", a3);
        a2.putExtra("mipush_session", this.f109a);
        a2.putExtra("mipush_env_chanage", z);
        a2.putExtra("mipush_env_type", d.a(this.f104a).a());
        if (!at.b(this.f104a) || !b()) {
            this.f105a = a2;
        } else {
            c(a2);
        }
    }

    public final void a(jq jqVar) {
        byte[] a2 = ju.a(ar.a(this.f104a, jqVar, ik.UnRegistration));
        if (a2 == null) {
            b.a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent a3 = a();
        a3.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        a3.putExtra("mipush_app_id", d.a(this.f104a).a());
        a3.putExtra("mipush_payload", a2);
        c(a3);
    }

    public final <T extends jv<T, ?>> void a(T t, ik ikVar, ix ixVar) {
        a(t, ikVar, !ikVar.equals(ik.Registration), ixVar);
    }

    public <T extends jv<T, ?>> void a(T t, ik ikVar, boolean z) {
        a aVar = new a();
        aVar.f112a = t;
        aVar.f81769a = ikVar;
        aVar.f113a = z;
        synchronized (f103a) {
            f103a.add(aVar);
            if (f103a.size() > 10) {
                f103a.remove(0);
            }
        }
    }

    public final <T extends jv<T, ?>> void a(T t, ik ikVar, boolean z, ix ixVar) {
        a(t, ikVar, z, true, ixVar, true);
    }

    public final <T extends jv<T, ?>> void a(T t, ik ikVar, boolean z, ix ixVar, boolean z2) {
        a(t, ikVar, z, true, ixVar, z2);
    }

    public final <T extends jv<T, ?>> void a(T t, ik ikVar, boolean z, boolean z2, ix ixVar, boolean z3) {
        a(t, ikVar, z, z2, ixVar, z3, this.f104a.getPackageName(), d.a(this.f104a).a());
    }

    public final <T extends jv<T, ?>> void a(T t, ik ikVar, boolean z, boolean z2, ix ixVar, boolean z3, String str, String str2) {
        if (d.a(this.f104a).c()) {
            jg a2 = ar.a(this.f104a, t, ikVar, z, str, str2);
            if (ixVar != null) {
                a2.a(ixVar);
            }
            byte[] a3 = ju.a(a2);
            if (a3 == null) {
                b.a("send message fail, because msgBytes is null.");
                return;
            }
            dz.a(this.f104a.getPackageName(), this.f104a, t, ikVar, a3.length);
            Intent a4 = a();
            a4.setAction("com.xiaomi.mipush.SEND_MESSAGE");
            a4.putExtra("mipush_payload", a3);
            a4.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
            c(a4);
        } else if (z2) {
            a(t, ikVar, z);
        } else {
            b.a("drop the message before initialization.");
        }
    }

    public final void a(String str, bd bdVar, f fVar) {
        ao.a(this.f104a).a(bdVar, "syncing");
        a(str, bdVar, false, j.a(this.f104a, fVar));
    }

    public void a(String str, String str2) {
        Intent a2 = a();
        a2.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a2.putExtra(ap.z, this.f104a.getPackageName());
        a2.putExtra(ap.E, str);
        a2.putExtra(ap.F, str2);
        c(a2);
    }

    public final void a(boolean z) {
        a(z, (String) null);
    }

    public final void a(boolean z, String str) {
        bd bdVar;
        if (z) {
            ao.a(this.f104a).a(bd.DISABLE_PUSH, "syncing");
            ao.a(this.f104a).a(bd.ENABLE_PUSH, "");
            bdVar = bd.DISABLE_PUSH;
        } else {
            ao.a(this.f104a).a(bd.ENABLE_PUSH, "syncing");
            ao.a(this.f104a).a(bd.DISABLE_PUSH, "");
            bdVar = bd.ENABLE_PUSH;
        }
        a(str, bdVar, true, (HashMap<String, String>) null);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m47a() {
        return this.f111a && 1 == d.a(this.f104a).a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m48a(int i) {
        if (!d.a(this.f104a).b()) {
            return false;
        }
        c(i);
        jj jjVar = new jj();
        jjVar.a(aj.a());
        jjVar.b(d.a(this.f104a).a());
        jjVar.d(this.f104a.getPackageName());
        jjVar.c(iu.ClientABTest.f570a);
        jjVar.f710a = new HashMap();
        Map<String, String> map = jjVar.f710a;
        map.put("boot_mode", i);
        a(this.f104a).a((T) jjVar, ik.Notification, false, (ix) null);
        return true;
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m49b() {
        Intent a2 = a();
        a2.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        c(a2);
    }

    public void b(int i) {
        Intent a2 = a();
        a2.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a2.putExtra(ap.z, this.f104a.getPackageName());
        a2.putExtra(ap.B, i);
        String str = ap.D;
        a2.putExtra(str, com.xiaomi.push.ay.b(this.f104a.getPackageName() + i));
        c(a2);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m50b() {
        if (!a() || !e()) {
            return true;
        }
        if (this.f108a == null) {
            this.f108a = Integer.valueOf(as.a(this.f104a).a());
            if (this.f108a.intValue() == 0) {
                this.f104a.getContentResolver().registerContentObserver(as.a(this.f104a).a(), false, new ba(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f108a.intValue() != 0;
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m51c() {
        if (this.f105a != null) {
            c(this.f105a);
            this.f105a = null;
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m52d() {
        synchronized (f103a) {
            Iterator<a> it2 = f103a.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                a(next.f112a, next.f81769a, next.f113a, false, null, true);
            }
            f103a.clear();
        }
    }

    /* renamed from: e  reason: collision with other method in class */
    public void m53e() {
        Intent a2 = a();
        a2.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a2.putExtra(ap.z, this.f104a.getPackageName());
        a2.putExtra(ap.D, com.xiaomi.push.ay.b(this.f104a.getPackageName()));
        c(a2);
    }
}
