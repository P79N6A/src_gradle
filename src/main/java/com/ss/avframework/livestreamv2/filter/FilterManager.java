package com.ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.OrientationEventListener;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.effect.EffectWrapper;
import com.ss.avframework.engine.AudioTrack;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.VideoProcessor;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.filter.ITTVideoEffectProcessor;
import com.ss.avframework.mixer.AudioMixer;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.opengl.YuvConverter;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;

public class FilterManager extends VideoProcessor implements TextureBufferImpl.ToI420Interface, IFilterManager {
    private EffectInputAudioStream mAudioStream;
    private InputAudioStreamObserver mAudioStreamObserver;
    public EffectWrapper mEffect;
    private boolean mEnabled;
    public boolean mForceSticker;
    public GLThread mGLThread;
    public Handler mHandler;
    public ITTVideoEffectProcessor.EffectMsgListener mMsgListener;
    public GlRenderDrawer mOffscreenDraw;
    public int mOrientation;
    private AlbumOrientationEventListener mOrientationListener;
    public GlTextureFrameBuffer mOut2DTex;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public YuvConverter mYuvConverter;

    class AlbumOrientationEventListener extends OrientationEventListener {
        public void onOrientationChanged(int i) {
            if (i != -1) {
                int i2 = (((i + 45) / 90) * 90) % 360;
                if (i2 != FilterManager.this.mOrientation) {
                    FilterManager.this.mOrientation = i2;
                }
            }
        }

        public AlbumOrientationEventListener(Context context) {
            super(context);
            if (canDetectOrientation()) {
                enable();
            } else {
                AVLog.e("FilterManager", "Can't Detect Orientation");
            }
        }
    }

    public class EffectInputAudioStream implements IInputAudioStream {
        private AudioCapturer mAudioCapturer;
        private AudioMixer.AudioMixerDescription mAudioMixerDescription;
        private AudioTrack mAudioTrack;
        private int mChannel;
        private InputAudioStreamObserver mObserver;
        private int mSample;

        public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
            return 0;
        }

        public AudioTrack getAudioTrack() {
            return this.mAudioTrack;
        }

        public int getChannel() {
            return this.mChannel;
        }

        public AudioMixer.AudioMixerDescription getMixerDescription() {
            return this.mAudioMixerDescription;
        }

        public int getSample() {
            return this.mSample;
        }

        public String name() {
            if (this.mAudioTrack != null) {
                return this.mAudioTrack.id();
            }
            return "";
        }

        public int start() {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.start();
                this.mAudioCapturer.resume();
            }
            return 0;
        }

        public int stop() {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.stop();
            }
            return 0;
        }

        public void release() {
            stop();
            if (this.mObserver != null) {
                this.mObserver.onInputAudioStreamRelease(this);
            }
            this.mAudioCapturer = null;
            if (this.mAudioTrack != null) {
                this.mAudioTrack.release();
                this.mAudioTrack = null;
            }
        }

        public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
            this.mAudioMixerDescription = audioMixerDescription;
        }

        public void mute(boolean z) {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.mute(z);
            }
        }

        public EffectInputAudioStream(AudioCapturer audioCapturer, InputAudioStreamObserver inputAudioStreamObserver) {
            if (audioCapturer != null) {
                this.mAudioCapturer = audioCapturer;
                this.mObserver = inputAudioStreamObserver;
                this.mAudioMixerDescription = new AudioMixer.AudioMixerDescription();
                if (this.mObserver != null) {
                    this.mObserver.onInputAudioStreamCreated(this);
                }
            }
        }

        public void setupAudioTrack(MediaEngineFactory mediaEngineFactory, int i, int i2) {
            if (this.mAudioCapturer != null) {
                this.mAudioTrack = mediaEngineFactory.createAudioTrack(this.mAudioCapturer);
                this.mSample = i;
                this.mChannel = i2;
                this.mAudioCapturer.setOutputFormat(i, i2, 16);
            }
        }
    }

    public interface InputAudioStreamObserver {
        void onInputAudioStreamCreated(EffectInputAudioStream effectInputAudioStream);

        void onInputAudioStreamRelease(EffectInputAudioStream effectInputAudioStream);
    }

    public boolean isEnable() {
        return this.mEnabled;
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (Throwable unused) {
        }
    }

    public static IFilterManager createDummy() {
        return new IFilterManager() {
            public final int composerReloadNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerSetMode(int i, int i2) {
                return 0;
            }

            public final int composerSetNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerUpdateNode(String str, String str2, float f2) {
                return 0;
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z) {
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager) {
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z, Object obj) {
            }

            public final void enable(boolean z) {
            }

            public final int enableMockFace(boolean z) {
                return 0;
            }

            public final String getVersion() {
                return "";
            }

            public final boolean isEnable() {
                return true;
            }

            public final boolean isValid() {
                return false;
            }

            public final String name() {
                return "DummyFilter";
            }

            public final int pauseEffect() {
                return 0;
            }

            public final int resumeEffect() {
                return 0;
            }

            public final int sendEffectMsg(int i, int i2, int i3, String str) {
                return 0;
            }

            public final int setBeautify(String str, float f2, float f3) {
                return 0;
            }

            public final int setBeautify(String str, float f2, float f3, float f4) {
                return 0;
            }

            public final int setCustomEffect(String str, String str2) {
                return 0;
            }

            public final int setEffect(String str) {
                return 0;
            }

            public final int setEffect(String str, boolean z) {
                return 0;
            }

            public final void setEffectMsgListener(ITTVideoEffectProcessor.EffectMsgListener effectMsgListener) {
            }

            public final int setFaceAttribute(boolean z) {
                return 0;
            }

            public final void setFaceDetectListener(ITTVideoEffectProcessor.FaceDetectListener faceDetectListener) {
            }

            public final int setFilter(String str, float f2) {
                return 0;
            }

            public final int setFilter(String str, String str2, float f2) {
                return 0;
            }

            public final void setMicrophoneDetectListener(ITTVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener) {
            }

            public final int setReshape(String str, float f2, float f3) {
                return 0;
            }

            public final int startEffectAudio() {
                return 0;
            }

            public final int stopEffectAudio() {
                return 0;
            }
        };
    }

    public String getVersion() {
        if (isValid()) {
            return EffectWrapper.getEffectVersion();
        }
        return "";
    }

    public boolean isValid() {
        if (this.mEffect == null || !this.mEffect.valid()) {
            return false;
        }
        return true;
    }

    public String name() {
        if (isValid()) {
            return this.mEffect.name();
        }
        return "";
    }

    public int pauseEffect() {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.pauseEffect();
                }
            }
        });
        return iArr[0];
    }

    public int resumeEffect() {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.resumeEffect();
                }
            }
        });
        return iArr[0];
    }

    public int startEffectAudio() {
        stopEffectAudio();
        if (isValid()) {
            this.mAudioStream = new EffectInputAudioStream(this.mEffect.getEffectAudioSource(), this.mAudioStreamObserver);
            this.mAudioStream.start();
        }
        return 0;
    }

    public int stopEffectAudio() {
        if (this.mAudioStream != null) {
            this.mAudioStream.stop();
            this.mAudioStream.release();
            this.mAudioStream = null;
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.mGLThread.getHandler().post(new com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass5(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6.mGLThread.join(3000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.ss.avframework.utils.AVLog.e("FilterManager", "FilerManager thread exit exception at " + 3000 + " ms.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r6.mAudioStreamObserver = r0     // Catch:{ all -> 0x0074 }
            r6.stopEffectAudio()     // Catch:{ all -> 0x0074 }
            android.os.Handler r1 = r6.mHandler     // Catch:{ all -> 0x0074 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r6)
            return
        L_0x000d:
            android.os.Handler r1 = r6.mHandler     // Catch:{ all -> 0x0074 }
            com.ss.avframework.livestreamv2.filter.FilterManager$4 r2 = new com.ss.avframework.livestreamv2.filter.FilterManager$4     // Catch:{ all -> 0x0074 }
            r2.<init>()     // Catch:{ all -> 0x0074 }
            r1.post(r2)     // Catch:{ all -> 0x0074 }
            com.ss.avframework.opengl.GLThread r1 = r6.mGLThread     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0056
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0027 }
            r2 = 18
            if (r1 < r2) goto L_0x0060
            com.ss.avframework.opengl.GLThread r1 = r6.mGLThread     // Catch:{ Throwable -> 0x0027 }
            r1.quitSafely()     // Catch:{ Throwable -> 0x0027 }
            goto L_0x0060
        L_0x0027:
            com.ss.avframework.opengl.GLThread r1 = r6.mGLThread     // Catch:{ all -> 0x0074 }
            android.os.Handler r1 = r1.getHandler()     // Catch:{ all -> 0x0074 }
            com.ss.avframework.livestreamv2.filter.FilterManager$5 r2 = new com.ss.avframework.livestreamv2.filter.FilterManager$5     // Catch:{ all -> 0x0074 }
            r2.<init>()     // Catch:{ all -> 0x0074 }
            r1.post(r2)     // Catch:{ all -> 0x0074 }
            r1 = 3000(0xbb8, double:1.482E-320)
            com.ss.avframework.opengl.GLThread r3 = r6.mGLThread     // Catch:{ InterruptedException -> 0x003d }
            r3.join(r1)     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x0060
        L_0x003d:
            java.lang.String r3 = "FilterManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = "FilerManager thread exit exception at "
            r4.<init>(r5)     // Catch:{ all -> 0x0074 }
            r4.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = " ms."
            r4.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0074 }
            com.ss.avframework.utils.AVLog.e(r3, r1)     // Catch:{ all -> 0x0074 }
            goto L_0x0060
        L_0x0056:
            android.os.Handler r1 = r6.mHandler     // Catch:{ all -> 0x0074 }
            com.ss.avframework.livestreamv2.filter.FilterManager$6 r2 = new com.ss.avframework.livestreamv2.filter.FilterManager$6     // Catch:{ all -> 0x0074 }
            r2.<init>()     // Catch:{ all -> 0x0074 }
            com.ss.avframework.utils.ThreadUtils.invokeAtFrontUninterruptibly((android.os.Handler) r1, (java.lang.Runnable) r2)     // Catch:{ all -> 0x0074 }
        L_0x0060:
            r6.mHandler = r0     // Catch:{ all -> 0x0074 }
            com.ss.avframework.livestreamv2.filter.ITTVideoEffectProcessor$EffectMsgListener r1 = r6.mMsgListener     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x006f
            com.ss.avframework.livestreamv2.filter.ITTVideoEffectProcessor$EffectMsgListener r1 = r6.mMsgListener     // Catch:{ all -> 0x0074 }
            r2 = 2139095042(0x7f800002, float:NaN)
            r3 = 0
            r1.onMessage(r2, r3, r3, r0)     // Catch:{ all -> 0x0074 }
        L_0x006f:
            super.release()     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.filter.FilterManager.release():void");
    }

    public int enableMockFace(boolean z) {
        this.mForceSticker = z;
        return 0;
    }

    public void enable(boolean z) {
        this.mEnabled = z;
        if (this.mAudioStream != null) {
            this.mAudioStream.mute(!z);
        }
    }

    public void setEffectMsgListener(ITTVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                AnonymousClass1 r1;
                if (FilterManager.this.mEffect != null) {
                    EffectWrapper effectWrapper = FilterManager.this.mEffect;
                    if (FilterManager.this.mMsgListener == null) {
                        r1 = null;
                    } else {
                        r1 = new MessageCenter.a() {
                            public void onMessageReceived(int i, int i2, int i3, String str) {
                                if (FilterManager.this.mMsgListener != null) {
                                    FilterManager.this.mMsgListener.onMessage(i, i2, i3, str);
                                }
                            }
                        };
                    }
                    effectWrapper.setEffectMsgListener(r1);
                }
            }
        });
    }

    public void setFaceDetectListener(final ITTVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setFaceDetectResultListener(new EffectWrapper.FaceDetectListener() {
                        public void onFaceDetectResultCallback(int i) {
                            if (faceDetectListener != null) {
                                faceDetectListener.onFaceDetectResultCallback(i);
                            }
                        }
                    });
                }
            }
        });
    }

    public void setMicrophoneDetectListener(final ITTVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMicrophoneDetectResultListener(new EffectWrapper.MicrophoneDetectListener() {
                        public void onMicrophoneDetectResultCallback(float f2) {
                            if (microphoneDetectListener != null) {
                                microphoneDetectListener.onMicrophoneDetectResultCallback(f2);
                            }
                        }
                    });
                }
            }
        });
    }

    public int setEffect(final String str) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.setEffect(str);
                }
            }
        });
        return iArr[0];
    }

    public int setFaceAttribute(final boolean z) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.setFaceAttribute(z);
                }
            }
        });
        return iArr[0];
    }

    public VideoFrame.I420Buffer toI420(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null && FilterManager.this.mYuvConverter == null) {
                    FilterManager.this.mYuvConverter = new YuvConverter();
                }
                if (FilterManager.this.mYuvConverter != null) {
                    i420BufferArr[0] = FilterManager.this.mYuvConverter.convert(textureBuffer);
                }
            }
        });
        if (i420BufferArr[0] != null) {
            return i420BufferArr[0];
        }
        throw new AndroidRuntimeException("BUG, Please fixed me");
    }

    public VideoFrame process(final VideoFrame videoFrame) {
        videoFrame.retain();
        if (!this.mEnabled || !isValid()) {
            return videoFrame;
        }
        final VideoFrame[] videoFrameArr = new VideoFrame[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                videoFrameArr[0] = FilterManager.this.onProcess(videoFrame);
            }
        });
        if (videoFrameArr[0] != videoFrame) {
            videoFrame.release();
        }
        return videoFrameArr[0];
    }

    public VideoFrame onProcess(VideoFrame videoFrame) {
        int i;
        VideoFrame videoFrame2 = videoFrame;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (this.mEffect == null) {
            return videoFrame2;
        }
        if (this.mTextureFrameBuffer != null) {
            this.mTextureFrameBuffer.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        }
        int i2 = 0;
        if (buffer instanceof VideoFrame.TextureBuffer) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
            Matrix transformMatrix = textureBuffer.getTransformMatrix();
            if (videoFrame.getRotation() != 0) {
                transformMatrix.preTranslate(0.5f, 0.5f);
                transformMatrix.preRotate((float) videoFrame.getRotation());
                transformMatrix.preTranslate(-0.5f, -0.5f);
            }
            transformMatrix.preTranslate(0.5f, 0.5f);
            transformMatrix.preScale(1.0f, -1.0f);
            transformMatrix.preTranslate(-0.5f, -0.5f);
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(transformMatrix);
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                this.mOffscreenDraw.drawOes(textureBuffer.getTextureId(), null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
            } else {
                this.mOffscreenDraw.drawRgb(textureBuffer.getTextureId(), null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
            }
            GLES20.glFlush();
            GLES20.glBindFramebuffer(36160, 0);
            if (this.mOut2DTex == null) {
                this.mOut2DTex = new GlTextureFrameBuffer(6408);
            }
            this.mOut2DTex.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            int textureId = this.mTextureFrameBuffer.getTextureId();
            i2 = this.mOut2DTex.getTextureId();
            i = textureId;
        } else {
            this.mTextureFrameBuffer.getTextureId();
            i = -1;
        }
        if (i > 0 && i2 > 0) {
            if (this.mEffect.process(i, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), i2, this.mOrientation / 90, videoFrame.getTimestampNs(), this.mForceSticker) != 0) {
                AVLog.e("FilterManager", "Process effect faild");
            } else {
                videoFrame2 = wrapperFrame(i2, videoFrame2);
            }
        }
        return videoFrame2;
    }

    public int composerReloadNodes(final String[] strArr, final int i) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.composerReloadNodes(strArr, i);
                }
            }
        });
        return iArr[0];
    }

    public int composerSetMode(final int i, final int i2) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.composerSetMode(i, i2);
                }
            }
        });
        return iArr[0];
    }

    public int composerSetNodes(final String[] strArr, final int i) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.composerSetNodes(strArr, i);
                }
            }
        });
        return iArr[0];
    }

    public int setCustomEffect(final String str, final String str2) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.setCustomEffect(str, str2);
                }
            }
        });
        return iArr[0];
    }

    public int setFilter(final String str, final float f2) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr[0] = FilterManager.this.mEffect.setFilter(str, f2);
                }
            }
        });
        return iArr[0];
    }

    private VideoFrame wrapperFrame(int i, VideoFrame videoFrame) {
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), VideoFrame.TextureBuffer.Type.RGB, i, matrix, (TextureBufferImpl.ToI420Interface) this, (Runnable) new Runnable() {
            public void run() {
            }
        });
        return new VideoFrame(textureBufferImpl, 0, videoFrame.getTimestampNs());
    }

    public int setEffect(final String str, final boolean z) {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mForceSticker = z;
                    iArr[0] = FilterManager.this.mEffect.setEffect(str);
                }
            }
        });
        return iArr[0];
    }

    public static IFilterManager create(InputAudioStreamObserver inputAudioStreamObserver, Context context, Handler handler) {
        return new FilterManager(inputAudioStreamObserver, context, handler);
    }

    public int composerUpdateNode(String str, String str2, float f2) {
        int[] iArr = new int[1];
        Handler handler = this.mHandler;
        final int[] iArr2 = iArr;
        final String str3 = str;
        final String str4 = str2;
        final float f3 = f2;
        AnonymousClass21 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr2[0] = FilterManager.this.mEffect.composerUpdateNode(str3, str4, f3);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
        return iArr[0];
    }

    public int setBeautify(String str, float f2, float f3) {
        int[] iArr = new int[1];
        Handler handler = this.mHandler;
        final int[] iArr2 = iArr;
        final String str2 = str;
        final float f4 = f2;
        final float f5 = f3;
        AnonymousClass10 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr2[0] = FilterManager.this.mEffect.setBeautify(str2, f4, f5);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
        return iArr[0];
    }

    public int setReshape(String str, float f2, float f3) {
        int[] iArr = new int[1];
        Handler handler = this.mHandler;
        final int[] iArr2 = iArr;
        final String str2 = str;
        final float f4 = f2;
        final float f5 = f3;
        AnonymousClass12 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr2[0] = FilterManager.this.mEffect.setReshape(str2, f4, f5);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
        return iArr[0];
    }

    public int setFilter(String str, String str2, float f2) {
        int[] iArr = new int[1];
        Handler handler = this.mHandler;
        final int[] iArr2 = iArr;
        final String str3 = str;
        final String str4 = str2;
        final float f3 = f2;
        AnonymousClass18 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr2[0] = FilterManager.this.mEffect.setFilter(str3, str4, f3);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
        return iArr[0];
    }

    public FilterManager(InputAudioStreamObserver inputAudioStreamObserver, Context context, Handler handler) {
        this.mHandler = handler;
        if (this.mHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        FilterManager.this.mHandler = null;
                    }
                }
            });
        }
        if (this.mHandler == null) {
            this.mGLThread = new GLThread("LiveFilterThread");
            this.mGLThread.start();
            this.mHandler = this.mGLThread.getHandler();
        }
        this.mAudioStreamObserver = inputAudioStreamObserver;
        this.mOrientationListener = new AlbumOrientationEventListener(context);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                String str;
                FilterManager.this.mEffect = new EffectWrapper();
                if (!FilterManager.this.mEffect.valid()) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect = null;
                }
                StringBuilder sb = new StringBuilder("Using ");
                if (FilterManager.this.mEffect != null) {
                    str = FilterManager.this.mEffect.name();
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append("(");
                sb.append(EffectWrapper.getEffectVersion());
                sb.append(")");
                AVLog.i("FilterManager", sb.toString());
                FilterManager.this.mOffscreenDraw = new GlRenderDrawer();
                FilterManager.this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            }
        });
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        int[] iArr = new int[1];
        Handler handler = this.mHandler;
        final int[] iArr2 = iArr;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final String str2 = str;
        AnonymousClass25 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr2[0] = FilterManager.this.mEffect.sendEffectMsg(i4, i5, i6, str2);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
        return iArr[0];
    }

    public int setBeautify(String str, float f2, float f3, float f4) {
        int[] iArr = new int[1];
        Handler handler = this.mHandler;
        final int[] iArr2 = iArr;
        final String str2 = str;
        final float f5 = f2;
        final float f6 = f3;
        final float f7 = f4;
        AnonymousClass11 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    iArr2[0] = FilterManager.this.mEffect.setBeautify(str2, f5, f6, f7);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
        return iArr[0];
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z) {
        Handler handler = this.mHandler;
        final int i3 = i;
        final int i4 = i2;
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = z;
        AnonymousClass7 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.configEffect(i3, i4, str3, str4, z2, false);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
        if (this.mMsgListener != null) {
            this.mMsgListener.onMessage(2139095041, 0, 0, null);
        }
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager) {
        Handler handler = this.mHandler;
        final AssetManager assetManager2 = assetManager;
        final int i3 = i;
        final int i4 = i2;
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = z;
        AnonymousClass8 r0 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setAssetManager(assetManager2);
                    FilterManager.this.mEffect.configEffect(i3, i4, str3, str4, z2, false);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r0);
        if (this.mMsgListener != null) {
            this.mMsgListener.onMessage(2139095041, 0, 0, null);
        }
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, Object obj) {
        Handler handler = this.mHandler;
        final Object obj2 = obj;
        final int i3 = i;
        final int i4 = i2;
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = z;
        AnonymousClass9 r0 = new Runnable() {
            public void run() {
                boolean z;
                if (FilterManager.this.isValid()) {
                    if (obj2 != null) {
                        FilterManager.this.mEffect.setResourceFinder(obj2);
                    }
                    EffectWrapper effectWrapper = FilterManager.this.mEffect;
                    int i = i3;
                    int i2 = i4;
                    String str = str3;
                    String str2 = str4;
                    boolean z2 = z2;
                    if (obj2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    effectWrapper.configEffect(i, i2, str, str2, z2, z);
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r0);
        if (this.mMsgListener != null) {
            this.mMsgListener.onMessage(2139095041, 0, 0, null);
        }
    }
}
