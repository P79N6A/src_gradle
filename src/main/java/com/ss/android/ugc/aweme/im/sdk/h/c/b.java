package com.ss.android.ugc.aweme.im.sdk.h.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51686a;

    /* renamed from: b  reason: collision with root package name */
    private static b f51687b;

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f51686a, true, 53273, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f51686a, true, 53273, new Class[0], b.class);
        }
        if (f51687b == null) {
            synchronized (b.class) {
                if (f51687b == null) {
                    f51687b = new b();
                }
            }
        }
        return f51687b;
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f51686a, true, 53274, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f51686a, true, 53274, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists USER_EXTRA (");
        for (com.ss.android.ugc.aweme.im.sdk.h.b.b bVar : com.ss.android.ugc.aweme.im.sdk.h.b.b.values()) {
            sb.append(bVar.key);
            sb.append(" ");
            sb.append(bVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e0, code lost:
        if (r3 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        if (r3 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fb, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51686a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra> r8 = com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra.class
            r5 = 0
            r6 = 53275(0xd01b, float:7.4654E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51686a
            r13 = 0
            r14 = 53275(0xd01b, float:7.4654E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra> r16 = com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra r0 = (com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra) r0
            return r0
        L_0x0039:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            java.lang.String r4 = "select * from USER_EXTRA where "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            com.ss.android.ugc.aweme.im.sdk.h.b.b r4 = com.ss.android.ugc.aweme.im.sdk.h.b.b.COLUMN_UID     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            r3.append(r4)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            java.lang.String r4 = " = "
            r3.append(r4)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            r3.append(r0)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            com.ss.android.ugc.aweme.im.sdk.h.a.b r3 = com.ss.android.ugc.aweme.im.sdk.h.a.b.a()     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            android.database.Cursor r3 = r3.a(r0, r2)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            if (r3 == 0) goto L_0x00e0
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x00e0
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00de }
            r10[r9] = r3     // Catch:{ Exception -> 0x00de }
            com.meituan.robust.ChangeQuickRedirect r12 = f51686a     // Catch:{ Exception -> 0x00de }
            r13 = 0
            r14 = 53277(0xd01d, float:7.4657E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00de }
            java.lang.Class<android.database.Cursor> r0 = android.database.Cursor.class
            r15[r9] = r0     // Catch:{ Exception -> 0x00de }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra> r16 = com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra.class
            r11 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x0099
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00de }
            r10[r9] = r3     // Catch:{ Exception -> 0x00de }
            com.meituan.robust.ChangeQuickRedirect r12 = f51686a     // Catch:{ Exception -> 0x00de }
            r13 = 0
            r14 = 53277(0xd01d, float:7.4657E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00de }
            java.lang.Class<android.database.Cursor> r0 = android.database.Cursor.class
            r15[r9] = r0     // Catch:{ Exception -> 0x00de }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra> r16 = com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00de }
            com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra r0 = (com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra) r0     // Catch:{ Exception -> 0x00de }
            goto L_0x00d8
        L_0x0099:
            if (r3 != 0) goto L_0x009d
            r0 = r2
            goto L_0x00d8
        L_0x009d:
            com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra r0 = new com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra     // Catch:{ Exception -> 0x00de }
            r0.<init>()     // Catch:{ Exception -> 0x00de }
            com.ss.android.ugc.aweme.im.sdk.h.b.b r4 = com.ss.android.ugc.aweme.im.sdk.h.b.b.COLUMN_UID     // Catch:{ Exception -> 0x00de }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00de }
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00de }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ Exception -> 0x00de }
            r0.setUid(r4)     // Catch:{ Exception -> 0x00de }
            com.ss.android.ugc.aweme.im.sdk.h.b.b r4 = com.ss.android.ugc.aweme.im.sdk.h.b.b.COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR     // Catch:{ Exception -> 0x00de }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00de }
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00de }
            int r4 = r3.getInt(r4)     // Catch:{ Exception -> 0x00de }
            if (r4 <= 0) goto L_0x00c1
            r4 = 1
            goto L_0x00c2
        L_0x00c1:
            r4 = 0
        L_0x00c2:
            r0.setIsDisableShowFollowBar(r4)     // Catch:{ Exception -> 0x00de }
            com.ss.android.ugc.aweme.im.sdk.h.b.b r4 = com.ss.android.ugc.aweme.im.sdk.h.b.b.COLUMN_IS_SAY_HELLO_LOGGER     // Catch:{ Exception -> 0x00de }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00de }
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00de }
            int r4 = r3.getInt(r4)     // Catch:{ Exception -> 0x00de }
            if (r4 <= 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            r0.setIsSayHelloLogger(r1)     // Catch:{ Exception -> 0x00de }
        L_0x00d8:
            if (r3 == 0) goto L_0x00dd
            r3.close()
        L_0x00dd:
            return r0
        L_0x00de:
            r0 = move-exception
            goto L_0x00e8
        L_0x00e0:
            if (r3 == 0) goto L_0x00fe
            goto L_0x00fb
        L_0x00e3:
            r0 = move-exception
            r3 = r2
            goto L_0x0100
        L_0x00e6:
            r0 = move-exception
            r3 = r2
        L_0x00e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            java.lang.String r4 = "getUserExtraByUid "
            r1.<init>(r4)     // Catch:{ all -> 0x00ff }
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ff }
            com.bytedance.im.core.b.e.d.d(r0)     // Catch:{ all -> 0x00ff }
            if (r3 == 0) goto L_0x00fe
        L_0x00fb:
            r3.close()
        L_0x00fe:
            return r2
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r3 == 0) goto L_0x0105
            r3.close()
        L_0x0105:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.c.b.a(java.lang.String):com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra");
    }
}
