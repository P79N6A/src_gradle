package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50823a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f50824b = {"_id", "_data", "date_added", "width", "height", "mime_type"};

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0102, code lost:
        if (r3 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x010b, code lost:
        if (r3 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010d, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0114, code lost:
        if (r2.isEmpty() != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0116, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011e, code lost:
        if (r1.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0120, code lost:
        r3 = (com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a) r1.next();
        r3.f50818a = b(com.ss.android.common.applog.GlobalContext.getContext(), r3.f50820c, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0133, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a> a(boolean r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r17)
            r9 = 0
            r2[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f50823a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 50948(0xc704, float:7.1393E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003f
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r17)
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f50823a
            r13 = 1
            r14 = 50948(0xc704, float:7.1393E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x003f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()
            android.content.ContentResolver r10 = r3.getContentResolver()
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 2
            r7 = 3
            if (r0 == 0) goto L_0x0089
            android.net.Uri r11 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "_data"
            r12[r9] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "bucket_id"
            r12[r1] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "date_modified"
            r12[r6] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "width"
            r12[r7] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "height"
            r12[r5] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r13 = "mime_type=? or mime_type=? or mime_type=? or mime_type=?)  group by (bucket_id"
            java.lang.String[] r14 = new java.lang.String[r5]     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "image/jpeg"
            r14[r9] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "image/png"
            r14[r1] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "image/jpg"
            r14[r6] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "image/gif"
            r14[r7] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r15 = "date_modified desc"
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            goto L_0x00b7
        L_0x0086:
            r0 = move-exception
            goto L_0x0105
        L_0x0089:
            android.net.Uri r11 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "_data"
            r12[r9] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "bucket_id"
            r12[r1] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "date_modified"
            r12[r6] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "width"
            r12[r7] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "height"
            r12[r5] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r13 = "mime_type=? or mime_type=? or mime_type=?)  group by (bucket_id"
            java.lang.String[] r14 = new java.lang.String[r7]     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "image/jpeg"
            r14[r9] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "image/png"
            r14[r1] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = "image/jpg"
            r14[r6] = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r15 = "date_modified desc"
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
        L_0x00b7:
            r3 = r4
            if (r3 == 0) goto L_0x0102
        L_0x00ba:
            boolean r4 = r3.moveToNext()     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            if (r4 == 0) goto L_0x0102
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r6 = r3.getString(r9)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.io.File r6 = r4.getParentFile()     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            int r8 = r3.getInt(r7)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            int r10 = r3.getInt(r5)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r11 = 360(0x168, float:5.04E-43)
            if (r8 < r11) goto L_0x00ba
            if (r10 < r11) goto L_0x00ba
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a r8 = a(r2, r6)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            if (r8 != 0) goto L_0x00ba
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a r8 = new com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r8.<init>()     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r10 = r3.getString(r9)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r8.f50821d = r10     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r8.f50822e = r6     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = r4.getParent()     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r8.f50819b = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            java.lang.String r4 = r3.getString(r1)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r8.f50820c = r4     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            r2.add(r8)     // Catch:{ Exception -> 0x010b, all -> 0x0086 }
            goto L_0x00ba
        L_0x0102:
            if (r3 == 0) goto L_0x0110
            goto L_0x010d
        L_0x0105:
            if (r3 == 0) goto L_0x010a
            r3.close()
        L_0x010a:
            throw r0
        L_0x010b:
            if (r3 == 0) goto L_0x0110
        L_0x010d:
            r3.close()
        L_0x0110:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0133
            java.util.Iterator r1 = r2.iterator()
        L_0x011a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0133
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a r3 = (com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a) r3
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r5 = r3.f50820c
            int r4 = b(r4, r5, r0)
            r3.f50818a = r4
            goto L_0x011a
        L_0x0133:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.b.a(boolean):java.util.List");
    }

    private static a a(List<a> list, String str) {
        List<a> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, str2}, null, f50823a, true, 50949, new Class[]{List.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{list2, str2}, null, f50823a, true, 50949, new Class[]{List.class, String.class}, a.class);
        }
        for (int i = 0; i < list.size(); i++) {
            a aVar = list2.get(i);
            if (TextUtils.equals(aVar.f50822e, str2)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c0, code lost:
        if (r9 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c2, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        if (r9 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cf, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(android.content.Context r20, java.lang.String r21, boolean r22) {
        /*
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r21
            java.lang.Byte r4 = java.lang.Byte.valueOf(r22)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f50823a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = 0
            r6 = 1
            r7 = 50950(0xc706, float:7.1396E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005e
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r20
            r13[r11] = r21
            java.lang.Byte r0 = java.lang.Byte.valueOf(r22)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f50823a
            r16 = 1
            r17 = 50950(0xc706, float:7.1396E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x005e:
            android.content.ContentResolver r3 = r20.getContentResolver()
            r9 = 0
            r0 = 4
            if (r22 == 0) goto L_0x008a
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String[] r5 = f50824b     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r6 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=? or mime_type=?) "
            r7 = 5
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            r7[r10] = r21     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r1 = "image/jpeg"
            r7[r11] = r1     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r1 = "image/png"
            r7[r12] = r1     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r1 = "image/jpg"
            r7[r2] = r1     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r1 = "image/gif"
            r7[r0] = r1     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r8 = "date_modified desc"
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            goto L_0x00a6
        L_0x0088:
            r0 = move-exception
            goto L_0x00c6
        L_0x008a:
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String[] r5 = f50824b     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r6 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=?) "
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            r7[r10] = r21     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r1 = "image/jpeg"
            r7[r11] = r1     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r1 = "image/png"
            r7[r12] = r1     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r1 = "image/jpg"
            r7[r2] = r1     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            java.lang.String r8 = "date_modified desc"
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
        L_0x00a6:
            r9 = r1
            if (r9 == 0) goto L_0x00c0
        L_0x00a9:
            boolean r1 = r9.moveToNext()     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            if (r1 == 0) goto L_0x00c0
            int r1 = r9.getInt(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            int r3 = r9.getInt(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x0088 }
            r4 = 360(0x168, float:5.04E-43)
            if (r1 < r4) goto L_0x00a9
            if (r3 < r4) goto L_0x00a9
            int r10 = r10 + 1
            goto L_0x00a9
        L_0x00c0:
            if (r9 == 0) goto L_0x00cf
        L_0x00c2:
            r9.close()
            goto L_0x00cf
        L_0x00c6:
            if (r9 == 0) goto L_0x00cb
            r9.close()
        L_0x00cb:
            throw r0
        L_0x00cc:
            if (r9 == 0) goto L_0x00cf
            goto L_0x00c2
        L_0x00cf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.b.b(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0106, code lost:
        if (r4 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x010f, code lost:
        if (r4 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0111, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0114, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.chooser.f> a(android.content.Context r20, java.lang.String r21, boolean r22) {
        /*
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r21
            java.lang.Byte r4 = java.lang.Byte.valueOf(r22)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f50823a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 50951(0xc707, float:7.1398E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005a
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r20
            r13[r11] = r21
            java.lang.Byte r0 = java.lang.Byte.valueOf(r22)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f50823a
            r16 = 1
            r17 = 50951(0xc707, float:7.1398E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class<java.util.List> r19 = java.util.List.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x005a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r5 = "%s >= %d and %s >= %d"
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "width"
            r7[r10] = r8
            r8 = 360(0x168, float:5.04E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7[r11] = r9
            java.lang.String r9 = "height"
            r7[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7[r2] = r9
            java.lang.String.format(r4, r5, r7)
            android.content.ContentResolver r13 = r20.getContentResolver()
            r4 = 0
            r0 = 5
            if (r22 == 0) goto L_0x00ae
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String[] r15 = f50824b     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r16 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=? or mime_type=?) "
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r5[r10] = r21     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = "image/jpeg"
            r5[r11] = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = "image/png"
            r5[r12] = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = "image/jpg"
            r5[r2] = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = "image/gif"
            r5[r6] = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r18 = "date_modified desc"
            r17 = r5
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            goto L_0x00cc
        L_0x00ac:
            r0 = move-exception
            goto L_0x0109
        L_0x00ae:
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String[] r15 = f50824b     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r16 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=?) "
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r5[r10] = r21     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = "image/jpeg"
            r5[r11] = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = "image/png"
            r5[r12] = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = "image/jpg"
            r5[r2] = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r18 = "date_modified desc"
            r17 = r5
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
        L_0x00cc:
            r4 = r1
            if (r4 == 0) goto L_0x0106
        L_0x00cf:
            boolean r1 = r4.moveToNext()     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            if (r1 == 0) goto L_0x0106
            long r13 = r4.getLong(r10)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r1 = r4.getString(r11)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            long r10 = r4.getLong(r12)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            int r5 = r4.getInt(r2)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            int r7 = r4.getInt(r6)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            java.lang.String r9 = r4.getString(r0)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            if (r5 < r8) goto L_0x0103
            if (r7 < r8) goto L_0x0103
            com.ss.android.chooser.f r15 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r15.<init>(r13)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r15.f27990b = r1     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r15.f27991c = r10     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r15.i = r5     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r15.j = r7     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r15.g = r9     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
            r3.add(r15)     // Catch:{ Exception -> 0x010f, all -> 0x00ac }
        L_0x0103:
            r10 = 0
            r11 = 1
            goto L_0x00cf
        L_0x0106:
            if (r4 == 0) goto L_0x0114
            goto L_0x0111
        L_0x0109:
            if (r4 == 0) goto L_0x010e
            r4.close()
        L_0x010e:
            throw r0
        L_0x010f:
            if (r4 == 0) goto L_0x0114
        L_0x0111:
            r4.close()
        L_0x0114:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.b.a(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.chooser.f> a(android.content.Context r21, int r22, int r23, int r24, boolean r25) {
        /*
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r10 = 1
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r11 = 2
            r2[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r12 = 3
            r2[r12] = r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r25)
            r13 = 4
            r2[r13] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f50823a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r12] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r13] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 50947(0xc703, float:7.1392E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x008c
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r14[r9] = r21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r14[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r14[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r14[r12] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f50823a
            r17 = 1
            r18 = 50947(0xc703, float:7.1392E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r13] = r1
            java.lang.Class<java.util.List> r20 = java.util.List.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x008c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 128(0x80, float:1.794E-43)
            r2.<init>(r3)
            android.net.Uri r15 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "%s >= %d and %s >= %d"
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.String r6 = "width"
            r5[r9] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            r5[r10] = r6
            java.lang.String r6 = "height"
            r5[r11] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r23)
            r5[r12] = r6
            java.lang.String r17 = java.lang.String.format(r3, r4, r5)
            java.lang.String r19 = "date_added DESC"
            r3 = 0
            android.content.ContentResolver r14 = r21.getContentResolver()     // Catch:{ Exception -> 0x0142, all -> 0x013a }
            java.lang.String[] r16 = f50824b     // Catch:{ Exception -> 0x0142, all -> 0x013a }
            r18 = 0
            android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0142, all -> 0x013a }
            if (r4 != 0) goto L_0x00cc
            if (r4 == 0) goto L_0x00cb
            r4.close()
        L_0x00cb:
            return r2
        L_0x00cc:
            boolean r0 = r4.moveToNext()     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            if (r0 == 0) goto L_0x0130
            long r5 = r4.getLong(r9)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            java.lang.String r0 = r4.getString(r10)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            long r7 = r4.getLong(r11)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            int r3 = r4.getInt(r12)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            int r14 = r4.getInt(r13)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            java.lang.String r15 = r4.getString(r1)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            java.lang.String r1 = "image/jpeg"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            if (r1 != 0) goto L_0x0102
            java.lang.String r1 = "image/png"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            if (r1 != 0) goto L_0x0102
            java.lang.String r1 = "image/gif"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            if (r1 == 0) goto L_0x012b
        L_0x0102:
            boolean r1 = com.ss.android.ugc.aweme.video.b.b((java.lang.String) r0)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            if (r1 == 0) goto L_0x012b
            if (r25 != 0) goto L_0x0112
            java.lang.String r9 = "image/gif"
            boolean r9 = r9.equals(r15)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            if (r9 != 0) goto L_0x012d
        L_0x0112:
            com.ss.android.chooser.f r9 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r9.f27990b = r0     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r9.f27991c = r7     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r9.i = r3     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r9.j = r14     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r2.add(r9)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            int r0 = r2.size()     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r3 = r24
            if (r0 >= r3) goto L_0x0130
            goto L_0x012d
        L_0x012b:
            r3 = r24
        L_0x012d:
            r1 = 5
            r9 = 0
            goto L_0x00cc
        L_0x0130:
            if (r4 == 0) goto L_0x0147
            r4.close()
            goto L_0x0147
        L_0x0136:
            r0 = move-exception
            goto L_0x013c
        L_0x0138:
            r3 = r4
            goto L_0x0142
        L_0x013a:
            r0 = move-exception
            r4 = r3
        L_0x013c:
            if (r4 == 0) goto L_0x0141
            r4.close()
        L_0x0141:
            throw r0
        L_0x0142:
            if (r3 == 0) goto L_0x0147
            r3.close()
        L_0x0147:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.b.a(android.content.Context, int, int, int, boolean):java.util.List");
    }
}
