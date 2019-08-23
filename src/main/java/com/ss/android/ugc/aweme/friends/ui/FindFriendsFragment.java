package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.base.fragment.AmePresenterFragment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchUserAdapter;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.discover.presenter.w;
import com.ss.android.ugc.aweme.discover.presenter.x;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.adapter.RecommendListAdapter;
import com.ss.android.ugc.aweme.friends.d.j;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.newfollow.ui.k;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.b;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.bogut.library.factory.PresenterClass;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONObject;

@PresenterClass(a = j.class)
public class FindFriendsFragment extends AmePresenterFragment<j> implements h<User>, LoadMoreRecyclerViewAdapter.a, c<SearchUser>, RecommendAwemeViewHolder.a, k, m {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3335b;

    /* renamed from: c  reason: collision with root package name */
    protected RecommendListAdapter f3336c;

    /* renamed from: d  reason: collision with root package name */
    public ForegroundColorSpan f3337d;

    /* renamed from: e  reason: collision with root package name */
    public String f3338e = "";

    /* renamed from: f  reason: collision with root package name */
    x f3339f;
    public i g;
    public SearchUserAdapter h;
    public DmtStatusView.a i;
    public FragmentActivity j;
    public DataCenter k;
    String l;
    private DmtStatusView.a m;
    @BindView(2131493372)
    ImageButton mBtnSearchClear;
    @BindView(2131494165)
    DmtEditText mEditSearch;
    @BindView(2131494240)
    RecyclerView mListView;
    @BindView(2131496130)
    NoticeView mPerfectUsrInfoGuideView;
    @BindView(2131496958)
    ViewGroup mSearchGroup;
    @BindString(2132086167)
    String mSearchHitString;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131498113)
    DmtTextView mTvSearchBtn;
    @BindView(2131498117)
    DmtTextView mTvSearchHit;
    private b n;
    private Unbinder o;
    private User p;
    private ak q;

    public final void c(List<SearchUser> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void z_() {
    }

    @Nullable
    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    public final boolean S_() {
        if (!PatchProxy.isSupport(new Object[0], this, f3335b, false, 47139, new Class[0], Boolean.TYPE)) {
            return CollectionUtils.isEmpty(this.f3336c.getData());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47139, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void T_() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47131, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (k()) {
                this.h.resetLoadMoreState();
            } else {
                this.f3336c.resetLoadMoreState();
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47137, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.setVisibility(4);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47129, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (k()) {
                this.h.showLoadMoreEmpty();
            } else {
                this.f3336c.showLoadMoreEmpty();
            }
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47132, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mStatusView.f();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47130, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (k()) {
                this.h.showLoadMoreError();
            } else {
                this.f3336c.showLoadMoreError();
            }
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47128, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (k()) {
                this.h.showLoadMoreLoading();
            } else {
                this.f3336c.showLoadMoreLoading();
            }
        }
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47151, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47151, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mTvSearchBtn != null && this.mTvSearchBtn.isShown()) {
            z = true;
        }
        return z;
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47149, new Class[0], Void.TYPE);
            return;
        }
        ((j) a()).c();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47126, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mStatusView.d();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47124, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.o.unbind();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47155, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47136, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.e();
        }
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47143, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && (this.f3336c.f48753c instanceof ad)) {
            String.valueOf(com.ss.android.ugc.aweme.message.c.c.a().b(4));
        }
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47144, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && (this.f3336c.f48753c instanceof ad) && com.ss.android.ugc.aweme.message.c.c.a().d(4)) {
            com.ss.android.ugc.aweme.message.c.c.a().a(4);
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47125, new Class[0], Void.TYPE);
            return;
        }
        this.mTvSearchHit.setVisibility(8);
        this.mBtnSearchClear.setVisibility(8);
        this.mTvSearchHit.setText("");
        this.mEditSearch.getText().clear();
        this.f3338e = "";
        this.h.clearData();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47160, new Class[0], Void.TYPE);
            return;
        }
        j();
        this.mTvSearchBtn.setVisibility(8);
        this.k.a("isSearch", (Object) Boolean.FALSE);
        com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) this.mEditSearch);
        this.mEditSearch.setCursorVisible(false);
        this.mEditSearch.clearFocus();
        this.mListView.setAdapter(this.f3336c);
        this.mStatusView.setBuilder(this.m);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47138, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (com.ss.android.ugc.aweme.message.c.c.a().d(4)) {
            n();
        } else {
            o();
        }
        this.n.a("discovery_add_friends", true, 1000);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131498113, 2131498117})
    public void searchUser() {
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47152, new Class[0], Void.TYPE);
        } else if (!TextUtils.isEmpty(this.f3338e)) {
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) this.mEditSearch);
            this.mTvSearchHit.setVisibility(8);
            this.f3339f.a(1, this.f3338e, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        String str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{"mobile_contact"}, this, f3335b, false, 47122, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{"mobile_contact"}, this, f3335b, false, 47122, new Class[]{String.class}, Void.TYPE);
        } else {
            r.a("add_profile_friends", (Map) d.a().a("enter_from", "find_friends").a("account_type", "mobile_contact").f34114b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47150, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47150, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (ContextCompat.checkSelfPermission(this.j, "android.permission.READ_CONTACTS") != 0) {
            ActivityCompat.requestPermissions(this.j, new String[]{"android.permission.READ_CONTACTS"}, 1);
            z = false;
        }
        if (z) {
            FragmentActivity fragmentActivity = this.j;
            if (this.f3336c != null) {
                str = this.f3336c.l;
            } else {
                str = "";
            }
            startActivity(ContactsActivity.a((Context) fragmentActivity, str, false));
            return;
        }
        UIUtils.displayToast((Context) this.j, (int) C0906R.string.eh);
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3335b, false, 47127, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3335b, false, 47127, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        g();
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3335b, false, 47156, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3335b, false, 47156, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        h();
    }

    public void onAttach(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f3335b, false, 47159, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f3335b, false, 47159, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        this.j = (FragmentActivity) context;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3335b, false, 47158, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3335b, false, 47158, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((j) a()).b().newUserCount > 0 && i2 < ((j) a()).b().newUserCount) {
            this.f3336c.h = true;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mListView.findViewHolderForAdapterPosition(this.f3336c.g);
            if (findViewHolderForAdapterPosition instanceof RecommendFriendsTitleHolder) {
                RecommendFriendsTitleHolder recommendFriendsTitleHolder = (RecommendFriendsTitleHolder) findViewHolderForAdapterPosition;
                if (recommendFriendsTitleHolder.f49336b) {
                    recommendFriendsTitleHolder.a();
                }
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f3335b, false, 47134, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f3335b, false, 47134, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && !k()) {
            this.q = null;
            this.p = null;
        }
    }

    @Subscribe
    public void onHidePerfectInfoGuideEvent(com.ss.android.ugc.aweme.profile.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f3335b, false, 47142, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f3335b, false, 47142, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE);
        } else if (this.n != null) {
            switch (cVar.f61228a) {
                case 0:
                    this.n.a(false);
                    return;
                case 1:
                    if (!this.n.f63118d) {
                        this.n.a(false);
                        break;
                    }
                    break;
                case 2:
                    if (this.n.f63118d) {
                        this.n.a(false);
                        return;
                    }
                    break;
            }
        }
    }

    @Subscribe
    public void onNotificationIndicatorEvent(com.ss.android.ugc.aweme.message.b.c cVar) {
        com.ss.android.ugc.aweme.message.b.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3335b, false, 47141, new Class[]{com.ss.android.ugc.aweme.message.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3335b, false, 47141, new Class[]{com.ss.android.ugc.aweme.message.b.c.class}, Void.TYPE);
            return;
        }
        if (cVar2.f55358a == 4) {
            if (com.ss.android.ugc.aweme.message.c.c.a().d(cVar2.f55358a)) {
                n();
                return;
            }
            o();
        }
    }

    public void onFollowFail(final Exception exc) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3335b, false, 47135, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3335b, false, 47135, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (!k()) {
                if (!(this.q == null || this.p == null)) {
                    User user = this.p;
                    if (this.p.getFollowStatus() == 1) {
                        i2 = 0;
                    }
                    user.setFollowStatus(i2);
                    this.q.a(this.p.getFollowStatus());
                    this.q = null;
                    this.p = null;
                }
            } else if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                com.ss.android.ugc.aweme.captcha.c.b.a(getFragmentManager(), (a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49206a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f49206a, false, 47179, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f49206a, false, 47179, new Class[0], Void.TYPE);
                            return;
                        }
                        FindFriendsFragment.this.g.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f49206a, false, 47180, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f49206a, false, 47180, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.app.api.a.a.a(FindFriendsFragment.this.getContext(), exc, C0906R.string.afx);
                    }
                });
            } else {
                com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), exc, C0906R.string.afx);
            }
        }
    }

    public final void a(String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f3335b, false, 47145, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f3335b, false, 47145, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
        a2.a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + str2).a("refer", "find_friends").a());
        a(i2);
    }

    public final void b(List<SearchUser> list, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3335b, false, 47157, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3335b, false, 47157, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && k() && !this.mTvSearchHit.isShown()) {
            if (com.ss.android.g.a.a()) {
                z2 = this.f3339f.c();
            } else if (list == null || list.isEmpty()) {
                z2 = false;
            } else {
                z2 = z;
            }
            if (!z2) {
                this.h.showLoadMoreEmpty();
            } else {
                this.h.resetLoadMoreState();
            }
            this.h.setDataAfterLoadMore(list);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f3335b, false, 47119, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f3335b, false, 47119, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("add_profile_friends", (Map) new d().a("enter_from", str4).a("account_type", str3).f34114b);
    }

    public final void a(List<SearchUser> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3335b, false, 47154, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3335b, false, 47154, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && k() && !this.mTvSearchHit.isShown()) {
            this.h.setShowFooter(true);
            if (!z) {
                this.h.showLoadMoreEmpty();
            } else {
                this.h.resetLoadMoreState();
            }
            this.mStatusView.b();
            this.h.setData(list);
            d a2 = d.a();
            a2.a("enter_from", "find_friends").a("search_keyword", this.f3338e).a("log_pb", new Gson().toJson((Object) ((SearchUserList) ((w) this.f3339f.i()).getData()).logPb));
            r.a("search_user", aa.a(a2.f34114b));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3335b, false, 47115, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3335b, false, 47115, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate2 = layoutInflater2.inflate(C0906R.layout.nt, viewGroup2, false);
        this.o = ButterKnife.bind((Object) this, inflate2);
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47116, new Class[0], Void.TYPE);
        } else {
            this.k = DataCenter.a(ViewModelProviders.of(this.j), (LifecycleOwner) this);
            this.k.a("exitSearch", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new f<com.ss.android.ugc.aweme.arch.widgets.base.a>(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47117, new Class[0], Void.TYPE);
        } else {
            this.l = "find_friends";
            this.n = new b(this.mPerfectUsrInfoGuideView);
            this.n.a(getString(C0906R.string.blx));
            this.mListView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
            this.mListView.setItemAnimator(new CustomItemAnimator());
            this.f3336c = new RecommendListAdapter(getContext(), true);
            this.f3336c.j = this.mListView;
            if (this.j.getIntent() != null) {
                int intExtra = this.j.getIntent().getIntExtra("bundle_recommend_user_type", 1);
                this.f3336c.f48756f = intExtra;
                if (intExtra == 6) {
                    this.f3336c.m = "fans";
                } else if (intExtra == 5) {
                    this.f3336c.m = "following";
                } else {
                    this.f3336c.m = "personal_homepage";
                }
            } else {
                this.f3336c.m = "personal_homepage";
            }
            this.f3336c.setLoadMoreListener(this);
            this.f3336c.setShowFooter(false);
            if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47118, new Class[0], View.class)) {
                inflate = (View) PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47118, new Class[0], View.class);
            } else {
                inflate = LayoutInflater.from(this.j).inflate(C0906R.layout.ky, null, false);
                ThirdPartyAddFriendView thirdPartyAddFriendView = (ThirdPartyAddFriendView) inflate.findViewById(C0906R.id.d2f);
                thirdPartyAddFriendView.setAddContactsFriendsClickListener(new j(this));
                thirdPartyAddFriendView.setAddWeChatFriendsClickListener(new k(this));
                thirdPartyAddFriendView.setAddQQFriendsClickListener(new l(this));
            }
            View view = inflate;
            this.f3336c.a((View) (ThirdPartyAddFriendView) view.findViewById(C0906R.id.d2f));
            if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47121, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47121, new Class[0], Void.TYPE);
            } else {
                this.i = DmtStatusView.a.a((Context) this.j).a(new c.a(this.j).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new n(this));
                this.f3339f = new x();
                this.f3339f.a(this);
                x xVar = this.f3339f;
                if (PatchProxy.isSupport(new Object[]{"find_friends"}, xVar, x.h, false, 37332, new Class[]{String.class}, Void.TYPE)) {
                    x xVar2 = xVar;
                    PatchProxy.accessDispatch(new Object[]{"find_friends"}, xVar2, x.h, false, 37332, new Class[]{String.class}, Void.TYPE);
                } else if (xVar.f2978e != null) {
                    ((w) xVar.f2978e).a("find_friends");
                }
                this.g = new i();
                this.g.a(this);
                this.h = new SearchUserAdapter(new s(false), this.f3338e, new com.ss.android.ugc.aweme.following.ui.adapter.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49200a;

                    public final boolean a(User user) {
                        String str;
                        int i = 0;
                        if (PatchProxy.isSupport(new Object[]{user}, this, f49200a, false, 47174, new Class[]{User.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f49200a, false, 47174, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
                        } else if (FindFriendsFragment.this.g.m()) {
                            return false;
                        } else {
                            if (user.getFollowStatus() == 0) {
                                str = "follow";
                            } else {
                                str = "follow_cancel";
                            }
                            new com.ss.android.ugc.aweme.u.s(str).b("find_friends").c("follow_button").h(user.getUid()).f("search_result").g("other_places").k(user.getRequestId()).e();
                            if (user.getFollowStatus() == 0) {
                                i = 1;
                            }
                            FindFriendsFragment.this.g.a(new i.a().a(user.getUid()).b(user.getSecUid()).a(i).c("search_result").a());
                            return true;
                        }
                    }

                    public final void a(User user, int i) {
                        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f49200a, false, 47175, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f49200a, false, 47175, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.discover.mob.k.a(i, FindFriendsFragment.this.f3338e, 0, user.getRequestId(), user.getUid(), com.ss.android.ugc.aweme.discover.mob.k.a(FindFriendsFragment.this.f3338e));
                        UserProfileActivity.a((Context) FindFriendsFragment.this.j, user, "find_friends", "", "main_head");
                    }
                });
                this.h.setLoadMoreListener(new o(this));
                this.mEditSearch.setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49202a;

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49202a, false, 47176, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49202a, false, 47176, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        }
                        if (motionEvent.getAction() == 1) {
                            FindFriendsFragment.this.mEditSearch.setCursorVisible(true);
                            if (FindFriendsFragment.this.k()) {
                                FindFriendsFragment.this.h.clearData();
                                FindFriendsFragment.this.mStatusView.b();
                            } else {
                                FindFriendsFragment.this.mListView.setAdapter(FindFriendsFragment.this.h);
                                FindFriendsFragment.this.mStatusView.setBuilder(FindFriendsFragment.this.i);
                                FindFriendsFragment.this.mStatusView.b();
                            }
                            if (!TextUtils.isEmpty(FindFriendsFragment.this.mTvSearchHit.getText())) {
                                FindFriendsFragment.this.mTvSearchHit.setVisibility(0);
                            }
                            FindFriendsFragment.this.mTvSearchBtn.setVisibility(0);
                            FindFriendsFragment.this.k.a("isSearch", (Object) Boolean.TRUE);
                        }
                        return false;
                    }
                });
                this.mBtnSearchClear.setOnClickListener(new p(this));
                this.f3337d = new ForegroundColorSpan(getResources().getColor(C0906R.color.zy));
                this.mEditSearch.addTextChangedListener(new TextWatcher() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49204a;

                    public final void afterTextChanged(Editable editable) {
                    }

                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        CharSequence charSequence2 = charSequence;
                        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49204a, false, 47177, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49204a, false, 47177, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        FindFriendsFragment.this.f3338e = charSequence.toString();
                        if (charSequence.length() > 0) {
                            if (FindFriendsFragment.this.h.getData() != null && FindFriendsFragment.this.h.getData().size() > 0) {
                                FindFriendsFragment.this.h.clearData();
                            }
                            FindFriendsFragment.this.mBtnSearchClear.setVisibility(0);
                            FindFriendsFragment.this.mTvSearchHit.setVisibility(0);
                            SpannableString spannableString = new SpannableString(FindFriendsFragment.this.mSearchHitString + "：" + charSequence2);
                            ForegroundColorSpan foregroundColorSpan = FindFriendsFragment.this.f3337d;
                            int length = FindFriendsFragment.this.mSearchHitString.length() + 1;
                            if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 17}, null, q.f49477a, true, 47178, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 17}, null, q.f49477a, true, 47178, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            } else {
                                spannableString.setSpan(foregroundColorSpan, 0, length, 17);
                            }
                            FindFriendsFragment.this.mTvSearchHit.setText(spannableString);
                            return;
                        }
                        FindFriendsFragment.this.j();
                    }
                });
                this.mEditSearch.setOnEditorActionListener(new h(this));
            }
            if (getActivity() != null) {
                j jVar = (j) a();
                Intent intent = getActivity().getIntent();
                if (PatchProxy.isSupport(new Object[]{intent}, jVar, j.f48862a, false, 46699, new Class[]{Intent.class}, Void.TYPE)) {
                    j jVar2 = jVar;
                    PatchProxy.accessDispatch(new Object[]{intent}, jVar2, j.f48862a, false, 46699, new Class[]{Intent.class}, Void.TYPE);
                } else {
                    jVar.f48866e = intent.getIntExtra("bundle_recommend_count", 0);
                    jVar.f48867f = intent.getStringExtra("bundle_puid");
                    jVar.g = intent.getStringExtra("bundle_sec_puid");
                }
            }
            ((j) a()).a();
            if (((Boolean) SharePrefCache.inst().getEnableFace2Face().c()).booleanValue()) {
                view.findViewById(C0906R.id.b_e).setOnClickListener(new g(this));
                view.findViewById(C0906R.id.b8l).setOnClickListener(new i(this));
                ((TextView) ViewCompat.requireViewById(view, C0906R.id.abh)).setText(C0906R.string.ac8);
            } else {
                view.findViewById(C0906R.id.b7u).setVisibility(8);
                view.findViewById(C0906R.id.dn).setVisibility(8);
            }
            this.f3336c.a(view);
            this.f3336c.b((View) new DmtStatusView(this.j));
            this.f3336c.mTextColor = getResources().getColor(C0906R.color.zx);
            this.mListView.setAdapter(this.f3336c);
            this.f3336c.k = this;
            this.f3336c.i = this;
            if (PatchProxy.isSupport(new Object[0], this, f3335b, false, 47120, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3335b, false, 47120, new Class[0], Void.TYPE);
            } else {
                this.m = DmtStatusView.a.a(getContext()).a().a(new c.a(this.j).a(2130840139).b((int) C0906R.string.aan).b("").f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new m(this));
                this.mStatusView.setBuilder(this.m);
                this.mStatusView.d();
            }
            this.mListView.bringToFront();
        }
        return inflate2;
    }

    public final void a(List<User> list, @NonNull List<User> list2, int i2, int i3) {
        List<User> list3 = list;
        List<User> list4 = list2;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{list3, list4, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3335b, false, 47140, new Class[]{List.class, List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3335b, false, 47140, new Class[]{List.class, List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            int i5 = 0;
            while (i5 < 3 && i5 < list2.size()) {
                com.ss.android.ugc.aweme.friends.a.b(list3, list4.get(i5));
                i5++;
            }
            if (!(i4 == -1 || list3 == null || i4 > list.size())) {
                for (int i6 = 0; i6 < i4; i6++) {
                    list3.get(i6).setNewRecommend(true);
                }
            }
            RecommendListAdapter recommendListAdapter = this.f3336c;
            int i7 = 5;
            if (i4 <= 5) {
                i7 = i4;
            }
            recommendListAdapter.f48755e = i7;
            RecommendListAdapter recommendListAdapter2 = this.f3336c;
            if (list4 != null) {
                recommendListAdapter2.f48752b = list4;
            }
            this.f3336c.setData(list3);
            this.f3336c.setShowFooter(true);
        } else {
            this.f3336c.addData(list3);
        }
    }

    public final /* synthetic */ void a(int i2, Object obj, int i3, View view, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        int i4 = i2;
        int i5 = i3;
        String str6 = str;
        User user = (User) obj;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), user, Integer.valueOf(i3), view, str6}, this, f3335b, false, 47146, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), user, Integer.valueOf(i3), view, str6}, this, f3335b, false, 47146, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE);
            return;
        }
        j jVar = (j) a();
        RecommendList recommendList = jVar.h;
        RecommendList b2 = jVar.b();
        if (recommendList == null || !recommendList.getUserList().contains(user)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str2 = recommendList.rid;
        } else {
            str2 = b2.rid;
        }
        if (z) {
            str3 = "recent_fans";
        } else if (user.isNewRecommend()) {
            str3 = "new";
        } else {
            str3 = "past";
        }
        if (i4 == 101) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", str2);
                jSONObject.put("enter_from", "invite_friend");
                jSONObject.put("enter_method", "click_head");
                jSONObject.put("enter_type", "normal_way");
            } catch (Exception unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("rec_uid", user.getUid());
                jSONObject2.put("enter_from", this.f3336c.l);
                jSONObject2.put("event_type", "enter_profile");
                jSONObject2.put("impr_order", i5);
                jSONObject2.put("req_id", str2);
                jSONObject2.put("trigger_reason", "friend_rec_message");
                jSONObject2.put("rec_reason", user.getRecommendReason());
                jSONObject2.put("card_type", str3);
            } catch (Exception unused2) {
            }
            r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject2));
            r.a("follow_card", jSONObject2);
            r.a("enter_personal_detail_backup", (Map) d.a().a("enter_from", this.f3336c.l).a("to_user_id", user.getUid()).a("group_id", "").a("request_id", ((j) a()).b().rid).a("enter_method", "click_card").f34114b);
            ((q) new q().k(user.getUid()).b("find_friends").a(str6)).l(((j) a()).b().rid).e();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("to_user_id", user.getUid());
                jSONObject3.put("request_id", ((j) a()).b().rid);
            } catch (Exception unused3) {
            }
            if ("click_name".equals(str6)) {
                str5 = "name";
            } else {
                str5 = "head";
            }
            r.onEvent(MobClick.obtain().setEventName(str5).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
            UserProfileActivity.a(getContext(), user, str2);
            a(i5);
            return;
        }
        if (i4 == 100) {
            if (isViewValid()) {
                if (!NetworkUtils.isNetworkAvailable(this.j)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.j, (int) C0906R.string.bgf).a();
                    return;
                }
                this.p = user;
                this.q = (ak) view;
                if (user.getFollowStatus() != 0) {
                    i6 = 1;
                }
                int i7 = i6 ^ 1;
                bg.a(new com.ss.android.ugc.aweme.challenge.a.a(i7, user));
                if (i7 == 0) {
                    r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow_cancel").setValue(String.valueOf(user.getUid())));
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("request_id", str2);
                    } catch (Exception unused4) {
                    }
                    r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow").setValue(String.valueOf(user.getUid())).setJsonObject(jSONObject4));
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("rec_uid", user.getUid());
                        jSONObject5.put("enter_from", this.f3336c.l);
                        jSONObject5.put("event_type", "follow");
                        jSONObject5.put("impr_order", i5);
                        jSONObject5.put("req_id", str2);
                        jSONObject5.put("trigger_reason", "friend_rec_message");
                        jSONObject5.put("rec_reason", user.getRecommendReason());
                        jSONObject5.put("card_type", str3);
                    } catch (Exception unused5) {
                    }
                    r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                    r.a("follow_card", jSONObject5);
                    r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(String.valueOf(user.getUid())));
                }
                if (i7 == 0) {
                    str4 = "follow_cancel";
                } else {
                    str4 = "follow";
                }
                new com.ss.android.ugc.aweme.u.s(str4).f("personal_homepage").g("other_places").b("find_friends").c("follow_button").k(user.getRequestId()).h(user.getUid()).e();
            }
        } else if (i4 == 102 && isViewValid()) {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                return;
            }
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put("rec_uid", user.getUid());
                jSONObject6.put("enter_from", this.f3336c.l);
                jSONObject6.put("event_type", "delete");
                jSONObject6.put("impr_order", i5);
                jSONObject6.put("req_id", str2);
                jSONObject6.put("trigger_reason", "friend_rec_message");
                jSONObject6.put("rec_reason", user.getRecommendReason());
                jSONObject6.put("card_type", str3);
            } catch (Exception unused6) {
            }
            r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject6));
            r.a("follow_card", jSONObject6);
            final String uid = user.getUid();
            if (PatchProxy.isSupport(new Object[]{uid}, this, f3335b, false, 47147, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{uid}, this, f3335b, false, 47147, new Class[]{String.class}, Void.TYPE);
            } else {
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49209a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f49209a, false, 47181, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f49209a, false, 47181, new Class[0], Void.TYPE);
                            return;
                        }
                        try {
                            DiscoverApi.a(uid);
                        } catch (Exception unused) {
                        }
                    }
                });
            }
            if (PatchProxy.isSupport(new Object[]{user}, this, f3335b, false, 47148, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user}, this, f3335b, false, 47148, new Class[]{User.class}, Void.TYPE);
                return;
            }
            this.f3336c.a(user);
            com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.nx).a();
        }
    }
}
