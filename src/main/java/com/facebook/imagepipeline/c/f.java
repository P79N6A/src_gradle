package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;
import javax.annotation.Nullable;

public interface f {
    CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(b bVar, Bitmap.Config config, @Nullable Rect rect, boolean z);

    CloseableReference<Bitmap> decodeJPEGFromEncodedImage(b bVar, Bitmap.Config config, @Nullable Rect rect, int i);

    CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(b bVar, Bitmap.Config config, @Nullable Rect rect, int i, boolean z);
}
