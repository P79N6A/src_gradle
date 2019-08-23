package com.ss.android.ugc.aweme.fe.method.commerce;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/commerce/OpenTaobaoGoodMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "()V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OpenTaobaoGoodMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44549a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44550b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/commerce/OpenTaobaoGoodMethod$Companion;", "", "()V", "OPEN_TAO_BAO_GOOD", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        if (r0 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004f, code lost:
        if (r1 == null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable org.json.JSONObject r20, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r21) {
        /*
            r19 = this;
            r0 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r5 = f44549a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r4 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 39861(0x9bb5, float:5.5857E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r14 = f44549a
            r15 = 0
            r16 = 39861(0x9bb5, float:5.5857E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            if (r0 == 0) goto L_0x0051
            java.lang.String r1 = "goodPromotionID"
            java.lang.String r2 = "STRING_NOT_SET"
            java.lang.String r1 = r0.optString(r1, r2)
            if (r1 != 0) goto L_0x0053
        L_0x0051:
            java.lang.String r1 = "STRING_NOT_SET"
        L_0x0053:
            if (r0 == 0) goto L_0x005f
            java.lang.String r2 = "goodUrl"
            java.lang.String r3 = "STRING_NOT_SET"
            java.lang.String r0 = r0.optString(r2, r3)
            if (r0 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r0 = "STRING_NOT_SET"
        L_0x0061:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "STRING_NOT_SET"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x00b0
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "STRING_NOT_SET"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x007b
            goto L_0x00b0
        L_0x007b:
            r1 = r19
            java.lang.ref.WeakReference r2 = r1.f3123e
            if (r2 == 0) goto L_0x00af
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r2 != 0) goto L_0x008a
            goto L_0x00af
        L_0x008a:
            java.lang.String r3 = "mContextRef?.get() ?: return"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r3 = "com.taobao.taobao"
            boolean r3 = com.ss.android.common.util.ToolUtils.isInstalledApp((android.content.Context) r2, (java.lang.String) r3)
            if (r3 == 0) goto L_0x009d
            java.lang.String r3 = "INVALID_ENTER_FROM"
            com.ss.android.ugc.aweme.commercialize.g.a(r2, r0, r3)
            return
        L_0x009d:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r4 = com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r3.<init>(r2, r4)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3.setData(r0)
            r2.startActivity(r3)
            return
        L_0x00af:
            return
        L_0x00b0:
            r1 = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.commerce.OpenTaobaoGoodMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
