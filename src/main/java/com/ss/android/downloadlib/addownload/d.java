package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.downloadlib.a;
import com.ss.android.downloadlib.e;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import java.io.File;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f28750a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f28751b;

    public static boolean b() {
        if (k.g().optInt("forbid_invalidte_download_file_install", 0) == 1) {
            return true;
        }
        return false;
    }

    public static d a() {
        if (f28750a == null) {
            synchronized (d.class) {
                if (f28750a == null) {
                    f28750a = new d();
                }
            }
        }
        return f28750a;
    }

    public final void a(Context context, final DownloadInfo downloadInfo) {
        if (b()) {
            try {
                File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                if (file.isFile() && file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            if (this.f28751b == null) {
                this.f28751b = new Handler(Looper.getMainLooper());
            }
            Downloader.getInstance(context).clearDownloadData(downloadInfo.getId());
            this.f28751b.post(new Runnable() {
                public final void run() {
                    f fVar = null;
                    k.d().a(k.a(), k.a().getResources().getString(C0906R.string.a7k), null, 0);
                    if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getUrl())) {
                        e a2 = e.a();
                        String url = downloadInfo.getUrl();
                        if (!(a2.f29048a == null || a2.f29048a.size() == 0)) {
                            h hVar = a2.f29048a.get(url);
                            if (hVar != null && (hVar instanceof f)) {
                                fVar = (f) hVar;
                            }
                        }
                        if (fVar != null && fVar.f28786c != null && fVar.f28786c.size() != 0) {
                            for (com.ss.android.download.api.b.d a3 : fVar.f28786c.values()) {
                                a3.a();
                            }
                            if (fVar.f28788e != null) {
                                fVar.f28788e.setStatus(-4);
                            }
                        }
                    }
                }
            });
        }
    }

    public final boolean a(Context context, long j, String str) {
        boolean z;
        try {
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo((int) j);
            if (downloadInfo == null) {
                return true;
            }
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(new File(downloadInfo.getSavePath(), downloadInfo.getName()).getAbsolutePath(), 0);
            if (packageArchiveInfo != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(packageArchiveInfo.packageName) && !TextUtils.equals(str, packageArchiveInfo.packageName)) {
                z = !b();
                try {
                    long a2 = j.a(downloadInfo);
                    if (a2 > 0) {
                        a.a();
                        a.a(a2, 1);
                    }
                    a().a(context, downloadInfo);
                } catch (Exception unused) {
                }
                return z;
            }
            z = true;
            return z;
        } catch (Exception unused2) {
        }
    }
}
