package com.ss.avframework.livestreamv2.interact.video;

import com.ss.avframework.livestreamv2.interact.model.Config;
import io.agora.rtc.mediaio.IVideoFrameConsumer;
import io.agora.rtc.mediaio.IVideoSource;
import io.agora.rtc.mediaio.MediaIO;
import javax.microedition.khronos.egl.EGLContext;

public class AgoraVideoClient implements IVideoSource {
    private VideoClientFactory mFactory;
    private Config.FrameFormat mFrameFormat;
    private VideoClient mParent;
    public boolean mStarted;
    public float[] mTransform = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    public IVideoFrameConsumer mVideoFrameConsumer;

    /* renamed from: com.ss.avframework.livestreamv2.interact.video.AgoraVideoClient$2  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.video.AgoraVideoClient.AnonymousClass2.<clinit>():void");
        }
    }

    public void onDispose() {
        this.mVideoFrameConsumer = null;
    }

    public boolean onStart() {
        this.mStarted = true;
        return true;
    }

    public void onStop() {
        this.mStarted = false;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        release();
    }

    public void start() {
        this.mParent.start();
    }

    public void stop() {
        this.mParent.stop();
    }

    public int getPixelFormat() {
        if (AnonymousClass2.$SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat[this.mFrameFormat.ordinal()] != 1) {
            return 10;
        }
        return 11;
    }

    public void release() {
        if (this.mParent != null) {
            this.mParent.stop();
            this.mFactory.destroy(this.mParent);
            this.mParent = null;
            this.mFactory = null;
        }
    }

    public int getBufferType() {
        if (getPixelFormat() == 10 || getPixelFormat() == 11) {
            return MediaIO.BufferType.TEXTURE.intValue();
        }
        if (getPixelFormat() == 1 || getPixelFormat() == 3 || getPixelFormat() == 4) {
            return MediaIO.BufferType.BYTE_BUFFER.intValue();
        }
        return 0;
    }

    public boolean onInitialize(IVideoFrameConsumer iVideoFrameConsumer) {
        this.mVideoFrameConsumer = iVideoFrameConsumer;
        return true;
    }

    public AgoraVideoClient(VideoClientFactory videoClientFactory, Config.FrameFormat frameFormat) {
        this.mFactory = videoClientFactory;
        this.mFrameFormat = frameFormat;
        this.mParent = this.mFactory.create();
        this.mParent.prepare(new VideoCallback() {
            public boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
                if (AgoraVideoClient.this.mVideoFrameConsumer == null || !AgoraVideoClient.this.mStarted || AgoraVideoClient.this.getBufferType() != MediaIO.BufferType.TEXTURE.intValue()) {
                    return false;
                }
                AgoraVideoClient.this.mVideoFrameConsumer.consumeTextureFrame(i, AgoraVideoClient.this.getPixelFormat(), i2, i3, 0, j, AgoraVideoClient.this.mTransform);
                return true;
            }
        });
    }
}
