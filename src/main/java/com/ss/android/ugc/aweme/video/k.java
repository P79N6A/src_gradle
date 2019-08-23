package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.playerkit.videoview.d.a;

public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76119a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f76120b = new k();

    private k() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.lib.video.bitrate.regulator.a.c a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel r26) {
        /*
            r25 = this;
            r0 = r26
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f76119a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r3 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.c> r8 = com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class
            r5 = 0
            r6 = 88936(0x15b68, float:1.24626E-40)
            r3 = r25
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f76119a
            r13 = 0
            r14 = 88936(0x15b68, float:1.24626E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r0 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.c> r16 = com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class
            r11 = r25
        L_0x0032:
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r0 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) r0
            return r0
        L_0x0039:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r0
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.video.bitrate.a.f76015a
            r5 = 1
            r6 = 89072(0x15bf0, float:1.24816E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r8 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r7[r9] = r8
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.c> r8 = com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0066
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.video.bitrate.a.f76015a
            r13 = 1
            r14 = 89072(0x15bf0, float:1.24816E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r0 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.c> r16 = com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class
            goto L_0x0032
        L_0x0066:
            r2 = 0
            if (r0 != 0) goto L_0x006a
            return r2
        L_0x006a:
            com.ss.android.ugc.aweme.commercialize.splash.a r3 = com.ss.android.ugc.aweme.commercialize.splash.a.a()
            java.lang.String r4 = r26.getSourceId()
            java.lang.String r3 = r3.a((java.lang.String) r4)
            if (r3 == 0) goto L_0x0079
            return r2
        L_0x0079:
            java.util.List r3 = r26.getBitRate()
            if (r3 == 0) goto L_0x0232
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0087
            goto L_0x0232
        L_0x0087:
            android.content.Context r4 = com.ss.android.ugc.aweme.base.utils.d.a()
            com.ss.android.ugc.aweme.video.VideoBitRateABManager r5 = com.ss.android.ugc.aweme.video.VideoBitRateABManager.a()
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x0227
            com.ss.android.ugc.playerkit.videoview.c.a r5 = com.ss.android.ugc.playerkit.videoview.c.a.a()
            java.lang.String r6 = r26.getUrlKey()
            com.ss.android.ugc.playerkit.videoview.b.b r7 = r5.f77760b
            com.ss.android.ugc.playerkit.session.b r5 = r5.c(r6)
            com.ss.android.ugc.lib.video.bitrate.regulator.b.e r5 = r7.a(r5)
            if (r5 != 0) goto L_0x00aa
            return r2
        L_0x00aa:
            com.ss.android.ugc.c.b r6 = com.ss.android.ugc.c.b.a()
            double r6 = r6.b()
            int r6 = (int) r6
            com.ss.android.ugc.aweme.setting.AbTestManager r7 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r7 = r7.d()
            boolean r7 = r7.isRecordLastNetworkSpeedEnabled
            r10 = 0
            if (r7 == 0) goto L_0x00e9
            double r7 = (double) r6
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x00e7
            int r6 = com.ss.android.ugc.aweme.video.bitrate.a.f76016b
            if (r6 <= 0) goto L_0x00cd
            int r6 = com.ss.android.ugc.aweme.video.bitrate.a.f76016b
            goto L_0x00df
        L_0x00cd:
            com.ss.android.ugc.aweme.app.SharePrefCache r6 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r6 = r6.getLastUsableNetworkSpeed()
            java.lang.Object r6 = r6.c()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L_0x00df:
            com.ss.android.ugc.c.b r7 = com.ss.android.ugc.c.b.a()
            double r12 = (double) r6
            r7.f77192a = r12
            goto L_0x00e9
        L_0x00e7:
            com.ss.android.ugc.aweme.video.bitrate.a.f76016b = r6
        L_0x00e9:
            double r7 = (double) r6
            java.util.Map r4 = com.ss.android.ugc.aweme.video.bitrate.a.a(r4, r0, r7, r5)
            com.ss.android.ugc.lib.video.bitrate.regulator.a.f r4 = r5.a(r3, r4)
            if (r4 != 0) goto L_0x00f5
            return r2
        L_0x00f5:
            com.ss.android.ugc.aweme.video.bitrate.a.a(r4, r0)
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r5 = r4.f77678b
            if (r5 == 0) goto L_0x0228
            com.ss.android.ugc.aweme.feed.model.BitRate[] r12 = new com.ss.android.ugc.aweme.feed.model.BitRate[r9]
            java.lang.Object[] r3 = r3.toArray(r12)
            com.ss.android.ugc.aweme.feed.model.BitRate[] r3 = (com.ss.android.ugc.aweme.feed.model.BitRate[]) r3
            java.util.Comparator r12 = com.ss.android.ugc.aweme.video.bitrate.b.f76018b
            java.util.Arrays.sort(r3, r12)
            com.ss.android.ugc.aweme.video.preload.g r12 = com.ss.android.ugc.aweme.video.preload.g.f()
            com.ss.android.ugc.aweme.video.preload.b r12 = r12.h()
            if (r12 == 0) goto L_0x01fe
            com.ss.android.ugc.aweme.setting.AbTestManager r20 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r13 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r16 = 0
            r17 = 71979(0x1192b, float:1.00864E-40)
            java.lang.Class[] r14 = new java.lang.Class[r9]
            java.lang.Class r19 = java.lang.Double.TYPE
            r18 = r14
            r14 = r20
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r13 == 0) goto L_0x014a
            java.lang.Object[] r13 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r16 = 0
            r17 = 71979(0x1192b, float:1.00864E-40)
            java.lang.Class[] r14 = new java.lang.Class[r9]
            java.lang.Class r19 = java.lang.Double.TYPE
            r18 = r14
            r14 = r20
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Double r13 = (java.lang.Double) r13
            double r13 = r13.doubleValue()
            goto L_0x0155
        L_0x014a:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r13 = r20.d()
            if (r13 != 0) goto L_0x0153
            r13 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            goto L_0x0155
        L_0x0153:
            double r13 = r13.bitrateSwitchThreshold
        L_0x0155:
            int r15 = r3.length
            r1 = 0
        L_0x0157:
            if (r1 >= r15) goto L_0x01fe
            r16 = r3[r1]
            int r9 = r16.getBitRate()
            int r2 = r5.getBitRate()
            if (r9 == r2) goto L_0x01e8
            java.lang.String r2 = r16.getUrlKey()
            long r10 = r12.a((java.lang.String) r2)
            r17 = 0
            int r2 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x01df
            java.lang.String r2 = r16.getUrlKey()
            r21 = r3
            long r2 = r12.b((java.lang.String) r2)
            r22 = r1
            long r0 = r2 - r10
            double r0 = (double) r0
            if (r6 <= 0) goto L_0x01bc
            int r9 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x01bc
            double r17 = r26.getDuration()
            r19 = 0
            int r9 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r9 <= 0) goto L_0x01b9
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r7)
            double r0 = r0 / r7
            r23 = r7
            double r7 = (double) r10
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r13
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r7 = r7 / r2
            double r2 = r26.getDuration()
            r17 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r17
            double r7 = r7 * r2
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x01c0
            r0 = 1
            goto L_0x01c1
        L_0x01b9:
            r23 = r7
            goto L_0x01c0
        L_0x01bc:
            r23 = r7
            r19 = 0
        L_0x01c0:
            r0 = 0
        L_0x01c1:
            int r1 = r16.getBitRate()
            int r2 = r5.getBitRate()
            if (r1 <= r2) goto L_0x01da
            java.lang.String r1 = r16.getUrlKey()
            long r1 = r12.b((java.lang.String) r1)
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x01dc
            if (r0 == 0) goto L_0x01f0
            goto L_0x01dc
        L_0x01da:
            if (r0 == 0) goto L_0x01f0
        L_0x01dc:
            r5 = r16
            goto L_0x01fe
        L_0x01df:
            r22 = r1
            r21 = r3
            r23 = r7
            r19 = 0
            goto L_0x01f0
        L_0x01e8:
            r22 = r1
            r21 = r3
            r23 = r7
            r19 = r10
        L_0x01f0:
            int r1 = r22 + 1
            r10 = r19
            r3 = r21
            r7 = r23
            r0 = r26
            r2 = 0
            r9 = 0
            goto L_0x0157
        L_0x01fe:
            r4.f77678b = r5
            r0 = r26
            r0.setHitBitrate(r4)
            com.ss.android.ugc.playerkit.session.a r1 = com.ss.android.ugc.playerkit.session.a.a()
            java.lang.String r2 = r26.getUri()
            com.ss.android.ugc.playerkit.session.Session r1 = r1.b(r2)
            if (r1 == 0) goto L_0x0228
            java.lang.String r0 = r26.getSourceId()
            r1.sourceId = r0
            float r0 = (float) r6
            r1.speed = r0
            int r0 = r5.getBitRate()
            r1.bitrate = r0
            double r2 = r4.f77681e
            r1.calcBitrate = r2
            goto L_0x0228
        L_0x0227:
            r4 = 0
        L_0x0228:
            if (r4 == 0) goto L_0x0230
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r0 = r4.f77678b
            if (r0 != 0) goto L_0x022f
            goto L_0x0230
        L_0x022f:
            return r4
        L_0x0230:
            r0 = 0
            return r0
        L_0x0232:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.k.a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel):com.ss.android.ugc.lib.video.bitrate.regulator.a.c");
    }
}
