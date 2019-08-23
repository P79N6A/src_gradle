package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;

public final /* synthetic */ class i implements TextStickerInputLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74211a;

    /* renamed from: b  reason: collision with root package name */
    private final h f74212b;

    i(h hVar) {
        this.f74212b = hVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74211a, false, 86160, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74211a, false, 86160, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74212b.o.e();
    }
}
