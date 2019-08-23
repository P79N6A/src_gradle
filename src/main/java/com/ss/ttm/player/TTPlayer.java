package com.ss.ttm.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.ttm.player.MediaPlayer;
import java.io.File;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class TTPlayer {
    private static boolean IsErrored = false;
    private static final String TAG = "TTPlayer";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mAppPath;
    private static String mCachePath;
    private static String mCrashPath;
    public static String mErrorInfo;
    private static boolean mIsIPCPlayer;
    private static int mSupportSampleRateNB;
    private static int[] mSupportSampleRates;
    private Context mContext;
    private long mHandle;
    private long mId;
    private IPlayerNotifyer mNotifyer;
    private long mNotifyerState = 2147483647L;
    private MediaPlayer.OnScreenshotListener mScreenshotListener;
    private int mTracker;

    public class _lancet {
        public static ChangeQuickRedirect changeQuickRedirect;

        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90867, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90867, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                int i2 = i;
                System.exit(i);
                return;
            }
            throw new RuntimeException("Process killed, status is " + i);
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90866, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90866, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                int i2 = i;
                Process.killProcess(i);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + i);
        }
    }

    private static final native void _close(long j);

    private final native long _create(Context context, int i, String str);

    private static final native String _getAppPath();

    private static final native int _getCurrentPosition(long j);

    private static final native double _getDoubleValue(long j, int i, double d2);

    private static final native int _getDuration(long j);

    private static final native float _getFloatValue(long j, int i, float f2);

    private static final native int _getIntValue(long j, int i, int i2);

    private static final native long _getLongValue(long j, int i, long j2);

    private static final native String _getStringValue(long j, int i);

    private static final native int _getVideoHeight(long j);

    private static final native int _getVideoWidth(long j);

    private static final native int _isLooping(long j);

    private static final native int _isPlaying(long j);

    private static final native void _mouseEvent(long j, int i, int i2, int i3);

    private static final native int _pause(long j);

    private static final native int _prepare(long j);

    private static final native void _prevClose(long j);

    private static final native void _registerPlayerInfo();

    private static final native void _release(long j);

    private static final native int _reset(long j);

    private static final native void _rotateCamera(long j, float f2, float f3);

    private static final native int _seek(long j, int i);

    private static final native void _setCacheFile(long j, String str, int i);

    private static final native void _setDataSource(long j, String str);

    private static final native void _setDataSourceFd(long j, int i);

    private static final native int _setDoubleValue(long j, int i, double d2);

    private static final native int _setFloatValue(long j, int i, float f2);

    private static final native int _setIntValue(long j, int i, int i2);

    private static final native int _setLongValue(long j, int i, long j2);

    private static final native void _setLooping(long j, int i);

    private static final native int _setStringValue(long j, int i, String str);

    private static final native void _setSupportFormatNB(int i);

    private static final native void _setSupprotSampleRates(int[] iArr, int i);

    private static final native int _setSurfaceValue(long j, long j2);

    private static final native int _setVideoSurface(long j, Surface surface);

    private static final native void _setVolume(long j, float f2, float f3);

    private static final native int _start(long j);

    private static final native void _stop(long j);

    private static final native void _switchStream(long j, int i, int i2);

    private static final native void _takeScreenshot(long j);

    public static final String getAppPath() {
        return mAppPath;
    }

    public static final String getCachePath() {
        return mCachePath;
    }

    public static final String getCrashPath() {
        return mCrashPath;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public static boolean isIPPlayer() {
        return mIsIPCPlayer;
    }

    public Context getContext() {
        return this.mContext;
    }

    public final long getHandle() {
        return this.mHandle;
    }

    public long getNativePlayer() {
        return this.mHandle;
    }

    static {
        synchronized (TTPlayer.class) {
            loadLibrary();
        }
    }

    public static void registerPlayerInfo() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90830, new Class[0], Void.TYPE);
        } else {
            _registerPlayerInfo();
        }
    }

    public int close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90833, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90833, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            _close(this.mHandle);
            return 0;
        }
    }

    public int pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90836, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90836, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return _pause(this.mHandle);
        }
    }

    public int prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90832, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90832, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return _prepare(this.mHandle);
        }
    }

    public int prevClose() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90834, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90834, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            _setVideoSurface(this.mHandle, null);
            return 0;
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90839, new Class[0], Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            _release(this.mHandle);
            this.mHandle = 0;
        }
        this.mNotifyer = null;
        this.mScreenshotListener = null;
    }

    public int reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90837, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90837, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return _reset(this.mHandle);
        }
    }

    public int start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90835, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90835, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return _start(this.mHandle);
        }
    }

    public int stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90838, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90838, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            _stop(this.mHandle);
            return 0;
        }
    }

    public void takeScreenshot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90850, new Class[0], Void.TYPE);
            return;
        }
        _takeScreenshot(this.mHandle);
    }

    private static final void loadLibrary() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90829, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (TTPlayerConfiger.getValue(3, false)) {
                loadPlayerlibrary("ttopenssl");
                loadPlayerlibrary("ttffmpeg");
                loadPlayerlibrary("ttmplayer");
            } else {
                System.loadLibrary("ttopenssl");
                System.loadLibrary("ttffmpeg");
                System.loadLibrary("ttmplayer");
            }
            if (mSupportSampleRateNB == 0) {
                int[] iArr = new int[AudioFormats.getDefaultSampleRatesNB()];
                mSupportSampleRates = iArr;
                mSupportSampleRateNB = AudioFormats.getMaxSupportedSampleRates(iArr);
                _setSupprotSampleRates(mSupportSampleRates, mSupportSampleRateNB);
            }
        } catch (Throwable th) {
            IsErrored = true;
            mErrorInfo = "load default library error." + th.toString();
        }
    }

    public static final void setCachePath(String str) {
        mCachePath = str;
    }

    public static final void setCrashPath(String str) {
        mCrashPath = str;
    }

    public static void setIsIPPlayer(boolean z) {
        mIsIPCPlayer = z;
    }

    public static final void setTempFileDir(String str) {
        mAppPath = str;
    }

    public void setNotifyer(IPlayerNotifyer iPlayerNotifyer) {
        this.mNotifyer = iPlayerNotifyer;
    }

    public void setOnScreenshotListener(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        this.mScreenshotListener = onScreenshotListener;
    }

    public void setDataSource(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 90842, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 90842, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            _setDataSource(this.mHandle, str);
        }
    }

    public final void takeScreenshotComplete(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, changeQuickRedirect, false, 90852, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, this, changeQuickRedirect, false, 90852, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (this.mScreenshotListener != null) {
            this.mScreenshotListener.onTakeScreenShotCompletion(bitmap);
        }
    }

    private void create(long j) throws Exception {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90831, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90831, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.mNotifyer = null;
        Context context = this.mContext;
        boolean z = mIsIPCPlayer;
        this.mHandle = _create(context, z ? 1 : 0, mAppPath);
        this.mId = j;
        if (this.mHandle == 0) {
            throw new Exception("create native player is fail.");
        }
    }

    public String getStringOption(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90857, new Class[]{Integer.TYPE}, String.class)) {
            return _getStringValue(this.mHandle, i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90857, new Class[]{Integer.TYPE}, String.class);
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90848, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90848, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        _seek(this.mHandle, i);
    }

    public void setDataSourceFd(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90843, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90843, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            _setDataSourceFd(this.mHandle, i);
        }
    }

    public void setLooping(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90845, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90845, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        _setLooping(this.mHandle, i);
    }

    public void setNotifyerState(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90849, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90849, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.mNotifyerState = j;
        _setIntValue(this.mHandle, 16, (int) j);
    }

    public int setSurfaceValue(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90841, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return _setSurfaceValue(this.mHandle, j2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90841, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
    }

    public int setVideoSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 90840, new Class[]{Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 90840, new Class[]{Surface.class}, Integer.TYPE)).intValue();
        }
        int i = -1;
        if (this.mHandle != 0) {
            i = _setVideoSurface(this.mHandle, surface);
        }
        return i;
    }

    private static void loadPlayerlibrary(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, null, changeQuickRedirect, true, 90828, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, null, changeQuickRedirect, true, 90828, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            TTPlayerConfiger.setLibraryName("lib" + str3 + ".so");
            TTPlayerConfiger.checkDebugTTPlayerLib();
            str2 = TTPlayerConfiger.getPlayerLibraryPath();
            if (str2 != null && !new File(str2).exists()) {
                str2 = null;
            }
            if (str2 != null) {
                System.load(str2);
            }
        } catch (Throwable th) {
            mErrorInfo = "load path library error." + th.toString();
            str2 = null;
        }
        if (str2 == null) {
            System.loadLibrary(str);
            mErrorInfo = null;
        }
    }

    public TTPlayer(Context context, long j) throws Exception {
        this.mContext = context;
        create(j);
    }

    public double getDoubleOption(int i, double d2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90865, new Class[]{Integer.TYPE, Double.TYPE}, Double.TYPE)) {
            return _getDoubleValue(this.mHandle, i, d2);
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90865, new Class[]{Integer.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
    }

    public float getFloatOption(int i, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90864, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return _getFloatValue(this.mHandle, i, f2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90864, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public long getLongOption(int i, long j) {
        int i2 = i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90860, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90860, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        } else if (i2 == 50) {
            return this.mHandle;
        } else {
            return _getLongValue(this.mHandle, i, j2);
        }
    }

    public void rotateCamera(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90861, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90861, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        _rotateCamera(this.mHandle, f2, f3);
    }

    public void setCacheFile(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90858, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90858, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        _setCacheFile(this.mHandle, str2, i);
    }

    public int setDoubleOption(int i, double d2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90863, new Class[]{Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
            return _setDoubleValue(this.mHandle, i, d2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90863, new Class[]{Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
    }

    public int setFloatOption(int i, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90862, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return _setFloatValue(this.mHandle, i, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90862, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public int setLongOption(int i, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90859, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return _setLongValue(this.mHandle, i, j2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90859, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
    }

    public int setStringOption(int i, String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 90856, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return _setStringValue(this.mHandle, i, str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 90856, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90846, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90846, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        _setVolume(this.mHandle, f2, f3);
    }

    public void switchStream(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90851, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90851, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        _switchStream(this.mHandle, i, i2);
    }

    public int getIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90844, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90844, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == 11) {
            return _getIntValue(this.mHandle, i, i2);
        } else {
            if (i == 51) {
                return this.mTracker;
            }
            switch (i) {
                case 1:
                    return _getDuration(this.mHandle);
                case 2:
                    return _getCurrentPosition(this.mHandle);
                case 3:
                    return _getVideoWidth(this.mHandle);
                case 4:
                    return _getVideoHeight(this.mHandle);
                case 5:
                    return _isLooping(this.mHandle);
                case 6:
                    return _isPlaying(this.mHandle);
                default:
                    return _getIntValue(this.mHandle, i, i2);
            }
        }
    }

    public int setIntOption(int i, int i2) throws RemoteException {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90855, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90855, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i3 == 22 && i4 != 0 && i4 != 2 && i4 == 1) {
            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(0);
            String str = null;
            if (str.endsWith("java")) {
                throw new RemoteException("simple crash occur");
            }
        }
        if (i3 != 111) {
            return _setIntValue(this.mHandle, i3, i4);
        }
        int length = TTPlayerKeys.SupportSampleRates.length;
        int[] iArr = new int[TTPlayerKeys.SupportSampleRates.length];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (((1 << i6) & i4) == 0) {
                iArr[i5] = TTPlayerKeys.SupportSampleRates[i6];
                i5++;
            }
        }
        _setSupprotSampleRates(iArr, i5);
        return 0;
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90847, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90847, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        _mouseEvent(this.mHandle, i, i2, i3);
    }

    public final void onLogInfo(int i, int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 90854, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 90854, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.mNotifyer != null) {
            try {
                this.mNotifyer.handleErrorNotify(this.mId, i, i2, str);
            } catch (Throwable unused) {
            }
        }
    }

    public void onNotify(int i, int i2, int i3, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 90853, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 90853, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (((this.mNotifyerState >> i2) & 1) == 1) {
            try {
                if (this.mNotifyer != null) {
                    this.mNotifyer.handlePlayerNotify(this.mId, i, i2, i3, str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
