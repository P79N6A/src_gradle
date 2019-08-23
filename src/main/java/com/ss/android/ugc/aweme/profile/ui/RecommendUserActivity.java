package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.ss.android.ugc.aweme.feed.an;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.adapter.RecommendListAdapter;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.y;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.permission.e;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class RecommendUserActivity extends AmeSSActivity implements h<User>, LoadMoreRecyclerViewAdapter.a, RecommendAwemeViewHolder.a, o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62332a;

    /* renamed from: b  reason: collision with root package name */
    NormalTitleBar f62333b;

    /* renamed from: c  reason: collision with root package name */
    DmtStatusView f62334c;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f62335d;

    /* renamed from: e  reason: collision with root package name */
    protected RecommendListAdapter f62336e;

    /* renamed from: f  reason: collision with root package name */
    String f62337f;
    String g;
    y h;
    int i;
    private i j;
    private String k;
    private String l;
    private String m;

    public boolean isRegisterEventBus() {
        return false;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62332a, false, 68971, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62332a, false, 68971, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62332a, false, 68972, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62332a, false, 68972, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f62332a, false, 68961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62332a, false, 68961, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        k.a().d();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f62332a, false, 68969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62332a, false, 68969, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f62332a, false, 68960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62332a, false, 68960, new Class[0], Void.TYPE);
            return;
        }
        this.h.a(30, this.f62337f, this.i, e.a(), e.b(), this.g);
        if (this.i == 2) {
            an.a("api_recommend_user", "recommend_user_activity", "load_more");
        }
        this.f62336e.showLoadMoreLoading();
    }

    static final /* synthetic */ Void a(String str) throws Exception {
        try {
            DiscoverApi.a(str);
        } catch (Exception unused) {
        }
        return null;
    }

    public void onRecommendFailed(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f62332a, false, 68965, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f62332a, false, 68965, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f62334c.getVisibility() != 8) {
            this.f62334c.f();
        }
        this.f62336e.showLoadMoreError();
        a.a((Context) this, (Throwable) exc);
    }

    public void onLoadMoreRecommendSuccess(RecommendList recommendList) {
        RecommendList recommendList2 = recommendList;
        if (PatchProxy.isSupport(new Object[]{recommendList2}, this, f62332a, false, 68967, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList2}, this, f62332a, false, 68967, new Class[]{RecommendList.class}, Void.TYPE);
            return;
        }
        this.f62336e.resetLoadMoreState();
        RecommendListAdapter recommendListAdapter = this.f62336e;
        List<User> userList = recommendList.getUserList();
        if (PatchProxy.isSupport(new Object[]{userList}, recommendListAdapter, RecommendListAdapter.f48751a, false, 46347, new Class[]{List.class}, Void.TYPE)) {
            RecommendListAdapter recommendListAdapter2 = recommendListAdapter;
            PatchProxy.accessDispatch(new Object[]{userList}, recommendListAdapter2, RecommendListAdapter.f48751a, false, 46347, new Class[]{List.class}, Void.TYPE);
        } else {
            recommendListAdapter.setDataAfterLoadMore(recommendListAdapter.a(userList));
        }
        this.f62336e.setShowFooter(true);
        if (!recommendList2.hasMore) {
            this.f62336e.setLoadMoreListener(null);
            this.f62336e.showLoadMoreEmpty();
        }
    }

    public void onRefreshRecommendSuccess(RecommendList recommendList) {
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, f62332a, false, 68966, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, f62332a, false, 68966, new Class[]{RecommendList.class}, Void.TYPE);
        } else if (CollectionUtils.isEmpty(recommendList.getUserList())) {
            this.f62334c.e();
            this.f62336e.resetLoadMoreState();
        } else {
            int i2 = recommendList.newUserCount;
            if (!(i2 == -1 || recommendList.getUserList() == null || i2 > recommendList.getUserList().size())) {
                for (int i3 = 0; i3 < i2; i3++) {
                    recommendList.getUserList().get(i3).setNewRecommend(true);
                }
            }
            this.f62334c.setVisibility(8);
            this.f62336e.setData(recommendList.getUserList());
            this.f62336e.setShowFooter(true);
            if (!recommendList.hasMore) {
                this.f62336e.setLoadMoreListener(null);
                this.f62336e.showLoadMoreEmpty();
                return;
            }
            this.f62336e.setLoadMoreListener(this);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62332a, false, 68957, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62332a, false, 68957, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.dh);
        if (PatchProxy.isSupport(new Object[0], this, f62332a, false, 68958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62332a, false, 68958, new Class[0], Void.TYPE);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.f62337f = intent.getStringExtra("uid");
                this.g = intent.getStringExtra(c.f33976b);
                this.i = intent.getIntExtra("type", 1);
                this.k = intent.getStringExtra("enter_from");
                this.l = intent.getStringExtra("extra_previous_page");
                this.m = intent.getStringExtra("request_id");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f62332a, false, 68959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62332a, false, 68959, new Class[0], Void.TYPE);
        } else {
            this.f62333b = (NormalTitleBar) findViewById(C0906R.id.d3m);
            this.f62334c = (DmtStatusView) findViewById(C0906R.id.cvd);
            this.f62335d = (RecyclerView) findViewById(C0906R.id.acu);
            this.f62333b.setTitle((int) C0906R.string.bwe);
            this.f62333b.setTitleColor(getResources().getColor(C0906R.color.anp));
            this.f62333b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62338a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62338a, false, 68975, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62338a, false, 68975, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    RecommendUserActivity.this.finish();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62338a, false, 68976, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62338a, false, 68976, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    QRCodePermissionActivity.a(RecommendUserActivity.this, false);
                }
            });
            this.f62335d.setLayoutManager(new WrapLinearLayoutManager(this));
            this.f62335d.addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(this, 6.0f)));
            this.f62336e = new RecommendListAdapter(this, !com.ss.android.g.a.a());
            this.f62336e.l = this.k;
            this.f62336e.m = this.l;
            this.f62336e.n = this.f62337f;
            this.f62336e.setShowFooter(false);
            this.f62336e.a((View) new com.ss.android.ugc.aweme.profile.ui.widget.a(this));
            this.f62336e.b((View) new DmtStatusView(this));
            this.f62336e.mTextColor = getResources().getColor(C0906R.color.zx);
            this.f62335d.setAdapter(this.f62336e);
            this.f62336e.k = this;
            this.f62336e.i = this;
            this.f62336e.f48756f = this.i;
            this.j = new i();
            this.h = new y(new RecommendCommonUserModel(), this);
            this.h.a(30, this.f62337f, this.i, e.a(), (String) null, e.b(), this.g);
            if (this.i == 2) {
                an.a("api_recommend_user", "recommend_user_activity", "refresh");
            }
            this.f62334c.setBuilder(DmtStatusView.a.a((Context) this).a().a(new c.a(this).a(2130840139).b((int) C0906R.string.aan).b("").f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new dj(this)));
            this.f62334c.d();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onCreate", false);
    }

    public final void a(String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f62332a, false, 68970, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f62332a, false, 68970, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
        a2.a(j.a("aweme://aweme/detail/" + str2).a("refer", "find_friends").a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r14, @android.support.annotation.NonNull java.lang.String[] r15, @android.support.annotation.NonNull int[] r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r10 = 0
            r0[r10] = r1
            r11 = 1
            r0[r11] = r15
            r12 = 2
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f62332a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 68968(0x10d68, float:9.6645E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0057
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r10] = r1
            r0[r11] = r15
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f62332a
            r3 = 0
            r4 = 68968(0x10d68, float:9.6645E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0057:
            r0 = r14
            if (r0 != r11) goto L_0x007d
            int r1 = r8.length
            if (r1 <= 0) goto L_0x007d
            r0 = r8[r10]
            if (r0 != 0) goto L_0x0071
            r0 = 0
            android.content.Intent r0 = com.ss.android.ugc.aweme.friends.ui.ContactsActivity.a((android.content.Context) r13, (java.lang.String) r0, (boolean) r11)
            r13.startActivity(r0)
            com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter r0 = com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter.d()
            r0.e()
            return
        L_0x0071:
            java.lang.Class<com.ss.android.ugc.aweme.main.bp> r0 = com.ss.android.ugc.aweme.main.bp.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r13, r0)
            com.ss.android.ugc.aweme.main.bp r0 = (com.ss.android.ugc.aweme.main.bp) r0
            r0.c((boolean) r11)
            return
        L_0x007d:
            super.onRequestPermissionsResult(r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public static void a(Context context, String str, int i2, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{context, str, 2, str2, str3}, null, f62332a, true, 68956, new Class[]{Context.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str, 2, str2, str3};
            PatchProxy.accessDispatch(objArr, null, f62332a, true, 68956, new Class[]{Context.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        a(context, str, 2, "", str2, str3);
    }

    public final /* synthetic */ void a(int i2, Object obj, int i3, View view, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i4 = i2;
        int i5 = i3;
        String str7 = str;
        User user = (User) obj;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), user, Integer.valueOf(i3), view, str7}, this, f62332a, false, 68962, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), user, Integer.valueOf(i3), view, str7}, this, f62332a, false, 68962, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE);
        } else if (i4 == 101) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rec_uid", user.getUid());
                if ("others_homepage".equals(this.l)) {
                    jSONObject.put("profile_uid", this.f62337f);
                }
                jSONObject.put("enter_from", this.k);
                jSONObject.put("previous_page", this.l);
                jSONObject.put("event_type", "enter_profile");
                jSONObject.put("impr_order", i5);
                jSONObject.put("req_id", this.h.d().rid);
                jSONObject.put("trigger_reason", "friend_rec_message");
                jSONObject.put("rec_reason", user.getRecommendReason());
                if (user.isNewRecommend()) {
                    str6 = "new";
                } else {
                    str6 = "past";
                }
                jSONObject.put("card_type", str6);
            } catch (Exception unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject));
            r.a("follow_card", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("request_id", this.h.d().rid);
                jSONObject2.put("enter_method", "click_head");
            } catch (Exception unused2) {
            }
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject2));
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("to_user_id", user.getUid());
                jSONObject3.put("request_id", this.h.d().rid);
            } catch (Exception unused3) {
            }
            if ("click_name".equals(str7)) {
                str5 = "name";
            } else {
                str5 = "head";
            }
            r.onEvent(MobClick.obtain().setEventName(str5).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
            ((q) new q().k(user.getUid()).b(this.k).a(str7)).l(this.m).e();
            UserProfileActivity.a((Context) this, ad.a().a("uid", user.getUid()).a("sec_user_id", user.getSecUid()).a("enter_from", "find_friends").a("enter_from_request_id", user.getRequestId()).a("extra_previous_page_position", "main_head").a("need_track_compare_recommend_reason", 1).a("previous_recommend_reason", user.getRecommendReason()).a("recommend_from_type", "list").f75487b);
        } else {
            if (i4 == 100) {
                if (isViewValid()) {
                    if (!NetworkUtils.isNetworkAvailable(this)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                        return;
                    }
                    if (user.getFollowStatus() != 0) {
                        i6 = 1;
                    }
                    bg.a(new com.ss.android.ugc.aweme.challenge.a.a(i6 ^ 1, user));
                    if (i6 == 0) {
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject4.put("rec_uid", user.getUid());
                            if ("others_homepage".equals(this.l)) {
                                jSONObject4.put("profile_uid", this.f62337f);
                            }
                            jSONObject4.put("enter_from", this.k);
                            jSONObject4.put("previous_page", this.l);
                            jSONObject4.put("event_type", "follow");
                            jSONObject4.put("impr_order", i5);
                            jSONObject4.put("req_id", this.h.d().rid);
                            jSONObject4.put("trigger_reason", "friend_rec_message");
                            jSONObject4.put("rec_reason", user.getRecommendReason());
                            if (user.isNewRecommend()) {
                                str4 = "new";
                            } else {
                                str4 = "past";
                            }
                            jSONObject4.put("card_type", str4);
                        } catch (Exception unused4) {
                        }
                        r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject4));
                        r.a("follow_card", jSONObject4);
                        r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(String.valueOf(user.getUid())));
                    }
                    if (i6 == 0) {
                        str3 = "follow";
                    } else {
                        str3 = "follow_cancel";
                    }
                    new s(str3).b(this.k).c("follow_button").k(this.m).f(this.l).g("other_places").h(user.getUid()).e();
                }
            } else if (i4 == 102 && isViewValid()) {
                if (!NetworkUtils.isNetworkAvailable(this)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                    return;
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("rec_uid", user.getUid());
                    jSONObject5.put("enter_from", this.f62336e.l);
                    jSONObject5.put("event_type", "delete");
                    jSONObject5.put("impr_order", i5);
                    jSONObject5.put("req_id", this.m);
                    jSONObject5.put("trigger_reason", "friend_rec_message");
                    jSONObject5.put("rec_reason", user.getRecommendReason());
                    if (user.isNewRecommend()) {
                        str2 = "new";
                    } else {
                        str2 = "past";
                    }
                    jSONObject5.put("card_type", str2);
                } catch (Exception unused5) {
                }
                r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                r.a("follow_card", jSONObject5);
                String uid = user.getUid();
                if (PatchProxy.isSupport(new Object[]{uid}, this, f62332a, false, 68963, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{uid}, this, f62332a, false, 68963, new Class[]{String.class}, Void.TYPE);
                } else {
                    a.i.a((Callable<TResult>) new dk<TResult>(uid), a.i.f1052b);
                }
                if (PatchProxy.isSupport(new Object[]{user}, this, f62332a, false, 68964, new Class[]{User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user}, this, f62332a, false, 68964, new Class[]{User.class}, Void.TYPE);
                    return;
                }
                this.f62336e.a(user);
                com.bytedance.ies.dmt.ui.d.a.c((Context) this, (int) C0906R.string.nx).a();
            }
        }
    }

    public static void a(Context context, String str, int i2, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i2), str2, str3, str4}, null, f62332a, true, 68955, new Class[]{Context.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str, Integer.valueOf(i2), str2, str3, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f62332a, true, 68955, new Class[]{Context.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(context, str, i2, str2, str3, str4, "");
    }

    public static void a(Context context, String str, int i2, String str2, String str3, String str4, String str5) {
        Context context2 = context;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{context2, str6, Integer.valueOf(i2), str7, str8, str9, str10}, null, f62332a, true, 68954, new Class[]{Context.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str6, Integer.valueOf(i2), str7, str8, str9, str10}, null, f62332a, true, 68954, new Class[]{Context.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, RecommendUserActivity.class);
        intent.putExtra("uid", str6);
        intent.putExtra(com.ss.android.ugc.aweme.app.c.f33976b, str10);
        intent.putExtra("type", i2);
        intent.putExtra("enter_from", str7);
        intent.putExtra("extra_previous_page", str8);
        intent.putExtra("request_id", str9);
        context2.startActivity(intent);
        r.a("enter_find_friends_list", (Map) d.a().a("enter_from", str8).f34114b);
    }
}
