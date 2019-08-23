package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonModel;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/IDislikeReasonView;", "()V", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends b<e, j> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46770a;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f46770a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 43450(0xa9ba, float:6.0886E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f46770a
            r5 = 0
            r6 = 43450(0xa9ba, float:6.0886E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.common.o r0 = r9.f2979f
            com.ss.android.ugc.aweme.feed.ui.masklayer2.j r0 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.j) r0
            if (r0 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.common.a r1 = r9.f2978e
            com.ss.android.ugc.aweme.feed.ui.masklayer2.e r1 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.e) r1
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r1.getData()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r1 = ""
        L_0x003b:
            r0.a((java.lang.String) r1)
            return
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.masklayer2.f.b():void");
    }

    public final void a(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f46770a, false, 43449, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f46770a, false, 43449, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        j jVar = (j) this.f2979f;
        if (jVar != null) {
            jVar.a(exc2);
        }
    }
}
