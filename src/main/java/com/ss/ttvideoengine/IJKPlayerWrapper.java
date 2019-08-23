package com.ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.PlaybackParams;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;

public class IJKPlayerWrapper implements MediaPlayer {
    public static int IJK_FORMAT_ERROR = -3000;
    public static int IJK_HW_INPUT_ERROR = -2000;
    public static int IJK_LOOP_END_ERROR = -1000;
    public static int PLAYER_TYPE_IJK = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    public long mLastLoopCompletedTime = -1;
    protected MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    protected MediaPlayer.OnCompletionListener mOnCompletionListener;
    protected MediaPlayer.OnErrorListener mOnErrorListener;
    protected MediaPlayer.OnInfoListener mOnInfoListener;
    protected MediaPlayer.OnPreparedListener mOnPreparedListener;
    protected MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    protected MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private IjkMediaPlayer mPlayerImpl;
    public MediaPlayer mPlayerWrapper;

    public void deselectTrack(int i) {
    }

    public float getFloatOption(int i, float f2) {
        return 0.0f;
    }

    public long getLongOption(int i, long j) {
        return 0;
    }

    public int getSelectedTrack(int i) {
        return 0;
    }

    public String getStringOption(int i) {
        return null;
    }

    public MediaPlayer.TrackInfo[] getTrackInfo() {
        return new MediaPlayer.TrackInfo[0];
    }

    public int getVideoType() {
        return 0;
    }

    public boolean isMute() {
        return false;
    }

    public boolean isOSPlayer() {
        return false;
    }

    public void mouseEvent(int i, int i2, int i3) {
    }

    public void prevClose() {
    }

    public void releaseAsync() {
    }

    public void rotateCamera(float f2, float f3) {
    }

    public void selectTrack(int i) {
    }

    public void setCacheFile(String str, int i) {
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public int setFloatOption(int i, float f2) {
        return 0;
    }

    public void setIntOption(int i, int i2) {
    }

    public void setIsMute(boolean z) {
    }

    public long setLongOption(int i, long j) {
        return 0;
    }

    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
    }

    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
    }

    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
    }

    public void setPanoVideoControlModel(int i) {
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
    }

    public void setStringOption(int i, String str) {
    }

    public void switchStream(int i, int i2) {
    }

    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
    }

    public int getPlayerType() {
        return PLAYER_TYPE_IJK;
    }

    public int getCurrentPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91233, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91233, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayerImpl != null) {
            return (int) this.mPlayerImpl.getCurrentPosition();
        } else {
            return 0;
        }
    }

    public String getDataSource() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91242, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91242, new Class[0], String.class);
        } else if (this.mPlayerImpl != null) {
            return this.mPlayerImpl.getDataSource();
        } else {
            return null;
        }
    }

    public int getDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91236, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91236, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayerImpl != null) {
            return (int) this.mPlayerImpl.getDuration();
        } else {
            return 0;
        }
    }

    public int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91234, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91234, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayerImpl != null) {
            return this.mPlayerImpl.getVideoHeight();
        } else {
            return 0;
        }
    }

    public int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91235, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91235, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayerImpl != null) {
            return this.mPlayerImpl.getVideoWidth();
        } else {
            return 0;
        }
    }

    public boolean isLooping() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91244, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91244, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mPlayerImpl != null) {
            return this.mPlayerImpl.isLooping();
        } else {
            return false;
        }
    }

    public boolean isPlaying() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91243, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91243, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mPlayerImpl != null) {
            return this.mPlayerImpl.isPlaying();
        } else {
            return false;
        }
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91228, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.pause();
        }
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91231, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.prepareAsync();
        }
    }

    public void prepareAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91232, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.prepareAsync();
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91226, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.release();
        }
        this.mPlayerWrapper = null;
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91229, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.reset();
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91227, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.start();
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91230, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.stop();
        }
    }

    public void setFastPrepared() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91225, new Class[0], Void.TYPE);
        } else if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setOption(4, "fast_prepared", 1);
            this.mPlayerImpl.setOption(4, "start-on-prepared", 0);
            this.mPlayerImpl.setOption(4, "enable-accurate-seek", 1);
            this.mPlayerImpl.setOption(4, "framedrop", 1);
            this.mPlayerImpl.setOption(4, "async-init-decoder", 1);
            this.mPlayerImpl.setOption(4, "video-mime-type", "video/avc");
            this.mPlayerImpl.setOption(4, "mediacodec-default-name", IjkMediaPlayer.DefaultMediaCodecSelector.getCachedMediaCodec());
            this.mPlayerImpl.setOption(1, "reconnect", 1);
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91240, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91240, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setDataSource(str);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91237, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91237, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setDisplay(surfaceHolder);
        }
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (PatchProxy.isSupport(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 91251, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 91251, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE);
            return;
        }
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mPlayerImpl.setOnBufferingUpdateListener(new IMediaPlayer.OnBufferingUpdateListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91258, new Class[]{IMediaPlayer.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMediaPlayer, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91258, new Class[]{IMediaPlayer.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (IJKPlayerWrapper.this.mOnBufferingUpdateListener != null) {
                    IJKPlayerWrapper.this.mOnBufferingUpdateListener.onBufferingUpdate(IJKPlayerWrapper.this.mPlayerWrapper, i);
                }
            }
        });
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        if (PatchProxy.isSupport(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 91252, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 91252, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE);
            return;
        }
        this.mOnCompletionListener = onCompletionListener;
        this.mPlayerImpl.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onCompletion(IMediaPlayer iMediaPlayer) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer}, this, changeQuickRedirect, false, 91259, new Class[]{IMediaPlayer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMediaPlayer}, this, changeQuickRedirect, false, 91259, new Class[]{IMediaPlayer.class}, Void.TYPE);
                    return;
                }
                if (IJKPlayerWrapper.this.mOnCompletionListener != null) {
                    IJKPlayerWrapper.this.mOnCompletionListener.onCompletion(IJKPlayerWrapper.this.mPlayerWrapper);
                }
            }
        });
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (PatchProxy.isSupport(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 91253, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 91253, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE);
            return;
        }
        this.mOnErrorListener = onErrorListener;
        this.mPlayerImpl.setOnErrorListener(new IMediaPlayer.OnErrorListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91260, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91260, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                }
                if (IJKPlayerWrapper.this.mOnErrorListener != null) {
                    int i3 = i;
                    int i4 = i2;
                    IJKPlayerWrapper.this.mOnErrorListener.onError(IJKPlayerWrapper.this.mPlayerWrapper, i, i2);
                }
                return true;
            }
        });
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 91254, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 91254, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE);
            return;
        }
        this.mOnInfoListener = onInfoListener;
        this.mPlayerImpl.setOnInfoListener(new IMediaPlayer.OnInfoListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                int i3 = i;
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91261, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91261, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                }
                if (i3 == 3) {
                    if (IJKPlayerWrapper.this.mOnInfoListener != null) {
                        IJKPlayerWrapper.this.mOnInfoListener.onInfo(IJKPlayerWrapper.this.mPlayerWrapper, 3, 0);
                    }
                } else if (i3 == 701) {
                    if (IJKPlayerWrapper.this.mOnInfoListener != null) {
                        IJKPlayerWrapper.this.mOnInfoListener.onInfo(IJKPlayerWrapper.this.mPlayerWrapper, 701, 0);
                    }
                } else if (i3 == 702) {
                    if (IJKPlayerWrapper.this.mOnInfoListener != null) {
                        IJKPlayerWrapper.this.mOnInfoListener.onInfo(IJKPlayerWrapper.this.mPlayerWrapper, 702, 0);
                    }
                } else if (i3 == 222) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - IJKPlayerWrapper.this.mLastLoopCompletedTime;
                    IJKPlayerWrapper.this.mLastLoopCompletedTime = elapsedRealtime;
                    if (IJKPlayerWrapper.this.getDuration() == 0) {
                        if (IJKPlayerWrapper.this.mOnErrorListener != null) {
                            IJKPlayerWrapper.this.mOnErrorListener.onError(IJKPlayerWrapper.this.mPlayerWrapper, -10000, IJKPlayerWrapper.IJK_FORMAT_ERROR);
                        }
                    } else if (j < 1000) {
                        if (IJKPlayerWrapper.this.mOnErrorListener != null) {
                            IJKPlayerWrapper.this.mOnErrorListener.onError(IJKPlayerWrapper.this.mPlayerWrapper, -10000, -1000);
                        }
                    } else if (IJKPlayerWrapper.this.mOnCompletionListener != null) {
                        IJKPlayerWrapper.this.mOnCompletionListener.onCompletion(IJKPlayerWrapper.this.mPlayerWrapper);
                    }
                }
                return false;
            }
        });
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (PatchProxy.isSupport(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 91255, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 91255, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE);
            return;
        }
        this.mOnPreparedListener = onPreparedListener;
        this.mPlayerImpl.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer}, this, changeQuickRedirect, false, 91262, new Class[]{IMediaPlayer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMediaPlayer}, this, changeQuickRedirect, false, 91262, new Class[]{IMediaPlayer.class}, Void.TYPE);
                    return;
                }
                IJKPlayerWrapper.this.mOnPreparedListener.onPrepared(IJKPlayerWrapper.this.mPlayerWrapper);
            }
        });
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (PatchProxy.isSupport(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 91256, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 91256, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE);
            return;
        }
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mPlayerImpl.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer}, this, changeQuickRedirect, false, 91263, new Class[]{IMediaPlayer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMediaPlayer}, this, changeQuickRedirect, false, 91263, new Class[]{IMediaPlayer.class}, Void.TYPE);
                    return;
                }
                IJKPlayerWrapper.this.mOnSeekCompleteListener.onSeekComplete(IJKPlayerWrapper.this.mPlayerWrapper);
            }
        });
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (PatchProxy.isSupport(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 91257, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 91257, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE);
            return;
        }
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
        this.mPlayerImpl.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 91264, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 91264, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                IJKPlayerWrapper.this.mOnVideoSizeChangedListener.onVideoSizeChanged(IJKPlayerWrapper.this.mPlayerWrapper, i, i2);
            }
        });
    }

    public static MediaPlayer create(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 91224, new Class[]{Context.class}, MediaPlayer.class)) {
            return (MediaPlayer) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 91224, new Class[]{Context.class}, MediaPlayer.class);
        }
        IJKPlayerWrapper iJKPlayerWrapper = new IJKPlayerWrapper();
        synchronized (IJKPlayerWrapper.class) {
            try {
                IjkMediaPlayer.loadLibrariesOnce(null);
                IjkMediaPlayer.native_profileBegin("libijkplayer.so");
                iJKPlayerWrapper.mPlayerImpl = new IjkMediaPlayer();
                iJKPlayerWrapper.setFastPrepared();
                IjkMediaPlayer.native_setLogLevel(6);
                iJKPlayerWrapper.mPlayerWrapper = iJKPlayerWrapper;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iJKPlayerWrapper;
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91247, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91247, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.seekTo((long) i);
        }
    }

    public void setLooping(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91245, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91245, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setLooping(z);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91248, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91248, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setScreenOnWhilePlaying(z);
        }
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 91238, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 91238, new Class[]{Surface.class}, Void.TYPE);
        } else if ((surface == null || surface.isValid()) && this.mPlayerImpl != null) {
            this.mPlayerImpl.setSurface(surface);
        }
    }

    public int getIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91250, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91250, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (62 == i) {
            IjkTrackInfo[] trackInfo = this.mPlayerImpl.getTrackInfo();
            if (trackInfo != null) {
                for (IjkTrackInfo trackType : trackInfo) {
                    if (trackType.getTrackType() == 1) {
                        return 1;
                    }
                }
            }
        }
        return i2;
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{context, uri}, this, changeQuickRedirect, false, 91241, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, uri}, this, changeQuickRedirect, false, 91241, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setDataSource(context, uri);
        }
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91246, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91246, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setVolume(f2, f3);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91249, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91249, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setWakeMode(context, i);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        Context context2 = context;
        Uri uri2 = uri;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 91239, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 91239, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE);
            return;
        }
        if (this.mPlayerImpl != null) {
            this.mPlayerImpl.setDataSource(context2, uri2, map2);
        }
    }
}
