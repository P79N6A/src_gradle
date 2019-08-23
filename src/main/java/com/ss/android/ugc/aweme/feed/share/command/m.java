package com.ss.android.ugc.aweme.feed.share.command;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AdsAppActivity;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.share.a.c;
import com.ss.android.ugc.aweme.share.a.d;

public final class m extends Dialog implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46010a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakHandler f46011b;

    /* renamed from: c  reason: collision with root package name */
    protected User f46012c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteImageView f46013d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f46014e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f46015f;
    private TextView g;
    private TextView h;
    private ImageView i;
    private d j;
    private TextView k;
    private boolean l;
    private boolean m;
    private String n;
    private Context o;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46010a, false, 42259, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46010a, false, 42259, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent(getContext(), AdsAppActivity.class);
        intent.setData(Uri.parse(this.j.getSchema() + "?from_uid=" + this.j.getShareUserId()));
        intent.putExtra("from_token", this.n);
        intent.putExtra("token_request_id", this.j.getRid());
        getContext().startActivity(intent);
    }

    public final void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f46010a, false, 42260, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f46010a, false, 42260, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2 != null && (message2.obj instanceof User)) {
            this.f46012c = (User) message2.obj;
        }
        super.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        if (r0.exitUser(r9.j.getShareUserId()) == false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.share.a.d r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42255(0xa50f, float:5.9212E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            r3 = 0
            r4 = 42255(0xa50f, float:5.9212E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r9.j = r10
            java.lang.String r0 = "token"
            java.lang.String r1 = r9.n
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.ab()
            r9.l = r0
            goto L_0x005d
        L_0x0049:
            java.lang.String r0 = "pic"
            java.lang.String r1 = r9.n
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.ac()
            r9.l = r0
        L_0x005d:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            r3 = 0
            r4 = 42261(0xa515, float:5.922E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0088
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            r3 = 0
            r4 = 42261(0xa515, float:5.922E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            goto L_0x00a4
        L_0x0088:
            com.ss.android.ugc.aweme.share.a.d r0 = r9.j
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r9.l
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.b.a()
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.share.a.d r1 = r9.j
            java.lang.String r1 = r1.getShareUserId()
            boolean r0 = r0.exitUser(r1)
            if (r0 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            r9.m = r7
            boolean r0 = r9.m
            if (r0 == 0) goto L_0x00c4
            com.bytedance.common.utility.collection.WeakHandler r0 = new com.bytedance.common.utility.collection.WeakHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r9)
            r9.f46011b = r0
            com.ss.android.ugc.aweme.profile.api.e r0 = com.ss.android.ugc.aweme.profile.api.e.a()
            com.bytedance.common.utility.collection.WeakHandler r1 = r9.f46011b
            com.ss.android.ugc.aweme.share.a.d r2 = r9.j
            java.lang.String r2 = r2.getShareUserId()
            r0.a(r1, r2)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.command.m.a(com.ss.android.ugc.aweme.share.a.d):void");
    }

    public final void onClick(View view) {
        boolean z;
        b bVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f46010a, false, 42256, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46010a, false, 42256, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.equals(this.f46014e) || view.equals(this.g)) {
            try {
                if (this.j != null && this.l && (!this.m || this.f46012c != null)) {
                    String shareUserId = this.j.getShareUserId();
                    if (PatchProxy.isSupport(new Object[]{shareUserId}, this, f46010a, false, 42257, new Class[]{String.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{shareUserId}, this, f46010a, false, 42257, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        z = StringUtils.equal(shareUserId, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                    }
                    if (!z) {
                        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
                        if (a2 != null) {
                            if (PatchProxy.isSupport(new Object[0], this, f46010a, false, 42258, new Class[0], b.class)) {
                                bVar = (b) PatchProxy.accessDispatch(new Object[0], this, f46010a, false, 42258, new Class[0], b.class);
                            } else if (this.j.getSchemeDetail() == null || this.j.getSchemeDetail().getVideo() == null) {
                                bVar = null;
                            } else {
                                c video = this.j.getSchemeDetail().getVideo();
                                b bVar2 = new b();
                                bVar2.f52866a = video.getAwemeId();
                                bVar2.f52869d = this.j.getShareUserId();
                                bVar2.f52870e = video.getAuthorName();
                                bVar2.f52868c = video.getDesc();
                                if (this.f46012c != null) {
                                    bVar2.f52871f = com.ss.android.ugc.aweme.im.b.a(this.f46012c);
                                }
                                bVar2.f52867b = video.getCover();
                                bVar = bVar2;
                            }
                            if (bVar != null) {
                                a2.commandShareVideo(getContext(), bVar);
                            } else {
                                a();
                            }
                        } else {
                            a();
                        }
                        dismiss();
                    }
                }
                a();
                dismiss();
            } catch (Exception unused) {
            }
        } else if (view.equals(this.i)) {
            dismiss();
        } else {
            if (view.equals(this.h) && this.j != null) {
                UserProfileActivity.a(getContext(), this.j.getShareUserId(), this.j.getSecUid(), "");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42253(0xa50d, float:5.9209E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            r3 = 0
            r4 = 42253(0xa50d, float:5.9209E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.onCreate(r10)
            r0 = 2131689898(0x7f0f01aa, float:1.9008824E38)
            r9.setContentView(r0)
            r9.setCanceledOnTouchOutside(r8)
            r0 = 2131166233(0x7f070419, float:1.7946706E38)
            android.view.View r0 = r9.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            r9.f46013d = r0
            r0 = 2131168862(0x7f070e5e, float:1.7952038E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.f46014e = r0
            r0 = 2131165476(0x7f070124, float:1.794517E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.f46015f = r0
            r0 = 2131168730(0x7f070dda, float:1.795177E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.g = r0
            r0 = 2131170809(0x7f0715f9, float:1.7955987E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.k = r0
            r0 = 2131169937(0x7f071291, float:1.7954218E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.h = r0
            r0 = 2131165950(0x7f0702fe, float:1.7946132E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.i = r0
            android.widget.TextView r0 = r9.g
            r0.setOnClickListener(r9)
            android.widget.ImageView r0 = r9.f46014e
            r0.setOnClickListener(r9)
            android.widget.ImageView r0 = r9.i
            r0.setOnClickListener(r9)
            android.widget.TextView r0 = r9.h
            r0.setOnClickListener(r9)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            r3 = 0
            r4 = 42254(0xa50e, float:5.921E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46010a
            r3 = 0
            r4 = 42254(0xa50e, float:5.921E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00c3:
            com.ss.android.ugc.aweme.share.a.d r0 = r9.j
            if (r0 == 0) goto L_0x01a9
            com.ss.android.ugc.aweme.share.a.d r0 = r9.j
            com.ss.android.ugc.aweme.share.a.e r0 = r0.getSchemeDetail()
            if (r0 == 0) goto L_0x01a9
            com.ss.android.ugc.aweme.share.a.d r0 = r9.j
            com.ss.android.ugc.aweme.share.a.e r0 = r0.getSchemeDetail()
            com.ss.android.ugc.aweme.share.a.c r0 = r0.getVideo()
            if (r0 != 0) goto L_0x00dd
            goto L_0x01a9
        L_0x00dd:
            java.lang.String r0 = r9.n
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 110986(0x1b18a, float:1.55525E-40)
            if (r2 == r3) goto L_0x0108
            r3 = 3321850(0x32affa, float:4.654903E-39)
            if (r2 == r3) goto L_0x00fe
            r3 = 110541305(0x696b9f9, float:5.669699E-35)
            if (r2 == r3) goto L_0x00f4
            goto L_0x0112
        L_0x00f4:
            java.lang.String r2 = "token"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0112
            r0 = 1
            goto L_0x0113
        L_0x00fe:
            java.lang.String r2 = "link"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0112
            r0 = 0
            goto L_0x0113
        L_0x0108:
            java.lang.String r2 = "pic"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0112
            r0 = 2
            goto L_0x0113
        L_0x0112:
            r0 = -1
        L_0x0113:
            r1 = 2131562416(0x7f0d0fb0, float:1.875026E38)
            switch(r0) {
                case 0: goto L_0x0136;
                case 1: goto L_0x0129;
                case 2: goto L_0x011c;
                default: goto L_0x0119;
            }
        L_0x0119:
            java.lang.String r0 = ""
            goto L_0x0142
        L_0x011c:
            android.content.Context r0 = r9.o
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "二维码"
            r2[r8] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x0142
        L_0x0129:
            android.content.Context r0 = r9.o
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "口令"
            r2[r8] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x0142
        L_0x0136:
            android.content.Context r0 = r9.o
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "链接"
            r2[r8] = r3
            java.lang.String r0 = r0.getString(r1, r2)
        L_0x0142:
            android.widget.TextView r1 = r9.k
            r1.setText(r0)
            com.ss.android.ugc.aweme.share.a.d r0 = r9.j
            com.ss.android.ugc.aweme.share.a.e r0 = r0.getSchemeDetail()
            com.ss.android.ugc.aweme.share.a.c r0 = r0.getVideo()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r9.f46013d
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getCover()
            com.ss.android.ugc.aweme.base.c.b(r1, r2)
            android.widget.TextView r1 = r9.f46015f
            android.content.Context r2 = r9.getContext()
            r3 = 2131562414(0x7f0d0fae, float:1.8750256E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getAuthorName()
            r3[r8] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r1.setText(r0)
            com.ss.android.ugc.aweme.share.a.d r0 = r9.j
            java.lang.String r0 = r0.getShareUserName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a1
            android.widget.TextView r0 = r9.h
            android.content.Context r1 = r9.getContext()
            r2 = 2131562425(0x7f0d0fb9, float:1.8750278E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.ss.android.ugc.aweme.share.a.d r3 = r9.j
            java.lang.String r3 = r3.getShareUserName()
            r2[r8] = r3
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.setText(r1)
            return
        L_0x01a1:
            android.widget.TextView r0 = r9.h
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.command.m.onCreate(android.os.Bundle):void");
    }

    public m(@NonNull Context context, String str) {
        super(context, C0906R.style.su);
        this.n = str;
        this.o = context;
    }
}
