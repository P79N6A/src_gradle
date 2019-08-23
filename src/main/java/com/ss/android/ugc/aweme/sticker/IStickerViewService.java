package com.ss.android.ugc.aweme.sticker;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.framework.services.IStickerService;

public interface IStickerViewService {

    public interface a {
        void a(@NonNull IStickerService.FaceSticker faceSticker);

        void b(@NonNull IStickerService.FaceSticker faceSticker);
    }

    void hideStickerView();

    boolean isShowStickerView();

    void showStickerView(@NonNull AppCompatActivity appCompatActivity, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull a aVar);
}
