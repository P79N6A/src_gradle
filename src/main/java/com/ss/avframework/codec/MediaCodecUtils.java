package com.ss.avframework.codec;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.support.annotation.Nullable;
import com.ss.avframework.utils.AVLog;
import java.util.Arrays;
import java.util.List;

@TargetApi(18)
public class MediaCodecUtils {
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList(new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"});
    static final int[] TEXTURE_COLOR_FORMATS = {2130708361};

    private MediaCodecUtils() {
    }

    @Nullable
    public static MediaCodecInfo findCodecForType(String str) {
        MediaCodecInfo mediaCodecInfo;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e2) {
                AVLog.e("MediaCodecUtils", "Cannot retrieve encoder codec info" + e2);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, str)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    private static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        boolean z = false;
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if ((name.startsWith("OMX.qcom.") && Build.VERSION.SDK_INT >= 19) || ((name.startsWith("OMX.Exynos.") && Build.VERSION.SDK_INT >= 21) || (name.startsWith("OMX.MTK.") && Build.VERSION.SDK_INT >= 18))) {
            z = true;
        }
        return z;
    }

    static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, String str) {
        for (String equals : mediaCodecInfo.getSupportedTypes()) {
            if (str.equals(equals)) {
                AVLog.d("BUGGG", " find mime");
                return true;
            }
        }
        return false;
    }

    private static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, String str) {
        if (str.equalsIgnoreCase("video/avc")) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (str.equalsIgnoreCase("video/hevc")) {
            return true;
        }
        return false;
    }

    @Nullable
    static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, String str) {
        if (!codecSupportsType(mediaCodecInfo, str)) {
            return false;
        }
        AVLog.d("BUGGG", mediaCodecInfo.getName() + " | " + str);
        if (selectColorFormat(ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(str)) == null) {
            return false;
        }
        return isHardwareSupportedInCurrentSdk(mediaCodecInfo, str);
    }
}
