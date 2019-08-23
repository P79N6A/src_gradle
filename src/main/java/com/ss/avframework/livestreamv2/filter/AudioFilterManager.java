package com.ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.os.Handler;
import com.ss.avframework.livestreamv2.filter.AudioEffectProcessor;
import java.nio.Buffer;

public class AudioFilterManager extends IAudioFilterManager {
    private KaraokeAudioProcess mAudioProcess;
    private Handler mHandler;

    public String name() {
        return "VE-Karaoke";
    }

    public static IAudioFilterManager createDummy() {
        return new IAudioFilterManager() {
            public final String name() {
                return "DummyAudioEffect";
            }

            public final Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
                return buffer;
            }

            public final void setAudioEq(Object obj) {
            }

            public final void setAudioReverb(Object obj) {
            }

            public final void setBGMMusic(String str) {
            }

            public final void setBGMMusic(String str, long j) {
            }

            public final void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
            }

            public final void setBGMVolume(float f2) {
            }

            public final void setDRCEnable(boolean z) {
            }

            public final void setMusicPitch(int i) {
            }

            public final void setVoiceVolume(float f2) {
            }
        };
    }

    public void pause() {
        if (this.mAudioProcess != null) {
            this.mAudioProcess.pause();
        }
    }

    public void resume() {
        if (this.mAudioProcess != null) {
            this.mAudioProcess.resume();
        }
    }

    public void start() {
        if (this.mAudioProcess != null) {
            this.mAudioProcess.start();
        }
    }

    public void stop() {
        if (this.mAudioProcess != null) {
            this.mAudioProcess.stop();
        }
    }

    public synchronized void release() {
        if (this.mAudioProcess != null) {
            this.mAudioProcess.stop();
            this.mAudioProcess.release();
            this.mAudioProcess = null;
        }
        super.release();
    }

    public void setAudioEq(Object obj) {
        this.mAudioProcess.setAudioEq(obj);
    }

    public void setAudioReverb(Object obj) {
        this.mAudioProcess.setAudioReverb(obj);
    }

    public void setBGMMusic(String str) {
        this.mAudioProcess.setBGMMusic(str);
    }

    public void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
        this.mAudioProcess.setBGMProgressListener(callback);
    }

    public void setBGMVolume(float f2) {
        this.mAudioProcess.setBGMVolume(f2);
    }

    public void setDRCEnable(boolean z) {
        this.mAudioProcess.setDRCEnable(z);
    }

    public void setMusicPitch(int i) {
        this.mAudioProcess.setMusicPitch(i);
    }

    public void setVoiceVolume(float f2) {
        this.mAudioProcess.setVoiceVolume(f2);
    }

    public static IAudioFilterManager create(Context context, Handler handler) {
        return new AudioFilterManager(context, handler);
    }

    protected AudioFilterManager(Context context, Handler handler) {
        this.mAudioProcess = new KaraokeAudioProcess(context);
        this.mHandler = handler;
    }

    public void setBGMMusic(String str, long j) {
        this.mAudioProcess.setBGMMusic(str, j);
    }

    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mEnable) {
            return this.mAudioProcess.process(buffer, i, i2, i3, j);
        }
        return buffer;
    }
}
