package com.ss.android.socialbase.downloader.downloader;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.i;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.impls.a;
import com.ss.android.socialbase.downloader.impls.c;
import com.ss.android.socialbase.downloader.impls.e;
import com.ss.android.socialbase.downloader.impls.f;
import com.ss.android.socialbase.downloader.impls.g;
import com.ss.android.socialbase.downloader.impls.h;
import com.ss.android.socialbase.downloader.impls.j;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.impls.n;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.android.socialbase.downloader.network.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

public class b {
    private static int A;
    private static final int B = (Runtime.getRuntime().availableProcessors() + 1);
    private static final int C = ((Runtime.getRuntime().availableProcessors() * 2) + 1);
    private static final int D = (Runtime.getRuntime().availableProcessors() + 1);
    private static boolean E;

    /* renamed from: a  reason: collision with root package name */
    static volatile Context f30901a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile k f30902b;

    /* renamed from: c  reason: collision with root package name */
    static volatile DownloadReceiver f30903c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile o f30904d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile List<aa> f30905e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    static boolean f30906f = false;
    static int g = 8192;
    static volatile List<i> h = new ArrayList();
    private static volatile i i;
    private static volatile j j;
    private static volatile g k;
    private static volatile a l;
    private static volatile n m;
    private static volatile n n;
    private static volatile IDownloadHttpService o;
    private static volatile d p;
    private static volatile IDownloadHttpService q;
    private static volatile d r;
    private static volatile ExecutorService s;
    private static volatile ExecutorService t;
    private static volatile ExecutorService u;
    private static volatile f v;
    private static volatile p w;
    private static volatile boolean x = false;
    private static volatile OkHttpClient y = null;
    private static volatile AlarmManager z;

    private b() {
    }

    public static boolean b() {
        return x;
    }

    public static List<aa> c() {
        return f30905e;
    }

    public static Context q() {
        return f30901a;
    }

    public static boolean r() {
        return E;
    }

    public static void a(k kVar) {
        if (kVar != null) {
            f30902b = kVar;
            if (i instanceof com.ss.android.socialbase.downloader.impls.d) {
                ((com.ss.android.socialbase.downloader.impls.d) i).a();
            }
        }
    }

    public static i i() {
        if (i == null) {
            synchronized (b.class) {
                if (i == null) {
                    i = new com.ss.android.socialbase.downloader.impls.d();
                }
            }
        }
        return i;
    }

    public static n j() {
        if (m == null) {
            synchronized (b.class) {
                if (m == null) {
                    m = new h();
                }
            }
        }
        return m;
    }

    public static n k() {
        if (n == null) {
            synchronized (b.class) {
                if (n == null) {
                    n = new n();
                }
            }
        }
        return n;
    }

    public static j l() {
        if (j == null) {
            synchronized (b.class) {
                if (j == null) {
                    j = new com.ss.android.socialbase.downloader.impls.i();
                }
            }
        }
        return j;
    }

    public static a m() {
        if (l == null) {
            synchronized (b.class) {
                if (l == null) {
                    l = new e();
                }
            }
        }
        return l;
    }

    public static g n() {
        if (k == null) {
            synchronized (b.class) {
                if (k == null) {
                    k = new c();
                }
            }
        }
        return k;
    }

    public static f o() {
        if (v == null) {
            synchronized (b.class) {
                if (v == null) {
                    v = new com.ss.android.socialbase.downloader.impls.b();
                }
            }
        }
        return v;
    }

    public static p p() {
        if (w == null) {
            synchronized (b.class) {
                if (w == null) {
                    w = new j();
                }
            }
        }
        return w;
    }

    private static IDownloadHttpService s() {
        if (o == null) {
            synchronized (b.class) {
                if (o == null) {
                    o = new g();
                }
            }
        }
        return o;
    }

    private static d t() {
        if (p == null) {
            synchronized (b.class) {
                if (p == null) {
                    p = new f();
                }
            }
        }
        return p;
    }

    private static IDownloadHttpService u() {
        if (q == null) {
            synchronized (b.class) {
                if (q == null) {
                    q = new g();
                }
            }
        }
        return q;
    }

    private static d v() {
        if (r == null) {
            synchronized (b.class) {
                if (r == null) {
                    r = new f();
                }
            }
        }
        return r;
    }

    public static AlarmManager d() {
        if (z == null) {
            synchronized (b.class) {
                if (z == null && f30901a != null) {
                    z = (AlarmManager) f30901a.getSystemService("alarm");
                }
            }
        }
        return z;
    }

    public static ExecutorService e() {
        if (s == null) {
            synchronized (b.class) {
                if (s == null) {
                    if (A <= 0 || A > B) {
                        A = B;
                    }
                    int i2 = A;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.d.a("DownloadThreadPool-cpu-fixed", true));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    s = threadPoolExecutor;
                }
            }
        }
        return s;
    }

    public static ExecutorService f() {
        if (t == null) {
            synchronized (b.class) {
                if (t == null) {
                    int i2 = C;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.d.a("DownloadThreadPool-io-fixed", true));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    t = threadPoolExecutor;
                }
            }
        }
        return t;
    }

    public static ExecutorService g() {
        if (u == null) {
            synchronized (b.class) {
                if (u == null) {
                    int i2 = D;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.d.a("DownloadThreadPool-db-fixed", true));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    u = threadPoolExecutor;
                }
            }
        }
        return u;
    }

    public static OkHttpClient h() {
        if (y == null) {
            synchronized (b.class) {
                if (y == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.connectTimeout(30000, TimeUnit.MILLISECONDS).readTimeout(30000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MILLISECONDS).retryOnConnectionFailure(true).dispatcher(new Dispatcher(f())).followRedirects(true).protocols(Collections.singletonList(Protocol.HTTP_1_1));
                    y = builder.build();
                }
            }
        }
        return y;
    }

    public static void a() {
        if (!x) {
            x = true;
            try {
                Intent intent = new Intent(q(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
                q().startService(intent);
                if (!com.ss.android.socialbase.downloader.e.d.c()) {
                    l.a(true).c();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        return a(downloadInfo.getUrl(), downloadInfo.getSavePath());
    }

    public static void a(Context context) {
        if (context != null && f30901a == null) {
            f30901a = context.getApplicationContext();
        }
    }

    public static void a(com.ss.android.socialbase.downloader.constants.d dVar) {
        if (h != null) {
            Iterator<i> it2 = h.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            h.clear();
        }
    }

    public static void a(DownloaderBuilder downloaderBuilder) {
        boolean z2;
        boolean z3 = x;
        if (downloaderBuilder != null) {
            a(downloaderBuilder.getContext());
            i downloadCache = downloaderBuilder.getDownloadCache();
            if (downloadCache != null) {
                i = downloadCache;
            }
            j idGenerator = downloaderBuilder.getIdGenerator();
            if (idGenerator != null) {
                j = idGenerator;
            }
            g chunkCntCalculator = downloaderBuilder.getChunkCntCalculator();
            if (chunkCntCalculator != null) {
                k = chunkCntCalculator;
            }
            int maxDownloadPoolSize = downloaderBuilder.getMaxDownloadPoolSize();
            if (maxDownloadPoolSize > 0) {
                A = maxDownloadPoolSize;
            }
            IDownloadHttpService httpService = downloaderBuilder.getHttpService();
            if (httpService != null) {
                o = httpService;
            }
            if (o != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            E = z2;
            d headHttpService = downloaderBuilder.getHeadHttpService();
            if (headHttpService != null) {
                p = headHttpService;
            }
            a(downloaderBuilder.getDownloadLaunchHandler());
            ExecutorService cpuThreadExecutorService = downloaderBuilder.getCpuThreadExecutorService();
            if (cpuThreadExecutorService != null) {
                s = cpuThreadExecutorService;
            }
            ExecutorService iOThreadExecutorService = downloaderBuilder.getIOThreadExecutorService();
            if (iOThreadExecutorService != null) {
                t = iOThreadExecutorService;
            }
            ExecutorService dbThreadExecutorService = downloaderBuilder.getDbThreadExecutorService();
            if (dbThreadExecutorService != null) {
                u = dbThreadExecutorService;
            }
            if (downloaderBuilder.getMonitorConfig() != null) {
                f30904d = downloaderBuilder.getMonitorConfig();
            }
            if (downloaderBuilder.getWriteBufferSize() > 1024) {
                g = downloaderBuilder.getWriteBufferSize();
            }
            f chunkAdjustCalculator = downloaderBuilder.getChunkAdjustCalculator();
            if (chunkAdjustCalculator != null) {
                v = chunkAdjustCalculator;
            }
            if (downloaderBuilder.isDownloadInMultiProcess()) {
                x = true;
            }
        }
        if (i == null) {
            i = new com.ss.android.socialbase.downloader.impls.d();
        }
        if (m == null) {
            m = new h();
        }
        if (n == null) {
            n = new n();
        }
        if (j == null) {
            j = new com.ss.android.socialbase.downloader.impls.i();
        }
        if (l == null) {
            l = new e();
        }
        if (k == null) {
            k = new c();
        }
        if (v == null) {
            v = new com.ss.android.socialbase.downloader.impls.b();
        }
        if (w == null) {
            w = new j();
        }
        if (A <= 0 || A > B) {
            A = B;
        }
        if (f30903c == null) {
            synchronized (b.class) {
                if (f30903c == null) {
                    f30903c = new DownloadReceiver();
                }
            }
        }
        if (!f30906f) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                f30901a.registerReceiver(f30903c, intentFilter);
                f30906f = true;
            } catch (Throwable unused) {
            }
        }
        if (x && !z3 && !com.ss.android.socialbase.downloader.e.d.c()) {
            l.a(true).c();
        } else if (com.ss.android.socialbase.downloader.e.d.d()) {
            ExecutorService f2 = f();
            if (f2 != null) {
                f2.execute(new Runnable() {
                    public final void run() {
                        Context q = b.q();
                        if (q != null) {
                            com.ss.android.socialbase.downloader.e.d.b(q);
                        }
                    }
                });
            }
        } else {
            Context q2 = q();
            if (q2 != null) {
                com.ss.android.socialbase.downloader.e.d.b(q2);
            }
        }
    }

    public static int a(String str, String str2) {
        j l2 = l();
        if (l2 == null) {
            return 0;
        }
        return l2.a(str, str2);
    }

    public static com.ss.android.socialbase.downloader.network.c a(String str, List<HttpHeader> list) throws BaseException, IOException {
        IOException e2;
        d t2 = t();
        com.ss.android.socialbase.downloader.network.c cVar = null;
        if (t2 != null) {
            try {
                cVar = t2.a(str, list);
                e2 = null;
            } catch (IOException e3) {
                e2 = e3;
            }
        } else {
            e2 = null;
        }
        if (cVar == null) {
            d v2 = v();
            if (v2 != null) {
                cVar = v2.a(str, list);
            }
        }
        if (cVar != null || e2 == null) {
            return cVar;
        }
        throw e2;
    }

    public static IDownloadHttpConnection a(boolean z2, int i2, String str, List<HttpHeader> list) throws BaseException, IOException {
        IDownloadHttpService s2 = s();
        if (s2 != null || z2) {
            IDownloadHttpConnection iDownloadHttpConnection = null;
            try {
                e = null;
                iDownloadHttpConnection = s2.downloadWithConnection(i2, str, list);
            } catch (IOException e2) {
                e = e2;
            }
            if (z2 && iDownloadHttpConnection == null && !(s2 instanceof g)) {
                IDownloadHttpService u2 = u();
                if (u2 != null) {
                    iDownloadHttpConnection = u2.downloadWithConnection(i2, str, list);
                }
            }
            if (iDownloadHttpConnection != null || e == null) {
                return iDownloadHttpConnection;
            }
            throw e;
        }
        throw new BaseException(1022, (Throwable) new IOException("download can't continue, because httpService not exist"));
    }
}
