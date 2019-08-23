package com.ss.android.ugc.effectmanager.link.a.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.link.LinkSelector;
import com.ss.android.ugc.effectmanager.link.a.a.b;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.android.ugc.effectmanager.link.model.host.HostStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class a extends d {

    /* renamed from: e  reason: collision with root package name */
    private List<Host> f77528e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private String f77529f;
    private LinkSelector g;

    public final void a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f77528e.size(); i2++) {
            this.f77528e.get(i2).sortTime = 0;
            for (int i3 = 0; i3 < this.g.f77520d; i3++) {
                a(this.f77528e.get(i2), this.f77528e.get(i2).getSortTime());
            }
        }
        Collections.sort(this.f77528e, new Comparator<Host>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return (int) (((Host) obj).getSortTime() - ((Host) obj2).getSortTime());
            }
        });
        ArrayList arrayList = new ArrayList(this.f77528e);
        arrayList.clear();
        arrayList.addAll(this.f77528e);
        while (i < this.f77528e.size()) {
            Host host = this.f77528e.get(i);
            StringBuilder sb = new StringBuilder("weight sort = ");
            sb.append(host.getSortTime());
            sb.append(" ");
            sb.append(host.schema);
            sb.append("://");
            sb.append(host.host);
            sb.append(this.f77529f);
            i++;
            for (int i4 = i; i4 < this.f77528e.size(); i4++) {
                Host host2 = this.f77528e.get(i4);
                if (host.host.equals(host2.host)) {
                    arrayList.remove(host2);
                }
            }
        }
        this.f77528e.clear();
        this.f77528e.addAll(arrayList);
        StringBuilder sb2 = new StringBuilder("speed distinct = ");
        sb2.append(this.f77528e.size());
        sb2.append(" thread = ");
        sb2.append(Thread.currentThread());
        a(31, new com.ss.android.ugc.effectmanager.link.a.a.a(this.f77528e, null));
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.net.URLConnection] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        r21 = r7;
        r22 = r9;
        r23 = r14;
        r24 = r15;
        r14 = 2147483647L;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013b, code lost:
        r19 = r5;
        r18 = r7;
        r22 = r9;
        r23 = r14;
        r24 = r15;
        r14 = 2147483647L;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0158, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
        r22 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015d, code lost:
        r22 = r9;
        r23 = r14;
        r24 = r15;
        r14 = 2147483647L;
        r10 = r0;
        r5 = -1;
        r9 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0158 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.ugc.effectmanager.link.model.host.Host r27, long r28) {
        /*
            r26 = this;
            r12 = r26
            r13 = r27
            if (r13 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = r13.schema
            r14.append(r0)
            java.lang.String r0 = "://"
            r14.append(r0)
            java.lang.String r0 = r13.host
            r14.append(r0)
            java.lang.String r0 = r12.f77529f
            r14.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r14.append(r0)
            long r15 = java.lang.System.currentTimeMillis()
            r1 = -1
            r2 = -1
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r4 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x016c, all -> 0x0168 }
            java.lang.String r5 = r14.toString()     // Catch:{ Exception -> 0x016c, all -> 0x0168 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x016c, all -> 0x0168 }
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ Exception -> 0x016c, all -> 0x0168 }
            r9 = r5
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x016c, all -> 0x0168 }
            com.ss.android.ugc.effectmanager.link.LinkSelector r5 = r12.g     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            int r5 = r5.f77519c     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            r9.setConnectTimeout(r5)     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            com.ss.android.ugc.effectmanager.link.LinkSelector r5 = r12.g     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            int r5 = r5.f77519c     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            r9.setReadTimeout(r5)     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            java.lang.String r5 = "X-SS-No-Cookie"
            java.lang.String r6 = "true"
            r9.setRequestProperty(r5, r6)     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            int r7 = r9.getResponseCode()     // Catch:{ Exception -> 0x015c, all -> 0x0158 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0148, all -> 0x0158 }
            r1 = 0
            long r5 = r5 - r15
            java.lang.String r1 = "X-TT-LOGID"
            java.lang.String r17 = r9.getHeaderField(r1)     // Catch:{ Exception -> 0x013a, all -> 0x0158 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L_0x00ec
            long r1 = r5 + r28
            r13.sortTime = r1     // Catch:{ Exception -> 0x00da, all -> 0x0158 }
            r27.resetStatus()     // Catch:{ Exception -> 0x00da, all -> 0x0158 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x00da, all -> 0x0158 }
            r0 = 0
            r18 = 1
            r1 = r26
            r3 = r27
            r4 = r7
            r19 = r5
            r21 = r7
            r7 = r15
            r22 = r9
            r9 = r17
            r23 = r14
            r24 = r15
            r14 = r10
            r10 = r0
            r11 = r18
            r1.a(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ Exception -> 0x00d5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = "sort speed time = "
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d5 }
            r10 = r19
            r0.append(r10)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = " "
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = r13.schema     // Catch:{ Exception -> 0x00d3 }
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = "://"
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = r13.host     // Catch:{ Exception -> 0x00d3 }
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = "sort weight time = "
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d3 }
            long r1 = r13.weightTime     // Catch:{ Exception -> 0x00d3 }
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = " "
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = r13.schema     // Catch:{ Exception -> 0x00d3 }
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = "://"
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = r13.host     // Catch:{ Exception -> 0x00d3 }
            r0.append(r1)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x011f
        L_0x00d3:
            r0 = move-exception
            goto L_0x00d8
        L_0x00d5:
            r0 = move-exception
            r10 = r19
        L_0x00d8:
            r5 = r10
            goto L_0x00e5
        L_0x00da:
            r0 = move-exception
            r21 = r7
            r22 = r9
            r23 = r14
            r24 = r15
            r14 = r10
            r10 = r5
        L_0x00e5:
            r9 = r17
            r4 = r21
            r10 = r0
            goto L_0x0178
        L_0x00ec:
            r21 = r7
            r22 = r9
            r23 = r14
            r24 = r15
            r14 = r10
            r10 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            java.lang.String r2 = "sort speed error code = "
            r1.<init>(r2)     // Catch:{ Exception -> 0x012d }
            r9 = r21
            r1.append(r9)     // Catch:{ Exception -> 0x0127 }
            r13.sortTime = r14     // Catch:{ Exception -> 0x0127 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x0127 }
            r0 = 0
            r16 = 0
            r1 = r26
            r3 = r27
            r4 = r9
            r5 = r10
            r7 = r24
            r18 = r9
            r9 = r17
            r19 = r10
            r10 = r0
            r11 = r16
            r1.a(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ Exception -> 0x0125 }
        L_0x011f:
            if (r22 == 0) goto L_0x0198
            r22.disconnect()
            return
        L_0x0125:
            r0 = move-exception
            goto L_0x0132
        L_0x0127:
            r0 = move-exception
            r18 = r9
            r19 = r10
            goto L_0x0132
        L_0x012d:
            r0 = move-exception
            r19 = r10
            r18 = r21
        L_0x0132:
            r10 = r0
            r9 = r17
            r4 = r18
            r5 = r19
            goto L_0x0178
        L_0x013a:
            r0 = move-exception
            r19 = r5
            r18 = r7
            r22 = r9
            r23 = r14
            r24 = r15
            r14 = r10
            r10 = r0
            goto L_0x0154
        L_0x0148:
            r0 = move-exception
            r18 = r7
            r22 = r9
            r23 = r14
            r24 = r15
            r14 = r10
            r10 = r0
            r5 = r2
        L_0x0154:
            r9 = r4
            r4 = r18
            goto L_0x0178
        L_0x0158:
            r0 = move-exception
            r22 = r9
            goto L_0x019a
        L_0x015c:
            r0 = move-exception
            r22 = r9
            r23 = r14
            r24 = r15
            r14 = r10
            r10 = r0
            r5 = r2
            r9 = r4
            goto L_0x0177
        L_0x0168:
            r0 = move-exception
            r22 = r4
            goto L_0x019a
        L_0x016c:
            r0 = move-exception
            r23 = r14
            r24 = r15
            r14 = r10
            r10 = r0
            r5 = r2
            r9 = r4
            r22 = r9
        L_0x0177:
            r4 = -1
        L_0x0178:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0199 }
            java.lang.String r1 = "sort speed error = "
            r0.<init>(r1)     // Catch:{ all -> 0x0199 }
            r0.append(r10)     // Catch:{ all -> 0x0199 }
            r13.sortTime = r14     // Catch:{ all -> 0x0199 }
            java.lang.String r2 = r23.toString()     // Catch:{ all -> 0x0199 }
            r11 = 0
            r1 = r26
            r3 = r27
            r7 = r24
            r1.a(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ all -> 0x0199 }
            if (r22 == 0) goto L_0x0198
            r22.disconnect()
            return
        L_0x0198:
            return
        L_0x0199:
            r0 = move-exception
        L_0x019a:
            if (r22 == 0) goto L_0x019f
            r22.disconnect()
        L_0x019f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.link.a.b.a.a(com.ss.android.ugc.effectmanager.link.model.host.Host, long):void");
    }

    public a(LinkSelector linkSelector, Handler handler, String str) {
        super(handler, str, "NORMAL");
        this.f77528e.clear();
        this.f77528e.addAll(linkSelector.h);
        this.f77529f = linkSelector.g;
        this.g = linkSelector;
    }

    private void a(String str, Host host, int i, long j, long j2, String str2, Exception exc, boolean z) {
        HostStatus hostStatus = new HostStatus(str, host, i, j, j2, str2, exc, z);
        a(30, new b(hostStatus, null));
    }
}
