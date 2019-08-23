package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class cp implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64996a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleShareDialog f64997b;

    cp(SimpleShareDialog simpleShareDialog) {
        this.f64997b = simpleShareDialog;
    }

    public final Object invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, f64996a, false, 73400, new Class[0], Object.class)) {
            return this.f64997b.e();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f64996a, false, 73400, new Class[0], Object.class);
    }
}
