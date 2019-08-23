package com.ss.android.ugc.playerkit.videoview.d;

import com.ss.android.linkselector.LinkSelector;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.b;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.c.f;
import com.ss.android.ugc.playerkit.videoview.a.a;
import java.util.Collections;
import java.util.List;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f77771a = 2400000;

    /* renamed from: b  reason: collision with root package name */
    private List<g> f77772b;

    private static String[] a(String[] strArr) {
        if (strArr.length == 0) {
            return strArr;
        }
        String str = null;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = 0;
                break;
            } else if (strArr[i].contains("aweme/v1/play")) {
                str = strArr[i];
                break;
            } else {
                i++;
            }
        }
        if (str == null) {
            return strArr;
        }
        String a2 = LinkSelector.a().a(str);
        if (b.a(a2, str)) {
            return strArr;
        }
        for (int i2 = i; i2 < strArr.length; i2++) {
            if (b.a(a2, strArr[i2])) {
                strArr[i2] = str;
                strArr[i] = a2;
                return strArr;
            }
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        if (i == 0) {
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            strArr2[0] = a2;
        } else {
            System.arraycopy(strArr, 0, strArr2, 0, i);
            System.arraycopy(strArr, i, strArr2, i + 1, strArr.length - i);
            strArr2[i] = a2;
        }
        return strArr2;
    }

    public i(List<g> list, long j) {
        this.f77772b = (list == null || list.isEmpty()) ? Collections.singletonList(g.f77767c) : Collections.singletonList(g.f77767c);
        this.f77771a = j;
    }

    public final f a(VideoUrlModel videoUrlModel, c.a aVar, boolean z) {
        a b2 = b(videoUrlModel, aVar, z);
        f fVar = new f();
        d dVar = new d(videoUrlModel, b2.f77753c, b2.f77751a);
        fVar.f77724a = new h(this.f77772b, dVar, 0).a(dVar).f77766a;
        fVar.f77726c = b2.f77752b;
        fVar.f77727d = b2.f77754d;
        fVar.f77725b = videoUrlModel.getRatio();
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r2.isH265() == 1) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.playerkit.videoview.a.a b(com.ss.android.ugc.aweme.feed.model.VideoUrlModel r10, com.ss.android.ugc.playerkit.c.c.a r11, boolean r12) {
        /*
            r9 = this;
            com.ss.android.ugc.playerkit.videoview.a.a r0 = new com.ss.android.ugc.playerkit.videoview.a.a
            r0.<init>()
            java.lang.String r1 = r10.getBitRatedRatioUri()
            r0.f77753c = r1
            java.util.List r1 = r10.getUrlList()
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.List r2 = r10.getUrlList()
            r2.toArray(r1)
            com.ss.android.ugc.playerkit.c.a r2 = com.ss.android.ugc.playerkit.c.a.r()
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x002a
            java.lang.String[] r1 = a(r1)
        L_0x002a:
            com.ss.android.ugc.playerkit.c.a r2 = com.ss.android.ugc.playerkit.c.a.r()
            boolean r2 = r2.k()
            r3 = 0
            if (r2 == 0) goto L_0x008a
            com.ss.android.ugc.playerkit.videoview.c r2 = com.ss.android.ugc.playerkit.videoview.c.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.a r2 = r2.getBitrateManager()
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r2 = r2.a(r10)
            if (r2 == 0) goto L_0x008a
            java.util.List r4 = r2.urlList()
            if (r4 == 0) goto L_0x008a
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x008a
            int r5 = r2.isH265()
            if (r5 != 0) goto L_0x005d
            java.lang.String[] r11 = new java.lang.String[r3]
            java.lang.Object[] r11 = r4.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
        L_0x005b:
            r1 = 0
            goto L_0x0081
        L_0x005d:
            com.ss.android.ugc.playerkit.c.c$a r5 = com.ss.android.ugc.playerkit.c.c.a.TT
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x006d
            com.ss.android.ugc.playerkit.c.c$a r5 = com.ss.android.ugc.playerkit.c.c.a.TT_HARDWARE
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L_0x007f
        L_0x006d:
            if (r12 != 0) goto L_0x007f
            java.lang.String[] r11 = new java.lang.String[r3]
            java.lang.Object[] r11 = r4.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            int r12 = r2.isH265()
            r1 = 1
            if (r12 != r1) goto L_0x005b
            goto L_0x0081
        L_0x007f:
            r11 = r1
            goto L_0x005b
        L_0x0081:
            java.lang.String r12 = r2.getUrlKey()
            r0.f77753c = r12
            r0.f77754d = r2
            goto L_0x008c
        L_0x008a:
            r11 = r1
            r1 = 0
        L_0x008c:
            com.ss.android.ugc.playerkit.c.a r12 = com.ss.android.ugc.playerkit.c.a.r()
            boolean r12 = r12.j()
            if (r12 == 0) goto L_0x00ab
            r12 = 0
        L_0x0097:
            int r2 = r11.length
            if (r12 >= r2) goto L_0x00ab
            com.ss.android.ugc.playerkit.videoview.c r2 = com.ss.android.ugc.playerkit.videoview.c.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.b r2 = r2.getHttpsHelper()
            r4 = r11[r12]
            java.lang.String r2 = r2.a(r4)
            r11[r12] = r2
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00ab:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r2 = 0
        L_0x00b1:
            int r4 = r11.length
            if (r2 >= r4) goto L_0x00ed
            r4 = r11[r2]
            if (r4 == 0) goto L_0x00ea
            r4 = r11[r2]
            java.lang.String r5 = "aweme/v1/play"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00d6
            com.ss.android.ugc.playerkit.videoview.c r4 = com.ss.android.ugc.playerkit.videoview.c.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.f r4 = r4.getPlayUrlBuilder()
            r5 = r11[r2]
            com.ss.android.common.util.i r4 = r4.a(r5)
            java.lang.String r4 = r4.a()
            r12.add(r4)
            goto L_0x00ea
        L_0x00d6:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.getCreateTime()
            long r4 = r4 - r6
            long r6 = r9.f77771a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ea
            r4 = r11[r2]
            r12.add(r4)
        L_0x00ea:
            int r2 = r2 + 1
            goto L_0x00b1
        L_0x00ed:
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.Object[] r10 = r12.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            r0.f77751a = r10
            r0.f77752b = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.videoview.d.i.b(com.ss.android.ugc.aweme.feed.model.VideoUrlModel, com.ss.android.ugc.playerkit.c.c$a, boolean):com.ss.android.ugc.playerkit.videoview.a.a");
    }
}
