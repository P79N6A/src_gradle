package com.ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.scene.e;
import com.bytedance.scene.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.gamora.recorder.j;

public final /* synthetic */ class dn implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66782a;

    /* renamed from: b  reason: collision with root package name */
    private final PlanC f66783b;

    dn(PlanC planC) {
        this.f66783b = planC;
    }

    public final e a(ClassLoader classLoader, String str, Bundle bundle) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{classLoader, str2, bundle}, this, f66782a, false, 74341, new Class[]{ClassLoader.class, String.class, Bundle.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{classLoader, str2, bundle}, this, f66782a, false, 74341, new Class[]{ClassLoader.class, String.class, Bundle.class}, e.class);
        }
        PlanC planC = this.f66783b;
        if (TextUtils.equals(j.class.getName(), str2)) {
            return planC.Q;
        }
        return null;
    }
}
