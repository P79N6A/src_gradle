package com.ss.avframework.livestreamv2.core;

import android.graphics.Matrix;
import android.view.SurfaceView;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.IInputVideoStream;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.callback.DataCallback;
import com.ss.avframework.livestreamv2.interact.callback.QualityCallback;
import com.ss.avframework.livestreamv2.interact.callback.StateCallback;
import com.ss.avframework.livestreamv2.interact.callback.UserCallback;
import com.ss.avframework.livestreamv2.interact.controller.AnchorController;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public abstract class Client implements DataCallback, QualityCallback, StateCallback, UserCallback {
    private static String TAG = "com.ss.avframework.livestreamv2.core.Client";
    protected AudioClientFactory mAudioClientFactory;
    protected LiveCore.InteractConfig mConfig;
    private Listener mListener = new Listener() {
        public void onError(Client client, int i, long j, Exception exc) {
        }

        public void onInfo(Client client, int i, long j, Object... objArr) {
        }
    };
    private IInputAudioStream mOutAudioStream;
    private IInputVideoStream mOutVideoStream;
    protected AnchorController.StreamMixer mStreamMixer;
    protected VideoClientFactory mVideoClientFactory;

    public interface Listener {
        void onError(Client client, int i, long j, Exception exc);

        void onInfo(Client client, int i, long j, Object... objArr);
    }

    public abstract boolean isGuest();

    public void onLogMonitor(String str, JSONObject jSONObject) {
    }

    public final LiveCore.InteractConfig getConfig() {
        return this.mConfig;
    }

    public void onEndSuccess() {
        this.mListener.onInfo(this, 5, 0, new Object[0]);
    }

    public void onStartSuccess() {
        this.mListener.onInfo(this, 4, 0, new Object[0]);
    }

    public void start() {
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.start();
        }
        if (this.mOutAudioStream != null) {
            this.mOutAudioStream.start();
        }
    }

    public synchronized void stop() {
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.stop();
        }
        if (this.mOutAudioStream != null) {
            this.mOutAudioStream.stop();
        }
    }

    static {
        String[] strArr = {"agora-crypto", "agora-rtc-sdk-jni", "zegoliveroom", "bytertc"};
        for (int i = 0; i < 4; i++) {
            try {
                System.loadLibrary(strArr[i]);
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void dispose() {
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.release();
        }
        if (this.mOutAudioStream != null) {
            this.mOutAudioStream.release();
        }
        this.mOutVideoStream = null;
        this.mOutAudioStream = null;
        String str = TAG;
        AVLog.d(str, "~Dtor interact client " + this);
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void onError(String str) {
        this.mListener.onError(this, 14, 0, new Exception(str));
    }

    public void onFirstRemoteAudioFrame(int i) {
        this.mListener.onInfo(this, 10, (long) i, new Object[0]);
    }

    public void onStreamDelay(int i) {
        this.mListener.onInfo(this, 1, (long) i, new Object[0]);
    }

    public void onUserJoined(int i) {
        this.mListener.onInfo(this, 7, (long) i, new Object[0]);
    }

    public void onUserLeaved(int i) {
        this.mListener.onInfo(this, 8, (long) i, new Object[0]);
    }

    public void onWarn(String str) {
        this.mListener.onInfo(this, 6, 0, str);
    }

    public void onEndFailed(int i, String str) {
        this.mListener.onError(this, 13, (long) i, new Exception(str));
    }

    public void onFirstRemoteVideoFrame(int i, SurfaceView surfaceView) {
        this.mListener.onInfo(this, 11, (long) i, surfaceView);
    }

    public void onStartFailed(int i, String str) {
        this.mListener.onError(this, 12, (long) i, new Exception(str));
    }

    public void onPushStreamQuality(long j, long j2) {
        this.mListener.onInfo(this, 2, j, Long.valueOf(j2));
    }

    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        this.mListener.onInfo(this, 9, 0, strArr, zArr);
    }

    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        byteBuffer.position(0);
        if (this.mOutAudioStream != null) {
            this.mOutAudioStream.pushAudioFrame(byteBuffer, i2, i3, 16, i * i3, j * 1000);
        }
    }

    public Client(LiveCore.InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
        String str = TAG;
        AVLog.d(str, "Ctor interact client " + this);
        this.mConfig = interactConfig;
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mOutAudioStream = iInputAudioStream;
        this.mOutVideoStream = iInputVideoStream;
    }

    public void onReceiveVideoBufferFrame(int i, ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, long j) {
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.pushVideoFrame(byteBuffer, i2, i3, 0, j * 1000);
        }
    }

    public void onReceiveTextureFrame(int i, int i2, Config.VideoOutputFormat videoOutputFormat, int i3, int i4, int i5, long j, float[] fArr) {
        if (this.mOutVideoStream != null) {
            Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
            convertMatrixToAndroidGraphicsMatrix.preTranslate(0.5f, 0.5f);
            convertMatrixToAndroidGraphicsMatrix.preRotate((float) (i5 + 180));
            convertMatrixToAndroidGraphicsMatrix.preScale(-1.0f, 1.0f);
            convertMatrixToAndroidGraphicsMatrix.preTranslate(-0.5f, -0.5f);
            this.mOutVideoStream.pushVideoFrame(i2, false, i3, i4, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix), j * 1000);
        }
    }
}
