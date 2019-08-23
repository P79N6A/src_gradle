package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.CommentNotice;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;

public class CommentNotificationHolder extends BaseNotificationHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57857a;

    /* renamed from: d  reason: collision with root package name */
    private Activity f57858d;

    /* renamed from: e  reason: collision with root package name */
    private AvatarImageWithVerify f57859e;

    /* renamed from: f  reason: collision with root package name */
    private RemoteRoundImageView f57860f;
    private TextView g;
    private TextView h;
    private MentionTextView i;
    private TextView j;
    private ConstraintLayout k;
    private CommentNotice l;
    private View m;
    private RelationLabelTextView n;
    private BaseNotice o;
    private String p;

    private static boolean a(int i2) {
        return i2 == 7 || i2 == 8 || i2 == 9 || i2 == 10;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct.getType() == 3) {
            a(true);
            a(this.f57858d, textExtraStruct.getUserId(), "", "message");
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57857a, false, 62906, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57857a, false, 62906, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.m.setVisibility(8);
            Cdo.a(this.k);
            return;
        }
        this.m.setVisibility(0);
        Cdo.a(this.k, 2130841684, C0906R.color.aj4);
    }

    public void onClick(View view) {
        boolean z;
        String str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f57857a, false, 62907, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57857a, false, 62907, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!b()) {
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.o;
            if (this.m.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "";
            switch (this.l.commentType) {
                case 11:
                case 14:
                    str = "comment_a";
                    break;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                case 15:
                    str = "comment_b";
                    break;
                case 13:
                case SearchJediMixFeedAdapter.f42514c:
                    str = "comment_c";
                    break;
                default:
                    a("click", "comment", adapterPosition, baseNotice, z, str2, this.p);
                    super.onClick(view);
                    if (this.l == null && this.l.comment != null) {
                        int id = view.getId();
                        if (id == C0906R.id.brx || id == C0906R.id.bry) {
                            User user = this.l.comment.getUser();
                            a(this.f57858d, user.getUid(), user.getSecUid(), "message");
                            a(this.l.comment.getUser().getUid(), "message_comment", "click_head");
                            return;
                        } else if (id == C0906R.id.brz || id == C0906R.id.bs2) {
                            Aweme aweme = this.l.aweme;
                            if (aweme != null) {
                                int i2 = this.l.commentType;
                                if (i2 == 3) {
                                    a.c((Context) this.f57858d, (int) C0906R.string.jx).a();
                                    return;
                                }
                                if (!(i2 == 0 || i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6 || i2 == 11 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 16)) {
                                    z2 = false;
                                }
                                if (z2) {
                                    h a2 = h.a();
                                    Activity activity = this.f57858d;
                                    a2.a(activity, j.a("aweme://aweme/detail/" + this.l.aweme.getAid()).a("profile_enterprise_type", aweme.getEnterpriseType()).a("cid", this.l.comment.getCid()).a("refer", "message").a());
                                } else if (!(!a(i2) || this.l == null || this.l.comment == null)) {
                                    ForwardDetailActivity.a(this.f57858d, this.l.forwardId, "message", this.l.comment.getCid(), aweme.getEnterpriseType());
                                }
                                if (!a(i2)) {
                                    r.onEvent(new MobClick().setEventName("video_play").setLabelName("message").setValue(this.l.aweme.getAid()).setJsonObject(new t().a("request_id", this.l.comment.getUser().getRequestId()).a()));
                                }
                                return;
                            }
                            return;
                        } else {
                            if (id == C0906R.id.dhb && this.l.relationLabel != null && !TextUtils.isEmpty(this.l.relationLabel.getUserId())) {
                                UserProfileActivity.a((Context) this.f57858d, this.l.relationLabel.getUserId(), this.l.comment.getUser().getSecUid(), "like_banner");
                            }
                            return;
                        }
                    }
            }
            str2 = str;
            a("click", "comment", adapterPosition, baseNotice, z, str2, this.p);
            super.onClick(view);
            if (this.l == null) {
            }
        }
    }

    public CommentNotificationHolder(View view, Activity activity) {
        super(view);
        this.f57858d = activity;
        this.f57859e = (AvatarImageWithVerify) view.findViewById(C0906R.id.brx);
        this.f57860f = (RemoteRoundImageView) view.findViewById(C0906R.id.bs2);
        this.g = (TextView) view.findViewById(C0906R.id.bry);
        this.h = (TextView) view.findViewById(C0906R.id.bs0);
        this.i = (MentionTextView) view.findViewById(C0906R.id.brv);
        this.k = (ConstraintLayout) view.findViewById(C0906R.id.brz);
        this.m = view.findViewById(C0906R.id.bs1);
        this.j = (TextView) view.findViewById(C0906R.id.brw);
        this.n = (RelationLabelTextView) view.findViewById(C0906R.id.dhb);
        c.a(this.f57859e);
        c.a(this.g);
        c.a(this.f57860f);
        this.f57859e.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.f57860f.setOnClickListener(this);
        this.n.setOnClickListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0187, code lost:
        if (r1 == 16) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.notification.bean.BaseNotice r21, boolean r22, java.lang.String r23) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r23
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r12 = 1
            r0[r12] = r1
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57857a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r1 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62905(0xf5b9, float:8.8149E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r0[r12] = r1
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57857a
            r3 = 0
            r4 = 62905(0xf5b9, float:8.8149E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r1 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005c:
            if (r8 == 0) goto L_0x02e1
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r0 = r8.commentNotice
            if (r0 != 0) goto L_0x0064
            goto L_0x02e1
        L_0x0064:
            super.a((com.ss.android.ugc.aweme.notification.bean.BaseNotice) r21, (boolean) r22, (java.lang.String) r23)
            r14 = r22
            r7.a((boolean) r14)
            r7.o = r8
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r0 = r8.commentNotice
            r7.l = r0
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r7.f57859e
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.comment
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            r0.setData((com.ss.android.ugc.aweme.profile.model.User) r1)
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r0 = r7.l
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
            if (r0 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r0 = r7.l
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
            int r1 = r0.getAwemeType()
            if (r1 != r13) goto L_0x00b7
            java.util.List r1 = r0.getImageInfos()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d4
            java.util.List r1 = r0.getImageInfos()
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r1 = r7.f57860f
            java.util.List r0 = r0.getImageInfos()
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.feed.model.ImageInfo r0 = (com.ss.android.ugc.aweme.feed.model.ImageInfo) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getLabelThumb()
            com.ss.android.ugc.aweme.base.c.b(r1, r0)
            goto L_0x00d4
        L_0x00b7:
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            if (r1 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getOriginCover()
            if (r1 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r1 = r7.f57860f
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getOriginCover()
            com.ss.android.ugc.aweme.base.c.b(r1, r0)
        L_0x00d4:
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r0 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.comment
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            java.lang.String r0 = r0.getRemarkName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f8
            android.widget.TextView r0 = r7.g
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.comment
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            java.lang.String r1 = r1.getRemarkName()
            r0.setText(r1)
            goto L_0x0109
        L_0x00f8:
            android.widget.TextView r0 = r7.g
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.comment
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            java.lang.String r1 = r1.getNickname()
            r0.setText(r1)
        L_0x0109:
            android.widget.TextView r0 = r7.h
            android.app.Activity r1 = r7.f57858d
            long r2 = r8.createTime
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.String r1 = com.ss.android.ugc.aweme.utils.eo.b(r1, r2)
            r0.setText(r1)
            com.ss.android.ugc.aweme.views.MentionTextView r15 = r7.i
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f57857a
            r3 = 0
            r4 = 62908(0xf5bc, float:8.8153E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r6 = 16
            r4 = 15
            r3 = 14
            r2 = 12
            r1 = 11
            if (r0 == 0) goto L_0x0164
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r16 = f57857a
            r17 = 0
            r18 = 62908(0xf5bc, float:8.8153E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r13 = 11
            r1 = r20
            r10 = 12
            r2 = r16
            r11 = 14
            r3 = r17
            r12 = 15
            r4 = r18
            r6 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            r5 = 16
            r6 = 13
            goto L_0x01c0
        L_0x0164:
            r10 = 12
            r11 = 14
            r12 = 15
            r13 = 11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            int r1 = r1.commentType
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r2 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r2 = r2.comment
            if (r1 == r13) goto L_0x018d
            if (r1 == r10) goto L_0x018d
            if (r1 == r11) goto L_0x018d
            if (r1 == r12) goto L_0x018d
            r6 = 13
            if (r1 == r6) goto L_0x018a
            r5 = 16
            if (r1 != r5) goto L_0x01b1
            goto L_0x0191
        L_0x018a:
            r5 = 16
            goto L_0x0191
        L_0x018d:
            r5 = 16
            r6 = 13
        L_0x0191:
            java.lang.String r1 = r2.getReplyToUserName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01b1
            r1 = 2131562124(0x7f0d0e8c, float:1.8749668E38)
            java.lang.String r1 = com.ss.android.ugc.aweme.base.utils.o.b(r1)
            r0.append(r1)
            java.lang.String r1 = r2.getReplyToUserName()
            r0.append(r1)
            java.lang.String r1 = "："
            r0.append(r1)
        L_0x01b1:
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.comment
            java.lang.String r1 = r1.getForwardText()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x01c0:
            r15.setText(r0)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.i
            r1 = 2131624270(0x7f0e014e, float:1.8875715E38)
            int r1 = com.ss.android.ugc.aweme.base.utils.o.a(r1)
            r0.setSpanColor(r1)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.i
            r1 = 1
            r0.setSpanStyle(r1)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.i
            com.ss.android.ugc.aweme.notification.adapter.a r1 = new com.ss.android.ugc.aweme.notification.adapter.a
            r1.<init>(r7)
            r0.setOnSpanClickListener(r1)
            com.ss.android.ugc.aweme.views.MentionTextView r15 = r7.i
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.meituan.robust.ChangeQuickRedirect r2 = f57857a
            r3 = 0
            r16 = 62909(0xf5bd, float:8.8154E-41)
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r18 = r1
            r1 = r20
            r12 = 0
            r4 = r16
            r5 = r18
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0215
            java.lang.Object[] r0 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r2 = f57857a
            r3 = 0
            r4 = 62909(0xf5bd, float:8.8154E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
        L_0x0213:
            r2 = 1
            goto L_0x026d
        L_0x0215:
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r0 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.comment
            java.util.List r0 = r0.getTextExtra()
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.comment
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r2 = r7.l
            int r2 = r2.commentType
            if (r2 == r13) goto L_0x0237
            if (r2 == r10) goto L_0x0237
            if (r2 == r11) goto L_0x0237
            r3 = 15
            if (r2 == r3) goto L_0x0237
            r3 = 13
            if (r2 == r3) goto L_0x0237
            r3 = 16
            if (r2 != r3) goto L_0x0213
        L_0x0237:
            if (r0 != 0) goto L_0x023e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x023e:
            java.lang.String r2 = r1.getReplyToUserName()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0213
            com.ss.android.ugc.aweme.model.TextExtraStruct r3 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r3.<init>()
            r4 = 3
            r3.setType(r4)
            r4 = 2
            r3.setStart(r4)
            int r4 = r3.getStart()
            int r2 = r2.length()
            int r4 = r4 + r2
            r2 = 1
            int r4 = r4 + r2
            r3.setEnd(r4)
            java.lang.String r1 = r1.getReplyToUserId()
            r3.setUserId(r1)
            r0.add(r3)
        L_0x026d:
            com.ss.android.ugc.aweme.shortvideo.view.f r1 = new com.ss.android.ugc.aweme.shortvideo.view.f
            com.ss.android.ugc.aweme.setting.AbTestManager.a()
            r1.<init>(r2)
            r15.a((java.util.List<com.ss.android.ugc.aweme.model.TextExtraStruct>) r0, (com.ss.android.ugc.aweme.views.MentionTextView.d) r1)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.i
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.i
            com.bytedance.ies.dmt.ui.input.emoji.g.a((android.widget.TextView) r0)
            android.widget.TextView r0 = r7.j
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            int r1 = r1.commentType
            r2 = 2131560423(0x7f0d07e7, float:1.8746218E38)
            switch(r1) {
                case 0: goto L_0x02aa;
                case 1: goto L_0x02aa;
                case 2: goto L_0x02a7;
                case 3: goto L_0x02a3;
                case 4: goto L_0x02a7;
                case 5: goto L_0x02aa;
                case 6: goto L_0x02a7;
                case 7: goto L_0x029f;
                case 8: goto L_0x02a7;
                case 9: goto L_0x029b;
                case 10: goto L_0x029b;
                case 11: goto L_0x02aa;
                case 12: goto L_0x0297;
                case 13: goto L_0x0293;
                case 14: goto L_0x02aa;
                case 15: goto L_0x0297;
                case 16: goto L_0x0293;
                default: goto L_0x0292;
            }
        L_0x0292:
            goto L_0x02aa
        L_0x0293:
            r2 = 2131560120(0x7f0d06b8, float:1.8745603E38)
            goto L_0x02aa
        L_0x0297:
            r2 = 2131562130(0x7f0d0e92, float:1.874968E38)
            goto L_0x02aa
        L_0x029b:
            r2 = 2131560110(0x7f0d06ae, float:1.8745583E38)
            goto L_0x02aa
        L_0x029f:
            r2 = 2131559289(0x7f0d0379, float:1.8743918E38)
            goto L_0x02aa
        L_0x02a3:
            r2 = 2131560421(0x7f0d07e5, float:1.8746214E38)
            goto L_0x02aa
        L_0x02a7:
            r2 = 2131560420(0x7f0d07e4, float:1.8746212E38)
        L_0x02aa:
            r0.setText(r2)
            com.ss.android.ugc.aweme.views.RelationLabelTextView r0 = r7.n
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r7.l
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r1 = r1.relationLabel
            r0.a(r1)
            com.ss.android.ugc.aweme.views.RelationLabelTextView r0 = r7.n
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02c5
            android.widget.TextView r0 = r7.g
            r1 = 5
            r0.setMaxEms(r1)
            goto L_0x02cb
        L_0x02c5:
            android.widget.TextView r0 = r7.g
            r1 = 7
            r0.setMaxEms(r1)
        L_0x02cb:
            r7.p = r9
            java.lang.String r1 = "show"
            java.lang.String r2 = "comment"
            int r3 = r20.getAdapterPosition()
            r0 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r0.a(r1, r2, r3, r4, r5, r6)
            return
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.CommentNotificationHolder.a(com.ss.android.ugc.aweme.notification.bean.BaseNotice, boolean, java.lang.String):void");
    }
}
