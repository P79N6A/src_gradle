package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.notification.bean.AtMe;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.CommentNotice;
import com.ss.android.ugc.aweme.notification.bean.VoteNotice;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.notification.widget.RecyclerItemDecoration;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InteractiveNotificationHolder extends BaseNotificationHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57916a;

    /* renamed from: d  reason: collision with root package name */
    private Activity f57917d;

    /* renamed from: e  reason: collision with root package name */
    private AvatarImageWithVerify f57918e;

    /* renamed from: f  reason: collision with root package name */
    private RemoteRoundImageView f57919f;
    private RecyclerView g;
    private HeadViewAdapter h = new HeadViewAdapter(this.f57917d, 4);
    private TextView i;
    private TextView j;
    private MentionTextView k;
    private TextView l;
    private TextView m;
    private ConstraintLayout n;
    private VoteNotice o;
    private AtMe p;
    private CommentNotice q;
    private View r;
    private RelationLabelTextView s;
    private StoryCircleView t;
    private AnimationImageView u;
    private b v;
    private h w;
    private BaseNotice x;
    private String y;

    private static boolean a(int i2) {
        return i2 == 7 || i2 == 8 || i2 == 9 || i2 == 10;
    }

    public final boolean a() {
        return true;
    }

    private String c() {
        switch (this.q.commentType) {
            case 11:
            case 14:
                return "comment_a";
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
            case 15:
                return "comment_b";
            case 13:
            case SearchJediMixFeedAdapter.f42514c:
                return "comment_c";
            default:
                return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct.getType() == 3) {
            a(true);
            a(this.f57917d, textExtraStruct.getUserId(), "", "message");
        }
    }

    private String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f57916a, false, 63049, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f57916a, false, 63049, new Class[]{String.class}, String.class);
        }
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\d+\\d$").matcher(str2);
        if (matcher.find()) {
            str3 = matcher.group();
        }
        return str3;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57916a, false, 63041, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57916a, false, 63041, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.r.setVisibility(8);
            Cdo.a(this.n);
            return;
        }
        this.r.setVisibility(0);
        Cdo.a(this.n, 2130841684, C0906R.color.aj4);
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57916a, false, 63042, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57916a, false, 63042, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!a.a(view2, 500) && !b()) {
            super.onClick(view);
            if (this.q != null) {
                if (PatchProxy.isSupport(new Object[]{view2}, this, f57916a, false, 63043, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f57916a, false, 63043, new Class[]{View.class}, Void.TYPE);
                } else {
                    if (this.q.comment != null) {
                        int adapterPosition = getAdapterPosition();
                        BaseNotice baseNotice = this.x;
                        if (this.r.getVisibility() == 8) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        a("click", "comment", adapterPosition, baseNotice, z3, c(), this.y);
                        int id = view.getId();
                        String uid = this.q.comment.getUser().getUid();
                        String secUid = this.q.comment.getUser().getSecUid();
                        if (id == C0906R.id.bst) {
                            if (this.v != null && !this.v.b()) {
                                a(this.f57917d, uid, secUid, "message");
                                a(this.q.comment.getUser().getUid(), "message_at", "click_head");
                            }
                        } else if (id == C0906R.id.bt9) {
                            a(this.f57917d, uid, secUid, "message");
                            a(this.q.comment.getUser().getUid(), "message_comment", "click_head");
                        } else if (id == C0906R.id.btj || id == C0906R.id.bu2) {
                            Aweme aweme = this.q.aweme;
                            if (aweme != null) {
                                int i2 = this.q.commentType;
                                if (i2 == 3) {
                                    com.bytedance.ies.dmt.ui.d.a.c((Context) this.f57917d, (int) C0906R.string.jx).a();
                                } else {
                                    if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6 || i2 == 11 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 16) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
                                        Activity activity = this.f57917d;
                                        a2.a(activity, j.a("aweme://aweme/detail/" + this.q.aweme.getAid()).a("profile_enterprise_type", aweme.getEnterpriseType()).a("cid", this.q.comment.getCid()).a("refer", "message").a());
                                    } else if (!(!a(i2) || this.q == null || this.q.comment == null)) {
                                        ForwardDetailActivity.a(this.f57917d, this.q.forwardId, "message", this.q.comment.getCid(), aweme.getEnterpriseType());
                                    }
                                    if (!a(i2)) {
                                        r.onEvent(new MobClick().setEventName("video_play").setLabelName("message").setValue(this.q.aweme.getAid()).setJsonObject(new t().a("request_id", this.q.comment.getUser().getRequestId()).a()));
                                    }
                                }
                            }
                        } else if (id == C0906R.id.dhb && this.q.relationLabel != null && !TextUtils.isEmpty(this.q.relationLabel.getUserId())) {
                            UserProfileActivity.a((Context) this.f57917d, this.q.relationLabel.getUserId(), this.q.comment.getUser().getSecUid(), "like_banner");
                        }
                    }
                }
            } else if (this.p != null) {
                if (PatchProxy.isSupport(new Object[]{view2}, this, f57916a, false, 63044, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f57916a, false, 63044, new Class[]{View.class}, Void.TYPE);
                } else {
                    int id2 = view.getId();
                    int adapterPosition2 = getAdapterPosition();
                    BaseNotice baseNotice2 = this.x;
                    if (this.r.getVisibility() == 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a("click", "at", adapterPosition2, baseNotice2, z2, this.y);
                    String uid2 = this.p.user.getUid();
                    String secUid2 = this.p.user.getSecUid();
                    if (id2 == C0906R.id.bst) {
                        if (this.v != null && !this.v.b()) {
                            a(this.f57917d, uid2, secUid2, "message");
                            a(this.p.user.getUid(), "message_at", "click_head");
                        }
                    } else if (id2 == C0906R.id.bt9) {
                        a(this.f57917d, uid2, secUid2, "message");
                        a(this.p.user.getUid(), "message_at", "click_head");
                    } else if (id2 == C0906R.id.btj || id2 == C0906R.id.bu2) {
                        com.ss.android.ugc.aweme.ag.h.a().a(this.f57917d, j.a(this.p.schemaUrl).a("refer", "message").a());
                        String a3 = a(this.p.schemaUrl);
                        if (!TextUtils.isEmpty(a3)) {
                            r.onEvent(new MobClick().setEventName("video_play").setLabelName("message").setValue(a3).setJsonObject(new t().a("request_id", this.p.user.getRequestId()).a()));
                        }
                    } else if (id2 == C0906R.id.dhb && this.p.relationLabel != null && !TextUtils.isEmpty(this.p.relationLabel.getUserId())) {
                        UserProfileActivity.a((Context) this.f57917d, this.p.relationLabel.getUserId(), this.p.user.getSecUid(), "like_banner");
                    }
                }
            } else if (this.o != null) {
                if (PatchProxy.isSupport(new Object[]{view2}, this, f57916a, false, 63045, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f57916a, false, 63045, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                int id3 = view.getId();
                int adapterPosition3 = getAdapterPosition();
                BaseNotice baseNotice3 = this.x;
                if (this.r.getVisibility() == 8) {
                    z = true;
                } else {
                    z = false;
                }
                a("click", "pollsticker", adapterPosition3, baseNotice3, z, this.y);
                boolean z5 = false;
                User user = (User) this.o.f57986a.get(0);
                if (id3 == C0906R.id.bst) {
                    if (this.v != null && !this.v.b()) {
                        a(this.f57917d, user.getUid(), user.getSecUid(), "message");
                        a(user.getUid(), "message_vote", "click_head");
                    }
                } else if (id3 == C0906R.id.bt9) {
                    a(this.f57917d, user.getUid(), user.getSecUid(), "message");
                    a(user.getUid(), "message_vote", "click_head");
                } else if (id3 == C0906R.id.btj || id3 == C0906R.id.bu2) {
                    int adapterPosition4 = getAdapterPosition();
                    if (this.r.getVisibility() == 0) {
                        z5 = true;
                    }
                    a("click", "pollsticker", adapterPosition4, z5);
                    com.ss.android.ugc.aweme.ag.h.a().a(this.f57917d, j.a(this.o.f57991f).a("refer", "message").a());
                    String a4 = a(this.o.f57991f);
                    if (!TextUtils.isEmpty(a4)) {
                        r.onEvent(new MobClick().setEventName("video_play").setLabelName("message").setValue(a4).setJsonObject(new t().a("request_id", user.getRequestId()).a()));
                    }
                } else if (id3 == C0906R.id.dhb && this.o.f57990e != null && !TextUtils.isEmpty(this.o.f57990e.getUserId())) {
                    UserProfileActivity.a((Context) this.f57917d, this.o.f57990e.getUserId(), user.getSecUid(), "like_banner");
                }
            }
        }
    }

    public InteractiveNotificationHolder(View view, Activity activity) {
        super(view);
        this.f57917d = activity;
        this.f57918e = (AvatarImageWithVerify) view.findViewById(C0906R.id.bst);
        this.f57919f = (RemoteRoundImageView) view.findViewById(C0906R.id.bu2);
        this.i = (TextView) view.findViewById(C0906R.id.bt9);
        this.j = (TextView) view.findViewById(C0906R.id.bt_);
        this.k = (MentionTextView) view.findViewById(C0906R.id.bru);
        this.l = (TextView) view.findViewById(C0906R.id.btz);
        this.n = (ConstraintLayout) view.findViewById(C0906R.id.btj);
        this.r = view.findViewById(C0906R.id.bu1);
        this.m = (TextView) view.findViewById(C0906R.id.bs4);
        this.s = (RelationLabelTextView) view.findViewById(C0906R.id.dhb);
        this.t = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.u = (AnimationImageView) view.findViewById(C0906R.id.i8);
        this.g = (RecyclerView) view.findViewById(C0906R.id.cc6);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(this.f57917d);
        customLinearLayoutManager.setOrientation(0);
        customLinearLayoutManager.f58126b = false;
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(0, (int) UIUtils.dip2Px(this.f57917d, 10.0f), 0);
        this.g.setLayoutManager(customLinearLayoutManager);
        this.g.addItemDecoration(recyclerItemDecoration);
        this.g.setAdapter(this.h);
        c.a(this.i);
        c.a(this.f57919f);
        c.a(this.f57918e);
        this.f57919f.setOnClickListener(this);
        this.f57918e.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.s.setOnClickListener(this);
        if (!com.ss.android.g.a.a()) {
            this.w = (h) ServiceManager.get().getService(h.class);
            this.v = this.w.a(this.f57918e, this.t, this.u);
        }
    }

    private void b(BaseNotice baseNotice, boolean z, String str) {
        String str2;
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f57916a, false, 63040, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str}, this, f57916a, false, 63040, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        a("show", "pollsticker", getAdapterPosition(), baseNotice, z, str);
        this.g.setVisibility(8);
        if (!CollectionUtils.isEmpty(this.o.f57986a)) {
            User user = (User) this.o.f57986a.get(0);
            this.f57918e.setData(user);
            com.ss.android.ugc.aweme.base.c.b(this.f57919f, this.o.f57987b);
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.i.setText(user.getRemarkName());
            } else {
                this.i.setText(user.getNickname());
            }
            if (this.o.f57986a.size() > 1 && this.o.f57989d > 1) {
                this.g.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 1; i2 < this.o.f57986a.size(); i2++) {
                    arrayList.add(this.o.f57986a.get(i2));
                }
                this.h.a(arrayList);
            }
        }
        MentionTextView mentionTextView = this.k;
        if (PatchProxy.isSupport(new Object[0], this, f57916a, false, 63046, new Class[0], String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[0], this, f57916a, false, 63046, new Class[0], String.class);
        } else {
            if (!CollectionUtils.isEmpty(this.o.f57986a)) {
                int i3 = this.o.f57989d;
                if (i3 == 1 && !this.o.f57986a.isEmpty()) {
                    str2 = this.f57917d.getString(C0906R.string.dsl, new Object[]{this.o.f57988c});
                } else if (i3 > 1) {
                    str2 = this.f57917d.getString(C0906R.string.dsk, new Object[]{Integer.valueOf(i3 - 1)});
                }
            }
            str2 = "";
        }
        mentionTextView.setText(str2);
        this.k.setVisibility(0);
        this.m.setVisibility(8);
        this.l.setText(eo.b(this.f57917d, baseNotice2.createTime * 1000));
        g.a((TextView) this.k);
        this.s.a(this.o.f57990e);
        if (this.s.getVisibility() == 0) {
            this.i.setMaxEms(5);
        } else {
            this.i.setMaxEms(7);
        }
    }

    public final void a(BaseNotice baseNotice, boolean z, String str) {
        int i2;
        int i3;
        int i4;
        String str2;
        List list;
        BaseNotice baseNotice2 = baseNotice;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str3}, this, f57916a, false, 63037, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str3}, this, f57916a, false, 63037, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (baseNotice2 != null && (baseNotice2.commentNotice != null || baseNotice2.atMe != null || baseNotice2.voteNotice != null)) {
            this.y = str3;
            this.x = baseNotice2;
            super.a(baseNotice, z, str);
            a(z);
            this.q = baseNotice2.commentNotice;
            this.p = baseNotice2.atMe;
            this.o = baseNotice2.voteNotice;
            if (this.q != null) {
                if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z), str3}, this, f57916a, false, 63038, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str3}, this, f57916a, false, 63038, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
                } else {
                    a("show", "comment", getAdapterPosition(), baseNotice, z, c(), str);
                    this.f57918e.setData(this.q.comment.getUser());
                    if (this.v != null) {
                        this.v.a(this.q.comment.getUser(), false, this.q.comment.getUser().getUid());
                    }
                    if (this.q.aweme != null) {
                        Aweme aweme = this.q.aweme;
                        if (aweme.getAwemeType() == 2) {
                            if (!CollectionUtils.isEmpty(aweme.getImageInfos()) && aweme.getImageInfos().get(0) != null) {
                                com.ss.android.ugc.aweme.base.c.b(this.f57919f, aweme.getImageInfos().get(0).getLabelThumb());
                            }
                        } else if (!(aweme.getVideo() == null || aweme.getVideo().getOriginCover() == null)) {
                            com.ss.android.ugc.aweme.base.c.b(this.f57919f, aweme.getVideo().getOriginCover());
                        }
                    }
                    if (!TextUtils.isEmpty(this.q.comment.getUser().getRemarkName())) {
                        this.i.setText(this.q.comment.getUser().getRemarkName());
                    } else {
                        this.i.setText(this.q.comment.getUser().getNickname());
                    }
                    this.l.setText(eo.b(this.f57917d, baseNotice2.createTime * 1000));
                    MentionTextView mentionTextView = this.k;
                    if (PatchProxy.isSupport(new Object[0], this, f57916a, false, 63047, new Class[0], String.class)) {
                        i3 = 15;
                        i4 = 13;
                        str2 = (String) PatchProxy.accessDispatch(new Object[0], this, f57916a, false, 63047, new Class[0], String.class);
                    } else {
                        i4 = 13;
                        i3 = 15;
                        StringBuilder sb = new StringBuilder();
                        int i5 = this.q.commentType;
                        Comment comment = this.q.comment;
                        if ((i5 == 11 || i5 == 12 || i5 == 14 || i5 == 15 || i5 == 13 || i5 == 16) && !TextUtils.isEmpty(comment.getReplyToUserName())) {
                            sb.append(o.b(C0906R.string.bz7));
                            sb.append(comment.getReplyToUserName());
                            sb.append("：");
                        }
                        sb.append(this.q.comment.getForwardText());
                        str2 = sb.toString();
                    }
                    mentionTextView.setText(str2);
                    this.k.setSpanColor(o.a(C0906R.color.i4));
                    this.k.setSpanStyle(1);
                    this.k.setOnSpanClickListener(new d(this));
                    MentionTextView mentionTextView2 = this.k;
                    if (PatchProxy.isSupport(new Object[0], this, f57916a, false, 63048, new Class[0], List.class)) {
                        list = (List) PatchProxy.accessDispatch(new Object[0], this, f57916a, false, 63048, new Class[0], List.class);
                    } else {
                        list = this.q.comment.getTextExtra();
                        Comment comment2 = this.q.comment;
                        int i6 = this.q.commentType;
                        if (i6 == 11 || i6 == 12 || i6 == i3 || i6 == i3 || i6 == i4 || i6 == i4) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            String replyToUserName = comment2.getReplyToUserName();
                            if (!TextUtils.isEmpty(replyToUserName)) {
                                TextExtraStruct textExtraStruct = new TextExtraStruct();
                                textExtraStruct.setType(3);
                                textExtraStruct.setStart(2);
                                textExtraStruct.setEnd(textExtraStruct.getStart() + replyToUserName.length() + 1);
                                textExtraStruct.setUserId(comment2.getReplyToUserId());
                                list.add(textExtraStruct);
                            }
                        }
                    }
                    AbTestManager.a();
                    mentionTextView2.a(list, (MentionTextView.d) new f(true));
                    this.k.setMovementMethod(LinkMovementMethod.getInstance());
                    this.k.setVisibility(0);
                    this.j.setVisibility(8);
                    g.a((TextView) this.k);
                    TextView textView = this.m;
                    int i7 = this.q.commentType;
                    int i8 = C0906R.string.aq7;
                    switch (i7) {
                        case 2:
                        case 4:
                        case 6:
                        case 8:
                            i8 = C0906R.string.aq4;
                            break;
                        case 3:
                            i8 = C0906R.string.aq5;
                            break;
                        case e.l:
                            i8 = C0906R.string.wg;
                            break;
                        case 9:
                        case 10:
                            i8 = C0906R.string.ahp;
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE:
                        case 15:
                            i8 = C0906R.string.bzc;
                            break;
                        case 13:
                        case SearchJediMixFeedAdapter.f42514c:
                            i8 = C0906R.string.ahz;
                            break;
                    }
                    textView.setText(i8);
                    this.m.setVisibility(0);
                    this.g.setVisibility(8);
                    this.s.a(this.q.relationLabel);
                    if (this.s.getVisibility() == 0) {
                        this.i.setMaxEms(5);
                    } else {
                        this.i.setMaxEms(7);
                    }
                }
            } else if (this.p != null) {
                if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z), str3}, this, f57916a, false, 63039, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str3}, this, f57916a, false, 63039, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
                } else {
                    a("show", "at", getAdapterPosition(), baseNotice, z, str);
                    this.f57918e.setData(this.p.user);
                    if (this.v != null) {
                        this.v.a(this.p.user, false, this.p.user.getUid());
                    }
                    com.ss.android.ugc.aweme.base.c.b(this.f57919f, this.p.imageUrl);
                    if (!TextUtils.isEmpty(this.p.user.getRemarkName())) {
                        this.i.setText(this.p.user.getRemarkName());
                    } else {
                        this.i.setText(this.p.user.getNickname());
                    }
                    this.l.setText(eo.b(this.f57917d, baseNotice2.createTime * 1000));
                    this.k.setVisibility(8);
                    this.m.setVisibility(0);
                    if (StringUtils.isEmpty(this.p.title)) {
                        this.j.setVisibility(0);
                        this.j.setText(this.p.content);
                        this.m.setText(C0906R.string.auu);
                        i2 = 8;
                    } else {
                        if (this.p.subType != 7) {
                            i2 = 8;
                            if (this.p.subType != 8) {
                                this.j.setVisibility(8);
                                this.m.setText(C0906R.string.auv);
                            }
                        } else {
                            i2 = 8;
                        }
                        this.j.setVisibility(i2);
                        this.m.setText(this.p.title);
                    }
                    g.a(this.j);
                    this.g.setVisibility(i2);
                    this.s.a(this.p.relationLabel);
                    if (this.s.getVisibility() == 0) {
                        this.i.setMaxEms(5);
                    } else {
                        this.i.setMaxEms(7);
                    }
                }
            } else if (this.o != null) {
                b(baseNotice, z, str);
            }
        }
    }
}
