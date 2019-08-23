package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71718a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerPropDetailFragment f71719b;

    a(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f71719b = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71718a, false, 82043, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71718a, false, 82043, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f71719b.i();
    }
}
