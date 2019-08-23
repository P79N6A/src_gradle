package com.ss.android.ttve.nativePort;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.support.annotation.Keep;
import android.view.Surface;
import com.ss.android.ttve.audio.TEAudioWriter;
import com.ss.android.ttve.audio.b;
import com.ss.android.ttve.common.c;
import com.ss.android.ttve.common.d;
import com.ss.android.ttve.nativePort.a;

@Keep
public class TEVideoRecorder extends TENativeServiceBase {
    private static final String TAG = "TEVideoRecorder";
    private b mAudioRecorder = new b(new TEAudioWriter());
    private long mNativeAddr = nativeCreate();
    private a.c mNativeCreateCallback;

    private native int nativeAddBackgroundMusic(long j, String str, int i, int i2, int i3, int i4, int i5);

    private native long nativeCreate();

    private native int nativeCreateScene(long j, String[] strArr, String[] strArr2, int i, int i2);

    private native int nativeDestroy(long j);

    private native int nativeDrawFrame(long j, int i, int i2, int i3, int i4, int i5, long j2);

    private native int nativeGetCurrentPosition(long j);

    private native int nativeInit(long j, int i, int i2, int i3, int i4, String str, Surface surface);

    private native int nativeRemoveBackgroundMusic(long j, int i);

    private native int nativeSeek(long j, int i);

    private native int nativeSetBeautyFace(long j, int i, String str);

    private native int nativeSetBeautyFaceIntensity(long j, float f2, float f3);

    private native int nativeSetBeautyIntensity(long j, int i, float f2);

    private native int nativeSetCameraFocus(long j, float f2, float f3, float f4);

    private native int nativeSetDeviceRotation(long j, float[] fArr);

    private native int nativeSetEncoderContext(long j);

    private native int nativeSetFaceMakeUp(long j, String str, float f2, float f3);

    private native int nativeSetFaceReshape(long j, String str, float f2, float f3);

    private native int nativeSetFilter(long j, String str, float f2);

    private native int nativeSetFilterIntensity(long j, float f2);

    private native int nativeSetPreviewScaleMode(long j, int i);

    private native int nativeSetSurface(long j, Surface surface);

    private native int nativeSetSurfaceTexture(long j, SurfaceTexture surfaceTexture, int i);

    private native int nativeShotScreen(long j, String str, int i, int i2, int i3, int i4);

    private native int nativeStartPreview(long j);

    private native int nativeStartRecord(long j, String str, int i, int i2, float f2, boolean z);

    private native int nativeStopPreview(long j);

    private native int nativeStopRecord(long j);

    private native int nativeSwitchCamera(long j, int i);

    private native int nativeSwitchEffect(long j, String str);

    private native int nativeSwitchFilter(long j, String str, String str2, float f2);

    private native int nativeUpdateCameraRotation(long j, int i, boolean z);

    static {
        b.a();
    }

    public int destroy() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.a();
        int nativeDestroy = nativeDestroy(this.mNativeAddr);
        this.mNativeAddr = 0;
        return nativeDestroy;
    }

    public int getCurrentPosition() {
        if (this.mNativeAddr == 0) {
            return 0;
        }
        return nativeGetCurrentPosition(this.mNativeAddr);
    }

    public int setEncoderContext() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetEncoderContext(this.mNativeAddr);
    }

    public int startPreview() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeStartPreview(this.mNativeAddr);
    }

    public int stopPreview() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeStopPreview(this.mNativeAddr);
    }

    public int stopRecorder() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.b();
        return nativeStopRecord(this.mNativeAddr);
    }

    public int removeBackgroundMusic(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeRemoveBackgroundMusic(this.mNativeAddr, i);
    }

    public int seek(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSeek(this.mNativeAddr, i);
    }

    public int setDeviceRoation(float[] fArr) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetDeviceRotation(this.mNativeAddr, fArr);
    }

    public int setFilterIntensity(float f2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFilterIntensity(this.mNativeAddr, f2);
    }

    public int setPreviewScaleMode(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetPreviewScaleMode(this.mNativeAddr, i);
    }

    public int setSurface(Surface surface) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetSurface(this.mNativeAddr, surface);
    }

    public int switchCamera(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSwitchCamera(this.mNativeAddr, i);
    }

    public int switchEffect(String str) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSwitchEffect(this.mNativeAddr, str);
    }

    public int init(d dVar) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.a(5);
        return nativeInit(this.mNativeAddr, dVar.f31165c, dVar.f31166d, dVar.f31163a, dVar.f31164b, dVar.f31167e, dVar.f31168f);
    }

    public int startRecord(c cVar) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        b bVar = this.mAudioRecorder;
        String str = cVar.f31161d;
        double d2 = (double) cVar.f31159b;
        synchronized (bVar) {
            if (!bVar.j) {
                if (bVar.f31147e != null) {
                    bVar.j = true;
                    if (bVar.k.a(str, bVar.f31148f, 2, d2, 0, 0) == 0) {
                        new Thread(new Runnable() {
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void run(
/*
Method generation error in method: com.ss.android.ttve.audio.b.1.run():void, dex: classes4.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ttve.audio.b.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        }).start();
                    }
                }
            }
        }
        return nativeStartRecord(this.mNativeAddr, cVar.f31158a, cVar.f31160c.f31180a, cVar.f31160c.f31181b, cVar.f31159b, cVar.f31162e);
    }

    public int setBeautyFace(int i, String str) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetBeautyFace(this.mNativeAddr, i, str);
    }

    public int setBeautyFaceIntensity(float f2, float f3) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetBeautyFaceIntensity(this.mNativeAddr, f2, f3);
    }

    public int setBeautyIntensity(int i, float f2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetBeautyIntensity(this.mNativeAddr, i, f2);
    }

    public int setFilter(String str, float f2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFilter(this.mNativeAddr, str, f2);
    }

    public int setSurfaceTexture(SurfaceTexture surfaceTexture, int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetSurfaceTexture(this.mNativeAddr, surfaceTexture, i);
    }

    public int shotScreen(String str, Rect rect) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeShotScreen(this.mNativeAddr, str, rect.left, rect.top, rect.right, rect.bottom);
    }

    public int updateCameraRotation(int i, boolean z) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeUpdateCameraRotation(this.mNativeAddr, i, z);
    }

    public int setCameraFocus(float f2, float f3, float f4) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetCameraFocus(this.mNativeAddr, f2, f3, f4);
    }

    public int setFaceMakeUp(String str, float f2, float f3) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFaceMakeUp(this.mNativeAddr, str, f2, f3);
    }

    public int setFaceReshape(String str, float f2, float f3) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFaceReshape(this.mNativeAddr, str, f2, f3);
    }

    public int switchFilter(String str, String str2, float f2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSwitchFilter(this.mNativeAddr, str, str2, f2);
    }

    public int addBackgroundMusic(String str, int i, int i2, int i3) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeAddBackgroundMusic(this.mNativeAddr, str, 0, i2 - i, i, i2, i3);
    }

    public int createScene(String[] strArr, String[] strArr2, int i, int i2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeCreateScene(this.mNativeAddr, strArr, strArr2, i, i2);
    }

    public int drawFrame(int i, int i2, int i3, int i4, int i5, long j) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeDrawFrame(this.mNativeAddr, i, i2, i3, i4, i5, j);
    }

    public int init(int i, int i2, int i3, int i4, String str, Surface surface) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.a(5);
        return nativeInit(this.mNativeAddr, i, i2, i3, i4, str, surface);
    }
}
