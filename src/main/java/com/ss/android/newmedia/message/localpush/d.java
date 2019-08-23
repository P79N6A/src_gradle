package com.ss.android.newmedia.message.localpush;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30254a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f30255b;

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f30254a, false, 18715, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30254a, false, 18715, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f30255b != null && this.f30255b.size() > 0) {
            z = true;
        }
        return z;
    }

    private d(List<c> list) {
        this.f30255b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b5, code lost:
        if (r1.size() <= 0) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.newmedia.message.localpush.d a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f30254a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.newmedia.message.localpush.d> r8 = com.ss.android.newmedia.message.localpush.d.class
            r3 = 0
            r5 = 1
            r6 = 18716(0x491c, float:2.6227E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f30254a
            r13 = 1
            r14 = 18716(0x491c, float:2.6227E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.newmedia.message.localpush.d> r16 = com.ss.android.newmedia.message.localpush.d.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.newmedia.message.localpush.d r0 = (com.ss.android.newmedia.message.localpush.d) r0
            return r0
        L_0x0035:
            boolean r2 = android.text.TextUtils.isEmpty(r17)
            r3 = 0
            if (r2 == 0) goto L_0x003d
            return r3
        L_0x003d:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00be }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x00be }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00be }
            r10[r9] = r2     // Catch:{ Throwable -> 0x00be }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f30254a     // Catch:{ Throwable -> 0x00be }
            r13 = 1
            r14 = 18717(0x491d, float:2.6228E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x00be }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r15[r9] = r0     // Catch:{ Throwable -> 0x00be }
            java.lang.Class r16 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x00be }
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x00be }
            if (r0 == 0) goto L_0x0077
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00be }
            r10[r9] = r2     // Catch:{ Throwable -> 0x00be }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f30254a     // Catch:{ Throwable -> 0x00be }
            r13 = 1
            r14 = 18717(0x491d, float:2.6228E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x00be }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r15[r9] = r0     // Catch:{ Throwable -> 0x00be }
            java.lang.Class r16 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x00be }
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x00be }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x00be }
            boolean r1 = r0.booleanValue()     // Catch:{ Throwable -> 0x00be }
            goto L_0x0081
        L_0x0077:
            java.lang.String r0 = "status"
            int r0 = r2.optInt(r0)     // Catch:{ Throwable -> 0x00be }
            if (r0 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            if (r1 != 0) goto L_0x0084
            return r3
        L_0x0084:
            java.lang.String r0 = "data"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ Throwable -> 0x00be }
            if (r0 == 0) goto L_0x00b7
            int r1 = r0.length()     // Catch:{ Throwable -> 0x00be }
            if (r1 <= 0) goto L_0x00b7
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00be }
            int r2 = r0.length()     // Catch:{ Throwable -> 0x00be }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00be }
            int r2 = r0.length()     // Catch:{ Throwable -> 0x00be }
        L_0x009f:
            if (r9 >= r2) goto L_0x00b1
            java.lang.String r4 = r0.optString(r9)     // Catch:{ Throwable -> 0x00be }
            com.ss.android.newmedia.message.localpush.c r4 = com.ss.android.newmedia.message.localpush.c.a(r4)     // Catch:{ Throwable -> 0x00be }
            if (r4 == 0) goto L_0x00ae
            r1.add(r4)     // Catch:{ Throwable -> 0x00be }
        L_0x00ae:
            int r9 = r9 + 1
            goto L_0x009f
        L_0x00b1:
            int r0 = r1.size()     // Catch:{ Throwable -> 0x00be }
            if (r0 > 0) goto L_0x00b8
        L_0x00b7:
            r1 = r3
        L_0x00b8:
            com.ss.android.newmedia.message.localpush.d r0 = new com.ss.android.newmedia.message.localpush.d     // Catch:{ Throwable -> 0x00be }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00be }
            return r0
        L_0x00be:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.message.localpush.d.a(java.lang.String):com.ss.android.newmedia.message.localpush.d");
    }
}
