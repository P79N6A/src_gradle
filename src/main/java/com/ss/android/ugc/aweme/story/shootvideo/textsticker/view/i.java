package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout;

public final /* synthetic */ class i implements ColorSelectLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74387a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStickerInputLayout f74388b;

    i(TextStickerInputLayout textStickerInputLayout) {
        this.f74388b = textStickerInputLayout;
    }

    public final void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74387a, false, 86398, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74387a, false, 86398, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TextStickerInputLayout textStickerInputLayout = this.f74388b;
        textStickerInputLayout.f74320c.a(textStickerInputLayout.f74321d, i2);
        textStickerInputLayout.g = i2;
        if (textStickerInputLayout.r != null) {
            textStickerInputLayout.r.a(i2);
        }
    }
}
