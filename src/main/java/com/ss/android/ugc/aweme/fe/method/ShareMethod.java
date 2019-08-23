package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J*\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002J*\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0007J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\u001c\u0010\u001e\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0004J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0007H\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/ShareMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "mEnableShareLists", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "directlyShare", "", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "params", "Lorg/json/JSONObject;", "currentUrl", "doShareImAction", "activity", "Landroid/app/Activity;", "shareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "innerUrl", "douyinOpenQRCodeWebViewDialog", "", "dialogType", "", "shareType", "getShareTypeStringByPlatform", "platform", "handle", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "sharePrepared", "updateShareLists", "shareItems", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ShareMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44495a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44496b = new a((byte) 0);
    private final ArrayList<String> g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/ShareMethod$Companion;", "", "()V", "BRIDGE_NAME_SHARE", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/fe/method/ShareMethod$directlyShare$1", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$IActionHandler;", "checkStatus", "", "shareType", "", "onAction", "struct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements IShareService.IActionHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareMethod f44498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f44499c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ IShareService.ShareStruct f44500d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f44501e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f44502f;
        final /* synthetic */ String g;

        public final boolean checkStatus(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f44497a, false, 39827, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f44497a, false, 39827, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "shareType");
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r0v31, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onAction(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r21, @org.jetbrains.annotations.NotNull java.lang.String r22) {
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
                com.meituan.robust.ChangeQuickRedirect r2 = f44497a
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                r5[r11] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Boolean.TYPE
                r3 = 0
                r4 = 39828(0x9b94, float:5.5811E-41)
                r1 = r20
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x004e
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = f44497a
                r3 = 0
                r4 = 39828(0x9b94, float:5.5811E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                r5[r11] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Boolean.TYPE
                r1 = r20
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x004e:
                java.lang.String r0 = "struct"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                java.lang.String r0 = "shareType"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
                java.lang.String r0 = "copy"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1 = r9
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x009d
                android.app.Activity r0 = r7.f44499c
                java.lang.String r1 = "clipboard"
                java.lang.Object r0 = r0.getSystemService(r1)
                if (r0 == 0) goto L_0x0095
                android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
                com.ss.android.ugc.aweme.n r1 = com.ss.android.ugc.aweme.u.a()
                java.lang.String r2 = r8.url
                boolean r3 = r8.boolPersist
                java.lang.String r1 = r1.a((java.lang.String) r2, (boolean) r3)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r1)
                r0.setPrimaryClip(r1)
                android.app.Activity r0 = r7.f44499c
                android.content.Context r0 = (android.content.Context) r0
                r1 = 2131559505(0x7f0d0451, float:1.8744356E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r1)
                r0.a()
                return r12
            L_0x0095:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.content.ClipboardManager"
                r0.<init>(r1)
                throw r0
            L_0x009d:
                boolean r0 = com.ss.android.g.a.a()
                if (r0 != 0) goto L_0x0116
                java.lang.String r0 = "qr_code"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.equals(r1, r0)
                if (r0 == 0) goto L_0x0116
                com.ss.android.ugc.aweme.fe.method.ShareMethod r0 = r7.f44498b
                com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r7.f44500d
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r13[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.fe.method.ShareMethod.f44495a
                r16 = 0
                r17 = 39823(0x9b8f, float:5.5804E-41)
                java.lang.Class[] r2 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r3 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                r2[r11] = r3
                java.lang.Class r19 = java.lang.Boolean.TYPE
                r14 = r0
                r18 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r2 == 0) goto L_0x00ee
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r13[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.fe.method.ShareMethod.f44495a
                r16 = 0
                r17 = 39823(0x9b8f, float:5.5804E-41)
                java.lang.Class[] r1 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r2 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                r1[r11] = r2
                java.lang.Class r19 = java.lang.Boolean.TYPE
                r14 = r0
                r18 = r1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r11 = r0.booleanValue()
                goto L_0x0112
            L_0x00ee:
                java.lang.String r0 = "shareStruct"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
                java.lang.String r0 = r1.url
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0112
                java.lang.String r0 = r1.thumbUrl
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0112
                java.lang.String r0 = r1.description
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0112
                r11 = 1
            L_0x0112:
                if (r11 != 0) goto L_0x0115
                return r12
            L_0x0115:
                return r12
            L_0x0116:
                java.lang.String r0 = "REFRESH"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.equals(r1, r0)
                if (r0 == 0) goto L_0x0135
                com.ss.android.ugc.aweme.fe.method.ShareMethod r0 = r7.f44498b
                com.bytedance.ies.f.a.a r0 = r0.f3124f
                if (r0 == 0) goto L_0x0134
                com.ss.android.ugc.aweme.fe.method.ShareMethod r0 = r7.f44498b
                com.bytedance.ies.f.a.a r0 = r0.f3124f
                java.lang.String r1 = "mJsBridge"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.webkit.WebView r0 = r0.f20612d
                r0.reload()
            L_0x0134:
                return r12
            L_0x0135:
                java.lang.String r0 = "OPEN_IN_BROWSER"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.equals(r1, r0)
                r2 = 0
                if (r0 == 0) goto L_0x0172
                android.content.Context r0 = r7.f44501e
                boolean r0 = r0 instanceof com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity
                if (r0 == 0) goto L_0x014b
                android.content.Context r0 = r7.f44501e
                r2 = r0
                android.app.Activity r2 = (android.app.Activity) r2
            L_0x014b:
                if (r2 == 0) goto L_0x0171
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.setAction(r1)
                com.ss.android.ugc.aweme.n r1 = com.ss.android.ugc.aweme.u.a()
                com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r3 = r7.f44500d
                java.lang.String r3 = r3.url
                com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = r7.f44500d
                boolean r4 = r4.boolPersist
                java.lang.String r1 = r1.a((java.lang.String) r3, (boolean) r4)
                android.net.Uri r1 = android.net.Uri.parse(r1)
                r0.setData(r1)
                r2.startActivity(r0)
            L_0x0171:
                return r12
            L_0x0172:
                java.lang.String r0 = "chat_merge"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.equals(r1, r0)
                if (r0 == 0) goto L_0x024c
                android.content.Context r0 = r7.f44501e
                boolean r0 = r0 instanceof com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity
                if (r0 == 0) goto L_0x0187
                android.content.Context r0 = r7.f44501e
                android.app.Activity r0 = (android.app.Activity) r0
                goto L_0x0188
            L_0x0187:
                r0 = r2
            L_0x0188:
                if (r0 == 0) goto L_0x024b
                com.ss.android.ugc.aweme.fe.method.ShareMethod r1 = r7.f44498b
                com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r3 = r7.f44500d
                java.lang.String r4 = r7.f44502f
                java.lang.String r5 = r7.g
                java.lang.String r6 = "innerUrl"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                r6 = 4
                java.lang.Object[] r13 = new java.lang.Object[r6]
                r13[r11] = r0
                r13[r12] = r3
                r13[r10] = r4
                r8 = 3
                r13[r8] = r5
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.fe.method.ShareMethod.f44495a
                r16 = 0
                r17 = 39825(0x9b91, float:5.5807E-41)
                java.lang.Class[] r9 = new java.lang.Class[r6]
                java.lang.Class<android.app.Activity> r14 = android.app.Activity.class
                r9[r11] = r14
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r14 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                r9[r12] = r14
                java.lang.Class<java.lang.String> r14 = java.lang.String.class
                r9[r10] = r14
                java.lang.Class<java.lang.String> r14 = java.lang.String.class
                r9[r8] = r14
                java.lang.Class r19 = java.lang.Boolean.TYPE
                r14 = r1
                r18 = r9
                boolean r9 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r9 == 0) goto L_0x01f9
                java.lang.Object[] r13 = new java.lang.Object[r6]
                r13[r11] = r0
                r13[r12] = r3
                r13[r10] = r4
                r13[r8] = r5
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.fe.method.ShareMethod.f44495a
                r16 = 0
                r17 = 39825(0x9b91, float:5.5807E-41)
                java.lang.Class[] r0 = new java.lang.Class[r6]
                java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                r0[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r2 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                r0[r12] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r10] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r8] = r2
                java.lang.Class r19 = java.lang.Boolean.TYPE
                r14 = r1
                r18 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r0.booleanValue()
                goto L_0x024b
            L_0x01f9:
                java.lang.String r1 = "shareStruct"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
                java.lang.String r1 = "innerUrl"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r1)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r6 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
                boolean r1 = r1.isLogin()
                if (r1 != 0) goto L_0x021a
                java.lang.String r1 = ""
                java.lang.String r2 = "click_shareim_button"
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2)
                goto L_0x024b
            L_0x021a:
                r1 = r5
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0226
                r3.url = r5
                goto L_0x0231
            L_0x0226:
                r1 = r4
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0231
                r3.url = r4
            L_0x0231:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r4 = "share_struct"
                java.io.Serializable r3 = (java.io.Serializable) r3
                r1.putSerializable(r4, r3)
                com.ss.android.ugc.aweme.im.service.IIMService r3 = com.ss.android.ugc.aweme.im.b.a()
                android.content.Context r0 = (android.content.Context) r0
                r3.enterChooseContact(r0, r1, r2)
                java.lang.String r0 = "chat_merge"
                com.ss.android.ugc.aweme.feed.ao.a(r0)
            L_0x024b:
                return r12
            L_0x024c:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.ShareMethod.b.onAction(com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, java.lang.String):boolean");
        }

        b(ShareMethod shareMethod, Activity activity, IShareService.ShareStruct shareStruct, Context context, String str, String str2) {
            this.f44498b = shareMethod;
            this.f44499c = activity;
            this.f44500d = shareStruct;
            this.f44501e = context;
            this.f44502f = str;
            this.g = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareResult;", "kotlin.jvm.PlatformType", "onShareComplete"}, k = 3, mv = {1, 1, 15})
    static final class c implements IShareService.OnShareCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f44504b;

        c(JSONObject jSONObject) {
            this.f44504b = jSONObject;
        }

        public final void onShareComplete(IShareService.ShareResult shareResult) {
            if (PatchProxy.isSupport(new Object[]{shareResult}, this, f44503a, false, 39829, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{shareResult}, this, f44503a, false, 39829, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
                return;
            }
            if (this.f44504b != null) {
                MobClick eventName = MobClick.obtain().setEventName(this.f44504b.optString("tag"));
                if (shareResult == null) {
                    Intrinsics.throwNpe();
                }
                r.onEvent(eventName.setLabelName(shareResult.type).setValue(this.f44504b.optString("value")).setJsonObject(this.f44504b.optJSONObject("extras")));
            }
            if (shareResult != null) {
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                a2.a("enter_from", "h5_page");
                a2.a("platform", shareResult.type);
                r.a("h5_share", (Map) a2.f34114b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/fe/method/ShareMethod$updateShareLists$allowItems$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends TypeToken<List<? extends String>> {
        d() {
        }
    }

    public ShareMethod() {
        this(null, 1);
    }

    public ShareMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
        this.g = new ArrayList<>(Arrays.asList(new String[]{"copylink", "qrcode", "browser", "refresh"}));
    }

    private /* synthetic */ ShareMethod(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable org.json.JSONObject r25, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r26) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f44495a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39820(0x9b8c, float:5.58E-41)
            r1 = r24
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f44495a
            r3 = 0
            r4 = 39820(0x9b8c, float:5.58E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r24
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            java.lang.ref.WeakReference r13 = r7.f3123e
            java.lang.String r0 = "mContextRef"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r13, r0)
            com.bytedance.ies.f.a.a r0 = r7.f3124f
            if (r0 == 0) goto L_0x005c
            android.webkit.WebView r0 = r0.f20612d
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r0.getUrl()
            r15 = r0
            goto L_0x005d
        L_0x005c:
            r15 = 0
        L_0x005d:
            r6 = 3
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r11] = r13
            r0[r12] = r8
            r0[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f44495a
            r3 = 0
            r4 = 39821(0x9b8d, float:5.5801E-41)
            java.lang.Class[] r5 = new java.lang.Class[r6]
            java.lang.Class<java.lang.ref.WeakReference> r1 = java.lang.ref.WeakReference.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r1 = r24
            r14 = 3
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b3
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r11] = r13
            r0[r12] = r8
            r0[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f44495a
            r3 = 0
            r4 = 39821(0x9b8d, float:5.5801E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.ref.WeakReference> r1 = java.lang.ref.WeakReference.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            goto L_0x03ad
        L_0x00b3:
            if (r8 != 0) goto L_0x00b7
            goto L_0x03ad
        L_0x00b7:
            java.lang.String r0 = "title"
            java.lang.String r10 = r8.optString(r0)
            java.lang.String r0 = "desc"
            java.lang.String r14 = r8.optString(r0)
            java.lang.String r0 = "image"
            java.lang.String r16 = r8.optString(r0)
            java.lang.String r0 = "url"
            java.lang.String r17 = r8.optString(r0)
            java.lang.String r0 = "imagePath"
            java.lang.String r18 = r8.optString(r0)
            java.lang.String r0 = "type"
            java.lang.String r19 = r8.optString(r0)
            java.lang.String r0 = "innerUrl"
            java.lang.String r6 = r8.optString(r0)
            java.lang.String r0 = "tips"
            r8.optString(r0)
            java.lang.String r0 = "shareitems"
            java.lang.String r5 = r8.optString(r0)
            java.lang.String r0 = "shareItems"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r5
            com.meituan.robust.ChangeQuickRedirect r2 = f44495a
            r3 = 0
            r4 = 39822(0x9b8e, float:5.5803E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r1[r11] = r20
            java.lang.Class r20 = java.lang.Void.TYPE
            r21 = r1
            r1 = r24
            r11 = r5
            r5 = r21
            r22 = r6
            r6 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x012d
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r1 = 0
            r0[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f44495a
            r3 = 0
            r4 = 39822(0x9b8e, float:5.5803E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r24
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0159
        L_0x012d:
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0159
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.ss.android.ugc.aweme.fe.method.ShareMethod$d r1 = new com.ss.android.ugc.aweme.fe.method.ShareMethod$d
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r0 = r0.fromJson((java.lang.String) r11, (java.lang.reflect.Type) r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x014d
            goto L_0x0159
        L_0x014d:
            java.util.ArrayList<java.lang.String> r1 = r7.g
            r1.clear()
            java.util.ArrayList<java.lang.String> r1 = r7.g
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
        L_0x0159:
            java.lang.String r0 = "qrcode"
            int r0 = r8.optInt(r0)
            if (r0 != 0) goto L_0x0168
            java.util.ArrayList<java.lang.String> r0 = r7.g
            java.lang.String r1 = "qrcode"
            r0.remove(r1)
        L_0x0168:
            java.lang.String r0 = "shareEntriesForbidList"
            org.json.JSONArray r0 = r8.optJSONArray(r0)
            com.ss.android.ugc.aweme.utils.r r1 = com.ss.android.ugc.aweme.utils.r.f75958b
            java.util.List r11 = r1.a((org.json.JSONArray) r0)
            java.lang.String r0 = "logArgs"
            boolean r0 = r8.has(r0)
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = "logArgs"
            org.json.JSONObject r0 = r8.optJSONObject(r0)
            goto L_0x0184
        L_0x0183:
            r0 = 0
        L_0x0184:
            com.ss.android.ugc.aweme.web.b.a.a r6 = new com.ss.android.ugc.aweme.web.b.a.a
            r1 = r6
            r2 = r10
            r3 = r14
            r4 = r16
            r5 = r17
            r10 = r6
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r1 = "platform"
            java.lang.String r8 = r8.optString(r1)
            java.lang.Object r1 = r13.get()
            r13 = r1
            android.content.Context r13 = (android.content.Context) r13
            java.lang.String r1 = "platform"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r2 = 0
            r1[r2] = r8
            com.meituan.robust.ChangeQuickRedirect r3 = f44495a
            r4 = 0
            r5 = 39826(0x9b92, float:5.5808E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r6[r2] = r14
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r2 = r0
            r0 = r1
            r1 = r24
            r23 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01e6
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r1 = 0
            r0[r1] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f44495a
            r3 = 0
            r4 = 39826(0x9b92, float:5.5808E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0231
        L_0x01e6:
            int r0 = r8.hashCode()
            switch(r0) {
                case -929929834: goto L_0x0225;
                case -791575966: goto L_0x021a;
                case -427019145: goto L_0x020f;
                case 3616: goto L_0x0204;
                case 108102557: goto L_0x01f9;
                case 113011944: goto L_0x01ee;
                default: goto L_0x01ed;
            }
        L_0x01ed:
            goto L_0x0230
        L_0x01ee:
            java.lang.String r0 = "weibo"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.String r14 = "weibo"
            goto L_0x0231
        L_0x01f9:
            java.lang.String r0 = "qzone"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.String r14 = "qzone"
            goto L_0x0231
        L_0x0204:
            java.lang.String r0 = "qq"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.String r14 = "qq"
            goto L_0x0231
        L_0x020f:
            java.lang.String r0 = "share_native"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.String r14 = "share_native"
            goto L_0x0231
        L_0x021a:
            java.lang.String r0 = "weixin"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.String r14 = "weixin"
            goto L_0x0231
        L_0x0225:
            java.lang.String r0 = "weixin_moments"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.String r14 = "weixin_moments"
            goto L_0x0231
        L_0x0230:
            r14 = 0
        L_0x0231:
            r8 = r14
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x03ab
            if (r13 != 0) goto L_0x023e
            goto L_0x03ab
        L_0x023e:
            android.app.Activity r2 = com.ss.android.ugc.aweme.base.utils.v.a((android.content.Context) r13)
            if (r2 != 0) goto L_0x0246
            goto L_0x03ac
        L_0x0246:
            java.lang.String r0 = r10.f76621c
            com.ss.android.ugc.aweme.base.c.b(r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.framework.services.IShareService r0 = (com.ss.android.ugc.aweme.framework.services.IShareService) r0
            com.ss.android.ugc.aweme.share.ck r1 = new com.ss.android.ugc.aweme.share.ck
            r1.<init>()
            r3 = r19
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "local_img"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x02c1
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r3 = com.ss.android.ugc.aweme.feed.share.i.b(r13, r10)
            java.lang.String r4 = "VideoShareStruct.createN…mage(context, mShareInfo)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareOrderService> r5 = com.ss.android.ugc.aweme.share.ShareOrderService.class
            java.lang.Object r4 = r4.getService(r5)
            java.lang.String r5 = "ServiceManager.get().get…OrderService::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.share.ShareOrderService r4 = (com.ss.android.ugc.aweme.share.ShareOrderService) r4
            java.lang.String[] r4 = r4.getVideoShareList()
            java.util.LinkedList r5 = new java.util.LinkedList
            int r6 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r5.<init>(r4)
            java.lang.String r4 = "chat_merge"
            r5.remove(r4)
            int r4 = r5.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = 0
            java.lang.String[] r10 = new java.lang.String[r6]
            java.lang.Object[] r5 = r5.toArray(r10)
            if (r5 == 0) goto L_0x02b9
            r1.f64976e = r4
            r1.h = r12
            r1.j = r12
            r1.u = r12
            goto L_0x02e3
        L_0x02b9:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x02c1:
            r6 = 0
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r3 = com.ss.android.ugc.aweme.feed.share.i.a((android.content.Context) r13, (com.ss.android.ugc.aweme.web.b.a.a) r10)
            java.lang.String r4 = "VideoShareStruct.createN…ruct(context, mShareInfo)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.String r4 = "web"
            r3.itemType = r4
            r1.h = r12
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareOrderService> r5 = com.ss.android.ugc.aweme.share.ShareOrderService.class
            java.lang.Object r4 = r4.getService(r5)
            com.ss.android.ugc.aweme.share.ShareOrderService r4 = (com.ss.android.ugc.aweme.share.ShareOrderService) r4
            java.lang.String[] r4 = r4.getUrlShareList(r12)
            r1.f64976e = r4
        L_0x02e3:
            java.util.ArrayList<java.lang.String> r4 = r7.g
            java.lang.String r5 = "browser"
            boolean r4 = r4.contains(r5)
            r1.j = r4
            java.util.ArrayList<java.lang.String> r4 = r7.g
            java.lang.String r5 = "refresh"
            boolean r4 = r4.contains(r5)
            r1.k = r4
            java.util.ArrayList<java.lang.String> r4 = r7.g
            java.lang.String r5 = "qrcode"
            boolean r4 = r4.contains(r5)
            r4 = r4 ^ r12
            r1.h = r4
            java.util.ArrayList<java.lang.String> r4 = r7.g
            java.lang.String r5 = "copylink"
            boolean r4 = r4.contains(r5)
            r1.t = r4
            r1.a(r11)
            r10 = r22
            r1.y = r10
            r1.l = r12
            java.lang.String r4 = "share_native"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r8, r4)
            if (r4 != 0) goto L_0x032c
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareResult r0 = r0.share(r2, r3, r14)
            if (r0 == 0) goto L_0x032a
            boolean r0 = r0.success
            if (r0 == 0) goto L_0x032a
            r6 = 1
        L_0x032a:
            r11 = r6
            goto L_0x0354
        L_0x032c:
            com.ss.android.ugc.aweme.share.SimpleShareDialog r11 = new com.ss.android.ugc.aweme.share.SimpleShareDialog
            r11.<init>(r2, r1)
            r11.updateShareStruct(r3)
            com.ss.android.ugc.aweme.fe.method.ShareMethod$b r14 = new com.ss.android.ugc.aweme.fe.method.ShareMethod$b
            r0 = r14
            r1 = r24
            r4 = r13
            r5 = r15
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.framework.services.IShareService$IActionHandler r14 = (com.ss.android.ugc.aweme.framework.services.IShareService.IActionHandler) r14
            r11.setActionHandler(r14)
            com.ss.android.ugc.aweme.fe.method.ShareMethod$c r0 = new com.ss.android.ugc.aweme.fe.method.ShareMethod$c
            r1 = r23
            r0.<init>(r1)
            com.ss.android.ugc.aweme.framework.services.IShareService$OnShareCallback r0 = (com.ss.android.ugc.aweme.framework.services.IShareService.OnShareCallback) r0
            r11.setShareCallback(r0)
            r11.show()
            r11 = 1
        L_0x0354:
            if (r11 != 0) goto L_0x03ad
            java.lang.String r0 = "weixin"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 != 0) goto L_0x03a0
            java.lang.String r0 = "weixin_moments"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x036b
            goto L_0x03a0
        L_0x036b:
            java.lang.String r0 = "qq"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 != 0) goto L_0x0395
            java.lang.String r0 = "qzone"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x0380
            goto L_0x0395
        L_0x0380:
            java.lang.String r0 = "weibo"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x03ad
            r0 = 2131564641(0x7f0d1861, float:1.8754773E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r13, (int) r0)
            r0.a()
            goto L_0x03ad
        L_0x0395:
            r0 = 2131561940(0x7f0d0dd4, float:1.8749295E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r13, (int) r0)
            r0.a()
            goto L_0x03ad
        L_0x03a0:
            r0 = 2131564653(0x7f0d186d, float:1.8754797E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r13, (int) r0)
            r0.a()
            goto L_0x03ad
        L_0x03ab:
            r6 = 0
        L_0x03ac:
            r11 = 0
        L_0x03ad:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "code"
            if (r11 == 0) goto L_0x03b9
            int r2 = com.ss.android.ugc.aweme.framework.c.a.f48479c
            goto L_0x03bb
        L_0x03b9:
            int r2 = com.ss.android.ugc.aweme.framework.c.a.f48480d
        L_0x03bb:
            r0.put(r1, r2)
            r9.a((org.json.JSONObject) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.ShareMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
