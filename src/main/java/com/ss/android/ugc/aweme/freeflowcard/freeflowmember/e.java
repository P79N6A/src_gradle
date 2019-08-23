package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0011\u0010\u0005\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/UnicomUpdater;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberUpdater;", "()V", "getLocalIPAddress", "", "update", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f48665c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f48666d = new e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"update", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "UnicomUpdater.kt", c = {20}, d = "update", e = "com.ss.android.ugc.aweme.freeflowcard.freeflowmember.UnicomUpdater")
    static final class a extends d {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, c cVar) {
            super(cVar);
            this.this$0 = eVar;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46134, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46134, new Class[]{Object.class}, Object.class);
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    private e() {
    }

    private final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f48665c, false, 46133, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48665c, false, 46133, new Class[0], String.class);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Intrinsics.checkExpressionValueIsNotNull(nextElement, "networkInterface");
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        Intrinsics.checkExpressionValueIsNotNull(nextElement2, "inetAddress");
                        if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                            String hostAddress = ((Inet4Address) nextElement2).getHostAddress();
                            Intrinsics.checkExpressionValueIsNotNull(hostAddress, "inetAddress.hostAddress");
                            return hostAddress;
                        }
                    }
                }
            }
        } catch (Exception | SocketException unused) {
        }
        return "";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.c<? super com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse> r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f48665c
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<kotlin.coroutines.c> r2 = kotlin.coroutines.c.class
            r6[r9] = r2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 46132(0xb434, float:6.4645E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0035
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f48665c
            r4 = 0
            r5 = 46132(0xb434, float:6.4645E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<kotlin.coroutines.c> r0 = kotlin.coroutines.c.class
            r6[r9] = r0
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0035:
            boolean r1 = r11 instanceof com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e.a
            if (r1 == 0) goto L_0x0049
            r1 = r11
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e$a r1 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e.a) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0049
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x004e
        L_0x0049:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e$a r1 = new com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e$a
            r1.<init>(r10, r11)
        L_0x004e:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.a.b.a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0061;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0061:
            java.lang.Object r1 = r1.L$0
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e r1 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e) r1
            goto L_0x008d
        L_0x0066:
            boolean r0 = r10.a()
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "can only call update() in IO Thread!!"
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r10.a((java.lang.String) r0)
            return r0
        L_0x0073:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi r0 = com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowMemberApi.f48642c     // Catch:{ Exception -> 0x0092 }
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = r10.b()     // Catch:{ Exception -> 0x0092 }
            com.google.common.util.concurrent.q r0 = r0.a(r3, r4, r5)     // Catch:{ Exception -> 0x0092 }
            r1.L$0 = r10     // Catch:{ Exception -> 0x0092 }
            r1.label = r8     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r0 = com.ss.android.ugc.aweme.antiaddic.lock.api.a.a(r0, r1)     // Catch:{ Exception -> 0x0092 }
            if (r0 != r2) goto L_0x008c
            return r2
        L_0x008c:
            r1 = r10
        L_0x008d:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = (com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse) r0     // Catch:{ Exception -> 0x0090 }
            goto L_0x00a0
        L_0x0090:
            r0 = move-exception
            goto L_0x0094
        L_0x0092:
            r0 = move-exception
            r1 = r10
        L_0x0094:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = ""
        L_0x009c:
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeFlowResponse r0 = r1.a((java.lang.String) r0)
        L_0x00a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.freeflowcard.freeflowmember.e.a(kotlin.coroutines.c):java.lang.Object");
    }
}
