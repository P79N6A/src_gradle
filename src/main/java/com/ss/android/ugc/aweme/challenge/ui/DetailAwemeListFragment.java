package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.adapter.DetailAwemeAdapter;
import com.ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.a.a;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.presenter.j;
import com.ss.android.ugc.aweme.poi.model.i;
import com.ss.android.ugc.aweme.profile.adapter.AmeDecoration;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.setting.f;
import com.ss.android.ugc.aweme.u.an;
import com.ss.android.ugc.aweme.utils.br;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONObject;

public class DetailAwemeListFragment extends AmeBaseFragment implements d, LoadMoreRecyclerViewAdapter.a, b<AnimatedViewHolder>, com.ss.android.ugc.aweme.common.f.d, b.a, m, AbstractBaseDetailFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2813a;

    /* renamed from: b  reason: collision with root package name */
    public int f2814b;

    /* renamed from: c  reason: collision with root package name */
    public String f2815c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.f.b f2816d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2817e;

    /* renamed from: f  reason: collision with root package name */
    protected AnimatedAdapter f2818f;
    public aa<a> g;
    public int h;
    public com.ss.android.ugc.aweme.fragment.a i;
    ViewGroup j;
    DmtTextView k;
    DmtTextView l;
    public boolean m;
    @BindView(2131494240)
    public RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @Nullable
    @BindView(2131497341)
    FrameLayout mStatusViewContainer;
    public boolean n;
    public SparseArray<AnimatedAdapter> o = new SparseArray<>();
    public SparseBooleanArray p = new SparseBooleanArray();
    public SparseBooleanArray q = new SparseBooleanArray();
    public SparseArray<DmtStatusView> r = new SparseArray<>();
    private int s = 3;
    private String t;
    private String u;
    private com.ss.android.ugc.aweme.common.d.a v;
    private String w;
    private SparseArray<com.ss.android.ugc.aweme.common.f.b> x = new SparseArray<>();

    public final void a(List list, int i2) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final View f() {
        return this.mListView;
    }

    private boolean t() {
        if (this.f2814b == 3 || this.f2814b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f2814b == 1 || this.f2814b == 0) {
            return true;
        }
        return false;
    }

    public final List<Aweme> l() {
        if (this.f2818f != null) {
            return this.f2818f.mItems;
        }
        return null;
    }

    private String v() {
        int i2 = this.f2814b;
        if (i2 == 15) {
            return "prop_page";
        }
        switch (i2) {
            case 0:
            case 1:
                return "single_song";
            case 2:
            case 3:
                return "challenge";
            default:
                return null;
        }
    }

    private boolean w() {
        if (this.f2814b == 5 || this.f2814b == 4 || this.f2814b == 6 || this.f2814b == 7) {
            return true;
        }
        return false;
    }

    private String x() {
        if (this.f2814b == 5 || this.f2814b == 7) {
            return "poi_page_new";
        }
        return "poi_page_hot";
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26242, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26242, new Class[0], Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.a();
        }
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26256, new Class[0], Void.TYPE);
            return;
        }
        loadMore();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26252, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.mListView.getChildCount() > 0) {
            this.mListView.smoothScrollToPosition(0);
        }
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f2813a, false, 26215, new Class[0], Boolean.TYPE)) {
            return this.p.get(this.f2814b, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26215, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f2813a, false, 26253, new Class[0], Boolean.TYPE)) {
            return this.q.get(this.f2814b, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26253, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        boolean z;
        if (this.f2814b == 2) {
            this.f2814b = 3;
            z = true;
        } else {
            this.f2814b = 2;
            z = false;
        }
        y();
        z();
        c(z);
        ChallengeDetailViewModel.a(getActivity()).f35728b.setValue(Integer.valueOf(this.f2814b));
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26224, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f2816d != null) {
            this.f2816d.k();
        }
        s();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26226, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (getUserVisibleHint()) {
            s();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26225, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (getUserVisibleHint()) {
            a(false, true);
        }
    }

    private AnimatedAdapter p() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26227, new Class[0], AnimatedAdapter.class)) {
            return (AnimatedAdapter) PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26227, new Class[0], AnimatedAdapter.class);
        } else if (!w()) {
            return new DetailAwemeAdapter(this.t, this, this);
        } else {
            CellFeedAdapter cellFeedAdapter = new CellFeedAdapter(null, this.t, this, null, 3, this.f2814b);
            return cellFeedAdapter;
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26233, new Class[0], Void.TYPE);
            return;
        }
        DmtTextView b2 = b((int) C0906R.string.b6z);
        b2.setOnClickListener(new p(this));
        this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).b((View) b((int) C0906R.string.aaw)).c((View) b2));
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26240, new Class[0], Void.TYPE);
            return;
        }
        if (!w() && (this.f2818f instanceof DetailAwemeAdapter)) {
            DetailAwemeAdapter detailAwemeAdapter = (DetailAwemeAdapter) this.f2818f;
            if (isViewValid() && this.mListView != null && this.f2818f != null && !detailAwemeAdapter.g) {
                detailAwemeAdapter.g = true;
                int childCount = this.mListView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mListView.findViewHolderForAdapterPosition(i2);
                    if (findViewHolderForAdapterPosition instanceof DetailAwemeViewHolder) {
                        DetailAwemeViewHolder detailAwemeViewHolder = (DetailAwemeViewHolder) findViewHolderForAdapterPosition;
                        detailAwemeViewHolder.b();
                        a((AnimatedViewHolder) detailAwemeViewHolder);
                    }
                }
            }
        }
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26247, new Class[0], Void.TYPE);
            return;
        }
        if (!w()) {
            this.h = this.f2814b;
        } else if (this.f2814b == 4) {
            this.h = 1;
        } else if (this.f2814b == 5) {
            this.h = 2;
        } else if (this.f2814b == 6) {
            this.h = 3;
        } else if (this.f2814b == 7) {
            this.h = 4;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26241, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!getUserVisibleHint() || !f.a(getContext()) || !NetworkUtils.isNetworkAvailable(getActivity())) {
                s();
            } else {
                a(false, false);
            }
        }
    }

    public final JSONObject i() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26259, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26259, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        String str = "";
        try {
            com.ss.android.ugc.aweme.common.a i2 = this.f2816d.i();
            if (i2 instanceof com.ss.android.ugc.aweme.challenge.c.a) {
                str = ((ChallengeAwemeList) ((com.ss.android.ugc.aweme.challenge.c.a) i2).getData()).getRequestId();
            } else if (i2 instanceof j) {
                str = ((MusicAwemeList) ((j) i2).getData()).getRequestId();
            } else if (i2 instanceof com.ss.android.ugc.aweme.poi.model.j) {
                str = ((i) ((com.ss.android.ugc.aweme.poi.model.j) i2).getData()).getRequestId();
            }
            jSONObject.put("request_id", str);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String j() {
        String requestId;
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26260, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26260, new Class[0], String.class);
        }
        String str = "";
        try {
            com.ss.android.ugc.aweme.common.a i2 = this.f2816d.i();
            if (i2 instanceof com.ss.android.ugc.aweme.challenge.c.a) {
                requestId = ((ChallengeAwemeList) ((com.ss.android.ugc.aweme.challenge.c.a) i2).getData()).getRequestId();
            } else if (i2 instanceof j) {
                requestId = ((MusicAwemeList) ((j) i2).getData()).getRequestId();
            } else {
                if (i2 instanceof com.ss.android.ugc.aweme.poi.model.j) {
                    requestId = ((i) ((com.ss.android.ugc.aweme.poi.model.j) i2).getData()).getRequestId();
                }
                return str;
            }
            str = requestId;
        } catch (Exception unused) {
        }
        return str;
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26246, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26246, new Class[0], Void.TYPE);
            return;
        }
        u();
        if (this.f2816d != null && !TextUtils.isEmpty(this.f2815c)) {
            if (!this.f2817e || TextUtils.isEmpty(this.w)) {
                this.f2816d.a(4, this.f2815c, Integer.valueOf(this.h), Boolean.FALSE);
            } else {
                this.f2816d.a(4, this.w, Integer.valueOf(this.h), Boolean.TRUE);
            }
        }
    }

    private void y() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26264, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusViewContainer != null) {
            if (this.r.size() == 0) {
                this.r.put(this.f2814b, this.mStatusView);
                return;
            }
            if (this.mStatusView != null) {
                this.mStatusView.setAlpha(0.0f);
            }
            this.mStatusView = this.r.get(this.f2814b);
            if (this.mStatusView == null) {
                this.mStatusView = new DmtStatusView(this.mStatusViewContainer.getContext());
                q();
                this.mStatusViewContainer.addView(this.mStatusView, new FrameLayout.LayoutParams(-1, -1));
                this.r.put(this.f2814b, this.mStatusView);
                return;
            }
            this.mStatusView.setAlpha(1.0f);
        }
    }

    private void z() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26265, new Class[0], Void.TYPE);
            return;
        }
        this.f2816d = this.x.get(this.f2814b);
        if (this.f2816d == null) {
            this.f2816d = c(this.f2814b);
            if (this.f2816d != null) {
                this.f2816d.a(new c<Aweme>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35553a;

                    /* renamed from: b  reason: collision with root package name */
                    final int f35554b = DetailAwemeListFragment.this.f2814b;

                    public final void c(List<Aweme> list, boolean z) {
                    }

                    public final void d(Exception exc) {
                    }

                    public final void z_() {
                    }

                    public final void n_() {
                        if (PatchProxy.isSupport(new Object[0], this, f35553a, false, 26274, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f35553a, false, 26274, new Class[0], Void.TYPE);
                            return;
                        }
                        DmtStatusView b2 = b();
                        if (b2 != null && !b2.f20470b) {
                            b2.d();
                        }
                    }

                    public final void s_() {
                        if (PatchProxy.isSupport(new Object[0], this, f35553a, false, 26278, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f35553a, false, 26278, new Class[0], Void.TYPE);
                            return;
                        }
                        AnimatedAdapter animatedAdapter = DetailAwemeListFragment.this.o.get(this.f35554b);
                        if (animatedAdapter != null) {
                            animatedAdapter.showLoadMoreLoading();
                        }
                    }

                    private DmtStatusView b() {
                        if (PatchProxy.isSupport(new Object[0], this, f35553a, false, 26281, new Class[0], DmtStatusView.class)) {
                            return (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, f35553a, false, 26281, new Class[0], DmtStatusView.class);
                        } else if (!DetailAwemeListFragment.this.isViewValid()) {
                            return null;
                        } else {
                            if (DetailAwemeListFragment.this.mStatusViewContainer == null) {
                                return DetailAwemeListFragment.this.mStatusView;
                            }
                            return DetailAwemeListFragment.this.r.get(this.f35554b);
                        }
                    }

                    public final void y_() {
                        if (PatchProxy.isSupport(new Object[0], this, f35553a, false, 26276, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f35553a, false, 26276, new Class[0], Void.TYPE);
                        } else if (DetailAwemeListFragment.this.isViewValid()) {
                            DmtStatusView b2 = b();
                            if (DetailAwemeListFragment.this.k()) {
                                DetailAwemeListFragment detailAwemeListFragment = DetailAwemeListFragment.this;
                                if (PatchProxy.isSupport(new Object[0], detailAwemeListFragment, DetailAwemeListFragment.f2813a, false, 26245, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], detailAwemeListFragment, DetailAwemeListFragment.f2813a, false, 26245, new Class[0], Void.TYPE);
                                } else if (detailAwemeListFragment.g != null) {
                                    detailAwemeListFragment.g.a(new a(detailAwemeListFragment.f2814b));
                                }
                            } else if (b2 != null) {
                                b2.e();
                            }
                            if (DetailAwemeListFragment.this.i != null && DetailAwemeListFragment.this.f2814b == this.f35554b) {
                                DetailAwemeListFragment.this.i.a(DetailAwemeListFragment.this.c(), false);
                            }
                            DetailAwemeListFragment.this.p.put(this.f35554b, false);
                        }
                    }

                    public final void c(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f35553a, false, 26279, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f35553a, false, 26279, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        AnimatedAdapter animatedAdapter = DetailAwemeListFragment.this.o.get(this.f35554b);
                        if (animatedAdapter != null) {
                            animatedAdapter.showLoadMoreError();
                        }
                    }

                    public final void b(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f35553a, false, 26275, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f35553a, false, 26275, new Class[]{Exception.class}, Void.TYPE);
                        } else if (DetailAwemeListFragment.this.isViewValid()) {
                            DmtStatusView b2 = b();
                            if (b2 != null) {
                                b2.f();
                            }
                            if (DetailAwemeListFragment.this.i != null && DetailAwemeListFragment.this.f2814b == this.f35554b) {
                                DetailAwemeListFragment.this.i.a(DetailAwemeListFragment.this.c(), false);
                            }
                            DetailAwemeListFragment.this.p.put(this.f35554b, false);
                        }
                    }

                    public final void a(List<Aweme> list, boolean z) {
                        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f35553a, false, 26277, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f35553a, false, 26277, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                        } else if (DetailAwemeListFragment.this.isViewValid()) {
                            AnimatedAdapter animatedAdapter = DetailAwemeListFragment.this.o.get(this.f35554b);
                            DmtStatusView b2 = b();
                            if (!(animatedAdapter == null || b2 == null)) {
                                animatedAdapter.resetLoadMoreState();
                                animatedAdapter.setData(com.ss.android.ugc.aweme.commercialize.utils.c.a(list));
                                if (!CollectionUtils.isEmpty(list)) {
                                    b2.k();
                                }
                                b2.setVisibility(4);
                                if (!z) {
                                    animatedAdapter.setShowFooter(false);
                                    animatedAdapter.setLoadMoreListener(null);
                                }
                            }
                            DetailAwemeListFragment.this.q.put(this.f35554b, true);
                            if (DetailAwemeListFragment.this.i != null && DetailAwemeListFragment.this.f2814b == this.f35554b) {
                                DetailAwemeListFragment.this.i.a(DetailAwemeListFragment.this.c(), true);
                            }
                            DetailAwemeListFragment.this.p.put(this.f35554b, false);
                            if (DetailAwemeListFragment.this.getUserVisibleHint() && DetailAwemeListFragment.this.f2814b == this.f35554b) {
                                DetailAwemeListFragment.this.a(false, false);
                            }
                        }
                    }

                    public final void b(List<Aweme> list, boolean z) {
                        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f35553a, false, 26280, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f35553a, false, 26280, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                        } else if (DetailAwemeListFragment.this.isViewValid()) {
                            AnimatedAdapter animatedAdapter = DetailAwemeListFragment.this.o.get(this.f35554b);
                            DmtStatusView b2 = b();
                            if (!(animatedAdapter == null || b2 == null)) {
                                animatedAdapter.resetLoadMoreState();
                                if (!CollectionUtils.isEmpty(list) || !z) {
                                    if (animatedAdapter.mItems.size() != list.size() || !animatedAdapter.mItems.containsAll(list)) {
                                        animatedAdapter.setDataAfterLoadMore(com.ss.android.ugc.aweme.commercialize.utils.c.a(list));
                                    }
                                    b2.setVisibility(4);
                                    DetailAwemeListFragment.this.q.put(this.f35554b, z);
                                    DetailAwemeListFragment.this.b(z);
                                } else {
                                    if (DetailAwemeListFragment.this.f2814b == this.f35554b) {
                                        DetailAwemeListFragment.this.loadMore();
                                    }
                                }
                            }
                        }
                    }
                });
                this.f2816d.a((com.ss.android.ugc.aweme.common.f.d) this);
                this.x.put(this.f2814b, this.f2816d);
            }
            z = true;
        } else {
            z = false;
        }
        this.f2818f = this.o.get(this.f2814b);
        if (this.f2818f == null) {
            this.f2818f = p();
            this.f2818f.setLoadMoreListener(this);
            this.f2818f.mLabel = "detail_list";
            if (this.f2818f instanceof DetailAwemeAdapter) {
                ((DetailAwemeAdapter) this.f2818f).g = this.m;
            }
            this.o.put(this.f2814b, this.f2818f);
            z = true;
        }
        this.mListView.setAdapter(this.f2818f);
        if (!w() && (this.f2818f instanceof DetailAwemeAdapter)) {
            ((DetailAwemeAdapter) this.f2818f).g = this.m;
        }
        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        } else if (!this.n && z) {
            o();
        } else if (!getUserVisibleHint() || !c()) {
            if (getUserVisibleHint()) {
                a(false, false);
            }
        } else {
            o();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26231, new Class[0], Void.TYPE);
            return;
        }
        if (k()) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aal, null);
            ((TextView) inflate.findViewById(C0906R.id.dnc)).setText("");
            DmtTextView b2 = b((int) C0906R.string.b6z);
            b2.setOnClickListener(new o(this));
            this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).b(inflate).c((View) b2));
        }
        this.mStatusView.e();
    }

    /* renamed from: e */
    public final void o() {
        byte b2;
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26234, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!this.mStatusView.f20470b || c()) {
                b2 = 1;
            } else {
                b2 = 0;
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2), 0L}, this, f2813a, false, 26235, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2), 0L}, this, f2813a, false, 26235, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE);
                return;
            }
            if (isViewValid()) {
                a(false);
                u();
                if (this.f2816d != null && !TextUtils.isEmpty(this.f2815c)) {
                    this.f2816d.a(1, this.f2815c, Integer.valueOf(this.h), Boolean.valueOf(this.f2817e));
                    if (b2 != 0) {
                        this.mStatusView.d();
                    }
                }
            }
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26228, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26229, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26229, new Class[0], Void.TYPE);
            } else if (this.mListView != null && isViewValid()) {
                int childCount = this.mListView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.mListView.getChildAt(i2);
                    if (childAt != null) {
                        RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(childAt);
                        if (childViewHolder != null && childViewHolder.getItemViewType() == 0) {
                            ((AnimatedViewHolder) childViewHolder).h();
                        }
                    }
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        super.onStop();
        if (getUserVisibleHint()) {
            s();
        }
    }

    public final void a(com.ss.android.ugc.aweme.fragment.a aVar) {
        this.i = aVar;
    }

    public final void a(String str) {
        this.f2815c = str;
        this.f2817e = false;
    }

    @Subscribe
    public void onBlockUserEvent(com.ss.android.ugc.aweme.feed.f.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2813a, false, 26251, new Class[]{com.ss.android.ugc.aweme.feed.f.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2813a, false, 26251, new Class[]{com.ss.android.ugc.aweme.feed.f.b.class}, Void.TYPE);
            return;
        }
        o();
    }

    private DmtTextView b(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26232, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26232, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        dmtTextView.setTextColor(getResources().getColor(C0906R.color.zv));
        dmtTextView.setText(i2);
        return dmtTextView;
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2813a, false, 26262, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2813a, false, 26262, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            this.k.setText(C0906R.string.rl);
            this.k.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839325), null, null, null);
        } else {
            this.k.setText(C0906R.string.rn);
            this.k.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839326), null, null, null);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2813a, false, 26216, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2813a, false, 26216, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.p.put(this.f2814b, z);
    }

    public final void a_(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26258, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26258, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f2818f.notifyItemRemoved(i2);
            if (this.f2818f.getBasicItemCount() == 0) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.e();
            }
        }
    }

    @Subscribe
    public void onDynamicEvent(com.ss.android.ugc.aweme.challenge.a.c cVar) {
        com.ss.android.ugc.aweme.challenge.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f2813a, false, 26248, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f2813a, false, 26248, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE);
        } else if (cVar2.f35317a == 0) {
            a(true, false);
        } else {
            s();
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f2813a, false, 26249, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f2813a, false, 26249, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (isViewValid() && this.f2818f != null) {
            this.f2818f.a(followStatus);
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, f2813a, false, 26250, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, f2813a, false, 26250, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        if (arVar2.f45292b == 2) {
            this.f2816d.a((Object) com.ss.android.ugc.aweme.feed.a.a().b((String) arVar2.f45293c));
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2813a, false, 26239, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2813a, false, 26239, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            r();
        }
    }

    private com.ss.android.ugc.aweme.common.f.b c(int i2) {
        com.ss.android.ugc.aweme.challenge.c.a aVar;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26236, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.common.f.b.class)) {
            return (com.ss.android.ugc.aweme.common.f.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26236, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.common.f.b.class);
        } else if (i3 != 15) {
            switch (i3) {
                case 0:
                case 1:
                    com.ss.android.ugc.aweme.common.f.b bVar = new com.ss.android.ugc.aweme.common.f.b();
                    bVar.a(new j());
                    return bVar;
                case 2:
                case 3:
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26237, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.common.f.b.class)) {
                        return (com.ss.android.ugc.aweme.common.f.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2813a, false, 26237, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.common.f.b.class);
                    }
                    ChallengeDetailViewModel a2 = ChallengeDetailViewModel.a(getActivity());
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, a2, ChallengeDetailViewModel.f35726a, false, 26435, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.challenge.c.a.class)) {
                        ChallengeDetailViewModel challengeDetailViewModel = a2;
                        aVar = (com.ss.android.ugc.aweme.challenge.c.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, challengeDetailViewModel, ChallengeDetailViewModel.f35726a, false, 26435, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.challenge.c.a.class);
                    } else {
                        if (a2.f35729c.getValue() != null) {
                            Object value = a2.f35729c.getValue();
                            if (value == null) {
                                Intrinsics.throwNpe();
                            }
                            if (((Number) ((Pair) value).getFirst()).intValue() == i3) {
                                Object value2 = a2.f35729c.getValue();
                                if (value2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                aVar = (com.ss.android.ugc.aweme.challenge.c.a) ((Pair) value2).getSecond();
                            }
                        }
                        com.ss.android.ugc.aweme.challenge.c.a aVar2 = new com.ss.android.ugc.aweme.challenge.c.a();
                        a2.f35729c.setValue(new Pair(Integer.valueOf(i2), aVar2));
                        aVar = aVar2;
                    }
                    AnonymousClass2 r1 = new com.ss.android.ugc.aweme.common.f.b<com.ss.android.ugc.aweme.challenge.c.a>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f35551a;

                        public final void b() {
                            boolean z = false;
                            if (PatchProxy.isSupport(new Object[0], this, f35551a, false, 26271, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f35551a, false, 26271, new Class[0], Void.TYPE);
                            } else if (this.f2978e != null && this.f2979f != null) {
                                int i = ((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).mListQueryType;
                                if (i != 4) {
                                    switch (i) {
                                        case 1:
                                            if (((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).isDataEmpty()) {
                                                ((c) this.f2979f).y_();
                                                return;
                                            } else {
                                                ((c) this.f2979f).a(((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).a(), ((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).isHasMore());
                                                return;
                                            }
                                        case 2:
                                            ((c) this.f2979f).c(((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).a(), !((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).isNewDataEmpty());
                                            break;
                                    }
                                    return;
                                }
                                c cVar = (c) this.f2979f;
                                List a2 = ((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).a();
                                if (((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).isHasMore() && !((com.ss.android.ugc.aweme.challenge.c.a) this.f2978e).isNewDataEmpty()) {
                                    z = true;
                                }
                                cVar.b(a2, z);
                            }
                        }
                    };
                    r1.a(aVar);
                    return r1;
                case 4:
                case 5:
                case 6:
                case e.l /*7*/:
                    com.ss.android.ugc.aweme.common.f.b bVar2 = new com.ss.android.ugc.aweme.common.f.b();
                    bVar2.a(new com.ss.android.ugc.aweme.poi.model.j());
                    return bVar2;
                default:
                    return null;
            }
        } else {
            com.ss.android.ugc.aweme.common.f.b bVar3 = new com.ss.android.ugc.aweme.common.f.b();
            bVar3.a(new com.ss.android.ugc.aweme.sticker.prop.a.b());
            return bVar3;
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2813a, false, 26254, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2813a, false, 26254, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AnimatedAdapter animatedAdapter = this.f2818f;
        if (PatchProxy.isSupport(new Object[]{animatedAdapter, Byte.valueOf(z)}, null, f2813a, true, 26255, new Class[]{AnimatedAdapter.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedAdapter, Byte.valueOf(z)}, null, f2813a, true, 26255, new Class[]{AnimatedAdapter.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            animatedAdapter.setLoadMoreListener(null);
            if (com.ss.android.g.a.a()) {
                animatedAdapter.setShowFooter(false);
            } else {
                animatedAdapter.setShowFooter(true);
                animatedAdapter.showLoadMoreEmpty();
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(AnimatedViewHolder animatedViewHolder) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{animatedViewHolder}, this, f2813a, false, 26257, new Class[]{AnimatedViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedViewHolder}, this, f2813a, false, 26257, new Class[]{AnimatedViewHolder.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a() && !w()) {
            DetailAwemeViewHolder detailAwemeViewHolder = (DetailAwemeViewHolder) animatedViewHolder;
            if (detailAwemeViewHolder.c() != null) {
                String v2 = v();
                if (StringUtils.equal(v2, "single_song")) {
                    i2 = 4000;
                } else if (StringUtils.equal(v2, "prop_page")) {
                    i2 = 10000;
                } else {
                    i2 = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
                }
                int i3 = i2 + this.f2814b;
                r.a(getContext(), "show", v2, detailAwemeViewHolder.c().getAid(), this.f2815c, com.ss.android.ugc.aweme.feed.a.a().b(detailAwemeViewHolder.c(), i3));
                new an().a(v2).b(this.f2815c).b(detailAwemeViewHolder.c(), i3).e();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2813a, false, 26223, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2813a, false, 26223, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mStatusView.getLayoutParams();
        layoutParams.topMargin = com.ss.android.ugc.aweme.framework.e.b.a(getContext(), 80.0f);
        this.mStatusView.setLayoutParams(layoutParams);
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26230, new Class[0], Void.TYPE);
            return;
        }
        q();
        if (w()) {
            this.s = 2;
        }
        this.mListView.setLayoutManager(new WrapGridLayoutManager((Context) getActivity(), this.s, 1, false));
        this.mListView.setOverScrollMode(2);
        this.mListView.addItemDecoration(new AmeDecoration((int) UIUtils.dip2Px(getContext(), 1.0f), this.s));
        OnAnimatedScrollListener onAnimatedScrollListener = null;
        if (!com.ss.android.ugc.aweme.common.h.c.a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.mListView.addOnScrollListener(onAnimatedScrollListener);
        }
        this.v = new com.ss.android.ugc.aweme.common.d.a(this.mListView, onAnimatedScrollListener);
        this.mListView = df.a(this.mListView, this);
        br.a(this.t).a(this.mListView);
        if (this.mListView instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.mListView).setLabel("detail_list");
        }
        z();
        y();
        if (PatchProxy.isSupport(new Object[0], this, f2813a, false, 26263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2813a, false, 26263, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a() && t() && ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isHaveLatestTab()) {
            this.j.setVisibility(0);
            c(false);
            this.l.setOnClickListener(new q(this));
        }
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2813a, false, 26243, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f2813a, false, 26243, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.a(z, z2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2813a, false, 26221, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2813a, false, 26221, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.my, viewGroup2, false);
        Bundle arguments = getArguments();
        if (PatchProxy.isSupport(new Object[]{arguments}, this, f2813a, false, 26238, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arguments}, this, f2813a, false, 26238, new Class[]{Bundle.class}, Void.TYPE);
        } else if (arguments != null) {
            this.f2814b = arguments.getInt("detail_aweme_list_type", 0);
            this.t = arguments.getString("event_label", "");
            this.f2815c = arguments.getString("detail_id", "");
            this.u = arguments.getString("detail_aweme_from", "");
            this.f2817e = arguments.getBoolean("extra_challenge_is_hashtag", false);
            this.w = arguments.getString("extra_challenge_hashtag_name", "");
        }
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f2813a, false, 26222, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f2813a, false, 26222, new Class[]{View.class}, Void.TYPE);
        } else {
            this.j = (ViewGroup) inflate.findViewById(C0906R.id.b_p);
            this.k = (DmtTextView) inflate.findViewById(C0906R.id.d_2);
            this.l = (DmtTextView) inflate.findViewById(C0906R.id.dk6);
        }
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, java.lang.String r16) {
        /*
            r13 = this;
            r7 = r13
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r14
            r11 = 1
            r0[r11] = r15
            r12 = 2
            r0[r12] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f2813a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26244(0x6684, float:3.6776E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r14
            r0[r11] = r15
            r0[r12] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f2813a
            r3 = 0
            r4 = 26244(0x6684, float:3.6776E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004b:
            boolean r0 = com.ss.android.ugc.aweme.c.a.a.a(r14)
            if (r0 == 0) goto L_0x0052
            return
        L_0x0052:
            if (r15 == 0) goto L_0x0146
            android.support.v4.app.FragmentActivity r0 = r13.getActivity()
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            boolean r2 = r13.t()
            if (r2 == 0) goto L_0x0089
            java.lang.String r0 = "from_challenge"
            java.lang.String r1 = "challenge_id"
            java.lang.String r2 = "feed_enter"
            com.ss.android.ugc.aweme.app.d.d r3 = new com.ss.android.ugc.aweme.app.d.d
            r3.<init>()
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "challenge"
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "group_id"
            java.lang.String r5 = r15.getAid()
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
        L_0x0086:
            r8 = r16
            goto L_0x00b4
        L_0x0089:
            boolean r2 = r13.k()
            if (r2 == 0) goto L_0x0094
            java.lang.String r0 = "from_music"
            java.lang.String r1 = "music_id"
            goto L_0x0086
        L_0x0094:
            boolean r2 = r13.w()
            if (r2 == 0) goto L_0x00a4
            java.lang.String r0 = "from_poi"
            java.lang.String r1 = "poi_id"
            java.lang.String r2 = r13.x()
        L_0x00a2:
            r8 = r2
            goto L_0x00b4
        L_0x00a4:
            int r2 = r7.f2814b
            r3 = 15
            if (r2 != r3) goto L_0x00ab
            r10 = 1
        L_0x00ab:
            if (r10 == 0) goto L_0x0086
            java.lang.String r0 = "from_sticker"
            java.lang.String r1 = "sticker_id"
            java.lang.String r2 = "prop_page"
            goto L_0x00a2
        L_0x00b4:
            com.ss.android.ugc.aweme.profile.o.a(r13)
            com.ss.android.ugc.aweme.feed.a r2 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.common.f.b r3 = r7.f2816d
            com.ss.android.ugc.aweme.common.a r3 = r3.i()
            com.ss.android.ugc.aweme.common.f.a r3 = (com.ss.android.ugc.aweme.common.f.a) r3
            r2.f44610c = r3
            com.ss.android.ugc.aweme.ag.h r2 = com.ss.android.ugc.aweme.ag.h.a()
            android.support.v4.app.FragmentActivity r3 = r13.getActivity()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "aweme://aweme/detail/"
            r4.<init>(r5)
            java.lang.String r5 = r15.getAid()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.ss.android.ugc.aweme.ag.j r4 = com.ss.android.ugc.aweme.ag.j.a(r4)
            java.lang.String r5 = "refer"
            com.ss.android.ugc.aweme.ag.j r4 = r4.a((java.lang.String) r5, (java.lang.String) r8)
            java.lang.String r5 = "previous_page"
            java.lang.String r6 = r7.u
            com.ss.android.ugc.aweme.ag.j r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
            java.lang.String r5 = "com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE"
            boolean r6 = r13.w()
            if (r6 == 0) goto L_0x00fe
            java.lang.String r6 = r13.x()
            goto L_0x0100
        L_0x00fe:
            java.lang.String r6 = ""
        L_0x0100:
            com.ss.android.ugc.aweme.ag.j r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
            java.lang.String r5 = "video_from"
            com.ss.android.ugc.aweme.ag.j r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
            java.lang.String r4 = "video_challenge_profile_from"
            boolean r5 = r13.t()
            if (r5 == 0) goto L_0x0115
            java.lang.String r5 = r7.u
            goto L_0x0117
        L_0x0115:
            java.lang.String r5 = ""
        L_0x0117:
            com.ss.android.ugc.aweme.ag.j r0 = r0.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "video_type"
            boolean r5 = r13.w()
            if (r5 == 0) goto L_0x0126
            int r5 = r7.h
            goto L_0x0128
        L_0x0126:
            int r5 = r7.f2814b
        L_0x0128:
            com.ss.android.ugc.aweme.ag.j r0 = r0.a((java.lang.String) r4, (int) r5)
            java.lang.String r4 = "profile_enterprise_type"
            int r5 = r15.getEnterpriseType()
            com.ss.android.ugc.aweme.ag.j r0 = r0.a((java.lang.String) r4, (int) r5)
            java.lang.String r4 = r7.f2815c
            com.ss.android.ugc.aweme.ag.j r0 = r0.a((java.lang.String) r1, (java.lang.String) r4)
            java.lang.String r0 = r0.a()
            r2.a((android.app.Activity) r3, (java.lang.String) r0)
            com.ss.android.ugc.aweme.feed.b.b.a(r15)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment.a(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public static DetailAwemeListFragment a(int i2, String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str4, str5, str6}, null, f2813a, true, 26217, new Class[]{Integer.TYPE, String.class, String.class, String.class}, DetailAwemeListFragment.class)) {
            return (DetailAwemeListFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str4, str5, str6}, null, f2813a, true, 26217, new Class[]{Integer.TYPE, String.class, String.class, String.class}, DetailAwemeListFragment.class);
        }
        DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("detail_aweme_list_type", i2);
        bundle.putString("event_label", str4);
        bundle.putString("detail_id", str5);
        bundle.putString("detail_aweme_from", str6);
        detailAwemeListFragment.setArguments(bundle);
        return detailAwemeListFragment;
    }

    public static DetailAwemeListFragment a(int i2, String str, String str2, boolean z, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{2, str5, str6, Byte.valueOf(z ? (byte) 1 : 0), str7, str8}, null, f2813a, true, 26219, new Class[]{Integer.TYPE, String.class, String.class, Boolean.TYPE, String.class, String.class}, DetailAwemeListFragment.class)) {
            Object[] objArr = {2, str5, str6, Byte.valueOf(z), str7, str8};
            return (DetailAwemeListFragment) PatchProxy.accessDispatch(objArr, null, f2813a, true, 26219, new Class[]{Integer.TYPE, String.class, String.class, Boolean.TYPE, String.class, String.class}, DetailAwemeListFragment.class);
        }
        DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("detail_aweme_list_type", 2);
        bundle.putString("event_label", str5);
        bundle.putString("detail_id", str6);
        bundle.putBoolean("extra_challenge_is_hashtag", z);
        bundle.putString("extra_challenge_hashtag_name", str7);
        bundle.putString("detail_aweme_from", str8);
        detailAwemeListFragment.setArguments(bundle);
        return detailAwemeListFragment;
    }
}
