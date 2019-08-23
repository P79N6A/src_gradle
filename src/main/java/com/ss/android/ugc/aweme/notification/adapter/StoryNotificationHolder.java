package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.StoryNotice;
import com.ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.notification.widget.RecyclerItemDecoration;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StoryNotificationHolder extends BaseNotificationHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57933a;

    /* renamed from: d  reason: collision with root package name */
    public Activity f57934d;

    /* renamed from: e  reason: collision with root package name */
    protected b f57935e;

    /* renamed from: f  reason: collision with root package name */
    protected h f57936f;
    private ConstraintLayout g;
    private View h;
    private AvatarImageWithVerify i;
    private TextView j;
    private TextView k;
    private MentionTextView l;
    private RecyclerView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private RemoteRoundImageView q;
    private StoryNotice r;
    private HeadViewAdapter s = new HeadViewAdapter();
    private StoryCircleView t;
    private AnimationImageView u;
    private int v;

    class HeadHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57937a;

        /* renamed from: b  reason: collision with root package name */
        AvatarImageView f57938b;

        /* renamed from: c  reason: collision with root package name */
        User f57939c;

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57937a, false, 63077, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57937a, false, 63077, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            StoryNotificationHolder.this.a(this.f57939c.getUid(), "story_notification", "click_head");
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            Activity activity = StoryNotificationHolder.this.f57934d;
            a2.a(activity, "aweme://user/profile/" + this.f57939c.getUid());
        }

        HeadHolder(View view) {
            super(view);
            this.f57938b = (AvatarImageView) view;
            this.f57938b.setOnClickListener(this);
        }
    }

    class HeadViewAdapter extends RecyclerView.Adapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57941a;

        /* renamed from: c  reason: collision with root package name */
        private List<User> f57943c = new ArrayList();

        public int getItemCount() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f57941a, false, 63081, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57941a, false, 63081, new Class[0], Integer.TYPE)).intValue();
            }
            if (this.f57943c != null) {
                i = this.f57943c.size();
            }
            return i;
        }

        HeadViewAdapter() {
        }

        public final void a(List<User> list) {
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{list}, this, f57941a, false, 63080, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f57941a, false, 63080, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f57943c.clear();
            while (i < 6 && i < list.size()) {
                this.f57943c.add(list.get(i));
                i++;
            }
            notifyDataSetChanged();
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57941a, false, 63078, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57941a, false, 63078, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            }
            AvatarImageView avatarImageView = new AvatarImageView(viewGroup.getContext());
            avatarImageView.setLayoutParams(new ViewGroup.LayoutParams((int) UIUtils.dip2Px(GlobalContext.getContext(), 27.0f), (int) UIUtils.dip2Px(GlobalContext.getContext(), 27.0f)));
            return new HeadHolder(avatarImageView);
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f57941a, false, 63079, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f57941a, false, 63079, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            HeadHolder headHolder = (HeadHolder) viewHolder;
            User user = this.f57943c.get(i);
            if (PatchProxy.isSupport(new Object[]{user}, headHolder, HeadHolder.f57937a, false, 63076, new Class[]{User.class}, Void.TYPE)) {
                HeadHolder headHolder2 = headHolder;
                PatchProxy.accessDispatch(new Object[]{user}, headHolder2, HeadHolder.f57937a, false, 63076, new Class[]{User.class}, Void.TYPE);
                return;
            }
            if (user != null) {
                headHolder.f57939c = user;
                c.b(headHolder.f57938b, user.getAvatarThumb());
            }
        }
    }

    public final boolean a() {
        return true;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57933a, false, 63074, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57933a, false, 63074, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.h.setVisibility(8);
            Cdo.a(this.g);
            return;
        }
        this.h.setVisibility(0);
        Cdo.a(this.g, 2130841684, C0906R.color.aj4);
    }

    public void onClick(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f57933a, false, 63075, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57933a, false, 63075, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!b()) {
            super.onClick(view);
            if (!a.a(view, 500) && this.r != null) {
                int id = view.getId();
                if (id == C0906R.id.bst) {
                    if (this.f57935e != null && !this.f57935e.b()) {
                        a(this.f57934d, this.r.users.get(0).getUid(), this.r.users.get(0).getSecUid(), "message");
                        a(this.r.users.get(0).getUid(), "story_notification", "click_head");
                    }
                } else if (id == C0906R.id.bto) {
                    a(this.f57934d, this.r.users.get(0).getUid(), this.r.users.get(0).getSecUid(), "message");
                    a(this.r.users.get(0).getUid(), "story_notification", "click_head");
                } else if ((id == C0906R.id.btq || id == C0906R.id.bts) && this.r.lifeStory != null) {
                    if (this.r.isExpired) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) this.f57934d, (int) C0906R.string.avs).a();
                    } else {
                        LifeStory lifeStory = this.r.lifeStory;
                        String curUserId = d.a().getCurUserId();
                        i iVar = (i) ServiceManager.get().getService(i.class);
                        if (iVar != null) {
                            f fVar = new f();
                            fVar.detailType = 6;
                            fVar.uid = curUserId;
                            fVar.storyId = lifeStory.getStoryId();
                            fVar.isSelf = true;
                            fVar.eventType = "story_notification";
                            iVar.a(this.f57934d, fVar, null, -1);
                        }
                    }
                    r.a("click_view_button", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "story").a("enter_method", "click_text").b().f34114b);
                    int adapterPosition = getAdapterPosition();
                    if (this.h.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a("click", "story", adapterPosition, z, "");
                }
            }
        }
    }

    public StoryNotificationHolder(View view, Activity activity) {
        super(view);
        this.f57934d = activity;
        this.g = (ConstraintLayout) view.findViewById(C0906R.id.btq);
        this.h = view.findViewById(C0906R.id.btr);
        this.i = (AvatarImageWithVerify) view.findViewById(C0906R.id.bst);
        this.j = (TextView) view.findViewById(C0906R.id.bto);
        this.k = (TextView) view.findViewById(C0906R.id.btt);
        this.l = (MentionTextView) view.findViewById(C0906R.id.btl);
        this.n = (TextView) view.findViewById(C0906R.id.btu);
        this.o = (TextView) view.findViewById(C0906R.id.btm);
        this.p = (TextView) view.findViewById(C0906R.id.btn);
        this.m = (RecyclerView) view.findViewById(C0906R.id.btp);
        this.q = (RemoteRoundImageView) view.findViewById(C0906R.id.bts);
        this.t = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.u = (AnimationImageView) view.findViewById(C0906R.id.i8);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(this.f57934d);
        customLinearLayoutManager.setOrientation(0);
        customLinearLayoutManager.f58126b = false;
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(0, (int) UIUtils.dip2Px(this.f57934d, 10.0f), 0);
        this.m.setLayoutManager(customLinearLayoutManager);
        this.m.addItemDecoration(recyclerItemDecoration);
        this.m.setAdapter(this.s);
        com.ss.android.ugc.aweme.notification.d.c.a(this.i);
        com.ss.android.ugc.aweme.notification.d.c.a(this.j);
        com.ss.android.ugc.aweme.notification.d.c.a(this.q);
        this.j.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.q.setOnClickListener(this);
        if (!com.ss.android.g.a.a()) {
            this.f57936f = (h) ServiceManager.get().getService(h.class);
            this.f57935e = this.f57936f.a(this.i, this.t, this.u);
        }
    }

    public final void a(BaseNotice baseNotice, boolean z, String str) {
        BaseNotice baseNotice2 = baseNotice;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f57933a, false, 63073, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str}, this, f57933a, false, 63073, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (baseNotice2 != null && baseNotice2.storyNotice != null && baseNotice2.storyNotice.users != null && baseNotice2.storyNotice.users.size() != 0) {
            super.a(baseNotice, z, str);
            a(z2);
            this.r = baseNotice2.storyNotice;
            this.v = baseNotice2.type;
            this.i.setData(this.r.users.get(0));
            if (this.f57935e != null) {
                this.f57935e.a(this.r.users.get(0), false, this.r.users.get(0).getUid());
            }
            if (!TextUtils.isEmpty(this.r.users.get(0).getRemarkName())) {
                this.j.setText(this.r.users.get(0).getRemarkName());
            } else {
                this.j.setText(this.r.users.get(0).getNickname());
            }
            this.k.setVisibility(8);
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            this.l.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            this.m.setVisibility(8);
            this.o.setVisibility(8);
            if (this.v == 25) {
                int i2 = this.r.mergeCount;
                if (i2 == 1) {
                    this.k.setText(this.f57934d.getString(C0906R.string.avu));
                } else {
                    this.k.setText(this.f57934d.getString(C0906R.string.avv, new Object[]{Integer.valueOf(i2)}));
                    this.m.setVisibility(0);
                }
                this.k.setVisibility(0);
                this.n.setVisibility(0);
                this.s.a(this.r.users);
                this.n.setText(eo.b(this.f57934d, baseNotice2.createTime * 1000));
            } else if (this.v == 26) {
                Comment comment = this.r.comment;
                if (comment != null) {
                    if (!TextUtils.isEmpty(comment.getText())) {
                        this.l.setVisibility(0);
                        this.l.setText(comment.getText());
                    }
                    this.o.setVisibility(0);
                    this.p.setVisibility(0);
                    this.p.setText(eo.b(this.f57934d, baseNotice2.createTime * 1000));
                }
            }
            if (this.r.lifeStory != null) {
                LifeStory lifeStory = this.r.lifeStory;
                if (lifeStory.getAwemeType() == 2) {
                    if (lifeStory.getImageInfo() != null) {
                        c.b(this.q, lifeStory.getImageInfo().getLabelThumb());
                    }
                } else if (!(lifeStory.getVideo() == null || lifeStory.getVideo().getOriginCover() == null)) {
                    c.b(this.q, lifeStory.getVideo().getOriginCover());
                }
            }
            a("show", "story", getAdapterPosition(), !z2, "");
        }
    }
}
