package com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70165a;

    /* renamed from: b  reason: collision with root package name */
    private final MultiStickerViewHolder f70166b;

    a(MultiStickerViewHolder multiStickerViewHolder) {
        this.f70166b = multiStickerViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70165a, false, 79822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70165a, false, 79822, new Class[0], Void.TYPE);
            return;
        }
        MultiStickerViewHolder multiStickerViewHolder = this.f70166b;
        if (!(multiStickerViewHolder.g == null || multiStickerViewHolder.g.getParent() == null)) {
            multiStickerViewHolder.g.performClick();
        }
    }
}