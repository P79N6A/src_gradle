package com.bytedance.android.livesdk.m.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16330a;

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.Context r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f16330a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 12654(0x316e, float:1.7732E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f16330a
            r13 = 1
            r14 = 12654(0x316e, float:1.7732E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0037:
            if (r17 != 0) goto L_0x003a
            return r9
        L_0x003a:
            r2 = 0
            android.content.ContentResolver r3 = r17.getContentResolver()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            if (r3 != 0) goto L_0x004f
            r3.close()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            return r9
        L_0x004f:
            int r0 = r3.getCount()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r3.close()     // Catch:{ Exception -> 0x0065 }
            goto L_0x0065
        L_0x0057:
            r0 = move-exception
            r2 = r3
            goto L_0x005d
        L_0x005a:
            r2 = r3
            goto L_0x0061
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            r2.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r0
        L_0x0061:
            r2.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r0 = 0
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            return r1
        L_0x0068:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.a.f.a(android.content.Context):boolean");
    }

    public final boolean a(Context context, String str) {
        if (!PatchProxy.isSupport(new Object[]{context, str}, this, f16330a, false, 12653, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return a(context);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, f16330a, false, 12653, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
    }
}
