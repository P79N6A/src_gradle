package com.ss.android.downloadlib.addownload;

import android.content.ContentValues;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.d;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.c.h;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.c.l;
import com.ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.g;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class i implements l.a {

    /* renamed from: a  reason: collision with root package name */
    public c f28823a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.download.api.b.b f28824b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.download.api.b.a f28825c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.download.api.c.b f28826d;

    /* renamed from: e  reason: collision with root package name */
    private int f28827e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28828f;
    private final l g = new l(Looper.getMainLooper(), this);
    private b h;

    static class a extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        private l f28835a;

        public final void onCanceled(DownloadInfo downloadInfo) {
            a(downloadInfo);
        }

        public final void onPause(DownloadInfo downloadInfo) {
            a(downloadInfo);
        }

        public final void onPrepare(DownloadInfo downloadInfo) {
            a(downloadInfo);
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            a(downloadInfo);
        }

        public final void onStart(DownloadInfo downloadInfo) {
            a(downloadInfo);
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            a(downloadInfo);
        }

        a(l lVar) {
            this.f28835a = lVar;
        }

        private void a(DownloadInfo downloadInfo) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = downloadInfo;
            this.f28835a.sendMessage(obtain);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            a(downloadInfo);
        }
    }

    public interface b {
        void a(DownloadInfo downloadInfo);
    }

    public final void a(@NonNull c cVar) {
        this.f28823a = cVar;
        this.f28826d = cVar.r();
    }

    public final void a(@NonNull com.ss.android.download.api.b.a aVar) {
        this.f28825c = aVar;
        this.f28827e = aVar.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(DownloadInfo downloadInfo) {
        this.f28828f = false;
        if (this.h != null) {
            this.h.a(downloadInfo);
            this.h = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Context context, int i, boolean z) {
        return (j.a(this.f28827e) && a(context, i)) || (!z && j.c(this.f28827e) && b(context));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(e eVar) {
        return d(eVar) || e(eVar);
    }

    public final void a() {
        if (j.b(this.f28827e) && this.f28826d != null) {
            com.ss.android.download.api.c.b bVar = new com.ss.android.download.api.c.b();
            bVar.f28461a = this.f28823a.b();
            bVar.f28462b = this.f28823a.c();
            bVar.f28464d = this.f28826d.f28464d;
            bVar.f28466f = this.f28823a.p();
            a.a().a(this.f28823a.q(), bVar);
            q();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull final com.ss.android.downloadlib.a.c cVar) {
        a((com.ss.android.download.api.config.l) new com.ss.android.download.api.config.l() {
            public final void a() {
                cVar.a();
            }

            public final void a(String str) {
                k.d().a(k.a(), k.a().getResources().getString(C0906R.string.c5), null, 1);
                i iVar = i.this;
                if (iVar.f28824b != null && iVar.f28824b.x()) {
                    String k = iVar.f28824b.k();
                    String s = iVar.f28824b.s();
                    if (TextUtils.isEmpty(k)) {
                        k = iVar.f28824b.a();
                    }
                    if (TextUtils.isEmpty(s)) {
                        s = "storage_deny";
                    }
                    j.a(k, s, iVar.f28824b.u(), iVar.f28823a);
                }
                cVar.b();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0074, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0074, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Message r24, com.ss.android.download.api.c.e r25, java.util.Map<java.lang.Integer, com.ss.android.download.api.b.d> r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            if (r1 == 0) goto L_0x0198
            if (r26 == 0) goto L_0x0198
            boolean r4 = r26.isEmpty()
            if (r4 == 0) goto L_0x0012
            goto L_0x0198
        L_0x0012:
            int r4 = r1.what
            r5 = 3
            r6 = 1
            r7 = 0
            r8 = 0
            if (r4 != r5) goto L_0x0052
            java.lang.Object r4 = r1.obj
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r4
            r2.a(r4)
            int r5 = r4.getStatus()
            int r5 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.getNotificationType(r5)
            long r9 = r4.getTotalBytes()
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0050
            long r9 = r4.getCurBytes()
            r11 = 100
            long r9 = r9 * r11
            long r11 = r4.getTotalBytes()
            long r9 = r9 / r11
            int r9 = (int) r9
            if (r5 != r6) goto L_0x004e
            com.ss.android.downloadlib.addownload.i$b r6 = r0.h
            if (r6 == 0) goto L_0x004e
            com.ss.android.downloadlib.addownload.i$b r6 = r0.h
            r6.a(r4)
            r0.h = r8
        L_0x004e:
            r6 = r9
            goto L_0x006c
        L_0x0050:
            r6 = 0
            goto L_0x006c
        L_0x0052:
            int r4 = r1.what
            if (r4 == r6) goto L_0x005f
            int r4 = r1.what
            r5 = 2
            if (r4 != r5) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            r4 = r8
            r5 = 0
            goto L_0x0050
        L_0x005f:
            java.lang.Object r4 = r1.obj
            com.ss.android.download.api.c.e r4 = (com.ss.android.download.api.c.e) r4
            int r5 = r1.arg1
            int r6 = r1.arg2
            r22 = r8
            r8 = r4
            r4 = r22
        L_0x006c:
            java.util.Collection r3 = r26.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x0074:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0197
            java.lang.Object r9 = r3.next()
            com.ss.android.download.api.b.d r9 = (com.ss.android.download.api.b.d) r9
            int r10 = r1.what
            r11 = 16
            r12 = -1
            switch(r10) {
                case 1: goto L_0x0122;
                case 2: goto L_0x0101;
                case 3: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x0074
        L_0x0089:
            switch(r5) {
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f7;
                case 3: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0074
        L_0x008d:
            if (r4 != 0) goto L_0x0090
            return
        L_0x0090:
            int r10 = r4.getStatus()
            r11 = -4
            if (r10 != r11) goto L_0x009b
            r9.a()
            goto L_0x0074
        L_0x009b:
            int r10 = r4.getStatus()
            if (r10 != r12) goto L_0x00a5
            r9.a(r2)
            goto L_0x0074
        L_0x00a5:
            int r10 = r4.getStatus()
            r11 = -3
            if (r10 != r11) goto L_0x0074
            com.ss.android.download.api.b.c r10 = r0.f28823a
            boolean r10 = com.ss.android.downloadlib.c.k.a((com.ss.android.download.api.b.c) r10)
            if (r10 == 0) goto L_0x00b8
            r9.b(r2)
            goto L_0x0074
        L_0x00b8:
            com.ss.android.download.api.b.a r10 = r0.f28825c
            if (r10 == 0) goto L_0x00f2
            com.ss.android.download.api.b.a r10 = r0.f28825c
            boolean r10 = r10.c()
            if (r10 == 0) goto L_0x00f2
            com.ss.android.downloadlib.addownload.a.a r11 = com.ss.android.downloadlib.addownload.a.a.a()
            int r10 = r4.getId()
            long r12 = (long) r10
            com.ss.android.download.api.b.c r10 = r0.f28823a
            long r14 = r10.b()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            long r16 = r10.c()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            java.lang.String r18 = r10.q()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            java.lang.String r19 = r10.d()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            java.lang.String r20 = r10.p()
            java.lang.String r21 = r4.getTargetFilePath()
            r11.a(r12, r14, r16, r18, r19, r20, r21)
        L_0x00f2:
            r9.c(r2)
            goto L_0x0074
        L_0x00f7:
            r9.b(r2, r6)
            goto L_0x0074
        L_0x00fc:
            r9.a((com.ss.android.download.api.c.e) r2, (int) r6)
            goto L_0x0074
        L_0x0101:
            if (r5 == r12) goto L_0x011d
            switch(r5) {
                case 1: goto L_0x0118;
                case 2: goto L_0x0113;
                case 3: goto L_0x0108;
                default: goto L_0x0106;
            }
        L_0x0106:
            goto L_0x0074
        L_0x0108:
            if (r8 == 0) goto L_0x0074
            int r10 = r8.f28492b
            if (r10 != r11) goto L_0x0074
            r9.a(r8)
            goto L_0x0074
        L_0x0113:
            r9.a((com.ss.android.download.api.c.e) r8, (int) r6)
            goto L_0x0074
        L_0x0118:
            r9.b(r8, r6)
            goto L_0x0074
        L_0x011d:
            r9.a((com.ss.android.download.api.c.e) r8, (int) r7)
            goto L_0x0074
        L_0x0122:
            switch(r5) {
                case 1: goto L_0x0192;
                case 2: goto L_0x018d;
                case 3: goto L_0x0127;
                default: goto L_0x0125;
            }
        L_0x0125:
            goto L_0x0074
        L_0x0127:
            if (r8 != 0) goto L_0x012a
            return
        L_0x012a:
            int r10 = r8.f28492b
            if (r10 != r11) goto L_0x0133
            r9.a(r8)
            goto L_0x0074
        L_0x0133:
            int r10 = r8.f28492b
            r11 = 32
            if (r10 != r11) goto L_0x013e
            r9.b(r8)
            goto L_0x0074
        L_0x013e:
            int r10 = r8.f28492b
            r11 = 8
            if (r10 != r11) goto L_0x0074
            com.ss.android.download.api.b.a r10 = r0.f28825c
            if (r10 == 0) goto L_0x017b
            com.ss.android.download.api.b.a r10 = r0.f28825c
            boolean r10 = r10.c()
            if (r10 == 0) goto L_0x017b
            com.ss.android.downloadlib.addownload.a.a r11 = com.ss.android.downloadlib.addownload.a.a.a()
            long r12 = r8.f28491a
            com.ss.android.download.api.b.c r10 = r0.f28823a
            long r14 = r10.b()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            long r16 = r10.c()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            java.lang.String r18 = r10.q()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            java.lang.String r19 = r10.d()
            com.ss.android.download.api.b.c r10 = r0.f28823a
            java.lang.String r20 = r10.p()
            java.lang.String r10 = r8.f28495e
            r21 = r10
            r11.a(r12, r14, r16, r18, r19, r20, r21)
        L_0x017b:
            com.ss.android.download.api.b.c r10 = r0.f28823a
            boolean r10 = com.ss.android.downloadlib.c.k.a((com.ss.android.download.api.b.c) r10)
            if (r10 == 0) goto L_0x0188
            r9.b(r8)
            goto L_0x0074
        L_0x0188:
            r9.c(r8)
            goto L_0x0074
        L_0x018d:
            r9.b(r8, r6)
            goto L_0x0074
        L_0x0192:
            r9.a((com.ss.android.download.api.c.e) r8, (int) r6)
            goto L_0x0074
        L_0x0197:
            return
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.i.a(android.os.Message, com.ss.android.download.api.c.e, java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(e eVar, Map<Integer, d> map) {
        if (!map.isEmpty()) {
            if (eVar == null) {
                for (d a2 : map.values()) {
                    a2.a();
                }
            } else if (eVar.f28493c > 0 || eVar.f28492b == 8) {
                double d2 = 0.0d;
                try {
                    double d3 = (double) eVar.f28494d;
                    double d4 = (double) eVar.f28493c;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    d2 = d3 / d4;
                } catch (Exception unused) {
                }
                int i = (int) (d2 * 100.0d);
                if (i < 0) {
                    i = 0;
                }
                for (d next : map.values()) {
                    int i2 = eVar.f28492b;
                    if (i2 == 4) {
                        next.b(eVar, i);
                    } else if (i2 != 8) {
                        if (i2 != 16) {
                            switch (i2) {
                                case 1:
                                case 2:
                                    next.a(eVar, i);
                                    break;
                            }
                        } else {
                            next.a(eVar);
                        }
                    } else if (k.a(this.f28823a)) {
                        next.b(eVar);
                    } else {
                        next.c(eVar);
                    }
                }
            } else {
                for (d a3 : map.values()) {
                    a3.a(eVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        if (this.f28824b != null && this.f28824b.w()) {
            String l = this.f28824b.l();
            if (TextUtils.isEmpty(l)) {
                l = "click";
            }
            j.a(l, j, this.f28823a, this.f28824b);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (this.f28824b != null && this.f28824b.x()) {
            if (TextUtils.isEmpty(str)) {
                str = this.f28824b.e();
            }
            String m = this.f28824b.m();
            JSONObject jSONObject = new JSONObject();
            a(this.f28823a, jSONObject);
            if (k.b() != null) {
                com.ss.android.download.api.config.d b2 = k.b();
                d.a aVar = new d.a();
                if (TextUtils.isEmpty(str)) {
                    str = this.f28824b.a();
                }
                d.a b3 = aVar.b(str);
                if (TextUtils.isEmpty(m)) {
                    m = "click_start";
                }
                b2.onEvent(b3.c(m).a(this.f28823a.o()).a(this.f28823a.b()).d(this.f28823a.p()).b(this.f28823a.c()).a(jSONObject).a(1).a(this.f28824b.u()).a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(DownloadInfo downloadInfo, e eVar, Map<Integer, com.ss.android.download.api.b.d> map) {
        int i;
        if (!map.isEmpty()) {
            if (downloadInfo == null || eVar == null) {
                for (com.ss.android.download.api.b.d a2 : map.values()) {
                    a2.a();
                }
                return;
            }
            int i2 = 0;
            try {
                i = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
            } catch (Exception unused) {
                i = 0;
            }
            if (i >= 0) {
                i2 = i;
            }
            eVar.a(downloadInfo);
            for (com.ss.android.download.api.b.d next : map.values()) {
                switch (downloadInfo.getStatus()) {
                    case -4:
                        if (!k.a(this.f28823a)) {
                            next.a();
                            break;
                        } else {
                            eVar.f28492b = 8;
                            next.b(eVar);
                            break;
                        }
                    case -3:
                        if (!k.a(this.f28823a)) {
                            next.c(eVar);
                            break;
                        } else {
                            next.b(eVar);
                            break;
                        }
                    case -2:
                        next.b(eVar, i2);
                        break;
                    case -1:
                        next.a(eVar);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    case 8:
                        next.a(eVar, i2);
                        break;
                }
            }
        }
    }

    public final void a(Message message) {
        if (message.what == 1 && this.f28824b != null && this.f28824b.x()) {
            com.ss.android.download.api.config.a i = k.i();
            if (i != null && i.a()) {
                com.ss.android.downloadlib.a.a();
                com.ss.android.downloadlib.a.a(this.f28824b, this.f28823a);
            }
        }
    }

    i() {
    }

    private boolean g() {
        if (!h() || !i()) {
            return false;
        }
        return true;
    }

    private boolean i() {
        if (this.f28825c == null || !this.f28825c.d()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.h == null) {
            this.h = new b() {
                public final void a(DownloadInfo downloadInfo) {
                    Object obj;
                    if (i.this.f28824b != null && i.this.f28824b.x()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject t = i.this.f28823a.t();
                            if (t != null) {
                                k.a(t, jSONObject);
                            }
                            if (downloadInfo == null || !i.this.f28823a.o()) {
                                jSONObject.put("is_using_new", 2);
                            } else {
                                jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                                jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                                jSONObject.put("download_url", downloadInfo.getUrl());
                                jSONObject.put("app_name", downloadInfo.getTitle());
                                jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                                jSONObject.put("is_using_new", 1);
                            }
                        } catch (Exception unused) {
                        }
                        String e2 = i.this.f28824b.e();
                        String m = i.this.f28824b.m();
                        com.ss.android.download.api.config.d b2 = k.b();
                        d.a aVar = new d.a();
                        if (TextUtils.isEmpty(e2)) {
                            e2 = i.this.f28824b.a();
                        }
                        d.a b3 = aVar.b(e2);
                        if (TextUtils.isEmpty(m)) {
                            m = "click_start";
                        }
                        d.a a2 = b3.c(m).a(i.this.f28823a.o()).a(i.this.f28823a.b()).d(i.this.f28823a.p()).b(i.this.f28823a.c()).a(jSONObject).a(1);
                        if (i.this.f28824b != null) {
                            obj = i.this.f28824b.u();
                        } else {
                            obj = null;
                        }
                        b2.onEvent(a2.a(obj).a());
                    }
                }
            };
        }
    }

    private boolean f() {
        if (!k.a(this.f28823a) || j.a(this.f28827e)) {
            return false;
        }
        return true;
    }

    private void m() {
        if (this.g != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.g.sendMessageDelayed(obtain, 1200);
        }
    }

    private void p() {
        if (this.f28824b != null && this.f28824b.x()) {
            j.a(this.f28823a, this.f28824b);
        }
    }

    private boolean h() {
        if (this.f28823a == null || !this.f28823a.o() || this.f28823a.b() <= 0 || TextUtils.isEmpty(this.f28823a.d()) || TextUtils.isEmpty(this.f28823a.a())) {
            return false;
        }
        return true;
    }

    private void j() {
        if (this.f28824b != null && this.f28824b.x()) {
            String f2 = this.f28824b.f();
            String n = this.f28824b.n();
            if (TextUtils.isEmpty(f2)) {
                f2 = this.f28824b.a();
            }
            if (TextUtils.isEmpty(n)) {
                n = "click_pause";
            }
            j.a(f2, n, this.f28824b.u(), this.f28823a);
        }
    }

    private void k() {
        if (this.f28824b != null && this.f28824b.x()) {
            String g2 = this.f28824b.g();
            String o = this.f28824b.o();
            if (TextUtils.isEmpty(g2)) {
                g2 = this.f28824b.a();
            }
            if (TextUtils.isEmpty(o)) {
                o = "click_continue";
            }
            j.a(g2, o, this.f28824b.u(), this.f28823a);
        }
    }

    private void l() {
        if (this.f28824b != null && this.f28824b.x()) {
            String h2 = this.f28824b.h();
            String p = this.f28824b.p();
            if (TextUtils.isEmpty(h2)) {
                h2 = this.f28824b.a();
            }
            if (TextUtils.isEmpty(p)) {
                p = "click_install";
            }
            j.a(h2, p, this.f28824b.u(), this.f28823a);
        }
    }

    private void n() {
        if (this.f28824b != null && this.f28824b.x()) {
            String i = this.f28824b.i();
            String q = this.f28824b.q();
            if (TextUtils.isEmpty(i)) {
                i = this.f28824b.a();
            }
            if (TextUtils.isEmpty(q)) {
                q = "click_open";
            }
            j.a(i, q, this.f28824b.u(), this.f28823a);
        }
    }

    private void o() {
        if (this.f28824b != null && this.f28824b.x()) {
            String j = this.f28824b.j();
            String r = this.f28824b.r();
            if (TextUtils.isEmpty(j)) {
                j = this.f28824b.a();
            }
            if (TextUtils.isEmpty(r)) {
                r = "open";
            }
            j.a(j, r, this.f28824b.u(), this.f28823a);
        }
    }

    private void q() {
        try {
            if (this.f28823a != null) {
                if (this.f28824b != null) {
                    j.a(this.f28824b.a(), "deeplink_url_true", this.f28823a.o(), this.f28823a.b(), this.f28823a.p(), this.f28823a.c(), 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (j.a(this.f28823a) && !k.a(this.f28823a)) {
            b.a().a(this.f28823a.q(), this.f28823a.b());
        }
    }

    public final void b() {
        if (TextUtils.equals(this.f28823a.a(), b.a().b().f28745a)) {
            this.f28824b = b.a().b().f28746b;
            a(b.a().b().f28747c);
        }
        b.C0342b b2 = b.a().b();
        b2.f28745a = null;
        b2.f28746b = null;
        b2.f28747c = null;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.f28824b != null && this.f28824b.x()) {
            String c2 = this.f28824b.c();
            String t = this.f28824b.t();
            if (TextUtils.isEmpty(c2)) {
                c2 = "embeded_ad";
            }
            if (TextUtils.isEmpty(t)) {
                t = "download_failed";
            }
            j.a(c2, t, this.f28824b.u(), this.f28823a);
        }
    }

    private static boolean f(e eVar) {
        if (eVar == null || eVar.f28492b != 8) {
            return false;
        }
        return true;
    }

    public final int a(boolean z) {
        if (!f() || !z) {
            return 0;
        }
        return 1;
    }

    private boolean d(e eVar) {
        if (!f(eVar) || this.f28823a == null || k.a(this.f28823a)) {
            return false;
        }
        return true;
    }

    private boolean e(e eVar) {
        if (!f(eVar) || !j.a(this.f28827e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(DownloadInfo downloadInfo) {
        if (d(downloadInfo) || e(downloadInfo)) {
            return true;
        }
        return false;
    }

    private boolean b(Context context) {
        if (context == null || this.f28826d == null) {
            return false;
        }
        String str = this.f28826d.f28464d;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            k.b(context, str, this.f28823a.q());
        } catch (com.ss.android.downloadlib.addownload.b.a e2) {
            if (e2.getFinalStatus() == 1) {
                o();
                k.c();
                e2.getOpenAppPackageName();
                return true;
            }
        }
        return false;
    }

    private boolean d(DownloadInfo downloadInfo) {
        if (!f(downloadInfo) || this.f28823a == null || k.a(this.f28823a)) {
            return false;
        }
        return true;
    }

    private boolean e(DownloadInfo downloadInfo) {
        if (!f(downloadInfo) || !j.a(this.f28827e)) {
            return false;
        }
        return true;
    }

    private static boolean f(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.getStatus() != -3) {
            return false;
        }
        return true;
    }

    private void a(final com.ss.android.download.api.config.l lVar) {
        if (h.b("android.permission.WRITE_EXTERNAL_STORAGE")) {
            lVar.a();
            return;
        }
        b.a().b().a(this.f28823a.a(), this.f28824b, this.f28825c);
        h.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, (h.a) new h.a() {
            public final void a() {
                i.this.b();
                if (lVar != null) {
                    lVar.a();
                }
            }

            public final void a(String str) {
                i.this.b();
                if (lVar != null) {
                    lVar.a(str);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void c(e eVar) {
        if (!(this.f28823a == null || eVar == null || eVar.f28491a < 0)) {
            if (eVar.f28494d == 0) {
                eVar.f28492b = 16;
            }
            int i = eVar.f28492b;
            if (i == 4) {
                k();
            } else if (i != 8) {
                if (i != 16) {
                    switch (i) {
                        case 1:
                        case 2:
                            j();
                            break;
                    }
                } else {
                    a((String) null);
                    if (this.f28824b != null && this.f28824b.y()) {
                        com.ss.android.downloadlib.a.a().a(new com.ss.android.downloadad.api.b.a(this.f28823a, eVar.f28491a));
                    }
                }
            } else if (k.a(this.f28823a)) {
                n();
            } else {
                l();
                m();
            }
            if (i == 16) {
                a(2);
            } else if (j.a(this.f28823a)) {
                a(2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(e eVar) {
        long j;
        if (this.f28823a.o() && j.a(this.f28823a)) {
            if (!this.f28828f) {
                String l = k.l();
                long b2 = this.f28823a.b();
                String p = this.f28823a.p();
                if (eVar == null || !k.c(eVar.f28495e)) {
                    j = 2;
                } else {
                    j = 1;
                }
                j.a(l, "file_status", true, b2, p, j, 2);
                this.f28828f = true;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("ext_value", Long.valueOf(this.f28823a.c()));
            contentValues.put("force_update", 1);
            com.ss.android.downloadlib.a.a().a(String.valueOf(this.f28823a.b()), contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(DownloadInfo downloadInfo) {
        if (this.f28823a != null && downloadInfo != null && ((long) downloadInfo.getId()) != 0) {
            int status = downloadInfo.getStatus();
            switch (status) {
                case -4:
                case -1:
                    if (j.b(this.f28823a)) {
                        a((String) null);
                    } else {
                        d();
                    }
                    if (this.f28824b != null && this.f28824b.y()) {
                        com.ss.android.downloadlib.a.a().a(new com.ss.android.downloadad.api.b.a(this.f28823a, (long) downloadInfo.getId()));
                        break;
                    }
                case -3:
                    if (!k.a(this.f28823a)) {
                        l();
                        m();
                        break;
                    } else {
                        n();
                        break;
                    }
                case -2:
                    k();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                case 8:
                    j();
                    break;
            }
            if (status == -1 || status == -4) {
                a(2);
                return;
            }
            if (j.a(this.f28823a)) {
                a(2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(boolean z) {
        if (z || this.f28825c == null || this.f28825c.b() != 1) {
            return false;
        }
        return true;
    }

    public final long a(Context context) {
        if (context == null) {
            return -1;
        }
        long a2 = j.a(this.f28823a.a(), this.f28823a.d(), context, this.f28823a.e(), this.f28823a.f(), this.f28823a.t(), this.f28823a.g(), this.f28823a.h(), this.f28823a.i(), this.f28823a.j(), true, this.f28823a.k(), this.f28823a.l(), g());
        p();
        return a2;
    }

    private static void a(c cVar, JSONObject jSONObject) {
        try {
            JSONObject t = cVar.t();
            if (t != null) {
                k.a(t, jSONObject);
            }
            if (cVar.o()) {
                jSONObject.put("is_using_new", 0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041 A[Catch:{ a -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7 A[Catch:{ a -> 0x00e8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r23, int r24) {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            r9 = 0
            if (r0 != 0) goto L_0x0008
            return r9
        L_0x0008:
            com.ss.android.download.api.c.b r1 = r8.f28826d
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = ""
            goto L_0x0013
        L_0x000f:
            com.ss.android.download.api.c.b r1 = r8.f28826d
            java.lang.String r1 = r1.f28464d
        L_0x0013:
            r10 = 1
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ a -> 0x00e8 }
            r3 = 3
            r4 = 2
            if (r2 != 0) goto L_0x003e
            android.net.Uri r2 = android.net.Uri.parse(r1)     // Catch:{ a -> 0x00e8 }
            java.lang.String r2 = r2.getScheme()     // Catch:{ a -> 0x00e8 }
            com.ss.android.download.api.b.a r5 = r8.f28825c     // Catch:{ a -> 0x00e8 }
            int r5 = r5.b()     // Catch:{ a -> 0x00e8 }
            if (r5 == r4) goto L_0x0034
            com.ss.android.download.api.b.a r5 = r8.f28825c     // Catch:{ a -> 0x00e8 }
            int r5 = r5.b()     // Catch:{ a -> 0x00e8 }
            if (r5 != r3) goto L_0x003e
        L_0x0034:
            java.lang.String r5 = "market"
            boolean r2 = android.text.TextUtils.equals(r2, r5)     // Catch:{ a -> 0x00e8 }
            if (r2 == 0) goto L_0x003e
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x00c7
            com.ss.android.download.api.b.c r2 = r8.f28823a     // Catch:{ a -> 0x00e8 }
            boolean r2 = com.ss.android.downloadlib.c.k.a((com.ss.android.download.api.b.c) r2)     // Catch:{ a -> 0x00e8 }
            if (r2 != 0) goto L_0x00c0
            com.ss.android.download.api.b.a r2 = r8.f28825c     // Catch:{ a -> 0x00e8 }
            int r2 = r2.b()     // Catch:{ a -> 0x00e8 }
            if (r2 != r4) goto L_0x0055
            r2 = r24
            if (r2 == r4) goto L_0x005d
        L_0x0055:
            com.ss.android.download.api.b.a r2 = r8.f28825c     // Catch:{ a -> 0x00e8 }
            int r2 = r2.b()     // Catch:{ a -> 0x00e8 }
            if (r2 != r3) goto L_0x0182
        L_0x005d:
            r2 = 4
            if (r0 == 0) goto L_0x00ba
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ a -> 0x00e8 }
            if (r5 != 0) goto L_0x00b4
            android.net.Uri r5 = android.net.Uri.parse(r1)     // Catch:{ a -> 0x00e8 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ a -> 0x00e8 }
            java.lang.String r7 = "android.intent.action.VIEW"
            r6.<init>(r7)     // Catch:{ a -> 0x00e8 }
            r6.setData(r5)     // Catch:{ a -> 0x00e8 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r6.addFlags(r5)     // Catch:{ a -> 0x00e8 }
            boolean r7 = com.ss.android.downloadlib.c.k.a((android.content.Context) r0, (android.content.Intent) r6)     // Catch:{ a -> 0x00e8 }
            if (r7 == 0) goto L_0x00ae
            java.lang.String r7 = com.ss.android.downloadlib.c.i.f28894a     // Catch:{ a -> 0x00e8 }
            if (r7 != 0) goto L_0x0088
            java.lang.String r7 = ""
            com.ss.android.downloadlib.c.i.a(r7)     // Catch:{ a -> 0x00e8 }
        L_0x0088:
            java.lang.String r7 = com.ss.android.downloadlib.c.i.f28894a     // Catch:{ a -> 0x00e8 }
            boolean r11 = com.ss.android.downloadlib.c.k.b(r0, r7)     // Catch:{ a -> 0x00e8 }
            if (r11 == 0) goto L_0x00a8
            java.lang.String r2 = "open_url"
            r6.putExtra(r2, r1)     // Catch:{ a -> 0x00e8 }
            r6.setPackage(r7)     // Catch:{ a -> 0x00e8 }
            boolean r1 = r0 instanceof android.app.Activity     // Catch:{ a -> 0x00e8 }
            if (r1 != 0) goto L_0x009f
            r6.addFlags(r5)     // Catch:{ a -> 0x00e8 }
        L_0x009f:
            r0.startActivity(r6)     // Catch:{ a -> 0x00e8 }
            com.ss.android.downloadlib.addownload.b.a r0 = new com.ss.android.downloadlib.addownload.b.a     // Catch:{ a -> 0x00e8 }
            r0.<init>(r3, r9, r7)     // Catch:{ a -> 0x00e8 }
            throw r0     // Catch:{ a -> 0x00e8 }
        L_0x00a8:
            com.ss.android.downloadlib.addownload.b.a r0 = new com.ss.android.downloadlib.addownload.b.a     // Catch:{ a -> 0x00e8 }
            r0.<init>(r2, r4, r7)     // Catch:{ a -> 0x00e8 }
            throw r0     // Catch:{ a -> 0x00e8 }
        L_0x00ae:
            com.ss.android.downloadlib.addownload.b.a r0 = new com.ss.android.downloadlib.addownload.b.a     // Catch:{ a -> 0x00e8 }
            r0.<init>(r2, r10)     // Catch:{ a -> 0x00e8 }
            throw r0     // Catch:{ a -> 0x00e8 }
        L_0x00b4:
            com.ss.android.downloadlib.addownload.b.a r0 = new com.ss.android.downloadlib.addownload.b.a     // Catch:{ a -> 0x00e8 }
            r0.<init>(r2)     // Catch:{ a -> 0x00e8 }
            throw r0     // Catch:{ a -> 0x00e8 }
        L_0x00ba:
            com.ss.android.downloadlib.addownload.b.a r0 = new com.ss.android.downloadlib.addownload.b.a     // Catch:{ a -> 0x00e8 }
            r0.<init>(r2)     // Catch:{ a -> 0x00e8 }
            throw r0     // Catch:{ a -> 0x00e8 }
        L_0x00c0:
            com.ss.android.download.api.b.c r1 = r8.f28823a     // Catch:{ a -> 0x00e8 }
            com.ss.android.downloadlib.c.k.a((android.content.Context) r0, (com.ss.android.download.api.b.c) r1)     // Catch:{ a -> 0x00e8 }
            goto L_0x0182
        L_0x00c7:
            com.ss.android.download.api.b.c r2 = r8.f28823a     // Catch:{ a -> 0x00e8 }
            if (r0 == 0) goto L_0x00e2
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ a -> 0x00e8 }
            if (r3 == 0) goto L_0x00d5
            com.ss.android.downloadlib.c.k.a((android.content.Context) r0, (com.ss.android.download.api.b.c) r2)     // Catch:{ a -> 0x00e8 }
            goto L_0x00dc
        L_0x00d5:
            java.lang.String r2 = r2.q()     // Catch:{ a -> 0x00e8 }
            com.ss.android.downloadlib.c.k.b((android.content.Context) r0, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ a -> 0x00e8 }
        L_0x00dc:
            com.ss.android.downloadlib.addownload.b.a r0 = new com.ss.android.downloadlib.addownload.b.a     // Catch:{ a -> 0x00e8 }
            r0.<init>(r9)     // Catch:{ a -> 0x00e8 }
            throw r0     // Catch:{ a -> 0x00e8 }
        L_0x00e2:
            com.ss.android.downloadlib.addownload.b.a r0 = new com.ss.android.downloadlib.addownload.b.a     // Catch:{ a -> 0x00e8 }
            r0.<init>(r9)     // Catch:{ a -> 0x00e8 }
            throw r0     // Catch:{ a -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            int r1 = r0.getFinalStatus()
            switch(r1) {
                case 1: goto L_0x0178;
                case 2: goto L_0x016e;
                case 3: goto L_0x0109;
                case 4: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0182
        L_0x00f2:
            r2 = 0
            int r1 = r0.getExtStatus()
            long r3 = (long) r1
            com.ss.android.download.api.b.c r1 = r8.f28823a
            long r5 = r1.c()
            java.lang.String r7 = r0.getOpenAppPackageName()
            r1 = r22
            r1.a(r2, r3, r5, r7)
            goto L_0x0182
        L_0x0109:
            r1 = 2
            r8.a((long) r1)
            r2 = 1
            int r1 = r0.getExtStatus()
            long r3 = (long) r1
            com.ss.android.download.api.b.c r1 = r8.f28823a
            long r5 = r1.c()
            java.lang.String r7 = r0.getOpenAppPackageName()
            r1 = r22
            r1.a(r2, r3, r5, r7)
            com.ss.android.downloadlib.addownload.k.c()
            r0.getOpenAppPackageName()
            com.ss.android.downloadlib.addownload.a r0 = com.ss.android.downloadlib.addownload.a.a()
            com.ss.android.download.api.b.c r1 = r8.f28823a
            long r14 = r1.b()
            com.ss.android.download.api.b.c r1 = r8.f28823a
            long r16 = r1.c()
            com.ss.android.download.api.b.c r1 = r8.f28823a
            java.lang.String r20 = r1.p()
            com.ss.android.download.api.b.c r1 = r8.f28823a
            java.lang.String r19 = r1.d()
            com.ss.android.download.api.b.c r1 = r8.f28823a
            java.lang.String r1 = r1.q()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x016d
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.d.a> r2 = r0.f28721a
            if (r2 != 0) goto L_0x015c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f28721a = r2
        L_0x015c:
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.d.a> r0 = r0.f28721a
            com.ss.android.downloadlib.addownload.d.a r2 = new com.ss.android.downloadlib.addownload.d.a
            r12 = 0
            java.lang.String r21 = ""
            r11 = r2
            r18 = r1
            r11.<init>(r12, r14, r16, r18, r19, r20, r21)
            r0.put(r1, r2)
        L_0x016d:
            return r10
        L_0x016e:
            r22.n()
            com.ss.android.downloadlib.addownload.k.c()
            r0.getOpenAppPackageName()
            return r10
        L_0x0178:
            r22.o()
            com.ss.android.downloadlib.addownload.k.c()
            r0.getOpenAppPackageName()
            return r10
        L_0x0182:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.i.a(android.content.Context, int):boolean");
    }

    public final int a(Context context, IDownloadListener iDownloadListener) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (context == null) {
            return 0;
        }
        Map<String, String> f2 = this.f28823a.f();
        ArrayList arrayList = new ArrayList();
        if (f2 != null) {
            for (Map.Entry next : f2.entrySet()) {
                if (next != null) {
                    arrayList.add(new HttpHeader((String) next.getKey(), (String) next.getValue()));
                }
            }
        }
        String valueOf = String.valueOf(this.f28823a.b());
        long c2 = this.f28823a.c();
        String p = this.f28823a.p();
        if (this.f28825c == null || !this.f28825c.c()) {
            z = false;
        } else {
            z = true;
        }
        AppTaskBuilder needReuseFirstConnection = new AppTaskBuilder(context, this.f28823a.a()).name(this.f28823a.d()).extra(com.ss.android.downloadlib.c.b.a(valueOf, c2, 0, p, z, this.f28823a.t())).mimeType(this.f28823a.e()).headers(arrayList).showNotification(this.f28823a.h()).needWifi(this.f28823a.i()).savePath(this.f28823a.k()).mainThreadListener(iDownloadListener).mimeType("application/vnd.android.package-archive").packageName(this.f28823a.q()).minProgressTimeMsInterval(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).maxProgressCount(100).needDefaultHttpServiceBackUp(true).needReuseFirstConnection(true);
        if (k.g().optInt("need_retry_delay", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AppTaskBuilder needRetryDelay = needReuseFirstConnection.needRetryDelay(z2);
        if (k.g().optInt("need_reuse_runnable", 0) == 1) {
            z3 = true;
        }
        int a2 = j.a(this.f28823a.g(), g(), this.f28823a.t(), needRetryDelay.needReuseChunkRunnable(z3).chunkStrategy(new g() {
            public final int a(long j) {
                boolean z;
                boolean z2;
                int optInt = k.g().optInt("is_open_exp", 0);
                if (optInt == 1 || optInt == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String a2 = i.this.f28823a.a();
                    if (TextUtils.isEmpty(a2) || (!a2.startsWith("http://ad.toutiao.com/advertiser_package/") && !a2.startsWith("https://ad.toutiao.com/advertiser_package/") && (TextUtils.isEmpty(a2) || (!a2.startsWith("http://lf3-ttcdn-tos.pstatp.com/") && !a2.startsWith("https://lf3-ttcdn-tos.pstatp.com/"))))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        int i = (int) (j / 1048576);
                        if (k.l.isEmpty()) {
                            k.b(k.g());
                        }
                        for (int i2 = 0; i2 < k.l.size(); i2++) {
                            int[] iArr = k.l.get(i2);
                            if (i >= iArr[1] && i < iArr[2]) {
                                return iArr[0];
                            }
                        }
                        return 1;
                    }
                }
                return 1;
            }
        }));
        p();
        return a2;
    }

    public static void a(long j, String str, String str2) {
        DownloadInfo a2 = new DownloadInfo.a(str2).a(str).a();
        a2.setId((int) j);
        for (com.ss.android.download.api.b.a.a a3 : com.ss.android.downloadlib.e.a().f29049b) {
            a3.a(a2);
        }
    }

    private void a(boolean z, long j, long j2, String str) {
        String str2;
        if (this.f28824b != null && this.f28824b.x()) {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject.put("app_package", str);
                    long j3 = j;
                    jSONObject.put("status", j);
                } catch (JSONException unused) {
                }
            }
            String a2 = this.f28824b.a();
            if (z) {
                str2 = "click_open_market_success";
            } else {
                str2 = "click_open_market_failed";
            }
            j.a(a2, str2, true, this.f28823a.b(), this.f28823a.p(), j2, jSONObject, 1);
        }
    }
}
