package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.captcha.c.b;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.adapter.FriendsAdapter;
import com.ss.android.ugc.aweme.friends.adapter.FriendsViewHolder;
import com.ss.android.ugc.aweme.friends.adapter.UnRegisteredFriendsViewHolder;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.d.a;
import com.ss.android.ugc.aweme.friends.d.e;
import com.ss.android.ugc.aweme.friends.d.g;
import com.ss.android.ugc.aweme.friends.d.h;
import com.ss.android.ugc.aweme.friends.d.n;
import com.ss.android.ugc.aweme.friends.model.ContactFriendWithUnregisteredUserModel;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.InviteStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class ContactsActivity extends AmeSSActivity implements LoadMoreRecyclerViewAdapter.a, e<User>, g, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3329a;

    /* renamed from: b  reason: collision with root package name */
    public FriendsAdapter<User> f3330b;

    /* renamed from: c  reason: collision with root package name */
    a f3331c;

    /* renamed from: d  reason: collision with root package name */
    public i f3332d;

    /* renamed from: e  reason: collision with root package name */
    public String f3333e = "";
    @BindView(2131494137)
    RelativeLayout enterBindRl;

    /* renamed from: f  reason: collision with root package name */
    public h f3334f;
    public List<Friend> g = new ArrayList();
    private n h;
    private FriendApi i;
    @BindView(2131493577)
    ImageView ivBindPhone;
    private HashSet<String> j = new HashSet<>();
    private RegisteredAmountViewHolder k;
    private boolean l = false;
    private InviteContactFriendsModel m = new InviteContactFriendsModel("contact");
    @BindView(2131495411)
    RecyclerView mListView;
    @BindView(2131496683)
    SwipeRefreshLayout mRefreshLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497604)
    TextTitleBar mTitleBar;
    private com.ss.android.ugc.aweme.friends.a.a n = new com.ss.android.ugc.aweme.friends.a.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49169a;

        public final boolean a(final Friend friend) {
            if (PatchProxy.isSupport(new Object[]{friend}, this, f49169a, false, 47091, new Class[]{Friend.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{friend}, this, f49169a, false, 47091, new Class[]{Friend.class}, Boolean.TYPE)).booleanValue();
            } else if (ContactsActivity.this.g.contains(friend)) {
                return false;
            } else {
                ContactsActivity.this.g.add(friend);
                final ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
                User curUser = d.a().getCurUser();
                ContactsActivity.this.f3334f.a(curUser, Arrays.asList(new ContactModel[]{contactModel}), new InviteContactFriendsModel.InviteFriendsCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49171a;

                    public final void onSuccess() {
                        int i;
                        Friend friend;
                        if (PatchProxy.isSupport(new Object[0], this, f49171a, false, 47092, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f49171a, false, 47092, new Class[0], Void.TYPE);
                        } else if (ContactsActivity.this.isViewValid()) {
                            friend.setInvited(true);
                            ContactsActivity.this.g.remove(friend);
                            FriendsAdapter<User> friendsAdapter = ContactsActivity.this.f3330b;
                            ContactModel contactModel = contactModel;
                            if (PatchProxy.isSupport(new Object[]{contactModel}, friendsAdapter, FriendsAdapter.f48724f, false, 46291, new Class[]{ContactModel.class}, Integer.TYPE)) {
                                FriendsAdapter<User> friendsAdapter2 = friendsAdapter;
                                i = ((Integer) PatchProxy.accessDispatch(new Object[]{contactModel}, friendsAdapter2, FriendsAdapter.f48724f, false, 46291, new Class[]{ContactModel.class}, Integer.TYPE)).intValue();
                            } else {
                                if (contactModel != null) {
                                    int size = friendsAdapter.mItems.size();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= size) {
                                            break;
                                        }
                                        if (friendsAdapter.mItems.get(i2) instanceof Friend) {
                                            friend = (Friend) friendsAdapter.mItems.get(i2);
                                        } else {
                                            friend = null;
                                        }
                                        if (friend != null && contactModel.equals(new ContactModel(friend.getSocialName(), friend.getNickname()))) {
                                            i = i2;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                i = -1;
                            }
                            int i3 = i + (ContactsActivity.this.f3330b.c() ? 1 : 0);
                            if (i3 != -1) {
                                UnRegisteredFriendsViewHolder unRegisteredFriendsViewHolder = (UnRegisteredFriendsViewHolder) ContactsActivity.this.mListView.findViewHolderForAdapterPosition(i3);
                                if (unRegisteredFriendsViewHolder != null) {
                                    if (PatchProxy.isSupport(new Object[0], unRegisteredFriendsViewHolder, UnRegisteredFriendsViewHolder.f48778a, false, 46370, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], unRegisteredFriendsViewHolder, UnRegisteredFriendsViewHolder.f48778a, false, 46370, new Class[0], Void.TYPE);
                                    } else if (UnRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48781d) != null) {
                                        if (!UnRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48781d).isInvited()) {
                                            unRegisteredFriendsViewHolder.i.a();
                                        } else {
                                            unRegisteredFriendsViewHolder.i.b();
                                        }
                                    }
                                }
                            }
                            com.bytedance.ies.dmt.ui.d.a.b((Context) ContactsActivity.this, (int) C0906R.string.cmx).a();
                        }
                    }

                    public final void onFailed(String str) {
                        if (PatchProxy.isSupport(new Object[]{str}, this, f49171a, false, 47093, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f49171a, false, 47093, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        ContactsActivity.this.g.remove(friend);
                        if (TextUtils.isEmpty(str)) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) ContactsActivity.this, (int) C0906R.string.cba).a();
                        } else {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) ContactsActivity.this, str).a();
                        }
                    }
                });
                r.a("invite_friend_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).f34114b);
                return true;
            }
        }

        public final boolean a(String str, String str2, int i) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, f49169a, false, 47090, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, f49169a, false, 47090, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!NetworkUtils.isNetworkAvailable(ContactsActivity.this)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) ContactsActivity.this, (int) C0906R.string.bgf).a();
                return false;
            } else if (ContactsActivity.this.f3332d == null || ContactsActivity.this.f3332d.m()) {
                return false;
            } else {
                ContactsActivity.this.f3332d.a(new i.a().a(str).b(str4).a(i).b(4).c(ContactsActivity.this.f3333e).a());
                return true;
            }
        }
    };

    class RegisteredAmountViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49178a;

        /* renamed from: b  reason: collision with root package name */
        DmtTextView f49179b;

        private RegisteredAmountViewHolder(View view) {
            super(view);
            this.f49179b = (DmtTextView) view.findViewById(C0906R.id.dn3);
        }

        /* synthetic */ RegisteredAmountViewHolder(ContactsActivity contactsActivity, View view, byte b2) {
            this(view);
        }
    }

    public final void a(List<User> list, boolean z) {
    }

    public final void c(Exception exc) {
    }

    public final void d(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47083, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3329a, false, 47084, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3329a, false, 47084, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void z_() {
    }

    @OnClick({2131493577})
    public void closeBindPhoneHint() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47080, new Class[0], Void.TYPE);
            return;
        }
        this.enterBindRl.setVisibility(8);
        SharePrefCache.inst().getHasEnterBindPhone().a(Boolean.TRUE);
    }

    @OnClick({2131494138})
    public void enterBindPhone() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47079, new Class[0], Void.TYPE);
            return;
        }
        c.c().bindMobile(this, "", null, null);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47081, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        com.ss.android.ugc.aweme.ae.c.a(this);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47070, new Class[0], Void.TYPE);
            return;
        }
        this.f3331c.a(4);
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47063, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47062, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47062, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f3331c != null) {
            this.f3331c.k();
        }
        if (this.f3332d != null) {
            this.f3332d.k();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47067, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f3330b.showLoadMoreLoading();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47061, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47075, new Class[0], Void.TYPE);
            return;
        }
        if (!((Boolean) SharePrefCache.inst().getIsContactsUploaded().c()).booleanValue()) {
            if (this.f3331c == null) {
                this.f3331c = new a();
            }
            this.f3331c.a(this);
            this.f3331c.a(new ContactFriendWithUnregisteredUserModel());
            this.mStatusView.postDelayed(new c(this), 200);
        }
        SharePrefCache.inst().getIsContactsUploaded().a(Boolean.TRUE);
        a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47065, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f3330b.setData(null);
            this.f3330b.b();
            this.f3330b.resetLoadMoreState();
            this.mStatusView.setVisibility(0);
            this.mStatusView.e();
        }
    }

    public final void e(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3329a, false, 47078, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3329a, false, 47078, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(this, exc, C0906R.string.afx);
        int a2 = this.f3330b.a(this.f3332d.f61632c);
        if (a2 >= 0) {
            if (this.f3330b.c()) {
                a2++;
            }
            FriendsViewHolder friendsViewHolder = (FriendsViewHolder) this.mListView.findViewHolderForAdapterPosition(a2);
            if (friendsViewHolder != null) {
                friendsViewHolder.a();
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3329a, false, 47077, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3329a, false, 47077, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid() && this.f3332d != null && this.f3330b != null) {
            if (b.a(exc)) {
                b.a(getSupportFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49175a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f49175a, false, 47094, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f49175a, false, 47094, new Class[0], Void.TYPE);
                            return;
                        }
                        ContactsActivity.this.f3332d.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f49175a, false, 47095, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f49175a, false, 47095, new Class[0], Void.TYPE);
                            return;
                        }
                        ContactsActivity.this.e(exc);
                    }
                });
            } else {
                e(exc);
            }
        }
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3329a, false, 47082, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3329a, false, 47082, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.i.queryContactsFriends(0, 20, 1).a((a.g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(str2), a.i.f1052b);
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3329a, false, 47064, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3329a, false, 47064, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (this.f3330b.getData() == null) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.e();
            }
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3329a, false, 47071, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3329a, false, 47071, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3329a, false, 47072, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3329a, false, 47072, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            FriendsAdapter<User> friendsAdapter = this.f3330b;
            if (PatchProxy.isSupport(new Object[]{followStatus2}, friendsAdapter, FriendsAdapter.f48724f, false, 46290, new Class[]{FollowStatus.class}, Void.TYPE)) {
                FriendsAdapter<User> friendsAdapter2 = friendsAdapter;
                PatchProxy.accessDispatch(new Object[]{followStatus2}, friendsAdapter2, FriendsAdapter.f48724f, false, 46290, new Class[]{FollowStatus.class}, Void.TYPE);
            } else {
                int a2 = friendsAdapter.a(followStatus2.userId);
                if (a2 != -1 && a2 < friendsAdapter.mItems.size()) {
                    User user = (User) friendsAdapter.mItems.get(a2);
                    if (user != null) {
                        user.setFollowStatus(followStatus2.followStatus);
                    }
                }
            }
            int a3 = this.f3330b.a(followStatus2.userId);
            if (a3 != -1) {
                if (this.f3330b.c()) {
                    a3++;
                }
                FriendsViewHolder friendsViewHolder = (FriendsViewHolder) this.mListView.findViewHolderForAdapterPosition(a3);
                if (friendsViewHolder != null) {
                    friendsViewHolder.a();
                }
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        User user;
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3329a, false, 47076, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3329a, false, 47076, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        FriendsAdapter<User> friendsAdapter = this.f3330b;
        String str = followStatus2.userId;
        if (PatchProxy.isSupport(new Object[]{str}, friendsAdapter, FriendsAdapter.f48724f, false, 46293, new Class[]{String.class}, User.class)) {
            Object[] objArr = {str};
            FriendsAdapter<User> friendsAdapter2 = friendsAdapter;
            user = (User) PatchProxy.accessDispatch(objArr, friendsAdapter2, FriendsAdapter.f48724f, false, 46293, new Class[]{String.class}, User.class);
        } else {
            if (friendsAdapter.mItems != null) {
                Iterator it2 = friendsAdapter.mItems.iterator();
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
        if (user != null) {
            if (com.ss.android.ugc.aweme.profile.d.i.a(this, user, followStatus2)) {
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(this);
                remarkEditDialog.g = user;
                remarkEditDialog.h = followStatus2.contactName;
                remarkEditDialog.i = 1;
                remarkEditDialog.f63095f = new d(this, user, followStatus2);
                remarkEditDialog.show();
            }
            if (followStatus2.followStatus == 0 && !TextUtils.isEmpty(user.getRemarkName())) {
                user.setRemarkName("");
                int b2 = this.f3330b.b(followStatus2.userId);
                if (b2 != -1) {
                    this.f3330b.notifyItemChanged(b2);
                }
            }
        }
    }

    @Subscribe
    public void onInviteStatusUpdate(InviteStatus inviteStatus) {
        InviteStatus inviteStatus2 = inviteStatus;
        if (PatchProxy.isSupport(new Object[]{inviteStatus2}, this, f3329a, false, 47073, new Class[]{InviteStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inviteStatus2}, this, f3329a, false, 47073, new Class[]{InviteStatus.class}, Void.TYPE);
        } else if (isViewValid()) {
            FriendsAdapter<User> friendsAdapter = this.f3330b;
            if (PatchProxy.isSupport(new Object[]{inviteStatus2}, friendsAdapter, FriendsAdapter.f48724f, false, 46295, new Class[]{InviteStatus.class}, Void.TYPE)) {
                FriendsAdapter<User> friendsAdapter2 = friendsAdapter;
                PatchProxy.accessDispatch(new Object[]{inviteStatus2}, friendsAdapter2, FriendsAdapter.f48724f, false, 46295, new Class[]{InviteStatus.class}, Void.TYPE);
            } else {
                int c2 = friendsAdapter.c(inviteStatus2.mobileId);
                if (c2 != -1 && c2 < friendsAdapter.mItems.size()) {
                    User user = (User) friendsAdapter.mItems.get(c2);
                    if (user instanceof Friend) {
                        ((Friend) user).setInvited(inviteStatus2.inviteStatus);
                    }
                }
            }
            int c3 = this.f3330b.c(inviteStatus2.mobileId);
            if (c3 != -1) {
                if (this.f3330b.c()) {
                    c3++;
                }
                FriendsViewHolder friendsViewHolder = (FriendsViewHolder) this.mListView.findViewHolderForAdapterPosition(c3);
                if (friendsViewHolder != null) {
                    if (PatchProxy.isSupport(new Object[0], friendsViewHolder, FriendsViewHolder.f48732a, false, 46313, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], friendsViewHolder, FriendsViewHolder.f48732a, false, 46313, new Class[0], Void.TYPE);
                    } else if (FriendsViewHolder.a(friendsViewHolder.f48735d) != null) {
                        if (!FriendsViewHolder.a(friendsViewHolder.f48735d).isInvited()) {
                            friendsViewHolder.j.a();
                            return;
                        }
                        friendsViewHolder.j.b();
                    }
                }
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3329a, false, 47074, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3329a, false, 47074, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.mStatusView.setVisibility(0);
        this.mStatusView.e();
        a(PushConstants.PUSH_TYPE_NOTIFY);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3329a, false, 47059, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3329a, false, 47059, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.au);
        this.f3334f = new h(this.m, null);
        if (PatchProxy.isSupport(new Object[0], this, f3329a, false, 47060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3329a, false, 47060, new Class[0], Void.TYPE);
        } else {
            this.i = com.ss.android.ugc.aweme.friends.api.a.a();
            if (getIntent().hasExtra("enter_from")) {
                this.f3333e = getIntent().getStringExtra("enter_from");
            }
            this.l = getIntent().getBooleanExtra("just_granted_read_contacts", false);
            User curUser = d.a().getCurUser();
            if (((Boolean) SharePrefCache.inst().getHasEnterBindPhone().c()).booleanValue() || curUser.isPhoneBinded()) {
                this.enterBindRl.setVisibility(8);
            } else {
                this.enterBindRl.setVisibility(0);
            }
            this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49167a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49167a, false, 47089, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49167a, false, 47089, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ContactsActivity.this.onBackPressed();
                }
            });
            this.mTitleBar.setTitle(getText(C0906R.string.bbx));
            this.mTitleBar.setTitleColor(getResources().getColor(C0906R.color.anp));
            if (com.ss.android.ugc.aweme.message.c.c.a().d(4)) {
                com.ss.android.ugc.aweme.message.c.c.a().a(4);
                bg.a(new com.ss.android.ugc.aweme.message.b.c(4));
            }
            if (com.ss.android.ugc.aweme.message.c.c.a().d(102)) {
                com.ss.android.ugc.aweme.message.c.c.a().a(102);
                bg.a(new com.ss.android.ugc.aweme.message.b.c(102));
            }
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).a(new c.a(this).b((int) C0906R.string.b5r).c(C0906R.string.aah).a(2130840145).f20493a));
            this.f3330b = new FriendsAdapter<>(0, this.n);
            this.f3330b.setLoadMoreListener(this);
            this.f3330b.mTextColor = getResources().getColor(C0906R.color.zx);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
            wrapLinearLayoutManager.setOrientation(1);
            this.mListView.setLayoutManager(wrapLinearLayoutManager);
            this.mListView.setOverScrollMode(2);
            this.k = new RegisteredAmountViewHolder(this, LayoutInflater.from(this).inflate(C0906R.layout.a4l, this.mListView, false), (byte) 0);
            this.mListView.setAdapter(this.f3330b);
            this.mStatusView.d();
            this.mRefreshLayout.setOnRefreshListener(new b(this));
            if (((Boolean) SharePrefCache.inst().getIsContactsUploaded().c()).booleanValue()) {
                this.f3331c = new a();
                this.f3331c.a(this);
                this.f3331c.a(new ContactFriendWithUnregisteredUserModel());
                this.f3331c.a(1);
            }
            this.h = new n();
            this.h.a(this);
            this.h.a(new com.ss.android.ugc.aweme.friends.d.m());
            if (this.l) {
                n nVar = this.h;
                if (PatchProxy.isSupport(new Object[0], nVar, n.f48883a, false, 46712, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], nVar, n.f48883a, false, 46712, new Class[0], Void.TYPE);
                } else {
                    nVar.f48884b.add(Long.valueOf(System.currentTimeMillis()));
                    nVar.a(new Object[0]);
                }
            } else {
                this.h.a(new Object[0]);
            }
            this.f3332d = new i();
            this.f3332d.a(this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", false);
    }

    public final void c(List<User> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3329a, false, 47069, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3329a, false, 47069, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (list != null) {
            for (User next : list) {
                if (!this.j.contains(next.getUid())) {
                    r.a("contacts_friends_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_user_id", next.getUid()).f34114b);
                    this.j.add(next.getUid());
                }
            }
        }
    }

    public final void b(List<User> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3329a, false, 47068, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3329a, false, 47068, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f3330b.resetLoadMoreState();
            this.f3330b.setDataAfterLoadMore(list);
            this.mStatusView.setVisibility(4);
            if (!z) {
                this.f3330b.showLoadMoreEmpty();
                this.f3330b.setLoadMoreListener(null);
            } else {
                this.f3330b.resetLoadMoreState();
                this.f3330b.setLoadMoreListener(this);
            }
            for (User next : list) {
                if (!this.j.contains(next.getUid())) {
                    r.a("contacts_friends_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_user_id", next.getUid()).f34114b);
                    this.j.add(next.getUid());
                }
            }
        }
    }

    public static Intent a(@NonNull Context context, @Nullable String str, boolean z) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f3329a, true, 47058, new Class[]{Context.class, String.class, Boolean.TYPE}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2, str2, Byte.valueOf(z)}, null, f3329a, true, 47058, new Class[]{Context.class, String.class, Boolean.TYPE}, Intent.class);
        }
        Intent intent = new Intent(context2, ContactsActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str2);
        }
        intent.putExtra("just_granted_read_contacts", z);
        return intent;
    }

    public final void a(List<User> list, boolean z, int i2) {
        List<User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f3329a, false, 47066, new Class[]{List.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), Integer.valueOf(i2)}, this, f3329a, false, 47066, new Class[]{List.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (list2 == null) {
                this.mStatusView.setVisibility(0);
                return;
            }
            if (this.k == null || i2 <= 0) {
                this.f3330b.b();
            } else {
                RegisteredAmountViewHolder registeredAmountViewHolder = this.k;
                String valueOf = String.valueOf(i2);
                if (PatchProxy.isSupport(new Object[]{valueOf, Byte.valueOf(z)}, registeredAmountViewHolder, RegisteredAmountViewHolder.f49178a, false, 47096, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueOf, Byte.valueOf(z)}, registeredAmountViewHolder, RegisteredAmountViewHolder.f49178a, false, 47096, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    DmtTextView dmtTextView = registeredAmountViewHolder.f49179b;
                    ContactsActivity contactsActivity = ContactsActivity.this;
                    Object[] objArr = new Object[1];
                    if (z) {
                        valueOf = valueOf + "+";
                    }
                    objArr[0] = valueOf;
                    dmtTextView.setText(contactsActivity.getString(C0906R.string.aig, objArr));
                }
                this.f3330b.a(this.k.itemView);
            }
            this.f3330b.resetLoadMoreState();
            this.f3330b.setData(list);
            this.mStatusView.setVisibility(4);
            if (!z) {
                this.f3330b.showLoadMoreEmpty();
                this.f3330b.setLoadMoreListener(null);
            } else {
                this.f3330b.resetLoadMoreState();
                this.f3330b.setLoadMoreListener(this);
            }
            for (User next : list) {
                if (!this.j.contains(next.getUid())) {
                    r.a("contacts_friends_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_user_id", next.getUid()).f34114b);
                    this.j.add(next.getUid());
                }
            }
        }
    }
}
