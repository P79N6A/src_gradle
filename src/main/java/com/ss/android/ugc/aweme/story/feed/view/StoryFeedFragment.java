package com.ss.android.ugc.aweme.story.feed.view;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.base.utils.h;
import com.ss.android.ugc.aweme.story.base.view.StorySwipeRefreshLayout;
import com.ss.android.ugc.aweme.story.base.view.b;
import com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager;
import com.ss.android.ugc.aweme.story.base.view.viewpager.transforms.CubeOutTransformer;
import com.ss.android.ugc.aweme.story.base.view.viewpager.transforms.ForegroundToBackgroundTransformer;
import com.ss.android.ugc.aweme.story.comment.b.a;
import com.ss.android.ugc.aweme.story.comment.widget.CommentBottomSheetBehavior;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.view.adapter.StoryMainPagerAdapter;
import com.ss.android.ugc.aweme.story.feed.view.adapter.c;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ViewPagerMotionEventViewModel;
import java.util.ArrayList;
import org.greenrobot.eventbus.Subscribe;

public class StoryFeedFragment extends AmeBaseFragment implements ViewPager.OnPageChangeListener, StorySwipeRefreshLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4134a;

    /* renamed from: b  reason: collision with root package name */
    public ParentViewPager f4135b;

    /* renamed from: c  reason: collision with root package name */
    public StoryMainPagerAdapter f4136c;

    /* renamed from: d  reason: collision with root package name */
    public LifeFeedModel f4137d;

    /* renamed from: e  reason: collision with root package name */
    public View f4138e;

    /* renamed from: f  reason: collision with root package name */
    public f f4139f;
    private DmtStatusView g;

    @Subscribe
    public void onEnterViewBoardEvent(a aVar) {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    private int b() {
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83852, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83852, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    private c c() {
        if (!PatchProxy.isSupport(new Object[0], this, f4134a, false, 83863, new Class[0], c.class)) {
            return b(this.f4135b.getCurrentItem());
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83863, new Class[0], c.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83848, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            c c2 = c();
            if (c2 != null) {
                c2.i();
            }
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83866, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        com.ss.android.ugc.aweme.story.player.c.d().e();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83867, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        org.greenrobot.eventbus.c.a().c(this);
        int childCount = this.f4135b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f4135b.getChildAt(i);
            if (childAt != null) {
                c cVar = (c) childAt.getTag();
                if (cVar != null) {
                    cVar.h();
                }
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f4134a, false, 83862, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f4134a, false, 83862, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i);
        this.f4135b.setCurrentItem(i, true);
    }

    public final c b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f4134a, false, 83864, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f4134a, false, 83864, new Class[]{Integer.TYPE}, c.class);
        } else if (this.f4135b == null) {
            return null;
        } else {
            int childCount = this.f4135b.getChildCount();
            if (i < 0 || i >= this.f4136c.getCount()) {
                return null;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                c cVar = (c) this.f4135b.getChildAt(i2).getTag();
                if (cVar != null && g.a(cVar.f72725f, this.f4136c.b(i))) {
                    return cVar;
                }
            }
            return null;
        }
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f4134a, false, 83860, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f4134a, false, 83860, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!h.a(com.ss.android.ugc.aweme.story.base.view.guide.a.c(), false)) {
            h.b(com.ss.android.ugc.aweme.story.base.view.guide.a.c(), true);
        }
        if (this.f4139f != null) {
            com.ss.android.ugc.aweme.story.detail.f.a().a(g.a(StoryChange.c(getActivity())), this.f4139f.tabType);
        }
    }

    @Subscribe
    public void onStoryEnterTransitionEvent(com.ss.android.ugc.aweme.story.detail.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f4134a, false, 83868, new Class[]{com.ss.android.ugc.aweme.story.detail.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f4134a, false, 83868, new Class[]{com.ss.android.ugc.aweme.story.detail.b.c.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f4135b.setAlpha(0.4f);
            this.f4135b.animate().alpha(1.0f).setDuration(200).start();
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4134a, false, 83846, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4134a, false, 83846, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            a();
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83847, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            c c2 = c();
            if (c2 != null) {
                if (PatchProxy.isSupport(new Object[0], c2, c.f72720a, false, 83990, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], c2, c.f72720a, false, 83990, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.story.feed.view.adapter.a j = c2.j();
                if (j != null) {
                    j.l();
                }
            }
        }
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        DmtStatusView dmtStatusView;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f4134a, false, 83843, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f4134a, false, 83843, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f4139f = (f) arguments.getSerializable("extra_story_detail_params");
        }
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83858, new Class[0], DmtStatusView.class)) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83858, new Class[0], DmtStatusView.class);
        } else {
            if (this.g == null && getContext() != null) {
                Context context = getContext();
                if (PatchProxy.isSupport(new Object[]{context}, this, f4134a, false, 83857, new Class[]{Context.class}, DmtStatusView.class)) {
                    dmtStatusView = (DmtStatusView) PatchProxy.accessDispatch(new Object[]{context}, this, f4134a, false, 83857, new Class[]{Context.class}, DmtStatusView.class);
                } else {
                    dmtStatusView = new DmtStatusView(getContext());
                    DmtStatusView.a a2 = DmtStatusView.a.a((Context) getActivity());
                    a2.a((int) C0906R.string.aar);
                    a2.b(b.a(getContext(), c.f72751b));
                    a2.c(1);
                    dmtStatusView.setBuilder(a2);
                    dmtStatusView.setUseScreenHeight((int) UIUtils.dip2Px(getContext(), 52.0f));
                }
                this.g = dmtStatusView;
                this.g.setBackgroundColor(getContext().getResources().getColor(C0906R.color.i0));
                new FrameLayout.LayoutParams(-1, -1);
            }
            DmtStatusView dmtStatusView3 = this.g;
        }
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83849, new Class[0], Void.TYPE);
        } else {
            this.f4137d = (LifeFeedModel) ViewModelProviders.of(getActivity()).get(LifeFeedModel.class);
            this.f4137d.c().observe(this, new Observer<com.ss.android.ugc.aweme.story.feed.model.a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72677a;

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.ss.android.ugc.aweme.story.api.model.b} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* JADX WARNING: Removed duplicated region for block: B:62:0x02a5  */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x02aa  */
                /* JADX WARNING: Removed duplicated region for block: B:65:0x02ad  */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x02d4  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r19) {
                    /*
                        r18 = this;
                        r7 = r18
                        r8 = r19
                        com.ss.android.ugc.aweme.story.feed.model.a r8 = (com.ss.android.ugc.aweme.story.feed.model.a) r8
                        r9 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r10 = 0
                        r0[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = f72677a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r1 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 83877(0x147a5, float:1.17537E-40)
                        r1 = r18
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x003a
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = f72677a
                        r3 = 0
                        r4 = 83877(0x147a5, float:1.17537E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r1 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r18
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x003a:
                        if (r8 == 0) goto L_0x0441
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r0 = r0.f4137d
                        int r0 = r0.f72663f
                        if (r0 < 0) goto L_0x0096
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r0 = r0.f4137d
                        int r0 = r0.f72663f
                        java.util.List r1 = r8.getUserStoryList()
                        int r1 = r1.size()
                        if (r0 != r1) goto L_0x0073
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                        boolean r0 = r0 instanceof com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity
                        if (r0 == 0) goto L_0x008e
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                        com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity r0 = (com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity) r0
                        r0.d()
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                        r0.finish()
                        goto L_0x008e
                    L_0x0073:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r1 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.view.adapter.StoryMainPagerAdapter r1 = r1.f4136c
                        java.util.List r2 = r8.getUserStoryList()
                        r1.a((java.util.List<com.ss.android.ugc.aweme.story.api.model.UserStory>) r2)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r1 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        r1.a(r0)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r1 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.view.adapter.c r0 = r1.b(r0)
                        if (r0 == 0) goto L_0x008e
                        r0.a((boolean) r9)
                    L_0x008e:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r0 = r0.f4137d
                        r1 = -1
                        r0.f72663f = r1
                        return
                    L_0x0096:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.view.adapter.StoryMainPagerAdapter r0 = r0.f4136c
                        boolean r1 = r8.isHasMore()
                        r0.f72716f = r1
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.view.adapter.StoryMainPagerAdapter r0 = r0.f4136c
                        java.util.List r1 = r8.getUserStoryList()
                        r0.a((java.util.List<com.ss.android.ugc.aweme.story.api.model.UserStory>) r1)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r0 = r0.f4137d
                        com.ss.android.ugc.aweme.story.base.c.a.a r0 = r0.f()
                        r1 = 2
                        if (r0 != 0) goto L_0x01e2
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.api.model.f r0 = r0.f4139f
                        int r0 = r0.detailType
                        if (r0 != r1) goto L_0x00cc
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.api.model.f r0 = r0.f4139f
                        java.lang.String r0 = r0.storyId
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x00cc
                        r0 = 1
                        goto L_0x00cd
                    L_0x00cc:
                        r0 = 0
                    L_0x00cd:
                        if (r0 == 0) goto L_0x01b9
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r2 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.api.model.f r2 = r2.f4139f
                        java.lang.String r2 = r2.storyId
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                        r11[r10] = r3
                        r11[r9] = r2
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.f4134a
                        r14 = 0
                        r15 = 83850(0x1478a, float:1.17499E-40)
                        java.lang.Class[] r3 = new java.lang.Class[r1]
                        java.lang.Class r4 = java.lang.Integer.TYPE
                        r3[r10] = r4
                        java.lang.Class<java.lang.String> r4 = java.lang.String.class
                        r3[r9] = r4
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r3
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r3 == 0) goto L_0x0120
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                        r11[r10] = r3
                        r11[r9] = r2
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.f4134a
                        r14 = 0
                        r15 = 83850(0x1478a, float:1.17499E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r1]
                        java.lang.Class r2 = java.lang.Integer.TYPE
                        r1[r10] = r2
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        r1[r9] = r2
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        goto L_0x01d9
                    L_0x0120:
                        com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager r3 = r0.f4135b
                        r3.setCurrentItem(r10, r9)
                        com.ss.android.ugc.aweme.story.feed.view.adapter.c r0 = r0.b(r10)
                        if (r0 == 0) goto L_0x01d9
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r2
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.adapter.c.f72720a
                        r14 = 0
                        r15 = 83993(0x14819, float:1.17699E-40)
                        java.lang.Class[] r3 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.String> r4 = java.lang.String.class
                        r3[r10] = r4
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r3
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r3 == 0) goto L_0x0160
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r2
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.adapter.c.f72720a
                        r14 = 0
                        r15 = 83993(0x14819, float:1.17699E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        r1[r10] = r2
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        goto L_0x01d9
                    L_0x0160:
                        com.ss.android.ugc.aweme.story.api.model.UserStory r3 = r0.f72725f
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        r11[r10] = r3
                        r11[r9] = r2
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                        r14 = 1
                        r15 = 83722(0x1470a, float:1.1732E-40)
                        java.lang.Class[] r4 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r5 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                        r4[r10] = r5
                        java.lang.Class<java.lang.String> r5 = java.lang.String.class
                        r4[r9] = r5
                        java.lang.Class r17 = java.lang.Integer.TYPE
                        r16 = r4
                        boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r4 == 0) goto L_0x01a9
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        r11[r10] = r3
                        r11[r9] = r2
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                        r14 = 1
                        r15 = 83722(0x1470a, float:1.1732E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r2 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                        r1[r10] = r2
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        r1[r9] = r2
                        java.lang.Class r17 = java.lang.Integer.TYPE
                        r16 = r1
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        int r1 = r1.intValue()
                        goto L_0x01af
                    L_0x01a9:
                        com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                        int r1 = r1.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r3, (java.lang.String) r2)
                    L_0x01af:
                        int r1 = java.lang.Math.max(r10, r1)
                        com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r0 = r0.f72722c
                        r0.setCurrentItem(r1)
                        goto L_0x01d9
                    L_0x01b9:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.api.model.f r0 = r0.f4139f
                        java.lang.String r0 = r0.uid
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r1 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r1 = r1.f4137d
                        java.lang.Object r1 = r1.d()
                        com.ss.android.ugc.aweme.story.feed.model.a r1 = (com.ss.android.ugc.aweme.story.feed.model.a) r1
                        int r0 = com.ss.android.ugc.aweme.story.feed.c.g.a((java.lang.String) r0, (com.ss.android.ugc.aweme.story.feed.model.a) r1)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r1 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager r1 = r1.f4135b
                        r1.setCurrentItem(r0, r9)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r1 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        r1.b(r0)
                    L_0x01d9:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager r0 = r0.f4135b
                        r0.a()
                        goto L_0x02e9
                    L_0x01e2:
                        com.ss.android.ugc.aweme.story.base.c.a.b r0 = r0.f71934b
                        com.ss.android.ugc.aweme.story.base.c.a.b r2 = com.ss.android.ugc.aweme.story.base.c.a.b.REFRESHING_SUCCESS
                        if (r0 != r2) goto L_0x02e9
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        r11[r10] = r8
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
                        r11[r9] = r0
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                        r14 = 1
                        r15 = 83703(0x146f7, float:1.17293E-40)
                        java.lang.Class[] r0 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r2 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r0[r10] = r2
                        java.lang.Class r2 = java.lang.Integer.TYPE
                        r0[r9] = r2
                        java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r17 = com.ss.android.ugc.aweme.story.api.model.b.class
                        r16 = r0
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        r2 = 0
                        if (r0 == 0) goto L_0x0236
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        r11[r10] = r8
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
                        r11[r9] = r0
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                        r14 = 1
                        r15 = 83703(0x146f7, float:1.17293E-40)
                        java.lang.Class[] r0 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r1 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r0[r10] = r1
                        java.lang.Class r1 = java.lang.Integer.TYPE
                        r0[r9] = r1
                        java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r17 = com.ss.android.ugc.aweme.story.api.model.b.class
                        r16 = r0
                    L_0x022d:
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        r2 = r0
                        com.ss.android.ugc.aweme.story.api.model.b r2 = (com.ss.android.ugc.aweme.story.api.model.b) r2
                        goto L_0x02d2
                    L_0x0236:
                        com.ss.android.ugc.aweme.story.feed.c.g$a r0 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        r11[r10] = r8
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                        r11[r9] = r3
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                        r14 = 0
                        r15 = 83745(0x14721, float:1.17352E-40)
                        java.lang.Class[] r3 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r4 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r3[r10] = r4
                        java.lang.Class r4 = java.lang.Integer.TYPE
                        r3[r9] = r4
                        java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r17 = com.ss.android.ugc.aweme.story.api.model.b.class
                        r12 = r0
                        r16 = r3
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r3 == 0) goto L_0x027d
                        java.lang.Object[] r11 = new java.lang.Object[r1]
                        r11[r10] = r8
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
                        r11[r9] = r2
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                        r14 = 0
                        r15 = 83745(0x14721, float:1.17352E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r2 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r1[r10] = r2
                        java.lang.Class r2 = java.lang.Integer.TYPE
                        r1[r9] = r2
                        java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r17 = com.ss.android.ugc.aweme.story.api.model.b.class
                        r12 = r0
                        r16 = r1
                        goto L_0x022d
                    L_0x027d:
                        if (r8 == 0) goto L_0x028c
                        java.util.List r0 = r8.getUserStoryList()
                        if (r0 == 0) goto L_0x028c
                        java.lang.Object r0 = r0.get(r10)
                        com.ss.android.ugc.aweme.story.api.model.UserStory r0 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r0
                        goto L_0x028d
                    L_0x028c:
                        r0 = r2
                    L_0x028d:
                        if (r0 == 0) goto L_0x02a3
                        int r1 = r0.getReadFlag()
                        if (r1 != r9) goto L_0x02a3
                        java.util.List r0 = r0.getAwemeList()
                        if (r0 == 0) goto L_0x02d2
                        java.lang.Object r0 = r0.get(r10)
                        r2 = r0
                        com.ss.android.ugc.aweme.story.api.model.b r2 = (com.ss.android.ugc.aweme.story.api.model.b) r2
                        goto L_0x02d2
                    L_0x02a3:
                        if (r0 == 0) goto L_0x02aa
                        java.util.List r0 = r0.getAwemeList()
                        goto L_0x02ab
                    L_0x02aa:
                        r0 = r2
                    L_0x02ab:
                        if (r0 == 0) goto L_0x02d2
                        com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                        int r0 = r1.a((java.util.List<? extends com.ss.android.ugc.aweme.story.api.model.b>) r0)
                        int r0 = java.lang.Math.max(r0, r10)
                        java.util.List r1 = r8.getUserStoryList()
                        if (r1 == 0) goto L_0x02d2
                        java.lang.Object r1 = r1.get(r10)
                        com.ss.android.ugc.aweme.story.api.model.UserStory r1 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r1
                        if (r1 == 0) goto L_0x02d2
                        java.util.List r1 = r1.getAwemeList()
                        if (r1 == 0) goto L_0x02d2
                        java.lang.Object r0 = r1.get(r0)
                        r2 = r0
                        com.ss.android.ugc.aweme.story.api.model.b r2 = (com.ss.android.ugc.aweme.story.api.model.b) r2
                    L_0x02d2:
                        if (r2 == 0) goto L_0x02dd
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                        com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange.a((android.support.v4.app.FragmentActivity) r0, (com.ss.android.ugc.aweme.story.api.model.b) r2)
                    L_0x02dd:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        r0.a(r10)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager r0 = r0.f4135b
                        r0.a()
                    L_0x02e9:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.f4134a
                        r14 = 0
                        r15 = 83854(0x1478e, float:1.17504E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        r2 = 1000(0x3e8, double:4.94E-321)
                        if (r1 == 0) goto L_0x0316
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.f4134a
                        r14 = 0
                        r15 = 83854(0x1478e, float:1.17504E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        goto L_0x03ac
                    L_0x0316:
                        android.support.v4.app.FragmentActivity r1 = r0.getActivity()
                        com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r1 = com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel.a((android.support.v4.app.FragmentActivity) r1)
                        java.lang.Object r1 = r1.d()
                        com.ss.android.ugc.aweme.story.feed.model.a r1 = (com.ss.android.ugc.aweme.story.feed.model.a) r1
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                        r14 = 1
                        r15 = 83726(0x1470e, float:1.17325E-40)
                        java.lang.Class[] r4 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r5 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r4[r10] = r5
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r16 = r4
                        boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r4 == 0) goto L_0x035f
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                        r14 = 1
                        r15 = 83726(0x1470e, float:1.17325E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r4 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r1[r10] = r4
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r16 = r1
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        java.lang.Boolean r1 = (java.lang.Boolean) r1
                        boolean r1 = r1.booleanValue()
                        goto L_0x0365
                    L_0x035f:
                        com.ss.android.ugc.aweme.story.feed.c.g$a r4 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                        boolean r1 = r4.b((com.ss.android.ugc.aweme.story.feed.model.a) r1)
                    L_0x0365:
                        if (r1 != 0) goto L_0x03ac
                        java.lang.String r1 = com.ss.android.ugc.aweme.story.base.view.guide.a.b()
                        boolean r1 = com.ss.android.ugc.aweme.story.base.utils.h.a(r1, r10)
                        if (r1 != 0) goto L_0x03ac
                        java.lang.String r1 = com.ss.android.ugc.aweme.story.base.view.guide.a.a()
                        boolean r1 = com.ss.android.ugc.aweme.story.base.utils.h.a(r1, r10)
                        if (r1 == 0) goto L_0x03ac
                        java.lang.String r1 = com.ss.android.ugc.aweme.story.base.view.guide.a.c()
                        boolean r1 = com.ss.android.ugc.aweme.story.base.utils.h.a(r1, r10)
                        if (r1 != 0) goto L_0x03ac
                        com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedScrollGuideDialogFragment r1 = new com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedScrollGuideDialogFragment
                        r1.<init>()
                        android.support.v4.app.FragmentManager r4 = r0.getChildFragmentManager()
                        java.lang.String r5 = ""
                        r1.show((android.support.v4.app.FragmentManager) r4, (java.lang.String) r5)
                        com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager r4 = r0.f4135b
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$7 r5 = new com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$7
                        r5.<init>()
                        r4.postDelayed(r5, r2)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$8 r4 = new com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$8
                        r4.<init>()
                        r1.a((com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedScrollGuideDialogFragment.a) r4)
                        java.lang.String r0 = com.ss.android.ugc.aweme.story.base.view.guide.a.b()
                        com.ss.android.ugc.aweme.story.base.utils.h.b(r0, r9)
                    L_0x03ac:
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment r0 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.this
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.f4134a
                        r14 = 0
                        r15 = 83853(0x1478d, float:1.17503E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r4 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r1[r10] = r4
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r1 == 0) goto L_0x03e2
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.f4134a
                        r14 = 0
                        r15 = 83853(0x1478d, float:1.17503E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r2 = com.ss.android.ugc.aweme.story.feed.model.a.class
                        r1[r10] = r2
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        return
                    L_0x03e2:
                        com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager r1 = r0.f4135b
                        int r1 = r1.getCurrentItem()
                        if (r8 == 0) goto L_0x0441
                        java.util.List r4 = r8.getUserStoryList()
                        if (r4 == 0) goto L_0x0441
                        java.util.List r4 = r8.getUserStoryList()
                        int r4 = r4.size()
                        if (r4 <= r1) goto L_0x0441
                        java.util.List r4 = r8.getUserStoryList()
                        java.lang.Object r1 = r4.get(r1)
                        com.ss.android.ugc.aweme.story.api.model.UserStory r1 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r1
                        if (r1 == 0) goto L_0x0441
                        long r4 = r1.getTotalCount()
                        r11 = 1
                        int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                        if (r1 <= 0) goto L_0x0441
                        java.lang.String r1 = com.ss.android.ugc.aweme.story.base.view.guide.a.a()
                        boolean r1 = com.ss.android.ugc.aweme.story.base.utils.h.a(r1, r10)
                        if (r1 != 0) goto L_0x0441
                        com.ss.android.ugc.aweme.story.base.view.viewpager.ParentViewPager r1 = r0.f4135b
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$5 r4 = new com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$5
                        r4.<init>()
                        r1.postDelayed(r4, r2)
                        com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedClickGuideDialogFragment r1 = new com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedClickGuideDialogFragment
                        r1.<init>()
                        android.support.v4.app.FragmentManager r2 = r0.getChildFragmentManager()
                        java.lang.String r3 = ""
                        r1.show((android.support.v4.app.FragmentManager) r2, (java.lang.String) r3)
                        com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$6 r2 = new com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment$6
                        r2.<init>()
                        r1.a((com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedClickGuideDialogFragment.a) r2)
                        java.lang.String r0 = com.ss.android.ugc.aweme.story.base.view.guide.a.a()
                        com.ss.android.ugc.aweme.story.base.utils.h.b(r0, r9)
                    L_0x0441:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.StoryFeedFragment.AnonymousClass3.onChanged(java.lang.Object):void");
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83845, new Class[0], Void.TYPE);
        } else {
            final MutableLiveData<com.ss.android.ugc.aweme.story.feed.a.c> a3 = ((ViewPagerMotionEventViewModel) ViewModelProviders.of(getActivity()).get(ViewPagerMotionEventViewModel.class)).a();
            ParentViewPager parentViewPager = this.f4135b;
            AnonymousClass2 r2 = new ParentViewPager.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72674a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f72674a, false, 83874, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72674a, false, 83874, new Class[0], Void.TYPE);
                        return;
                    }
                    a3.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(4));
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f72674a, false, 83875, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72674a, false, 83875, new Class[0], Void.TYPE);
                        return;
                    }
                    a3.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(5));
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f72674a, false, 83876, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72674a, false, 83876, new Class[0], Void.TYPE);
                        return;
                    }
                    a3.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(6));
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72674a, false, 83871, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72674a, false, 83871, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    a3.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(1));
                    if (!z && StoryFeedFragment.this.f4138e.getAlpha() == 0.0f) {
                        com.ss.android.ugc.aweme.story.base.view.a.a.a(StoryFeedFragment.this.f4138e, 0.0f, 1.0f);
                    }
                }

                public final void b(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72674a, false, 83872, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72674a, false, 83872, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    a3.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(2));
                    if (StoryFeedFragment.this.f4138e.getAlpha() > 0.0f) {
                        com.ss.android.ugc.aweme.story.base.view.a.a.a(StoryFeedFragment.this.f4138e, 1.0f, 0.0f);
                    }
                }

                public final void c(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72674a, false, 83873, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72674a, false, 83873, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    a3.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(3, z));
                }
            };
            if (PatchProxy.isSupport(new Object[]{r2}, parentViewPager, ParentViewPager.f72058a, false, 82577, new Class[]{ParentViewPager.a.class}, Void.TYPE)) {
                ParentViewPager parentViewPager2 = parentViewPager;
                PatchProxy.accessDispatch(new Object[]{r2}, parentViewPager2, ParentViewPager.f72058a, false, 82577, new Class[]{ParentViewPager.a.class}, Void.TYPE);
            } else {
                if (parentViewPager.i == null) {
                    parentViewPager.i = new ArrayList<>();
                }
                parentViewPager.i.add(r2);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83844, new Class[0], Void.TYPE);
            return;
        }
        org.greenrobot.eventbus.c.a().a((Object) this);
        com.ss.android.ugc.aweme.story.base.a.a.a().a("key_delete_user").observe(this, new Observer<Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72672a;

            public final void onChanged(@Nullable Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, f72672a, false, 83870, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj}, this, f72672a, false, 83870, new Class[]{Object.class}, Void.TYPE);
                    return;
                }
                int a2 = g.a((String) obj, (com.ss.android.ugc.aweme.story.feed.model.a) StoryFeedFragment.this.f4137d.d());
                StoryMainPagerAdapter storyMainPagerAdapter = StoryFeedFragment.this.f4136c;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, storyMainPagerAdapter, StoryMainPagerAdapter.f72715e, false, 84008, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    StoryMainPagerAdapter storyMainPagerAdapter2 = storyMainPagerAdapter;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, storyMainPagerAdapter2, StoryMainPagerAdapter.f72715e, false, 84008, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    storyMainPagerAdapter.g.remove(a2);
                    storyMainPagerAdapter.notifyDataSetChanged();
                }
                if (StoryFeedFragment.this.f4136c.getCount() <= 0 && StoryFeedFragment.this.getActivity() != null) {
                    StoryFeedFragment.this.getActivity().supportFinishAfterTransition();
                }
            }
        });
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f4134a, false, 83842, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f4134a, false, 83842, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.qj, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f4134a, false, 83855, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f4134a, false, 83855, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f4135b = (ParentViewPager) inflate.findViewById(C0906R.id.duu);
            this.f4138e = inflate.findViewById(C0906R.id.cp0);
            if (!ToolUtils.isEmui("") || Build.VERSION.SDK_INT < 24) {
                this.f4135b.setPageTransformer(false, new CubeOutTransformer());
            } else {
                this.f4135b.setPageTransformer(false, new ForegroundToBackgroundTransformer());
            }
            this.f4135b.addOnPageChangeListener(this);
            this.f4136c = new StoryMainPagerAdapter(getActivity(), LayoutInflater.from(getActivity()), this, this.f4135b);
            new com.ss.android.ugc.aweme.story.base.view.viewpager.a(getActivity()).a(this.f4135b);
            this.f4135b.setAdapter(this.f4136c);
            if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83856, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83856, new Class[0], Void.TYPE);
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4138e.getLayoutParams();
                layoutParams.width = UIUtils.getScreenWidth(getContext()) / 3;
                this.f4138e.setLayoutParams(layoutParams);
            }
            if (PatchProxy.isSupport(new Object[0], this, f4134a, false, 83851, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4134a, false, 83851, new Class[0], Void.TYPE);
            } else {
                CommentBottomSheetBehavior b2 = CommentBottomSheetBehavior.b(this.f4135b);
                final MutableLiveData<com.ss.android.ugc.aweme.story.feed.a.c> a2 = ((ViewPagerMotionEventViewModel) ViewModelProviders.of(getActivity()).get(ViewPagerMotionEventViewModel.class)).a();
                b2.p = false;
                b2.q = true;
                b2.l = new CommentBottomSheetBehavior.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72679a;

                    public final void a(@NonNull View view, float f2) {
                        Window window;
                        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f72679a, false, 83879, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f72679a, false, 83879, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.story.feed.a.c.f72456b = true;
                        if (StoryFeedFragment.this.getActivity() != null) {
                            window = StoryFeedFragment.this.getActivity().getWindow();
                        } else {
                            window = null;
                        }
                        if (window != null) {
                            if (Float.isNaN(f2)) {
                                ((StoryDetailActivity) StoryFeedFragment.this.getActivity()).i.setAlpha(1.0f);
                            } else {
                                ((StoryDetailActivity) StoryFeedFragment.this.getActivity()).i.setAlpha(1.0f - Math.abs(f2));
                            }
                        }
                    }

                    public final void a(@NonNull View view, int i) {
                        boolean z = false;
                        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f72679a, false, 83878, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f72679a, false, 83878, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == 1) {
                            z = true;
                        }
                        com.ss.android.ugc.aweme.story.feed.a.c.f72456b = z;
                        if (i == 5) {
                            if (!(StoryFeedFragment.this.getActivity() == null || StoryFeedFragment.this.getActivity().getWindow() == null)) {
                                ChangeUserModeViewModel.a(StoryFeedFragment.this.getActivity()).setValue("slide_down");
                                StoryFeedFragment.this.getActivity().supportFinishAfterTransition();
                            }
                        } else if (i == 4 || i == 3) {
                            a2.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(2));
                            if (StoryFeedFragment.this.f4138e.getAlpha() > 0.0f) {
                                com.ss.android.ugc.aweme.story.base.view.a.a.a(StoryFeedFragment.this.f4138e, 1.0f, 0.0f);
                            }
                        }
                    }
                };
                b2.f72312e = true;
                if (com.ss.android.ugc.aweme.story.base.utils.b.a().b()) {
                    b2.a(com.bytedance.ies.dmt.ui.e.a.a(getActivity()) + b() + com.ss.android.ugc.aweme.story.base.utils.b.a().c());
                } else if (com.ss.android.ugc.aweme.story.base.utils.c.a(getContext(), getView())) {
                    b2.a(com.bytedance.ies.dmt.ui.e.a.a(getActivity()) + b() + com.ss.android.ugc.aweme.story.base.utils.c.a(getContext()));
                } else {
                    b2.a(com.bytedance.ies.dmt.ui.e.a.a(getActivity()) + b());
                }
            }
        }
        return inflate;
    }
}
