package com.bytedance.android.livesdk.sticker.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17399a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveStickerComposerDialog f17400b;

    i(LiveStickerComposerDialog liveStickerComposerDialog) {
        this.f17400b = liveStickerComposerDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17399a, false, 13472, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17399a, false, 13472, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f17400b.b();
    }
}
