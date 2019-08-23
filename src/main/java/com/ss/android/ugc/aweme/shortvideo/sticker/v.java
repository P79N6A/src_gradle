package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70242a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule f70243b;

    public v(StickerModule stickerModule) {
        this.f70243b = stickerModule;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70242a, false, 78747, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70242a, false, 78747, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StickerModule stickerModule = this.f70243b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            stickerModule.d(stickerModule.a().e());
        }
    }
}
