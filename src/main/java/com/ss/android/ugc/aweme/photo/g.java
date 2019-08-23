package com.ss.android.ugc.aweme.photo;

import com.meituan.robust.ChangeQuickRedirect;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58541a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f58542b = {"_id", "_data", "date_added", "width", "height", "mime_type", "latitude", "longitude", "date_modified"};

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if ("image/*".equals(r11) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r3 = r4;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        if ("image/png".equals(r11) == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.music.b.a.a> a(android.content.Context r19) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            com.meituan.robust.ChangeQuickRedirect r4 = f58541a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 63558(0xf846, float:8.9064E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r19
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f58541a
            r13 = 1
            r14 = 63558(0xf846, float:8.9064E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0035:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 128(0x80, float:1.794E-43)
            r2.<init>(r3)
            android.net.Uri r11 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r15 = "date_added DESC"
            r3 = 0
            android.content.ContentResolver r10 = r19.getContentResolver()     // Catch:{ Exception -> 0x010e }
            java.lang.String[] r12 = f58542b     // Catch:{ Exception -> 0x010e }
            r13 = 0
            r14 = 0
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x010e }
            if (r4 != 0) goto L_0x0055
            if (r4 == 0) goto L_0x0054
            r4.close()
        L_0x0054:
            return r2
        L_0x0055:
            boolean r0 = r4.moveToNext()     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            if (r0 == 0) goto L_0x00fe
            long r5 = r4.getLong(r9)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            java.lang.String r0 = r4.getString(r1)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r3 = 2
            long r7 = r4.getLong(r3)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r3 = 3
            int r3 = r4.getInt(r3)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r10 = 4
            int r10 = r4.getInt(r10)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r11 = 5
            java.lang.String r11 = r4.getString(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r12 = 6
            double r12 = r4.getDouble(r12)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r14 = 7
            double r14 = r4.getDouble(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r9 = 8
            int r9 = r4.getInt(r9)     // Catch:{ Exception -> 0x0107, all -> 0x0105 }
            r17 = r2
            long r1 = (long) r9
            if (r3 == 0) goto L_0x0091
            if (r10 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r9 = 1
            goto L_0x00a5
        L_0x0091:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r3.<init>()     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9 = 1
            r3.inJustDecodeBounds = r9     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            android.graphics.BitmapFactory.decodeFile(r0, r3)     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            int r10 = r3.outWidth     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            int r3 = r3.outHeight     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r18 = r10
            r10 = r3
            r3 = r18
        L_0x00a5:
            if (r11 == 0) goto L_0x00b6
            java.lang.String r9 = "image/*"
            boolean r9 = r9.equals(r11)     // Catch:{ Exception -> 0x00b0, all -> 0x0105 }
            if (r9 == 0) goto L_0x00ba
            goto L_0x00b6
        L_0x00b0:
            r0 = move-exception
            r3 = r4
            r1 = r17
            goto L_0x0110
        L_0x00b6:
            java.lang.String r11 = com.ss.android.ugc.aweme.photo.i.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
        L_0x00ba:
            java.lang.String r9 = "image/jpg"
            boolean r9 = r9.equals(r11)     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            if (r9 != 0) goto L_0x00d2
            java.lang.String r9 = "image/jpeg"
            boolean r9 = r9.equals(r11)     // Catch:{ Exception -> 0x00b0, all -> 0x0105 }
            if (r9 != 0) goto L_0x00d2
            java.lang.String r9 = "image/png"
            boolean r9 = r9.equals(r11)     // Catch:{ Exception -> 0x00b0, all -> 0x0105 }
            if (r9 == 0) goto L_0x00f3
        L_0x00d2:
            boolean r9 = com.ss.android.medialib.g.a(r0)     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            if (r9 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.photo.h r9 = new com.ss.android.ugc.aweme.photo.h     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.f56315e = r0     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.f56316f = r7     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.l = r3     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.m = r10     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.n = r12     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.o = r14     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r9.f58543a = r1     // Catch:{ Exception -> 0x00fa, all -> 0x0105 }
            r1 = r17
            r1.add(r9)     // Catch:{ Exception -> 0x00f1, all -> 0x0105 }
            goto L_0x00f5
        L_0x00f1:
            r0 = move-exception
            goto L_0x0109
        L_0x00f3:
            r1 = r17
        L_0x00f5:
            r2 = r1
            r1 = 1
            r9 = 0
            goto L_0x0055
        L_0x00fa:
            r0 = move-exception
            r1 = r17
            goto L_0x0109
        L_0x00fe:
            r1 = r2
            if (r4 == 0) goto L_0x0118
            r4.close()
            goto L_0x0118
        L_0x0105:
            r0 = move-exception
            goto L_0x0119
        L_0x0107:
            r0 = move-exception
            r1 = r2
        L_0x0109:
            r3 = r4
            goto L_0x0110
        L_0x010b:
            r0 = move-exception
            r4 = r3
            goto L_0x0119
        L_0x010e:
            r0 = move-exception
            r1 = r2
        L_0x0110:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x010b }
            if (r3 == 0) goto L_0x0118
            r3.close()
        L_0x0118:
            return r1
        L_0x0119:
            if (r4 == 0) goto L_0x011e
            r4.close()
        L_0x011e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.g.a(android.content.Context):java.util.List");
    }
}
