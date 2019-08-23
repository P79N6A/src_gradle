package com.ss.android.ugc.aweme.shortvideo.sticker.adapter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface DownloadStickerListener {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FailedType {
    }
}
