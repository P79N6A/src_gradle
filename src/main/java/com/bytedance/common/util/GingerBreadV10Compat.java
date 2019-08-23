package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;

public class GingerBreadV10Compat {
    static final BaseImpl IMPL;

    static class BaseImpl {
        BaseImpl() {
        }

        public Bitmap createVideoThumbnail(String str, int i, int i2) {
            return ThumbnailUtils.createVideoThumbnail(str, i);
        }

        public Bitmap createVideoThumbnail(String str, int i, int i2, int i3) {
            return ThumbnailUtils.createVideoThumbnail(str, i);
        }
    }

    @TargetApi(10)
    static class V10Impl extends BaseImpl {
        V10Impl() {
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0018 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap createVideoThumbnail(java.lang.String r3, int r4, int r5) {
            /*
                r2 = this;
                android.media.MediaMetadataRetriever r4 = new android.media.MediaMetadataRetriever
                r4.<init>()
                r5 = 0
                r4.setDataSource(r3)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0018, all -> 0x0013 }
                r0 = -1
                android.graphics.Bitmap r3 = r4.getFrameAtTime(r0)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0018, all -> 0x0013 }
                r4.release()     // Catch:{ RuntimeException -> 0x001c }
                goto L_0x001c
            L_0x0013:
                r3 = move-exception
                r4.release()     // Catch:{ RuntimeException -> 0x0017 }
            L_0x0017:
                throw r3
            L_0x0018:
                r4.release()     // Catch:{ RuntimeException -> 0x001b }
            L_0x001b:
                r3 = r5
            L_0x001c:
                if (r3 != 0) goto L_0x001f
                return r5
            L_0x001f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.util.GingerBreadV10Compat.V10Impl.createVideoThumbnail(java.lang.String, int, int):android.graphics.Bitmap");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0018 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap createVideoThumbnail(java.lang.String r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever
                r5.<init>()
                r0 = 0
                r5.setDataSource(r4)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0018, all -> 0x0013 }
                r1 = -1
                android.graphics.Bitmap r4 = r5.getFrameAtTime(r1)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0018, all -> 0x0013 }
                r5.release()     // Catch:{ RuntimeException -> 0x001c }
                goto L_0x001c
            L_0x0013:
                r4 = move-exception
                r5.release()     // Catch:{ RuntimeException -> 0x0017 }
            L_0x0017:
                throw r4
            L_0x0018:
                r5.release()     // Catch:{ RuntimeException -> 0x001b }
            L_0x001b:
                r4 = r0
            L_0x001c:
                if (r4 != 0) goto L_0x001f
                return r0
            L_0x001f:
                r5 = 1
                android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r6, r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.util.GingerBreadV10Compat.V10Impl.createVideoThumbnail(java.lang.String, int, int, int):android.graphics.Bitmap");
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 10) {
            IMPL = new V10Impl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static Bitmap createVideoThumbnail(String str, int i, int i2) {
        return IMPL.createVideoThumbnail(str, i, i2);
    }

    public static Bitmap createVideoThumbnail(String str, int i, int i2, int i3) {
        return IMPL.createVideoThumbnail(str, i, i2, i3);
    }
}
