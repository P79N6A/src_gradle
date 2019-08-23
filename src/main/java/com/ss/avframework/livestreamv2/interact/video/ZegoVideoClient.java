package com.ss.avframework.livestreamv2.interact.video;

import android.view.View;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice;
import javax.microedition.khronos.egl.EGLContext;

public class ZegoVideoClient extends ZegoVideoCaptureDevice {
    public ZegoVideoCaptureDevice.Client mClient;
    private VideoClientFactory mFactory;
    private Config.FrameFormat mFrameFormat;
    private VideoClient mParent;

    /* renamed from: com.ss.avframework.livestreamv2.interact.video.ZegoVideoClient$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat = new int[Config.FrameFormat.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat[] r0 = com.ss.avframework.livestreamv2.interact.model.Config.FrameFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat = r0
                int[] r0 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat r1 = com.ss.avframework.livestreamv2.interact.model.Config.FrameFormat.TEXTURE_OES     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat r1 = com.ss.avframework.livestreamv2.interact.model.Config.FrameFormat.TEXTURE_2D     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.video.ZegoVideoClient.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public int enableTorch(boolean z) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setCaptureRotation(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setFrameRate(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setFrontCam(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setPowerlineFreq(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setResolution(int i, int i2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setView(View view) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setViewMode(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int setViewRotation(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int startPreview() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int stopPreview() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int takeSnapshot() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int startCapture() {
        this.mParent.start();
        return 0;
    }

    /* access modifiers changed from: protected */
    public int stopCapture() {
        this.mParent.stop();
        return 0;
    }

    /* access modifiers changed from: protected */
    public synchronized void stopAndDeAllocate() {
        this.mFactory.destroy(this.mParent);
        this.mParent = null;
        this.mClient = null;
    }

    /* access modifiers changed from: protected */
    public int supportBufferType() {
        if (AnonymousClass2.$SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat[this.mFrameFormat.ordinal()] != 1) {
            return 8;
        }
        return 4;
    }

    /* access modifiers changed from: protected */
    public void allocateAndStart(ZegoVideoCaptureDevice.Client client) {
        this.mClient = client;
        this.mClient.setFillMode(1);
        this.mParent = this.mFactory.create();
        this.mParent.prepare(new VideoCallback() {
            public boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
                synchronized (ZegoVideoClient.this) {
                    if (ZegoVideoClient.this.mClient == null) {
                        return false;
                    }
                    ZegoVideoClient.this.mClient.onTextureCaptured(i, i2, i3, (double) j);
                    return true;
                }
            }
        });
    }

    public ZegoVideoClient(VideoClientFactory videoClientFactory, Config.FrameFormat frameFormat) {
        this.mFactory = videoClientFactory;
        this.mFrameFormat = frameFormat;
    }
}
