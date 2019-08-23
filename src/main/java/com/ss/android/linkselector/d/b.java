package com.ss.android.linkselector.d;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.linkselector.c.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f29303a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f29304b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public boolean f29305c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29306d;

    /* renamed from: e  reason: collision with root package name */
    private long f29307e;

    public interface a {
        void a(List<com.ss.android.linkselector.b.b> list);
    }

    /* renamed from: com.ss.android.linkselector.d.b$b  reason: collision with other inner class name */
    class C0353b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        List<com.ss.android.linkselector.b.b> f29308a = new ArrayList();

        private void a() {
            Collections.sort(this.f29308a, new Comparator<com.ss.android.linkselector.b.b>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return (int) (((com.ss.android.linkselector.b.b) obj).h() - ((com.ss.android.linkselector.b.b) obj2).h());
                }
            });
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f29308a);
            int i = 0;
            while (i < this.f29308a.size()) {
                com.ss.android.linkselector.b.b bVar = this.f29308a.get(i);
                StringBuilder sb = new StringBuilder("weight sort = ");
                sb.append(bVar.h());
                sb.append(" ");
                sb.append(bVar.f29293e);
                sb.append("://");
                sb.append(bVar.f29292d);
                i++;
                for (int i2 = i; i2 < this.f29308a.size(); i2++) {
                    com.ss.android.linkselector.b.b bVar2 = this.f29308a.get(i2);
                    if (bVar.f29292d.equals(bVar2.f29292d)) {
                        arrayList.remove(bVar2);
                    }
                }
            }
            this.f29308a.clear();
            this.f29308a.addAll(arrayList);
            if (this.f29308a.size() > 0) {
                b.this.f29305c = true;
            } else {
                b.this.f29305c = false;
            }
            b.this.f29306d = false;
            StringBuilder sb2 = new StringBuilder("speed distinct = ");
            sb2.append(this.f29308a.size());
            sb2.append(" thread = ");
            sb2.append(Thread.currentThread());
        }

        /* JADX WARNING: type inference failed for: r7v1, types: [java.net.URLConnection] */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ec, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
            r24 = r2;
            r22 = r8;
            r23 = r10;
            r1 = 2147483647L;
            r11 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0145, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0146, code lost:
            r24 = r2;
            r21 = r4;
            r20 = r8;
            r23 = r10;
            r1 = 2147483647L;
            r11 = r0;
            r10 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0158, code lost:
            r23 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0167, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0168, code lost:
            r24 = r2;
            r20 = r8;
            r23 = r10;
            r1 = 2147483647L;
            r11 = r0;
            r10 = null;
            r17 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0177, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
            r23 = r10;
            r17 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            r23.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            r23.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            r17.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01c7 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0157 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0073] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0177 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0052] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01b2 A[SYNTHETIC, Splitter:B:78:0x01b2] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01bc A[SYNTHETIC, Splitter:B:84:0x01bc] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01c1 A[SYNTHETIC, Splitter:B:88:0x01c1] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r25 = this;
                r1 = r25
                r0 = 0
                r2 = 0
            L_0x0004:
                java.util.List<com.ss.android.linkselector.b.b> r0 = r1.f29308a
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x01cd
                java.util.List<com.ss.android.linkselector.b.b> r0 = r1.f29308a
                java.lang.Object r0 = r0.get(r2)
                r13 = r0
                com.ss.android.linkselector.b.b r13 = (com.ss.android.linkselector.b.b) r13
                if (r13 == 0) goto L_0x01c5
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r0 = r13.f29293e
                r14.append(r0)
                java.lang.String r0 = "://"
                r14.append(r0)
                java.lang.String r0 = r13.f29292d
                r14.append(r0)
                java.lang.String r0 = "/ies/speed/"
                r14.append(r0)
                long r3 = java.lang.System.currentTimeMillis()
                r14.append(r3)
                long r15 = java.lang.System.currentTimeMillis()
                r3 = -1
                r4 = -1
                r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
                r6 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                java.lang.String r7 = r14.toString()     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                r0.<init>(r7)     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                java.net.URLConnection r7 = r0.openConnection()     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                r10 = r7
                java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                com.ss.android.linkselector.LinkSelector r7 = com.ss.android.linkselector.LinkSelector.a()     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                int r7 = r7.f2475d     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                r10.setConnectTimeout(r7)     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                com.ss.android.linkselector.LinkSelector r7 = com.ss.android.linkselector.LinkSelector.a()     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                int r7 = r7.f2475d     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                r10.setReadTimeout(r7)     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                java.lang.String r7 = "X-SS-No-Cookie"
                java.lang.String r8 = "true"
                r10.setRequestProperty(r7, r8)     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                int r8 = r10.getResponseCode()     // Catch:{ Exception -> 0x017d, all -> 0x0177 }
                java.io.InputStream r17 = r10.getInputStream()     // Catch:{ Exception -> 0x0167, all -> 0x0177 }
                long r18 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x015c, all -> 0x0157 }
                r3 = 0
                long r4 = r18 - r15
                java.lang.String r3 = "X-TT-LOGID"
                java.lang.String r18 = r10.getHeaderField(r3)     // Catch:{ Exception -> 0x0145, all -> 0x0157 }
                r3 = 200(0xc8, float:2.8E-43)
                if (r8 != r3) goto L_0x00fd
                r13.g = r4     // Catch:{ Exception -> 0x00ec, all -> 0x0157 }
                r13.f()     // Catch:{ Exception -> 0x00ec, all -> 0x0157 }
                java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x0157 }
                r0 = 0
                r19 = 1
                r6 = r4
                r4 = r13
                r5 = r8
                r20 = r6
                r22 = r8
                r8 = r15
                r23 = r10
                r10 = r18
                r24 = r2
                r1 = r11
                r11 = r0
                r12 = r19
                a(r3, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x00e8 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r3 = "sort speed time = "
                r0.<init>(r3)     // Catch:{ Exception -> 0x00e8 }
                r11 = r20
                r0.append(r11)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = " "
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = r13.f29293e     // Catch:{ Exception -> 0x00e6 }
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = "://"
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = r13.f29292d     // Catch:{ Exception -> 0x00e6 }
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = "sort weight time = "
                r0.<init>(r3)     // Catch:{ Exception -> 0x00e6 }
                long r3 = r13.f29294f     // Catch:{ Exception -> 0x00e6 }
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = " "
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = r13.f29293e     // Catch:{ Exception -> 0x00e6 }
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = "://"
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                java.lang.String r3 = r13.f29292d     // Catch:{ Exception -> 0x00e6 }
                r0.append(r3)     // Catch:{ Exception -> 0x00e6 }
                goto L_0x012a
            L_0x00e6:
                r0 = move-exception
                goto L_0x00f5
            L_0x00e8:
                r0 = move-exception
                r11 = r20
                goto L_0x00f5
            L_0x00ec:
                r0 = move-exception
                r24 = r2
                r22 = r8
                r23 = r10
                r1 = r11
                r11 = r4
            L_0x00f5:
                r6 = r11
                r10 = r18
                r5 = r22
                r11 = r0
                goto L_0x019a
            L_0x00fd:
                r24 = r2
                r22 = r8
                r23 = r10
                r1 = r11
                r11 = r4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013c }
                java.lang.String r4 = "sort speed error code = "
                r3.<init>(r4)     // Catch:{ Exception -> 0x013c }
                r10 = r22
                r3.append(r10)     // Catch:{ Exception -> 0x0138 }
                r13.g = r1     // Catch:{ Exception -> 0x0138 }
                java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0138 }
                r0 = 0
                r19 = 0
                r4 = r13
                r5 = r10
                r6 = r11
                r8 = r15
                r20 = r10
                r10 = r18
                r21 = r11
                r11 = r0
                r12 = r19
                a(r3, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x0136 }
            L_0x012a:
                if (r23 == 0) goto L_0x012f
                r23.disconnect()     // Catch:{ Exception -> 0x012f }
            L_0x012f:
                if (r17 == 0) goto L_0x01c7
            L_0x0131:
                r17.close()     // Catch:{ IOException -> 0x01c7 }
                goto L_0x01c7
            L_0x0136:
                r0 = move-exception
                goto L_0x0141
            L_0x0138:
                r0 = move-exception
                r20 = r10
                goto L_0x013f
            L_0x013c:
                r0 = move-exception
                r20 = r22
            L_0x013f:
                r21 = r11
            L_0x0141:
                r11 = r0
                r10 = r18
                goto L_0x0151
            L_0x0145:
                r0 = move-exception
                r24 = r2
                r21 = r4
                r20 = r8
                r23 = r10
                r1 = r11
                r11 = r0
                r10 = r6
            L_0x0151:
                r5 = r20
                r6 = r21
                goto L_0x019a
            L_0x0157:
                r0 = move-exception
                r23 = r10
                goto L_0x01ba
            L_0x015c:
                r0 = move-exception
                r24 = r2
                r20 = r8
                r23 = r10
                r1 = r11
                r11 = r0
                r10 = r6
                goto L_0x0173
            L_0x0167:
                r0 = move-exception
                r24 = r2
                r20 = r8
                r23 = r10
                r1 = r11
                r11 = r0
                r10 = r6
                r17 = r10
            L_0x0173:
                r6 = r4
                r5 = r20
                goto L_0x019a
            L_0x0177:
                r0 = move-exception
                r23 = r10
                r17 = r6
                goto L_0x01ba
            L_0x017d:
                r0 = move-exception
                r24 = r2
                r23 = r10
                r1 = r11
                r11 = r0
                r10 = r6
                r17 = r10
                goto L_0x0198
            L_0x0188:
                r0 = move-exception
                r17 = r6
                r23 = r17
                goto L_0x01ba
            L_0x018e:
                r0 = move-exception
                r24 = r2
                r1 = r11
                r11 = r0
                r10 = r6
                r17 = r10
                r23 = r17
            L_0x0198:
                r6 = r4
                r5 = -1
            L_0x019a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
                java.lang.String r3 = "sort speed error = "
                r0.<init>(r3)     // Catch:{ all -> 0x01b9 }
                r0.append(r11)     // Catch:{ all -> 0x01b9 }
                r13.g = r1     // Catch:{ all -> 0x01b9 }
                java.lang.String r3 = r14.toString()     // Catch:{ all -> 0x01b9 }
                r12 = 0
                r4 = r13
                r8 = r15
                a(r3, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x01b9 }
                if (r23 == 0) goto L_0x01b5
                r23.disconnect()     // Catch:{ Exception -> 0x01b5 }
            L_0x01b5:
                if (r17 == 0) goto L_0x01c7
                goto L_0x0131
            L_0x01b9:
                r0 = move-exception
            L_0x01ba:
                if (r23 == 0) goto L_0x01bf
                r23.disconnect()     // Catch:{ Exception -> 0x01bf }
            L_0x01bf:
                if (r17 == 0) goto L_0x01c4
                r17.close()     // Catch:{ IOException -> 0x01c4 }
            L_0x01c4:
                throw r0
            L_0x01c5:
                r24 = r2
            L_0x01c7:
                int r2 = r24 + 1
                r1 = r25
                goto L_0x0004
            L_0x01cd:
                r25.a()
                r1 = r25
                com.ss.android.linkselector.d.b r0 = com.ss.android.linkselector.d.b.this
                android.os.Handler r0 = r0.f29304b
                com.ss.android.linkselector.d.b$b$2 r2 = new com.ss.android.linkselector.d.b$b$2
                r2.<init>()
                r0.post(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.linkselector.d.b.C0353b.run():void");
        }

        public C0353b(List<com.ss.android.linkselector.b.b> list) {
            this.f29308a.clear();
            this.f29308a.addAll(list);
        }

        private static void a(String str, com.ss.android.linkselector.b.b bVar, int i, long j, long j2, String str2, Exception exc, boolean z) {
            c cVar = new c(str, bVar, i, j, j2, str2, exc, z);
            com.ss.android.linkselector.c.b.a(0, cVar);
        }
    }

    public b(a aVar) {
        this.f29303a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List<com.ss.android.linkselector.b.b> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.ss.android.linkselector.LinkSelector.c()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r2 = r5.f29307e     // Catch:{ all -> 0x0085 }
            r4 = 0
            long r0 = r0 - r2
            com.ss.android.linkselector.LinkSelector r2 = com.ss.android.linkselector.LinkSelector.a()     // Catch:{ all -> 0x0085 }
            long r2 = r2.f2474c     // Catch:{ all -> 0x0085 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x001f
            boolean r0 = r5.f29305c     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0023
        L_0x001f:
            boolean r0 = r5.f29306d     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x004f
        L_0x0023:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "no need opt sort ,last duration is "
            r6.<init>(r0)     // Catch:{ all -> 0x0085 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r2 = r5.f29307e     // Catch:{ all -> 0x0085 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 / r2
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = " min, frequency is "
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            com.ss.android.linkselector.LinkSelector r0 = com.ss.android.linkselector.LinkSelector.a()     // Catch:{ all -> 0x0085 }
            long r0 = r0.f2474c     // Catch:{ all -> 0x0085 }
            long r0 = r0 / r2
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = " min"
            r6.append(r0)     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return
        L_0x004f:
            r0 = 1
            r5.f29306d = r0     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0077
            int r0 = r6.size()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x005b
            goto L_0x0077
        L_0x005b:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            r5.f29307e = r0     // Catch:{ all -> 0x0085 }
            java.util.concurrent.ExecutorService r0 = com.ss.android.linkselector.d.a.f2484a     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x006b
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ all -> 0x0085 }
            com.ss.android.linkselector.d.a.f2484a = r0     // Catch:{ all -> 0x0085 }
        L_0x006b:
            java.util.concurrent.ExecutorService r0 = com.ss.android.linkselector.d.a.f2484a     // Catch:{ all -> 0x0085 }
            com.ss.android.linkselector.d.b$b r1 = new com.ss.android.linkselector.d.b$b     // Catch:{ all -> 0x0085 }
            r1.<init>(r6)     // Catch:{ all -> 0x0085 }
            r0.execute(r1)     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return
        L_0x0077:
            r0 = 0
            r5.f29306d = r0     // Catch:{ all -> 0x0085 }
            com.ss.android.linkselector.d.b$a r0 = r5.f29303a     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0083
            com.ss.android.linkselector.d.b$a r0 = r5.f29303a     // Catch:{ all -> 0x0085 }
            r0.a(r6)     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r5)
            return
        L_0x0085:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.linkselector.d.b.a(java.util.List):void");
    }
}
