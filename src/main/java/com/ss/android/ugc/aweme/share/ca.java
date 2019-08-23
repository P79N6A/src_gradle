package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.text.TextUtils;
import com.douyin.baseshare.a;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatPageRequestCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.b.b;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.y;
import java.util.Map;

public final class ca {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64912a;

    public static String a() {
        return "";
    }

    public static void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, null, f64912a, true, 73280, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, null, f64912a, true, 73280, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("rocket", aVar.d())) {
            r.a("flipchat_share_from_flipchat", (Map) d.a().a("enter_from", "share_board").f34114b);
        }
    }

    private static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, null, f64912a, true, 73281, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, null, f64912a, true, 73281, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        r.a("flipchat_share_friend_list_enter", (Map) d.a().a("invoke_from", "flipchat_logo").f34114b);
    }

    public static void a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f64912a, true, 73285, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str}, null, f64912a, true, 73285, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.sec.a.a(str);
    }

    public static void a(Context context, IShareService.ShareStruct shareStruct, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
        final Context context2 = context;
        final IShareService.ShareStruct shareStruct2 = shareStruct;
        final com.ss.android.ugc.aweme.base.a<Boolean> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, shareStruct2, aVar2}, null, f64912a, true, 73282, new Class[]{Context.class, IShareService.ShareStruct.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, shareStruct2, aVar2}, null, f64912a, true, 73282, new Class[]{Context.class, IShareService.ShareStruct.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
        } else if (!q.a()) {
            if (aVar2 != null) {
                aVar2.run(Boolean.FALSE);
            }
        } else {
            a(false);
            if (!com.ss.android.ugc.aweme.rocket.d.f63651b.isLogin()) {
                com.ss.android.ugc.aweme.rocket.d.f63651b.goToLogin(new FlipChatPageRequestCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64913a;

                    public final void onPageComplete() {
                        if (PatchProxy.isSupport(new Object[0], this, f64913a, false, 73286, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64913a, false, 73286, new Class[0], Void.TYPE);
                            return;
                        }
                        ca.b(context2, shareStruct2, aVar2);
                    }
                });
            } else {
                b(context, shareStruct, aVar);
            }
        }
    }

    public static void b(Context context, IShareService.ShareStruct shareStruct, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
        final Context context2 = context;
        final IShareService.ShareStruct shareStruct2 = shareStruct;
        final com.ss.android.ugc.aweme.base.a<Boolean> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, shareStruct2, aVar2}, null, f64912a, true, 73283, new Class[]{Context.class, IShareService.ShareStruct.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, shareStruct2, aVar2}, null, f64912a, true, 73283, new Class[]{Context.class, IShareService.ShareStruct.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.rocket.d.f63651b.isBindFlipChat()) {
            c(context, shareStruct, aVar);
        } else {
            c.c().setAuthorzieBindResult(new y() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64917a;

                public final void a(String str, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64917a, false, 73287, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f64917a, false, 73287, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                    } else if (!z || !b.a().a("flipchat")) {
                        if (aVar2 != null) {
                            aVar2.run(Boolean.FALSE);
                        }
                    } else {
                        ca.c(context2, shareStruct2, aVar2);
                        c.c().setAuthorzieBindResult(null);
                    }
                }
            });
            com.ss.android.ugc.aweme.rocket.d.f63651b.goToAuhBind(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r21, com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r22, com.ss.android.ugc.aweme.base.a<java.lang.Boolean> r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f64912a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r5 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r9[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.base.a> r5 = com.ss.android.ugc.aweme.base.a.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 73284(0x11e44, float:1.02693E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0055
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f64912a
            r17 = 1
            r18 = 73284(0x11e44, float:1.02693E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.a> r1 = com.ss.android.ugc.aweme.base.a.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0055:
            if (r0 == 0) goto L_0x01ad
            if (r1 != 0) goto L_0x005b
            goto L_0x01ad
        L_0x005b:
            java.lang.String r3 = "rocket"
            java.lang.String r5 = com.ss.android.ugc.aweme.share.cg.a((com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r1, (java.lang.String) r3)
            java.lang.String r3 = r1.description
            java.lang.String r4 = r1.title
            int r6 = r1.awemeType
            r7 = 13
            if (r6 != r7) goto L_0x0080
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://forward/detail/"
            r6.<init>(r7)
            java.lang.String r7 = r1.itemIdStr
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x007b:
            r8 = r3
            r10 = r6
            r6 = r4
            goto L_0x0186
        L_0x0080:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "aweme"
            if (r6 != r7) goto L_0x0097
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://aweme/detail/"
            r6.<init>(r7)
            java.lang.String r7 = r1.itemIdStr
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x0097:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "live"
            if (r6 != r7) goto L_0x00bc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "snssdk1128://live?room_id="
            r4.<init>(r6)
            java.lang.String r6 = r1.identifier
            r4.append(r6)
            java.lang.String r6 = "&user_id="
            r4.append(r6)
            java.lang.String r6 = r1.uid4Share
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = r3
            r10 = r4
            r8 = r5
            goto L_0x0186
        L_0x00bc:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "music"
            if (r6 != r7) goto L_0x00d3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://music/detail/"
            r6.<init>(r7)
            java.lang.String r7 = r1.identifier
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x00d3:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "poi"
            if (r6 != r7) goto L_0x00ea
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://poi/detail?id="
            r6.<init>(r7)
            java.lang.String r7 = r1.poiId
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x00ea:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "challenge"
            if (r6 != r7) goto L_0x0102
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://challenge/detail/"
            r6.<init>(r7)
            java.lang.String r7 = r1.identifier
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x0102:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "user"
            if (r6 != r7) goto L_0x011a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://user/detail/"
            r6.<init>(r7)
            java.lang.String r7 = r1.identifier
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x011a:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "web"
            if (r6 != r7) goto L_0x0140
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://webview?url="
            r6.<init>(r7)
            java.lang.String r7 = android.net.Uri.encode(r5)
            r6.append(r7)
            java.lang.String r7 = "&title="
            r6.append(r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x0140:
            java.lang.String r6 = r1.itemType
            java.lang.String r7 = "ranking"
            if (r6 != r7) goto L_0x0166
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://webview?url="
            r6.<init>(r7)
            java.lang.String r7 = android.net.Uri.encode(r5)
            r6.append(r7)
            java.lang.String r7 = "&title="
            r6.append(r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x0166:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "snssdk1128://webview?url="
            r6.<init>(r7)
            java.lang.String r7 = android.net.Uri.encode(r5)
            r6.append(r7)
            java.lang.String r7 = "&title="
            r6.append(r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x007b
        L_0x0186:
            com.rocket.android.model.ShareData r3 = new com.rocket.android.model.ShareData
            java.lang.String r7 = com.douyin.share.e.a.e.a(r22)
            r4 = 2131558447(0x7f0d002f, float:1.874221E38)
            java.lang.String r9 = r0.getString(r4)
            r11 = 1128(0x468, float:1.58E-42)
            java.lang.String r12 = r1.itemIdStr
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = ""
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.rocket.android.api.FusionFuelSdk.startForwardActivity(r3, r1, r4, r0)
            if (r2 == 0) goto L_0x01ac
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.run(r0)
        L_0x01ac:
            return
        L_0x01ad:
            if (r2 == 0) goto L_0x01b4
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.run(r0)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ca.c(android.content.Context, com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, com.ss.android.ugc.aweme.base.a):void");
    }
}
