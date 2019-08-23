package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;

public class RecommendUserViewHolder extends RecyclerView.ViewHolder implements b<RecommendUserCardViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57669a;

    /* renamed from: b  reason: collision with root package name */
    public RecommendCommonUserView f57670b;

    /* renamed from: c  reason: collision with root package name */
    public String f57671c;

    /* renamed from: d  reason: collision with root package name */
    public String f57672d;

    /* renamed from: e  reason: collision with root package name */
    public String f57673e = "empty";

    /* renamed from: f  reason: collision with root package name */
    List<String> f57674f;

    public final int a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f57669a, false, 62654, new Class[]{User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{user}, this, f57669a, false, 62654, new Class[]{User.class}, Integer.TYPE)).intValue();
        } else if (user == null) {
            return 0;
        } else {
            Integer num = (Integer) this.f57670b.getPosInApiListMap().get(user.getUid());
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
    }

    public RecommendUserViewHolder(RecommendCommonUserView recommendCommonUserView) {
        super(recommendCommonUserView);
        View view;
        this.f57670b = recommendCommonUserView;
        if (AbTestManager.a().j()) {
            this.f57670b.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) UIUtils.dip2Px(this.f57670b.getContext(), 320.0f)));
            view = this.f57670b.findViewById(C0906R.id.ccc);
        } else {
            this.f57670b.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) UIUtils.dip2Px(this.f57670b.getContext(), 300.0f)));
            view = this.f57670b.findViewById(C0906R.id.ccc);
        }
        View findViewById = this.f57670b.findViewById(C0906R.id.dh4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = (int) UIUtils.dip2Px(this.f57670b.getContext(), 28.0f);
        findViewById.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.bottomMargin = (int) UIUtils.dip2Px(this.f57670b.getContext(), 28.0f);
        view.setLayoutParams(marginLayoutParams2);
        this.f57670b.setOnViewAttachedToWindowListener(this);
    }

    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder) {
        String str;
        RecommendUserCardViewHolder recommendUserCardViewHolder = (RecommendUserCardViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{recommendUserCardViewHolder}, this, f57669a, false, 62655, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendUserCardViewHolder}, this, f57669a, false, 62655, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE);
            return;
        }
        if (recommendUserCardViewHolder != null) {
            User user = recommendUserCardViewHolder.f63087d;
            if (user != null) {
                if (this.f57674f == null) {
                    this.f57674f = new ArrayList();
                }
                if (!this.f57674f.contains(user.getUid())) {
                    k.a().a(2, user.getUid());
                    if (a.a()) {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "impression", a(user), this.f57672d);
                    } else {
                        int a2 = a(user);
                        String str2 = this.f57672d;
                        String str3 = this.f57673e;
                        if (TextUtils.equals("extra_follow_type_friend", this.f57671c)) {
                            str = "homepage_friends";
                        } else {
                            str = "homepage_follow";
                        }
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "impression", a2, str2, str3, str);
                    }
                    this.f57674f.add(user.getUid());
                }
            }
        }
    }

    public final void a(List<User> list, String str) {
        if (PatchProxy.isSupport(new Object[]{list, str}, this, f57669a, false, 62653, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str}, this, f57669a, false, 62653, new Class[]{List.class, String.class}, Void.TYPE);
            return;
        }
        this.f57672d = str;
        this.f57670b.a(list, this.f57672d);
        this.f57670b.setOnItemOperationListener(new RecommendUserAdapter.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57675a;

            public final void b(User user, int i) {
                if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f57675a, false, 62657, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f57675a, false, 62657, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.newfollow.c.a aVar = new com.ss.android.ugc.aweme.newfollow.c.a();
                aVar.f57079a = 1;
                aVar.f57080b = RecommendUserViewHolder.this.getAdapterPosition();
                bg.a(aVar);
            }

            public final void a(User user, int i) {
                String str;
                if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f57675a, false, 62656, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f57675a, false, 62656, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.newfollow.c.a aVar = new com.ss.android.ugc.aweme.newfollow.c.a();
                aVar.f57079a = 3;
                aVar.f57081c = user.getUid();
                bg.a(aVar);
                if (a.a()) {
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user, "delete", RecommendUserViewHolder.this.a(user), RecommendUserViewHolder.this.f57672d);
                    return;
                }
                int a2 = RecommendUserViewHolder.this.a(user);
                String str2 = RecommendUserViewHolder.this.f57672d;
                String str3 = RecommendUserViewHolder.this.f57673e;
                if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f57671c)) {
                    str = "homepage_friends";
                } else {
                    str = "homepage_follow";
                }
                com.ss.android.ugc.aweme.newfollow.g.a.a(user, "delete", a2, str2, str3, str);
            }

            public final void c(User user, int i) {
                String str;
                User user2 = user;
                if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i)}, this, f57675a, false, 62658, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i)}, this, f57675a, false, 62658, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                } else if (a.a()) {
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user2, "follow", RecommendUserViewHolder.this.a(user2), RecommendUserViewHolder.this.f57672d);
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user);
                } else {
                    String str2 = RecommendUserViewHolder.this.f57672d;
                    String uid = user.getUid();
                    int followStatus = user.getFollowStatus();
                    if (PatchProxy.isSupport(new Object[]{str2, uid, Integer.valueOf(followStatus)}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61382, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, uid, Integer.valueOf(followStatus)}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61382, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(str2, uid, false, followStatus);
                    }
                    int a2 = RecommendUserViewHolder.this.a(user2);
                    String str3 = RecommendUserViewHolder.this.f57672d;
                    String str4 = RecommendUserViewHolder.this.f57673e;
                    if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f57671c)) {
                        str = "homepage_friends";
                    } else {
                        str = "homepage_follow";
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user, "follow", a2, str3, str4, str);
                }
            }

            public final void d(User user, int i) {
                String str;
                User user2 = user;
                if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i)}, this, f57675a, false, 62659, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i)}, this, f57675a, false, 62659, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                } else if (a.a()) {
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user2, "enter_profile", RecommendUserViewHolder.this.a(user2), RecommendUserViewHolder.this.f57672d);
                    com.ss.android.ugc.aweme.newfollow.g.a.a(RecommendUserViewHolder.this.f57672d, user2);
                } else {
                    int a2 = RecommendUserViewHolder.this.a(user2);
                    String str2 = RecommendUserViewHolder.this.f57672d;
                    String str3 = RecommendUserViewHolder.this.f57673e;
                    if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f57671c)) {
                        str = "homepage_friends";
                    } else {
                        str = "homepage_follow";
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user, "enter_profile", a2, str2, str3, str);
                    String uid = user.getUid();
                    String str4 = RecommendUserViewHolder.this.f57672d;
                    if (PatchProxy.isSupport(new Object[]{uid, str4}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61387, new Class[]{String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{uid, str4}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61387, new Class[]{String.class, String.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(uid, str4, false);
                }
            }
        });
        this.f57670b.setOnLookMoreUserListener(new RecommendCommonUserView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57677a;

            public final void a(String str) {
                String str2;
                String str3;
                String str4;
                if (PatchProxy.isSupport(new Object[]{str}, this, f57677a, false, 62660, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f57677a, false, 62660, new Class[]{String.class}, Void.TYPE);
                } else if (a.a()) {
                    Context context = RecommendUserViewHolder.this.f57670b.getContext();
                    IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                    Context context2 = RecommendUserViewHolder.this.f57670b.getContext();
                    if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f57671c)) {
                        str4 = "homepage_friends";
                    } else {
                        str4 = "homepage_follow";
                    }
                    context.startActivity(iBridgeService.getAddFriendsActivityIntent(context2, -1, 2, str, str4));
                    com.ss.android.ugc.aweme.newfollow.g.a.c();
                } else {
                    Context context3 = RecommendUserViewHolder.this.f57670b.getContext();
                    String curUserId = d.a().getCurUserId();
                    if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f57671c)) {
                        str2 = "homepage_friends_more";
                    } else {
                        str2 = "homepage_follow_more";
                    }
                    if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f57671c)) {
                        str3 = "homepage_friends";
                    } else {
                        str3 = "homepage_follow";
                    }
                    RecommendUserActivity.a(context3, curUserId, 2, str2, str3, str);
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61378, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61378, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(false);
                }
            }
        });
    }
}
