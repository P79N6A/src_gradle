package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70103a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchInfoStickerPresenter f70104b;

    q(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f70104b = searchInfoStickerPresenter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70103a, false, 79452, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70103a, false, 79452, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        SearchInfoStickerPresenter searchInfoStickerPresenter = this.f70104b;
        String str = (String) obj;
        if (!StringUtils.isEmpty(str)) {
            searchInfoStickerPresenter.a(str);
        }
    }
}
