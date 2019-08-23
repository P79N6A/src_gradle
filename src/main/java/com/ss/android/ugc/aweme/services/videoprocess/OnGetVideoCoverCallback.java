package com.ss.android.ugc.aweme.services.videoprocess;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;

public interface OnGetVideoCoverCallback {
    void onGetVideoCoverFailed(int i);

    void onGetVideoCoverSuccess(@NonNull Bitmap bitmap);
}
