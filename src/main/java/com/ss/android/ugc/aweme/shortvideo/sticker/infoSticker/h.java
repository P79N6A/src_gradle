package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69826a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerFragment f69827b;

    h(InfoStickerFragment infoStickerFragment) {
        this.f69827b = infoStickerFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69826a, false, 79285, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69826a, false, 79285, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f69827b.b();
    }
}
