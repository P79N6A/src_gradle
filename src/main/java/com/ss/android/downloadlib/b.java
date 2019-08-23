package com.ss.android.downloadlib;

import com.ss.android.download.api.b.a.a;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public abstract class b implements IAppDownloadMonitorListener {

    /* renamed from: a  reason: collision with root package name */
    private static String f28854a = "b";

    private static void a(DownloadInfo downloadInfo, String str) {
        for (a a2 : e.a().f29049b) {
            a2.a(downloadInfo, str);
        }
    }

    private static void a(DownloadInfo downloadInfo, BaseException baseException, String str) {
        for (a a2 : e.a().f29049b) {
            a2.a(downloadInfo, baseException, str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:58|59|60|(2:62|(1:64)(1:65))|66|67|(1:69)|70) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0193 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ Exception -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c A[Catch:{ Exception -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d A[Catch:{ Exception -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c1 A[Catch:{ Exception -> 0x010d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppDownloadMonitorSend(com.ss.android.socialbase.downloader.model.DownloadInfo r13, com.ss.android.socialbase.downloader.exception.BaseException r14, int r15) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = -1
            r1 = 0
            r3 = 0
            r4 = 0
            if (r15 != r0) goto L_0x0110
            if (r14 == 0) goto L_0x0110
            java.lang.String r15 = r13.getExtra()     // Catch:{ Exception -> 0x010d }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x010d }
            if (r0 != 0) goto L_0x00bd
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x010d }
            r0.<init>(r15)     // Catch:{ Exception -> 0x010d }
            java.lang.String r15 = "extra"
            long r5 = com.ss.android.downloadlib.c.k.a((org.json.JSONObject) r0, (java.lang.String) r15)     // Catch:{ Exception -> 0x010d }
            int r15 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r15 <= 0) goto L_0x00bd
            org.json.JSONObject r15 = com.ss.android.downloadlib.addownload.k.g()     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = "exception_msg_length"
            r1 = 170(0xaa, float:2.38E-43)
            int r15 = r15.optInt(r0, r1)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = r14.getMessage()     // Catch:{ Exception -> 0x010d }
            if (r15 != 0) goto L_0x003b
            java.lang.String r15 = ""
        L_0x0039:
            r8 = r15
            goto L_0x004e
        L_0x003b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x010d }
            if (r1 != 0) goto L_0x004d
            int r1 = r0.length()     // Catch:{ Exception -> 0x010d }
            if (r1 > r15) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            java.lang.String r15 = r0.substring(r3, r15)     // Catch:{ Exception -> 0x010d }
            goto L_0x0039
        L_0x004d:
            r8 = r0
        L_0x004e:
            com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x010d }
            int r7 = r14.getErrorCode()     // Catch:{ Exception -> 0x010d }
            long r9 = r13.getDownloadTime()     // Catch:{ Exception -> 0x010d }
            r11 = 0
            com.ss.android.downloadlib.a.a(r5, r7, r8, r9, r11)     // Catch:{ Exception -> 0x010d }
            int r15 = r14.getErrorCode()     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = r14.getMessage()     // Catch:{ Exception -> 0x010d }
            r1 = 1006(0x3ee, float:1.41E-42)
            r2 = 1
            if (r15 == r1) goto L_0x0087
            r1 = 1023(0x3ff, float:1.434E-42)
            if (r15 == r1) goto L_0x0076
            r1 = 1039(0x40f, float:1.456E-42)
            if (r15 == r1) goto L_0x0076
            r1 = 1040(0x410, float:1.457E-42)
            if (r15 != r1) goto L_0x0085
        L_0x0076:
            boolean r15 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x010d }
            if (r15 != 0) goto L_0x0085
            java.lang.String r15 = com.ss.android.downloadlib.addownload.DownloadConstants.f28718d     // Catch:{ Exception -> 0x010d }
            boolean r15 = r0.contains(r15)     // Catch:{ Exception -> 0x010d }
            if (r15 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r15 = 0
            goto L_0x0088
        L_0x0087:
            r15 = 1
        L_0x0088:
            if (r15 == 0) goto L_0x00bd
            org.json.JSONObject r15 = com.ss.android.downloadlib.addownload.k.g()     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = "exec_clear_space_switch"
            int r15 = r15.optInt(r0, r3)     // Catch:{ Exception -> 0x010d }
            if (r15 == 0) goto L_0x00bd
            com.ss.android.downloadlib.addownload.e.b r15 = com.ss.android.downloadlib.addownload.e.b.a()     // Catch:{ Exception -> 0x010d }
            if (r13 != 0) goto L_0x009d
            goto L_0x00bd
        L_0x009d:
            long r0 = com.ss.android.downloadlib.addownload.DownloadConstants.f28715a     // Catch:{ Exception -> 0x010d }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x010d }
            long r7 = r15.f28782a     // Catch:{ Exception -> 0x010d }
            r9 = 0
            long r5 = r5 - r7
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00bd
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x010d }
            r15.f28782a = r0     // Catch:{ Exception -> 0x010d }
            com.ss.android.downloadlib.addownload.e.a r15 = new com.ss.android.downloadlib.addownload.e.a     // Catch:{ Exception -> 0x010d }
            r15.<init>()     // Catch:{ Exception -> 0x010d }
            com.ss.android.socialbase.downloader.model.DownloadInfo[] r0 = new com.ss.android.socialbase.downloader.model.DownloadInfo[r2]     // Catch:{ Exception -> 0x010d }
            r0[r3] = r13     // Catch:{ Exception -> 0x010d }
            com.ss.android.downloadlib.c.a.a.a(r15, r0)     // Catch:{ Exception -> 0x010d }
        L_0x00bd:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = "fail status:"
            r15.<init>(r0)     // Catch:{ Exception -> 0x010d }
            int r0 = r14.getErrorCode()     // Catch:{ Exception -> 0x010d }
            r15.append(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = "\nfail message:"
            r15.append(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = r14.getErrorMessage()     // Catch:{ Exception -> 0x010d }
            r15.append(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r15 = ""
            a(r13, r14, r15)     // Catch:{ Exception -> 0x010d }
            java.lang.String r15 = f28854a     // Catch:{ Exception -> 0x010d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
            java.lang.String r1 = "onAppDownloadMonitorSend, downloadUrl: "
            r0.<init>(r1)     // Catch:{ Exception -> 0x010d }
            java.lang.String r13 = r13.getUrl()     // Catch:{ Exception -> 0x010d }
            r0.append(r13)     // Catch:{ Exception -> 0x010d }
            java.lang.String r13 = " fail status:"
            r0.append(r13)     // Catch:{ Exception -> 0x010d }
            int r13 = r14.getErrorCode()     // Catch:{ Exception -> 0x010d }
            r0.append(r13)     // Catch:{ Exception -> 0x010d }
            java.lang.String r13 = ", fail message:"
            r0.append(r13)     // Catch:{ Exception -> 0x010d }
            java.lang.String r13 = r14.getErrorMessage()     // Catch:{ Exception -> 0x010d }
            r0.append(r13)     // Catch:{ Exception -> 0x010d }
            java.lang.String r13 = r0.toString()     // Catch:{ Exception -> 0x010d }
            com.ss.android.downloadlib.c.c.b(r15, r13, r4)     // Catch:{ Exception -> 0x010d }
            goto L_0x01fe
        L_0x010d:
            r13 = move-exception
            goto L_0x01e7
        L_0x0110:
            r14 = -3
            if (r15 != r14) goto L_0x01ff
            java.lang.String r14 = f28854a     // Catch:{ Exception -> 0x010d }
            java.lang.String r15 = "onAppDownloadMonitorSend, download success start"
            com.ss.android.downloadlib.c.c.a(r14, r15, r4)     // Catch:{ Exception -> 0x010d }
            boolean r14 = r13.canShowNotification()     // Catch:{ Exception -> 0x010d }
            if (r14 == 0) goto L_0x0128
            java.lang.String r13 = f28854a     // Catch:{ Exception -> 0x010d }
            java.lang.String r14 = "onAppDownloadMonitorSend, download success canShowNotification"
            com.ss.android.downloadlib.c.c.a(r13, r14, r4)     // Catch:{ Exception -> 0x010d }
            return
        L_0x0128:
            java.lang.String r14 = r13.getExtra()     // Catch:{ Exception -> 0x010d }
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x010d }
            if (r15 != 0) goto L_0x01ca
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x010d }
            r15.<init>(r14)     // Catch:{ Exception -> 0x010d }
            java.lang.String r14 = "extra"
            long r14 = com.ss.android.downloadlib.c.k.a((org.json.JSONObject) r15, (java.lang.String) r14)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = f28854a     // Catch:{ Exception -> 0x010d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
            java.lang.String r6 = "onAppDownloadMonitorSend, download success step url: "
            r5.<init>(r6)     // Catch:{ Exception -> 0x010d }
            java.lang.String r6 = r13.getUrl()     // Catch:{ Exception -> 0x010d }
            r5.append(r6)     // Catch:{ Exception -> 0x010d }
            java.lang.String r6 = ", adId: "
            r5.append(r6)     // Catch:{ Exception -> 0x010d }
            r5.append(r14)     // Catch:{ Exception -> 0x010d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x010d }
            com.ss.android.downloadlib.c.c.a(r0, r5, r4)     // Catch:{ Exception -> 0x010d }
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ca
            com.ss.android.downloadlib.a r0 = com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x010d }
            r0.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r13, (long) r14)     // Catch:{ Exception -> 0x010d }
            com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0193 }
            android.content.Context r1 = com.ss.android.downloadlib.addownload.k.a()     // Catch:{ Exception -> 0x0193 }
            java.lang.String r2 = "sp_ad_download_event"
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r3)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)     // Catch:{ Exception -> 0x0193 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0193 }
            if (r1 != 0) goto L_0x0193
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0193 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0193 }
            com.ss.android.downloadad.api.b.a r0 = com.ss.android.downloadad.api.b.a.a((org.json.JSONObject) r1)     // Catch:{ Exception -> 0x0193 }
            if (r0 != 0) goto L_0x0190
            goto L_0x0193
        L_0x0190:
            com.ss.android.downloadlib.a.b(r0)     // Catch:{ Exception -> 0x0193 }
        L_0x0193:
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x010d }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
            r15.<init>()     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = r13.getSavePath()     // Catch:{ Exception -> 0x010d }
            r15.append(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = java.io.File.separator     // Catch:{ Exception -> 0x010d }
            r15.append(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = r13.getName()     // Catch:{ Exception -> 0x010d }
            r15.append(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x010d }
            android.content.Context r0 = com.ss.android.downloadlib.addownload.k.a()     // Catch:{ Exception -> 0x010d }
            java.lang.String r15 = com.ss.android.downloadlib.c.k.f(r0, r15)     // Catch:{ Exception -> 0x010d }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x010d }
            if (r0 == 0) goto L_0x01c3
            java.lang.String r15 = ""
        L_0x01c3:
            com.ss.android.downloadlib.b.a r0 = com.ss.android.downloadlib.b.a.a()     // Catch:{ Exception -> 0x010d }
            r0.a(r14, r15)     // Catch:{ Exception -> 0x010d }
        L_0x01ca:
            java.lang.String r14 = ""
            a(r13, r14)     // Catch:{ Exception -> 0x010d }
            java.lang.String r14 = f28854a     // Catch:{ Exception -> 0x010d }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = "onAppDownloadMonitorSend, download success: "
            r15.<init>(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r13 = r13.getUrl()     // Catch:{ Exception -> 0x010d }
            r15.append(r13)     // Catch:{ Exception -> 0x010d }
            java.lang.String r13 = r15.toString()     // Catch:{ Exception -> 0x010d }
            com.ss.android.downloadlib.c.c.a(r14, r13, r4)     // Catch:{ Exception -> 0x010d }
            goto L_0x01ff
        L_0x01e7:
            java.lang.String r14 = f28854a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "onAppDownloadMonitorSend, exception: "
            r15.<init>(r0)
            java.lang.String r13 = r13.getMessage()
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            com.ss.android.downloadlib.c.c.b(r14, r13, r4)
        L_0x01fe:
            return
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.b.onAppDownloadMonitorSend(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException, int):void");
    }
}
