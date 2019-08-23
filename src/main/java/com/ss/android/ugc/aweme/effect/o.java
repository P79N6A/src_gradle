package com.ss.android.ugc.aweme.effect;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.a;

public final /* synthetic */ class o implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43766a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43767b;

    o(VEEffectHelper vEEffectHelper) {
        this.f43767b = vEEffectHelper;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f43766a, false, 38716, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f43766a, false, 38716, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        VEEffectHelper vEEffectHelper = this.f43767b;
        if (i != 4 || !vEEffectHelper.F) {
            return false;
        }
        if (PatchProxy.isSupport(new Object[0], vEEffectHelper, VEEffectHelper.f3085a, false, 38708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], vEEffectHelper, VEEffectHelper.f3085a, false, 38708, new Class[0], Void.TYPE);
        } else if (vEEffectHelper.mTextCancel != null) {
            vEEffectHelper.mTextCancel.performClick();
        }
        return true;
    }
}
