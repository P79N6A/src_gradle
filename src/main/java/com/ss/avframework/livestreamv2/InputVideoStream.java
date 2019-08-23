package com.ss.avframework.livestreamv2;

import android.os.Handler;
import com.ss.avframework.capture.video.ExternalVideoCapturer;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.VideoTrack;
import com.ss.avframework.mixer.VideoMixer;
import java.nio.ByteBuffer;

public class InputVideoStream implements VideoCapturer.VideoCapturerObserver, IInputVideoStream {
    private ExternalVideoCapturer mExternalVideoCapturer;
    private int mFps;
    private Handler mHandler;
    private int mHeight;
    private Observer mObserver;
    private VideoMixer.VideoMixerDescription mVideoMixerDescription = new VideoMixer.VideoMixerDescription();
    private VideoTrack mVideoTrack;
    private int mWidth;

    public interface Observer {
        void onMixerDescriptionChange(InputVideoStream inputVideoStream, VideoMixer.VideoMixerDescription videoMixerDescription);

        void releaseInputStream(InputVideoStream inputVideoStream);
    }

    public void onVideoCapturerError(int i, Exception exc) {
    }

    public void onVideoCapturerStarted() {
    }

    public void onVideoCapturerStoped() {
    }

    public int fps() {
        return this.mFps;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public VideoMixer.VideoMixerDescription getMixerDescription() {
        return this.mVideoMixerDescription;
    }

    public VideoTrack getVideoTrack() {
        return this.mVideoTrack;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public String name() {
        if (this.mVideoTrack != null) {
            return this.mVideoTrack.id();
        }
        return "";
    }

    public int stop() {
        if (this.mExternalVideoCapturer != null) {
            this.mExternalVideoCapturer.stop();
        }
        return 0;
    }

    public int start() {
        if (this.mExternalVideoCapturer != null) {
            this.mExternalVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
        }
        return 0;
    }

    public synchronized void release() {
        if (this.mObserver != null) {
            this.mObserver.releaseInputStream(this);
        }
        if (this.mExternalVideoCapturer != null) {
            this.mExternalVideoCapturer.release();
            this.mExternalVideoCapturer = null;
        }
        if (this.mVideoTrack != null) {
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
    }

    public void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (videoMixerDescription != null) {
            this.mVideoMixerDescription.copy(videoMixerDescription);
            if (this.mObserver != null) {
                this.mObserver.onMixerDescriptionChange(this, videoMixerDescription);
            }
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (this.mExternalVideoCapturer != null) {
            return this.mExternalVideoCapturer.pushVideoFrame(byteBuffer, i, i2, i3, j);
        }
        return -1;
    }

    public InputVideoStream(MediaEngineFactory mediaEngineFactory, Handler handler, Observer observer, int i, int i2, int i3) {
        this.mExternalVideoCapturer = new ExternalVideoCapturer(this, handler);
        this.mVideoTrack = mediaEngineFactory.createVideoTrack(this.mExternalVideoCapturer);
        this.mObserver = observer;
        this.mFps = i3;
        this.mWidth = i;
        this.mHeight = i2;
        this.mHandler = handler;
        this.mExternalVideoCapturer.adaptOutputFormat(this.mWidth, this.mHeight, i3);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        if (this.mExternalVideoCapturer != null) {
            return this.mExternalVideoCapturer.pushVideoFrame(i, z, i2, i3, i4, fArr, j, null);
        }
        return -1;
    }
}
