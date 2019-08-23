package com.huawei.android.pushselfshow.richpush.tools;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.utils.b.a;
import com.huawei.android.pushselfshow.utils.b.b;
import java.io.File;

public class d {
    public static String a(Context context, String str) {
        e.a("PushSelfShowLog", "download richpush file successed ,try to unzip file,file path is " + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith(b.b(context))) {
            e.a("PushSelfShowLog", "localfile dose not startsWith PushService directory");
            return "";
        }
        try {
            String substring = str.substring(0, str.lastIndexOf(File.separator));
            new a(str, substring + File.separator).a();
            File file = new File(substring + "/index.html");
            if (file.exists()) {
                e.a("PushSelfShowLog", "unzip success ,so delete src zip file");
                File file2 = new File(str);
                if (file2.exists()) {
                    com.huawei.android.pushselfshow.utils.a.a(file2);
                }
                return file.getAbsolutePath();
            }
            e.a("PushSelfShowLog", "unzip fail ,don't exist index.html");
            com.huawei.android.pushselfshow.utils.a.a(new File(substring));
            return null;
        } catch (IndexOutOfBoundsException e2) {
            e.d("PushSelfShowLog", e2.toString());
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(android.content.Context r7, java.lang.String r8, int r9, java.lang.String r10) {
        /*
            r6 = this;
            r0 = 0
            com.huawei.android.pushselfshow.utils.b.b r1 = new com.huawei.android.pushselfshow.utils.b.b     // Catch:{ Exception -> 0x001d }
            r1.<init>()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.a(r7, r8, r10)     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.length()     // Catch:{ Exception -> 0x0013 }
            if (r2 <= 0) goto L_0x0015
            return r1
        L_0x0013:
            r2 = move-exception
            goto L_0x001f
        L_0x0015:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = "download failed"
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ Exception -> 0x0013 }
            goto L_0x0036
        L_0x001d:
            r2 = move-exception
            r1 = r0
        L_0x001f:
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "download err"
            r4.<init>(r5)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.huawei.android.pushagent.utils.a.e.a(r3, r2)
        L_0x0036:
            if (r9 <= 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x0045
            java.lang.String r7 = r6.a(r7, r8, r9, r10)
            if (r7 == 0) goto L_0x0045
            return r1
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.tools.d.a(android.content.Context, java.lang.String, int, java.lang.String):java.lang.String");
    }
}
