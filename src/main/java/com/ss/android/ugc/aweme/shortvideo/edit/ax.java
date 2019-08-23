package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Bundle;
import com.bytedance.scene.e;
import com.bytedance.scene.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ax implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67083a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67084b;

    ax(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67084b = vEVideoPublishEditActivity;
    }

    public final e a(ClassLoader classLoader, String str, Bundle bundle) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{classLoader, str2, bundle}, this, f67083a, false, 76474, new Class[]{ClassLoader.class, String.class, Bundle.class}, e.class)) {
            return this.f67084b.b(str2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{classLoader, str2, bundle}, this, f67083a, false, 76474, new Class[]{ClassLoader.class, String.class, Bundle.class}, e.class);
    }
}
