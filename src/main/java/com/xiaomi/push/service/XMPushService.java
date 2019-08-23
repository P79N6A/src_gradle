package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import com.xiaomi.push.ac;
import com.xiaomi.push.aj;
import com.xiaomi.push.ap;
import com.xiaomi.push.at;
import com.xiaomi.push.ay;
import com.xiaomi.push.dt;
import com.xiaomi.push.ec;
import com.xiaomi.push.fo;
import com.xiaomi.push.fs;
import com.xiaomi.push.fz;
import com.xiaomi.push.ga;
import com.xiaomi.push.gj;
import com.xiaomi.push.go;
import com.xiaomi.push.gq;
import com.xiaomi.push.gr;
import com.xiaomi.push.gt;
import com.xiaomi.push.gv;
import com.xiaomi.push.gw;
import com.xiaomi.push.hb;
import com.xiaomi.push.hd;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.ic;
import com.xiaomi.push.ie;
import com.xiaomi.push.ii;
import com.xiaomi.push.ij;
import com.xiaomi.push.ik;
import com.xiaomi.push.ip;
import com.xiaomi.push.jg;
import com.xiaomi.push.jj;
import com.xiaomi.push.jk;
import com.xiaomi.push.ju;
import com.xiaomi.push.ka;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.g;
import com.xiaomi.push.service.l;
import com.xiaomi.push.u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class XMPushService extends Service implements gt {

    /* renamed from: a  reason: collision with root package name */
    public static int f82460a = 1;

    /* renamed from: b  reason: collision with root package name */
    private static final int f82461b = Process.myPid();

    /* renamed from: a  reason: collision with other field name */
    private long f888a;

    /* renamed from: a  reason: collision with other field name */
    private ContentObserver f889a;

    /* renamed from: a  reason: collision with other field name */
    Messenger f890a;

    /* renamed from: a  reason: collision with other field name */
    private go f891a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public gq f892a;

    /* renamed from: a  reason: collision with other field name */
    private gr f893a;

    /* renamed from: a  reason: collision with other field name */
    private gv f894a = new bi(this);

    /* renamed from: a  reason: collision with other field name */
    private e f895a;

    /* renamed from: a  reason: collision with other field name */
    private ak f896a;

    /* renamed from: a  reason: collision with other field name */
    private av f897a;

    /* renamed from: a  reason: collision with other field name */
    private d f898a;

    /* renamed from: a  reason: collision with other field name */
    private g f899a;

    /* renamed from: a  reason: collision with other field name */
    protected Class f900a = XMJobService.class;

    /* renamed from: a  reason: collision with other field name */
    private String f901a;

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<l> f902a = new ArrayList<>();

    /* renamed from: a  reason: collision with other field name */
    private Collection<ae> f903a = Collections.synchronizedCollection(new ArrayList());

    class a extends i {

        /* renamed from: a  reason: collision with other field name */
        al.b f904a;

        public a(al.b bVar) {
            super(9);
            this.f904a = bVar;
        }

        public String a() {
            return "bind the client. " + this.f904a.g;
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m587a() {
            try {
                if (!XMPushService.this.c()) {
                    com.xiaomi.channel.commonutils.logger.b.d("trying bind while the connection is not created, quit!");
                    return;
                }
                al.b a2 = al.a().a(this.f904a.g, this.f904a.f942b);
                if (a2 == null) {
                    com.xiaomi.channel.commonutils.logger.b.a("ignore bind because the channel " + this.f904a.g + " is removed ");
                } else if (a2.f937a == al.c.unbind) {
                    a2.a(al.c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.a(XMPushService.this).a(a2);
                    ie.a(XMPushService.this, a2);
                } else {
                    com.xiaomi.channel.commonutils.logger.b.a("trying duplicate bind, ingore! " + a2.f937a);
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                XMPushService.this.a(10, e2);
            } catch (Throwable unused) {
            }
        }
    }

    static class b extends i {

        /* renamed from: a  reason: collision with root package name */
        private final al.b f82463a;

        public b(al.b bVar) {
            super(12);
            this.f82463a = bVar;
        }

        public String a() {
            return "bind time out. chid=" + this.f82463a.g;
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m588a() {
            this.f82463a.a(al.c.unbind, 1, 21, (String) null, (String) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return TextUtils.equals(((b) obj).f82463a.g, this.f82463a.g);
        }

        public int hashCode() {
            return this.f82463a.g.hashCode();
        }
    }

    class c extends i {

        /* renamed from: a  reason: collision with root package name */
        private gj f82464a;

        public c(gj gjVar) {
            super(8);
            this.f82464a = gjVar;
        }

        public String a() {
            return "receive a message.";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m589a() {
            XMPushService.a(XMPushService.this).a(this.f82464a);
        }
    }

    public class d extends i {
        d() {
            super(1);
        }

        public String a() {
            return "do reconnect..";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m590a() {
            if (XMPushService.this.a()) {
                XMPushService.this.f();
            } else {
                com.xiaomi.channel.commonutils.logger.b.a("should not connect. quit the job.");
            }
        }
    }

    class e extends BroadcastReceiver {
        e() {
        }

        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, XMPushService.f82460a);
        }
    }

    public class f extends i {

        /* renamed from: a  reason: collision with other field name */
        public Exception f906a;

        /* renamed from: b  reason: collision with root package name */
        public int f82468b;

        f(int i, Exception exc) {
            super(2);
            this.f82468b = i;
            this.f906a = exc;
        }

        public String a() {
            return "disconnect the connection.";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m591a() {
            XMPushService.this.a(this.f82468b, this.f906a);
        }
    }

    class g extends i {
        g() {
            super(65535);
        }

        public String a() {
            return "Init Job";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m592a() {
            XMPushService.this.c();
        }
    }

    class h extends i {

        /* renamed from: a  reason: collision with root package name */
        private Intent f82470a;

        public h(Intent intent) {
            super(15);
            this.f82470a = intent;
        }

        public String a() {
            return "Handle intent action = " + this.f82470a.getAction();
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m593a() {
            XMPushService.this.c(this.f82470a);
        }
    }

    public static abstract class i extends g.b {
        public i(int i) {
            super(i);
        }

        public abstract String a();

        /* renamed from: a  reason: collision with other method in class */
        public abstract void m594a();

        public void run() {
            if (!(this.f82565a == 4 || this.f82565a == 8)) {
                com.xiaomi.channel.commonutils.logger.b.a("JOB: " + a());
            }
            a();
        }
    }

    class j extends i {
        public j() {
            super(5);
        }

        public String a() {
            return "ask the job queue to quit";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m595a() {
            XMPushService.a(XMPushService.this).a();
        }
    }

    class k extends i {

        /* renamed from: a  reason: collision with root package name */
        private hh f82472a;

        public k(hh hhVar) {
            super(8);
            this.f82472a = hhVar;
        }

        public String a() {
            return "receive a message.";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m596a() {
            XMPushService.a(XMPushService.this).a(this.f82472a);
        }
    }

    public interface l {
        void a();
    }

    class m extends i {

        /* renamed from: a  reason: collision with other field name */
        boolean f909a;

        public m(boolean z) {
            super(4);
            this.f909a = z;
        }

        public String a() {
            return "send ping..";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m597a() {
            if (XMPushService.this.c()) {
                try {
                    if (!this.f909a) {
                        ie.a();
                    }
                    XMPushService.a(XMPushService.this).b(this.f909a);
                } catch (hb e2) {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                    XMPushService.this.a(10, (Exception) e2);
                }
            }
        }
    }

    class n extends i {

        /* renamed from: a  reason: collision with other field name */
        al.b f910a;

        public n(al.b bVar) {
            super(4);
            this.f910a = bVar;
        }

        public String a() {
            return "rebind the client. " + this.f910a.g;
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m598a() {
            try {
                this.f910a.a(al.c.unbind, 1, 16, (String) null, (String) null);
                XMPushService.a(XMPushService.this).a(this.f910a.g, this.f910a.f942b);
                this.f910a.a(al.c.binding, 1, 16, (String) null, (String) null);
                XMPushService.a(XMPushService.this).a(this.f910a);
            } catch (hb e2) {
                com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                XMPushService.this.a(10, (Exception) e2);
            }
        }
    }

    class o extends i {
        o() {
            super(3);
        }

        public String a() {
            return "reset the connection.";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m599a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.a()) {
                XMPushService.this.f();
            }
        }
    }

    class p extends i {

        /* renamed from: a  reason: collision with other field name */
        al.b f911a;

        /* renamed from: a  reason: collision with other field name */
        String f912a;

        /* renamed from: b  reason: collision with root package name */
        int f82477b;

        /* renamed from: b  reason: collision with other field name */
        String f913b;

        public p(al.b bVar, int i, String str, String str2) {
            super(9);
            this.f911a = bVar;
            this.f82477b = i;
            this.f912a = str;
            this.f913b = str2;
        }

        public String a() {
            return "unbind the channel. " + this.f911a.g;
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m600a() {
            if (!(this.f911a.f937a == al.c.unbind || XMPushService.a(XMPushService.this) == null)) {
                try {
                    XMPushService.a(XMPushService.this).a(this.f911a.g, this.f911a.f942b);
                } catch (hb e2) {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                    XMPushService.this.a(10, (Exception) e2);
                }
            }
            this.f911a.a(al.c.unbind, this.f82477b, 0, this.f913b, this.f912a);
        }
    }

    static {
        dt.a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
        dt.a("cn.app.chat.xiaomi.net", "42.62.94.2:443");
        dt.a("cn.app.chat.xiaomi.net", "114.54.23.2");
        dt.a("cn.app.chat.xiaomi.net", "111.13.142.2");
        dt.a("cn.app.chat.xiaomi.net", "111.206.200.2");
    }

    @TargetApi(11)
    public static Notification a(Context context) {
        Intent intent = new Intent(context, XMPushService.class);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setSmallIcon(context.getApplicationInfo().icon);
            builder.setContentTitle("Push Service");
            builder.setContentText("Push Service");
            builder.setContentIntent(PendingIntent.getActivity(context, 0, intent, 0));
            return builder.getNotification();
        }
        Notification notification = new Notification();
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        try {
            notification.getClass().getMethod("setLatestEventInfo", new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class}).invoke(notification, new Object[]{context, "Push Service", "Push Service", service});
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
        }
        return notification;
    }

    private hh a(hh hhVar, String str, String str2) {
        StringBuilder sb;
        al a2 = al.a();
        List a3 = a2.a(str);
        if (a3.isEmpty()) {
            sb = new StringBuilder("open channel should be called first before sending a packet, pkg=");
        } else {
            hhVar.o(str);
            str = hhVar.k();
            if (TextUtils.isEmpty(str)) {
                str = (String) a3.get(0);
                hhVar.l(str);
            }
            al.b a4 = a2.a(str, hhVar.m());
            if (!c()) {
                sb = new StringBuilder("drop a packet as the channel is not connected, chid=");
            } else if (a4 == null || a4.f937a != al.c.binded) {
                sb = new StringBuilder("drop a packet as the channel is not opened, chid=");
            } else if (TextUtils.equals(str2, a4.i)) {
                return hhVar;
            } else {
                sb = new StringBuilder("invalid session. ");
                sb.append(str2);
                com.xiaomi.channel.commonutils.logger.b.a(sb.toString());
                return null;
            }
        }
        sb.append(str);
        com.xiaomi.channel.commonutils.logger.b.a(sb.toString());
        return null;
    }

    private al.b a(String str, Intent intent) {
        al.b a2 = al.a().a(str, intent.getStringExtra(ap.p));
        if (a2 == null) {
            a2 = new al.b(this);
        }
        a2.g = intent.getStringExtra(ap.r);
        a2.f942b = intent.getStringExtra(ap.p);
        a2.f82500c = intent.getStringExtra(ap.t);
        a2.f939a = intent.getStringExtra(ap.z);
        a2.f82502e = intent.getStringExtra(ap.x);
        a2.f82503f = intent.getStringExtra(ap.y);
        a2.f941a = intent.getBooleanExtra(ap.w, false);
        a2.h = intent.getStringExtra(ap.v);
        a2.i = intent.getStringExtra(ap.C);
        a2.f82501d = intent.getStringExtra(ap.u);
        a2.f938a = this.f898a;
        a2.a((Messenger) intent.getParcelableExtra(ap.G));
        a2.f931a = getApplicationContext();
        al.a().a(a2);
        return a2;
    }

    private String a() {
        String str;
        ap.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        String str2 = null;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            as a2 = as.a(this);
            str = null;
            while (true) {
                if (!TextUtils.isEmpty(str) && a2.a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(str)) {
                    str = com.xiaomi.push.m.a("ro.miui.region");
                    if (TextUtils.isEmpty(str)) {
                        str = com.xiaomi.push.m.a("ro.product.locale.region");
                    }
                }
                try {
                    synchronized (obj) {
                        obj.wait(100);
                    }
                } catch (InterruptedException unused) {
                }
            }
        } else {
            str = com.xiaomi.push.m.b();
        }
        if (!TextUtils.isEmpty(str)) {
            a.a(getApplicationContext()).b(str);
            str2 = com.xiaomi.push.m.a(str).name();
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        com.xiaomi.channel.commonutils.logger.b.a("wait region :" + str2 + " cost = " + (elapsedRealtime2 - elapsedRealtime));
        return str2;
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
            }
        }
    }

    private void a(Intent intent) {
        String stringExtra = intent.getStringExtra(ap.z);
        String stringExtra2 = intent.getStringExtra(ap.C);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        al a2 = al.a();
        gj gjVar = null;
        if (bundleExtra != null) {
            hg hgVar = (hg) a((hh) new hg(bundleExtra), stringExtra, stringExtra2);
            if (hgVar != null) {
                gjVar = gj.a((hh) hgVar, a2.a(hgVar.k(), hgVar.m()).h);
            } else {
                return;
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                long longExtra = intent.getLongExtra(ap.p, 0);
                String stringExtra3 = intent.getStringExtra(ap.q);
                String stringExtra4 = intent.getStringExtra("ext_chid");
                al.b a3 = a2.a(stringExtra4, Long.toString(longExtra));
                if (a3 != null) {
                    gj gjVar2 = new gj();
                    try {
                        gjVar2.a(Integer.parseInt(stringExtra4));
                    } catch (NumberFormatException unused) {
                    }
                    gjVar2.a("SECMSG", (String) null);
                    gjVar2.a(longExtra, "xiaomi.com", stringExtra3);
                    gjVar2.a(intent.getStringExtra("ext_pkt_id"));
                    gjVar2.a(byteArrayExtra, a3.h);
                    gjVar = gjVar2;
                }
            }
        }
        if (gjVar != null) {
            c((i) new aw(this, gjVar));
        }
    }

    private void a(Intent intent, int i2) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        jj jjVar = new jj();
        try {
            ju.a(jjVar, byteArrayExtra);
            aj.a(getApplicationContext()).a((aj.a) new b(jjVar, new WeakReference(this), booleanExtra), i2);
        } catch (ka unused) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_ping : send help app ping  error");
        }
    }

    private void a(String str, int i2) {
        Collection<al.b> a2 = al.a().a(str);
        if (a2 != null) {
            for (al.b bVar : a2) {
                if (bVar != null) {
                    p pVar = new p(bVar, i2, null, null);
                    a((i) pVar);
                }
            }
        }
        al.a().a(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m573a(String str, Intent intent) {
        al.b a2 = al.a().a(str, intent.getStringExtra(ap.p));
        boolean z = false;
        if (a2 == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(ap.C);
        String stringExtra2 = intent.getStringExtra(ap.v);
        if (!TextUtils.isEmpty(a2.i) && !TextUtils.equals(stringExtra, a2.i)) {
            com.xiaomi.channel.commonutils.logger.b.a("session changed. old session=" + a2.i + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(a2.h)) {
            return z;
        }
        com.xiaomi.channel.commonutils.logger.b.a("security changed. chid = " + str + " sechash = " + ay.a(stringExtra2));
        return true;
    }

    private void b(Intent intent) {
        String stringExtra = intent.getStringExtra(ap.z);
        String stringExtra2 = intent.getStringExtra(ap.C);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        hg[] hgVarArr = new hg[parcelableArrayExtra.length];
        intent.getBooleanExtra("ext_encrypt", true);
        int i2 = 0;
        while (i2 < parcelableArrayExtra.length) {
            hgVarArr[i2] = new hg((Bundle) parcelableArrayExtra[i2]);
            hgVarArr[i2] = (hg) a((hh) hgVarArr[i2], stringExtra, stringExtra2);
            if (hgVarArr[i2] != null) {
                i2++;
            } else {
                return;
            }
        }
        al a2 = al.a();
        gj[] gjVarArr = new gj[hgVarArr.length];
        for (int i3 = 0; i3 < hgVarArr.length; i3++) {
            hg hgVar = hgVarArr[i3];
            gjVarArr[i3] = gj.a((hh) hgVar, a2.a(hgVar.k(), hgVar.m()).h);
        }
        c((i) new c(this, gjVarArr));
    }

    private void b(boolean z) {
        this.f888a = System.currentTimeMillis();
        if (!c()) {
            a(true);
        } else if (this.f892a.d() || this.f892a.e() || at.d(this)) {
            c((i) new m(z));
        } else {
            c((i) new f(17, null));
            a(true);
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        String str;
        a a2 = a.a(getApplicationContext());
        String a3 = a2.a();
        if (TextUtils.isEmpty(a3)) {
            a3 = a();
        }
        if (!TextUtils.isEmpty(a3)) {
            this.f901a = a3;
            a2.a(a3);
            if (com.xiaomi.push.p.Global.name().equals(this.f901a)) {
                str = "app.chat.global.xiaomi.net";
            } else if (com.xiaomi.push.p.Europe.name().equals(this.f901a)) {
                str = "fr.app.chat.global.xiaomi.net";
            } else if (com.xiaomi.push.p.Russia.name().equals(this.f901a)) {
                str = "ru.app.chat.global.xiaomi.net";
            } else if (com.xiaomi.push.p.India.name().equals(this.f901a)) {
                str = "idmb.app.chat.global.xiaomi.net";
            }
            gr.a(str);
        } else {
            this.f901a = com.xiaomi.push.p.China.name();
        }
        if (com.xiaomi.push.p.China.name().equals(this.f901a)) {
            gr.a("cn.app.chat.xiaomi.net");
        }
        if (g()) {
            bq bqVar = new bq(this, 11);
            a((i) bqVar);
            l.a((l.a) new br(this, bqVar));
        }
        try {
            if (u.a()) {
                this.f898a.a((Context) this);
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: com.xiaomi.push.service.al$b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Intent r12) {
        /*
            r11 = this;
            com.xiaomi.push.service.al r0 = com.xiaomi.push.service.al.a()
            java.lang.String r1 = com.xiaomi.push.service.ap.f82518d
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x069f
            java.lang.String r1 = com.xiaomi.push.service.ap.j
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0021
            goto L_0x069f
        L_0x0021:
            java.lang.String r1 = com.xiaomi.push.service.ap.i
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x008c
            java.lang.String r1 = com.xiaomi.push.service.ap.z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r3 = com.xiaomi.push.service.ap.r
            java.lang.String r5 = r12.getStringExtra(r3)
            java.lang.String r3 = com.xiaomi.push.service.ap.p
            java.lang.String r6 = r12.getStringExtra(r3)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "Service called close channel chid = "
            r12.<init>(r3)
            r12.append(r5)
            java.lang.String r3 = " res = "
            r12.append(r3)
            java.lang.String r3 = com.xiaomi.push.service.al.b.a((java.lang.String) r6)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            boolean r12 = android.text.TextUtils.isEmpty(r5)
            if (r12 == 0) goto L_0x007a
            java.util.List r12 = r0.a((java.lang.String) r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x006a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x071e
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            r11.a((java.lang.String) r0, (int) r2)
            goto L_0x006a
        L_0x007a:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x0084
            r11.a((java.lang.String) r5, (int) r2)
            return
        L_0x0084:
            r7 = 2
            r8 = 0
            r9 = 0
            r4 = r11
            r4.a(r5, r6, r7, r8, r9)
            return
        L_0x008c:
            java.lang.String r1 = com.xiaomi.push.service.ap.f82519e
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x009c
            r11.a((android.content.Intent) r12)
            return
        L_0x009c:
            java.lang.String r1 = com.xiaomi.push.service.ap.g
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00ac
            r11.b((android.content.Intent) r12)
            return
        L_0x00ac:
            java.lang.String r1 = com.xiaomi.push.service.ap.f82520f
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00f0
            java.lang.String r1 = com.xiaomi.push.service.ap.z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.ap.C
            java.lang.String r2 = r12.getStringExtra(r2)
            com.xiaomi.push.hf r3 = new com.xiaomi.push.hf
            java.lang.String r4 = "ext_packet"
            android.os.Bundle r12 = r12.getBundleExtra(r4)
            r3.<init>(r12)
            com.xiaomi.push.hh r12 = r11.a((com.xiaomi.push.hh) r3, (java.lang.String) r1, (java.lang.String) r2)
            if (r12 == 0) goto L_0x071e
            com.xiaomi.push.service.aw r1 = new com.xiaomi.push.service.aw
            java.lang.String r2 = r12.k()
            java.lang.String r3 = r12.m()
            com.xiaomi.push.service.al$b r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r0 = r0.h
            com.xiaomi.push.gj r12 = com.xiaomi.push.gj.a((com.xiaomi.push.hh) r12, (java.lang.String) r0)
            r1.<init>(r11, r12)
            r11.c((com.xiaomi.push.service.XMPushService.i) r1)
            return
        L_0x00f0:
            java.lang.String r1 = com.xiaomi.push.service.ap.h
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0134
            java.lang.String r1 = com.xiaomi.push.service.ap.z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.ap.C
            java.lang.String r2 = r12.getStringExtra(r2)
            com.xiaomi.push.hj r3 = new com.xiaomi.push.hj
            java.lang.String r4 = "ext_packet"
            android.os.Bundle r12 = r12.getBundleExtra(r4)
            r3.<init>((android.os.Bundle) r12)
            com.xiaomi.push.hh r12 = r11.a((com.xiaomi.push.hh) r3, (java.lang.String) r1, (java.lang.String) r2)
            if (r12 == 0) goto L_0x071e
            com.xiaomi.push.service.aw r1 = new com.xiaomi.push.service.aw
            java.lang.String r2 = r12.k()
            java.lang.String r3 = r12.m()
            com.xiaomi.push.service.al$b r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r0 = r0.h
            com.xiaomi.push.gj r12 = com.xiaomi.push.gj.a((com.xiaomi.push.hh) r12, (java.lang.String) r0)
            r1.<init>(r11, r12)
            r11.c((com.xiaomi.push.service.XMPushService.i) r1)
            return
        L_0x0134:
            java.lang.String r1 = com.xiaomi.push.service.ap.k
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0199
            java.lang.String r0 = com.xiaomi.push.service.ap.r
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.ap.p
            java.lang.String r1 = r12.getStringExtra(r1)
            if (r0 == 0) goto L_0x071e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "request reset connection from chid = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r2)
            com.xiaomi.push.service.al r2 = com.xiaomi.push.service.al.a()
            com.xiaomi.push.service.al$b r0 = r2.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x071e
            java.lang.String r1 = r0.h
            java.lang.String r2 = com.xiaomi.push.service.ap.v
            java.lang.String r12 = r12.getStringExtra(r2)
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L_0x071e
            com.xiaomi.push.service.al$c r12 = r0.f937a
            com.xiaomi.push.service.al$c r0 = com.xiaomi.push.service.al.c.binded
            if (r12 != r0) goto L_0x071e
            com.xiaomi.push.gq r12 = r11.a()
            if (r12 == 0) goto L_0x0190
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 15000(0x3a98, double:7.411E-320)
            long r0 = r0 - r2
            boolean r12 = r12.a((long) r0)
            if (r12 != 0) goto L_0x071e
        L_0x0190:
            com.xiaomi.push.service.XMPushService$o r12 = new com.xiaomi.push.service.XMPushService$o
            r12.<init>()
            r11.c((com.xiaomi.push.service.XMPushService.i) r12)
            return
        L_0x0199:
            java.lang.String r1 = com.xiaomi.push.service.ap.l
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L_0x0225
            java.lang.String r1 = com.xiaomi.push.service.ap.z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.util.List r3 = r0.a((java.lang.String) r1)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x01c8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "open channel should be called first before update info, pkg="
            r12.<init>(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            return
        L_0x01c8:
            java.lang.String r1 = com.xiaomi.push.service.ap.r
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r5 = com.xiaomi.push.service.ap.p
            java.lang.String r5 = r12.getStringExtra(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L_0x01e0
            java.lang.Object r1 = r3.get(r4)
            java.lang.String r1 = (java.lang.String) r1
        L_0x01e0:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x01fe
            java.util.Collection r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x0202
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0202
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            r2 = r0
            com.xiaomi.push.service.al$b r2 = (com.xiaomi.push.service.al.b) r2
            goto L_0x0202
        L_0x01fe:
            com.xiaomi.push.service.al$b r2 = r0.a((java.lang.String) r1, (java.lang.String) r5)
        L_0x0202:
            if (r2 == 0) goto L_0x071e
            java.lang.String r0 = com.xiaomi.push.service.ap.x
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = com.xiaomi.push.service.ap.x
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.f82502e = r0
        L_0x0214:
            java.lang.String r0 = com.xiaomi.push.service.ap.y
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x071e
            java.lang.String r0 = com.xiaomi.push.service.ap.y
            java.lang.String r12 = r12.getStringExtra(r0)
            r2.f82503f = r12
            return
        L_0x0225:
            java.lang.String r0 = "com.xiaomi.mipush.REGISTER_APP"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02a3
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.as r0 = com.xiaomi.push.service.as.a(r0)
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0265
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.as r0 = com.xiaomi.push.service.as.a(r0)
            int r0 = r0.a()
            if (r0 != 0) goto L_0x0265
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "register without being provisioned. "
            r0.<init>(r1)
            java.lang.String r1 = "mipush_app_package"
            java.lang.String r12 = r12.getStringExtra(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            return
        L_0x0265:
            java.lang.String r0 = "mipush_payload"
            byte[] r9 = r12.getByteArrayExtra(r0)
            java.lang.String r0 = "mipush_app_package"
            java.lang.String r10 = r12.getStringExtra(r0)
            java.lang.String r0 = "mipush_env_chanage"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r1 = "mipush_env_type"
            int r8 = r12.getIntExtra(r1, r3)
            com.xiaomi.push.service.m r12 = com.xiaomi.push.service.m.a((android.content.Context) r11)
            r12.d(r10)
            if (r0 == 0) goto L_0x029f
            java.lang.String r12 = "com.xiaomi.xmsf"
            java.lang.String r0 = r11.getPackageName()
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x029f
            com.xiaomi.push.service.bs r12 = new com.xiaomi.push.service.bs
            r7 = 14
            r5 = r12
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r11.c((com.xiaomi.push.service.XMPushService.i) r12)
            return
        L_0x029f:
            r11.a((byte[]) r9, (java.lang.String) r10)
            return
        L_0x02a3:
            java.lang.String r0 = "com.xiaomi.mipush.SEND_MESSAGE"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0676
            java.lang.String r0 = "com.xiaomi.mipush.UNREGISTER_APP"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02bd
            goto L_0x0676
        L_0x02bd:
            java.lang.String r0 = com.xiaomi.push.service.at.f82523a
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0375
            java.lang.String r0 = "uninstall_pkg_name"
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x071e
            java.lang.String r0 = r12.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x071e
            android.content.pm.PackageManager r0 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02e3 }
            r0.getPackageInfo(r12, r4)     // Catch:{ NameNotFoundException -> 0x02e3 }
            r3 = 0
        L_0x02e3:
            java.lang.String r0 = "com.xiaomi.channel"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0308
            com.xiaomi.push.service.al r0 = com.xiaomi.push.service.al.a()
            java.lang.String r1 = "1"
            java.util.Collection r0 = r0.a((java.lang.String) r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0308
            if (r3 == 0) goto L_0x0308
            java.lang.String r12 = "1"
            r11.a((java.lang.String) r12, (int) r4)
            java.lang.String r12 = "close the miliao channel as the app is uninstalled."
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            return
        L_0x0308:
            java.lang.String r0 = "pref_registered_pkg_names"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r11, r0, r4)
            java.lang.String r1 = r0.getString(r12, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x071e
            if (r3 == 0) goto L_0x071e
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.remove(r12)
            r0.commit()
            boolean r0 = com.xiaomi.push.service.z.b((android.content.Context) r11, (java.lang.String) r12)
            if (r0 == 0) goto L_0x032d
            com.xiaomi.push.service.z.b((android.content.Context) r11, (java.lang.String) r12)
        L_0x032d:
            com.xiaomi.push.service.z.a((android.content.Context) r11, (java.lang.String) r12)
            boolean r0 = r11.c()
            if (r0 == 0) goto L_0x071e
            if (r1 == 0) goto L_0x071e
            com.xiaomi.push.jg r0 = com.xiaomi.push.service.w.a((java.lang.String) r12, (java.lang.String) r1)     // Catch:{ hb -> 0x0359 }
            com.xiaomi.push.service.w.a((com.xiaomi.push.service.XMPushService) r11, (com.xiaomi.push.jg) r0)     // Catch:{ hb -> 0x0359 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ hb -> 0x0359 }
            r0.<init>()     // Catch:{ hb -> 0x0359 }
            java.lang.String r1 = "uninstall "
            r0.append(r1)     // Catch:{ hb -> 0x0359 }
            r0.append(r12)     // Catch:{ hb -> 0x0359 }
            java.lang.String r12 = " msg sent"
            r0.append(r12)     // Catch:{ hb -> 0x0359 }
            java.lang.String r12 = r0.toString()     // Catch:{ hb -> 0x0359 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)     // Catch:{ hb -> 0x0359 }
            return
        L_0x0359:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fail to send Message: "
            r0.<init>(r1)
            java.lang.String r1 = r12.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r0)
            r0 = 10
            r11.a((int) r0, (java.lang.Exception) r12)
            return
        L_0x0375:
            java.lang.String r0 = "com.xiaomi.mipush.CLEAR_NOTIFICATION"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03ab
            java.lang.String r0 = com.xiaomi.push.service.ap.z
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.ap.A
            r2 = -2
            int r1 = r12.getIntExtra(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x071e
            r2 = -1
            if (r1 < r2) goto L_0x039b
            com.xiaomi.push.service.z.a((android.content.Context) r11, (java.lang.String) r0, (int) r1)
            return
        L_0x039b:
            java.lang.String r1 = com.xiaomi.push.service.ap.E
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.ap.F
            java.lang.String r12 = r12.getStringExtra(r2)
            com.xiaomi.push.service.z.a((android.content.Context) r11, (java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r12)
            return
        L_0x03ab:
            java.lang.String r0 = "com.xiaomi.mipush.SET_NOTIFICATION_TYPE"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = com.xiaomi.push.service.ap.z
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.ap.D
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.ap.B
            boolean r2 = r12.hasExtra(r2)
            if (r2 == 0) goto L_0x03e6
            java.lang.String r2 = com.xiaomi.push.service.ap.B
            int r12 = r12.getIntExtra(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.xiaomi.push.ay.b(r2)
            r3 = 0
            goto L_0x03eb
        L_0x03e6:
            java.lang.String r2 = com.xiaomi.push.ay.b(r0)
            r12 = 0
        L_0x03eb:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0402
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x03f8
            goto L_0x0402
        L_0x03f8:
            if (r3 == 0) goto L_0x03fe
            com.xiaomi.push.service.z.b((android.content.Context) r11, (java.lang.String) r0)
            return
        L_0x03fe:
            com.xiaomi.push.service.z.b(r11, r0, r12)
            return
        L_0x0402:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "invalid notification for "
            r12.<init>(r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r12)
            return
        L_0x0414:
            java.lang.String r0 = "com.xiaomi.mipush.DISABLE_PUSH"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x044b
            java.lang.String r0 = "mipush_app_package"
            java.lang.String r12 = r12.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0433
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.m.a((android.content.Context) r11)
            r0.b((java.lang.String) r12)
        L_0x0433:
            java.lang.String r12 = "com.xiaomi.xmsf"
            java.lang.String r0 = r11.getPackageName()
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x071e
            r12 = 19
            r11.a((int) r12, (java.lang.Exception) r2)
            r11.e()
            r11.stopSelf()
            return
        L_0x044b:
            java.lang.String r0 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05f5
            java.lang.String r0 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0465
            goto L_0x05f5
        L_0x0465:
            java.lang.String r0 = "com.xiaomi.mipush.SEND_TINYDATA"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0492
            java.lang.String r0 = "mipush_app_package"
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = "mipush_payload"
            byte[] r12 = r12.getByteArrayExtra(r1)
            com.xiaomi.push.io r1 = new com.xiaomi.push.io
            r1.<init>()
            com.xiaomi.push.ju.a(r1, (byte[]) r12)     // Catch:{ ka -> 0x048d }
            com.xiaomi.push.ii r12 = com.xiaomi.push.ii.a(r11)     // Catch:{ ka -> 0x048d }
            r12.a((com.xiaomi.push.io) r1, (java.lang.String) r0)     // Catch:{ ka -> 0x048d }
            return
        L_0x048d:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r12)
            return
        L_0x0492:
            java.lang.String r0 = "com.xiaomi.push.timer"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x04b0
            java.lang.String r12 = "Service called on timer"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            com.xiaomi.push.ga.a((boolean) r4)
            boolean r12 = r11.e()
            if (r12 == 0) goto L_0x071e
            r11.b((boolean) r4)
            return
        L_0x04b0:
            java.lang.String r0 = "com.xiaomi.push.check_alive"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x04cb
            java.lang.String r12 = "Service called on check alive."
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            boolean r12 = r11.e()
            if (r12 == 0) goto L_0x071e
            r11.b((boolean) r4)
            return
        L_0x04cb:
            java.lang.String r0 = "com.xiaomi.mipush.thirdparty"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04f8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "on thirdpart push :"
            r0.<init>(r1)
            java.lang.String r1 = "com.xiaomi.mipush.thirdparty_DESC"
            java.lang.String r1 = r12.getStringExtra(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            java.lang.String r0 = "com.xiaomi.mipush.thirdparty_LEVEL"
            int r12 = r12.getIntExtra(r0, r4)
            com.xiaomi.push.ga.a(r11, r12)
            return
        L_0x04f8:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0508
            r11.d()
            return
        L_0x0508:
            java.lang.String r0 = "action_cr_config"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0590
            java.lang.String r0 = "action_cr_event_switch"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r1 = "action_cr_event_frequency"
            r5 = 86400(0x15180, double:4.26873E-319)
            long r1 = r12.getLongExtra(r1, r5)
            java.lang.String r7 = "action_cr_perf_switch"
            boolean r4 = r12.getBooleanExtra(r7, r4)
            java.lang.String r7 = "action_cr_perf_frequency"
            long r5 = r12.getLongExtra(r7, r5)
            java.lang.String r7 = "action_cr_event_en"
            boolean r3 = r12.getBooleanExtra(r7, r3)
            java.lang.String r7 = "action_cr_max_file_size"
            r8 = 1048576(0x100000, double:5.180654E-318)
            long r7 = r12.getLongExtra(r7, r8)
            com.xiaomi.clientreport.data.Config$Builder r12 = com.xiaomi.clientreport.data.Config.getBuilder()
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setEventUploadSwitchOpen(r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setEventUploadFrequency(r1)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setPerfUploadSwitchOpen(r4)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setPerfUploadFrequency(r5)
            android.content.Context r0 = r11.getApplicationContext()
            java.lang.String r0 = com.xiaomi.push.bf.a((android.content.Context) r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setAESKey(r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setEventEncrypted(r3)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setMaxFileLength(r7)
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.clientreport.data.Config r12 = r12.build(r0)
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r3 = r11.getPackageName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x071e
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x071e
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x071e
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x071e
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.fy.a((android.content.Context) r0, (com.xiaomi.clientreport.data.Config) r12)
            return
        L_0x0590:
            java.lang.String r0 = "action_help_ping"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05e5
            java.lang.String r0 = "extra_help_ping_switch"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r1 = "extra_help_ping_frequency"
            int r1 = r12.getIntExtra(r1, r4)
            r2 = 30
            if (r1 < 0) goto L_0x05b5
            if (r1 >= r2) goto L_0x05b5
            java.lang.String r1 = "aw_ping: frquency need > 30s."
            com.xiaomi.channel.commonutils.logger.b.c(r1)
            r1 = 30
        L_0x05b5:
            if (r1 >= 0) goto L_0x05b8
            r0 = 0
        L_0x05b8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "aw_ping: receive a aw_ping message. switch: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " frequency: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r2)
            if (r0 == 0) goto L_0x071e
            if (r1 <= 0) goto L_0x071e
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r2 = r11.getPackageName()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x071e
            r11.a((android.content.Intent) r12, (int) r1)
            return
        L_0x05e5:
            java.lang.String r0 = "action_aw_app_logic"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x071e
            r11.d(r12)
            return
        L_0x05f5:
            java.lang.String r0 = "mipush_app_package"
            java.lang.String r3 = r12.getStringExtra(r0)
            java.lang.String r0 = "mipush_payload"
            byte[] r6 = r12.getByteArrayExtra(r0)
            java.lang.String r0 = "mipush_app_id"
            java.lang.String r4 = r12.getStringExtra(r0)
            java.lang.String r0 = "mipush_app_token"
            java.lang.String r5 = r12.getStringExtra(r0)
            java.lang.String r0 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0620
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.m.a((android.content.Context) r11)
            r0.c((java.lang.String) r3)
        L_0x0620:
            java.lang.String r0 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x063a
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.m.a((android.content.Context) r11)
            r0.e(r3)
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.m.a((android.content.Context) r11)
            r0.f(r3)
        L_0x063a:
            if (r6 != 0) goto L_0x0645
            r12 = 70000003(0x42c1d83, float:2.0232054E-36)
            java.lang.String r0 = "null payload"
            com.xiaomi.push.service.o.a(r11, r3, r6, r12, r0)
            return
        L_0x0645:
            com.xiaomi.push.service.o.b(r3, r6)
            com.xiaomi.push.service.n r0 = new com.xiaomi.push.service.n
            r1 = r0
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r11.a((com.xiaomi.push.service.XMPushService.i) r0)
            java.lang.String r0 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE"
            java.lang.String r12 = r12.getAction()
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x071e
            com.xiaomi.push.service.XMPushService$e r12 = r11.f895a
            if (r12 != 0) goto L_0x071e
            com.xiaomi.push.service.XMPushService$e r12 = new com.xiaomi.push.service.XMPushService$e
            r12.<init>()
            r11.f895a = r12
            android.content.IntentFilter r12 = new android.content.IntentFilter
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            r12.<init>(r0)
            com.xiaomi.push.service.XMPushService$e r0 = r11.f895a
            r11.registerReceiver(r0, r12)
            return
        L_0x0676:
            java.lang.String r0 = "mipush_app_package"
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = "mipush_payload"
            byte[] r1 = r12.getByteArrayExtra(r1)
            java.lang.String r2 = "com.xiaomi.mipush.MESSAGE_CACHE"
            boolean r2 = r12.getBooleanExtra(r2, r3)
            java.lang.String r3 = "com.xiaomi.mipush.UNREGISTER_APP"
            java.lang.String r12 = r12.getAction()
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x069b
            com.xiaomi.push.service.m r12 = com.xiaomi.push.service.m.a((android.content.Context) r11)
            r12.a((java.lang.String) r0)
        L_0x069b:
            r11.a((java.lang.String) r0, (byte[]) r1, (boolean) r2)
            return
        L_0x069f:
            java.lang.String r0 = com.xiaomi.push.service.ap.r
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.ap.v
            java.lang.String r1 = r12.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x06b7
            java.lang.String r12 = "security is empty. ignore."
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            goto L_0x071e
        L_0x06b7:
            if (r0 == 0) goto L_0x0723
            boolean r1 = r11.a((java.lang.String) r0, (android.content.Intent) r12)
            com.xiaomi.push.service.al$b r7 = r11.a((java.lang.String) r0, (android.content.Intent) r12)
            boolean r12 = com.xiaomi.push.at.b(r11)
            if (r12 != 0) goto L_0x06d1
            com.xiaomi.push.service.d r5 = r11.f898a
            r8 = 0
            r9 = 2
            r10 = 0
            r6 = r11
            r5.a(r6, r7, r8, r9, r10)
            return
        L_0x06d1:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x071f
            com.xiaomi.push.service.al$c r12 = r7.f937a
            com.xiaomi.push.service.al$c r0 = com.xiaomi.push.service.al.c.unbind
            if (r12 != r0) goto L_0x06e6
            com.xiaomi.push.service.XMPushService$a r12 = new com.xiaomi.push.service.XMPushService$a
            r12.<init>(r7)
            r11.c((com.xiaomi.push.service.XMPushService.i) r12)
            return
        L_0x06e6:
            if (r1 == 0) goto L_0x06f1
            com.xiaomi.push.service.XMPushService$n r12 = new com.xiaomi.push.service.XMPushService$n
            r12.<init>(r7)
            r11.c((com.xiaomi.push.service.XMPushService.i) r12)
            return
        L_0x06f1:
            com.xiaomi.push.service.al$c r12 = r7.f937a
            com.xiaomi.push.service.al$c r0 = com.xiaomi.push.service.al.c.binding
            if (r12 != r0) goto L_0x070f
            java.lang.String r12 = "the client is binding. %1$s %2$s."
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = r7.g
            r0[r4] = r1
            java.lang.String r1 = r7.f942b
            java.lang.String r1 = com.xiaomi.push.service.al.b.a((java.lang.String) r1)
            r0[r3] = r1
            java.lang.String r12 = java.lang.String.format(r12, r0)
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r12)
            return
        L_0x070f:
            com.xiaomi.push.service.al$c r12 = r7.f937a
            com.xiaomi.push.service.al$c r0 = com.xiaomi.push.service.al.c.binded
            if (r12 != r0) goto L_0x071e
            com.xiaomi.push.service.d r5 = r11.f898a
            r8 = 1
            r9 = 0
            r10 = 0
            r6 = r11
            r5.a(r6, r7, r8, r9, r10)
        L_0x071e:
            return
        L_0x071f:
            r11.a((boolean) r3)
            return
        L_0x0723:
            java.lang.String r12 = "channel id is empty, do nothing!"
            com.xiaomi.channel.commonutils.logger.b.d(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.c(android.content.Intent):void");
    }

    private void c(i iVar) {
        this.f899a.a((g.b) iVar);
    }

    private void c(boolean z) {
        try {
            if (u.a()) {
                if (z) {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                    for (ae a2 : (ae[]) this.f903a.toArray(new ae[0])) {
                        a2.a();
                    }
                } else {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
        }
    }

    private void d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
            networkInfo = null;
        }
        if (networkInfo != null) {
            StringBuilder sb = new StringBuilder("network changed,");
            sb.append("[" + "type: " + networkInfo.getTypeName() + "[" + networkInfo.getSubtypeName() + "], state: " + networkInfo.getState() + "/" + networkInfo.getDetailedState());
            com.xiaomi.channel.commonutils.logger.b.a(sb.toString());
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.a("network changed, no active network");
        }
        if (ic.a() != null) {
            ic.a().a();
        }
        hv.a((Context) this);
        this.f891a.d();
        if (at.b(this)) {
            if (c() && e()) {
                b(false);
            }
            if (!c() && !d()) {
                this.f899a.a(1);
                a((i) new d());
            }
            ec.a((Context) this).a();
        } else {
            a((i) new f(2, null));
        }
        e();
    }

    private void d(Intent intent) {
        int i2;
        try {
            fo.a(getApplicationContext()).a((fs) new ar());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra != null) {
                jj jjVar = new jj();
                ju.a(jjVar, byteArrayExtra);
                String b2 = jjVar.b();
                Map a2 = jjVar.a();
                if (a2 != null) {
                    String str = (String) a2.get("extra_help_aw_info");
                    String str2 = (String) a2.get("extra_aw_app_online_cmd");
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i2 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            i2 = 0;
                        }
                        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(b2) && !TextUtils.isEmpty(str)) {
                            fo.a(getApplicationContext()).a(this, str, i2, stringExtra, b2);
                        }
                    }
                }
            }
        } catch (ka e2) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_logic: translate fail. " + e2.getMessage());
        }
    }

    private void e() {
        if (a()) {
            if (!ga.a()) {
                ga.a(true);
            }
            return;
        }
        ga.a();
    }

    /* renamed from: e  reason: collision with other method in class */
    private boolean m574e() {
        if (System.currentTimeMillis() - this.f888a < 30000) {
            return false;
        }
        return at.c(this);
    }

    /* access modifiers changed from: private */
    public void f() {
        if (this.f892a != null && this.f892a.b()) {
            com.xiaomi.channel.commonutils.logger.b.d("try to connect while connecting.");
        } else if (this.f892a == null || !this.f892a.c()) {
            this.f893a.b(at.a((Context) this));
            g();
            if (this.f892a == null) {
                al.a().a((Context) this);
                c(false);
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("try to connect while is connected.");
        }
    }

    /* renamed from: f  reason: collision with other method in class */
    private boolean m575f() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.Secure.getInt(getContentResolver(), "EXTREME_POWER_MODE_ENABLE", 0) == 1;
    }

    private void g() {
        try {
            this.f891a.a(this.f894a, (hd) new bk(this));
            this.f891a.e();
            this.f892a = this.f891a;
        } catch (hb e2) {
            com.xiaomi.channel.commonutils.logger.b.a("fail to create Slim connection", (Throwable) e2);
            this.f891a.b(3, e2);
        }
    }

    /* renamed from: g  reason: collision with other method in class */
    private boolean m576g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) || !m.a((Context) this).b(getPackageName());
    }

    private void h() {
        if (Build.VERSION.SDK_INT < 18) {
            startForeground(f82461b, new Notification());
        } else {
            bindService(new Intent(this, this.f900a), new bl(this), 1);
        }
    }

    /* renamed from: h  reason: collision with other method in class */
    private boolean m577h() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return ag.a((Context) this).a(ip.ForegroundServiceSwitch.a(), false);
    }

    private void i() {
        synchronized (this.f902a) {
            this.f902a.clear();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public gq m578a() {
        return this.f892a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public d m579a() {
        return new d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m580a() {
        if (System.currentTimeMillis() - this.f888a >= ((long) gw.a()) && at.c(this)) {
            b(true);
        }
    }

    public void a(int i2) {
        this.f899a.a(i2);
    }

    public void a(int i2, Exception exc) {
        StringBuilder sb = new StringBuilder("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        sb.append(this.f892a == null ? null : Integer.valueOf(this.f892a.hashCode()));
        com.xiaomi.channel.commonutils.logger.b.a(sb.toString());
        if (this.f892a != null) {
            this.f892a.b(i2, exc);
            this.f892a = null;
        }
        a(7);
        a(4);
        al.a().a((Context) this, i2);
    }

    public void a(gj gjVar) {
        if (this.f892a != null) {
            this.f892a.b(gjVar);
            return;
        }
        throw new hb("try send msg while connection is null.");
    }

    public void a(gq gqVar) {
        ic.a().a(gqVar);
        c(true);
        this.f897a.a();
        Iterator it2 = al.a().a().iterator();
        while (it2.hasNext()) {
            a((i) new a((al.b) it2.next()));
        }
    }

    public void a(gq gqVar, int i2, Exception exc) {
        ic.a().a(gqVar, i2, exc);
        a(false);
    }

    public void a(gq gqVar, Exception exc) {
        ic.a().a(gqVar, exc);
        c(false);
        a(false);
    }

    public void a(i iVar) {
        a(iVar, 0);
    }

    public void a(i iVar, long j2) {
        try {
            this.f899a.a((g.b) iVar, j2);
        } catch (IllegalStateException unused) {
        }
    }

    public void a(l lVar) {
        synchronized (this.f902a) {
            this.f902a.add(lVar);
        }
    }

    public void a(al.b bVar) {
        if (bVar != null) {
            long a2 = bVar.a();
            com.xiaomi.channel.commonutils.logger.b.a("schedule rebind job in " + (a2 / 1000));
            a((i) new a(bVar), a2);
        }
    }

    public void a(String str, String str2, int i2, String str3, String str4) {
        al.b a2 = al.a().a(str, str2);
        if (a2 != null) {
            p pVar = new p(a2, i2, str4, str3);
            a((i) pVar);
        }
        al.a().a(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, byte[] bArr, boolean z) {
        Collection a2 = al.a().a("5");
        if (a2.isEmpty()) {
            if (z) {
                o.b(str, bArr);
            }
        } else if (((al.b) a2.iterator().next()).f937a == al.c.binded) {
            a((i) new bt(this, 4, str, bArr));
        } else if (z) {
            o.b(str, bArr);
        }
    }

    public void a(boolean z) {
        this.f897a.a(z);
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            o.a(this, str, bArr, 70000003, "null payload");
            com.xiaomi.channel.commonutils.logger.b.a("register request without payload");
            return;
        }
        jg jgVar = new jg();
        try {
            ju.a(jgVar, bArr);
            if (jgVar.f691a == ik.Registration) {
                jk jkVar = new jk();
                try {
                    ju.a(jkVar, jgVar.a());
                    o.a(jgVar.b(), bArr);
                    n nVar = new n(this, jgVar.b(), jkVar.b(), jkVar.c(), bArr);
                    a((i) nVar);
                    fz.a(getApplicationContext()).a(jgVar.b(), "E100003", jkVar.a(), 6002, "send a register message to server");
                } catch (ka e2) {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                    o.a(this, str, bArr, 70000003, " data action error.");
                }
            } else {
                o.a(this, str, bArr, 70000003, " registration action required.");
                com.xiaomi.channel.commonutils.logger.b.a("register request with invalid payload");
            }
        } catch (ka e3) {
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e3);
            o.a(this, str, bArr, 70000003, " data container error.");
        }
    }

    public void a(gj[] gjVarArr) {
        if (this.f892a != null) {
            this.f892a.a(gjVarArr);
            return;
        }
        throw new hb("try send msg while connection is null.");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m581a() {
        return at.b(this) && al.a().a() > 0 && !b() && g() && !f();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m582a(int i2) {
        return this.f899a.a(i2);
    }

    public d b() {
        return this.f898a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public void m583b() {
        Iterator it2 = new ArrayList(this.f902a).iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).a();
        }
    }

    public void b(gq gqVar) {
        com.xiaomi.channel.commonutils.logger.b.c("begin to connect...");
        ic.a().b(gqVar);
    }

    public void b(i iVar) {
        this.f899a.a(iVar.f82565a, (g.b) iVar);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m584b() {
        try {
            Class<?> cls = Class.forName("miui.os.Build");
            Field field = cls.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = cls.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = cls.getField("IS_CT_CUSTOMIZATION_TEST");
            if (field.getBoolean(null) || field2.getBoolean(null) || field3.getBoolean(null)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m585c() {
        return this.f892a != null && this.f892a.c();
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m586d() {
        return this.f892a != null && this.f892a.b();
    }

    public IBinder onBind(Intent intent) {
        return this.f890a.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        u.a((Context) this);
        k a2 = l.a((Context) this);
        if (a2 != null) {
            ac.a(a2.f82577a);
        }
        this.f890a = new Messenger(new bm(this));
        aq.a(this);
        bn bnVar = new bn(this, null, 5222, "xiaomi.com", null);
        this.f893a = bnVar;
        this.f893a.a(true);
        this.f891a = new go(this, this.f893a);
        this.f898a = a();
        ga.a((Context) this);
        this.f891a.a((gt) this);
        this.f896a = new ak(this);
        this.f897a = new av(this);
        new e().a();
        ic.a().a(this);
        this.f899a = new g("Connection Controller Thread");
        al a3 = al.a();
        a3.b();
        a3.a((al.a) new bo(this));
        if (h()) {
            h();
        }
        ii.a(this).a((ij) new i(this), "UPLOADER_PUSH_CHANNEL");
        a((l) new Cif(this));
        a((i) new g());
        this.f903a.add(bc.a((Context) this));
        if (g()) {
            this.f895a = new e();
            registerReceiver(this.f895a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.Secure.getUriFor("EXTREME_POWER_MODE_ENABLE");
            if (uriFor != null) {
                this.f889a = new bp(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f889a);
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.b.a("register observer err:" + th.getMessage());
                }
            }
        }
        com.xiaomi.channel.commonutils.logger.b.a("XMPushService created pid = " + f82461b);
    }

    public void onDestroy() {
        if (this.f895a != null) {
            a((BroadcastReceiver) this.f895a);
            this.f895a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f889a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f889a);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a("unregister observer err:" + th.getMessage());
            }
        }
        this.f903a.clear();
        this.f899a.b();
        a((i) new bj(this, 2));
        a((i) new j());
        al.a().b();
        al.a().a((Context) this, 15);
        al.a().a();
        this.f891a.b((gt) this);
        ba.a().a();
        ga.a();
        i();
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.b.a("Service destroyed");
    }

    public void onStart(Intent intent, int i2) {
        h hVar;
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.b.d("onStart() with intent NULL");
        } else {
            com.xiaomi.channel.commonutils.logger.b.c(String.format("onStart() with intent.Action = %s, chid = %s", new Object[]{intent.getAction(), intent.getStringExtra(ap.r)}));
        }
        if (!(intent == null || intent.getAction() == null)) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f899a.a()) {
                    com.xiaomi.channel.commonutils.logger.b.d("ERROR, the job controller is blocked.");
                    al.a().a((Context) this, 14);
                    stopSelf();
                } else {
                    hVar = new h(intent);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                hVar = new h(intent);
            }
            a((i) hVar);
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return f82460a;
    }
}
