package com.bytedance.android.livesdk.sticker.ui;

import android.view.View;
import com.bytedance.android.livesdk.sticker.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17397a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveStickerComposerDialog f17398b;

    h(LiveStickerComposerDialog liveStickerComposerDialog) {
        this.f17398b = liveStickerComposerDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17397a, false, 13471, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17397a, false, 13471, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveStickerComposerDialog liveStickerComposerDialog = this.f17398b;
        liveStickerComposerDialog.f17339d.b();
        liveStickerComposerDialog.f17337b.a(a.f17262c, liveStickerComposerDialog);
    }
}
