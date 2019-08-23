package com.ss.android.download;

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
import com.ss.android.download.b.c;
import com.ss.android.download.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public final class d {
    public String A;
    public String B;
    public int C;
    public int D;
    public List<Pair<String, String>> E;
    final Context F;
    private Future<?> G;
    private j H;
    private NotificationManager I;
    private final s J;
    private final r K;
    private final f L;

    /* renamed from: a  reason: collision with root package name */
    public long f28523a;

    /* renamed from: b  reason: collision with root package name */
    public String f28524b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28525c;

    /* renamed from: d  reason: collision with root package name */
    public String f28526d;

    /* renamed from: e  reason: collision with root package name */
    public String f28527e;

    /* renamed from: f  reason: collision with root package name */
    public String f28528f;
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
        private h f28529a;

        /* renamed from: b  reason: collision with root package name */
        private Cursor f28530b;

        private String a(String str) {
            String string = this.f28530b.getString(this.f28530b.getColumnIndexOrThrow(str));
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        }

        private Integer b(String str) {
            return Integer.valueOf(this.f28530b.getInt(this.f28530b.getColumnIndexOrThrow(str)));
        }

        private Long c(String str) {
            return Long.valueOf(this.f28530b.getLong(this.f28530b.getColumnIndexOrThrow(str)));
        }

        public final void a(d dVar) {
            boolean z;
            boolean z2;
            dVar.f28523a = c("_id").longValue();
            dVar.f28524b = a("uri");
            boolean z3 = false;
            if (b("no_integrity").intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            dVar.f28525c = z;
            dVar.f28526d = a("hint");
            dVar.f28527e = a("_data");
            dVar.f28528f = a("mimetype");
            dVar.g = b("destination").intValue();
            dVar.h = b("visibility").intValue();
            dVar.j = b("status").intValue();
            dVar.k = b("numfailed").intValue();
            dVar.l = b(PushConstants.MZ_PUSH_MESSAGE_METHOD).intValue() & 268435455;
            dVar.m = c("lastmod").longValue();
            dVar.n = a("notificationpackage");
            dVar.o = a("notificationextras");
            dVar.p = a("cookiedata");
            dVar.q = a("useragent");
            dVar.r = a("referer");
            dVar.s = c("total_bytes").longValue();
            dVar.t = c("current_bytes").longValue();
            dVar.u = a("etag");
            dVar.v = b("scanned").intValue();
            if (b("deleted").intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            dVar.w = z2;
            dVar.x = a("mediaprovider_uri");
            dVar.y = b("allowed_network_types").intValue();
            if (b("allow_roaming").intValue() != 0) {
                z3 = true;
            }
            dVar.z = z3;
            dVar.A = a(PushConstants.TITLE);
            dVar.B = a("description");
            dVar.C = b("bypass_recommended_size_limit").intValue();
            synchronized (this) {
                dVar.i = b("control").intValue();
            }
        }

        public b(h hVar, Cursor cursor) {
            this.f28529a = hVar;
            this.f28530b = cursor;
        }

        @TargetApi(5)
        private static void a(d dVar, String str, String str2) {
            dVar.E.add(Pair.create(str, str2));
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
        public final com.ss.android.download.d a(android.content.Context r8, com.ss.android.download.s r9, com.ss.android.download.r r10, com.ss.android.download.f r11) {
            /*
                r7 = this;
                com.ss.android.download.d r6 = new com.ss.android.download.d
                r5 = 0
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r7.a((com.ss.android.download.d) r6)
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r8 = r6.E
                r8.clear()
                android.net.Uri r8 = r6.c()
                java.lang.String r9 = "headers"
                android.net.Uri r1 = android.net.Uri.withAppendedPath(r8, r9)
                com.ss.android.download.h r0 = r7.f28529a
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.d.b.a(android.content.Context, com.ss.android.download.s, com.ss.android.download.r, com.ss.android.download.f):com.ss.android.download.d");
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

    public final Uri c() {
        return ContentUris.withAppendedId(c.a.f28513a, this.f28523a);
    }

    private boolean d() {
        NetworkInfo b2 = this.J.b();
        if (b2 == null || !b2.isConnected() || b(b2.getType()) != 1) {
            return false;
        }
        return true;
    }

    public final a b() {
        NetworkInfo b2 = this.J.b();
        if (b2 == null || !b2.isConnected()) {
            return a.NO_CONNECTION;
        }
        if (!this.J.c() || this.z) {
            return a(b2.getType());
        }
        return a.CANNOT_USE_ROAMING;
    }

    @TargetApi(4)
    public final void a() {
        if (this.n != null) {
            Intent intent = new Intent("android.ss.intent.action.DOWNLOAD_COMPLETE");
            intent.setPackage(this.n);
            intent.putExtra("extra_download_id", this.f28523a);
            intent.putExtra("extra_download_visibility", this.h);
            this.J.a(intent);
        }
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
        Long d2 = this.J.d();
        if (d2 != null && this.s > d2.longValue()) {
            return a.UNUSABLE_DUE_TO_SIZE;
        }
        if (this.C == 0) {
            Long e2 = this.J.e();
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
        return this.m + ((long) ((this.D + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) * 30 * (1 << (this.k - 1))));
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(c());
        intent.setClassName(this.F.getPackageName(), p.class.getName());
        intent.setFlags(268435456);
        intent.putExtra("isWifiRequired", z2);
        this.F.startActivity(intent);
    }

    public final boolean a(i iVar) {
        boolean z2;
        synchronized (this) {
            z2 = true;
            if (this.v != 0 || (!(this.g == 0 || this.g == 1) || !c.a.a(this.j))) {
                z2 = false;
            }
            if (z2) {
                synchronized (iVar.f28575a) {
                    i.a aVar = new i.a(this.f28523a, this.f28527e, this.f28528f);
                    iVar.f28577c.put(aVar.f28580b, aVar);
                    if (iVar.f28575a.isConnected()) {
                        aVar.a(iVar.f28575a);
                    } else {
                        iVar.f28575a.connect();
                    }
                }
            }
        }
        return z2;
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
            com.ss.android.download.d$a r0 = r8.b()     // Catch:{ all -> 0x009b }
            com.ss.android.download.d$a r4 = com.ss.android.download.d.a.OK     // Catch:{ all -> 0x009b }
            if (r0 != r4) goto L_0x004a
            goto L_0x0048
        L_0x0034:
            com.ss.android.download.s r0 = r8.J     // Catch:{ all -> 0x009b }
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
            java.util.concurrent.Future<?> r4 = r8.G     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x0058
            java.util.concurrent.Future<?> r4 = r8.G     // Catch:{ all -> 0x009b }
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
            android.content.Context r2 = r8.F     // Catch:{ all -> 0x009b }
            com.ss.android.download.h r2 = com.ss.android.download.h.a((android.content.Context) r2)     // Catch:{ all -> 0x009b }
            android.net.Uri r3 = r8.c()     // Catch:{ all -> 0x009b }
            r4 = 0
            r2.a((android.net.Uri) r3, (android.content.ContentValues) r1, (java.lang.String) r4, (java.lang.String[]) r4)     // Catch:{ all -> 0x009b }
        L_0x0080:
            com.ss.android.download.j r7 = new com.ss.android.download.j     // Catch:{ all -> 0x009b }
            android.content.Context r2 = r8.F     // Catch:{ all -> 0x009b }
            com.ss.android.download.s r3 = r8.J     // Catch:{ all -> 0x009b }
            com.ss.android.download.r r5 = r8.K     // Catch:{ all -> 0x009b }
            com.ss.android.download.f r6 = r8.L     // Catch:{ all -> 0x009b }
            r1 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x009b }
            r8.H = r7     // Catch:{ all -> 0x009b }
            com.ss.android.download.j r1 = r8.H     // Catch:{ all -> 0x009b }
            java.util.concurrent.Future r9 = r9.submit(r1)     // Catch:{ all -> 0x009b }
            r8.G = r9     // Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            return r0
        L_0x009b:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.d.a(java.util.concurrent.ExecutorService):boolean");
    }

    public static int a(h hVar, long j2) {
        Cursor a2 = hVar.a(ContentUris.withAppendedId(c.a.f28513a, j2), new String[]{"status"}, (String) null, (String[]) null, (String) null);
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

    private d(Context context, s sVar, r rVar, f fVar) {
        this.E = new ArrayList();
        this.F = context;
        this.I = (NotificationManager) this.F.getSystemService("notification");
        this.J = sVar;
        this.K = rVar;
        this.L = fVar;
        this.D = k.f28595a.nextInt(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
    }

    /* synthetic */ d(Context context, s sVar, r rVar, f fVar, byte b2) {
        this(context, sVar, rVar, fVar);
    }
}
