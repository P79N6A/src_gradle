package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public final /* synthetic */ class f implements LoadMoreRecyclerViewAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69823a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerEmojiFragment f69824b;

    f(InfoStickerEmojiFragment infoStickerEmojiFragment) {
        this.f69824b = infoStickerEmojiFragment;
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f69823a, false, 79269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69823a, false, 79269, new Class[0], Void.TYPE);
            return;
        }
        this.f69824b.e();
    }
}
