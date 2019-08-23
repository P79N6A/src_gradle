package com.ss.android.ugc.aweme.shortvideo.guide;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public interface IStickerGuidePresenter extends LifecycleObserver {
    void a(LifecycleOwner lifecycleOwner);

    void a(@Nullable FaceStickerBean faceStickerBean);

    void hide();
}
