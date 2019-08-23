package com.ss.android.ugc.aweme.shortvideo.guide;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.guide.e;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67989a;

    c() {
    }

    @NonNull
    public final e a(@Nullable FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f67989a, false, 77427, new Class[]{FaceStickerBean.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f67989a, false, 77427, new Class[]{FaceStickerBean.class}, e.class);
        } else if (faceStickerBean2 == null) {
            return new e.a();
        } else {
            ExtraParams extraParams = null;
            if (!TextUtils.isEmpty(faceStickerBean.getExtra())) {
                extraParams = (ExtraParams) a.f61120c.fromJson(faceStickerBean.getExtra(), ExtraParams.class);
            }
            if (extraParams != null && extraParams.isGifValid()) {
                return new d(faceStickerBean2);
            }
            if (faceStickerBean.getTags().contains("strong_beat")) {
                return new a(faceStickerBean2);
            }
            return new com.ss.android.ugc.aweme.shortvideo.guide.a.a(faceStickerBean2);
        }
    }
}
