package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.feed.adapter.r;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.listener.a;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.legoImp.inflate.m;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bk;
import com.ss.android.ugc.aweme.utils.bg;

public abstract class BaseFeedListFragment<T extends b> extends FeedFragment implements r, a, com.ss.android.ugc.aweme.feed.listener.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3193a;

    /* renamed from: b  reason: collision with root package name */
    DmtStatusView f3194b;

    /* renamed from: c  reason: collision with root package name */
    protected T f3195c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a f3196d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3197e;
    @BindView(2131494245)
    View mLayout;
    @BindView(2131495647)
    LoadMoreFrameLayout mLoadMoreLayout;
    @BindView(2131496683)
    protected FeedSwipeRefreshLayout mRefreshLayout;

    public abstract DmtStatusView a(Context context);

    public abstract T c();

    public abstract boolean d();

    public boolean f() {
        if (this.f3194b == null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (PatchProxy.isSupport(new Object[0], this, f3193a, false, 42445, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3193a, false, 42445, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3195c.m()) {
            return false;
        } else {
            return d();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3193a, false, 42440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3193a, false, 42440, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3195c != null) {
            this.f3195c.k();
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3193a, false, 42447, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3193a, false, 42447, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!(getActivity() instanceof MainActivity) || !((MainActivity) getActivity()).isFeedPage() || !((MainActivity) getActivity()).isUnderMainTab()) {
            return false;
        } else {
            return true;
        }
    }

    public void a(DmtStatusView.a aVar) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f3193a, false, 42441, new Class[]{DmtStatusView.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f3193a, false, 42441, new Class[]{DmtStatusView.a.class}, Void.TYPE);
            return;
        }
        if (this.mRefreshLayout != null) {
            this.mRefreshLayout.a(false, (int) UIUtils.dip2Px(getActivity(), 49.0f), (int) UIUtils.dip2Px(getActivity(), 113.0f));
            this.f3196d = new bk(this.mRefreshLayout);
        }
    }

    public final DmtStatusView b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3193a, false, 42446, new Class[]{Boolean.TYPE}, DmtStatusView.class)) {
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3193a, false, 42446, new Class[]{Boolean.TYPE}, DmtStatusView.class);
        }
        if (f() && z && this.f3197e && getContext() != null) {
            this.f3194b = a(getContext());
            this.f3194b.setBackgroundColor(getContext().getResources().getColor(C0906R.color.i0));
            this.mLoadMoreLayout.addView(this.f3194b, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.f3194b;
    }

    public boolean d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3193a, false, 42443, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3193a, false, 42443, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                this.f3196d.setRefreshing(false);
                bg.a(new ae());
                return false;
            } else if (!this.f3195c.m()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f3193a, false, 42444, new Class[]{String.class}, Boolean.TYPE)) {
            return this.f3195c.a((Object) com.ss.android.ugc.aweme.feed.a.a().b(str2));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f3193a, false, 42444, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3193a, false, 42442, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3193a, false, 42442, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f3197e = true;
        a((DmtStatusView.a) null);
        this.mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46079a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f46079a, false, 42448, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f46079a, false, 42448, new Class[0], Void.TYPE);
                    return;
                }
                BaseFeedListFragment.this.d(false);
            }
        });
        this.f3195c = c();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f3193a, false, 42439, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return ((m) com.ss.android.ugc.aweme.lego.a.i.b(m.class)).a(getContext(), (int) C0906R.layout.fragment_feed);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f3193a, false, 42439, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
