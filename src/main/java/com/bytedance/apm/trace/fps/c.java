package com.bytedance.apm.trace.fps;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.Choreographer;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.frameworks.apm.trace.e;
import java.util.LinkedList;

@TargetApi(16)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f19086a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f19087b;

    /* renamed from: c  reason: collision with root package name */
    LinkedList<Integer> f19088c;

    /* renamed from: d  reason: collision with root package name */
    final com.bytedance.apm.trace.c f19089d;

    /* renamed from: e  reason: collision with root package name */
    public long f19090e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f19091f = -1;
    public int g;
    private Choreographer.FrameCallback h;

    public final void a() {
        if (Build.VERSION.SDK_INT >= 16 && !this.f19087b) {
            this.f19087b = true;
            synchronized (this) {
                this.f19088c.clear();
            }
            this.f19090e = -1;
            this.f19091f = -1;
            this.g = 0;
            this.h = new Choreographer.FrameCallback() {
                public final void doFrame(long j) {
                    if (c.this.f19090e == -1) {
                        c.this.f19090e = j;
                    }
                    c.this.g++;
                    if (c.this.f19087b) {
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                    c cVar = c.this;
                    long j2 = c.this.f19091f;
                    if (cVar.f19091f <= 0) {
                        a.a(false, null, 0);
                    } else {
                        long j3 = j - j2;
                        long j4 = j3 / 1000000;
                        if (j4 > 0) {
                            if (j4 > ((long) cVar.f19089d.f2086c)) {
                                a.a(true, cVar.f19086a, j4);
                            } else {
                                a.a(false, null, 0);
                            }
                            synchronized (cVar) {
                                if (cVar.f19088c.size() > 20000) {
                                    cVar.f19088c.poll();
                                }
                                cVar.f19088c.add(Integer.valueOf(((int) j3) / 10000));
                            }
                        }
                    }
                    c.this.f19091f = j;
                }
            };
            e.a(true);
            Choreographer.getInstance().postFrameCallback(this.h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        com.bytedance.apm.j.b.a().a((java.lang.Runnable) new com.bytedance.apm.trace.fps.c.AnonymousClass2(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007b }
            r1 = 16
            if (r0 >= r1) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            boolean r0 = r7.f19087b     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0079
            r0 = 0
            r7.f19087b = r0     // Catch:{ all -> 0x007b }
            long r1 = r7.f19091f     // Catch:{ all -> 0x007b }
            long r3 = r7.f19090e     // Catch:{ all -> 0x007b }
            r5 = 0
            long r1 = r1 - r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0040
            int r3 = r7.g     // Catch:{ all -> 0x007b }
            r4 = 1
            if (r3 > r4) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            int r3 = r7.g     // Catch:{ all -> 0x007b }
            int r3 = r3 - r4
            long r3 = (long) r3     // Catch:{ all -> 0x007b }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            long r3 = r3 * r5
            long r3 = r3 * r5
            long r3 = r3 / r1
            com.bytedance.apm.trace.fps.b r1 = com.bytedance.apm.trace.fps.b.C0141b.f19085a     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r7.f19086a     // Catch:{ all -> 0x007b }
            float r3 = (float) r3     // Catch:{ all -> 0x007b }
            com.bytedance.apm.j.b r4 = com.bytedance.apm.j.b.a()     // Catch:{ all -> 0x007b }
            com.bytedance.apm.trace.fps.b$1 r5 = new com.bytedance.apm.trace.fps.b$1     // Catch:{ all -> 0x007b }
            r5.<init>(r2, r3)     // Catch:{ all -> 0x007b }
            r4.a((java.lang.Runnable) r5)     // Catch:{ all -> 0x007b }
        L_0x0040:
            android.view.Choreographer$FrameCallback r1 = r7.h     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x004d
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()     // Catch:{ all -> 0x007b }
            android.view.Choreographer$FrameCallback r2 = r7.h     // Catch:{ all -> 0x007b }
            r1.removeFrameCallback(r2)     // Catch:{ all -> 0x007b }
        L_0x004d:
            com.bytedance.frameworks.apm.trace.e.a((boolean) r0)     // Catch:{ all -> 0x007b }
            com.bytedance.frameworks.apm.trace.e.b()     // Catch:{ all -> 0x007b }
            monitor-enter(r7)     // Catch:{ all -> 0x007b }
            java.util.LinkedList<java.lang.Integer> r0 = r7.f19088c     // Catch:{ all -> 0x0076 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x005f
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            monitor-exit(r7)
            return
        L_0x005f:
            java.util.LinkedList<java.lang.Integer> r0 = r7.f19088c     // Catch:{ all -> 0x0076 }
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x0076 }
            r1.<init>()     // Catch:{ all -> 0x0076 }
            r7.f19088c = r1     // Catch:{ all -> 0x0076 }
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            com.bytedance.apm.j.b r1 = com.bytedance.apm.j.b.a()     // Catch:{ all -> 0x007b }
            com.bytedance.apm.trace.fps.c$2 r2 = new com.bytedance.apm.trace.fps.c$2     // Catch:{ all -> 0x007b }
            r2.<init>(r0)     // Catch:{ all -> 0x007b }
            r1.a((java.lang.Runnable) r2)     // Catch:{ all -> 0x007b }
            goto L_0x0079
        L_0x0076:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r7)
            return
        L_0x007b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.trace.fps.c.b():void");
    }

    public c(String str) {
        this.f19086a = str;
        this.f19089d = ApmDelegate.getInstance().getTraceConfig();
        this.f19088c = new LinkedList<>();
    }
}
