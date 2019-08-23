package com.ss.android.ugc.aweme.account.login.c;

import android.content.Context;
import com.bytedance.sdk.account.i.b.b;
import com.bytedance.sdk.account.i.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.g.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/onelogin/SimpleOneLoginAdapter;", "Lcom/bytedance/sdk/account/platform/OnekeyLoginAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DEBUG", "", "TAG", "", "onGetTokenError", "", "response", "Lcom/bytedance/sdk/account/platform/base/AuthorizeErrorResponse;", "onLoginByTokenError", "onLoginError", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public abstract class c extends d {
    public static ChangeQuickRedirect g;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32192e = a.a();

    /* renamed from: f  reason: collision with root package name */
    private final String f32193f = "SimpleOneLoginAdapter";

    public abstract void c(@NotNull b bVar);

    public abstract void d(@NotNull b bVar);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r2 != 3) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.bytedance.sdk.account.i.b.b r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = g
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.sdk.account.i.b.b> r3 = com.bytedance.sdk.account.i.b.b.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 20314(0x4f5a, float:2.8466E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = g
            r13 = 0
            r14 = 20314(0x4f5a, float:2.8466E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.sdk.account.i.b.b> r0 = com.bytedance.sdk.account.i.b.b.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            return
        L_0x0037:
            boolean r2 = r0 instanceof com.bytedance.sdk.account.i.b.d
            if (r2 == 0) goto L_0x0047
            r2 = r0
            com.bytedance.sdk.account.i.b.d r2 = (com.bytedance.sdk.account.i.b.d) r2
            int r2 = r2.f22439e
            r3 = 2
            if (r2 == r3) goto L_0x0048
            r3 = 3
            if (r2 != r3) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 == 0) goto L_0x004e
            r17.d(r18)
            return
        L_0x004e:
            r17.c(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.c.c.a(com.bytedance.sdk.account.i.b.b):void");
    }
}
