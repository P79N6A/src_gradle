package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35964a;

    /* renamed from: b  reason: collision with root package name */
    private final ChooseMusicFragment f35965b;

    a(ChooseMusicFragment chooseMusicFragment) {
        this.f35965b = chooseMusicFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35964a, false, 26546, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35964a, false, 26546, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f35965b.dismiss();
    }
}
