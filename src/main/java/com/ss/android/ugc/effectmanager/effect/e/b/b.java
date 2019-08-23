package com.ss.android.ugc.effectmanager.effect.e.b;

import android.support.annotation.NonNull;
import com.ss.android.ugc.effectmanager.common.d.d;
import com.ss.android.ugc.effectmanager.common.f.c;
import com.ss.android.ugc.effectmanager.effect.a.a;
import com.ss.android.ugc.effectmanager.effect.e.a.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.effectmanager.d.a f77422a;

    /* renamed from: b  reason: collision with root package name */
    public final d f77423b;

    /* renamed from: c  reason: collision with root package name */
    public final String f77424c;

    /* renamed from: d  reason: collision with root package name */
    public final String f77425d;

    private com.ss.android.ugc.effectmanager.effect.d.a<e> a(final Effect effect) {
        return new com.ss.android.ugc.effectmanager.effect.d.a<e>() {
            public final void a() {
                a(this);
                a((com.ss.android.ugc.effectmanager.effect.d.a<T>) this, new e(effect, null));
            }
        };
    }

    public final com.ss.android.ugc.effectmanager.effect.d.a<e> a(final com.ss.android.ugc.effectmanager.effect.a.b bVar) {
        if (a(new File(bVar.f77354c), bVar.f77352a)) {
            return a(bVar.f77352a);
        }
        return new com.ss.android.ugc.effectmanager.effect.d.a<e>() {

            /* renamed from: a  reason: collision with root package name */
            String f77426a;

            /* renamed from: b  reason: collision with root package name */
            String f77427b;

            /* renamed from: c  reason: collision with root package name */
            Effect f77428c;

            /* renamed from: f  reason: collision with root package name */
            long f77429f;
            long g;
            long h;

            /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b$1$a */
            class a implements com.ss.android.ugc.effectmanager.effect.b.d {

                /* renamed from: b  reason: collision with root package name */
                private com.ss.android.ugc.effectmanager.effect.d.a<e> f77431b;

                public a(com.ss.android.ugc.effectmanager.effect.d.a aVar) {
                    this.f77431b = aVar;
                }

                public final void a(int i, long j) {
                    if (this.f77431b != null) {
                        this.f77431b.a(this.f77431b, i, j);
                    }
                }
            }

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00b1 */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1 A[Catch:{ IOException -> 0x01a5, Exception -> 0x01a7 }] */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x019d A[SYNTHETIC, Splitter:B:39:0x019d] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a() {
                /*
                    r15 = this;
                    r15.a(r15)
                    long r0 = java.lang.System.currentTimeMillis()
                    com.ss.android.ugc.effectmanager.effect.a.b r2 = r3
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f77352a
                    r15.f77428c = r2
                    if (r2 == 0) goto L_0x01ec
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r3
                    java.util.List<java.lang.String> r3 = r3.f77353b
                    if (r3 == 0) goto L_0x01ec
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r3
                    java.util.List<java.lang.String> r3 = r3.f77353b
                    boolean r3 = r3.isEmpty()
                    if (r3 != 0) goto L_0x01ec
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r3 = r2.file_url
                    boolean r3 = com.ss.android.ugc.effectmanager.common.f.b.a((com.ss.android.ugc.effectmanager.common.model.UrlModel) r3)
                    if (r3 == 0) goto L_0x0029
                    goto L_0x01ec
                L_0x0029:
                    r3 = 0
                    com.ss.android.ugc.effectmanager.effect.a.b r4 = r3
                    java.util.List<java.lang.String> r4 = r4.f77353b
                    int r4 = r4.size()
                L_0x0032:
                    if (r3 >= r4) goto L_0x01eb
                    boolean r5 = r15.f77387e
                    if (r5 == 0) goto L_0x0043
                    com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c
                    r1 = 10001(0x2711, float:1.4014E-41)
                    r0.<init>((int) r1)
                    r15.a((com.ss.android.ugc.effectmanager.effect.d.a<com.ss.android.ugc.effectmanager.effect.e.a.e>) r15, (com.ss.android.ugc.effectmanager.common.e.c) r0)
                    return
                L_0x0043:
                    com.ss.android.ugc.effectmanager.effect.a.b r5 = r3
                    java.util.List<java.lang.String> r5 = r5.f77353b
                    java.lang.Object r5 = r5.get(r3)
                    java.lang.String r5 = (java.lang.String) r5
                    r15.f77426a = r5
                    java.lang.String r5 = r2.zipPath     // Catch:{ Exception -> 0x01a7 }
                    boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01a7 }
                    if (r5 != 0) goto L_0x005f
                    java.lang.String r5 = r2.unzipPath     // Catch:{ Exception -> 0x01a7 }
                    boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01a7 }
                    if (r5 == 0) goto L_0x009c
                L_0x005f:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
                    r5.<init>()     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.effect.a.b r6 = r3     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = r6.f77354c     // Catch:{ Exception -> 0x01a7 }
                    r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x01a7 }
                    r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = r2.id     // Catch:{ Exception -> 0x01a7 }
                    r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = ".zip"
                    r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01a7 }
                    r2.zipPath = r5     // Catch:{ Exception -> 0x01a7 }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
                    r5.<init>()     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.effect.a.b r6 = r3     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = r6.f77354c     // Catch:{ Exception -> 0x01a7 }
                    r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x01a7 }
                    r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = r2.id     // Catch:{ Exception -> 0x01a7 }
                    r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01a7 }
                    r2.unzipPath = r5     // Catch:{ Exception -> 0x01a7 }
                L_0x009c:
                    java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException | UnknownHostException -> 0x00b1 }
                    java.lang.String r6 = r15.f77426a     // Catch:{ MalformedURLException | UnknownHostException -> 0x00b1 }
                    r5.<init>(r6)     // Catch:{ MalformedURLException | UnknownHostException -> 0x00b1 }
                    java.lang.String r5 = r5.getHost()     // Catch:{ MalformedURLException | UnknownHostException -> 0x00b1 }
                    java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch:{ MalformedURLException | UnknownHostException -> 0x00b1 }
                    java.lang.String r5 = r5.getHostAddress()     // Catch:{ MalformedURLException | UnknownHostException -> 0x00b1 }
                    r15.f77427b = r5     // Catch:{ MalformedURLException | UnknownHostException -> 0x00b1 }
                L_0x00b1:
                    com.ss.android.ugc.effectmanager.effect.e.b.b r5 = com.ss.android.ugc.effectmanager.effect.e.b.b.this     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.d.a r5 = r5.f77422a     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.effect.a.b r6 = r3     // Catch:{ Exception -> 0x01a7 }
                    java.util.List<java.lang.String> r6 = r6.f77353b     // Catch:{ Exception -> 0x01a7 }
                    java.lang.Object r6 = r6.get(r3)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.effect.e.b.b$1$a r14 = new com.ss.android.ugc.effectmanager.effect.e.b.b$1$a     // Catch:{ Exception -> 0x01a7 }
                    r14.<init>(r15)     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.common.a r7 = new com.ss.android.ugc.effectmanager.common.a     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r8 = "GET"
                    r7.<init>(r8, r6)     // Catch:{ IOException -> 0x01a5 }
                    java.io.InputStream r11 = r5.a(r7)     // Catch:{ IOException -> 0x01a5 }
                    if (r11 == 0) goto L_0x019d
                    com.ss.android.ugc.effectmanager.common.d.a r5 = com.ss.android.ugc.effectmanager.h.a()     // Catch:{ IOException -> 0x01a5 }
                    boolean r5 = r5 instanceof com.ss.android.ugc.effectmanager.common.a.a     // Catch:{ IOException -> 0x01a5 }
                    if (r5 == 0) goto L_0x0149
                    java.lang.String r5 = r2.id     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r5 = com.ss.android.ugc.effectmanager.common.a.a.e(r5)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01a5 }
                    r6.<init>()     // Catch:{ IOException -> 0x01a5 }
                    com.ss.android.ugc.effectmanager.common.d.a r8 = com.ss.android.ugc.effectmanager.h.a()     // Catch:{ IOException -> 0x01a5 }
                    com.ss.android.ugc.effectmanager.common.a.a r8 = (com.ss.android.ugc.effectmanager.common.a.a) r8     // Catch:{ IOException -> 0x01a5 }
                    java.io.File r8 = r8.f77276f     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r8 = r8.getPath()     // Catch:{ IOException -> 0x01a5 }
                    r6.append(r8)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r8 = java.io.File.separator     // Catch:{ IOException -> 0x01a5 }
                    r6.append(r8)     // Catch:{ IOException -> 0x01a5 }
                    r6.append(r5)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x01a5 }
                    r2.unzipPath = r6     // Catch:{ IOException -> 0x01a5 }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01a5 }
                    r6.<init>()     // Catch:{ IOException -> 0x01a5 }
                    r6.append(r5)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r5 = ".zip"
                    r6.append(r5)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r5 = r6.toString()     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r10 = com.ss.android.ugc.effectmanager.common.a.a.e(r5)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01a5 }
                    r5.<init>()     // Catch:{ IOException -> 0x01a5 }
                    com.ss.android.ugc.effectmanager.common.d.a r6 = com.ss.android.ugc.effectmanager.h.a()     // Catch:{ IOException -> 0x01a5 }
                    com.ss.android.ugc.effectmanager.common.a.a r6 = (com.ss.android.ugc.effectmanager.common.a.a) r6     // Catch:{ IOException -> 0x01a5 }
                    java.io.File r6 = r6.f77276f     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r6 = r6.getPath()     // Catch:{ IOException -> 0x01a5 }
                    r5.append(r6)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r6 = java.io.File.separator     // Catch:{ IOException -> 0x01a5 }
                    r5.append(r6)     // Catch:{ IOException -> 0x01a5 }
                    r5.append(r10)     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01a5 }
                    r2.zipPath = r5     // Catch:{ IOException -> 0x01a5 }
                    com.ss.android.ugc.effectmanager.common.d.a r5 = com.ss.android.ugc.effectmanager.h.a()     // Catch:{ IOException -> 0x01a5 }
                    com.ss.android.ugc.effectmanager.common.a.a r5 = (com.ss.android.ugc.effectmanager.common.a.a) r5     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r8 = r2.id     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r9 = r2.effect_id     // Catch:{ IOException -> 0x01a5 }
                    long r12 = r7.f77267c     // Catch:{ IOException -> 0x01a5 }
                    r7 = r5
                    r7.a(r8, r9, r10, r11, r12, r14)     // Catch:{ IOException -> 0x01a5 }
                    goto L_0x0150
                L_0x0149:
                    java.lang.String r5 = r2.zipPath     // Catch:{ IOException -> 0x01a5 }
                    long r6 = r7.f77267c     // Catch:{ IOException -> 0x01a5 }
                    com.ss.android.ugc.effectmanager.common.f.b.a(r11, r5, r6, r14)     // Catch:{ IOException -> 0x01a5 }
                L_0x0150:
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a7 }
                    java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r8 = r2.zipPath     // Catch:{ Exception -> 0x01a7 }
                    r7.<init>(r8)     // Catch:{ Exception -> 0x01a7 }
                    long r7 = r7.length()     // Catch:{ Exception -> 0x01a7 }
                    int r9 = com.ss.android.ugc.effectmanager.common.EffectConstants.f77264a     // Catch:{ Exception -> 0x01a7 }
                    long r9 = (long) r9     // Catch:{ Exception -> 0x01a7 }
                    long r7 = r7 / r9
                    r15.h = r7     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.common.d.a r7 = com.ss.android.ugc.effectmanager.h.a()     // Catch:{ Exception -> 0x01a7 }
                    boolean r7 = r7 instanceof com.ss.android.ugc.effectmanager.common.a.a     // Catch:{ Exception -> 0x01a7 }
                    if (r7 == 0) goto L_0x0177
                    com.ss.android.ugc.effectmanager.common.d.a r7 = com.ss.android.ugc.effectmanager.h.a()     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.common.a.a r7 = (com.ss.android.ugc.effectmanager.common.a.a) r7     // Catch:{ Exception -> 0x01a7 }
                    r7.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r2)     // Catch:{ Exception -> 0x01a7 }
                    goto L_0x0183
                L_0x0177:
                    java.lang.String r7 = r2.zipPath     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r8 = r2.unzipPath     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.common.f.d.a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x01a7 }
                    java.lang.String r7 = r2.zipPath     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.common.f.d.b(r7)     // Catch:{ Exception -> 0x01a7 }
                L_0x0183:
                    long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a7 }
                    r9 = 0
                    long r7 = r7 - r5
                    r15.g = r7     // Catch:{ Exception -> 0x01a7 }
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a7 }
                    r7 = 0
                    long r5 = r5 - r0
                    r15.f77429f = r5     // Catch:{ Exception -> 0x01a7 }
                    com.ss.android.ugc.effectmanager.effect.e.a.e r5 = new com.ss.android.ugc.effectmanager.effect.e.a.e     // Catch:{ Exception -> 0x01a7 }
                    r6 = 0
                    r5.<init>(r2, r6)     // Catch:{ Exception -> 0x01a7 }
                    r15.a((com.ss.android.ugc.effectmanager.effect.d.a<com.ss.android.ugc.effectmanager.effect.e.a.e>) r15, (com.ss.android.ugc.effectmanager.effect.e.a.e) r5)     // Catch:{ Exception -> 0x01a7 }
                    return
                L_0x019d:
                    android.accounts.NetworkErrorException r5 = new android.accounts.NetworkErrorException     // Catch:{ IOException -> 0x01a5 }
                    java.lang.String r6 = "Download error"
                    r5.<init>(r6)     // Catch:{ IOException -> 0x01a5 }
                    throw r5     // Catch:{ IOException -> 0x01a5 }
                L_0x01a5:
                    r5 = move-exception
                    throw r5     // Catch:{ Exception -> 0x01a7 }
                L_0x01a7:
                    r5 = move-exception
                    int r6 = r4 + -1
                    if (r3 != r6) goto L_0x01e7
                    com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c
                    r0.<init>((java.lang.Exception) r5)
                    java.lang.String r1 = r15.f77426a
                    java.lang.String r3 = ""
                    java.lang.String r4 = r15.f77427b
                    r0.a(r1, r3, r4)
                    com.ss.android.ugc.effectmanager.common.d.a r1 = com.ss.android.ugc.effectmanager.h.a()
                    boolean r1 = r1 instanceof com.ss.android.ugc.effectmanager.common.a.a
                    if (r1 == 0) goto L_0x01d9
                    com.ss.android.ugc.effectmanager.common.d.a r1 = com.ss.android.ugc.effectmanager.h.a()
                    com.ss.android.ugc.effectmanager.common.a.a r1 = (com.ss.android.ugc.effectmanager.common.a.a) r1
                    java.lang.String r3 = r2.unzipPath
                    r1.c(r3)
                    com.ss.android.ugc.effectmanager.common.d.a r1 = com.ss.android.ugc.effectmanager.h.a()
                    com.ss.android.ugc.effectmanager.common.a.a r1 = (com.ss.android.ugc.effectmanager.common.a.a) r1
                    java.lang.String r2 = r2.zipPath
                    r1.c(r2)
                    goto L_0x01e3
                L_0x01d9:
                    java.lang.String r1 = r2.unzipPath
                    com.ss.android.ugc.effectmanager.common.f.d.e(r1)
                    java.lang.String r1 = r2.zipPath
                    com.ss.android.ugc.effectmanager.common.f.d.e(r1)
                L_0x01e3:
                    r15.a((com.ss.android.ugc.effectmanager.effect.d.a<com.ss.android.ugc.effectmanager.effect.e.a.e>) r15, (com.ss.android.ugc.effectmanager.common.e.c) r0)
                    return
                L_0x01e7:
                    int r3 = r3 + 1
                    goto L_0x0032
                L_0x01eb:
                    return
                L_0x01ec:
                    com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c
                    r1 = 10003(0x2713, float:1.4017E-41)
                    r0.<init>((int) r1)
                    r15.a((com.ss.android.ugc.effectmanager.effect.d.a<com.ss.android.ugc.effectmanager.effect.e.a.e>) r15, (com.ss.android.ugc.effectmanager.common.e.c) r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.e.b.b.AnonymousClass1.a():void");
            }

            /* access modifiers changed from: private */
            public void a(com.ss.android.ugc.effectmanager.effect.d.a<e> aVar, e eVar) {
                String str;
                super.a(aVar, eVar);
                if (b.this.f77423b != null) {
                    d dVar = b.this.f77423b;
                    c a2 = c.a().a("app_id", b.this.f77424c).a("access_key", b.this.f77425d).a("duration", Long.valueOf(this.f77429f)).a("unzip_time", Long.valueOf(this.g));
                    if (this.f77428c == null) {
                        str = "";
                    } else {
                        str = this.f77428c.effect_id;
                    }
                    dVar.a("effect_download_success_rate", 0, a2.a("effect_id", str).a("size", Long.valueOf(this.h)).b());
                }
            }

            public final void a(com.ss.android.ugc.effectmanager.effect.d.a<e> aVar, @NonNull com.ss.android.ugc.effectmanager.common.e.c cVar) {
                String str;
                super.a(aVar, cVar);
                if (b.this.f77423b != null) {
                    d dVar = b.this.f77423b;
                    c a2 = c.a().a("app_id", b.this.f77424c).a("access_key", b.this.f77425d);
                    if (this.f77428c == null) {
                        str = "";
                    } else {
                        str = this.f77428c.effect_id;
                    }
                    dVar.a("effect_download_success_rate", 1, a2.a("effect_id", str).a("error_code", Integer.valueOf(cVar.f77315a)).a("error_msg", cVar.f77316b).a("download_url", this.f77426a).a("host_ip", this.f77427b).b());
                }
            }

            public final void a(com.ss.android.ugc.effectmanager.effect.d.a<e> aVar, int i2, long j2) {
                super.a(aVar, i2, j2);
            }
        };
    }

    private static boolean a(File file, Effect effect) {
        return new com.ss.android.ugc.effectmanager.common.a.b(file).d(effect.id);
    }

    public b(com.ss.android.ugc.effectmanager.d.a aVar, d dVar, String str, String str2) {
        this.f77422a = aVar;
        this.f77423b = dVar;
        this.f77424c = str;
        this.f77425d = str2;
    }
}
