package com.ss.android.chooser;

import android.os.Environment;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f27964a = (Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + File.separator + "neihanduanzi");

    /* renamed from: e  reason: collision with root package name */
    private static b f27965e;

    /* renamed from: b  reason: collision with root package name */
    public int f27966b = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;

    /* renamed from: c  reason: collision with root package name */
    public int f27967c = 600000;

    /* renamed from: d  reason: collision with root package name */
    public a f27968d;

    public interface a {
        String a();
    }

    public static boolean a(int i) {
        return 7 == i || 8 == i;
    }

    private b() {
    }

    public static b a() {
        if (f27965e == null) {
            synchronized (b.class) {
                f27965e = new b();
            }
        }
        return f27965e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        if (r13 != null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r13 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.chooser.f a(android.content.Context r13, java.lang.String r14) {
        /*
            r0 = 6
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_id"
            r7 = 0
            r3[r7] = r0
            java.lang.String r0 = "_data"
            r8 = 1
            r3[r8] = r0
            java.lang.String r0 = "date_modified"
            r9 = 2
            r3[r9] = r0
            java.lang.String r0 = "mime_type"
            r10 = 3
            r3[r10] = r0
            java.lang.String r0 = "_size"
            r11 = 4
            r3[r11] = r0
            java.lang.String r0 = "_data"
            r12 = 5
            r3[r12] = r0
            java.lang.String r4 = "_data= ?"
            java.lang.String[] r5 = new java.lang.String[r8]
            r5[r7] = r14
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r0 = 0
            android.content.ContentResolver r1 = r13.getContentResolver()     // Catch:{ Exception -> 0x00a5, all -> 0x009d }
            r6 = 0
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a5, all -> 0x009d }
            if (r13 == 0) goto L_0x0097
            boolean r1 = r13.moveToFirst()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            if (r1 == 0) goto L_0x0097
            long r1 = r13.getLong(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r3 = r13.getString(r8)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            long r4 = r13.getLong(r9)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r6 = r13.getString(r10)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            long r10 = r13.getLong(r11)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r8 = r13.getString(r12)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            com.ss.android.chooser.f r12 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            r12.<init>(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "gif"
            boolean r0 = r6.contains(r0)     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            if (r0 == 0) goto L_0x0069
            r12.f27992d = r9     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            goto L_0x006b
        L_0x0069:
            r12.f27992d = r7     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
        L_0x006b:
            r12.f27990b = r3     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f27991c = r4     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f27994f = r10     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.g = r6     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.h = r8     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            android.util.Pair r14 = com.ss.android.chooser.d.a((java.lang.String) r14)     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            if (r14 == 0) goto L_0x008f
            java.lang.Object r0 = r14.first     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.i = r0     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            java.lang.Object r14 = r14.second     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.j = r14     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
        L_0x008f:
            r0 = r12
            goto L_0x0097
        L_0x0091:
            r0 = r12
            goto L_0x00a6
        L_0x0093:
            r14 = move-exception
            goto L_0x009f
        L_0x0095:
            goto L_0x00a6
        L_0x0097:
            if (r13 == 0) goto L_0x00a9
        L_0x0099:
            r13.close()
            goto L_0x00a9
        L_0x009d:
            r14 = move-exception
            r13 = r0
        L_0x009f:
            if (r13 == 0) goto L_0x00a4
            r13.close()
        L_0x00a4:
            throw r14
        L_0x00a5:
            r13 = r0
        L_0x00a6:
            if (r13 == 0) goto L_0x00a9
            goto L_0x0099
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.chooser.b.a(android.content.Context, java.lang.String):com.ss.android.chooser.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0073, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r1 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r1 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        return r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.chooser.f b(android.content.Context r15, java.lang.String r16) {
        /*
            r0 = 7
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_id"
            r7 = 0
            r3[r7] = r0
            java.lang.String r0 = "_data"
            r8 = 1
            r3[r8] = r0
            java.lang.String r0 = "date_modified"
            r9 = 2
            r3[r9] = r0
            java.lang.String r0 = "mime_type"
            r10 = 3
            r3[r10] = r0
            java.lang.String r0 = "_size"
            r11 = 4
            r3[r11] = r0
            java.lang.String r0 = "_data"
            r12 = 5
            r3[r12] = r0
            java.lang.String r0 = "duration"
            r13 = 6
            r3[r13] = r0
            java.lang.String r4 = "_data= ?"
            java.lang.String[] r5 = new java.lang.String[r8]
            r5[r7] = r16
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r14 = 0
            android.content.ContentResolver r1 = r15.getContentResolver()     // Catch:{ Exception -> 0x0085, all -> 0x007d }
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0085, all -> 0x007d }
            if (r1 == 0) goto L_0x0077
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            if (r0 == 0) goto L_0x0077
            long r2 = r1.getLong(r7)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            java.lang.String r0 = r1.getString(r8)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            long r4 = r1.getLong(r9)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            java.lang.String r6 = r1.getString(r10)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            long r9 = r1.getLong(r11)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            java.lang.String r7 = r1.getString(r12)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            long r11 = r1.getLong(r13)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            com.ss.android.chooser.f r13 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            r13.<init>(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            r13.f27992d = r8     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f27990b = r0     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f27991c = r4     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f27994f = r9     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.g = r6     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.h = r7     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f27993e = r11     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r14 = r13
            goto L_0x0077
        L_0x0071:
            r14 = r13
            goto L_0x0086
        L_0x0073:
            r0 = move-exception
            goto L_0x007f
        L_0x0075:
            goto L_0x0086
        L_0x0077:
            if (r1 == 0) goto L_0x0089
        L_0x0079:
            r1.close()
            goto L_0x0089
        L_0x007d:
            r0 = move-exception
            r1 = r14
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.close()
        L_0x0084:
            throw r0
        L_0x0085:
            r1 = r14
        L_0x0086:
            if (r1 == 0) goto L_0x0089
            goto L_0x0079
        L_0x0089:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.chooser.b.b(android.content.Context, java.lang.String):com.ss.android.chooser.f");
    }
}
