package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46800a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f46801b;

    /* renamed from: c  reason: collision with root package name */
    public int f46802c;

    /* renamed from: d  reason: collision with root package name */
    private Context f46803d;

    public final void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f46800a, false, 42630, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f46800a, false, 42630, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String str3 = "";
        switch (this.f46802c) {
            case 1:
                str3 = PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
                break;
            case 2:
                str3 = "friend";
                break;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("to_status", str3);
            }
            if (this.f46801b.getAwemeType() == 2) {
                jSONObject.put("is_photo", 1);
            }
        } catch (JSONException unused) {
        }
        MobClick labelName = MobClick.obtain().setEventName(str).setLabelName("share_option");
        if (this.f46801b == null) {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str2 = this.f46801b.getAid();
        }
        r.onEvent(labelName.setValue(str2).setJsonObject(jSONObject));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00cc, code lost:
        r0.setMessage((java.lang.CharSequence) r7.f46803d.getResources().getString(com.ss.android.ugc.aweme.C0906R.string.a4s, new java.lang.Object[]{r7.f46801b.getDescendantsModel().getNotifyMsg()})).setNegativeButton((int) com.ss.android.ugc.aweme.C0906R.string.pm, (android.content.DialogInterface.OnClickListener) null).setPositiveButton((int) com.ss.android.ugc.aweme.C0906R.string.cgm, (android.content.DialogInterface.OnClickListener) new com.ss.android.ugc.aweme.feed.ui.n.AnonymousClass1(r7)).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0102, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r18, android.content.Context r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, com.ss.android.ugc.aweme.feed.h.p r21) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r13 = 0
            r0[r13] = r1
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r16 = 3
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f46800a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.h.p> r1 = com.ss.android.ugc.aweme.feed.h.p.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42628(0xa684, float:5.9735E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006e
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r13] = r1
            r0[r14] = r9
            r0[r15] = r10
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f46800a
            r3 = 0
            r4 = 42628(0xa684, float:5.9735E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.h.p> r1 = com.ss.android.ugc.aweme.feed.h.p.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006e:
            if (r9 == 0) goto L_0x011f
            if (r10 != 0) goto L_0x0074
            goto L_0x011f
        L_0x0074:
            r7.f46803d = r9
            r7.f46801b = r10
            r7.f46802c = r8
            boolean r0 = com.ss.android.ugc.aweme.utils.cr.a(r20)
            if (r0 == 0) goto L_0x0103
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f46800a
            r3 = 0
            r4 = 42629(0xa685, float:5.9736E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.h.p> r1 = com.ss.android.ugc.aweme.feed.h.p.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f46800a
            r3 = 0
            r4 = 42629(0xa685, float:5.9736E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.h.p> r1 = com.ss.android.ugc.aweme.feed.h.p.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x011e
        L_0x00b2:
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = new com.bytedance.ies.uikit.dialog.AlertDialog$Builder
            android.content.Context r1 = r7.f46803d
            r0.<init>(r1)
            int r1 = r7.f46802c
            switch(r1) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x00bf;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x011e
        L_0x00bf:
            r1 = 2131564607(0x7f0d183f, float:1.8754704E38)
            r0.setTitle((int) r1)
            goto L_0x00cc
        L_0x00c6:
            r1 = 2131561831(0x7f0d0d67, float:1.8749074E38)
            r0.setTitle((int) r1)
        L_0x00cc:
            android.content.Context r1 = r7.f46803d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131559597(0x7f0d04ad, float:1.8744543E38)
            java.lang.Object[] r3 = new java.lang.Object[r14]
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f46801b
            com.ss.android.ugc.aweme.feed.model.DescendantsModel r4 = r4.getDescendantsModel()
            java.lang.String r4 = r4.getNotifyMsg()
            r3[r13] = r4
            java.lang.String r1 = r1.getString(r2, r3)
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r0.setMessage((java.lang.CharSequence) r1)
            r1 = 2131559036(0x7f0d027c, float:1.8743405E38)
            r2 = 0
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r0.setNegativeButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r1 = 2131562806(0x7f0d1136, float:1.8751051E38)
            com.ss.android.ugc.aweme.feed.ui.n$1 r2 = new com.ss.android.ugc.aweme.feed.ui.n$1
            r2.<init>(r11)
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r0.show()
            return
        L_0x0103:
            r11.a(r10, r8)
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.String r1 = r20.getAid()
            r0[r13] = r1
            int r1 = r8 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r14] = r1
            r11.a((java.lang.Object[]) r0)
            java.lang.String r0 = "scope_control"
            r7.a(r0)
        L_0x011e:
            return
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.n.a(int, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.h.p):void");
    }
}
