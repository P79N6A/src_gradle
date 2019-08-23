package com.ss.ugc.live.a;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    Thread f78615a;

    /* renamed from: b  reason: collision with root package name */
    String f78616b;

    /* renamed from: c  reason: collision with root package name */
    Object f78617c;

    /* renamed from: d  reason: collision with root package name */
    boolean f78618d;

    /* renamed from: e  reason: collision with root package name */
    boolean f78619e;

    /* renamed from: f  reason: collision with root package name */
    private Queue<a> f78620f;
    private int g;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public b f78621a;

        /* renamed from: b  reason: collision with root package name */
        public Object f78622b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public boolean f78623c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f78625e;

        public a(b bVar, boolean z) {
            this.f78621a = bVar;
            this.f78625e = z;
            this.f78623c = false;
        }
    }

    public interface b {
        void a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|52) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        r0 = r4.f78617c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.f78620f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.f78617c
            monitor-enter(r0)
            boolean r1 = r4.f78618d     // Catch:{ all -> 0x0055 }
            boolean r2 = r4.f78619e     // Catch:{ all -> 0x0055 }
            java.util.Queue<com.ss.ugc.live.a.k$a> r3 = r4.f78620f     // Catch:{ all -> 0x0055 }
            int r3 = r3.size()     // Catch:{ all -> 0x0055 }
            if (r3 > 0) goto L_0x0018
            if (r1 != 0) goto L_0x0018
            java.lang.Object r1 = r4.f78617c     // Catch:{ InterruptedException -> 0x0016 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0016 }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            goto L_0x0000
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x002d
            if (r2 == 0) goto L_0x0020
            if (r3 <= 0) goto L_0x0020
            goto L_0x002d
        L_0x0020:
            java.lang.Object r0 = r4.f78617c
            monitor-enter(r0)
            java.util.Queue<com.ss.ugc.live.a.k$a> r1 = r4.f78620f     // Catch:{ all -> 0x002a }
            r1.clear()     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        L_0x002d:
            if (r3 <= 0) goto L_0x0000
            java.lang.Object r0 = r4.f78617c
            monitor-enter(r0)
            java.util.Queue<com.ss.ugc.live.a.k$a> r1 = r4.f78620f     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0052 }
            com.ss.ugc.live.a.k$a r1 = (com.ss.ugc.live.a.k.a) r1     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0000
            com.ss.ugc.live.a.k$b r0 = r1.f78621a
            r0.a()
            java.lang.Object r0 = r1.f78622b
            monitor-enter(r0)
            r2 = 1
            r1.f78623c = r2     // Catch:{ all -> 0x004f }
            java.lang.Object r1 = r1.f78622b     // Catch:{ all -> 0x004f }
            r1.notifyAll()     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0000
        L_0x004f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r1
        L_0x0055:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.a.k.run():void");
    }

    public k(String str) {
        this(str, -1);
    }

    public final int a(b bVar) {
        return a(bVar, 0);
    }

    public final boolean b(b bVar) {
        synchronized (this.f78617c) {
            int size = this.f78620f.size();
            if (this.g > 0 && size == this.g) {
                return false;
            }
            this.f78620f.add(new a(bVar, false));
            this.f78617c.notifyAll();
            return true;
        }
    }

    private k(String str, int i) {
        this.f78616b = str;
        this.f78617c = new Object();
        this.g = -1;
        this.f78620f = new LinkedBlockingQueue();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:25|26|(1:(2:29|(4:32|33|(1:35)(0)|30))(1:36))(0)|37|38|(3:40|41|42)(2:43|44)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(com.ss.ugc.live.a.k.b r7, int r8) {
        /*
            r6 = this;
            java.lang.Thread r8 = r6.f78615a
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x005c
            java.lang.Thread r8 = r6.f78615a
            java.lang.Thread$State r8 = r8.getState()
            java.lang.Thread$State r2 = java.lang.Thread.State.NEW
            if (r8 == r2) goto L_0x005c
            java.lang.Thread r8 = r6.f78615a
            java.lang.Thread$State r8 = r8.getState()
            java.lang.Thread$State r2 = java.lang.Thread.State.TERMINATED
            if (r8 == r2) goto L_0x005c
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            long r2 = r8.getId()
            java.lang.Thread r8 = r6.f78615a
            long r4 = r8.getId()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0030
            r7.a()
            return r1
        L_0x0030:
            int r8 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r8 >= r2) goto L_0x005c
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r2 = "main"
            boolean r8 = r8.contentEquals(r2)
            if (r8 == 0) goto L_0x005c
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r8 = r8.getThreadGroup()
            java.lang.String r8 = r8.getName()
            java.lang.String r2 = "main"
            boolean r8 = r8.contentEquals(r2)
            if (r8 == 0) goto L_0x005c
            r8 = 1
            goto L_0x005d
        L_0x005c:
            r8 = 0
        L_0x005d:
            com.ss.ugc.live.a.k$a r2 = new com.ss.ugc.live.a.k$a
            r2.<init>(r7, r0)
            java.lang.Object r7 = r6.f78617c
            monitor-enter(r7)
            java.util.Queue<com.ss.ugc.live.a.k$a> r0 = r6.f78620f     // Catch:{ all -> 0x009d }
            r0.add(r2)     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r6.f78617c     // Catch:{ all -> 0x009d }
            r0.notifyAll()     // Catch:{ all -> 0x009d }
            monitor-exit(r7)     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r2.f78622b
            monitor-enter(r0)
            boolean r7 = r2.f78623c     // Catch:{ all -> 0x009a }
            if (r7 != 0) goto L_0x0091
            if (r8 == 0) goto L_0x008c
            r7 = 0
        L_0x007a:
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r7 >= r8) goto L_0x0091
            boolean r8 = r2.f78623c     // Catch:{ InterruptedException -> 0x0091 }
            if (r8 != 0) goto L_0x0091
            java.lang.Object r8 = r2.f78622b     // Catch:{ InterruptedException -> 0x0091 }
            r3 = 100
            r8.wait(r3)     // Catch:{ InterruptedException -> 0x0091 }
            int r7 = r7 + 100
            goto L_0x007a
        L_0x008c:
            java.lang.Object r7 = r2.f78622b     // Catch:{ InterruptedException -> 0x0091 }
            r7.wait()     // Catch:{ InterruptedException -> 0x0091 }
        L_0x0091:
            boolean r7 = r2.f78623c     // Catch:{ all -> 0x009a }
            if (r7 != 0) goto L_0x0098
            r7 = -1
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            return r7
        L_0x0098:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            return r1
        L_0x009a:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r7
        L_0x009d:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.a.k.a(com.ss.ugc.live.a.k$b, int):int");
    }
}
