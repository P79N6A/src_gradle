package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Bundle;
import com.bytedance.scene.e;
import com.bytedance.scene.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class am implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66973a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66974b;

    am(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66974b = vEVideoPublishEditActivity;
    }

    public final e a(ClassLoader classLoader, String str, Bundle bundle) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{classLoader, str2, bundle}, this, f66973a, false, 76463, new Class[]{ClassLoader.class, String.class, Bundle.class}, e.class)) {
            return this.f66974b.c(str2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{classLoader, str2, bundle}, this, f66973a, false, 76463, new Class[]{ClassLoader.class, String.class, Bundle.class}, e.class);
    }
}
