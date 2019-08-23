package com.ss.android.socialbase.downloader.e;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.c;
import com.ss.android.socialbase.downloader.depend.d;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.f;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.h;
import com.ss.android.socialbase.downloader.depend.j;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.o;
import com.ss.android.socialbase.downloader.depend.p;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.s;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.g;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f30936a = new Handler(Looper.getMainLooper());

    public static a a(final DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        return new a.C0389a() {
            public final DownloadInfo a() throws RemoteException {
                return downloadTask.getDownloadInfo();
            }

            public final c b() throws RemoteException {
                g chunkStrategy = downloadTask.getChunkStrategy();
                if (chunkStrategy == null) {
                    return null;
                }
                return new c.a(chunkStrategy) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f30987a;

                    {
                        this.f30987a = r1;
                    }

                    public final int a(long j) throws RemoteException {
                        return this.f30987a.a(j);
                    }
                };
            }

            public final t c() throws RemoteException {
                return e.a(downloadTask.getNotificationEventListener());
            }

            public final w d() throws RemoteException {
                return e.a(downloadTask.getNotificationClickCallback());
            }

            public final f e() throws RemoteException {
                s interceptor = downloadTask.getInterceptor();
                if (interceptor == null) {
                    return null;
                }
                return new f.a(interceptor) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ s f30988a;

                    public final boolean a() throws RemoteException {
                        return this.f30988a.a();
                    }

                    {
                        this.f30988a = r1;
                    }
                };
            }

            public final d f() throws RemoteException {
                IDownloadDepend depend = downloadTask.getDepend();
                if (depend == null) {
                    return null;
                }
                return new d.a(depend) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ IDownloadDepend f30985a;

                    {
                        this.f30985a = r1;
                    }

                    public final void a(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException {
                        this.f30985a.monitorLogSend(downloadInfo, baseException, i);
                    }
                };
            }

            public final p g() throws RemoteException {
                r forbiddenHandler = downloadTask.getForbiddenHandler();
                if (forbiddenHandler == null) {
                    return null;
                }
                return new p.a(forbiddenHandler) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ r f30981a;

                    {
                        this.f30981a = r1;
                    }

                    public final boolean a(o oVar) throws RemoteException {
                        AnonymousClass28 r3;
                        r rVar = this.f30981a;
                        if (oVar == null) {
                            r3 = null;
                        } else {
                            r3 = new q(oVar) {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ o f30983a;

                                public final boolean a() {
                                    try {
                                        return this.f30983a.a();
                                    } catch (RemoteException unused) {
                                        return false;
                                    }
                                }

                                {
                                    this.f30983a = r1;
                                }

                                public final void a(List<String> list) {
                                    try {
                                        this.f30983a.a(list);
                                    } catch (RemoteException unused) {
                                    }
                                }
                            };
                        }
                        return rVar.a(r3);
                    }
                };
            }

            public final y h() throws RemoteException {
                com.ss.android.socialbase.downloader.downloader.p retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
                if (retryDelayTimeCalculator == null) {
                    return null;
                }
                return new y.a(retryDelayTimeCalculator) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.socialbase.downloader.downloader.p f30980a;

                    {
                        this.f30980a = r1;
                    }

                    public final long a(int i, int i2) throws RemoteException {
                        return this.f30980a.a(i, i2);
                    }
                };
            }

            public final k i() throws RemoteException {
                m diskSpaceHandler = downloadTask.getDiskSpaceHandler();
                if (diskSpaceHandler == null) {
                    return null;
                }
                return new k.a(diskSpaceHandler) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ m f30984a;

                    {
                        this.f30984a = r1;
                    }

                    public final boolean a(long j, long j2, j jVar) throws RemoteException {
                        AnonymousClass2 r5;
                        m mVar = this.f30984a;
                        if (jVar == null) {
                            r5 = null;
                        } else {
                            r5 = new l(jVar) {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ j f30974a;

                                public final void a() {
                                    try {
                                        this.f30974a.a();
                                    } catch (RemoteException unused) {
                                    }
                                }

                                {
                                    this.f30974a = r1;
                                }
                            };
                        }
                        return mVar.a(j, j2, r5);
                    }
                };
            }

            public final h j() throws RemoteException {
                IDownloadMonitorDepend monitorDepend = downloadTask.getMonitorDepend();
                if (monitorDepend == null) {
                    return null;
                }
                return new h.a(monitorDepend) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ IDownloadMonitorDepend f30986a;

                    public final String a() throws RemoteException {
                        return this.f30986a.getEventPage();
                    }

                    {
                        this.f30986a = r1;
                    }

                    public final void a(String str) throws RemoteException {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                this.f30986a.monitorLogSend(new JSONObject(str));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                };
            }

            public final com.ss.android.socialbase.downloader.depend.e k() throws RemoteException {
                return e.a(downloadTask.getFileUriProvider());
            }

            public final int a(int i) throws RemoteException {
                return downloadTask.getDownloadListenerSize(d.c(i));
            }

            public final com.ss.android.socialbase.downloader.depend.g b(int i) throws RemoteException {
                boolean z;
                IDownloadListener singleDownloadListener = downloadTask.getSingleDownloadListener(d.c(i));
                if (i == com.ss.android.socialbase.downloader.constants.g.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return e.a(singleDownloadListener, z);
            }

            public final com.ss.android.socialbase.downloader.depend.g a(int i, int i2) throws RemoteException {
                boolean z;
                IDownloadListener downloadListenerByIndex = downloadTask.getDownloadListenerByIndex(d.c(i), i2);
                if (i == com.ss.android.socialbase.downloader.constants.g.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return e.a(downloadListenerByIndex, z);
            }
        };
    }

    public static DownloadTask a(a aVar) {
        AnonymousClass9 r3;
        AnonymousClass20 r4;
        AnonymousClass10 r42;
        AnonymousClass11 r43;
        AnonymousClass13 r44;
        AnonymousClass17 r45;
        AnonymousClass19 r46;
        if (aVar == null) {
            return null;
        }
        try {
            DownloadTask downloadTask = new DownloadTask(aVar.a());
            final c b2 = aVar.b();
            if (b2 == null) {
                r3 = null;
            } else {
                r3 = new g() {
                    public final int a(long j) {
                        try {
                            return b2.a(j);
                        } catch (RemoteException unused) {
                            return 0;
                        }
                    }
                };
            }
            DownloadTask notificationEventListener = downloadTask.chunkStategy(r3).mainThreadListener(a(aVar.b(com.ss.android.socialbase.downloader.constants.g.MAIN.ordinal()))).subThreadListener(a(aVar.b(com.ss.android.socialbase.downloader.constants.g.SUB.ordinal()))).notificationListener(a(aVar.b(com.ss.android.socialbase.downloader.constants.g.NOTIFICATION.ordinal()))).notificationEventListener(a(aVar.c()));
            final f e2 = aVar.e();
            if (e2 == null) {
                r4 = null;
            } else {
                r4 = new s() {
                    public final boolean a() {
                        try {
                            return e2.a();
                        } catch (RemoteException unused) {
                            return false;
                        }
                    }
                };
            }
            DownloadTask interceptor = notificationEventListener.interceptor(r4);
            final d f2 = aVar.f();
            if (f2 == null) {
                r42 = null;
            } else {
                r42 = new IDownloadDepend() {
                    public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
                        if (downloadInfo != null) {
                            try {
                                f2.a(downloadInfo, baseException, i);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                };
            }
            DownloadTask depend = interceptor.depend(r42);
            final h j = aVar.j();
            if (j == null) {
                r43 = null;
            } else {
                r43 = new IDownloadMonitorDepend() {
                    public final String getEventPage() {
                        try {
                            return j.a();
                        } catch (RemoteException unused) {
                            return "";
                        }
                    }

                    public final void monitorLogSend(JSONObject jSONObject) {
                        if (jSONObject != null) {
                            try {
                                j.a(jSONObject.toString());
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                };
            }
            DownloadTask monitorDepend = depend.monitorDepend(r43);
            final p g = aVar.g();
            if (g == null) {
                r44 = null;
            } else {
                r44 = new r() {
                    public final boolean a(q qVar) {
                        AnonymousClass14 r3;
                        try {
                            p pVar = g;
                            if (qVar == null) {
                                r3 = null;
                            } else {
                                r3 = new o.a(qVar) {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ q f30968a;

                                    public final boolean a() {
                                        return this.f30968a.a();
                                    }

                                    {
                                        this.f30968a = r1;
                                    }

                                    public final void a(List<String> list) {
                                        this.f30968a.a(list);
                                    }
                                };
                            }
                            return pVar.a(r3);
                        } catch (RemoteException unused) {
                            return false;
                        }
                    }
                };
            }
            DownloadTask forbiddenHandler = monitorDepend.forbiddenHandler(r44);
            final k i = aVar.i();
            if (i == null) {
                r45 = null;
            } else {
                r45 = new m() {
                    public final boolean a(long j, long j2, l lVar) {
                        AnonymousClass18 r5;
                        try {
                            k kVar = i;
                            if (lVar == null) {
                                r5 = null;
                            } else {
                                r5 = new j.a(lVar) {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ l f30972a;

                                    public final void a() throws RemoteException {
                                        this.f30972a.a();
                                    }

                                    {
                                        this.f30972a = r1;
                                    }
                                };
                            }
                            return kVar.a(j, j2, r5);
                        } catch (RemoteException unused) {
                            return false;
                        }
                    }
                };
            }
            DownloadTask notificationClickCallback = forbiddenHandler.diskSpaceHandler(r45).fileUriProvider(a(aVar.k())).notificationClickCallback(a(aVar.d()));
            final y h = aVar.h();
            if (h == null) {
                r46 = null;
            } else {
                r46 = new com.ss.android.socialbase.downloader.downloader.p() {
                    public final long a(int i, int i2) {
                        try {
                            return h.a(i, i2);
                        } catch (RemoteException unused) {
                            return 0;
                        }
                    }
                };
            }
            notificationClickCallback.retryDelayTimeCalculator(r46);
            a(downloadTask, aVar, com.ss.android.socialbase.downloader.constants.g.MAIN);
            a(downloadTask, aVar, com.ss.android.socialbase.downloader.constants.g.SUB);
            a(downloadTask, aVar, com.ss.android.socialbase.downloader.constants.g.NOTIFICATION);
            return downloadTask;
        } catch (RemoteException unused) {
            return null;
        }
    }

    private static void a(DownloadTask downloadTask, a aVar, com.ss.android.socialbase.downloader.constants.g gVar) throws RemoteException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.a(gVar.ordinal()); i++) {
            com.ss.android.socialbase.downloader.depend.g a2 = aVar.a(gVar.ordinal(), i);
            if (a2 != null) {
                arrayList.add(a(a2));
            }
        }
        downloadTask.setDownloadListeners(arrayList, gVar);
    }

    public static IDownloadListener a(final com.ss.android.socialbase.downloader.depend.g gVar) {
        if (gVar == null) {
            return null;
        }
        return new IDownloadListener() {
            public final void onCanceled(DownloadInfo downloadInfo) {
                try {
                    gVar.f(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    gVar.g(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    gVar.h(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onPause(DownloadInfo downloadInfo) {
                try {
                    gVar.d(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onPrepare(DownloadInfo downloadInfo) {
                try {
                    gVar.a(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onProgress(DownloadInfo downloadInfo) {
                try {
                    gVar.c(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onStart(DownloadInfo downloadInfo) {
                try {
                    gVar.b(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    gVar.e(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.a(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }

            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.b(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }

            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.c(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.e a(final n nVar) {
        if (nVar == null) {
            return null;
        }
        return new e.a() {
            public final Uri a(String str, String str2) throws RemoteException {
                return nVar.a(str, str2);
            }
        };
    }

    public static n a(final com.ss.android.socialbase.downloader.depend.e eVar) {
        if (eVar == null) {
            return null;
        }
        return new n() {
            public final Uri a(String str, String str2) {
                try {
                    return eVar.a(str, str2);
                } catch (RemoteException unused) {
                    return null;
                }
            }
        };
    }

    public static t a(final u uVar) {
        if (uVar == null) {
            return null;
        }
        return new t.a() {
            public final String a() throws RemoteException {
                return uVar.a();
            }

            public final boolean a(boolean z) throws RemoteException {
                return uVar.a(z);
            }

            public final void a(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                uVar.a(i, downloadInfo, str, str2);
            }
        };
    }

    public static u a(final t tVar) {
        if (tVar == null) {
            return null;
        }
        return new u() {
            public final String a() {
                try {
                    return tVar.a();
                } catch (RemoteException unused) {
                    return null;
                }
            }

            public final boolean a(boolean z) {
                try {
                    return tVar.a(z);
                } catch (RemoteException unused) {
                    return false;
                }
            }

            public final void a(int i, DownloadInfo downloadInfo, String str, String str2) {
                try {
                    tVar.a(i, downloadInfo, str, str2);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    public static w a(final x xVar) {
        if (xVar == null) {
            return null;
        }
        return new w.a() {
            public final boolean a(DownloadInfo downloadInfo) throws RemoteException {
                return xVar.a(downloadInfo);
            }

            public final boolean b(DownloadInfo downloadInfo) throws RemoteException {
                return xVar.b(downloadInfo);
            }
        };
    }

    public static x a(final w wVar) {
        if (wVar == null) {
            return null;
        }
        return new x() {
            public final boolean a(DownloadInfo downloadInfo) {
                try {
                    return wVar.a(downloadInfo);
                } catch (RemoteException unused) {
                    return false;
                }
            }

            public final boolean b(DownloadInfo downloadInfo) {
                try {
                    return wVar.b(downloadInfo);
                } catch (RemoteException unused) {
                    return false;
                }
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.g a(final IDownloadListener iDownloadListener, final boolean z) {
        if (iDownloadListener == null) {
            return null;
        }
        return new g.a() {
            public final void a(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onPrepare(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPrepare(downloadInfo);
                }
            }

            public final void b(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onStart(downloadInfo);
                }
            }

            public final void c(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onProgress(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onProgress(downloadInfo);
                }
            }

            public final void d(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onPause(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPause(downloadInfo);
                }
            }

            public final void e(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onSuccessed(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onSuccessed(downloadInfo);
                }
            }

            public final void f(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onCanceled(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onCanceled(downloadInfo);
                }
            }

            public final void g(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFirstStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstStart(downloadInfo);
                }
            }

            public final void h(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFirstSuccess(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstSuccess(downloadInfo);
                }
            }

            public final void a(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFailed(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onFailed(downloadInfo, baseException);
                }
            }

            public final void b(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onRetry(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetry(downloadInfo, baseException);
                }
            }

            public final void c(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    e.f30936a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onRetryDelay(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                }
            }
        };
    }
}
