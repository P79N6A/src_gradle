package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class MediaStoreUtil {
    public static boolean isThumbnailSize(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    private MediaStoreUtil() {
    }

    public static boolean isMediaStoreImageUri(Uri uri) {
        if (!isMediaStoreUri(uri) || isVideoUri(uri)) {
            return false;
        }
        return true;
    }

    public static boolean isMediaStoreVideoUri(Uri uri) {
        if (!isMediaStoreUri(uri) || !isVideoUri(uri)) {
            return false;
        }
        return true;
    }

    private static boolean isVideoUri(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean isMediaStoreUri(Uri uri) {
        if (uri == null || !PushConstants.CONTENT.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }
}
