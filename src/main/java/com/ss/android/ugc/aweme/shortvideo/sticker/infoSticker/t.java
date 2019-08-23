package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

public final /* synthetic */ class t implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70109a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchInfoStickerPresenter f70110b;

    t(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f70110b = searchInfoStickerPresenter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70109a, false, 79455, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70109a, false, 79455, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = (a) obj;
        this.f70110b.b(aVar.f76550c, (ProviderEffectModel) aVar.f76549b, false);
    }
}
