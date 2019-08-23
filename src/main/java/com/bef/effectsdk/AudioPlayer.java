package com.bef.effectsdk;

import android.media.MediaPlayer;
import android.support.annotation.Keep;

@Keep
public class AudioPlayer {
    public static final String TAG = "AudioPlayer";
    private String mFilename;
    public boolean mIsPrepared;
    public MediaPlayer mMediaPlayer;
    public long mNativePtr;

    @Keep
    public native void nativeOnCompletion(long j);

    @Keep
    public native void nativeOnError(long j, int i, int i2);

    @Keep
    public native void nativeOnInfo(long j, int i, int i2);

    @Keep
    public native void nativeOnPrepared(long j);

    @Keep
    public float getCurrentPlayTime() {
        if (this.mMediaPlayer == null) {
            return 0.0f;
        }
        return ((float) this.mMediaPlayer.getCurrentPosition()) / 1000.0f;
    }

    @Keep
    public float getTotalPlayTime() {
        if (this.mMediaPlayer == null) {
            return 0.0f;
        }
        return ((float) this.mMediaPlayer.getDuration()) / 1000.0f;
    }

    @Keep
    public boolean isPlaying() {
        boolean z;
        if (this.mMediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        try {
            z = this.mMediaPlayer.isPlaying();
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    @Keep
    public boolean pause() {
        if (this.mMediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        this.mMediaPlayer.pause();
        return true;
    }

    @Keep
    public int release() {
        if (this.mMediaPlayer != null) {
            try {
                this.mMediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception unused) {
            }
            this.mMediaPlayer = null;
        }
        return 0;
    }

    @Keep
    public boolean resume() {
        if (this.mMediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        this.mMediaPlayer.start();
        return true;
    }

    @Keep
    public void startPlay() {
        if (this.mMediaPlayer != null) {
            try {
                if (!this.mIsPrepared) {
                    this.mMediaPlayer.prepare();
                    this.mIsPrepared = true;
                }
                this.mMediaPlayer.start();
            } catch (Exception unused) {
            }
        }
    }

    @Keep
    public void stopPlay() {
        if (this.mMediaPlayer != null && this.mIsPrepared) {
            try {
                this.mMediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception unused) {
            }
            this.mMediaPlayer = null;
            this.mIsPrepared = false;
        }
    }

    @Keep
    public int init() {
        this.mIsPrepared = false;
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.stop();
            this.mMediaPlayer.release();
        }
        this.mMediaPlayer = new MediaPlayer();
        this.mMediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                AudioPlayer.this.nativeOnInfo(AudioPlayer.this.mNativePtr, i, i2);
                return false;
            }
        });
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                try {
                    AudioPlayer.this.mMediaPlayer.stop();
                    AudioPlayer.this.mMediaPlayer.release();
                } catch (Exception unused) {
                }
                AudioPlayer.this.mMediaPlayer = null;
                AudioPlayer.this.nativeOnError(AudioPlayer.this.mNativePtr, i, i2);
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                AudioPlayer.this.mIsPrepared = true;
                AudioPlayer.this.nativeOnPrepared(AudioPlayer.this.mNativePtr);
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                AudioPlayer.this.nativeOnCompletion(AudioPlayer.this.mNativePtr);
            }
        });
        return 0;
    }

    @Keep
    public void setNativePtr(long j) {
        this.mNativePtr = j;
    }

    @Keep
    public boolean setLoop(boolean z) {
        if (this.mMediaPlayer == null) {
            return false;
        }
        this.mMediaPlayer.setLooping(z);
        return true;
    }

    @Keep
    public boolean seek(int i) {
        if (this.mMediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        try {
            this.mMediaPlayer.seekTo(i);
        } catch (Exception unused) {
        }
        return true;
    }

    @Keep
    public boolean setVolume(float f2) {
        if (this.mMediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        this.mMediaPlayer.setVolume(f2, f2);
        return true;
    }

    @Keep
    public void setDataSource(String str) {
        if (this.mMediaPlayer == null) {
            init();
        }
        if (!str.equals(this.mFilename) || !this.mIsPrepared || !this.mMediaPlayer.isPlaying()) {
            try {
                this.mMediaPlayer.reset();
                this.mMediaPlayer.setDataSource(str);
            } catch (Exception unused) {
            }
            this.mFilename = str;
        }
    }
}
