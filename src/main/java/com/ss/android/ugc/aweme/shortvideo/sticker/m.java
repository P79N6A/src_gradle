package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public interface m {

    public interface a {
        void a(@NonNull FaceStickerBean faceStickerBean);

        void a(@Nullable FaceStickerBean faceStickerBean, @Nullable String str);

        void b(@NonNull FaceStickerBean faceStickerBean);

        void b(@Nullable FaceStickerBean faceStickerBean, @Nullable String str);

        void c(@NonNull FaceStickerBean faceStickerBean);
    }

    void a();

    void a(@NonNull AppCompatActivity appCompatActivity, @NonNull LifecycleOwner lifecycleOwner, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull a aVar);

    boolean b();

    void c();
}
