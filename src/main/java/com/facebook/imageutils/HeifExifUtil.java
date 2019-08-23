package com.facebook.imageutils;

import android.media.ExifInterface;
import android.support.annotation.RequiresApi;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.logging.FLog;
import java.io.IOException;
import java.io.InputStream;

public final class HeifExifUtil {

    @DoNotStrip
    public static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        @RequiresApi(api = 24)
        public static int getOrientation(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e2) {
                FLog.d("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", (Throwable) e2);
                return 0;
            }
        }
    }
}
