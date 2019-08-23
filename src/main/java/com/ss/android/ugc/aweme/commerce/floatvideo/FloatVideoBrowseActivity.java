package com.ss.android.ugc.aweme.commerce.floatvideo;

import android.app.Activity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.commerce.floatvideo.f;
import kotlin.jvm.internal.Intrinsics;

public class FloatVideoBrowseActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36894a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f36895b = FloatVideoBrowseActivity.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private FloatVideoBrowsePresenter f36896c;

    /* renamed from: d  reason: collision with root package name */
    private ImmersionBar f36897d;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36894a, false, 28170, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36894a, false, 28170, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f36894a, false, 28169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36894a, false, 28169, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f36894a, false, 28165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36894a, false, 28165, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f36897d != null) {
            this.f36897d.destroy();
        }
        if (this.f36896c != null) {
            this.f36896c.a();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f36894a, false, 28167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36894a, false, 28167, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.f36896c.c();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f36894a, false, 28166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36894a, false, 28166, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowseActivity", "onResume", true);
        super.onResume();
        this.f36896c.b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowseActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f36894a, false, 28163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36894a, false, 28163, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        this.f36897d = ImmersionBar.with((Activity) this);
        this.f36897d.statusBarDarkFont(true).init();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f36894a, false, 28168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36894a, false, 28168, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        if (PatchProxy.isSupport(new Object[]{this}, null, f.f36918a, true, 28194, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, f.f36918a, true, 28194, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        f.a aVar = f.f36921d;
        if (PatchProxy.isSupport(new Object[]{this}, aVar, f.a.f36922a, false, 28198, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, aVar, f.a.f36922a, false, 28198, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(this, "act");
        f.f36919b.remove(getIntent().getStringExtra("KEY_HASH_CODE"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r7 = r23
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r24
            com.meituan.robust.ChangeQuickRedirect r2 = f36894a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28164(0x6e04, float:3.9466E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r24
            com.meituan.robust.ChangeQuickRedirect r2 = f36894a
            r3 = 0
            r4 = 28164(0x6e04, float:3.9466E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowseActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r24)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.floatvideo.f.f36918a
            r13 = 1
            r14 = 28193(0x6e21, float:3.9507E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commerce.floatvideo.g> r16 = com.ss.android.ugc.aweme.commerce.floatvideo.g.class
            r15 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.floatvideo.f.f36918a
            r13 = 1
            r14 = 28193(0x6e21, float:3.9507E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commerce.floatvideo.g> r16 = com.ss.android.ugc.aweme.commerce.floatvideo.g.class
            r15 = r0
        L_0x006a:
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.commerce.floatvideo.g r0 = (com.ss.android.ugc.aweme.commerce.floatvideo.g) r0
            goto L_0x00b7
        L_0x0071:
            com.ss.android.ugc.aweme.commerce.floatvideo.f$a r0 = com.ss.android.ugc.aweme.commerce.floatvideo.f.f36921d
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.floatvideo.f.a.f36922a
            r13 = 0
            r14 = 28197(0x6e25, float:3.9512E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commerce.floatvideo.g> r16 = com.ss.android.ugc.aweme.commerce.floatvideo.g.class
            r11 = r0
            r15 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x00a0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.floatvideo.f.a.f36922a
            r13 = 0
            r14 = 28197(0x6e25, float:3.9512E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commerce.floatvideo.g> r16 = com.ss.android.ugc.aweme.commerce.floatvideo.g.class
            r11 = r0
            r15 = r1
            goto L_0x006a
        L_0x00a0:
            java.lang.String r0 = "act"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commerce.floatvideo.g> r0 = com.ss.android.ugc.aweme.commerce.floatvideo.f.f36919b
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r2 = "KEY_HASH_CODE"
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.commerce.floatvideo.g r0 = (com.ss.android.ugc.aweme.commerce.floatvideo.g) r0
        L_0x00b7:
            if (r0 != 0) goto L_0x00c4
            r23.finish()
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowseActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        L_0x00c4:
            r1 = 2131690553(0x7f0f0439, float:1.9010153E38)
            r7.setContentView((int) r1)
            r1 = 2131171393(0x7f071841, float:1.7957171E38)
            android.view.View r1 = r7.findViewById(r1)
            r14 = r1
            com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView r14 = (com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView) r14
            r1 = 2131168759(0x7f070df7, float:1.7951829E38)
            android.view.View r15 = r7.findViewById(r1)
            com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter r1 = new com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter
            com.ss.android.ugc.aweme.video.o r11 = r0.f36924b
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r0.f36925c
            com.ss.android.ugc.aweme.longvideo.b.e r13 = new com.ss.android.ugc.aweme.longvideo.b.e
            r0 = 180(0xb4, float:2.52E-43)
            r2 = 240(0xf0, float:3.36E-43)
            r13.<init>(r0, r2)
            r16 = 2
            r17 = 0
            java.lang.String r18 = ""
            r19 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r20 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 0
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r7, r0)
            int r0 = (int) r0
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter.f36898a
            r19 = 0
            r20 = 28185(0x6e19, float:3.9496E-41)
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r9] = r4
            java.lang.Class<com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter> r22 = com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter.class
            r16 = r2
            r17 = r1
            r21 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r2 == 0) goto L_0x0144
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter.f36898a
            r19 = 0
            r20 = 28185(0x6e19, float:3.9496E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r0[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter> r22 = com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter.class
            r16 = r2
            r17 = r1
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            r1 = r0
            com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter r1 = (com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter) r1
            goto L_0x014e
        L_0x0144:
            android.view.View r2 = r1.f36901d
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.bottomMargin = r0
        L_0x014e:
            r7.f36896c = r1
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowseActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowseActivity.onCreate(android.os.Bundle):void");
    }
}
