package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;

public final /* synthetic */ class f implements InfoStickerEditView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67238a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerEditView.b f67239b;

    f(InfoStickerEditView.b bVar) {
        this.f67239b = bVar;
    }

    public final float a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67238a, false, 76790, new Class[]{Float.TYPE}, Float.TYPE)) {
            return InfoStickerEditView.this.u.a(f2).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67238a, false, 76790, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
    }
}
