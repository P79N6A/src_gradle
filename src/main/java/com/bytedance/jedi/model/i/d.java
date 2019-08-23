package com.bytedance.jedi.model.i;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.c.a.c;

public final class d implements c {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final Handler f21712a;

    static class a extends Handler {
        @NonNull

        /* renamed from: a  reason: collision with root package name */
        private final String f21713a;

        /* renamed from: b  reason: collision with root package name */
        private final int f21714b;

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[SYNTHETIC, Splitter:B:20:0x0071] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(@android.support.annotation.NonNull android.os.Message r14) {
            /*
                r13 = this;
                java.lang.Object r14 = r14.obj
                java.lang.String r14 = (java.lang.String) r14
                java.lang.String r0 = r13.f21713a
                java.lang.String r1 = "logs"
                java.io.File r2 = new java.io.File
                r2.<init>(r0)
                boolean r0 = r2.exists()
                if (r0 != 0) goto L_0x0016
                r2.mkdirs()
            L_0x0016:
                java.io.File r0 = new java.io.File
                java.lang.String r3 = "%s_%s.log"
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r6 = 0
                r5[r6] = r1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8 = 1
                r5[r8] = r7
                java.lang.String r3 = java.lang.String.format(r3, r5)
                r0.<init>(r2, r3)
                r3 = 0
                r7 = r3
                r5 = 0
            L_0x0031:
                boolean r9 = r0.exists()
                if (r9 == 0) goto L_0x0051
                int r5 = r5 + r8
                java.io.File r7 = new java.io.File
                java.lang.String r9 = "%s_%s.log"
                java.lang.Object[] r10 = new java.lang.Object[r4]
                r10[r6] = r1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
                r10[r8] = r11
                java.lang.String r9 = java.lang.String.format(r9, r10)
                r7.<init>(r2, r9)
                r12 = r7
                r7 = r0
                r0 = r12
                goto L_0x0031
            L_0x0051:
                if (r7 == 0) goto L_0x005f
                long r1 = r7.length()
                int r4 = r13.f21714b
                long r4 = (long) r4
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x005f
                r0 = r7
            L_0x005f:
                java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x006e }
                r1.<init>(r0, r8)     // Catch:{ IOException -> 0x006e }
                r1.append(r14)     // Catch:{ IOException -> 0x006f }
                r1.flush()     // Catch:{ IOException -> 0x006f }
                r1.close()     // Catch:{ IOException -> 0x006f }
                return
            L_0x006e:
                r1 = r3
            L_0x006f:
                if (r1 == 0) goto L_0x0078
                r1.flush()     // Catch:{ IOException -> 0x0078 }
                r1.close()     // Catch:{ IOException -> 0x0078 }
                return
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.i.d.a.handleMessage(android.os.Message):void");
        }

        a(@NonNull Looper looper, @NonNull String str, int i) {
            super(looper);
            this.f21713a = str;
            this.f21714b = i;
        }
    }

    public d(@NonNull Handler handler) {
        this.f21712a = handler;
    }

    public final void a(int i, @Nullable String str, @NonNull String str2) {
        this.f21712a.sendMessage(this.f21712a.obtainMessage(i, str2));
    }
}
