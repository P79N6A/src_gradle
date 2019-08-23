package com.ss.android.ugc.aweme.feed.share.command;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.net.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AdsAppActivity;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.share.a.d;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r extends Dialog implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46039a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakHandler f46040b;

    /* renamed from: c  reason: collision with root package name */
    protected User f46041c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteImageView f46042d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f46043e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f46044f;
    private TextView g;
    private ImageView h;
    private d i;
    private TextView j;
    private boolean k;
    private boolean l;
    private String m;
    private Context n;
    private String o;
    private String p;

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f46039a, false, 42303, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f46039a, false, 42303, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2 != null && (message2.obj instanceof User)) {
            this.f46041c = (User) message2.obj;
        }
        super.show();
    }

    public static Map<String, String> a(String str) {
        Map<String, String> map;
        if (PatchProxy.isSupport(new Object[]{str}, null, f46039a, true, 42299, new Class[]{String.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{str}, null, f46039a, true, 42299, new Class[]{String.class}, Map.class);
        }
        try {
            String a2 = a.a().a(0, 204800, str, null, false, false, null, false);
            if (PatchProxy.isSupport(new Object[]{a2}, null, f46039a, true, 42298, new Class[]{String.class}, Map.class)) {
                map = (Map) PatchProxy.accessDispatch(new Object[]{a2}, null, f46039a, true, 42298, new Class[]{String.class}, Map.class);
            } else {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(a2)) {
                    Matcher matcher = Pattern.compile("<meta name=\"aweme:(.+?)\" content=\"(.+?)\">").matcher(a2);
                    while (matcher.find()) {
                        if (!TextUtils.isEmpty(matcher.group(1)) && !TextUtils.isEmpty(matcher.group(2))) {
                            hashMap.put(matcher.group(1), matcher.group(2));
                        }
                    }
                }
                map = hashMap;
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46039a, false, 42301, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46039a, false, 42301, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.equals(this.f46042d) || view.equals(this.f46044f)) {
            try {
                if (this.i != null) {
                    if (PatchProxy.isSupport(new Object[0], this, f46039a, false, 42302, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46039a, false, 42302, new Class[0], Void.TYPE);
                    } else {
                        Intent intent = new Intent(getContext(), AdsAppActivity.class);
                        i iVar = new i(this.i.getSchema());
                        iVar.a("from_uid", this.i.getShareUserId());
                        iVar.a("hide_more", 0);
                        iVar.a("previous_page", "token");
                        intent.setData(Uri.parse(iVar.a()));
                        intent.putExtra("from_token", this.m);
                        intent.putExtra("token_request_id", this.i.getRid());
                        getContext().startActivity(intent);
                    }
                }
                dismiss();
            } catch (Exception unused) {
            }
        } else if (view.equals(this.h)) {
            dismiss();
        } else {
            if (view.equals(this.g) && this.i != null) {
                UserProfileActivity.a(getContext(), this.i.getShareUserId(), this.i.getSecUid(), "");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        if (r0.exitUser(r9.i.getShareUserId()) == false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.share.a.d r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42297(0xa539, float:5.9271E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            r3 = 0
            r4 = 42297(0xa539, float:5.9271E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r9.i = r10
            java.lang.String r0 = "token"
            java.lang.String r1 = r9.m
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.ab()
            r9.k = r0
            goto L_0x005d
        L_0x0049:
            java.lang.String r0 = "pic"
            java.lang.String r1 = r9.m
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.ac()
            r9.k = r0
        L_0x005d:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            r3 = 0
            r4 = 42304(0xa540, float:5.928E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0088
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            r3 = 0
            r4 = 42304(0xa540, float:5.928E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            goto L_0x00a4
        L_0x0088:
            com.ss.android.ugc.aweme.share.a.d r0 = r9.i
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r9.k
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.b.a()
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.share.a.d r1 = r9.i
            java.lang.String r1 = r1.getShareUserId()
            boolean r0 = r0.exitUser(r1)
            if (r0 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            r9.l = r7
            boolean r0 = r9.l
            if (r0 == 0) goto L_0x00c4
            com.bytedance.common.utility.collection.WeakHandler r0 = new com.bytedance.common.utility.collection.WeakHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r9)
            r9.f46040b = r0
            com.ss.android.ugc.aweme.profile.api.e r0 = com.ss.android.ugc.aweme.profile.api.e.a()
            com.bytedance.common.utility.collection.WeakHandler r1 = r9.f46040b
            com.ss.android.ugc.aweme.share.a.d r2 = r9.i
            java.lang.String r2 = r2.getShareUserId()
            r0.a(r1, r2)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.command.r.a(com.ss.android.ugc.aweme.share.a.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42295(0xa537, float:5.9268E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            r3 = 0
            r4 = 42295(0xa537, float:5.9268E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.onCreate(r10)
            r0 = 2131689904(0x7f0f01b0, float:1.9008837E38)
            r9.setContentView(r0)
            r9.setCanceledOnTouchOutside(r8)
            r0 = 2131166233(0x7f070419, float:1.7946706E38)
            android.view.View r0 = r9.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            r9.f46042d = r0
            r0 = 2131165476(0x7f070124, float:1.794517E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.f46043e = r0
            r0 = 2131168730(0x7f070dda, float:1.795177E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.f46044f = r0
            r0 = 2131170809(0x7f0715f9, float:1.7955987E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.j = r0
            r0 = 2131169937(0x7f071291, float:1.7954218E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.g = r0
            r0 = 2131165950(0x7f0702fe, float:1.7946132E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.h = r0
            android.widget.TextView r0 = r9.f46044f
            r0.setOnClickListener(r9)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.f46042d
            r0.setOnClickListener(r9)
            android.widget.ImageView r0 = r9.h
            r0.setOnClickListener(r9)
            android.widget.TextView r0 = r9.g
            r0.setOnClickListener(r9)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            r3 = 0
            r4 = 42296(0xa538, float:5.927E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b8
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46039a
            r3 = 0
            r4 = 42296(0xa538, float:5.927E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00b8:
            com.ss.android.ugc.aweme.share.a.d r0 = r9.i
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = r9.m
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 110986(0x1b18a, float:1.55525E-40)
            if (r2 == r3) goto L_0x00e7
            r3 = 3321850(0x32affa, float:4.654903E-39)
            if (r2 == r3) goto L_0x00dd
            r3 = 110541305(0x696b9f9, float:5.669699E-35)
            if (r2 == r3) goto L_0x00d3
            goto L_0x00f1
        L_0x00d3:
            java.lang.String r2 = "token"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f1
            r0 = 1
            goto L_0x00f2
        L_0x00dd:
            java.lang.String r2 = "link"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            goto L_0x00f2
        L_0x00e7:
            java.lang.String r2 = "pic"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f1
            r0 = 2
            goto L_0x00f2
        L_0x00f1:
            r0 = -1
        L_0x00f2:
            r1 = 2131562416(0x7f0d0fb0, float:1.875026E38)
            switch(r0) {
                case 0: goto L_0x0115;
                case 1: goto L_0x0108;
                case 2: goto L_0x00fb;
                default: goto L_0x00f8;
            }
        L_0x00f8:
            java.lang.String r0 = ""
            goto L_0x0121
        L_0x00fb:
            android.content.Context r0 = r9.n
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "二维码"
            r2[r8] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x0121
        L_0x0108:
            android.content.Context r0 = r9.n
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "口令"
            r2[r8] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x0121
        L_0x0115:
            android.content.Context r0 = r9.n
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "链接"
            r2[r8] = r3
            java.lang.String r0 = r0.getString(r1, r2)
        L_0x0121:
            android.widget.TextView r1 = r9.j
            r1.setText(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.f46042d
            com.facebook.drawee.interfaces.DraweeHierarchy r0 = r0.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r0 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r0
            com.ss.android.ugc.aweme.feed.share.m r1 = com.ss.android.ugc.aweme.feed.share.m.f46060b
            r0.setActualImageScaleType(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.f46042d
            java.lang.String r1 = r9.o
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            android.widget.TextView r0 = r9.f46043e
            java.lang.String r1 = r9.p
            r0.setText(r1)
            com.ss.android.ugc.aweme.share.a.d r0 = r9.i
            java.lang.String r0 = r0.getShareUserName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x016c
            android.widget.TextView r0 = r9.g
            android.content.Context r1 = r9.getContext()
            r2 = 2131562425(0x7f0d0fb9, float:1.8750278E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.ss.android.ugc.aweme.share.a.d r3 = r9.i
            java.lang.String r3 = r3.getShareUserName()
            r2[r8] = r3
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.setText(r1)
            return
        L_0x016c:
            android.widget.TextView r0 = r9.g
            r1 = 8
            r0.setVisibility(r1)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.command.r.onCreate(android.os.Bundle):void");
    }

    public r(@NonNull Context context, String str) {
        super(context, C0906R.style.su);
        this.m = str;
        this.n = context;
    }

    public static boolean a(r rVar, Map<String, String> map) {
        r rVar2 = rVar;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{rVar2, map2}, null, f46039a, true, 42300, new Class[]{r.class, Map.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rVar2, map2}, null, f46039a, true, 42300, new Class[]{r.class, Map.class}, Boolean.TYPE)).booleanValue();
        } else if (rVar2 == null || map2 == null || map.size() <= 0) {
            return false;
        } else {
            String str = map2.get("image");
            String str2 = map2.get("description");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return false;
            }
            rVar2.o = str;
            rVar2.p = str2;
            return true;
        }
    }
}
