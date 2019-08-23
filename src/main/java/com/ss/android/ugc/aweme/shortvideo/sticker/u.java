package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70189a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule f70190b;

    public u(StickerModule stickerModule) {
        this.f70190b = stickerModule;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70189a, false, 78746, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70189a, false, 78746, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StickerModule stickerModule = this.f70190b;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (bool.booleanValue()) {
                stickerModule.e();
                if (stickerModule.v != null) {
                    stickerModule.v.a();
                }
            } else {
                stickerModule.e(false);
                stickerModule.d();
            }
        }
    }
}
