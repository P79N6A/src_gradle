package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;

public final /* synthetic */ class q implements TextStickerInputLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74272a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStickerInputActivity f74273b;

    q(TextStickerInputActivity textStickerInputActivity) {
        this.f74273b = textStickerInputActivity;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74272a, false, 86259, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74272a, false, 86259, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        TextStickerInputActivity textStickerInputActivity = this.f74273b;
        TextStickerInputActivity.f74226d = z;
        textStickerInputActivity.f74228b.e();
    }
}
