package com.ss.android.downloadlib.addownload.e;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.ss.android.downloadad.api.b.a;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.HashMap;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f28781c;

    /* renamed from: a  reason: collision with root package name */
    public long f28782a;

    /* renamed from: b  reason: collision with root package name */
    HashMap<String, Integer> f28783b = new HashMap<>();

    public static b a() {
        if (f28781c == null) {
            synchronized (b.class) {
                if (f28781c == null) {
                    f28781c = new b();
                }
            }
        }
        return f28781c;
    }

    @WorkerThread
    public static void a(DownloadInfo downloadInfo) {
        if (k.g().optInt("delete_file_after_install", 0) != 0 && downloadInfo != null) {
            try {
                String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.isFile() && file.exists()) {
                        file.delete();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @WorkerThread
    public static void a(a aVar, Context context) {
        if (context != null && aVar != null && aVar.f28650a > 0) {
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo((int) aVar.k);
            if (downloadInfo != null) {
                a(downloadInfo);
            }
        }
    }
}
