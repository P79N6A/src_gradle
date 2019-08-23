package com.ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.an;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.y;
import com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.ArrayList;
import java.util.List;

public class b implements com.ss.android.ugc.aweme.common.d.b<RecommendUserCardViewHolder>, o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45380a = null;

    /* renamed from: c  reason: collision with root package name */
    public static final String f45381c = "b";

    /* renamed from: b  reason: collision with root package name */
    public View f45382b;

    /* renamed from: d  reason: collision with root package name */
    public Context f45383d;

    /* renamed from: e  reason: collision with root package name */
    public RecommendCommonUserView f45384e = ((RecommendCommonUserView) this.f45382b.findViewById(C0906R.id.duf));

    /* renamed from: f  reason: collision with root package name */
    public y f45385f;
    public Fragment g;
    public boolean h;
    public String i;
    private DmtDefaultView j = ((DmtDefaultView) this.f45382b.findViewById(C0906R.id.a38));
    private List<String> k;
    private boolean l;

    public void onLoadMoreRecommendSuccess(RecommendList recommendList) {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45380a, false, 41177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45380a, false, 41177, new Class[0], Void.TYPE);
        } else if (this.h) {
            this.f45384e.setVisibility(8);
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45380a, false, 41173, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45380a, false, 41173, new Class[0], Void.TYPE);
        } else if (((Boolean) SharePrefCache.inst().getIsContactsUploaded().c()).booleanValue()) {
            c cVar = new c.a(this.f45383d).b((int) C0906R.string.agd).c(C0906R.string.ag6).f20493a;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams.topMargin = (int) UIUtils.dip2Px(this.f45383d, 70.0f);
            this.j.setLayoutParams(layoutParams);
            this.j.setStatus(cVar);
            this.l = true;
        } else {
            this.l = false;
            this.j.setStatus(new c.a(this.f45383d).a(2130840139).b((int) C0906R.string.agd).c(C0906R.string.ag6).a(a.SOLID, C0906R.string.a1l, new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45386a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f45386a, false, 41183, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f45386a, false, 41183, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (b.this.f45383d != null) {
                        b bVar = b.this;
                        if (PatchProxy.isSupport(new Object[0], bVar, b.f45380a, false, 41172, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], bVar, b.f45380a, false, 41172, new Class[0], Void.TYPE);
                        } else {
                            if (!((Boolean) SharePrefCache.inst().getIsContactsUploaded().c()).booleanValue()) {
                                com.ss.android.b.a.a.a.a(c.f45397b);
                            }
                            bVar.a();
                        }
                        r.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
                        if (ap.b(b.this.g.getActivity())) {
                            Intent a2 = ContactsActivity.a(b.this.f45383d, (String) null, false);
                            if (b.this.g != null) {
                                b.this.g.startActivityForResult(a2, 1);
                            } else {
                                b.this.f45383d.startActivity(a2);
                            }
                        } else {
                            com.bytedance.ies.dmt.ui.d.a.c(b.this.f45383d, (int) C0906R.string.eh).a();
                            ap.a((Activity) b.this.g.getActivity(), (ap.a) new ap.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f45388a;

                                public final void b() {
                                }

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f45388a, false, 41184, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f45388a, false, 41184, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    b.this.g.startActivityForResult(ContactsActivity.a((Context) b.this.g.getActivity(), (String) null, true), 1);
                                }
                            });
                        }
                    }
                }
            }).f20493a);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45380a, false, 41174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45380a, false, 41174, new Class[0], Void.TYPE);
            return;
        }
        if (this.l) {
            if (PatchProxy.isSupport(new Object[0], this, f45380a, false, 41175, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45380a, false, 41175, new Class[0], Void.TYPE);
            } else if (this.h) {
                if (this.f45385f == null) {
                    this.f45385f = new y(new RecommendCommonUserModel(), this);
                }
                this.f45385f.a(30, d.a().getCurUserId(), 2, e.a(), (String) null, e.b());
                an.a("api_recommend_user", "empty_guide", "refresh");
            }
        }
    }

    public b(Context context) {
        this.f45382b = LayoutInflater.from(context).inflate(C0906R.layout.lx, null);
        this.f45383d = context;
        a();
    }

    public final int a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f45380a, false, 41181, new Class[]{User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{user}, this, f45380a, false, 41181, new Class[]{User.class}, Integer.TYPE)).intValue();
        } else if (user != null) {
            return this.f45385f.a(user.getUid());
        } else {
            return 0;
        }
    }

    public void onRecommendFailed(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f45380a, false, 41178, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f45380a, false, 41178, new Class[]{Exception.class}, Void.TYPE);
        } else if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.a.c) {
            c();
        } else {
            com.ss.android.ugc.aweme.app.api.a.a.a(this.f45383d, (Throwable) exc2);
        }
    }

    public void onRefreshRecommendSuccess(RecommendList recommendList) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, f45380a, false, 41179, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, f45380a, false, 41179, new Class[]{RecommendList.class}, Void.TYPE);
        } else if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() < 3) {
            c();
        } else {
            this.i = recommendList.rid;
            RecommendCommonUserView recommendCommonUserView = this.f45384e;
            if (recommendList.getUserList().size() < 10) {
                z = false;
            }
            recommendCommonUserView.setShowLookMore(z);
            this.f45384e.a(recommendList.getUserList(), this.i);
            this.f45384e.setOnItemOperationListener(new RecommendUserAdapter.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45390a;

                public final void a(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41185, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41185, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user, "delete", b.this.a(user), b.this.i, true, "empty", "");
                    if (b.this.f45385f != null) {
                        b.this.f45385f.a(user);
                    }
                }

                public final void b(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41186, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41186, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    b.this.f45384e.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45392a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f45392a, false, 41189, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f45392a, false, 41189, new Class[0], Void.TYPE);
                                return;
                            }
                            b.this.c();
                        }
                    });
                }

                public final void c(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41187, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41187, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user, "follow", b.this.a(user), b.this.i, true, "empty", "");
                    com.ss.android.ugc.aweme.newfollow.g.a.a(b.this.i, user.getUid(), true, user.getFollowStatus());
                }

                public final void d(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41188, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f45390a, false, 41188, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user, "enter_profile", b.this.a(user), b.this.i, true, "empty", "");
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user.getUid(), b.this.i, true);
                }
            });
            this.f45384e.setOnLookMoreUserListener(new RecommendCommonUserView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45394a;

                public final void a(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f45394a, false, 41190, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f45394a, false, 41190, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    RecommendUserActivity.a(b.this.f45383d, d.a().getCurUserId(), 2, "homepage_follow", str2);
                    com.ss.android.ugc.aweme.newfollow.g.a.a(true);
                }
            });
            if (PatchProxy.isSupport(new Object[0], this, f45380a, false, 41176, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45380a, false, 41176, new Class[0], Void.TYPE);
                return;
            }
            if (this.h) {
                this.f45384e.setVisibility(0);
                this.f45384e.setBackgroundResource(C0906R.color.ano);
                this.f45384e.setOnViewAttachedToWindowListener(this);
            }
        }
    }

    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder) {
        RecommendUserCardViewHolder recommendUserCardViewHolder = (RecommendUserCardViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{recommendUserCardViewHolder}, this, f45380a, false, 41180, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendUserCardViewHolder}, this, f45380a, false, 41180, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE);
            return;
        }
        if (recommendUserCardViewHolder != null) {
            User user = recommendUserCardViewHolder.f63087d;
            if (user != null) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                if (!this.k.contains(user.getUid())) {
                    com.ss.android.ugc.aweme.newfollow.g.a.a(user, "impression", a(user), this.i, true, "empty", "");
                    this.k.add(user.getUid());
                }
            }
        }
    }
}
