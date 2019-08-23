package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ia;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;
import java.util.Hashtable;

public class ie {

    /* renamed from: a  reason: collision with root package name */
    private static final int f82223a = gf.PING_RTT.a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static Hashtable<Integer, Long> f82224a = new Hashtable<>();
    }

    public static void a() {
        a(0, f82223a);
    }

    public static void a(int i) {
        gg a2 = ic.a().a();
        a2.a(gf.CHANNEL_STATS_COUNTER.a());
        a2.c(i);
        ic.a().a(a2);
    }

    public static void a(int i, int i2) {
        synchronized (ie.class) {
            if (i2 < 16777215) {
                try {
                    a.f82224a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th) {
                    Class<ie> cls = ie.class;
                    throw th;
                }
            } else {
                b.d("stats key should less than 16777215");
            }
        }
    }

    public static void a(int i, int i2, int i3, String str, int i4) {
        gg a2 = ic.a().a();
        a2.a((byte) i);
        a2.a(i2);
        a2.b(i3);
        a2.b(str);
        a2.c(i4);
        ic.a().a(a2);
    }

    public static void a(int i, int i2, String str, int i3) {
        synchronized (ie.class) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int i4 = (i << 24) | i2;
                if (a.f82224a.containsKey(Integer.valueOf(i4))) {
                    gg a2 = ic.a().a();
                    a2.a(i2);
                    a2.b((int) (currentTimeMillis - a.f82224a.get(Integer.valueOf(i4)).longValue()));
                    a2.b(str);
                    if (i3 >= 0) {
                        a2.c(i3);
                    }
                    ic.a().a(a2);
                    a.f82224a.remove(Integer.valueOf(i2));
                } else {
                    b.d("stats key not found");
                }
            } catch (Throwable th) {
                Class<ie> cls = ie.class;
                throw th;
            }
        }
    }

    public static void a(XMPushService xMPushService, al.b bVar) {
        new hx(xMPushService, bVar).a();
    }

    public static void a(String str, int i, Exception exc) {
        gg a2 = ic.a().a();
        if (i > 0) {
            a2.a(gf.GSLB_REQUEST_SUCCESS.a());
            a2.b(str);
            a2.b(i);
            ic.a().a(a2);
            return;
        }
        try {
            ia.a a3 = ia.a(exc);
            a2.a(a3.f82213a.a());
            a2.c(a3.f516a);
            a2.b(str);
            ic.a().a(a2);
        } catch (NullPointerException unused) {
        }
    }

    public static void a(String str, Exception exc) {
        try {
            ia.a b2 = ia.b(exc);
            gg a2 = ic.a().a();
            a2.a(b2.f82213a.a());
            a2.c(b2.f516a);
            a2.b(str);
            ic.a().a(a2);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static byte[] m392a() {
        gh a2 = ic.a().a();
        if (a2 != null) {
            return ju.a(a2);
        }
        return null;
    }

    public static void b() {
        a(0, f82223a, null, -1);
    }

    public static void b(String str, Exception exc) {
        try {
            ia.a d2 = ia.d(exc);
            gg a2 = ic.a().a();
            a2.a(d2.f82213a.a());
            a2.c(d2.f516a);
            a2.b(str);
            ic.a().a(a2);
        } catch (NullPointerException unused) {
        }
    }
}
