package com.ss.android.ugc.aweme.commercialize;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38520a;

    /* renamed from: b  reason: collision with root package name */
    static final Function1 f38521b = new c();

    private c() {
    }

    public final Object invoke(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f38520a, false, 30250, new Class[]{Object.class}, Object.class)) {
            return null;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f38520a, false, 30250, new Class[]{Object.class}, Object.class);
    }
}
