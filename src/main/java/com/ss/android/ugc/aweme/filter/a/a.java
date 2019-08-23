package com.ss.android.ugc.aweme.filter.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.c.b.b;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0014J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/downloader/FilterDownloadTask;", "Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "Ljava/lang/Void;", "mTaskId", "", "mParam", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/filter/FilterBean;)V", "mDownloadUrlIndex", "", "onExec", "", "callback", "Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskExecCallback;", "onSkip", "shouldSkip", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends b<h, Void> {
    public static ChangeQuickRedirect g;
    public static final C0568a h = new C0568a((byte) 0);
    private int i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/downloader/FilterDownloadTask$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.filter.a.a$a  reason: collision with other inner class name */
    public static final class C0568a {
        private C0568a() {
        }

        public /* synthetic */ C0568a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 44443, new Class[0], Boolean.TYPE)) {
            return v.a().c(((h) this.f43733f).f47598b);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 44443, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b(@NotNull com.ss.android.ugc.aweme.effect.c.a.b<h, Void> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, g, false, 44445, new Class[]{com.ss.android.ugc.aweme.effect.c.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, g, false, 44445, new Class[]{com.ss.android.ugc.aweme.effect.c.a.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        v.a().b((h) this.f43733f);
        bVar.b(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01e9, code lost:
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ec, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01ed, code lost:
        r1 = r23;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01e8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:28:0x01a1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.effect.c.a.b<com.ss.android.ugc.aweme.filter.h, java.lang.Void> r27) {
        /*
            r26 = this;
            r8 = r26
            r0 = r27
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = g
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.effect.c.a.b> r2 = com.ss.android.ugc.aweme.effect.c.a.b.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 44444(0xad9c, float:6.228E-41)
            r2 = r26
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = g
            r4 = 0
            r5 = 44444(0xad9c, float:6.228E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.effect.c.a.b> r0 = com.ss.android.ugc.aweme.effect.c.a.b.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0038:
            java.lang.String r1 = "callback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.filter.v r1 = com.ss.android.ugc.aweme.filter.v.a()
            Param r2 = r8.f43733f
            com.ss.android.ugc.aweme.filter.h r2 = (com.ss.android.ugc.aweme.filter.h) r2
            int r2 = r2.f47598b
            java.lang.String r1 = r1.a((int) r2)
            Param r2 = r8.f43733f
            com.ss.android.ugc.aweme.filter.h r2 = (com.ss.android.ugc.aweme.filter.h) r2
            com.ss.android.ugc.aweme.tools.bb r2 = r2.f47601e
            r3 = -1
            if (r2 == 0) goto L_0x0213
            Param r2 = r8.f43733f
            com.ss.android.ugc.aweme.filter.h r2 = (com.ss.android.ugc.aweme.filter.h) r2
            com.ss.android.ugc.aweme.tools.bb r2 = r2.f47601e
            if (r2 == 0) goto L_0x005f
            java.util.List<java.lang.String> r2 = r2.f74653c
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r2)
            if (r2 == 0) goto L_0x0068
            goto L_0x0213
        L_0x0068:
            Param r2 = r8.f43733f
            com.ss.android.ugc.aweme.filter.h r2 = (com.ss.android.ugc.aweme.filter.h) r2
            com.ss.android.ugc.aweme.tools.bb r2 = r2.f47601e
            java.lang.String r5 = "mParam.resource"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            java.util.List<java.lang.String> r2 = r2.f74653c
            int r2 = r2.size()
            int r5 = r8.i
            int r5 = r5 % r2
            r8.i = r5
            Param r2 = r8.f43733f
            com.ss.android.ugc.aweme.filter.h r2 = (com.ss.android.ugc.aweme.filter.h) r2
            com.ss.android.ugc.aweme.tools.bb r2 = r2.f47601e
            java.lang.String r5 = "mParam.resource"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            java.util.List<java.lang.String> r2 = r2.f74653c
            int r5 = r8.i
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.aweme.filter.a.c r5 = new com.ss.android.ugc.aweme.filter.a.c
            r6 = r8
            com.ss.android.ugc.aweme.effect.c.b.b r6 = (com.ss.android.ugc.aweme.effect.c.b.b) r6
            r5.<init>(r6, r0)
            com.ss.android.ugc.aweme.property.a r0 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r6 = com.ss.android.ugc.aweme.property.a.C0682a.FilterDownloaderUseTTNet
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto L_0x020d
            com.ss.android.ugc.aweme.filter.ba r0 = com.ss.android.ugc.aweme.filter.ba.f47553b
            java.lang.String r6 = "filterDownloadUrl"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)
            java.lang.String r6 = "filterDownloadDir"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            com.ss.android.ugc.aweme.common.b.a$a r5 = (com.ss.android.ugc.aweme.common.b.a.C0521a) r5
            r6 = 3
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r2
            r11[r9] = r1
            r7 = 2
            r11[r7] = r5
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.ba.f47552a
            r14 = 0
            r15 = 44434(0xad92, float:6.2265E-41)
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r10] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r9] = r16
            java.lang.Class<com.ss.android.ugc.aweme.common.b.a$a> r16 = com.ss.android.ugc.aweme.common.b.a.C0521a.class
            r12[r7] = r16
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r12
            r12 = r0
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0102
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r2
            r11[r9] = r1
            r11[r7] = r5
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.ba.f47552a
            r14 = 0
            r15 = 44434(0xad92, float:6.2265E-41)
            java.lang.Class[] r1 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.common.b.a$a> r2 = com.ss.android.ugc.aweme.common.b.a.C0521a.class
            r1[r7] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0212
        L_0x0102:
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x0208 }
            r0.<init>()     // Catch:{ Exception -> 0x0208 }
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x0208 }
            android.util.Pair r6 = com.bytedance.frameworks.baselib.network.http.util.UrlUtils.parseUrl(r2, r6)     // Catch:{ Exception -> 0x0208 }
            java.lang.String r7 = "UrlUtils.parseUrl(url, queryMap)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)     // Catch:{ Exception -> 0x0208 }
            java.lang.Object r7 = r6.first     // Catch:{ Exception -> 0x0208 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0208 }
            java.lang.Object r6 = r6.second     // Catch:{ Exception -> 0x0208 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0208 }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r11 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x0208 }
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r12 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
            java.lang.Object r11 = r11.getService(r12)     // Catch:{ Exception -> 0x0208 }
            com.ss.android.ugc.aweme.framework.services.IRetrofitService r11 = (com.ss.android.ugc.aweme.framework.services.IRetrofitService) r11     // Catch:{ Exception -> 0x0208 }
            com.ss.android.ugc.aweme.framework.services.IRetrofit r7 = r11.createNewRetrofit(r7)     // Catch:{ Exception -> 0x0208 }
            java.lang.Class<com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI> r11 = com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI.class
            java.lang.Object r7 = r7.create(r11)     // Catch:{ Exception -> 0x0208 }
            com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI r7 = (com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI) r7     // Catch:{ Exception -> 0x0208 }
            r11 = 2147483647(0x7fffffff, float:NaN)
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0208 }
            com.bytedance.retrofit2.Call r0 = r7.doGet(r9, r11, r6, r0)     // Catch:{ Exception -> 0x0208 }
            com.bytedance.retrofit2.SsResponse r0 = r0.execute()     // Catch:{ Exception -> 0x0208 }
            java.lang.Object r6 = r0.body()     // Catch:{ Exception -> 0x0208 }
            com.bytedance.retrofit2.mime.TypedInput r6 = (com.bytedance.retrofit2.mime.TypedInput) r6     // Catch:{ Exception -> 0x0208 }
            java.io.InputStream r6 = r6.in()     // Catch:{ Exception -> 0x0208 }
            java.lang.Object r0 = r0.body()     // Catch:{ Exception -> 0x0208 }
            com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0     // Catch:{ Exception -> 0x0208 }
            long r14 = r0.length()     // Catch:{ Exception -> 0x0208 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0208 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0208 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x0208 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0208 }
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ Exception -> 0x0208 }
            r1.<init>()     // Catch:{ Exception -> 0x0208 }
            r1.element = r10     // Catch:{ Exception -> 0x0208 }
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ Exception -> 0x0208 }
            r7.<init>()     // Catch:{ Exception -> 0x0208 }
            r7.element = r10     // Catch:{ Exception -> 0x0208 }
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x0208 }
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch:{ Exception -> 0x0208 }
            r21 = r6
            java.io.InputStream r21 = (java.io.InputStream) r21     // Catch:{ Throwable -> 0x0200, all -> 0x01fd }
            r13 = r0
            java.io.Closeable r13 = (java.io.Closeable) r13     // Catch:{ Throwable -> 0x0200, all -> 0x01fd }
            r12 = r13
            java.io.FileOutputStream r12 = (java.io.FileOutputStream) r12     // Catch:{ Throwable -> 0x01f4, all -> 0x01f0 }
        L_0x018b:
            com.ss.android.ugc.aweme.filter.ba$a r22 = new com.ss.android.ugc.aweme.filter.ba$a     // Catch:{ Throwable -> 0x01f4, all -> 0x01f0 }
            r11 = r22
            r4 = r12
            r12 = r21
            r23 = r13
            r13 = r0
            r24 = r14
            r14 = r1
            r15 = r9
            r16 = r7
            r17 = r5
            r18 = r2
            r19 = r24
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Throwable -> 0x01ec, all -> 0x01e8 }
            kotlin.jvm.functions.Function0 r22 = (kotlin.jvm.functions.Function0) r22     // Catch:{ Throwable -> 0x01ec, all -> 0x01e8 }
            java.lang.Object r11 = r22.invoke()     // Catch:{ Throwable -> 0x01ec, all -> 0x01e8 }
            java.lang.Number r11 = (java.lang.Number) r11     // Catch:{ Throwable -> 0x01ec, all -> 0x01e8 }
            int r11 = r11.intValue()     // Catch:{ Throwable -> 0x01ec, all -> 0x01e8 }
            if (r11 == r3) goto L_0x01db
            int r11 = r7.element     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            int r12 = r1.element     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            int r11 = r11 + r12
            r7.element = r11     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            int r11 = r7.element     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            float r11 = (float) r11     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            r12 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 * r12
            r12 = r24
            float r14 = (float) r12     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            float r11 = r11 / r14
            r14 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r14
            int r11 = (int) r11     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            r5.a((java.lang.String) r2, (int) r11)     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            int r11 = r1.element     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            r4.write(r9, r10, r11)     // Catch:{ Throwable -> 0x01d6, all -> 0x01e8 }
            r14 = r12
            r13 = r23
            r12 = r4
            goto L_0x018b
        L_0x01d6:
            r0 = move-exception
            r4 = r0
            r1 = r23
            goto L_0x01f7
        L_0x01db:
            r1 = r23
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ Throwable -> 0x0200, all -> 0x01fd }
            kotlin.io.CloseableKt.closeFinally(r6, r3)     // Catch:{ Exception -> 0x0208 }
            r5.a(r2)     // Catch:{ Exception -> 0x0208 }
            goto L_0x0212
        L_0x01e8:
            r0 = move-exception
            r1 = r23
            goto L_0x01f2
        L_0x01ec:
            r0 = move-exception
            r1 = r23
            goto L_0x01f6
        L_0x01f0:
            r0 = move-exception
            r1 = r13
        L_0x01f2:
            r4 = 0
            goto L_0x01f9
        L_0x01f4:
            r0 = move-exception
            r1 = r13
        L_0x01f6:
            r4 = r0
        L_0x01f7:
            throw r4     // Catch:{ all -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
        L_0x01f9:
            kotlin.io.CloseableKt.closeFinally(r1, r4)     // Catch:{ Throwable -> 0x0200, all -> 0x01fd }
            throw r0     // Catch:{ Throwable -> 0x0200, all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            r4 = 0
            goto L_0x0204
        L_0x0200:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch:{ all -> 0x0203 }
        L_0x0203:
            r0 = move-exception
        L_0x0204:
            kotlin.io.CloseableKt.closeFinally(r6, r4)     // Catch:{ Exception -> 0x0208 }
            throw r0     // Catch:{ Exception -> 0x0208 }
        L_0x0208:
            r0 = move-exception
            r5.a((java.lang.String) r2, (java.lang.Exception) r0)
            return
        L_0x020d:
            com.ss.android.ugc.aweme.common.b.a$a r5 = (com.ss.android.ugc.aweme.common.b.a.C0521a) r5
            com.ss.android.ugc.aweme.common.b.a.a(r2, r1, r5)
        L_0x0212:
            return
        L_0x0213:
            com.ss.android.ugc.aweme.effect.c.b.e r1 = new com.ss.android.ugc.aweme.effect.c.b.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = ""
            r4 = 0
            r1.<init>(r2, r3, r4)
            r8.f43732e = r1
            r1 = r8
            com.ss.android.ugc.aweme.effect.c.b.b r1 = (com.ss.android.ugc.aweme.effect.c.b.b) r1
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.a.a.a(com.ss.android.ugc.aweme.effect.c.a.b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull String str, @NotNull h hVar) {
        super(str, hVar);
        Intrinsics.checkParameterIsNotNull(str, "mTaskId");
        Intrinsics.checkParameterIsNotNull(hVar, "mParam");
    }
}
