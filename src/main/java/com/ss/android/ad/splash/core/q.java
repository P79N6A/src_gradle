package com.ss.android.ad.splash.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.b.a;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.c.h;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ad.splash.utils.d;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.g;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q {

    /* renamed from: c  reason: collision with root package name */
    private static volatile q f27725c;

    /* renamed from: a  reason: collision with root package name */
    long f27726a;

    /* renamed from: b  reason: collision with root package name */
    long f27727b = 20000;

    static void a(@Nullable List<h> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (!d.a(list)) {
                for (h w : list) {
                    String w2 = w.w();
                    if (!g.a(w2)) {
                        jSONArray.put(w2);
                    }
                }
            }
            jSONObject2.put("splash_receive_key", jSONArray);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            jSONObject.put("log_extra", h.a().i);
            e.a(84378473382L, "splash_ad", "splash_receive", jSONObject);
        } catch (Exception unused) {
        }
    }

    private q() {
    }

    public static q a() {
        if (f27725c == null) {
            synchronized (q.class) {
                if (f27725c == null) {
                    f27725c = new q();
                }
            }
        }
        return f27725c;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (System.currentTimeMillis() - this.f27726a > this.f27727b) {
            return true;
        }
        return false;
    }

    private boolean b(@NonNull b bVar) {
        boolean z = false;
        if (!d.a(bVar.j)) {
            for (b next : bVar.j) {
                if (next != null && next.a() && c(next)) {
                    r.a().a(next.f27609a);
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void d(List<b> list) {
        if (!d.a(list)) {
            for (b next : list) {
                if (next.m == 1 && next.u()) {
                    a(next);
                    return;
                }
            }
        }
    }

    @WorkerThread
    private boolean c(@NonNull b bVar) {
        boolean z;
        com.ss.android.ad.splash.core.c.d dVar = bVar.f27609a;
        if (dVar == null) {
            return false;
        }
        String a2 = f.a(dVar);
        String b2 = f.b(dVar);
        if (g.a(a2) || g.a(b2) || f.c(dVar)) {
            return false;
        }
        com.ss.android.ad.splash.b bVar2 = new com.ss.android.ad.splash.b(bVar.l(), bVar.n(), 1, bVar.q);
        long currentTimeMillis = System.currentTimeMillis();
        if (e.t() != null) {
            z = e.t().a(a2, b2, bVar2);
        } else {
            z = false;
        }
        if (z) {
            a(b2, bVar.e());
            b(bVar, 0);
            a(0, b2);
            a(1, System.currentTimeMillis() - currentTimeMillis);
        } else {
            b(bVar, 1);
        }
        return z;
    }

    static void a(@Nullable b bVar) {
        String str;
        long j;
        String str2 = h.a().i;
        if (bVar != null) {
            j = bVar.l();
            str = bVar.n();
        } else {
            str = str2;
            j = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", str);
            jSONObject.put("is_ad_event", 1);
            e.a(j, "splash_ad", "launch_covered", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public void c(List<b> list) {
        if (NetworkUtils.b(e.F()) && !d.a(list) && e.t() != null) {
            try {
                if (NetworkUtils.c(e.F()) != 0) {
                    for (b next : list) {
                        if (next != null && next.a()) {
                            switch (next.p()) {
                                case 0:
                                case 1:
                                case 4:
                                    a(next, 1);
                                    if (d.a(next.j)) {
                                        break;
                                    } else {
                                        for (b next2 : next.j) {
                                            if (next2 != null && next2.a()) {
                                                a(next2, 1);
                                            }
                                        }
                                        break;
                                    }
                                case 2:
                                case 3:
                                    a(next, 2);
                                    break;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0140 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0074 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0074 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a A[Catch:{ Throwable -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010d A[Catch:{ Throwable -> 0x0170 }] */
    @android.support.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.List<com.ss.android.ad.splash.core.c.b> r15) {
        /*
            r14 = this;
            android.content.Context r0 = com.ss.android.ad.splash.core.e.F()
            boolean r0 = com.ss.android.ad.splash.utils.NetworkUtils.b(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            boolean r0 = com.ss.android.ad.splash.utils.d.a(r15)
            if (r0 == 0) goto L_0x0012
            return
        L_0x0012:
            com.ss.android.ad.splash.origin.c r0 = com.ss.android.ad.splash.core.e.D()
            r1 = 1
            if (r0 == 0) goto L_0x004d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r15.iterator()
        L_0x0022:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r2.next()
            com.ss.android.ad.splash.core.c.b r3 = (com.ss.android.ad.splash.core.c.b) r3
            int r4 = r3.s()
            if (r4 != r1) goto L_0x0022
            java.lang.String r4 = r3.t()
            boolean r4 = com.ss.android.ad.splash.utils.g.a(r4)
            if (r4 != 0) goto L_0x0022
            java.lang.String r3 = r3.t()
            r0.add(r3)
            goto L_0x0022
        L_0x0046:
            com.ss.android.ad.splash.origin.c r2 = com.ss.android.ad.splash.core.e.D()
            r2.a(r0)
        L_0x004d:
            android.content.Context r0 = com.ss.android.ad.splash.core.e.F()     // Catch:{ Throwable -> 0x0170 }
            int r0 = com.ss.android.ad.splash.utils.NetworkUtils.c(r0)     // Catch:{ Throwable -> 0x0170 }
            if (r0 != 0) goto L_0x0058
            return
        L_0x0058:
            r2 = 0
            if (r0 != r1) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 != 0) goto L_0x006f
            com.ss.android.ad.splash.k r3 = com.ss.android.ad.splash.core.e.s     // Catch:{ Throwable -> 0x0170 }
            if (r3 == 0) goto L_0x0069
            boolean r3 = r3.a()     // Catch:{ Throwable -> 0x0170 }
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            goto L_0x0070
        L_0x006f:
            r3 = 1
        L_0x0070:
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Throwable -> 0x0170 }
        L_0x0074:
            boolean r4 = r15.hasNext()     // Catch:{ Throwable -> 0x0170 }
            if (r4 == 0) goto L_0x016f
            java.lang.Object r4 = r15.next()     // Catch:{ Throwable -> 0x0170 }
            com.ss.android.ad.splash.core.c.b r4 = (com.ss.android.ad.splash.core.c.b) r4     // Catch:{ Throwable -> 0x0170 }
            if (r4 == 0) goto L_0x0074
            boolean r5 = r4.a()     // Catch:{ Throwable -> 0x0170 }
            if (r5 == 0) goto L_0x0074
            int r5 = r4.p()     // Catch:{ Throwable -> 0x0170 }
            switch(r5) {
                case 0: goto L_0x0141;
                case 1: goto L_0x0141;
                case 2: goto L_0x0090;
                case 3: goto L_0x0090;
                case 4: goto L_0x0141;
                default: goto L_0x008f;
            }     // Catch:{ Throwable -> 0x0170 }
        L_0x008f:
            goto L_0x0074
        L_0x0090:
            int r5 = r4.w     // Catch:{ Throwable -> 0x0170 }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0097
            r5 = 1
            goto L_0x0098
        L_0x0097:
            r5 = 0
        L_0x0098:
            if (r3 != 0) goto L_0x009c
            if (r5 == 0) goto L_0x0074
        L_0x009c:
            com.ss.android.ad.splash.core.c.j r5 = r4.k     // Catch:{ Throwable -> 0x0170 }
            if (r5 == 0) goto L_0x010a
            boolean r6 = r4.a()     // Catch:{ Throwable -> 0x0170 }
            if (r6 != 0) goto L_0x00a7
            goto L_0x010a
        L_0x00a7:
            java.lang.String r6 = com.ss.android.ad.splash.utils.f.a((com.ss.android.ad.splash.core.c.j) r5)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r7 = com.ss.android.ad.splash.utils.f.b((com.ss.android.ad.splash.core.c.j) r5)     // Catch:{ Throwable -> 0x0170 }
            boolean r8 = com.ss.android.ad.splash.utils.g.a(r6)     // Catch:{ Throwable -> 0x0170 }
            if (r8 != 0) goto L_0x010a
            boolean r8 = com.ss.android.ad.splash.utils.g.a(r7)     // Catch:{ Throwable -> 0x0170 }
            if (r8 == 0) goto L_0x00bc
            goto L_0x010a
        L_0x00bc:
            boolean r5 = com.ss.android.ad.splash.utils.f.c((com.ss.android.ad.splash.core.c.j) r5)     // Catch:{ Throwable -> 0x0170 }
            if (r5 == 0) goto L_0x00c3
            goto L_0x010a
        L_0x00c3:
            com.ss.android.ad.splash.b r5 = new com.ss.android.ad.splash.b     // Catch:{ Throwable -> 0x0170 }
            long r9 = r4.l()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r11 = r4.n()     // Catch:{ Throwable -> 0x0170 }
            r12 = 2
            com.ss.android.ad.splash.core.c.k r13 = r4.q     // Catch:{ Throwable -> 0x0170 }
            r8 = r5
            r8.<init>(r9, r11, r12, r13)     // Catch:{ Throwable -> 0x0170 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0170 }
            com.ss.android.ad.splash.q r10 = com.ss.android.ad.splash.core.e.t()     // Catch:{ Throwable -> 0x0170 }
            if (r10 == 0) goto L_0x00e7
            com.ss.android.ad.splash.q r10 = com.ss.android.ad.splash.core.e.t()     // Catch:{ Throwable -> 0x0170 }
            boolean r5 = r10.a(r6, r7, r5)     // Catch:{ Throwable -> 0x0170 }
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            if (r5 == 0) goto L_0x0104
            long r10 = r4.e()     // Catch:{ Throwable -> 0x0170 }
            a((java.lang.String) r7, (long) r10)     // Catch:{ Throwable -> 0x0170 }
            r6 = 16
            b(r4, r6)     // Catch:{ Throwable -> 0x0170 }
            a((int) r1, (java.lang.String) r7)     // Catch:{ Throwable -> 0x0170 }
            r6 = 2
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0170 }
            r7 = 0
            long r10 = r10 - r8
            a((int) r6, (long) r10)     // Catch:{ Throwable -> 0x0170 }
            goto L_0x010b
        L_0x0104:
            r6 = 17
            b(r4, r6)     // Catch:{ Throwable -> 0x0170 }
            goto L_0x010b
        L_0x010a:
            r5 = 0
        L_0x010b:
            if (r5 == 0) goto L_0x0127
            com.ss.android.ad.splash.core.r r5 = com.ss.android.ad.splash.core.r.a()     // Catch:{ Throwable -> 0x0170 }
            com.ss.android.ad.splash.core.c.j r6 = r4.k     // Catch:{ Throwable -> 0x0170 }
            if (r6 == 0) goto L_0x0123
            java.lang.String r7 = r6.f27648d     // Catch:{ Throwable -> 0x0170 }
            boolean r7 = com.ss.android.ad.splash.utils.g.a(r7)     // Catch:{ Throwable -> 0x0170 }
            if (r7 == 0) goto L_0x011e
            goto L_0x0123
        L_0x011e:
            java.lang.String r6 = r6.f27648d     // Catch:{ Throwable -> 0x0170 }
            r5.d(r6)     // Catch:{ Throwable -> 0x0170 }
        L_0x0123:
            if (r3 != 0) goto L_0x0127
            r5 = 1
            goto L_0x0128
        L_0x0127:
            r5 = 0
        L_0x0128:
            int r6 = r4.p()     // Catch:{ Throwable -> 0x0170 }
            r7 = 3
            if (r6 != r7) goto L_0x013e
            boolean r6 = r14.c((com.ss.android.ad.splash.core.c.b) r4)     // Catch:{ Throwable -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            com.ss.android.ad.splash.core.r r6 = com.ss.android.ad.splash.core.r.a()     // Catch:{ Throwable -> 0x0170 }
            com.ss.android.ad.splash.core.c.d r4 = r4.f27609a     // Catch:{ Throwable -> 0x0170 }
            r6.a((com.ss.android.ad.splash.core.c.d) r4)     // Catch:{ Throwable -> 0x0170 }
        L_0x013e:
            if (r5 == 0) goto L_0x0074
            return
        L_0x0141:
            int r5 = r4.w     // Catch:{ Throwable -> 0x0170 }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0148
            r5 = 1
            goto L_0x0149
        L_0x0148:
            r5 = 0
        L_0x0149:
            int r6 = r4.g     // Catch:{ Throwable -> 0x0170 }
            if (r6 != r1) goto L_0x0151
            if (r3 != 0) goto L_0x0151
            if (r5 == 0) goto L_0x0074
        L_0x0151:
            boolean r5 = r14.c((com.ss.android.ad.splash.core.c.b) r4)     // Catch:{ Throwable -> 0x0170 }
            if (r5 == 0) goto L_0x0164
            com.ss.android.ad.splash.core.r r5 = com.ss.android.ad.splash.core.r.a()     // Catch:{ Throwable -> 0x0170 }
            com.ss.android.ad.splash.core.c.d r6 = r4.f27609a     // Catch:{ Throwable -> 0x0170 }
            r5.a((com.ss.android.ad.splash.core.c.d) r6)     // Catch:{ Throwable -> 0x0170 }
            if (r3 != 0) goto L_0x0164
            r5 = 1
            goto L_0x0165
        L_0x0164:
            r5 = 0
        L_0x0165:
            boolean r4 = r14.b((com.ss.android.ad.splash.core.c.b) r4)     // Catch:{ Throwable -> 0x0170 }
            if (r3 != 0) goto L_0x016c
            r5 = r5 | r4
        L_0x016c:
            if (r5 == 0) goto L_0x0074
            return
        L_0x016f:
            return
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.q.b(java.util.List):void");
    }

    private static void a(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("res_type", Integer.valueOf(i));
            a.a().a("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception unused) {
        }
    }

    private static void a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(com.ss.android.ad.splash.utils.b.a(str)));
            a.a().a("sevice_ad_file_size", i, jSONObject, null);
        } catch (Exception unused) {
        }
    }

    private static void b(@NonNull b bVar, int i) {
        JSONObject jSONObject = new JSONObject();
        String str = "";
        String str2 = "";
        try {
            JSONObject jSONObject2 = new JSONObject();
            switch (i) {
                case 0:
                    str = f.a(bVar.f27609a);
                    str2 = "download_image_succeed";
                    jSONObject2.putOpt("image_mode", Integer.valueOf(bVar.g));
                    break;
                case 1:
                    str = f.a(bVar.f27609a);
                    str2 = "download_image_failed";
                    jSONObject2.putOpt("image_mode", Integer.valueOf(bVar.g));
                    break;
                case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                    str = f.a(bVar.k);
                    str2 = "download_video_succeed";
                    break;
                case 17:
                    str = f.a(bVar.k);
                    str2 = "download_video_failed";
                    break;
            }
            jSONObject.putOpt("log_extra", bVar.n());
            jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            jSONObject2.putOpt(PushConstants.WEB_URL, str);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            e.a(bVar.l(), "splash_ad", str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void a(b bVar, int i) {
        new com.ss.android.ad.splash.b(bVar.l(), bVar.n(), i, bVar.q);
    }

    static void a(@Nullable b bVar, @Nullable b bVar2) {
        if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("log_extra", bVar.n()).putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                if (bVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("boarding_to", Long.valueOf(bVar2.l()));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                e.a(bVar.l(), "splash_ad", "boarding", jSONObject);
            } catch (Exception unused) {
                return;
            }
        }
        if (bVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("log_extra", bVar2.n()).putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (bVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("covered_by", Long.valueOf(bVar.l()));
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
            e.a(bVar2.l(), "splash_ad", "covered", jSONObject3);
        }
    }

    @WorkerThread
    private static void a(@NonNull String str, long j) {
        JSONArray jSONArray;
        try {
            if (!g.a(str)) {
                if (j > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j));
                    String c2 = r.a().c();
                    if (g.a(c2)) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = new JSONArray(c2);
                    }
                    jSONArray.put(jSONObject);
                    r.a().h(jSONArray.toString()).d();
                }
            }
        } catch (Exception unused) {
        }
    }
}
