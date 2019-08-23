package tv.danmaku.ijk.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.annotations.AccessedByNative;
import tv.danmaku.ijk.media.player.annotations.CalledByNative;
import tv.danmaku.ijk.media.player.misc.IAndroidIO;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;
import tv.danmaku.ijk.media.player.pragma.DebugLog;

public final class IjkMediaPlayer extends AbstractMediaPlayer {
    public static final String TAG = "tv.danmaku.ijk.media.player.IjkMediaPlayer";
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;
    private static final IjkLibLoader sLocalLibLoader = new IjkLibLoader() {
        public final void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
            System.loadLibrary(str);
        }
    };
    public static boolean sNeedsSetOutputSurfaceWorkaround = false;
    private String mDataSource;
    private EventHandler mEventHandler;
    @AccessedByNative
    private int mListenerContext;
    @AccessedByNative
    private long mNativeAndroidIO;
    @AccessedByNative
    private long mNativeMediaDataSource;
    @AccessedByNative
    public long mNativeMediaPlayer;
    @AccessedByNative
    private int mNativeSurfaceTexture;
    private OnControlMessageListener mOnControlMessageListener;
    private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    private OnNativeInvokeListener mOnNativeInvokeListener;
    private boolean mScreenOnWhilePlaying;
    private boolean mStayAwake;
    private SurfaceHolder mSurfaceHolder;
    public int mVideoHeight;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    private PowerManager.WakeLock mWakeLock;

    public static class DefaultMediaCodecSelector implements OnMediaCodecSelectListener {
        private static String mMediaCodec;
        public static final DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        public static String getCachedMediaCodec() {
            return mMediaCodec;
        }

        @TargetApi(16)
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2) {
            if (Build.VERSION.SDK_INT < 16) {
                return null;
            }
            if (mMediaCodec != null) {
                return mMediaCodec;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int codecCount = MediaCodecList.getCodecCount();
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (!codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    if (supportedTypes != null) {
                        for (String str2 : supportedTypes) {
                            if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase(str)) {
                                IjkMediaCodecInfo ijkMediaCodecInfo = IjkMediaCodecInfo.setupCandidate(codecInfoAt, str);
                                if (ijkMediaCodecInfo != null) {
                                    arrayList.add(ijkMediaCodecInfo);
                                    ijkMediaCodecInfo.dumpProfileLevels(str);
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            IjkMediaCodecInfo ijkMediaCodecInfo2 = (IjkMediaCodecInfo) arrayList.get(0);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                IjkMediaCodecInfo ijkMediaCodecInfo3 = (IjkMediaCodecInfo) it2.next();
                if (ijkMediaCodecInfo3.mRank > ijkMediaCodecInfo2.mRank) {
                    ijkMediaCodecInfo2 = ijkMediaCodecInfo3;
                }
            }
            if (ijkMediaCodecInfo2.mRank < 600) {
                return null;
            }
            String name = ijkMediaCodecInfo2.mCodecInfo.getName();
            mMediaCodec = name;
            IjkMediaPlayer.sNeedsSetOutputSurfaceWorkaround = IjkMediaPlayer.codecNeedsSetOutputSurfaceWorkaround(name);
            return mMediaCodec;
        }
    }

    static class EventHandler extends Handler {
        private final WeakReference<IjkMediaPlayer> mWeakPlayer;

        public void handleMessage(Message message) {
            IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) this.mWeakPlayer.get();
            if (ijkMediaPlayer != null) {
                long j = 0;
                if (ijkMediaPlayer.mNativeMediaPlayer != 0) {
                    int i = message.what;
                    if (i == 200) {
                        if (message.arg1 == 3) {
                            DebugLog.i(IjkMediaPlayer.TAG, "Info: MEDIA_INFO_VIDEO_RENDERING_START\n");
                        }
                        ijkMediaPlayer.notifyOnInfo(message.arg1, message.arg2);
                        return;
                    } else if (i != 10001) {
                        switch (i) {
                            case 0:
                                return;
                            case 1:
                                ijkMediaPlayer.notifyOnPrepared();
                                return;
                            case 2:
                                ijkMediaPlayer.stayAwake(false);
                                ijkMediaPlayer.notifyOnCompletion();
                                return;
                            case 3:
                                long j2 = (long) message.arg1;
                                if (j2 < 0) {
                                    j2 = 0;
                                }
                                long duration = ijkMediaPlayer.getDuration();
                                if (duration > 0) {
                                    j = (j2 * 100) / duration;
                                }
                                if (j >= 100) {
                                    j = 100;
                                }
                                ijkMediaPlayer.notifyOnBufferingUpdate((int) j);
                                return;
                            case 4:
                                ijkMediaPlayer.notifyOnSeekComplete();
                                return;
                            case 5:
                                ijkMediaPlayer.mVideoWidth = message.arg1;
                                ijkMediaPlayer.mVideoHeight = message.arg2;
                                ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
                                return;
                            default:
                                switch (i) {
                                    case 99:
                                        if (message.obj == null) {
                                            ijkMediaPlayer.notifyOnTimedText(null);
                                            return;
                                        } else {
                                            ijkMediaPlayer.notifyOnTimedText(new IjkTimedText(new Rect(0, 0, 1, 1), (String) message.obj));
                                            return;
                                        }
                                    case 100:
                                        DebugLog.e(IjkMediaPlayer.TAG, "Error (" + message.arg1 + "," + message.arg2 + ")");
                                        if (!ijkMediaPlayer.notifyOnError(message.arg1, message.arg2)) {
                                            ijkMediaPlayer.notifyOnCompletion();
                                        }
                                        ijkMediaPlayer.stayAwake(false);
                                        return;
                                    default:
                                        DebugLog.e(IjkMediaPlayer.TAG, "Unknown message type " + message.what);
                                        return;
                                }
                        }
                    } else {
                        ijkMediaPlayer.mVideoSarNum = message.arg1;
                        ijkMediaPlayer.mVideoSarDen = message.arg2;
                        ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
                        return;
                    }
                }
            }
            DebugLog.w(IjkMediaPlayer.TAG, "IjkMediaPlayer went away with unhandled events");
        }

        public EventHandler(IjkMediaPlayer ijkMediaPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(ijkMediaPlayer);
        }
    }

    public interface OnControlMessageListener {
        String onControlResolveSegmentUrl(int i);
    }

    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2);
    }

    public interface OnNativeInvokeListener {
        boolean onNativeInvoke(int i, Bundle bundle);
    }

    private native String _getAudioCodecInfo();

    private static native String _getColorFormatName(int i);

    private native int _getLoopCount();

    private native Bundle _getMediaMeta();

    private native float _getPropertyFloat(int i, float f2);

    private native long _getPropertyLong(int i, long j);

    private native String _getVideoCodecInfo();

    private native void _pause() throws IllegalStateException;

    private native void _release();

    private native void _reset();

    private native void _setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setDataSourceFd(int i) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setFrameAtTime(String str, long j, long j2, int i, int i2) throws IllegalArgumentException, IllegalStateException;

    private native void _setLoopCount(int i);

    private native void _setOption(int i, String str, long j);

    private native void _setOption(int i, String str, String str2);

    private native void _setPropertyFloat(int i, float f2);

    private native void _setPropertyLong(int i, long j);

    private native void _setStreamSelected(int i, boolean z);

    private native void _setVideoSurface(Surface surface);

    private native void _start() throws IllegalStateException;

    private native void _stop() throws IllegalStateException;

    private native void native_finalize();

    private static native void native_init();

    private native void native_message_loop(Object obj);

    public static native void native_profileBegin(String str);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int i);

    private native void native_setup(Object obj);

    public final native void _prepareAsync() throws IllegalStateException;

    public final native int getAudioSessionId();

    public final native long getCurrentPosition();

    public final native long getDuration();

    public final boolean isPlayable() {
        return true;
    }

    public final native boolean isPlaying();

    public final native void seekTo(long j) throws IllegalStateException;

    public final void setAudioStreamType(int i) {
    }

    public final void setKeepInBackground(boolean z) {
    }

    public final void setLogEnabled(boolean z) {
    }

    public final native void setVolume(float f2, float f3);

    public final String getDataSource() {
        return this.mDataSource;
    }

    public final int getVideoHeight() {
        return this.mVideoHeight;
    }

    public final int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    public final int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    public final int getVideoWidth() {
        return this.mVideoWidth;
    }

    public final void prepareAsync() throws IllegalStateException {
        _prepareAsync();
    }

    public IjkMediaPlayer() {
        this(sLocalLibLoader);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        super.finalize();
        native_finalize();
    }

    public final float getDropFrameRate() {
        return _getPropertyFloat(10007, 0.0f);
    }

    public final Bundle getMediaMeta() {
        return _getMediaMeta();
    }

    public final float getVideoDecodeFramesPerSecond() {
        return _getPropertyFloat(10001, 0.0f);
    }

    public final float getVideoOutputFramesPerSecond() {
        return _getPropertyFloat(10002, 0.0f);
    }

    public final void pause() throws IllegalStateException {
        stayAwake(false);
        _pause();
    }

    public final void resetListeners() {
        super.resetListeners();
        this.mOnMediaCodecSelectListener = null;
    }

    public final void start() throws IllegalStateException {
        stayAwake(true);
        _start();
    }

    public final void stop() throws IllegalStateException {
        stayAwake(false);
        _stop();
    }

    public static boolean isSupportDynamicChangeCodecSurface() {
        if (sNeedsSetOutputSurfaceWorkaround || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return true;
    }

    public final long getAsyncStatisticBufBackwards() {
        return _getPropertyLong(20201, 0);
    }

    public final long getAsyncStatisticBufCapacity() {
        return _getPropertyLong(20203, 0);
    }

    public final long getAsyncStatisticBufForwards() {
        return _getPropertyLong(20202, 0);
    }

    public final long getAudioCachedBytes() {
        return _getPropertyLong(20008, 0);
    }

    public final long getAudioCachedDuration() {
        return _getPropertyLong(20006, 0);
    }

    public final long getAudioCachedPackets() {
        return _getPropertyLong(20010, 0);
    }

    public final long getBitRate() {
        return _getPropertyLong(20100, 0);
    }

    public final long getCacheStatisticCountBytes() {
        return _getPropertyLong(20208, 0);
    }

    public final long getCacheStatisticFileForwards() {
        return _getPropertyLong(20206, 0);
    }

    public final long getCacheStatisticFilePos() {
        return _getPropertyLong(20207, 0);
    }

    public final long getCacheStatisticPhysicalPos() {
        return _getPropertyLong(20205, 0);
    }

    public final long getFileSize() {
        return _getPropertyLong(20209, 0);
    }

    public final long getSeekLoadDuration() {
        return _getPropertyLong(20300, 0);
    }

    public final long getTcpSpeed() {
        return _getPropertyLong(20200, 0);
    }

    public final long getTrafficStatisticByteCount() {
        return _getPropertyLong(20204, 0);
    }

    public final long getVideoCachedBytes() {
        return _getPropertyLong(20007, 0);
    }

    public final long getVideoCachedDuration() {
        return _getPropertyLong(20005, 0);
    }

    public final long getVideoCachedPackets() {
        return _getPropertyLong(20009, 0);
    }

    public final int getVideoDecoder() {
        return (int) _getPropertyLong(20003, 0);
    }

    public final boolean isLooping() {
        if (_getLoopCount() != 1) {
            return true;
        }
        return false;
    }

    public final void release() {
        stayAwake(false);
        updateSurfaceScreenOn();
        resetListeners();
        _release();
    }

    private static void initNativeOnce() {
        synchronized (IjkMediaPlayer.class) {
            if (!mIsNativeInitialized) {
                native_init();
                mIsNativeInitialized = true;
            }
        }
    }

    private void updateSurfaceScreenOn() {
        boolean z;
        if (this.mSurfaceHolder != null) {
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (!this.mScreenOnWhilePlaying || !this.mStayAwake) {
                z = false;
            } else {
                z = true;
            }
            surfaceHolder.setKeepScreenOn(z);
        }
    }

    public final void reset() {
        stayAwake(false);
        _reset();
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
    }

    public final MediaInfo getMediaInfo() {
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.mMediaPlayerName = "ijkplayer";
        String _getVideoCodecInfo = _getVideoCodecInfo();
        if (!TextUtils.isEmpty(_getVideoCodecInfo)) {
            String[] split = _getVideoCodecInfo.split(",");
            if (split.length >= 2) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = split[1];
            } else if (split.length > 0) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = "";
            }
        }
        String _getAudioCodecInfo = _getAudioCodecInfo();
        if (!TextUtils.isEmpty(_getAudioCodecInfo)) {
            String[] split2 = _getAudioCodecInfo.split(",");
            if (split2.length >= 2) {
                mediaInfo.mAudioDecoder = split2[0];
                mediaInfo.mAudioDecoderImpl = split2[1];
            } else if (split2.length > 0) {
                mediaInfo.mAudioDecoder = split2[0];
                mediaInfo.mAudioDecoderImpl = "";
            }
        }
        try {
            mediaInfo.mMeta = IjkMediaMeta.parse(_getMediaMeta());
        } catch (Throwable unused) {
        }
        return mediaInfo;
    }

    public final IjkTrackInfo[] getTrackInfo() {
        Bundle mediaMeta = getMediaMeta();
        if (mediaMeta == null) {
            return null;
        }
        IjkMediaMeta parse = IjkMediaMeta.parse(mediaMeta);
        if (parse == null || parse.mStreams == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IjkMediaMeta.IjkStreamMeta> it2 = parse.mStreams.iterator();
        while (it2.hasNext()) {
            IjkMediaMeta.IjkStreamMeta next = it2.next();
            IjkTrackInfo ijkTrackInfo = new IjkTrackInfo(next);
            if (next.mType.equalsIgnoreCase("video")) {
                ijkTrackInfo.setTrackType(1);
            } else if (next.mType.equalsIgnoreCase("audio")) {
                ijkTrackInfo.setTrackType(2);
            } else if (next.mType.equalsIgnoreCase("timedtext")) {
                ijkTrackInfo.setTrackType(3);
            }
            arrayList.add(ijkTrackInfo);
        }
        return (IjkTrackInfo[]) arrayList.toArray(new IjkTrackInfo[arrayList.size()]);
    }

    public final void setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalArgumentException, SecurityException, IllegalStateException {
        _setAndroidIOCallback(iAndroidIO);
    }

    public final void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
        this.mOnControlMessageListener = onControlMessageListener;
    }

    public final void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
        this.mOnMediaCodecSelectListener = onMediaCodecSelectListener;
    }

    public final void setOnNativeInvokeListener(OnNativeInvokeListener onNativeInvokeListener) {
        this.mOnNativeInvokeListener = onNativeInvokeListener;
    }

    public static String getColorFormatName(int i) {
        return _getColorFormatName(i);
    }

    public final void deselectTrack(int i) {
        _setStreamSelected(i, false);
    }

    public final float getSpeed(float f2) {
        return _getPropertyFloat(10003, 0.0f);
    }

    public final void selectTrack(int i) {
        _setStreamSelected(i, true);
    }

    public final void setCacheShare(int i) {
        _setPropertyLong(20210, (long) i);
    }

    public final void setSpeed(float f2) {
        _setPropertyFloat(10003, f2);
    }

    public IjkMediaPlayer(IjkLibLoader ijkLibLoader) {
        initPlayer(ijkLibLoader);
    }

    public final void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mDataSource = str;
        _setDataSource(str, null, null);
    }

    public final void setLooping(boolean z) {
        boolean z2 = !z;
        setOption(4, "loop", z2 ? 1 : 0);
        _setLoopCount(z2);
    }

    public final void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException {
        _setDataSource(iMediaDataSource);
    }

    public final void setDisplay(SurfaceHolder surfaceHolder) {
        Surface surface;
        this.mSurfaceHolder = surfaceHolder;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = null;
        }
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
    }

    public final void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            if (z && this.mSurfaceHolder == null) {
                DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    public final void setSurface(Surface surface) {
        if (this.mScreenOnWhilePlaying && surface != null) {
            DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        this.mSurfaceHolder = null;
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
    }

    private void initPlayer(IjkLibLoader ijkLibLoader) {
        loadLibrariesOnce(ijkLibLoader);
        initNativeOnce();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new EventHandler(this, myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        native_setup(new WeakReference(this));
    }

    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (IjkMediaPlayer.class) {
            if (!mIsLibLoaded) {
                if (ijkLibLoader == null) {
                    ijkLibLoader = sLocalLibLoader;
                }
                ijkLibLoader.loadLibrary("ttffmpeg");
                ijkLibLoader.loadLibrary("ijksdl");
                ijkLibLoader.loadLibrary("ijkplayer");
                mIsLibLoaded = true;
            }
        }
    }

    public final int getSelectedTrack(int i) {
        switch (i) {
            case 1:
                return (int) _getPropertyLong(20001, -1);
            case 2:
                return (int) _getPropertyLong(20002, -1);
            case 3:
                return (int) _getPropertyLong(20011, -1);
            default:
                return -1;
        }
    }

    @TargetApi(13)
    public final void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException {
        if (Build.VERSION.SDK_INT < 12) {
            try {
                Field declaredField = fileDescriptor.getClass().getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                _setDataSourceFd(declaredField.getInt(fileDescriptor));
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
            try {
                _setDataSourceFd(dup.getFd());
            } finally {
                dup.close();
            }
        }
    }

    @SuppressLint({"Wakelock"})
    public final void stayAwake(boolean z) {
        if (this.mWakeLock != null) {
            if (z && !this.mWakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
        updateSurfaceScreenOn();
    }

    public static boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        if ((("deb".equals(str2) || "flo".equals(str2) || "mido".equals(str2) || "santoni".equals(str2)) && "OMX.qcom.video.decoder.avc".equals(str)) || ((("tcl_eu".equals(str2) || "SVP-DTV15".equals(str2) || "BRAVIA_ATV2".equals(str2) || str2.startsWith("panell_") || "F3311".equals(str2) || "M5c".equals(str2) || "QM16XE_U".equals(str2) || "A7010a48".equals(str2) || "woods_f".equals(str3) || "watson".equals(str2)) && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) || ((("ALE-L21".equals(str3) || "CAM-L21".equals(str3)) && "OMX.k3.video.decoder.avc".equals(str)) || ("HUAWEI VNS-L21".equals(str3) && "OMX.IMG.MSVDX.Decoder.AVC".equals(str))))) {
            return true;
        }
        return false;
    }

    public final void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        setDataSource(context, uri, (Map<String, String>) null);
    }

    @SuppressLint({"Wakelock"})
    public final void setWakeMode(Context context, int i) {
        boolean z;
        if (this.mWakeLock != null) {
            if (this.mWakeLock.isHeld()) {
                z = true;
                this.mWakeLock.release();
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        this.mWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | 536870912, IjkMediaPlayer.class.getName());
        this.mWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    public final void setDataSource(String str, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : map.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(":");
                if (!TextUtils.isEmpty((String) next.getValue())) {
                    sb.append((String) next.getValue());
                }
                sb.append("\r\n");
                setOption(1, "headers", sb.toString());
                setOption(1, "protocol_whitelist", "async,cache,crypto,file,http,https,ijkhttphook,ijkinject,ijklivehook,ijklongurl,ijksegment,ijktcphook,pipe,rtp,tcp,tls,udp,ijkurlhook,data");
            }
        }
        setDataSource(str);
    }

    private void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IOException, IllegalArgumentException, IllegalStateException {
        setDataSource(fileDescriptor);
    }

    public final void setOption(int i, String str, long j) {
        _setOption(i, str, j);
    }

    public final void setOption(int i, String str, String str2) {
        _setOption(i, str, str2);
    }

    @CalledByNative
    private static boolean onNativeInvoke(Object obj, int i, Bundle bundle) {
        DebugLog.ifmt(TAG, "onNativeInvoke %d", Integer.valueOf(i));
        if (obj == null || !(obj instanceof WeakReference)) {
            throw new IllegalStateException("<null weakThiz>.onNativeInvoke()");
        }
        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get();
        if (ijkMediaPlayer != null) {
            OnNativeInvokeListener onNativeInvokeListener = ijkMediaPlayer.mOnNativeInvokeListener;
            if ((onNativeInvokeListener != null && onNativeInvokeListener.onNativeInvoke(i, bundle)) || i == 131075) {
                return true;
            }
            if (i != 131079) {
                return false;
            }
            OnControlMessageListener onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener;
            if (onControlMessageListener == null) {
                return false;
            }
            int i2 = bundle.getInt("segment_index", -1);
            if (i2 >= 0) {
                String onControlResolveSegmentUrl = onControlMessageListener.onControlResolveSegmentUrl(i2);
                if (onControlResolveSegmentUrl != null) {
                    bundle.putString(PushConstants.WEB_URL, onControlResolveSegmentUrl);
                    return true;
                }
                throw new RuntimeException(new IOException("onNativeInvoke() = <NULL newUrl>"));
            }
            throw new InvalidParameterException("onNativeInvoke(invalid segment index)");
        }
        throw new IllegalStateException("<null weakPlayer>.onNativeInvoke()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r7 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r7 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0087, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008a, code lost:
        setDataSource(r8.toString(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    @android.annotation.TargetApi(14)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDataSource(android.content.Context r7, android.net.Uri r8, java.util.Map<java.lang.String, java.lang.String> r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
        /*
            r6 = this;
            java.lang.String r0 = r8.getScheme()
            java.lang.String r1 = "file"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0014
            java.lang.String r7 = r8.getPath()
            r6.setDataSource((java.lang.String) r7)
            return
        L_0x0014:
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "settings"
            java.lang.String r1 = r8.getAuthority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            int r8 = android.media.RingtoneManager.getDefaultType(r8)
            android.net.Uri r8 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r7, r8)
            if (r8 == 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = "Failed to resolve default ringtone"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            r0 = 0
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ SecurityException -> 0x0084, IOException -> 0x0080, all -> 0x0078 }
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r7 = r7.openAssetFileDescriptor(r8, r1)     // Catch:{ SecurityException -> 0x0084, IOException -> 0x0080, all -> 0x0078 }
            if (r7 != 0) goto L_0x004e
            if (r7 == 0) goto L_0x004d
            r7.close()
        L_0x004d:
            return
        L_0x004e:
            long r0 = r7.getDeclaredLength()     // Catch:{ SecurityException -> 0x0085, IOException -> 0x0081, all -> 0x0076 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0060
            java.io.FileDescriptor r0 = r7.getFileDescriptor()     // Catch:{ SecurityException -> 0x0085, IOException -> 0x0081, all -> 0x0076 }
            r6.setDataSource((java.io.FileDescriptor) r0)     // Catch:{ SecurityException -> 0x0085, IOException -> 0x0081, all -> 0x0076 }
            goto L_0x0070
        L_0x0060:
            java.io.FileDescriptor r1 = r7.getFileDescriptor()     // Catch:{ SecurityException -> 0x0085, IOException -> 0x0081, all -> 0x0076 }
            long r2 = r7.getStartOffset()     // Catch:{ SecurityException -> 0x0085, IOException -> 0x0081, all -> 0x0076 }
            long r4 = r7.getDeclaredLength()     // Catch:{ SecurityException -> 0x0085, IOException -> 0x0081, all -> 0x0076 }
            r0 = r6
            r0.setDataSource((java.io.FileDescriptor) r1, (long) r2, (long) r4)     // Catch:{ SecurityException -> 0x0085, IOException -> 0x0081, all -> 0x0076 }
        L_0x0070:
            if (r7 == 0) goto L_0x0075
            r7.close()
        L_0x0075:
            return
        L_0x0076:
            r8 = move-exception
            goto L_0x007a
        L_0x0078:
            r8 = move-exception
            r7 = r0
        L_0x007a:
            if (r7 == 0) goto L_0x007f
            r7.close()
        L_0x007f:
            throw r8
        L_0x0080:
            r7 = r0
        L_0x0081:
            if (r7 == 0) goto L_0x008a
            goto L_0x0087
        L_0x0084:
            r7 = r0
        L_0x0085:
            if (r7 == 0) goto L_0x008a
        L_0x0087:
            r7.close()
        L_0x008a:
            java.lang.String r7 = r8.toString()
            r6.setDataSource((java.lang.String) r7, (java.util.Map<java.lang.String, java.lang.String>) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaPlayer.setDataSource(android.content.Context, android.net.Uri, java.util.Map):void");
    }

    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i, int i2) {
        if (obj == null || !(obj instanceof WeakReference)) {
            return null;
        }
        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get();
        if (ijkMediaPlayer == null) {
            return null;
        }
        OnMediaCodecSelectListener onMediaCodecSelectListener = ijkMediaPlayer.mOnMediaCodecSelectListener;
        if (onMediaCodecSelectListener == null) {
            onMediaCodecSelectListener = DefaultMediaCodecSelector.sInstance;
        }
        return onMediaCodecSelectListener.onMediaCodecSelect(ijkMediaPlayer, str, i, i2);
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        if (obj != null) {
            IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get();
            if (ijkMediaPlayer != null) {
                if (i == 200 && i2 == 2) {
                    ijkMediaPlayer.start();
                }
                if (ijkMediaPlayer.mEventHandler != null) {
                    ijkMediaPlayer.mEventHandler.sendMessage(ijkMediaPlayer.mEventHandler.obtainMessage(i, i2, i3, obj2));
                }
            }
        }
    }
}
