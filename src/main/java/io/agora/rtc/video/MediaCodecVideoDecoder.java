package io.agora.rtc.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoDecoder {
    private static int codecErrors;
    private static MediaCodecVideoDecoderErrorCallback errorCallback;
    private static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static MediaCodecVideoDecoder runningInstance;
    private static final List<Integer> supportedColorList = Arrays.asList(new Integer[]{19, 21, 2141391872, 2141391876});
    private static final String[] supportedH264HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    private static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    private static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    private int colorFormat;
    private int cropHeight;
    private int cropWidth;
    private final Queue<TimeStamps> decodeStartTimeMs = new LinkedList();
    private final Queue<DecodedOutputBuffer> dequeuedSurfaceOutputBuffers = new LinkedList();
    private int droppedFrames;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private Surface surface = null;
    private boolean useSurface;
    private int width;

    static class DecodedOutputBuffer {
        private final long decodeTimeMs;
        private final long endDecodeTimeMs;
        private final int index;
        private final long ntpTimeStampMs;
        private final int offset;
        private final long presentationTimeStampMs;
        private final int size;
        private final long timeStampMs;

        public DecodedOutputBuffer(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }
    }

    static class DecodedTextureBuffer {
        private final long decodeTimeMs;
        private final long frameDelayMs;
        private final long ntpTimeStampMs;
        private final long presentationTimeStampMs;
        private final int textureID;
        private final long timeStampMs;
        private final float[] transformMatrix;

        public DecodedTextureBuffer(int i, float[] fArr, long j, long j2, long j3, long j4, long j5) {
            this.textureID = i;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }
    }

    static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i) {
            this.codecName = str;
            this.colorFormat = i;
        }
    }

    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i);
    }

    class SurfaceTextureHelper {
        SurfaceTextureHelper() {
        }
    }

    static class TimeStamps {
        public final long decodeStartTimeMs;
        public final long ntpTimeStampMs;
        public final long timeStampMs;

        public TimeStamps(long j, long j2, long j3) {
            this.decodeStartTimeMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264
    }

    private void checkOnMediaCodecThread() throws IllegalStateException {
    }

    public static void disableVp8HwCodec() {
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableH264HwCodec() {
        Logging.w("MediaCodecVideoDecoder", "H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableVp9HwCodec() {
        Logging.w("MediaCodecVideoDecoder", "VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000);
        } catch (IllegalStateException e2) {
            Logging.e("MediaCodecVideoDecoder", "dequeueIntputBuffer failed", e2);
            return -2;
        }
    }

    public static boolean isH264HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", supportedH264HwCodecPrefixes) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes) == null) {
            return false;
        }
        return true;
    }

    public static void printStackTrace() {
        if (runningInstance != null && runningInstance.mediaCodecThread != null) {
            StackTraceElement[] stackTrace = runningInstance.mediaCodecThread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.d("MediaCodecVideoDecoder", "MediaCodecVideoDecoder stacks trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.d("MediaCodecVideoDecoder", stackTraceElement.toString());
                }
            }
        }
    }

    private void release() {
        Logging.d("MediaCodecVideoDecoder", "Java releaseDecoder. Total number of dropped frames: " + this.droppedFrames);
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Logging.d("MediaCodecVideoDecoder", "Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder.this.mediaCodec.stop();
                    MediaCodecVideoDecoder.this.mediaCodec.release();
                    Logging.d("MediaCodecVideoDecoder", "Java releaseDecoder on release thread done");
                } catch (Exception e2) {
                    Logging.e("MediaCodecVideoDecoder", "Media decoder release failed", e2);
                }
                countDownLatch.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000)) {
            Logging.e("MediaCodecVideoDecoder", "Media decoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                Logging.e("MediaCodecVideoDecoder", "Invoke codec error callback. Errors: " + codecErrors);
                errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        Logging.d("MediaCodecVideoDecoder", "Java releaseDecoder done");
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    private void returnDecodedOutputBuffer(int i) throws IllegalStateException, MediaCodec.CodecException {
        checkOnMediaCodecThread();
        if (!this.useSurface) {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        throw new IllegalStateException("returnDecodedOutputBuffer() called for surface decoding.");
    }

    private DecodedOutputBuffer dequeueOutputBuffer(int i) {
        long j;
        int integer;
        int integer2;
        checkOnMediaCodecThread();
        if (this.decodeStartTimeMs.isEmpty()) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i));
            switch (dequeueOutputBuffer) {
                case -3:
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    Logging.d("MediaCodecVideoDecoder", "Decoder output buffers changed: " + this.outputBuffers.length);
                    if (!this.hasDecodedFirstFrame) {
                        break;
                    } else {
                        throw new RuntimeException("Unexpected output buffer change event.");
                    }
                case -2:
                    MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                    Logging.d("MediaCodecVideoDecoder", "Decoder format changed: " + outputFormat.toString());
                    integer = outputFormat.getInteger("width");
                    integer2 = outputFormat.getInteger("height");
                    if (!this.hasDecodedFirstFrame || (integer == this.width && integer2 == this.height)) {
                        this.width = outputFormat.getInteger("width");
                        this.height = outputFormat.getInteger("height");
                        if (!this.useSurface && outputFormat.containsKey("color-format")) {
                            this.colorFormat = outputFormat.getInteger("color-format");
                            Logging.d("MediaCodecVideoDecoder", "Color: 0x" + Integer.toHexString(this.colorFormat));
                            if (!supportedColorList.contains(Integer.valueOf(this.colorFormat))) {
                                throw new IllegalStateException("Non supported color format: " + this.colorFormat);
                            }
                        }
                        if (outputFormat.containsKey("stride")) {
                            this.stride = outputFormat.getInteger("stride");
                        }
                        if (outputFormat.containsKey("slice-height")) {
                            this.sliceHeight = outputFormat.getInteger("slice-height");
                        }
                        if (!outputFormat.containsKey("crop-left") || !outputFormat.containsKey("crop-right")) {
                            this.cropWidth = this.width;
                        } else {
                            this.cropWidth = (outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1;
                        }
                        if (!outputFormat.containsKey("crop-bottom") || !outputFormat.containsKey("crop-top")) {
                            this.cropHeight = this.height;
                        } else {
                            this.cropHeight = (outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1;
                        }
                        Logging.d("MediaCodecVideoDecoder", "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                        Logging.d("MediaCodecVideoDecoder", "Crop width and height: " + this.cropWidth + " x " + this.cropHeight);
                        this.stride = Math.max(this.width, this.stride);
                        this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        break;
                    }
                    break;
                case -1:
                    return null;
                default:
                    this.hasDecodedFirstFrame = true;
                    TimeStamps remove = this.decodeStartTimeMs.remove();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - remove.decodeStartTimeMs;
                    if (elapsedRealtime > 500) {
                        Logging.e("MediaCodecVideoDecoder", "Very high decode time: " + elapsedRealtime + "ms. Might be caused by resuming H264 decoding after a pause.");
                        j = 500;
                    } else {
                        j = elapsedRealtime;
                    }
                    DecodedOutputBuffer decodedOutputBuffer = new DecodedOutputBuffer(dequeueOutputBuffer, bufferInfo.offset, bufferInfo.size, TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), remove.timeStampMs, remove.ntpTimeStampMs, j, SystemClock.elapsedRealtime());
                    return decodedOutputBuffer;
            }
        }
        throw new RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2);
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
        }
        Logging.d("MediaCodecVideoDecoder", "Java reset: " + i + " x " + i2);
        this.mediaCodec.flush();
        this.width = i;
        this.height = i2;
        this.decodeStartTimeMs.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private static DecoderProperties findDecoder(String str, String[] strArr) {
        String str2;
        boolean z;
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        Logging.d("MediaCodecVideoDecoder", "Trying to find HW decoder for mime " + str);
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        str2 = null;
                        break;
                    } else if (supportedTypes[i2].equals(str)) {
                        str2 = codecInfoAt.getName();
                        break;
                    } else {
                        i2++;
                    }
                }
                if (str2 != null) {
                    Logging.d("MediaCodecVideoDecoder", "Found candidate decoder " + str2);
                    int length2 = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z = false;
                            break;
                        } else if (str2.startsWith(strArr[i3])) {
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                        for (int i4 : capabilitiesForType.colorFormats) {
                            Logging.d("MediaCodecVideoDecoder", "   Color: 0x" + Integer.toHexString(i4));
                        }
                        for (Integer intValue : supportedColorList) {
                            int intValue2 = intValue.intValue();
                            int[] iArr = capabilitiesForType.colorFormats;
                            int length3 = iArr.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length3) {
                                    int i6 = iArr[i5];
                                    if (i6 == intValue2) {
                                        Logging.d("MediaCodecVideoDecoder", "Found target decoder " + str2 + ". Color: 0x" + Integer.toHexString(i6));
                                        return new DecoderProperties(str2, i6);
                                    }
                                    i5++;
                                }
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        Logging.d("MediaCodecVideoDecoder", "No HW decoder found for mime " + str);
        return null;
    }

    private boolean initDecode(int i, int i2, int i3, SurfaceTextureHelper surfaceTextureHelper) {
        boolean z;
        String str;
        String[] strArr;
        if (this.mediaCodecThread == null) {
            if (surfaceTextureHelper != null) {
                z = true;
            } else {
                z = false;
            }
            this.useSurface = z;
            VideoCodecType videoCodecType = VideoCodecType.values()[i];
            if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP8) {
                str = "video/x-vnd.on2.vp8";
                strArr = supportedVp8HwCodecPrefixes;
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
                str = "video/x-vnd.on2.vp9";
                strArr = supportedVp9HwCodecPrefixes;
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_H264) {
                str = "video/avc";
                strArr = supportedH264HwCodecPrefixes;
            } else {
                throw new RuntimeException("initDecode: Non-supported codec " + videoCodecType);
            }
            DecoderProperties findDecoder = findDecoder(str, strArr);
            if (findDecoder != null) {
                Logging.d("MediaCodecVideoDecoder", "Java initDecode: " + videoCodecType + " : " + i2 + " x " + i3 + ". Color: 0x" + Integer.toHexString(findDecoder.colorFormat) + ". Use Surface: " + this.useSurface);
                runningInstance = this;
                this.mediaCodecThread = Thread.currentThread();
                try {
                    this.width = i2;
                    this.height = i3;
                    this.stride = i2;
                    this.sliceHeight = i3;
                    this.cropWidth = i2;
                    this.cropHeight = i3;
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i2, i3);
                    if (!this.useSurface) {
                        createVideoFormat.setInteger("color-format", findDecoder.colorFormat);
                    }
                    Logging.d("MediaCodecVideoDecoder", "  Format: " + createVideoFormat);
                    this.mediaCodec = MediaCodecVideoEncoder.createByCodecName(findDecoder.codecName);
                    if (this.mediaCodec == null) {
                        Logging.e("MediaCodecVideoDecoder", "Can not create media decoder");
                        return false;
                    }
                    this.mediaCodec.configure(createVideoFormat, this.surface, null, 0);
                    this.mediaCodec.start();
                    this.colorFormat = findDecoder.colorFormat;
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    this.inputBuffers = this.mediaCodec.getInputBuffers();
                    this.decodeStartTimeMs.clear();
                    this.hasDecodedFirstFrame = false;
                    this.dequeuedSurfaceOutputBuffers.clear();
                    this.droppedFrames = 0;
                    Logging.d("MediaCodecVideoDecoder", "Input buffers: " + this.inputBuffers.length + ". Output buffers: " + this.outputBuffers.length);
                    return true;
                } catch (IllegalStateException e2) {
                    Logging.e("MediaCodecVideoDecoder", "initDecode failed", e2);
                    return false;
                }
            } else {
                throw new RuntimeException("Cannot find HW decoder for " + videoCodecType);
            }
        } else {
            throw new RuntimeException("initDecode: Forgot to release()?");
        }
    }

    private boolean queueInputBuffer(int i, int i2, long j, long j2, long j3) {
        checkOnMediaCodecThread();
        try {
            this.inputBuffers[i].position(0);
            this.inputBuffers[i].limit(i2);
            Queue<TimeStamps> queue = this.decodeStartTimeMs;
            TimeStamps timeStamps = new TimeStamps(SystemClock.elapsedRealtime(), j2, j3);
            queue.add(timeStamps);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e2) {
            Logging.e("MediaCodecVideoDecoder", "decode failed", e2);
            return false;
        }
    }
}
