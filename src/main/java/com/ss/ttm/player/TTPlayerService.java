package com.ss.ttm.player;

import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TTPlayerService extends Service {
    public static boolean IsErrored = false;
    private static final String TAG = "TTPlayerService";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mAppFileDir;
    private static String mCrashPath;
    private ComponentCallbacks mLowMemoryCallback;

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public static String getAppFilesPath() {
        return mAppFileDir;
    }

    public static String getCrashPath() {
        return mCrashPath;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91092, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91092, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        unregisterComponentCallbacks(this.mLowMemoryCallback);
        TTCrashUtil.saveStopInfo("onDestroy", mCrashPath);
    }

    private void initService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91095, new Class[0], Void.TYPE);
            return;
        }
        TTCrashUtil.checkLogDir(mAppFileDir);
        TTPlayer.setTempFileDir(mAppFileDir);
        TTPlayer.setCrashPath(mCrashPath);
        TTPlayer.setIsIPPlayer(true);
        if (!TTPlayerConfiger.getValue(4, false)) {
            TTPlayer.registerPlayerInfo();
        }
        IsErrored = TTPlayer.isError();
        Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new TTExceptionHandler(mCrashPath));
        if (Build.VERSION.SDK_INT < 14) {
            this.mLowMemoryCallback = new TTLowMemoryCallback(mCrashPath);
        } else {
            this.mLowMemoryCallback = new TTLowMemoryCallback2(mCrashPath);
        }
        registerComponentCallbacks(this.mLowMemoryCallback);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91090, new Class[0], Void.TYPE);
            return;
        }
        try {
            mAppFileDir = TTPlayerConfiger.getAppFileCachePath(this);
            if (TTPlayerConfiger.getValue(18, 1) > 1) {
                mCrashPath = TTPlayerConfiger.getAppCrashFilePath2(this);
            } else {
                mCrashPath = TTPlayerConfiger.getAppCrashFileStorePath(this);
            }
            initService();
        } catch (Throwable unused) {
            IsErrored = true;
        }
    }

    public void onRebind(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, changeQuickRedirect, false, 91094, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, changeQuickRedirect, false, 91094, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onRebind(intent);
    }

    public IBinder onBind(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, changeQuickRedirect, false, 91091, new Class[]{Intent.class}, IBinder.class)) {
            return (IBinder) PatchProxy.accessDispatch(new Object[]{intent}, this, changeQuickRedirect, false, 91091, new Class[]{Intent.class}, IBinder.class);
        }
        try {
            try {
                return new TTPlayerStub(this);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public boolean onUnbind(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, changeQuickRedirect, false, 91093, new Class[]{Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent}, this, changeQuickRedirect, false, 91093, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
        }
        TTCrashUtil.saveStopInfo("onUnbind", mCrashPath);
        return true;
    }
}
