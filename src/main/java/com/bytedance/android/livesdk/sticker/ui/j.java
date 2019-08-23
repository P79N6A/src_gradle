package com.bytedance.android.livesdk.sticker.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17401a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveStickerComposerDialog f17402b;

    j(LiveStickerComposerDialog liveStickerComposerDialog) {
        this.f17402b = liveStickerComposerDialog;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f17401a, false, 13473, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f17401a, false, 13473, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        LiveStickerComposerDialog liveStickerComposerDialog = this.f17402b;
        liveStickerComposerDialog.f17340e.setCurrentItem(((Integer) b.ah.a()).intValue());
        if (liveStickerComposerDialog.h != null) {
            liveStickerComposerDialog.h.onDismiss(dialogInterface2);
        }
    }
}
