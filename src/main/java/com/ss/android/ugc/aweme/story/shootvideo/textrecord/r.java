package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74274a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStickerInputActivity f74275b;

    r(TextStickerInputActivity textStickerInputActivity) {
        this.f74275b = textStickerInputActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f74274a, false, 86260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74274a, false, 86260, new Class[0], Void.TYPE);
            return;
        }
        TextStickerInputActivity textStickerInputActivity = this.f74275b;
        if (PatchProxy.isSupport(new Object[0], textStickerInputActivity, TextStickerInputActivity.f74225a, false, 86250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], textStickerInputActivity, TextStickerInputActivity.f74225a, false, 86250, new Class[0], Void.TYPE);
        } else if (textStickerInputActivity.f74229c == null) {
            textStickerInputActivity.f74228b.a("", 0, j.a().c().f74254b, 2, "", true);
        } else {
            textStickerInputActivity.f74228b.a(textStickerInputActivity.f74229c.mTextStr, textStickerInputActivity.f74229c.mBgMode, textStickerInputActivity.f74229c.mColor, textStickerInputActivity.f74229c.mAlign, textStickerInputActivity.f74229c.mFontType, false);
        }
    }
}
