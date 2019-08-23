package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/OpenBrowserMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "openHttp", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OpenBrowserMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44462a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44463b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/OpenBrowserMethod$Companion;", "", "()V", "BRIDGE_NAME_OPEN_BROWSER", "", "KEY_ARGS", "KEY_TYPE", "KEY_URL", "USE_EXTERNAL_BROWSER", "VALUE_WEB_VIEW", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "successOpen", "", "sendLog"}, k = 3, mv = {1, 1, 15})
    static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f44465b;

        b(Context context) {
            this.f44465b = context;
        }

        public final void a(boolean z) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44464a, false, 39790, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44464a, false, 39790, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            d.b a2 = d.a().a("draw_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            a2.b(str).a(this.f44465b);
        }
    }

    public OpenBrowserMethod() {
        this(null, 1);
    }

    public OpenBrowserMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    private /* synthetic */ OpenBrowserMethod(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0149 A[Catch:{ Exception -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014f A[Catch:{ Exception -> 0x015d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull org.json.JSONObject r11, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f44462a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39788(0x9b6c, float:5.5755E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f44462a
            r3 = 0
            r4 = 39788(0x9b6c, float:5.5755E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "iReturn"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.ref.WeakReference r0 = r10.f3123e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "url"
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x015d }
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x015d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x015d }
            if (r2 == 0) goto L_0x0063
        L_0x0060:
            r1 = 0
            goto L_0x0147
        L_0x0063:
            java.lang.String r2 = "url"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ Exception -> 0x015d }
            if (r1 == 0) goto L_0x0155
            java.lang.String r2 = r1.toLowerCase()     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = "http://"
            r4 = 0
            boolean r3 = kotlin.text.StringsKt.startsWith$default(r2, r3, r8, r7, r4)     // Catch:{ Exception -> 0x015d }
            if (r3 != 0) goto L_0x00ad
            java.lang.String r3 = "https://"
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r2, r3, r8, r7, r4)     // Catch:{ Exception -> 0x015d }
            if (r2 == 0) goto L_0x0085
            goto L_0x00ad
        L_0x0085:
            if (r0 != 0) goto L_0x0088
            goto L_0x0060
        L_0x0088:
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r0, (java.lang.String) r1, (boolean) r8)     // Catch:{ Exception -> 0x015d }
            if (r1 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = com.ss.android.ugc.aweme.commercialize.log.d.a()     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.a((java.lang.String) r3)     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.b((java.lang.String) r3)     // Catch:{ Exception -> 0x015d }
            r2.a((android.content.Context) r0)     // Catch:{ Exception -> 0x015d }
            com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b r2 = new com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b     // Catch:{ Exception -> 0x015d }
            r2.<init>(r0)     // Catch:{ Exception -> 0x015d }
            com.ss.android.ugc.aweme.commercialize.utils.g$a r2 = (com.ss.android.ugc.aweme.commercialize.utils.g.a) r2     // Catch:{ Exception -> 0x015d }
            com.ss.android.ugc.aweme.commercialize.utils.g.a((com.ss.android.ugc.aweme.commercialize.utils.g.a) r2)     // Catch:{ Exception -> 0x015d }
            goto L_0x0147
        L_0x00ad:
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x015d }
            r0[r8] = r11     // Catch:{ Exception -> 0x015d }
            com.meituan.robust.ChangeQuickRedirect r2 = f44462a     // Catch:{ Exception -> 0x015d }
            r3 = 0
            r4 = 39789(0x9b6d, float:5.5756E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x015d }
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1     // Catch:{ Exception -> 0x015d }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x015d }
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x015d }
            if (r0 == 0) goto L_0x00e5
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x015d }
            r0[r8] = r11     // Catch:{ Exception -> 0x015d }
            com.meituan.robust.ChangeQuickRedirect r2 = f44462a     // Catch:{ Exception -> 0x015d }
            r3 = 0
            r4 = 39789(0x9b6d, float:5.5756E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x015d }
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1     // Catch:{ Exception -> 0x015d }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x015d }
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x015d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x015d }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x015d }
            r9 = r0
            goto L_0x0146
        L_0x00e5:
            java.lang.ref.WeakReference r0 = r10.f3123e     // Catch:{ Exception -> 0x015d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x015d }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x015d }
            java.lang.String r1 = "url"
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x015d }
            if (r0 == 0) goto L_0x012d
            java.lang.String r2 = "use_external_browser"
            boolean r2 = r11.optBoolean(r2, r8)     // Catch:{ Exception -> 0x015d }
            if (r2 == 0) goto L_0x012d
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r4 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x015d }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x015d }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r3)     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = "android.intent.category.BROWSABLE"
            r2.addCategory(r3)     // Catch:{ Exception -> 0x015d }
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ Exception -> 0x015d }
            r4 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r2, r4)     // Catch:{ Exception -> 0x015d }
            if (r3 == 0) goto L_0x012d
            android.content.pm.ActivityInfo r1 = r3.activityInfo     // Catch:{ Exception -> 0x015d }
            java.lang.String r1 = r1.packageName     // Catch:{ Exception -> 0x015d }
            android.content.pm.ActivityInfo r3 = r3.activityInfo     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = r3.name     // Catch:{ Exception -> 0x015d }
            r2.setClassName(r1, r3)     // Catch:{ Exception -> 0x015d }
            r0.startActivity(r2)     // Catch:{ Exception -> 0x015d }
            goto L_0x0146
        L_0x012d:
            java.lang.String r2 = "type"
            java.lang.String r3 = "webview"
            r11.put(r2, r3)     // Catch:{ Exception -> 0x015d }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x015d }
            r2.<init>()     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = "url"
            r2.put(r3, r1)     // Catch:{ Exception -> 0x015d }
            java.lang.String r1 = "args"
            r11.put(r1, r2)     // Catch:{ Exception -> 0x015d }
            com.ss.android.ugc.aweme.fe.b.a.a((android.content.Context) r0, (org.json.JSONObject) r11)     // Catch:{ Exception -> 0x015d }
        L_0x0146:
            r1 = r9
        L_0x0147:
            if (r1 == 0) goto L_0x014f
            java.lang.String r0 = ""
            r12.a((java.lang.Object) r0)     // Catch:{ Exception -> 0x015d }
            return
        L_0x014f:
            java.lang.String r0 = ""
            r12.a(r8, r0)     // Catch:{ Exception -> 0x015d }
            return
        L_0x0155:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x015d }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ Exception -> 0x015d }
            throw r0     // Catch:{ Exception -> 0x015d }
        L_0x015d:
            java.lang.String r0 = ""
            r12.a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
