package com.bytedance.ies.x2c;

import android.os.HandlerThread;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    Map<String, C0191a> f20870a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f20871b = new HandlerThread("X2C-AsyncInflater");

    /* renamed from: com.bytedance.ies.x2c.a$a  reason: collision with other inner class name */
    public static abstract class C0191a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        protected View f20872a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f20873b = 0;

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
            if (r3 != false) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized android.view.View a() {
            /*
                r5 = this;
                monitor-enter(r5)
                android.view.View r0 = r5.f20872a     // Catch:{ all -> 0x002e }
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x001c
                int r3 = r5.f20873b     // Catch:{ all -> 0x002e }
                if (r3 != 0) goto L_0x000d
                r3 = 1
                goto L_0x000e
            L_0x000d:
                r3 = 0
            L_0x000e:
                if (r3 != 0) goto L_0x0019
                int r3 = r5.f20873b     // Catch:{ all -> 0x002e }
                if (r3 != r2) goto L_0x0016
                r3 = 1
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                if (r3 == 0) goto L_0x001c
            L_0x0019:
                r3 = 2
                r5.f20873b = r3     // Catch:{ all -> 0x002e }
            L_0x001c:
                if (r0 == 0) goto L_0x0029
                int r3 = r5.f20873b     // Catch:{ all -> 0x002e }
                r4 = 3
                if (r3 != r4) goto L_0x0024
                r1 = 1
            L_0x0024:
                if (r1 == 0) goto L_0x0029
                r1 = 4
                r5.f20873b = r1     // Catch:{ all -> 0x002e }
            L_0x0029:
                r1 = 0
                r5.f20872a = r1     // Catch:{ all -> 0x002e }
                monitor-exit(r5)
                return r0
            L_0x002e:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.x2c.a.C0191a.a():android.view.View");
        }
    }
}
