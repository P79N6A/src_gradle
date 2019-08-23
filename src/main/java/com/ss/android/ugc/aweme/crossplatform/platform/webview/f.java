package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.net.cronet.IIESNetworkApi;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.api.m;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/TTNetInterceptor;", "", "()V", "getContentType", "", "headers", "", "Lcom/bytedance/retrofit2/client/Header;", "getMimeType", "contentType", "getTTNetResponse", "Lcom/bytedance/retrofit2/SsResponse;", "Lcom/bytedance/retrofit2/mime/TypedInput;", "ref", "url", "intercept", "Landroid/webkit/WebResourceResponse;", "loadTTNetResponse", "ssResponse", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40980a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f40981b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final IIESNetworkApi f40982c = ((IIESNetworkApi) m.b("https://aweme.snssdk.com").create(IIESNetworkApi.class));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/TTNetInterceptor$Companion;", "", "()V", "STATUS_CODE", "", "S_API", "Lcom/bytedance/ies/net/cronet/IIESNetworkApi;", "kotlin.jvm.PlatformType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x024e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.webkit.WebResourceResponse a(com.bytedance.retrofit2.SsResponse<com.bytedance.retrofit2.mime.TypedInput> r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f40980a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r3 = com.bytedance.retrofit2.SsResponse.class
            r7[r9] = r3
            java.lang.Class<android.webkit.WebResourceResponse> r8 = android.webkit.WebResourceResponse.class
            r5 = 0
            r6 = 34499(0x86c3, float:4.8343E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f40980a
            r13 = 0
            r14 = 34499(0x86c3, float:4.8343E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r0 = com.bytedance.retrofit2.SsResponse.class
            r15[r9] = r0
            java.lang.Class<android.webkit.WebResourceResponse> r16 = android.webkit.WebResourceResponse.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.webkit.WebResourceResponse r0 = (android.webkit.WebResourceResponse) r0
            return r0
        L_0x0037:
            r2 = 0
            if (r18 == 0) goto L_0x02be
            java.util.List r3 = r18.headers()
            java.lang.String r4 = "ssResponse.headers()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = f40980a
            r13 = 0
            r14 = 34498(0x86c2, float:4.8342E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r15[r9] = r4
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0078
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = f40980a
            r13 = 0
            r14 = 34498(0x86c2, float:4.8342E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r15[r9] = r3
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x00d9
        L_0x0078:
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.ss.android.ugc.aweme.base.utils.j.a((java.util.Collection<T>) r4)
            if (r4 != 0) goto L_0x00d7
            java.util.Iterator r3 = r3.iterator()
        L_0x0085:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d7
            java.lang.Object r4 = r3.next()
            com.bytedance.retrofit2.client.Header r4 = (com.bytedance.retrofit2.client.Header) r4
            java.lang.String r5 = r4.getName()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0085
            java.lang.String r5 = r4.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0085
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "header.name"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            if (r5 == 0) goto L_0x00cf
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.String r6 = "content-type"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0085
            java.lang.String r3 = r4.getValue()
            java.lang.String r4 = "header.value"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            goto L_0x00d9
        L_0x00cf:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00d7:
            java.lang.String r3 = ""
        L_0x00d9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "contentType:"
            r4.<init>(r5)
            r4.append(r3)
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00ed
            return r2
        L_0x00ed:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = f40980a
            r13 = 0
            r14 = 34500(0x86c4, float:4.8345E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r15[r9] = r5
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x0124
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = f40980a
            r13 = 0
            r14 = 34500(0x86c4, float:4.8345E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r15[r9] = r4
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r4 = (java.lang.String) r4
        L_0x0121:
            r6 = r4
            goto L_0x023b
        L_0x0124:
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x012d
            r6 = r2
            goto L_0x023b
        L_0x012d:
            if (r3 == 0) goto L_0x02b6
            java.lang.String r4 = r3.toLowerCase()
            java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            r10 = r4
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r5 = "js"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 2
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 != 0) goto L_0x0237
            java.lang.String r5 = "application/javascript"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 != 0) goto L_0x0237
            java.lang.String r5 = "javascript"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x015c
            goto L_0x0237
        L_0x015c:
            java.lang.String r5 = "text/css"
            boolean r5 = kotlin.text.StringsKt.endsWith$default(r4, r5, r9, r6, r2)
            if (r5 != 0) goto L_0x0233
            java.lang.String r5 = "css"
            boolean r5 = kotlin.text.StringsKt.endsWith$default(r4, r5, r9, r6, r2)
            if (r5 == 0) goto L_0x016e
            goto L_0x0233
        L_0x016e:
            java.lang.String r5 = "test/html"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 != 0) goto L_0x022f
            java.lang.String r5 = "html"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x0184
            goto L_0x022f
        L_0x0184:
            java.lang.String r5 = "image"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x01af
            java.lang.String r11 = ";"
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            int r5 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r10, (java.lang.String) r11, (int) r12, (boolean) r13, (int) r14, (java.lang.Object) r15)
            if (r5 < 0) goto L_0x0121
            if (r4 == 0) goto L_0x01a7
            java.lang.String r4 = r4.substring(r9, r5)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            goto L_0x0121
        L_0x01a7:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x01af:
            java.lang.String r5 = "jpeg"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 != 0) goto L_0x022b
            java.lang.String r5 = "jpg"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x01c4
            goto L_0x022b
        L_0x01c4:
            java.lang.String r5 = "png"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x01d2
            java.lang.String r4 = "image/png"
            goto L_0x0121
        L_0x01d2:
            java.lang.String r5 = "gif"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x01e0
            java.lang.String r4 = "image/gif"
            goto L_0x0121
        L_0x01e0:
            java.lang.String r5 = "woff"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x01ee
            java.lang.String r4 = "font/woff"
            goto L_0x0121
        L_0x01ee:
            java.lang.String r5 = "svg"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x01fc
            java.lang.String r4 = "image/svg+xml"
            goto L_0x0121
        L_0x01fc:
            java.lang.String r5 = ".ttf"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r5, (boolean) r9, (int) r6, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x020a
            java.lang.String r4 = "font/ttf"
            goto L_0x0121
        L_0x020a:
            java.lang.String r11 = ";"
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            int r5 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r10, (java.lang.String) r11, (int) r12, (boolean) r13, (int) r14, (java.lang.Object) r15)
            if (r5 < 0) goto L_0x0121
            if (r4 == 0) goto L_0x0223
            java.lang.String r4 = r4.substring(r9, r5)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            goto L_0x0121
        L_0x0223:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x022b:
            java.lang.String r4 = "image/jpeg"
            goto L_0x0121
        L_0x022f:
            java.lang.String r4 = "text/html"
            goto L_0x0121
        L_0x0233:
            java.lang.String r4 = "text/css"
            goto L_0x0121
        L_0x0237:
            java.lang.String r4 = "application/x-javascript"
            goto L_0x0121
        L_0x023b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mime:"
            r4.<init>(r5)
            r4.append(r6)
            r4 = r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x024f
            return r2
        L_0x024f:
            java.lang.String r7 = ""
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x02be }
            r4.<init>()     // Catch:{ Exception -> 0x02be }
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x02be }
            java.lang.String r8 = "Access-Control-Allow-Origin"
            java.lang.String r9 = "*"
            r5.put(r8, r9)     // Catch:{ Exception -> 0x02be }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02be }
            r8 = 21
            if (r5 < r8) goto L_0x0286
            java.lang.String r5 = "font/ttf"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r3)     // Catch:{ Exception -> 0x02be }
            if (r3 == 0) goto L_0x0286
            java.lang.String r9 = "OK"
            android.webkit.WebResourceResponse r1 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x02be }
            r8 = 200(0xc8, float:2.8E-43)
            r10 = r4
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ Exception -> 0x02be }
            java.lang.Object r0 = r18.body()     // Catch:{ Exception -> 0x02be }
            com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0     // Catch:{ Exception -> 0x02be }
            java.io.InputStream r11 = r0.in()     // Catch:{ Exception -> 0x02be }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x02be }
            goto L_0x02b5
        L_0x0286:
            android.webkit.WebResourceResponse r3 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x02be }
            java.lang.Object r0 = r18.body()     // Catch:{ Exception -> 0x02be }
            com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0     // Catch:{ Exception -> 0x02be }
            java.io.InputStream r0 = r0.in()     // Catch:{ Exception -> 0x02be }
            r3.<init>(r6, r7, r0)     // Catch:{ Exception -> 0x02be }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02be }
            if (r0 < r8) goto L_0x029f
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x02be }
            r3.setResponseHeaders(r4)     // Catch:{ Exception -> 0x02be }
            goto L_0x02b4
        L_0x029f:
            java.lang.Class r0 = r3.getClass()     // Catch:{ Throwable -> 0x02b4 }
            java.lang.String r5 = "mResponseHeaders"
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch:{ Throwable -> 0x02b4 }
            java.lang.String r5 = "headerField"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r5)     // Catch:{ Throwable -> 0x02b4 }
            r0.setAccessible(r1)     // Catch:{ Throwable -> 0x02b4 }
            r0.set(r3, r4)     // Catch:{ Throwable -> 0x02b4 }
        L_0x02b4:
            r1 = r3
        L_0x02b5:
            return r1
        L_0x02b6:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x02be:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.f.a(com.bytedance.retrofit2.SsResponse):android.webkit.WebResourceResponse");
    }

    @Nullable
    public final WebResourceResponse a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f40980a, false, 34496, new Class[]{String.class, String.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f40980a, false, 34496, new Class[]{String.class, String.class}, WebResourceResponse.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "ref");
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.WEB_URL);
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return a(b(str, str2));
    }

    private final SsResponse<TypedInput> b(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, this, f40980a, false, 34497, new Class[]{String.class, String.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{str3, str2}, this, f40980a, false, 34497, new Class[]{String.class, String.class}, SsResponse.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Header("accept", "*/*"));
        arrayList.add(new Header("accept-encoding", "gzip, deflate, br"));
        arrayList.add(new Header("accept-language", "en-GB,en;q=0.9,zh-CN;q=0.8,zh-TW;q=0.7,zh;q=0.6,en-US;q=0.5"));
        arrayList.add(new Header("x-requested-with", "com.ss.android.ugc.aweme"));
        arrayList.add(new Header("ttnet", PushConstants.PUSH_TYPE_THROUGH_MESSAGE));
        if (!Intrinsics.areEqual((Object) str, (Object) str2)) {
            arrayList.add(new Header("referer", str3));
        }
        try {
            SsResponse<TypedInput> execute = f40982c.downloadFile(false, -1, str2, null, arrayList).execute();
            Intrinsics.checkExpressionValueIsNotNull(execute, "response");
            if (execute.isSuccessful()) {
                return execute;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
