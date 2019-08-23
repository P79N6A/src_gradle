package com.ss.android.ugc.aweme.commerce.wxnimipay;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.m.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\u0011\u001a\u00020\u000eJ,\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/wxnimipay/WXMiniPayMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "Lcom/ss/android/ugc/aweme/commerce/service/wxpay/WXMiniPayTransaction;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "mMiniProgramType", "", "mPath", "", "mUserName", "handle", "", "params", "Lorg/json/JSONObject;", "pay", "sendResult", "code", "extMsg", "statusCode", "statusString", "transact", "resp", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class WXMiniPayMethod extends BaseCommonJavaMethod implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38395a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f38396b = new a((byte) 0);
    private String g;
    private String h;
    private BaseCommonJavaMethod.a i;
    private int j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/wxnimipay/WXMiniPayMethod$Companion;", "", "()V", "CODE_FAIL", "", "CODE_SUCCESS", "LAUNCH_WX_MINI_PROGRAM", "", "LOCAL_ERROR", "MESSAGE_BRIDGE_FAIL", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public WXMiniPayMethod() {
        this(null, 1);
    }

    public WXMiniPayMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    public final void a(@NotNull BaseResp baseResp) {
        BaseResp baseResp2 = baseResp;
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{baseResp2}, this, f38395a, false, 30245, new Class[]{BaseResp.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResp2}, this, f38395a, false, 30245, new Class[]{BaseResp.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseResp2, "resp");
        WXLaunchMiniProgram.Resp resp = (WXLaunchMiniProgram.Resp) baseResp2;
        String str = resp.extMsg;
        int i3 = resp.errCode;
        String str2 = resp.errStr;
        if (resp.errCode != 0) {
            i2 = 0;
        }
        a(i2, str, i3, str2);
    }

    private /* synthetic */ WXMiniPayMethod(com.bytedance.ies.f.a.a aVar, int i2) {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable org.json.JSONObject r21, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f38395a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 30243(0x7623, float:4.238E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f38395a
            r3 = 0
            r4 = 30243(0x7623, float:4.238E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            r7.i = r9
            r0 = 0
            if (r8 == 0) goto L_0x0051
            java.lang.String r1 = "userName"
            java.lang.String r1 = r8.optString(r1)
            goto L_0x0052
        L_0x0051:
            r1 = r0
        L_0x0052:
            r7.g = r1
            if (r8 == 0) goto L_0x005c
            java.lang.String r0 = "path"
            java.lang.String r0 = r8.optString(r0)
        L_0x005c:
            r7.h = r0
            if (r8 == 0) goto L_0x0067
            java.lang.String r0 = "miniprogramType"
            int r0 = r8.optInt(r0)
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r7.j = r0
            com.ss.android.ugc.aweme.commerce.service.l.f$a r0 = com.ss.android.ugc.aweme.commerce.service.l.f.f38013a
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r7.g
            r2[r11] = r3
            java.lang.String r3 = r7.h
            r2[r12] = r3
            int r3 = r7.j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r10] = r3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.service.l.f.a.f38014a
            r16 = 0
            r17 = 29997(0x752d, float:4.2035E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x00ba
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.service.l.f.a.f38014a
            r16 = 0
            r17 = 29997(0x752d, float:4.2035E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            r1[r11] = r2
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00cc
        L_0x00ba:
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            r0 = 0
        L_0x00c0:
            if (r0 >= r1) goto L_0x00cb
            r3 = r2[r0]
            if (r3 != 0) goto L_0x00c8
            r0 = 0
            goto L_0x00cc
        L_0x00c8:
            int r0 = r0 + 1
            goto L_0x00c0
        L_0x00cb:
            r0 = 1
        L_0x00cc:
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = ""
            r1 = -1
            java.lang.String r2 = ""
            r7.a(r11, r0, r1, r2)
            return
        L_0x00d7:
            r0 = r7
            com.ss.android.ugc.aweme.commerce.service.m.b r0 = (com.ss.android.ugc.aweme.commerce.service.m.b) r0
            com.ss.android.ugc.aweme.commerce.service.m.a.f38169a = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f38395a
            r3 = 0
            r4 = 30244(0x7624, float:4.2381E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0100
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f38395a
            r3 = 0
            r4 = 30244(0x7624, float:4.2381E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0100:
            java.lang.ref.WeakReference r0 = r7.f3123e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "wx76fdd06dde311af3"
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r0, r1)
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req r1 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req
            r1.<init>()
            java.lang.String r2 = r7.g
            r1.userName = r2
            java.lang.String r2 = r7.h
            r1.path = r2
            int r2 = r7.j
            r1.miniprogramType = r2
            com.tencent.mm.opensdk.modelbase.BaseReq r1 = (com.tencent.mm.opensdk.modelbase.BaseReq) r1
            r0.sendReq(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private final void a(int i2, String str, int i3, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, Integer.valueOf(i3), str4}, this, f38395a, false, 30246, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3, Integer.valueOf(i3), str4}, this, f38395a, false, 30246, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i2);
        if (str3 != null) {
            jSONObject.put("data", str3);
        }
        jSONObject.put("statusCode", i3);
        if (str4 != null) {
            jSONObject.put("statusString", str4);
        }
        BaseCommonJavaMethod.a aVar = this.i;
        if (aVar != null) {
            aVar.a(jSONObject);
        }
        com.ss.android.ugc.aweme.commerce.service.m.a.f38169a = null;
    }
}
