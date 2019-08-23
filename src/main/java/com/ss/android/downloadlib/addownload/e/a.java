package com.ss.android.downloadlib.addownload.e;

import android.os.AsyncTask;
import com.ss.android.downloadlib.addownload.DownloadConstants;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;

public final class a extends AsyncTask<DownloadInfo, Void, String> {
    private void a() {
        List<DownloadInfo> successedDownloadInfosWithMimeType = Downloader.getInstance(k.a()).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive");
        if (successedDownloadInfosWithMimeType != null && !successedDownloadInfosWithMimeType.isEmpty()) {
            long j = DownloadConstants.f28717c;
            for (int i = 0; i < successedDownloadInfosWithMimeType.size(); i++) {
                if (successedDownloadInfosWithMimeType.get(i) != null) {
                    String str = r5.getSavePath() + File.separator + r5.getName();
                    File file = new File(str);
                    if (file.exists()) {
                        boolean z = true;
                        if (System.currentTimeMillis() - file.lastModified() < j && !com.ss.android.downloadlib.c.k.c(k.a(), str)) {
                            z = false;
                        }
                        if (z) {
                            a(file);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[SYNTHETIC, Splitter:B:12:0x001b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r2) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001f, all -> 0x0017 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001f, all -> 0x0017 }
            java.lang.String r0 = "1"
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            r1.write(r0)     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            r1.close()     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            goto L_0x0024
        L_0x0013:
            r2 = move-exception
            goto L_0x0019
        L_0x0015:
            r0 = r1
            goto L_0x001f
        L_0x0017:
            r2 = move-exception
            r1 = r0
        L_0x0019:
            if (r1 == 0) goto L_0x001e
            r1.close()     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            throw r2
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            r2.delete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.e.a.a(java.io.File):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String doInBackground(com.ss.android.socialbase.downloader.model.DownloadInfo... r20) {
        /*
            r19 = this;
            r0 = r20
            r1 = 0
            if (r0 == 0) goto L_0x011e
            int r2 = r0.length
            if (r2 > 0) goto L_0x000a
            goto L_0x011e
        L_0x000a:
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            r3 = 0
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x001a }
            long r5 = com.ss.android.socialbase.downloader.e.d.a((java.lang.String) r5)     // Catch:{ Exception -> 0x001a }
            r13 = r5
            goto L_0x001b
        L_0x001a:
            r13 = r3
        L_0x001b:
            r5 = 0
            r10 = r0[r5]
            com.ss.android.socialbase.appdownloader.AppDownloader r0 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            android.content.Context r6 = com.ss.android.downloadlib.addownload.k.a()
            java.util.List r0 = r0.getUnCompletedDownloadAppInfos(r6)
            if (r0 == 0) goto L_0x007d
            int r6 = r0.size()
            if (r6 <= 0) goto L_0x007d
            r6 = 0
        L_0x0033:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x007d
            java.lang.Object r7 = r0.get(r6)
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r7
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r7.getTempPath()
            java.lang.String r11 = r7.getTempName()
            r8.<init>(r9, r11)
            long r11 = r8.lastModified()
            long r15 = com.ss.android.downloadlib.addownload.DownloadConstants.f28716b
            boolean r9 = r8.isFile()
            if (r9 == 0) goto L_0x007a
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x007a
            long r17 = java.lang.System.currentTimeMillis()
            long r17 = r17 - r11
            int r9 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x007a
            a((java.io.File) r8)
            android.content.Context r8 = com.ss.android.downloadlib.addownload.k.a()
            com.ss.android.socialbase.downloader.downloader.Downloader r8 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r8)
            int r7 = r7.getId()
            r8.clearDownloadData(r7)
        L_0x007a:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x007d:
            r19.a()
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0089 }
            long r6 = com.ss.android.socialbase.downloader.e.d.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0089 }
            goto L_0x008a
        L_0x0089:
            r6 = r3
        L_0x008a:
            r0 = 0
            long r11 = r6 - r13
            long r8 = r10.getTotalBytes()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            com.ss.android.downloadlib.addownload.e.b r0 = com.ss.android.downloadlib.addownload.e.b.a()
            java.lang.String r2 = r10.getUrl()
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r0.f28783b
            r7 = 1
            if (r6 == 0) goto L_0x00c5
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x00a9
            goto L_0x00c5
        L_0x00a9:
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r0.f28783b
            boolean r6 = r6.containsKey(r2)
            if (r6 == 0) goto L_0x00be
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.f28783b
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            r2 = 2
            if (r0 <= r2) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            if (r0 == 0) goto L_0x010e
            android.content.Context r0 = com.ss.android.downloadlib.addownload.k.a()
            com.ss.android.socialbase.downloader.downloader.Downloader r0 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)
            int r2 = r10.getId()
            r0.restart(r2)
            com.ss.android.downloadlib.addownload.e.b r0 = com.ss.android.downloadlib.addownload.e.b.a()
            java.lang.String r2 = r10.getUrl()
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x010e
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r0.f28783b
            if (r6 != 0) goto L_0x00f0
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0.f28783b = r6
        L_0x00f0:
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r0.f28783b
            boolean r6 = r6.containsKey(r2)
            if (r6 == 0) goto L_0x0104
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f28783b
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x0104:
            int r5 = r5 + r7
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.f28783b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r2, r5)
        L_0x010e:
            long r8 = com.ss.android.downloadlib.addownload.j.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r10)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            com.ss.android.downloadlib.a r7 = com.ss.android.downloadlib.a.a()
            r7.a(r8, r10, r11, r13)
        L_0x011d:
            return r1
        L_0x011e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.e.a.doInBackground(com.ss.android.socialbase.downloader.model.DownloadInfo[]):java.lang.String");
    }
}
