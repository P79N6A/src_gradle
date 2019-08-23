package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMusicSRTEffectParam;
import com.ss.android.vesdk.VEStickerAnimator;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.ag;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.c;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEColorFilterParam;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.filterparam.b;
import com.ss.android.vesdk.h;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.u;
import com.ss.android.vesdk.y;
import java.util.ArrayList;
import java.util.Arrays;

@Keep
public final class TEInterface extends TENativeServiceBase {
    private int mHostTrackIndex = -1;
    private long mNative;

    private native int nativeAddAudioTrack(long j, String str, int i, int i2, int i3, int i4, boolean z);

    private native int nativeAddAudioTrack2(long j, String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6);

    private native int nativeAddAudioTrackMV(long j, String str, int i, int i2, int i3, int i4, int i5, boolean z);

    private native int nativeAddExternalTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d2, double d3, double d4, double d5, int i, int i2);

    private native int nativeAddExternalTrackMV(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, double d2, double d3, double d4, double d5, int i, int i2);

    private native int[] nativeAddFilters(long j, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6);

    private native int nativeAddInfoSticker(long j, String str, String[] strArr);

    private native int nativeAddInfoStickerWithBuffer(long j);

    private native void nativeAddMetaData(long j, String str, String str2);

    private native int nativeAddVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i);

    private native int nativeAdjustFilterInOut(long j, int i, int i2, int i3);

    private native int nativeBegin2DBrush(long j);

    private native int nativeCancelGetImages(long j);

    private native int nativeChangeTransitonAt(long j, int i, VETransitionFilterParam vETransitionFilterParam);

    private native void nativeClearDisplay(long j, int i);

    private native int nativeControlInfoStickerAnimationPreview(long j, boolean z, int i);

    private native int nativeCreateCanvasScene(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, int[] iArr5, int[] iArr6, String[][] strArr4, float[] fArr, int i);

    private native long nativeCreateEngine();

    private native int nativeCreateImageScene(long j, Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i);

    private native int nativeCreateScene(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i);

    private native int nativeCreateScene2(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int[] iArr5, int i);

    private native int nativeCreateSceneMV(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i);

    private native int nativeCreateTimeline(long j);

    private native int nativeDeleteAudioTrack(long j, int i, boolean z);

    private native int nativeDeleteClip(long j, int i, int i2);

    private native int nativeDeleteExternalTrack(long j, int i);

    private native int nativeDestroyEngine(long j);

    private native int nativeEnableEffectAmazing(long j, boolean z);

    private native int nativeEnd2DBrush(long j, String str);

    private native int nativeGet2DBrushStrokeCount(long j);

    private native byte[] nativeGetAudioCommonFilterPreprocessResult(long j, long j2);

    private native long nativeGetClipSequenceOut(long j, int i, int i2, int i3);

    private native int nativeGetCurPosition(long j);

    private native int nativeGetCurState(long j);

    private native int[] nativeGetDecodeDumpSize(long j, int i);

    private native int nativeGetDecodeImage(long j, byte[] bArr, int i);

    private native int[] nativeGetDisplayDumpSize(long j);

    private native int nativeGetDisplayImage(long j, Bitmap bitmap);

    private native int nativeGetDuration(long j);

    private native long nativeGetDurationUs(long j);

    private native int nativeGetExternalTrackFilter(long j, int i);

    private native int nativeGetImages(long j, int[] iArr, int i, int i2, int i3);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i);

    private native float[] nativeGetInfoStickerBoundingBoxWithoutRotate(long j, int i);

    private native int nativeGetInfoStickerFlip(long j, int i, boolean[] zArr);

    private native int[] nativeGetInitResolution(long j);

    private native Object nativeGetMVOriginalBackgroundAudio(long j);

    private native String nativeGetMetaData(long j, String str);

    private native float nativeGetTrackVolume(long j, int i, int i2, int i3);

    private native Object nativeInitMVResources(long j, String str, String[] strArr, String[] strArr2, @Nullable String str2, int i, int i2, boolean z, boolean z2);

    private native int nativeInsertClip(long j, int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native boolean nativeIsInfoStickerAnimatable(long j, int i);

    private native int nativeLockSeekVideoClip(long j, int i);

    private native int nativePause(long j);

    private native int nativePauseInfoStickerAnimation(long j, boolean z);

    private native int nativePauseSync(long j);

    private native int nativePrepareEngine(long j, int i);

    private native int nativePreprocessAudioTrackForFilter(long j, int i, int i2, String str, @Nullable byte[] bArr, long[] jArr);

    private native int nativeProcessLongPressEvent(long j, float f2, float f3);

    private native int nativeProcessPanEvent(long j, float f2, float f3, float f4, float f5, float f6);

    private native int nativeProcessRotationEvent(long j, float f2, float f3);

    private native int nativeProcessScaleEvent(long j, float f2, float f3);

    private native int nativeProcessTouchDownEvent(long j, float f2, float f3, int i);

    private native int nativeProcessTouchMoveEvent(long j, float f2, float f3);

    private native int nativeProcessTouchUpEvent(long j, float f2, float f3, int i);

    private native int nativeRefreshCurrentFrame(long j);

    private native int nativeReleaseEngine(long j);

    private native void nativeReleasePreviewSurface(long j);

    private native int nativeRemoveEffectCallback(long j);

    private native int nativeRemoveFilter(long j, int[] iArr);

    private native int nativeRemoveInfoSticker(long j, int i);

    private native int nativeRemoveInfoStickerWithBuffer(long j, int i);

    private native int nativeReplaceClip(long j, int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native void nativeResetCallback(long j);

    private native int nativeRestore(long j, String str);

    private native String nativeSave(long j);

    private native int nativeSeek(long j, int i, int i2, int i3, int i4);

    private native int nativeSet2DBrushCanvasColor(long j, float f2);

    private native int nativeSet2DBrushColor(long j, float f2, float f3, float f4, float f5);

    private native int nativeSet2DBrushSize(long j, float f2);

    private native void nativeSetBackGroundColor(long j, int i);

    private native int nativeSetClipAttr(long j, int i, int i2, int i3, String str, String str2);

    private native int nativeSetDestroyVersion(long j, boolean z);

    private native void nativeSetDisplayState(long j, float f2, float f3, float f4, float f5, int i, int i2, int i3);

    private native int nativeSetDldEnabled(long j, boolean z);

    private native int nativeSetDldThrVal(long j, int i);

    private native int nativeSetDleEnabled(long j, boolean z);

    private native int nativeSetDleEnabledPreview(long j, boolean z);

    private native int nativeSetEffectCallback(long j, VEListener.VEEditorEffectListener vEEditorEffectListener);

    private native void nativeSetEnableMultipleAudioFilter(long j, boolean z);

    private native void nativeSetEnableRemuxVideo(long j, boolean z);

    private native void nativeSetEncoderParallel(long j, boolean z);

    private native void nativeSetExpandLastFrame(long j, boolean z);

    private native int nativeSetFilterParam(long j, int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam);

    private native int nativeSetFilterParam(long j, int i, String str, VEStickerAnimator vEStickerAnimator);

    private native int nativeSetFilterParam(long j, int i, String str, String str2);

    private native int nativeSetFilterParam2(long j, int i, String str, byte[] bArr);

    private native int nativeSetInfoStickerAnimationParam(long j, int i, boolean z, int i2, int i3, int i4, int i5, int i6);

    private native int nativeSetInfoStickerAnimationPreview(long j, int i, boolean z);

    private native int nativeSetInfoStickerBufferCallback(long j, VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    private native int nativeSetInfoStickerFlip(long j, int i, boolean z, boolean z2);

    private native float nativeSetInfoStickerScale(long j, int i, float f2);

    private static native int nativeSetMaxSoftwareVideoReaderCount(int i);

    private static native int nativeSetOptVersion(int i);

    private native void nativeSetOption(long j, int i, String str, float f2);

    private native void nativeSetOption(long j, int i, String str, long j2);

    private native void nativeSetOption(long j, int i, String str, String str2);

    private native void nativeSetOptionArray(long j, int i, String[] strArr, long[] jArr);

    private native void nativeSetPreviewFps(long j, int i);

    private native int nativeSetPreviewScaleMode(long j, int i);

    private native void nativeSetPreviewSurface(long j, Surface surface);

    private native void nativeSetSpeedRatio(long j, float f2);

    private native void nativeSetSurfaceSize(long j, int i, int i2);

    private native int nativeSetTimeRange(long j, int i, int i2, int i3);

    private native int nativeSetTrackDurationType(long j, int i, int i2, int i3);

    private native int nativeSetTrackMinMaxDuration(long j, int i, int i2, int i3, int i4);

    private native boolean nativeSetTrackVolume(long j, int i, int i2, float f2);

    private native int nativeSetTransitionAt(long j, int i, long j2, String str);

    private native void nativeSetVideoBackGroundColor(long j, int i);

    private native void nativeSetViewPort(long j, int i, int i2, int i3, int i4);

    private native void nativeSetWaterMark(long j, ArrayList<String[]> arrayList, int i, int i2, int i3, int i4, int i5, long j2, int i6, VEWatermarkParam.VEWatermarkMask vEWatermarkMask);

    private native int nativeStart(long j);

    private native int nativeStop(long j);

    private native boolean nativeTestSerialization(long j);

    private native int nativeUndo2DBrush(long j);

    private native int nativeUpdateAudioEffectFilterParam(long j, int i, int i2, VEAudioEffectFilterParam vEAudioEffectFilterParam);

    private native int nativeUpdateAudioFadeFilterParam(long j, int i, int i2, VEAudioFadeFilterParam vEAudioFadeFilterParam);

    private native int nativeUpdateAudioTrack(long j, int i, int i2, int i3, int i4, int i5, boolean z);

    private native int nativeUpdateAudioTrack2(long j, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7);

    private native int nativeUpdateAudioVolumeFilterParam(long j, int i, int i2, VEAudioVolumeFilterParam vEAudioVolumeFilterParam);

    private native int nativeUpdateBeautyFilterParam(long j, int i, int i2, VEBeautyFilterParam vEBeautyFilterParam);

    private native int nativeUpdateCanvasFilterParam(long j, int i, int i2, VECanvasFilterParam vECanvasFilterParam);

    private native int nativeUpdateClipsSourceParam(long j, int i, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr);

    private native int nativeUpdateClipsTimelineParam(long j, int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    private native int nativeUpdateColorFilterParam(long j, int i, int i2, VEColorFilterParam vEColorFilterParam);

    private native int nativeUpdateEffectComposerParam(long j, int i, int i2, VEComposerFilterParam vEComposerFilterParam);

    private native int nativeUpdateEffectFilterParam(long j, int i, int i2, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeUpdateFilterTime(long j, int i, int i2, int i3, int i4);

    private native int nativeUpdateQualityFilterParam(long j, int i, int i2, VEVideoAjustmentFilterParam vEVideoAjustmentFilterParam);

    private native int nativeUpdateReshapeFilterParam(long j, int i, int i2, VEReshapeFilterParam vEReshapeFilterParam);

    private native int nativeUpdateScene(long j, String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeUpdateSceneFileOrder(long j, int[] iArr);

    private native int nativeUpdateSceneTime(long j, boolean[] zArr, int[] iArr, int[] iArr2, int[] iArr3, double[] dArr);

    private native int nativeUpdateTrackClip(long j, int i, int i2, String[] strArr);

    private native int nativeUpdateTrackFilter(long j, int i, int i2, boolean z);

    private native int nativeUpdateTrackFilterDuration(long j, int i, int i2, boolean z, long j2);

    private native int nativeUpdateVideoTransformFilterParam(long j, int i, int i2, VEVideoTransformFilterParam vEVideoTransformFilterParam);

    public final native int nativeSetAudioOffset(long j, int i, int i2);

    public final native String stringFromJNI();

    static {
        b.a();
    }

    public final int getHostTrackIndex() {
        return this.mHostTrackIndex;
    }

    public final long getNativeHandler() {
        return this.mNative;
    }

    private TEInterface() {
    }

    public final int cancelGetImages() {
        return nativeCancelGetImages(this.mNative);
    }

    public final boolean testSerialization() {
        return nativeTestSerialization(this.mNative);
    }

    public final void releasePreviewSurface() {
        if (this.mNative != 0) {
            nativeReleasePreviewSurface(this.mNative);
        }
    }

    public final int addInfoStickerWithBuffer() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeAddInfoStickerWithBuffer(this.mNative);
    }

    public final int begin2DBrush() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeBegin2DBrush(this.mNative);
    }

    public final int createTimeline() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeCreateTimeline(this.mNative);
    }

    public final int destroyEngine() {
        if (this.mNative == 0) {
            return -112;
        }
        int nativeDestroyEngine = nativeDestroyEngine(this.mNative);
        this.mNative = 0;
        return nativeDestroyEngine;
    }

    public final int get2DBrushStrokeCount() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGet2DBrushStrokeCount(this.mNative);
    }

    public final int getCurPosition() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetCurPosition(this.mNative);
    }

    public final int getCurState() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetCurState(this.mNative);
    }

    public final int getDuration() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetDuration(this.mNative);
    }

    public final long getDurationUs() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetDurationUs(this.mNative);
    }

    public final Object getMVOriginalBackgroundAudio() {
        if (this.mNative != 0) {
            return nativeGetMVOriginalBackgroundAudio(this.mNative);
        }
        y.d("TEInterface", "getMVOriginalBackgroundAudio error, mNative == 0");
        return null;
    }

    public final int pause() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePause(this.mNative);
    }

    public final int pauseSync() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePauseSync(this.mNative);
    }

    public final int refreshCurrentFrame() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRefreshCurrentFrame(this.mNative);
    }

    public final int releaseEngine() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeReleaseEngine(this.mNative);
    }

    public final int removeEffectCallback() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveEffectCallback(this.mNative);
    }

    @Nullable
    public final String save() {
        if (this.mNative == 0) {
            return null;
        }
        String nativeSave = nativeSave(this.mNative);
        if (TextUtils.isEmpty(nativeSave)) {
            return null;
        }
        return nativeSave;
    }

    public final int start() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeStart(this.mNative);
    }

    public final int stop() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeStop(this.mNative);
    }

    public final int undo2DBrush() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUndo2DBrush(this.mNative);
    }

    public static TEInterface createEngine() {
        int i;
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.a().f78084f) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        long nativeCreateEngine = tEInterface.nativeCreateEngine();
        if (nativeCreateEngine == 0) {
            return null;
        }
        tEInterface.mNative = nativeCreateEngine;
        return tEInterface;
    }

    public final ag getDisplayRect() {
        if (this.mNative == 0) {
            return new ag(0, 0, 0, 0);
        }
        int[] nativeGetDisplayDumpSize = nativeGetDisplayDumpSize(this.mNative);
        return new ag(nativeGetDisplayDumpSize[0], nativeGetDisplayDumpSize[1], nativeGetDisplayDumpSize[2], nativeGetDisplayDumpSize[3]);
    }

    public final int[] getInitResolution() {
        int[] iArr = {-1, -1, -1, -1};
        if (this.mNative == 0) {
            return iArr;
        }
        return nativeGetInitResolution(this.mNative);
    }

    public final void setHostTrackIndex(int i) {
        this.mHostTrackIndex = i;
    }

    public static int setEnableOpt(int i) {
        return nativeSetOptVersion(i);
    }

    public static int setMaxSoftWareVideoReaderCount(int i) {
        return nativeSetMaxSoftwareVideoReaderCount(i);
    }

    public final void clearDisplay(int i) {
        nativeClearDisplay(this.mNative, i);
    }

    public final float[] getInfoStickerBoundingBox(int i) throws r {
        return getInfoStickerBoundingBox(i, true);
    }

    public final void setCompileFps(int i) {
        setOption(0, "CompileFps", (long) i);
    }

    public final void setCompileHardwareEncodeOptions(int i) {
        setOption(0, "CompileHardwareBitrate", (long) i);
    }

    public final void setCompileType(int i) {
        setOption(0, "CompileType", (long) i);
    }

    public final void setEncGopSize(int i) {
        setOption(0, "video gop size", (long) i);
    }

    public final void setPageMode(int i) {
        setOption(0, "engine page mode", (long) i);
    }

    public final void setScaleMode(int i) {
        setOption(0, "filter mode", (long) i);
    }

    public final void enableSimpleProcessor(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "engine processor mode", j);
    }

    public final void setBackGroundColor(int i) {
        if (this.mNative != 0) {
            nativeSetBackGroundColor(this.mNative, i);
        }
    }

    public final void setCompileWatermark(VEWatermarkParam vEWatermarkParam) {
        setOption(0, "CompilePathWatermark", vEWatermarkParam.extFile);
        setOption(0, "CompilePathWavWatermark", "");
    }

    public final void setEnableMultipleAudioFilter(boolean z) {
        if (this.mNative != 0) {
            nativeSetEnableMultipleAudioFilter(this.mNative, z);
        }
    }

    public final void setEnableRemuxVideo(boolean z) {
        if (this.mNative != 0) {
            nativeSetEnableRemuxVideo(this.mNative, z);
        }
    }

    public final void setEncoderParallel(boolean z) {
        if (this.mNative != 0) {
            nativeSetEncoderParallel(this.mNative, z);
        }
    }

    public final void setExpandLastFrame(boolean z) {
        if (this.mNative != 0) {
            nativeSetExpandLastFrame(this.mNative, z);
        }
    }

    public final void setLooping(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(1, "engine loop play", j);
    }

    public final void setPreviewSurface(Surface surface) {
        if (this.mNative != 0) {
            nativeSetPreviewSurface(this.mNative, surface);
        }
    }

    public final void setSpeedRatio(float f2) {
        if (this.mNative != 0) {
            nativeSetSpeedRatio(this.mNative, f2);
        }
    }

    public final void setUseHwEnc(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "HardwareVideo", j);
    }

    public final void setUseLargeMattingModel(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "UseLargeMattingModel", j);
    }

    public final void setVideoBackGroundColor(int i) {
        if (this.mNative != 0) {
            nativeSetVideoBackGroundColor(this.mNative, i);
        }
    }

    public final int deleteSticker(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteExternalTrack(this.mNative, i);
    }

    public final int deleteWatermark(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteExternalTrack(this.mNative, i);
    }

    public final int enableEffectAmazing(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeEnableEffectAmazing(this.mNative, z);
    }

    public final int end2DBrush(@NonNull String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeEnd2DBrush(this.mNative, str);
    }

    @Nullable
    public final byte[] getAudioCommonFilterPreprocessResult(long j) {
        if (this.mNative == 0) {
            return null;
        }
        return nativeGetAudioCommonFilterPreprocessResult(this.mNative, j);
    }

    public final int getDisplayImage(Bitmap bitmap) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetDisplayImage(this.mNative, bitmap);
    }

    public final String getMetaData(String str) {
        if (this.mNative == 0) {
            return "";
        }
        return nativeGetMetaData(this.mNative, str);
    }

    public final int getStickerFilterIndex(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeGetExternalTrackFilter(this.mNative, i);
    }

    public final boolean isInfoStickerAnimatable(int i) {
        if (this.mNative != 0 && this.mHostTrackIndex >= 0) {
            return nativeIsInfoStickerAnimatable(this.mNative, i);
        }
        return false;
    }

    public final int lockSeekVideoClip(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeLockSeekVideoClip(this.mNative, i);
    }

    public final int pauseInfoStickerAnimation(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativePauseInfoStickerAnimation(this.mNative, z);
    }

    public final int prepareEngine(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePrepareEngine(this.mNative, i);
    }

    public final int removeFilter(int[] iArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveFilter(this.mNative, iArr);
    }

    public final int removeInfoSticker(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeRemoveInfoSticker(this.mNative, i);
    }

    public final int removeInfoStickerWithBuffer(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveInfoStickerWithBuffer(this.mNative, i);
    }

    public final int restore(String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRestore(this.mNative, str);
    }

    public final int set2DBrushCanvasAlpha(float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSet2DBrushCanvasColor(this.mNative, f2);
    }

    public final int set2DBrushSize(float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSet2DBrushSize(this.mNative, f2);
    }

    public final int setDestroyVersion(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDestroyVersion(this.mNative, z);
    }

    public final int setDldEnabled(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDldEnabled(this.mNative, z);
    }

    public final int setDldThrVal(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDldThrVal(this.mNative, i);
    }

    public final int setDleEnabled(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDleEnabled(this.mNative, z);
    }

    public final int setDleEnabledPreview(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDleEnabledPreview(this.mNative, z);
    }

    public final int setEffectCallback(VEListener.VEEditorEffectListener vEEditorEffectListener) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetEffectCallback(this.mNative, vEEditorEffectListener);
    }

    public final void setEnableInterLeave(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileInterleave", j);
        }
    }

    public final int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetInfoStickerBufferCallback(this.mNative, vEInfoStickerBufferListener);
    }

    public final int setPreviewFps(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        nativeSetPreviewFps(this.mNative, i);
        return 0;
    }

    public final int setPreviewScaleMode(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetPreviewScaleMode(this.mNative, i);
    }

    public final int updateSceneFileOrder(al alVar) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateSceneFileOrder(this.mNative, alVar.f77893b);
    }

    public final ag getDecodeRect(int i) {
        if (this.mNative == 0) {
            return new ag(0, 0, 0, 0);
        }
        int[] nativeGetDecodeDumpSize = nativeGetDecodeDumpSize(this.mNative, i);
        return new ag(nativeGetDecodeDumpSize[0], nativeGetDecodeDumpSize[1], nativeGetDecodeDumpSize[2], nativeGetDecodeDumpSize[3]);
    }

    public final void setUsrRotate(int i) {
        if (i == 0) {
            setOption(0, "usr rotate", 0);
        } else if (i == 90) {
            setOption(0, "usr rotate", 1);
        } else if (i == 180) {
            setOption(0, "usr rotate", 2);
        } else if (i != 270) {
            setOption(0, "usr rotate", 0);
        } else {
            setOption(0, "usr rotate", 3);
        }
    }

    public final int updateSenceTime(al alVar) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateSceneTime(this.mNative, alVar.j, alVar.f77896e, alVar.f77897f, c.toIntArray(alVar.k), alVar.i);
    }

    public static TEInterface createEngine(long j) {
        int i;
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.a().f78084f) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        if (j == 0) {
            return null;
        }
        tEInterface.mNative = j;
        tEInterface.nativeResetCallback(j);
        return tEInterface;
    }

    public final void addMetaData(String str, String str2) {
        if (this.mNative != 0) {
            nativeAddMetaData(this.mNative, str, str2);
        }
    }

    public final void setCompileCommonEncodeOptions(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileEncodeProfile", (long) i2);
    }

    public final void setEngineCompilePath(String str, String str2) {
        setOption(0, "CompilePath", str);
        setOption(0, "CompilePathWav", str2);
    }

    public final void setSurfaceSize(int i, int i2) {
        if (this.mNative != 0) {
            nativeSetSurfaceSize(this.mNative, i, i2);
        }
    }

    public final void setVideoCompileBitrate(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileBitrateValue", (long) i2);
    }

    public final int addInfoSticker(String str, String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddInfoSticker(this.mNative, str, strArr);
    }

    public final int changeTransitionAt(int i, VETransitionFilterParam vETransitionFilterParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeChangeTransitonAt(this.mNative, i, vETransitionFilterParam);
    }

    public final int deleteAudioTrack(int i, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeDeleteAudioTrack(this.mNative, i, z);
    }

    public final int deleteClip(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeDeleteClip(this.mNative, i, i2);
    }

    public final int enableStickerAnimationPreview(int i, boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationPreview(this.mNative, i, z);
    }

    public final int getDecodeImage(byte[] bArr, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetDecodeImage(this.mNative, bArr, i);
    }

    public final int getInfoStickerFlip(int i, boolean[] zArr) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeGetInfoStickerFlip = nativeGetInfoStickerFlip(this.mNative, i, zArr);
        if (nativeGetInfoStickerFlip != 0) {
            return -1;
        }
        return nativeGetInfoStickerFlip;
    }

    public final int processLongPressEvent(float f2, float f3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessLongPressEvent(this.mNative, f2, f3);
    }

    public final int processRotationEvent(float f2, float f3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessRotationEvent(this.mNative, f2, f3);
    }

    public final int processScaleEvent(float f2, float f3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessScaleEvent(this.mNative, f2, f3);
    }

    public final int processTouchMoveEvent(float f2, float f3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessTouchMoveEvent(this.mNative, f2, f3);
    }

    public final int setAudioOffset(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetAudioOffset(this.mNative, i, i2);
    }

    public final float setInfoStickerScale(int i, float f2) {
        if (this.mNative == 0) {
            return -112.0f;
        }
        return nativeSetInfoStickerScale(this.mNative, i, f2);
    }

    public final void setMaxWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine max video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine max video height", (long) i2);
        }
    }

    public final void setWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine video height", (long) i2);
        }
    }

    public final float[] getInfoStickerBoundingBox(int i, boolean z) throws r {
        float[] fArr;
        if (this.mNative == 0) {
            throw new r(-112, "");
        } else if (this.mHostTrackIndex >= 0) {
            if (z) {
                fArr = nativeGetInfoStickerBoundingBox(this.mNative, i);
            } else {
                fArr = nativeGetInfoStickerBoundingBoxWithoutRotate(this.mNative, i);
            }
            if (fArr[0] == 0.0f) {
                float[] fArr2 = new float[4];
                System.arraycopy(fArr, 1, fArr2, 0, 4);
                return fArr2;
            }
            throw new r(-1, "native getInfoStickerBoundingBox failed: " + fArr[0]);
        } else {
            throw new r(-100, "");
        }
    }

    public final int adjustFilterInOut(int i, int i2, int i3) {
        return nativeAdjustFilterInOut(this.mNative, i, i2, i3);
    }

    public final int controlStickerAnimationPreview(boolean z, int i, float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeControlInfoStickerAnimationPreview(this.mNative, z, i);
    }

    public final long getClipSequenceOut(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetClipSequenceOut(this.mNative, i, i2, i3);
    }

    public final float getTrackVolume(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return 0.0f;
        }
        return nativeGetTrackVolume(this.mNative, i, i2, i3);
    }

    public final int processTouchDownEvent(float f2, float f3, u uVar) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessTouchDownEvent(this.mNative, f2, f3, uVar.ordinal());
    }

    public final int processTouchUpEvent(float f2, float f3, u uVar) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessTouchUpEvent(this.mNative, f2, f3, uVar.ordinal());
    }

    public final int setFilterParam(int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam(this.mNative, i, str, vEMusicSRTEffectParam);
    }

    public final void setOption(int i, String str, float f2) {
        if (this.mNative != 0) {
            nativeSetOption(this.mNative, i, str, f2);
        }
    }

    public final void setResizer(int i, float f2, float f3) {
        setOption(0, "filter mode", (long) i);
        setOption(0, "resizer offset x percent", f2);
        setOption(0, "resizer offset y percent", f3);
    }

    public final int setTimeRange(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTimeRange(this.mNative, i, i2, i3);
    }

    public final int setTrackDurationType(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTrackDurationType(this.mNative, i, i2, i3);
    }

    public final boolean setTrackVolume(int i, int i2, float f2) {
        if (this.mNative == 0) {
            return false;
        }
        return nativeSetTrackVolume(this.mNative, i, i2, f2);
    }

    public final int setTransitionAt(int i, long j, String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTransitionAt(this.mNative, i, j, str);
    }

    public final int updateClipsSourceParam(int i, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateClipsSourceParam(this.mNative, i, iArr, vEClipSourceParamArr);
    }

    public final int updateClipsTimelineParam(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateClipsTimelineParam(this.mNative, i, iArr, vEClipTimelineParamArr);
    }

    public final int updateScene(String[] strArr, int[] iArr, int[] iArr2) {
        if (this.mNative == 0) {
            return -112;
        }
        int nativeUpdateScene = nativeUpdateScene(this.mNative, strArr, iArr, iArr2);
        if (nativeUpdateScene < 0) {
            return nativeUpdateScene;
        }
        this.mHostTrackIndex = nativeUpdateScene;
        return 0;
    }

    public final int updateTrackClips(int i, int i2, String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateTrackClip(this.mNative, i, i2, strArr);
    }

    public final int updateTrackFilter(int i, int i2, boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateTrackFilter(this.mNative, i, i2, z);
    }

    public final int setFilterParam(int i, String str, VEStickerAnimator vEStickerAnimator) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam(this.mNative, i, str, vEStickerAnimator);
    }

    public final int setInfoStickerFlip(int i, boolean z, boolean z2) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeSetInfoStickerFlip = nativeSetInfoStickerFlip(this.mNative, i, z, z2);
        if (nativeSetInfoStickerFlip != 0) {
            return -1;
        }
        return nativeSetInfoStickerFlip;
    }

    public final void setOption(int i, String str, long j) {
        if (this.mNative != 0) {
            nativeSetOption(this.mNative, i, str, j);
        }
    }

    public final int setFilterParam(int i, String str, String str2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam(this.mNative, i, str, str2);
    }

    public final void setOption(int i, String str, String str2) {
        if (this.mNative != 0) {
            nativeSetOption(this.mNative, i, str, str2);
        }
    }

    public final int setFilterParam(int i, String str, byte[] bArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam2(this.mNative, i, str, bArr);
    }

    public final void setOption(int i, String[] strArr, long[] jArr) {
        if (this.mNative != 0) {
            nativeSetOptionArray(this.mNative, i, strArr, jArr);
        }
    }

    public final int updateFilterParam(int i, int i2, b bVar) {
        if (this.mNative == 0) {
            return -112;
        }
        switch (bVar.filterType) {
            case 1:
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                return nativeUpdateColorFilterParam(this.mNative, i, i2, (VEColorFilterParam) bVar);
            case 8:
                return nativeUpdateEffectFilterParam(this.mNative, i, i2, (VEEffectFilterParam) bVar);
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                return nativeUpdateBeautyFilterParam(this.mNative, i, i2, (VEBeautyFilterParam) bVar);
            case 13:
                return nativeUpdateReshapeFilterParam(this.mNative, i, i2, (VEReshapeFilterParam) bVar);
            case 15:
                if (bVar instanceof VEVideoTransformFilterParam) {
                    return nativeUpdateVideoTransformFilterParam(this.mNative, i, i2, (VEVideoTransformFilterParam) bVar);
                } else if (bVar instanceof VECanvasFilterParam) {
                    return nativeUpdateCanvasFilterParam(this.mNative, i, i2, (VECanvasFilterParam) bVar);
                }
                break;
            case 17:
                return nativeUpdateQualityFilterParam(this.mNative, i, i2, (VEVideoAjustmentFilterParam) bVar);
            case 18:
                break;
            default:
                return -100;
        }
        if (bVar.filterName.equals("audio volume filter")) {
            return nativeUpdateAudioVolumeFilterParam(this.mNative, i, i2, (VEAudioVolumeFilterParam) bVar);
        } else if (bVar.filterName.equals("audio fading")) {
            return nativeUpdateAudioFadeFilterParam(this.mNative, i, i2, (VEAudioFadeFilterParam) bVar);
        } else {
            if (bVar.filterName.equals("audio effect")) {
                return nativeUpdateAudioEffectFilterParam(this.mNative, i, i2, (VEAudioEffectFilterParam) bVar);
            }
            return nativeUpdateEffectComposerParam(this.mNative, i, i2, (VEComposerFilterParam) bVar);
        }
    }

    public final int getImages(int[] iArr, int i, int i2, int i3) {
        return nativeGetImages(this.mNative, iArr, i, i2, i3);
    }

    public final int insertClip(int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeInsertClip(this.mNative, i, i2, vEClipSourceParam, vEClipTimelineParam);
    }

    public final int replaceClip(int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeReplaceClip(this.mNative, i, i2, vEClipSourceParam, vEClipTimelineParam);
    }

    public final int seek(int i, int i2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSeek(this.mNative, i, i2, i3, i4);
    }

    public final int set2DBrushColor(float f2, float f3, float f4, float f5) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSet2DBrushColor(this.mNative, f2, f3, f4, f5);
    }

    public final void setCompileSoftwareEncodeOptions(int i, long j, int i2, int i3) {
        setOption(0, "CompileSoftwareCrf", (long) i);
        setOption(0, "CompileSoftwareMaxrate", j);
        setOption(0, "CompileSoftwarePreset", (long) i2);
        setOption(0, "CompileSoftwareQp", (long) i3);
    }

    public final int setTrackMinMaxDuration(int i, int i2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTrackMinMaxDuration(this.mNative, i, i2, i3, i4);
    }

    public final void setViewPort(int i, int i2, int i3, int i4) {
        if (this.mNative != 0) {
            nativeSetViewPort(this.mNative, i, i2, i3, i4);
        }
    }

    public final int updateFilterTime(int i, int i2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateFilterTime(this.mNative, i, i2, i3, i4);
    }

    public final int updateTrackFilterDuration(int i, int i2, boolean z, long j) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateTrackFilterDuration(this.mNative, i, i2, z, j);
    }

    public final void setCrop(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine crop x", "engine crop y", "engine crop width", "engine crop height"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public final void updateResolution(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine preivew width", "engine preivew height", "engine preivew width percent", "engine preivew height percent"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public final int setClipAttr(int i, int i2, int i3, String str, String str2) {
        return nativeSetClipAttr(this.mNative, i, i2, i3, str, str2);
    }

    public final int preprocessAudioTrackForFilter(int i, int i2, String str, @Nullable byte[] bArr, long[] jArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePreprocessAudioTrackForFilter(this.mNative, i, i2, str, bArr, jArr);
    }

    public final int processPanEvent(float f2, float f3, float f4, float f5, float f6) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessPanEvent(this.mNative, f2, f3, f4, f5, f6);
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        return addFilters(iArr, strArr, iArr2, iArr3, iArr4, iArr5, null);
    }

    public final int createScene(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        int nativeCreateScene = nativeCreateScene(this.mNative, str, strArr, strArr2, strArr3, strArr4, i);
        if (nativeCreateScene < 0) {
            return nativeCreateScene;
        }
        this.mHostTrackIndex = nativeCreateScene;
        return 0;
    }

    public final int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack(this.mNative, i, i2, i3, i4, i5, z);
    }

    public final int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack(this.mNative, str, i, i2, i3, i4, z);
    }

    public final void setDisplayState(float f2, float f3, float f4, float f5, int i, int i2, boolean z) {
        if (this.mNative != 0) {
            nativeSetDisplayState(this.mNative, f2, f3, f4, f5, i, i2, z ? 1 : 0);
        }
    }

    public final int addAudioTrackForMV(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrackMV(this.mNative, str, i, i2, i3, i4, i5, z);
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        if (this.mNative == 0) {
            return new int[]{-1};
        }
        return nativeAddFilters(this.mNative, iArr, strArr, iArr2, iArr3, iArr4, iArr5, iArr6);
    }

    public final int addVideoTrackForMV(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        if (this.mNative == 0) {
            return -1;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddVideoTrack(this.mNative, strArr, strArr2, iArr, iArr2, iArr3, iArr4, iArr5, this.mHostTrackIndex);
    }

    public final int setStickerAnimation(int i, boolean z, h hVar, int i2, h hVar2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationParam(this.mNative, i, z, hVar.f77998a, i2, hVar2.f77998a, i3, i4);
    }

    public final Object initMVResources(String str, String[] strArr, String[] strArr2, @Nullable String str2, int i, int i2, boolean z, boolean z2) {
        return nativeInitMVResources(this.mNative, str, strArr, strArr2, str2, i, i2, z, z2);
    }

    public final int addWaterMark(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, double d2, double d3, double d4, double d5) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddExternalTrack(this.mNative, strArr, strArr2, iArr, iArr2, iArr, iArr2, d2, d3, d4, d5, 5, this.mHostTrackIndex);
    }

    public final int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        if (this.mNative == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack2(this.mNative, i, i2, i3, i4, i5, z, i6, i7);
    }

    public final int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack2(this.mNative, str, i, i2, i3, i4, z, i5, i6);
    }

    public final void setWaterMark(ArrayList<String[]> arrayList, int i, int i2, int i3, int i4, int i5, long j, an anVar, VEWatermarkParam.VEWatermarkMask vEWatermarkMask) {
        if (this.mNative != 0) {
            nativeSetWaterMark(this.mNative, arrayList, i, i2, i3, i4, i5, j, anVar.ordinal(), vEWatermarkMask);
        }
    }

    public final int createScene2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i) {
        return createScene2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, null, i);
    }

    public final int addSticker(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d2, double d3, double d4, double d5) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddExternalTrack(this.mNative, strArr, strArr2, iArr, iArr2, iArr3, iArr4, d2, d3, d4, d5, 0, this.mHostTrackIndex);
    }

    public final int addExternalTrack(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d2, double d3, double d4, double d5, int i) {
        int[] iArr5 = iArr2;
        long j = this.mNative;
        int i2 = this.mHostTrackIndex;
        return nativeAddExternalTrack(j, strArr, strArr2, iArr, iArr5, iArr, iArr2, d2, d3, d4, d5, 5, i2);
    }

    public final int createImageScene(Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[bitmapArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            Bitmap[] bitmapArr2 = bitmapArr;
            fArr2 = fArr;
        }
        int nativeCreateImageScene = nativeCreateImageScene(this.mNative, bitmapArr, iArr, iArr2, strArr, iArr3, iArr4, strArr2, strArr3, fArr2, iArr5, i);
        if (nativeCreateImageScene < 0) {
            return nativeCreateImageScene;
        }
        this.mHostTrackIndex = nativeCreateImageScene;
        return 0;
    }

    public final int createScene2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int[] iArr5, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            String[] strArr5 = strArr;
            fArr2 = fArr;
        }
        int nativeCreateScene2 = nativeCreateScene2(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr2, iArr5, i);
        if (nativeCreateScene2 < 0) {
            return nativeCreateScene2;
        }
        this.mHostTrackIndex = nativeCreateScene2;
        return 0;
    }

    public final int createCanvasScene(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, int[] iArr5, int[] iArr6, String[][] strArr4, float[] fArr, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            String[] strArr5 = strArr;
            fArr2 = fArr;
        }
        int nativeCreateCanvasScene = nativeCreateCanvasScene(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, iArr5, iArr6, strArr4, fArr2, i);
        if (nativeCreateCanvasScene < 0) {
            return nativeCreateCanvasScene;
        }
        this.mHostTrackIndex = nativeCreateCanvasScene;
        return 0;
    }

    public final int createScene2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            String[] strArr5 = strArr;
            fArr2 = fArr;
        }
        int nativeCreateSceneMV = nativeCreateSceneMV(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i);
        if (nativeCreateSceneMV < 0) {
            return nativeCreateSceneMV;
        }
        this.mHostTrackIndex = nativeCreateSceneMV;
        return 0;
    }
}
