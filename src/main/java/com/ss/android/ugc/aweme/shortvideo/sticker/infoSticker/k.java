package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.a;

public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70084a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerModule f70085b;

    k(InfoStickerModule infoStickerModule) {
        this.f70085b = infoStickerModule;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f70084a, false, 79305, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f70084a, false, 79305, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        InfoStickerModule infoStickerModule = this.f70085b;
        if (i != 4) {
            return false;
        }
        infoStickerModule.b();
        return true;
    }
}
