package com.ss.avframework.livestreamv2.interact.video;

import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.video.rtc.engine.utils.ExtVideoFrame;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;

public class ByteVideoClient {
    public ByteVideoCallback mCallback;
    private VideoClientFactory mFactory;
    private Config.FrameFormat mFrameFormat;
    private VideoClient mParent;
    public float[] mTransform = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: com.ss.avframework.livestreamv2.interact.video.ByteVideoClient$2  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.video.ByteVideoClient.AnonymousClass2.<clinit>():void");
        }
    }

    public interface ByteVideoCallback {
        boolean updateVideoFrame(ExtVideoFrame extVideoFrame);
    }

    public void start() {
        this.mParent.start();
    }

    public void stop() {
        this.mParent.stop();
    }

    public void release() {
        this.mFactory.destroy(this.mParent);
        this.mParent = null;
    }

    public int getPixelFormat() {
        if (AnonymousClass2.$SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat[this.mFrameFormat.ordinal()] != 1) {
            return 10;
        }
        return 11;
    }

    public void prepare() {
        this.mParent = this.mFactory.create();
        this.mParent.prepare(new VideoCallback() {
            public boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
                ExtVideoFrame extVideoFrame = new ExtVideoFrame();
                extVideoFrame.format = ByteVideoClient.this.getPixelFormat();
                extVideoFrame.timeStamp = j * TimeUnit.MILLISECONDS.toNanos(1);
                extVideoFrame.stride = i2;
                extVideoFrame.height = i3;
                extVideoFrame.eglContext11 = eGLContext;
                extVideoFrame.eglContext14 = eGLContext2;
                extVideoFrame.textureID = i;
                extVideoFrame.syncMode = false;
                extVideoFrame.transform = ByteVideoClient.this.mTransform;
                return ByteVideoClient.this.mCallback.updateVideoFrame(extVideoFrame);
            }
        });
    }

    public ByteVideoClient(VideoClientFactory videoClientFactory, Config.FrameFormat frameFormat, ByteVideoCallback byteVideoCallback) {
        this.mFactory = videoClientFactory;
        this.mFrameFormat = frameFormat;
        this.mCallback = byteVideoCallback;
    }
}
