package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.c;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.d;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.f;

public final /* synthetic */ class j implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74389a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStickerInputLayout f74390b;

    j(TextStickerInputLayout textStickerInputLayout) {
        this.f74390b = textStickerInputLayout;
    }

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f74389a, false, 86399, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f74389a, false, 86399, new Class[]{c.class}, Void.TYPE);
            return;
        }
        TextStickerInputLayout textStickerInputLayout = this.f74390b;
        if (cVar2 != null) {
            textStickerInputLayout.a(cVar2);
            d.a().f74173c = cVar2.h;
            textStickerInputLayout.f74320c.setFontType(d.a().d());
            textStickerInputLayout.f74320c.a(textStickerInputLayout.f74321d, textStickerInputLayout.g);
            if (textStickerInputLayout.r != null) {
                textStickerInputLayout.r.a(cVar2);
            }
        }
    }
}
