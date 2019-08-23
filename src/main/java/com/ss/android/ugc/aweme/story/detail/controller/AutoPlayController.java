package com.ss.android.ugc.aweme.story.detail.controller;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.player.c;
import com.ss.android.ugc.aweme.video.a.a;

public class AutoPlayController extends LifecycleController {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72392a;

    /* renamed from: b  reason: collision with root package name */
    public b f72393b;

    /* renamed from: c  reason: collision with root package name */
    public f f72394c;
    private a g = new com.ss.android.ugc.aweme.story.player.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72395a;

        public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d7, code lost:
            if (r0 != null) goto L_0x00dc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00e7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(java.lang.String r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f72395a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 83143(0x144c7, float:1.16508E-40)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0038
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f72395a
                r3 = 0
                r4 = 83143(0x144c7, float:1.16508E-40)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0038:
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                android.support.v4.app.FragmentActivity r0 = r0.f4119f
                boolean r0 = r0.isFinishing()
                if (r0 == 0) goto L_0x0043
                return
            L_0x0043:
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                com.ss.android.ugc.aweme.story.api.model.b r0 = r0.f72393b
                r1 = 2
                java.lang.Object[] r11 = new java.lang.Object[r1]
                r11[r10] = r0
                r11[r9] = r8
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.a.f72492a
                r14 = 1
                r15 = 83673(0x146d9, float:1.17251E-40)
                java.lang.Class[] r2 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r3 = com.ss.android.ugc.aweme.story.api.model.b.class
                r2[r10] = r3
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r2[r9] = r3
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x008f
                java.lang.Object[] r11 = new java.lang.Object[r1]
                r11[r10] = r0
                r11[r9] = r8
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.a.f72492a
                r14 = 1
                r15 = 83673(0x146d9, float:1.17251E-40)
                java.lang.Class[] r0 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r1 = com.ss.android.ugc.aweme.story.api.model.b.class
                r0[r10] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r9] = r1
                java.lang.Class r17 = java.lang.Boolean.TYPE
            L_0x0082:
                r16 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L_0x00e5
            L_0x008f:
                com.ss.android.ugc.aweme.story.feed.c.a$a r2 = com.ss.android.ugc.aweme.story.feed.c.a.f72493b
                java.lang.Object[] r11 = new java.lang.Object[r1]
                r11[r10] = r0
                r11[r9] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.a.C0756a.f72494a
                r14 = 0
                r15 = 83676(0x146dc, float:1.17255E-40)
                java.lang.Class[] r3 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r4 = com.ss.android.ugc.aweme.story.api.model.b.class
                r3[r10] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r9] = r4
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r2
                r16 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r3 == 0) goto L_0x00cc
                java.lang.Object[] r11 = new java.lang.Object[r1]
                r11[r10] = r0
                r11[r9] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.a.C0756a.f72494a
                r14 = 0
                r15 = 83676(0x146dc, float:1.17255E-40)
                java.lang.Class[] r0 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r1 = com.ss.android.ugc.aweme.story.api.model.b.class
                r0[r10] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r9] = r1
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r2
                goto L_0x0082
            L_0x00cc:
                java.lang.String r1 = "storyId"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r1)
                if (r0 == 0) goto L_0x00da
                java.lang.String r0 = r0.getStoryId()
                if (r0 == 0) goto L_0x00da
                goto L_0x00dc
            L_0x00da:
                java.lang.String r0 = ""
            L_0x00dc:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1 = r8
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
            L_0x00e5:
                if (r0 == 0) goto L_0x020b
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                android.support.v4.app.Fragment r0 = r0.f4118e
                com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r0 = (com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment) r0
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.f4120c
                r14 = 0
                r15 = 83290(0x1455a, float:1.16714E-40)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r10] = r2
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r0
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x0129
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.f4120c
                r14 = 0
                r15 = 83290(0x1455a, float:1.16714E-40)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r10] = r2
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r0
                r16 = r1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L_0x01e4
            L_0x0129:
                java.lang.String r1 = "curStoryId"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r1)
                r1 = 2131171459(0x7f071883, float:1.7957305E38)
                android.view.View r1 = r0.a((int) r1)
                com.ss.android.ugc.aweme.story.feed.jedi.ParentViewPager2 r1 = (com.ss.android.ugc.aweme.story.feed.jedi.ParentViewPager2) r1
                java.lang.String r2 = "viewpager"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                int r1 = r1.getCurrentItem()
                com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2 r2 = r0.c(r1)
                if (r2 != 0) goto L_0x0148
                goto L_0x01e1
            L_0x0148:
                android.support.v4.app.FragmentActivity r3 = r0.getActivity()
                if (r3 == 0) goto L_0x0169
                com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel r3 = r0.k()
                java.lang.String r4 = "auto"
                r3.a((java.lang.String) r4)
                android.support.v4.app.FragmentActivity r3 = r0.requireActivity()
                com.ss.android.ugc.aweme.arch.widgets.base.b r3 = com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel.a(r3)
                java.lang.String r4 = "ChangeUserModeViewModel.…tModel(requireActivity())"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                java.lang.String r4 = "auto"
                r3.setValue(r4)
            L_0x0169:
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2.f72581b
                r14 = 0
                r15 = 83385(0x145b9, float:1.16847E-40)
                java.lang.Class[] r3 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r10] = r4
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r2
                r16 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r3 == 0) goto L_0x01a4
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2.f72581b
                r14 = 0
                r15 = 83385(0x145b9, float:1.16847E-40)
                java.lang.Class[] r3 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r10] = r4
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r2
                r16 = r3
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                goto L_0x01c1
            L_0x01a4:
                java.lang.String r3 = "curStoryId"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r3)
                com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r3 = r2.f72583d
                int r3 = r3.getCurrentItem()
                com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r4 = r2.f72585f
                int r4 = r4.getCount()
                int r4 = r4 - r9
                if (r3 >= r4) goto L_0x01c0
                com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r2 = r2.f72583d
                int r3 = r3 + r9
                r2.setCurrentItem(r3)
                r2 = 1
                goto L_0x01c1
            L_0x01c0:
                r2 = 0
            L_0x01c1:
                if (r2 != 0) goto L_0x01e3
                com.ss.android.ugc.aweme.story.feed.jedi.StoryMainRawPagerAdapter2 r2 = r0.f4123e
                if (r2 != 0) goto L_0x01cc
                java.lang.String r3 = "mAdapter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x01cc:
                int r2 = r2.getItemCount()
                int r2 = r2 - r9
                if (r1 >= r2) goto L_0x01d8
                int r1 = r1 + r9
                r0.b(r1)
                goto L_0x01e3
            L_0x01d8:
                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto L_0x01e1
                r0.supportFinishAfterTransition()
            L_0x01e1:
                r0 = 0
                goto L_0x01e4
            L_0x01e3:
                r0 = 1
            L_0x01e4:
                if (r0 != 0) goto L_0x020b
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                com.ss.android.ugc.aweme.story.api.model.f r0 = r0.f72394c
                if (r0 == 0) goto L_0x020b
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                com.ss.android.ugc.aweme.story.api.model.f r0 = r0.f72394c
                int r0 = r0.detailType
                if (r0 != r9) goto L_0x020b
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                android.support.v4.app.FragmentActivity r0 = r0.f4119f
                if (r0 == 0) goto L_0x020b
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                android.support.v4.app.FragmentActivity r0 = r0.f4119f
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L_0x020b
                com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.this
                android.support.v4.app.FragmentActivity r0 = r0.f4119f
                r0.finish()
            L_0x020b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController.AnonymousClass1.e(java.lang.String):void");
        }
    };

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f72392a, false, 83142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72392a, false, 83142, new Class[0], Void.TYPE);
            return;
        }
        c.d().b(this.g);
        super.onDestroy();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f72392a, false, 83141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72392a, false, 83141, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        c.d().a(this.g);
        if (this.f4118e != null) {
            StoryChange.a(this.f4118e.getActivity(), (LifecycleOwner) this.f4118e, (StoryChange.a) new StoryChange.a() {
                public final void a(b bVar) {
                    AutoPlayController.this.f72393b = bVar;
                }
            });
        }
    }

    public AutoPlayController(FragmentActivity fragmentActivity, Fragment fragment) {
        super(fragmentActivity, fragment);
    }
}
