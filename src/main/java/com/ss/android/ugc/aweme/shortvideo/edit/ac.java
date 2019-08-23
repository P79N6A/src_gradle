package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ao.a.e;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class ac implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66953a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66954b;

    ac(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66954b = vEVideoPublishEditActivity;
    }

    public final Object invoke(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f66953a, false, 76453, new Class[]{Object.class}, Object.class)) {
            return this.f66954b.b((e) obj);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f66953a, false, 76453, new Class[]{Object.class}, Object.class);
    }
}
