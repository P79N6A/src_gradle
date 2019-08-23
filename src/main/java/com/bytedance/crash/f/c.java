package com.bytedance.crash.f;

import android.content.Context;
import android.os.Looper;
import com.bytedance.crash.c;
import com.bytedance.crash.d;
import com.bytedance.crash.event.b;
import com.bytedance.crash.runtime.assembly.e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private Context f19443a;

    class a extends com.bytedance.frameworks.core.b.c {

        /* renamed from: b  reason: collision with root package name */
        private CountDownLatch f19445b;

        /* renamed from: c  reason: collision with root package name */
        private com.bytedance.crash.e.a f19446c;

        /* renamed from: d  reason: collision with root package name */
        private String f19447d;

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            if (r4.f19445b == null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (r4.f19445b != null) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r4.f19445b.countDown();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.bytedance.crash.e.a r0 = r4.f19446c     // Catch:{ Exception -> 0x0021, all -> 0x0016 }
                com.bytedance.crash.upload.a r1 = com.bytedance.crash.upload.a.a()     // Catch:{ Exception -> 0x0021, all -> 0x0016 }
                java.lang.String r2 = r4.f19447d     // Catch:{ Exception -> 0x0021, all -> 0x0016 }
                r3 = 0
                r1.a(r0, r2, r3)     // Catch:{ Exception -> 0x0021, all -> 0x0016 }
                java.util.concurrent.CountDownLatch r0 = r4.f19445b
                if (r0 == 0) goto L_0x0027
            L_0x0010:
                java.util.concurrent.CountDownLatch r0 = r4.f19445b
                r0.countDown()
                return
            L_0x0016:
                r0 = move-exception
                java.util.concurrent.CountDownLatch r1 = r4.f19445b
                if (r1 == 0) goto L_0x0020
                java.util.concurrent.CountDownLatch r1 = r4.f19445b
                r1.countDown()
            L_0x0020:
                throw r0
            L_0x0021:
                java.util.concurrent.CountDownLatch r0 = r4.f19445b
                if (r0 == 0) goto L_0x0027
                goto L_0x0010
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.f.c.a.run():void");
        }

        a(CountDownLatch countDownLatch, com.bytedance.crash.e.a aVar, String str) {
            this.f19445b = countDownLatch;
            this.f19446c = aVar;
            this.f19447d = str;
        }
    }

    public c(Context context) {
        this.f19443a = context;
    }

    public final void a(long j, Thread thread, Throwable th) {
        com.bytedance.crash.event.a a2 = b.a(d.JAVA, c.a.f19380d, j, th);
        com.bytedance.crash.event.c.b(a2);
        com.bytedance.crash.e.a a3 = com.bytedance.crash.e.a.a(j, this.f19443a, thread, th);
        com.bytedance.crash.i.d.a(this.f19443a, d.JAVA.getName(), Thread.currentThread().getName());
        com.bytedance.crash.e.a a4 = e.a().a(d.JAVA, a3);
        String a5 = com.bytedance.crash.upload.a.a().a(a4.f19417a);
        com.bytedance.crash.event.a eventType = a2.clone().eventType(c.a.f19381e);
        if (a5 == null) {
            com.bytedance.crash.event.c.b(eventType.state(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f));
        } else {
            com.bytedance.crash.event.c.b(eventType.state(0));
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            com.bytedance.frameworks.core.b.a.a();
            com.bytedance.frameworks.core.b.a.a(new a(countDownLatch, a4, a5));
            try {
                countDownLatch.await(4500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        } else {
            com.bytedance.crash.upload.a.a().a(a4, a5, false);
        }
    }
}
