package com.ss.android.ugc.aweme.discover.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.apm.monitor.annotation.AddFragmentTrace;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity;
import com.ss.android.ugc.aweme.commercialize.loft.c.a;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.loft.model.h;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver;
import com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity;
import com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;
import com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper;
import com.ss.android.ugc.aweme.discover.base.c;
import com.ss.android.ugc.aweme.discover.helper.ChangeCoverScrollListener;
import com.ss.android.ugc.aweme.discover.helper.OnCategoryScrollListener;
import com.ss.android.ugc.aweme.discover.helper.d;
import com.ss.android.ugc.aweme.discover.mob.b;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel;
import com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.ss.android.ugc.aweme.feed.ui.au;
import com.ss.android.ugc.aweme.friends.adapter.DividerItemDecorationWithMargin;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@AddFragmentTrace
public class DiscoverFragment extends AmeBaseFragment implements Observer<Boolean>, e.b, CategoryListAdapter.b, c, OnCategoryScrollListener.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42863a;

    /* renamed from: b  reason: collision with root package name */
    protected SearchStateViewModel f42864b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.loft.c.a f42865c;

    /* renamed from: d  reason: collision with root package name */
    DiscoverViewModel f42866d;

    /* renamed from: e  reason: collision with root package name */
    public LoftNestedRefreshLayout f42867e;

    /* renamed from: f  reason: collision with root package name */
    boolean f42868f;
    boolean g;
    private RecyclerView.LayoutManager h;
    private AnalysisStayTimeFragmentComponent i;
    private int j = 1;
    private MainAnimViewModel k;
    private boolean l;
    private OnCategoryScrollListener m;
    @BindView(2131494325)
    RelativeLayout mFlRootContainer;
    @BindView(2131495411)
    DiscoveryRecyclerView mListView;
    @BindView(2131493358)
    BannerSwipeRefreshLayout mRefreshLayout;
    @BindView(2131497328)
    View mStatusBar;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    private ChangeCoverScrollListener n;
    private long o = -1;
    private Handler p = new Handler(Looper.getMainLooper());
    private a q;
    private boolean r;
    private boolean s = true;
    private long t = SystemClock.elapsedRealtime();
    private Bitmap u;

    public enum a {
        DISCOVER,
        DISCOVER_LEFT,
        HOT_SEARCH,
        HOT_SEARCH_WITH_DISCOVER,
        KEYWORD_SEARCH;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Float f2) {
        if (this.f42865c != null) {
            com.ss.android.ugc.aweme.commercialize.loft.c.a aVar = this.f42865c;
            float floatValue = f2.floatValue();
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, aVar, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31381, new Class[]{Float.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commercialize.loft.c.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(floatValue)}, aVar2, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31381, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            aVar.i = UIUtils.px2dip(aVar.s, floatValue);
            if (floatValue == 0.0f) {
                if (aVar.k == a.b.BACKING || aVar.k == a.b.REFRESH_BACK) {
                    aVar.a(a.b.CLOSE);
                }
            } else if (aVar.i < 60) {
                if (aVar.k == a.b.CLOSE || aVar.k == a.b.PULL_DOWN_SECOND || aVar.k == a.b.PULL_DOWN_THIRD) {
                    aVar.a(a.b.PULL_DOWN_FIRST);
                }
            } else if (aVar.i < 120) {
                if (aVar.k == a.b.CLOSE || aVar.k == a.b.PULL_DOWN_FIRST || aVar.k == a.b.PULL_DOWN_THIRD) {
                    aVar.a(a.b.PULL_DOWN_SECOND);
                }
            } else if (aVar.k == a.b.CLOSE || aVar.k == a.b.PULL_DOWN_FIRST || aVar.k == a.b.PULL_DOWN_SECOND) {
                aVar.a(a.b.PULL_DOWN_THIRD);
            }
            if (aVar.h == 0.0f) {
                aVar.z();
            }
            if (aVar.k == a.b.PULL_DOWN_FIRST || aVar.k == a.b.PULL_DOWN_SECOND || aVar.k == a.b.PULL_DOWN_THIRD) {
                float measuredHeight = 1.0f - (floatValue / ((float) aVar.g().getMeasuredHeight()));
                aVar.f39162e = UIUtils.dip2Px(aVar.s, -40.0f * measuredHeight);
                aVar.f39163f = UIUtils.dip2Px(aVar.s, measuredHeight * -15.0f);
                aVar.i().setTranslationY(aVar.f39162e);
                aVar.h().setTranslationY(aVar.f39163f);
            }
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31382, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31382, new Class[0], Void.TYPE);
            } else if ((aVar.k == a.b.BACKING || aVar.k == a.b.PULL_DOWN_FIRST) && aVar.i < 60) {
                float f3 = ((aVar.h / 2.0f) * ((float) (60 - aVar.i))) / 60.0f;
                float f4 = ((float) aVar.i) / 60.0f;
                aVar.r().setVisibility(0);
                aVar.u().setScaleX(f4);
                aVar.u().setScaleY(f4);
                aVar.s().setTranslationX(f3);
                aVar.t().setTranslationX(-f3);
            } else if (aVar.k != a.b.TO_REFRESH || aVar.i < 60) {
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31391, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31391, new Class[0], Void.TYPE);
                    return;
                }
                aVar.u().setScaleX(1.0f);
                aVar.u().setScaleY(1.0f);
                aVar.s().setTranslationX(0.0f);
                aVar.t().setTranslationX(0.0f);
            } else {
                float f5 = ((aVar.h / 2.0f) * ((float) (aVar.j - aVar.i))) / ((float) (aVar.j - 60));
                float f6 = ((float) (aVar.i - 60)) / ((float) (aVar.j - 60));
                aVar.r().setVisibility(0);
                aVar.u().setScaleX(f6);
                aVar.u().setScaleY(f6);
                aVar.s().setTranslationX(f5);
                aVar.t().setTranslationX(-f5);
            }
        }
    }

    public final void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42863a, false, 37514, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42863a, false, 37514, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.f54175b.setValue(Boolean.valueOf(!z2));
        }
        if (isViewValid() && this.mListView != null) {
            if (z2 || this.j == 1) {
                CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f42115f;
                if (categoryListAdapter != null) {
                    categoryListAdapter.a(z2);
                }
                if (j()) {
                    if (!z2) {
                        this.o = System.currentTimeMillis();
                    } else if (this.o != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - this.o;
                        if (currentTimeMillis > 0) {
                            com.ss.android.common.lib.a.a(getContext(), "stay_time", "discovery", currentTimeMillis, 0);
                        }
                        this.o = -1;
                    }
                }
                if (!z2) {
                    b.a();
                }
            }
        }
    }

    private boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37538, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37538, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a()) {
            return true;
        } else {
            return AbTestManager.a().O();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37536, new Class[0], Void.TYPE);
        } else if (this.q == a.HOT_SEARCH_WITH_DISCOVER && d.a() && this.j == 1) {
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37506, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            e();
            this.g = false;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37523, new Class[0], Void.TYPE);
            return;
        }
        h();
        g();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37530, new Class[0], Void.TYPE);
            return;
        }
        this.p.removeCallbacksAndMessages(null);
        this.f42867e.setExpand(false);
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f42863a, false, 37539, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("discovery");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37539, new Class[0], Analysis.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37515, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ((e) e.m.a(getContext())).a();
        this.p.removeCallbacksAndMessages(null);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37511, new Class[0], Void.TYPE);
        } else if (this.s) {
            this.s = false;
        } else if (this.mListView != null) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mListView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition instanceof HotSearchImageViewHolder) {
                ((HotSearchImageViewHolder) findViewHolderForAdapterPosition).d();
                return;
            }
            if (findViewHolderForAdapterPosition instanceof HotSearchWordViewHolder) {
                ((HotSearchWordViewHolder) findViewHolderForAdapterPosition).a();
            }
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37524, new Class[0], Void.TYPE);
            return;
        }
        if (((this.mRefreshLayout != null && this.mRefreshLayout.isEnabled()) || (this.f42867e != null && this.f42867e.isEnabled())) && this.mStatusView != null && this.mStatusView.c(true)) {
            if (this.mStatusView.f20470b) {
                this.f42866d.a(true);
                return;
            }
            this.f42866d.a(true, true);
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37525, new Class[0], Void.TYPE);
            return;
        }
        if (((this.mRefreshLayout != null && this.mRefreshLayout.isEnabled()) || (this.f42867e != null && this.f42867e.isEnabled())) && this.mStatusView != null && this.mStatusView.c(true)) {
            b(true);
            i();
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37526, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            this.t = SystemClock.elapsedRealtime();
            ((e) e.m.a(getContext())).a((e.b) this, (String) null);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37507, new Class[0], Void.TYPE);
            return;
        }
        if (this.mRefreshLayout != null) {
            this.mRefreshLayout.setEnabled(!((e) e.m.a(getContext())).b());
        }
        if (this.f42867e != null) {
            this.f42867e.setEnabled(((e) e.m.a(getContext())).b());
            this.f42867e.setEnableExpand(((e) e.m.a(getContext())).c());
        }
        b(((e) e.m.a(getContext())).f39241c);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37516, new Class[0], Void.TYPE);
            return;
        }
        CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f42115f;
        if (categoryListAdapter != null) {
            categoryListAdapter.a(true);
        }
        if (this.mListView != null) {
            this.mListView.setAdapter(null);
        }
        super.onDestroyView();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37512, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37512, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        x.a().e().a(Boolean.FALSE);
        if (this.j == 1) {
            if (this.k != null) {
                this.k.f54175b.setValue(Boolean.FALSE);
            }
            if (this.i != null) {
                this.i.onPause();
            }
            if (!isHidden()) {
                ((CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f42115f).a(true);
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37510, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        boolean z = true;
        if (this.f42867e != null) {
            if (!((e) e.m.a(getContext())).b() || this.j != 1) {
                this.f42867e.setEnabled(false);
            } else {
                c();
            }
        }
        if (this.j == 1) {
            if (this.i != null) {
                this.i.onResume();
            }
            if (this.k != null && this.k.a() && TextUtils.equals((CharSequence) this.k.f54178e.getValue(), "page_discover")) {
                this.k.f54175b.setValue(Boolean.TRUE);
            }
            CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f42115f;
            if (getActivity() instanceof MainActivity) {
                z = ((MainActivity) getActivity()).isInDiscoveryPage();
            } else if (!(getActivity() instanceof DiscoverActivity)) {
                z = false;
            }
            if (!isHidden() && z) {
                categoryListAdapter.a(false);
                if (this.m != null && this.m.a()) {
                    f();
                }
            }
            if (!isHidden() && au.a()) {
                b.a();
            }
            b();
            if (this.f42865c != null) {
                com.ss.android.ugc.aweme.commercialize.loft.c.a aVar = this.f42865c;
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31380, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31380, new Class[0], Void.TYPE);
                } else {
                    aVar.a(a.b.CLOSE);
                }
            }
            if (this.f42868f || this.l) {
                a(((e) e.m.a(getContext())).f39241c, false);
                this.l = false;
                this.f42868f = false;
            }
        }
    }

    public final void a(int i2) {
        this.j = i2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.arch.b bVar) {
        this.f42864b.hotSearchLiveData.setValue(bVar);
    }

    public final void a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        this.f42867e = loftNestedRefreshLayout;
    }

    public final void b(@Nullable com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        com.ss.android.ugc.aweme.commercialize.loft.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f42863a, false, 37508, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f42863a, false, 37508, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new t(this, aVar2));
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42863a, false, 37513, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42863a, false, 37513, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        a(!z);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42863a, false, 37541, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42863a, false, 37541, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mRefreshLayout.isEnabled()) {
            this.mRefreshLayout.setSelected(z);
        }
        if (this.f42867e != null && this.f42867e.isEnabled()) {
            this.f42867e.setSelected(z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(@NotNull com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        if (isResumed()) {
            com.ss.android.ugc.aweme.commercialize.loft.c.a aVar2 = this.f42865c;
            if (PatchProxy.isSupport(new Object[]{aVar}, aVar2, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31399, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commercialize.loft.c.a aVar3 = aVar2;
                PatchProxy.accessDispatch(new Object[]{aVar}, aVar3, com.ss.android.ugc.aweme.commercialize.loft.c.a.f39158a, false, 31399, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
            } else if (aVar != null && aVar.getStatus() == h.f39270c) {
                aVar2.y();
                aVar2.x();
                aVar2.m = new AnimatorSet();
                aVar2.l = false;
                if (aVar2.n == null) {
                    aVar2.n = aVar2.a((View) aVar2.l(), -80.0f, -100.0f);
                }
                if (aVar2.o == null) {
                    aVar2.o = aVar2.a((View) aVar2.m(), -110.0f, -125.0f);
                }
                if (aVar2.p == null) {
                    aVar2.p = aVar2.a((View) aVar2.n(), 68.0f, 53.0f);
                }
                if (aVar2.q == null) {
                    aVar2.q = aVar2.a((View) aVar2.o(), 21.0f, 1.0f);
                }
                AnimatorSet animatorSet = aVar2.m;
                if (animatorSet != null) {
                    animatorSet.playTogether(new Animator[]{aVar2.n, aVar2.o, aVar2.p, aVar2.q});
                }
                AnimatorSet animatorSet2 = aVar2.m;
                if (animatorSet2 != null) {
                    animatorSet2.setDuration(2000);
                }
                AnimatorSet animatorSet3 = aVar2.m;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
            }
            this.f42868f = true;
            this.p.postDelayed(new l(this, aVar), 1000);
            return;
        }
        this.l = true;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f42863a, false, 37500, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f42863a, false, 37500, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.discover.ui.DiscoverFragment");
        super.onCreate(bundle);
        this.f42864b = (SearchStateViewModel) ViewModelProviders.of(getActivity()).get(SearchStateViewModel.class);
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37501, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37501, new Class[0], Void.TYPE);
            return;
        }
        this.f42866d = (DiscoverViewModel) ViewModelProviders.of((Fragment) this).get(DiscoverViewModel.class);
        this.f42866d.f43214e.observe(this, new h(this));
        this.f42866d.f43211b.observe(this, new i(this));
        this.f42866d.f43212c.observe(this, new m(this));
        this.f42866d.f43213d.observe(this, new n(this));
        this.f42866d.f43215f.observe(this, new o(this));
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42863a, false, 37517, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42863a, false, 37517, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (this.f42867e != null) {
            if (z) {
                this.f42867e.setEnabled(false);
            } else {
                c();
            }
        }
        if (isViewValid()) {
            if (z || this.j == 1) {
                if (this.i != null) {
                    this.i.a(z);
                }
                if (!z && this.m != null && this.m.a()) {
                    f();
                }
                if (this.k != null) {
                    this.k.f54175b.setValue(Boolean.valueOf(!z));
                }
                if (this.mListView != null) {
                    CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f42115f;
                    if (categoryListAdapter != null) {
                        categoryListAdapter.a(z);
                    }
                    if (!z) {
                        b.a();
                    }
                }
            }
        }
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f42863a, false, 37537, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f42863a, false, 37537, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setHeader(view2);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        Boolean bool = (Boolean) obj;
        if (PatchProxy.isSupport(new Object[]{bool}, this, f42863a, false, 37522, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, f42863a, false, 37522, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        if (bool.booleanValue()) {
            if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37521, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37521, new Class[0], Void.TYPE);
            } else if (this.mStatusView != null && this.mStatusView.g()) {
                this.mStatusView.setVisibility(0);
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37520, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37520, new Class[0], Void.TYPE);
            } else if (this.mStatusView != null && this.mStatusView.g()) {
                this.mStatusView.setVisibility(4);
            }
        }
        boolean booleanValue = bool.booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, this, f42863a, false, 37518, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, this, f42863a, false, 37518, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mListView != null) {
            if (this.m != null) {
                this.m.a(this.mListView, booleanValue);
            }
            int childCount = this.mListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(this.mListView.getChildAt(i2));
                if ((childViewHolder instanceof HotVideoViewHolder) && childViewHolder.getItemViewType() == CategoryListAdapter.a.b()) {
                    ((HotVideoViewHolder) childViewHolder).a(booleanValue);
                }
            }
        }
    }

    @OnClick({2131494329, 2131498110})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f42863a, false, 37531, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f42863a, false, 37531, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.ag6) {
            r.a("qr_code_scan_enter", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "discovery").f34114b);
            QRCodePermissionActivity.a(getContext(), false);
        } else if (id == C0906R.id.di0 && !ex.c()) {
            AbTestManager.a().G().intValue();
            r.onEvent(MobClick.obtain().setEventName("enter_search").setLabelName("discovery"));
            if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37532, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37532, new Class[0], Void.TYPE);
                return;
            }
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context, (byte) 1}, null, HotSearchAndDiscoveryActivity.f3024a, true, 35432, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, (byte) 1}, null, HotSearchAndDiscoveryActivity.f3024a, true, 35432, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intent intent = new Intent(context, HotSearchAndDiscoveryActivity.class);
            intent.putExtra("intent_extra_from_discover", true);
            context.startActivity(intent);
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f42863a, false, 37527, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f42863a, false, 37527, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
        } else if (getActivity() != null) {
            r.a("loft_load", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("duration", SystemClock.elapsedRealtime() - this.t).a("activity_id", aVar.getId()).a("status", 0).f34114b);
            if (this.f42865c == null) {
                this.f42865c = new com.ss.android.ugc.aweme.commercialize.loft.c.a(getActivity(), this.f42867e.f39075b, true);
                this.f42867e.setHeader(this.f42865c.w());
                this.f42865c.a(aVar, a.c.SECOND_LOFT, (View.OnClickListener) new j(this));
                this.f42865c.f39161d = new k(this, aVar);
            }
            this.f42865c.g = aVar;
            c();
        }
    }

    public static DiscoverFragment a(a aVar, boolean z) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f42863a, true, 37499, new Class[]{a.class, Boolean.TYPE}, DiscoverFragment.class)) {
            return (DiscoverFragment) PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z)}, null, f42863a, true, 37499, new Class[]{a.class, Boolean.TYPE}, DiscoverFragment.class);
        }
        DiscoverFragment discoverFragment = new DiscoverFragment();
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("discover_style", aVar2);
        bundle.putBoolean("discover_show_search_title_bar", z);
        discoverFragment.setArguments(bundle);
        return discoverFragment;
    }

    public final void a(int i2, Throwable th) {
        int i3 = i2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), th2}, this, f42863a, false, 37528, new Class[]{Integer.TYPE, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), th2}, this, f42863a, false, 37528, new Class[]{Integer.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        if (th2 == null) {
            r.a("loft_load", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", i3).f34114b);
        } else if (th2 instanceof BaseException) {
            BaseException baseException = (BaseException) th2;
            r.a("loft_load", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", i3).a("error_code", baseException.getErrorCode()).a("error_msg", baseException.getErrorMessage()).f34114b);
        } else {
            r.a("loft_load", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", i3).a("error_msg", th.getMessage()).f34114b);
        }
        c();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f42863a, false, 37504, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f42863a, false, 37504, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (PatchProxy.isSupport(new Object[]{arguments}, this, f42863a, false, 37509, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arguments}, this, f42863a, false, 37509, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            this.q = (a) arguments.getSerializable("discover_style");
            this.r = arguments.getBoolean("discover_show_search_title_bar", true);
            if (this.q == null) {
                this.q = a.HOT_SEARCH_WITH_DISCOVER;
            }
        }
        com.bytedance.ies.dmt.ui.widget.c a2 = com.ss.android.ugc.aweme.views.e.a(getActivity(), new p(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a2);
        if (this.mStatusView != null) {
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).a((int) C0906R.string.b5r).c((View) dmtDefaultView));
            this.mStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(C0906R.dimen.lj));
        }
        if (com.ss.android.ugc.aweme.discover.helper.b.a()) {
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getContext(), 2);
            wrapGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42869a;

                public int getSpanSize(int i) {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42869a, false, 37556, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42869a, false, 37556, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    } else if (DiscoverFragment.this.mListView == null) {
                        return 1;
                    } else {
                        CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) DiscoverFragment.this.mListView.getAdapter()).f42115f;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, categoryListAdapter, CategoryListAdapter.f41553a, false, 35504, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                            CategoryListAdapter categoryListAdapter2 = categoryListAdapter;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, categoryListAdapter2, CategoryListAdapter.f41553a, false, 35504, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
                        } else {
                            int a2 = categoryListAdapter.a();
                            if (a2 >= 0 && i >= a2) {
                                z = true;
                            }
                        }
                        if (z) {
                            return 1;
                        }
                        return 2;
                    }
                }
            });
            this.h = wrapGridLayoutManager;
            this.mListView.setLayoutManager(this.h);
        } else {
            this.h = new WrapLinearLayoutManager(getContext(), 1, false);
            this.mListView.setLayoutManager(this.h);
        }
        this.mListView.getItemAnimator().setChangeDuration(0);
        if (this.mListView instanceof FpsRecyclerView) {
            this.mListView.setLabel("discover_list");
        }
        CategoryListAdapter categoryListAdapter = new CategoryListAdapter(this);
        com.ss.android.ugc.aweme.discover.delegate.a aVar = categoryListAdapter.f41556c;
        if (aVar != null) {
            aVar.f42238c = this;
        }
        this.m = new OnCategoryScrollListener();
        this.m.f42301b = this;
        this.mListView.addOnScrollListener(this.m);
        this.n = new ChangeCoverScrollListener();
        this.mListView.addOnScrollListener(this.n);
        LoadMoreAdapterWrapper loadMoreAdapterWrapper = new LoadMoreAdapterWrapper(categoryListAdapter);
        q qVar = new q(this);
        if (PatchProxy.isSupport(new Object[]{qVar}, loadMoreAdapterWrapper, LoadMoreAdapterWrapper.g, false, 36129, new Class[]{LoadMoreAdapterWrapper.c.class}, Void.TYPE)) {
            LoadMoreAdapterWrapper loadMoreAdapterWrapper2 = loadMoreAdapterWrapper;
            PatchProxy.accessDispatch(new Object[]{qVar}, loadMoreAdapterWrapper2, LoadMoreAdapterWrapper.g, false, 36129, new Class[]{LoadMoreAdapterWrapper.c.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(qVar, "listener");
            loadMoreAdapterWrapper.i = qVar;
        }
        this.mListView.setAdapter(loadMoreAdapterWrapper);
        if (!com.ss.android.ugc.aweme.discover.helper.b.a()) {
            DiscoveryRecyclerView discoveryRecyclerView = this.mListView;
            AnonymousClass2 r0 = new DividerItemDecorationWithMargin(getResources().getColor(C0906R.color.zk), (int) UIUtils.dip2Px(getContext(), 16.0f), (int) UIUtils.dip2Px(getContext(), 16.0f), 1, categoryListAdapter) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42871a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ CategoryListAdapter f42872b;

                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    View view2 = view;
                    RecyclerView recyclerView2 = recyclerView;
                    if (PatchProxy.isSupport(new Object[]{rect, view2, recyclerView2, state}, this, f42871a, false, 37557, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{rect, view2, recyclerView2, state}, this, f42871a, false, 37557, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                        return;
                    }
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    if (childAdapterPosition > 0 && childAdapterPosition < this.f42872b.getItemCount() && this.f42872b.getItemViewType(childAdapterPosition) == CategoryListAdapter.a.a()) {
                        super.getItemOffsets(rect, view, recyclerView, state);
                    }
                }

                {
                    this.f42872b = r6;
                }
            };
            discoveryRecyclerView.addItemDecoration(r0);
        }
        if (PatchProxy.isSupport(new Object[0], this, f42863a, false, 37505, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42863a, false, 37505, new Class[0], Void.TYPE);
        } else {
            this.mRefreshLayout.a(false, (int) UIUtils.dip2Px(getActivity(), 49.0f), (int) UIUtils.dip2Px(getActivity(), 113.0f));
            this.mRefreshLayout.setOnRefreshListener(new r(this));
            if (this.f42867e != null) {
                this.f42867e.setIRefresh(new com.ss.android.ugc.aweme.commercialize.loft.b.d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42874a;

                    public final void e() {
                        if (PatchProxy.isSupport(new Object[0], this, f42874a, false, 37558, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42874a, false, 37558, new Class[0], Void.TYPE);
                            return;
                        }
                        if (DiscoverFragment.this.f42865c != null) {
                            DiscoverFragment.this.f42865c.e();
                        }
                    }

                    public final void f() {
                        if (PatchProxy.isSupport(new Object[0], this, f42874a, false, 37559, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42874a, false, 37559, new Class[0], Void.TYPE);
                        } else if (DiscoverFragment.this.isViewValid()) {
                            if (!NetworkUtils.isNetworkAvailable(DiscoverFragment.this.getContext())) {
                                com.bytedance.ies.dmt.ui.d.a.b(DiscoverFragment.this.getContext(), (int) C0906R.string.bgf).a();
                                DiscoverFragment.this.f42867e.setRefreshing(false);
                                return;
                            }
                            DiscoverFragment.this.d();
                            if (DiscoverFragment.this.f42865c != null) {
                                DiscoverFragment.this.f42865c.f();
                            }
                        }
                    }
                });
                this.f42867e.a((com.ss.android.ugc.aweme.commercialize.loft.b.b) new com.ss.android.ugc.aweme.commercialize.loft.b.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42876a;

                    public final void c() {
                        if (PatchProxy.isSupport(new Object[0], this, f42876a, false, 37563, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42876a, false, 37563, new Class[0], Void.TYPE);
                            return;
                        }
                        if (DiscoverFragment.this.f42865c != null) {
                            DiscoverFragment.this.f42865c.c();
                        }
                    }

                    public final void d() {
                        if (PatchProxy.isSupport(new Object[0], this, f42876a, false, 37560, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42876a, false, 37560, new Class[0], Void.TYPE);
                            return;
                        }
                        DiscoverFragment.this.c();
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f42876a, false, 37561, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42876a, false, 37561, new Class[0], Void.TYPE);
                            return;
                        }
                        x.a().e().a(Boolean.FALSE);
                        DiscoverFragment.this.b(((e) e.m.a(DiscoverFragment.this.getContext())).f39241c);
                        if (DiscoverFragment.this.f42865c != null) {
                            DiscoverFragment.this.f42865c.a();
                        }
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f42876a, false, 37562, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42876a, false, 37562, new Class[0], Void.TYPE);
                            return;
                        }
                        if (DiscoverFragment.this.f42865c != null) {
                            DiscoverFragment.this.f42865c.b();
                        }
                        com.ss.android.ugc.aweme.commercialize.loft.model.a aVar = ((e) e.m.a(DiscoverFragment.this.getContext())).f39241c;
                        if (aVar != null) {
                            r.a("enter_second_floor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_method", "slide_down").a("is_success", "success").a("enter_status", String.valueOf(aVar.getStatus())).f34114b);
                        }
                    }
                });
                this.f42867e.getTotalConsume().observe(this, new s(this));
                c();
            }
        }
        d();
        RecyclerViewVisibilityObserver.a(this.mListView, categoryListAdapter);
        this.k = (MainAnimViewModel) ViewModelProviders.of(getActivity()).get(MainAnimViewModel.class);
        this.k.f54175b.observe(this, this);
    }

    /* access modifiers changed from: package-private */
    public void a(com.ss.android.ugc.aweme.commercialize.loft.model.a aVar, boolean z) {
        Bitmap bitmap;
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42863a, false, 37529, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, f42863a, false, 37529, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (getActivity() != null && aVar != null && !TextUtils.isEmpty(aVar.getId()) && isResumed()) {
            this.g = true;
            this.f42868f = false;
            if (this.u == null) {
                getActivity().getWindow().getDecorView().setDrawingCacheEnabled(true);
                this.u = getActivity().getWindow().getDecorView().getDrawingCache();
            }
            Context context = getContext();
            String id = aVar.getId();
            if (z) {
                bitmap = this.u;
            } else {
                bitmap = null;
            }
            LoftPlayActivity.a(context, id, 0, bitmap);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f42863a, false, 37503, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f42863a, false, 37503, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ni, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        if (!j()) {
            this.i = new AnalysisStayTimeFragmentComponent(this, true);
        }
        return inflate;
    }
}
