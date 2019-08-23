package com.huawei.android.pushselfshow.richpush.tools;

import android.content.Context;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f25359a;

    /* renamed from: b  reason: collision with root package name */
    private Context f25360b;

    public c(Context context, String str) {
        this.f25359a = str;
        this.f25360b = context;
    }

    private String b() {
        return "﻿<!DOCTYPE html>\t\t<html>\t\t   <head>\t\t     <meta charset=\"utf-8\">\t\t     <title></title>\t\t     <style type=\"text/css\">\t\t\t\t html { height:100%;}\t\t\t\t body { height:100%; text-align:center;}\t    \t    .centerDiv { display:inline-block; zoom:1; *display:inline; vertical-align:top; text-align:left; width:200px; padding:10px;margin-top:100px;}\t\t\t   .hiddenDiv { height:100%; overflow:hidden; display:inline-block; width:1px; overflow:hidden; margin-left:-1px; zoom:1; *display:inline; *margin-top:-1px; _margin-top:0; vertical-align:middle;}\t\t  \t</style>    \t  </head>\t\t <body>\t\t\t<div id =\"container\" class=\"centerDiv\">";
    }

    private String c() {
        return "﻿\t\t</div>  \t\t<div class=\"hiddenDiv\"></div>\t  </body>   </html>";
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f2 A[SYNTHETIC, Splitter:B:37:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0103 A[SYNTHETIC, Splitter:B:45:0x0103] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f25360b
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r2 = "CreateHtmlFile fail ,context is null"
            com.huawei.android.pushagent.utils.a.e.d(r0, r2)
            return r1
        L_0x000d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.b()
            r0.append(r2)
            java.lang.String r2 = r9.f25359a
            r0.append(r2)
            java.lang.String r2 = r9.c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = r9.f25360b
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r3 = r3.getPath()
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "PushService"
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "richpush"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "error.html"
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r7 = java.io.File.separator
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            boolean r6 = r4.exists()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            if (r6 != 0) goto L_0x009a
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            java.lang.String r8 = "Create the path:"
            r7.<init>(r8)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            r7.append(r2)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            com.huawei.android.pushagent.utils.a.e.a(r6, r2)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            boolean r2 = r4.mkdirs()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            if (r2 != 0) goto L_0x009a
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r2 = "!path.mkdirs()"
            com.huawei.android.pushagent.utils.a.e.a(r0, r2)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            return r1
        L_0x009a:
            boolean r2 = r5.exists()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            if (r2 == 0) goto L_0x00a3
            com.huawei.android.pushselfshow.utils.a.a((java.io.File) r5)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
        L_0x00a3:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            java.lang.String r6 = "Create the file:"
            r4.<init>(r6)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            r4.append(r3)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            boolean r2 = r5.createNewFile()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r2 = "!file.createNewFile()"
            com.huawei.android.pushagent.utils.a.e.a(r0, r2)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            return r1
        L_0x00c4:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            java.lang.String r3 = "UTF-8"
            byte[] r0 = r0.getBytes(r3)     // Catch:{ Exception -> 0x00e3 }
            r2.write(r0)     // Catch:{ Exception -> 0x00e3 }
            r2.close()     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00de
        L_0x00d6:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = "stream.close() error "
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x00de:
            java.lang.String r0 = r5.getAbsolutePath()
            return r0
        L_0x00e3:
            r0 = move-exception
            goto L_0x00e9
        L_0x00e5:
            r0 = move-exception
            goto L_0x0101
        L_0x00e7:
            r0 = move-exception
            r2 = r1
        L_0x00e9:
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r4 = "Create html error "
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00fe
            r2.close()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00fe
        L_0x00f6:
            r0 = move-exception
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = "stream.close() error "
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x00fe:
            return r1
        L_0x00ff:
            r0 = move-exception
            r1 = r2
        L_0x0101:
            if (r1 == 0) goto L_0x010f
            r1.close()     // Catch:{ Exception -> 0x0107 }
            goto L_0x010f
        L_0x0107:
            r1 = move-exception
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = "stream.close() error "
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r1)
        L_0x010f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.tools.c.a():java.lang.String");
    }
}
