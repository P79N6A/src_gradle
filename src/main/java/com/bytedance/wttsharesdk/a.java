package com.bytedance.wttsharesdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f22925a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean a(Context context) {
        if (a(context, "com.ss.android.article.news") || a(context, "com.ss.android.article.local")) {
            return true;
        }
        return false;
    }

    public static String b(Context context) {
        if (a(context, "com.ss.android.article.local")) {
            return "com.ss.android.article.local";
        }
        if (a(context, "com.ss.android.article.news")) {
            return "com.ss.android.article.news";
        }
        return "";
    }

    public static boolean c(Context context) {
        if (b(context, "com.ss.android.article.news") || b(context, "com.ss.android.article.local")) {
            return true;
        }
        return false;
    }

    private static boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 16777216) != null) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean b(Context context, String str) {
        if (context == null || !a(context, str) || TextUtils.isEmpty(c(context, str))) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, "com.ss.android.publish.send.TTSendPostActivity"));
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(context.getPackageManager(), 65536);
        if (resolveActivityInfo == null || !resolveActivityInfo.exported) {
            return false;
        }
        return true;
    }

    private static String c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getString("WTTSHARE_SDK_VERSION");
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080 A[Catch:{ Exception -> 0x011e, all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087 A[Catch:{ Exception -> 0x011e, all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091 A[Catch:{ Exception -> 0x011e, all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7 A[Catch:{ Exception -> 0x010f, all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa A[Catch:{ Exception -> 0x0120, all -> 0x0109 }, LOOP:0: B:42:0x00f3->B:44:0x00fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0115 A[SYNTHETIC, Splitter:B:59:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011a A[Catch:{ Exception -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0122 A[SYNTHETIC, Splitter:B:69:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0127 A[Catch:{ Exception -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fe A[EDGE_INSN: B:75:0x00fe->B:45:0x00fe ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(android.content.Context r9, android.net.Uri r10, int r11) {
        /*
            r11 = 0
            java.lang.String r0 = "/Android/data/com.ss.android.article.news/files/.share/"
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r2.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r2.append(r3)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r2.append(r0)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r1.mkdirs()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r2 = 0
            java.lang.String r3 = r10.getScheme()     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            java.lang.String r4 = "file"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            if (r3 == 0) goto L_0x004d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            r3.<init>()     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            long r4 = r1.getTimeInMillis()     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            r3.append(r4)     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            java.lang.String r1 = r10.getLastPathSegment()     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            r3.append(r1)     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            r3 = r1
            r1 = r11
            goto L_0x0076
        L_0x004d:
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            java.lang.String r1 = "_display_name"
            r5[r2] = r1     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0084, all -> 0x007c }
            if (r1 == 0) goto L_0x0075
            boolean r3 = r1.moveToFirst()     // Catch:{ Exception -> 0x0085, all -> 0x0073 }
            if (r3 == 0) goto L_0x0075
            java.lang.String r3 = "_display_name"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x0085, all -> 0x0073 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0085, all -> 0x0073 }
            goto L_0x0076
        L_0x0073:
            r9 = move-exception
            goto L_0x007e
        L_0x0075:
            r3 = r11
        L_0x0076:
            if (r1 == 0) goto L_0x008b
            r1.close()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            goto L_0x008b
        L_0x007c:
            r9 = move-exception
            r1 = r11
        L_0x007e:
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
        L_0x0083:
            throw r9     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
        L_0x0084:
            r1 = r11
        L_0x0085:
            if (r1 == 0) goto L_0x008a
            r1.close()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
        L_0x008a:
            r3 = r11
        L_0x008b:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            if (r1 == 0) goto L_0x00aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r1.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            long r3 = r3.getTimeInMillis()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r1.append(r3)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.lang.String r3 = "_sdk_temp.jpg"
            r1.append(r3)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
        L_0x00aa:
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r9 = r9.openFileDescriptor(r10, r1)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            r10.<init>(r1)     // Catch:{ Exception -> 0x011e, all -> 0x0111 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r1.<init>()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r1.append(r4)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r1.append(r0)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r1.append(r3)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r9.<init>(r0)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            boolean r0 = r9.exists()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            if (r0 == 0) goto L_0x00ea
            r9.delete()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
        L_0x00ea:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r0.<init>(r9)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r1 = 1444(0x5a4, float:2.023E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0120, all -> 0x0109 }
        L_0x00f3:
            int r3 = r10.read(r1)     // Catch:{ Exception -> 0x0120, all -> 0x0109 }
            r4 = -1
            if (r3 == r4) goto L_0x00fe
            r0.write(r1, r2, r3)     // Catch:{ Exception -> 0x0120, all -> 0x0109 }
            goto L_0x00f3
        L_0x00fe:
            java.lang.String r9 = r9.getPath()     // Catch:{ Exception -> 0x0120, all -> 0x0109 }
            r10.close()     // Catch:{ Exception -> 0x0108 }
            r0.close()     // Catch:{ Exception -> 0x0108 }
        L_0x0108:
            return r9
        L_0x0109:
            r9 = move-exception
            goto L_0x010d
        L_0x010b:
            r9 = move-exception
            r0 = r11
        L_0x010d:
            r11 = r10
            goto L_0x0113
        L_0x010f:
            r0 = r11
            goto L_0x0120
        L_0x0111:
            r9 = move-exception
            r0 = r11
        L_0x0113:
            if (r11 == 0) goto L_0x0118
            r11.close()     // Catch:{ Exception -> 0x011d }
        L_0x0118:
            if (r0 == 0) goto L_0x011d
            r0.close()     // Catch:{ Exception -> 0x011d }
        L_0x011d:
            throw r9
        L_0x011e:
            r10 = r11
            r0 = r10
        L_0x0120:
            if (r10 == 0) goto L_0x0125
            r10.close()     // Catch:{ Exception -> 0x012a }
        L_0x0125:
            if (r0 == 0) goto L_0x012a
            r0.close()     // Catch:{ Exception -> 0x012a }
        L_0x012a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.wttsharesdk.a.a(android.content.Context, android.net.Uri, int):java.lang.String");
    }
}
