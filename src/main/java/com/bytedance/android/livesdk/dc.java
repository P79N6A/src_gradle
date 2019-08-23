package com.bytedance.android.livesdk;

import com.bytedance.android.live.uikit.dialog.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dc implements b.C0068b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13675a;

    /* renamed from: b  reason: collision with root package name */
    static final b.C0068b f13676b = new dc();

    private dc() {
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f13675a, false, 3034, new Class[0], Boolean.TYPE)) {
            return TTLiveSDKContext.lambda$delayInit$1$TTLiveSDKContext();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f13675a, false, 3034, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
