package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.notification.bean.AtMe;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;

public class AtMeNotificationHolder extends BaseNotificationHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57848a;

    /* renamed from: d  reason: collision with root package name */
    private Activity f57849d;

    /* renamed from: e  reason: collision with root package name */
    private AvatarImageWithVerify f57850e;

    /* renamed from: f  reason: collision with root package name */
    private RemoteRoundImageView f57851f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private ConstraintLayout k;
    private AtMe l;
    private View m;
    private RelationLabelTextView n;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57848a, false, 62883, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57848a, false, 62883, new Class[]{Boolean.TYPE}, Void.TYPE);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f57848a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62884(0xf5a4, float:8.8119E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f57848a
            r3 = 0
            r4 = 62884(0xf5a4, float:8.8119E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r11)
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x003c
            return
        L_0x003c:
            super.onClick(r11)
            int r0 = r11.getId()
            r1 = 2131168668(0x7f070d9c, float:1.7951644E38)
            if (r0 == r1) goto L_0x014d
            r1 = 2131168669(0x7f070d9d, float:1.7951646E38)
            if (r0 != r1) goto L_0x004f
            goto L_0x014d
        L_0x004f:
            r1 = 2131168670(0x7f070d9e, float:1.7951648E38)
            if (r0 == r1) goto L_0x008b
            r1 = 2131168673(0x7f070da1, float:1.7951654E38)
            if (r0 != r1) goto L_0x005a
            goto L_0x008b
        L_0x005a:
            r1 = 2131170962(0x7f071692, float:1.7956297E38)
            if (r0 != r1) goto L_0x008a
            com.ss.android.ugc.aweme.notification.bean.AtMe r0 = r10.l
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r0 = r0.relationLabel
            if (r0 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.notification.bean.AtMe r0 = r10.l
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r0 = r0.relationLabel
            java.lang.String r0 = r0.getUserId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008a
            android.app.Activity r0 = r10.f57849d
            com.ss.android.ugc.aweme.notification.bean.AtMe r1 = r10.l
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r1 = r1.relationLabel
            java.lang.String r1 = r1.getUserId()
            com.ss.android.ugc.aweme.notification.bean.AtMe r2 = r10.l
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.user
            java.lang.String r2 = r2.getSecUid()
            java.lang.String r3 = "like_banner"
            com.ss.android.ugc.aweme.profile.ui.UserProfileActivity.a((android.content.Context) r0, (java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3)
        L_0x008a:
            return
        L_0x008b:
            java.lang.String r0 = "click"
            java.lang.String r1 = "at"
            int r2 = r10.getAdapterPosition()
            android.view.View r3 = r10.m
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x009d
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            r10.a((java.lang.String) r0, (java.lang.String) r1, (int) r2, (boolean) r3)
            com.ss.android.ugc.aweme.ag.h r0 = com.ss.android.ugc.aweme.ag.h.a()
            android.app.Activity r1 = r10.f57849d
            com.ss.android.ugc.aweme.notification.bean.AtMe r2 = r10.l
            java.lang.String r2 = r2.schemaUrl
            com.ss.android.ugc.aweme.ag.j r2 = com.ss.android.ugc.aweme.ag.j.a(r2)
            java.lang.String r3 = "refer"
            java.lang.String r4 = "message"
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r2 = r2.a()
            r0.a((android.app.Activity) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.notification.bean.AtMe r0 = r10.l
            java.lang.String r7 = r0.schemaUrl
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f57848a
            r3 = 0
            r4 = 62885(0xf5a5, float:8.812E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x00f7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f57848a
            r3 = 0
            r4 = 62885(0xf5a5, float:8.812E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0113
        L_0x00f7:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x00fe
            goto L_0x0113
        L_0x00fe:
            java.lang.String r0 = "\\d+\\d$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r2 = r0.find()
            if (r2 == 0) goto L_0x0113
            java.lang.String r0 = r0.group()
            r1 = r0
        L_0x0113:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x014c
            com.ss.android.ugc.aweme.common.MobClick r0 = new com.ss.android.ugc.aweme.common.MobClick
            r0.<init>()
            java.lang.String r2 = "video_play"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r2)
            java.lang.String r2 = "message"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r2)
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
            com.ss.android.ugc.aweme.common.t r1 = new com.ss.android.ugc.aweme.common.t
            r1.<init>()
            java.lang.String r2 = "request_id"
            com.ss.android.ugc.aweme.notification.bean.AtMe r3 = r10.l
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            java.lang.String r3 = r3.getRequestId()
            com.ss.android.ugc.aweme.common.t r1 = r1.a(r2, r3)
            org.json.JSONObject r1 = r1.a()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x014c:
            return
        L_0x014d:
            android.app.Activity r0 = r10.f57849d
            com.ss.android.ugc.aweme.notification.bean.AtMe r1 = r10.l
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.user
            java.lang.String r1 = r1.getUid()
            com.ss.android.ugc.aweme.notification.bean.AtMe r2 = r10.l
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.user
            java.lang.String r2 = r2.getSecUid()
            java.lang.String r3 = "message"
            r10.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3)
            com.ss.android.ugc.aweme.notification.bean.AtMe r0 = r10.l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r0 = r0.getUid()
            java.lang.String r1 = "message_at"
            java.lang.String r2 = "click_head"
            r10.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.AtMeNotificationHolder.onClick(android.view.View):void");
    }

    public AtMeNotificationHolder(View view, Activity activity) {
        super(view);
        this.f57849d = activity;
        this.f57850e = (AvatarImageWithVerify) view.findViewById(C0906R.id.btc);
        this.f57851f = (RemoteRoundImageView) view.findViewById(C0906R.id.bth);
        this.g = (TextView) view.findViewById(C0906R.id.btd);
        this.h = (TextView) view.findViewById(C0906R.id.bta);
        this.i = (TextView) view.findViewById(C0906R.id.btf);
        this.k = (ConstraintLayout) view.findViewById(C0906R.id.bte);
        this.m = view.findViewById(C0906R.id.btg);
        this.j = (TextView) view.findViewById(C0906R.id.btb);
        this.n = (RelationLabelTextView) view.findViewById(C0906R.id.dhb);
        c.a(this.g);
        c.a(this.f57851f);
        c.a(this.f57850e);
        this.f57851f.setOnClickListener(this);
        this.f57850e.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.n.setOnClickListener(this);
    }

    public final void a(BaseNotice baseNotice, boolean z, String str) {
        BaseNotice baseNotice2 = baseNotice;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{baseNotice2, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f57848a, false, 62882, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2, Byte.valueOf(z), str}, this, f57848a, false, 62882, new Class[]{BaseNotice.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (baseNotice2 != null && baseNotice2.atMe != null) {
            super.a(baseNotice, z, str);
            a(z2);
            a("show", "at", getAdapterPosition(), !z2);
            this.l = baseNotice2.atMe;
            this.f57850e.setData(this.l.user);
            com.ss.android.ugc.aweme.base.c.b(this.f57851f, this.l.imageUrl);
            if (!TextUtils.isEmpty(this.l.user.getRemarkName())) {
                this.g.setText(this.l.user.getRemarkName());
            } else {
                this.g.setText(this.l.user.getNickname());
            }
            this.i.setText(eo.b(this.f57849d, baseNotice2.createTime * 1000));
            if (StringUtils.isEmpty(this.l.title)) {
                this.h.setVisibility(0);
                this.h.setText(this.l.content);
                this.j.setText(C0906R.string.auu);
            } else if (this.l.subType == 7 || this.l.subType == 8) {
                this.h.setVisibility(8);
                this.j.setText(this.l.title);
            } else {
                this.h.setVisibility(8);
                this.j.setText(C0906R.string.auv);
            }
            g.a(this.h);
            this.n.a(this.l.relationLabel);
            if (this.n.getVisibility() == 0) {
                this.g.setMaxEms(5);
            } else {
                this.g.setMaxEms(7);
            }
        }
    }
}
