package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class ad implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66955a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66956b;

    ad(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66956b = vEVideoPublishEditActivity;
    }

    public final Object invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, f66955a, false, 76454, new Class[0], Object.class)) {
            return this.f66956b.ak();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f66955a, false, 76454, new Class[0], Object.class);
    }
}
