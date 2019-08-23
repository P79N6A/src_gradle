package com.ss.android.downloadlib;

import android.app.Activity;
import android.content.Context;
import com.ss.android.download.api.a;
import com.ss.android.download.api.b;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.downloadlib.addownload.g;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.downloader.constants.f;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;

public class h {

    /* renamed from: d  reason: collision with root package name */
    private static volatile h f29056d;

    /* renamed from: a  reason: collision with root package name */
    public a f29057a = new c();

    /* renamed from: b  reason: collision with root package name */
    public d f29058b = e.a();

    /* renamed from: c  reason: collision with root package name */
    public b f29059c = new f();

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.downloadad.api.a f29060e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.downloadad.api.b f29061f;

    public final com.ss.android.downloadad.api.a a() {
        if (this.f29060e == null) {
            this.f29060e = a.a();
        }
        return this.f29060e;
    }

    public final com.ss.android.downloadad.api.b b() {
        if (this.f29061f == null) {
            this.f29061f = AdWebViewDownloadManagerImpl.a();
        }
        return this.f29061f;
    }

    public static List<c> c() {
        ArrayList arrayList = new ArrayList();
        Context a2 = k.a();
        if (a2 == null) {
            return arrayList;
        }
        List<DownloadInfo> downloadingDownloadInfosWithMimeType = AppDownloader.getInstance().getDownloadingDownloadInfosWithMimeType(a2);
        if (downloadingDownloadInfosWithMimeType == null || downloadingDownloadInfosWithMimeType.size() == 0) {
            return arrayList;
        }
        for (DownloadInfo downloadInfo : downloadingDownloadInfosWithMimeType) {
            if (f.b(downloadInfo.getStatus())) {
                c b2 = com.ss.android.downloadlib.c.b.b(downloadInfo);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    public static List<c> d() {
        ArrayList arrayList = new ArrayList();
        if (k.a() == null) {
            return arrayList;
        }
        List<DownloadInfo> unCompletedDownloadInfosWithMimeType = Downloader.getInstance(k.a()).getUnCompletedDownloadInfosWithMimeType("application/vnd.android.package-archive");
        if (unCompletedDownloadInfosWithMimeType == null || unCompletedDownloadInfosWithMimeType.size() == 0) {
            return arrayList;
        }
        for (DownloadInfo downloadInfo : unCompletedDownloadInfosWithMimeType) {
            if (-2 == downloadInfo.getStatus()) {
                c b2 = com.ss.android.downloadlib.c.b.b(downloadInfo);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    public final boolean b(String str) {
        return this.f29058b.c(str);
    }

    public static h a(Context context) {
        if (f29056d == null) {
            synchronized (h.class) {
                if (f29056d == null) {
                    f29056d = new h(context);
                }
            }
        }
        return f29056d;
    }

    private h(Context context) {
        k.a(context);
        com.ss.android.downloadlib.core.download.f.f28990a = "misc_config";
        com.ss.android.downloadlib.core.download.k.f29031b = new g(context);
        AppDownloader.getInstance().init(context, "misc_config", new com.ss.android.downloadlib.b.c(), new com.ss.android.downloadlib.b.b(context), null);
    }

    public final void a(com.ss.android.download.api.b.a.a aVar) {
        this.f29058b.a(aVar);
    }

    @Deprecated
    public final void a(String str) {
        this.f29058b.a(str);
    }

    public final void a(String str, int i) {
        this.f29058b.a(str, i);
    }

    public final void a(int i, d dVar, c cVar) {
        this.f29058b.a((Activity) null, i, dVar, cVar);
    }

    @Deprecated
    public final void a(Activity activity, d dVar, c cVar) {
        this.f29058b.a(activity, dVar, cVar);
    }

    public final void a(Activity activity, int i, d dVar, c cVar) {
        this.f29058b.a(activity, i, dVar, cVar);
    }

    public final void a(String str, int i, com.ss.android.download.api.b.b bVar, com.ss.android.download.api.b.a aVar) {
        this.f29058b.a(str, 0, 2, bVar, aVar);
    }
}
