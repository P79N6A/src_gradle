package com.ss.android.ugc.aweme.feed.ui;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.feed.adapter.s;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.guide.FeedFollowEmptyGuideView;
import com.ss.android.ugc.aweme.feed.h.q;
import com.ss.android.ugc.aweme.feed.h.r;
import com.ss.android.ugc.aweme.feed.listener.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.j;
import com.ss.android.ugc.aweme.feed.ui.seekbar.a.a;
import com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel;
import com.ss.android.ugc.aweme.follow.LiveTagViewModel;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.legoImp.inflate.m;
import com.ss.android.ugc.aweme.live.feedpage.g;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.bk;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

public class FeedFollowFragment extends BaseFeedListFragment<r> implements s, e, al {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f3198e;

    /* renamed from: f  reason: collision with root package name */
    j f3199f = new j("homepage_follow", 1);
    public String g = "";
    DataCenter h;
    ag i;
    boolean j = false;
    boolean k = false;
    @BindView(2131494307)
    LiveSkyLightTouchEventFrameLayout mFlContentContainer;
    @BindView(2131494331)
    View mSkyLightBottomContainer;
    @BindView(2131498149)
    DmtTextView mSkyLightStyleBTxt;
    @BindView(2131495592)
    LinearLayout mSkyLightStyleCLayout;
    @BindView(2131494332)
    FrameLayout mSkyLightTopContainer;
    @BindView(2131497676)
    View mTopSpace;
    private int q = -1;
    private FeedFollowEmptyGuideView r;
    private LiveTagViewModel s;
    private boolean t = false;
    private long u = 0;

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void a(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3198e, false, 42573, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3198e, false, 42573, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getUserVisibleHint() && isViewValid()) {
            super.a(z);
            bg.a(new a(1, this.f3199f.ag()));
            o();
            if (z) {
                this.f3199f.v();
            } else {
                DmtStatusView b2 = b(false);
                if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42579, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42579, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z2 = this.q == 0 && d.a().getCurUser().getFollowingCount() > 0 && ((r) this.f3195c).c();
                }
                if (z2 || c.a().d(5) || ((b2 == null || b2.c()) && ((r) this.f3195c).c())) {
                    d(false);
                    if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42582, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42582, new Class[0], Void.TYPE);
                    } else {
                        c.a().a(5);
                        bg.a(new com.ss.android.ugc.aweme.message.b.c(5));
                    }
                }
                this.f3199f.aV();
            }
            e(false);
            g(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, boolean z2, boolean z3) {
        boolean z4 = z;
        boolean z5 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3198e, false, 42598, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3198e, false, 42598, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.i != null && isViewValid()) {
            int a2 = this.i.a(this.mTopSpace != null && this.mTopSpace.getLayoutParams().height > 0);
            if (z4) {
                this.i.a();
                this.i.a(this.mFlContentContainer, 0.0f, (float) a2, z5);
                this.mFlContentContainer.setNeedIntercept(true);
            } else {
                this.i.a(this.mFlContentContainer, (float) a2, 0.0f, z5);
                this.mFlContentContainer.setNeedIntercept(false);
            }
            com.ss.android.ugc.aweme.main.a.a().b(z);
            if (MainPageExperimentHelper.b() && this.h != null) {
                this.h.a("follow_live_skylight_arrow_show", (Object) Boolean.valueOf(z));
            }
            this.j = z4;
            if (z4) {
                this.u = System.currentTimeMillis();
                com.ss.android.ugc.aweme.feed.j.a.f45560b.b(z3 ? "manual_click" : "auto_show");
                return;
            }
            com.ss.android.ugc.aweme.feed.j.a.f45560b.c(z3 ? "manual_click" : "auto_show");
            com.ss.android.ugc.aweme.feed.j.a.f45560b.a(z3 ? "manual_click" : "auto_show", System.currentTimeMillis() - this.u);
        }
    }

    public final void a(@NotNull List<g> list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f3198e, false, 42605, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f3198e, false, 42605, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null && isViewValid()) {
            this.i.a(list, this.j);
            if (ag.d()) {
                this.mSkyLightStyleBTxt.setText(GlobalContext.getContext().getString(C0906R.string.agh, new Object[]{Integer.valueOf(list.size())}));
            } else if (ag.e() && this.h != null) {
                this.h.a("follow_live_skylight_count", (Object) Integer.valueOf(list.size()));
            }
        }
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42572, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42572, new Class[0], Void.TYPE);
            return;
        }
        if (this.t && d.a().isLogin()) {
            this.t = false;
            d(false);
        }
    }

    public final void L_() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42569, new Class[0], Void.TYPE);
        } else if (MainPageExperimentHelper.b()) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(this.n, "list");
        } else {
            super.L_();
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42584, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42584, new Class[0], Boolean.TYPE)).booleanValue();
        }
        r rVar = (r) this.f3195c;
        if (rVar.f2978e == null || !((b) rVar.f2978e).i) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ com.ss.android.ugc.aweme.common.f.b c() {
        if (!PatchProxy.isSupport(new Object[0], this, f3198e, false, 42565, new Class[0], r.class)) {
            return new r();
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42565, new Class[0], r.class);
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42564, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42564, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3194b == null || this.f3194b.getParent() != this.mLoadMoreLayout) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean j() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42574, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42574, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.f3199f.ar()) {
            z = true;
        }
        return z;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42597, new Class[0], Void.TYPE);
            return;
        }
        a(!this.j, true, true);
        com.ss.android.ugc.aweme.feed.j.a.f45560b.b();
    }

    @OnClick({2131498149})
    public void onSkyLightStyleBTxtClick() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42593, new Class[0], Void.TYPE);
            return;
        }
        a(true, true, true);
        a((View) this.mSkyLightStyleBTxt, false, true);
        com.ss.android.ugc.aweme.feed.j.a.f45560b.b();
    }

    @OnClick({2131495592})
    public void onSkyLightStyleCTxtClick() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42594, new Class[0], Void.TYPE);
            return;
        }
        f(true);
        com.ss.android.ugc.aweme.feed.j.a.f45560b.b();
    }

    public final boolean p() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42588, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42588, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3199f != null && this.f3199f.aM()) {
            z = true;
        }
        return z;
    }

    @NonNull
    public SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42557, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42557, new Class[0], SparseArray.class);
        }
        SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents = super.registerComponents();
        registerComponents.append(b.a.f34653c, this.f3199f);
        return registerComponents;
    }

    public final void w_() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42585, new Class[0], Void.TYPE);
            return;
        }
        FollowFeedTriggerViewModel.a(getActivity()).b(4);
        q();
    }

    private boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42586, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42586, new Class[0], Boolean.TYPE)).booleanValue();
        }
        FeedImpressionReporter.a("feed").a(((r) this.f3195c).d());
        return ((r) this.f3195c).a(4, com.ss.android.ugc.aweme.follow.presenter.d.a(4, 2, 1, FeedImpressionReporter.a("feed").c()).a(FeedImpressionReporter.a("feed").a()).a((Integer) 0).a());
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42566, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42566, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ((r) this.f3195c).h = true;
        FollowFeedTriggerViewModel.a(getActivity()).b(5);
        return q();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42568, new Class[0], Void.TYPE);
        } else if (MainPageExperimentHelper.b()) {
            FragmentActivity activity = getActivity();
            if ((activity instanceof MainActivity) && ((MainActivity) activity).isUnderSecondTab() && !dq.a()) {
                com.ss.android.ugc.aweme.newfollow.g.a.a();
            }
        } else {
            super.h();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42603, new Class[0], Void.TYPE);
        } else if (this.i != null && isViewValid()) {
            if (MainPageExperimentHelper.n()) {
                switch (AbTestManager.a().bN()) {
                    case 1:
                        a(false, false, false);
                        return;
                    case 2:
                        a(false, false, false);
                        a((View) this.mSkyLightStyleBTxt, false, false);
                        return;
                    case 3:
                        a((View) this.mSkyLightStyleCLayout, false, false);
                        this.i.b();
                        return;
                    default:
                        return;
                }
            } else {
                if (ag.e()) {
                    if (this.h != null) {
                        this.h.a("follow_live_skylight_btn_show", (Object) Boolean.FALSE);
                    }
                    a(false, false, false);
                }
            }
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42576, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f3199f.n();
        if (this.i != null) {
            ag agVar = this.i;
            if (PatchProxy.isSupport(new Object[0], agVar, ag.f46463a, false, 42806, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], agVar, ag.f46463a, false, 42806, new Class[0], Void.TYPE);
                return;
            }
            q qVar = agVar.f46465b;
            if (qVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            if (PatchProxy.isSupport(new Object[0], qVar, q.f45521a, false, 42058, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], qVar, q.f45521a, false, 42058, new Class[0], Void.TYPE);
                return;
            }
            qVar.f45522b.dispose();
        }
    }

    public void onResume() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42570, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.q == -1) {
            this.q = d.a().getCurUser().getFollowingCount();
        }
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42571, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42571, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (g()) {
                Fragment curFragment = ((MainActivity) getActivity()).getCurFragment();
                if (curFragment instanceof MainFragment) {
                    z = ((MainFragment) curFragment).m();
                }
            }
            z = false;
        }
        if (z) {
            o();
        }
        if (this.k) {
            if (this.i != null) {
                this.i.a(2);
            }
            this.k = false;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3198e, false, 42595, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3198e, false, 42595, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.i != null && ((i2 != 1 && i2 != 3) || !this.j)) {
            this.i.a(i2);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3198e, false, 42604, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3198e, false, 42604, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a((List<g>) new ArrayList<g>(), false);
            if (i2 != 0) {
                l();
            }
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3198e, false, 42575, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3198e, false, 42575, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.c(z);
        bg.a(new a(2, this.f3199f.ag()));
        this.f3199f.p(z);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3198e, false, 42601, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3198e, false, 42601, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.i != null && isViewValid()) {
            this.i.a((View) this.mSkyLightStyleCLayout);
            com.ss.android.ugc.aweme.feed.j.a aVar = com.ss.android.ugc.aweme.feed.j.a.f45560b;
            if (z) {
                str = "manual_click";
            } else {
                str = "auto_show";
            }
            aVar.b(str);
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3198e, false, 42583, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3198e, false, 42583, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        this.f3199f.f(z);
    }

    public final DmtStatusView a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f3198e, false, 42563, new Class[]{Context.class}, DmtStatusView.class)) {
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[]{context}, this, f3198e, false, 42563, new Class[]{Context.class}, DmtStatusView.class);
        }
        DmtStatusView dmtStatusView = new DmtStatusView(getContext());
        this.r = new FeedFollowEmptyGuideView(getContext(), this, this.n);
        dmtStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).b(this.r.getEmptyView()).b(new c.a(getActivity()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46168a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46168a, false, 42610, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46168a, false, 42610, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                FeedFollowFragment.this.d(false);
            }
        }).f20493a).c(1));
        dmtStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(C0906R.dimen.lj));
        return dmtStatusView;
    }

    @Subscribe
    public void onVideoPublishEvent(ar arVar) {
        FollowFeed followFeed;
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, f3198e, false, 42589, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, f3198e, false, 42589, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        if (arVar2.f45292b == 15) {
            Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a((Aweme) arVar2.f45293c);
            if (a2 != null && !com.ss.android.ugc.aweme.feed.k.b.c(a2)) {
                r rVar = (r) this.f3195c;
                if (PatchProxy.isSupport(new Object[]{a2}, null, f3198e, true, 42592, new Class[]{Aweme.class}, FollowFeed.class)) {
                    followFeed = (FollowFeed) PatchProxy.accessDispatch(new Object[]{a2}, null, f3198e, true, 42592, new Class[]{Aweme.class}, FollowFeed.class);
                } else {
                    FollowFeed followFeed2 = new FollowFeed();
                    followFeed2.setFeedType(1);
                    followFeed2.setAweme(a2);
                    followFeed = followFeed2;
                }
                rVar.a((Object) followFeed, 0);
                DmtStatusView b2 = b(true);
                if (b2 != null) {
                    b2.b();
                }
            }
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f3198e, false, 42561, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f3198e, false, 42561, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f3195c == null || ((r) this.f3195c).i() == null)) {
            ((com.ss.android.ugc.aweme.follow.presenter.b) ((r) this.f3195c).i()).f47768e = j2;
        }
    }

    public final boolean d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3198e, false, 42577, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3198e, false, 42577, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f3198e, false, 42580, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f3198e, false, 42580, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.h != null && MainPageExperimentHelper.n()) {
            this.h.a("CHANGE_FOLLOW_DOT", (Object) Boolean.FALSE);
        }
        if (PatchProxy.isSupport(new Object[]{(byte) 0, 150}, this, f3198e, false, 42581, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0, 150}, this, f3198e, false, 42581, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.h != null && MainPageExperimentHelper.n()) {
            this.h.a("HIDE_PILL_NOTICE", (Object) 150);
        }
        if (!d.a().isLogin()) {
            this.f3199f.y_();
            bg.a(new ae("HOME"));
            return false;
        }
        if (this.i != null) {
            this.i.a(0);
        }
        if (!super.d(z)) {
            return false;
        }
        if (!z) {
            FollowFeedTriggerViewModel.a(getActivity()).a((Integer) 3);
        }
        r rVar = (r) this.f3195c;
        ((com.ss.android.ugc.aweme.follow.presenter.b) rVar.f2978e).f47767d = z;
        rVar.f45528b = z;
        rVar.i = !g();
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42578, new Class[0], Void.TYPE);
        } else if (!FeedImpressionReporter.a("feed").b()) {
            FeedImpressionReporter.a("feed").f57392c = new HashSet<>(FeedImpressionReporter.a("feed").f57391b);
        }
        ((r) this.f3195c).a(1, com.ss.android.ugc.aweme.follow.presenter.d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).a(Integer.valueOf(this.s.a())).a());
        this.s.f47732b = false;
        this.q = d.a().getCurUser().getFollowingCount();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc A[SYNTHETIC] */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMaskLayerCancelFollowEvent(com.ss.android.ugc.aweme.follow.b.a r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3198e
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.b.a> r1 = com.ss.android.ugc.aweme.follow.b.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42590(0xa65e, float:5.9681E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3198e
            r3 = 0
            r4 = 42590(0xa65e, float:5.9681E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.b.a> r1 = com.ss.android.ugc.aweme.follow.b.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f47750a
            if (r0 == 0) goto L_0x0149
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getAuthor()
            if (r1 == 0) goto L_0x0149
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getAuthor()
            java.lang.String r1 = r1.getUid()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0052
            goto L_0x0149
        L_0x0052:
            com.ss.android.ugc.aweme.feed.ui.ag r1 = r7.i
            if (r1 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.feed.ui.ag r1 = r7.i
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
            boolean r2 = r7.j
            r3 = 2
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r0
            java.lang.Byte r4 = java.lang.Byte.valueOf(r2)
            r11[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.ag.f46463a
            r14 = 0
            r15 = 42814(0xa73e, float:5.9995E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r10] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r9] = r5
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r1
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x00b2
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r2)
            r11[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.ag.f46463a
            r14 = 0
            r15 = 42814(0xa73e, float:5.9995E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0[r9] = r2
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r1
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x011b
        L_0x00b2:
            java.lang.String r3 = "uid"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.util.List<com.ss.android.ugc.aweme.live.feedpage.g> r3 = r1.f46468e
            int r3 = r3.size()
            java.util.List<com.ss.android.ugc.aweme.live.feedpage.g> r4 = r1.f46468e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L_0x00cc:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00fe
            java.lang.Object r6 = r4.next()
            r8 = r6
            com.ss.android.ugc.aweme.live.feedpage.g r8 = (com.ss.android.ugc.aweme.live.feedpage.g) r8
            com.bytedance.android.livesdkapi.depend.model.live.Room r8 = r8.f53405b
            if (r8 == 0) goto L_0x00f7
            com.bytedance.android.live.base.model.user.User r8 = r8.getOwner()
            if (r8 == 0) goto L_0x00f7
            java.lang.String r8 = r8.getIdStr()
            if (r8 == 0) goto L_0x00f7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r11 = r0
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r8 = android.text.TextUtils.equals(r8, r11)
            if (r8 != 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r8 = 0
            goto L_0x00f8
        L_0x00f7:
            r8 = 1
        L_0x00f8:
            if (r8 == 0) goto L_0x00cc
            r5.add(r6)
            goto L_0x00cc
        L_0x00fe:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r5)
            r1.f46468e = r0
            java.util.List<com.ss.android.ugc.aweme.live.feedpage.g> r0 = r1.f46468e
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0115
            if (r2 == 0) goto L_0x0115
            r1.a()
        L_0x0115:
            java.util.List<com.ss.android.ugc.aweme.live.feedpage.g> r0 = r1.f46468e
            int r0 = r0.size()
        L_0x011b:
            if (r0 != 0) goto L_0x0121
            r18.l()
            return
        L_0x0121:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mSkyLightStyleBTxt
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            r3 = 2131560065(0x7f0d0681, float:1.8745492E38)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r10] = r5
            java.lang.String r2 = r2.getString(r3, r4)
            r1.setText(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.h
            if (r1 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.h
            java.lang.String r2 = "follow_live_skylight_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
        L_0x0148:
            return
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment.onMaskLayerCancelFollowEvent(com.ss.android.ugc.aweme.follow.b.a):void");
    }

    public final void a(DmtStatusView.a aVar) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f3198e, false, 42562, new Class[]{DmtStatusView.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f3198e, false, 42562, new Class[]{DmtStatusView.a.class}, Void.TYPE);
            return;
        }
        this.mRefreshLayout.a(false, (int) UIUtils.dip2Px(getActivity(), 49.0f), (int) UIUtils.dip2Px(getActivity(), 113.0f));
        this.f3196d = new bk(this.mRefreshLayout);
    }

    public final void a(View view, boolean z) {
        float f2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3198e, false, 42600, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, this, f3198e, false, 42600, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.i != null && isViewValid() && view2 != null) {
            ag agVar = this.i;
            if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z)}, agVar, ag.f46463a, false, 42813, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                ag agVar2 = agVar;
                PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, agVar2, ag.f46463a, false, 42813, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            float f3 = -180.0f;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = -180.0f;
            }
            if (!z) {
                f3 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "rotation", new float[]{f2, f3});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "rotation");
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.start();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        FollowLiveSkyLightListView followLiveSkyLightListView;
        int i2;
        View view2 = view;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{view2, bundle2}, this, f3198e, false, 42559, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle2}, this, f3198e, false, 42559, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        e(false);
        g(true);
        if (PatchProxy.isSupport(new Object[0], this, f3198e, false, 42560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3198e, false, 42560, new Class[0], Void.TYPE);
        } else {
            this.h = DataCenter.a(ViewModelProviders.of(getActivity()), (LifecycleOwner) this);
        }
        if (TextUtils.isEmpty(this.g) && (getActivity() instanceof MainActivity)) {
            this.g = ((MainActivity) getActivity()).getPushAwemeId();
        }
        this.s = LiveTagViewModel.a(getActivity());
        this.f3199f.a(view2, bundle2);
        this.f3199f.a((com.ss.android.ugc.aweme.feed.adapter.r) this);
        this.f3199f.f3177c = this;
        this.f3199f.a((com.ss.android.ugc.aweme.feed.listener.a) this);
        this.f3199f.H = this;
        this.f3199f.ak = "feed";
        ((r) this.f3195c).a(this.f3199f);
        ((r) this.f3195c).g = this.f3199f;
        ((r) this.f3195c).a((com.ss.android.ugc.aweme.common.f.d) this.f3199f);
        ((r) this.f3195c).a(new com.ss.android.ugc.aweme.follow.presenter.b());
        ((com.ss.android.ugc.aweme.follow.presenter.b) ((r) this.f3195c).i()).f47768e = System.currentTimeMillis();
        if (d.a().isLogin()) {
            if (getActivity() != null) {
                FollowPageFirstFrameViewModel.a(getActivity()).b();
            }
            int i3 = FollowFeedTriggerViewModel.a(getActivity()).f47720b;
            if (i3 == 2) {
                i2 = 8;
            } else if (i3 == 3) {
                i2 = 7;
            } else {
                i2 = 2;
            }
            FollowFeedTriggerViewModel.a(getActivity()).a(Integer.valueOf(i2));
            ((r) this.f3195c).a(1, com.ss.android.ugc.aweme.follow.presenter.d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).a(Integer.valueOf(this.s.a())).b(this.g).a());
            this.s.f47732b = false;
        } else {
            this.t = true;
            this.f3199f.y_();
        }
        com.ss.android.ugc.aweme.main.a.a().b(false);
        if (ag.c()) {
            Context context = view.getContext();
            if (PatchProxy.isSupport(new Object[]{context}, this, f3198e, false, 42596, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f3198e, false, 42596, new Class[]{Context.class}, Void.TYPE);
            } else {
                this.f3199f.f3178d = new i(this);
                this.i = new ag();
                ag agVar = this.i;
                if (PatchProxy.isSupport(new Object[]{context, this}, agVar, ag.f46463a, false, 42799, new Class[]{Context.class, FeedFollowFragment.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, this}, agVar, ag.f46463a, false, 42799, new Class[]{Context.class, FeedFollowFragment.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    Intrinsics.checkParameterIsNotNull(this, "fragment");
                    agVar.f46465b = new q(this);
                    if (ag.h.b()) {
                        agVar.f46467d = new ah(context);
                        ah ahVar = agVar.f46467d;
                        if (ahVar == null) {
                            Intrinsics.throwNpe();
                        }
                        if (PatchProxy.isSupport(new Object[0], ahVar, ah.f46474a, false, 42835, new Class[0], FollowLiveSkyLightListView.class)) {
                            followLiveSkyLightListView = (FollowLiveSkyLightListView) PatchProxy.accessDispatch(new Object[0], ahVar, ah.f46474a, false, 42835, new Class[0], FollowLiveSkyLightListView.class);
                        } else {
                            followLiveSkyLightListView = ahVar.f46476c;
                            if (followLiveSkyLightListView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("listView");
                            }
                        }
                        agVar.f46466c = followLiveSkyLightListView;
                    } else {
                        agVar.f46466c = new FollowLiveSkyLightListView(context);
                        this.mSkyLightTopContainer.removeAllViews();
                        FrameLayout frameLayout = this.mSkyLightTopContainer;
                        FollowLiveSkyLightListView followLiveSkyLightListView2 = agVar.f46466c;
                        if (followLiveSkyLightListView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mListView");
                        }
                        frameLayout.addView(followLiveSkyLightListView2);
                    }
                }
                ag agVar2 = this.i;
                j jVar = new j(this);
                if (PatchProxy.isSupport(new Object[]{jVar}, agVar2, ag.f46463a, false, 42800, new Class[]{Function0.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jVar}, agVar2, ag.f46463a, false, 42800, new Class[]{Function0.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(jVar, "callback");
                    FollowLiveSkyLightListView followLiveSkyLightListView3 = agVar2.f46466c;
                    if (followLiveSkyLightListView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mListView");
                    }
                    followLiveSkyLightListView3.setEnterLiveCallBack(jVar);
                }
                ag agVar3 = this.i;
                FrameLayout frameLayout2 = this.mSkyLightTopContainer;
                View view3 = this.mSkyLightBottomContainer;
                if (PatchProxy.isSupport(new Object[]{frameLayout2, view3}, agVar3, ag.f46463a, false, 42804, new Class[]{View.class, View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{frameLayout2, view3}, agVar3, ag.f46463a, false, 42804, new Class[]{View.class, View.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(frameLayout2, "topContainer");
                    Intrinsics.checkParameterIsNotNull(view3, "bottomContainer");
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin += u.a(50.0d) + p.c();
                        frameLayout2.setLayoutParams(marginLayoutParams);
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        if (layoutParams2 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams2.topMargin += u.a(58.0d) + p.c();
                            view3.setLayoutParams(marginLayoutParams2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                this.mFlContentContainer.setScrollPredicate(new k(this));
                this.mFlContentContainer.setCallBack(new l(this));
            }
            a(0);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f3198e, false, 42558, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return ((m) com.ss.android.ugc.aweme.lego.a.i.b(m.class)).a(getContext(), (int) C0906R.layout.nr);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f3198e, false, 42558, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f3198e, false, 42567, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f3198e, false, 42567, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && this.r != null) {
            FeedFollowEmptyGuideView feedFollowEmptyGuideView = this.r;
            if (PatchProxy.isSupport(new Object[0], feedFollowEmptyGuideView, FeedFollowEmptyGuideView.f3151a, false, 41198, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], feedFollowEmptyGuideView, FeedFollowEmptyGuideView.f3151a, false, 41198, new Class[0], Void.TYPE);
                return;
            }
            feedFollowEmptyGuideView.a();
        }
    }

    public final void a(View view, boolean z, boolean z2) {
        View view2 = view;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3198e, false, 42599, new Class[]{View.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f3198e, false, 42599, new Class[]{View.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.i != null && isViewValid() && view2 != null) {
            if (z) {
                this.i.a(view, z3);
            } else {
                this.i.b(view, z3);
            }
        }
    }
}
