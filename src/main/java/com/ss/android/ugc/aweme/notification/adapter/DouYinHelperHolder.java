package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.discover.hitrank.c;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.ss.android.ugc.aweme.utils.Cdo;
import java.net.URLDecoder;
import java.util.Map;

public class DouYinHelperHolder extends BaseNotificationHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57861a;

    /* renamed from: d  reason: collision with root package name */
    Activity f57862d;

    /* renamed from: e  reason: collision with root package name */
    private AvatarImageView f57863e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f57864f;
    private View g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private RemoteRoundImageView m;
    private Button n;
    private ConstraintLayout o;
    private View p;
    private String q;
    private boolean r;
    private User s;
    private String t;
    private String u;
    private String v;
    private int w;
    private String x;
    private BaseNotice y;

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x08ff, code lost:
        if (r0.subType == 4) goto L_0x0903;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.notification.bean.BaseNotice r20, boolean r21, java.lang.String r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r12 = 1
            r0[r12] = r1
            r13 = 2
            r0[r13] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r1 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62917(0xf5c5, float:8.8165E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r0[r12] = r1
            r0[r13] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62917(0xf5c5, float:8.8165E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r1 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005a:
            if (r8 != 0) goto L_0x005d
            return
        L_0x005d:
            r7.y = r8
            super.a((com.ss.android.ugc.aweme.notification.bean.BaseNotice) r20, (boolean) r21, (java.lang.String) r22)
            r0 = r21
            r7.a((boolean) r0)
            android.widget.TextView r0 = r7.l
            android.app.Activity r1 = r7.f57862d
            long r2 = r8.createTime
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.String r1 = com.ss.android.ugc.aweme.notification.d.b.a(r1, r2)
            r0.setText(r1)
            r0 = 0
            r7.t = r0
            com.ss.android.ugc.aweme.notification.bean.ChallengeNotice r0 = r8.challengeNotice
            r9 = 4
            r14 = 8
            if (r0 == 0) goto L_0x0154
            com.ss.android.ugc.aweme.notification.bean.ChallengeNotice r10 = r8.challengeNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62921(0xf5c9, float:8.8171E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.ChallengeNotice> r1 = com.ss.android.ugc.aweme.notification.bean.ChallengeNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b7
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62921(0xf5c9, float:8.8171E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.ChallengeNotice> r1 = com.ss.android.ugc.aweme.notification.bean.ChallengeNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x00b7:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r10.challenge
            if (r0 == 0) goto L_0x08eb
            r7.r = r11
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r10.challenge
            android.widget.TextView r1 = r7.h
            r1.setVisibility(r11)
            android.widget.TextView r1 = r7.i
            r1.setVisibility(r11)
            android.widget.TextView r1 = r7.j
            r1.setVisibility(r11)
            android.widget.ImageView r1 = r7.f57864f
            r1.setVisibility(r14)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r1 = r7.m
            r1.setVisibility(r9)
            android.widget.Button r1 = r7.n
            r1.setVisibility(r11)
            android.widget.TextView r1 = r7.k
            r1.setVisibility(r14)
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getAuthor()
            if (r1 == 0) goto L_0x00fa
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r7.f57863e
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r1.getAvatarThumb()
            com.ss.android.ugc.aweme.base.c.b(r2, r3)
            android.widget.TextView r2 = r7.h
            java.lang.String r1 = r1.getNickname()
            r2.setText(r1)
        L_0x00fa:
            android.widget.TextView r1 = r7.j
            java.lang.String r2 = r0.getChallengeName()
            r1.setText(r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getAuthor()
            r7.s = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "aweme://challenge/detail/"
            r1.<init>(r2)
            java.lang.String r2 = r0.getCid()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.ugc.aweme.ag.j r1 = com.ss.android.ugc.aweme.ag.j.a(r1)
            java.lang.String r2 = "is_commerce"
            boolean r3 = com.ss.android.ugc.aweme.commercialize.utils.r.b((com.ss.android.ugc.aweme.discover.model.Challenge) r0)
            if (r3 == 0) goto L_0x012a
            java.lang.String r3 = "1"
            goto L_0x012c
        L_0x012a:
            java.lang.String r3 = "0"
        L_0x012c:
            com.ss.android.ugc.aweme.ag.j r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r1 = r1.a()
            r7.q = r1
            java.lang.String r1 = "peer"
            r7.t = r1
            java.lang.String r0 = r0.getCid()
            r7.u = r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.s
            if (r0 != 0) goto L_0x0147
            java.lang.String r0 = ""
            goto L_0x014d
        L_0x0147:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.s
            java.lang.String r0 = r0.getUid()
        L_0x014d:
            r7.v = r0
            r19.d()
            goto L_0x08eb
        L_0x0154:
            com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice r0 = r8.announcement
            r15 = 2131560568(0x7f0d0878, float:1.8746512E38)
            if (r0 == 0) goto L_0x01f8
            com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice r0 = r8.announcement
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.challenge
            if (r0 == 0) goto L_0x01f8
            com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice r10 = r8.announcement
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62923(0xf5cb, float:8.8174E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice> r1 = com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0196
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62923(0xf5cb, float:8.8174E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice> r1 = com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x0196:
            r7.r = r12
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r10.challenge
            android.widget.TextView r1 = r7.h
            r1.setVisibility(r14)
            android.widget.TextView r1 = r7.i
            r1.setVisibility(r14)
            android.widget.TextView r1 = r7.j
            r1.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r1 = r7.m
            r1.setVisibility(r9)
            android.widget.Button r1 = r7.n
            r1.setVisibility(r11)
            android.widget.TextView r1 = r7.k
            r1.setVisibility(r11)
            android.widget.Button r1 = r7.n
            r1.setText(r15)
            r19.e()
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getAuthor()
            r7.s = r1
            android.widget.TextView r1 = r7.j
            java.lang.String r2 = r0.getChallengeName()
            r1.setText(r2)
            android.widget.TextView r1 = r7.k
            java.lang.String r2 = r10.content
            r1.setText(r2)
            java.lang.String r1 = r10.schemaUrl
            r7.q = r1
            java.lang.String r1 = "official"
            r7.t = r1
            java.lang.String r0 = r0.getCid()
            r7.u = r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.s
            if (r0 != 0) goto L_0x01eb
            java.lang.String r0 = ""
            goto L_0x01f1
        L_0x01eb:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.s
            java.lang.String r0 = r0.getUid()
        L_0x01f1:
            r7.v = r0
            r19.d()
            goto L_0x08eb
        L_0x01f8:
            com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice r0 = r8.announcement
            r6 = 2131560724(0x7f0d0914, float:1.8746828E38)
            r5 = 2131560772(0x7f0d0944, float:1.8746926E38)
            if (r0 == 0) goto L_0x032b
            com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice r4 = r8.announcement
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r16 = 62922(0xf5ca, float:8.8173E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice> r17 = com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice.class
            r1[r11] = r17
            java.lang.Class r17 = java.lang.Void.TYPE
            r18 = r1
            r1 = r19
            r13 = r4
            r4 = r16
            r5 = r18
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0240
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62922(0xf5ca, float:8.8173E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice> r1 = com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x0240:
            r7.r = r12
            com.ss.android.ugc.aweme.notification.bean.Search r0 = r13.search
            android.widget.TextView r1 = r7.i
            r1.setVisibility(r14)
            int r1 = r13.type
            if (r1 != r12) goto L_0x025f
            android.widget.TextView r1 = r7.h
            r1.setVisibility(r14)
            android.widget.TextView r1 = r7.j
            java.lang.String r2 = r13.title
            r1.setText(r2)
            android.widget.TextView r1 = r7.j
            r1.setVisibility(r11)
            goto L_0x0270
        L_0x025f:
            android.widget.TextView r1 = r7.h
            java.lang.String r2 = r13.title
            r1.setText(r2)
            android.widget.TextView r1 = r7.h
            r1.setVisibility(r11)
            android.widget.TextView r1 = r7.j
            r1.setVisibility(r14)
        L_0x0270:
            android.widget.TextView r1 = r7.k
            r1.setVisibility(r11)
            r19.e()
            android.widget.TextView r1 = r7.k
            java.lang.String r2 = r13.content
            r1.setText(r2)
            if (r0 != 0) goto L_0x0286
            java.lang.String r0 = r13.schemaUrl
            r7.q = r0
            goto L_0x02b1
        L_0x0286:
            java.lang.String r1 = "aweme://search"
            com.ss.android.ugc.aweme.ag.j r1 = com.ss.android.ugc.aweme.ag.j.a(r1)
            java.lang.String r2 = "keyword"
            java.lang.String r3 = r0.keyword
            com.ss.android.ugc.aweme.ag.j r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "displayKeyword"
            java.lang.String r0 = r0.displayKeyword
            com.ss.android.ugc.aweme.ag.j r0 = r1.a((java.lang.String) r2, (java.lang.String) r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "douyin_assistant"
            com.ss.android.ugc.aweme.ag.j r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "search_from"
            r2 = 6
            com.ss.android.ugc.aweme.ag.j r0 = r0.a((java.lang.String) r1, (int) r2)
            java.lang.String r0 = r0.a()
            r7.q = r0
        L_0x02b1:
            int r0 = r13.type
            if (r0 == r10) goto L_0x02cd
            int r0 = r13.type
            if (r0 != r9) goto L_0x02ba
            goto L_0x02cd
        L_0x02ba:
            int r0 = r13.type
            if (r0 != r12) goto L_0x02c4
            android.widget.Button r0 = r7.n
            r0.setText(r15)
            goto L_0x02d5
        L_0x02c4:
            android.widget.Button r0 = r7.n
            r10 = 2131560772(0x7f0d0944, float:1.8746926E38)
            r0.setText(r10)
            goto L_0x02d5
        L_0x02cd:
            android.widget.Button r0 = r7.n
            r6 = 2131560724(0x7f0d0914, float:1.8746828E38)
            r0.setText(r6)
        L_0x02d5:
            java.lang.String r0 = r7.q
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02f7
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r9)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r11)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r11)
            goto L_0x0326
        L_0x02f7:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r13.imageUrl
            if (r0 == 0) goto L_0x030d
            android.widget.Button r0 = r7.n
            r0.setVisibility(r9)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r13.imageUrl
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            goto L_0x0317
        L_0x030d:
            android.widget.Button r0 = r7.n
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r9)
        L_0x0317:
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r12)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r12)
        L_0x0326:
            r19.d()
            goto L_0x08eb
        L_0x032b:
            r10 = 2131560772(0x7f0d0944, float:1.8746926E38)
            com.ss.android.ugc.aweme.notification.bean.UserTextNotice r0 = r8.textNotice
            if (r0 == 0) goto L_0x047d
            com.ss.android.ugc.aweme.notification.bean.UserTextNotice r13 = r8.textNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62919(0xf5c7, float:8.8168E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.UserTextNotice> r1 = com.ss.android.ugc.aweme.notification.bean.UserTextNotice.class
            r5[r11] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r1 = r19
            r9 = 2131560724(0x7f0d0914, float:1.8746828E38)
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x036c
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62919(0xf5c7, float:8.8168E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.UserTextNotice> r1 = com.ss.android.ugc.aweme.notification.bean.UserTextNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x036c:
            r7.r = r12
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r14)
            int r0 = r13.subType
            r1 = 21
            if (r0 != r1) goto L_0x038b
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            java.lang.String r2 = r13.title
            r0.setText(r2)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r11)
            goto L_0x039c
        L_0x038b:
            android.widget.TextView r0 = r7.h
            java.lang.String r2 = r13.title
            r0.setText(r2)
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
        L_0x039c:
            android.widget.TextView r0 = r7.k
            r0.setVisibility(r11)
            r19.e()
            android.widget.TextView r0 = r7.k
            java.lang.String r2 = r13.content
            r0.setText(r2)
            java.lang.String r0 = r13.schemaUrl
            r7.q = r0
            java.lang.String r0 = r7.q
            java.lang.String r2 = "http"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x03cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "aweme://webview/?url="
            r0.<init>(r2)
            java.lang.String r2 = r7.q
            java.lang.String r2 = android.net.Uri.encode(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r7.q = r0
        L_0x03cf:
            java.lang.String r0 = r7.q
            boolean r0 = r7.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x03e0
            android.widget.Button r0 = r7.n
            r1 = 2131560727(0x7f0d0917, float:1.8746834E38)
            r0.setText(r1)
            goto L_0x0413
        L_0x03e0:
            java.lang.String r0 = r7.q
            boolean r0 = com.ss.android.ugc.aweme.discover.hitrank.c.c(r0)
            if (r0 == 0) goto L_0x03f1
            android.widget.Button r0 = r7.n
            r1 = 2131560224(0x7f0d0720, float:1.8745814E38)
            r0.setText(r1)
            goto L_0x0413
        L_0x03f1:
            int r0 = r13.subType
            r2 = 22
            if (r0 == r2) goto L_0x040e
            int r0 = r13.subType
            r2 = 23
            if (r0 != r2) goto L_0x03fe
            goto L_0x040e
        L_0x03fe:
            int r0 = r13.subType
            if (r0 != r1) goto L_0x0408
            android.widget.Button r0 = r7.n
            r0.setText(r15)
            goto L_0x0413
        L_0x0408:
            android.widget.Button r0 = r7.n
            r0.setText(r10)
            goto L_0x0413
        L_0x040e:
            android.widget.Button r0 = r7.n
            r0.setText(r9)
        L_0x0413:
            java.lang.String r0 = r13.title
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0425
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
        L_0x0425:
            java.lang.String r0 = r7.q
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0448
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r1 = 4
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r11)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r11)
            goto L_0x0478
        L_0x0448:
            r1 = 4
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r13.imageUrl
            if (r0 == 0) goto L_0x045f
            android.widget.Button r0 = r7.n
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r13.imageUrl
            com.ss.android.ugc.aweme.base.c.b(r0, r2)
            goto L_0x0469
        L_0x045f:
            android.widget.Button r0 = r7.n
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r1)
        L_0x0469:
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r12)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r12)
        L_0x0478:
            r19.d()
            goto L_0x08eb
        L_0x047d:
            com.ss.android.ugc.aweme.notification.bean.h r0 = r8.shopNotice
            if (r0 == 0) goto L_0x0551
            com.ss.android.ugc.aweme.notification.bean.h r9 = r8.shopNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62926(0xf5ce, float:8.8178E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.h> r1 = com.ss.android.ugc.aweme.notification.bean.h.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04b6
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62926(0xf5ce, float:8.8178E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.h> r1 = com.ss.android.ugc.aweme.notification.bean.h.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x04b6:
            r7.r = r12
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.k
            r0.setVisibility(r11)
            r19.e()
            android.widget.TextView r0 = r7.h
            java.lang.String r1 = r9.f58012b
            r0.setText(r1)
            android.widget.TextView r0 = r7.k
            java.lang.String r1 = r9.f58011a
            r0.setText(r1)
            java.lang.String r0 = r9.f58013c
            r7.q = r0
            java.lang.String r0 = r7.q
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x04fd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://webview/?url="
            r0.<init>(r1)
            java.lang.String r1 = r7.q
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.q = r0
        L_0x04fd:
            android.widget.Button r0 = r7.n
            r0.setText(r10)
            java.lang.String r0 = r9.f58012b
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x050f
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r14)
        L_0x050f:
            java.lang.String r0 = r7.q
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0532
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r1 = 4
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r11)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r11)
            goto L_0x054c
        L_0x0532:
            r1 = 4
            android.widget.Button r0 = r7.n
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r12)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r12)
        L_0x054c:
            r19.d()
            goto L_0x08eb
        L_0x0551:
            com.ss.android.ugc.aweme.notification.bean.g r0 = r8.lubanNotice
            if (r0 == 0) goto L_0x0625
            com.ss.android.ugc.aweme.notification.bean.g r9 = r8.lubanNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62927(0xf5cf, float:8.818E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.g> r1 = com.ss.android.ugc.aweme.notification.bean.g.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x058a
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62927(0xf5cf, float:8.818E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.g> r1 = com.ss.android.ugc.aweme.notification.bean.g.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x058a:
            r7.r = r12
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.k
            r0.setVisibility(r11)
            r19.e()
            android.widget.TextView r0 = r7.h
            java.lang.String r1 = r9.f58009b
            r0.setText(r1)
            android.widget.TextView r0 = r7.k
            java.lang.String r1 = r9.f58008a
            r0.setText(r1)
            java.lang.String r0 = r9.f58010c
            r7.q = r0
            java.lang.String r0 = r7.q
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x05d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://webview/?url="
            r0.<init>(r1)
            java.lang.String r1 = r7.q
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.q = r0
        L_0x05d1:
            android.widget.Button r0 = r7.n
            r0.setText(r10)
            java.lang.String r0 = r9.f58009b
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x05e3
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r14)
        L_0x05e3:
            java.lang.String r0 = r7.q
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0606
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r1 = 4
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r11)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r11)
            goto L_0x0620
        L_0x0606:
            r1 = 4
            android.widget.Button r0 = r7.n
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r12)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r12)
        L_0x0620:
            r19.d()
            goto L_0x08eb
        L_0x0625:
            com.ss.android.ugc.aweme.notification.bean.i r0 = r8.starAtlasNotice
            if (r0 == 0) goto L_0x06f9
            com.ss.android.ugc.aweme.notification.bean.i r9 = r8.starAtlasNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62928(0xf5d0, float:8.8181E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.i> r1 = com.ss.android.ugc.aweme.notification.bean.i.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x065e
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62928(0xf5d0, float:8.8181E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.i> r1 = com.ss.android.ugc.aweme.notification.bean.i.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x065e:
            r7.r = r12
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.k
            r0.setVisibility(r11)
            r19.e()
            android.widget.TextView r0 = r7.h
            java.lang.String r1 = r9.f58015b
            r0.setText(r1)
            android.widget.TextView r0 = r7.k
            java.lang.String r1 = r9.f58014a
            r0.setText(r1)
            java.lang.String r0 = r9.f58016c
            r7.q = r0
            java.lang.String r0 = r7.q
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x06a5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://webview/?url="
            r0.<init>(r1)
            java.lang.String r1 = r7.q
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.q = r0
        L_0x06a5:
            android.widget.Button r0 = r7.n
            r0.setText(r10)
            java.lang.String r0 = r9.f58015b
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x06b7
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r14)
        L_0x06b7:
            java.lang.String r0 = r7.q
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x06da
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r1 = 4
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r11)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r11)
            goto L_0x06f4
        L_0x06da:
            r1 = 4
            android.widget.Button r0 = r7.n
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r12)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r12)
        L_0x06f4:
            r19.d()
            goto L_0x08eb
        L_0x06f9:
            com.ss.android.ugc.aweme.notification.bean.f r0 = r8.liveAssistantNotice
            if (r0 == 0) goto L_0x07ba
            com.ss.android.ugc.aweme.notification.bean.f r9 = r8.liveAssistantNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62924(0xf5cc, float:8.8175E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.f> r1 = com.ss.android.ugc.aweme.notification.bean.f.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0732
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62924(0xf5cc, float:8.8175E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.f> r1 = com.ss.android.ugc.aweme.notification.bean.f.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x0732:
            r7.r = r12
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.k
            r0.setVisibility(r11)
            r19.e()
            android.widget.TextView r0 = r7.h
            java.lang.String r1 = r9.f58005b
            r0.setText(r1)
            android.widget.TextView r0 = r7.k
            java.lang.String r1 = r9.f58004a
            r0.setText(r1)
            java.lang.String r0 = r9.f58006c
            r7.q = r0
            android.widget.Button r0 = r7.n
            r0.setText(r10)
            java.lang.String r0 = r7.q
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0785
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r1 = 4
            r0.setVisibility(r1)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r11)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r11)
            goto L_0x07b5
        L_0x0785:
            r1 = 4
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r9.f58007d
            if (r0 == 0) goto L_0x079c
            android.widget.Button r0 = r7.n
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r9.f58007d
            com.ss.android.ugc.aweme.base.c.b(r0, r2)
            goto L_0x07a6
        L_0x079c:
            android.widget.Button r0 = r7.n
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r0.setVisibility(r1)
        L_0x07a6:
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r12)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r12)
        L_0x07b5:
            r19.d()
            goto L_0x08eb
        L_0x07ba:
            com.ss.android.ugc.aweme.notification.bean.WalletNotice r0 = r8.walletNotice
            if (r0 == 0) goto L_0x0829
            com.ss.android.ugc.aweme.notification.bean.WalletNotice r9 = r8.walletNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62925(0xf5cd, float:8.8177E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.WalletNotice> r1 = com.ss.android.ugc.aweme.notification.bean.WalletNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x07f3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62925(0xf5cd, float:8.8177E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.WalletNotice> r1 = com.ss.android.ugc.aweme.notification.bean.WalletNotice.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x07f3:
            r7.r = r12
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.k
            r0.setVisibility(r11)
            r19.e()
            android.widget.TextView r0 = r7.h
            java.lang.String r1 = r9.title
            r0.setText(r1)
            android.widget.TextView r0 = r7.k
            java.lang.String r1 = r9.content
            r0.setText(r1)
            android.widget.Button r0 = r7.n
            r0.setText(r10)
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            r19.d()
            goto L_0x08eb
        L_0x0829:
            com.ss.android.ugc.aweme.notification.bean.e r0 = r8.linkProfitNotice
            if (r0 == 0) goto L_0x08eb
            com.ss.android.ugc.aweme.notification.bean.e r9 = r8.linkProfitNotice
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62929(0xf5d1, float:8.8182E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.e> r1 = com.ss.android.ugc.aweme.notification.bean.e.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0862
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57861a
            r3 = 0
            r4 = 62929(0xf5d1, float:8.8182E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.e> r1 = com.ss.android.ugc.aweme.notification.bean.e.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x0862:
            r7.r = r12
            r19.e()
            android.widget.TextView r0 = r7.h
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.h
            java.lang.String r1 = r9.f58001b
            r0.setText(r1)
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.j
            r0.setVisibility(r14)
            android.widget.TextView r0 = r7.k
            r0.setVisibility(r11)
            android.widget.TextView r0 = r7.k
            java.lang.String r1 = r9.f58002c
            r0.setText(r1)
            android.widget.Button r0 = r7.n
            r1 = 2131560442(0x7f0d07fa, float:1.8746256E38)
            r0.setText(r1)
            java.lang.String r0 = r9.f58003d
            r7.q = r0
            java.lang.String r0 = r7.q
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x08b1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://webview/?url="
            r0.<init>(r1)
            java.lang.String r1 = r7.q
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.q = r0
        L_0x08b1:
            java.lang.String r0 = r7.q
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x08ce
            android.widget.Button r0 = r7.n
            r0.setVisibility(r14)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r11)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r11)
            goto L_0x08e2
        L_0x08ce:
            android.widget.Button r0 = r7.n
            r0.setVisibility(r11)
            android.support.constraint.ConstraintLayout r0 = r7.o
            r0.setEnabled(r12)
            android.widget.TextView r0 = r7.h
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f57863e
            r0.setEnabled(r12)
        L_0x08e2:
            com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView r0 = r7.m
            r1 = 4
            r0.setVisibility(r1)
            r19.d()
        L_0x08eb:
            com.ss.android.ugc.aweme.notification.bean.BaseNotice r0 = r7.y
            if (r0 == 0) goto L_0x0902
            com.ss.android.ugc.aweme.notification.bean.BaseNotice r0 = r7.y
            int r0 = r0.type
            r1 = 2
            if (r0 != r1) goto L_0x0902
            com.ss.android.ugc.aweme.notification.bean.BaseNotice r0 = r7.y
            com.ss.android.ugc.aweme.notification.bean.UserTextNotice r0 = r0.textNotice
            if (r0 == 0) goto L_0x0902
            int r0 = r0.subType
            r1 = 4
            if (r0 != r1) goto L_0x0902
            goto L_0x0903
        L_0x0902:
            r12 = 0
        L_0x0903:
            if (r12 == 0) goto L_0x0918
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "toutiao_message_show"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "message_add"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x0918:
            java.lang.String r0 = "show"
            r7.a((com.ss.android.ugc.aweme.notification.bean.BaseNotice) r8, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder.a(com.ss.android.ugc.aweme.notification.bean.BaseNotice, boolean, java.lang.String):void");
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57861a, false, 62918, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57861a, false, 62918, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.g.setVisibility(8);
            Cdo.a(this.o);
            return;
        }
        this.g.setVisibility(0);
        Cdo.a(this.o, 2130841684, C0906R.color.aj4);
    }

    private String f() {
        if (this.w == 5) {
            return "official_info";
        }
        if (this.w == 9) {
            return "subscribe_account";
        }
        if (this.w == 4) {
            return "douyin_assistant";
        }
        if (this.w == 16) {
            return "starmap_assisstant";
        }
        if (this.w == 17) {
            return "live_assistant";
        }
        if (this.w == 10) {
            return "official_info";
        }
        if (this.w == 19) {
            return "link_assistant";
        }
        return "";
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57861a, false, 62920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57861a, false, 62920, new Class[0], Void.TYPE);
        } else if ((this.m.getVisibility() == 0 || this.n.getVisibility() == 0) && this.w != 18) {
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57861a, false, 62912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57861a, false, 62912, new Class[0], Void.TYPE);
            return;
        }
        Uri parse = Uri.parse(this.q);
        String host = parse.getHost();
        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        if (TextUtils.equals(f.f34167a, host)) {
            if (!TextUtils.isEmpty(parse.getQueryParameter("rn_schema"))) {
                h.a().a(this.f57862d, com.ss.android.ugc.aweme.music.util.f.a(this.q.replace(e.a(), "aweme")).a().toString());
            } else {
                Intent a2 = f.f34171e.a((Context) this.f57862d, Uri.parse(this.q));
                if (a2 != null) {
                    a2.putExtra("hide_more", false);
                    a2.putExtra("enter_from", "notification");
                    a(a2);
                    this.f57862d.startActivity(a2);
                }
            }
        } else if (a(this.q)) {
            Intent intent = new Intent();
            intent.putExtra("shoot_way", "direct_shoot");
            intent.putExtra("to_live", true);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(this.f57862d, intent, true, true, ((IAVService) ServiceManager.get().getService(IAVService.class)).isRecording());
        } else if (c.c(this.q)) {
            h.a().a(c.a("notice", parse.getQueryParameter("star_uid"), parse.getQueryParameter("sec_star_uid")));
        } else if (iMiniAppService.isAppBrandSchema(this.q)) {
            iMiniAppService.openMiniApp(this.f57862d, this.q, new b.a().b("notification").a());
        } else if (com.ss.android.newmedia.a.b.b(parse.getScheme())) {
            com.ss.android.newmedia.e.b(this.f57862d, this.q);
        } else if (b(this.q)) {
            com.ss.android.newmedia.e.b(this.f57862d, this.q.replace("aweme://stickers/detail/", "sslocal://stickers/detail/"));
        } else {
            h.a().a(this.f57862d, j.a(this.q).a("refer", "message").a("account_type", f()).a());
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57861a, false, 62930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57861a, false, 62930, new Class[0], Void.TYPE);
            return;
        }
        switch (this.w) {
            case 4:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840503);
                this.f57864f.setVisibility(8);
                return;
            case 5:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840507);
                this.f57864f.setVisibility(0);
                return;
            case 6:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840504);
                this.f57864f.setVisibility(0);
                return;
            case 9:
                com.ss.android.ugc.aweme.base.c.b(this.f57863e, this.y.getAvatarUrl());
                this.f57864f.setVisibility(8);
                return;
            case 10:
                switch (this.y.type) {
                    case 2:
                    case 5:
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840507);
                        this.f57864f.setVisibility(0);
                        return;
                    case 4:
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840504);
                        this.f57864f.setVisibility(0);
                        return;
                    case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                        com.ss.android.ugc.aweme.base.c.b(this.f57863e, this.y.getAvatarUrl());
                        this.f57864f.setVisibility(8);
                        return;
                    case 8:
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840505);
                        this.f57864f.setVisibility(0);
                        return;
                    case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f69366e /*?: ONE_ARG  (30 int)*/:
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840501);
                        this.f57864f.setVisibility(0);
                        return;
                    default:
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840503);
                        this.f57864f.setVisibility(0);
                        return;
                }
            case 15:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840501);
                this.f57864f.setVisibility(0);
                return;
            case SearchJediMixFeedAdapter.f42514c:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840505);
                this.f57864f.setVisibility(0);
                return;
            case 17:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130839008);
                this.f57864f.setVisibility(0);
                return;
            case 18:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130839021);
                this.f57864f.setVisibility(0);
                return;
            case 19:
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57863e, 2130840500);
                this.f57864f.setVisibility(0);
                break;
        }
    }

    private void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f57861a, false, 62937, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f57861a, false, 62937, new Class[]{Intent.class}, Void.TYPE);
        } else if (this.y != null) {
            UserTextNotice userTextNotice = this.y.textNotice;
            if (userTextNotice != null) {
                int i2 = userTextNotice.subType;
                if (i2 >= 10000 && i2 <= 10005) {
                    intent.putExtra("hide_more", true);
                    intent.putExtra(PushConstants.TITLE, userTextNotice.title);
                    intent.putExtra("bundle_user_webview_title", false);
                }
            }
        }
    }

    private boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f57861a, false, 62914, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f57861a, false, 62914, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || !str2.startsWith("aweme://stickers/detail/")) {
            return false;
        } else {
            return true;
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57861a, false, 62911, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57861a, false, 62911, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!b()) {
            if (this.w != 18 || this.y == null || this.y.walletNotice == null) {
                a(this.y, "click");
                super.onClick(view);
                int id = view.getId();
                if (id == C0906R.id.bs8 || id == C0906R.id.bsa) {
                    if (this.r) {
                        c();
                    } else if (this.s != null) {
                        h a2 = h.a();
                        Activity activity = this.f57862d;
                        a2.a(activity, j.a("aweme://user/profile/" + this.s.getUid()).a("sec_user_id", this.s.getSecUid()).a());
                    }
                } else if (id == C0906R.id.bsc || id == C0906R.id.bs9) {
                    if (this.y != null && this.y.type == 2) {
                        final UserTextNotice userTextNotice = this.y.textNotice;
                        if (userTextNotice != null && userTextNotice.subType == 4) {
                            r.onEvent(MobClick.obtain().setEventName("toutiao_message_click").setLabelName("message_add"));
                            if (PatchProxy.isSupport(new Object[]{userTextNotice}, this, f57861a, false, 62915, new Class[]{UserTextNotice.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{userTextNotice}, this, f57861a, false, 62915, new Class[]{UserTextNotice.class}, Void.TYPE);
                                return;
                            }
                            a.a(this.f57862d).setMessage((CharSequence) this.f57862d.getString(C0906R.string.b13, new Object[]{this.f57862d.getString(C0906R.string.b3v)})).setPositiveButton((int) C0906R.string.b12, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f57866a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    String str;
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57866a, false, 62938, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57866a, false, 62938, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    DouYinHelperHolder douYinHelperHolder = DouYinHelperHolder.this;
                                    UserTextNotice userTextNotice = userTextNotice;
                                    if (PatchProxy.isSupport(new Object[]{userTextNotice}, douYinHelperHolder, DouYinHelperHolder.f57861a, false, 62916, new Class[]{UserTextNotice.class}, Void.TYPE)) {
                                        Object[] objArr = {userTextNotice};
                                        ChangeQuickRedirect changeQuickRedirect = DouYinHelperHolder.f57861a;
                                        PatchProxy.accessDispatch(objArr, douYinHelperHolder, changeQuickRedirect, false, 62916, new Class[]{UserTextNotice.class}, Void.TYPE);
                                        return;
                                    }
                                    String str2 = userTextNotice.schemaUrl;
                                    if (!TextUtils.isEmpty(str2)) {
                                        Uri parse = Uri.parse(str2);
                                        try {
                                            str = URLDecoder.decode(parse.getQueryParameter("android_pkg_name"), "UTF-8");
                                        } catch (Exception unused) {
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(parse.getScheme().toLowerCase())) {
                                            try {
                                                AwemeSSOPlatformUtils.a(douYinHelperHolder.f57862d, str, d.a().getCurUserId());
                                                r.onEvent(MobClick.obtain().setEventName("app_awake_from_fans_power").setLabelName("message_add"));
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    }
                                }
                            }).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                }
                            }).setCancelable(false).show();
                            return;
                        }
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f57861a, false, 62931, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57861a, false, 62931, new Class[0], Void.TYPE);
                    } else if (this.y != null) {
                        UserTextNotice userTextNotice2 = this.y.textNotice;
                        AnnouncementNotice announcementNotice = this.y.announcement;
                        int i2 = this.y.type;
                        String str = "";
                        if (i2 == 1 || i2 == 12) {
                            str = "douyin_assistant";
                        } else if (i2 == 2 || i2 == 11) {
                            str = "official_info";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            if (userTextNotice2 != null) {
                                String str2 = userTextNotice2.objectId;
                                int i3 = userTextNotice2.subType;
                                if (i3 == 22) {
                                    b(str2, str);
                                } else if (i3 == 23) {
                                    a(str2, str);
                                } else if (i3 == 21) {
                                    c(str2, str);
                                }
                            } else if (announcementNotice != null) {
                                String str3 = announcementNotice.objectId;
                                int i4 = announcementNotice.type;
                                if (i4 == 3) {
                                    b(str3, str);
                                } else if (i4 == 4) {
                                    a(str3, str);
                                } else if (i4 == 1) {
                                    c(str3, str);
                                }
                            }
                        }
                    }
                    c();
                    if (!TextUtils.isEmpty(this.t)) {
                        t tVar = new t();
                        tVar.a("user_type", this.t);
                        r.onEvent(new MobClick().setEventName("challenge_click").setLabelName("message_add").setValue(this.v).setExtValueString(this.u).setJsonObject(tVar.a()));
                    }
                }
            }
        }
    }

    private boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f57861a, false, 62913, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f57861a, false, 62913, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || !str2.startsWith("aweme://videoRecord/live")) {
            return false;
        } else {
            return true;
        }
    }

    private void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f57861a, false, 62933, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f57861a, false, 62933, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("enter_music_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("previous_page", "message").a("account_type", str4).a("music_id", str3).f34114b);
    }

    private void c(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f57861a, false, 62934, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f57861a, false, 62934, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.f.b(str4, str3);
    }

    private void a(BaseNotice baseNotice, String str) {
        if (PatchProxy.isSupport(new Object[]{baseNotice, str}, this, f57861a, false, 62935, new Class[]{BaseNotice.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice, str}, this, f57861a, false, 62935, new Class[]{BaseNotice.class, String.class}, Void.TYPE);
            return;
        }
        if (baseNotice != null && baseNotice.type == 2) {
            UserTextNotice userTextNotice = baseNotice.textNotice;
            if (userTextNotice != null && a(userTextNotice, str)) {
                return;
            }
        }
        long taskId = baseNotice.getTaskId();
        String f2 = f();
        if (!TextUtils.isEmpty(f2)) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", str).a("account_type", f2).a("content_id", baseNotice.nid);
            if (this.w == 17) {
                a2.a("scene_id", 1006);
                a2.a("client_order", getAdapterPosition());
            }
            a2.a(PushConstants.TASK_ID, taskId);
            r.a("official_message_inner_message", (Map) a2.f34114b);
        }
    }

    private void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f57861a, false, 62932, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f57861a, false, 62932, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("enter_prop_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("previous_page", "message").a("account_type", str4).a("prop_id", str3).f34114b);
    }

    private boolean a(UserTextNotice userTextNotice, String str) {
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{userTextNotice, str}, this, f57861a, false, 62936, new Class[]{UserTextNotice.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{userTextNotice, str}, this, f57861a, false, 62936, new Class[]{UserTextNotice.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        int i2 = userTextNotice.subType;
        if (i2 < 10000 || i2 > 10005) {
            return false;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.x).a("action_type", str).a("account_type", f());
        if (this.y != null) {
            str2 = this.y.nid;
        } else {
            str2 = "";
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("content_id", str2);
        if (i2 < 10002 || i2 == 10005) {
            str3 = "reserve";
        } else {
            str3 = "queue";
        }
        com.ss.android.ugc.aweme.app.d.d a4 = a3.a("content_type", str3);
        if (i2 == 10000 || i2 == 10002) {
            str4 = "success";
        } else if (i2 == 10004 || i2 == 10005) {
            str4 = "wait";
        } else {
            str4 = "fail";
        }
        r.a("official_message_inner_message", (Map) a4.a("order_status", str4).a("inner_message_type", "poi_puscene").f34114b);
        return true;
    }

    public DouYinHelperHolder(View view, Activity activity, int i2, String str) {
        super(view);
        this.f57862d = activity;
        this.w = i2;
        this.x = str;
        this.f57863e = (AvatarImageView) view.findViewById(C0906R.id.bs8);
        this.f57864f = (ImageView) view.findViewById(C0906R.id.bsb);
        this.g = view.findViewById(C0906R.id.bse);
        this.h = (TextView) view.findViewById(C0906R.id.bsa);
        this.i = (TextView) view.findViewById(C0906R.id.bs7);
        this.j = (TextView) view.findViewById(C0906R.id.bs5);
        this.k = (TextView) view.findViewById(C0906R.id.bs6);
        this.l = (TextView) view.findViewById(C0906R.id.bsd);
        this.m = (RemoteRoundImageView) view.findViewById(C0906R.id.bsf);
        this.n = (Button) view.findViewById(C0906R.id.bs9);
        this.o = (ConstraintLayout) view.findViewById(C0906R.id.bsc);
        this.p = view.findViewById(C0906R.id.bs_);
        com.ss.android.ugc.aweme.notification.d.c.a(this.h);
        if (this.w != 18) {
            com.ss.android.ugc.aweme.notification.d.c.a(this.n);
        }
        this.f57863e.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.o.setOnClickListener(this);
        if (this.w != 18) {
            this.n.setOnClickListener(this);
        } else {
            this.p.setVisibility(8);
        }
    }
}
