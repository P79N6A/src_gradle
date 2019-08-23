package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notification.bean.AtMe;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.CommentNotice;
import com.ss.android.ugc.aweme.notification.bean.DiggNotice;
import com.ss.android.ugc.aweme.notification.bean.FollowNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;

public class BaseNotificationHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57852b;

    /* renamed from: a  reason: collision with root package name */
    private BaseNotice f57853a;

    /* renamed from: c  reason: collision with root package name */
    public c f57854c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, BaseNotice> f57855d;

    /* renamed from: e  reason: collision with root package name */
    private View f57856e;

    public boolean a() {
        return false;
    }

    public final void a(Map<String, BaseNotice> map, BaseNotice baseNotice, boolean z, String str) {
        Map<String, BaseNotice> map2 = map;
        BaseNotice baseNotice2 = baseNotice;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{map2, baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f57852b, false, 62886, new Class[]{Map.class, BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, baseNotice2, Byte.valueOf(z), str2}, this, f57852b, false, 62886, new Class[]{Map.class, BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f57855d = map2;
        a(baseNotice2, z, str2);
    }

    @CallSuper
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57852b, false, 62887, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57852b, false, 62887, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(!z || this.f57855d == null || this.f57853a == null)) {
            this.f57855d.put(this.f57853a.nid, this.f57853a);
        }
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f57852b, false, 62891, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f57852b, false, 62891, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("enter_personal_detail", (Map) d.a().a("enter_from", str5).a("enter_method", str6).a("to_user_id", str4).b().f34114b);
    }

    public final void a(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), baseNotice, Byte.valueOf(z ? (byte) 1 : 0), str3}, this, f57852b, false, 62892, new Class[]{String.class, String.class, Integer.TYPE, BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, Integer.valueOf(i), baseNotice, Byte.valueOf(z), str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f57852b, false, 62892, new Class[]{String.class, String.class, Integer.TYPE, BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(str, str2, i, baseNotice, z, "", str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0112, code lost:
        if (r9.equals("fans") != false) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r22, java.lang.String r23, int r24, com.ss.android.ugc.aweme.notification.bean.BaseNotice r25, boolean r26, java.lang.String r27, java.lang.String r28) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r25
            r11 = r27
            r12 = r28
            r13 = 7
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r14 = 0
            r0[r14] = r8
            r15 = 1
            r0[r15] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r16 = 2
            r0[r16] = r1
            r17 = 3
            r0[r17] = r10
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r18 = 4
            r0[r18] = r1
            r19 = 5
            r0[r19] = r11
            r20 = 6
            r0[r20] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f57852b
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r16] = r1
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r1 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r5[r17] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r18] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r19] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r20] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62893(0xf5ad, float:8.8132E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00af
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r14] = r8
            r0[r15] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0[r16] = r1
            r0[r17] = r10
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r0[r18] = r1
            r0[r19] = r11
            r0[r20] = r12
            com.meituan.robust.ChangeQuickRedirect r1 = f57852b
            r2 = 0
            r3 = 62893(0xf5ad, float:8.8132E-41)
            java.lang.Class[] r4 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r14] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r15] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r16] = r5
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r5 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r4[r17] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r18] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r19] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r20] = r5
            java.lang.Class r5 = java.lang.Void.TYPE
            r22 = r0
            r23 = r21
            r24 = r1
            r25 = r2
            r26 = r3
            r27 = r4
            r28 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x00af:
            if (r10 != 0) goto L_0x00b2
            return
        L_0x00b2:
            com.ss.android.ugc.aweme.notification.a.a r0 = new com.ss.android.ugc.aweme.notification.a.a
            r0.<init>()
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.a((java.lang.String) r8)
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.b((java.lang.String) r9)
            r1 = r24
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.a((int) r1)
            r1 = r26 ^ 1
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.a((boolean) r1)
            long r1 = r10.createTime
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.a((long) r1)
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.c(r11)
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = r10.logPbBean
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.a((com.ss.android.ugc.aweme.feed.model.LogPbBean) r1)
            com.ss.android.ugc.aweme.notification.a.a r0 = r0.i(r12)
            r1 = -1
            int r2 = r23.hashCode()
            r3 = 3123(0xc33, float:4.376E-42)
            if (r2 == r3) goto L_0x0115
            r3 = 3135424(0x2fd7c0, float:4.393665E-39)
            if (r2 == r3) goto L_0x010c
            r3 = 3321751(0x32af97, float:4.654765E-39)
            if (r2 == r3) goto L_0x0102
            r3 = 950398559(0x38a5ee5f, float:7.912213E-5)
            if (r2 == r3) goto L_0x00f8
            goto L_0x011f
        L_0x00f8:
            java.lang.String r2 = "comment"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x011f
            r14 = 2
            goto L_0x0120
        L_0x0102:
            java.lang.String r2 = "like"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x011f
            r14 = 1
            goto L_0x0120
        L_0x010c:
            java.lang.String r2 = "fans"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x011f
            goto L_0x0120
        L_0x0115:
            java.lang.String r2 = "at"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x011f
            r14 = 3
            goto L_0x0120
        L_0x011f:
            r14 = -1
        L_0x0120:
            switch(r14) {
                case 0: goto L_0x0130;
                case 1: goto L_0x012c;
                case 2: goto L_0x0128;
                case 3: goto L_0x0124;
                default: goto L_0x0123;
            }
        L_0x0123:
            goto L_0x0133
        L_0x0124:
            r7.d(r0, r10)
            goto L_0x0133
        L_0x0128:
            r7.c(r0, r10)
            goto L_0x0133
        L_0x012c:
            r7.b(r0, r10)
            goto L_0x0133
        L_0x0130:
            r7.a(r0, r10)
        L_0x0133:
            r0.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.BaseNotificationHolder.a(java.lang.String, java.lang.String, int, com.ss.android.ugc.aweme.notification.bean.BaseNotice, boolean, java.lang.String, java.lang.String):void");
    }

    public final void a(String str, String str2, int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f57852b, false, 62898, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i), Byte.valueOf(z)}, this, f57852b, false, 62898, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(str, str2, i, z, "");
    }

    public final void a(String str, String str2, int i, boolean z, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), str3}, this, f57852b, false, 62899, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i), Byte.valueOf(z), str3}, this, f57852b, false, 62899, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(str, str2, i, z ? "yellow_dot" : "", str3);
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f57852b, false, 62890, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57852b, false, 62890, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            return false;
        } else {
            a.b(this.f57856e.getContext(), (int) C0906R.string.bgf).a();
            return true;
        }
    }

    public BaseNotificationHolder(View view) {
        super(view);
        this.f57856e = view;
        if (a()) {
            this.f57856e.setOnLongClickListener(this);
        }
    }

    @CallSuper
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57852b, false, 62888, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57852b, false, 62888, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a(true);
    }

    public boolean onLongClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57852b, false, 62889, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f57852b, false, 62889, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        int layoutPosition = getLayoutPosition();
        if (this.f57854c != null && layoutPosition >= 0) {
            this.f57854c.a(layoutPosition);
        }
        return true;
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f57852b, false, 62901, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f57852b, false, 62901, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof Activity) {
            Intent intent = ((Activity) context2).getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("rule_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    r.a("enter_personal_detail_backup_from_push", (Map) d.a().a("rule_id", stringExtra).f34114b);
                }
            }
        }
    }

    private void a(com.ss.android.ugc.aweme.notification.a.a aVar, BaseNotice baseNotice) {
        com.ss.android.ugc.aweme.notification.a.a aVar2 = aVar;
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62894, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62894, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE);
            return;
        }
        FollowNotice followNotice = baseNotice2.followNotice;
        if (followNotice != null) {
            aVar2.b(0);
            aVar2.f(followNotice.user.getUid());
            int followStatus = followNotice.user.getFollowStatus();
            if (followStatus == 0) {
                aVar2.e("follow");
                return;
            }
            if (followStatus == 1 || followStatus == 2) {
                aVar2.e("followed");
            }
        }
    }

    private void d(com.ss.android.ugc.aweme.notification.a.a aVar, BaseNotice baseNotice) {
        com.ss.android.ugc.aweme.notification.a.a aVar2 = aVar;
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62897, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62897, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE);
            return;
        }
        AtMe atMe = baseNotice2.atMe;
        if (atMe != null) {
            aVar2.b(0);
            aVar2.f(atMe.user.getUid());
        }
    }

    private void b(com.ss.android.ugc.aweme.notification.a.a aVar, BaseNotice baseNotice) {
        com.ss.android.ugc.aweme.notification.a.a aVar2 = aVar;
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62895, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62895, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE);
            return;
        }
        DiggNotice diggNotice = baseNotice2.diggNotice;
        if (diggNotice != null) {
            List<User> users = diggNotice.getUsers();
            if (users != null && users.size() != 0) {
                if (diggNotice.getMergeCount() == 1) {
                    aVar2.b(0);
                    aVar2.f(users.get(0).getUid());
                } else {
                    aVar2.b(1);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < users.size(); i++) {
                        User user = users.get(i);
                        if (i == users.size() - 1) {
                            sb.append(user.getUid());
                        } else {
                            sb.append(user.getUid());
                            sb.append(",");
                        }
                    }
                    aVar2.f(sb.toString());
                }
                if (diggNotice.getDiggType() == 3) {
                    aVar2.g("comment");
                    aVar2.h(diggNotice.getCid());
                    return;
                }
                aVar2.g("video");
                aVar2.h(diggNotice.getForwardId());
            }
        }
    }

    private void c(com.ss.android.ugc.aweme.notification.a.a aVar, BaseNotice baseNotice) {
        com.ss.android.ugc.aweme.notification.a.a aVar2 = aVar;
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62896, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, baseNotice2}, this, f57852b, false, 62896, new Class[]{com.ss.android.ugc.aweme.notification.a.a.class, BaseNotice.class}, Void.TYPE);
            return;
        }
        CommentNotice commentNotice = baseNotice2.commentNotice;
        if (commentNotice != null) {
            aVar2.b(0);
            aVar2.f(commentNotice.comment.getUser().getUid());
            switch (commentNotice.commentType) {
                case 0:
                case 1:
                case 5:
                case 11:
                case 14:
                    aVar2.g("video");
                    aVar2.h(commentNotice.forwardId);
                    return;
                case 2:
                case 4:
                case 6:
                case 8:
                    aVar2.g("comment");
                    aVar2.h(commentNotice.forwardId);
                    break;
            }
        }
    }

    @CallSuper
    public void a(BaseNotice baseNotice, boolean z, String str) {
        this.f57853a = baseNotice;
    }

    public final void a(Activity activity, User user, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, user, str2}, this, f57852b, false, 62903, new Class[]{Activity.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, user, str2}, this, f57852b, false, 62903, new Class[]{Activity.class, User.class, String.class}, Void.TYPE);
            return;
        }
        h a2 = h.a();
        a2.a(activity2, j.a("aweme://user/profile/" + user.getUid()).a("enter_from", str2).a("sec_user_id", user.getSecUid()).a("previous_page", "message").a("extra_previous_page_position", "other_places").a("enter_method", "follow_button").a("need_track_compare_recommend_reason", 1).a("previous_recommend_reason", user.getRecommendReason()).a("recommend_from_type", "card").a());
    }

    public final void a(Activity activity, String str, String str2, String str3) {
        Activity activity2 = activity;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{activity2, str4, str5, str6}, this, f57852b, false, 62902, new Class[]{Activity.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f57852b, false, 62902, new Class[]{Activity.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        h a2 = h.a();
        a2.a(activity2, j.a("aweme://user/profile/" + str4).a("enter_from", str6).a("sec_user_id", str5).a("previous_page", "message").a("extra_previous_page_position", "other_places").a("enter_method", "follow_button").a());
    }

    private void a(String str, String str2, int i, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, Integer.valueOf(i), str7, str8}, this, f57852b, false, 62900, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, Integer.valueOf(i), str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f57852b, false, 62900, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("notification_message_inner_message", (Map) d.a().a("action_type", str5).a("account_type", str6).a("client_order", String.valueOf(i)).a("notice_type", str7).a("notification_type", str8).f34114b);
    }
}
