package com.ss.android.medialib;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.medialib.model.Segment;
import com.ss.android.ttve.nativePort.b;

@Keep
public class FFMpegInvoker {
    public static ChangeQuickRedirect changeQuickRedirect;
    e mFFMpagCaller;
    j metaInterface;

    public native int addFastReverseVideo(String str, String str2);

    public native int addReverseVideo(String str, String str2);

    public native int checkAudioFile(String str);

    public native int checkMp3File(String str);

    public native int checkVideoFile(String str);

    public native CoverInfo getFrameCover(String str, int i, int i2, int i3, int i4);

    public native int[] getFrameThumbnail(int i, int i2);

    public native int[] getOldFrameThumbnail(int i, int i2);

    public native int[] initVideoToGraph(String str, int i, int i2);

    public native int isCanImport(String str, long j, long j2);

    public native int mixAudioFile(String str, double d2, String str2, double d3, String str3);

    public native int mixAudioFiles(String str, double d2, String[] strArr, int[] iArr, double d3, String str2);

    public void onNativeCallback_MetaData(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, changeQuickRedirect, false, 16183, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, changeQuickRedirect, false, 16183, new Class[]{String.class, String.class}, Void.TYPE);
        }
    }

    public native int remuxVideo(String str, String str2);

    public native int rencodeAndSplitFile(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, String str4, int i4, String str5, float f2, boolean z, boolean z2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, FFMpegManager.EncoderListener encoderListener);

    public native int rencodeAndSplitMutliFile(Segment[] segmentArr, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, FFMpegManager.EncoderListener encoderListener);

    public native int rencodeFile(String str, String str2, String str3, long j, long j2, int i);

    public native int rencodeFileFullScreen(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, String str4, int i4, String str5, boolean z, int i5, int i6, int i7, int i8);

    public native int resampleAudioToWav(String str, String str2, long j, long j2);

    public native int resampleAudioToWav2(String str, String str2, long j);

    public native int resampleCycleAudioToWav(String str, String str2, long j, long j2);

    public native void stopGetFrameThumbnail();

    public native int stopReverseVideo();

    public native int uninitVideoToGraph();

    static {
        b.a();
    }

    public String onNativeCallback_getMetaKey() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16184, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16184, new Class[0], String.class);
        } else if (this.metaInterface != null) {
            return this.metaInterface.a();
        } else {
            return null;
        }
    }

    public void setMetaInterface(j jVar) {
        this.metaInterface = jVar;
    }

    public void setmFFMpagCaller(e eVar) {
        this.mFFMpagCaller = eVar;
    }

    public void onNativeCallback_progress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16182, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16182, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mFFMpagCaller != null) {
            this.mFFMpagCaller.a(i);
        }
    }
}
