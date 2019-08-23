package com.ss.android.downloadlib.core.download;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.a.a;
import com.ss.android.downloadlib.core.download.h;
import com.ss.android.downloadlib.core.download.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public final class c {
    public String A;
    public String B;
    public int C;
    public long D;
    public int E;
    public List<Pair<String, String>> F;
    final Context G;
    private Future<?> H;
    private i I;
    private NotificationManager J;
    private final q K;
    private final p L;
    private final e M;

    /* renamed from: a  reason: collision with root package name */
    public long f28942a;

    /* renamed from: b  reason: collision with root package name */
    public String f28943b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28944c;

    /* renamed from: d  reason: collision with root package name */
    public String f28945d;

    /* renamed from: e  reason: collision with root package name */
    public String f28946e;

    /* renamed from: f  reason: collision with root package name */
    public String f28947f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public long s;
    public long t;
    public String u;
    public int v;
    public boolean w;
    public String x;
    public int y;
    public boolean z;

    public enum a {
        OK,
        NO_CONNECTION,
        UNUSABLE_DUE_TO_SIZE,
        RECOMMENDED_UNUSABLE_DUE_TO_SIZE,
        CANNOT_USE_ROAMING,
        TYPE_DISALLOWED_BY_REQUESTOR
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private g f28948a;

        /* renamed from: b  reason: collision with root package name */
        private Cursor f28949b;

        private String a(String str) {
            String string = this.f28949b.getString(this.f28949b.getColumnIndexOrThrow(str));
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        }

        private Integer b(String str) {
            return Integer.valueOf(this.f28949b.getInt(this.f28949b.getColumnIndexOrThrow(str)));
        }

        private Long c(String str) {
            return Long.valueOf(this.f28949b.getLong(this.f28949b.getColumnIndexOrThrow(str)));
        }

        public final void a(c cVar) {
            boolean z;
            boolean z2;
            cVar.f28942a = c("_id").longValue();
            cVar.f28943b = a("uri");
            boolean z3 = false;
            if (b("no_integrity").intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            cVar.f28944c = z;
            cVar.f28945d = a("hint");
            cVar.f28946e = a("_data");
            cVar.f28947f = a("mimetype");
            cVar.g = b("destination").intValue();
            cVar.h = b("visibility").intValue();
            cVar.j = b("status").intValue();
            cVar.k = b("numfailed").intValue();
            cVar.l = b(PushConstants.MZ_PUSH_MESSAGE_METHOD).intValue() & 268435455;
            cVar.m = c("lastmod").longValue();
            cVar.n = a("notificationpackage");
            cVar.o = a("notificationextras");
            cVar.p = a("cookiedata");
            cVar.q = a("useragent");
            cVar.r = a("referer");
            cVar.s = c("total_bytes").longValue();
            cVar.t = c("current_bytes").longValue();
            cVar.u = a("etag");
            cVar.v = b("scanned").intValue();
            if (b("deleted").intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            cVar.w = z2;
            cVar.x = a("mediaprovider_uri");
            cVar.y = b("allowed_network_types").intValue();
            if (b("allow_roaming").intValue() != 0) {
                z3 = true;
            }
            cVar.z = z3;
            cVar.A = a(PushConstants.TITLE);
            cVar.B = a("description");
            cVar.C = b("bypass_recommended_size_limit").intValue();
            cVar.D = c("time_cost").longValue();
            synchronized (this) {
                cVar.i = b("control").intValue();
            }
        }

        public b(g gVar, Cursor cursor) {
            this.f28948a = gVar;
            this.f28949b = cursor;
        }

        @TargetApi(5)
        private static void a(c cVar, String str, String str2) {
            try {
                cVar.F.add(new Pair(str, str2));
            } catch (Throwable unused) {
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
            if (r8 == null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004b, code lost:
            if (r8 != null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r8.close();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.downloadlib.core.download.c a(android.content.Context r8, com.ss.android.downloadlib.core.download.q r9, com.ss.android.downloadlib.core.download.p r10, com.ss.android.downloadlib.core.download.e r11) {
            /*
                r7 = this;
                com.ss.android.downloadlib.core.download.c r6 = new com.ss.android.downloadlib.core.download.c
                r5 = 0
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r7.a((com.ss.android.downloadlib.core.download.c) r6)
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r8 = r6.F
                r8.clear()
                android.net.Uri r8 = r6.b()
                java.lang.String r9 = "headers"
                android.net.Uri r1 = android.net.Uri.withAppendedPath(r8, r9)
                com.ss.android.downloadlib.core.download.g r0 = r7.f28948a
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                android.database.Cursor r8 = r0.a((android.net.Uri) r1, (java.lang.String[]) r2, (java.lang.String) r3, (java.lang.String[]) r4, (java.lang.String) r5)
                java.lang.String r9 = "header"
                int r9 = r8.getColumnIndexOrThrow(r9)     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
                java.lang.String r10 = "value"
                int r10 = r8.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
                r8.moveToFirst()     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
            L_0x0036:
                boolean r11 = r8.isAfterLast()     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
                if (r11 != 0) goto L_0x004b
                java.lang.String r11 = r8.getString(r9)     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
                java.lang.String r0 = r8.getString(r10)     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
                a(r6, r11, r0)     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
                r8.moveToNext()     // Catch:{ Exception -> 0x005a, all -> 0x0053 }
                goto L_0x0036
            L_0x004b:
                if (r8 == 0) goto L_0x005d
            L_0x004d:
                r8.close()     // Catch:{ Exception -> 0x0051 }
                goto L_0x005d
            L_0x0051:
                goto L_0x005d
            L_0x0053:
                r9 = move-exception
                if (r8 == 0) goto L_0x0059
                r8.close()     // Catch:{ Exception -> 0x0059 }
            L_0x0059:
                throw r9
            L_0x005a:
                if (r8 == 0) goto L_0x005d
                goto L_0x004d
            L_0x005d:
                java.lang.String r8 = r6.p
                if (r8 == 0) goto L_0x0068
                java.lang.String r8 = "Cookie"
                java.lang.String r9 = r6.p
                a(r6, r8, r9)
            L_0x0068:
                java.lang.String r8 = r6.r
                if (r8 == 0) goto L_0x0073
                java.lang.String r8 = "Referer"
                java.lang.String r9 = r6.r
                a(r6, r8, r9)
            L_0x0073:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.c.b.a(android.content.Context, com.ss.android.downloadlib.core.download.q, com.ss.android.downloadlib.core.download.p, com.ss.android.downloadlib.core.download.e):com.ss.android.downloadlib.core.download.c");
        }
    }

    private static int b(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (a(r4) <= r4) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.util.concurrent.ExecutorService r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.i     // Catch:{ all -> 0x009b }
            r1 = 192(0xc0, float:2.69E-43)
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x004a
            int r0 = r8.j     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0048
            r4 = 190(0xbe, float:2.66E-43)
            if (r0 == r4) goto L_0x0048
            if (r0 == r1) goto L_0x0048
            switch(r0) {
                case 194: goto L_0x0034;
                case 195: goto L_0x0025;
                case 196: goto L_0x0025;
                default: goto L_0x0016;
            }     // Catch:{ all -> 0x009b }
        L_0x0016:
            switch(r0) {
                case 198: goto L_0x004a;
                case 199: goto L_0x001a;
                default: goto L_0x0019;
            }     // Catch:{ all -> 0x009b }
        L_0x0019:
            goto L_0x004a
        L_0x001a:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "mounted"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x009b }
            goto L_0x004b
        L_0x0025:
            boolean r0 = r8.d()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x004a
            com.ss.android.downloadlib.core.download.c$a r0 = r8.a()     // Catch:{ all -> 0x009b }
            com.ss.android.downloadlib.core.download.c$a r4 = com.ss.android.downloadlib.core.download.c.a.OK     // Catch:{ all -> 0x009b }
            if (r0 != r4) goto L_0x004a
            goto L_0x0048
        L_0x0034:
            com.ss.android.downloadlib.core.download.q r0 = r8.K     // Catch:{ all -> 0x009b }
            long r4 = r0.a()     // Catch:{ all -> 0x009b }
            boolean r0 = r8.d()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x004a
            long r6 = r8.a((long) r4)     // Catch:{ all -> 0x009b }
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
        L_0x0048:
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            java.util.concurrent.Future<?> r4 = r8.H     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x0058
            java.util.concurrent.Future<?> r4 = r8.H     // Catch:{ all -> 0x009b }
            boolean r4 = r4.isDone()     // Catch:{ all -> 0x009b }
            if (r4 != 0) goto L_0x0058
            r2 = 1
        L_0x0058:
            if (r0 == 0) goto L_0x0099
            if (r2 != 0) goto L_0x0099
            int r2 = r8.j     // Catch:{ all -> 0x009b }
            if (r2 == r1) goto L_0x0080
            r8.j = r1     // Catch:{ all -> 0x009b }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "status"
            int r3 = r8.j     // Catch:{ all -> 0x009b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x009b }
            r1.put(r2, r3)     // Catch:{ all -> 0x009b }
            android.content.Context r2 = r8.G     // Catch:{ all -> 0x009b }
            com.ss.android.downloadlib.core.download.g r2 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r2)     // Catch:{ all -> 0x009b }
            android.net.Uri r3 = r8.b()     // Catch:{ all -> 0x009b }
            r4 = 0
            r2.a((android.net.Uri) r3, (android.content.ContentValues) r1, (java.lang.String) r4, (java.lang.String[]) r4)     // Catch:{ all -> 0x009b }
        L_0x0080:
            com.ss.android.downloadlib.core.download.i r7 = new com.ss.android.downloadlib.core.download.i     // Catch:{ all -> 0x009b }
            android.content.Context r2 = r8.G     // Catch:{ all -> 0x009b }
            com.ss.android.downloadlib.core.download.q r3 = r8.K     // Catch:{ all -> 0x009b }
            com.ss.android.downloadlib.core.download.p r5 = r8.L     // Catch:{ all -> 0x009b }
            com.ss.android.downloadlib.core.download.e r6 = r8.M     // Catch:{ all -> 0x009b }
            r1 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x009b }
            r8.I = r7     // Catch:{ all -> 0x009b }
            com.ss.android.downloadlib.core.download.i r1 = r8.I     // Catch:{ all -> 0x009b }
            java.util.concurrent.Future r9 = r9.submit(r1)     // Catch:{ all -> 0x009b }
            r8.H = r9     // Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            return r0
        L_0x009b:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.c.a(java.util.concurrent.ExecutorService):boolean");
    }

    public final Uri b() {
        return ContentUris.withAppendedId(j.a.f29029a, this.f28942a);
    }

    private boolean d() {
        NetworkInfo b2 = this.K.b();
        if (b2 == null || !b2.isConnected() || b(b2.getType()) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(b());
        intent.setClassName(this.G.getPackageName(), DownloadLimitActivity.class.getName());
        intent.setFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("isNetworkDisallow", true);
        this.G.startActivity(intent);
    }

    public final a a() {
        NetworkInfo b2 = this.K.b();
        if (b2 == null || !b2.isConnected()) {
            return a.NO_CONNECTION;
        }
        if (!this.K.c() || this.z) {
            return a(b2.getType());
        }
        return a.CANNOT_USE_ROAMING;
    }

    private a a(int i2) {
        boolean z2;
        int b2 = b(i2);
        if (this.y == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || (b2 & this.y) != 0) {
            return c(i2);
        }
        return a.TYPE_DISALLOWED_BY_REQUESTOR;
    }

    private a c(int i2) {
        if (this.s <= 0) {
            return a.OK;
        }
        if (i2 == 1) {
            return a.OK;
        }
        Long d2 = this.K.d();
        if (d2 != null && this.s > d2.longValue()) {
            return a.UNUSABLE_DUE_TO_SIZE;
        }
        if (this.C == 0) {
            Long e2 = this.K.e();
            if (e2 != null && this.s > e2.longValue()) {
                return a.RECOMMENDED_UNUSABLE_DUE_TO_SIZE;
            }
        }
        return a.OK;
    }

    public final long a(long j2) {
        if (this.k == 0) {
            return j2;
        }
        if (this.l > 0) {
            return this.m + ((long) this.l);
        }
        return this.m + ((long) ((this.E + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) * 30 * (1 << (this.k - 1))));
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(b());
        intent.setClassName(this.G.getPackageName(), DownloadLimitActivity.class.getName());
        intent.setFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("isWifiRequired", z2);
        this.G.startActivity(intent);
    }

    public final boolean a(h hVar) {
        boolean z2;
        synchronized (this) {
            z2 = true;
            if (this.v != 0 || (!(this.g == 0 || this.g == 1) || !a.C0337a.a(this.j))) {
                z2 = false;
            }
            if (z2) {
                synchronized (hVar.f29007b) {
                    h.a aVar = new h.a(this.f28942a, this.f28946e, this.f28947f);
                    hVar.f29009d.put(aVar.f29013b, aVar);
                    if (hVar.f29007b.isConnected()) {
                        aVar.a(hVar.f29007b);
                    } else {
                        hVar.f29007b.connect();
                    }
                }
            }
        }
        return z2;
    }

    public static int a(g gVar, long j2) {
        Cursor a2 = gVar.a(ContentUris.withAppendedId(j.a.f29029a, j2), new String[]{"status"}, (String) null, (String[]) null, (String) null);
        try {
            if (a2.moveToFirst()) {
                return a2.getInt(0);
            }
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused) {
                }
            }
            return 190;
        } finally {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @TargetApi(4)
    public final void a(int i2, long j2) {
        if (this.n != null) {
            Intent intent = new Intent("android.ss.intent.action.DOWNLOAD_COMPLETE");
            try {
                String str = this.G.getPackageManager().getPackageArchiveInfo(this.f28946e, 0).packageName;
                if (str != null) {
                    intent.putExtra("extra_app_package", str);
                }
            } catch (Exception unused) {
            }
            intent.setPackage(this.n);
            intent.putExtra("extra_download_id", this.f28942a);
            intent.putExtra("extra_download_visibility", this.h);
            intent.putExtra("status", i2);
            intent.putExtra("time_cost", j2);
            this.K.a(intent);
        }
    }

    private c(Context context, q qVar, p pVar, e eVar) {
        this.F = new ArrayList();
        this.G = context;
        this.J = (NotificationManager) this.G.getSystemService("notification");
        this.K = qVar;
        this.L = pVar;
        this.M = eVar;
        this.E = k.f29030a.nextInt(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
    }

    /* synthetic */ c(Context context, q qVar, p pVar, e eVar, byte b2) {
        this(context, qVar, pVar, eVar);
    }
}
