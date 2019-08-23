package com.ss.ttm.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.ttm.net.AVResolver;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.utils.AVErrorInfo;
import com.ss.ttm.utils.AVTime;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TTPlayerClient extends MediaPlayerClient implements Handler.Callback, ISurfaceListener {
    private static final String TAG = "TTPlayerClient";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mBufferingInfo;
    private TTSurfaceCallback mCallback;
    private Context mContext;
    private int mCrashType;
    private StringBuilder mCrashedInfo;
    private int mErrorCode;
    private Handler mHandler;
    private final Object mHandlerLocker;
    private long mListenerState;
    private LinkedList<String> mLogInfo;
    private MediaPlayer.OnLogListener mLogListener;
    private MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private MediaPlayer.OnCompletionListener mOnCompletionListener;
    private MediaPlayer.OnErrorListener mOnErrorListener;
    private MediaPlayer.OnExternInfoListener mOnExternInfoListener;
    private MediaPlayer.OnInfoListener mOnInfoListener;
    private MediaPlayer.OnPreparedListener mOnPreparedListener;
    private MediaPlayer.onSARChangedListener mOnSARChangedListener;
    private MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private int mPlayLifeId;
    private ITTPlayerRef mPlayer;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private volatile boolean mRealsedSurface;
    private final ReentrantLock mReentrantLock;
    private boolean mScreenOnWhilePlaying;
    private boolean mSeekComplete;
    private boolean mStayAwake;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private String mUri;
    private String mVoiceInfo;
    private PowerManager.WakeLock mWakeLock;
    private MediaPlayer mWrapper;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    public int getSelectedTrack(int i) {
        if (i == 2) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        return i == 4 ? 2 : -1;
    }

    public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
    }

    static {
        TTVersion.saveVersionInfo();
    }

    public String getDataSource() {
        return this.mUri;
    }

    private boolean isValid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90869, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90869, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mPlayer == null || !this.mPlayer.isValid()) {
            return false;
        } else {
            return true;
        }
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90878, new Class[0], Void.TYPE);
            return;
        }
        prepareAsync();
    }

    /* JADX INFO: finally extract failed */
    @Deprecated
    public void prevClose() {
        this.mRealsedSurface = true;
        if (this.mSurfaceHolder != null) {
            this.mSurfaceHolder.removeCallback(this.mCallback);
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.prevClose();
            }
            this.mReadLock.unlock();
            this.mSurface = null;
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void updateSurfaceScreenOn() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90914, new Class[0], Void.TYPE);
            return;
        }
        if (this.mSurfaceHolder != null) {
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (this.mScreenOnWhilePlaying && this.mStayAwake) {
                z = true;
            }
            surfaceHolder.setKeepScreenOn(z);
        }
    }

    public void close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90872, new Class[0], Void.TYPE);
            return;
        }
        this.mRealsedSurface = true;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.close();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getCurrentPosition() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90882, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90882, new Class[0], Integer.TYPE)).intValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getIntOption(2, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getDuration() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90885, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90885, new Class[0], Integer.TYPE)).intValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getIntOption(1, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public MediaPlayer.TrackInfo[] getTrackInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90942, new Class[0], MediaPlayer.TrackInfo[].class)) {
            return (MediaPlayer.TrackInfo[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90942, new Class[0], MediaPlayer.TrackInfo[].class);
        }
        return new MediaPlayer.TrackInfo[]{new MediaPlayer.TrackInfo(0, new MediaFormat()), new MediaPlayer.TrackInfo(1, new MediaFormat()), new MediaPlayer.TrackInfo(2, new MediaFormat())};
    }

    public int getType() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90939, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90939, new Class[0], Integer.TYPE)).intValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getType();
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getVideoHeight() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90883, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90883, new Class[0], Integer.TYPE)).intValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getIntOption(4, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getVideoType() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90907, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90907, new Class[0], Integer.TYPE)).intValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getIntOption(11, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getVideoWidth() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90884, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90884, new Class[0], Integer.TYPE)).intValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getIntOption(3, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isLooping() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90893, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90893, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid() && this.mPlayer.getIntOption(5, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isMute() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90909, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90909, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid() && this.mPlayer.getIntOption(12, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isPlaying() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90892, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90892, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid() && this.mPlayer.getIntOption(6, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90875, new Class[0], Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.pause();
            }
            this.mReadLock.unlock();
            stayAwake(false);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void prepareAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90879, new Class[0], Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mErrorCode = 0;
                this.mLogInfo.clear();
                if (this.mRealsedSurface) {
                    this.mPlayer.setSurface(this.mSurfaceHolder.getSurface());
                    this.mRealsedSurface = false;
                }
                this.mPlayer.prepare();
                updateLifeId();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void releaseAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90871, new Class[0], Void.TYPE);
            return;
        }
        this.mRealsedSurface = true;
        if (this.mSurfaceHolder != null) {
            this.mSurfaceHolder.removeCallback(this.mCallback);
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.prevClose();
            }
            this.mReadLock.unlock();
            this.mSurface = null;
            new Thread(new Runnable() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public void run() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90943, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90943, new Class[0], Void.TYPE);
                        return;
                    }
                    TTPlayerClient.this.release();
                }
            }).start();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90876, new Class[0], Void.TYPE);
            return;
        }
        this.mWriteLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.reset();
                if (this.mSurfaceHolder != null) {
                    this.mPlayer.setSurface(this.mSurfaceHolder.getSurface());
                }
                this.mHandler.removeCallbacksAndMessages(null);
                this.mErrorCode = 0;
                this.mLogInfo.clear();
                updateLifeId();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90874, new Class[0], Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mErrorCode = 0;
                this.mPlayer.start();
                updateLifeId();
            }
            this.mReadLock.unlock();
            stayAwake(true);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90877, new Class[0], Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.stop();
            }
            this.mReadLock.unlock();
            stayAwake(false);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void updateLifeId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90870, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90870, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.mReentrantLock.lock();
            this.mPlayLifeId = this.mPlayer.getLifeId();
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    private String getPlayerErrorInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90938, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90938, new Class[0], String.class);
        }
        try {
            StringBuilder sb = new StringBuilder();
            if (!((this.mLogInfo == null || this.mLogInfo.size() <= 0) && this.mBufferingInfo == null && this.mVoiceInfo == null)) {
                AVErrorInfo.setupErrorInfo(this.mContext, sb, "error", "play error", this.mUri);
                Iterator it2 = this.mLogInfo.iterator();
                while (it2.hasNext()) {
                    sb.append((String) it2.next());
                    sb.append("\n");
                }
                if (this.mBufferingInfo != null) {
                    sb.append(this.mBufferingInfo);
                    sb.append("\n");
                    this.mBufferingInfo = null;
                }
                if (this.mVoiceInfo != null) {
                    sb.append(this.mVoiceInfo);
                    sb.append("\n");
                    this.mVoiceInfo = null;
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90873, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90873, new Class[0], Void.TYPE);
            return;
        }
        stayAwake(false);
        updateSurfaceScreenOn();
        this.mWriteLock.lock();
        try {
            ITTPlayerRef iTTPlayerRef = this.mPlayer;
            this.mPlayer = null;
            this.mPlayLifeId = -1;
            if (iTTPlayerRef != null) {
                iTTPlayerRef.release();
            }
            this.mWriteLock.unlock();
            if (this.mSurfaceHolder != null) {
                this.mSurfaceHolder.removeCallback(this.mCallback);
                this.mSurfaceHolder = null;
                this.mRealsedSurface = true;
            }
            this.mSurface = null;
            synchronized (this.mHandlerLocker) {
                if (this.mHandler != null) {
                    this.mHandler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                }
            }
            if (this.mLogListener != null) {
                String playerErrorInfo = getPlayerErrorInfo();
                if (playerErrorInfo != null && playerErrorInfo.length() > 0) {
                    this.mLogListener.onLogInfo(this.mWrapper, playerErrorInfo);
                }
            }
            this.mContext = null;
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
    }

    private String getPlayerCrashedInfo() {
        Context context;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90936, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90936, new Class[0], String.class);
        }
        int value = TTPlayerConfiger.getValue(18, 1);
        StringBuilder sb = new StringBuilder();
        if (this.mPlayer == null) {
            context = this.mContext;
        } else {
            context = this.mPlayer.getContext();
        }
        if (context == null) {
            return "context is null";
        }
        if (value > 1) {
            String existsCrashFilePath = TTCrashUtil.existsCrashFilePath(context);
            if (existsCrashFilePath != null) {
                String crashFileContext = TTCrashUtil.getCrashFileContext(context, existsCrashFilePath, sb);
                if (crashFileContext != null) {
                    TTCrashUtil.deleteCrashFile(this.mContext, existsCrashFilePath);
                    this.mCrashType = 1;
                    TTPlayerConfiger.getValue(5, false);
                    return crashFileContext;
                }
            }
            AVErrorInfo.setupPhoneInfo(context, sb);
        }
        String value2 = TTPlayerConfiger.getValue(19, (String) null);
        if (value2 != null) {
            String crashFileContext2 = TTCrashUtil.getCrashFileContext(this.mContext, value2, sb);
            if (crashFileContext2 != null) {
                TTCrashUtil.deleteCrashFile(this.mContext, value2);
                this.mCrashType = 1;
                TTPlayerConfiger.getValue(5, false);
                return crashFileContext2;
            }
        }
        sb.append("\ncreate time:" + AVTime.getFormatNow());
        sb.append("\nport version:");
        sb.append(value);
        sb.append("\nstart service info:");
        sb.append(TTPlayerConfiger.getValue(16, "not find service start info"));
        sb.append("\nstop service info:");
        sb.append(TTPlayerConfiger.getValue(12, "not find service stop info"));
        sb.append("\ncrash:");
        sb.append(TTPlayerConfiger.getValue(7, false));
        sb.append("\nsdk info:");
        sb.append(TTPlayerConfiger.getValue(15, "not find sdk info"));
        sb.append("\ntimeout count:");
        sb.append(TTPlayerConfiger.getValue(10, -1));
        sb.append("\nforeground:");
        sb.append(TTPlayerConfiger.getValue(21, -1));
        sb.append("\non screen:");
        sb.append(TTPlayerConfiger.getValue(22, -1));
        sb.append("\n battery info:");
        sb.append(TTPlayerConfiger.getValue(23, "not find"));
        sb.append("\nurl:");
        sb.append(this.mUri);
        sb.append("\ncrash:\r\n");
        sb.append(this.mCrashedInfo);
        this.mCrashType = 0;
        if (value <= 1) {
            return sb.toString();
        }
        TTPlayerConfiger.getValue(5, false);
        return TTCrashUtil.getBase64SampleCrash(sb.toString());
    }

    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        this.mLogListener = onLogListener;
    }

    private TTPlayerClient(Context context) {
        this.mSeekComplete = true;
        this.mLogInfo = new LinkedList<>();
        this.mListenerState = 0;
        this.mRealsedSurface = false;
        this.mPlayLifeId = -1;
        this.mHandlerLocker = new Object();
        this.mReentrantLock = new ReentrantLock();
        this.mReadWritedLock = new ReentrantReadWriteLock();
        this.mReadLock = this.mReadWritedLock.readLock();
        this.mWriteLock = this.mReadWritedLock.writeLock();
        this.mErrorCode = 0;
        this.mCrashedInfo = new StringBuilder(1024);
        this.mCrashType = -1;
        this.mRealsedSurface = false;
        this.mCallback = new TTSurfaceCallback(this);
        this.mContext = context;
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(this);
        } else {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
    }

    private void sendCompletioned(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90930, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90930, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.mReentrantLock.lock();
            if (this.mOnCompletionListener != null && i >= this.mPlayLifeId) {
                this.mOnCompletionListener.onCompletion(this.mWrapper);
            }
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    private void sendSeekCompleted(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90929, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90929, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!this.mSeekComplete && this.mOnSeekCompleteListener != null) {
            this.mSeekComplete = true;
            if (i >= this.mPlayLifeId) {
                this.mOnSeekCompleteListener.onSeekComplete(this.mWrapper);
            }
        }
    }

    @SuppressLint({"Wakelock"})
    private void stayAwake(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90915, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90915, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
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

    public void deselectTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90941, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90941, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.setIntOption(65, (i << 8) | 0);
        }
    }

    public String getStringOption(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90902, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90902, new Class[]{Integer.TYPE}, String.class);
        } else if (i == 5001) {
            return getPlayerCrashedInfo();
        } else {
            String str = null;
            if (i != 5002) {
                this.mReadLock.lock();
                try {
                    if (isValid()) {
                        str = this.mPlayer.getStringOption(i);
                    }
                    return str;
                } finally {
                    this.mReadLock.unlock();
                }
            } else if (this.mLogInfo == null || this.mLogInfo.size() == 0) {
                return null;
            } else {
                return getPlayerErrorInfo();
            }
        }
    }

    public boolean handleMessage(Message message) {
        String str;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 90932, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 90932, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        }
        int i = message2.arg2;
        int i2 = message2.what;
        int i3 = message2.arg1;
        if (message2.obj instanceof String) {
            str = (String) message2.obj;
        } else {
            str = null;
        }
        handleNotify(i, i2, i3, str);
        return true;
    }

    public void onCrashedInfo(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 90937, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 90937, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mCrashedInfo.length() < 1024) {
            StringBuilder sb = this.mCrashedInfo;
            sb.append(str);
            sb.append("\n");
        }
    }

    public void onSurfaceChanged(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90934, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90934, new Class[]{SurfaceHolder.class}, Void.TYPE);
        } else if (!this.mRealsedSurface) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    if (surfaceHolder != this.mSurfaceHolder) {
                        if (this.mSurfaceHolder != null) {
                            this.mSurfaceHolder.removeCallback(this.mCallback);
                        }
                        this.mSurfaceHolder = surfaceHolder;
                        if (this.mSurfaceHolder != null) {
                            this.mSurfaceHolder.addCallback(this.mCallback);
                        }
                    }
                    this.mPlayer.setSurface(surfaceHolder.getSurface());
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    public void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90935, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90935, new Class[]{SurfaceHolder.class}, Void.TYPE);
        } else if (!this.mRealsedSurface) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setSurface(null);
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90898, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90898, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mSeekComplete = false;
                this.mPlayer.seekTo(i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @TargetApi(13)
    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IllegalArgumentException, IOException {
        if (PatchProxy.isSupport(new Object[]{fileDescriptor}, this, changeQuickRedirect, false, 90889, new Class[]{FileDescriptor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fileDescriptor}, this, changeQuickRedirect, false, 90889, new Class[]{FileDescriptor.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT < 12) {
            try {
                Field declaredField = fileDescriptor.getClass().getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                this.mPlayer.setDataSourceFd(declaredField.getInt(fileDescriptor));
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
            try {
                this.mPlayer.setDataSourceFd(dup.getFd());
            } finally {
                dup.close();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90886, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90886, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.mSurfaceHolder != null) {
            this.mSurfaceHolder.removeCallback(this.mCallback);
        }
        this.mSurfaceHolder = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder != null) {
            this.mSurfaceHolder.addCallback(this.mCallback);
            surface = this.mSurfaceHolder.getSurface();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setSurface(surface);
            }
            this.mReadLock.unlock();
            updateSurfaceScreenOn();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void setIsMute(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90910, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90910, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setIntOption(12, z ? 1 : 0);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setLooping(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90894, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90894, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setLooping(z ? 1 : 0);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (PatchProxy.isSupport(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 90919, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 90919, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE);
            return;
        }
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mListenerState |= 8;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        if (PatchProxy.isSupport(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 90920, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 90920, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE);
            return;
        }
        this.mOnCompletionListener = onCompletionListener;
        this.mListenerState |= 8192;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (PatchProxy.isSupport(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 90921, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 90921, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE);
            return;
        }
        this.mOnErrorListener = onErrorListener;
        this.mListenerState |= 1;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onExternInfoListener}, this, changeQuickRedirect, false, 90923, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onExternInfoListener}, this, changeQuickRedirect, false, 90923, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE);
            return;
        }
        this.mOnExternInfoListener = onExternInfoListener;
        this.mListenerState |= 524288;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 90922, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 90922, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE);
            return;
        }
        this.mOnInfoListener = onInfoListener;
        this.mListenerState |= 24119218;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (PatchProxy.isSupport(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 90924, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 90924, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE);
            return;
        }
        this.mOnPreparedListener = onPreparedListener;
        this.mListenerState |= 4;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
        if (PatchProxy.isSupport(new Object[]{onsarchangedlistener}, this, changeQuickRedirect, false, 90927, new Class[]{MediaPlayer.onSARChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onsarchangedlistener}, this, changeQuickRedirect, false, 90927, new Class[]{MediaPlayer.onSARChangedListener.class}, Void.TYPE);
            return;
        }
        this.mOnSARChangedListener = onsarchangedlistener;
        this.mListenerState |= 8388608;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (PatchProxy.isSupport(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 90925, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 90925, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE);
            return;
        }
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mListenerState |= 4096;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (PatchProxy.isSupport(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 90926, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 90926, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE);
            return;
        }
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
        this.mListenerState |= 64;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90908, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90908, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setIntOption(11, i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (PatchProxy.isSupport(new Object[]{playbackParams}, this, changeQuickRedirect, false, 90940, new Class[]{PlaybackParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{playbackParams}, this, changeQuickRedirect, false, 90940, new Class[]{PlaybackParams.class}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (!(!isValid() || playbackParams == null || playbackParams.getSpeed() == -1.0f)) {
                this.mPlayer.setFloatOption(60, playbackParams.getSpeed());
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90913, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90913, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mScreenOnWhilePlaying != z) {
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 90911, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 90911, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mSurface = surface;
                this.mPlayer.setSurface(surface);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        if (PatchProxy.isSupport(new Object[]{onScreenshotListener}, this, changeQuickRedirect, false, 90880, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onScreenshotListener}, this, changeQuickRedirect, false, 90880, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE);
        } else if (this.mPlayer != null && onScreenshotListener != null) {
            this.mListenerState |= 32768;
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setNotifyState(this.mListenerState);
                    this.mPlayer.setOnScreenshotListener(onScreenshotListener);
                    this.mPlayer.takeScreenshot();
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 90891, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 90891, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str.toLowerCase(Locale.ENGLISH).indexOf("://") <= 0) {
            this.mUri = "file://" + str;
        } else {
            this.mUri = str;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setDataSource(this.mUri);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public static synchronized TTPlayerClient create(MediaPlayer mediaPlayer, Context context) {
        MediaPlayer mediaPlayer2 = mediaPlayer;
        Context context2 = context;
        synchronized (TTPlayerClient.class) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer2, context2}, null, changeQuickRedirect, true, 90868, new Class[]{MediaPlayer.class, Context.class}, TTPlayerClient.class)) {
                TTPlayerClient tTPlayerClient = (TTPlayerClient) PatchProxy.accessDispatch(new Object[]{mediaPlayer2, context2}, null, changeQuickRedirect, true, 90868, new Class[]{MediaPlayer.class, Context.class}, TTPlayerClient.class);
                return tTPlayerClient;
            }
            TTPlayerClient tTPlayerClient2 = new TTPlayerClient(context2);
            ITTPlayerRef create = ITTPlayerRef.create(context2, tTPlayerClient2);
            if (create == null) {
                return null;
            }
            tTPlayerClient2.mPlayer = create;
            tTPlayerClient2.mWrapper = mediaPlayer2;
            return tTPlayerClient2;
        }
    }

    public float getFloatOption(int i, float f2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90905, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90905, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                f3 = this.mPlayer.getFloatOption(i, f2);
            } else {
                f3 = f2;
            }
            return f3;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public long getLongOption(int i, long j) {
        long j2;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3)}, this, changeQuickRedirect, false, 90904, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3)}, this, changeQuickRedirect, false, 90904, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                int i2 = i;
                j2 = this.mPlayer.getLongOption(i, j3);
            } else {
                j2 = j3;
            }
            return j2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void rotateCamera(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90897, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90897, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.rotateCamera(f2, f3);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setCacheFile(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90912, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90912, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setCacheFile(str, i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setFloatOption(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90906, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90906, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        int i2 = -1;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setFloatOption(i, f2);
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90900, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90900, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int i3 = -1;
        if (i == 41) {
            AVResolver.HOST_MAX_CACHE_TIME = i2;
            return 0;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i3 = this.mPlayer.setIntOption(i, i2);
            }
            return i3;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setLongOption(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90903, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90903, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        int i2 = -1;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                int i3 = i;
                i2 = this.mPlayer.setLongOption(i, j2);
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setStringOption(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 90901, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 90901, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        int i2 = -1;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setStringOption(i, str);
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90895, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90895, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setVolume(f2, f3);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void switchStream(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90881, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90881, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.mPlayer != null) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.switchStream(i, i2);
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    private void notifyInfo(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90918, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90918, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.mOnInfoListener != null) {
            int i3 = -1;
            switch (i) {
                case 4:
                    i3 = 701;
                    break;
                case 5:
                    i3 = 702;
                    break;
                default:
                    switch (i) {
                        case e.l:
                            i3 = 3;
                            break;
                        case 8:
                            i3 = 801;
                            break;
                        case 9:
                            i3 = 802;
                            break;
                        case 10:
                            i3 = 901;
                            break;
                        default:
                            switch (i) {
                                case 20:
                                    i3 = 251658243;
                                    break;
                                case 21:
                                    i3 = 251658244;
                                    break;
                                case 22:
                                    i3 = 251658245;
                                    break;
                                case 23:
                                    i3 = 251658246;
                                    break;
                                case 24:
                                    i3 = 251658247;
                                    break;
                            }
                    }
            }
            this.mOnInfoListener.onInfo(this.mWrapper, i3, i2);
        }
    }

    private void sendErrorInfo(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90931, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90931, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.mReentrantLock.lock();
            if (this.mOnErrorListener != null && i2 >= this.mPlayLifeId) {
                int i3 = -1048575;
                if (this.mErrorCode != 0) {
                    i3 = this.mErrorCode;
                } else if (i != 0) {
                    i3 = i;
                }
                this.mOnErrorListener.onError(this.mWrapper, i3, 0);
            }
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    public int getIntOption(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90899, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90899, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == 5000) {
            return this.mErrorCode;
        } else {
            if (i == 26) {
                return this.mCrashType;
            }
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    i3 = this.mPlayer.getIntOption(i, i2);
                } else {
                    i3 = i2;
                }
                return i3;
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r2 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r2 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        setDataSource(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDataSource(android.content.Context r12, android.net.Uri r13) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 90888(0x16308, float:1.27361E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003f
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 90888(0x16308, float:1.27361E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003f:
            if (r13 != 0) goto L_0x0042
            return
        L_0x0042:
            java.lang.String r1 = r13.getScheme()
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = "settings"
            java.lang.String r2 = r13.getAuthority()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006d
            int r1 = android.media.RingtoneManager.getDefaultType(r13)
            android.net.Uri r1 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r12, r1)
            if (r1 == 0) goto L_0x0065
            goto L_0x006e
        L_0x0065:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Failed to resolve default ringtone"
            r0.<init>(r1)
            throw r0
        L_0x006d:
            r1 = r13
        L_0x006e:
            r2 = 0
            android.content.ContentResolver r0 = r12.getContentResolver()     // Catch:{ SecurityException -> 0x009f, IOException -> 0x009c, all -> 0x0095 }
            java.lang.String r3 = "r"
            android.content.res.AssetFileDescriptor r3 = r0.openAssetFileDescriptor(r1, r3)     // Catch:{ SecurityException -> 0x009f, IOException -> 0x009c, all -> 0x0095 }
            if (r3 != 0) goto L_0x0081
            if (r3 == 0) goto L_0x0080
            r3.close()
        L_0x0080:
            return
        L_0x0081:
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ SecurityException -> 0x0093, IOException -> 0x0091, all -> 0x008e }
            r11.setDataSource((java.io.FileDescriptor) r0)     // Catch:{ SecurityException -> 0x0093, IOException -> 0x0091, all -> 0x008e }
            if (r3 == 0) goto L_0x008d
            r3.close()
        L_0x008d:
            return
        L_0x008e:
            r0 = move-exception
            r2 = r3
            goto L_0x0096
        L_0x0091:
            r2 = r3
            goto L_0x009c
        L_0x0093:
            r2 = r3
            goto L_0x009f
        L_0x0095:
            r0 = move-exception
        L_0x0096:
            if (r2 == 0) goto L_0x009b
            r2.close()
        L_0x009b:
            throw r0
        L_0x009c:
            if (r2 == 0) goto L_0x00a4
            goto L_0x00a1
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
        L_0x00a1:
            r2.close()
        L_0x00a4:
            java.lang.String r0 = r1.toString()
            r11.setDataSource((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.setDataSource(android.content.Context, android.net.Uri):void");
    }

    @SuppressLint({"Wakelock"})
    public void setWakeMode(Context context, int i) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90916, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90916, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mWakeLock != null) {
            if (this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        this.mWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(536870912 | i, TTPlayerClient.class.getName());
        this.mWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        int i4 = 3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90896, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90896, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                i4 = 1;
                break;
            case 1:
                break;
            case 2:
                i4 = 2;
                break;
            default:
                i4 = 0;
                break;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.mouseEvent(i4, i2, i3);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void onPlayLogInfo(int i, int i2, String str) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 90928, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 90928, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (i3 != 2) {
            if (i3 == 0) {
                this.mErrorCode = i4;
            }
            if (str2 != null) {
                if (this.mLogInfo.size() > 40) {
                    this.mLogInfo.removeFirst();
                }
                this.mLogInfo.addLast(String.format("%s&&time:%d", new Object[]{str2, Long.valueOf(System.currentTimeMillis())}));
            }
        } else if (i4 == 1) {
            this.mVoiceInfo = str2;
        } else {
            if (i4 == 0) {
                this.mBufferingInfo = str2;
            }
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context, uri, map2}, this, changeQuickRedirect, false, 90887, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, uri, map2}, this, changeQuickRedirect, false, 90887, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE);
        } else if (uri != null) {
            setDataSource(context, uri);
            if (map2 != null && map.size() != 0) {
                StringBuilder sb = new StringBuilder();
                for (String next : map.keySet()) {
                    sb.append(next);
                    sb.append(":");
                    sb.append(map2.get(next));
                    sb.append("\r\n");
                }
                this.mReadLock.lock();
                try {
                    if (isValid()) {
                        this.mPlayer.setStringOption(20, sb.toString());
                    }
                } finally {
                    this.mReadLock.unlock();
                }
            }
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{fileDescriptor, new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90890, new Class[]{FileDescriptor.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fileDescriptor, new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90890, new Class[]{FileDescriptor.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        setDataSource(fileDescriptor);
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setLongOption(135, j3);
                this.mPlayer.setLongOption(136, j4);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void onPlayerNotify(int i, int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 90933, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 90933, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        synchronized (this.mHandlerLocker) {
            if (this.mHandler != null) {
                int i4 = i;
                Message obtainMessage = this.mHandler.obtainMessage(i2, i3, i);
                obtainMessage.obj = str2;
                obtainMessage.sendToTarget();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
        notifyInfo(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleNotify(int r18, int r19, int r20, java.lang.String r21) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = 4
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r13 = 0
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r14 = 1
            r1[r14] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r15 = 2
            r1[r15] = r2
            r16 = 3
            r1[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r13] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r14] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r15] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r16] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 90917(0x16325, float:1.27402E-40)
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x007e
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r1[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r1[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r1[r15] = r0
            r1[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 90917(0x16325, float:1.27402E-40)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r14] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r15] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r16] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x007e:
            if (r9 == 0) goto L_0x0124
            r1 = 20000(0x4e20, float:2.8026E-41)
            if (r9 == r1) goto L_0x00e8
            r1 = 65535(0xffff, float:9.1834E-41)
            switch(r9) {
                case 2: goto L_0x00db;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00cb;
                case 8: goto L_0x00cb;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00cb;
                default: goto L_0x008a;
            }
        L_0x008a:
            switch(r9) {
                case 12: goto L_0x00b8;
                case 13: goto L_0x00ae;
                default: goto L_0x008d;
            }
        L_0x008d:
            switch(r9) {
                case 19: goto L_0x00a0;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x0091;
                case 24: goto L_0x00cb;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x00e7
        L_0x0091:
            com.ss.ttm.player.MediaPlayer$onSARChangedListener r0 = r8.mOnSARChangedListener
            if (r0 == 0) goto L_0x00e7
            com.ss.ttm.player.MediaPlayer$onSARChangedListener r0 = r8.mOnSARChangedListener
            com.ss.ttm.player.MediaPlayer r2 = r8.mWrapper
            r1 = r1 & r10
            int r3 = r10 >> 16
            r0.onSARChanged(r2, r1, r3)
            goto L_0x00e7
        L_0x00a0:
            com.ss.ttm.player.MediaPlayer$OnExternInfoListener r0 = r8.mOnExternInfoListener
            if (r0 == 0) goto L_0x00e7
            if (r11 == 0) goto L_0x00e7
            com.ss.ttm.player.MediaPlayer$OnExternInfoListener r0 = r8.mOnExternInfoListener
            com.ss.ttm.player.MediaPlayer r1 = r8.mWrapper
            r0.onExternInfo(r1, r9, r11)
            return
        L_0x00ae:
            r8.stayAwake(r13)
            r17.sendSeekCompleted(r18)
            r17.sendCompletioned(r18)
            return
        L_0x00b8:
            r17.sendSeekCompleted(r18)
            return
        L_0x00bc:
            com.ss.ttm.player.MediaPlayer$OnVideoSizeChangedListener r0 = r8.mOnVideoSizeChangedListener
            if (r0 == 0) goto L_0x00e7
            com.ss.ttm.player.MediaPlayer$OnVideoSizeChangedListener r0 = r8.mOnVideoSizeChangedListener
            com.ss.ttm.player.MediaPlayer r2 = r8.mWrapper
            r1 = r1 & r10
            int r3 = r10 >> 16
            r0.onVideoSizeChanged(r2, r1, r3)
            return
        L_0x00cb:
            r8.notifyInfo(r9, r10)
            return
        L_0x00cf:
            com.ss.ttm.player.MediaPlayer$OnBufferingUpdateListener r0 = r8.mOnBufferingUpdateListener
            if (r0 == 0) goto L_0x00e7
            com.ss.ttm.player.MediaPlayer$OnBufferingUpdateListener r0 = r8.mOnBufferingUpdateListener
            com.ss.ttm.player.MediaPlayer r1 = r8.mWrapper
            r0.onBufferingUpdate(r1, r10)
            return
        L_0x00db:
            com.ss.ttm.player.MediaPlayer$OnPreparedListener r0 = r8.mOnPreparedListener
            if (r0 == 0) goto L_0x00e7
            com.ss.ttm.player.MediaPlayer$OnPreparedListener r0 = r8.mOnPreparedListener
            com.ss.ttm.player.MediaPlayer r1 = r8.mWrapper
            r0.onPrepared(r1)
            return
        L_0x00e7:
            return
        L_0x00e8:
            int r1 = r8.mErrorCode
            r2 = -2139062143(0xffffffff80808081, float:-1.1801042E-38)
            if (r1 != r2) goto L_0x00f0
            return
        L_0x00f0:
            r8.mErrorCode = r2
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r8.mWriteLock
            r1.lock()
            com.ss.ttm.player.ITTPlayerRef r1 = r8.mPlayer     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0117
            r2 = 0
            r8.mPlayer = r2     // Catch:{ all -> 0x011d }
            r1.invalid()     // Catch:{ all -> 0x011d }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r8.mWriteLock
            r1.unlock()
            r1 = 7
            com.ss.ttm.player.TTPlayerConfiger.setValue((int) r1, (boolean) r14)
            r8.stayAwake(r13)
            r17.sendSeekCompleted(r18)
            r8.sendErrorInfo(r10, r0)
            r17.sendCompletioned(r18)
            return
        L_0x0117:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.mWriteLock
            r0.unlock()
            return
        L_0x011d:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r8.mWriteLock
            r1.unlock()
            throw r0
        L_0x0124:
            r8.stayAwake(r13)
            r1 = -499989(0xfffffffffff85eeb, float:NaN)
            if (r10 != r1) goto L_0x0131
            r1 = 8
            com.ss.ttm.player.TTPlayerConfiger.setValue((int) r1, (boolean) r14)
        L_0x0131:
            r17.sendSeekCompleted(r18)
            r8.sendErrorInfo(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.handleNotify(int, int, int, java.lang.String):void");
    }
}
