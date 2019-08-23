package com.ss.avframework.livestreamv2.capture;

import android.os.Handler;
import android.os.HandlerThread;
import com.ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.capture.audio.AudioCapturerAudioRecord;
import com.ss.avframework.capture.audio.AudioCapturerOpensles;
import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.engine.AudioTrack;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class LiveStreamAudioCapture extends AudioCapturer implements AudioCapturer.AudioCaptureObserver {
    public AudioCapturer mAudioCapturer;
    public AudioSink mAudioSink;
    private AudioTrack mAudioTrack;
    public boolean mBackgroundMode;
    private final int mBitwidth;
    public final int mChannle;
    public Handler mHandler;
    private int mLastSource;
    public long mLastTimestampUs;
    private MediaEngineFactory mMediaEngineFactory;
    public ByteBuffer mMute10MsAudioFrame;
    public AudioCapturer.AudioCaptureObserver mObserver;
    public Runnable mPeriodMuteAudioFrameRunable;
    public final int mSample;
    public int mSource;
    private int mStatus;
    public HandlerThread mThread;

    class WrapperAudioCaptureExtern extends AudioCapturerExternal {
        private int mStatus;

        public int status() {
            return this.mStatus;
        }

        public void start() {
            super.start();
            this.mStatus = 1;
        }

        public synchronized void stop() {
            super.stop();
            this.mStatus = 2;
        }

        /* access modifiers changed from: protected */
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            LiveStreamAudioCapture.this.onData(buffer, i, i2, i3, j);
        }

        public WrapperAudioCaptureExtern(int i, int i2, int i3, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
            super(i, i2, i3, handler, audioCaptureObserver);
        }
    }

    public int status() {
        return this.mStatus;
    }

    public synchronized void stop() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                LiveStreamAudioCapture.this.onReleaseCapture();
                LiveStreamAudioCapture.this.onSetStatus(2);
            }
        });
    }

    public void toBackground() {
        this.mHandler.post(new Runnable() {
            public void run() {
                LiveStreamAudioCapture.this.onPause();
            }
        });
    }

    public void toFront() {
        this.mHandler.post(new Runnable() {
            public void run() {
                LiveStreamAudioCapture.this.onResume();
            }
        });
    }

    public int updateChannel() {
        if (this.mAudioCapturer != null) {
            return this.mAudioCapturer.updateChannel();
        }
        return this.mChannle;
    }

    public void onResume() {
        if (!this.mBackgroundMode) {
            new Exception("non background mode, ignore!");
            return;
        }
        this.mBackgroundMode = false;
        this.mHandler.removeCallbacks(this.mPeriodMuteAudioFrameRunable);
        onSwitchSource(this.mLastSource);
    }

    public synchronized void release() {
        stop();
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (LiveStreamAudioCapture.this.mAudioSink != null) {
                    LiveStreamAudioCapture.this.mAudioSink.release();
                    LiveStreamAudioCapture.this.mAudioSink = null;
                }
                if (LiveStreamAudioCapture.this.mThread != null) {
                    LiveStreamAudioCapture.this.mThread.quit();
                }
            }
        });
        this.mThread = null;
        super.release();
    }

    public void start() {
        final Exception[] excArr = new Exception[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (LiveStreamAudioCapture.this.status() != 1) {
                    if (LiveStreamAudioCapture.this.mAudioCapturer != null) {
                        LiveStreamAudioCapture.this.mObserver.onAudioCaptureError(-1, new Exception("on live audio capture status exception call."));
                        return;
                    }
                    try {
                        LiveStreamAudioCapture.this.onCreateAndStart(LiveStreamAudioCapture.this.mSource);
                    } catch (Exception e2) {
                        excArr[0] = e2;
                    }
                }
            }
        });
        if (excArr[0] != null) {
            throw new IllegalStateException(excArr[0].getCause());
        }
    }

    public void onReleaseCapture() {
        if (this.mAudioCapturer != null) {
            this.mAudioCapturer.setCalculatePcmPowerEventObserver(null);
            this.mAudioCapturer.pause();
            this.mAudioCapturer.stop();
            this.mAudioCapturer.release();
            this.mAudioCapturer = null;
        }
        if (this.mAudioTrack != null) {
            this.mAudioTrack.removeAudioSink(this.mAudioSink);
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
    }

    public void onPause() {
        if (!(this.mAudioCapturer instanceof AudioCapturerExternal)) {
            this.mBackgroundMode = true;
            this.mLastSource = this.mSource;
            onSwitchSource(4);
            if (this.mMute10MsAudioFrame == null) {
                int i = (this.mSample / 100) * this.mChannle * (this.mBitwidth / 8);
                this.mMute10MsAudioFrame = ByteBuffer.allocateDirect(i);
                for (int i2 = 0; i2 < i; i2++) {
                    this.mMute10MsAudioFrame.put(i2, (byte) 0);
                }
            }
            if (this.mPeriodMuteAudioFrameRunable == null) {
                this.mPeriodMuteAudioFrameRunable = new Runnable() {
                    public void run() {
                        LiveStreamAudioCapture.this.mLastTimestampUs += 10000;
                        LiveStreamAudioCapture.this.onData((Buffer) LiveStreamAudioCapture.this.mMute10MsAudioFrame, LiveStreamAudioCapture.this.mSample / 100, LiveStreamAudioCapture.this.mSample, LiveStreamAudioCapture.this.mChannle, LiveStreamAudioCapture.this.mLastTimestampUs);
                        if (LiveStreamAudioCapture.this.mBackgroundMode) {
                            LiveStreamAudioCapture.this.mHandler.postDelayed(LiveStreamAudioCapture.this.mPeriodMuteAudioFrameRunable, 10);
                        }
                    }
                };
            }
            this.mHandler.postDelayed(this.mPeriodMuteAudioFrameRunable, 10);
        }
    }

    public void onSetStatus(int i) {
        this.mStatus = i;
    }

    public void switchSource(final int i) {
        this.mHandler.post(new Runnable() {
            public void run() {
                LiveStreamAudioCapture.this.onSwitchSource(i);
            }
        });
    }

    private void onCreateCapture(int i) {
        onReleaseCapture();
        if (i == 2) {
            this.mAudioCapturer = new AudioCapturerOpensles(this.mSample, this.mChannle, this.mBitwidth, this);
        } else if (i == 1) {
            this.mAudioCapturer = new AudioCapturerAudioRecord(this.mSample, this.mChannle, this.mBitwidth, this);
        } else {
            WrapperAudioCaptureExtern wrapperAudioCaptureExtern = new WrapperAudioCaptureExtern(this.mSample, this.mChannle, this.mBitwidth, this.mHandler, this);
            this.mAudioCapturer = wrapperAudioCaptureExtern;
        }
        this.mSource = i;
    }

    public void onSwitchSource(int i) {
        if (status() != 1) {
            this.mObserver.onAudioCaptureError(-1, new Exception("on live audio capture status exception call."));
        } else if (this.mSource != i) {
            onReleaseCapture();
            try {
                onCreateAndStart(i);
            } catch (Exception e2) {
                this.mObserver.onAudioCaptureError(-1, e2);
                onSetStatus(2);
            }
            onSetStatus(1);
        }
    }

    public void onCreateAndStart(int i) throws Exception {
        onCreateCapture(i);
        if (this.mAudioTrack == null) {
            this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(this.mAudioCapturer);
        }
        if (this.mAudioSink == null) {
            this.mAudioSink = new AudioSink() {
                public void onNoData() {
                }

                public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
                    LiveStreamAudioCapture.this.onData(wrapperNativeAudioBuffer, wrapperNativeAudioBuffer.mSamplesPerChannel, wrapperNativeAudioBuffer.mSampleRateHz, wrapperNativeAudioBuffer.mChannel, wrapperNativeAudioBuffer.timestampUs);
                }

                public void onData(Buffer buffer, int i, int i2, int i3, long j) {
                    LiveStreamAudioCapture.this.onData(buffer, i, i2, i3, j * 1000);
                }
            };
        }
        this.mAudioTrack.addAudioSink(this.mAudioSink);
        this.mAudioCapturer.start();
        this.mAudioCapturer.resume();
        this.mAudioCapturer.mute(false);
        if (this.mAudioCapturer.status() == 1) {
            onSetStatus(this.mAudioCapturer.status());
            return;
        }
        throw new Exception("Audio capture status exception");
    }

    public void onAudioCaptureError(int i, Exception exc) {
        onSetStatus(2);
    }

    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        nativeOnData(wrapperNativeAudioBuffer, i, i2, i3, j);
        this.mLastTimestampUs = j;
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        nativeOnData(buffer, i, i2, i3, j);
        this.mLastTimestampUs = j;
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mAudioCapturer != null && (this.mAudioCapturer instanceof WrapperAudioCaptureExtern)) {
            ((WrapperAudioCaptureExtern) this.mAudioCapturer).onData(byteBuffer, i4, i, i2, j);
        }
        return 0;
    }

    public LiveStreamAudioCapture(int i, int i2, int i3, int i4, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver, MediaEngineFactory mediaEngineFactory) {
        this.mSample = i2;
        this.mChannle = i3;
        this.mBitwidth = i4;
        this.mHandler = handler;
        this.mSource = i;
        this.mObserver = audioCaptureObserver;
        this.mMediaEngineFactory = mediaEngineFactory;
        if (this.mHandler == null) {
            this.mThread = new HandlerThread("LiveStreamAudioCapture");
            this.mThread.start();
            this.mHandler = new Handler(this.mThread.getLooper());
        }
    }
}
