package com.ss.android.downloadlib.addownload;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadlib.addownload.i;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.c.l;
import com.ss.android.downloadlib.core.download.DownloadHandlerService;
import com.ss.android.downloadlib.core.download.j;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class f implements com.ss.android.download.api.b.a.b, h, l.a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28784a = "f";
    private static final SharedPreferences j = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_old_collect", 0);
    private static final String k = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    /* renamed from: b  reason: collision with root package name */
    public i f28785b;

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, com.ss.android.download.api.b.d> f28786c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public e f28787d;

    /* renamed from: e  reason: collision with root package name */
    public DownloadInfo f28788e;

    /* renamed from: f  reason: collision with root package name */
    public IDownloadListener f28789f = new i.a(this.l);
    public boolean g = false;
    public boolean h = false;
    public com.ss.android.download.api.b.c i = null;
    private final l l = new l(Looper.getMainLooper(), this);
    private WeakReference<Activity> m;
    private long n;
    private c o;
    private e p;
    private d q;
    private a r;
    private boolean s;
    private long t;
    private Map<Long, com.ss.android.download.api.b.c> u = new ConcurrentHashMap();
    private long v = -1;
    private com.ss.android.download.api.b.b w = null;
    private com.ss.android.download.api.b.a x = null;
    private boolean y;

    class a extends AsyncTask<String, Void, e> {
        private a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            boolean z;
            e eVar = (e) obj;
            f fVar = f.this;
            if (eVar != null) {
                z = true;
            } else {
                z = false;
            }
            fVar.h = z;
            f.this.g = true;
            f.this.h();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            if (strArr == null || (strArr.length > 0 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            return com.ss.android.downloadlib.core.download.d.a(k.a()).a(strArr[0]);
        }

        /* synthetic */ a(f fVar, byte b2) {
            this();
        }
    }

    class b extends AsyncTask<Void, Void, Void> {
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0 A[SYNTHETIC, Splitter:B:40:0x00a0] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7 A[SYNTHETIC, Splitter:B:48:0x00a7] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Void a() {
            /*
                android.content.Context r0 = com.ss.android.downloadlib.addownload.k.a()
                com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.a((android.content.Context) r0)
                r1 = 0
                com.ss.android.downloadlib.core.download.g r2 = r0.f28951a     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
                android.net.Uri r3 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
                r8 = 1
                java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
                java.lang.String r5 = "_id"
                r9 = 0
                r4[r9] = r5     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
                java.lang.String r5 = "status < '198' "
                r6 = 0
                java.lang.String r7 = "lastmod"
                android.database.Cursor r2 = r2.a((android.net.Uri) r3, (java.lang.String[]) r4, (java.lang.String) r5, (java.lang.String[]) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
                if (r2 == 0) goto L_0x002c
                int r3 = r2.getCount()     // Catch:{ Exception -> 0x00a5, all -> 0x0028 }
                r2.close()     // Catch:{ Exception -> 0x00a5, all -> 0x0028 }
                goto L_0x002d
            L_0x0028:
                r0 = move-exception
                r5 = r2
                goto L_0x009e
            L_0x002c:
                r3 = 0
            L_0x002d:
                com.ss.android.downloadlib.core.download.g r10 = r0.f28951a     // Catch:{ Exception -> 0x00a5, all -> 0x0028 }
                android.net.Uri r11 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x00a5, all -> 0x0028 }
                java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00a5, all -> 0x0028 }
                java.lang.String r4 = "_id"
                r12[r9] = r4     // Catch:{ Exception -> 0x00a5, all -> 0x0028 }
                java.lang.String r13 = "status >= '200' AND status < '300' "
                r14 = 0
                java.lang.String r15 = "lastmod"
                android.database.Cursor r4 = r10.a((android.net.Uri) r11, (java.lang.String[]) r12, (java.lang.String) r13, (java.lang.String[]) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x00a5, all -> 0x0028 }
                if (r4 == 0) goto L_0x004d
                int r2 = r4.getCount()     // Catch:{ Exception -> 0x009a, all -> 0x004a }
                r4.close()     // Catch:{ Exception -> 0x009a, all -> 0x004a }
                goto L_0x004e
            L_0x004a:
                r0 = move-exception
                r5 = r4
                goto L_0x009e
            L_0x004d:
                r2 = 0
            L_0x004e:
                com.ss.android.downloadlib.core.download.g r10 = r0.f28951a     // Catch:{ Exception -> 0x009a, all -> 0x004a }
                android.net.Uri r11 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x009a, all -> 0x004a }
                java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Exception -> 0x009a, all -> 0x004a }
                java.lang.String r0 = "_id"
                r12[r9] = r0     // Catch:{ Exception -> 0x009a, all -> 0x004a }
                java.lang.String r13 = "( status >= '400' AND status < '600') OR status = '198' OR status = '199' "
                r14 = 0
                java.lang.String r15 = "lastmod"
                android.database.Cursor r5 = r10.a((android.net.Uri) r11, (java.lang.String[]) r12, (java.lang.String) r13, (java.lang.String[]) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x009a, all -> 0x004a }
                if (r5 == 0) goto L_0x006d
                int r9 = r5.getCount()     // Catch:{ Exception -> 0x0098, all -> 0x006b }
                r5.close()     // Catch:{ Exception -> 0x0098, all -> 0x006b }
                goto L_0x006d
            L_0x006b:
                r0 = move-exception
                goto L_0x009e
            L_0x006d:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0098, all -> 0x006b }
                r0.<init>()     // Catch:{ Exception -> 0x0098, all -> 0x006b }
                java.lang.String r4 = "count_downloading"
                r0.put(r4, r3)     // Catch:{ JSONException -> 0x0081 }
                java.lang.String r3 = "count_download_finish"
                r0.put(r3, r2)     // Catch:{ JSONException -> 0x0081 }
                java.lang.String r2 = "count_download_failed"
                r0.put(r2, r9)     // Catch:{ JSONException -> 0x0081 }
            L_0x0081:
                java.lang.String r10 = "old_collect"
                java.lang.String r11 = "old_collect"
                r12 = 1
                r13 = -1
                r15 = 0
                r16 = -1
                r19 = -1
                r18 = r0
                com.ss.android.downloadlib.addownload.j.a(r10, r11, r12, r13, r15, r16, r18, r19)     // Catch:{ Exception -> 0x0098, all -> 0x006b }
                if (r5 == 0) goto L_0x00aa
                r5.close()     // Catch:{ Exception -> 0x00aa }
                goto L_0x00aa
            L_0x0098:
                r2 = r5
                goto L_0x00a5
            L_0x009a:
                r2 = r4
                goto L_0x00a5
            L_0x009c:
                r0 = move-exception
                r5 = r1
            L_0x009e:
                if (r5 == 0) goto L_0x00a3
                r5.close()     // Catch:{ Exception -> 0x00a3 }
            L_0x00a3:
                throw r0
            L_0x00a4:
                r2 = r1
            L_0x00a5:
                if (r2 == 0) goto L_0x00aa
                r2.close()     // Catch:{ Exception -> 0x00aa }
            L_0x00aa:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.f.b.a():java.lang.Void");
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }

        /* synthetic */ b(f fVar, byte b2) {
            this();
        }
    }

    class c extends AsyncTask<String, Void, e> {
        private c() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            if (strArr == null || (strArr.length > 0 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            return com.ss.android.downloadlib.core.download.d.a(k.a()).a(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            e eVar = (e) obj;
            super.onPostExecute(eVar);
            if (!isCancelled() && f.this.i != null) {
                try {
                    boolean a2 = k.a(f.this.i);
                    if (eVar != null && eVar.f28491a > -1 && (a2 || !com.ss.android.downloadlib.core.download.d.a(k.a()).a(eVar))) {
                        if (f.this.f28787d == null || f.this.f28787d.f28492b != 16) {
                            f.this.f28787d = eVar;
                            com.ss.android.downloadlib.core.download.e.a(k.a()).a(Long.valueOf(f.this.f28787d.f28491a), (com.ss.android.download.api.b.a.b) f.this).a(Long.valueOf(f.this.f28787d.f28491a), String.valueOf(f.this.i.b()), 0, f.this.i.p(), f.this.g().c(), f.this.i.c());
                        } else {
                            f.this.f28787d = null;
                        }
                        f.this.f28785b.a(eVar, f.this.f28786c);
                    } else if (a2) {
                        if (f.this.f28787d == null) {
                            f.this.f28787d = new e();
                            f.this.f28787d.f28492b = 8;
                        }
                        f.this.f28785b.a(f.this.f28787d, f.this.f28786c);
                    } else {
                        if (!f.this.f28786c.isEmpty()) {
                            for (com.ss.android.download.api.b.d a3 : f.this.f28786c.values()) {
                                a3.a();
                            }
                        }
                        f.this.f28787d = null;
                    }
                    f.this.f28785b.b(eVar);
                } catch (Exception unused) {
                }
            }
        }

        /* synthetic */ c(f fVar, byte b2) {
            this();
        }
    }

    class d extends AsyncTask<String, Void, DownloadInfo> {
        private d() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            if (strArr == null || (strArr.length > 0 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            String str = strArr[0];
            if (f.this.i == null || TextUtils.isEmpty(f.this.i.k())) {
                return AppDownloader.getInstance().getAppDownloadInfo(k.a(), str);
            }
            return Downloader.getInstance(k.a()).getDownloadInfo(str, f.this.i.k());
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            DownloadInfo downloadInfo = (DownloadInfo) obj;
            super.onPostExecute(downloadInfo);
            if (!isCancelled() && f.this.i != null) {
                try {
                    boolean a2 = k.a(f.this.i.q(), f.this.i.m(), f.this.i.n()).a();
                    if (downloadInfo == null || downloadInfo.getId() == 0 || (!a2 && Downloader.getInstance(k.a()).isDownloadSuccessAndFileNotExist(downloadInfo))) {
                        if (f.this.f28788e != null) {
                            Downloader.getInstance(k.a()).removeTaskMainListener(f.this.f28788e.getId());
                        }
                        if (a2) {
                            if (f.this.f28788e == null) {
                                f.this.f28788e = new DownloadInfo.a(f.this.i.a()).a();
                                f.this.f28788e.setStatus(-3);
                            }
                            f.this.f28785b.a(f.this.f28788e, f.this.i(), f.this.f28786c);
                        } else {
                            if (!f.this.f28786c.isEmpty()) {
                                for (com.ss.android.download.api.b.d a3 : f.this.f28786c.values()) {
                                    a3.a();
                                }
                            }
                            f.this.f28788e = null;
                        }
                    } else {
                        Downloader.getInstance(k.a()).removeTaskMainListener(downloadInfo.getId());
                        if (f.this.f28788e == null || !(f.this.f28788e.getStatus() == -4 || f.this.f28788e.getStatus() == -1)) {
                            f.this.f28788e = downloadInfo;
                            Downloader.getInstance(k.a()).setMainThreadListener(f.this.f28788e.getId(), f.this.f28789f);
                        } else {
                            f.this.f28788e = null;
                        }
                        f.this.f28785b.a(downloadInfo, f.this.i(), f.this.f28786c);
                    }
                    f.this.f28785b.b(f.this.i());
                } catch (Exception unused) {
                }
            }
        }

        /* synthetic */ d(f fVar, byte b2) {
            this();
        }
    }

    public final boolean e() {
        return false;
    }

    public final boolean b() {
        return this.s;
    }

    public final long d() {
        return this.t;
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            this.f28786c.clear();
        } else {
            this.f28786c.remove(Integer.valueOf(i2));
        }
        if (!this.f28786c.isEmpty()) {
            return false;
        }
        this.s = false;
        this.t = System.currentTimeMillis();
        if (k.a(this.h, this.i.o())) {
            if (this.f28787d != null) {
                com.ss.android.downloadlib.core.download.e.a(k.a()).b(Long.valueOf(this.f28787d.f28491a), (com.ss.android.download.api.b.a.b) this);
            }
            if (!(this.o == null || this.o.getStatus() == AsyncTask.Status.FINISHED)) {
                this.o.cancel(true);
            }
        } else {
            if (this.f28788e != null) {
                Downloader.getInstance(k.a()).removeTaskMainListener(this.f28788e.getId());
            }
            if (!(this.q == null || this.q.getStatus() == AsyncTask.Status.FINISHED)) {
                this.q.cancel(true);
            }
        }
        this.f28785b.a(this.f28788e);
        String str = f28784a;
        StringBuilder sb = new StringBuilder("onUnbind removeCallbacksAndMessages, downloadUrl:");
        sb.append(this.f28788e == null ? "" : this.f28788e.getUrl());
        com.ss.android.downloadlib.c.c.a(str, sb.toString(), null);
        this.l.removeCallbacksAndMessages(null);
        this.f28787d = null;
        this.p = null;
        this.f28788e = null;
        this.u.clear();
        return true;
    }

    public final void a(boolean z) {
        if (k.a(this.h, this.i.o())) {
            if (this.f28787d != null) {
                if (z) {
                    com.ss.android.downloadlib.core.download.d.a(k.a()).a(this.n);
                    i.a(this.n, this.i.d(), this.i.a());
                    return;
                }
                k.a().startService(new Intent("android.ss.intent.action.DOWNLOAD_DELETE", ContentUris.withAppendedId(j.a.f29029a, this.f28787d.f28491a), k.a(), DownloadHandlerService.class));
            }
        } else if (this.f28788e != null) {
            if (z) {
                IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                if (appDownloadEventHandler != null) {
                    appDownloadEventHandler.handleDownloadCancel(this.f28788e);
                }
                DownloadNotificationManager.getInstance().cancelNotification(this.f28788e.getId());
                Downloader.getInstance(k.a()).clearDownloadData(this.f28788e.getId());
                return;
            }
            Intent intent = new Intent(k.a(), com.ss.android.socialbase.appdownloader.DownloadHandlerService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_DELETE");
            intent.putExtra("extra_click_download_ids", this.f28788e.getId());
            k.a().startService(intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        r4.f28785b.a(r5, i(), r4.f28786c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Message r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00a0
            boolean r0 = r4.s
            if (r0 == 0) goto L_0x00a0
            java.util.Map<java.lang.Integer, com.ss.android.download.api.b.d> r0 = r4.f28786c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0010
            goto L_0x00a0
        L_0x0010:
            int r0 = r5.what
            r1 = 0
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0093;
                case 2: goto L_0x0093;
                case 3: goto L_0x008d;
                case 4: goto L_0x0053;
                case 5: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x009f
        L_0x0019:
            java.lang.String r5 = f28784a
            java.lang.String r0 = "handleMsg QUICK_APP_ITEM_CLICK next"
            com.ss.android.downloadlib.c.c.a(r5, r0, r2)
            com.ss.android.download.api.config.a r5 = com.ss.android.downloadlib.addownload.k.i()
            if (r5 == 0) goto L_0x0031
            com.ss.android.download.api.config.a r5 = com.ss.android.downloadlib.addownload.k.i()
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x0031
            return
        L_0x0031:
            java.lang.String r5 = f28784a
            java.lang.String r0 = "handleMsg QUICK_APP_ITEM_CLICK next"
            com.ss.android.downloadlib.c.c.a(r5, r0, r2)
            com.ss.android.download.api.b.b r5 = r4.w
            if (r5 != 0) goto L_0x003f
            java.lang.String r5 = ""
            goto L_0x0045
        L_0x003f:
            com.ss.android.download.api.b.b r5 = r4.w
            java.lang.String r5 = r5.A()
        L_0x0045:
            com.ss.android.downloadlib.addownload.e.a()
            com.ss.android.download.api.b.c r0 = r4.i
            r2 = 1
            com.ss.android.downloadlib.addownload.e.a(r1, r0, r5, r2)
            r4.c(r1)
            goto L_0x009f
        L_0x0053:
            java.lang.String r5 = f28784a
            java.lang.String r0 = "handleMsg QUICK_APP_BUTTON_CLICK start"
            com.ss.android.downloadlib.c.c.a(r5, r0, r2)
            com.ss.android.download.api.config.a r5 = com.ss.android.downloadlib.addownload.k.i()
            if (r5 == 0) goto L_0x006b
            com.ss.android.download.api.config.a r5 = com.ss.android.downloadlib.addownload.k.i()
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x006b
            return
        L_0x006b:
            java.lang.String r5 = f28784a
            java.lang.String r0 = "handleMsg QUICK_APP_BUTTON_CLICK next"
            com.ss.android.downloadlib.c.c.a(r5, r0, r2)
            com.ss.android.download.api.b.b r5 = r4.w
            if (r5 != 0) goto L_0x0079
            java.lang.String r5 = ""
            goto L_0x007f
        L_0x0079:
            com.ss.android.download.api.b.b r5 = r4.w
            java.lang.String r5 = r5.A()
        L_0x007f:
            com.ss.android.downloadlib.addownload.e.a()
            com.ss.android.download.api.b.c r0 = r4.i
            r2 = 2
            com.ss.android.downloadlib.addownload.e.a(r1, r0, r5, r2)
            r4.b(r1)
            return
        L_0x008d:
            java.lang.Object r0 = r5.obj
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            r4.f28788e = r0
        L_0x0093:
            com.ss.android.downloadlib.addownload.i r0 = r4.f28785b
            com.ss.android.download.api.c.e r1 = r4.i()
            java.util.Map<java.lang.Integer, com.ss.android.download.api.b.d> r2 = r4.f28786c
            r0.a((android.os.Message) r5, (com.ss.android.download.api.c.e) r1, (java.util.Map<java.lang.Integer, com.ss.android.download.api.b.d>) r2)
            return
        L_0x009f:
            return
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.f.a(android.os.Message):void");
    }

    public final void a(e eVar, int i2, long j2, long j3, long j4) {
        if (eVar != null && eVar.f28491a == this.n && !this.f28786c.isEmpty()) {
            this.f28787d = eVar;
            double d2 = 0.0d;
            try {
                double d3 = (double) eVar.f28494d;
                double d4 = (double) eVar.f28493c;
                Double.isNaN(d3);
                Double.isNaN(d4);
                d2 = d3 / d4;
            } catch (Exception unused) {
            }
            int i3 = (int) (d2 * 100.0d);
            if (i3 < 0) {
                i3 = 0;
            }
            a(eVar, i3, i2, 1);
        }
    }

    private i l() {
        if (this.f28785b == null) {
            this.f28785b = new i();
        }
        return this.f28785b;
    }

    @NonNull
    private com.ss.android.download.api.b.b n() {
        if (this.w == null) {
            return new com.ss.android.download.api.b.e();
        }
        return this.w;
    }

    @NonNull
    public final com.ss.android.download.api.b.a g() {
        if (this.x == null) {
            return new com.ss.android.downloadad.api.a.a();
        }
        return this.x;
    }

    public final e i() {
        if (this.p == null) {
            this.p = new e();
        }
        return this.p;
    }

    private void j() {
        if (this.f28787d == null) {
            this.f28785b.a(2);
            this.f28785b.a((com.ss.android.downloadlib.a.c) new com.ss.android.downloadlib.a.c() {
                public final void b() {
                }

                public final void a() {
                    f.this.f();
                }
            });
            return;
        }
        k();
    }

    private Activity m() {
        if (this.m != null) {
            Activity activity = (Activity) this.m.get();
            if (activity != null) {
                return activity;
            }
        }
        return null;
    }

    public final boolean c() {
        if (k.a(this.h, this.i.o())) {
            if (this.f28787d != null) {
                return true;
            }
            return false;
        } else if (this.f28788e != null) {
            return true;
        } else {
            return false;
        }
    }

    private void k() {
        com.ss.android.downloadlib.core.download.d.a(k.a(), this.f28787d.f28492b, this.f28787d.f28491a, this.i.q());
        this.f28785b.c(this.f28787d);
        if (this.f28787d != null && this.f28787d.f28491a >= 0) {
            com.ss.android.downloadlib.core.download.e.a(k.a()).a(Long.valueOf(this.f28787d.f28491a), (com.ss.android.download.api.b.a.b) this).a(Long.valueOf(this.f28787d.f28491a), String.valueOf(this.i.b()), 0, this.i.p(), g().c(), this.i.c());
        }
        if (this.f28787d.f28492b == 8) {
            this.f28785b.c();
        }
    }

    public final void h() {
        if (k.a(this.h, this.i.o())) {
            if (!(this.o == null || this.o.getStatus() == AsyncTask.Status.FINISHED)) {
                this.o.cancel(true);
            }
            this.o = new c(this, (byte) 0);
            com.ss.android.downloadlib.c.a.a.a(this.o, this.i.a(), this.i.q());
            return;
        }
        if (!(this.q == null || this.q.getStatus() == AsyncTask.Status.FINISHED)) {
            this.q.cancel(true);
        }
        this.q = new d(this, (byte) 0);
        com.ss.android.downloadlib.c.a.a.a(this.q, this.i.a(), this.i.q());
    }

    public final void f() {
        if (k.a(this.h, this.i.o())) {
            for (com.ss.android.download.api.b.d a2 : this.f28786c.values()) {
                a2.a(this.i, g());
            }
            long a3 = this.f28785b.a(k.a());
            if (a3 >= 0) {
                this.f28785b.a((String) null);
                com.ss.android.downloadlib.core.download.e.a(k.a()).a(Long.valueOf(a3), (com.ss.android.download.api.b.a.b) this).a(Long.valueOf(a3), String.valueOf(this.i.b()), 0, this.i.p(), g().c(), this.i.c());
                if (n().y()) {
                    com.ss.android.downloadlib.a.a().a(new com.ss.android.downloadad.api.b.a(this.i, a3));
                }
            } else if (a3 < 0) {
                e eVar = new e();
                eVar.f28492b = 16;
                a(eVar, 0, 3, 2);
                this.f28785b.e();
            }
            if (this.f28785b.b(c())) {
                k.c().a(m(), this.i, g(), n());
            }
            return;
        }
        for (com.ss.android.download.api.b.d a4 : this.f28786c.values()) {
            a4.a(this.i, g());
        }
        int a5 = this.f28785b.a(k.a(), this.f28789f);
        String str = f28784a;
        com.ss.android.downloadlib.c.c.a(str, "beginDownloadWithNewDownloader id:" + a5, null);
        if (a5 != 0) {
            if (this.f28788e == null) {
                if (j.b(this.i)) {
                    this.f28785b.a((String) null);
                } else {
                    this.f28785b.d();
                }
            }
            this.f28785b.c(this.f28788e);
            if (n().y()) {
                com.ss.android.downloadlib.a.a().a(new com.ss.android.downloadad.api.b.a(this.i, (long) a5));
            }
        } else {
            DownloadInfo a6 = new DownloadInfo.a(this.i.a()).a();
            a6.setStatus(-1);
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = a6;
            this.l.sendMessage(obtain);
            this.f28785b.e();
        }
        if (this.f28785b.b(c())) {
            k.c().a(m(), this.i, g(), n());
            String str2 = f28784a;
            com.ss.android.downloadlib.c.c.a(str2, "beginDownloadWithNewDownloader onItemClick id:" + a5, null);
        }
    }

    public final void a() {
        this.s = true;
        if (!this.g) {
            if (!(this.r == null || this.r.getStatus() == AsyncTask.Status.FINISHED)) {
                this.r.cancel(true);
            }
            this.r = new a(this, (byte) 0);
            com.ss.android.downloadlib.c.a.a.a(this.r, this.i.a(), this.i.q());
            if (k.g().optInt("is_old_collect") == 1 && !k.equals(j.getString("date_time", ""))) {
                synchronized (f.class) {
                    if (!k.equals(j.getString("date_time", ""))) {
                        j.edit().putString("date_time", k).apply();
                        com.ss.android.downloadlib.c.a.a.a(new b(this, (byte) 0), new Void[0]);
                    }
                }
                return;
            }
            return;
        }
        h();
    }

    public final void a(long j2) {
        this.n = j2;
    }

    private void c(boolean z) {
        if (z) {
            this.f28785b.a(1);
        }
        if (k.a(this.h, this.i.o())) {
            d(z);
        } else {
            f(z);
        }
    }

    private void e(boolean z) {
        if (k.a(this.h, this.i.o())) {
            j();
        } else {
            g(z);
        }
        this.f28785b.a();
    }

    private void b(boolean z) {
        if (this.f28785b.a(this.y) != 1) {
            e(z);
            return;
        }
        if (z) {
            this.f28785b.a(1);
        }
        k.c().a(m(), this.i, g(), n());
    }

    private void d(boolean z) {
        if (this.f28785b.a(this.f28787d)) {
            e(z);
        } else {
            k.c().a(m(), this.i, g(), n());
        }
    }

    private void f(boolean z) {
        com.ss.android.downloadlib.c.c.a(f28784a, "performItemClickWithNewDownloader", null);
        if (this.f28785b.b(this.f28788e)) {
            com.ss.android.downloadlib.c.c.a(f28784a, "performItemClickWithNewDownloader ButtonClick", null);
            g(z);
            return;
        }
        com.ss.android.downloadlib.c.c.a(f28784a, "performItemClickWithNewDownloader onItemClick", null);
        k.c().a(m(), this.i, g(), n());
    }

    public final /* synthetic */ h a(Activity activity) {
        if (activity != null) {
            this.m = new WeakReference<>(activity);
        }
        return this;
    }

    public final /* synthetic */ h a(com.ss.android.download.api.b.a aVar) {
        this.x = aVar;
        l().a(g());
        return this;
    }

    private void g(boolean z) {
        com.ss.android.downloadlib.c.c.a(f28784a, "performButtonClickWithNewDownloader", null);
        if (this.f28788e == null || (this.f28788e.getStatus() != -3 && !Downloader.getInstance(k.a()).canResume(this.f28788e.getId()))) {
            if (z) {
                this.f28785b.a(2);
            }
            com.ss.android.downloadlib.c.c.a(f28784a, "performButtonClickWithNewDownloader not start", null);
            this.f28785b.a((com.ss.android.downloadlib.a.c) new com.ss.android.downloadlib.a.c() {
                public final void a() {
                    com.ss.android.downloadlib.c.c.a(f.f28784a, "performButtonClickWithNewDownloader start download", null);
                    f.this.f();
                }

                public final void b() {
                    com.ss.android.downloadlib.c.c.a(f.f28784a, "performButtonClickWithNewDownloader onDenied", null);
                }
            });
            return;
        }
        String str = f28784a;
        com.ss.android.downloadlib.c.c.a(str, "performButtonClickWithNewDownloader continue download, status:" + this.f28788e.getStatus(), null);
        this.f28785b.c(this.f28788e);
        AppDownloader.getInstance().handleStatusClick(k.a(), this.f28788e.getId(), this.f28788e.getStatus());
        if (!(this.f28788e.getId() == 0 || this.f28789f == null)) {
            Downloader.getInstance(k.a()).setMainThreadListener(this.f28788e.getId(), this.f28789f);
        }
        if (this.f28788e.getStatus() == -3) {
            this.f28785b.c();
        }
    }

    public final /* synthetic */ h a(com.ss.android.download.api.b.b bVar) {
        boolean z;
        this.w = bVar;
        if (n().v() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.y = z;
        l().f28824b = n();
        return this;
    }

    public final /* synthetic */ h a(com.ss.android.download.api.b.c cVar) {
        if (cVar != null) {
            this.u.put(Long.valueOf(cVar.b()), cVar);
            this.i = cVar;
            if (j.a(cVar)) {
                ((com.ss.android.downloadad.api.a.c) cVar).f28638a = 3;
            }
            l().a(this.i);
        }
        return this;
    }

    public final /* synthetic */ h a(int i2, com.ss.android.download.api.b.d dVar) {
        if (dVar != null) {
            this.f28786c.put(Integer.valueOf(i2), dVar);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r11, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = f28784a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleDownload id:"
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = ",actionType:"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.ss.android.downloadlib.c.c.a(r0, r1, r2)
            com.ss.android.downloadlib.addownload.i r0 = r10.f28785b
            android.content.Context r1 = com.ss.android.downloadlib.addownload.k.a()
            boolean r3 = r10.y
            boolean r0 = r0.a((android.content.Context) r1, (int) r13, (boolean) r3)
            if (r0 != 0) goto L_0x01bb
            java.util.Map<java.lang.Long, com.ss.android.download.api.b.c> r0 = r10.u
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.download.api.b.c r0 = (com.ss.android.download.api.b.c) r0
            if (r0 == 0) goto L_0x0045
            r10.i = r0
            r10.v = r11
            com.ss.android.downloadlib.addownload.i r0 = r10.l()
            com.ss.android.download.api.b.c r1 = r10.i
            r0.a((com.ss.android.download.api.b.c) r1)
        L_0x0045:
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.k.g()
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0094
            org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.k.g()
            java.lang.String r5 = "quick_app_enable_switch"
            int r1 = r1.optInt(r5, r4)
            if (r1 == 0) goto L_0x0060
            goto L_0x0094
        L_0x0060:
            com.ss.android.download.api.b.c r1 = r10.i
            if (r1 == 0) goto L_0x0078
            com.ss.android.download.api.c.g r5 = r1.v()
            if (r5 == 0) goto L_0x0078
            com.ss.android.download.api.c.g r1 = r1.v()
            java.lang.String r1 = r1.f28496a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0078
            r1 = 1
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r1 == 0) goto L_0x0094
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r10.f28788e
            if (r1 == 0) goto L_0x008f
            int r5 = r1.getStatus()
            if (r5 == 0) goto L_0x008f
            int r1 = r1.getStatus()
            r5 = -4
            if (r1 != r5) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r1 = 0
            goto L_0x0090
        L_0x008f:
            r1 = 1
        L_0x0090:
            if (r1 == 0) goto L_0x0094
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            if (r1 != 0) goto L_0x0099
            goto L_0x0155
        L_0x0099:
            r1 = -1
            com.ss.android.download.api.b.c r5 = r10.i
            com.ss.android.download.api.c.g r5 = r5.v()
            java.lang.String r5 = r5.f28496a
            switch(r13) {
                case 1: goto L_0x00b7;
                case 2: goto L_0x00a6;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            goto L_0x00c7
        L_0x00a6:
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 4
            com.ss.android.downloadlib.addownload.i r6 = r10.f28785b
            long r7 = r0.longValue()
            r6.a((long) r7)
            goto L_0x00c7
        L_0x00b7:
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.ss.android.downloadlib.addownload.i r1 = r10.f28785b
            long r6 = r0.longValue()
            r1.a((long) r6)
            r1 = 5
        L_0x00c7:
            android.content.Context r6 = com.ss.android.downloadlib.addownload.k.a()
            boolean r5 = com.ss.android.downloadlib.c.k.e(r6, r5)
            if (r5 == 0) goto L_0x013b
            android.os.Message r0 = android.os.Message.obtain()
            r0.what = r1
            com.ss.android.download.api.b.c r4 = r10.i
            long r6 = r4.b()
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0.obj = r4
            com.ss.android.downloadlib.c.l r4 = r10.l
            com.ss.android.downloadlib.addownload.e.a()
            long r6 = com.ss.android.downloadlib.addownload.e.b()
            r4.sendMessageDelayed(r0, r6)
            com.ss.android.downloadlib.addownload.e r0 = com.ss.android.downloadlib.addownload.e.a()
            com.ss.android.download.api.b.c r4 = r10.i
            com.ss.android.download.api.b.b r6 = r10.w
            java.lang.String r7 = com.ss.android.downloadlib.addownload.e.f28776a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "sendQuickAppMsg msgWhat:"
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.ss.android.downloadlib.c.c.a(r7, r8, r2)
            com.ss.android.downloadlib.c.l r7 = r0.f28779c
            if (r7 != 0) goto L_0x010f
            goto L_0x0154
        L_0x010f:
            android.os.Message r7 = android.os.Message.obtain()
            r7.what = r1
            long r8 = r4.b()
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r7.obj = r1
            java.util.Map<java.lang.Long, android.util.Pair<com.ss.android.download.api.b.c, com.ss.android.download.api.b.b>> r1 = r0.f28778b
            long r8 = r4.b()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r4, r6)
            r1.put(r8, r9)
            com.ss.android.downloadlib.c.l r0 = r0.f28779c
            long r8 = com.ss.android.downloadlib.addownload.e.b()
            r0.sendMessageDelayed(r7, r8)
            goto L_0x0154
        L_0x013b:
            com.ss.android.downloadlib.addownload.e.a()
            com.ss.android.download.api.b.c r1 = r10.i
            com.ss.android.download.api.b.b r6 = r10.w
            if (r6 != 0) goto L_0x0147
            java.lang.String r6 = ""
            goto L_0x014d
        L_0x0147:
            com.ss.android.download.api.b.b r6 = r10.w
            java.lang.String r6 = r6.A()
        L_0x014d:
            long r7 = r0.longValue()
            com.ss.android.downloadlib.addownload.e.a(r4, r1, r6, r7)
        L_0x0154:
            r4 = r5
        L_0x0155:
            java.lang.String r0 = f28784a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "handleDownload mIsNormalScene:"
            r1.<init>(r5)
            boolean r5 = r10.y
            r1.append(r5)
            java.lang.String r5 = ",mCurrentId:"
            r1.append(r5)
            long r5 = r10.v
            r1.append(r5)
            java.lang.String r5 = ",interceptQuickApp:"
            r1.append(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.ss.android.downloadlib.c.c.a(r0, r1, r2)
            switch(r13) {
                case 1: goto L_0x019e;
                case 2: goto L_0x0180;
                default: goto L_0x017f;
            }
        L_0x017f:
            goto L_0x01bb
        L_0x0180:
            if (r4 != 0) goto L_0x01bb
            java.lang.String r13 = f28784a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleDownload id:"
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ",tryPerformButtonClick:"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.ss.android.downloadlib.c.c.a(r13, r11, r2)
            r10.b(r3)
            return
        L_0x019e:
            if (r4 != 0) goto L_0x01bb
            java.lang.String r13 = f28784a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleDownload id:"
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ",tryPerformItemClick:"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.ss.android.downloadlib.c.c.a(r13, r11, r2)
            r10.c(r3)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.f.a(long, int):void");
    }

    private void a(e eVar, int i2, int i3, int i4) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.arg1 = i3;
        obtain.arg2 = i2;
        obtain.obj = eVar;
        this.l.sendMessage(obtain);
    }
}
