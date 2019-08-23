package com.xiaomi.push;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.BuildConfig;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.av;
import com.xiaomi.push.km;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ba;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ic {

    /* renamed from: a  reason: collision with root package name */
    private int f82220a;

    /* renamed from: a  reason: collision with other field name */
    private long f522a;

    /* renamed from: a  reason: collision with other field name */
    private av f523a = av.a();

    /* renamed from: a  reason: collision with other field name */
    private ib f524a;

    /* renamed from: a  reason: collision with other field name */
    private String f525a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f526a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final ic f82221a = new ic();
    }

    private gg a(av.a aVar) {
        if (aVar.f162a != 0) {
            gg a2 = a();
            a2.a(gf.CHANNEL_STATS_COUNTER.a());
            a2.c(aVar.f162a);
            a2.c(aVar.f164a);
            return a2;
        } else if (aVar.f163a instanceof gg) {
            return (gg) aVar.f163a;
        } else {
            return null;
        }
    }

    private gh a(int i) {
        ArrayList arrayList = new ArrayList();
        gh ghVar = new gh(this.f525a, arrayList);
        if (!at.d(this.f524a.f519a)) {
            ghVar.a(j.m(this.f524a.f519a));
        }
        ko koVar = new ko(i);
        kg a2 = new km.a().a(koVar);
        try {
            ghVar.b(a2);
        } catch (ka unused) {
        }
        LinkedList a3 = this.f523a.a();
        while (true) {
            try {
                if (a3.size() <= 0) {
                    break;
                }
                gg a4 = a((av.a) a3.getLast());
                if (a4 != null) {
                    a4.b(a2);
                }
                if (koVar.a_() > i) {
                    break;
                }
                if (a4 != null) {
                    arrayList.add(a4);
                }
                a3.removeLast();
            } catch (ka | NoSuchElementException unused2) {
            }
        }
        return ghVar;
    }

    public static ib a() {
        ib ibVar;
        synchronized (a.f82221a) {
            ibVar = a.f82221a.f524a;
        }
        return ibVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static ic m386a() {
        return a.f82221a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m387a() {
        if (this.f526a && System.currentTimeMillis() - this.f522a > ((long) this.f82220a)) {
            this.f526a = false;
            this.f522a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public gg m388a() {
        gg ggVar;
        synchronized (this) {
            ggVar = new gg();
            ggVar.a(at.a((Context) this.f524a.f519a));
            ggVar.f417a = 0;
            ggVar.f421b = 1;
            ggVar.d((int) (System.currentTimeMillis() / 1000));
        }
        return ggVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public gh m389a() {
        gh ghVar;
        synchronized (this) {
            if (b()) {
                int i = BuildConfig.VERSION_CODE;
                if (!at.d(this.f524a.f519a)) {
                    i = 375;
                }
                ghVar = a(i);
            } else {
                ghVar = null;
            }
        }
        return ghVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m390a(int i) {
        if (i > 0) {
            int i2 = i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f82220a != i2 || !this.f526a) {
                this.f526a = true;
                this.f522a = System.currentTimeMillis();
                this.f82220a = i2;
                b.c("enable dot duration = " + i2 + " start = " + this.f522a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(gg ggVar) {
        synchronized (this) {
            this.f523a.a(ggVar);
        }
    }

    public void a(XMPushService xMPushService) {
        synchronized (this) {
            this.f524a = new ib(xMPushService);
            this.f525a = "";
            ba.a().a((ba.a) new id(this));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m391a() {
        return this.f526a;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        a();
        return this.f526a && this.f523a.a() > 0;
    }
}
