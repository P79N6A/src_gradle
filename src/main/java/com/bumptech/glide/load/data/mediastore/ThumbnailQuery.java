package com.bumptech.glide.load.data.mediastore;

import android.database.Cursor;
import android.net.Uri;

public interface ThumbnailQuery {
    Cursor query(Uri uri);
}