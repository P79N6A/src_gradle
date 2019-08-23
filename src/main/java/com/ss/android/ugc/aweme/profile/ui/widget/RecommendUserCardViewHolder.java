package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.challenge.a.d;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;

public class RecommendUserCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63084a;

    /* renamed from: b  reason: collision with root package name */
    AvatarImageWithVerify f63085b;

    /* renamed from: c  reason: collision with root package name */
    TextView f63086c;

    /* renamed from: d  reason: collision with root package name */
    public User f63087d;

    /* renamed from: e  reason: collision with root package name */
    int f63088e;

    /* renamed from: f  reason: collision with root package name */
    a f63089f;
    b g;
    Context h;
    RecommendUserAdapter.b i;
    final View j;
    String k;
    ImageView l;
    private TextView m;
    private TextView n;
    private i o;
    private int p;
    private View q;

    public interface a {
        void a(User user, int i);
    }

    public interface b {
        void a(int i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r1 != null) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f63084a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 69825(0x110c1, float:9.7846E-41)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f63084a
            r5 = 0
            r6 = 69825(0x110c1, float:9.7846E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            boolean r1 = r1.isLogin()
            r2 = 0
            if (r1 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.framework.core.a r0 = com.ss.android.ugc.aweme.framework.core.a.b()
            android.app.Activity r0 = r0.a()
            java.lang.String r1 = "homepage_follow"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.profile.ui.widget.i r4 = new com.ss.android.ugc.aweme.profile.ui.widget.i
            r4.<init>(r14)
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r3, (android.os.Bundle) r2, (com.ss.android.ugc.aweme.base.component.f) r4)
            return
        L_0x0045:
            com.ss.android.ugc.aweme.profile.model.User r1 = r14.f63087d
            int r1 = r1.getFollowStatus()
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder$b r1 = r14.g
            if (r1 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder$b r1 = r14.g
            int r3 = r14.f63088e
            r1.a(r3)
        L_0x0058:
            android.content.Context r1 = r14.h
            if (r1 == 0) goto L_0x0067
            android.content.Context r1 = r14.h
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0067
            android.content.Context r1 = r14.h
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x0068
        L_0x0067:
            r1 = r2
        L_0x0068:
            com.ss.android.ugc.aweme.profile.model.User r3 = r14.f63087d
            int r3 = r3.getFollowStatus()
            r4 = 4
            r5 = 1
            if (r3 == r4) goto L_0x0075
            switch(r3) {
                case 0: goto L_0x0077;
                case 1: goto L_0x0075;
                case 2: goto L_0x0075;
                default: goto L_0x0075;
            }
        L_0x0075:
            r3 = 0
            goto L_0x008c
        L_0x0077:
            com.ss.android.ugc.aweme.profile.model.User r3 = r14.f63087d
            boolean r3 = r3.isSecret()
            if (r3 == 0) goto L_0x0081
            r3 = 4
            goto L_0x008c
        L_0x0081:
            com.ss.android.ugc.aweme.profile.model.User r3 = r14.f63087d
            int r3 = r3.getFollowerStatus()
            if (r3 != r5) goto L_0x008b
            r3 = 2
            goto L_0x008c
        L_0x008b:
            r3 = 1
        L_0x008c:
            com.ss.android.ugc.aweme.profile.model.User r6 = r14.f63087d
            int r6 = r6.getFollowStatus()
            if (r6 != r4) goto L_0x0098
            if (r1 == 0) goto L_0x0118
            goto L_0x0115
        L_0x0098:
            if (r3 != r4) goto L_0x0115
            if (r1 == 0) goto L_0x0118
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = f63084a
            r10 = 0
            r11 = 69826(0x110c2, float:9.7847E-41)
            java.lang.Class[] r12 = new java.lang.Class[r5]
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r12[r0] = r6
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = r14
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x00cc
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = f63084a
            r10 = 0
            r11 = 69826(0x110c2, float:9.7847E-41)
            java.lang.Class[] r12 = new java.lang.Class[r5]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r12[r0] = r1
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0111
        L_0x00cc:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getPrivacyAccountFollowCount()
            java.lang.Object r6 = r0.c()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x00fb
            com.bytedance.ies.dmt.ui.b.a$a r4 = new com.bytedance.ies.dmt.ui.b.a$a
            r4.<init>(r1)
            r1 = 2131561825(0x7f0d0d61, float:1.8749061E38)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r4.b((int) r1)
            r4 = 2131560337(0x7f0d0791, float:1.8746043E38)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r1.a((int) r4, (android.content.DialogInterface.OnClickListener) r2)
            com.bytedance.ies.dmt.ui.b.a r1 = r1.a()
            r1.a()
            goto L_0x0109
        L_0x00fb:
            if (r6 <= 0) goto L_0x0109
            if (r6 >= r4) goto L_0x0109
            r2 = 2131561826(0x7f0d0d62, float:1.8749063E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r1, (int) r2)
            r1.a()
        L_0x0109:
            int r6 = r6 + r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.a(r1)
        L_0x0111:
            r14.b(r3)
            return
        L_0x0115:
            r14.b(r3)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder.a():void");
    }

    private void b(int i2) {
        String str;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63084a, false, 69827, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63084a, false, 69827, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i2);
        if (this.f63087d.getFollowStatus() == 0) {
            i3 = 1;
        }
        i iVar = this.o;
        i.a a2 = new i.a().a(this.f63087d.getUid()).b(this.f63087d.getSecUid()).a(i3);
        if (this.p == 1) {
            str = "homepage_follow";
        } else {
            str = "others_homepage";
        }
        iVar.a(a2.c(str).b(12).a());
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63084a, false, 69829, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63084a, false, 69829, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == -1) {
            this.n.setPadding(0, 0, 0, 0);
            this.n.setGravity(17);
            this.n.setCompoundDrawables(null, null, null, null);
        } else {
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.h.getResources(), i2);
            a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
            this.n.setCompoundDrawables(a2, null, null, null);
            this.n.setCompoundDrawablePadding(4);
            this.n.setGravity(16);
        }
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f63084a, false, 69822, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f63084a, false, 69822, new Class[]{User.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(user.getRemarkName())) {
            this.m.setText(this.f63087d.getNickname());
        } else {
            this.m.setText(this.f63087d.getRemarkName());
        }
    }

    public void onFollowFail(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63084a, false, 69832, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63084a, false, 69832, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
            com.ss.android.ugc.aweme.app.api.a.a.a(this.h, exc, C0906R.string.afx);
        }
        a(this.f63087d.getFollowStatus());
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f63084a, false, 69831, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f63084a, false, 69831, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (TextUtils.equals(followStatus.userId, this.f63087d.getUid())) {
            this.f63087d.setFollowStatus(followStatus.followStatus);
            bg.a(new d(followStatus.followStatus, this.f63087d));
            a(followStatus.followStatus);
            a(this.f63087d, followStatus.followStatus);
            if (com.ss.android.ugc.aweme.profile.d.i.a(this.h, this.f63087d, followStatus)) {
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(this.h);
                remarkEditDialog.g = this.f63087d;
                remarkEditDialog.h = followStatus.contactName;
                remarkEditDialog.i = 1;
                remarkEditDialog.f63095f = new j(this);
                remarkEditDialog.show();
            }
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(this.f63087d.getRemarkName())) {
                this.f63087d.setRemarkName("");
                a(this.f63087d);
            }
        }
    }

    public void onClick(View view) {
        String str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f63084a, false, 69823, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63084a, false, 69823, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.ti) {
            if (AbTestManager.a().j()) {
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), (int) C0906R.string.dmh).a();
            }
            if (this.f63089f != null) {
                this.f63089f.a(this.f63087d, this.f63088e);
            }
        } else if (id == C0906R.id.hk) {
            if (this.i != null) {
                this.i.d(this.f63087d, this.f63088e);
            }
            if (this.f63087d != null) {
                Context context = this.h;
                ad a2 = ad.a().a("uid", this.f63087d.getUid()).a("sec_user_id", this.f63087d.getSecUid());
                if (this.p == 1) {
                    str = "homepage_follow";
                } else if (this.p == 2) {
                    str = "homepage_friends";
                } else {
                    str = "others_homepage";
                }
                UserProfileActivity.a(context, a2.a("enter_from", str).a("enter_from_request_id", this.k).a("extra_previous_page_position", "card_head").a("need_track_compare_recommend_reason", 1).a("previous_recommend_reason", this.f63087d.getRecommendReason()).a("recommend_from_type", "card").f75487b);
            }
        } else if (id == C0906R.id.agq) {
            if (this.i != null) {
                this.i.c(this.f63087d, this.f63088e);
            }
            if (PatchProxy.isSupport(new Object[0], this, f63084a, false, 69824, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63084a, false, 69824, new Class[0], Void.TYPE);
                return;
            }
            IIMService a3 = com.ss.android.ugc.aweme.im.b.a();
            Context context2 = this.h;
            if (this.f63087d.getFollowStatus() != 2) {
                z = false;
            }
            a3.wrapperSyncXAlert(context2, 2, z, new h(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63084a, false, 69828, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63084a, false, 69828, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n.setVisibility(0);
        Resources resources = this.h.getResources();
        if (i2 == 0) {
            int i3 = C0906R.string.afp;
            switch (AbTestManager.a().k().intValue()) {
                case 1:
                    this.n.setPadding((int) UIUtils.dip2Px(this.h, 35.0f), 0, 0, 0);
                    if (this.f63087d.getFollowerStatus() != 1) {
                        c(2130839876);
                        break;
                    } else {
                        i3 = C0906R.string.afq;
                        c(2130839877);
                        break;
                    }
                case 2:
                    if (this.f63087d.getFollowerStatus() != 1) {
                        this.n.setPadding((int) UIUtils.dip2Px(this.h, 35.0f), 0, 0, 0);
                        c(2130839876);
                        break;
                    } else {
                        i3 = C0906R.string.aft;
                        this.n.setPadding((int) UIUtils.dip2Px(this.h, 24.0f), 0, 0, 0);
                        c(2130839877);
                        break;
                    }
            }
            this.n.setText(resources.getText(i3));
            this.n.setBackgroundResource(2130837968);
            this.n.setTextColor(resources.getColor(C0906R.color.hx));
        } else if (i2 == 1 || i2 == 2) {
            c(-1);
            int i4 = C0906R.string.agr;
            if (i2 == 2) {
                i4 = C0906R.string.a6u;
                switch (AbTestManager.a().k().intValue()) {
                    case 2:
                        i4 = C0906R.string.a6v;
                        break;
                }
            }
            this.n.setText(i4);
            this.n.setTextColor(resources.getColor(C0906R.color.zu));
            this.n.setBackgroundResource(2130837984);
        } else {
            if (i2 == 4) {
                this.n.setTextColor(resources.getColor(C0906R.color.zu));
                this.n.setBackgroundResource(2130837984);
                this.n.setText(this.h.getString(C0906R.string.agl));
            }
        }
    }

    public RecommendUserCardViewHolder(View view, int i2) {
        super(view);
        this.h = view.getContext();
        this.f63085b = (AvatarImageWithVerify) view.findViewById(C0906R.id.hk);
        this.j = view.findViewById(C0906R.id.chu);
        this.m = (TextView) view.findViewById(C0906R.id.dq2);
        this.f63086c = (TextView) view.findViewById(C0906R.id.cbc);
        this.n = (TextView) view.findViewById(C0906R.id.agq);
        this.q = view.findViewById(C0906R.id.b0u);
        this.l = (ImageView) view.findViewById(C0906R.id.ti);
        this.l.setOnClickListener(this);
        if (AbTestManager.a().j()) {
            this.l.setImageResource(2130838742);
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            layoutParams.width = (int) UIUtils.dip2Px(this.h, -2.0f);
            layoutParams.height = (int) UIUtils.dip2Px(this.h, -2.0f);
            this.l.setLayoutParams(layoutParams);
        }
        this.f63085b.setOnClickListener(this);
        this.n.setOnClickListener(this);
        if (this.o == null) {
            this.o = new i();
            this.o.a(this);
        }
        this.p = i2;
    }

    /* access modifiers changed from: package-private */
    public void a(User user, int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f63084a, false, 69830, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f63084a, false, 69830, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().bc() == 1 || AbTestManager.a().bc() == 3) {
            TextView textView = this.m;
            View view = this.q;
            if (this.p == 1) {
                str = "homepage_follow_rec_cards";
            } else {
                str = "others_homepage_rec_cards";
            }
            s.a(user, i2, textView, view, str, true);
        }
    }
}
