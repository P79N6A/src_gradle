package com.ss.android.ugc.aweme.services.photo;

import android.content.Context;
import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.t;

public interface IPhotoService {
    PhotoContext compress(@NonNull String str, @NonNull t tVar);

    PhotoContext compress(@NonNull String str, @NonNull t tVar, int i, int i2);

    int[] getImageWidthHeight(String str);

    boolean isPhotoEditEnabled();

    void toPhotoEditActivity(Context context, PhotoContext photoContext);
}
