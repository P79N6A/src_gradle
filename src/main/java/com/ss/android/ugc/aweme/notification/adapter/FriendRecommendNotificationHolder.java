package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.FriendNotice;
import com.ss.android.ugc.aweme.notification.d.b;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public class FriendRecommendNotificationHolder extends BaseNotificationHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57902a;

    /* renamed from: d  reason: collision with root package name */
    private ConstraintLayout f57903d;

    /* renamed from: e  reason: collision with root package name */
    private AvatarImageWithVerify f57904e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f57905f;
    private TextView g;
    private TextView h;
    private Button i;
    private i j;
    private FriendNotice k;
    private BaseNotice l;
    private Activity m;
    private View n;
    private String o;
    private boolean p;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57902a, false, 63028, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57902a, false, 63028, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.n.setVisibility(8);
            Cdo.a(this.f57903d);
            return;
        }
        this.n.setVisibility(0);
        Cdo.a(this.f57903d, 2130841684, C0906R.color.aj4);
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57902a, false, 63029, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57902a, false, 63029, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 0) {
            this.i.setText(C0906R.string.afp);
            this.i.setBackgroundResource(2130838061);
            this.i.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.a08));
        } else if (i2 == 1) {
            this.i.setText(C0906R.string.agr);
            this.i.setBackgroundResource(2130838010);
            this.i.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.a0b));
        } else if (i2 == 2) {
            this.i.setText(C0906R.string.a6u);
            this.i.setBackgroundResource(2130838010);
            this.i.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.a0b));
        }
        this.k.user.setFollowStatus(i2);
    }

    public void onClick(View view) {
        String str;
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f57902a, false, 63030, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57902a, false, 63030, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!b()) {
            super.onClick(view);
            int id = view.getId();
            String uid = this.k.user.getUid();
            String secUid = this.k.user.getSecUid();
            String str2 = null;
            if (id == C0906R.id.bsq) {
                a(this.m, uid, secUid, "message_fans");
                d a2 = d.a().a("action_type", "click").a("account_type", "friend_recommend").a("content_id", this.o);
                if (!this.p) {
                    str2 = "yellow_dot";
                }
                r.a("official_message_inner_message", (Map) a2.a("notice_type", str2).a("client_order", this.l.showingPosition).a("rec_reason", this.k.content).f34114b);
                r.a("enter_personal_detail", (Map) d.a().a("enter_from", "friend_recommend").a("to_user_id", this.k.user.getUid()).a("enter_method", "click_root").f34114b);
            } else if (id == C0906R.id.bsn) {
                a(this.m, uid, secUid, "message_fans");
                d a3 = d.a().a("action_type", "click").a("account_type", "friend_recommend").a("content_id", this.o);
                if (!this.p) {
                    str2 = "yellow_dot";
                }
                r.a("official_message_inner_message", (Map) a3.a("notice_type", str2).a("client_order", this.l.showingPosition).a("rec_reason", this.k.content).f34114b);
                r.a("enter_personal_detail", (Map) d.a().a("enter_from", "friend_recommend").a("to_user_id", this.k.user.getUid()).a("enter_method", "click_head").f34114b);
            } else if (id == C0906R.id.bsp) {
                a(this.m, uid, secUid, "message_fans");
                d a4 = d.a().a("action_type", "click").a("account_type", "friend_recommend").a("content_id", this.o);
                if (!this.p) {
                    str2 = "yellow_dot";
                }
                r.a("official_message_inner_message", (Map) a4.a("notice_type", str2).a("client_order", this.l.showingPosition).a("rec_reason", this.k.content).f34114b);
                r.a("enter_personal_detail", (Map) d.a().a("enter_from", "friend_recommend").a("to_user_id", this.k.user.getUid()).a("enter_method", "click_name").f34114b);
            } else {
                if (id == C0906R.id.bso) {
                    if (this.k.user.getFollowStatus() == 0) {
                        i2 = 0;
                    }
                    int i3 = i2 ^ 1;
                    if (i2 != 0) {
                        r.a("follow_cancel", (Map) d.a().a("to_user_id", this.k.user.getUid()).a("enter_from", "friend_recommend").a("previous_page", "message").f34114b);
                    } else {
                        r.a("follow", (Map) d.a().a("enter_from", "friend_recommend").a("previous_page", "message").a("to_user_id", this.k.user.getUid()).a("request_id", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).f34114b);
                    }
                    bg.a(new com.ss.android.ugc.aweme.challenge.a.d(i3, this.k.user));
                    this.j.a(new i.a().a(this.k.user.getUid()).b(this.k.user.getSecUid()).a(i3).a());
                    MobClick mobClick = new MobClick();
                    if (i2 != 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    r.onEvent(mobClick.setEventName(str).setLabelName("message").setValue(this.k.user.getUid()));
                    if (i2 == 0) {
                        new s().b("message").f("").h(this.k.user.getUid()).i("").e();
                    }
                    a(i3);
                }
            }
        }
    }

    public final void a(BaseNotice baseNotice, boolean z, String str) {
        String str2;
        BaseNotice baseNotice2 = baseNotice;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f57902a, false, 63027, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str}, this, f57902a, false, 63027, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (baseNotice2 != null && baseNotice2.friendNotice != null && baseNotice2.friendNotice.user != null) {
            super.a(baseNotice, z, str);
            this.p = z2;
            a(z2);
            this.l = baseNotice2;
            this.k = baseNotice2.friendNotice;
            this.o = baseNotice2.nid;
            this.g.setText(b.a(this.m, baseNotice2.createTime * 1000));
            this.f57904e.setData(this.k.user);
            this.f57905f.setText(this.k.user.getNickname());
            a(this.k.user.getFollowStatus());
            this.f57905f.setMaxEms(7);
            this.h.setText(this.k.content);
            d a2 = d.a().a("action_type", "show").a("account_type", "friend_recommend").a("content_id", this.o);
            if (this.p) {
                str2 = null;
            } else {
                str2 = "yellow_dot";
            }
            r.a("official_message_inner_message", (Map) a2.a("notice_type", str2).a("client_order", baseNotice2.showingPosition).a("rec_reason", this.k.content).f34114b);
        }
    }
}
