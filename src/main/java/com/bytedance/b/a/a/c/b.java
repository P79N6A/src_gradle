package com.bytedance.b.a.a.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import com.bytedance.b.a.a.b.c;
import com.bytedance.b.a.a.b.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class b implements Handler.Callback, com.bytedance.b.a.a.b.a {

    /* renamed from: a  reason: collision with root package name */
    private List<com.bytedance.b.a.a.b.b> f19143a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private long f19144b;

    /* renamed from: c  reason: collision with root package name */
    public List<d> f19145c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<c> f19146d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.b.a.a.e.b f19147e;

    /* renamed from: f  reason: collision with root package name */
    volatile a f19148f;
    Handler g;

    /* renamed from: com.bytedance.b.a.a.c.b$8  reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19177a = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.b.a.a.c.b$a[] r0 = com.bytedance.b.a.a.c.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19177a = r0
                int[] r0 = f19177a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.b.a.a.c.b$a r1 = com.bytedance.b.a.a.c.b.a.IDLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f19177a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.b.a.a.c.b$a r1 = com.bytedance.b.a.a.c.b.a.DESTROYING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f19177a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.b.a.a.c.b$a r1 = com.bytedance.b.a.a.c.b.a.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f19177a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.b.a.a.c.b$a r1 = com.bytedance.b.a.a.c.b.a.STOPPING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f19177a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.b.a.a.c.b$a r1 = com.bytedance.b.a.a.c.b.a.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f19177a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.b.a.a.c.b$a r1 = com.bytedance.b.a.a.c.b.a.STARTING     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f19177a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.b.a.a.c.b$a r1 = com.bytedance.b.a.a.c.b.a.STARTED     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.a.a.c.b.AnonymousClass8.<clinit>():void");
        }
    }

    enum a {
        IDLE,
        INITIALIZING,
        INITIALIZED,
        STARTING,
        STARTED,
        STOPPING,
        DESTROYING
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public final synchronized void a(boolean z) {
        if (this.f19148f == a.STARTED) {
            this.f19147e.a(z);
        }
    }

    public final synchronized void a(d dVar) {
        if (!this.f19145c.contains(dVar)) {
            this.f19145c.add(dVar);
        }
    }

    public final void a(final String[] strArr, final boolean[] zArr) {
        if (this.f19148f != a.STARTED) {
            new StringBuilder("receive onSelfVolumeUpdated callback, but state is ").append(this.f19148f.name());
        } else {
            this.g.post(new Runnable() {
                public final void run() {
                    for (d a2 : b.this.f19145c) {
                        a2.a(strArr, zArr);
                    }
                }
            });
        }
    }

    public final synchronized void a() {
        if (this.f19148f != a.INITIALIZING) {
            new StringBuilder("receive onInitSuccess callback, but state is ").append(this.f19148f.name());
            return;
        }
        this.f19148f = a.STARTING;
        this.f19147e.b();
    }

    public synchronized void b() {
        if (this.f19148f != a.STARTING) {
            new StringBuilder("receive onStartSuccess callback, but state is ").append(this.f19148f.name());
            return;
        }
        this.f19148f = a.STARTED;
        this.g.post(new Runnable() {
            public final void run() {
                for (c e2 : b.this.f19146d) {
                    e2.e();
                }
            }
        });
    }

    public final synchronized void c() {
        if (this.f19148f != a.STOPPING) {
            new StringBuilder("receive onStopSuccess callback, but state is ").append(this.f19148f.name());
            return;
        }
        this.f19148f = a.DESTROYING;
        this.f19147e.d();
    }

    public final synchronized void d() {
        if (this.f19148f != a.DESTROYING) {
            new StringBuilder("receive onDestroySuccess callback, but state is ").append(this.f19148f.name());
            return;
        }
        this.f19148f = a.IDLE;
        this.g.post(new Runnable() {
            public final void run() {
                for (c e_ : b.this.f19146d) {
                    e_.e_();
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.bytedance.b.a.a.c.b.AnonymousClass8.f19177a     // Catch:{ all -> 0x0034 }
            com.bytedance.b.a.a.c.b$a r1 = r2.f19148f     // Catch:{ all -> 0x0034 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0034 }
            r0 = r0[r1]     // Catch:{ all -> 0x0034 }
            switch(r0) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0027;
                case 3: goto L_0x001c;
                case 4: goto L_0x001c;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0034 }
        L_0x000e:
            goto L_0x0032
        L_0x000f:
            android.os.Handler r0 = r2.g     // Catch:{ all -> 0x0034 }
            com.bytedance.b.a.a.c.b$1 r1 = new com.bytedance.b.a.a.c.b$1     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            r0.post(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            com.bytedance.b.a.a.c.b$a r0 = com.bytedance.b.a.a.c.b.a.STARTING     // Catch:{ all -> 0x0034 }
            r2.f19148f = r0     // Catch:{ all -> 0x0034 }
            com.bytedance.b.a.a.e.b r0 = r2.f19147e     // Catch:{ all -> 0x0034 }
            r0.b()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0027:
            com.bytedance.b.a.a.c.b$a r0 = com.bytedance.b.a.a.c.b.a.INITIALIZING     // Catch:{ all -> 0x0034 }
            r2.f19148f = r0     // Catch:{ all -> 0x0034 }
            com.bytedance.b.a.a.e.b r0 = r2.f19147e     // Catch:{ all -> 0x0034 }
            r0.a()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0032:
            monitor-exit(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.a.a.c.b.f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.bytedance.b.a.a.c.b.AnonymousClass8.f19177a     // Catch:{ all -> 0x0037 }
            com.bytedance.b.a.a.c.b$a r1 = r2.f19148f     // Catch:{ all -> 0x0037 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0037 }
            r0 = r0[r1]     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 3
            if (r0 == r1) goto L_0x0020
            switch(r0) {
                case 5: goto L_0x0020;
                case 6: goto L_0x0015;
                case 7: goto L_0x0015;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x0037 }
        L_0x0014:
            goto L_0x001e
        L_0x0015:
            com.bytedance.b.a.a.c.b$a r0 = com.bytedance.b.a.a.c.b.a.STOPPING     // Catch:{ all -> 0x0037 }
            r2.f19148f = r0     // Catch:{ all -> 0x0037 }
            com.bytedance.b.a.a.e.b r0 = r2.f19147e     // Catch:{ all -> 0x0037 }
            r0.c()     // Catch:{ all -> 0x0037 }
        L_0x001e:
            monitor-exit(r2)
            return
        L_0x0020:
            com.bytedance.b.a.a.c.b$a r0 = com.bytedance.b.a.a.c.b.a.DESTROYING     // Catch:{ all -> 0x0037 }
            r2.f19148f = r0     // Catch:{ all -> 0x0037 }
            com.bytedance.b.a.a.e.b r0 = r2.f19147e     // Catch:{ all -> 0x0037 }
            r0.d()     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x002b:
            android.os.Handler r0 = r2.g     // Catch:{ all -> 0x0037 }
            com.bytedance.b.a.a.c.b$9 r1 = new com.bytedance.b.a.a.c.b$9     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            r0.post(r1)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.a.a.c.b.g():void");
    }

    public final void a(final String str) {
        this.g.post(new Runnable() {
            public final void run() {
                for (c a2 : b.this.f19146d) {
                    a2.a(str);
                }
            }
        });
    }

    public final synchronized void b(com.bytedance.b.a.a.b.b bVar) {
        this.f19143a.remove(bVar);
    }

    public final synchronized void b(c cVar) {
        this.f19146d.remove(cVar);
    }

    public void a(final int i) {
        if (this.f19148f != a.STARTED) {
            new StringBuilder("receive onUserJoined callback, but state is ").append(this.f19148f.name());
        } else {
            this.g.post(new Runnable() {
                public final void run() {
                    for (d d2 : b.this.f19145c) {
                        d2.d(i);
                    }
                }
            });
        }
    }

    public final void b(final int i) {
        if (this.f19148f != a.STARTED) {
            new StringBuilder("receive onFirstRemoteAudioFrame callback, but state is ").append(this.f19148f.name());
        } else {
            this.g.post(new Runnable() {
                public final void run() {
                    Iterator<d> it2 = b.this.f19145c.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            });
        }
    }

    public synchronized void c(final int i) {
        if (this.f19148f != a.STARTED) {
            new StringBuilder("receive onUserLeaved callback, but state is ").append(this.f19148f.name());
        } else {
            this.g.post(new Runnable() {
                public final void run() {
                    for (d e2 : b.this.f19145c) {
                        e2.e(i);
                    }
                }
            });
        }
    }

    public final void d(int i) {
        if (System.currentTimeMillis() - this.f19144b >= 10000) {
            this.f19144b = System.currentTimeMillis();
            for (com.bytedance.b.a.a.b.b f2 : this.f19143a) {
                f2.f(i);
            }
        }
    }

    public final synchronized void b(d dVar) {
        this.f19145c.remove(dVar);
    }

    public final synchronized void a(com.bytedance.b.a.a.b.b bVar) {
        if (!this.f19143a.contains(bVar)) {
            this.f19143a.add(bVar);
        }
    }

    public final void b(final String str) {
        this.g.post(new Runnable() {
            public final void run() {
                for (c b2 : b.this.f19146d) {
                    b2.b(str);
                }
            }
        });
    }

    public final synchronized void a(c cVar) {
        if (!this.f19146d.contains(cVar)) {
            this.f19146d.add(cVar);
        }
    }

    public final void a(long j, long j2) {
        for (com.bytedance.b.a.a.b.b a2 : this.f19143a) {
            a2.a(j, j2);
        }
    }

    public final void a(final int i, final SurfaceView surfaceView) {
        if (this.f19148f != a.STARTED) {
            new StringBuilder("receive onFirstRemoteVideoFrame callback, but state is ").append(this.f19148f.name());
        } else {
            this.g.post(new Runnable() {
                public final void run() {
                    for (d a2 : b.this.f19145c) {
                        a2.a(i, surfaceView);
                    }
                }
            });
        }
    }

    public final synchronized void b(int i, final String str) {
        if (this.f19148f != a.STARTING) {
            new StringBuilder("receive onStartFailed callback, but state is ").append(this.f19148f.name());
            return;
        }
        this.f19148f = a.INITIALIZED;
        this.g.post(new Runnable(10006) {
            public final void run() {
                for (c a2 : b.this.f19146d) {
                    a2.a(10006, str);
                }
            }
        });
    }

    public final synchronized void c(int i, final String str) {
        if (this.f19148f != a.STOPPING) {
            new StringBuilder("receive onStopFailed callback, but state is ").append(this.f19148f.name());
            return;
        }
        this.f19148f = a.STARTED;
        this.g.post(new Runnable(10007) {
            public final void run() {
                for (c b2 : b.this.f19146d) {
                    b2.b(10007, str);
                }
            }
        });
    }

    public final synchronized void a(final int i, final String str) {
        if (this.f19148f != a.INITIALIZING) {
            new StringBuilder("receive onInitFailed callback, but state is ").append(this.f19148f.name());
            return;
        }
        this.f19148f = a.IDLE;
        this.g.post(new Runnable() {
            public final void run() {
                for (c a2 : b.this.f19146d) {
                    a2.a(i, str);
                }
            }
        });
    }

    b(com.bytedance.b.a.a.f.a aVar, com.bytedance.b.a.a.g.d dVar, com.bytedance.b.a.a.a.b bVar) {
        com.bytedance.b.a.a.e.c cVar = com.bytedance.b.a.a.e.d.f19192a.get(aVar.f19194b);
        if (cVar != null) {
            this.f19147e = cVar.a(aVar, dVar, bVar, this);
            this.f19148f = a.IDLE;
            this.g = new Handler(Looper.getMainLooper(), this);
            return;
        }
        throw new IllegalStateException("Engine with vendor " + aVar.f19194b + " not registered in InteractService");
    }
}
