package com.ss.ttvideoengine.log;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VideoEventLogger {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int isSendEvent = 1;
    private int mAsyncCodecId = -1;
    private int mAsyncInit;
    private int mBufferDataSeconds;
    private int mCacheFile;
    public int mCurDecoderBufferAccuT;
    public int mCurDecoderBufferCount;
    private String mCurrentResolution = "";
    private EventLoggerSource mDataSource;
    private long mDecodeBufferingStartT;
    private int mDecoderType;
    private int mDuration;
    private int mEnabelMDL = -1;
    private ArrayList mErrorInfo;
    private VideoEvent mEvent;
    private Map mFeedInfo;
    private ArrayList mFirstDNSErrorInfo;
    private int mFramesSetDropNum = -1;
    private int mHW;
    private int mHeight;
    private String mInitialIP;
    private String mInitialURL;
    private boolean mIsLocal;
    private int mIsStartPlayAutomatically;
    private String mLastResolution = "";
    private boolean mLeave;
    private int mLoopCount;
    private Map mMainError;
    private int mMediaCodecRender = -1;
    private String mMessage = "";
    private Map mPlayItem;
    private Map mPlaybackParams;
    private int mPreload;
    private Map mPreloadInfo;
    private long mPrepareT;
    private String mProxyUrl = "";
    private ArrayList mRetryFetchErrorInfo;
    private int mSuperRes;
    private long mSurfaceSetTime;
    private String mTag = "";
    private int mType;
    private ArrayList mVUArray;
    private String mVid = "";
    private Map mVideoInfo;
    private int mWidth;

    public interface EventLoggerSource {
        Map bytesInfo();

        long getLogValueLong(int i);

        String getLogValueStr(int i);

        String playerInfo();

        Map versionInfo();
    }

    public void updateLoopCount() {
        this.mLoopCount++;
    }

    public void watchFinish() {
        if (this.mEvent != null) {
            this.mEvent.finish = 1;
        }
    }

    private void _clear() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91530, new Class[0], Void.TYPE);
            return;
        }
        this.mLeave = true;
        this.mRetryFetchErrorInfo.clear();
        this.mFirstDNSErrorInfo.clear();
        this.mErrorInfo.clear();
        this.mMainError.clear();
    }

    private void _flushEvent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91531, new Class[0], Void.TYPE);
        } else if (this.mEvent.lt > 0) {
            _sendEvent();
        } else {
            this.mEvent.lt = System.currentTimeMillis();
            _sendEvent();
        }
    }

    public void decoderBufferStartT() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91518, new Class[0], Void.TYPE);
        } else if (this.mEvent != null) {
            this.mDecodeBufferingStartT = System.currentTimeMillis();
        }
    }

    public void firstBufferEndT() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91517, new Class[0], Void.TYPE);
            return;
        }
        if (this.mEvent != null && this.mEvent.firstBufferEndT == 0) {
            this.mEvent.firstBufferEndT = System.currentTimeMillis();
        }
    }

    public void firstBufferStartT() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91516, new Class[0], Void.TYPE);
            return;
        }
        if (this.mEvent != null && this.mEvent.firstBufferStartT == 0) {
            this.mEvent.firstBufferStartT = System.currentTimeMillis();
        }
    }

    public void movieBufferDidReachEnd() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91520, new Class[0], Void.TYPE);
            return;
        }
        if (this.mEvent.bft == 0) {
            this.mEvent.bft = System.currentTimeMillis();
        }
    }

    public void prepareEnd() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91510, new Class[0], Void.TYPE);
            return;
        }
        this.mEvent.prepare_end_time = System.currentTimeMillis();
    }

    public void prepareStart() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91509, new Class[0], Void.TYPE);
            return;
        }
        this.mEvent.prepare_start_time = System.currentTimeMillis();
    }

    public void setPrepareT() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91499, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91499, new Class[0], Void.TYPE);
            return;
        }
        this.mPrepareT = System.currentTimeMillis();
    }

    public void showedOneFrame() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91512, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91512, new Class[0], Void.TYPE);
            return;
        }
        this.mLeave = false;
        this.mEvent.vt = System.currentTimeMillis();
    }

    public void surfaceSetTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91525, new Class[0], Void.TYPE);
            return;
        }
        this.mSurfaceSetTime = System.currentTimeMillis();
    }

    public void userCancelled() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91528, new Class[0], Void.TYPE);
            return;
        }
        _flushEvent();
    }

    public void decoderBufferEndT() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91519, new Class[0], Void.TYPE);
        } else if (this.mEvent != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mDecodeBufferingStartT > 0 && currentTimeMillis >= this.mDecodeBufferingStartT) {
                this.mEvent.decoderBufferAccuT += currentTimeMillis - this.mDecodeBufferingStartT;
                this.mCurDecoderBufferAccuT = (int) this.mEvent.decoderBufferAccuT;
                this.mDecodeBufferingStartT = 0;
            }
        }
    }

    public void movieFinish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91524, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLeave) {
            this.mEvent.lt = System.currentTimeMillis();
        } else {
            this.mEvent.et = System.currentTimeMillis();
        }
        _sendEvent();
        _clear();
        this.mEvent = new VideoEvent();
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91496, new Class[0], Void.TYPE);
            return;
        }
        if (!this.mLeave || this.mEvent.pt <= 0) {
            this.mEvent.et = System.currentTimeMillis();
            _sendEvent();
        } else {
            _flushEvent();
        }
        this.mDataSource = null;
    }

    private void _sendEvent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91532, new Class[0], Void.TYPE);
        } else if (this.mEvent != null && this.isSendEvent != 0) {
            if (this.mEvent.pt != 0 || this.mEvent.st != 0) {
                if (this.mVideoInfo != null) {
                    this.mEvent.vd = ((Integer) this.mVideoInfo.get("duration")).intValue();
                    this.mEvent.vs = ((Long) ((Map) this.mVideoInfo.get("size")).get(this.mCurrentResolution)).longValue();
                    this.mEvent.codec_type = (String) this.mVideoInfo.get("codec");
                } else {
                    this.mEvent.vd = this.mDuration;
                }
                if (this.mDataSource != null) {
                    Map versionInfo = this.mDataSource.versionInfo();
                    if (versionInfo != null) {
                        this.mEvent.sv = (String) versionInfo.get("sv");
                        this.mEvent.pv = (String) versionInfo.get("pv");
                        this.mEvent.pc = (String) versionInfo.get("pc");
                        this.mEvent.sdk_version = (String) versionInfo.get("sdk_version");
                    }
                    Map bytesInfo = this.mDataSource.bytesInfo();
                    if (bytesInfo != null) {
                        this.mEvent.vps = ((Long) bytesInfo.get("vps")).longValue();
                        this.mEvent.vds = ((Long) bytesInfo.get("vds")).longValue();
                        this.mEvent.download_speed = ((Long) bytesInfo.get("download_speed")).longValue();
                        String str = (String) bytesInfo.get("wifi_identify");
                        if (!TextUtils.isEmpty(str)) {
                            this.mEvent.wifiIdentify = str;
                        }
                    }
                    String logValueStr = this.mDataSource.getLogValueStr(0);
                    if (!TextUtils.isEmpty(logValueStr)) {
                        this.mEvent.codec_type = logValueStr;
                    }
                    String playerInfo = this.mDataSource.playerInfo();
                    if (!TextUtils.isEmpty(playerInfo)) {
                        logMessage(playerInfo);
                    }
                    if (this.mEvent.dnsT <= 0) {
                        this.mEvent.dnsT = this.mDataSource.getLogValueLong(7);
                    }
                    if (this.mEvent.tranConnectT <= 0) {
                        this.mEvent.tranConnectT = this.mDataSource.getLogValueLong(10);
                    }
                    if (this.mEvent.tranFirstPacketT <= 0) {
                        this.mEvent.tranFirstPacketT = this.mDataSource.getLogValueLong(11);
                    }
                    if (this.mEvent.receiveFirstVideoFrameT <= 0) {
                        this.mEvent.receiveFirstVideoFrameT = this.mDataSource.getLogValueLong(12);
                    }
                    if (this.mEvent.receiveFirstAudioFrameT <= 0) {
                        this.mEvent.receiveFirstAudioFrameT = this.mDataSource.getLogValueLong(13);
                    }
                    if (this.mEvent.decodeFirstVideoFrameT <= 0) {
                        this.mEvent.decodeFirstVideoFrameT = this.mDataSource.getLogValueLong(14);
                    }
                    if (this.mEvent.decodeFirstAudioFrameT <= 0) {
                        this.mEvent.decodeFirstAudioFrameT = this.mDataSource.getLogValueLong(15);
                    }
                    if (this.mEvent.videoDeviceStartTime <= 0) {
                        this.mEvent.videoDeviceStartTime = this.mDataSource.getLogValueLong(17);
                    }
                    if (this.mEvent.audioDeviceStartTime <= 0) {
                        this.mEvent.audioDeviceStartTime = this.mDataSource.getLogValueLong(16);
                    }
                    if (this.mEvent.videoDeviceOpenedTime <= 0) {
                        this.mEvent.videoDeviceOpenedTime = this.mDataSource.getLogValueLong(19);
                    }
                    if (this.mEvent.audioDeviceOpenedTime <= 0) {
                        this.mEvent.audioDeviceOpenedTime = this.mDataSource.getLogValueLong(18);
                    }
                }
                this.mEvent.mFramesSetDropNum = this.mFramesSetDropNum;
                this.mEvent.surfaceSetTime = this.mSurfaceSetTime;
                this.mEvent.prepareStartT = this.mPrepareT;
                this.mEvent.v = this.mVid;
                this.mEvent.vu = this.mVUArray;
                this.mEvent.lf = this.mLastResolution;
                this.mEvent.df = this.mCurrentResolution;
                this.mEvent.type = this.mType;
                this.mEvent.merror = this.mMainError;
                this.mEvent.cacheFile = this.mCacheFile;
                this.mEvent.isStartPlayAutomatically = this.mIsStartPlayAutomatically;
                this.mEvent.bufferSeconds = this.mBufferDataSeconds;
                this.mEvent.decoderType = this.mDecoderType;
                this.mEvent.hw = this.mHW;
                this.mEvent.preload = this.mPreload;
                this.mEvent.loopCount = (long) this.mLoopCount;
                this.mEvent.tag = this.mTag;
                this.mEvent.width = (long) this.mWidth;
                this.mEvent.height = (long) this.mHeight;
                this.mEvent.superRes = this.mSuperRes;
                this.mEvent.mediaCodecRender = this.mMediaCodecRender;
                this.mEvent.asyncInit = this.mAsyncInit;
                this.mEvent.asyncCodecId = this.mAsyncCodecId;
                this.mEvent.chipBoardName = this.mDataSource.getLogValueStr(31);
                this.mEvent.chipHardwareName = this.mDataSource.getLogValueStr(32);
                HashMap hashMap = new HashMap();
                for (int i = 0; i < this.mRetryFetchErrorInfo.size(); i++) {
                    hashMap.put(String.format("fetch%d", new Object[]{Integer.valueOf(i)}), ((Error) this.mRetryFetchErrorInfo.get(i)).toMap());
                }
                for (int i2 = 0; i2 < this.mFirstDNSErrorInfo.size(); i2++) {
                    hashMap.put(String.format("ldns%d", new Object[]{Integer.valueOf(i2)}), ((Error) this.mFirstDNSErrorInfo.get(i2)).toMap());
                }
                for (int i3 = 0; i3 < this.mErrorInfo.size(); i3++) {
                    hashMap.put(String.format("error%d", new Object[]{Integer.valueOf(i3)}), this.mErrorInfo.get(i3));
                }
                hashMap.put("log", this.mMessage);
                this.mMessage = "";
                this.mEvent.ex = hashMap;
                if (this.mEvent.br > 0) {
                    this.mEvent.br = 1;
                }
                if (this.mFeedInfo != null) {
                    this.mEvent.mFeedInfo = this.mFeedInfo;
                }
                if (this.mPreloadInfo != null) {
                    this.mEvent.mPreloadInfo = this.mPreloadInfo;
                }
                if (this.mPlayItem != null) {
                    this.mEvent.mPlayItem = this.mPlayItem;
                }
                if (this.mInitialURL != null) {
                    this.mEvent.mInitialURL = this.mInitialURL;
                }
                if (this.mInitialIP != null) {
                    this.mEvent.mInitialIP = this.mInitialIP;
                }
                if (this.mPlaybackParams != null) {
                    this.mEvent.playbackparams = this.mPlaybackParams;
                }
                this.mEvent.enableMDL = this.mEnabelMDL;
                if (this.mProxyUrl != null) {
                    this.mEvent.proxy_url = this.mProxyUrl;
                }
                if (!this.mIsLocal) {
                    VideoEventManager.instance.addEvent(this.mEvent.toJsonObject());
                }
            }
        }
    }

    public void bufferDataSeconds(int i) {
        this.mBufferDataSeconds = i;
    }

    public void decoderType(int i) {
        this.mDecoderType = i;
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public void setEnableMDL(int i) {
        this.mEnabelMDL = i;
    }

    public void setFramesDropNum(int i) {
        this.mFramesSetDropNum = i;
    }

    public void setInitialIP(String str) {
        this.mInitialIP = str;
    }

    public void setInitialURL(String str) {
        this.mInitialURL = str;
    }

    public void setLocal(boolean z) {
        this.mIsLocal = z;
    }

    public void setMediaCodecRender(int i) {
        this.mMediaCodecRender = i;
    }

    public void setPlayItem(Map map) {
        this.mPlayItem = map;
    }

    public void setPlayType(int i) {
        this.mType = i;
    }

    public void setPreloadInfo(Map map) {
        this.mPreloadInfo = map;
    }

    public void setProxyUrl(String str) {
        this.mProxyUrl = str;
    }

    public void setStartPlayHeight(int i) {
        this.mHeight = i;
    }

    public void setStartPlayWidth(int i) {
        this.mWidth = i;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setVUArray(ArrayList arrayList) {
        this.mVUArray = arrayList;
    }

    public void useCacheFile(int i) {
        this.mCacheFile = i;
    }

    public void useHardwareDecode(int i) {
        this.mHW = i;
    }

    public void usePreload(int i) {
        this.mPreload = i;
    }

    public void useSuperRes(int i) {
        this.mSuperRes = i;
    }

    public void addWatchedDuration(int i) {
        this.mEvent.watchduration = i;
    }

    public void accuErrCount(int i) {
        if (this.mEvent != null) {
            this.mEvent.accuErrCount = i;
        }
    }

    public void clockDiff(long j) {
        if (this.mEvent != null) {
            this.mEvent.clockDiff = j;
        }
    }

    public void containerFps(float f2) {
        if (this.mEvent != null) {
            this.mEvent.containerFps = f2;
        }
    }

    public void curPlayBackTime(int i) {
        if (this.mEvent != null) {
            this.mEvent.curPlayBackTime = (long) i;
        }
    }

    public void curVideoDecoderFps(int i) {
        if (this.mEvent != null) {
            this.mEvent.curVideoDecoderFps = i;
        }
    }

    public void curVideoOutputFps(float f2) {
        if (this.mEvent != null) {
            this.mEvent.curVideoOutputFps = f2;
        }
    }

    public void dropCount(int i) {
        if (this.mEvent != null) {
            this.mEvent.dropCount = i;
        }
    }

    public void enableStartPlayAutomatically(boolean z) {
        if (z) {
            this.mIsStartPlayAutomatically = 1;
        } else {
            this.mIsStartPlayAutomatically = 0;
        }
    }

    public void hwCodecException(int i) {
        if (this.mEvent != null) {
            this.mEvent.hwCodecException = i;
        }
    }

    public void hwCodecName(String str) {
        if (this.mEvent != null) {
            this.mEvent.hwCodecName = str;
        }
    }

    public void loadState(int i) {
        if (this.mEvent != null) {
            this.mEvent.loadState = i;
        }
    }

    public void playBackState(int i) {
        if (this.mEvent != null) {
            this.mEvent.playBackState = i;
        }
    }

    public void setAudioBufferLength(long j) {
        if (this.mEvent != null) {
            this.mEvent.audioBufferLength = j;
        }
    }

    public void setDecodeSecondVideoFrameTime(long j) {
        if (this.mEvent != null) {
            this.mEvent.decodeSecondVideoFrameT = j;
        }
    }

    public void setPlayerHostAddr(String str) {
        if (this.mEvent != null && str != null) {
            this.mEvent.internalIP = str;
        }
    }

    public void setVideoBufferLength(long j) {
        if (this.mEvent != null) {
            this.mEvent.videoBufferLength = j;
        }
    }

    public void tryErrCount(int i) {
        if (this.mEvent != null) {
            this.mEvent.errCount = i;
        }
    }

    public void accuBuffingTime(long j) {
        if (this.mEvent != null && j > 0) {
            this.mEvent.bufferAccuT += j;
        }
    }

    public void accuPauseTime(long j) {
        if (this.mEvent != null && j > 0) {
            this.mEvent.pauseAccuT += j;
        }
    }

    public void setDNSParseTime(long j) {
        if (this.mEvent != null && this.mEvent.dnsT <= 0) {
            this.mEvent.dnsT = j;
        }
    }

    public void setDecodeFirstAudioFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.decodeFirstAudioFrameT <= 0) {
            this.mEvent.decodeFirstAudioFrameT = j;
        }
    }

    public void setDecodeFirstVideoFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.decodeFirstVideoFrameT <= 0) {
            this.mEvent.decodeFirstVideoFrameT = j;
        }
    }

    public void setReceiveFirstAudioFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.receiveFirstAudioFrameT <= 0) {
            this.mEvent.receiveFirstAudioFrameT = j;
        }
    }

    public void setReceiveFirstVideoFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.receiveFirstVideoFrameT <= 0) {
            this.mEvent.receiveFirstVideoFrameT = j;
        }
    }

    public void setTranConnectTime(long j) {
        if (this.mEvent != null && this.mEvent.tranConnectT <= 0) {
            this.mEvent.tranConnectT = j;
        }
    }

    public void setTranFirstPacketTime(long j) {
        if (this.mEvent != null && this.mEvent.tranFirstPacketT <= 0) {
            this.mEvent.tranFirstPacketT = j;
        }
    }

    public void firstDNSFailed(Error error) {
        Error error2 = error;
        if (PatchProxy.isSupport(new Object[]{error2}, this, changeQuickRedirect, false, 91507, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error2}, this, changeQuickRedirect, false, 91507, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mFirstDNSErrorInfo.add(error2);
    }

    public void needRetryToFetch(Error error) {
        Error error2 = error;
        if (PatchProxy.isSupport(new Object[]{error2}, this, changeQuickRedirect, false, 91502, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error2}, this, changeQuickRedirect, false, 91502, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mRetryFetchErrorInfo.add(error2);
    }

    public void setVid(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 91497, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 91497, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mVid = str2;
        _clear();
    }

    public void validateVideoMetaInfoFail(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91511, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91511, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mEvent.hijack = 1;
        this.mErrorInfo.add(error);
    }

    public VideoEventLogger(EventLoggerSource eventLoggerSource) {
        this.mDataSource = eventLoggerSource;
        this.mEvent = new VideoEvent();
        this.mRetryFetchErrorInfo = new ArrayList();
        this.mFirstDNSErrorInfo = new ArrayList();
        this.mErrorInfo = new ArrayList();
        this.mVUArray = new ArrayList();
        this.mMainError = new HashMap();
        this.mLeave = true;
    }

    public void beginToPlay(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91500, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91500, new Class[]{String.class}, Void.TYPE);
            return;
        }
        _clear();
        this.mVideoInfo = null;
        this.mEvent = new VideoEvent();
        this.mEvent.v = str;
        this.mEvent.pt = System.currentTimeMillis();
        this.mEvent.dnsT = 0;
        this.mEvent.tranConnectT = 0;
        this.mEvent.tranFirstPacketT = 0;
        this.mEvent.receiveFirstVideoFrameT = 0;
        this.mEvent.receiveFirstAudioFrameT = 0;
        this.mEvent.decodeFirstVideoFrameT = 0;
        this.mEvent.decodeFirstAudioFrameT = 0;
        this.mEvent.videoDeviceStartTime = 0;
        this.mEvent.audioDeviceStartTime = 0;
        this.mEvent.videoDeviceOpenedTime = 0;
        this.mEvent.audioDeviceOpenedTime = 0;
    }

    public void logMessage(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91529, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91529, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            this.mMessage += str;
        }
    }

    public void logPluginException(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91501, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91501, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mEvent != null) {
            this.mEvent.pluginException = 1;
            if (!TextUtils.isEmpty(str)) {
                this.mEvent.ownPlayerCreateException = str;
            }
        }
    }

    public void mainURLHTTPDNSFailed(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91506, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91506, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        if (error != null) {
            this.mMainError.put("httpdns", error.toMap());
        }
    }

    public void mainURLLocalDNSFailed(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91505, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91505, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        if (error != null) {
            this.mMainError.put("localdns", error.toMap());
        }
    }

    public void movieStalled(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91515, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91515, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mVUArray.size() <= 1) {
            switch (i) {
                case 0:
                    this.mEvent.bc++;
                    return;
                case 1:
                    this.mEvent.dbc++;
                    this.mCurDecoderBufferCount = this.mEvent.dbc;
                    break;
            }
        }
    }

    public void setExternLog(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91527, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91527, new Class[]{String.class}, Void.TYPE);
        } else if (this.mEvent != null && !TextUtils.isEmpty(str)) {
            this.mEvent.externLogFromApp = str;
        }
    }

    public void setFeed(VideoModel videoModel) {
        VideoModel videoModel2 = videoModel;
        if (PatchProxy.isSupport(new Object[]{videoModel2}, this, changeQuickRedirect, false, 91498, new Class[]{VideoModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoModel2}, this, changeQuickRedirect, false, 91498, new Class[]{VideoModel.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        String[] allVideoURLs = videoModel2.allVideoURLs(Resolution.Standard);
        if (allVideoURLs != null) {
            hashMap.put("360p", allVideoURLs);
        }
        String[] allVideoURLs2 = videoModel2.allVideoURLs(Resolution.High);
        if (allVideoURLs2 != null) {
            hashMap.put("480p", allVideoURLs2);
        }
        String[] allVideoURLs3 = videoModel2.allVideoURLs(Resolution.SuperHigh);
        if (allVideoURLs3 != null) {
            hashMap.put("720p", allVideoURLs3);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(PushConstants.WEB_URL, hashMap);
        this.mFeedInfo = hashMap2;
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (PatchProxy.isSupport(new Object[]{playbackParams}, this, changeQuickRedirect, false, 91526, new Class[]{PlaybackParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{playbackParams}, this, changeQuickRedirect, false, 91526, new Class[]{PlaybackParams.class}, Void.TYPE);
        } else if (this.mEvent != null) {
            this.mPlaybackParams = new HashMap();
            this.mPlaybackParams.put("AFMode", Integer.valueOf(playbackParams.getAudioFallbackMode()));
            this.mPlaybackParams.put("pitch", Float.valueOf(playbackParams.getPitch()));
            this.mPlaybackParams.put("speed", Float.valueOf(playbackParams.getSpeed()));
        }
    }

    public void movieFinish(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91523, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91523, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mEvent != null) {
            this.mEvent.vsc = i;
            movieFinish();
        }
    }

    public void movieFinish(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91522, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91522, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        HashMap map = error.toMap();
        map.put("strategy", 0);
        this.mErrorInfo.add(map);
        if (this.mLeave) {
            this.mEvent.lt = System.currentTimeMillis();
        } else {
            if ((error.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || error.domain.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.mVUArray.size() <= 1) {
                this.mEvent.br++;
            }
            this.mEvent.et = System.currentTimeMillis();
        }
        this.mEvent.errt = error.getType();
        this.mEvent.errc = error.code;
        _sendEvent();
        _clear();
        this.mEvent = new VideoEvent();
    }

    public void configResolution(String str, String str2) {
        this.mLastResolution = str2;
        this.mCurrentResolution = str;
    }

    public void useAsyncInit(int i, int i2) {
        this.mAsyncInit = i;
        this.mAsyncCodecId = i2;
    }

    public void codecName(int i, int i2) {
        if (this.mEvent != null) {
            switch (i) {
                case 0:
                    this.mEvent.videoCodecNameId = i2;
                    return;
                case 1:
                    this.mEvent.audioCodecNameId = i2;
                    break;
            }
        }
    }

    public void deviceStartTime(int i, long j) {
        if (this.mEvent != null) {
            switch (i) {
                case 0:
                    if (this.mEvent.videoDeviceStartTime <= 0) {
                        this.mEvent.videoDeviceStartTime = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.mEvent.audioDeviceStartTime <= 0) {
                        this.mEvent.audioDeviceStartTime = j;
                        break;
                    }
                    break;
            }
        }
    }

    public void devicedOpenedTime(int i, long j) {
        if (this.mEvent != null) {
            switch (i) {
                case 0:
                    if (this.mEvent.videoDeviceOpenedTime <= 0) {
                        this.mEvent.videoDeviceOpenedTime = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.mEvent.audioDeviceOpenedTime <= 0) {
                        this.mEvent.audioDeviceOpenedTime = j;
                        break;
                    }
                    break;
            }
        }
    }

    public void fetchInfoComplete(Map map, Error error) {
        if (PatchProxy.isSupport(new Object[]{map, error}, this, changeQuickRedirect, false, 91508, new Class[]{Map.class, Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map, error}, this, changeQuickRedirect, false, 91508, new Class[]{Map.class, Error.class}, Void.TYPE);
        } else if (error != null) {
            this.mMainError.put("api", error.toMap());
        } else {
            if (map != null) {
                this.mVideoInfo = map;
                this.mEvent.at = System.currentTimeMillis();
            }
        }
    }

    public void mainURLCDNFailed(Error error, String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{error, str}, this, changeQuickRedirect, false, 91504, new Class[]{Error.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error, str}, this, changeQuickRedirect, false, 91504, new Class[]{Error.class, String.class}, Void.TYPE);
            return;
        }
        if (error != null) {
            HashMap map = error.toMap();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            map.put(PushConstants.WEB_URL, str2);
            this.mMainError.put("cdn", map);
        }
    }

    public void movieShouldRetry(Error error, int i) {
        if (PatchProxy.isSupport(new Object[]{error, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91521, new Class[]{Error.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91521, new Class[]{Error.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if ((error.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || error.domain.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.mVUArray.size() <= 1) {
            this.mEvent.br++;
        }
        HashMap map = error.toMap();
        map.put("strategy", Integer.valueOf(i));
        this.mErrorInfo.add(map);
    }

    public void playerDidFailed(Error error, String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{error, str}, this, changeQuickRedirect, false, 91503, new Class[]{Error.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error, str}, this, changeQuickRedirect, false, 91503, new Class[]{Error.class, String.class}, Void.TYPE);
            return;
        }
        if (error != null) {
            HashMap map = error.toMap();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            map.put(PushConstants.WEB_URL, str2);
            this.mMainError.put("player", map);
        }
    }

    public void seekTo(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91514, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 91514, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            if (this.mLeave) {
                this.mEvent.lt = System.currentTimeMillis();
            } else {
                this.mEvent.et = System.currentTimeMillis();
            }
            _sendEvent();
            _clear();
            this.mEvent = new VideoEvent();
        }
        this.mEvent.st = System.currentTimeMillis();
    }

    public void switchResolution(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, changeQuickRedirect, false, 91513, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, changeQuickRedirect, false, 91513, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.mEvent.et = System.currentTimeMillis();
        _sendEvent();
        this.mEvent = new VideoEvent();
        this.mLastResolution = str2;
        this.mCurrentResolution = str;
    }
}
