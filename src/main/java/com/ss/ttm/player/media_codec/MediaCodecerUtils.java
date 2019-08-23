package com.ss.ttm.player.media_codec;

import com.meituan.robust.ChangeQuickRedirect;

public class MediaCodecerUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static native long createMediaCodecer(int i);
}
