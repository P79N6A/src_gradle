package com.ss.android.ugc.aweme.notification.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.DiggNotice;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.notification.widget.RecyclerItemDecoration;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;

public class LikeNotificationHolder extends BaseNotificationHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57920a;

    /* renamed from: d  reason: collision with root package name */
    protected b f57921d;

    /* renamed from: e  reason: collision with root package name */
    protected h f57922e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f57923f;
    private AvatarImageWithVerify g;
    private RemoteRoundImageView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private RecyclerView l;
    private ConstraintLayout m;
    private BaseNotice n;
    private DiggNotice o;
    private HeadViewAdapter p = new HeadViewAdapter(this.f57923f, 6);
    private View q;
    private RelationLabelTextView r;
    private StoryCircleView s;
    private AnimationImageView t;
    private String u;

    public final boolean a() {
        return true;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57920a, false, 63052, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57920a, false, 63052, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.q.setVisibility(8);
            Cdo.a(this.m);
            return;
        }
        this.q.setVisibility(0);
        Cdo.a(this.m, 2130841684, C0906R.color.aj4);
    }

    public void onClick(View view) {
        boolean z;
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f57920a, false, 63053, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57920a, false, 63053, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!b()) {
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.n;
            if (this.q.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            a("click", "like", adapterPosition, baseNotice, z, this.u);
            super.onClick(view);
            if (this.o != null) {
                int id = view.getId();
                if (id == C0906R.id.bst) {
                    if (this.f57921d != null && !this.f57921d.b()) {
                        a(this.f57923f, this.o.getUsers().get(0).getUid(), this.o.getUsers().get(0).getSecUid(), "message");
                        a(this.o.getUsers().get(0).getUid(), "message_like", "click_head");
                    }
                } else if (id == C0906R.id.bsz) {
                    a(this.f57923f, this.o.getUsers().get(0).getUid(), this.o.getUsers().get(0).getSecUid(), "message");
                    a(this.o.getUsers().get(0).getUid(), "message_like", "click_head");
                } else if (id == C0906R.id.bt1 || id == C0906R.id.bt4) {
                    if (this.o.getAweme() != null) {
                        if (this.o.getDiggType() == 2) {
                            a.c((Context) this.f57923f, (int) C0906R.string.jx).a();
                            return;
                        }
                        if (this.o.getDiggType() == 5 || this.o.getDiggType() == 6) {
                            Activity activity = this.f57923f;
                            String forwardId = this.o.getForwardId();
                            String cid = this.o.getCid();
                            DiggNotice diggNotice = this.o;
                            if (PatchProxy.isSupport(new Object[]{diggNotice}, this, f57920a, false, 63054, new Class[]{DiggNotice.class}, Integer.TYPE)) {
                                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{diggNotice}, this, f57920a, false, 63054, new Class[]{DiggNotice.class}, Integer.TYPE)).intValue();
                            } else if (diggNotice == null || diggNotice.getAweme() == null) {
                                i2 = 0;
                            } else {
                                i2 = diggNotice.getAweme().getEnterpriseType();
                            }
                            ForwardDetailActivity.a(activity, forwardId, "message", cid, i2);
                        } else {
                            Aweme aweme = this.o.getAweme();
                            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
                            Activity activity2 = this.f57923f;
                            a2.a(activity2, j.a("aweme://aweme/detail/" + aweme.getAid()).a("profile_enterprise_type", aweme.getEnterpriseType()).a("cid", this.o.getCid()).a("refer", "message").a());
                        }
                        r.onEvent(new MobClick().setEventName("video_play").setLabelName("message").setValue(this.o.getAweme().getAid()).setJsonObject(new t().a("request_id", this.o.getUsers().get(0).getRequestId()).a()));
                        a(true);
                    }
                } else if (id == C0906R.id.dhb && this.o.getRelationLabel() != null && !TextUtils.isEmpty(this.o.getRelationLabel().getUserId())) {
                    UserProfileActivity.a((Context) this.f57923f, this.o.getRelationLabel().getUserId(), this.o.getUsers().get(0).getSecUid(), "like_banner");
                }
            }
        }
    }

    public LikeNotificationHolder(View view, Activity activity) {
        super(view);
        this.f57923f = activity;
        this.m = (ConstraintLayout) view.findViewById(C0906R.id.bt1);
        this.g = (AvatarImageWithVerify) view.findViewById(C0906R.id.bst);
        this.h = (RemoteRoundImageView) view.findViewById(C0906R.id.bt4);
        this.i = (TextView) view.findViewById(C0906R.id.bsz);
        this.j = (TextView) view.findViewById(C0906R.id.bt2);
        this.k = (TextView) view.findViewById(C0906R.id.bsx);
        this.l = (RecyclerView) view.findViewById(C0906R.id.bt0);
        this.q = view.findViewById(C0906R.id.bt3);
        this.r = (RelationLabelTextView) view.findViewById(C0906R.id.dhb);
        this.s = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.t = (AnimationImageView) view.findViewById(C0906R.id.i8);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(this.f57923f);
        customLinearLayoutManager.setOrientation(0);
        customLinearLayoutManager.f58126b = false;
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(0, (int) UIUtils.dip2Px(this.f57923f, 10.0f), 0);
        this.l.setLayoutManager(customLinearLayoutManager);
        this.l.addItemDecoration(recyclerItemDecoration);
        this.l.setAdapter(this.p);
        c.a(this.g);
        c.a(this.i);
        c.a(this.h);
        this.i.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.r.setOnClickListener(this);
        if (!com.ss.android.g.a.a()) {
            this.f57922e = (h) ServiceManager.get().getService(h.class);
            this.f57921d = this.f57922e.a(this.g, this.s, this.t);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(BaseNotice baseNotice, boolean z, String str) {
        BaseNotice baseNotice2 = baseNotice;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f57920a, false, 63051, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str2}, this, f57920a, false, 63051, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (baseNotice2 != null && baseNotice2.diggNotice != null && baseNotice2.diggNotice.getUsers() != null && baseNotice2.diggNotice.getUsers().size() != 0) {
            super.a(baseNotice, z, str);
            this.u = str2;
            a("show", "like", getAdapterPosition(), baseNotice, z, str);
            a(z);
            this.n = baseNotice2;
            this.o = baseNotice2.diggNotice;
            this.g.setData(this.o.getUsers().get(0));
            if (this.f57921d != null) {
                this.f57921d.a(this.o.getUsers().get(0), false, this.o.getUsers().get(0).getUid());
            }
            if (!TextUtils.isEmpty(this.o.getUsers().get(0).getRemarkName())) {
                this.i.setText(this.o.getUsers().get(0).getRemarkName());
            } else {
                this.i.setText(this.o.getUsers().get(0).getNickname());
            }
            int mergeCount = this.o.getMergeCount();
            if (mergeCount == 1) {
                if (this.o.getDiggType() == 2) {
                    this.k.setText(this.f57923f.getString(C0906R.string.aud));
                } else if (this.o.getDiggType() == 3) {
                    this.k.setText(this.f57923f.getString(C0906R.string.auc));
                } else {
                    this.k.setText(this.f57923f.getString(C0906R.string.aue));
                }
                this.l.setVisibility(8);
            } else {
                if (this.o.getDiggType() == 2) {
                    this.k.setText(this.f57923f.getString(C0906R.string.aub, new Object[]{Integer.valueOf(mergeCount)}));
                } else if (this.o.getDiggType() == 3) {
                    this.k.setText(this.f57923f.getString(C0906R.string.aua, new Object[]{Integer.valueOf(mergeCount)}));
                } else {
                    this.k.setText(this.f57923f.getString(C0906R.string.au_, new Object[]{Integer.valueOf(mergeCount)}));
                }
                this.l.setVisibility(0);
            }
            this.j.setText(eo.b(this.f57923f, baseNotice2.createTime * 1000));
            if (this.o.getAweme() != null) {
                Aweme aweme = this.o.getAweme();
                if (aweme.getAwemeType() == 2) {
                    if (!CollectionUtils.isEmpty(aweme.getImageInfos()) && aweme.getImageInfos().get(0) != null) {
                        com.ss.android.ugc.aweme.base.c.b(this.h, aweme.getImageInfos().get(0).getLabelThumb());
                    }
                } else if (!(aweme.getVideo() == null || aweme.getVideo().getOriginCover() == null)) {
                    com.ss.android.ugc.aweme.base.c.b(this.h, aweme.getVideo().getOriginCover());
                }
            }
            this.p.a(this.o.getUsers());
            this.r.a(this.o.getRelationLabel());
            if (this.r.getVisibility() == 0) {
                this.i.setMaxEms(5);
            } else {
                this.i.setMaxEms(7);
            }
        }
    }
}
