package com.ss.android.ugc.aweme.similarvideo.ui;

import android.app.Activity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class SimilarVideoActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71522a;

    /* renamed from: b  reason: collision with root package name */
    public static Aweme f71523b;

    /* renamed from: c  reason: collision with root package name */
    public static Activity f71524c;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f71522a, false, 81630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71522a, false, 81630, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71522a, false, 81631, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71522a, false, 81631, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f71522a, false, 81627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71522a, false, 81627, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f71522a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 81626(0x13eda, float:1.14382E-40)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f71522a
            r3 = 0
            r4 = 81626(0x13eda, float:1.14382E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r18)
            r0 = 2131689646(0x7f0f00ae, float:1.9008313E38)
            r7.setContentView((int) r0)
            android.content.Intent r0 = r17.getIntent()
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = "aweme_to_similar"
            boolean r1 = r0.hasExtra(r1)
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "aweme_to_similar"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            f71523b = r0
        L_0x005e:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71522a
            r3 = 0
            r4 = 81628(0x13edc, float:1.14385E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0085
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71522a
            r3 = 0
            r4 = 81628(0x13edc, float:1.14385E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x013a
        L_0x0085:
            r0 = 2131170096(0x7f071330, float:1.795454E38)
            android.view.View r0 = r7.findViewById(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L_0x009c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r1 = com.bytedance.ies.uikit.statusbar.StatusBarUtils.getStatusBarHeight(r17)
            r0.height = r1
        L_0x009c:
            r0 = 2131167528(0x7f070928, float:1.7949332E38)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity$1 r1 = new com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity$1
            r1.<init>()
            r0.setOnClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71522a
            r3 = 0
            r4 = 81629(0x13edd, float:1.14387E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f71522a
            r3 = 0
            r4 = 81629(0x13edd, float:1.14387E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x013a
        L_0x00d1:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = f71523b
            r1 = 0
            if (r0 != 0) goto L_0x00d8
            r0 = r1
            goto L_0x00de
        L_0x00d8:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = f71523b
            java.lang.String r0 = r0.getAid()
        L_0x00de:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment.f71529a
            r13 = 1
            r14 = 81636(0x13ee4, float:1.14396E-40)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment> r16 = com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment.class
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0114
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment.f71529a
            r13 = 1
            r14 = 81636(0x13ee4, float:1.14396E-40)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment> r16 = com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment.class
            r15 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r1 = r0
            com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment r1 = (com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment) r1
            goto L_0x011e
        L_0x0114:
            if (r0 != 0) goto L_0x0117
            goto L_0x011e
        L_0x0117:
            com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment.f71530b = r0
            com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment r1 = new com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment
            r1.<init>()
        L_0x011e:
            if (r1 == 0) goto L_0x013a
            com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity$2 r0 = new com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity$2
            r0.<init>()
            r1.f71531c = r0
            android.support.v4.app.FragmentManager r0 = r17.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r2 = 2131169969(0x7f0712b1, float:1.7954283E38)
            java.lang.String r3 = "similar_video_contain"
            r0.replace(r2, r1, r3)
            r0.commitAllowingStateLoss()
        L_0x013a:
            java.lang.String r0 = "com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity.onCreate(android.os.Bundle):void");
    }
}
