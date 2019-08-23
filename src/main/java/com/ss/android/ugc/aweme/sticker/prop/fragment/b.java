package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71720a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerPropDetailFragment f71721b;

    b(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f71721b = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71720a, false, 82044, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71720a, false, 82044, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f71721b.l();
    }
}
