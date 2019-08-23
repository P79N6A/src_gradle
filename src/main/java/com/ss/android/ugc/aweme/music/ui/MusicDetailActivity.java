package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.content.Intent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ae.c;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;

@AddPageTrace
public class MusicDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f56462b;

    /* renamed from: c  reason: collision with root package name */
    private String f56463c;

    /* renamed from: d  reason: collision with root package name */
    private String f56464d;

    /* renamed from: e  reason: collision with root package name */
    private String f56465e;

    /* renamed from: f  reason: collision with root package name */
    private String f56466f;
    private String g;

    public final boolean b() {
        return true;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f56462b, false, 60163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56462b, false, 60163, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56462b, false, 60164, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56462b, false, 60164, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f56462b, false, 60162, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56462b, false, 60162, new Class[0], Void.TYPE);
            return;
        }
        c.a(this);
        super.finish();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f56462b, false, 60159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56462b, false, 60159, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public Analysis getAnalysis() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f56462b, false, 60161, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f56462b, false, 60161, new Class[0], Analysis.class);
        }
        long j2 = 0;
        try {
            j = Long.parseLong(this.f56465e);
            try {
                j2 = Long.parseLong(this.f56463c);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        return new Analysis().setLabelName("single_song").setExt_value(j).setValue(j2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r7 = r26
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r27
            com.meituan.robust.ChangeQuickRedirect r2 = f56462b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 60158(0xeafe, float:8.43E-41)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r27
            com.meituan.robust.ChangeQuickRedirect r2 = f56462b
            r3 = 0
            r4 = 60158(0xeafe, float:8.43E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r27)
            r0 = 2131689536(0x7f0f0040, float:1.900809E38)
            r7.setContentView((int) r0)
            r8 = 2131166114(0x7f0703a2, float:1.7946464E38)
            android.view.View r0 = r7.findViewById(r8)
            android.content.res.Resources r1 = r26.getResources()
            r2 = 2131624999(0x7f0e0427, float:1.8877194E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
            com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.disableStartActivityIfNeeded(r26)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f56462b
            r3 = 0
            r4 = 60160(0xeb00, float:8.4302E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0085
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f56462b
            r3 = 0
            r4 = 60160(0xeb00, float:8.4302E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x033f
        L_0x0085:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.filter.ar r0 = r0.getFilterService()
            r0.refreshData()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            r1 = 2131170096(0x7f071330, float:1.795454E38)
            android.view.View r1 = r7.findViewById(r1)
            r0.setStatusBar(r7, r1)
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "partnerName"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.f56466f = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "partnerMusicId"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.g = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.f56465e = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "aweme_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.f56463c = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "extra_music_from"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.f56464d = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "sticker_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r26.getIntent()
            java.lang.String r2 = "from_token"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r26.getIntent()
            java.lang.String r3 = "click_reason"
            int r2 = r2.getIntExtra(r3, r10)
            java.lang.String r3 = r7.f56465e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x011d
            java.lang.String r3 = r7.g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x011d
            r26.finish()
            goto L_0x033f
        L_0x011d:
            android.support.v4.app.FragmentManager r3 = r26.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r4 = r3.beginTransaction()
            java.lang.String r5 = "music_detail_fragment_tag"
            android.support.v4.app.Fragment r3 = r3.findFragmentByTag(r5)
            if (r3 != 0) goto L_0x0331
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r15 = 0
            r16 = 71666(0x117f2, float:1.00425E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r3
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x0160
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r15 = 0
            r16 = 71666(0x117f2, float:1.00425E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r3
            r17 = r5
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x016d
        L_0x0160:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()
            if (r3 == 0) goto L_0x016c
            int r3 = r3.isNewMusicDetail
            if (r3 != r9) goto L_0x016c
            r3 = 1
            goto L_0x016d
        L_0x016c:
            r3 = 0
        L_0x016d:
            r12 = 2
            r13 = 3
            if (r3 == 0) goto L_0x0269
            java.lang.String r3 = r7.f56465e
            java.lang.String r14 = r7.f56463c
            java.lang.String r15 = r7.f56464d
            java.lang.String r8 = r7.g
            java.lang.String r5 = r7.f56466f
            r6 = 8
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r3
            r11[r9] = r14
            r11[r12] = r15
            r11[r13] = r0
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            r17 = 4
            r11[r17] = r16
            r16 = 5
            r11[r16] = r1
            r16 = 6
            r11[r16] = r8
            r16 = 7
            r11[r16] = r5
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragment.f3621f
            r22 = 1
            r23 = 60165(0xeb05, float:8.4309E-41)
            java.lang.Class[] r13 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r13[r10] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r13[r9] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r13[r12] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r18 = 3
            r13[r18] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r18 = 4
            r13[r18] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r18 = 5
            r13[r18] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r18 = 6
            r13[r18] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r13[r16] = r17
            java.lang.Class<com.ss.android.ugc.aweme.music.ui.MusicDetailFragment> r25 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragment.class
            r19 = r11
            r24 = r13
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r11 == 0) goto L_0x0232
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r3
            r11[r9] = r14
            r11[r12] = r15
            r3 = 3
            r11[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 4
            r11[r2] = r0
            r0 = 5
            r11[r0] = r1
            r0 = 6
            r11[r0] = r8
            r11[r16] = r5
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragment.f3621f
            r22 = 1
            r23 = 60165(0xeb05, float:8.4309E-41)
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 3
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 5
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 6
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r16] = r1
            java.lang.Class<com.ss.android.ugc.aweme.music.ui.MusicDetailFragment> r25 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragment.class
            r19 = r11
            r24 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment r0 = (com.ss.android.ugc.aweme.music.ui.MusicDetailFragment) r0
        L_0x022f:
            r3 = r0
            goto L_0x0331
        L_0x0232:
            android.os.Bundle r6 = new android.os.Bundle
            r11 = 3
            r6.<init>(r11)
            java.lang.String r11 = "id"
            r6.putString(r11, r3)
            java.lang.String r3 = "partnerName"
            r6.putString(r3, r5)
            java.lang.String r3 = "partnerMusicId"
            r6.putString(r3, r8)
            java.lang.String r3 = "aweme_id"
            r6.putString(r3, r14)
            java.lang.String r3 = "sticker_id"
            r6.putString(r3, r0)
            java.lang.String r0 = "extra_music_from"
            r6.putString(r0, r15)
            java.lang.String r0 = "click_reason"
            r6.putInt(r0, r2)
            java.lang.String r0 = "from_token"
            r6.putString(r0, r1)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment r0 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment
            r0.<init>()
            r0.setArguments(r6)
            goto L_0x022f
        L_0x0269:
            java.lang.String r3 = r7.f56465e
            java.lang.String r5 = r7.f56463c
            java.lang.String r6 = r7.f56464d
            r8 = 6
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r3
            r11[r9] = r5
            r11[r12] = r6
            r8 = 3
            r11[r8] = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r13 = 4
            r11[r13] = r8
            r8 = 5
            r11[r8] = r1
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld.f3622f
            r22 = 1
            r23 = 60259(0xeb63, float:8.4441E-41)
            r8 = 6
            java.lang.Class[] r13 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r13[r10] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r13[r9] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r13[r12] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r14 = 3
            r13[r14] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r14 = 4
            r13[r14] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r14 = 5
            r13[r14] = r8
            java.lang.Class<com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld> r25 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld.class
            r19 = r11
            r24 = r13
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r8 == 0) goto L_0x0303
            r8 = 6
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r3
            r11[r9] = r5
            r11[r12] = r6
            r3 = 3
            r11[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 4
            r11[r2] = r0
            r0 = 5
            r11[r0] = r1
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld.f3622f
            r22 = 1
            r23 = 60259(0xeb63, float:8.4441E-41)
            r0 = 6
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 3
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 5
            r0[r2] = r1
            java.lang.Class<com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld> r25 = com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld.class
            r19 = r11
            r24 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld r0 = (com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld) r0
            goto L_0x022f
        L_0x0303:
            android.os.Bundle r8 = new android.os.Bundle
            r11 = 3
            r8.<init>(r11)
            java.lang.String r11 = "id"
            r8.putString(r11, r3)
            java.lang.String r3 = "aweme_id"
            r8.putString(r3, r5)
            java.lang.String r3 = "extra_music_from"
            r8.putString(r3, r6)
            java.lang.String r3 = "sticker_id"
            r8.putString(r3, r0)
            java.lang.String r0 = "click_reason"
            r8.putInt(r0, r2)
            java.lang.String r0 = "from_token"
            r8.putString(r0, r1)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld r0 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragmentOld
            r0.<init>()
            r0.setArguments(r8)
            goto L_0x022f
        L_0x0331:
            r3.setUserVisibleHint(r9)
            java.lang.String r0 = "music_detail_fragment_tag"
            r1 = 2131166114(0x7f0703a2, float:1.7946464E38)
            r4.replace(r1, r3, r0)
            r4.commit()
        L_0x033f:
            com.benchmark.bl.a r0 = com.benchmark.bl.a.b()
            r1 = 4
            r0.a((int) r1)
            java.lang.String r0 = "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDetailActivity.onCreate(android.os.Bundle):void");
    }

    public static void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f56462b, true, 60157, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f56462b, true, 60157, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, MusicDetailActivity.class);
        intent.putExtra("id", str3);
        intent.putExtra("extra_music_from", str4);
        context2.startActivity(intent);
    }
}
