package com.ss.optimizer.live.sdk.dns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.optimizer.live.sdk.a.d;
import com.ss.optimizer.live.sdk.a.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f78423a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message.what == 1024) {
                if (a.this.i) {
                    a.this.a();
                    return;
                }
                d.a().f78406c.a();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final Context f78424b;

    /* renamed from: c  reason: collision with root package name */
    public final BroadcastReceiver f78425c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Callable<?>> f78426d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78427e;

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f78428f;
    boolean g;
    public boolean h;
    public boolean i;
    public int j;
    private final ThreadPoolExecutor k;
    private final Map<String, g> l;
    private final Map<String, g> m;
    private long n;
    private e.a o;

    /* renamed from: com.ss.optimizer.live.sdk.dns.a$a  reason: collision with other inner class name */
    interface C0837a<T> {
        void a(T t);
    }

    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f78445a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f78446b;

        /* renamed from: c  reason: collision with root package name */
        private final String f78447c;

        private b() {
            ThreadGroup threadGroup;
            this.f78446b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f78445a = threadGroup;
            this.f78447c = "dns-optimizer-";
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f78445a;
            Thread thread = new Thread(threadGroup, runnable, this.f78447c + this.f78446b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }
    }

    static {
        f.f78449a = false;
    }

    @Nullable
    public final boolean b() {
        if (!this.f78427e) {
            return false;
        }
        return this.g;
    }

    public final String c() {
        if (this.m == null) {
            return null;
        }
        int i2 = 0;
        String str = "{ \"IpMap\":{";
        for (g gVar : this.m.values()) {
            if (gVar.f78451b != null) {
                if (i2 != 0) {
                    str = str + ",";
                }
                str = str + r3.toString();
                i2++;
            }
        }
        return str + "}}";
    }

    public final void a() {
        if (this.i && this.m != null) {
            if (this.m.size() == 0) {
                a((Callable<T>) new c<T>(c()), (C0837a<T>) new C0837a<com.ss.optimizer.live.sdk.a.a.a>() {
                    public final /* bridge */ /* synthetic */ void a(Object obj) {
                        a.this.a((com.ss.optimizer.live.sdk.a.a.a) obj);
                    }
                });
            } else {
                this.j = 0;
                for (g a2 : this.m.values()) {
                    a(a2);
                }
            }
        }
        this.f78423a.sendEmptyMessageDelayed(1024, this.n);
    }

    private void a(final g gVar) {
        a((Callable<T>) new e<T>(gVar.f78450a), (C0837a<T>) new C0837a<j>() {
            public final /* synthetic */ void a(Object obj) {
                j jVar = (j) obj;
                if (jVar == null) {
                    jVar = new j(gVar.f78450a, null, 0);
                }
                g gVar = gVar;
                gVar.f78451b = jVar;
                gVar.b();
                a.this.j++;
                if (a.this.j == a.this.f78428f.size()) {
                    a.this.a((Callable<T>) new c<T>(a.this.c()), (C0837a<T>) new C0837a<com.ss.optimizer.live.sdk.a.a.a>() {
                        public final /* bridge */ /* synthetic */ void a(Object obj) {
                            a.this.a((com.ss.optimizer.live.sdk.a.a.a) obj);
                        }
                    });
                }
                if (a.this.h) {
                    a aVar = a.this;
                    g gVar2 = gVar;
                    List<T> unmodifiableList = Collections.unmodifiableList(gVar2.f78452c);
                    if (!unmodifiableList.isEmpty()) {
                        for (T iVar : unmodifiableList) {
                            aVar.a((Callable<T>) new i<T>(iVar, 10), (C0837a<T>) new C0837a<h>(gVar2) {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ g f78435a;

                                public final /* synthetic */ void a(Object obj) {
                                    boolean z;
                                    h hVar = (h) obj;
                                    g gVar = this.f78435a;
                                    gVar.f78453d.put(hVar.f78457a, hVar);
                                    if (gVar.f78453d.size() == gVar.f78452c.size()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        ArrayList arrayList = new ArrayList(gVar.f78452c);
                                        Collections.sort(arrayList, new Comparator<String>() {
                                            public final /* synthetic */ int compare(Object obj, Object obj2) {
                                                h hVar = g.this.f78453d.get((String) obj);
                                                h hVar2 = g.this.f78453d.get((String) obj2);
                                                if (hVar == null && hVar2 == null) {
                                                    return 0;
                                                }
                                                if (hVar == null) {
                                                    return 1;
                                                }
                                                if (hVar2 == null) {
                                                    return -1;
                                                }
                                                int signum = (int) Math.signum(hVar.f78459c - hVar2.f78459c);
                                                if (signum == 0) {
                                                    signum = (int) Math.signum(hVar.f78460d - hVar2.f78460d);
                                                }
                                                return signum;
                                            }
                                        });
                                        gVar.f78454e.clear();
                                        if (arrayList.size() <= 3) {
                                            gVar.f78454e.addAll(arrayList);
                                        } else {
                                            gVar.f78454e.addAll(arrayList.subList(0, 3));
                                        }
                                    }
                                }

                                {
                                    this.f78435a = r2;
                                }
                            });
                        }
                    }
                }
            }
        });
    }

    public static boolean a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 == null) goto L_0x001a;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.f78427e
            r1 = 0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.g
            if (r0 != 0) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.g> r0 = r2.m
            java.lang.Object r0 = r0.get(r3)
            com.ss.optimizer.live.sdk.dns.g r0 = (com.ss.optimizer.live.sdk.dns.g) r0
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.a()
            if (r1 != 0) goto L_0x0028
        L_0x001a:
            java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.g> r0 = r2.l
            java.lang.Object r3 = r0.get(r3)
            com.ss.optimizer.live.sdk.dns.g r3 = (com.ss.optimizer.live.sdk.dns.g) r3
            if (r3 == 0) goto L_0x0028
            java.lang.String r1 = r3.a()
        L_0x0028:
            return r1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.optimizer.live.sdk.dns.a.a(java.lang.String):java.lang.String");
    }

    public a(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((byte) 0));
        this.k = threadPoolExecutor;
        this.k.allowCoreThreadTimeOut(true);
        this.f78425c = new DnsOptimizer$2(this);
        this.l = new ArrayMap();
        this.m = new ArrayMap();
        this.f78426d = new LinkedList();
        this.f78427e = false;
        this.n = 0;
        this.g = true;
        this.h = false;
        this.i = true;
        this.j = 0;
        this.o = null;
        this.f78424b = context;
        if (this.o == null) {
            this.o = new e.a() {
                public final void a(com.ss.optimizer.live.sdk.a.a.a aVar) {
                    a aVar2 = a.this;
                    if (aVar != null && aVar2.f78427e) {
                        aVar2.a(aVar);
                        if (aVar2.g) {
                            aVar2.a();
                        }
                    }
                }
            };
            e eVar = d.a().f78406c;
            eVar.f78408a.add(this.o);
        }
    }

    public final void a(com.ss.optimizer.live.sdk.a.a.a aVar) {
        if (aVar != null) {
            this.f78428f = aVar.a();
            this.n = (long) (aVar.f78389b * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            this.g = aVar.f78390c;
            this.i = aVar.f78391d;
            if (this.f78428f == null || this.f78428f.size() == 0) {
                this.m.clear();
                return;
            }
            for (String next : this.f78428f) {
                g gVar = new g(next);
                this.m.put(next, gVar);
                gVar.a(new j(next, aVar.a(next), 0));
                gVar.f78455f = aVar.f78388a;
            }
        }
    }

    @Nullable
    public final String a(String str, String str2) {
        if (!this.f78427e) {
            return null;
        }
        g gVar = this.m.get(str);
        if (gVar != null) {
            return gVar.a(str2);
        }
        g gVar2 = this.l.get(str);
        if (gVar2 != null) {
            return gVar2.a(str2);
        }
        return null;
    }

    public final <T> void a(final Callable<T> callable, final C0837a<T> aVar) {
        if (this.f78427e) {
            synchronized (this.f78426d) {
                this.f78426d.add(callable);
            }
            this.k.submit(new Runnable() {
                public final void run() {
                    boolean z;
                    synchronized (a.this.f78426d) {
                        z = !a.this.f78426d.contains(callable);
                    }
                    if (!z) {
                        final Object obj = null;
                        try {
                            obj = callable.call();
                        } catch (Exception unused) {
                        }
                        a.this.f78423a.post(new Runnable() {
                            public final void run() {
                                boolean z;
                                synchronized (a.this.f78426d) {
                                    z = !a.this.f78426d.remove(callable);
                                }
                                if (!z) {
                                    aVar.a(obj);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
