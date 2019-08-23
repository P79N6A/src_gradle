package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.b;
import java.util.List;

public interface l {
    int a(String str, String str2);

    List<DownloadInfo> a(String str);

    void a();

    void a(int i);

    void a(int i, int i2);

    void a(int i, int i2, int i3, int i4);

    void a(int i, int i2, int i3, long j);

    void a(int i, int i2, long j);

    void a(int i, Notification notification);

    void a(int i, IDownloadListener iDownloadListener, g gVar, boolean z);

    void a(int i, u uVar);

    void a(int i, List<b> list);

    void a(int i, boolean z);

    void a(aa aaVar);

    void a(DownloadTask downloadTask);

    void a(b bVar);

    void a(List<String> list);

    void a(boolean z, boolean z2);

    boolean a(DownloadInfo downloadInfo);

    DownloadInfo b(String str, String str2);

    List<DownloadInfo> b(String str);

    void b(int i);

    void b(int i, IDownloadListener iDownloadListener, g gVar, boolean z);

    void b(int i, List<b> list);

    void b(DownloadInfo downloadInfo);

    void b(DownloadTask downloadTask);

    boolean b();

    List<DownloadInfo> c(String str);

    void c();

    boolean c(int i);

    boolean c(DownloadInfo downloadInfo);

    List<DownloadInfo> d(String str);

    void d(int i);

    boolean d();

    void e();

    void e(int i);

    long f(int i);

    boolean f();

    int g(int i);

    boolean h(int i);

    DownloadInfo i(int i);

    List<b> j(int i);

    void k(int i);

    void l(int i);

    void m(int i);

    boolean n(int i);

    int o(int i);

    boolean p(int i);

    void q(int i);

    boolean r(int i);

    u s(int i);

    x t(int i);

    n u(int i);
}
