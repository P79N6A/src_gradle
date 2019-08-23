package com.ss.android.ugc.aweme.commerce.sdk.e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alimama.tunion.sdk.jump.TUnionJumpCallback;
import com.alimama.tunion.trade.convert.TUnionJumpType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.l.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/util/TaobaoUtils;", "", "()V", "jumpToBackUpH5", "", "context", "Landroid/content/Context;", "url", "", "jumpToTaoBao", "data", "enterFrom", "startAppByUrl", "", "TradeServiceCallBack", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37728a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f37729b = new c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/util/TaobaoUtils$TradeServiceCallBack;", "Lcom/alimama/tunion/sdk/jump/TUnionJumpCallback;", "()V", "onFailure", "", "errorCode", "", "errorMessage", "", "onSuccess", "jumpType", "Lcom/alimama/tunion/trade/convert/TUnionJumpType;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    static final class a implements TUnionJumpCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37730a;

        public final void onFailure(int i, @NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f37730a, false, 29581, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f37730a, false, 29581, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "errorMessage");
        }

        public final void onSuccess(@NotNull TUnionJumpType tUnionJumpType) {
            TUnionJumpType tUnionJumpType2 = tUnionJumpType;
            if (PatchProxy.isSupport(new Object[]{tUnionJumpType2}, this, f37730a, false, 29582, new Class[]{TUnionJumpType.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{tUnionJumpType2}, this, f37730a, false, 29582, new Class[]{TUnionJumpType.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(tUnionJumpType2, "jumpType");
        }
    }

    private c() {
    }

    private final void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f37728a, false, 29579, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f37728a, false, 29579, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.g());
        n nVar = n.f38045b;
        String string = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.a().getString(C0906R.string.chr);
        Intrinsics.checkExpressionValueIsNotNull(string, "CommerceProxyManager.ins…ing.taobao_default_title)");
        intent.setData(Uri.parse(n.f38045b.a(nVar.a(str2, PushConstants.TITLE, string))));
        context2.startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f7, code lost:
        if (r0.equals("homepage_follow") != false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.NotNull android.content.Context r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22) {
        /*
            r19 = this;
            r8 = r20
            r9 = r21
            r0 = r22
            r1 = 3
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r17 = 0
            r10[r17] = r8
            r18 = 1
            r10[r18] = r9
            r2 = 2
            r10[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f37728a
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r15[r17] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r15[r18] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r15[r2] = r3
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r13 = 0
            r14 = 29578(0x738a, float:4.1448E-41)
            r11 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x005b
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r17] = r8
            r4[r18] = r9
            r4[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = f37728a
            r7 = 0
            r8 = 29578(0x738a, float:4.1448E-41)
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r9[r17] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r9[r18] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r9[r2] = r0
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005b:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r3)
            java.lang.String r3 = "url"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r3)
            java.lang.String r3 = "enterFrom"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            boolean r3 = com.ss.android.ugc.aweme.commerce.service.l.j.h
            if (r3 == 0) goto L_0x011a
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0118 }
            r10[r17] = r8     // Catch:{ Exception -> 0x0118 }
            r10[r18] = r9     // Catch:{ Exception -> 0x0118 }
            r10[r2] = r0     // Catch:{ Exception -> 0x0118 }
            com.meituan.robust.ChangeQuickRedirect r12 = f37728a     // Catch:{ Exception -> 0x0118 }
            r13 = 0
            r14 = 29580(0x738c, float:4.145E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r15[r17] = r3     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r15[r18] = r3     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r15[r2] = r3     // Catch:{ Exception -> 0x0118 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0118 }
            r11 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0118 }
            if (r3 == 0) goto L_0x00b7
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0118 }
            r10[r17] = r8     // Catch:{ Exception -> 0x0118 }
            r10[r18] = r9     // Catch:{ Exception -> 0x0118 }
            r10[r2] = r0     // Catch:{ Exception -> 0x0118 }
            com.meituan.robust.ChangeQuickRedirect r12 = f37728a     // Catch:{ Exception -> 0x0118 }
            r13 = 0
            r14 = 29580(0x738c, float:4.145E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r17] = r0     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r18] = r0     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r2] = r0     // Catch:{ Exception -> 0x0118 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0118 }
            r11 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0118 }
            goto L_0x011d
        L_0x00b7:
            com.alimama.tunion.sdk.TUnionSDK r1 = com.alimama.tunion.sdk.TUnionSDK.getInstance()     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<com.alimama.tunion.sdk.service.ITUnionJumpService> r2 = com.alimama.tunion.sdk.service.ITUnionJumpService.class
            com.alimama.tunion.sdk.service.ITUnionService r1 = r1.getService(r2)     // Catch:{ Exception -> 0x0118 }
            com.alimama.tunion.sdk.service.ITUnionJumpService r1 = (com.alimama.tunion.sdk.service.ITUnionJumpService) r1     // Catch:{ Exception -> 0x0118 }
            if (r1 != 0) goto L_0x00c6
            goto L_0x011d
        L_0x00c6:
            com.alimama.tunion.sdk.jump.page.TUnionJumpUrlPage r2 = com.alimama.tunion.sdk.jump.page.TUnionJumpPageFactory.createJumpUrlPage(r21)     // Catch:{ Exception -> 0x0118 }
            com.alimama.tunion.trade.convert.TUnionMediaParams r6 = new com.alimama.tunion.trade.convert.TUnionMediaParams     // Catch:{ Exception -> 0x0118 }
            r6.<init>()     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = "149584906"
            r6.setAdzoneId(r3)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = "mm_128793683_39894009_149584906"
            r6.setSubpid(r3)     // Catch:{ Exception -> 0x0118 }
            int r3 = r22.hashCode()     // Catch:{ Exception -> 0x0118 }
            r4 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r3 == r4) goto L_0x00f1
            r4 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r3 == r4) goto L_0x00e8
            goto L_0x00fc
        L_0x00e8:
            java.lang.String r3 = "homepage_hot"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0118 }
            if (r0 == 0) goto L_0x00fc
            goto L_0x00f9
        L_0x00f1:
            java.lang.String r3 = "homepage_follow"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0118 }
            if (r0 == 0) goto L_0x00fc
        L_0x00f9:
            java.lang.String r0 = "taobao://main.aweme.sdk.com"
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r0 = "taobao://detail.aweme.sdk.com"
        L_0x00fe:
            r5 = r0
            com.alimama.tunion.trade.convert.TUnionJumpType r3 = com.alimama.tunion.trade.convert.TUnionJumpType.NATIVE     // Catch:{ Exception -> 0x0118 }
            r4 = 0
            r7 = r2
            com.alimama.tunion.sdk.jump.page.ITUnionJumpPage r7 = (com.alimama.tunion.sdk.jump.page.ITUnionJumpPage) r7     // Catch:{ Exception -> 0x0118 }
            com.ss.android.ugc.aweme.commerce.sdk.e.c$a r0 = new com.ss.android.ugc.aweme.commerce.sdk.e.c$a     // Catch:{ Exception -> 0x0118 }
            r0.<init>()     // Catch:{ Exception -> 0x0118 }
            r10 = r0
            com.alimama.tunion.sdk.jump.TUnionJumpCallback r10 = (com.alimama.tunion.sdk.jump.TUnionJumpCallback) r10     // Catch:{ Exception -> 0x0118 }
            r0 = r1
            r1 = r20
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r10
            r0.show(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0118 }
            goto L_0x011d
        L_0x0118:
            r18 = 0
        L_0x011a:
            r19.a(r20, r21)
        L_0x011d:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.e.c.a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }
}
