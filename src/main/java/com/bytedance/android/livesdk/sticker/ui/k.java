package com.bytedance.android.livesdk.sticker.ui;

import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.android.livesdk.sticker.ui.LiveStickerComposerPageAdapter;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements LiveStickerComposerPageAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17403a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveStickerComposerDialog f17404b;

    k(LiveStickerComposerDialog liveStickerComposerDialog) {
        this.f17404b = liveStickerComposerDialog;
    }

    public final void a(Boolean bool, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{bool, aVar2}, this, f17403a, false, 13474, new Class[]{Boolean.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool, aVar2}, this, f17403a, false, 13474, new Class[]{Boolean.class, a.class}, Void.TYPE);
            return;
        }
        LiveStickerComposerDialog liveStickerComposerDialog = this.f17404b;
        if (aVar2 != null) {
            if (bool.booleanValue()) {
                liveStickerComposerDialog.f17338c.lambda$put$1$DataCenter("cmd_sticker_tip", aVar2.u);
                j.q().o().a(com.bytedance.android.livesdk.sticker.c.a.f17262c, aVar2);
                return;
            }
            liveStickerComposerDialog.f17338c.lambda$put$1$DataCenter("cmd_sticker_tip", "");
            j.q().o().b(com.bytedance.android.livesdk.sticker.c.a.f17262c, aVar2);
        }
    }
}
