package com.ss.ugc.live.b.a.d;

import com.ss.ugc.live.b.a.a;
import com.ss.ugc.live.b.a.b.b;
import java.io.File;
import java.io.IOException;

public final class c implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public a<String> f78642a;

    /* renamed from: b  reason: collision with root package name */
    private b f78643b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.ugc.live.b.a.a.b f78644c;

    public final String a(com.ss.ugc.live.b.a.c cVar) throws Exception {
        String a2 = com.ss.ugc.live.b.a.e.b.a(this.f78644c.a(cVar));
        File file = new File(a2);
        if (file.exists() || file.mkdirs()) {
            return a2 + com.ss.ugc.live.b.a.e.a.a(cVar.a());
        }
        throw new IOException("mkdirs return false, dir=" + file);
    }

    public c(b bVar, com.ss.ugc.live.b.a.a.b bVar2) {
        this.f78643b = bVar;
        this.f78644c = bVar2;
    }

    public final void a(final com.ss.ugc.live.b.a.c cVar, a<String> aVar) {
        this.f78642a = aVar;
        final com.ss.ugc.live.b.a.b.a aVar2 = new com.ss.ugc.live.b.a.b.a(cVar.b());
        try {
            File b2 = com.ss.ugc.live.b.a.e.b.b(a(cVar));
            if (b2.exists()) {
                aVar2.f78629b = b2.length();
            }
        } catch (Exception unused) {
        }
        this.f78643b.a(aVar2, new b.a() {
            public final void a(Throwable th, int i) {
                if (i == 416) {
                    try {
                        File b2 = com.ss.ugc.live.b.a.e.b.b(c.this.a(cVar));
                        if (b2.exists()) {
                            b2.delete();
                        }
                    } catch (Exception unused) {
                    }
                }
                com.ss.ugc.live.b.a.c.c cVar = new com.ss.ugc.live.b.a.c.c("download failed", th, cVar, i, aVar2);
                c.this.f78642a.a(cVar, (com.ss.ugc.live.b.a.c.a) cVar);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(4:34|(2:40|41)|42|43) */
            /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|(2:30|31)(2:32|33)) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0076 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00a8 */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[Catch:{ Exception -> 0x00a9 }] */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[Catch:{ Exception -> 0x00a9 }] */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2 A[SYNTHETIC, Splitter:B:40:0x00a2] */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0076=Splitter:B:27:0x0076, B:42:0x00a8=Splitter:B:42:0x00a8} */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(java.io.InputStream r21, long r22) {
                /*
                    r20 = this;
                    r1 = r20
                    com.ss.ugc.live.b.a.d.c r0 = com.ss.ugc.live.b.a.d.c.this     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.b.a.c r2 = r3     // Catch:{ Exception -> 0x00a9 }
                    java.lang.String r0 = r0.a(r2)     // Catch:{ Exception -> 0x00a9 }
                    java.io.File r2 = com.ss.ugc.live.b.a.e.b.b(r0)     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.b.a.d.c r3 = com.ss.ugc.live.b.a.d.c.this     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.b.a.c r4 = r3     // Catch:{ Exception -> 0x00a9 }
                    r5 = 0
                    java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x009c }
                    java.lang.String r7 = "rw"
                    r6.<init>(r2, r7)     // Catch:{ all -> 0x009c }
                    long r7 = r6.length()     // Catch:{ all -> 0x0098 }
                    r9 = 0
                    int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0027
                    r6.seek(r7)     // Catch:{ all -> 0x0098 }
                L_0x0027:
                    r5 = 2048(0x800, float:2.87E-42)
                    byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0098 }
                    r11 = 0
                    long r11 = r7 + r22
                    r13 = 0
                    r14 = r7
                    r8 = 0
                    r7 = r21
                L_0x0033:
                    int r9 = r7.read(r5)     // Catch:{ all -> 0x0096 }
                    if (r9 < 0) goto L_0x0070
                    r6.write(r5, r13, r9)     // Catch:{ all -> 0x0096 }
                    long r9 = (long) r9     // Catch:{ all -> 0x0096 }
                    long r14 = r14 + r9
                    r9 = 0
                    int r16 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                    if (r16 <= 0) goto L_0x004c
                    r16 = 100
                    long r16 = r16 * r14
                    long r9 = r16 / r11
                    int r9 = (int) r9
                    goto L_0x0067
                L_0x004c:
                    r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                    long r9 = -r14
                    double r9 = (double) r9
                    r18 = 4677104761256804352(0x40e86a0000000000, double:50000.0)
                    java.lang.Double.isNaN(r9)
                    double r9 = r9 / r18
                    double r9 = java.lang.Math.exp(r9)     // Catch:{ all -> 0x0096 }
                    r18 = 0
                    double r16 = r16 - r9
                    r9 = 4636737291354636288(0x4059000000000000, double:100.0)
                    double r9 = r9 * r16
                    int r9 = (int) r9     // Catch:{ all -> 0x0096 }
                L_0x0067:
                    if (r9 == r8) goto L_0x0033
                    com.ss.ugc.live.b.a.a<java.lang.String> r8 = r3.f78642a     // Catch:{ all -> 0x0096 }
                    r8.a((com.ss.ugc.live.b.a.c) r4, (int) r9)     // Catch:{ all -> 0x0096 }
                    r8 = r9
                    goto L_0x0033
                L_0x0070:
                    r6.close()     // Catch:{ IOException -> 0x0076 }
                    r21.close()     // Catch:{ IOException -> 0x0076 }
                L_0x0076:
                    java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00a9 }
                    r3.<init>(r0)     // Catch:{ Exception -> 0x00a9 }
                    boolean r3 = r2.renameTo(r3)     // Catch:{ Exception -> 0x00a9 }
                    if (r3 == 0) goto L_0x008b
                    com.ss.ugc.live.b.a.d.c r2 = com.ss.ugc.live.b.a.d.c.this     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.b.a.a<java.lang.String> r2 = r2.f78642a     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.b.a.c r3 = r3     // Catch:{ Exception -> 0x00a9 }
                    r2.a((com.ss.ugc.live.b.a.c) r3, r0)     // Catch:{ Exception -> 0x00a9 }
                    return
                L_0x008b:
                    r2.delete()     // Catch:{ Exception -> 0x00a9 }
                    java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x00a9 }
                    java.lang.String r2 = "rename file failed"
                    r0.<init>(r2)     // Catch:{ Exception -> 0x00a9 }
                    throw r0     // Catch:{ Exception -> 0x00a9 }
                L_0x0096:
                    r0 = move-exception
                    goto L_0x00a0
                L_0x0098:
                    r0 = move-exception
                    r7 = r21
                    goto L_0x00a0
                L_0x009c:
                    r0 = move-exception
                    r7 = r21
                    r6 = r5
                L_0x00a0:
                    if (r6 == 0) goto L_0x00a8
                    r6.close()     // Catch:{ IOException -> 0x00a8 }
                    r21.close()     // Catch:{ IOException -> 0x00a8 }
                L_0x00a8:
                    throw r0     // Catch:{ Exception -> 0x00a9 }
                L_0x00a9:
                    r0 = move-exception
                    com.ss.ugc.live.b.a.c.e r2 = new com.ss.ugc.live.b.a.c.e
                    java.lang.String r3 = "write storage failed."
                    com.ss.ugc.live.b.a.c r4 = r3
                    r2.<init>(r3, r0, r4)
                    com.ss.ugc.live.b.a.d.c r0 = com.ss.ugc.live.b.a.d.c.this
                    com.ss.ugc.live.b.a.a<java.lang.String> r0 = r0.f78642a
                    com.ss.ugc.live.b.a.c r3 = r3
                    r0.a((com.ss.ugc.live.b.a.c) r3, (com.ss.ugc.live.b.a.c.a) r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.b.a.d.c.AnonymousClass1.a(java.io.InputStream, long):void");
            }
        });
    }
}
