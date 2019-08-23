package com.ss.ttvideoengine;

import android.content.Context;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttm.player.TTPlayerConfiger;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.gl.TextureRenderer;
import com.ss.ttvideoengine.log.ExternVideoLoggerListener;
import com.ss.ttvideoengine.log.VideoEventLogger;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.net.DNSCompletionListener;
import com.ss.ttvideoengine.net.DNSParser;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.preloader.TTAVPreloaderItem;
import com.ss.ttvideoengine.utils.DeviceUtil;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class TTVideoEngine {
    private static boolean HTTP_DNS_FIRST = false;
    public static int PLAYER_MAX_ACCUMULATED_COUNT = 30;
    public static int PLAYER_TIME_BASE = 1000000;
    private static int PLAY_URL_EXPIRE_TIME = 2400;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int mBeginTimeNone = -1;
    private static boolean mForceUsePluginPlayer;
    private String currentHost;
    private String currentHostnameURL;
    private String currentIPURL;
    public Resolution currentResolution;
    private Resolution lastResolution;
    private String mAPIString;
    private int mAccumulatedErrorCount;
    private int mAsyncInitEnable;
    private String mAuthorization;
    public int mBeginPlayerTime;
    private int mBufferDataMilliSeconds;
    private int mBufferTimeout;
    private long mBufferingStartT;
    private int mBufferingType;
    private boolean mCacheControlEnabled;
    private int mCacheFileEnable;
    private int mCodecId;
    public Context mContext;
    private DNSParser mDNSParser;
    private int mDataLoaderEnable;
    private DataSource mDataSource;
    private int mDecoderType;
    private String mDecryptionKey;
    private String mDirectURL;
    public int mDuration;
    private int mEGLNeedWorkAround;
    private int mEnhancementType;
    public Error mError;
    public int mErrorCount;
    private String mExternLogKey;
    private ExternVideoLoggerListener mExternVideoLoggerListener;
    private VideoInfoFetcher mFetcher;
    public boolean mFirstGetWidthHeight;
    private boolean mFirstIP;
    private boolean mFirstURL;
    private int mFrameDropNum = 2;
    private String mGroupID;
    private boolean mH265Enabled;
    private int mHardwareDecodeEnable;
    public boolean mHasFirstFrameShown;
    private boolean mIsDirectURL;
    private boolean mIsFeedInfo;
    private boolean mIsLocal;
    private boolean mIsMute;
    private boolean mIsPlayItem;
    public boolean mIsPreloaderItem;
    public boolean mIsStartPlayAutomatically;
    private int mKsyFrameWait;
    private int mLastPlaybackTime;
    private int mLayoutType;
    private int mLoadState;
    public int mLoadedProgress;
    private String mLocalURL;
    public VideoEventLogger mLogger;
    private int mLoopReferVideo;
    public boolean mLooping;
    private int mMaxBufferDataMilliSeconds;
    private int mMaxFps = 31;
    private int mMediaCodecRender;
    public MediaPlayer mMediaPlayer;
    private int mMovPreferNearestSample;
    private TTVNetClient mNetClient;
    private int mNetworkTimeout;
    public boolean mNotifyFirstFrame;
    private long mPauseStartT;
    public boolean mPausedBeforePrepared;
    private int mPlayAPIVersion;
    private TTVideoEnginePlayItem mPlayItem;
    private int mPlayType;
    public PlaybackParams mPlaybackParams;
    public int mPlaybackState;
    private int mPlayerCache;
    public int mPlayerType;
    private TTAVPreloaderItem mPreloaderItem;
    public boolean mPrepared;
    private int mRenderType = 3;
    private boolean mRetrying;
    private int mScaleType;
    private SeekCompletionListener mSeekCompletionListener;
    private boolean mSeeking;
    private int mSetTrackVolume;
    public boolean mShouldPlay;
    private int mSkipAudioGraph;
    private int mSkipFfmpegFindStreamInfo;
    public int mStartTime;
    public boolean mStarted;
    private int mState;
    private int mSuperRes;
    private int mSuperResFxaa;
    private int mSuperResStrengh;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    public boolean mSwitchingResolution;
    private String mTag;
    public int mTestNetSpeed = -1;
    public int mTestNetSpeedDiff = 500;
    public Handler mTestNetSpeedHandler;
    public TestNetSpeedListener mTestNetSpeedListener;
    public Runnable mTestNetSpeedRunable;
    public boolean mTextureFirstFrame;
    public TextureRenderer mTextureRenderer;
    private String[] mURLs;
    private int mUnsupportSampleRatesInBinary;
    private int mUseMediacodecAudio;
    private boolean mUserStopped;
    private VideoBufferListener mVideoBufferListener;
    public VideoEngineListener mVideoEngineListener;
    private String mVideoID;
    public VideoInfoListener mVideoInfoListener;
    public VideoModel mVideoModel;
    private VideoURLRouteListener mVideoRouteListener;
    private float mVolume;
    public int mWatchedDuration;
    private Map<String, String> urlIPMap;
    public Map<Resolution, Integer> urlIndexMap;

    static class MyBufferingUpdateListener implements MediaPlayer.OnBufferingUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyBufferingUpdateListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91433, new Class[]{MediaPlayer.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91433, new Class[]{MediaPlayer.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine.mLoadedProgress = i2;
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onBufferingUpdate(tTVideoEngine, i2);
                }
            }
        }
    }

    static class MyCompletionListener implements MediaPlayer.OnCompletionListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 91434, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 91434, new Class[]{MediaPlayer.class}, Void.TYPE);
                return;
            }
            TTVideoEngineLog.d("TTVideoEngine", "onCompletion");
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine.mLogger.watchFinish();
                if (tTVideoEngine.mLooping) {
                    tTVideoEngine.mLogger.updateLoopCount();
                    tTVideoEngine._addWatchedDuration(true);
                } else {
                    tTVideoEngine._updatePlaybackState(0);
                    tTVideoEngine.mHasFirstFrameShown = false;
                    tTVideoEngine._addWatchedDuration(false);
                    tTVideoEngine.mLogger.addWatchedDuration(tTVideoEngine.mWatchedDuration);
                    tTVideoEngine.mLogger.movieFinish();
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mStarted = false;
                    tTVideoEngine.mVideoEngineListener.onCompletion(tTVideoEngine);
                }
                tTVideoEngine.mBeginPlayerTime = 0;
            }
        }
    }

    static class MyDNSCompletionListener implements DNSCompletionListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public void onCancelled() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91437, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91437, new Class[0], Void.TYPE);
                return;
            }
            TTVideoEngineLog.d("TTVideoEngine", "dns cancelled");
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._logUserCancelled();
            }
        }

        public MyDNSCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onRetry(Error error) {
            Error error2 = error;
            if (PatchProxy.isSupport(new Object[]{error2}, this, changeQuickRedirect, false, 91436, new Class[]{Error.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{error2}, this, changeQuickRedirect, false, 91436, new Class[]{Error.class}, Void.TYPE);
            } else if (error2 == null) {
                TTVideoEngineLog.d("TTVideoEngine", String.format("fetcher should retry, error:%s", new Object[]{error.toString()}));
                TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
                if (tTVideoEngine != null) {
                    if (tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution).intValue() == 0) {
                        tTVideoEngine.mLogger.mainURLLocalDNSFailed(error2);
                    }
                    tTVideoEngine.mLogger.firstDNSFailed(error2);
                }
            }
        }

        public void onCompletion(String str, Error error) {
            String str2 = str;
            Error error2 = error;
            if (PatchProxy.isSupport(new Object[]{str2, error2}, this, changeQuickRedirect, false, 91435, new Class[]{String.class, Error.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, error2}, this, changeQuickRedirect, false, 91435, new Class[]{String.class, Error.class}, Void.TYPE);
                return;
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                if (error2 != null) {
                    TTVideoEngineLog.d("TTVideoEngine", String.format("dns failed:%s", new Object[]{error.toString()}));
                    if (tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution).intValue() == 0) {
                        tTVideoEngine.mLogger.mainURLHTTPDNSFailed(error2);
                    }
                    tTVideoEngine._receivedError(error2);
                    return;
                }
                tTVideoEngine._parseDNSComplete(str2);
            }
        }
    }

    static class MyErrorListener implements MediaPlayer.OnErrorListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyErrorListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer mediaPlayer2 = mediaPlayer;
            if (PatchProxy.isSupport(new Object[]{mediaPlayer2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91438, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91438, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return false;
            }
            tTVideoEngine._addWatchedDuration(false);
            tTVideoEngine._updatePlaybackState(3);
            tTVideoEngine._updateLoadState(3, -1);
            String stringOption = mediaPlayer2.getStringOption(5002);
            String str = "kTTVideoErrorDomainVideoOwnPlayer";
            if (mediaPlayer.isOSPlayer()) {
                str = "kTTVideoErrorDomainVideoOSPlayer";
            }
            tTVideoEngine.mError = new Error(str, i, i2, stringOption);
            tTVideoEngine._receivedError(tTVideoEngine.mError);
            return true;
        }
    }

    static class MyFetcherListener implements VideoInfoFetcher.FetcherListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyFetcherListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onLog(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 91442, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 91442, new Class[]{String.class}, Void.TYPE);
                return;
            }
            TTVideoEngineLog.d("TTVideoEngine", "fetcher cancelled");
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._logMessage(str2);
                tTVideoEngine._logUserCancelled();
            }
        }

        public void onRetry(Error error) {
            Error error2 = error;
            if (PatchProxy.isSupport(new Object[]{error2}, this, changeQuickRedirect, false, 91439, new Class[]{Error.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{error2}, this, changeQuickRedirect, false, 91439, new Class[]{Error.class}, Void.TYPE);
            } else if (error2 != null) {
                TTVideoEngineLog.d("TTVideoEngine", String.format("fetcher should retry, error:%s", new Object[]{error.toString()}));
                TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
                if (tTVideoEngine != null) {
                    tTVideoEngine.mLogger.needRetryToFetch(error2);
                }
            }
        }

        public void onStatusException(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91441, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91441, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                TTVideoEngineLog.d("TTVideoEngine", String.format("video status exception:%d", new Object[]{Integer.valueOf(i)}));
                if (tTVideoEngine.mLogger != null) {
                    tTVideoEngine.mLogger.movieFinish(i2);
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onVideoStatusException(i2);
                }
            }
        }

        public void onCompletion(VideoModel videoModel, Error error) {
            VideoModel videoModel2 = videoModel;
            Error error2 = error;
            if (PatchProxy.isSupport(new Object[]{videoModel2, error2}, this, changeQuickRedirect, false, 91440, new Class[]{VideoModel.class, Error.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{videoModel2, error2}, this, changeQuickRedirect, false, 91440, new Class[]{VideoModel.class, Error.class}, Void.TYPE);
                return;
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine.mVideoModel = videoModel2;
                if (videoModel2 == null || error2 != null) {
                    TTVideoEngineLog.d("TTVideoEngine", String.format("fetch info failed:%s", new Object[]{error.toString()}));
                    tTVideoEngine._logFetchedFailed(error2);
                    tTVideoEngine._receivedError(error2);
                    return;
                }
                TTVideoEngineLog.d("TTVideoEngine", "fetch info success");
                tTVideoEngine._logFetchedVideoInfo(videoModel2);
                if (!tTVideoEngine.mIsPreloaderItem) {
                    if (tTVideoEngine.mVideoInfoListener == null || !tTVideoEngine.mVideoInfoListener.onFetchedVideoInfo(videoModel2)) {
                        tTVideoEngine._parseIPAddress(videoModel2);
                    }
                }
            }
        }
    }

    static class MyInfoListener implements MediaPlayer.OnInfoListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyInfoListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            int i3 = i;
            int i4 = i2;
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91443, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91443, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return false;
            }
            if (i3 != 3) {
                if (i3 != 801) {
                    switch (i3) {
                        case 701:
                            tTVideoEngine._bufferStart(i4);
                            break;
                        case 702:
                            tTVideoEngine._bufferEnd(i4);
                            break;
                    }
                } else {
                    tTVideoEngine._seekComplete(false);
                }
            } else if (tTVideoEngine.mTextureRenderer == null || (tTVideoEngine.mTextureRenderer != null && tTVideoEngine.mTextureRenderer.getState() < 2)) {
                TTVideoEngineLog.d("TTVideoEngine", "render start by player");
                tTVideoEngine._renderStart();
            } else {
                tTVideoEngine.mNotifyFirstFrame = true;
                if (tTVideoEngine.mTextureFirstFrame) {
                    TTVideoEngineLog.d("TTVideoEngine", "render start by player after texture");
                    tTVideoEngine._renderStart();
                }
            }
            return false;
        }
    }

    static class MyLoggerDataSource implements VideoEventLogger.EventLoggerSource {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public String playerInfo() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91446, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91446, new Class[0], String.class);
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return null;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return null;
            }
            return mediaPlayer.getStringOption(5002);
        }

        public Map bytesInfo() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91445, new Class[0], Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91445, new Class[0], Map.class);
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return null;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("vds", Long.valueOf(mediaPlayer.getLongOption(45, 0)));
            hashMap.put("vps", Long.valueOf(mediaPlayer.getLongOption(46, 0)));
            hashMap.put("download_speed", Long.valueOf(mediaPlayer.getLongOption(63, -1)));
            if (tTVideoEngine.mContext != null) {
                String _getWifiName = tTVideoEngine._getWifiName(tTVideoEngine.mContext);
                if (!TextUtils.isEmpty(_getWifiName)) {
                    hashMap.put("wifi_identify", TTVideoEngine.computeMD5(_getWifiName));
                }
            }
            return hashMap;
        }

        public Map versionInfo() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91444, new Class[0], Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91444, new Class[0], Map.class);
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            if (tTVideoEngine.mPlayerType == 0 || tTVideoEngine.mPlayerType == 1) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "3.0");
                hashMap.put("pc", TTPlayerConfiger.getValue(14, ""));
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            } else if (tTVideoEngine.mPlayerType == 10) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "10.0");
                hashMap.put("pc", "10");
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            } else {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "1.0");
                hashMap.put("pc", PushConstants.PUSH_TYPE_NOTIFY);
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            }
            return hashMap;
        }

        public MyLoggerDataSource(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public String getLogValueStr(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91447, new Class[]{Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91447, new Class[]{Integer.TYPE}, String.class);
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return "";
            }
            if (i != 0) {
                switch (i) {
                    case c.f69367f:
                        return DeviceUtil.getDeviceBoard();
                    case 32:
                        return DeviceUtil.getDeviceHardware();
                }
            } else if (tTVideoEngine.mMediaPlayer != null) {
                int intOption = tTVideoEngine.mMediaPlayer.getIntOption(141, -1);
                if (intOption == 0) {
                    return "h264";
                }
                if (intOption == 1) {
                    return "h265";
                }
            }
            return "";
        }

        public long getLogValueLong(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91448, new Class[]{Integer.TYPE}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91448, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return 0;
            }
            if (i2 == 7) {
                return tTVideoEngine.mMediaPlayer.getLongOption(68, 0);
            }
            switch (i2) {
                case 10:
                    return tTVideoEngine.mMediaPlayer.getLongOption(69, 0);
                case 11:
                    return tTVideoEngine.mMediaPlayer.getLongOption(70, 0);
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    return tTVideoEngine.mMediaPlayer.getLongOption(75, 0);
                case 13:
                    return tTVideoEngine.mMediaPlayer.getLongOption(76, 0);
                case 14:
                    return tTVideoEngine.mMediaPlayer.getLongOption(77, 0);
                case 15:
                    return tTVideoEngine.mMediaPlayer.getLongOption(78, 0);
                case SearchJediMixFeedAdapter.f42514c:
                    return tTVideoEngine.mMediaPlayer.getLongOption(156, -1);
                case 17:
                    return tTVideoEngine.mMediaPlayer.getLongOption(155, -1);
                case 18:
                    return tTVideoEngine.mMediaPlayer.getLongOption(163, -1);
                case 19:
                    return tTVideoEngine.mMediaPlayer.getLongOption(162, -1);
                default:
                    return 0;
            }
        }
    }

    static class MyOnVideoSizeChangedListener implements MediaPlayer.OnVideoSizeChangedListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyOnVideoSizeChangedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int i3 = i;
            int i4 = i2;
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91449, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91449, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (!(tTVideoEngine == null || tTVideoEngine.mVideoEngineListener == null)) {
                tTVideoEngine.mVideoEngineListener.onVideoSizeChanged(tTVideoEngine, i3, i4);
                if (!tTVideoEngine.mSwitchingResolution && tTVideoEngine.mFirstGetWidthHeight) {
                    tTVideoEngine.mFirstGetWidthHeight = false;
                    tTVideoEngine.mLogger.setStartPlayWidth(i3);
                    tTVideoEngine.mLogger.setStartPlayHeight(i4);
                }
            }
        }
    }

    static class MyPreparedListener implements MediaPlayer.OnPreparedListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyPreparedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 91450, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 91450, new Class[]{MediaPlayer.class}, Void.TYPE);
                return;
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null && tTVideoEngine.mMediaPlayer != null) {
                tTVideoEngine.mErrorCount = 0;
                tTVideoEngine.mError = null;
                tTVideoEngine.mDuration = tTVideoEngine.mMediaPlayer.getDuration();
                tTVideoEngine.mPrepared = true;
                if (tTVideoEngine.mLogger != null) {
                    tTVideoEngine.mLogger.prepareEnd();
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onPrepared(tTVideoEngine);
                }
                if ((!tTVideoEngine.mPausedBeforePrepared && tTVideoEngine.mShouldPlay) || !tTVideoEngine.mIsStartPlayAutomatically) {
                    tTVideoEngine.mMediaPlayer.start();
                }
                if (tTVideoEngine.mStartTime != 0) {
                    tTVideoEngine._seekTo(tTVideoEngine.mStartTime, false);
                    tTVideoEngine.mStartTime = 0;
                }
                if (tTVideoEngine.mPlaybackParams != null && tTVideoEngine.isSystemPlayer() && Build.VERSION.SDK_INT >= 23) {
                    tTVideoEngine.mMediaPlayer.setPlaybackParams(tTVideoEngine.mPlaybackParams);
                    tTVideoEngine.mLogger.setPlaybackParams(tTVideoEngine.mPlaybackParams);
                }
                if (tTVideoEngine.mMediaPlayer.getIntOption(62, -100) == 0 && !tTVideoEngine.mPausedBeforePrepared && tTVideoEngine.mShouldPlay) {
                    tTVideoEngine._renderStart();
                }
            }
        }
    }

    static class MyReleaseRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer mPlayer;

        public void run() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91451, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91451, new Class[0], Void.TYPE);
                return;
            }
            if (this.mPlayer != null) {
                try {
                    TTVideoEngineLog.d("TTVideoEngine", "MyReleaseRunnable release");
                    this.mPlayer.release();
                    this.mPlayer = null;
                } catch (Exception e2) {
                    TTVideoEngineLog.d("TTVideoEngine", e2.toString());
                }
            }
        }

        public MyReleaseRunnable(MediaPlayer mediaPlayer) {
            this.mPlayer = mediaPlayer;
        }
    }

    static class MySeekCompletionListener implements MediaPlayer.OnSeekCompleteListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MySeekCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 91452, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 91452, new Class[]{MediaPlayer.class}, Void.TYPE);
                return;
            }
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._seekComplete(true);
            }
        }
    }

    public static String getEngineVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private String[] parseEncodedUrl(String str) {
        return null;
    }

    public static boolean isForceUsePluginPlayer() {
        return mForceUsePluginPlayer;
    }

    public static boolean isHttpDnsFirst() {
        return HTTP_DNS_FIRST;
    }

    public int getBufferingType() {
        return this.mBufferingType;
    }

    public boolean getCacheControlEnabled() {
        return this.mCacheControlEnabled;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public int getLoadState() {
        return this.mLoadState;
    }

    public int getLoadedProgress() {
        return this.mLoadedProgress;
    }

    public int getPlaybackState() {
        return this.mPlaybackState;
    }

    public VideoModel getVideoModel() {
        return this.mVideoModel;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public String getCurrentPlayPath() {
        if (this.mIsLocal) {
            return this.mLocalURL;
        }
        if (this.mIsDirectURL) {
            return this.mDirectURL;
        }
        return this.currentHostnameURL;
    }

    private int _getPlayerTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91415, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91415, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mMediaPlayer == null) {
            return 0;
        } else {
            return this.mMediaPlayer.getCurrentPosition();
        }
    }

    public static void cancelAllTasks() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91348, new Class[0], Void.TYPE);
        } else {
            DataLoaderHelper.getDataLoader().cancelAllTasks();
        }
    }

    public static void clearAllCache() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91349, new Class[0], Void.TYPE);
        } else {
            DataLoaderHelper.getDataLoader().clearAllCache();
        }
    }

    public static void closeDataLoader() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91344, new Class[0], Void.TYPE);
        } else {
            DataLoaderHelper.getDataLoader().close();
        }
    }

    public static long getAllCacheSize() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91351, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91351, new Class[0], Long.TYPE)).longValue();
        }
        return DataLoaderHelper.getDataLoader().getAllCacheSize();
    }

    public void _logUserCancelled() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91426, new Class[0], Void.TYPE);
            return;
        }
        this.mLogger.userCancelled();
    }

    public long getAudioCacheDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91383, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91383, new Class[0], Long.TYPE)).longValue();
        }
        long j = -1;
        try {
            if (this.mMediaPlayer == null) {
                j = 0;
            } else {
                j = this.mMediaPlayer.getLongOption(73, 0);
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    public float getBitrate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91381, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91381, new Class[0], Float.TYPE)).floatValue();
        }
        long j = 0;
        try {
            if (this.mMediaPlayer != null) {
                j = this.mMediaPlayer.getLongOption(171, 0);
            }
        } catch (Throwable unused) {
        }
        return (float) j;
    }

    public int getCurrentPlaybackTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91379, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91379, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mSwitchingResolution) {
            return this.mLastPlaybackTime;
        } else {
            return _getPlayerTime();
        }
    }

    public float getCurrentVideoOutputFps() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91380, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91380, new Class[0], Float.TYPE)).floatValue();
        }
        float f2 = 0.0f;
        try {
            if (this.mMediaPlayer != null) {
                f2 = this.mMediaPlayer.getFloatOption(150, 0.0f);
            }
        } catch (Throwable unused) {
        }
        return f2;
    }

    public long getVideoCacheDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91382, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91382, new Class[0], Long.TYPE)).longValue();
        }
        long j = -1;
        try {
            if (this.mMediaPlayer == null) {
                j = 0;
            } else {
                j = this.mMediaPlayer.getLongOption(72, 0);
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    public int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91385, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91385, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mMediaPlayer == null) {
            return 0;
        } else {
            return this.mMediaPlayer.getVideoHeight();
        }
    }

    public int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91384, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91384, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mMediaPlayer == null) {
            return 0;
        } else {
            return this.mMediaPlayer.getVideoWidth();
        }
    }

    public int getWatchedDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91386, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91386, new Class[0], Integer.TYPE)).intValue();
        }
        _addWatchedDuration(false);
        return this.mWatchedDuration;
    }

    public boolean isMute() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91338, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91338, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.isMute();
        } else {
            return this.mIsMute;
        }
    }

    public boolean isSystemPlayer() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91378, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91378, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.isOSPlayer();
        } else {
            if (this.mPlayerType == 2) {
                z = true;
            }
            return z;
        }
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91372, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "pause");
        this.mShouldPlay = false;
        _pause();
        this.mPauseStartT = System.currentTimeMillis();
    }

    public void pauseByInterruption() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91373, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "pause by interruption");
        _pauseByInterruption();
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91374, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "stop");
        this.mShouldPlay = false;
        _stop();
        if (this.mTestNetSpeedHandler != null) {
            this.mTestNetSpeedHandler.removeCallbacks(this.mTestNetSpeedRunable);
        }
    }

    private Map _getCommentInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91424, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91424, new Class[0], Map.class);
        }
        String str = null;
        if (this.mMediaPlayer != null) {
            str = this.mMediaPlayer.getStringOption(47);
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            for (String split : str.replaceAll(" ", "").split(",")) {
                String[] split2 = split.split(":");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    private void _pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91394, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "_pause");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
            _updatePlaybackState(2);
            return;
        }
        if (this.mMediaPlayer != null) {
            TTVideoEngineLog.d("TTVideoEngine", "player will pause");
            this.mMediaPlayer.pause();
            _updatePlaybackState(2);
        }
    }

    private void _pauseByInterruption() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91395, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91395, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "_pause ");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
            return;
        }
        if (this.mMediaPlayer != null) {
            TTVideoEngineLog.d("TTVideoEngine", "player will pause by interruption");
            this.mMediaPlayer.pause();
            this.mPlaybackState = 2;
        }
    }

    private void _play() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91393, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("_play, mState:%d", new Object[]{Integer.valueOf(this.mState)}));
        this.mStarted = true;
        switch (this.mState) {
            case 0:
            case 4:
                _prepareToPlay();
                return;
            case 1:
                if (this.mVideoModel == null) {
                    _prepareToPlay();
                    return;
                } else {
                    _parseIPAddress(this.mVideoModel);
                    return;
                }
            case 3:
                _replayOrResume();
                break;
        }
    }

    private void _resumeVideo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91410, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "resumed video");
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            if (this.mPrepared) {
                this.mMediaPlayer.start();
                if (this.mMediaPlayer.getIntOption(62, -100) == 0 && this.mPlaybackState == 0) {
                    _renderStart();
                } else {
                    _updatePlaybackState(1);
                }
            } else {
                this.mPausedBeforePrepared = false;
            }
        }
    }

    private void _tryNextURL() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91403, new Class[0], Void.TYPE);
            return;
        }
        this.urlIndexMap.put(this.currentResolution, Integer.valueOf(this.urlIndexMap.get(this.currentResolution).intValue() + 1));
        _parseIPAddress(this.mVideoModel);
    }

    private void _updateVU() {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91421, new Class[0], Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i <= this.urlIndexMap.get(this.currentResolution).intValue() && i < this.mURLs.length) {
            HashMap hashMap = new HashMap();
            String str2 = this.mURLs[i];
            hashMap.put(PushConstants.WEB_URL, str2);
            hashMap.put("ip", this.urlIPMap.get(str2));
            if (this.mDNSParser != null) {
                if (this.mDNSParser.getType() == DNSParser.DNS_TYPE_HTTP) {
                    str = "203.107.1.4";
                } else {
                    str = "local";
                }
                hashMap.put("dns", str);
            }
            arrayList.add(hashMap);
            i++;
        }
        this.mLogger.setVUArray(arrayList);
    }

    private boolean _validateVideo() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91423, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91423, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            String str = this.mVideoModel.videoRef.mValidate;
            if (!TextUtils.isEmpty(str) && !PushConstants.PUSH_TYPE_NOTIFY.equals(str) && !isSystemPlayer()) {
                z = !this.mVideoID.equals(_getCommentInfo().get("vid"));
            }
            if (z) {
                this.mLogger.validateVideoMetaInfoFail(new Error("kTTVideoErrorDomainVideoOwnPlayer", -9991, "header meta validate failed"));
            }
        } catch (NullPointerException unused) {
        }
        return true;
    }

    public float getMaxVolume() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91334, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91334, new Class[0], Float.TYPE)).floatValue();
        } else if (this.mContext == null) {
            return 0.0f;
        } else {
            AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
            if (audioManager != null) {
                i = audioManager.getStreamMaxVolume(3);
            } else {
                i = 0;
            }
            if (i >= 0) {
                i2 = i;
            }
            return (float) i2;
        }
    }

    public JSONObject getPlayErrorInfo() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91387, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91387, new Class[0], JSONObject.class);
        }
        try {
            if (this.mMediaPlayer != null) {
                if (this.mMediaPlayer.getIntOption(5000, 0) != 0) {
                    new StringBuilder();
                    JSONObject jSONObject = new JSONObject();
                    new StringBuilder();
                    String stringOption = this.mMediaPlayer.getStringOption(5001);
                    if (this.mMediaPlayer.getIntOption(26, 1) == 1) {
                        str = "breakpad crash";
                    } else {
                        str = "simple crash";
                    }
                    jSONObject.put(str, stringOption);
                    return jSONObject;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public float getVolume() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91335, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91335, new Class[0], Float.TYPE)).floatValue();
        } else if (this.mContext == null) {
            return 0.0f;
        } else {
            AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
            if (audioManager != null) {
                i = audioManager.getStreamVolume(3);
            } else {
                i = 0;
            }
            if (i >= 0) {
                i2 = i;
            }
            return (float) i2;
        }
    }

    public void play() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91371, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "play");
        this.mShouldPlay = true;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        _play();
        if (!(this.mPauseStartT == 0 || this.mLogger == null)) {
            this.mLogger.accuPauseTime(System.currentTimeMillis() - this.mPauseStartT);
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91375, new Class[0], Void.TYPE);
            return;
        }
        stop();
        if (this.mLogger != null) {
            if (this.mExternVideoLoggerListener != null) {
                this.mLogger.setExternLog(this.mExternVideoLoggerListener.getLog(this.mExternLogKey));
            }
            this.mLogger.release();
        }
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        if (this.mTextureRenderer != null) {
            this.mTextureRenderer.setOnRenderFrameListener(null);
            this.mTextureRenderer = null;
            TTVideoEngineLog.d("TTVideoEngine", "mTextureRenderer become to null");
        }
        this.mPreloaderItem = null;
    }

    public void releaseAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91376, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "releaseAsync");
        stop();
        if (this.mLogger != null) {
            if (this.mExternVideoLoggerListener != null) {
                this.mLogger.setExternLog(this.mExternVideoLoggerListener.getLog(this.mExternLogKey));
            }
            this.mLogger.release();
        }
        if (this.mMediaPlayer != null) {
            if (this.mSurfaceHolder != null) {
                this.mMediaPlayer.setDisplay(null);
            }
            if (this.mSurface != null) {
                this.mMediaPlayer.setSurface(null);
            }
        }
        this.mPreloaderItem = null;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        this.mMediaPlayer = null;
        if (mediaPlayer != null) {
            new Thread(new MyReleaseRunnable(mediaPlayer)).start();
        }
    }

    private void _fetchVideoInfo() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91402, new Class[0], Void.TYPE);
            return;
        }
        this.mState = 1;
        this.urlIndexMap.put(Resolution.Standard, 0);
        this.urlIndexMap.put(Resolution.High, 0);
        this.urlIndexMap.put(Resolution.SuperHigh, 0);
        String str2 = null;
        if (this.mDataSource != null) {
            HashMap hashMap = new HashMap();
            if (this.mH265Enabled) {
                if (this.mH265Enabled) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                hashMap.put("codec_type", str);
            }
            String _getWifiName = _getWifiName(this.mContext);
            if (!TextUtils.isEmpty(_getWifiName)) {
                hashMap.put("wifi_identify", computeMD5(_getWifiName));
            }
            MediaPlayerWrapper.tryLoadPlayerPlugin();
            hashMap.put("player_version", TTPlayerConfiger.getValue(14, ""));
            TTVideoEngineLog.d("TTVideoEngine", hashMap.toString());
            str2 = this.mDataSource.apiForFetcher(hashMap);
        }
        this.mAPIString = str2;
        if (str2 == null) {
            _notifyError(new Error("kTTVideoErrorDomainFetchingInfo", -9999));
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("start to fetch video info:%s", new Object[]{str2}));
        this.mFetcher = new VideoInfoFetcher(this.mNetClient);
        this.mFetcher.setPlayType(this.mPlayType);
        this.mFetcher.setListener(new MyFetcherListener(this));
        this.mFetcher.fetchInfo(str2);
    }

    private void _prepareToPlay() {
        String str;
        String str2;
        String str3;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91400, new Class[0], Void.TYPE);
            return;
        }
        if (this.mIsLocal || this.mIsDirectURL) {
            this.mLogger.beginToPlay(null);
            if (this.mIsLocal) {
                str = this.mLocalURL;
            } else {
                str = this.mDirectURL;
            }
            _logFirstURL(str);
            if (this.mIsLocal) {
                str2 = this.mLocalURL;
            } else {
                str2 = this.mDirectURL;
            }
            _playInternal(str2, null);
        } else if (this.mIsPreloaderItem) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.mPreloaderItem.mUrlTime > 0 && currentTimeMillis - this.mPreloaderItem.mUrlTime > ((long) PLAY_URL_EXPIRE_TIME)) {
                z = true;
            }
            HashMap hashMap = new HashMap();
            if (z) {
                str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str3 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            hashMap.put("expire", str3);
            String str4 = "";
            if (this.mPreloaderItem.mUrl != null) {
                str4 = this.mPreloaderItem.mUrl;
            }
            hashMap.put(PushConstants.WEB_URL, str4);
            if (z) {
                _fetchVideoInfo();
            }
            _logFirstURL(this.mPreloaderItem.mUrl);
            this.mLogger.beginToPlay(this.mPreloaderItem.mVideoID);
            this.mLogger.setPreloadInfo(hashMap);
            this.mLogger.usePreload(1);
            _playInternal(this.mPreloaderItem.mUrl, null);
        } else if (this.mIsPlayItem) {
            this.mLogger.beginToPlay(this.mVideoID);
            _logFirstURL(this.mPlayItem.playURL);
            _playInternal(this.mPlayItem.playURL, null);
        } else if (this.mIsFeedInfo) {
            this.mLogger.beginToPlay(this.mVideoID);
            _parseIPAddress(this.mVideoModel);
        } else {
            this.mLogger.beginToPlay(this.mVideoID);
            _fetchVideoInfo();
        }
        this.mLogger.setTag(this.mTag);
    }

    private void _replayOrResume() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91401, new Class[0], Void.TYPE);
        } else if (this.mPlaybackState == 0 || this.mPlaybackState == 3) {
            this.mWatchedDuration = 0;
            if (this.mIsLocal || this.mIsDirectURL) {
                this.mLogger.beginToPlay(null);
                if (this.mIsLocal) {
                    str = this.mLocalURL;
                } else {
                    str = this.mDirectURL;
                }
                _playInternal(str, null);
            } else if (this.mIsPreloaderItem) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if (this.mPreloaderItem.mUrlTime > 0 && currentTimeMillis - this.mPreloaderItem.mUrlTime > ((long) PLAY_URL_EXPIRE_TIME)) {
                    _fetchVideoInfo();
                }
                this.mLogger.beginToPlay(this.mPreloaderItem.mVideoID);
                this.mLogger.usePreload(1);
                _playInternal(this.mPreloaderItem.mUrl, null);
            } else if (this.mIsPlayItem) {
                this.mLogger.beginToPlay(this.mVideoID);
                _playInternal(this.mPlayItem.playURL, null);
            } else {
                this.mLogger.beginToPlay(this.mVideoID);
                _playVideo(this.currentHost, this.currentIPURL);
            }
        } else {
            _resumeVideo();
        }
    }

    private void _tryNextPrelaoderItemUrl() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91404, new Class[0], Void.TYPE);
            return;
        }
        if (this.mIsPreloaderItem && this.mPreloaderItem != null && this.mPreloaderItem.mBackUpUrls != null) {
            this.mPreloaderItem.mCurUrlIndex++;
            str = null;
            while (this.mPreloaderItem.mCurUrlIndex < this.mPreloaderItem.mBackUpUrls.length) {
                str = this.mPreloaderItem.mBackUpUrls[this.mPreloaderItem.mCurUrlIndex];
                if (str != null && str.length() > 0) {
                    break;
                }
                this.mPreloaderItem.mCurUrlIndex++;
            }
        } else {
            str = null;
        }
        if (str == null || str.length() <= 0) {
            this.mIsPreloaderItem = false;
            if (this.mVideoModel != null) {
                _tryNextURL();
                return;
            }
            if (this.mFetcher != null) {
                this.mFetcher.cancel();
            }
            _fetchVideoInfo();
            return;
        }
        _playInternal(str, null);
    }

    public boolean supportHevcPlayback() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91430, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91430, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mMediaPlayer == null) {
            return true;
        } else {
            try {
                int currentPosition = this.mMediaPlayer.getCurrentPosition();
                int duration = this.mMediaPlayer.getDuration();
                long longOption = this.mMediaPlayer.getLongOption(72, -1);
                if (this.mMediaPlayer.getIntOption(157, -1) == 5 && this.mPlaybackState == 1 && this.mLoadState == 1 && currentPosition >= 1000 && duration - currentPosition >= 1000 && longOption >= 500) {
                    int intOption = this.mMediaPlayer.getIntOption(160, 100);
                    long longOption2 = this.mMediaPlayer.getLongOption(152, -1);
                    int intOption2 = this.mMediaPlayer.getIntOption(153, -1);
                    float floatOption = this.mMediaPlayer.getFloatOption(151, 0.0f);
                    if (floatOption > ((float) this.mMaxFps)) {
                        floatOption /= 2.0f;
                    }
                    int i = (((int) floatOption) * this.mFrameDropNum) / (this.mFrameDropNum + 1);
                    if (longOption2 > -350 || intOption2 < (i * 2) / 3 || intOption <= 2) {
                        return true;
                    }
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    public Resolution[] supportedResolutionTypes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91369, new Class[0], Resolution[].class)) {
            return (Resolution[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91369, new Class[0], Resolution[].class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.mIsPreloaderItem && this.mPreloaderItem != null) {
            if ((this.mPreloaderItem.mSupportResMask & 2) == 2) {
                arrayList.add(Resolution.Standard);
            }
            if ((this.mPreloaderItem.mSupportResMask & 4) == 4) {
                arrayList.add(Resolution.High);
            }
            if ((this.mPreloaderItem.mSupportResMask & 8) == 8) {
                arrayList.add(Resolution.SuperHigh);
            }
            return (Resolution[]) arrayList.toArray(new Resolution[arrayList.size()]);
        } else if (this.mVideoModel == null || this.mVideoModel.videoRef == null) {
            return new Resolution[0];
        } else {
            if (this.mVideoModel.videoRef.mVideo1 != null) {
                arrayList.add(Resolution.Standard);
            }
            if (this.mVideoModel.videoRef.mVideo2 != null) {
                arrayList.add(Resolution.High);
            }
            if (this.mVideoModel.videoRef.mVideo3 != null) {
                arrayList.add(Resolution.SuperHigh);
            }
            return (Resolution[]) arrayList.toArray(new Resolution[arrayList.size()]);
        }
    }

    private void _stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91396, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("_stop, mState:%d", new Object[]{Integer.valueOf(this.mState)}));
        switch (this.mState) {
            case 0:
                this.mUserStopped = true;
                break;
            case 1:
                this.mUserStopped = true;
                if (this.mFetcher != null) {
                    this.mFetcher.cancel();
                    break;
                }
                break;
            case 2:
                this.mUserStopped = true;
                if (this.mDNSParser != null) {
                    this.mDNSParser.cancel();
                    break;
                }
                break;
            case 3:
                this.mUserStopped = true;
                break;
        }
        if (this.mLogger != null) {
            if (this.mMediaPlayer != null) {
                this.mLogger.curPlayBackTime(this.mMediaPlayer.getCurrentPosition());
                this.mLogger.curVideoOutputFps(this.mMediaPlayer.getFloatOption(150, 0.0f));
                this.mLogger.containerFps(this.mMediaPlayer.getFloatOption(151, 0.0f));
                this.mLogger.curVideoDecoderFps(this.mMediaPlayer.getIntOption(186, -1));
                this.mLogger.clockDiff(this.mMediaPlayer.getLongOption(152, -1));
                this.mLogger.dropCount(this.mMediaPlayer.getIntOption(153, -1));
                this.mLogger.deviceStartTime(1, this.mMediaPlayer.getLongOption(156, -1));
                this.mLogger.deviceStartTime(0, this.mMediaPlayer.getLongOption(155, -1));
                this.mLogger.devicedOpenedTime(1, this.mMediaPlayer.getLongOption(163, -1));
                this.mLogger.devicedOpenedTime(0, this.mMediaPlayer.getLongOption(162, -1));
                this.mLogger.codecName(1, this.mMediaPlayer.getIntOption(158, -1));
                this.mLogger.codecName(0, this.mMediaPlayer.getIntOption(157, -1));
                this.mLogger.setAudioBufferLength(this.mMediaPlayer.getLongOption(73, -1));
                this.mLogger.setVideoBufferLength(this.mMediaPlayer.getLongOption(72, -1));
                this.mLogger.setDecodeSecondVideoFrameTime(this.mMediaPlayer.getLongOption(161, -1));
                if (this.mHardwareDecodeEnable > 0) {
                    this.mLogger.hwCodecName(this.mMediaPlayer.getStringOption(187));
                    this.mLogger.hwCodecException(this.mMediaPlayer.getIntOption(188, -1));
                }
            }
            this.mLogger.playBackState(this.mPlaybackState);
            this.mLogger.loadState(this.mLoadState);
        }
        if (this.mMediaPlayer != null && this.mPrepared) {
            this.mMediaPlayer.stop();
        }
        _addWatchedDuration(false);
        if (!(this.mLogger == null || this.mPlaybackState == 0)) {
            this.mLogger.addWatchedDuration(this.mWatchedDuration);
        }
        _updatePlaybackState(0);
    }

    public void _renderStart() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91416, new Class[0], Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "start to render");
        this.mHasFirstFrameShown = true;
        if (this.mLogger != null) {
            this.mLogger.showedOneFrame();
        }
        _updatePlaybackState(1);
        _updateLoadState(1, -1);
        if (this.mTestNetSpeed >= 0 && this.mMediaPlayer != null && this.mTestNetSpeedDiff > 0) {
            this.mTestNetSpeedHandler = new Handler();
            this.mTestNetSpeedRunable = new Runnable() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public void run() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91432, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91432, new Class[0], Void.TYPE);
                        return;
                    }
                    if (TTVideoEngine.this.mMediaPlayer != null) {
                        long longOption = TTVideoEngine.this.mMediaPlayer.getLongOption(63, 0);
                        if (longOption >= 0 && TTVideoEngine.this.mTestNetSpeedListener != null) {
                            TTVideoEngine.this.mTestNetSpeedListener.onSpeedReceive(longOption);
                        }
                        if ((TTVideoEngine.this.mTestNetSpeed == 1 || (TTVideoEngine.this.mTestNetSpeed == 0 && longOption < 0)) && TTVideoEngine.this.mTestNetSpeedDiff > 0) {
                            TTVideoEngine.this.mTestNetSpeedHandler.postDelayed(TTVideoEngine.this.mTestNetSpeedRunable, (long) TTVideoEngine.this.mTestNetSpeedDiff);
                        }
                    }
                }
            };
            this.mTestNetSpeedHandler.postDelayed(this.mTestNetSpeedRunable, (long) (this.mTestNetSpeedDiff + (this.mTestNetSpeedDiff / 2)));
        }
        if (this.mMediaPlayer != null) {
            this.mBeginPlayerTime = this.mMediaPlayer.getCurrentPosition();
        }
        if (this.mMediaPlayer != null) {
            this.mLogger.setDNSParseTime(this.mMediaPlayer.getLongOption(68, 0));
            this.mLogger.setTranConnectTime(this.mMediaPlayer.getLongOption(69, 0));
            this.mLogger.setTranFirstPacketTime(this.mMediaPlayer.getLongOption(70, 0));
            this.mLogger.setReceiveFirstVideoFrameTime(this.mMediaPlayer.getLongOption(75, 0));
            this.mLogger.setReceiveFirstAudioFrameTime(this.mMediaPlayer.getLongOption(76, 0));
            this.mLogger.setDecodeFirstVideoFrameTime(this.mMediaPlayer.getLongOption(77, 0));
            this.mLogger.setDecodeFirstAudioFrameTime(this.mMediaPlayer.getLongOption(78, 0));
            this.mLogger.deviceStartTime(1, this.mMediaPlayer.getLongOption(156, -1));
            this.mLogger.deviceStartTime(0, this.mMediaPlayer.getLongOption(155, -1));
            this.mLogger.devicedOpenedTime(1, this.mMediaPlayer.getLongOption(163, -1));
            this.mLogger.devicedOpenedTime(0, this.mMediaPlayer.getLongOption(162, -1));
            this.mLogger.setPlayerHostAddr(this.mMediaPlayer.getStringOption(71));
            this.mLogger.setDuration(this.mMediaPlayer.getDuration());
        }
        if (this.mSwitchingResolution || this.mRetrying) {
            if (this.mLastPlaybackTime != 0) {
                _seekTo(this.mLastPlaybackTime, this.mSwitchingResolution);
            }
            this.mRetrying = false;
        }
        this.mErrorCount = 0;
        if (this.mVideoEngineListener != null) {
            TTVideoEngineLog.d("TTVideoEngine", "notify render start");
            this.mVideoEngineListener.onRenderStart(this);
        }
    }

    public static void setForceUsePluginPlayer(boolean z) {
        mForceUsePluginPlayer = z;
    }

    public static void setHTTPDNSFirst(boolean z) {
        HTTP_DNS_FIRST = z;
    }

    public void setCacheControlEnabled(boolean z) {
        this.mCacheControlEnabled = z;
    }

    public void setDataSource(DataSource dataSource) {
        this.mDataSource = dataSource;
    }

    public void setDecryptionKey(String str) {
        this.mDecryptionKey = str;
    }

    public void setGroupID(String str) {
        this.mGroupID = str;
    }

    public void setListener(VideoEngineListener videoEngineListener) {
        this.mVideoEngineListener = videoEngineListener;
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
        this.mNetClient = tTVNetClient;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setVideoBufferListener(VideoBufferListener videoBufferListener) {
        this.mVideoBufferListener = videoBufferListener;
    }

    public void setVideoInfoListener(VideoInfoListener videoInfoListener) {
        this.mVideoInfoListener = videoInfoListener;
    }

    public void setVideoURLRouteListener(VideoURLRouteListener videoURLRouteListener) {
        this.mVideoRouteListener = videoURLRouteListener;
    }

    private void _logFirstIP(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91429, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91429, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mFirstIP) {
            this.mFirstIP = false;
            this.mLogger.setInitialIP(str);
        }
    }

    private void _logFirstURL(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91428, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91428, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mFirstURL) {
            this.mFirstURL = false;
            this.mLogger.setInitialURL(str);
        }
    }

    public static void cancelTask(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 91347, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 91347, new Class[]{String.class}, Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().cancelTask(str2);
    }

    public static DataLoaderHelper.DataLoaderCacheFileInfo getCacheFileInfo(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 91352, new Class[]{String.class}, DataLoaderHelper.DataLoaderCacheFileInfo.class)) {
            return DataLoaderHelper.getDataLoader().cacheFileInfo(str2);
        }
        return (DataLoaderHelper.DataLoaderCacheFileInfo) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 91352, new Class[]{String.class}, DataLoaderHelper.DataLoaderCacheFileInfo.class);
    }

    public static void setDataLoaderListener(DataLoaderListener dataLoaderListener) {
        DataLoaderListener dataLoaderListener2 = dataLoaderListener;
        if (PatchProxy.isSupport(new Object[]{dataLoaderListener2}, null, changeQuickRedirect, true, 91342, new Class[]{DataLoaderListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataLoaderListener2}, null, changeQuickRedirect, true, 91342, new Class[]{DataLoaderListener.class}, Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().setListener(dataLoaderListener2);
    }

    public void _logFetchedFailed(Error error) {
        Error error2 = error;
        if (PatchProxy.isSupport(new Object[]{error2}, this, changeQuickRedirect, false, 91425, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error2}, this, changeQuickRedirect, false, 91425, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mLogger.fetchInfoComplete(null, error2);
    }

    public void _logMessage(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 91427, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 91427, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mLogger.logMessage(str2);
    }

    public void setLiveID(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91357, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91357, new Class[]{String.class}, Void.TYPE);
            return;
        }
        setVideoID(str);
        this.mLogger.setPlayType(1);
        this.mPlayType = 1;
    }

    private void _configResolution(Resolution resolution) {
        if (PatchProxy.isSupport(new Object[]{resolution}, this, changeQuickRedirect, false, 91398, new Class[]{Resolution.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{resolution}, this, changeQuickRedirect, false, 91398, new Class[]{Resolution.class}, Void.TYPE);
            return;
        }
        if (this.mState == 0 || this.mState == 1) {
            this.lastResolution = resolution;
            this.currentResolution = resolution;
            if (this.mDirectURL == null && this.mLocalURL == null) {
                this.mLogger.configResolution(resolution.toString(), resolution.toString());
            }
        } else if (this.mState == 3) {
            _switchToResolution(resolution);
        }
    }

    private void _notifyError(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91413, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91413, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        if (!(this.mExternVideoLoggerListener == null || this.mLogger == null)) {
            this.mLogger.setExternLog(this.mExternVideoLoggerListener.getLog(this.mExternLogKey));
        }
        if (!(this.mWatchedDuration == 0 || this.mLogger == null)) {
            this.mLogger.addWatchedDuration(this.mWatchedDuration);
        }
        this.mLogger.movieFinish(error);
        this.mStarted = false;
        if (this.mVideoEngineListener != null) {
            this.mVideoEngineListener.onError(error);
        }
        this.mErrorCount = 0;
        this.mAccumulatedErrorCount = 0;
    }

    private void _parseDNS(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91406, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91406, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("hostnameURL:%s", new Object[]{str}));
        this.mState = 2;
        try {
            this.mDNSParser = new DNSParser(new URL(str).getHost(), this.mNetClient);
            this.mDNSParser.setCompletionListener(new MyDNSCompletionListener(this));
            this.mDNSParser.start();
        } catch (Exception unused) {
        }
    }

    private void _setPlayerMute(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91336, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91336, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mMediaPlayer != null) {
            if (this.mMediaPlayer.isOSPlayer()) {
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                this.mMediaPlayer.setVolume(f2, f2);
                return;
            }
            this.mMediaPlayer.setIsMute(z);
        }
    }

    public static String computeMD5(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 91329, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 91329, new Class[]{String.class}, String.class);
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }

    public static long getCacheFileSize(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 91350, new Class[]{String.class}, Long.TYPE)) {
            return DataLoaderHelper.getDataLoader().getCacheFileSize(str2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 91350, new Class[]{String.class}, Long.TYPE)).longValue();
    }

    public static String getStringValue(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 91355, new Class[]{Integer.TYPE}, String.class)) {
            return DataLoaderHelper.getDataLoader().getStringValue(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 91355, new Class[]{Integer.TYPE}, String.class);
    }

    public static void startDataLoader(Context context) throws Exception {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 91343, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 91343, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().setContext(context2);
        try {
            DataLoaderHelper.getDataLoader().start();
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void _addWatchedDuration(boolean z) {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91390, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91390, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mMediaPlayer != null) {
            int i3 = this.mBeginPlayerTime;
            if (i3 != mBeginTimeNone) {
                if (z) {
                    i = this.mDuration;
                } else {
                    i = this.mMediaPlayer.getCurrentPosition();
                }
                TTVideoEngineLog.d("TTVideoEngine", String.format("last:%d,current:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}));
                int i4 = this.mWatchedDuration;
                if (i >= i3) {
                    i2 = i - i3;
                }
                this.mWatchedDuration = i4 + i2;
                this.mBeginPlayerTime = i;
            }
        }
    }

    public void _bufferStart(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91417, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91417, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "buffering start");
        this.mBufferingStartT = System.currentTimeMillis();
        this.mBufferingType = i;
        if (!(this.mLogger == null || i == 1)) {
            this.mLogger.firstBufferStartT();
        }
        if (this.mLogger != null && i == 1) {
            this.mLogger.decoderBufferStartT();
        }
        if (this.mVideoBufferListener != null) {
            this.mVideoBufferListener.onBufferStart(i);
        }
        _updateLoadState(2, i);
    }

    public String _getWifiName(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 91391, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 91391, new Class[]{Context.class}, String.class);
        } else if (context2 == null) {
            return null;
        } else {
            try {
                WifiManager wifiManager = (WifiManager) context2.getSystemService("wifi");
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        NetworkInfo.DetailedState detailedStateOf = WifiInfo.getDetailedStateOf(connectionInfo.getSupplicantState());
                        if (detailedStateOf == NetworkInfo.DetailedState.CONNECTED || detailedStateOf == NetworkInfo.DetailedState.OBTAINING_IPADDR) {
                            return connectionInfo.getSSID();
                        }
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public void _parseDNSComplete(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91407, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91407, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String host = Uri.parse(this.currentHostnameURL).getHost();
        String replaceFirst = this.currentHostnameURL.replaceFirst(host, str);
        TTVideoEngineLog.d("TTVideoEngine", String.format("dns success, host:%s, ip:%s", new Object[]{host, str}));
        this.urlIPMap.put(this.currentHostnameURL, str);
        _updateVU();
        _logFirstURL(this.currentHostnameURL);
        _logFirstIP(str);
        _playVideo(host, replaceFirst);
    }

    public void _seekComplete(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91414, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91414, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "seek complete");
        if (this.mMediaPlayer != null) {
            this.mBeginPlayerTime = this.mMediaPlayer.getCurrentPosition();
        }
        if (this.mSeeking) {
            this.mSeeking = false;
            this.mLogger.showedOneFrame();
        }
        if (this.mSwitchingResolution) {
            this.mSwitchingResolution = false;
        }
        if (this.mSeekCompletionListener != null) {
            this.mSeekCompletionListener.onCompletion(z);
            this.mSeekCompletionListener = null;
        }
    }

    public void _updatePlaybackState(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91419, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91419, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlaybackState != i) {
            TTVideoEngineLog.d("TTVideoEngine", String.format("playback state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(this.mPlaybackState), Integer.valueOf(i)}));
            this.mPlaybackState = i;
            if (this.mVideoEngineListener != null) {
                this.mVideoEngineListener.onPlaybackStateChanged(this, this.mPlaybackState);
            }
        }
    }

    public void configResolution(Resolution resolution) {
        if (PatchProxy.isSupport(new Object[]{resolution}, this, changeQuickRedirect, false, 91370, new Class[]{Resolution.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{resolution}, this, changeQuickRedirect, false, 91370, new Class[]{Resolution.class}, Void.TYPE);
        } else if (resolution != null) {
            TTVideoEngineLog.d("TTVideoEngine", String.format("config reolution:%s", new Object[]{resolution.toString()}));
            _configResolution(resolution);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        r0 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getFloatOption(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r3 = 0
            r4 = 91367(0x164e7, float:1.28032E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 91367(0x164e7, float:1.28032E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
        L_0x0041:
            r0 = 0
            switch(r10) {
                case 70: goto L_0x0053;
                case 71: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0060
        L_0x0046:
            com.ss.ttm.player.MediaPlayer r1 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0060 }
            if (r1 == 0) goto L_0x0060
            com.ss.ttm.player.MediaPlayer r1 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0060 }
            r2 = 150(0x96, float:2.1E-43)
            float r1 = r1.getFloatOption(r2, r0)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x005f
        L_0x0053:
            com.ss.ttm.player.MediaPlayer r1 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0060 }
            if (r1 == 0) goto L_0x0060
            com.ss.ttm.player.MediaPlayer r1 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0060 }
            r2 = 151(0x97, float:2.12E-43)
            float r1 = r1.getFloatOption(r2, r0)     // Catch:{ Throwable -> 0x0060 }
        L_0x005f:
            r0 = r1
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.getFloatOption(int):float");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r0 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getLongOption(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Long.TYPE
            r3 = 0
            r4 = 91366(0x164e6, float:1.28031E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 91366(0x164e6, float:1.28031E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Long.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x0041:
            r0 = -1
            r2 = 0
            switch(r10) {
                case 60: goto L_0x0064;
                case 61: goto L_0x0056;
                case 62: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0071
        L_0x0049:
            com.ss.ttm.player.MediaPlayer r4 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0071 }
            if (r4 == 0) goto L_0x0071
            com.ss.ttm.player.MediaPlayer r4 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0071 }
            r5 = 72
            long r2 = r4.getLongOption(r5, r2)     // Catch:{ Throwable -> 0x0071 }
            goto L_0x0062
        L_0x0056:
            com.ss.ttm.player.MediaPlayer r4 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0071 }
            if (r4 == 0) goto L_0x0071
            com.ss.ttm.player.MediaPlayer r4 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0071 }
            r5 = 73
            long r2 = r4.getLongOption(r5, r2)     // Catch:{ Throwable -> 0x0071 }
        L_0x0062:
            r0 = r2
            goto L_0x0071
        L_0x0064:
            com.ss.ttm.player.MediaPlayer r2 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0071 }
            if (r2 == 0) goto L_0x0071
            com.ss.ttm.player.MediaPlayer r2 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x0071 }
            r3 = 171(0xab, float:2.4E-43)
            int r2 = r2.getIntOption(r3, r8)     // Catch:{ Throwable -> 0x0071 }
            long r0 = (long) r2
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.getLongOption(int):long");
    }

    public String getStringOption(int i) {
        String stringOption;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91368, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91368, new Class[]{Integer.TYPE}, String.class);
        }
        String str = "";
        if (i != 80) {
            if (i == 101) {
                try {
                    if (mForceUsePluginPlayer) {
                        stringOption = MediaPlayerWrapper.getPluginVersion();
                    } else {
                        stringOption = TTPlayerConfiger.getValue(14, "");
                    }
                } catch (Throwable unused) {
                }
            }
            return str;
        }
        if (this.mMediaPlayer != null) {
            stringOption = this.mMediaPlayer.getStringOption(142);
        }
        return str;
        str = stringOption;
        return str;
    }

    public void setIsMute(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91337, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91337, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mIsMute = z;
        _setPlayerMute(z);
    }

    public void setLooping(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91377, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91377, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mLooping = z;
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setLooping(this.mLooping);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (PatchProxy.isSupport(new Object[]{playbackParams}, this, changeQuickRedirect, false, 91363, new Class[]{PlaybackParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{playbackParams}, this, changeQuickRedirect, false, 91363, new Class[]{PlaybackParams.class}, Void.TYPE);
            return;
        }
        this.mPlaybackParams = playbackParams;
        if (this.mMediaPlayer != null && (!isSystemPlayer() || (Build.VERSION.SDK_INT >= 23 && this.mPrepared))) {
            this.mMediaPlayer.setPlaybackParams(playbackParams);
            this.mLogger.setPlaybackParams(this.mPlaybackParams);
        }
    }

    public void setRenderer(TextureRenderer textureRenderer) {
        if (PatchProxy.isSupport(new Object[]{textureRenderer}, this, changeQuickRedirect, false, 91328, new Class[]{TextureRenderer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textureRenderer}, this, changeQuickRedirect, false, 91328, new Class[]{TextureRenderer.class}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "setRenderer = " + textureRenderer);
        if (textureRenderer != null) {
            synchronized (this) {
                if (this.mTextureRenderer != null) {
                    this.mTextureRenderer.setOnRenderFrameListener(null);
                }
                this.mTextureRenderer = textureRenderer;
                this.mTextureRenderer.setOnRenderFrameListener(new TextureRenderer.OnRenderFrameListener() {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public void onRenderFrame(long j) {
                        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91431, new Class[]{Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91431, new Class[]{Long.TYPE}, Void.TYPE);
                            return;
                        }
                        if (!TTVideoEngine.this.mTextureFirstFrame && TTVideoEngine.this.mPrepared) {
                            TTVideoEngineLog.d("TTVideoEngine", "recive first frame render from texture");
                            TTVideoEngine.this.mTextureFirstFrame = true;
                        }
                        if (TTVideoEngine.this.mNotifyFirstFrame && !TTVideoEngine.this.mHasFirstFrameShown && TTVideoEngine.this.mPlaybackState != 0) {
                            TTVideoEngineLog.d("TTVideoEngine", "render start by texture, state =" + TTVideoEngine.this.mPlaybackState);
                            TTVideoEngine.this._renderStart();
                        }
                    }
                });
            }
        }
    }

    public void setStartTime(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91339, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91339, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "setStartTime:" + i2);
        this.mStartTime = i2;
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 91330, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 91330, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "setsurface = " + surface);
        this.mSurface = surface;
        if (!(surface == null || this.mLogger == null || this.mHasFirstFrameShown)) {
            this.mLogger.surfaceSetTime();
        }
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setSurface(surface);
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91331, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91331, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        this.mSurfaceHolder = surfaceHolder;
        if (!(surfaceHolder == null || this.mLogger == null)) {
            this.mLogger.surfaceSetTime();
        }
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setDisplay(surfaceHolder);
        }
    }

    public void setUnSupportSampleRates(int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{iArr}, this, changeQuickRedirect, false, 91389, new Class[]{int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iArr}, this, changeQuickRedirect, false, 91389, new Class[]{int[].class}, Void.TYPE);
        } else if (!isSystemPlayer()) {
            int length = iArr.length;
            if (length > 0) {
                int length2 = MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES.length;
                this.mUnsupportSampleRatesInBinary = 0;
                for (int i = 0; i < length; i++) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        } else if (MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES[i2] == iArr[i]) {
                            this.mUnsupportSampleRatesInBinary = (1 << i2) | this.mUnsupportSampleRatesInBinary;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (this.mMediaPlayer != null) {
                    this.mMediaPlayer.setIntOption(111, this.mUnsupportSampleRatesInBinary);
                }
            }
        }
    }

    private void _switchToResolution(Resolution resolution) {
        if (PatchProxy.isSupport(new Object[]{resolution}, this, changeQuickRedirect, false, 91399, new Class[]{Resolution.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{resolution}, this, changeQuickRedirect, false, 91399, new Class[]{Resolution.class}, Void.TYPE);
        } else if (this.currentResolution == resolution) {
            TTVideoEngineLog.d("TTVideoEngine", String.format("switch to the same resolution:%s, drop", new Object[]{resolution.toString()}));
        } else {
            this.lastResolution = this.currentResolution;
            this.currentResolution = resolution;
            TTVideoEngineLog.d("TTVideoEngine", String.format("will switch to resolution:%s, from resolution:%s", new Object[]{this.currentResolution.toString(), this.lastResolution.toString()}));
            this.mLogger.switchResolution(this.currentResolution.toString(), this.lastResolution.toString());
            this.mSwitchingResolution = true;
            this.mLastPlaybackTime = _getPlayerTime();
            if (this.mMediaPlayer != null) {
                this.mMediaPlayer.pause();
            }
            _parseIPAddress(this.mVideoModel);
        }
    }

    public void _bufferEnd(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91418, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91418, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", "buffering end");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mLogger != null && this.mBufferingStartT > 0 && currentTimeMillis >= this.mBufferingStartT) {
            if (i == 0) {
                this.mLogger.accuBuffingTime(currentTimeMillis - this.mBufferingStartT);
            } else if (i == 1) {
                this.mLogger.decoderBufferEndT();
            }
            this.mBufferingStartT = 0;
        }
        this.mBufferingType = -1;
        if (!(this.mLogger == null || i == 1)) {
            this.mLogger.firstBufferEndT();
        }
        if (this.mVideoBufferListener != null) {
            this.mVideoBufferListener.onBufferEnd(i);
        }
        _updateLoadState(1, i);
    }

    public void _logFetchedVideoInfo(VideoModel videoModel) {
        VideoModel videoModel2 = videoModel;
        if (PatchProxy.isSupport(new Object[]{videoModel2}, this, changeQuickRedirect, false, 91422, new Class[]{VideoModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoModel2}, this, changeQuickRedirect, false, 91422, new Class[]{VideoModel.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        long[] jArr = {0, 0, 0};
        VideoInfo videoInfo = videoModel2.videoRef.mVideo1;
        if (videoInfo != null) {
            jArr[0] = videoInfo.mSize;
        }
        VideoInfo videoInfo2 = videoModel2.videoRef.mVideo2;
        if (videoInfo2 != null) {
            jArr[1] = videoInfo2.mSize;
        }
        VideoInfo videoInfo3 = videoModel2.videoRef.mVideo3;
        if (videoInfo3 != null) {
            jArr[2] = videoInfo3.mSize;
        }
        hashMap.put(Resolution.Standard.toString(), Long.valueOf(jArr[0]));
        hashMap.put(Resolution.High.toString(), Long.valueOf(jArr[1]));
        hashMap.put(Resolution.SuperHigh.toString(), Long.valueOf(jArr[2]));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("duration", Integer.valueOf(videoModel2.videoRef.mVideoDuration));
        hashMap2.put("size", hashMap);
        hashMap2.put("codec", videoModel.getCodec());
        this.mLogger.fetchInfoComplete(hashMap2, null);
    }

    public void setDirectURL(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91362, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91362, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null && !str.equals(this.mDirectURL)) {
            TTVideoEngineLog.d("TTVideoEngine", String.format("set direct url:%s", new Object[]{str}));
            if (!TextUtils.isEmpty(this.mDirectURL)) {
                stop();
            }
            this.mState = 0;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mBeginPlayerTime = mBeginTimeNone;
        this.mStarted = false;
        this.mWatchedDuration = 0;
        this.mIsDirectURL = true;
        this.mDirectURL = str;
        this.mBufferingStartT = 0;
        this.currentResolution = Resolution.Undefine;
        this.mLogger.configResolution(this.currentResolution.toString(), "");
    }

    public void setLocalURL(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91361, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91361, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null && !str.equals(this.mLocalURL)) {
            TTVideoEngineLog.d("TTVideoEngine", String.format("set local url:%s", new Object[]{str}));
            if (!TextUtils.isEmpty(this.mLocalURL)) {
                stop();
            }
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mBeginPlayerTime = mBeginTimeNone;
        this.mStarted = false;
        this.mWatchedDuration = 0;
        this.mIsLocal = true;
        this.mLocalURL = str;
        this.mBufferingStartT = 0;
        this.mLogger.setLocal(true);
        this.currentResolution = Resolution.Undefine;
        this.mLogger.configResolution(this.currentResolution.toString(), "");
    }

    public void setPlayItem(TTVideoEnginePlayItem tTVideoEnginePlayItem) {
        String str;
        if (PatchProxy.isSupport(new Object[]{tTVideoEnginePlayItem}, this, changeQuickRedirect, false, 91360, new Class[]{TTVideoEnginePlayItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEnginePlayItem}, this, changeQuickRedirect, false, 91360, new Class[]{TTVideoEnginePlayItem.class}, Void.TYPE);
        } else if (tTVideoEnginePlayItem != null) {
            boolean isExpired = tTVideoEnginePlayItem.isExpired();
            HashMap hashMap = new HashMap();
            if (isExpired) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            hashMap.put("expire", str);
            String str2 = "";
            if (tTVideoEnginePlayItem.playURL != null) {
                str2 = tTVideoEnginePlayItem.playURL;
            }
            hashMap.put(PushConstants.WEB_URL, str2);
            this.mLogger.setPlayItem(hashMap);
            if (TextUtils.isEmpty(tTVideoEnginePlayItem.playURL) || isExpired) {
                setVideoID(tTVideoEnginePlayItem.vid);
                return;
            }
            if (!tTVideoEnginePlayItem.equals(this.mPlayItem)) {
                if (this.mPlayItem != null) {
                    stop();
                }
                this.mIsPlayItem = true;
                this.mFirstURL = true;
                this.mFirstIP = true;
                this.mState = 0;
                this.mUserStopped = false;
                this.mLastPlaybackTime = 0;
                this.mAPIString = null;
            }
            this.mBeginPlayerTime = mBeginTimeNone;
            this.mStarted = false;
            this.mWatchedDuration = 0;
            this.mPlayItem = tTVideoEnginePlayItem;
            this.mBufferingStartT = 0;
            if (tTVideoEnginePlayItem.resolution != null) {
                this.currentResolution = tTVideoEnginePlayItem.resolution;
            }
            this.mVideoID = tTVideoEnginePlayItem.vid;
            this.mLogger.setLocal(false);
            this.mLogger.setVid(tTVideoEnginePlayItem.vid);
            this.urlIPMap.clear();
        }
    }

    public void setPreloaderItem(TTAVPreloaderItem tTAVPreloaderItem) {
        if (PatchProxy.isSupport(new Object[]{tTAVPreloaderItem}, this, changeQuickRedirect, false, 91358, new Class[]{TTAVPreloaderItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTAVPreloaderItem}, this, changeQuickRedirect, false, 91358, new Class[]{TTAVPreloaderItem.class}, Void.TYPE);
        } else if (tTAVPreloaderItem != null) {
            if (TextUtils.isEmpty(tTAVPreloaderItem.mUrl)) {
                setVideoID(tTAVPreloaderItem.mVideoID);
                return;
            }
            switch (tTAVPreloaderItem.mResolution) {
                case 0:
                    this.currentResolution = Resolution.Standard;
                    break;
                case 1:
                    this.currentResolution = Resolution.High;
                    break;
                case 2:
                    this.currentResolution = Resolution.SuperHigh;
                    break;
                default:
                    setVideoID(tTAVPreloaderItem.mVideoID);
                    return;
            }
            if (this.mPreloaderItem != null && !this.mPreloaderItem.equals(tTAVPreloaderItem)) {
                stop();
                this.mIsLocal = false;
                this.mFirstURL = true;
                this.mFirstIP = true;
                this.mState = 0;
                this.mUserStopped = false;
                this.mLastPlaybackTime = 0;
                this.mFetcher = null;
                this.mAPIString = null;
            }
            this.mBeginPlayerTime = mBeginTimeNone;
            this.mStarted = false;
            this.mWatchedDuration = 0;
            this.mIsPreloaderItem = true;
            this.mPreloaderItem = tTAVPreloaderItem;
            this.mBufferingStartT = 0;
            this.urlIPMap.clear();
            this.mVideoID = tTAVPreloaderItem.mVideoID;
            this.mLogger.setLocal(false);
            this.mLogger.setVid(this.mVideoID);
        }
    }

    public void setVideoID(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91356, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91356, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null && !str.equals(this.mVideoID)) {
            TTVideoEngineLog.d("TTVideoEngine", String.format("set video id:%s", new Object[]{str}));
            if (!TextUtils.isEmpty(this.mVideoID)) {
                stop();
            }
            this.mIsLocal = false;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mBeginPlayerTime = mBeginTimeNone;
        this.mWatchedDuration = 0;
        this.mStarted = false;
        this.mVideoID = str;
        this.mBufferingStartT = 0;
        this.mLogger.setLocal(false);
        this.mLogger.setVid(str);
        this.urlIPMap.clear();
    }

    public void setVideoModel(VideoModel videoModel) {
        if (PatchProxy.isSupport(new Object[]{videoModel}, this, changeQuickRedirect, false, 91359, new Class[]{VideoModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoModel}, this, changeQuickRedirect, false, 91359, new Class[]{VideoModel.class}, Void.TYPE);
        } else if (videoModel != null && videoModel.videoRef != null && videoModel.videoRef.mVideoId != null) {
            if (this.mVideoModel != null && !this.mVideoModel.equals(videoModel)) {
                stop();
                this.mIsLocal = false;
                this.mFirstURL = true;
                this.mFirstIP = true;
                this.mState = 0;
                this.mUserStopped = false;
                this.mLastPlaybackTime = 0;
                this.mFetcher = null;
                this.mAPIString = null;
            }
            this.mBeginPlayerTime = mBeginTimeNone;
            this.mStarted = false;
            this.mWatchedDuration = 0;
            this.mVideoModel = videoModel;
            this.mVideoID = videoModel.videoRef.mVideoId;
            this.mIsFeedInfo = true;
            this.mBufferingStartT = 0;
            this.mLogger.setLocal(false);
            this.mLogger.setVid(this.mVideoID);
            this.mLogger.setFeed(videoModel);
        }
    }

    public void _parseIPAddress(VideoModel videoModel) {
        Error error;
        VideoModel videoModel2 = videoModel;
        if (PatchProxy.isSupport(new Object[]{videoModel2}, this, changeQuickRedirect, false, 91405, new Class[]{VideoModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoModel2}, this, changeQuickRedirect, false, 91405, new Class[]{VideoModel.class}, Void.TYPE);
        } else if (videoModel2 == null) {
            _receivedError(new Error("kTTVideoErrorDomainFetchingInfo", -9997));
        } else {
            String[] allVideoURLs = videoModel2.allVideoURLs(this.currentResolution);
            Resolution[] allResolutions = Resolution.getAllResolutions();
            int index = this.currentResolution.getIndex();
            int length = ((allResolutions.length + index) - 1) % allResolutions.length;
            while (true) {
                if (length == index || (allVideoURLs != null && allVideoURLs.length != 0)) {
                    break;
                }
                Resolution resolution = allResolutions[length];
                String[] allVideoURLs2 = videoModel2.allVideoURLs(resolution);
                if (allVideoURLs2 != null && allVideoURLs2.length != 0) {
                    this.currentResolution = resolution;
                    this.mLogger.configResolution(this.currentResolution.toString(), "");
                    allVideoURLs = allVideoURLs2;
                    break;
                }
                length = ((length + allResolutions.length) - 1) % allResolutions.length;
                allVideoURLs = allVideoURLs2;
            }
            int intValue = this.urlIndexMap.get(this.currentResolution).intValue();
            if (allVideoURLs == null || allVideoURLs.length == 0) {
                error = new Error("kTTVideoErrorDomainFetchingInfo", -9997);
            } else if (allVideoURLs.length <= intValue) {
                error = new Error("kTTVideoErrorDomainFetchingInfo", -9996);
            } else {
                error = null;
            }
            if (error != null) {
                _receivedError(error);
                return;
            }
            VideoInfo videoInfo = videoModel2.getVideoInfo(this.currentResolution);
            if (videoInfo != null && this.mDataLoaderEnable > 0 && DataLoaderHelper.getDataLoader().isRunging()) {
                String[] strArr = videoInfo.mURLs;
                if (!(strArr == null || strArr.length <= 0 || videoModel2.videoRef == null)) {
                    String proxyUrl = DataLoaderHelper.getDataLoader().proxyUrl(videoInfo.mFileHash, videoModel2.videoRef.mVideoId, strArr, this.currentResolution, null);
                    if (!TextUtils.isEmpty(proxyUrl)) {
                        this.currentHostnameURL = proxyUrl;
                        this.currentIPURL = proxyUrl;
                        this.mLogger.setProxyUrl(proxyUrl);
                        _playInternal(proxyUrl, null);
                        return;
                    }
                }
            }
            TTVideoEngineLog.d("TTVideoEngine", String.format("current resolution:%s, urls:%s, index:%d", new Object[]{this.currentResolution.toString(), TextUtils.join(",", allVideoURLs), Integer.valueOf(intValue)}));
            this.mPlayerCache = videoModel2.getPreloadInterval(this.currentResolution);
            this.currentHostnameURL = allVideoURLs[intValue];
            this.mURLs = allVideoURLs;
            this.urlIPMap.put(this.currentHostnameURL, "");
            _updateVU();
            _parseDNS(this.currentHostnameURL);
        }
    }

    public void _receivedError(Error error) {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91411, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91411, new Class[]{Error.class}, Void.TYPE);
        } else if (this.mUserStopped) {
            this.mState = 0;
        } else {
            int _getPlayerTime = _getPlayerTime();
            if (this.mPrepared) {
                this.mLastPlaybackTime = _getPlayerTime;
            }
            if (this.mMediaPlayer == null || !(this.mMediaPlayer.getPlayerType() == 0 || this.mMediaPlayer.getPlayerType() == 2)) {
                z = false;
            } else {
                if (this.mMediaPlayer.getPlayerType() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.mMediaPlayer.release();
                this.mMediaPlayer = null;
            }
            this.mErrorCount++;
            this.mAccumulatedErrorCount++;
            int i = 4;
            this.mState = 4;
            TTVideoEngineLog.d("TTVideoEngine", String.format("videoEngine failed:%s", new Object[]{error.toString()}));
            if (this.mErrorCount >= 3) {
                TTVideoEngineLog.d("TTVideoEngine", "videoEngine retry failed");
                this.mLogger.tryErrCount(this.mErrorCount);
                _notifyError(error);
            } else if (this.mAccumulatedErrorCount >= PLAYER_MAX_ACCUMULATED_COUNT) {
                TTVideoEngineLog.d("TTVideoEngine", "videoEngine retry failed:reach maxAccumulatedErrorCount");
                this.mLogger.accuErrCount(this.mAccumulatedErrorCount);
                _notifyError(error);
            } else {
                this.mRetrying = true;
                int retryStrategy = error.getRetryStrategy();
                if (this.mH265Enabled && z) {
                    this.mH265Enabled = false;
                    retryStrategy = 1;
                }
                if (this.mErrorCount == 2) {
                    retryStrategy = 1;
                }
                if (this.mIsLocal || this.mIsDirectURL) {
                    retryStrategy = 3;
                }
                if (this.mIsPlayItem) {
                    this.mIsPlayItem = false;
                    retryStrategy = 1;
                }
                TTVideoEngineLog.d("TTVideoEngine", String.format("retry strategy:%d", new Object[]{Integer.valueOf(retryStrategy)}));
                if (retryStrategy != 0) {
                    this.mLogger.movieShouldRetry(error, retryStrategy);
                }
                if (!error.domain.equals("kTTVideoErrorDomainHTTPDNS") && !error.domain.equals("kTTVideoErrorDomainLocalDNS") && retryStrategy == 2 && this.urlIndexMap.get(this.currentResolution).intValue() == 0) {
                    this.mLogger.mainURLCDNFailed(error, this.currentHostnameURL);
                }
                if (retryStrategy == 3 && !this.mIsLocal) {
                    VideoEventLogger videoEventLogger = this.mLogger;
                    if (this.mIsDirectURL) {
                        str = this.mDirectURL;
                    } else {
                        str = this.currentHostnameURL;
                    }
                    videoEventLogger.playerDidFailed(error, str);
                }
                if (!this.mIsPreloaderItem) {
                    i = retryStrategy;
                }
                if (i == 1 && this.mVideoRouteListener != null) {
                    this.mVideoRouteListener.onFailed(error, this.mAPIString);
                }
                _retry(i, error);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r0 < 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r1 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getIntOption(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r3 = 0
            r4 = 91365(0x164e5, float:1.2803E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 91365(0x164e5, float:1.2803E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0041:
            r0 = 3
            r1 = -1
            switch(r10) {
                case 40: goto L_0x00f3;
                case 41: goto L_0x00ea;
                case 42: goto L_0x00dd;
                case 43: goto L_0x00d0;
                case 44: goto L_0x00c3;
                case 45: goto L_0x00b6;
                case 46: goto L_0x00a9;
                case 47: goto L_0x00a6;
                case 48: goto L_0x008d;
                case 49: goto L_0x0072;
                case 50: goto L_0x006e;
                case 51: goto L_0x006a;
                case 52: goto L_0x005c;
                case 53: goto L_0x0055;
                case 54: goto L_0x0051;
                case 55: goto L_0x004d;
                case 56: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x00fe
        L_0x0048:
            int r0 = r9.mLoadState     // Catch:{ Throwable -> 0x00fc }
        L_0x004a:
            r1 = r0
            goto L_0x00fe
        L_0x004d:
            int r0 = r9.mPlaybackState     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x0051:
            int r0 = r9.mBufferingType     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x0055:
            r9._addWatchedDuration(r8)     // Catch:{ Throwable -> 0x00fc }
            int r0 = r9.mWatchedDuration     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x005c:
            boolean r0 = r9.mSwitchingResolution     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x0064
            int r0 = r9.mLastPlaybackTime     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x0064:
            int r0 = r9._getPlayerTime()     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x006a:
            int r0 = r9.mLoadedProgress     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x006e:
            int r0 = r9.mDuration     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x0072:
            android.content.Context r2 = r9.mContext     // Catch:{ Throwable -> 0x00fc }
            if (r2 == 0) goto L_0x00fe
            android.content.Context r2 = r9.mContext     // Catch:{ Throwable -> 0x00fc }
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Throwable -> 0x00fc }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ Throwable -> 0x00fc }
            if (r2 == 0) goto L_0x0087
            int r0 = r2.getStreamVolume(r0)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x0088
        L_0x0087:
            r0 = -1
        L_0x0088:
            if (r0 >= 0) goto L_0x004a
        L_0x008a:
            r1 = 0
            goto L_0x00fe
        L_0x008d:
            android.content.Context r2 = r9.mContext     // Catch:{ Throwable -> 0x00fc }
            if (r2 == 0) goto L_0x00fe
            android.content.Context r2 = r9.mContext     // Catch:{ Throwable -> 0x00fc }
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Throwable -> 0x00fc }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ Throwable -> 0x00fc }
            if (r2 == 0) goto L_0x00a2
            int r0 = r2.getStreamMaxVolume(r0)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00a3
        L_0x00a2:
            r0 = -1
        L_0x00a3:
            if (r0 >= 0) goto L_0x004a
            goto L_0x008a
        L_0x00a6:
            int r0 = r9.mPlayerType     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00a9:
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x00fe
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            r2 = 140(0x8c, float:1.96E-43)
            int r0 = r0.getIntOption(r2, r1)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00b6:
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x00fe
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            r2 = 141(0x8d, float:1.98E-43)
            int r0 = r0.getIntOption(r2, r1)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00c3:
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x00fe
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            r2 = 158(0x9e, float:2.21E-43)
            int r0 = r0.getIntOption(r2, r1)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00d0:
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x00fe
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            r2 = 157(0x9d, float:2.2E-43)
            int r0 = r0.getIntOption(r2, r1)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00dd:
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x00fe
            com.ss.ttm.player.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Throwable -> 0x00fc }
            r2 = 153(0x99, float:2.14E-43)
            int r0 = r0.getIntOption(r2, r8)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00ea:
            com.ss.ttvideoengine.log.VideoEventLogger r0 = r9.mLogger     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x00fe
            com.ss.ttvideoengine.log.VideoEventLogger r0 = r9.mLogger     // Catch:{ Throwable -> 0x00fc }
            int r0 = r0.mCurDecoderBufferAccuT     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00f3:
            com.ss.ttvideoengine.log.VideoEventLogger r0 = r9.mLogger     // Catch:{ Throwable -> 0x00fc }
            if (r0 == 0) goto L_0x00fe
            com.ss.ttvideoengine.log.VideoEventLogger r0 = r9.mLogger     // Catch:{ Throwable -> 0x00fc }
            int r0 = r0.mCurDecoderBufferCount     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00ff
        L_0x00fc:
            r0 = -1
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.getIntOption(int):int");
    }

    public void setAsyncInit(boolean z, int i) {
        this.mAsyncInitEnable = z ? 1 : 0;
        this.mCodecId = i;
    }

    public void setExternLogListener(ExternVideoLoggerListener externVideoLoggerListener, String str) {
        this.mExternVideoLoggerListener = externVideoLoggerListener;
        this.mExternLogKey = str;
    }

    private void _playVideo(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, changeQuickRedirect, false, 91408, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, changeQuickRedirect, false, 91408, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("start to play video, host:%s, ip:%s", new Object[]{str, str2}));
        this.currentIPURL = str2;
        this.currentHost = str;
        String format = String.format(" %s", new Object[]{str});
        HashMap hashMap = new HashMap();
        hashMap.put("host", format);
        _playInternal(str2, hashMap);
    }

    public static void setIntValue(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 91353, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 91353, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().setIntValue(i, i2);
    }

    public static void setStringValue(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 91354, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 91354, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().setStringValue(i, str2);
    }

    public void _seekTo(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91397, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 91397, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("_seekTo:%d", new Object[]{Integer.valueOf(i)}));
        if (this.mMediaPlayer != null) {
            if (!this.mSeeking) {
                _addWatchedDuration(false);
            }
            this.mSeeking = true;
            this.mMediaPlayer.seekTo(i);
            this.mLogger.seekTo(i, z);
            return;
        }
        _seekComplete(false);
    }

    public void seekTo(int i, SeekCompletionListener seekCompletionListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), seekCompletionListener}, this, changeQuickRedirect, false, 91392, new Class[]{Integer.TYPE, SeekCompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), seekCompletionListener}, this, changeQuickRedirect, false, 91392, new Class[]{Integer.TYPE, SeekCompletionListener.class}, Void.TYPE);
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("seek to time:%d", new Object[]{Integer.valueOf(i)}));
        this.mSeekCompletionListener = seekCompletionListener;
        _seekTo(i, false);
    }

    public void setTestSpeedEnable(int i, TestNetSpeedListener testNetSpeedListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), testNetSpeedListener}, this, changeQuickRedirect, false, 91388, new Class[]{Integer.TYPE, TestNetSpeedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), testNetSpeedListener}, this, changeQuickRedirect, false, 91388, new Class[]{Integer.TYPE, TestNetSpeedListener.class}, Void.TYPE);
            return;
        }
        this.mTestNetSpeed = i;
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setIntOption(79, i);
        }
        this.mTestNetSpeedListener = testNetSpeedListener;
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91332, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91332, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mVolume = f2;
        _setPlayerVolume(f2, f3);
    }

    public TTVideoEngine(Context context, int i) {
        boolean z;
        boolean z2 = true;
        this.mKsyFrameWait = 1;
        this.mSuperResStrengh = 5;
        this.mBufferTimeout = 30;
        this.mNetworkTimeout = 5;
        this.mMaxBufferDataMilliSeconds = 5000;
        this.mAuthorization = "";
        this.mMediaCodecRender = 1;
        this.mFirstGetWidthHeight = true;
        this.mDecryptionKey = "";
        this.mBeginPlayerTime = mBeginTimeNone;
        this.mLocalURL = "";
        this.mDirectURL = "";
        this.mGroupID = "";
        this.mTag = "";
        this.mFirstURL = true;
        this.mFirstIP = true;
        this.mVolume = -1.0f;
        this.mIsStartPlayAutomatically = true;
        this.mBufferingType = -1;
        TTVideoEngineLog.d("TTVideoEngine", "init");
        this.mContext = context;
        this.mIsMute = false;
        this.mFirstURL = true;
        this.mFirstIP = true;
        this.currentResolution = Resolution.Standard;
        this.urlIndexMap = new HashMap();
        this.urlIndexMap.put(Resolution.Standard, 0);
        this.urlIndexMap.put(Resolution.High, 0);
        this.urlIndexMap.put(Resolution.SuperHigh, 0);
        this.urlIPMap = new HashMap();
        this.mPlayerType = i;
        this.mTextureFirstFrame = false;
        this.mNotifyFirstFrame = false;
        TTPlayerConfiger.setValue(6, false);
        if (i != 2) {
            z = true;
        } else {
            z = false;
        }
        TTPlayerConfiger.setValue(1, z);
        TTPlayerConfiger.setValue(2, i != 1 ? false : z2);
        TTPlayerConfiger.setValue(11, false);
        TTPlayerConfiger.setValue(4, false);
        this.mLogger = new VideoEventLogger(new MyLoggerDataSource(this));
        this.mLogger.configResolution(this.currentResolution.toString(), "");
    }

    private void _retry(int i, Error error) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), error}, this, changeQuickRedirect, false, 91412, new Class[]{Integer.TYPE, Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), error}, this, changeQuickRedirect, false, 91412, new Class[]{Integer.TYPE, Error.class}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                _notifyError(error);
                return;
            case 1:
                _fetchVideoInfo();
                return;
            case 2:
                _tryNextURL();
                return;
            case 3:
                if (this.mIsLocal || this.mIsDirectURL) {
                    if (this.mIsLocal) {
                        str = this.mLocalURL;
                    } else {
                        str = this.mDirectURL;
                    }
                    _playInternal(str, null);
                    return;
                }
                _playVideo(this.currentHost, this.currentIPURL);
                return;
            case 4:
                _tryNextPrelaoderItemUrl();
                break;
        }
    }

    private void _setPlayerVolume(float f2, float f3) {
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91333, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91333, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.mMediaPlayer != null) {
            if (this.mMediaPlayer.isOSPlayer()) {
                f4 = 1.0f;
                if (f2 != 0.0f) {
                    f5 = 1.0f;
                } else {
                    f4 = f2;
                    f5 = f3;
                }
                AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.setStreamVolume(3, (int) f2, 0);
                }
            } else {
                f4 = f2;
                f5 = f3;
            }
            this.mMediaPlayer.setVolume(f4, f5);
        }
    }

    public void _updateLoadState(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91420, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91420, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mLoadState != i) {
            TTVideoEngineLog.d("TTVideoEngine", String.format("load state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(this.mLoadState), Integer.valueOf(i)}));
            if (i == 2 && this.mHasFirstFrameShown && !this.mSeeking) {
                this.mLogger.movieStalled(i2);
            }
            this.mLoadState = i;
            if (!(this.mVideoEngineListener == null || i2 == 1)) {
                this.mVideoEngineListener.onLoadStateChanged(this, this.mLoadState);
            }
        }
    }

    public void setDirectUrlUseDataLoader(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, changeQuickRedirect, false, 91340, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, changeQuickRedirect, false, 91340, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2) || !DataLoaderHelper.getDataLoader().isRunging() || this.mDataLoaderEnable <= 0) {
                setDirectURL(str);
            } else {
                String str3 = str2;
                String proxyUrl = DataLoaderHelper.getDataLoader().proxyUrl(str3, this.mVideoID, new String[]{str}, Resolution.Undefine, this.mDecryptionKey);
                if (TextUtils.isEmpty(proxyUrl)) {
                    setDirectURL(str);
                } else {
                    this.mLogger.setEnableMDL(1);
                    this.mLogger.setProxyUrl(proxyUrl);
                    setDirectURL(proxyUrl);
                }
            }
        }
    }

    public void setDirectUrlsUseDataLoader(String[] strArr, String str) {
        if (PatchProxy.isSupport(new Object[]{strArr, str}, this, changeQuickRedirect, false, 91341, new Class[]{String[].class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, str}, this, changeQuickRedirect, false, 91341, new Class[]{String[].class, String.class}, Void.TYPE);
        } else if (strArr != null && strArr.length != 0) {
            if (TextUtils.isEmpty(str) || !DataLoaderHelper.getDataLoader().isRunging() || this.mDataLoaderEnable <= 0) {
                setDirectURL(strArr[0]);
            } else {
                String proxyUrl = DataLoaderHelper.getDataLoader().proxyUrl(str, this.mVideoID, strArr, Resolution.Undefine, this.mDecryptionKey);
                if (TextUtils.isEmpty(proxyUrl)) {
                    setDirectURL(strArr[0]);
                } else {
                    this.mLogger.setEnableMDL(1);
                    this.mLogger.setProxyUrl(proxyUrl);
                    setDirectURL(proxyUrl);
                }
            }
        }
    }

    public void setIntOption(int i, int i2) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91364, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91364, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i != 183) {
            switch (i) {
                case 0:
                    this.mPlayerCache = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(24, i2);
                        break;
                    }
                    break;
                case 1:
                    this.mEnhancementType = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(37, i2);
                        break;
                    }
                    break;
                case 2:
                    this.mScaleType = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(38, i2);
                        break;
                    }
                    break;
                case 3:
                    TTPlayerConfiger.setValue(11, i2);
                    break;
                case 4:
                    this.mLayoutType = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(36, i2);
                        break;
                    }
                    break;
                case 5:
                    this.mRenderType = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(56, i2);
                        break;
                    }
                    break;
                case 6:
                    if (i2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mH265Enabled = z;
                    break;
                case e.l:
                    this.mHardwareDecodeEnable = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(59, i2);
                        break;
                    }
                    break;
                case 8:
                    this.mCacheFileEnable = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(14, 1);
                        break;
                    }
                    break;
                case 9:
                    this.mDecoderType = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(67, i2);
                        break;
                    }
                    break;
                case 10:
                    this.mBufferDataMilliSeconds = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(86, i2);
                        break;
                    }
                    break;
                case 11:
                    this.mBufferTimeout = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(81, i2);
                        break;
                    }
                    break;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    this.mNetworkTimeout = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(9, PLAYER_TIME_BASE * i2);
                        break;
                    }
                    break;
                case 13:
                    this.mSetTrackVolume = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(94, i2);
                        break;
                    }
                    break;
                case 14:
                    this.mTestNetSpeedDiff = i2;
                    if (this.mTestNetSpeedDiff < 500) {
                        this.mTestNetSpeedDiff = 500;
                    }
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(66, this.mTestNetSpeedDiff);
                        break;
                    }
                    break;
                case 15:
                    this.mMaxBufferDataMilliSeconds = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(110, i2);
                        break;
                    }
                    break;
                case SearchJediMixFeedAdapter.f42514c:
                    this.mMovPreferNearestSample = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(95, i2);
                        break;
                    }
                    break;
                case 17:
                    this.mSkipFfmpegFindStreamInfo = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(96, i2);
                        break;
                    }
                    break;
                case 18:
                    this.mMaxFps = i2;
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(134, i2);
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case 100:
                            if (i2 != 0) {
                                this.mIsStartPlayAutomatically = true;
                                break;
                            } else {
                                this.mIsStartPlayAutomatically = false;
                                break;
                            }
                        case BaseLoginOrRegisterActivity.o:
                            if (this.mLogger != null) {
                                this.mLogger.isSendEvent = i2;
                                break;
                            }
                            break;
                        case 102:
                            if (this.mFrameDropNum >= 0) {
                                this.mFrameDropNum = i2;
                                if (this.mMediaPlayer != null) {
                                    this.mMediaPlayer.setIntOption(159, i2);
                                    break;
                                }
                            } else {
                                return;
                            }
                            break;
                        case 103:
                            this.mKsyFrameWait = i2;
                            if (this.mMediaPlayer != null) {
                                this.mMediaPlayer.setIntOption(192, i2);
                                break;
                            }
                            break;
                        case 104:
                            this.mDataLoaderEnable = i2;
                            break;
                        default:
                            switch (i) {
                                case 110:
                                    this.mSuperRes = i2;
                                    if (this.mMediaPlayer != null) {
                                        this.mMediaPlayer.setIntOption(165, i2);
                                        break;
                                    }
                                    break;
                                case 111:
                                    this.mSuperResFxaa = i2;
                                    if (this.mMediaPlayer != null) {
                                        this.mMediaPlayer.setIntOption(166, i2);
                                        break;
                                    }
                                    break;
                                case SearchJediMixFeedAdapter.f42516e:
                                    this.mSuperResStrengh = i2;
                                    if (this.mMediaPlayer != null) {
                                        this.mMediaPlayer.setIntOption(167, i2);
                                        break;
                                    }
                                    break;
                                case 113:
                                    this.mLoopReferVideo = i2;
                                    if (this.mMediaPlayer != null) {
                                        this.mMediaPlayer.setIntOption(195, i2);
                                        break;
                                    }
                                    break;
                                case 114:
                                    this.mSkipAudioGraph = i2;
                                    if (this.mMediaPlayer != null) {
                                        this.mMediaPlayer.setIntOption(199, i2);
                                        break;
                                    }
                                    break;
                                case 115:
                                    this.mMediaCodecRender = i2;
                                    if (this.mMediaPlayer != null) {
                                        this.mMediaPlayer.setIntOption(88, i2);
                                        break;
                                    }
                                    break;
                                case 116:
                                    this.mUseMediacodecAudio = i2;
                                    if (this.mMediaPlayer != null) {
                                        this.mMediaPlayer.setIntOption(97, i2);
                                        break;
                                    }
                                    break;
                                case 117:
                                    TTPlayerConfiger.setValue(4, i2);
                                    break;
                            }
                    }
            }
        } else {
            this.mEGLNeedWorkAround = i2;
            if (this.mMediaPlayer != null) {
                this.mMediaPlayer.setIntOption(183, i2);
            }
        }
        TTVideoEngineLog.d("TTVideoEngine", String.format("set int option key:%d value:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private void _playInternal(String str, HashMap hashMap) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        HashMap hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{str5, hashMap2}, this, changeQuickRedirect, false, 91409, new Class[]{String.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, hashMap2}, this, changeQuickRedirect, false, 91409, new Class[]{String.class, HashMap.class}, Void.TYPE);
            return;
        }
        if (this.mMediaPlayer == null) {
            if (this.mPlayerType == 10) {
                this.mMediaPlayer = IJKPlayerWrapper.create(this.mContext);
            }
            if (this.mMediaPlayer == null) {
                this.mMediaPlayer = MediaPlayerWrapper.create(this.mContext);
            }
            if (this.mMediaPlayer == null) {
                _notifyError(new Error("kTTVideoErrorDomainVideoOwnPlayer", -9993, "create player failed"));
                return;
            }
            if (this.mMediaPlayer.getClass() == MediaPlayerWrapper.class && ((MediaPlayerWrapper) this.mMediaPlayer).hasException() && this.mLogger != null) {
                this.mLogger.logPluginException(((MediaPlayerWrapper) this.mMediaPlayer).getExceptionStr());
            }
            if (!this.mH265Enabled || this.mMediaPlayer == null || !this.mMediaPlayer.isOSPlayer()) {
                switch (this.mMediaPlayer.getPlayerType()) {
                    case 0:
                        this.mPlayerType = 2;
                        break;
                    case 1:
                        this.mPlayerType = 0;
                        break;
                    case 2:
                        this.mPlayerType = 1;
                        break;
                }
                if (this.mCacheFileEnable == 1 && this.mDataLoaderEnable <= 0) {
                    this.mMediaPlayer.setIntOption(14, 1);
                }
                if (this.mLogger != null) {
                    this.mLogger.useCacheFile(this.mCacheFileEnable);
                    this.mLogger.enableStartPlayAutomatically(this.mIsStartPlayAutomatically);
                }
                this.mMediaPlayer.setIntOption(196, this.mIsStartPlayAutomatically ^ true ? 1 : 0);
                this.mMediaPlayer.setIntOption(86, this.mBufferDataMilliSeconds);
                this.mMediaPlayer.setIntOption(81, this.mBufferTimeout);
                this.mMediaPlayer.setIntOption(9, this.mNetworkTimeout * PLAYER_TIME_BASE);
                this.mMediaPlayer.setIntOption(79, this.mTestNetSpeed);
                this.mMediaPlayer.setIntOption(66, this.mTestNetSpeedDiff);
                this.mMediaPlayer.setIntOption(110, this.mMaxBufferDataMilliSeconds);
                this.mMediaPlayer.setIntOption(183, this.mEGLNeedWorkAround);
                this.mMediaPlayer.setIntOption(67, this.mDecoderType);
                this.mMediaPlayer.setIntOption(111, this.mUnsupportSampleRatesInBinary);
                this.mMediaPlayer.setIntOption(159, this.mFrameDropNum);
                this.mMediaPlayer.setIntOption(195, this.mLoopReferVideo);
                if (this.mLogger != null) {
                    this.mLogger.setFramesDropNum(this.mFrameDropNum);
                }
                this.mLogger.decoderType(this.mDecoderType);
                this.mLogger.setEnableMDL(this.mDataLoaderEnable);
                if ((this.mMediaPlayer.getPlayerType() == 1 || this.mMediaPlayer.getPlayerType() == 2) && this.mPreloaderItem != null && this.mIsPreloaderItem) {
                    this.mMediaPlayer.setIntOption(14, 1);
                    if (this.mPreloaderItem.mCurUrlIndex == 0) {
                        this.mMediaPlayer.setStringOption(17, this.mPreloaderItem.mFileKey);
                        this.mMediaPlayer.setCacheFile(this.mPreloaderItem.mFilePath, 1);
                        this.mMediaPlayer.setIntOption(18, 20);
                    }
                }
                if (this.mPlayerCache != 0 && this.mCacheControlEnabled) {
                    this.mMediaPlayer.setIntOption(24, this.mPlayerCache);
                }
                if (this.mVolume >= 0.0f) {
                    _setPlayerVolume(this.mVolume, this.mVolume);
                }
                if (this.mPlaybackParams != null && !isSystemPlayer()) {
                    this.mMediaPlayer.setPlaybackParams(this.mPlaybackParams);
                    this.mLogger.setPlaybackParams(this.mPlaybackParams);
                }
                this.mMediaPlayer.setIntOption(37, this.mEnhancementType);
                this.mMediaPlayer.setIntOption(38, this.mScaleType);
                this.mMediaPlayer.setIntOption(36, this.mLayoutType);
                this.mMediaPlayer.setIntOption(56, this.mRenderType);
                if (!(this.mMediaPlayer.getPlayerType() == 1 || this.mMediaPlayer.getPlayerType() == 2)) {
                    this.mHardwareDecodeEnable = 0;
                }
                if (this.mHardwareDecodeEnable == 1) {
                    this.mMediaPlayer.setIntOption(181, this.mAsyncInitEnable);
                    this.mMediaPlayer.setIntOption(182, this.mCodecId);
                    this.mLogger.useAsyncInit(this.mAsyncInitEnable, this.mCodecId);
                }
                this.mMediaPlayer.setIntOption(59, this.mHardwareDecodeEnable);
                this.mLogger.useHardwareDecode(this.mHardwareDecodeEnable);
                if (!TextUtils.isEmpty(this.mDecryptionKey)) {
                    this.mMediaPlayer.setStringOption(64, this.mDecryptionKey);
                }
                this.mMediaPlayer.setIntOption(94, this.mSetTrackVolume);
                this.mMediaPlayer.setIntOption(95, this.mMovPreferNearestSample);
                this.mMediaPlayer.setIntOption(96, this.mSkipFfmpegFindStreamInfo);
                this.mMediaPlayer.setIntOption(134, this.mMaxFps);
                this.mMediaPlayer.setIntOption(192, this.mKsyFrameWait);
                this.mMediaPlayer.setIntOption(165, this.mSuperRes);
                if (this.mLogger != null) {
                    this.mLogger.useSuperRes(this.mSuperRes);
                }
                this.mMediaPlayer.setIntOption(166, this.mSuperResFxaa);
                this.mMediaPlayer.setIntOption(167, this.mSuperResStrengh);
                this.mMediaPlayer.setIntOption(199, this.mSkipAudioGraph);
                this.mMediaPlayer.setIntOption(88, this.mMediaCodecRender);
                if (this.mLogger != null) {
                    this.mLogger.setMediaCodecRender(this.mMediaCodecRender);
                }
                this.mMediaPlayer.setIntOption(97, this.mUseMediacodecAudio);
                this.mMediaPlayer.setOnPreparedListener(new MyPreparedListener(this));
                this.mMediaPlayer.setOnBufferingUpdateListener(new MyBufferingUpdateListener(this));
                this.mMediaPlayer.setOnCompletionListener(new MyCompletionListener(this));
                this.mMediaPlayer.setOnErrorListener(new MyErrorListener(this));
                this.mMediaPlayer.setOnSeekCompleteListener(new MySeekCompletionListener(this));
                this.mMediaPlayer.setOnInfoListener(new MyInfoListener(this));
                this.mMediaPlayer.setOnVideoSizeChangedListener(new MyOnVideoSizeChangedListener(this));
                if (this.mSurfaceHolder != null) {
                    this.mMediaPlayer.setDisplay(this.mSurfaceHolder);
                }
                if (this.mSurface != null) {
                    this.mMediaPlayer.setSurface(this.mSurface);
                }
                this.mMediaPlayer.setScreenOnWhilePlaying(true);
                _setPlayerMute(this.mIsMute);
                this.mPrepared = false;
            } else {
                _receivedError(new Error("kTTVideoErrorDomainVideoOwnPlayer", -9993, "create own player failed"));
                return;
            }
        } else if (this.mError != null || this.mSwitchingResolution) {
            TTVideoEngineLog.d("TTVideoEngine", "mediaPlayer reset");
            this.mMediaPlayer.reset();
            if (this.mCacheFileEnable == 1 && this.mDataLoaderEnable <= 0) {
                this.mMediaPlayer.setIntOption(14, 1);
            }
            this.mLogger.useCacheFile(this.mCacheFileEnable);
            if ((this.mMediaPlayer.getPlayerType() == 1 || this.mMediaPlayer.getPlayerType() == 2) && this.mPreloaderItem != null && this.mIsPreloaderItem) {
                this.mMediaPlayer.setIntOption(14, 1);
                if (this.mPreloaderItem.mCurUrlIndex == 0) {
                    this.mMediaPlayer.setStringOption(17, this.mPreloaderItem.mFileKey);
                    this.mMediaPlayer.setCacheFile(this.mPreloaderItem.mFilePath, 1);
                    this.mMediaPlayer.setIntOption(18, 20);
                }
            }
            if (this.mSurfaceHolder != null) {
                this.mMediaPlayer.setDisplay(this.mSurfaceHolder);
            }
            if (this.mSurface != null) {
                this.mMediaPlayer.setSurface(this.mSurface);
            }
            this.mPrepared = false;
            this.mError = null;
        }
        try {
            if (!this.mPrepared) {
                TTVideoEngineLog.d("TTVideoEngine", "set screen on");
                this.mMediaPlayer.setScreenOnWhilePlaying(true);
                this.mMediaPlayer.setLooping(this.mLooping);
                if (this.mMediaPlayer.getClass() != IJKPlayerWrapper.class || str5 == null || !str.startsWith("http")) {
                    str4 = str5;
                } else {
                    str4 = "ijkhttphook:" + str;
                }
                this.mMediaPlayer.setDataSource(this.mContext, Uri.parse(str4), (Map<String, String>) hashMap2);
            }
            if (this.mIsDirectURL) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap3 = new HashMap();
                hashMap3.put(PushConstants.WEB_URL, this.mDirectURL);
                if (this.mGroupID != null) {
                    hashMap3.put("gid", this.mGroupID);
                }
                arrayList.add(hashMap3);
                this.mLogger.setVUArray(arrayList);
            }
            if (!this.mPrepared) {
                try {
                    if (this.mLogger != null) {
                        this.mLogger.setPrepareT();
                    }
                    this.mMediaPlayer.prepareAsync();
                    if (this.mLogger != null) {
                        this.mLogger.prepareStart();
                    }
                    if (this.mVideoEngineListener != null) {
                        this.mVideoEngineListener.onPrepare(this);
                    }
                } catch (Exception unused) {
                    if (this.mMediaPlayer.isOSPlayer()) {
                        str3 = "kTTVideoErrorDomainVideoOSPlayer";
                    } else {
                        str3 = "kTTVideoErrorDomainVideoOwnPlayer";
                    }
                    _receivedError(new Error(str3, -9992));
                    return;
                }
            } else {
                _resumeVideo();
            }
            this.mState = 3;
        } catch (Throwable unused2) {
            if (this.mMediaPlayer.isOSPlayer()) {
                str2 = "kTTVideoErrorDomainVideoOSPlayer";
            } else {
                str2 = "kTTVideoErrorDomainVideoOwnPlayer";
            }
            _receivedError(new Error(str2, -9992));
        }
    }

    public static void addTask(String str, String str2, String str3, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, new Long(j2)}, null, changeQuickRedirect, true, 91345, new Class[]{String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, str2, str3, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 91345, new Class[]{String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().addTask(str, str2, str3, j);
    }

    public static void addTask(String str, String str2, String[] strArr, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, strArr, new Long(j2)}, null, changeQuickRedirect, true, 91346, new Class[]{String.class, String.class, String[].class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, str2, strArr, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 91346, new Class[]{String.class, String.class, String[].class, Long.TYPE}, Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().addTask(str, str2, strArr, j);
    }
}
