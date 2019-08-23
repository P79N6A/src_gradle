package com.ss.android.ugc.aweme.newfollow.userstate;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.y;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;

public class UserStateFeedViewHolder extends FlowFeedViewHolder<UserStateFeedAdapter, FollowFeed> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57340a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f57341b = ((int) UIUtils.dip2Px(d.a(), 16.0f));

    /* renamed from: c  reason: collision with root package name */
    public static final int f57342c = ((int) UIUtils.dip2Px(d.a(), 16.0f));

    /* renamed from: d  reason: collision with root package name */
    public static final int f57343d = ((int) UIUtils.dip2Px(d.a(), 0.5f));

    /* renamed from: e  reason: collision with root package name */
    protected String f57344e;

    /* renamed from: f  reason: collision with root package name */
    protected String f57345f;
    public boolean g;
    public boolean h;
    @BindView(2131496454)
    RelativeLayout mPrivateAccountView;
    private DmtStatusView.a p;
    private c q;
    private boolean r;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        if (this.q != null) {
            R_();
        }
    }

    public final a b() {
        if (!PatchProxy.isSupport(new Object[0], this, f57340a, false, 61782, new Class[0], a.class)) {
            return new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57346a;

                public final String e() {
                    return "key_container_dynamic";
                }

                public final Object a() {
                    return UserStateFeedViewHolder.this.j;
                }

                public final boolean b() {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, f57346a, false, 61797, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57346a, false, 61797, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (UserStateFeedViewHolder.this.l != null && UserStateFeedViewHolder.this.l.isViewValid()) {
                        z = true;
                    }
                    return z;
                }

                public final Context d() {
                    if (PatchProxy.isSupport(new Object[0], this, f57346a, false, 61799, new Class[0], Context.class)) {
                        return (Context) PatchProxy.accessDispatch(new Object[0], this, f57346a, false, 61799, new Class[0], Context.class);
                    } else if (UserStateFeedViewHolder.this.l != null) {
                        return UserStateFeedViewHolder.this.l.getActivity();
                    } else {
                        return UserStateFeedViewHolder.this.mRecyclerView.getContext();
                    }
                }

                public final boolean c() {
                    if (PatchProxy.isSupport(new Object[0], this, f57346a, false, 61798, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57346a, false, 61798, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (UserStateFeedViewHolder.this.l == null || !UserStateFeedViewHolder.this.l.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED) || !UserStateFeedViewHolder.this.l.getUserVisibleHint()) {
                        return false;
                    } else {
                        return true;
                    }
                }
            };
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f57340a, false, 61782, new Class[0], a.class);
    }

    public final /* synthetic */ FeedAdapter d() {
        if (!PatchProxy.isSupport(new Object[0], this, f57340a, false, 61781, new Class[0], UserStateFeedAdapter.class)) {
            return new UserStateFeedAdapter(this.mRecyclerView, this.q.g, this.r);
        }
        return (UserStateFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, f57340a, false, 61781, new Class[0], UserStateFeedAdapter.class);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f57340a, false, 61793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57340a, false, 61793, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            h();
            this.mPrivateAccountView.setVisibility(4);
            this.mLoadingStatusView.setVisibility(0);
            this.mLoadingStatusView.e();
        }
    }

    private void h() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f57340a, false, 61794, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57340a, false, 61794, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            if ((this.h || this.g) && !this.r) {
                if (this.h) {
                    i = C0906R.string.o2;
                }
                if (this.g) {
                    i = C0906R.string.nm;
                }
                if (!(i == 0 || this.p == null || this.mLoadingStatusView == null)) {
                    this.mLoadingStatusView.b();
                    this.p.b((View) b(i));
                    this.mLoadingStatusView.setBuilder(this.p);
                }
            }
        }
    }

    public final void R_() {
        if (PatchProxy.isSupport(new Object[0], this, f57340a, false, 61784, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57340a, false, 61784, new Class[0], Void.TYPE);
        } else if (this.q != null) {
            this.q.a(1, this.f57344e, this.f57345f);
        }
    }

    public final void c() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f57340a, false, 61780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57340a, false, 61780, new Class[0], Void.TYPE);
            return;
        }
        if (this.p == null) {
            this.p = DmtStatusView.a.a(getContext());
            DmtTextView b2 = b((int) C0906R.string.b6z);
            if (this.r) {
                i = C0906R.string.aau;
            } else {
                i = C0906R.string.aaj;
            }
            DmtTextView b3 = b(i);
            b2.setOnClickListener(new d(this));
            this.p.b((View) b3).c((View) b2);
        }
        this.mLoadingStatusView.setBuilder(this.p);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f57340a, false, 61787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57340a, false, 61787, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && !this.q.i().isDataEmpty() && this.q != null) {
            this.q.a(4, this.f57344e, this.f57345f);
        }
    }

    private DmtTextView b(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57340a, false, 61795, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57340a, false, 61795, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        if (this.l != null) {
            dmtTextView.setTextColor(this.l.getResources().getColor(C0906R.color.zv));
            dmtTextView.setText(i);
        }
        return dmtTextView;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57340a, false, 61790, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57340a, false, 61790, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int c2 = ((UserStateFeedAdapter) this.j).c(str);
        if (c2 >= 0) {
            bg.a(new ar(32));
            ((UserStateFeedAdapter) this.j).b(c2);
            if (((UserStateFeedAdapter) this.j).getData().isEmpty()) {
                f();
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57340a, false, 61786, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57340a, false, 61786, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            switch (i) {
                case 2:
                    if (!(this.j == null || ((UserStateFeedAdapter) this.j).getItemCount() != 0 || this.mLoadingStatusView == null)) {
                        this.mPrivateAccountView.setVisibility(8);
                        this.mLoadingStatusView.setVisibility(0);
                        this.mLoadingStatusView.d();
                        return;
                    }
                case 3:
                    a((List<D>) null);
                    if (this.mLoadingStatusView != null) {
                        this.mLoadingStatusView.setVisibility(0);
                        h();
                        this.mLoadingStatusView.e();
                    }
                    if (this.j != null) {
                        ((UserStateFeedAdapter) this.j).showLoadMoreEmpty();
                        return;
                    }
                    break;
                default:
                    super.a(i);
                    break;
            }
        }
    }

    public final boolean b(List<FollowFeed> list) {
        List<FollowFeed> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f57340a, false, 61785, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2}, this, f57340a, false, 61785, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        }
        List data = ((UserStateFeedAdapter) this.j).getData();
        if (CollectionUtils.isEmpty(data) || CollectionUtils.isEmpty(list) || data.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < data.size(); i++) {
            Aweme aweme = list2.get(i).getAweme();
            Aweme aweme2 = ((FollowFeed) data.get(i)).getAweme();
            if (aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str, String str2) {
        this.f57344e = str;
        this.f57345f = str2;
    }

    public final void a(String str, ForwardDetail forwardDetail) {
        if (PatchProxy.isSupport(new Object[]{str, forwardDetail}, this, f57340a, false, 61788, new Class[]{String.class, ForwardDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, forwardDetail}, this, f57340a, false, 61788, new Class[]{String.class, ForwardDetail.class}, Void.TYPE);
            return;
        }
        bg.a(new ar(31));
        if (this.mLoadingStatusView.getVisibility() == 0) {
            this.mLoadingStatusView.setVisibility(8);
        }
        ((UserStateFeedAdapter) this.j).a(str, forwardDetail.getAweme(), 0);
        ((UserStateFeedAdapter) this.j).a(str, forwardDetail.getComment());
    }

    UserStateFeedViewHolder(String str, String str2, boolean z) {
        this.f57344e = str;
        this.f57345f = str2;
        this.r = z;
    }

    public final void a(UserStateFragment userStateFragment, View view, c cVar, com.ss.android.ugc.aweme.newfollow.b.a aVar) {
        UserStateFragment userStateFragment2 = userStateFragment;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{userStateFragment2, view, cVar2, aVar}, this, f57340a, false, 61783, new Class[]{UserStateFragment.class, View.class, c.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStateFragment2, view, cVar2, aVar}, this, f57340a, false, 61783, new Class[]{UserStateFragment.class, View.class, c.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE);
            return;
        }
        this.q = cVar2;
        super.a(userStateFragment, view, cVar, aVar, userStateFragment2.f57362d, userStateFragment2.f57363e, userStateFragment2.k, "");
        if (TimeLockRuler.isTeenModeON()) {
            ((TextView) this.mPrivateAccountView.findViewById(C0906R.id.title)).setText(C0906R.string.cit);
            ((TextView) this.mPrivateAccountView.findViewById(C0906R.id.yp)).setText(C0906R.string.cii);
        }
        this.mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57348a;

            /* renamed from: c  reason: collision with root package name */
            private Drawable f57350c = ContextCompat.getDrawable(UserStateFeedViewHolder.this.getContext(), C0906R.color.zf);

            public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                Canvas canvas2 = canvas;
                RecyclerView recyclerView2 = recyclerView;
                if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f57348a, false, 61800, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f57348a, false, 61800, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                    return;
                }
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView2.getChildAt(i);
                    int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    int i2 = UserStateFeedViewHolder.f57343d + bottom;
                    if (y.b()) {
                        this.f57350c.setBounds(childAt.getLeft(), bottom, childAt.getRight(), i2);
                    } else {
                        this.f57350c.setBounds(childAt.getLeft() + UserStateFeedViewHolder.f57341b, bottom, childAt.getRight() - UserStateFeedViewHolder.f57342c, i2);
                    }
                    this.f57350c.draw(canvas);
                }
            }

            public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                rect.bottom = UserStateFeedViewHolder.f57343d;
            }
        });
        this.mRecyclerView.setOverScrollMode(2);
        this.mPrivateAccountView.setVisibility(4);
    }
}
