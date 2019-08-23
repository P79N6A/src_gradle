package com.ss.android.excitingvideo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.excitingvideo.utils.WeakHandler;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.VideoInfoListener;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;

public class VideoController implements WeakHandler.IHandler, IVideoController, IVideoViewCallback, VideoEngineListener, VideoInfoListener {
    private boolean isSurfaceValid;
    private AudioManager.OnAudioFocusChangeListener mAudioFocusListener = new AudioManager.OnAudioFocusChangeListener() {
        public void onAudioFocusChange(int i) {
            if ((i == -2 || i == -1) && VideoController.this.isVideoPlaying()) {
                if (VideoController.this.mVideoEngine != null) {
                    VideoController.this.mVideoEngine.pauseByInterruption();
                    VideoController.this.resumeOtherMusicPlayer();
                }
                VideoController.this.pause();
            }
        }
    };
    private AudioManager mAudioManager;
    protected Context mContext;
    private boolean mExecutingActions;
    protected WeakHandler mHandler = new WeakHandler(this);
    private int mLastProgess;
    private long mLastProgessUpdateTime;
    private ArrayList<Runnable> mPendingActions = new ArrayList<>();
    protected long mPendingSeekToPosition = -1;
    protected TTVideoEngine mVideoEngine;
    private VideoStatusListener mVideoStatusListener;
    protected IVideoView mVideoView;

    public boolean isVideoRelease() {
        return false;
    }

    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    public boolean onFetchedVideoInfo(VideoModel videoModel) {
        return false;
    }

    public void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    public void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    public void onVideoStatusException(int i) {
    }

    public int getCurrentPosition() {
        if (this.mVideoEngine != null) {
            return this.mVideoEngine.getCurrentPlaybackTime() / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        return 0;
    }

    public int getDuration() {
        if (this.mVideoEngine != null) {
            return this.mVideoEngine.getDuration() / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        return 0;
    }

    public void resume() {
        if (this.mVideoEngine != null && isVideoPause()) {
            this.mVideoEngine.play();
        }
    }

    private void pauseOtherMusicPlayer() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) this.mContext.getSystemService("audio");
        }
        try {
            this.mAudioManager.requestAudioFocus(this.mAudioFocusListener, 3, 1);
        } catch (Throwable unused) {
        }
    }

    public boolean isVideoComplete() {
        if (this.mVideoEngine == null || this.mVideoEngine.getPlaybackState() != 0) {
            return false;
        }
        return true;
    }

    public boolean isVideoPause() {
        if (this.mVideoEngine == null || this.mVideoEngine.getPlaybackState() != 2) {
            return false;
        }
        return true;
    }

    public boolean isVideoPlaying() {
        if (this.mVideoEngine == null || this.mVideoEngine.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    public void pause() {
        if (this.mVideoEngine != null && isVideoPlaying()) {
            this.mVideoEngine.pause();
            this.mHandler.removeMessages(BaseLoginOrRegisterActivity.o);
            resumeOtherMusicPlayer();
        }
    }

    public void release() {
        if (this.mVideoView != null) {
            this.mVideoView.releaseSurface(false);
        }
        if (this.mVideoEngine != null) {
            this.mVideoEngine.release();
            this.mVideoEngine = null;
        }
    }

    public void resumeOtherMusicPlayer() {
        if (this.mAudioManager != null && this.mAudioFocusListener != null) {
            this.mAudioManager.abandonAudioFocus(this.mAudioFocusListener);
            this.mAudioManager = null;
        }
    }

    private void execPendingActions() {
        if (!this.mExecutingActions && !this.mPendingActions.isEmpty()) {
            this.mExecutingActions = true;
            Iterator it2 = new ArrayList(this.mPendingActions).iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            this.mPendingActions.clear();
            this.mExecutingActions = false;
        }
    }

    /* access modifiers changed from: protected */
    public void createVideoEngine() {
        if (this.mVideoEngine != null) {
            this.mVideoEngine.release();
        }
        this.mVideoEngine = new TTVideoEngine(this.mContext, 0);
        this.mVideoEngine.setListener(this);
        this.mVideoEngine.setVideoInfoListener(this);
        this.mVideoEngine.configResolution(Resolution.SuperHigh);
    }

    public void setVideoStatusListener(VideoStatusListener videoStatusListener) {
        this.mVideoStatusListener = videoStatusListener;
    }

    public void onCompletion(TTVideoEngine tTVideoEngine) {
        if (this.mVideoStatusListener != null) {
            this.mVideoStatusListener.onComplete();
        }
    }

    public void onError(Error error) {
        if (this.mVideoStatusListener != null) {
            this.mVideoStatusListener.onError(error.code, error.description);
        }
    }

    public void setMute(boolean z) {
        if (this.mVideoEngine != null) {
            this.mVideoEngine.setIsMute(z);
        }
    }

    public void execAction(Runnable runnable) {
        if (runnable != null) {
            if (this.isSurfaceValid) {
                runnable.run();
            } else {
                this.mPendingActions.add(runnable);
            }
        }
    }

    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        if (this.mVideoView != null) {
            this.mVideoView.dismissLoading();
        }
        if (this.mVideoStatusListener != null) {
            this.mVideoStatusListener.onPlay();
        }
    }

    public VideoController(IVideoView iVideoView) {
        if (iVideoView != null) {
            this.mVideoView = iVideoView;
            this.mVideoView.setVideoViewCallback(this);
            this.mContext = this.mVideoView.getApplicationContext();
            TTVideoEngineLog.turnOn(1, 1);
            return;
        }
        throw new IllegalArgumentException("IVideoView 不能为空");
    }

    public void playVideo(boolean z) {
        try {
            this.mVideoEngine.setIsMute(true);
            if (z) {
                this.mVideoEngine.setIntOption(4, 1);
            } else {
                this.mVideoEngine.setIntOption(4, 0);
            }
            this.mVideoEngine.setLooping(false);
            this.mVideoEngine.play();
        } catch (Exception unused) {
        }
    }

    public void handleMsg(Message message) {
        boolean z;
        if (message.what == 101) {
            if (this.mVideoEngine != null) {
                if (message.obj == null || !((Boolean) message.obj).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                int currentPlaybackTime = this.mVideoEngine.getCurrentPlaybackTime();
                int duration = this.mVideoEngine.getDuration();
                if (duration > 0 && (!z || currentPlaybackTime < 500)) {
                    onProgressAndTimeUpdate(currentPlaybackTime, duration);
                }
                if (isVideoPlaying()) {
                    if (this.mLastProgessUpdateTime == 0) {
                        this.mLastProgessUpdateTime = System.currentTimeMillis();
                        this.mLastProgess = currentPlaybackTime;
                    } else if (System.currentTimeMillis() - this.mLastProgessUpdateTime >= 5000) {
                        this.mLastProgess = currentPlaybackTime;
                        this.mLastProgessUpdateTime = System.currentTimeMillis();
                    }
                }
            }
            if (isVideoPlaying()) {
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(BaseLoginOrRegisterActivity.o), 500);
            }
        }
    }

    private void onProgressAndTimeUpdate(int i, int i2) {
        if (this.mVideoStatusListener != null) {
            this.mVideoStatusListener.onPlayProgress(i / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, i2 / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }

    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i == 2) {
            this.mVideoView.showLoading();
            return;
        }
        if (i == 1) {
            this.mVideoView.dismissLoading();
        }
    }

    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i != 3) {
            switch (i) {
                case 0:
                    this.mPendingActions.clear();
                    break;
                case 1:
                    if (this.mHandler != null) {
                        this.mHandler.sendEmptyMessage(BaseLoginOrRegisterActivity.o);
                        return;
                    }
                    break;
            }
        }
    }

    public void play(String str, final boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mVideoView != null) {
                this.mVideoView.showLoading();
            }
            createVideoEngine();
            this.mVideoEngine.setVideoID(str);
            this.mVideoEngine.setDataSource(new DefaultDataSource(str));
            this.mVideoEngine.setStartTime(0);
            Surface surface = this.mVideoView.getSurface();
            if (surface == null || !surface.isValid()) {
                this.mVideoView.setSurfaceViewVisibility(8);
                this.mVideoView.setSurfaceViewVisibility(0);
                execAction(new Runnable() {
                    public void run() {
                        VideoController.this.playVideo(z);
                    }
                });
                return;
            }
            this.mVideoEngine.setSurface(surface);
            playVideo(z);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.isSurfaceValid = true;
        Surface surface = this.mVideoView.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        if (this.mVideoEngine != null) {
            this.mVideoEngine.setSurface(surface);
            execPendingActions();
        }
    }
}
