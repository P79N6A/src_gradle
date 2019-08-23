package com.ss.android.ugc.a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.a.a.a;
import com.ss.android.ugc.a.b.b;
import com.ss.android.ugc.a.b.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public OkHttpClient f31538a;

    /* renamed from: b  reason: collision with root package name */
    public e f31539b;

    /* renamed from: c  reason: collision with root package name */
    public a f31540c;

    /* renamed from: d  reason: collision with root package name */
    private Context f31541d;

    public final void a(e eVar, d dVar) {
        if (eVar != null) {
            this.f31539b = eVar;
            String str = this.f31539b.f31527b;
            final String a2 = a.a(eVar.f31528c);
            final File file = new File(a2);
            final long length = file.length();
            b bVar = b.a().f31517b;
            if (bVar != null) {
                HashMap<String, String> hashMap = eVar.m;
                final d dVar2 = dVar;
                final e eVar2 = eVar;
                AnonymousClass1 r2 = new com.ss.android.ugc.a.b.a() {
                    public final void a(IOException iOException) {
                        dVar2.onError(c.a().a(6).a(iOException.getMessage()));
                    }

                    public final void a(boolean z, boolean z2, int i, long j, InputStream inputStream) throws IOException {
                        f.this.a(dVar2, eVar2, a2, file, z, z2, i, j, inputStream);
                    }
                };
                bVar.a(str, hashMap, r2);
                return;
            }
            try {
                Request.Builder builder = new Request.Builder();
                builder.url(str).tag(str).addHeader("User-Agent", "IesDownload").addHeader("Connection", "Keep-Alive");
                HashMap<String, String> hashMap2 = eVar.m;
                if (!(hashMap2 == null || hashMap2.size() == 0)) {
                    for (String next : hashMap2.keySet()) {
                        String str2 = hashMap2.get(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(str2)) {
                            builder.addHeader(next, str2);
                        }
                    }
                }
                Call newCall = this.f31538a.newCall(builder.build());
                final d dVar3 = dVar;
                final e eVar3 = eVar;
                AnonymousClass2 r22 = new Callback() {
                    public final void onFailure(Call call, IOException iOException) {
                        dVar3.onError(c.a().a(6).a(iOException.getMessage()));
                    }

                    public final void onResponse(Call call, Response response) throws IOException {
                        long j;
                        if (response.header("Content-Length") != null) {
                            j = Long.valueOf(response.header("Content-Length")).longValue();
                        } else {
                            j = 0;
                        }
                        f.this.a(dVar3, eVar3, a2, file, response.isSuccessful(), response.isRedirect(), response.code(), j, response.body().byteStream());
                    }
                };
                newCall.enqueue(r22);
            } catch (Exception unused) {
            }
        }
    }

    public f(Context context, OkHttpClient okHttpClient, a aVar) {
        if (context != null) {
            this.f31541d = context;
            this.f31540c = aVar;
        }
        if (okHttpClient != null) {
            this.f31538a = okHttpClient;
        } else {
            this.f31538a = b.a().b();
        }
    }

    private static boolean a(String str, long j, d dVar) {
        if (str.startsWith("/data/data/")) {
            if (d.b() - j < 2097152) {
                dVar.onError(c.a().a(8));
                return false;
            }
        } else if (d.c() - j < 2097152) {
            dVar.onError(c.a().a(8));
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:21|22|(3:23|24|(3:26|(7:28|29|(1:31)|32|33|34|121)(1:120)|118)(1:119))|35|(1:37)|38|(2:40|(1:42)(2:43|(1:45)))|46|47|48|49|50|51|52|53) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:19|20|21|22|(3:23|24|(3:26|(7:28|29|(1:31)|32|33|34|121)(1:120)|118)(1:119))|35|(1:37)|38|(2:40|(1:42)(2:43|(1:45)))|46|47|48|49|50|51|52|53) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:(2:79|80)|(2:83|84)|85|86|87) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:92|93|(2:95|96)|(2:99|100)|101|102|103) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x014e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x015c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0122 A[SYNTHETIC, Splitter:B:90:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0146 A[SYNTHETIC, Splitter:B:95:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x014b A[SYNTHETIC, Splitter:B:99:0x014b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.a.b.d r17, com.ss.android.ugc.a.e r18, java.lang.String r19, java.io.File r20, boolean r21, boolean r22, int r23, long r24, java.io.InputStream r26) {
        /*
            r16 = this;
            r1 = r16
            r8 = r17
            r0 = r18
            r9 = r19
            r10 = r24
            if (r21 != 0) goto L_0x002f
            if (r22 != 0) goto L_0x002f
            com.ss.android.ugc.a.c r0 = com.ss.android.ugc.a.c.a()
            r2 = 5
            com.ss.android.ugc.a.c r0 = r0.a((int) r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "http status code: "
            r2.<init>(r3)
            r3 = r23
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.a.c r0 = r0.a((java.lang.String) r2)
            r8.onError(r0)
            return
        L_0x002f:
            if (r20 == 0) goto L_0x003a
            boolean r2 = r20.exists()
            if (r2 == 0) goto L_0x003a
            r20.delete()
        L_0x003a:
            boolean r2 = a(r9, r10, r8)
            if (r2 != 0) goto L_0x0041
            return
        L_0x0041:
            com.ss.android.ugc.a.e r2 = r1.f31539b
            r12 = 1
            r2.h = r12
            com.ss.android.ugc.a.e r2 = r1.f31539b
            long r3 = java.lang.System.currentTimeMillis()
            r2.f31529d = r3
            com.ss.android.ugc.a.e r2 = r1.f31539b
            int r2 = r2.f31526a
            r8.onDownloadStart(r2)
            r2 = 2048(0x800, float:2.87E-42)
            int r3 = r0.l
            if (r3 == 0) goto L_0x005d
            int r2 = r0.l
        L_0x005d:
            byte[] r0 = new byte[r2]
            r2 = 0
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0109, all -> 0x0103 }
            r14 = r26
            r13.<init>(r14)     // Catch:{ Exception -> 0x0101, all -> 0x00ff }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r3 = "rwd"
            r6.<init>(r9, r3)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
        L_0x006e:
            int r2 = r13.read(r0)     // Catch:{ Exception -> 0x00f5, all -> 0x00f2 }
            r3 = -1
            if (r2 == r3) goto L_0x0099
            r3 = 0
            r6.write(r0, r3, r2)     // Catch:{ Exception -> 0x00f5, all -> 0x00f2 }
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006e
            long r4 = r20.length()     // Catch:{ Exception -> 0x00f5, all -> 0x00f2 }
            r2 = 100
            long r2 = r2 * r4
            long r2 = r2 / r10
            int r2 = (int) r2
            r3 = 100
            if (r2 <= r3) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r3 = r2
        L_0x008f:
            r2 = r17
            r15 = r6
            r6 = r24
            r2.onDownloadProgress(r3, r4, r6)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r6 = r15
            goto L_0x006e
        L_0x0099:
            r15 = r6
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            com.ss.android.ugc.a.e r0 = r1.f31539b     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r0.f31530e = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            com.ss.android.ugc.a.e r0 = r1.f31539b     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r0.f31531f = r10     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            com.ss.android.ugc.a.e r0 = r1.f31539b     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r2 = 3
            r0.h = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            com.ss.android.ugc.a.a.a r0 = r1.f31540c     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            if (r0 == 0) goto L_0x00b6
            com.ss.android.ugc.a.a.a r0 = r1.f31540c     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            com.ss.android.ugc.a.e r2 = r1.f31539b     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r0.a((com.ss.android.ugc.a.e) r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
        L_0x00b6:
            com.ss.android.ugc.a.e r0 = r1.f31539b     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.lang.String r0 = r0.f31528c     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            boolean r2 = android.text.TextUtils.isEmpty(r19)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            if (r2 != 0) goto L_0x00db
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            if (r2 == 0) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r2.<init>(r9)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            if (r0 == 0) goto L_0x00db
            boolean r0 = r2.renameTo(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
        L_0x00db:
            com.ss.android.ugc.a.e r0 = r1.f31539b     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.lang.String r0 = r0.f31528c     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r8.onDownloadSuccess(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r13.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e5:
            r15.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            r26.close()     // Catch:{ Exception -> 0x00ec }
            return
        L_0x00ec:
            return
        L_0x00ed:
            r0 = move-exception
            goto L_0x0144
        L_0x00f0:
            r0 = move-exception
            goto L_0x00fd
        L_0x00f2:
            r0 = move-exception
            r15 = r6
            goto L_0x0144
        L_0x00f5:
            r0 = move-exception
            r15 = r6
            goto L_0x00fd
        L_0x00f8:
            r0 = move-exception
            r15 = r2
            goto L_0x0144
        L_0x00fb:
            r0 = move-exception
            r15 = r2
        L_0x00fd:
            r2 = r13
            goto L_0x010d
        L_0x00ff:
            r0 = move-exception
            goto L_0x0106
        L_0x0101:
            r0 = move-exception
            goto L_0x010c
        L_0x0103:
            r0 = move-exception
            r14 = r26
        L_0x0106:
            r13 = r2
            r15 = r13
            goto L_0x0144
        L_0x0109:
            r0 = move-exception
            r14 = r26
        L_0x010c:
            r15 = r2
        L_0x010d:
            boolean r3 = a(r9, r10, r8)     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            if (r3 != 0) goto L_0x0122
            if (r2 == 0) goto L_0x0118
            r2.close()     // Catch:{ IOException -> 0x0118 }
        L_0x0118:
            if (r15 == 0) goto L_0x011d
            r15.close()     // Catch:{ IOException -> 0x011d }
        L_0x011d:
            r26.close()     // Catch:{ Exception -> 0x0121 }
            return
        L_0x0121:
            return
        L_0x0122:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            r3.<init>()     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            r4.<init>(r3, r12)     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r0, (java.io.PrintWriter) r4)     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            r3.close()     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            com.ss.android.ugc.a.c r3 = com.ss.android.ugc.a.c.a()     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            com.ss.android.ugc.a.c r0 = r3.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            r8.onError(r0)     // Catch:{ Exception -> 0x0152, all -> 0x0142 }
            goto L_0x0152
        L_0x0142:
            r0 = move-exception
            r13 = r2
        L_0x0144:
            if (r13 == 0) goto L_0x0149
            r13.close()     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            if (r15 == 0) goto L_0x014e
            r15.close()     // Catch:{ IOException -> 0x014e }
        L_0x014e:
            r26.close()     // Catch:{ Exception -> 0x0151 }
        L_0x0151:
            throw r0
        L_0x0152:
            if (r2 == 0) goto L_0x0157
            r2.close()     // Catch:{ IOException -> 0x0157 }
        L_0x0157:
            if (r15 == 0) goto L_0x015c
            r15.close()     // Catch:{ IOException -> 0x015c }
        L_0x015c:
            r26.close()     // Catch:{ Exception -> 0x0160 }
            return
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.a.f.a(com.ss.android.ugc.a.b.d, com.ss.android.ugc.a.e, java.lang.String, java.io.File, boolean, boolean, int, long, java.io.InputStream):void");
    }
}
