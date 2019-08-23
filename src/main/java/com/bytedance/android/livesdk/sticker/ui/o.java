package com.bytedance.android.livesdk.sticker.ui;

import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.android.livesdk.sticker.ui.LiveStickerComposerListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements LiveStickerComposerListAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17418a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveStickerComposerPageAdapter f17419b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17420c;

    o(LiveStickerComposerPageAdapter liveStickerComposerPageAdapter, int i) {
        this.f17419b = liveStickerComposerPageAdapter;
        this.f17420c = i;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17418a, false, 13503, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f17418a, false, 13503, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f17419b.a(this.f17420c, aVar);
    }
}
