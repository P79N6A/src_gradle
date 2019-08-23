package com.xiaomi.push;

import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.ap;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class gq {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f82116a = new AtomicInteger(0);

    /* renamed from: a  reason: collision with other field name */
    public static boolean f452a;

    /* renamed from: a  reason: collision with other field name */
    protected int f453a;

    /* renamed from: a  reason: collision with other field name */
    protected long f454a = -1;

    /* renamed from: a  reason: collision with other field name */
    protected gr f455a;

    /* renamed from: a  reason: collision with other field name */
    protected hc f456a = null;

    /* renamed from: a  reason: collision with other field name */
    protected XMPushService f457a;

    /* renamed from: a  reason: collision with other field name */
    protected String f458a = "";

    /* renamed from: a  reason: collision with other field name */
    private final Collection<gt> f459a = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with other field name */
    private LinkedList<Pair<Integer, Long>> f460a = new LinkedList<>();

    /* renamed from: a  reason: collision with other field name */
    protected final Map<gv, a> f461a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    protected final int f82117b = f82116a.getAndIncrement();

    /* renamed from: b  reason: collision with other field name */
    protected volatile long f462b;

    /* renamed from: b  reason: collision with other field name */
    protected String f463b = "";

    /* renamed from: b  reason: collision with other field name */
    protected final Map<gv, a> f464b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private int f82118c = 2;

    /* renamed from: c  reason: collision with other field name */
    protected volatile long f465c;

    /* renamed from: d  reason: collision with root package name */
    protected long f82119d = 0;

    /* renamed from: e  reason: collision with root package name */
    private long f82120e = 0;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private gv f82121a;

        /* renamed from: a  reason: collision with other field name */
        private hd f466a;

        public a(gv gvVar, hd hdVar) {
            this.f82121a = gvVar;
            this.f466a = hdVar;
        }

        public void a(gj gjVar) {
            this.f82121a.a(gjVar);
        }

        public void a(hh hhVar) {
            if (this.f466a == null || this.f466a.a(hhVar)) {
                this.f82121a.a(hhVar);
            }
        }
    }

    static {
        f452a = false;
        try {
            f452a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        gw.a();
    }

    protected gq(XMPushService xMPushService, gr grVar) {
        this.f455a = grVar;
        this.f457a = xMPushService;
        b();
    }

    private String a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : "unknown";
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m340a(int i) {
        synchronized (this.f460a) {
            if (i == 1) {
                try {
                    this.f460a.clear();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f460a.add(new Pair(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f460a.size() > 6) {
                    this.f460a.remove(0);
                }
            }
        }
    }

    public int a() {
        return this.f453a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m341a() {
        return this.f465c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public gr m342a() {
        return this.f455a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m343a() {
        return this.f455a.c();
    }

    public void a(int i, int i2, Exception exc) {
        if (i != this.f82118c) {
            b.a(String.format("update the connection status. %1$s -> %2$s : %3$s ", new Object[]{a(this.f82118c), a(i), ap.a(i2)}));
        }
        if (at.b(this.f457a)) {
            a(i);
        }
        if (i == 1) {
            this.f457a.a(10);
            if (this.f82118c != 0) {
                b.a("try set connected while not connecting.");
            }
            this.f82118c = i;
            for (gt a2 : this.f459a) {
                a2.a(this);
            }
        } else if (i == 0) {
            if (this.f82118c != 2) {
                b.a("try set connecting while not disconnected.");
            }
            this.f82118c = i;
            for (gt b2 : this.f459a) {
                b2.b(this);
            }
        } else if (i == 2) {
            this.f457a.a(10);
            if (this.f82118c == 0) {
                for (gt a3 : this.f459a) {
                    a3.a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (this.f82118c == 1) {
                for (gt a4 : this.f459a) {
                    a4.a(this, i2, exc);
                }
            }
            this.f82118c = i;
        }
    }

    public void a(gt gtVar) {
        if (gtVar != null && !this.f459a.contains(gtVar)) {
            this.f459a.add(gtVar);
        }
    }

    public void a(gv gvVar, hd hdVar) {
        if (gvVar != null) {
            this.f461a.put(gvVar, new a(gvVar, hdVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    public abstract void a(hh hhVar);

    public abstract void a(al.b bVar);

    public void a(String str) {
        synchronized (this) {
            if (this.f82118c == 0) {
                b.a("setChallenge hash = " + ay.a(str).substring(0, 8));
                this.f458a = str;
                a(1, 0, null);
            } else {
                b.a("ignore setChallenge because connection was disconnected");
            }
        }
    }

    public abstract void a(String str, String str2);

    public abstract void a(gj[] gjVarArr);

    /* renamed from: a  reason: collision with other method in class */
    public boolean m344a() {
        return false;
    }

    public boolean a(long j) {
        boolean z;
        synchronized (this) {
            z = this.f82120e >= j;
        }
        return z;
    }

    public int b() {
        return this.f82118c;
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m345b() {
        return this.f455a.b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: collision with other method in class */
    public void m346b() {
        String str;
        if (this.f455a.a() && this.f456a == null) {
            Class<?> cls = null;
            try {
                str = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    cls = Class.forName(str);
                } catch (Exception unused2) {
                }
            }
            if (cls == null) {
                this.f456a = new bj(this);
            } else {
                try {
                    this.f456a = (hc) cls.getConstructor(new Class[]{gq.class, Writer.class, Reader.class}).newInstance(new Object[]{this});
                } catch (Exception e2) {
                    throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
                }
            }
        }
    }

    public abstract void b(int i, Exception exc);

    public abstract void b(gj gjVar);

    public void b(gt gtVar) {
        this.f459a.remove(gtVar);
    }

    public void b(gv gvVar, hd hdVar) {
        if (gvVar != null) {
            this.f464b.put(gvVar, new a(gvVar, hdVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    public abstract void b(boolean z);

    /* renamed from: b  reason: collision with other method in class */
    public boolean m347b() {
        return this.f82118c == 0;
    }

    public void c() {
        synchronized (this) {
            this.f82120e = System.currentTimeMillis();
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m348c() {
        return this.f82118c == 1;
    }

    public void d() {
        synchronized (this.f460a) {
            this.f460a.clear();
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m349d() {
        boolean z;
        synchronized (this) {
            z = System.currentTimeMillis() - this.f82120e < ((long) gw.a());
        }
        return z;
    }

    public boolean e() {
        boolean z;
        synchronized (this) {
            z = true;
            if (System.currentTimeMillis() - this.f82119d >= ((long) (gw.a() << 1))) {
                z = false;
            }
        }
        return z;
    }
}
