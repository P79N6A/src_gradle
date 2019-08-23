package com.ss.android.ugc.aweme.following.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.utils.di;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public abstract class SimpleUserFragment extends AmeBaseFragment implements com.bytedance.ies.dmt.ui.titlebar.a.a, h<User>, c<User>, m {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f3270c;

    /* renamed from: d  reason: collision with root package name */
    protected FollowingAdapter f3271d;

    /* renamed from: e  reason: collision with root package name */
    protected i f3272e;

    /* renamed from: f  reason: collision with root package name */
    protected b f3273f;
    protected int g;
    protected DmtStatusView.a h;
    @BindView(2131495412)
    RecyclerView mListView;
    @BindView(2131496683)
    SwipeRefreshLayout mRefreshLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497604)
    protected TextTitleBar mTitleBar;

    class a implements com.ss.android.ugc.aweme.following.ui.adapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48063a;

        private a() {
        }

        public final boolean a(User user) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{user}, this, f48063a, false, 45062, new Class[]{User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f48063a, false, 45062, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
            } else if (SimpleUserFragment.this.f3272e.m()) {
                return false;
            } else {
                if (user.getFollowStatus() == 0) {
                    i = 1;
                }
                SimpleUserFragment.this.f3272e.a(new i.a().a(user.getUid()).b(user.getSecUid()).a(i).a());
                return true;
            }
        }

        /* synthetic */ a(SimpleUserFragment simpleUserFragment, byte b2) {
            this();
        }

        public final void a(User user, int i) {
            String str;
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i)}, this, f48063a, false, 45063, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i)}, this, f48063a, false, 45063, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            FragmentActivity activity = SimpleUserFragment.this.getActivity();
            SimpleUserFragment simpleUserFragment = SimpleUserFragment.this;
            if (PatchProxy.isSupport(new Object[0], simpleUserFragment, SimpleUserFragment.f3270c, false, 45055, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], simpleUserFragment, SimpleUserFragment.f3270c, false, 45055, new Class[0], String.class);
            } else {
                if (!TextUtils.isEmpty(simpleUserFragment.h())) {
                    String h = simpleUserFragment.h();
                    char c2 = 65535;
                    int hashCode = h.hashCode();
                    if (hashCode != -198284867) {
                        if (hashCode == 1539074444 && h.equals("following_list")) {
                            c2 = 0;
                        }
                    } else if (h.equals("fans_list")) {
                        c2 = 1;
                    }
                    switch (c2) {
                        case 0:
                            if (!simpleUserFragment.l()) {
                                str = "other_following";
                                break;
                            } else {
                                str = "following";
                                break;
                            }
                        case 1:
                            if (!simpleUserFragment.l()) {
                                str = "other_fans";
                                break;
                            } else {
                                str = "fans";
                                break;
                            }
                    }
                }
                str = "";
            }
            UserProfileActivity.b(activity, user2, str);
            SimpleUserFragment simpleUserFragment2 = SimpleUserFragment.this;
            String uid = user.getUid();
            String h2 = SimpleUserFragment.this.h();
            if (PatchProxy.isSupport(new Object[]{uid, h2}, simpleUserFragment2, SimpleUserFragment.f3270c, false, 45054, new Class[]{String.class, String.class}, Void.TYPE)) {
                SimpleUserFragment simpleUserFragment3 = simpleUserFragment2;
                PatchProxy.accessDispatch(new Object[]{uid, h2}, simpleUserFragment3, SimpleUserFragment.f3270c, false, 45054, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.g.a.b()) {
                if ("following_list".equals(h2) || "fans_list".equals(h2)) {
                    ((q) new q().b(h2).a("click_card")).k(uid).e();
                }
            } else if ("following_list".equals(h2)) {
                r.a("enter_personal_detail", (Map) d.a().a("enter_from", "following_list").a("to_user_id", uid).a("enter_method", "click_head").b().f34114b);
                if (!com.ss.android.g.a.c()) {
                    r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(uid).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("enter_from", "following_list").a("enter_method", "click_head").b()));
                }
            }
        }
    }

    public enum b implements Serializable {
        following,
        follower;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final /* bridge */ /* synthetic */ void a(int i, Object obj, int i2, View view, String str) {
    }

    public abstract void b();

    public void b(View view) {
    }

    public final void c(List<User> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    /* access modifiers changed from: package-private */
    public abstract int f();

    public abstract String h();

    public abstract int i();

    public boolean isRegisterEventBus() {
        return true;
    }

    public abstract int j();

    public abstract int k();

    public abstract int m();

    public abstract com.ss.android.ugc.aweme.common.f.b n();

    public final void z_() {
    }

    public boolean l() {
        if (!PatchProxy.isSupport(new Object[0], this, f3270c, false, 45033, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.account.d.a().getCurUserId().equals(this.f3273f.getUid());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45033, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3270c, false, 45039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45039, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && CollectionUtils.isEmpty(this.f3271d.getData())) {
            this.mStatusView.d();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3270c, false, 45038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45038, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3272e != null) {
            this.f3272e.k();
        }
        if (n() != null) {
            n().k();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3270c, false, 45046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45046, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f3271d.showLoadMoreLoading();
        }
    }

    public final boolean o() {
        if (PatchProxy.isSupport(new Object[0], this, f3270c, false, 45036, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45036, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgf).a();
            return false;
        } else {
            return n().a(1);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3270c, false, 45041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45041, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f3271d.setData(null);
            this.f3271d.showLoadMoreEmpty();
            this.mStatusView.e();
        }
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3270c, false, 45032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45032, new Class[0], Void.TYPE);
            return;
        }
        this.mTitleBar.setTitle(m());
        this.mTitleBar.setTitleColor(getResources().getColor(C0906R.color.ww));
        this.mTitleBar.setOnTitleBarClickListener(this);
        di.b(this.mListView);
        this.h = DmtStatusView.a.a(getContext()).b(e.a(getContext(), new e(this)));
        if (com.ss.android.g.a.a()) {
            MtEmptyView a2 = MtEmptyView.a(getContext());
            a2.setStatus(new c.a(getContext()).a(i()).b(j()).c(k()).f20493a);
            this.h.b((View) a2);
        } else {
            this.h.a(new c.a(getContext()).a(2130840145).b(j()).c(k()).f20493a);
        }
        this.mStatusView.setBuilder(this.h);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3270c, false, 45037, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3270c, false, 45037, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f3270c, false, 45051, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f3270c, false, 45051, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        a(followStatus);
    }

    private void a(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f3270c, false, 45052, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f3270c, false, 45052, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            if (this.f3271d != null) {
                return;
            }
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3270c, false, 45047, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3270c, false, 45047, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f3271d.showPullUpLoadMore();
        }
    }

    public void onFollowFail(Exception exc) {
        final Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f3270c, false, 45050, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f3270c, false, 45050, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                com.ss.android.ugc.aweme.captcha.c.b.a(getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc2, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48060a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f48060a, false, 45060, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48060a, false, 45060, new Class[0], Void.TYPE);
                            return;
                        }
                        SimpleUserFragment.this.f3272e.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f48060a, false, 45061, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48060a, false, 45061, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.app.api.a.a.a(SimpleUserFragment.this.getContext(), exc2, C0906R.string.afx);
                    }
                });
                return;
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), exc2, C0906R.string.afx);
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3270c, false, 45053, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3270c, false, 45053, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        User user;
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3270c, false, 45049, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3270c, false, 45049, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (isViewValid()) {
            a(followStatus);
            FollowingAdapter followingAdapter = this.f3271d;
            String str = followStatus2.userId;
            if (PatchProxy.isSupport(new Object[]{str}, followingAdapter, FollowingAdapter.f48095f, false, 45105, new Class[]{String.class}, User.class)) {
                FollowingAdapter followingAdapter2 = followingAdapter;
                user = (User) PatchProxy.accessDispatch(new Object[]{str}, followingAdapter2, FollowingAdapter.f48095f, false, 45105, new Class[]{String.class}, User.class);
            } else {
                if (followingAdapter.mItems != null) {
                    Iterator it2 = followingAdapter.mItems.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        User user2 = (User) it2.next();
                        if (TextUtils.equals(user2.getUid(), str)) {
                            user = user2;
                            break;
                        }
                    }
                }
                user = null;
            }
            if (user != null && com.ss.android.ugc.aweme.profile.d.i.a(getContext(), user, followStatus2)) {
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(getContext());
                remarkEditDialog.g = user;
                remarkEditDialog.h = followStatus2.contactName;
                remarkEditDialog.i = 1;
                remarkEditDialog.f63095f = new f(this, user, followStatus2);
                remarkEditDialog.show();
            }
            if (followStatus2.followStatus == 0 && user != null && !TextUtils.isEmpty(user.getRemarkName())) {
                user.setRemarkName("");
                int a2 = this.f3271d.a(followStatus2.userId);
                if (a2 != -1) {
                    this.f3271d.notifyItemChanged(a2);
                }
            }
        }
    }

    public void b(Exception exc) {
        int i;
        com.bytedance.ies.dmt.ui.widget.c cVar;
        int i2;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3270c, false, 45040, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3270c, false, 45040, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f3271d.setData(null);
            this.f3271d.showLoadMoreEmpty();
            if (PatchProxy.isSupport(new Object[]{exc}, this, f3270c, false, 45042, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f3270c, false, 45042, new Class[]{Exception.class}, Void.TYPE);
            } else if (!l() && getContext() != null) {
                if (PatchProxy.isSupport(new Object[]{exc}, this, f3270c, false, 45043, new Class[]{Exception.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{exc}, this, f3270c, false, 45043, new Class[]{Exception.class}, Integer.TYPE)).intValue();
                } else {
                    if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && this.f3273f != null) {
                        com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                        User user = this.f3273f.getUser();
                        if (user != null) {
                            if (aVar.getErrorCode() == 2077 && user.isBlock) {
                                i = C0906R.string.nz;
                            } else if (aVar.getErrorCode() == 2078 && user.isBlocked()) {
                                i = C0906R.string.b3j;
                            }
                        }
                    }
                    i = 0;
                }
                int i3 = i;
                if (!(i3 == 0 || this.h == null || this.mStatusView == null)) {
                    this.mStatusView.b();
                    DmtStatusView.a aVar2 = this.h;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f3270c, false, 45044, new Class[]{Integer.TYPE}, com.bytedance.ies.dmt.ui.widget.c.class)) {
                        cVar = (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f3270c, false, 45044, new Class[]{Integer.TYPE}, com.bytedance.ies.dmt.ui.widget.c.class);
                    } else {
                        c.a aVar3 = new c.a(getContext());
                        if (com.ss.android.g.a.a()) {
                            i2 = 2130839714;
                        } else {
                            i2 = 2130840130;
                        }
                        cVar = aVar3.a(i2).b((int) C0906R.string.nl).c(i3).f20493a;
                    }
                    aVar2.b(cVar);
                    this.mStatusView.setBuilder(this.h);
                }
            }
            this.mStatusView.f();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(User user, FollowStatus followStatus) {
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            int a2 = this.f3271d.a(followStatus.userId);
            if (a2 != -1) {
                this.f3271d.notifyItemChanged(a2);
            }
        }
    }

    public final void b(List<User> list, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3270c, false, 45048, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3270c, false, 45048, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list == null || list.isEmpty()) {
            z2 = false;
        } else {
            z2 = z;
        }
        if (z2) {
            this.f3271d.resetLoadMoreState();
        } else if (com.ss.android.g.a.a()) {
            this.f3271d.setShowFooter(false);
        } else {
            this.f3271d.showLoadMoreEmpty();
        }
        this.f3271d.setDataAfterLoadMore(list);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3270c, false, 45034, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3270c, false, 45034, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f3273f = (b) getArguments().getSerializable("following_page_param");
        this.g = getArguments().getInt("following_or_follower_count", 0);
        g();
        if (PatchProxy.isSupport(new Object[0], this, f3270c, false, 45035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3270c, false, 45035, new Class[0], Void.TYPE);
            return;
        }
        this.f3271d = new FollowingAdapter(this);
        this.f3271d.a(this.f3273f);
        this.f3271d.setLoadMoreListener(new LoadMoreRecyclerViewAdapter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48056a;

            public final void loadMore() {
                if (PatchProxy.isSupport(new Object[0], this, f48056a, false, 45058, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48056a, false, 45058, new Class[0], Void.TYPE);
                } else if (SimpleUserFragment.this.isViewValid()) {
                    SimpleUserFragment.this.n().a(4);
                }
            }
        });
        this.f3271d.h = new a(this, (byte) 0);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setOverScrollMode(2);
        this.mListView.setAdapter(this.f3271d);
        this.mListView.getItemAnimator().setAddDuration(0);
        ((SimpleItemAnimator) this.mListView.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48058a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f48058a, false, 45059, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48058a, false, 45059, new Class[0], Void.TYPE);
                } else if (SimpleUserFragment.this.n() != null) {
                    SimpleUserFragment.this.o();
                } else {
                    SimpleUserFragment.this.mRefreshLayout.setRefreshing(false);
                }
            }
        });
        b();
        o();
        this.f3272e = new i();
        this.f3272e.a(this);
    }

    public final void a(List<User> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3270c, false, 45045, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3270c, false, 45045, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (com.ss.android.g.a.a()) {
                this.f3271d.setShowFooter(true);
            }
            this.mRefreshLayout.setRefreshing(false);
            this.f3271d.setData(list);
            this.mStatusView.b();
            if (z) {
                this.f3271d.resetLoadMoreState();
            } else if (com.ss.android.g.a.a()) {
                this.f3271d.setShowFooter(false);
            } else {
                this.f3271d.showLoadMoreEmpty();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3270c, false, 45031, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3270c, false, 45031, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(f(), viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }
}
