package com.ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/net/interceptor/ApiAlisgInterceptor;", "Lcom/bytedance/retrofit2/intercept/Interceptor;", "()V", "intercept", "Lcom/bytedance/retrofit2/SsResponse;", "chain", "Lcom/bytedance/retrofit2/intercept/Interceptor$Chain;", "Companion", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ApiAlisgInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56949a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f56950b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final ArrayList<String> f56951c = CollectionsKt.arrayListOf("/service/2/app_log/", "/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");

    /* renamed from: d  reason: collision with root package name */
    private static final ArrayList<String> f56952d = CollectionsKt.arrayListOf("IN", "NP", "PK", "LK");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/net/interceptor/ApiAlisgInterceptor$Companion;", "", "()V", "ALISG_AWEME_HOST", "", "ALISG_LOG_HOST", "ALISG_RTLOG_HOST", "COUNTRY_LIST", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "MALIVE_LOG_HOST", "MALIVE_RTLOG_HOST", "M_FLAVOR", "PATH_LIST", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{chain}, this, f56949a, false, 60910, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return a.a(this, chain);
        }
        return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56949a, false, 60910, new Class[]{Interceptor.Chain.class}, SsResponse.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.SsResponse<?> a(@org.jetbrains.annotations.NotNull com.bytedance.retrofit2.intercept.Interceptor.Chain r18) throws java.lang.Exception {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f56949a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.retrofit2.intercept.Interceptor$Chain> r3 = com.bytedance.retrofit2.intercept.Interceptor.Chain.class
            r7[r9] = r3
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r8 = com.bytedance.retrofit2.SsResponse.class
            r5 = 0
            r6 = 60911(0xedef, float:8.5354E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f56949a
            r13 = 0
            r14 = 60911(0xedef, float:8.5354E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.retrofit2.intercept.Interceptor$Chain> r0 = com.bytedance.retrofit2.intercept.Interceptor.Chain.class
            r15[r9] = r0
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r16 = com.bytedance.retrofit2.SsResponse.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.retrofit2.SsResponse r0 = (com.bytedance.retrofit2.SsResponse) r0
            return r0
        L_0x0039:
            java.lang.String r1 = "chain"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            com.bytedance.retrofit2.client.Request r1 = r18.request()
            java.lang.String r2 = "musically"
            com.ss.android.ugc.aweme.framework.core.a r3 = com.ss.android.ugc.aweme.framework.core.a.b()
            java.lang.String r4 = "AppTracker.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.String r3 = r3.f3305c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00f0
            java.util.ArrayList<java.lang.String> r2 = f56952d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            com.ss.android.ugc.aweme.net.a.q r3 = com.ss.android.ugc.aweme.net.a.q.a()
            r4 = 0
            if (r3 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.net.a.p r3 = r3.f56880b
            if (r3 == 0) goto L_0x0067
            java.lang.String r3 = r3.k
            goto L_0x0068
        L_0x0067:
            r3 = r4
        L_0x0068:
            boolean r2 = kotlin.collections.CollectionsKt.contains(r2, r3)
            if (r2 == 0) goto L_0x00f0
            java.lang.String r2 = "request"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r2 = r1.getPath()
            java.util.ArrayList<java.lang.String> r3 = f56951c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "path"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)
            r6 = 2
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r9, r6, r4)
            if (r5 == 0) goto L_0x007f
            java.lang.String r5 = "request"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            java.lang.String r5 = r1.getUrl()
            okhttp3.HttpUrl r5 = okhttp3.HttpUrl.parse(r5)
            if (r5 == 0) goto L_0x00ab
            okhttp3.HttpUrl$Builder r7 = r5.newBuilder()
            goto L_0x00ac
        L_0x00ab:
            r7 = r4
        L_0x00ac:
            if (r7 == 0) goto L_0x007f
            java.lang.String r5 = r5.host()
            java.lang.String r8 = "/service/2/app_log/"
            boolean r6 = kotlin.text.StringsKt.startsWith$default(r2, r8, r9, r6, r4)
            if (r6 != 0) goto L_0x00c0
            java.lang.String r5 = "api.tiktokv.com"
            r7.host(r5)
            goto L_0x00db
        L_0x00c0:
            java.lang.String r6 = "log2.musical.ly"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00ce
            java.lang.String r5 = "log.tiktokv.com"
            r7.host(r5)
            goto L_0x00db
        L_0x00ce:
            java.lang.String r6 = "rtlog.musical.ly"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00db
            java.lang.String r5 = "rtlog.tiktokv.com"
            r7.host(r5)
        L_0x00db:
            com.bytedance.retrofit2.client.Request$Builder r1 = r1.newBuilder()
            okhttp3.HttpUrl r5 = r7.build()
            java.lang.String r5 = r5.toString()
            com.bytedance.retrofit2.client.Request$Builder r1 = r1.url(r5)
            com.bytedance.retrofit2.client.Request r1 = r1.build()
            goto L_0x007f
        L_0x00f0:
            com.bytedance.retrofit2.SsResponse r0 = r0.proceed(r1)
            java.lang.String r1 = "chain.proceed(request)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptor.a(com.bytedance.retrofit2.intercept.Interceptor$Chain):com.bytedance.retrofit2.SsResponse");
    }
}
