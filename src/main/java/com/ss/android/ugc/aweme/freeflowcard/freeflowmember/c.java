package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson.GsonConverterFactory;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.ttnet.retrofit.SsRetrofitClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.flow.manager.impl.IMobileFlowApi;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/MobileUpdater;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater;", "()V", "mobileAPi", "Lcom/ss/android/ugc/aweme/flow/manager/impl/IMobileFlowApi;", "retrofit", "Lcom/bytedance/retrofit2/Retrofit;", "getPCId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f48655c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f48656d = new c();

    /* renamed from: e  reason: collision with root package name */
    private static Retrofit f48657e;

    /* renamed from: f  reason: collision with root package name */
    private static IMobileFlowApi f48658f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J&\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/freeflowcard/freeflowmember/MobileUpdater$getPCId$2$1", "Lcom/bytedance/retrofit2/Callback;", "Lcom/ss/android/ugc/aweme/flow/manager/impl/CMCCCertify;", "onFailure", "", "call", "Lcom/bytedance/retrofit2/Call;", "t", "", "onResponse", "response", "Lcom/bytedance/retrofit2/SsResponse;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.bytedance.retrofit2.c<com.ss.android.ugc.aweme.flow.manager.impl.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c f48660b;

        a(kotlin.coroutines.c cVar) {
            this.f48660b = cVar;
        }

        public final void a(@NotNull Call<com.ss.android.ugc.aweme.flow.manager.impl.a> call, @Nullable SsResponse<com.ss.android.ugc.aweme.flow.manager.impl.a> ssResponse) {
            if (PatchProxy.isSupport(new Object[]{call, ssResponse}, this, f48659a, false, 46118, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{call, ssResponse}, this, f48659a, false, 46118, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(call, "call");
            if (ssResponse == null) {
                this.f48660b.resumeWith(l.m673constructorimpl(""));
                return;
            }
            com.ss.android.ugc.aweme.flow.manager.impl.a aVar = (com.ss.android.ugc.aweme.flow.manager.impl.a) ssResponse.body();
            if (aVar == null || aVar.f47681e != 0) {
                this.f48660b.resumeWith(l.m673constructorimpl(""));
            } else {
                this.f48660b.resumeWith(l.m673constructorimpl(aVar.f47680d));
            }
        }

        public final void a(@NotNull Call<com.ss.android.ugc.aweme.flow.manager.impl.a> call, @NotNull Throwable th) {
            Call<com.ss.android.ugc.aweme.flow.manager.impl.a> call2 = call;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{call2, th2}, this, f48659a, false, 46119, new Class[]{Call.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{call2, th2}, this, f48659a, false, 46119, new Class[]{Call.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(call2, "call");
            Intrinsics.checkParameterIsNotNull(th2, "t");
            this.f48660b.resumeWith(l.m673constructorimpl(""));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ttnet/retrofit/SsRetrofitClient;", "get"}, k = 3, mv = {1, 1, 15})
    static final class b implements Client.Provider {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48661a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f48662b = new b();

        b() {
        }

        public final /* synthetic */ Client get() {
            SsRetrofitClient ssRetrofitClient;
            if (PatchProxy.isSupport(new Object[0], this, f48661a, false, 46120, new Class[0], SsRetrofitClient.class)) {
                ssRetrofitClient = (SsRetrofitClient) PatchProxy.accessDispatch(new Object[0], this, f48661a, false, 46120, new Class[0], SsRetrofitClient.class);
            } else {
                ssRetrofitClient = new SsRetrofitClient();
            }
            return ssRetrofitClient;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"update", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "MobileUpdater.kt", c = {44, 49}, d = "update", e = "com.ss.android.ugc.aweme.freeflowcard.freeflowmember.MobileUpdater")
    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c$c  reason: collision with other inner class name */
    static final class C0578c extends d {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0578c(c cVar, kotlin.coroutines.c cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46121, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46121, new Class[]{Object.class}, Object.class);
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    private c() {
    }

    static {
        Retrofit a2 = new Retrofit.a().a("http://wap.cmpassport.com").a((Client.Provider) b.f48662b).a((Executor) new com.bytedance.frameworks.baselib.network.http.retrofit.a()).a((Converter.Factory) GsonConverterFactory.create()).a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "Retrofit.Builder()\n     …\n                .build()");
        f48657e = a2;
        Object create = a2.create(IMobileFlowApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "retrofit.create(IMobileFlowApi::class.java)");
        f48658f = (IMobileFlowApi) create;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6 A[SYNTHETIC, Splitter:B:30:0x00c6] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.c<? super com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse> r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f48655c
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<kotlin.coroutines.c> r2 = kotlin.coroutines.c.class
            r6[r9] = r2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 46117(0xb425, float:6.4624E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0035
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f48655c
            r4 = 0
            r5 = 46117(0xb425, float:6.4624E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<kotlin.coroutines.c> r0 = kotlin.coroutines.c.class
            r6[r9] = r0
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0035:
            boolean r1 = r11 instanceof com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c.C0578c
            if (r1 == 0) goto L_0x0049
            r1 = r11
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c$c r1 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c.C0578c) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0049
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x004e
        L_0x0049:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c$c r1 = new com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c$c
            r1.<init>(r10, r11)
        L_0x004e:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.a.b.a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0068;
                case 2: goto L_0x0061;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0061:
            java.lang.Object r1 = r1.L$0
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c r1 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c) r1
            r3 = r1
            goto L_0x00de
        L_0x0068:
            java.lang.Object r3 = r1.L$0
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c r3 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c) r3
            goto L_0x00b4
        L_0x006d:
            boolean r0 = r10.a()
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "can only call update() in IO Thread!!"
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r10.a((java.lang.String) r0)
            return r0
        L_0x007a:
            r1.L$0 = r10
            r1.label = r8
            java.lang.String r0 = "/openapi/wabpGetUseInfo?"
            r3 = 0
            java.lang.String r0 = com.ss.android.ugc.aweme.flow.manager.impl.c.a(r0, r3)
            kotlin.coroutines.g r3 = new kotlin.coroutines.g
            kotlin.coroutines.c r4 = kotlin.coroutines.a.b.a(r1)
            r3.<init>(r4)
            r4 = r3
            kotlin.coroutines.c r4 = (kotlin.coroutines.c) r4
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c r5 = f48656d
            com.ss.android.ugc.aweme.flow.manager.impl.IMobileFlowApi r5 = f48658f
            com.bytedance.retrofit2.Call r0 = r5.getPassCode(r0)
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c$a r5 = new com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c$a
            r5.<init>(r4)
            com.bytedance.retrofit2.c r5 = (com.bytedance.retrofit2.c) r5
            r0.enqueue(r5)
            java.lang.Object r0 = r3.a()
            java.lang.Object r3 = kotlin.coroutines.a.b.a()
            if (r0 != r3) goto L_0x00b0
            kotlin.coroutines.jvm.internal.g.b(r1)
        L_0x00b0:
            if (r0 != r2) goto L_0x00b3
            return r2
        L_0x00b3:
            r3 = r10
        L_0x00b4:
            java.lang.String r0 = (java.lang.String) r0
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00c6
            java.lang.String r0 = "get pcid error"
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r3.a((java.lang.String) r0)
            return r0
        L_0x00c6:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi r4 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi.f48642c     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            com.google.common.util.concurrent.q r4 = r4.a(r0, r5, r6)     // Catch:{ Exception -> 0x00e1 }
            r1.L$0 = r3     // Catch:{ Exception -> 0x00e1 }
            r1.L$1 = r0     // Catch:{ Exception -> 0x00e1 }
            r0 = 2
            r1.label = r0     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r0 = com.ss.android.ugc.aweme.antiaddic.lock.api.a.a(r4, r1)     // Catch:{ Exception -> 0x00e1 }
            if (r0 != r2) goto L_0x00de
            return r2
        L_0x00de:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse) r0     // Catch:{ Exception -> 0x00e1 }
            return r0
        L_0x00e1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = ""
        L_0x00ea:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r3.a((java.lang.String) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.freeflowcard.freeflowmember.c.a(kotlin.coroutines.c):java.lang.Object");
    }
}
