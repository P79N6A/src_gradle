package com.ss.android.ugc.aweme.video.e;

import com.meituan.robust.ChangeQuickRedirect;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76057a;

    /* JADX WARNING: Removed duplicated region for block: B:101:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x031b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.player.sdk.api.IPlayer a(com.ss.android.ugc.playerkit.c.c.a r18, boolean r19) {
        /*
            r0 = r18
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Byte r3 = java.lang.Byte.valueOf(r9)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f76057a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.playerkit.c.c$a> r3 = com.ss.android.ugc.playerkit.c.c.a.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer> r8 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.class
            r3 = 0
            r5 = 1
            r6 = 89332(0x15cf4, float:1.25181E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004e
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r9)
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f76057a
            r14 = 1
            r15 = 89332(0x15cf4, float:1.25181E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.playerkit.c.c$a> r1 = com.ss.android.ugc.playerkit.c.c.a.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer> r17 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer r0 = (com.ss.android.ugc.aweme.player.sdk.api.IPlayer) r0
            return r0
        L_0x004e:
            com.ss.android.ugc.playerkit.c.c r2 = new com.ss.android.ugc.playerkit.c.c
            r2.<init>()
            r2.f77713b = r0
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()
            r2.f77712a = r3
            com.ss.android.ugc.playerkit.c.c$a r3 = com.ss.android.ugc.playerkit.c.c.a.Ijk
            if (r0 == r3) goto L_0x0342
            com.ss.android.ugc.playerkit.c.c$a r3 = com.ss.android.ugc.playerkit.c.c.a.IjkHardware
            if (r0 != r3) goto L_0x0065
            goto L_0x0342
        L_0x0065:
            com.ss.android.ugc.playerkit.c.c$a r3 = com.ss.android.ugc.playerkit.c.c.a.TT
            r4 = 15
            if (r0 == r3) goto L_0x0094
            com.ss.android.ugc.playerkit.c.c$a r3 = com.ss.android.ugc.playerkit.c.c.a.TT_IJK_ENGINE
            if (r0 == r3) goto L_0x0094
            com.ss.android.ugc.playerkit.c.c$a r3 = com.ss.android.ugc.playerkit.c.c.a.TT_HARDWARE
            if (r0 != r3) goto L_0x0074
            goto L_0x0094
        L_0x0074:
            com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.LIVE
            if (r0 != r1) goto L_0x0346
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1 = 38
            r0.append(r1, r9)
            r1 = 87
            r0.append(r1, r10)
            r0.append(r4, r10)
            r1 = 36
            r0.append(r1, r10)
            r2.a(r0)
            goto L_0x0346
        L_0x0094:
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            r3.put(r10, r9)
            com.ss.android.ugc.aweme.player.ab.PlayerTypeAbConfig r5 = com.ss.android.ugc.aweme.video.h.a()
            if (r5 == 0) goto L_0x00b0
            r6 = 17
            int r7 = r5.f59104c
            r3.put(r6, r7)
            r6 = 16
            int r5 = r5.f59103b
            r3.put(r6, r5)
        L_0x00b0:
            boolean r5 = com.ss.android.g.a.c()
            r6 = 10
            if (r5 != 0) goto L_0x00bf
            com.ss.android.ugc.playerkit.c.c$a r5 = com.ss.android.ugc.playerkit.c.c.a.TT_IJK_ENGINE
            if (r0 != r5) goto L_0x00bf
            r3.put(r9, r6)
        L_0x00bf:
            r3.put(r1, r10)
            r0 = 19
            com.ss.android.ugc.aweme.setting.AbTestManager r5 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r5 = r5.d()
            int r5 = r5.ttplayerHardwareMediaRenderType
            r3.put(r0, r5)
            boolean r0 = com.ss.android.g.a.c()
            if (r0 != 0) goto L_0x00f0
            r0 = 1000(0x3e8, float:1.401E-42)
            com.ss.android.ugc.aweme.app.x r5 = com.ss.android.ugc.aweme.app.x.a()     // Catch:{ Exception -> 0x00ec }
            com.ss.android.ugc.aweme.app.an r5 = r5.S()     // Catch:{ Exception -> 0x00ec }
            java.lang.Object r5 = r5.c()     // Catch:{ Exception -> 0x00ec }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x00ec }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x00ec }
            r0 = r5
        L_0x00ec:
            r5 = 3
            r3.put(r5, r0)
        L_0x00f0:
            boolean r0 = com.ss.android.g.a.a()
            r5 = 5000(0x1388, float:7.006E-42)
            r7 = 4
            if (r0 == 0) goto L_0x00ff
            r3.put(r7, r5)
        L_0x00fc:
            r0 = 1
            goto L_0x017a
        L_0x00ff:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71884(0x118cc, float:1.00731E-40)
            java.lang.Class[] r8 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r8
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r8 == 0) goto L_0x0132
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71884(0x118cc, float:1.00731E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            goto L_0x013b
        L_0x0132:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 != 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            int r5 = r0.playerMaxBufferTimeMS
        L_0x013b:
            r3.put(r7, r5)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71885(0x118cd, float:1.00732E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x0171
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71885(0x118cd, float:1.00732E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x017a
        L_0x0171:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 != 0) goto L_0x0178
            goto L_0x00fc
        L_0x0178:
            int r0 = r0.enablePlayerLog
        L_0x017a:
            r5 = 5
            r3.put(r5, r0)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.ai()
            if (r0 != r1) goto L_0x018a
            r0 = 1
            goto L_0x018b
        L_0x018a:
            r0 = 0
        L_0x018b:
            r3.put(r4, r0)
            boolean r0 = com.ss.android.ugc.aweme.player.c.f59109a
            if (r0 == 0) goto L_0x0196
            r0 = 6
            r3.put(r0, r10)
        L_0x0196:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getEableUltraResolution()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.isInUltraResBlackList()
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r0 == 0) goto L_0x02a3
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02a3
            if (r1 == 0) goto L_0x02a3
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x02a3
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x02a3
            r0 = 7
            r3.put(r0, r10)
            r0 = 8
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getUltraResolutionLevel()
            java.lang.Object r1 = r1.c()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.put(r0, r1)
            r0 = 9
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getEnableAntiAliasing()
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3.put(r0, r1)
            r0 = 12
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r1 = r1.bo()
            r3.put(r0, r1)
            r0 = 11
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r1 = r1.bn()
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.bm()
            r3.put(r6, r0)
            r0 = 13
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71947(0x1190b, float:1.00819E-40)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r1
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0254
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71947(0x1190b, float:1.00819E-40)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r1
            r16 = r4
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x025e
        L_0x0254:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r1.d()
            if (r1 != 0) goto L_0x025c
            r1 = 0
            goto L_0x025e
        L_0x025c:
            int r1 = r1.superResCpuNums
        L_0x025e:
            r3.put(r0, r1)
            r0 = 14
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71948(0x1190c, float:1.0082E-40)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r1
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0296
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71948(0x1190c, float:1.0082E-40)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r1
            r16 = r4
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x02a0
        L_0x0296:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r1.d()
            if (r1 != 0) goto L_0x029e
            r1 = 0
            goto L_0x02a0
        L_0x029e:
            int r1 = r1.superResCpuFrequency
        L_0x02a0:
            r3.put(r0, r1)
        L_0x02a3:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71901(0x118dd, float:1.00755E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x02d6
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71901(0x118dd, float:1.00755E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x02e3
        L_0x02d6:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 == 0) goto L_0x02e2
            int r0 = r0.ttplayerIsIPC
            if (r0 != r10) goto L_0x02e2
            r0 = 1
            goto L_0x02e3
        L_0x02e2:
            r0 = 0
        L_0x02e3:
            if (r0 == 0) goto L_0x02e8
            r3.put(r9, r10)
        L_0x02e8:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71902(0x118de, float:1.00756E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x031b
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71902(0x118de, float:1.00756E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0328
        L_0x031b:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 == 0) goto L_0x0327
            int r0 = r0.ttplayerUseSysAudioCodec
            if (r0 != r10) goto L_0x0327
            r0 = 1
            goto L_0x0328
        L_0x0327:
            r0 = 0
        L_0x0328:
            if (r0 == 0) goto L_0x032f
            r0 = 18
            r3.put(r0, r10)
        L_0x032f:
            r0 = 20
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r1.d()
            int r1 = r1.playerCodecSyncMode
            r3.put(r0, r1)
            r2.a(r3)
            goto L_0x0346
        L_0x0342:
            com.ss.android.ugc.playerkit.a.b r0 = com.ss.android.ugc.aweme.video.e.e.f76059b
            r2.f77715d = r0
        L_0x0346:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.player.sdk.a.a.f59112a
            r14 = 1
            r15 = 64224(0xfae0, float:8.9997E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.playerkit.c.c> r1 = com.ss.android.ugc.playerkit.c.c.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer> r17 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.class
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x037d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.player.sdk.a.a.f59112a
            r14 = 1
            r15 = 64224(0xfae0, float:8.9997E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.playerkit.c.c> r1 = com.ss.android.ugc.playerkit.c.c.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer> r17 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer r0 = (com.ss.android.ugc.aweme.player.sdk.api.IPlayer) r0
            return r0
        L_0x037d:
            com.ss.android.ugc.playerkit.c.c$a r0 = r2.f77713b
            com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.Ijk
            if (r0 != r1) goto L_0x038d
            com.ss.android.ugc.aweme.player.sdk.b.b r0 = new com.ss.android.ugc.aweme.player.sdk.b.b
            android.content.Context r1 = r2.f77712a
            com.ss.android.ugc.playerkit.a.b r2 = r2.f77715d
            r0.<init>(r1, r9, r2)
            return r0
        L_0x038d:
            com.ss.android.ugc.playerkit.c.c$a r0 = r2.f77713b
            com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.IjkHardware
            if (r0 != r1) goto L_0x039d
            com.ss.android.ugc.aweme.player.sdk.b.b r0 = new com.ss.android.ugc.aweme.player.sdk.b.b
            android.content.Context r1 = r2.f77712a
            com.ss.android.ugc.playerkit.a.b r2 = r2.f77715d
            r0.<init>(r1, r10, r2)
            return r0
        L_0x039d:
            com.ss.android.ugc.playerkit.c.c$a r0 = r2.f77713b
            com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.TT
            if (r0 == r1) goto L_0x03d4
            com.ss.android.ugc.playerkit.c.c$a r0 = r2.f77713b
            com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.TT_IJK_ENGINE
            if (r0 != r1) goto L_0x03aa
            goto L_0x03d4
        L_0x03aa:
            com.ss.android.ugc.playerkit.c.c$a r0 = r2.f77713b
            com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.TT_HARDWARE
            if (r0 != r1) goto L_0x03ba
            com.ss.android.ugc.aweme.player.sdk.b.f r0 = new com.ss.android.ugc.aweme.player.sdk.b.f
            android.content.Context r1 = r2.f77712a
            android.util.SparseIntArray r2 = r2.f77717f
            r0.<init>(r1, r10, r2)
            return r0
        L_0x03ba:
            com.ss.android.ugc.playerkit.c.c$a r0 = r2.f77713b
            com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.LIVE
            if (r0 != r1) goto L_0x03cc
            com.ss.android.ugc.aweme.player.sdk.b.c r0 = new com.ss.android.ugc.aweme.player.sdk.b.c
            android.content.Context r1 = r2.f77712a
            android.util.SparseIntArray r3 = r2.f77717f
            com.ss.android.ugc.playerkit.a.c r2 = r2.f77716e
            r0.<init>(r1, r3, r2)
            return r0
        L_0x03cc:
            com.ss.android.ugc.aweme.player.sdk.b.f r0 = new com.ss.android.ugc.aweme.player.sdk.b.f
            android.content.Context r1 = r2.f77712a
            r0.<init>(r1)
            return r0
        L_0x03d4:
            com.ss.android.ugc.aweme.player.sdk.b.f r0 = new com.ss.android.ugc.aweme.player.sdk.b.f
            android.content.Context r1 = r2.f77712a
            boolean r3 = r2.f77714c
            android.util.SparseIntArray r2 = r2.f77717f
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.e.d.a(com.ss.android.ugc.playerkit.c.c$a, boolean):com.ss.android.ugc.aweme.player.sdk.api.IPlayer");
    }
}
