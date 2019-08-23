package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69650a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryStickerFragment f69651b;

    a(CategoryStickerFragment categoryStickerFragment) {
        this.f69651b = categoryStickerFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69650a, false, 79099, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69650a, false, 79099, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f69651b.d();
    }
}
