package com.ss.avframework.livestreamv2;

import android.content.Intent;
import android.os.Bundle;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.ss.optimizer.live.sdk.dns.d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.jetbrains.annotations.Nullable;

public interface ILiveStream {

    public interface IAudioFrameAvailableListener {
        void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j);
    }

    public interface ILiveStreamDataListener {
        void onData(int i, int i2, int i3);
    }

    public interface ILiveStreamErrorListener {
        void onError(int i, int i2, Exception exc);
    }

    public interface ILiveStreamInfoListener {
        void onInfo(int i, int i2, int i3);
    }

    public interface ITextureFrameAvailableListener {
        void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr);
    }

    boolean audioMute();

    IInputAudioStream createInputAudioStream();

    IInputVideoStream createInputVideoStream();

    void enableMirror(boolean z, boolean z2);

    void enableMixer(boolean z, boolean z2);

    IAudioFilterManager getAudioFilterMgr();

    IFilterManager getFilterMgr();

    boolean getLiveStreamInfo(LiveStreamReport liveStreamReport);

    LiveStreamOption getOption();

    IInputAudioStream getOriginInputAudioStream();

    IInputVideoStream getOriginInputVideoStream();

    IRecorderManager getRecorderMgr();

    String getVersion();

    IVideoCapturerControl getVideoCapturerControl();

    IFilterManager getVideoFilterMgr();

    boolean isEnableMixer(boolean z);

    boolean isMirror(boolean z);

    void pause();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle);

    int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void release();

    void resume();

    void sendSeiMsg(String str);

    void setAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void setAudioMute(boolean z);

    void setBackGroundPhotoPath(Object obj);

    void setDataListener(ILiveStreamDataListener iLiveStreamDataListener);

    void setDns(d dVar);

    void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener);

    void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener);

    void setOption(LiveStreamOption liveStreamOption);

    void setRenderSink(@Nullable VideoSink videoSink);

    void setScreenIntent(Intent intent);

    void setTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void setTimeInterval(int i);

    void start(String str);

    void start(List<String> list);

    void startAudioCapture();

    void startCaptureSource();

    void startVideoCapture();

    void stop();

    void stopAudioCapture();

    void stopCaptureSource();

    void stopVideoCapture();

    void switchAudioCapture(int i);

    void switchVideoCapture(int i);
}
