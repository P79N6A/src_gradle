package com.bytedance.android.livesdk;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9080a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubAutoLightFragment f9081b;

    b(FansClubAutoLightFragment fansClubAutoLightFragment) {
        this.f9081b = fansClubAutoLightFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9080a, false, 2505, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9080a, false, 2505, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f9081b.getActivity().finish();
    }
}
