package com.ss.android.ugc.aweme.services.photo;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.photo.PhotoContext;

public interface IPhotoProcessService {

    public interface IPhotoServiceListener {
        void onSaved(int i, @Nullable PhotoContext photoContext);

        void onWaterMakerAdded(@Nullable Bitmap bitmap);
    }

    void photoAddStoryWaterMarker(String str, String str2, @Nullable IPhotoServiceListener iPhotoServiceListener);

    void photoAddWaterMarker(@Nullable Bitmap bitmap, @Nullable IPhotoServiceListener iPhotoServiceListener);

    void savePhotoWithWaterMarker(@Nullable PhotoContext photoContext, @Nullable IPhotoServiceListener iPhotoServiceListener);

    void savePhotoWithoutWaterMarker(@Nullable PhotoContext photoContext, @Nullable IPhotoServiceListener iPhotoServiceListener);
}
