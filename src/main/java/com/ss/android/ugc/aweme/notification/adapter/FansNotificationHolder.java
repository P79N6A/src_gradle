package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.FollowNotice;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.HashMap;
import java.util.Map;

public class FansNotificationHolder extends BaseNotificationHolder implements View.OnClickListener, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57889a;

    /* renamed from: d  reason: collision with root package name */
    i f57890d = new i();

    /* renamed from: e  reason: collision with root package name */
    FollowNotice f57891e;

    /* renamed from: f  reason: collision with root package name */
    Activity f57892f;
    private ConstraintLayout g;
    private AvatarImageWithVerify h;
    private TextView i;
    private TextView j;
    private Button k;
    private View l;
    private RelationLabelTextView m;
    private View n;
    private HashMap<String, Boolean> o;
    private StoryCircleView p;
    private AnimationImageView q;
    private b r;
    private h s;
    private BaseNotice t;
    private String u;

    public final boolean a() {
        return true;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57889a, false, 63009, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57889a, false, 63009, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == -1) {
            this.k.setPadding(0, 0, 0, 0);
            this.k.setGravity(17);
            this.k.setCompoundDrawables(null, null, null, null);
        } else {
            Drawable a2 = a.a(GlobalContext.getContext().getResources(), i2);
            a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
            this.k.setCompoundDrawables(a2, null, null, null);
            this.k.setGravity(16);
        }
    }

    public void onFollowFail(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f57889a, false, 63013, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f57889a, false, 63013, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (!(this.f57891e == null || this.f57891e.user == null)) {
            a(this.f57891e.user.getFollowStatus(), this.f57891e.user.getFollowerStatus());
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f57889a, false, 63012, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f57889a, false, 63012, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (!(this.f57891e == null || this.f57891e.user == null || !TextUtils.equals(followStatus.userId, this.f57891e.user.getUid()))) {
            if (this.o != null) {
                this.o.put(this.f57891e.user.getUid(), Boolean.TRUE);
            }
            a(followStatus.followStatus, this.f57891e.user.getFollowerStatus());
        }
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f57889a, false, 63011, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57889a, false, 63011, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!b()) {
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.t;
            if (this.l.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            a("show", "fans", adapterPosition, baseNotice, z, this.u);
            super.onClick(view);
            int id = view.getId();
            String uid = this.f57891e.user.getUid();
            String secUid = this.f57891e.user.getSecUid();
            if (id == C0906R.id.bsj || id == C0906R.id.bsi) {
                a(this.f57892f, uid, secUid, "message_fans");
                a(uid, "message_fans", "click_head");
                a("fans", getLayoutPosition());
                return;
            }
            if (id == C0906R.id.bst) {
                a("fans", getLayoutPosition());
                if (this.r != null && !this.r.b()) {
                    a(this.f57892f, uid, secUid, "message_fans");
                    a(uid, "message_fans", "click_head");
                }
            } else if (id == C0906R.id.bsh) {
                if (this.f57891e.user.getFollowStatus() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = !z2;
                IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
                Context context = view.getContext();
                if (this.f57891e.user.getFollowStatus() != 2) {
                    z3 = false;
                }
                a2.wrapperSyncXAlert(context, 2, z3, new b(this, z4 ? 1 : 0, z2));
            } else if (id == C0906R.id.dhb && this.f57891e.relationLabel != null && !TextUtils.isEmpty(this.f57891e.relationLabel.getUserId())) {
                UserProfileActivity.a((Context) this.f57892f, this.f57891e.relationLabel.getUserId(), this.f57891e.user.getSecUid(), "like_banner");
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57889a, false, 63007, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57889a, false, 63007, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.l.setVisibility(8);
            Cdo.a(this.g);
            return;
        }
        this.l.setVisibility(0);
        Cdo.a(this.g, 2130841684, C0906R.color.aj4);
    }

    private void a(String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f57889a, false, 63014, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f57889a, false, 63014, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = this.f57892f.getIntent();
        if (intent != null && intent.getBooleanExtra("from_notification", false)) {
            String stringExtra = intent.getStringExtra("rule_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                r.a("enter_personal_detail_backup_from_push", (Map) d.a().a("action_type", "click").a("account_type", str2).a("client_order", String.valueOf(i2)).a("rule_id", stringExtra).b().f34114b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57889a, false, 63008, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57889a, false, 63008, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (AbTestManager.a().k().intValue()) {
            case 1:
                a(2130839876);
                break;
            case 2:
                a(2130839876);
                break;
        }
        if (i2 == 0) {
            int i4 = C0906R.string.afp;
            this.k.setPadding((int) UIUtils.dip2Px(GlobalContext.getContext(), 20.0f), 0, (int) UIUtils.dip2Px(GlobalContext.getContext(), 20.0f), 0);
            switch (AbTestManager.a().k().intValue()) {
                case 1:
                    i4 = C0906R.string.afq;
                    a(2130839877);
                    break;
                case 2:
                    i4 = C0906R.string.aft;
                    this.k.setPadding((int) UIUtils.dip2Px(GlobalContext.getContext(), 12.0f), 0, (int) UIUtils.dip2Px(GlobalContext.getContext(), 12.0f), 0);
                    a(2130839877);
                    break;
            }
            this.k.setText(GlobalContext.getContext().getResources().getText(i4));
            this.k.setBackgroundResource(2130838061);
            this.k.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.a08));
        } else {
            int i5 = C0906R.string.a6v;
            if (i2 == 1) {
                a(-1);
                switch (AbTestManager.a().k().intValue()) {
                    case 1:
                        i5 = C0906R.string.a6u;
                        break;
                    case 2:
                        break;
                    default:
                        i5 = C0906R.string.agr;
                        break;
                }
                this.k.setText(GlobalContext.getContext().getResources().getText(i5));
                this.k.setBackgroundResource(2130838010);
                this.k.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.a0b));
            } else if (i2 == 2) {
                a(-1);
                switch (AbTestManager.a().k().intValue()) {
                    case 2:
                        break;
                    default:
                        i5 = C0906R.string.a6u;
                        break;
                }
                this.k.setText(GlobalContext.getContext().getResources().getText(i5));
                this.k.setBackgroundResource(2130838010);
                this.k.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.a0b));
            }
        }
        this.f57891e.user.setFollowStatus(i2);
    }

    public FansNotificationHolder(View view, Activity activity, HashMap<String, Boolean> hashMap) {
        super(view);
        this.f57892f = activity;
        this.g = (ConstraintLayout) view.findViewById(C0906R.id.bsj);
        this.h = (AvatarImageWithVerify) view.findViewById(C0906R.id.bst);
        this.i = (TextView) view.findViewById(C0906R.id.bsi);
        this.j = (TextView) view.findViewById(C0906R.id.bsk);
        this.k = (Button) view.findViewById(C0906R.id.bsh);
        this.l = view.findViewById(C0906R.id.bsl);
        this.m = (RelationLabelTextView) view.findViewById(C0906R.id.dhb);
        this.n = view.findViewById(C0906R.id.b0u);
        this.p = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.q = (AnimationImageView) view.findViewById(C0906R.id.i8);
        c.a(this.h);
        c.a(this.i);
        this.k.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.f57890d.a(this);
        this.o = hashMap;
        if (!com.ss.android.g.a.a()) {
            this.s = (h) ServiceManager.get().getService(h.class);
            this.r = this.s.a(this.h, this.p, this.q);
        }
    }

    public final void a(BaseNotice baseNotice, boolean z, String str) {
        BaseNotice baseNotice2 = baseNotice;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f57889a, false, 63006, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str2}, this, f57889a, false, 63006, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (baseNotice2 != null && baseNotice2.followNotice != null) {
            super.a(baseNotice, z, str);
            boolean z2 = z;
            a(z2);
            this.t = baseNotice2;
            this.u = str2;
            this.f57891e = baseNotice2.followNotice;
            a("show", "fans", getAdapterPosition(), baseNotice, z2, str);
            this.j.setText(eo.b(this.f57892f, baseNotice2.createTime * 1000));
            this.h.setData(this.f57891e.user);
            if (this.r != null) {
                this.r.a(this.f57891e.user, false, this.f57891e.user.getUid());
            }
            if (!TextUtils.isEmpty(this.f57891e.user.getRemarkName())) {
                this.i.setText(this.f57891e.user.getRemarkName());
            } else {
                this.i.setText(this.f57891e.user.getNickname());
            }
            a(this.f57891e.user.getFollowStatus(), this.f57891e.user.getFollowerStatus());
            User user = this.f57891e.user;
            int followStatus = this.f57891e.user.getFollowStatus();
            if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(followStatus)}, this, f57889a, false, 63010, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(followStatus)}, this, f57889a, false, 63010, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            } else if (AbTestManager.a().bc() == 2 || AbTestManager.a().bc() == 3) {
                if (this.o != null && this.o.get(user.getUid()) != null) {
                    s.a(user, followStatus, this.i, this.n, "message_fans", this.o.get(user.getUid()).booleanValue());
                    this.o.put(user.getUid(), Boolean.FALSE);
                } else if (this.n != null) {
                    this.n.setVisibility(8);
                }
            }
            this.m.a(this.f57891e.relationLabel);
            if (this.m.getVisibility() == 0) {
                this.i.setMaxEms(5);
            } else {
                this.i.setMaxEms(7);
            }
        }
    }
}
