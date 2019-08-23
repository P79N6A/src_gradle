package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

public final /* synthetic */ class s implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70107a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchInfoStickerPresenter f70108b;

    s(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f70108b = searchInfoStickerPresenter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70107a, false, 79454, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70107a, false, 79454, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = (a) obj;
        this.f70108b.a(aVar.f76550c, (ProviderEffectModel) aVar.f76549b, false);
    }
}
