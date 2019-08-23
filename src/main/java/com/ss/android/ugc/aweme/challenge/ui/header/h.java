package com.ss.android.ugc.aweme.challenge.ui.header;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35646a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Function0 f35647b;

    h(Function0 function0) {
        this.f35647b = function0;
    }

    public final /* synthetic */ void a() {
        Intrinsics.checkExpressionValueIsNotNull(this.f35647b.invoke(), "invoke(...)");
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f35646a, false, 26359, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f35646a, false, 26359, new Class[]{Bundle.class}, Void.TYPE);
        }
    }
}
