package com.ss.android.medialib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.c.b;
import com.ss.android.medialib.c.c;
import com.ss.android.medialib.c.d;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.camera.j;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.log.e;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.model.FaceAttributeInfo;
import com.ss.android.medialib.model.FaceDetectInfo;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.y;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FaceBeautyInvoker implements MessageCenter.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    static b mEncoderCaller;
    private static a mRecordStopCallback;
    @Deprecated
    private static Runnable sDuetCompleteRunable = null;
    @Deprecated
    private static com.ss.android.medialib.c.a sFaceDetectListener;
    private static MessageCenter.a sMessageListener;
    @Deprecated
    private static b sNativeInitListener;
    private static List<c> sSlamDetectListeners = new ArrayList();
    public a mAVCEncoder;
    private b mAVCEncoderInterface = new b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29321a;

        public final int getProfile() {
            return FaceBeautyInvoker.this.mAVCEncoder.h;
        }

        public final void onSwapGlBuffers() {
            if (PatchProxy.isSupport(new Object[0], this, f29321a, false, 16407, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29321a, false, 16407, new Class[0], Void.TYPE);
            } else if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeOnSwapGlBuffers(FaceBeautyInvoker.this.mHandler);
            }
        }

        public final void onUninitHardEncoder() {
            if (PatchProxy.isSupport(new Object[0], this, f29321a, false, 16401, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29321a, false, 16401, new Class[0], Void.TYPE);
                return;
            }
            y.a("FaceBeautyInvoker", "FaceBeautyManager onUninitHardEncoder == enter");
            if (FaceBeautyInvoker.this.mAVCEncoder != null) {
                FaceBeautyInvoker.this.mAVCEncoder.b();
                FaceBeautyInvoker.this.mAVCEncoder = null;
                y.a("FaceBeautyInvoker", "====== uninitAVCEncoder ======");
            }
            y.a("FaceBeautyInvoker", "FaceBeautyManager onUninitHardEncoder == exit");
        }

        public final void onSetCodecConfig(ByteBuffer byteBuffer) {
            if (PatchProxy.isSupport(new Object[]{byteBuffer}, this, f29321a, false, 16408, new Class[]{ByteBuffer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{byteBuffer}, this, f29321a, false, 16408, new Class[]{ByteBuffer.class}, Void.TYPE);
                return;
            }
            y.b("FaceBeautyInvoker", "onSetCodecConfig: data size = " + byteBuffer.remaining());
            if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeSetCodecConfig(FaceBeautyInvoker.this.mHandler, byteBuffer, byteBuffer.remaining());
            }
        }

        public final void setColorFormat(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29321a, false, 16398, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29321a, false, 16398, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeSetColorFormat(FaceBeautyInvoker.this.mHandler, i);
            }
        }

        public final void onEncoderData(byte[] bArr, int i, boolean z) {
            Object obj = bArr;
            if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f29321a, false, 16402, new Class[]{byte[].class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Byte.valueOf(z)}, this, f29321a, false, 16402, new Class[]{byte[].class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            y.b("FaceBeautyInvoker", "FaceBeautyManager onEncoderData == enter");
            if (FaceBeautyInvoker.this.mAVCEncoder != null) {
                int i2 = i;
                FaceBeautyInvoker.this.mAVCEncoder.a(bArr, i, z);
            }
            y.b("FaceBeautyInvoker", "FaceBeautyManager onEncoderData == exit");
        }

        public final int onEncoderData(int i, int i2, int i3, boolean z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f29321a, false, 16404, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, f29321a, false, 16404, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
            }
            y.b("FaceBeautyInvoker", "onEncoderData: ...");
            if (FaceBeautyInvoker.this.mAVCEncoder == null) {
                return 0;
            }
            int i4 = i;
            int i5 = i2;
            return FaceBeautyInvoker.this.mAVCEncoder.a(i, i2, i3, z);
        }

        public final void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29321a, false, 16405, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29321a, false, 16405, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeWriteFile(FaceBeautyInvoker.this.mHandler, byteBuffer, byteBuffer.remaining(), i, i3);
            }
        }

        public final void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, int i2) {
            long j3 = j;
            long j4 = j2;
            if (PatchProxy.isSupport(new Object[]{byteBuffer, new Long(j3), new Long(j4), Integer.valueOf(i), Integer.valueOf(i2)}, this, f29321a, false, 16406, new Class[]{ByteBuffer.class, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{byteBuffer, new Long(j3), new Long(j4), Integer.valueOf(i), Integer.valueOf(i2)}, this, f29321a, false, 16406, new Class[]{ByteBuffer.class, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeWriteFile2(FaceBeautyInvoker.this.mHandler, byteBuffer, byteBuffer.remaining(), j, j2, i2);
            }
        }

        public final Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z ? (byte) 1 : 0)}, this, f29321a, false, 16400, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
                return (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z)}, this, f29321a, false, 16400, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
            }
            y.a("FaceBeautyInvoker", "FaceBeautyManager onInitHardEncoder == enter");
            y.a("FaceBeautyInvoker", "width = " + i + "\theight = " + i2);
            if (FaceBeautyInvoker.this.mAVCEncoder == null) {
                FaceBeautyInvoker.this.mAVCEncoder = new a();
            }
            a.a((b) this);
            Surface a2 = FaceBeautyInvoker.this.mAVCEncoder.a(i, i2, i3, i4, i5, i6, z);
            if (a2 == null) {
                FaceBeautyInvoker.this.mAVCEncoder.b();
                FaceBeautyInvoker.this.mAVCEncoder = null;
                FaceBeautyInvoker.this.setHardEncoderStatus(false);
                return null;
            }
            y.d("FaceBeautyInvoker", "====== initAVCEncoder succeed ======");
            FaceBeautyInvoker.this.setHardEncoderStatus(true);
            y.a("FaceBeautyInvoker", "FaceBeautyManager onInitHardEncoder == exit");
            return a2;
        }
    };
    private Runnable mDuetCompleteRunable;
    private com.ss.android.medialib.c.a mFaceDetectListener;
    public long mHandler;
    private boolean mIsDuringScreenshot;
    private boolean mIsRenderReady;
    private b mNativeInitListener;
    private a.C0357a mOpenGLCallback;
    private a.b mShotScreenCallback;
    private d mTextureTimeListener;

    @Keep
    public interface EffectAlgorithmCallback {
        void onResult(int[] iArr, long[] jArr, float f2);
    }

    @Keep
    public interface FaceInfoCallback {
        void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo);
    }

    @Keep
    public interface OnARTextBitmapCallback {
        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    @Keep
    public interface OnARTextContentCallback {
        void onResult(String[] strArr);
    }

    @Keep
    public interface OnARTextCountCallback {
        void onResult(int i);
    }

    @Keep
    public interface OnCherEffectParmaCallback {
        void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr);
    }

    @Keep
    public interface OnFrameCallback {
        void onFrame(int i, double d2);

        void onInit(EGLContext eGLContext, int i, int i2, int i3, long j);
    }

    @Keep
    public interface OnHandDetectCallback {
        void onResult(int[] iArr);
    }

    @Keep
    public interface OnPictureCallback {
        void onResult(int[] iArr, int i, int i2);
    }

    @Keep
    public interface OnPictureCallbackV2 {
        void onImage(int[] iArr, int i, int i2);

        void onResult(int i, int i2);
    }

    @Keep
    public interface OnRunningErrorCallback {
        void onError(int i);
    }

    public interface a {
        void a();
    }

    private native int nativeAddPCMData(long j, byte[] bArr, int i);

    private native int nativeBindEffectAudioProcessor(long j, int i, int i2, boolean z);

    private native void nativeCancelAll(long j);

    private native int nativeChangeMusicPath(long j, String str);

    private native void nativeChangeOutputVideoSize(long j, int i, int i2);

    private native int nativeChangeSurface(long j, Surface surface);

    private native void nativeChooseSlamFace(long j, int i);

    private native int nativeClearFragFile(long j);

    private native int nativeCloseWavFile(long j, boolean z);

    private native int nativeConcat(long j, String str, String str2, int i, String str3, String str4, boolean z);

    private native long nativeCreate();

    private native int nativeDeleteLastFrag(long j);

    private native void nativeEnableAbandonFirstFrame(long j, boolean z);

    private native int nativeEnableBlindWaterMark(long j, boolean z);

    private native void nativeEnableEffect(long j, boolean z);

    private native void nativeEnableEffectBGM(long j, boolean z);

    private native void nativeEnableScan(long j, boolean z, long j2);

    private native void nativeEnableSceneRecognition(long j, boolean z);

    private native void nativeEnableStickerRecognition(long j, boolean z);

    private native void nativeEnableUse16BitAlign(long j, boolean z);

    private native int nativeExpandPreviewAndRecordInterval(long j, boolean z);

    private native long nativeGetAudioEndTime(long j);

    private native long nativeGetEndFrameTime(long j);

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native float nativeGetReactionCamRotation(long j);

    private native int[] nativeGetReactionCameraPosInRecordPixel(long j);

    private native int[] nativeGetReactionCameraPosInViewPixel(long j);

    private native int[] nativeGetReactionPosMarginInViewPixel(long j);

    private native int nativeGetSlamFaceCount(long j);

    private native int nativeHideSlamKeyBoard(long j, boolean z);

    private native int nativeInitAudioConfig(long j, int i, int i2);

    private native int nativeInitAudioPlayer(long j, String str, int i, int i2, long j2, boolean z, boolean z2, int i3);

    private native int nativeInitDuet(long j, String str, float f2, float f3, float f4, boolean z);

    private native int nativeInitFaceBeautyPlay(long j, int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2);

    private native int nativeInitFaceBeautyPlayOnlyPreview(long j, ScanSettings scanSettings);

    private native int nativeInitImageDrawer(long j, int i);

    private native int nativeInitMediaCodecSurface(long j, Surface surface);

    private native int nativeInitReaction(long j, String str);

    private native int nativeInitWavFile(long j, int i, int i2, double d2);

    private native boolean nativeIsQualcomm(long j);

    private native boolean nativeIsStickerEnabled(long j);

    private native int nativeMarkPlayDone(long j);

    private native int nativeOnAudioCallback(long j, byte[] bArr, int i);

    private native int nativeOnDrawFrameBuffer(long j, byte[] bArr, int i, int i2, int i3);

    private native int nativeOnDrawFrameBuffer2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3);

    private native int nativeOnFrameAvailable(long j, int i, float[] fArr);

    private native int nativeOnFrameTime(long j, double d2);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native boolean nativePosInReactionRegion(long j, int i, int i2);

    private native int nativeProcessTouchEvent(long j, float f2, float f3);

    private native void nativeRecoverCherEffect(long j, String[] strArr, double[] dArr, boolean[] zArr);

    private native void nativeRegisterCherEffectParamCallback(long j, OnCherEffectParmaCallback onCherEffectParmaCallback);

    private native void nativeRegisterEffectAlgorithmCallback(long j, EffectAlgorithmCallback effectAlgorithmCallback);

    private native void nativeRegisterFaceInfoUpload(long j, boolean z, FaceInfoCallback faceInfoCallback);

    private native void nativeRegisterHandDetectCallback(long j, int[] iArr, OnHandDetectCallback onHandDetectCallback);

    private native int nativeRenderPicture(long j, byte[] bArr, int i, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4, int i5, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture3(long j, Bitmap bitmap, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2);

    private native void nativeResetPerfStats(long j);

    private native int nativeResetStartTime(long j, long j2, long j3);

    private native float nativeRotateReactionWindow(long j, float f2);

    private native int nativeSave(long j);

    private native int[] nativeScaleReactionWindow(long j, float f2);

    private native void nativeSendEffectMonitor(long j);

    private native void nativeSendEffectMsg(long j, int i, long j2, long j3, String str);

    private native void nativeSetAlgorithmChangeMsg(long j, int i, boolean z);

    private native int nativeSetBGMVolume(long j, float f2);

    private native int nativeSetBeautyFace(long j, int i, String str);

    private native int nativeSetBeautyFaceIntensity(long j, float f2, float f3);

    private native int nativeSetBlindWaterMarkDiffKeys(long j, int i, int i2);

    private native int nativeSetBlindWaterMarkPosition(long j, int i, int i2);

    private native void nativeSetCameraFirstFrameOptimize(long j, boolean z);

    private native int nativeSetDLEEnable(long j, boolean z);

    private native void nativeSetDetectInterval(long j, int i);

    private native void nativeSetDetectionMode(long j, boolean z);

    private native int nativeSetDeviceRotationWithStamp(long j, float[] fArr, double d2);

    private native void nativeSetDuetCameraPaused(long j, boolean z);

    private native void nativeSetEffectBuildChainType(long j, int i);

    private native int nativeSetFaceMakeUp(long j, String str, float f2, float f3);

    private native int nativeSetFaceMakeUp2(long j, String str);

    private native int nativeSetFilter(long j, String str, String str2, float f2);

    private native int nativeSetFilterIntensity(long j, float f2);

    private native int nativeSetFilterPos(long j, float f2);

    private native int nativeSetFrameCallback(long j, OnFrameCallback onFrameCallback, boolean z);

    private native int nativeSetHandDetectLowpower(long j, boolean z);

    private native int nativeSetHardEncoderStatus(long j, boolean z);

    private native int nativeSetIntensityByType(long j, int i, float f2);

    private native void nativeSetModeChangeState(long j, int i);

    private native int nativeSetMusicNodes(long j, String str);

    private native int nativeSetMusicTime(long j, long j2, long j3);

    private native void nativeSetNativeLibraryDir(String str);

    private native int nativeSetPlayLength(long j, long j2);

    private native void nativeSetPreviewSizeRatio(long j, float f2);

    private native void nativeSetReactionBorderParam(long j, int i, int i2);

    private native boolean nativeSetReactionMaskImage(long j, String str, boolean z);

    private native void nativeSetReactionPosMargin(long j, int i, int i2, int i3, int i4);

    private native void nativeSetRenderCacheTexture(long j, String str, String str2);

    private native int nativeSetReshape(long j, String str, float f2, float f3);

    private native int nativeSetReshapeResource(long j, String str);

    private native int nativeSetRunningErrorCallback(long j, OnRunningErrorCallback onRunningErrorCallback);

    private native boolean nativeSetSharedTextureStatus(boolean z);

    private native int nativeSetSkinTone(long j, String str);

    private native int nativeSetSlamFace(long j, Bitmap bitmap);

    private native int nativeSetSlamInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetSticker(long j, Bitmap bitmap, int i, int i2);

    private native int nativeSetStickerPath(long j, String str, int i, int i2, boolean z);

    private native int nativeSetSwapDuetRegion(long j, boolean z);

    private native int nativeSetUseMusic(long j, int i);

    private native int nativeSetVideoQuality(long j, int i, int i2);

    private native int nativeShotScreen(long j, String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback);

    private native int nativeSlamDeviceConfig(long j, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeSlamGetTextBitmap(long j, OnARTextBitmapCallback onARTextBitmapCallback);

    private native int nativeSlamGetTextLimitCount(long j, OnARTextCountCallback onARTextCountCallback);

    private native int nativeSlamGetTextParagraphContent(long j, OnARTextContentCallback onARTextContentCallback);

    private native int nativeSlamProcessDoubleClickEvent(long j, float f2, float f3);

    private native int nativeSlamProcessIngestAcc(long j, double d2, double d3, double d4, double d5);

    private native int nativeSlamProcessIngestGra(long j, double d2, double d3, double d4, double d5);

    private native int nativeSlamProcessIngestGyr(long j, double d2, double d3, double d4, double d5);

    private native int nativeSlamProcessIngestOri(long j, double[] dArr, double d2);

    private native int nativeSlamProcessPanEvent(long j, float f2, float f3, float f4, float f5, float f6);

    private native int nativeSlamProcessRotationEvent(long j, float f2, float f3);

    private native int nativeSlamProcessScaleEvent(long j, float f2, float f3);

    private native int nativeSlamProcessTouchEvent(long j, float f2, float f3);

    private native int nativeSlamProcessTouchEventByType(long j, int i, float f2, float f3, int i2);

    private native int nativeSlamSetLanguge(long j, String str);

    private native int nativeSlamSetTextBitmapResult(long j, Bitmap bitmap, int i, int i2, int i3);

    private native int nativeStartPlay(long j, Surface surface, int i, int i2, String str);

    private native int nativeStartPlay2(long j, int i, int i2, int i3, int i4, String str);

    private native int nativeStartRecord(long j, double d2, boolean z, int i, int i2, int i3, String str, String str2);

    private native int nativeStopPlay(long j);

    private native int nativeStopRecord(long j, boolean z);

    private native int nativeTryRestore(long j, int i, String str);

    private native void nativeUnRegisterEffectAlgorithmCallback(long j);

    private native void nativeUnRegisterFaceInfoUpload(long j);

    private native int nativeUninitAudioPlayer(long j);

    private native int nativeUninitFaceBeautyPlay(long j);

    private native void nativeUpdateReactionBGAlpha(long j, float f2);

    private native int[] nativeUpdateReactionCameraPos(long j, int i, int i2, int i3, int i4);

    private native int[] nativeUpdateReactionCameraPosWithRotation(long j, int i, int i2, int i3, int i4, float f2);

    private native void nativeUpdateRotation(long j, float f2, float f3, float f4);

    private native void nativeUpdateRotationAndFront(long j, int i, boolean z);

    private native void nativeUseLargeMattingModel(long j, boolean z);

    private native void setCaptureMirror(long j, boolean z);

    public native int nativeAnimateImageToPreview(long j, String str, String str2, int i);

    public native void nativeOnSwapGlBuffers(long j);

    public native boolean nativePreviewDuetVideo(long j);

    public native int nativeReloadComposerNodes(long j, @NonNull String[] strArr, int i);

    public native int nativeSetCodecConfig(long j, ByteBuffer byteBuffer, int i);

    public native int nativeSetColorFormat(long j, int i);

    public native int nativeSetComposerMode(long j, int i, int i2);

    public native int nativeSetComposerNodes(long j, String[] strArr, int i);

    public native int nativeSetComposerResourcePath(long j, String str);

    public native void nativeSetForceAlgorithmCnt(long j, int i);

    public native void nativeSetPreviewDuetVideoPaused(long j, boolean z);

    public native int nativeSetStickerRequestCallback(long j, IStickerRequestCallback iStickerRequestCallback);

    public native int nativeUpdateComposerNode(long j, String str, String str2, float f2);

    public native int nativeWriteFile(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public native int nativeWriteFile2(long j, ByteBuffer byteBuffer, int i, long j2, long j3, int i2);

    public static b getNativeInitListener() {
        return sNativeInitListener;
    }

    private boolean isRenderReady() {
        return this.mIsRenderReady;
    }

    static {
        com.ss.android.ttve.nativePort.b.a();
    }

    public FaceBeautyInvoker() {
        mEncoderCaller = this.mAVCEncoderInterface;
    }

    public static synchronized void clearSlamDetectListener() {
        synchronized (FaceBeautyInvoker.class) {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 16275, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 16275, new Class[0], Void.TYPE);
            } else {
                sSlamDetectListeners.clear();
            }
        }
    }

    private int onNativeCallback_GetHardEncoderProfile() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16381, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16381, new Class[0], Integer.TYPE)).intValue();
        } else if (mEncoderCaller == null) {
            return -1;
        } else {
            y.a("FaceBeautyInvoker", "GetHardEncoderProfile");
            return mEncoderCaller.getProfile();
        }
    }

    public void cancelAll() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16268, new Class[0], Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeCancelAll(this.mHandler);
        }
    }

    public int clearFragFile() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16263, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16263, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeClearFragFile(this.mHandler);
        }
    }

    public void createEncoder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16375, new Class[0], Void.TYPE);
            return;
        }
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new a();
        }
        this.mAVCEncoder.a();
    }

    public int deleteLastFrag() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16262, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16262, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeDeleteLastFrag(this.mHandler);
        }
    }

    public void destroyMessageCenter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16219, new Class[0], Void.TYPE);
            return;
        }
        h.a().c();
        h.a().b(this);
        synchronized (FaceBeautyInvoker.class) {
            sMessageListener = null;
        }
    }

    public long getAudioEndTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16241, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16241, new Class[0], Long.TYPE)).longValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeGetAudioEndTime(this.mHandler);
        }
    }

    public long getEndFrameTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16261, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16261, new Class[0], Long.TYPE)).longValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeGetEndFrameTime(this.mHandler);
        }
    }

    public EnigmaResult getEnigmaResult() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16357, new Class[0], EnigmaResult.class)) {
            return (EnigmaResult) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16357, new Class[0], EnigmaResult.class);
        } else if (this.mHandler != 0) {
            return nativeGetEnigmaResult(this.mHandler);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return null;
        }
    }

    public float getReactionCamRotation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16291, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16291, new Class[0], Float.TYPE)).floatValue();
        } else if (this.mHandler == 0) {
            return -100000.0f;
        } else {
            return nativeGetReactionCamRotation(this.mHandler);
        }
    }

    public int[] getReactionCameraPosInRecordPixel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16293, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16293, new Class[0], int[].class);
        } else if (this.mHandler == 0) {
            return null;
        } else {
            return nativeGetReactionCameraPosInRecordPixel(this.mHandler);
        }
    }

    public int[] getReactionCameraPosInViewPixel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16292, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16292, new Class[0], int[].class);
        } else if (this.mHandler == 0) {
            return null;
        } else {
            return nativeGetReactionCameraPosInViewPixel(this.mHandler);
        }
    }

    public int[] getReactionPosMarginInViewPixel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16294, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16294, new Class[0], int[].class);
        } else if (this.mHandler == 0) {
            return null;
        } else {
            return nativeGetReactionPosMarginInViewPixel(this.mHandler);
        }
    }

    public void initHardEncoderInAdvance() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16377, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16377, new Class[0], Void.TYPE);
            return;
        }
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new a();
        }
    }

    public void initMessageCenter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16218, new Class[0], Void.TYPE);
            return;
        }
        h.a().b();
        h.a().a(this);
    }

    public int markPlayDone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16232, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16232, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeMarkPlayDone(this.mHandler);
        }
    }

    public void onDuetVideoComplete() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16391, new Class[0], Void.TYPE);
            return;
        }
        if (this.mDuetCompleteRunable != null) {
            this.mDuetCompleteRunable.run();
        }
        if (sDuetCompleteRunable != null) {
            sDuetCompleteRunable.run();
        }
    }

    public void onNativeCallback_UninitHardEncoder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16383, new Class[0], Void.TYPE);
            return;
        }
        y.a("FaceBeautyInvoker", " onUninitHardEncoder == enter");
        if (mEncoderCaller != null) {
            mEncoderCaller.onUninitHardEncoder();
        }
        y.a("FaceBeautyInvoker", " onUninitHardEncoder == exit");
    }

    public void onNativeCallback_onOpenGLCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16386, new Class[0], Void.TYPE);
            return;
        }
        y.a("FaceBeautyInvoker", "onNativeCallback_onOpenGLCreate");
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.a();
        }
    }

    public void onNativeCallback_onOpenGLDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16388, new Class[0], Void.TYPE);
            return;
        }
        y.a("FaceBeautyInvoker", "onNativeCallback_onOpenGLDestroy");
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.b();
        }
    }

    public int onNativeCallback_onOpenGLRunning() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16387, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16387, new Class[0], Integer.TYPE)).intValue();
        }
        y.b("FaceBeautyInvoker", "onNativeCallback_onOpenGLRunning");
        if (this.mOpenGLCallback != null) {
            i = this.mOpenGLCallback.c();
        }
        return i;
    }

    public void onNativeRecordStop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16397, new Class[0], Void.TYPE);
            return;
        }
        if (mRecordStopCallback != null) {
            mRecordStopCallback.a();
        }
    }

    public boolean previewDuetVideo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16283, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16283, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mHandler == 0) {
            return false;
        } else {
            return nativePreviewDuetVideo(this.mHandler);
        }
    }

    public void releaseEncoder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16376, new Class[0], Void.TYPE);
            return;
        }
        if (this.mAVCEncoder != null) {
            this.mAVCEncoder.c();
        }
    }

    public void resetPerfStats() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16264, new Class[0], Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeResetPerfStats(this.mHandler);
        }
    }

    public int save() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16230, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16230, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSave(this.mHandler);
        }
    }

    public void unRegisterEffectAlgorithmCallback() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16356, new Class[0], Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeUnRegisterEffectAlgorithmCallback(this.mHandler);
        }
    }

    public void unRegisterFaceInfoUpload() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16354, new Class[0], Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeUnRegisterFaceInfoUpload(this.mHandler);
        }
    }

    public void uninitAudioPlayer() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16266, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16266, new Class[0], Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeUninitAudioPlayer(this.mHandler);
        }
    }

    public int getSlamFaceCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16347, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16347, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeGetSlamFaceCount(this.mHandler);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public boolean isStickerEnabled() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16352, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16352, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mHandler != 0) {
            return nativeIsStickerEnabled(this.mHandler);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return false;
        }
    }

    public int stopPlay() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16231, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16231, new Class[0], Integer.TYPE)).intValue();
        }
        this.mIsRenderReady = false;
        if (this.mHandler == 0) {
            return -100000;
        }
        destroyMessageCenter();
        return nativeStopPlay(this.mHandler);
    }

    public int uninitFaceBeautyPlay() {
        int nativeUninitFaceBeautyPlay;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16233, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16233, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            synchronized (this) {
                long j = this.mHandler;
                this.mHandler = 0;
                this.mTextureTimeListener = null;
                this.mShotScreenCallback = null;
                mRecordStopCallback = null;
                this.mNativeInitListener = null;
                this.mFaceDetectListener = null;
                nativeUninitFaceBeautyPlay = nativeUninitFaceBeautyPlay(j);
            }
            return nativeUninitFaceBeautyPlay;
        }
    }

    @Deprecated
    public static void setDuetVideoCompleteCallback(Runnable runnable) {
        sDuetCompleteRunable = runnable;
    }

    @Deprecated
    public static void setFaceDetectListener(com.ss.android.medialib.c.a aVar) {
        sFaceDetectListener = aVar;
    }

    @Deprecated
    public static void setNativeInitListener(b bVar) {
        sNativeInitListener = bVar;
    }

    public static void setRecordStopCallback(a aVar) {
        mRecordStopCallback = aVar;
    }

    public void setDuetVideoCompleteCallback2(Runnable runnable) {
        this.mDuetCompleteRunable = runnable;
    }

    public void setFaceDetectListener2(com.ss.android.medialib.c.a aVar) {
        this.mFaceDetectListener = aVar;
    }

    public void setNativeInitListener2(b bVar) {
        this.mNativeInitListener = bVar;
    }

    public void setOnOpenGLCallback(a.C0357a aVar) {
        this.mOpenGLCallback = aVar;
    }

    public void setTextureTimeListener(d dVar) {
        this.mTextureTimeListener = dVar;
    }

    public static synchronized void setMessageListener(MessageCenter.a aVar) {
        synchronized (FaceBeautyInvoker.class) {
            sMessageListener = aVar;
        }
    }

    @Deprecated
    public static synchronized void setSlamDetectListener(c cVar) {
        synchronized (FaceBeautyInvoker.class) {
            addSlamDetectListener(cVar);
        }
    }

    @Deprecated
    public int setFilterPos(float f2) {
        if (this.mHandler == 0) {
            return -100000;
        }
        return nativeSetFilterPos(this.mHandler, f2);
    }

    public void enableSceneRecognition(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16306, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16306, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        nativeEnableSceneRecognition(this.mHandler, z);
    }

    public void enableStickerRecognition(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16307, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16307, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        nativeEnableStickerRecognition(this.mHandler, z);
    }

    public void setCaptureMirror(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16279, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16279, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        setCaptureMirror(this.mHandler, z);
    }

    public void setNativeLibraryDir(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16319, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16319, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            nativeSetNativeLibraryDir(str);
        }
    }

    public void setRunningErrorCallback(OnRunningErrorCallback onRunningErrorCallback) {
        if (PatchProxy.isSupport(new Object[]{onRunningErrorCallback}, this, changeQuickRedirect, false, 16272, new Class[]{OnRunningErrorCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onRunningErrorCallback}, this, changeQuickRedirect, false, 16272, new Class[]{OnRunningErrorCallback.class}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetRunningErrorCallback(this.mHandler, onRunningErrorCallback);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void addSlamDetectListener(com.ss.android.medialib.c.c r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.medialib.FaceBeautyInvoker> r1 = com.ss.android.medialib.FaceBeautyInvoker.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0041 }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x0041 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect     // Catch:{ all -> 0x0041 }
            r6 = 1
            r7 = 16273(0x3f91, float:2.2803E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0041 }
            java.lang.Class<com.ss.android.medialib.c.c> r9 = com.ss.android.medialib.c.c.class
            r8[r10] = r9     // Catch:{ all -> 0x0041 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0038
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x0041 }
            r11[r10] = r0     // Catch:{ all -> 0x0041 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = changeQuickRedirect     // Catch:{ all -> 0x0041 }
            r14 = 1
            r15 = 16273(0x3f91, float:2.2803E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0041 }
            java.lang.Class<com.ss.android.medialib.c.c> r2 = com.ss.android.medialib.c.c.class
            r0[r10] = r2     // Catch:{ all -> 0x0041 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0038:
            if (r0 == 0) goto L_0x003f
            java.util.List<com.ss.android.medialib.c.c> r2 = sSlamDetectListeners     // Catch:{ all -> 0x0041 }
            r2.add(r0)     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.FaceBeautyInvoker.addSlamDetectListener(com.ss.android.medialib.c.c):void");
    }

    private void onNativeCallback_Init(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16379, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16379, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i < 0) {
            y.d("FaceBeautyInvoker", "onNativeCallback_Init error = " + i);
        } else {
            this.mIsRenderReady = true;
            y.a("FaceBeautyInvoker", "onNativeCallback_Init success = " + i);
        }
        if (this.mNativeInitListener != null) {
            this.mNativeInitListener.a(i);
        }
        if (sNativeInitListener != null) {
            sNativeInitListener.a(i);
        }
        this.mIsRenderReady = true;
    }

    public static synchronized void removeSlamDetectListener(c cVar) {
        c cVar2 = cVar;
        synchronized (FaceBeautyInvoker.class) {
            if (PatchProxy.isSupport(new Object[]{cVar2}, null, changeQuickRedirect, true, 16274, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, null, changeQuickRedirect, true, 16274, new Class[]{c.class}, Void.TYPE);
                return;
            }
            sSlamDetectListeners.remove(cVar2);
        }
    }

    public synchronized int changeMusicPath(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16239, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16239, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeChangeMusicPath(this.mHandler, str);
        }
    }

    public synchronized int changeSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 16236, new Class[]{Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 16236, new Class[]{Surface.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeChangeSurface(this.mHandler, surface);
        }
    }

    public void chooseSlamFace(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16348, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16348, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeChooseSlamFace(this.mHandler, i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int closeWavFile(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16259, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16259, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            int nativeCloseWavFile = nativeCloseWavFile(this.mHandler, z);
            save();
            return nativeCloseWavFile;
        }
    }

    public void enableAbandonFirstFrame(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16345, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16345, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            com.ss.android.medialib.common.c.c("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeEnableAbandonFirstFrame(this.mHandler, z);
        }
    }

    public int enableBlindWaterMark(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16247, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16247, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeEnableBlindWaterMark(this.mHandler, z);
        }
    }

    public void enableEffect(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16344, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16344, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeEnableEffect(this.mHandler, z);
        }
    }

    public void enableEffectBGM(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16343, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16343, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeEnableEffectBGM(this.mHandler, z);
        }
    }

    public long getTextureDeltaTime(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16396, new Class[]{Boolean.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16396, new Class[]{Boolean.TYPE}, Long.TYPE)).longValue();
        } else if (this.mTextureTimeListener != null) {
            return this.mTextureTimeListener.a(z);
        } else {
            return 0;
        }
    }

    public int initFaceBeautyPlayOnlyPreview(ScanSettings scanSettings) {
        if (PatchProxy.isSupport(new Object[]{scanSettings}, this, changeQuickRedirect, false, 16222, new Class[]{ScanSettings.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{scanSettings}, this, changeQuickRedirect, false, 16222, new Class[]{ScanSettings.class}, Integer.TYPE)).intValue();
        }
        this.mHandler = nativeCreate();
        if (this.mHandler == 0) {
            return -100000;
        }
        return nativeInitFaceBeautyPlayOnlyPreview(this.mHandler, scanSettings);
    }

    public int initImageDrawer(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16364, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16364, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeInitImageDrawer(this.mHandler, i);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int initMediaCodecSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 16378, new Class[]{Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 16378, new Class[]{Surface.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeInitMediaCodecSurface(this.mHandler, surface);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int onDrawFrameTime(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 16246, new Class[]{Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 16246, new Class[]{Double.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeOnFrameTime(this.mHandler, d2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onNativeCallback_onShotScreen(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x005a }
            r9 = 0
            r1[r9] = r2     // Catch:{ all -> 0x005a }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x005a }
            r4 = 0
            r5 = 16395(0x400b, float:2.2974E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005a }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x005a }
            r6[r9] = r2     // Catch:{ all -> 0x005a }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005a }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x003a
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x005a }
            r1[r9] = r0     // Catch:{ all -> 0x005a }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x005a }
            r4 = 0
            r5 = 16395(0x400b, float:2.2974E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005a }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x005a }
            r6[r9] = r0     // Catch:{ all -> 0x005a }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005a }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005a }
            monitor-exit(r10)
            return
        L_0x003a:
            java.lang.String r1 = "FaceBeautyInvoker"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "onNativeCallback_onShotScreen: ret = "
            r2.<init>(r3)     // Catch:{ all -> 0x005a }
            r2.append(r11)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005a }
            com.ss.android.vesdk.y.a(r1, r2)     // Catch:{ all -> 0x005a }
            r10.mIsDuringScreenshot = r9     // Catch:{ all -> 0x005a }
            com.ss.android.medialib.common.a$b r1 = r10.mShotScreenCallback     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0058
            com.ss.android.medialib.common.a$b r1 = r10.mShotScreenCallback     // Catch:{ all -> 0x005a }
            r1.a(r11)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r10)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.FaceBeautyInvoker.onNativeCallback_onShotScreen(int):void");
    }

    public void onNativeCallback_onSlamDetect(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16390, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16390, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ArrayList<c> arrayList = new ArrayList<>();
        synchronized (FaceBeautyInvoker.class) {
            for (c add : sSlamDetectListeners) {
                arrayList.add(add);
            }
        }
        for (c cVar : arrayList) {
            if (cVar != null) {
                cVar.a(z);
            } else {
                boolean z2 = z;
            }
        }
    }

    public void pauseEffectAudio(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16342, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16342, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            if (isRenderReady()) {
                nativePauseEffectAudio(this.mHandler, z);
            }
        }
    }

    public void registerCherEffectParamCallback(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        if (PatchProxy.isSupport(new Object[]{onCherEffectParmaCallback}, this, changeQuickRedirect, false, 16360, new Class[]{OnCherEffectParmaCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCherEffectParmaCallback}, this, changeQuickRedirect, false, 16360, new Class[]{OnCherEffectParmaCallback.class}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeRegisterCherEffectParamCallback(this.mHandler, onCherEffectParmaCallback);
        }
    }

    public void registerEffectAlgorithmCallback(EffectAlgorithmCallback effectAlgorithmCallback) {
        if (PatchProxy.isSupport(new Object[]{effectAlgorithmCallback}, this, changeQuickRedirect, false, 16355, new Class[]{EffectAlgorithmCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectAlgorithmCallback}, this, changeQuickRedirect, false, 16355, new Class[]{EffectAlgorithmCallback.class}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeRegisterEffectAlgorithmCallback(this.mHandler, effectAlgorithmCallback);
        }
    }

    public float rotateReactionWindow(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16290, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16290, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        } else if (this.mHandler == 0) {
            return -100000.0f;
        } else {
            return nativeRotateReactionWindow(this.mHandler, f2);
        }
    }

    public int[] scaleReactionWindow(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16289, new Class[]{Float.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16289, new Class[]{Float.TYPE}, int[].class);
        } else if (this.mHandler == 0) {
            return null;
        } else {
            return nativeScaleReactionWindow(this.mHandler, f2);
        }
    }

    public int setBGMVolume(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16251, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16251, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetBGMVolume(this.mHandler, f2);
        }
    }

    public void setCameraFirstFrameOptimize(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16318, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16318, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            com.ss.android.medialib.common.c.c("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeSetCameraFirstFrameOptimize(this.mHandler, z);
        }
    }

    public int setComposerResourcePath(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16368, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16368, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetComposerResourcePath(this.mHandler, str);
        } else {
            y.d("FaceBeautyInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        }
    }

    public void setDLEEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16374, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16374, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            com.ss.android.medialib.common.c.c("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeSetDLEEnable(this.mHandler, z);
        }
    }

    public void setDetectInterval(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16341, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16341, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeSetDetectInterval(this.mHandler, i);
        }
    }

    public void setDetectionMode(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16223, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16223, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetDetectionMode(this.mHandler, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDeviceRotation(float[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<float[]> r3 = float[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 16302(0x3fae, float:2.2844E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 16302(0x3fae, float:2.2844E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<float[]> r0 = float[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            boolean r1 = r17.isRenderReady()
            if (r1 == 0) goto L_0x0042
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r3 = r17
            r3.setDeviceRotation(r0, r1)
            goto L_0x0044
        L_0x0042:
            r3 = r17
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.FaceBeautyInvoker.setDeviceRotation(float[]):void");
    }

    public void setDuetCameraPaused(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16285, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16285, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetDuetCameraPaused(this.mHandler, z);
        }
    }

    public void setEffectBuildChainType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16300, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16300, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetEffectBuildChainType(this.mHandler, i);
        }
    }

    public int setFaceMakeUp(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16314, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16314, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetFaceMakeUp2(this.mHandler, str);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int setFilter(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16304, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16304, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetFilter(this.mHandler, str, str, 1.0f);
        }
    }

    public int setFilterIntensity(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16308, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16308, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetFilterIntensity(this.mHandler, f2);
        }
    }

    public void setForceAlgorithmCnt(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16367, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16367, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeSetForceAlgorithmCnt(this.mHandler, i);
        }
    }

    public int setHandDetectLowpower(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16350, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16350, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetHandDetectLowpower(this.mHandler, z);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int setHardEncoderStatus(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16253, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16253, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetHardEncoderStatus(this.mHandler, z);
        }
    }

    public synchronized void setModeChangeState(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16235, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16235, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetModeChangeState(this.mHandler, i);
        }
    }

    public int setMusicNodes(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16362, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16362, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetMusicNodes(this.mHandler, str);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int setPlayLength(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 16265, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 16265, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetPlayLength(this.mHandler, j);
        }
    }

    public void setPreviewDuetVideoPaused(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16284, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16284, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandler != 0) {
            nativeSetPreviewDuetVideoPaused(this.mHandler, z);
        }
    }

    public void setPreviewSizeRatio(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16242, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16242, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetPreviewSizeRatio(this.mHandler, f2);
        }
    }

    public int setReshapeResource(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16313, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16313, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetReshapeResource(this.mHandler, str);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public boolean setSharedTextureStatus(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16317, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16317, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mHandler != 0) {
            return nativeSetSharedTextureStatus(z);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return false;
        }
    }

    public int setSkinTone(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16316, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16316, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetSkinTone(this.mHandler, str);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int setSlamFace(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, changeQuickRedirect, false, 16346, new Class[]{Bitmap.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap}, this, changeQuickRedirect, false, 16346, new Class[]{Bitmap.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetSlamFace(this.mHandler, bitmap);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        if (PatchProxy.isSupport(new Object[]{iStickerRequestCallback}, this, changeQuickRedirect, false, 16276, new Class[]{IStickerRequestCallback.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{iStickerRequestCallback}, this, changeQuickRedirect, false, 16276, new Class[]{IStickerRequestCallback.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetStickerRequestCallback(this.mHandler, iStickerRequestCallback);
        }
    }

    public void setSwapDuetRegion(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16282, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16282, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetSwapDuetRegion(this.mHandler, z);
        }
    }

    public synchronized void setUseMusic(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16234, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16234, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetUseMusic(this.mHandler, i);
        }
    }

    public int slamGetTextBitmap(OnARTextBitmapCallback onARTextBitmapCallback) {
        if (PatchProxy.isSupport(new Object[]{onARTextBitmapCallback}, this, changeQuickRedirect, false, 16339, new Class[]{OnARTextBitmapCallback.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{onARTextBitmapCallback}, this, changeQuickRedirect, false, 16339, new Class[]{OnARTextBitmapCallback.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSlamGetTextBitmap(this.mHandler, onARTextBitmapCallback);
        } else {
            com.ss.android.medialib.common.c.c("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int slamGetTextLimitCount(OnARTextCountCallback onARTextCountCallback) {
        if (PatchProxy.isSupport(new Object[]{onARTextCountCallback}, this, changeQuickRedirect, false, 16337, new Class[]{OnARTextCountCallback.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{onARTextCountCallback}, this, changeQuickRedirect, false, 16337, new Class[]{OnARTextCountCallback.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSlamGetTextLimitCount(this.mHandler, onARTextCountCallback);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int slamGetTextParagraphContent(OnARTextContentCallback onARTextContentCallback) {
        if (PatchProxy.isSupport(new Object[]{onARTextContentCallback}, this, changeQuickRedirect, false, 16338, new Class[]{OnARTextContentCallback.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{onARTextContentCallback}, this, changeQuickRedirect, false, 16338, new Class[]{OnARTextContentCallback.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSlamGetTextParagraphContent(this.mHandler, onARTextContentCallback);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int slamNotifyHideKeyBoard(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16335, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16335, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeHideSlamKeyBoard(this.mHandler, z);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int slamSetLanguge(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 16336, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 16336, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSlamSetLanguge(this.mHandler, str);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int stopRecord(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16229, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16229, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeStopRecord(this.mHandler, z);
        }
    }

    public void updateReactionBGAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16299, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 16299, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeUpdateReactionBGAlpha(this.mHandler, f2);
        }
    }

    public void useLargeMattingModel(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16363, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 16363, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeUseLargeMattingModel(this.mHandler, z);
        }
    }

    public int onDrawFrame(j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, changeQuickRedirect, false, 16245, new Class[]{j.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{jVar2}, this, changeQuickRedirect, false, 16245, new Class[]{j.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            if (jVar2.f29606a != null) {
                nativeOnDrawFrameBuffer(this.mHandler, jVar2.f29606a, jVar2.f29606a.length, jVar2.f29609d, jVar2.f29610e);
            } else if (Build.VERSION.SDK_INT >= 19 && jVar2.f29608c == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{3, 3});
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new k(jVar2).a(iArr, byteBufferArr)) {
                    return nativeOnDrawFrameBuffer2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], jVar2.f29608c, jVar2.f29609d, jVar2.f29610e);
                }
            }
            return -1;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int addPCMData(byte[] bArr, int i) {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16258, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16258, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeAddPCMData(this.mHandler, bArr, i);
        }
    }

    public int animateImageToPreview(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, changeQuickRedirect, false, 16373, new Class[]{String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2}, this, changeQuickRedirect, false, 16373, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        } else {
            return nativeAnimateImageToPreview(this.mHandler, str, str2, com.ss.android.medialib.common.b.a(str2));
        }
    }

    public void changeOutputVideoSize(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16269, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16269, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeChangeOutputVideoSize(this.mHandler, i, i2);
        }
    }

    public void enableScan(boolean z, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, this, changeQuickRedirect, false, 16358, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j2)}, this, changeQuickRedirect, false, 16358, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeEnableScan(this.mHandler, z, j);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int initAudioConfig(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16256, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16256, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeInitAudioConfig(this.mHandler, i, i2);
        }
    }

    public void onAudioCallback(byte[] bArr, int i) {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16267, new Class[]{byte[].class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16267, new Class[]{byte[].class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandler != 0 && isRenderReady()) {
            nativeOnAudioCallback(this.mHandler, bArr, i);
        }
    }

    public int onDrawFrame(int i, float[] fArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), fArr}, this, changeQuickRedirect, false, 16243, new Class[]{Integer.TYPE, float[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), fArr}, this, changeQuickRedirect, false, 16243, new Class[]{Integer.TYPE, float[].class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeOnFrameAvailable(this.mHandler, i, fArr);
        }
    }

    public void onNativeCallback_InitHardEncoderRet(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16382, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16382, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        y.a("FaceBeautyInvoker", "onInitHardEncoderRet");
        y.a("FaceBeautyInvoker", "isCPUEncode = " + i);
        if (this.mNativeInitListener != null) {
            this.mNativeInitListener.a(i, i2);
        }
        if (sNativeInitListener != null) {
            sNativeInitListener.a(i, i2);
        }
    }

    public void onNativeCallback_onFaceDetect(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16389, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16389, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        y.b("FaceBeautyInvoker", "FaceBeautyInvoker onFaceDetect " + i2);
    }

    public boolean posInReactionRegion(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16298, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16298, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mHandler == 0) {
            return false;
        } else {
            return nativePosInReactionRegion(this.mHandler, i, i2);
        }
    }

    public int processTouchEvent(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16328, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16328, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeProcessTouchEvent(this.mHandler, f2, f3);
        }
    }

    public void registerFaceInfoUpload(boolean z, FaceInfoCallback faceInfoCallback) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), faceInfoCallback}, this, changeQuickRedirect, false, 16353, new Class[]{Boolean.TYPE, FaceInfoCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), faceInfoCallback}, this, changeQuickRedirect, false, 16353, new Class[]{Boolean.TYPE, FaceInfoCallback.class}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeRegisterFaceInfoUpload(this.mHandler, z, faceInfoCallback);
        }
    }

    public void registerHandDetectCallback(int[] iArr, OnHandDetectCallback onHandDetectCallback) {
        if (PatchProxy.isSupport(new Object[]{iArr, onHandDetectCallback}, this, changeQuickRedirect, false, 16359, new Class[]{int[].class, OnHandDetectCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iArr, onHandDetectCallback}, this, changeQuickRedirect, false, 16359, new Class[]{int[].class, OnHandDetectCallback.class}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeRegisterHandDetectCallback(this.mHandler, iArr, onHandDetectCallback);
        }
    }

    public int reloadComposerNodes(@NonNull String[] strArr, int i) {
        if (PatchProxy.isSupport(new Object[]{strArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16372, new Class[]{String[].class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{strArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16372, new Class[]{String[].class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeReloadComposerNodes(this.mHandler, strArr, i);
        } else {
            y.d("FaceBeautyInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        }
    }

    public int resetStartTime(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 16260, new Class[]{Long.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 16260, new Class[]{Long.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeResetStartTime(this.mHandler, j, j2);
        }
    }

    public void setAlgorithmChangeMsg(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16349, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16349, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeSetAlgorithmChangeMsg(this.mHandler, i, z);
        }
    }

    public int setBeautyFace(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 16310, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 16310, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetBeautyFace(this.mHandler, i, str);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int setBeautyFaceIntensity(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16311, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16311, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetBeautyFaceIntensity(this.mHandler, f2, f3);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public int setBlindWaterMarkDiffKeys(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16248, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16248, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetBlindWaterMarkDiffKeys(this.mHandler, i, i2);
        }
    }

    public int setBlindWaterMarkPosition(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16249, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16249, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetBlindWaterMarkPosition(this.mHandler, i, i2);
        }
    }

    public int setComposerMode(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16371, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16371, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetComposerMode(this.mHandler, i, i2);
        } else {
            y.d("FaceBeautyInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        }
    }

    public int setComposerNodes(String[] strArr, int i) {
        if (PatchProxy.isSupport(new Object[]{strArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16369, new Class[]{String[].class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{strArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16369, new Class[]{String[].class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetComposerNodes(this.mHandler, strArr, i);
        } else {
            y.d("FaceBeautyInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        }
    }

    public int setFrameCallback(OnFrameCallback onFrameCallback, boolean z) {
        if (PatchProxy.isSupport(new Object[]{onFrameCallback, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16271, new Class[]{OnFrameCallback.class, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{onFrameCallback, Byte.valueOf(z)}, this, changeQuickRedirect, false, 16271, new Class[]{OnFrameCallback.class, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetFrameCallback(this.mHandler, onFrameCallback, z);
        }
    }

    public int setIntensityByType(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 16320, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 16320, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler != 0) {
            return nativeSetIntensityByType(this.mHandler, i, f2);
        } else {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        }
    }

    public synchronized int setMusicTime(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 16240, new Class[]{Long.TYPE, Long.TYPE}, Integer.TYPE)) {
                int intValue = ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 16240, new Class[]{Long.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
                return intValue;
            } else if (this.mHandler == 0) {
                return -100000;
            } else {
                int nativeSetMusicTime = nativeSetMusicTime(this.mHandler, j, j2);
                return nativeSetMusicTime;
            }
        }
    }

    public void setReactionBorderParam(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16295, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16295, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetReactionBorderParam(this.mHandler, i, i2);
        }
    }

    public boolean setReactionMaskImage(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16296, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, changeQuickRedirect, false, 16296, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mHandler == 0) {
            return false;
        } else {
            return nativeSetReactionMaskImage(this.mHandler, str, z);
        }
    }

    public void setRenderCacheTexture(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, changeQuickRedirect, false, 16366, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, changeQuickRedirect, false, 16366, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeSetRenderCacheTexture(this.mHandler, str, str2);
        }
    }

    public int setVideoQuality(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16250, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16250, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetVideoQuality(this.mHandler, i, i2);
        }
    }

    public int slamProcessDoubleClickEvent(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16333, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16333, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessDoubleClickEvent(this.mHandler, f2, f3);
        }
    }

    public int slamProcessIngestOri(double[] dArr, double d2) {
        if (PatchProxy.isSupport(new Object[]{dArr, Double.valueOf(d2)}, this, changeQuickRedirect, false, 16326, new Class[]{double[].class, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{dArr, Double.valueOf(d2)}, this, changeQuickRedirect, false, 16326, new Class[]{double[].class, Double.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestOri(this.mHandler, dArr, d2);
        }
    }

    public int slamProcessRotationEvent(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16332, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16332, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessRotationEvent(this.mHandler, f2, f3);
        }
    }

    public int slamProcessScaleEvent(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16331, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16331, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessScaleEvent(this.mHandler, f2, f3);
        }
    }

    public int slamProcessTouchEvent(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16327, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16327, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessTouchEvent(this.mHandler, f2, f3);
        }
    }

    public int tryRestore(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 16228, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 16228, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeTryRestore(this.mHandler, i, str);
        }
    }

    public void onFirstFrameRenderInfo(int i, double d2) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 16394, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 16394, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            double d3 = (double) e.f29698a;
            Double.isNaN(d3);
            com.ss.android.ttve.monitor.e.a(0, "te_preview_first_frame_screen_time", d2 - d3);
            StringBuilder sb = new StringBuilder("Camera Preview First Frame Cost: ");
            double d4 = (double) e.f29698a;
            Double.isNaN(d4);
            sb.append(d2 - d4);
            y.a("FaceBeautyInvoker", sb.toString());
        } else {
            if (i2 == 1) {
                double d5 = (double) e.f29699b;
                Double.isNaN(d5);
                com.ss.android.ttve.monitor.e.a(0, "te_preview_switch_camera_screen_time", d2 - d5);
                StringBuilder sb2 = new StringBuilder("Camera Change Cost: ");
                double d6 = (double) e.f29699b;
                Double.isNaN(d6);
                sb2.append(d2 - d6);
                y.a("FaceBeautyInvoker", sb2.toString());
            }
        }
    }

    public void setDeviceRotation(float[] fArr, double d2) {
        if (PatchProxy.isSupport(new Object[]{fArr, Double.valueOf(d2)}, this, changeQuickRedirect, false, 16303, new Class[]{float[].class, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fArr, Double.valueOf(d2)}, this, changeQuickRedirect, false, 16303, new Class[]{float[].class, Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandler != 0 && isRenderReady()) {
            nativeSetDeviceRotationWithStamp(this.mHandler, fArr, d2);
        }
    }

    public void updateRotation(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16244, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16244, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeUpdateRotationAndFront(this.mHandler, i, z);
        }
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f2) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2)}, null, changeQuickRedirect, true, 16393, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, null, changeQuickRedirect, true, 16393, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ttve.monitor.e.a(str, str2, f2);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, null, changeQuickRedirect, true, 16392, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, null, changeQuickRedirect, true, 16392, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ttve.monitor.e.a(str3, str4, (long) i);
    }

    public int initAudioPlayer(Context context, String str, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{context, str, new Long(j2)}, this, changeQuickRedirect, false, 16237, new Class[]{Context.class, String.class, Long.TYPE}, Integer.TYPE)) {
            return initAudioPlayer(context, str, j, false, false);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str, new Long(j2)}, this, changeQuickRedirect, false, 16237, new Class[]{Context.class, String.class, Long.TYPE}, Integer.TYPE)).intValue();
    }

    public void initReaction(Context context, String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context, str3, str2}, this, changeQuickRedirect, false, 16286, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str3, str2}, this, changeQuickRedirect, false, 16286, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeInitReaction(this.mHandler, str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNativeCallback_encodeData(byte[] r20, int r21, boolean r22) {
        /*
            r19 = this;
            r0 = r20
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r10 = 1
            r2[r10] = r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r22)
            r11 = 2
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 16384(0x4000, float:2.2959E-41)
            r3 = r19
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0060
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r12[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r22)
            r12[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 16384(0x4000, float:2.2959E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0060:
            com.ss.android.medialib.b r1 = mEncoderCaller
            if (r1 == 0) goto L_0x006d
            com.ss.android.medialib.b r1 = mEncoderCaller
            r2 = r21
            r3 = r22
            r1.onEncoderData(r0, r2, r3)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.FaceBeautyInvoker.onNativeCallback_encodeData(byte[], int, boolean):void");
    }

    public int onNativeCallback_encodeTexture(int i, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16385, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16385, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (mEncoderCaller != null) {
            return mEncoderCaller.onEncoderData(i, i2, 0, z);
        } else {
            return 0;
        }
    }

    public void recoverCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        if (PatchProxy.isSupport(new Object[]{strArr, dArr, zArr}, this, changeQuickRedirect, false, 16361, new Class[]{String[].class, double[].class, boolean[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, dArr, zArr}, this, changeQuickRedirect, false, 16361, new Class[]{String[].class, double[].class, boolean[].class}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeRecoverCherEffect(this.mHandler, strArr, dArr, zArr);
        }
    }

    public int setReshape(String str, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16312, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16312, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else {
            return nativeSetReshape(this.mHandler, str, f2, f3);
        }
    }

    public int setSticker(Bitmap bitmap, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16270, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16270, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetSticker(this.mHandler, bitmap, i, i2);
        }
    }

    public int updateComposerNode(String str, String str2, float f2) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2)}, this, changeQuickRedirect, false, 16370, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, this, changeQuickRedirect, false, 16370, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        } else {
            return nativeUpdateComposerNode(this.mHandler, str, str2, f2);
        }
    }

    public void updateRotation(float f2, float f3, float f4) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, changeQuickRedirect, false, 16301, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, changeQuickRedirect, false, 16301, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeUpdateRotation(this.mHandler, f2, f3, f4);
        }
    }

    public int bindEffectAudioProcessor(int i, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16365, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16365, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else {
            return nativeBindEffectAudioProcessor(this.mHandler, i, i2, z);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int initWavFile(int i, int i2, double d2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2)}, this, changeQuickRedirect, false, 16257, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2)}, this, changeQuickRedirect, false, 16257, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeInitWavFile(this.mHandler, i, i2, d2);
        }
    }

    public int setFaceMakeUp(String str, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16315, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16315, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else {
            return nativeSetFaceMakeUp(this.mHandler, str, f2, f3);
        }
    }

    public int setFilter(String str, String str2, float f2) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2)}, this, changeQuickRedirect, false, 16305, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, this, changeQuickRedirect, false, 16305, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeSetFilter(this.mHandler, str, str2, f2);
        }
    }

    public int concat(String str, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 16254, new Class[]{String.class, String.class, String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 16254, new Class[]{String.class, String.class, String.class, String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeConcat(this.mHandler, str, str2, 0, str3, str4, false);
        }
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 16277, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 16277, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        synchronized (FaceBeautyInvoker.class) {
            if (sMessageListener != null) {
                sMessageListener.onMessageReceived(i, i2, i3, str2);
            }
        }
    }

    public void sendEffectMsg(int i, long j, long j2, String str) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4), str}, this, changeQuickRedirect, false, 16351, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4), str}, this, changeQuickRedirect, false, 16351, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, String.class}, Void.TYPE);
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else {
            nativeSendEffectMsg(this.mHandler, i, j, j2, str);
        }
    }

    public void setBeautyFace(int i, String str, float f2, float f3) {
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16309, new Class[]{Integer.TYPE, String.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 16309, new Class[]{Integer.TYPE, String.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        y.b("FaceBeautyInvoker", "nativeSetBeautyFace: " + i2);
        if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
        } else if (i2 != 3 || g.a(str)) {
            nativeSetBeautyFace(this.mHandler, i2, str2);
            nativeSetBeautyFaceIntensity(this.mHandler, f2, f3);
        } else {
            nativeSetBeautyFace(this.mHandler, 0, "");
            nativeSetBeautyFaceIntensity(this.mHandler, 0.0f, 0.0f);
        }
    }

    public void setReactionPosMargin(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 16297, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 16297, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeSetReactionPosMargin(this.mHandler, i, i2, i3, i4);
        }
    }

    public int setStickerPath(String str, int i, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16321, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16321, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSetStickerPath(this.mHandler, str, i, i2, z);
        }
    }

    public int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Byte.valueOf(z4 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16322, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), Byte.valueOf(z4)}, this, changeQuickRedirect, false, 16322, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamDeviceConfig(this.mHandler, z, z2, z3, z4);
        }
    }

    public int slamProcessIngestAcc(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 16323, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 16323, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestAcc(this.mHandler, d2, d3, d4, d5);
        }
    }

    public int slamProcessIngestGra(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 16325, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 16325, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestGra(this.mHandler, d2, d3, d4, d5);
        }
    }

    public int slamProcessIngestGyr(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 16324, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 16324, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestGyr(this.mHandler, d2, d3, d4, d5);
        }
    }

    public int slamProcessTouchEventByType(int i, float f2, float f3, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16329, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16329, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessTouchEventByType(this.mHandler, i, f2, f3, i2);
        }
    }

    public int slamSetInputText(String str, int i, int i2, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 16334, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 16334, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else {
            return nativeSetSlamInputText(this.mHandler, str, i, i2, str2);
        }
    }

    public int slamSetTextBitmapResult(Bitmap bitmap, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 16340, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 16340, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            com.ss.android.medialib.common.c.c("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else {
            return nativeSlamSetTextBitmapResult(this.mHandler, bitmap, i, i2, i3);
        }
    }

    public int[] updateReactionCameraPos(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 16288, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 16288, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, int[].class);
        } else if (this.mHandler == 0) {
            return null;
        } else {
            return nativeUpdateReactionCameraPos(this.mHandler, i, i2, i3, i4);
        }
    }

    public int writeFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 16252, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 16252, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            return nativeWriteFile(this.mHandler, byteBuffer, i, i2, i3);
        }
    }

    public int renderPicture(j jVar, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2, Integer.valueOf(i), Integer.valueOf(i2), onPictureCallbackV2}, this, changeQuickRedirect, false, 16280, new Class[]{j.class, Integer.TYPE, Integer.TYPE, OnPictureCallbackV2.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{jVar2, Integer.valueOf(i), Integer.valueOf(i2), onPictureCallbackV2}, this, changeQuickRedirect, false, 16280, new Class[]{j.class, Integer.TYPE, Integer.TYPE, OnPictureCallbackV2.class}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            return -100000;
        } else {
            if (jVar2.f29606a != null) {
                return nativeRenderPicture(this.mHandler, jVar2.f29606a, jVar2.f29606a.length, i, i2, onPictureCallbackV2);
            } else if (Build.VERSION.SDK_INT >= 19 && jVar2.f29608c == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{3, 3});
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (!new k(jVar2).a(iArr, byteBufferArr)) {
                    return -1;
                }
                return nativeRenderPicture2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], jVar2.f29608c, jVar2.f29609d, jVar2.f29610e, i, i2, onPictureCallbackV2);
            } else if (jVar2.f29611f != null) {
                return nativeRenderPicture3(this.mHandler, jVar2.f29611f, i, i2, onPictureCallbackV2);
            } else {
                return nativeRenderPicture(this.mHandler, null, 0, 0, 0, null);
            }
        }
    }

    public int startPlay(Surface surface, String str, int i, int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{surface, str, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16224, new Class[]{Surface.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface, str, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16224, new Class[]{Surface.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i < 0) {
            i3 = g.b().h;
        } else {
            i3 = i;
        }
        if (i2 >= 0) {
            i4 = i2;
        } else if (g.b().k() == 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (this.mHandler == 0) {
            return -100000;
        }
        initMessageCenter();
        return nativeStartPlay(this.mHandler, surface, i3, i4, str);
    }

    public void initDuet(String str, float f2, float f3, float f4, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16281, new Class[]{String.class, Float.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16281, new Class[]{String.class, Float.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.mHandler != 0) {
            nativeInitDuet(this.mHandler, str, f2, f3, f4, z);
        }
    }

    public int slamProcessPanEvent(float f2, float f3, float f4, float f5, float f6) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6)}, this, changeQuickRedirect, false, 16330, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6)}, this, changeQuickRedirect, false, 16330, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandler == 0) {
            y.d("FaceBeautyInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessPanEvent(this.mHandler, f2, f3, f4, f5, f6);
        }
    }

    public int startPlay(int i, int i2, String str, int i3, int i4) {
        int i5;
        int i6;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 16226, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 16226, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i3 < 0) {
            i5 = g.b().h;
        } else {
            i5 = i3;
        }
        if (i4 >= 0) {
            i6 = i4;
        } else if (g.b().k() == 1) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (this.mHandler == 0) {
            return -100000;
        }
        initMessageCenter();
        return nativeStartPlay2(this.mHandler, i, i2, i5, i6, str);
    }

    public int[] updateReactionCameraPosWithRotation(int i, int i2, int i3, int i4, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f2)}, this, changeQuickRedirect, false, 16287, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f2)}, this, changeQuickRedirect, false, 16287, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, int[].class);
        } else if (this.mHandler == 0) {
            return null;
        } else {
            return nativeUpdateReactionCameraPosWithRotation(this.mHandler, i, i2, i3, i4, f2);
        }
    }

    public int initAudioPlayer(Context context, String str, long j, boolean z, boolean z2) {
        boolean z3;
        Pair pair;
        int i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16238, new Class[]{Context.class, String.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str, new Long(j2), Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 16238, new Class[]{Context.class, String.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            z3 = false;
        } else {
            z3 = packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        y.b("FaceBeautyInvoker", "has low latency ? " + z3);
        if (z2) {
            pair = new Pair(0, 0);
        } else {
            pair = com.ss.android.medialib.f.d.a(context);
        }
        y.b("FaceBeautyInvoker", "nativeSampleRate ? " + pair.first + " nativeSamleBufferSize? " + pair.second);
        boolean equals = "SM-A710F".equals(Build.MODEL);
        synchronized (this) {
            if (this.mHandler == 0) {
                return -100000;
            }
            long j3 = this.mHandler;
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            if (z3) {
                i = 45;
            } else {
                i = -1;
            }
            int nativeInitAudioPlayer = nativeInitAudioPlayer(j3, str, intValue, intValue2, j, z, equals, i);
            return nativeInitAudioPlayer;
        }
    }

    public int startPlay(Surface surface, String str, boolean z, int i, int i2) {
        Surface surface2 = surface;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{surface2, str2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16225, new Class[]{Surface.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface2, str2, Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16225, new Class[]{Surface.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int startPlay = startPlay(surface2, str2, i, i2);
        if (startPlay == 0 && z) {
            initHardEncoderInAdvance();
        }
        return startPlay;
    }

    public int concat(String str, String str2, int i, String str3, String str4, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16255, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i), str3, str4, Byte.valueOf(z)}, this, changeQuickRedirect, false, 16255, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        synchronized (this) {
            if (this.mHandler == 0) {
                return -100000;
            }
            return nativeConcat(this.mHandler, str, str2, i, str3, str4, z);
        }
    }

    public synchronized int shotScreen(String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, a.b bVar) {
        a.b bVar2 = bVar;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{str, iArr, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), onPictureCallback, bVar2}, this, changeQuickRedirect, false, 16278, new Class[]{String.class, int[].class, Boolean.TYPE, Integer.TYPE, OnPictureCallback.class, a.b.class}, Integer.TYPE)) {
                int intValue = ((Integer) PatchProxy.accessDispatch(new Object[]{str, iArr, Byte.valueOf(z), Integer.valueOf(i), onPictureCallback, bVar2}, this, changeQuickRedirect, false, 16278, new Class[]{String.class, int[].class, Boolean.TYPE, Integer.TYPE, OnPictureCallback.class, a.b.class}, Integer.TYPE)).intValue();
                return intValue;
            } else if (!this.mIsDuringScreenshot) {
                this.mIsDuringScreenshot = true;
                this.mShotScreenCallback = bVar2;
                if (this.mHandler == 0) {
                    return -100000;
                }
                int nativeShotScreen = nativeShotScreen(this.mHandler, str, iArr, z, i, onPictureCallback);
                return nativeShotScreen;
            } else {
                y.c("FaceBeautyInvoker", "Last screenshot not complete");
                bVar2.a(-1);
                return -1;
            }
        }
    }

    public int initFaceBeautyPlay(int i, int i2, String str, int i3, int i4, String str2, int i5) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5)}, this, changeQuickRedirect, false, 16220, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Integer.TYPE)) {
            return initFaceBeautyPlay(i, i2, str, i3, i4, str2, i5, false);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5)}, this, changeQuickRedirect, false, 16220, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public Surface onNativeCallback_InitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16380, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
            return (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16380, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
        } else if (mEncoderCaller == null) {
            return null;
        } else {
            y.a("FaceBeautyInvoker", "InitHardEncoder");
            return mEncoderCaller.onInitHardEncoder(i, i2, i3, i4, i5, i6, z);
        }
    }

    public int startRecord(double d2, boolean z, float f2, int i, int i2, String str, String str2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : 0), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), str, str2}, this, changeQuickRedirect, false, 16227, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Byte.valueOf(z), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), str, str2}, this, changeQuickRedirect, false, 16227, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Integer.TYPE)).intValue();
        }
        int i4 = (int) (4000000.0f * f2);
        if (i4 > 12000000) {
            i3 = 12000000;
        } else {
            i3 = i4;
        }
        if (this.mHandler == 0) {
            return -100000;
        }
        return nativeStartRecord(this.mHandler, d2, z, i3, i, i2, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int initFaceBeautyPlay(int r20, int r21, java.lang.String r22, int r23, int r24, java.lang.String r25, int r26, boolean r27) {
        /*
            r19 = this;
            r13 = r19
            r8 = 8
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r10 = 0
            r1[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r14 = 1
            r1[r14] = r2
            r11 = 2
            r1[r11] = r22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r12 = 3
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r15 = 4
            r1[r15] = r2
            r16 = 5
            r1[r16] = r25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r17 = 6
            r1[r17] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r27)
            r18 = 7
            r1[r18] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r14] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r15] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r16] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r17] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r18] = r2
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 16221(0x3f5d, float:2.273E-41)
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00d6
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r1[r14] = r2
            r1[r11] = r22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1[r15] = r0
            r1[r16] = r25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r1[r17] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r27)
            r1[r18] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = changeQuickRedirect
            r2 = 0
            r3 = 16221(0x3f5d, float:2.273E-41)
            java.lang.Class[] r4 = new java.lang.Class[r8]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r10] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r14] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r15] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r16] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r17] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r18] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r20 = r1
            r21 = r19
            r22 = r0
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x00d6:
            long r1 = r19.nativeCreate()
            r13.mHandler = r1
            r1 = 5000(0x1388, float:7.006E-42)
            com.ss.android.medialib.a.a((int) r1)
            monitor-enter(r19)
            long r1 = r13.mHandler     // Catch:{ all -> 0x011b }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00ef
            r0 = -100000(0xfffffffffffe7960, float:NaN)
            monitor-exit(r19)     // Catch:{ all -> 0x011b }
            return r0
        L_0x00ef:
            long r2 = r13.mHandler     // Catch:{ all -> 0x011b }
            r11 = 0
            r1 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r12 = r27
            int r0 = r1.nativeInitFaceBeautyPlay(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x0119
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "OPPO R7"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x0119
            long r1 = r13.mHandler     // Catch:{ all -> 0x011b }
            r13.nativeExpandPreviewAndRecordInterval(r1, r14)     // Catch:{ all -> 0x011b }
        L_0x0119:
            monitor-exit(r19)     // Catch:{ all -> 0x011b }
            return r0
        L_0x011b:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x011b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.FaceBeautyInvoker.initFaceBeautyPlay(int, int, java.lang.String, int, int, java.lang.String, int, boolean):int");
    }
}
