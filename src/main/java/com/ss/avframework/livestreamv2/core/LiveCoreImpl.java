package com.ss.avframework.livestreamv2.core;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.VsyncModule;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.IInputVideoStream;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStream;
import com.ss.avframework.livestreamv2.LiveStreamOption;
import com.ss.avframework.livestreamv2.LiveStreamReport;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.core.AudioDeviceInputStream;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2;
import com.ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.interact.audio.AudioCallback;
import com.ss.avframework.livestreamv2.interact.audio.AudioClient;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.controller.AnchorController;
import com.ss.avframework.livestreamv2.interact.model.Region;
import com.ss.avframework.livestreamv2.interact.video.VideoCallback;
import com.ss.avframework.livestreamv2.interact.video.VideoClient;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.optimizer.live.sdk.dns.d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

public class LiveCoreImpl extends LiveCore implements AudioDeviceModule.Observer {
    public static String TAG = "com.ss.avframework.livestreamv2.core.LiveCoreImpl";
    public InteractAudioClientFactory mAudioClientFactory;
    private AudioDeviceInputStream mAudioDeviceInputStream;
    public final AudioDeviceModule mAudioDeviceModule;
    public ClientFactory mClientFactory;
    private EffectCameraWrapper mEffectCameraWrapper;
    public ILiveStream.ILiveStreamErrorListener mErrorListener;
    public ILiveStream.ILiveStreamInfoListener mInfoListener;
    public boolean mIsPublish;
    protected ILiveStream mLiveStream;
    private RenderView mRenderView;
    public boolean mUsingClientMixer;
    private boolean mUsingEffectCamera;
    private Handler mVideoCaptureHandler;
    private GLThread mVideoCaptureThread;
    public InteractVideoClientFactory mVideoClientFactory;
    private HandlerThread mWorkThread = new HandlerThread("LiveCoreWorkThread");
    public Handler mWorkThreadHandler;

    class ClientFactory {
        private ArrayList<Client> mClients = new ArrayList<>();
        private ArrayList<Integer> mInteractsId = new ArrayList<>();

        class AhchorInternal extends Anchor {
            private boolean mDispose;

            /* access modifiers changed from: protected */
            public void superDispose() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AhchorInternal.super.dispose();
                    }
                });
            }

            public synchronized void dispose() {
                if (LiveCoreImpl.this.mClientFactory.removeClient(this)) {
                    superDispose();
                }
            }

            public void start() {
                LiveCoreImpl.this.mClientFactory.start(this);
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AhchorInternal.super.start();
                    }
                });
            }

            public void stop() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AhchorInternal.super.stop();
                    }
                });
                LiveCoreImpl.this.mClientFactory.stop(this);
            }

            public void onUserJoined(int i) {
                LiveCoreImpl.this.mClientFactory.onUserJoin(this, i);
                super.onUserJoined(i);
            }

            public void onUserLeaved(int i) {
                LiveCoreImpl.this.mClientFactory.onUserLeaved(this, i);
                super.onUserLeaved(i);
            }

            public AhchorInternal(LiveCore.InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, AnchorController.StreamMixer streamMixer, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
                super(interactConfig, videoClientFactory, audioClientFactory, streamMixer, iInputAudioStream, iInputVideoStream);
            }
        }

        class GuestInternal extends Guest {
            /* access modifiers changed from: protected */
            public void superDispose() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.dispose();
                    }
                });
            }

            public synchronized void dispose() {
                if (LiveCoreImpl.this.mClientFactory.removeClient(this)) {
                    superDispose();
                }
            }

            public void start() {
                LiveCoreImpl.this.mClientFactory.start(this);
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.start();
                    }
                });
            }

            public void stop() {
                LiveCoreImpl.this.mClientFactory.stop(this);
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.stop();
                    }
                });
            }

            public void onUserJoined(int i) {
                LiveCoreImpl.this.mClientFactory.onUserJoin(this, i);
                super.onUserJoined(i);
            }

            public void onUserLeaved(int i) {
                LiveCoreImpl.this.mClientFactory.onUserLeaved(this, i);
                super.onUserLeaved(i);
            }

            public GuestInternal(LiveCore.InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
                super(interactConfig, videoClientFactory, audioClientFactory, iInputAudioStream, iInputVideoStream);
            }
        }

        public void dispose() {
            synchronized (this.mClients) {
                Iterator<Client> it2 = this.mClients.iterator();
                while (it2.hasNext()) {
                    Client next = it2.next();
                    next.stop();
                    if (next.isGuest()) {
                        ((GuestInternal) next).superDispose();
                    } else {
                        ((AhchorInternal) next).superDispose();
                    }
                }
                this.mClients.clear();
            }
        }

        private void addClients(Client client) {
            synchronized (this.mClients) {
                this.mClients.add(client);
            }
        }

        public boolean removeClient(Client client) {
            boolean remove;
            synchronized (this.mClients) {
                remove = this.mClients.remove(client);
            }
            return remove;
        }

        public ClientFactory() {
        }

        public void start(Client client) {
            LiveCoreImpl.this.mIsPublish = true;
            LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
            if (!LiveCoreImpl.this.mUsingClientMixer && liveStream != null) {
                LiveCoreImpl.this.mLiveStream.stopAudioCapture();
                LiveCoreImpl.this.mLiveStream.stop();
            }
        }

        public void stop(Client client) {
            LiveCoreImpl.this.mIsPublish = false;
            LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
            if (!LiveCoreImpl.this.mUsingClientMixer && liveStream != null && !client.isGuest()) {
                LiveCoreImpl.this.mLiveStream.startAudioCapture();
                List<String> urls = liveStream.getUrls();
                if (urls != null && !urls.isEmpty()) {
                    LiveCoreImpl.this.mLiveStream.start(liveStream.getUrls());
                }
            }
        }

        public void onUserJoin(Client client, int i) {
            synchronized (this.mInteractsId) {
                boolean isEmpty = this.mInteractsId.isEmpty();
                this.mInteractsId.add(Integer.valueOf(i));
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (isEmpty) {
                    if (iLiveStream != null) {
                        iLiveStream.enableMixer(false, true);
                        iLiveStream.enableMixer(true, true);
                    }
                    if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                        LiveCoreImpl.this.mAudioDeviceModule.enableBuiltInAEC(true);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onUserLeaved(com.ss.avframework.livestreamv2.core.Client r4, int r5) {
            /*
                r3 = this;
                java.util.ArrayList<java.lang.Integer> r4 = r3.mInteractsId
                monitor-enter(r4)
                java.util.ArrayList<java.lang.Integer> r0 = r3.mInteractsId     // Catch:{ all -> 0x0056 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x0014
                java.lang.String r5 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.TAG     // Catch:{ all -> 0x0056 }
                java.lang.String r0 = "Repeat interact user leaved event."
                com.ss.avframework.utils.AVLog.iow(r5, r0)     // Catch:{ all -> 0x0056 }
                monitor-exit(r4)     // Catch:{ all -> 0x0056 }
                return
            L_0x0014:
                java.util.ArrayList<java.lang.Integer> r0 = r3.mInteractsId     // Catch:{ all -> 0x0056 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0056 }
            L_0x001a:
                boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0031
                java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0056 }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0056 }
                int r2 = r1.intValue()     // Catch:{ all -> 0x0056 }
                if (r2 != r5) goto L_0x001a
                java.util.ArrayList<java.lang.Integer> r5 = r3.mInteractsId     // Catch:{ all -> 0x0056 }
                r5.remove(r1)     // Catch:{ all -> 0x0056 }
            L_0x0031:
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r5 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this     // Catch:{ all -> 0x0056 }
                com.ss.avframework.livestreamv2.ILiveStream r5 = r5.mLiveStream     // Catch:{ all -> 0x0056 }
                java.util.ArrayList<java.lang.Integer> r0 = r3.mInteractsId     // Catch:{ all -> 0x0056 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x0054
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r0 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this     // Catch:{ all -> 0x0056 }
                com.ss.avframework.engine.AudioDeviceModule r0 = r0.mAudioDeviceModule     // Catch:{ all -> 0x0056 }
                r1 = 0
                if (r0 == 0) goto L_0x004b
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r0 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this     // Catch:{ all -> 0x0056 }
                com.ss.avframework.engine.AudioDeviceModule r0 = r0.mAudioDeviceModule     // Catch:{ all -> 0x0056 }
                r0.enableBuiltInAEC(r1)     // Catch:{ all -> 0x0056 }
            L_0x004b:
                if (r5 == 0) goto L_0x0054
                r5.enableMixer(r1, r1)     // Catch:{ all -> 0x0056 }
                r0 = 1
                r5.enableMixer(r0, r1)     // Catch:{ all -> 0x0056 }
            L_0x0054:
                monitor-exit(r4)     // Catch:{ all -> 0x0056 }
                return
            L_0x0056:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0056 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.LiveCoreImpl.ClientFactory.onUserLeaved(com.ss.avframework.livestreamv2.core.Client, int):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AhchorInternal} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.ss.avframework.livestreamv2.core.Client create(com.ss.avframework.livestreamv2.core.LiveCore.InteractConfig r10, com.ss.avframework.livestreamv2.IInputAudioStream r11, com.ss.avframework.livestreamv2.IInputVideoStream r12, com.ss.avframework.livestreamv2.interact.controller.AnchorController.StreamMixer r13, boolean r14) {
            /*
                r9 = this;
                r0 = 0
                if (r14 == 0) goto L_0x001d
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal r7 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractVideoClientFactory r3 = r1.mVideoClientFactory
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this
                boolean r1 = r1.mUsingClientMixer
                if (r1 == 0) goto L_0x0013
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r0 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractAudioClientFactory r0 = r0.mAudioClientFactory
            L_0x0013:
                r4 = r0
                r0 = r7
                r1 = r9
                r2 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r2, r3, r4, r5, r6)
                goto L_0x0038
            L_0x001d:
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AhchorInternal r8 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AhchorInternal
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractVideoClientFactory r3 = r1.mVideoClientFactory
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this
                boolean r1 = r1.mUsingClientMixer
                if (r1 == 0) goto L_0x002d
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r0 = com.ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractAudioClientFactory r0 = r0.mAudioClientFactory
            L_0x002d:
                r4 = r0
                r0 = r8
                r1 = r9
                r2 = r10
                r5 = r13
                r6 = r11
                r7 = r12
                r0.<init>(r2, r3, r4, r5, r6, r7)
                r7 = r8
            L_0x0038:
                r9.addClients(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.LiveCoreImpl.ClientFactory.create(com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig, com.ss.avframework.livestreamv2.IInputAudioStream, com.ss.avframework.livestreamv2.IInputVideoStream, com.ss.avframework.livestreamv2.interact.controller.AnchorController$StreamMixer, boolean):com.ss.avframework.livestreamv2.core.Client");
        }
    }

    class InteractAudioClient implements ILiveStream.IAudioFrameAvailableListener, AudioClient {
        private AudioCallback mAudioCallback;
        private int mChannel;
        private int mSampleHz;
        private boolean mStart;

        public int getBitWidth() {
            return 16;
        }

        public void start() {
            this.mStart = true;
        }

        public void stop() {
            this.mStart = false;
        }

        public int getChannelCount() {
            int i;
            synchronized (this) {
                i = this.mChannel;
            }
            return i;
        }

        public int getSampleRate() {
            int i;
            synchronized (this) {
                i = this.mSampleHz;
            }
            return i;
        }

        public void release() {
            synchronized (this) {
                this.mAudioCallback = null;
            }
        }

        public void prepare(AudioCallback audioCallback) {
            this.mAudioCallback = audioCallback;
        }

        public InteractAudioClient(int i, int i2) {
            this.mChannel = i;
            this.mSampleHz = i2;
        }

        public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
            synchronized (this) {
                if (this.mStart && this.mAudioCallback != null) {
                    String str = LiveCoreImpl.TAG;
                    AVLog.d(str, "Input interact audio frame sample_rate" + i2);
                    if (getChannelCount() == i3 && getSampleRate() == i2) {
                        this.mAudioCallback.updateAudioFrame(buffer, i, j);
                    } else {
                        throw new AndroidRuntimeException("Interact client BUG!");
                    }
                }
            }
        }
    }

    class InteractAudioClientFactory implements ILiveStream.IAudioFrameAvailableListener, AudioClientFactory {
        private ArrayList<ILiveStream.IAudioFrameAvailableListener> mAudioClients = new ArrayList<>();

        public AudioClient create() {
            InteractAudioClient interactAudioClient;
            synchronized (this.mAudioClients) {
                boolean isEmpty = this.mAudioClients.isEmpty();
                interactAudioClient = new InteractAudioClient(LiveCoreImpl.this.getInternalBuilder().getAudioChannel(), LiveCoreImpl.this.getInternalBuilder().getAudioSampleHZ());
                this.mAudioClients.add(interactAudioClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && isEmpty) {
                    iLiveStream.setAudioFrameAvailableListener(this);
                }
            }
            return interactAudioClient;
        }

        public void destroy(AudioClient audioClient) {
            synchronized (this.mAudioClients) {
                this.mAudioClients.remove((InteractAudioClient) audioClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && this.mAudioClients.isEmpty()) {
                    iLiveStream.setAudioFrameAvailableListener(null);
                }
            }
        }

        public InteractAudioClientFactory(LiveCore.Builder builder) {
        }

        public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
            synchronized (this.mAudioClients) {
                Iterator<ILiveStream.IAudioFrameAvailableListener> it2 = this.mAudioClients.iterator();
                while (it2.hasNext()) {
                    it2.next().onAudioFrameAvailable(buffer, i, i2, i3, j);
                }
            }
        }
    }

    class InteractVideoClient implements ILiveStream.ITextureFrameAvailableListener, VideoClient {
        private boolean mStart;
        private VideoCallback mVideoCallback;

        public void start() {
            this.mStart = true;
        }

        public void stop() {
            this.mStart = false;
        }

        public void release() {
            synchronized (this) {
                this.mVideoCallback = null;
            }
        }

        private InteractVideoClient() {
        }

        public void prepare(VideoCallback videoCallback) {
            synchronized (this) {
                this.mVideoCallback = videoCallback;
                this.mStart = false;
            }
        }

        public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr) {
            synchronized (this) {
                if (this.mVideoCallback != null && this.mStart) {
                    String str = LiveCoreImpl.TAG;
                    StringBuilder sb = new StringBuilder("Input interact video frame tex ");
                    int i4 = i;
                    sb.append(i);
                    AVLog.d(str, sb.toString());
                    this.mVideoCallback.updateVideoFrame(eGLContext, null, i, i2, i3, j / 1000000);
                }
            }
        }
    }

    class InteractVideoClientFactory implements ILiveStream.ITextureFrameAvailableListener, VideoClientFactory {
        private ArrayList<ILiveStream.ITextureFrameAvailableListener> mVideoClients = new ArrayList<>();

        public VideoClient create() {
            InteractVideoClient interactVideoClient;
            AVLog.d(LiveCoreImpl.TAG, "Create client ");
            synchronized (this.mVideoClients) {
                boolean isEmpty = this.mVideoClients.isEmpty();
                interactVideoClient = new InteractVideoClient();
                this.mVideoClients.add(interactVideoClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && isEmpty) {
                    iLiveStream.setTextureFrameAvailableListener(this);
                }
            }
            return interactVideoClient;
        }

        public void destroy(VideoClient videoClient) {
            AVLog.d(LiveCoreImpl.TAG, "Destroy client ");
            synchronized (this.mVideoClients) {
                this.mVideoClients.remove((InteractVideoClient) videoClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && this.mVideoClients.isEmpty()) {
                    iLiveStream.setTextureFrameAvailableListener(null);
                }
            }
        }

        public InteractVideoClientFactory(LiveCore.Builder builder) {
        }

        public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr) {
            synchronized (this.mVideoClients) {
                Iterator<ILiveStream.ITextureFrameAvailableListener> it2 = this.mVideoClients.iterator();
                while (it2.hasNext()) {
                    it2.next().onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr);
                }
            }
        }
    }

    public AudioDeviceModule getADM() {
        return this.mAudioDeviceModule;
    }

    public boolean audioMute() {
        return this.mLiveStream.audioMute();
    }

    public IInputAudioStream createInputAudioStream() {
        return this.mLiveStream.createInputAudioStream();
    }

    public IInputVideoStream createInputVideoStream() {
        return this.mLiveStream.createInputVideoStream();
    }

    public IAudioFilterManager getAudioFilterMgr() {
        return this.mLiveStream.getAudioFilterMgr();
    }

    public IFilterManager getFilterMgr() {
        return getVideoFilterMgr();
    }

    public LiveStreamOption getOption() {
        return this.mLiveStream.getOption();
    }

    public IInputAudioStream getOriginInputAudioStream() {
        return this.mLiveStream.getOriginInputAudioStream();
    }

    public IInputVideoStream getOriginInputVideoStream() {
        return this.mLiveStream.getOriginInputVideoStream();
    }

    public IRecorderManager getRecorderMgr() {
        return this.mLiveStream.getRecorderMgr();
    }

    public String getVersion() {
        return this.mLiveStream.getVersion();
    }

    public void startAudioCapture() {
        this.mLiveStream.startAudioCapture();
    }

    public void startCaptureSource() {
        startAudioCapture();
        startVideoCapture();
    }

    public void stopAudioCapture() {
        this.mLiveStream.stopAudioCapture();
    }

    public void stopCaptureSource() {
        stopAudioCapture();
        stopVideoCapture();
    }

    /* access modifiers changed from: protected */
    public LiveCore.Builder getInternalBuilder() {
        return (LiveCore.Builder) ((LiveStream) this.mLiveStream).getLiveStreamBuilder();
    }

    public IVideoCapturerControl getVideoCapturerControl() {
        if (this.mUsingEffectCamera) {
            return this.mEffectCameraWrapper;
        }
        return this.mLiveStream.getVideoCapturerControl();
    }

    public IFilterManager getVideoFilterMgr() {
        if (this.mUsingEffectCamera) {
            return this.mEffectCameraWrapper;
        }
        return this.mLiveStream.getVideoFilterMgr();
    }

    public VsyncModule getVsyncModule() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getEncodeStreamVsyncModule();
        }
        return null;
    }

    public int startAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int startPlayer = LiveCoreImpl.this.mAudioDeviceModule.startPlayer();
                    if (startPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, startPlayer, new Exception("ADM startPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(18, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    public int stopAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int stopPlayer = LiveCoreImpl.this.mAudioDeviceModule.stopPlayer();
                    if (stopPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, stopPlayer, new Exception("ADM stopPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(19, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    public void pause() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.stopCapture();
        }
        this.mLiveStream.pause();
    }

    public void resume() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.startCapture();
        }
        this.mLiveStream.resume();
    }

    public void startVideoCapture() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.startCapture();
        }
        this.mLiveStream.startVideoCapture();
    }

    public void stop() {
        if (!this.mIsPublish || this.mUsingClientMixer) {
            this.mLiveStream.stop();
        } else {
            this.mClientFactory.dispose();
        }
    }

    public void stopVideoCapture() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.stopCapture();
        }
        this.mLiveStream.stopVideoCapture();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:24|25|26|27|28|29|30) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009a */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ss.avframework.livestreamv2.core.AudioDeviceInputStream r0 = r4.mAudioDeviceInputStream     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x000a
            com.ss.avframework.livestreamv2.core.AudioDeviceInputStream r0 = r4.mAudioDeviceInputStream     // Catch:{ all -> 0x00c1 }
            r0.release()     // Catch:{ all -> 0x00c1 }
        L_0x000a:
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory r0 = r4.mClientFactory     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0013
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory r0 = r4.mClientFactory     // Catch:{ all -> 0x00c1 }
            r0.dispose()     // Catch:{ all -> 0x00c1 }
        L_0x0013:
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r0 = r4.mEffectCameraWrapper     // Catch:{ all -> 0x00c1 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r0 = r4.mEffectCameraWrapper     // Catch:{ all -> 0x00c1 }
            r0.stopCapture()     // Catch:{ all -> 0x00c1 }
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r0 = r4.mEffectCameraWrapper     // Catch:{ all -> 0x00c1 }
            r0.release()     // Catch:{ all -> 0x00c1 }
            r4.mEffectCameraWrapper = r1     // Catch:{ all -> 0x00c1 }
        L_0x0024:
            r4.stopAudioCapture()     // Catch:{ all -> 0x00c1 }
            r4.stopCaptureSource()     // Catch:{ all -> 0x00c1 }
            r4.stopAudioPlayer()     // Catch:{ all -> 0x00c1 }
            android.os.Handler r0 = r4.mWorkThreadHandler     // Catch:{ all -> 0x00c1 }
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$3 r2 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$3     // Catch:{ all -> 0x00c1 }
            r2.<init>()     // Catch:{ all -> 0x00c1 }
            r0.post(r2)     // Catch:{ all -> 0x00c1 }
            com.ss.avframework.livestreamv2.RenderView r0 = r4.mRenderView     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0044
            com.ss.avframework.livestreamv2.ILiveStream r0 = r4.mLiveStream     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0044
            com.ss.avframework.livestreamv2.ILiveStream r0 = r4.mLiveStream     // Catch:{ all -> 0x00c1 }
            r0.setRenderSink(r1)     // Catch:{ all -> 0x00c1 }
        L_0x0044:
            com.ss.avframework.livestreamv2.ILiveStream r0 = r4.mLiveStream     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0054
            com.ss.avframework.livestreamv2.ILiveStream r0 = r4.mLiveStream     // Catch:{ all -> 0x00c1 }
            r0.stop()     // Catch:{ all -> 0x00c1 }
            com.ss.avframework.livestreamv2.ILiveStream r0 = r4.mLiveStream     // Catch:{ all -> 0x00c1 }
            r0.release()     // Catch:{ all -> 0x00c1 }
            r4.mLiveStream = r1     // Catch:{ all -> 0x00c1 }
        L_0x0054:
            com.ss.avframework.livestreamv2.RenderView r0 = r4.mRenderView     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x005f
            com.ss.avframework.livestreamv2.RenderView r0 = r4.mRenderView     // Catch:{ all -> 0x00c1 }
            r0.release()     // Catch:{ all -> 0x00c1 }
            r4.mRenderView = r1     // Catch:{ all -> 0x00c1 }
        L_0x005f:
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00c1 }
            r0.<init>()     // Catch:{ all -> 0x00c1 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c1 }
            android.os.Handler r2 = r4.mWorkThreadHandler     // Catch:{ all -> 0x00be }
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$4 r3 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$4     // Catch:{ all -> 0x00be }
            r3.<init>(r0)     // Catch:{ all -> 0x00be }
            r2.post(r3)     // Catch:{ all -> 0x00be }
            r2 = 500(0x1f4, double:2.47E-321)
            r0.wait(r2)     // Catch:{ InterruptedException -> 0x0074 }
        L_0x0074:
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c1 }
            r2 = 18
            if (r0 < r2) goto L_0x00a6
            android.os.HandlerThread r0 = r4.mWorkThread     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x008b
            android.os.HandlerThread r0 = r4.mWorkThread     // Catch:{ Throwable -> 0x0085 }
            r0.quitSafely()     // Catch:{ Throwable -> 0x0085 }
            goto L_0x0090
        L_0x0085:
            android.os.HandlerThread r0 = r4.mWorkThread     // Catch:{ all -> 0x00c1 }
            r0.quit()     // Catch:{ all -> 0x00c1 }
            goto L_0x0090
        L_0x008b:
            android.os.HandlerThread r0 = r4.mWorkThread     // Catch:{ all -> 0x00c1 }
            r0.quit()     // Catch:{ all -> 0x00c1 }
        L_0x0090:
            com.ss.avframework.opengl.GLThread r0 = r4.mVideoCaptureThread     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00a0
            com.ss.avframework.opengl.GLThread r0 = r4.mVideoCaptureThread     // Catch:{ Throwable -> 0x009a }
            r0.quitSafely()     // Catch:{ Throwable -> 0x009a }
            goto L_0x00b8
        L_0x009a:
            com.ss.avframework.opengl.GLThread r0 = r4.mVideoCaptureThread     // Catch:{ all -> 0x00c1 }
            r0.quit()     // Catch:{ all -> 0x00c1 }
            goto L_0x00b8
        L_0x00a0:
            com.ss.avframework.opengl.GLThread r0 = r4.mVideoCaptureThread     // Catch:{ all -> 0x00c1 }
            r0.quit()     // Catch:{ all -> 0x00c1 }
            goto L_0x00b8
        L_0x00a6:
            android.os.HandlerThread r0 = r4.mWorkThread     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00af
            android.os.HandlerThread r0 = r4.mWorkThread     // Catch:{ all -> 0x00c1 }
            r0.quit()     // Catch:{ all -> 0x00c1 }
        L_0x00af:
            com.ss.avframework.opengl.GLThread r0 = r4.mVideoCaptureThread     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00b8
            com.ss.avframework.opengl.GLThread r0 = r4.mVideoCaptureThread     // Catch:{ all -> 0x00c1 }
            r0.quit()     // Catch:{ all -> 0x00c1 }
        L_0x00b8:
            r4.mWorkThread = r1     // Catch:{ all -> 0x00c1 }
            r4.mVideoCaptureThread = r1     // Catch:{ all -> 0x00c1 }
            monitor-exit(r4)
            return
        L_0x00be:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.LiveCoreImpl.release():void");
    }

    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        return this.mLiveStream.getLiveStreamInfo(liveStreamReport);
    }

    public boolean isEnableMixer(boolean z) {
        return this.mLiveStream.isEnableMixer(z);
    }

    public boolean isMirror(boolean z) {
        return this.mLiveStream.isMirror(z);
    }

    public void sendSeiMsg(String str) {
        this.mLiveStream.sendSeiMsg(str);
    }

    public void setAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        this.mLiveStream.setAudioFrameAvailableListener(iAudioFrameAvailableListener);
    }

    public void setAudioMute(boolean z) {
        this.mLiveStream.setAudioMute(z);
    }

    public void setBackGroundPhotoPath(Object obj) {
        this.mLiveStream.setBackGroundPhotoPath(obj);
    }

    public void setDataListener(ILiveStream.ILiveStreamDataListener iLiveStreamDataListener) {
        this.mLiveStream.setDataListener(iLiveStreamDataListener);
    }

    public void setDns(d dVar) {
        this.mLiveStream.setDns(dVar);
    }

    public void setErrorListener(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
        this.mLiveStream.setErrorListener(iLiveStreamErrorListener);
    }

    public void setInfoListener(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        this.mInfoListener = iLiveStreamInfoListener;
        this.mLiveStream.setInfoListener(iLiveStreamInfoListener);
    }

    public void setOption(LiveStreamOption liveStreamOption) {
        this.mLiveStream.setOption(liveStreamOption);
    }

    public void setScreenIntent(Intent intent) {
        this.mLiveStream.setScreenIntent(intent);
    }

    public void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        this.mLiveStream.setTextureFrameAvailableListener(iTextureFrameAvailableListener);
    }

    public void setTimeInterval(int i) {
        this.mLiveStream.setTimeInterval(i);
    }

    public void switchAudioCapture(int i) {
        this.mLiveStream.switchAudioCapture(i);
    }

    private void adjustParameter(LiveCore.Builder builder) {
        builder.getVideoCaptureDevice();
        if (builder.isUsingEffectCamera()) {
            builder.setVideoCaptureDevice(4);
        }
    }

    public void start(String str) {
        if (!this.mIsPublish || this.mUsingClientMixer) {
            this.mLiveStream.start(str);
        }
    }

    private IInputAudioStream createFromADM(final ILiveStream iLiveStream) {
        final IInputAudioStream[] iInputAudioStreamArr = {null};
        if (this.mAudioDeviceModule == null) {
            return iLiveStream.createInputAudioStream();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, (Runnable) new Runnable() {
            public void run() {
                iInputAudioStreamArr[0] = LiveCoreImpl.this.onInputAudioStream(iLiveStream);
            }
        });
        return iInputAudioStreamArr[0];
    }

    public void setDisplay(SurfaceView surfaceView) {
        if (this.mUsingEffectCamera) {
            this.mEffectCameraWrapper.setSurface(surfaceView);
            return;
        }
        this.mRenderView = new RenderView(surfaceView);
        if (this.mLiveStream != null) {
            this.mLiveStream.setRenderSink(this.mRenderView);
        }
    }

    public void start(List<String> list) {
        if (!this.mIsPublish || this.mUsingClientMixer) {
            this.mLiveStream.start(list);
        }
    }

    public IInputAudioStream onInputAudioStream(ILiveStream iLiveStream) {
        if (this.mAudioDeviceInputStream == null) {
            this.mAudioDeviceInputStream = new AudioDeviceInputStream(this.mAudioDeviceModule, iLiveStream.createInputAudioStream());
            startAudioPlayer();
        }
        AudioDeviceInputStream.RenderStream createRenderSteream = this.mAudioDeviceInputStream.createRenderSteream();
        if (createRenderSteream != null) {
            this.mAudioDeviceModule.getRenderMixer().setOriginTrackIndex(createRenderSteream.getAudioRenderSink().getRenderTrackId());
        }
        return createRenderSteream;
    }

    private void initEffectCamera(LiveCore.Builder builder) {
        EffectCameraWrapper effectCameraWrapper = new EffectCameraWrapper(builder, this.mVideoCaptureHandler, this.mWorkThreadHandler, new LiveStreamVideoCapture.Observer() {
            public void onVideoCaptureStarted() {
                if (LiveCoreImpl.this.mInfoListener != null) {
                    LiveCoreImpl.this.mInfoListener.onInfo(5, 0, 0);
                }
            }

            public void onVideoCaptureStoped() {
                if (LiveCoreImpl.this.mInfoListener != null) {
                    LiveCoreImpl.this.mInfoListener.onInfo(6, 0, 0);
                }
            }

            public void onVideoCaptureError(int i, Exception exc) {
                if (LiveCoreImpl.this.mErrorListener != null) {
                    LiveCoreImpl.this.mErrorListener.onError(2, i, exc);
                }
            }
        }, new CameraDisplay2.FrameListener() {
            public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    iLiveStream.pushVideoFrame(i, false, i3, i4, 180, new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f}, j * 1000, bundle);
                }
            }
        });
        this.mEffectCameraWrapper = effectCameraWrapper;
        if (builder.getEffectResourceFinder() != null) {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect(), builder.getEffectResourceFinder());
        } else if (builder.getAssetManager() == null || !(builder.getAssetManager() instanceof AssetManager)) {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect());
        } else {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect(), (AssetManager) builder.getAssetManager());
        }
    }

    public LiveCoreImpl(LiveCore.Builder builder) {
        this.mWorkThread.start();
        this.mWorkThreadHandler = new Handler(this.mWorkThread.getLooper());
        this.mVideoCaptureThread = new GLThread("LiveCoreVideoCaptureThread");
        this.mVideoCaptureThread.start();
        this.mVideoCaptureHandler = this.mVideoCaptureThread.getHandler();
        this.mAudioDeviceModule = new AudioDeviceModule(this, builder.getContext());
        this.mAudioDeviceModule.enableBuiltInAEC(false);
        this.mAudioDeviceModule.enableEchoMode(false);
        this.mAudioDeviceModule.getRenderMixer().setEnable(true);
        adjustParameter(builder);
        TEBundle parameter = this.mAudioDeviceModule.getParameter();
        parameter.setInt("audio_sample", builder.getAudioCaptureSampleHZ());
        parameter.setInt("audio_channels", builder.getAudioCaptureChannel());
        parameter.setInt("adm_audio_player_channel", builder.getAudioChannel());
        parameter.setInt("adm_audio_player_sample", builder.getAudioSampleHZ());
        parameter.setInt("audio_bit_width", builder.getAudioBitwidth());
        this.mAudioDeviceModule.setParameter(parameter);
        parameter.release();
        this.mUsingEffectCamera = builder.isUsingEffectCamera();
        this.mLiveStream = builder.createLiveStream(this.mWorkThreadHandler, this.mVideoCaptureHandler, this.mAudioDeviceModule);
        this.mClientFactory = new ClientFactory();
        this.mVideoClientFactory = new InteractVideoClientFactory(builder);
        this.mAudioClientFactory = new InteractAudioClientFactory(builder);
        if (this.mUsingEffectCamera) {
            initEffectCamera(builder);
        }
        if (this.mUsingEffectCamera) {
            this.mLiveStream.getVideoFilterMgr().enable(false);
            return;
        }
        if (builder.getVideoCaptureDevice() != 3) {
            this.mLiveStream.getVideoFilterMgr().enable(true);
        }
    }

    public void switchVideoCapture(int i) {
        if (!this.mUsingEffectCamera || i == 2 || 1 == i) {
            switch (i) {
                case 1:
                case 2:
                    if (this.mUsingEffectCamera) {
                        this.mEffectCameraWrapper.switchCamera();
                        getBuilder().setVideoCaptureDevice(i);
                        return;
                    }
                    this.mLiveStream.switchVideoCapture(i);
                    return;
                case 3:
                    if (this.mUsingEffectCamera) {
                        this.mEffectCameraWrapper.stopCapture();
                        getBuilder().setVideoCaptureDevice(i);
                    }
                    this.mLiveStream.switchVideoCapture(i);
                    return;
                default:
                    if (this.mUsingEffectCamera) {
                        this.mEffectCameraWrapper.stopCapture();
                        return;
                    } else {
                        this.mLiveStream.switchVideoCapture(i);
                        return;
                    }
            }
        } else {
            final Exception exc = new Exception("invalid operation on switch video capture, target capture " + i + " current capture " + getBuilder().getVideoCaptureDevice() + " is effectcam " + this.mUsingEffectCamera);
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveCoreImpl.this.onWarning(1, 0, exc);
                }
            });
            getBuilder().setVideoCaptureDevice(i);
        }
    }

    public void enableMixer(boolean z, boolean z2) {
        this.mLiveStream.enableMixer(z, z2);
    }

    public void enableMirror(boolean z, boolean z2) {
        if (this.mUsingEffectCamera) {
            this.mEffectCameraWrapper.enableMirror(z, z2);
        } else {
            this.mLiveStream.enableMirror(z, z2);
        }
    }

    public Client create(LiveCore.InteractConfig interactConfig, boolean z) {
        IInputVideoStream iInputVideoStream;
        IInputAudioStream iInputAudioStream;
        if (!checkInteractCfg(interactConfig, z)) {
            AVLog.e(TAG, "Parameter invalid.");
            return null;
        }
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null || !this.mUsingClientMixer) {
            iInputAudioStream = null;
            iInputVideoStream = null;
        } else {
            IInputAudioStream createFromADM = createFromADM(iLiveStream);
            iInputVideoStream = iLiveStream.createInputVideoStream();
            iInputAudioStream = createFromADM;
        }
        return this.mClientFactory.create(interactConfig, iInputAudioStream, iInputVideoStream, configMixer(interactConfig, iInputAudioStream, iInputVideoStream), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkInteractCfg(com.ss.avframework.livestreamv2.core.LiveCore.InteractConfig r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r5.isClientMixStream()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            if (r6 != 0) goto L_0x001d
            com.ss.avframework.mixer.VideoMixer$VideoMixerDescription r0 = r5.getVideoMixerDescription()
            if (r0 == 0) goto L_0x0015
            com.ss.avframework.mixer.AudioMixer$AudioMixerDescription r0 = r5.getAudioMixerDescription()
            if (r0 != 0) goto L_0x001d
        L_0x0015:
            java.lang.String r5 = TAG
            java.lang.String r6 = "mixer parameter is null"
            com.ss.avframework.utils.AVLog.e(r5, r6)
            return r1
        L_0x001d:
            if (r6 == 0) goto L_0x004b
            boolean r6 = r5.isClientMixStream()
            if (r6 == 0) goto L_0x002f
            java.lang.String r6 = TAG
            java.lang.String r0 = "Guest set client mix invalid."
            com.ss.avframework.utils.AVLog.w(r6, r0)
            r5.setClientMixStream(r1)
        L_0x002f:
            com.ss.avframework.mixer.VideoMixer$VideoMixerDescription r6 = r5.getVideoMixerDescription()
            if (r6 != 0) goto L_0x003d
            com.ss.avframework.mixer.VideoMixer$VideoMixerDescription r6 = new com.ss.avframework.mixer.VideoMixer$VideoMixerDescription
            r6.<init>()
            r5.setVideoMixerDescription(r6)
        L_0x003d:
            com.ss.avframework.mixer.AudioMixer$AudioMixerDescription r6 = r5.getAudioMixerDescription()
            if (r6 != 0) goto L_0x004b
            com.ss.avframework.mixer.AudioMixer$AudioMixerDescription r6 = new com.ss.avframework.mixer.AudioMixer$AudioMixerDescription
            r6.<init>()
            r5.setAudioMixerDescription(r6)
        L_0x004b:
            boolean r6 = r5.isClientMixStream()
            if (r6 == 0) goto L_0x0054
            r5.setAutoPlayRemoteAudio(r1)
        L_0x0054:
            boolean r6 = r5.isClientMixStream()
            if (r6 == 0) goto L_0x009c
            long r0 = r5.getEGLNativeAddr()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x009c
            com.ss.avframework.livestreamv2.ILiveStream r6 = r4.mLiveStream
            boolean r6 = r6 instanceof com.ss.avframework.livestreamv2.LiveStream
            if (r6 == 0) goto L_0x009c
            com.ss.avframework.livestreamv2.ILiveStream r6 = r4.mLiveStream
            com.ss.avframework.livestreamv2.LiveStream r6 = (com.ss.avframework.livestreamv2.LiveStream) r6
            android.opengl.EGLContext r6 = r6.getSharedEGLContext()
            if (r6 == 0) goto L_0x008b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x007f
            long r0 = r6.getNativeHandle()
            goto L_0x008c
        L_0x007f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x008b
            int r6 = r6.getHandle()
            long r0 = (long) r6
            goto L_0x008c
        L_0x008b:
            r0 = r2
        L_0x008c:
            r5.setEGLNativeAddr(r0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0094
            goto L_0x009c
        L_0x0094:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Not found avalable shard egl context."
            r5.<init>(r6)
            throw r5
        L_0x009c:
            android.os.Handler r6 = r5.getHandler()
            if (r6 != 0) goto L_0x00a7
            android.os.Handler r6 = r4.mVideoCaptureHandler
            r5.setHandler(r6)
        L_0x00a7:
            int r6 = r5.getOutPlayerAudioChannel()
            com.ss.avframework.livestreamv2.core.LiveCore$Builder r0 = r4.getBuilder()
            int r0 = r0.getAudioChannel()
            if (r6 == r0) goto L_0x00c0
            com.ss.avframework.livestreamv2.core.LiveCore$Builder r6 = r4.getBuilder()
            int r6 = r6.getAudioChannel()
            r5.setOutPlayerAudioChannel(r6)
        L_0x00c0:
            int r6 = r5.getOutPlayerAudioSampleHz()
            com.ss.avframework.livestreamv2.core.LiveCore$Builder r0 = r4.getBuilder()
            int r0 = r0.getAudioSampleHZ()
            if (r6 == r0) goto L_0x00d9
            com.ss.avframework.livestreamv2.core.LiveCore$Builder r6 = r4.getBuilder()
            int r6 = r6.getAudioSampleHZ()
            r5.setOutPlayerAudioSampleHz(r6)
        L_0x00d9:
            boolean r5 = r5.isClientMixStream()
            r4.mUsingClientMixer = r5
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.LiveCoreImpl.checkInteractCfg(com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig, boolean):boolean");
    }

    private AnchorController.StreamMixer configMixer(final LiveCore.InteractConfig interactConfig, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
        if (!interactConfig.isClientMixStream()) {
            return new AnchorController.StreamMixer() {
                public List<Region> mixStream(int i, int i2, int i3, List<Integer> list) {
                    int i4 = i3;
                    interactConfig.getVideoMixerDescription();
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    arrayList.add(new Region().status(0).userId((long) i4).interactId(i4).mediaType(1).position(0.0d, 0.0d).size(1.0d, 1.0d));
                    int size = list.size();
                    double d2 = (double) i2;
                    Double.isNaN(d2);
                    double d3 = (double) i;
                    Double.isNaN(d3);
                    double d4 = (((d2 * 0.30000001192092896d) / 4.0d) * 3.0d) / d3;
                    int i6 = 0;
                    while (i6 < size) {
                        Integer num = list.get(i6);
                        Region mediaType = new Region().status(i5).userId((long) num.intValue()).interactId(num.intValue()).mediaType(1);
                        double d5 = (double) i6;
                        Double.isNaN(d5);
                        arrayList.add(mediaType.position(0.0d, d5 * 0.30000001192092896d).size(d4, 0.30000001192092896d));
                        i6++;
                        i5 = 0;
                    }
                    return arrayList;
                }
            };
        }
        AnonymousClass9 r0 = new AnchorController.StreamMixer() {
            public List<Region> mixStream(int i, int i2, int i3, List<Integer> list) {
                return null;
            }
        };
        if (iInputVideoStream != null) {
            iInputVideoStream.setMixerDescription(interactConfig.getVideoMixerDescription());
        }
        if (iInputAudioStream == null) {
            return r0;
        }
        iInputAudioStream.setMixerDescription(interactConfig.getAudioMixerDescription());
        return r0;
    }

    public void onADMInfo(int i, int i2, long j) {
        if (this.mInfoListener != null) {
            switch (i) {
                case 2:
                    this.mInfoListener.onInfo(22, i2, 0);
                    return;
                case 3:
                    this.mInfoListener.onInfo(23, i2, 0);
                    return;
                case 4:
                    this.mInfoListener.onInfo(24, i2, 0);
                    break;
            }
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        return this.mLiveStream.pushVideoFrame(byteBuffer, i, i2, i3, j);
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        return this.mLiveStream.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        return this.mLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        return this.mLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
    }
}
