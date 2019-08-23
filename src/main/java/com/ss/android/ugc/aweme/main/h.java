package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54838a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54839b;

    h(MainActivity mainActivity) {
        this.f54839b = mainActivity;
    }

    public final Object invoke(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f54838a, false, 57198, new Class[]{Object.class}, Object.class)) {
            return this.f54839b.lambda$onCreate$0$MainActivity((Boolean) obj);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f54838a, false, 57198, new Class[]{Object.class}, Object.class);
    }
}
