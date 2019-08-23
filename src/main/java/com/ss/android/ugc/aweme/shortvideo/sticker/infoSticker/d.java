package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69819a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerEmojiFragment f69820b;

    d(InfoStickerEmojiFragment infoStickerEmojiFragment) {
        this.f69820b = infoStickerEmojiFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f69819a, false, 79267, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f69819a, false, 79267, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f69820b.b((a) obj);
    }
}
