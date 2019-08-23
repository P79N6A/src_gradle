package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.api.j;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.base.view.a;

public class StoryPublishProgressWidget extends BaseFeedBottomWidget implements WeakHandler.IHandler {
    public static ChangeQuickRedirect p;
    private ImageView A;
    private Runnable B = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72943a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72943a, false, 84353, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72943a, false, 84353, new Class[0], Void.TYPE);
                return;
            }
            if (StoryPublishProgressWidget.this.i && (StoryPublishProgressWidget.this.f2709d instanceof FragmentActivity) && StoryPublishProgressWidget.this.u != null) {
                int i = StoryPublishProgressWidget.this.u.f71844f;
                StoryPublishProgressWidget.this.r.setText(String.format(StoryPublishProgressWidget.this.f2709d.getString(C0906R.string.bt9), new Object[]{Integer.valueOf(i)}));
            }
        }
    };
    private View C;
    private Observer D = new Observer<j>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72955a;

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x01a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r26) {
            /*
                r25 = this;
                r7 = r25
                r8 = r26
                com.ss.android.ugc.aweme.story.api.j r8 = (com.ss.android.ugc.aweme.story.api.j) r8
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f72955a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.j> r1 = com.ss.android.ugc.aweme.story.api.j.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 84358(0x14986, float:1.18211E-40)
                r1 = r25
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003a
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f72955a
                r3 = 0
                r4 = 84358(0x14986, float:1.18211E-40)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.j> r1 = com.ss.android.ugc.aweme.story.api.j.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r25
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003a:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                boolean r0 = r0.i
                if (r0 == 0) goto L_0x02d0
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                r0.u = r8
                long r0 = r8.f71840b
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto L_0x0050
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                long r0 = r0.v
            L_0x0050:
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r0 = 15000(0x3a98, double:7.411E-320)
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x007c
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.TextView r0 = r0.r
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.content.Context r1 = r1.f2709d
                r4 = 2131561904(0x7f0d0db0, float:1.8749222E38)
                java.lang.String r1 = r1.getString(r4)
                java.lang.Object[] r4 = new java.lang.Object[r9]
                int r5 = r8.f71844f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r10] = r5
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.setText(r1)
                goto L_0x009c
            L_0x007c:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.TextView r0 = r0.r
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.content.Context r1 = r1.f2709d
                r4 = 2131561903(0x7f0d0daf, float:1.874922E38)
                java.lang.String r1 = r1.getString(r4)
                java.lang.Object[] r4 = new java.lang.Object[r9]
                int r5 = r8.f71844f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r10] = r5
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.setText(r1)
            L_0x009c:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x00ac
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.ProgressBar r0 = r0.q
                int r1 = r8.f71844f
                r0.setProgress(r1, r9)
                goto L_0x00b5
            L_0x00ac:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.ProgressBar r0 = r0.q
                int r1 = r8.f71844f
                r0.setProgress(r1)
            L_0x00b5:
                int r0 = r8.f71843e
                r1 = 8
                switch(r0) {
                    case 1: goto L_0x02ad;
                    case 2: goto L_0x02ad;
                    case 3: goto L_0x0252;
                    case 4: goto L_0x00be;
                    default: goto L_0x00bc;
                }
            L_0x00bc:
                goto L_0x02d0
            L_0x00be:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.TextView r0 = r0.r
                r2 = 2131561907(0x7f0d0db3, float:1.8749228E38)
                r0.setText(r2)
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.ProgressBar r0 = r0.q
                r0.setVisibility(r1)
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.app.Activity r0 = r0.c()
                android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
                com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r0 = com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel.a((android.support.v4.app.FragmentActivity) r0)
                java.lang.Object r1 = r0.d()
                com.ss.android.ugc.aweme.story.feed.model.a r1 = (com.ss.android.ugc.aweme.story.feed.model.a) r1
                com.ss.android.ugc.aweme.story.api.model.LifeStory r2 = r8.g
                r3 = 2
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r10] = r1
                r11[r9] = r2
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                r14 = 1
                r15 = 83714(0x14702, float:1.17308E-40)
                java.lang.Class[] r4 = new java.lang.Class[r3]
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r5 = com.ss.android.ugc.aweme.story.feed.model.a.class
                r4[r10] = r5
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r5 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
                r4[r9] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r4
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r4 == 0) goto L_0x0125
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r10] = r1
                r11[r9] = r2
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                r14 = 1
                r15 = 83714(0x14702, float:1.17308E-40)
                java.lang.Class[] r2 = new java.lang.Class[r3]
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r3 = com.ss.android.ugc.aweme.story.feed.model.a.class
                r2[r10] = r3
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r3 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
                r2[r9] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01d4
            L_0x0125:
                com.ss.android.ugc.aweme.story.feed.c.g$a r4 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r10] = r1
                r5[r9] = r2
                com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                r21 = 0
                r22 = 83770(0x1473a, float:1.17387E-40)
                java.lang.Class[] r6 = new java.lang.Class[r3]
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r8 = com.ss.android.ugc.aweme.story.feed.model.a.class
                r6[r10] = r8
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r8 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
                r6[r9] = r8
                java.lang.Class r24 = java.lang.Void.TYPE
                r18 = r5
                r19 = r4
                r23 = r6
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
                if (r5 == 0) goto L_0x016f
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r10] = r1
                r5[r9] = r2
                com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                r21 = 0
                r22 = 83770(0x1473a, float:1.17387E-40)
                java.lang.Class[] r2 = new java.lang.Class[r3]
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r3 = com.ss.android.ugc.aweme.story.feed.model.a.class
                r2[r10] = r3
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r3 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
                r2[r9] = r3
                java.lang.Class r24 = java.lang.Void.TYPE
                r18 = r5
                r19 = r4
                r23 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
                goto L_0x01d4
            L_0x016f:
                if (r2 == 0) goto L_0x01d4
                if (r1 == 0) goto L_0x01d4
                com.ss.android.ugc.aweme.story.api.model.b r3 = new com.ss.android.ugc.aweme.story.api.model.b
                r3.<init>()
                r3.setLifeStory(r2)
                java.util.List r2 = r1.getUserStoryList()
                if (r2 == 0) goto L_0x018e
                java.lang.Object r2 = r2.get(r10)
                com.ss.android.ugc.aweme.story.api.model.UserStory r2 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r2
                if (r2 == 0) goto L_0x018e
                java.util.List r2 = r2.getAwemeList()
                goto L_0x018f
            L_0x018e:
                r2 = 0
            L_0x018f:
                if (r2 != 0) goto L_0x01a8
                kotlin.collections.CollectionsKt.listOf(r3)
                java.util.List r2 = r1.getUserStoryList()
                if (r2 == 0) goto L_0x01d4
                java.lang.Object r2 = r2.get(r10)
                com.ss.android.ugc.aweme.story.api.model.UserStory r2 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r2
                if (r2 == 0) goto L_0x01d4
                r3 = 1
                r2.setTotalCount(r3)
                goto L_0x01d4
            L_0x01a8:
                r4 = -1
                r5 = r2
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
            L_0x01b1:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x01cf
                java.lang.Object r8 = r5.next()
                com.ss.android.ugc.aweme.story.api.model.b r8 = (com.ss.android.ugc.aweme.story.api.model.b) r8
                java.lang.String r11 = "story"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r11)
                int r8 = r8.getAwemeType()
                r11 = 10000(0x2710, float:1.4013E-41)
                if (r8 != r11) goto L_0x01cc
                r4 = r6
                goto L_0x01cf
            L_0x01cc:
                int r6 = r6 + 1
                goto L_0x01b1
            L_0x01cf:
                if (r4 < 0) goto L_0x01d4
                r2.set(r4, r3)
            L_0x01d4:
                android.arch.lifecycle.MutableLiveData r0 = r0.c()
                r0.setValue(r1)
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                com.ss.android.ugc.aweme.story.api.model.UserStory r0 = r0.k
                if (r0 != 0) goto L_0x0242
                com.ss.android.ugc.aweme.profile.model.User r0 = com.ss.android.ugc.aweme.story.base.utils.g.a()
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                r14 = 1
                r15 = 83715(0x14703, float:1.1731E-40)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.ss.android.ugc.aweme.profile.model.User.class
                r1[r10] = r2
                java.lang.Class<java.lang.String> r17 = java.lang.String.class
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x021c
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                r14 = 1
                r15 = 83715(0x14703, float:1.1731E-40)
                java.lang.Class[] r0 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
                r0[r10] = r1
                java.lang.Class<java.lang.String> r17 = java.lang.String.class
                r16 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0222
            L_0x021c:
                com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                java.lang.String r0 = r1.c((com.ss.android.ugc.aweme.profile.model.User) r0)
            L_0x0222:
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x0241
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.app.Activity r1 = r1.c()
                android.support.v4.app.FragmentActivity r1 = (android.support.v4.app.FragmentActivity) r1
                com.ss.android.ugc.aweme.story.api.model.UserStory r0 = com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange.a((android.support.v4.app.FragmentActivity) r1, (java.lang.String) r0)
                if (r0 == 0) goto L_0x0241
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r1 = r1.l
                java.util.List r0 = r0.getAwemeList()
                r1.a((java.util.List<com.ss.android.ugc.aweme.story.api.model.b>) r0)
            L_0x0241:
                return
            L_0x0242:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r0 = r0.l
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r1.k
                java.util.List r1 = r1.getAwemeList()
                r0.a((java.util.List<com.ss.android.ugc.aweme.story.api.model.b>) r1)
                return
            L_0x0252:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.LinearLayout r0 = r0.s
                r0.setVisibility(r1)
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.RelativeLayout r0 = r0.t
                r0.setVisibility(r10)
                java.lang.Exception r0 = r8.h
                if (r0 == 0) goto L_0x02d0
                java.lang.Exception r0 = r8.h
                java.lang.Throwable r0 = r0.getCause()
                boolean r1 = r0 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
                if (r1 == 0) goto L_0x02d0
                com.ss.android.ugc.aweme.base.api.a.b.a r0 = (com.ss.android.ugc.aweme.base.api.a.b.a) r0
                int r0 = r0.getErrorCode()
                r1 = 30411(0x76cb, float:4.2615E-41)
                if (r0 != r1) goto L_0x02d0
                long r0 = java.lang.System.currentTimeMillis()
                long r4 = r8.i
                long r0 = r0 - r4
                r4 = 10000(0x2710, double:4.9407E-320)
                long r11 = r4 - r0
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x02d0
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x02d0
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                r0.c(r9)
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                r0.a((long) r11)
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                com.ss.android.ugc.aweme.story.base.view.a r1 = new com.ss.android.ugc.aweme.story.base.view.a
                r13 = 1000(0x3e8, double:4.94E-321)
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r2 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                com.ss.android.ugc.aweme.story.base.view.a$b r15 = r2.w
                r10 = r1
                r10.<init>(r11, r13, r15)
                r0.x = r1
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                com.ss.android.ugc.aweme.story.base.view.a r0 = r0.x
                r0.b()
                goto L_0x02d0
            L_0x02ad:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.LinearLayout r0 = r0.s
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x02be
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.LinearLayout r0 = r0.s
                r0.setVisibility(r10)
            L_0x02be:
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.RelativeLayout r0 = r0.t
                int r0 = r0.getVisibility()
                if (r0 == r1) goto L_0x02d0
                com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                android.widget.RelativeLayout r0 = r0.t
                r0.setVisibility(r1)
                return
            L_0x02d0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.AnonymousClass5.onChanged(java.lang.Object):void");
        }
    };
    public ProgressBar q;
    public TextView r;
    public LinearLayout s;
    public RelativeLayout t;
    public j u;
    public long v;
    public a.b w = new a.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72945a;

        public final void a(long j) {
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f72945a, false, 84354, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f72945a, false, 84354, new Class[]{Long.TYPE}, Void.TYPE);
            } else if (((int) (j / 1000)) <= 0) {
                StoryPublishProgressWidget.this.c(false);
                StoryPublishProgressWidget.this.t.setEnabled(true);
            } else {
                StoryPublishProgressWidget.this.a(j);
            }
        }
    };
    public a x;
    private WeakHandler y;
    private TextView z;

    public void handleMsg(Message message) {
    }

    public final int i() {
        return C0906R.layout.arx;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84352, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).getPublishState().removeObserver(this.D);
        this.y.removeCallbacks(this.B);
        if (this.x != null) {
            this.x.a();
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84347, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        IAVStoryService iAVStoryService = (IAVStoryService) ServiceManager.get().getService(IAVStoryService.class);
        if (!(iAVStoryService == null || iAVStoryService.getPublishState() == null || iAVStoryService.getPublishState().getValue() == null)) {
            this.u = (j) iAVStoryService.getPublishState().getValue();
        }
        this.v = System.currentTimeMillis();
        this.y = new WeakHandler(this);
        j jVar = this.u;
        long j = ea.f66827f;
        if (jVar != null && this.u.f71840b > 0) {
            j = ea.f66827f - (System.currentTimeMillis() - this.u.f71840b);
        }
        this.y.postDelayed(this.B, Math.max(j, 0));
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, p, false, 84351, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, p, false, 84351, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.i) {
            this.z.setText(String.format(this.f2709d.getString(C0906R.string.cg7), new Object[]{Integer.valueOf((int) (j / 1000))}));
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 84348, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 84348, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.q = (ProgressBar) view.findViewById(C0906R.id.c7k);
        this.r = (TextView) view.findViewById(C0906R.id.c80);
        this.s = (LinearLayout) view.findViewById(C0906R.id.bhj);
        this.t = (RelativeLayout) view.findViewById(C0906R.id.cg5);
        this.z = (TextView) view.findViewById(C0906R.id.dhi);
        this.C = view.findViewById(C0906R.id.ag0);
        this.A = (ImageView) view.findViewById(C0906R.id.b4d);
        this.C.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72947a;

            public final void onClick(final View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f72947a, false, 84355, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f72947a, false, 84355, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(100).withEndAction(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72949a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f72949a, false, 84356, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f72949a, false, 84356, new Class[0], Void.TYPE);
                            return;
                        }
                        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                    }
                }).start();
                ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).rePublishStory((FragmentActivity) StoryPublishProgressWidget.this.c(), StoryPublishProgressWidget.this.u.f71841c, new com.ss.android.ugc.aweme.story.api.a<Object>() {
                    public final void a(Object obj) {
                    }

                    public final void a(String str) {
                    }
                });
            }
        });
        view.findViewById(C0906R.id.d9x).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72953a;

            /* JADX WARNING: Removed duplicated region for block: B:32:0x0137  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r18) {
                /*
                    r17 = this;
                    r7 = r17
                    r8 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r9 = 0
                    r0[r9] = r18
                    com.meituan.robust.ChangeQuickRedirect r2 = f72953a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 84357(0x14985, float:1.1821E-40)
                    r1 = r17
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0036
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r0[r9] = r18
                    com.meituan.robust.ChangeQuickRedirect r2 = f72953a
                    r3 = 0
                    r4 = 84357(0x14985, float:1.1821E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r17
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0036:
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r18)
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.story.api.IAVStoryService> r1 = com.ss.android.ugc.aweme.story.api.IAVStoryService.class
                    java.lang.Object r0 = r0.getService(r1)
                    com.ss.android.ugc.aweme.story.api.IAVStoryService r0 = (com.ss.android.ugc.aweme.story.api.IAVStoryService) r0
                    com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                    com.ss.android.ugc.aweme.story.api.j r1 = r1.u
                    java.lang.String r1 = r1.f71841c
                    r0.cancelPublish(r1)
                    com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                    android.app.Activity r0 = r0.c()
                    android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
                    com.ss.android.ugc.aweme.story.api.model.UserStory r0 = com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange.c(r0)
                    if (r0 == 0) goto L_0x0074
                    java.util.List r1 = r0.getAwemeList()
                    com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r2 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                    com.ss.android.ugc.aweme.story.api.model.b r2 = r2.f4154b
                    boolean r1 = r1.remove(r2)
                    if (r1 == 0) goto L_0x0074
                    long r1 = r0.getTotalCount()
                    r3 = 1
                    long r1 = r1 - r3
                    r0.setTotalCount(r1)
                L_0x0074:
                    com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                    com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r1 = r1.l
                    com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r2 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                    com.ss.android.ugc.aweme.story.api.model.b r2 = r2.f4154b
                    r1.a((com.ss.android.ugc.aweme.story.api.model.b) r2)
                    com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r1 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                    com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r1 = r1.l
                    int r1 = r1.getCount()
                    if (r1 > 0) goto L_0x009f
                    com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget r0 = com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.this
                    com.ss.android.ugc.aweme.story.api.model.b r0 = r0.f4154b
                    java.lang.String r0 = com.ss.android.ugc.aweme.story.feed.c.g.a((com.ss.android.ugc.aweme.story.api.model.b) r0)
                    com.ss.android.ugc.aweme.story.base.a.a r1 = com.ss.android.ugc.aweme.story.base.a.a.a()
                    java.lang.String r2 = "key_delete_user"
                    com.ss.android.ugc.aweme.arch.widgets.base.b r1 = r1.a(r2)
                    r1.setValue(r0)
                    return
                L_0x009f:
                    if (r0 == 0) goto L_0x014a
                    java.lang.Object[] r10 = new java.lang.Object[r8]
                    r10[r9] = r0
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                    r13 = 1
                    r14 = 83712(0x14700, float:1.17305E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r2 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                    r1[r9] = r2
                    java.lang.Class r16 = java.lang.Boolean.TYPE
                    r15 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                    if (r1 == 0) goto L_0x00da
                    java.lang.Object[] r10 = new java.lang.Object[r8]
                    r10[r9] = r0
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                    r13 = 1
                    r14 = 83712(0x14700, float:1.17305E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r2 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                    r1[r9] = r2
                    java.lang.Class r16 = java.lang.Boolean.TYPE
                    r15 = r1
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                L_0x00d3:
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    goto L_0x0135
                L_0x00da:
                    com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                    java.lang.Object[] r10 = new java.lang.Object[r8]
                    r10[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                    r13 = 0
                    r14 = 83763(0x14733, float:1.17377E-40)
                    java.lang.Class[] r2 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r3 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                    r2[r9] = r3
                    java.lang.Class r16 = java.lang.Boolean.TYPE
                    r11 = r1
                    r15 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                    if (r2 == 0) goto L_0x010f
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r2[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                    r12 = 0
                    r13 = 83763(0x14733, float:1.17377E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r3 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                    r14[r9] = r3
                    java.lang.Class r15 = java.lang.Boolean.TYPE
                    r9 = r2
                    r10 = r1
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    goto L_0x00d3
                L_0x010f:
                    if (r0 == 0) goto L_0x0134
                    java.util.List r1 = r0.getAwemeList()
                    if (r1 == 0) goto L_0x0134
                    java.util.Iterator r1 = r1.iterator()
                L_0x011b:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0134
                    java.lang.Object r2 = r1.next()
                    com.ss.android.ugc.aweme.story.api.model.b r2 = (com.ss.android.ugc.aweme.story.api.model.b) r2
                    java.lang.String r3 = "aweme"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                    boolean r2 = r2.isRead()
                    if (r2 != 0) goto L_0x011b
                    r1 = 0
                    goto L_0x0135
                L_0x0134:
                    r1 = 1
                L_0x0135:
                    if (r1 == 0) goto L_0x014a
                    r0.setReadFlag(r8)
                    org.greenrobot.eventbus.c r1 = org.greenrobot.eventbus.c.a()
                    com.ss.android.ugc.aweme.story.feed.a.b r2 = new com.ss.android.ugc.aweme.story.feed.a.b
                    java.lang.String r0 = com.ss.android.ugc.aweme.story.feed.c.g.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r0)
                    r2.<init>(r0)
                    r1.d(r2)
                L_0x014a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget.AnonymousClass4.onClick(android.view.View):void");
            }
        });
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, p, false, 84350, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, p, false, 84350, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            this.C.setEnabled(false);
            this.C.setAlpha(0.75f);
            this.A.setImageResource(2130837728);
            this.z.setTextColor(this.f2709d.getResources().getColor(C0906R.color.zv));
        } else {
            this.C.setEnabled(true);
            this.C.setAlpha(1.0f);
            this.A.setImageResource(2130837765);
            this.z.setTextColor(this.f2709d.getResources().getColor(C0906R.color.hx));
            this.z.setText(C0906R.string.bt_);
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, p, false, 84349, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, p, false, 84349, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        if (this.f2709d instanceof FragmentActivity) {
            ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).getPublishState().observe((LifecycleOwner) this.f2709d, this.D);
        }
    }
}
