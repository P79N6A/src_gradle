package com.xiaomi.push;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.am;
import com.xiaomi.push.service.ba;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ec {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ec f81966a;

    /* renamed from: a  reason: collision with other field name */
    private Context f297a;

    /* renamed from: a  reason: collision with other field name */
    private final ConcurrentLinkedQueue<b> f298a = new ConcurrentLinkedQueue<>();

    class a extends b {
        a() {
            super();
        }

        public void b() {
            ec.a(ec.this);
        }
    }

    class b extends am.b {

        /* renamed from: a  reason: collision with root package name */
        long f81968a = System.currentTimeMillis();

        b() {
        }

        public boolean a() {
            return true;
        }

        public void b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: collision with other method in class */
        public final boolean m200b() {
            return System.currentTimeMillis() - this.f81968a > 172800000;
        }
    }

    class c extends b {

        /* renamed from: a  reason: collision with root package name */
        int f81970a;

        /* renamed from: a  reason: collision with other field name */
        File f300a;

        /* renamed from: a  reason: collision with other field name */
        String f301a;

        /* renamed from: a  reason: collision with other field name */
        boolean f302a;

        /* renamed from: b  reason: collision with root package name */
        String f81971b;

        /* renamed from: b  reason: collision with other field name */
        boolean f303b;

        c(String str, String str2, File file, boolean z) {
            super();
            this.f301a = str;
            this.f81971b = str2;
            this.f300a = file;
            this.f303b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean c() {
            /*
                r11 = this;
                com.xiaomi.push.ec r0 = com.xiaomi.push.ec.this
                android.content.Context r0 = com.xiaomi.push.ec.a((com.xiaomi.push.ec) r0)
                java.lang.String r1 = "log.timestamp"
                r2 = 0
                android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r1, r2)
                java.lang.String r1 = "log.requst"
                java.lang.String r3 = ""
                java.lang.String r1 = r0.getString(r1, r3)
                long r3 = java.lang.System.currentTimeMillis()
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002b }
                r5.<init>(r1)     // Catch:{ JSONException -> 0x002b }
                java.lang.String r1 = "time"
                long r6 = r5.getLong(r1)     // Catch:{ JSONException -> 0x002b }
                java.lang.String r1 = "times"
                int r1 = r5.getInt(r1)     // Catch:{ JSONException -> 0x002c }
                goto L_0x002d
            L_0x002b:
                r6 = r3
            L_0x002c:
                r1 = 0
            L_0x002d:
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r6
                r8 = 86400000(0x5265c00, double:4.2687272E-316)
                r5 = 1
                int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r10 >= 0) goto L_0x003f
                r3 = 10
                if (r1 <= r3) goto L_0x0044
                goto L_0x007d
            L_0x003f:
                long r6 = java.lang.System.currentTimeMillis()
                r1 = 0
            L_0x0044:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r3 = "time"
                r2.put(r3, r6)     // Catch:{ JSONException -> 0x0066 }
                java.lang.String r3 = "times"
                int r1 = r1 + r5
                r2.put(r3, r1)     // Catch:{ JSONException -> 0x0066 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ JSONException -> 0x0066 }
                java.lang.String r1 = "log.requst"
                java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x0066 }
                android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch:{ JSONException -> 0x0066 }
                r0.commit()     // Catch:{ JSONException -> 0x0066 }
                goto L_0x007c
            L_0x0066:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "JSONException on put "
                r1.<init>(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.xiaomi.channel.commonutils.logger.b.c(r0)
            L_0x007c:
                r2 = 1
            L_0x007d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ec.c.c():boolean");
        }

        public boolean a() {
            return at.d(ec.a(ec.this)) || (this.f303b && at.b(ec.a(ec.this)));
        }

        public void b() {
            try {
                if (c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", ba.a());
                    hashMap.put("token", this.f81971b);
                    hashMap.put("net", at.a(ec.a(ec.this)));
                    at.a(this.f301a, hashMap, this.f300a, "file");
                }
                this.f302a = true;
            } catch (IOException unused) {
            }
        }

        /* renamed from: c  reason: collision with other method in class */
        public void m201c() {
            if (!this.f302a) {
                this.f81970a++;
                if (this.f81970a < 3) {
                    ec.a(ec.this).add(this);
                }
            }
            if (this.f302a || this.f81970a >= 3) {
                this.f300a.delete();
            }
            ec.this.a((long) ((1 << this.f81970a) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        }
    }

    private ec(Context context) {
        this.f297a = context;
        this.f298a.add(new a());
        b(0);
    }

    public static ec a(Context context) {
        if (f81966a == null) {
            synchronized (ec.class) {
                try {
                    if (f81966a == null) {
                        f81966a = new ec(context);
                    }
                } catch (Throwable th) {
                    Class<ec> cls = ec.class;
                    throw th;
                }
            }
        }
        f81966a.f297a = context;
        return f81966a;
    }

    /* access modifiers changed from: private */
    public void a(long j) {
        b peek = this.f298a.peek();
        if (peek != null && peek.a()) {
            b(j);
        }
    }

    private void b() {
        if (!ab.b() && !ab.a()) {
            try {
                File file = new File(this.f297a.getExternalFilesDir(null) + "/.logcache");
                if (file.exists() && file.isDirectory()) {
                    for (File delete : file.listFiles()) {
                        delete.delete();
                    }
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    private void b(long j) {
        if (!this.f298a.isEmpty()) {
            ht.a(new ee(this), j);
        }
    }

    private void c() {
        while (!this.f298a.isEmpty()) {
            b peek = this.f298a.peek();
            if (peek != null) {
                if (peek.b() || this.f298a.size() > 6) {
                    com.xiaomi.channel.commonutils.logger.b.c("remove Expired task");
                    this.f298a.remove(peek);
                } else {
                    return;
                }
            }
        }
    }

    public void a() {
        c();
        a(0);
    }

    public void a(String str, String str2, Date date, Date date2, int i, boolean z) {
        ConcurrentLinkedQueue<b> concurrentLinkedQueue = this.f298a;
        ed edVar = new ed(this, i, date, date2, str, str2, z);
        concurrentLinkedQueue.add(edVar);
        b(0);
    }
}
