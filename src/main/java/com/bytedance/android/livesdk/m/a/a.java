package com.bytedance.android.livesdk.m.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16322a;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[SYNTHETIC, Splitter:B:22:0x0058] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f16322a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = 0
            r4 = 1
            r5 = 12643(0x3163, float:1.7717E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f16322a
            r5 = 1
            r6 = 12643(0x3163, float:1.7717E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            r1 = 0
            r2 = 44100(0xac44, float:6.1797E-41)
            r3 = 3
            r4 = 2
            int r2 = android.media.AudioRecord.getMinBufferSize(r2, r3, r4)     // Catch:{ Exception -> 0x0056 }
            android.media.AudioRecord r3 = new android.media.AudioRecord     // Catch:{ Exception -> 0x0056 }
            r6 = 1
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 3
            r9 = 2
            r5 = r3
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0056 }
            r3.startRecording()     // Catch:{ Exception -> 0x0055 }
            if (r2 <= 0) goto L_0x0050
            byte[] r1 = new byte[r2]
            int r1 = r3.read(r1, r0, r2)
            r3.release()     // Catch:{ Exception -> 0x0051 }
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            if (r1 <= 0) goto L_0x0054
            r0 = 1
        L_0x0054:
            return r0
        L_0x0055:
            r1 = r3
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.release()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.a.a.a():boolean");
    }

    public final boolean a(Context context, String str) {
        if (!PatchProxy.isSupport(new Object[]{context, str}, this, f16322a, false, 12642, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, f16322a, false, 12642, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
    }
}
