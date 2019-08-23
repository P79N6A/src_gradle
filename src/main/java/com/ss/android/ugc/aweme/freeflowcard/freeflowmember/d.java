package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomUpdater;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater;", "()V", "CLIENT_ID", "", "CLIENT_TYPE", "FORMAT", "VERSION", "update", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f48663c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f48664d = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"update", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "TelecomUpdater.kt", c = {28, 38, 56}, d = "update", e = "com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomUpdater")
    static final class a extends kotlin.coroutines.jvm.internal.d {
        public static ChangeQuickRedirect changeQuickRedirect;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, c cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46131, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46131, new Class[]{Object.class}, Object.class);
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    private d() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomOpenIdDataResponse) r0;
        r4 = r0.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0302, code lost:
        if (r0.getResult() == 0) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0304, code lost:
        r3 = "errorCode:" + r0.getResult() + " errorMsg:" + r0.getMsg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0327, code lost:
        if (r0.getResCode() == 0) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0329, code lost:
        r3 = "errorCode:" + r0.getResCode() + " errorMsg:" + r0.getResMsg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x034f, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0356, code lost:
        return new com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0357, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0385 A[SYNTHETIC, Splitter:B:106:0x0385] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015c A[SYNTHETIC, Splitter:B:46:0x015c] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.c<? super com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse> r28) {
        /*
            r27 = this;
            r8 = r27
            r0 = r28
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f48663c
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<kotlin.coroutines.c> r2 = kotlin.coroutines.c.class
            r6[r10] = r2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 46130(0xb432, float:6.4642E-41)
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f48663c
            r4 = 0
            r5 = 46130(0xb432, float:6.4642E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<kotlin.coroutines.c> r0 = kotlin.coroutines.c.class
            r6[r10] = r0
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r2 = r27
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x003b:
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d.a
            if (r1 == 0) goto L_0x004f
            r1 = r0
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d$a r1 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d.a) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x004f
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x0054
        L_0x004f:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d$a r1 = new com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d$a
            r1.<init>(r8, r0)
        L_0x0054:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.a.b.a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0087;
                case 2: goto L_0x006e;
                case 3: goto L_0x0067;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0067:
            java.lang.Object r1 = r1.L$0
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d r1 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d) r1
            r11 = r1
            goto L_0x03a5
        L_0x006e:
            java.lang.Object r3 = r1.L$4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r1.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.L$1
            java.lang.String r7 = (java.lang.String) r7
            long r9 = r1.J$0
            java.lang.Object r11 = r1.L$0
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d r11 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d) r11
            r12 = r9
            goto L_0x02f8
        L_0x0087:
            java.lang.Object r3 = r1.L$4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r1.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.L$1
            java.lang.String r7 = (java.lang.String) r7
            long r11 = r1.J$0
            java.lang.Object r13 = r1.L$0
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d r13 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d) r13
            goto L_0x0125
        L_0x009f:
            boolean r0 = r27.a()
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "can only call update() in IO Thread!!"
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r8.a((java.lang.String) r0)
            return r0
        L_0x00ac:
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "802384700230100json"
            r0.<init>(r3)
            r0.append(r11)
            java.lang.String r3 = "v1.5"
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.String r6 = ""
            java.lang.String r5 = ""
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi r0 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi.f48642c     // Catch:{ Exception -> 0x0134 }
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0134 }
            r13[r10] = r7     // Catch:{ Exception -> 0x0134 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi.f48640a     // Catch:{ Exception -> 0x0134 }
            r16 = 0
            r17 = 46097(0xb411, float:6.4596E-41)
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0134 }
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r14[r10] = r18     // Catch:{ Exception -> 0x0134 }
            java.lang.Class<com.google.common.util.concurrent.q> r19 = com.google.common.util.concurrent.q.class
            r18 = r14
            r14 = r0
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0134 }
            if (r13 == 0) goto L_0x0104
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0134 }
            r13[r10] = r7     // Catch:{ Exception -> 0x0134 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi.f48640a     // Catch:{ Exception -> 0x0134 }
            r16 = 0
            r17 = 46097(0xb411, float:6.4596E-41)
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0134 }
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r14[r10] = r18     // Catch:{ Exception -> 0x0134 }
            java.lang.Class<com.google.common.util.concurrent.q> r19 = com.google.common.util.concurrent.q.class
            r18 = r14
            r14 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0134 }
            com.google.common.util.concurrent.q r0 = (com.google.common.util.concurrent.q) r0     // Catch:{ Exception -> 0x0134 }
            goto L_0x010f
        L_0x0104:
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)     // Catch:{ Exception -> 0x0134 }
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi$FlowApi r0 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi.f48641b     // Catch:{ Exception -> 0x0134 }
            com.google.common.util.concurrent.q r0 = r0.getTelecomSign(r7)     // Catch:{ Exception -> 0x0134 }
        L_0x010f:
            r1.L$0 = r8     // Catch:{ Exception -> 0x0134 }
            r1.J$0 = r11     // Catch:{ Exception -> 0x0134 }
            r1.L$1 = r7     // Catch:{ Exception -> 0x0134 }
            r1.L$2 = r6     // Catch:{ Exception -> 0x0134 }
            r1.L$3 = r5     // Catch:{ Exception -> 0x0134 }
            r1.L$4 = r3     // Catch:{ Exception -> 0x0134 }
            r1.label = r9     // Catch:{ Exception -> 0x0134 }
            java.lang.Object r0 = com.ss.android.ugc.aweme.antiaddic.lock.api.a.a(r0, r1)     // Catch:{ Exception -> 0x0134 }
            if (r0 != r2) goto L_0x0124
            return r2
        L_0x0124:
            r13 = r8
        L_0x0125:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomSignResponse r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomSignResponse) r0     // Catch:{ Exception -> 0x0132 }
            java.lang.String r0 = r0.getSign()     // Catch:{ Exception -> 0x0132 }
            r6 = r0
        L_0x012c:
            r25 = r11
            r11 = r13
            r12 = r25
            goto L_0x0140
        L_0x0132:
            r0 = move-exception
            goto L_0x0136
        L_0x0134:
            r0 = move-exception
            r13 = r8
        L_0x0136:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = ""
        L_0x013e:
            r3 = r0
            goto L_0x012c
        L_0x0140:
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x015c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get sign error:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r11.a((java.lang.String) r0)
            return r0
        L_0x015c:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi r0 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.f48647e     // Catch:{ Exception -> 0x0359 }
            java.lang.String r15 = "8023847002"
            java.lang.String r14 = "30100"
            java.lang.String r4 = "json"
            java.lang.String r9 = "v1.5"
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x0359 }
            r8 = 6
            r21 = r2
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x035c }
            r16 = 0
            r2[r16] = r15     // Catch:{ Exception -> 0x035c }
            r16 = 1
            r2[r16] = r14     // Catch:{ Exception -> 0x035c }
            r8 = 2
            r2[r8] = r4     // Catch:{ Exception -> 0x035c }
            r16 = 3
            r2[r16] = r9     // Catch:{ Exception -> 0x035c }
            r22 = 4
            r2[r22] = r6     // Catch:{ Exception -> 0x035c }
            r23 = 5
            r2[r23] = r10     // Catch:{ Exception -> 0x035c }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.f48643a     // Catch:{ Exception -> 0x035c }
            r17 = 0
            r18 = 46123(0xb42b, float:6.4632E-41)
            r24 = r3
            r8 = 6
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x035c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r19 = 0
            r3[r19] = r8     // Catch:{ Exception -> 0x035c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r19 = 1
            r3[r19] = r8     // Catch:{ Exception -> 0x035c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r19 = 2
            r3[r19] = r8     // Catch:{ Exception -> 0x035c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r19 = 3
            r3[r19] = r8     // Catch:{ Exception -> 0x035c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3[r22] = r8     // Catch:{ Exception -> 0x035c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3[r23] = r8     // Catch:{ Exception -> 0x035c }
            java.lang.Class<com.bytedance.retrofit2.Call> r20 = com.bytedance.retrofit2.Call.class
            r8 = r14
            r14 = r2
            r2 = r15
            r15 = r0
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x035c }
            if (r3 == 0) goto L_0x020c
            r3 = 6
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0206 }
            r3 = 0
            r14[r3] = r2     // Catch:{ Exception -> 0x0206 }
            r2 = 1
            r14[r2] = r8     // Catch:{ Exception -> 0x0206 }
            r2 = 2
            r14[r2] = r4     // Catch:{ Exception -> 0x0206 }
            r2 = 3
            r14[r2] = r9     // Catch:{ Exception -> 0x0206 }
            r14[r22] = r6     // Catch:{ Exception -> 0x0206 }
            r14[r23] = r10     // Catch:{ Exception -> 0x0206 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.f48643a     // Catch:{ Exception -> 0x0206 }
            r17 = 0
            r18 = 46123(0xb42b, float:6.4632E-41)
            r2 = 6
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 2
            r2[r4] = r3     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 3
            r2[r4] = r3     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r22] = r3     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r23] = r3     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<com.bytedance.retrofit2.Call> r20 = com.bytedance.retrofit2.Call.class
            r15 = r0
            r19 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0206 }
            com.bytedance.retrofit2.Call r0 = (com.bytedance.retrofit2.Call) r0     // Catch:{ Exception -> 0x0206 }
            goto L_0x0273
        L_0x0206:
            r0 = move-exception
            r4 = r5
            r2 = r21
            goto L_0x0360
        L_0x020c:
            java.lang.String r3 = "clientId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = "clientType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r3)     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = "format"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r3)     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = "version"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r3)     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = "sign"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r3)     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = "timestamp"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r3)     // Catch:{ Exception -> 0x035c }
            r3 = 0
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x035c }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.f48643a     // Catch:{ Exception -> 0x035c }
            r17 = 0
            r18 = 46122(0xb42a, float:6.463E-41)
            java.lang.Class[] r15 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x035c }
            java.lang.Class<com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi$ITelecomApi> r20 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.ITelecomApi.class
            r3 = r15
            r15 = r0
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x035c }
            if (r3 == 0) goto L_0x025b
            r3 = 0
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0206 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.f48643a     // Catch:{ Exception -> 0x0206 }
            r17 = 0
            r18 = 46122(0xb42a, float:6.463E-41)
            java.lang.Class[] r15 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi$ITelecomApi> r20 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.ITelecomApi.class
            r3 = r15
            r15 = r0
            r19 = r3
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0206 }
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi$ITelecomApi r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.ITelecomApi) r0     // Catch:{ Exception -> 0x0206 }
            goto L_0x0263
        L_0x025b:
            kotlin.Lazy r0 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.f48646d     // Catch:{ Exception -> 0x035c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x035c }
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi$ITelecomApi r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomApi.ITelecomApi) r0     // Catch:{ Exception -> 0x035c }
        L_0x0263:
            r14 = r0
            r15 = r2
            r16 = r8
            r17 = r4
            r18 = r9
            r19 = r6
            r20 = r10
            com.bytedance.retrofit2.Call r0 = r14.getTelecomOpenId(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x035c }
        L_0x0273:
            r1.L$0 = r11     // Catch:{ Exception -> 0x035c }
            r1.J$0 = r12     // Catch:{ Exception -> 0x035c }
            r1.L$1 = r7     // Catch:{ Exception -> 0x035c }
            r1.L$2 = r6     // Catch:{ Exception -> 0x035c }
            r1.L$3 = r5     // Catch:{ Exception -> 0x035c }
            r3 = r24
            r1.L$4 = r3     // Catch:{ Exception -> 0x035c }
            r2 = 2
            r1.label = r2     // Catch:{ Exception -> 0x035c }
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x035c }
            r4 = 0
            r14[r4] = r0     // Catch:{ Exception -> 0x035c }
            r4 = 1
            r14[r4] = r1     // Catch:{ Exception -> 0x035c }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.antiaddic.lock.api.a.f33430a     // Catch:{ Exception -> 0x035c }
            r17 = 1
            r18 = 21834(0x554a, float:3.0596E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x035c }
            java.lang.Class<com.bytedance.retrofit2.Call> r2 = com.bytedance.retrofit2.Call.class
            r8 = 0
            r4[r8] = r2     // Catch:{ Exception -> 0x035c }
            java.lang.Class<kotlin.coroutines.c> r2 = kotlin.coroutines.c.class
            r8 = 1
            r4[r8] = r2     // Catch:{ Exception -> 0x035c }
            java.lang.Class<java.lang.Object> r20 = java.lang.Object.class
            r19 = r4
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x035c }
            if (r2 == 0) goto L_0x02d0
            r2 = 2
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0206 }
            r4 = 0
            r14[r4] = r0     // Catch:{ Exception -> 0x0206 }
            r4 = 1
            r14[r4] = r1     // Catch:{ Exception -> 0x0206 }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.antiaddic.lock.api.a.f33430a     // Catch:{ Exception -> 0x0206 }
            r17 = 1
            r18 = 21834(0x554a, float:3.0596E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<com.bytedance.retrofit2.Call> r2 = com.bytedance.retrofit2.Call.class
            r4 = 0
            r0[r4] = r2     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<kotlin.coroutines.c> r2 = kotlin.coroutines.c.class
            r4 = 1
            r0[r4] = r2     // Catch:{ Exception -> 0x0206 }
            java.lang.Class<java.lang.Object> r20 = java.lang.Object.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0206 }
            java.lang.Object r0 = (java.lang.Object) r0     // Catch:{ Exception -> 0x0206 }
            goto L_0x02f3
        L_0x02d0:
            kotlin.coroutines.g r2 = new kotlin.coroutines.g     // Catch:{ Exception -> 0x035c }
            kotlin.coroutines.c r4 = kotlin.coroutines.a.b.a(r1)     // Catch:{ Exception -> 0x035c }
            r2.<init>(r4)     // Catch:{ Exception -> 0x035c }
            r4 = r2
            kotlin.coroutines.c r4 = (kotlin.coroutines.c) r4     // Catch:{ Exception -> 0x035c }
            com.ss.android.ugc.aweme.antiaddic.lock.api.a$b r8 = new com.ss.android.ugc.aweme.antiaddic.lock.api.a$b     // Catch:{ Exception -> 0x035c }
            r8.<init>(r4)     // Catch:{ Exception -> 0x035c }
            com.bytedance.retrofit2.c r8 = (com.bytedance.retrofit2.c) r8     // Catch:{ Exception -> 0x035c }
            r0.enqueue(r8)     // Catch:{ Exception -> 0x035c }
            java.lang.Object r0 = r2.a()     // Catch:{ Exception -> 0x035c }
            java.lang.Object r2 = kotlin.coroutines.a.b.a()     // Catch:{ Exception -> 0x035c }
            if (r0 != r2) goto L_0x02f3
            kotlin.coroutines.jvm.internal.g.b(r1)     // Catch:{ Exception -> 0x0206 }
        L_0x02f3:
            r2 = r21
            if (r0 != r2) goto L_0x02f8
            return r2
        L_0x02f8:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomOpenIdDataResponse r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.TelecomOpenIdDataResponse) r0     // Catch:{ Exception -> 0x0359 }
            java.lang.String r4 = r0.getData()     // Catch:{ Exception -> 0x0359 }
            int r5 = r0.getResult()     // Catch:{ Exception -> 0x0357 }
            if (r5 == 0) goto L_0x0323
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0357 }
            java.lang.String r5 = "errorCode:"
            r3.<init>(r5)     // Catch:{ Exception -> 0x0357 }
            int r5 = r0.getResult()     // Catch:{ Exception -> 0x0357 }
            r3.append(r5)     // Catch:{ Exception -> 0x0357 }
            java.lang.String r5 = " errorMsg:"
            r3.append(r5)     // Catch:{ Exception -> 0x0357 }
            java.lang.String r0 = r0.getMsg()     // Catch:{ Exception -> 0x0357 }
            r3.append(r0)     // Catch:{ Exception -> 0x0357 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0357 }
            goto L_0x0369
        L_0x0323:
            int r5 = r0.getResCode()     // Catch:{ Exception -> 0x0357 }
            if (r5 == 0) goto L_0x0348
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0357 }
            java.lang.String r5 = "errorCode:"
            r3.<init>(r5)     // Catch:{ Exception -> 0x0357 }
            int r5 = r0.getResCode()     // Catch:{ Exception -> 0x0357 }
            r3.append(r5)     // Catch:{ Exception -> 0x0357 }
            java.lang.String r5 = " errorMsg:"
            r3.append(r5)     // Catch:{ Exception -> 0x0357 }
            java.lang.String r0 = r0.getResMsg()     // Catch:{ Exception -> 0x0357 }
            r3.append(r0)     // Catch:{ Exception -> 0x0357 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0357 }
            goto L_0x0369
        L_0x0348:
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0357 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0357 }
            if (r0 == 0) goto L_0x0369
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = new com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse     // Catch:{ Exception -> 0x0357 }
            r0.<init>()     // Catch:{ Exception -> 0x0357 }
            return r0
        L_0x0357:
            r0 = move-exception
            goto L_0x0360
        L_0x0359:
            r0 = move-exception
        L_0x035a:
            r4 = r5
            goto L_0x0360
        L_0x035c:
            r0 = move-exception
            r2 = r21
            goto L_0x035a
        L_0x0360:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = ""
        L_0x0368:
            r3 = r0
        L_0x0369:
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0385
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get open id data error:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r11.a((java.lang.String) r0)
            return r0
        L_0x0385:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi r0 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi.f48642c     // Catch:{ Exception -> 0x03a8 }
            java.lang.String r5 = ""
            java.lang.String r8 = ""
            com.google.common.util.concurrent.q r0 = r0.a(r5, r4, r8)     // Catch:{ Exception -> 0x03a8 }
            r1.L$0 = r11     // Catch:{ Exception -> 0x03a8 }
            r1.J$0 = r12     // Catch:{ Exception -> 0x03a8 }
            r1.L$1 = r7     // Catch:{ Exception -> 0x03a8 }
            r1.L$2 = r6     // Catch:{ Exception -> 0x03a8 }
            r1.L$3 = r4     // Catch:{ Exception -> 0x03a8 }
            r1.L$4 = r3     // Catch:{ Exception -> 0x03a8 }
            r3 = 3
            r1.label = r3     // Catch:{ Exception -> 0x03a8 }
            java.lang.Object r0 = com.ss.android.ugc.aweme.antiaddic.lock.api.a.a(r0, r1)     // Catch:{ Exception -> 0x03a8 }
            if (r0 != r2) goto L_0x03a5
            return r2
        L_0x03a5:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse) r0     // Catch:{ Exception -> 0x03a8 }
            goto L_0x03b5
        L_0x03a8:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x03b1
            java.lang.String r0 = ""
        L_0x03b1:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r11.a((java.lang.String) r0)
        L_0x03b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.freeflowcard.freeflowmember.d.a(kotlin.coroutines.c):java.lang.Object");
    }
}
