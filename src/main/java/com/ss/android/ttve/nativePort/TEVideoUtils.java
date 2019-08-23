package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.vesdk.r;
import java.util.ArrayList;

@Keep
public final class TEVideoUtils {

    @Keep
    public interface ExecuteCommandListener {
        @Keep
        void onProgressChanged(int i);
    }

    private static native int nativeClearWavSeg(String str, int i, int i2);

    private static native int nativeConcat(String[] strArr, String str);

    private static native long nativeCreateGetFrameHandler(String str);

    private static native long nativeCreateRTAudioWaveformMgr(int i, int i2, float f2, int i3);

    private static native int nativeDeleteRTAudioWaveformMgr(long j);

    private static native int nativeExecuteFFmpegCommand(String str, ExecuteCommandListener executeCommandListener);

    private static native String nativeFindBestRemuxSuffix(@NonNull String str);

    private static native int nativeGenerateMuteWav(String str, int i, int i2, int i3);

    private static native int nativeGetAudioFileInfo(String str, int[] iArr);

    private static native VEMusicWaveBean nativeGetAudioWaveData(String str, int i, int i2, int i3, int i4, int i5);

    private static native void nativeGetDstBitmapSize(long j, int i, int i2, int[] iArr);

    private static native int nativeGetFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z);

    private static native int nativeGetFileInfo(String str, int[] iArr);

    private static native int nativeGetFileInfoFd(int i, long j, long j2, int[] iArr);

    private static native int nativeGetFrameWithHandler(long j, Bitmap bitmap, int i, int i2, int i3, boolean z);

    private static native VEMusicWaveBean nativeGetResampleMusicWaveData(float[] fArr, int i, int i2);

    private static native int nativeGetVideoFrame(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    private static native int nativeGetVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4);

    private static native int nativeIsCanImport(String str);

    private static native int nativeIsCanImportFd(int i, long j, long j2);

    private static native int nativeIsCanTransCode(String str, int i, int i2);

    private static native int nativeMixAudio(ArrayList<String> arrayList, String str, Object obj);

    private static native int nativeMux(String str, String str2, String str3);

    private static native int nativeRTAudioWaveformFinish(long j);

    private static native int nativeRTAudioWaveformGetPoints(long j, float[] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformProcess(long j, float[][] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformReset(long j);

    private static native void nativeReleaseGetFrameHandler(long j);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio(String str, String str2, String str3);

    private static native int nativeReverseAllIVideo(String str, String str2);

    private static native int nativeReverseAllIVideo2(String str, String str2, TEReverseCallback tEReverseCallback);

    private static native int nativeTransCodecAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5);

    private static native int nativeTrimFile(String str, String str2, int[] iArr, int[] iArr2);

    static {
        b.a();
    }

    public static void releaseGetFrameHandler(long j) {
        nativeReleaseGetFrameHandler(j);
    }

    public static long createGetFrameHandler(String str) {
        return nativeCreateGetFrameHandler(str);
    }

    public static int deleteRTAudioWaveformMgr(long j) {
        return nativeDeleteRTAudioWaveformMgr(j);
    }

    public static int rtAudioWaveformFinish(long j) {
        return nativeRTAudioWaveformFinish(j);
    }

    public static int rtAudioWaveformReset(long j) {
        return nativeRTAudioWaveformReset(j);
    }

    public static int isCanImport(String str) {
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeIsCanImport(str);
    }

    public static String findBestRemuxSuffix(@NonNull String str) throws r {
        if (str.length() > 0) {
            String nativeFindBestRemuxSuffix = nativeFindBestRemuxSuffix(str);
            if (nativeFindBestRemuxSuffix.length() > 0) {
                return nativeFindBestRemuxSuffix;
            }
            throw new r(-205, "该文件暂不支持转封装!");
        }
        throw new r(-100, "请检查输入参数!");
    }

    public static int concat(String[] strArr, String str) {
        return nativeConcat(strArr, str);
    }

    public static int executeFFmpegCommand(String str, @Nullable ExecuteCommandListener executeCommandListener) {
        return nativeExecuteFFmpegCommand(str, executeCommandListener);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        return nativeGetAudioFileInfo(str, iArr);
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        return nativeGetFileInfo(str, iArr);
    }

    public static int reverseAllIVideo(@NonNull String str, @NonNull String str2) {
        return nativeReverseAllIVideo(str, str2);
    }

    public static int clearWavSeg(String str, int i, int i2) {
        return nativeClearWavSeg(str, i, i2);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        return nativeGetResampleMusicWaveData(fArr, i, i2);
    }

    public static int isCanTransCode(@NonNull String str, int i, int i2) {
        return nativeIsCanTransCode(str, i, i2);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, @Nullable Object obj) {
        return nativeMixAudio(arrayList, str, obj);
    }

    public static int mux(String str, String str2, String str3) {
        return nativeMux(str, str2, str3);
    }

    public static int reverseAllIVideoAndMuxAudio(@NonNull String str, String str2, @NonNull String str3) {
        return nativeReverseAllIFrameVideoAndMuxAudio(str, str2, str3);
    }

    public static int isCanImportFd(int i, long j, long j2) {
        if (i <= 0) {
            return -100;
        }
        return nativeIsCanImportFd(i, j, j2);
    }

    public static int reverseAllIVideo(@NonNull String str, @NonNull String str2, @NonNull TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIVideo2(str, str2, tEReverseCallback);
    }

    public static long createRTAudioWaveformMgr(int i, int i2, float f2, int i3) {
        return nativeCreateRTAudioWaveformMgr(i, i2, f2, i3);
    }

    public static int generateMuteWav(String str, int i, int i2, int i3) {
        return nativeGenerateMuteWav(str, i, i2, i3);
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z) {
        return nativeGetFileAudio(str, str2, arrayList, z);
    }

    public static int getVideoFileInfoFd(int i, long j, long j2, int[] iArr) {
        return nativeGetFileInfoFd(i, j, j2, iArr);
    }

    public static int rtAudioWaveformGetPoints(long j, float[] fArr, int i, int i2) {
        return nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
    }

    public static int rtAudioWaveformProcess(long j, float[][] fArr, int i, int i2) {
        return nativeRTAudioWaveformProcess(j, fArr, i, i2);
    }

    public static int trimVideoFile(String str, int[] iArr, String str2, int[] iArr2) {
        return nativeTrimFile(str, str2, iArr, iArr2);
    }

    public static Bitmap getFrameWithHandler(long j, int i, int i2, int i3, boolean z) {
        int[] iArr = new int[2];
        nativeGetDstBitmapSize(j, i2, i3, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        if (nativeGetFrameWithHandler(j, createBitmap, i, iArr[0], iArr[1], z) != 0) {
            createBitmap = null;
        }
        return createBitmap;
    }

    public static VEMusicWaveBean getAudioWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        return nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame(str, iArr, i, i2, z, obj);
    }

    public static int transCodeAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return nativeTransCodecAudioFile(str, i, i2, str2, i3, i4, i5);
        }
        return -100;
    }

    public static int getVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4) {
        return nativeGetVideoThumb(str, i, obj, z, i2, i3, j, i4);
    }
}
