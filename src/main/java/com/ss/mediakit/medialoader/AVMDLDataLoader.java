package com.ss.mediakit.medialoader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class AVMDLDataLoader implements Handler.Callback {
    private static volatile boolean mIsLibraryLoaded;
    private AVMDLDataLoaderConfigure mConfigure;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private AVMDLDataLoaderListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private volatile int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _cancel(long j, String str);

    private static native void _cancelAll(long j);

    private static native void _clearAllCaches(long j);

    private static native void _close(long j);

    private final native long _create();

    private static native long _getLongValue(long j, int i);

    private static native String _getStringValue(long j, int i);

    private static native String _getStringValueByStr(long j, String str, int i);

    private static native void _preloadResource(long j, String str, int i);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setStringValue(long j, int i, String str);

    private static native int _start(long j);

    private static native void _stop(long j);

    public int start() {
        if (this.mState == 1) {
            return 0;
        }
        new Thread(new Runnable() {
            public void run() {
                AVMDLDataLoader.this.startInternal();
            }
        }).start();
        return 0;
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                _stop(this.mHandle);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    private void initNativeHandle() {
        if (this.mHandle == 0) {
            try {
                this.mHandle = _create();
            } catch (Throwable unused) {
                this.mHandle = 0;
            }
            if (this.mHandle != 0 && this.mHandler == null) {
                if (Looper.myLooper() != null) {
                    this.mHandler = new Handler(this);
                    return;
                }
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
        }
    }

    public void cancelAll() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _cancelAll(this.mHandle);
                }
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    public void clearAllCaches() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _clearAllCaches(this.mHandle);
                }
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                _close(this.mHandle);
                this.mHandle = 0;
                this.mState = 5;
                if (this.mHandler != null) {
                    this.mHandler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                }
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long getAllCacheSize() {
        long j = -1;
        if (this.mState != 1) {
            return -1;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                j = _getLongValue(this.mHandle, 100);
            }
            return j;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public String getLocalAddr() {
        String str = null;
        if (this.mState != 1) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str = _getStringValue(this.mHandle, 4);
            }
            return str;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void startInternal() {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                initNativeHandle();
                if (this.mHandle != 0) {
                    setConfigureInternal(this.mConfigure);
                    if (_start(this.mHandle) >= 0) {
                        this.mState = 1;
                    }
                }
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (this.mListener == null || message.obj == null) {
            return true;
        }
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj;
        if (aVMDLDataLoaderNotifyInfo != null) {
            this.mListener.onNotify(aVMDLDataLoaderNotifyInfo);
        }
        return true;
    }

    public void setConfigure(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                this.mConfigure = aVMDLDataLoaderConfigure;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setListener(AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            this.mListener = aVMDLDataLoaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public AVMDLDataLoader(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) throws Exception {
        initNativeHandle();
        this.mReadLock = this.mReadWritedLock.readLock();
        this.mWriteLock = this.mReadWritedLock.writeLock();
        if (this.mHandle != 0) {
            this.mConfigure = aVMDLDataLoaderConfigure;
            this.mState = 0;
            return;
        }
        throw new Exception("create native mdl fail");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(3:11|12|13)|14|15|(3:17|18|19)(2:20|21)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int init(boolean r3) {
        /*
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLDataLoader> r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            boolean r1 = mIsLibraryLoaded     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            mIsLibraryLoaded = r3     // Catch:{ all -> 0x0024 }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "ttopenssl"
            java.lang.System.loadLibrary(r3)     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x001b }
            java.lang.String r3 = "avmdl"
            java.lang.System.loadLibrary(r3)     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x001b }
            r3 = 1
            mIsLibraryLoaded = r3     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x001b }
        L_0x001b:
            boolean r3 = mIsLibraryLoaded     // Catch:{ all -> 0x0024 }
            if (r3 != 0) goto L_0x0022
            r3 = -1
            monitor-exit(r0)
            return r3
        L_0x0022:
            monitor-exit(r0)
            return r2
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.init(boolean):int");
    }

    public void cancel(String str) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _cancel(this.mHandle, str);
                }
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    public String getStringCacheInfo(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str2 = _getStringValueByStr(this.mHandle, str, BaseLoginOrRegisterActivity.o);
            }
            return str2;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public String getStringValue(int i) {
        String str;
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str = _getStringValue(this.mHandle, i);
            } else {
                str = null;
            }
            return str;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public AVMDLFileInfo getCacheInfo(String str) {
        AVMDLFileInfo aVMDLFileInfo = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String[] split = _getStringValueByStr(this.mHandle, str, BaseLoginOrRegisterActivity.o).split(",");
                if (split.length >= 3) {
                    aVMDLFileInfo = new AVMDLFileInfo();
                    aVMDLFileInfo.mFilePath = split[2];
                    if (!TextUtils.isEmpty(split[0])) {
                        aVMDLFileInfo.mCacheSize = Long.valueOf(split[0]).longValue();
                    }
                    if (!TextUtils.isEmpty(split[1])) {
                        aVMDLFileInfo.mContentLenght = Long.valueOf(split[1]).longValue();
                    }
                }
            }
            return aVMDLFileInfo;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    private void setConfigureInternal(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        if (this.mHandle != 0 && aVMDLDataLoaderConfigure != null) {
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCacheDir)) {
                String createFilePathBaseDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "loaderFactory");
                if (!TextUtils.isEmpty(createFilePathBaseDir)) {
                    _setStringValue(this.mHandle, 9, createFilePathBaseDir);
                }
                _setStringValue(this.mHandle, 0, aVMDLDataLoaderConfigure.mCacheDir);
            }
            _setIntValue(this.mHandle, 1, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 2, aVMDLDataLoaderConfigure.mRWTimeOut);
            _setIntValue(this.mHandle, 3, aVMDLDataLoaderConfigure.mOpenTimeOut);
            _setIntValue(this.mHandle, 5, aVMDLDataLoaderConfigure.mTryCount);
            _setIntValue(this.mHandle, 7, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 8, aVMDLDataLoaderConfigure.mLoaderFactoryMaxMemorySize);
            _setIntValue(this.mHandle, 6, aVMDLDataLoaderConfigure.mLoaderType);
            _setIntValue(this.mHandle, 102, aVMDLDataLoaderConfigure.mPreloadParallelNum);
            _setIntValue(this.mHandle, 103, aVMDLDataLoaderConfigure.mPreloadStrategy);
            _setIntValue(this.mHandle, 104, aVMDLDataLoaderConfigure.mPreloadWaitListType);
        }
    }

    public void setIntValue(int i, int i2) {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                _setIntValue(this.mHandle, i, i2);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void preloadResource(String str, int i) {
        if (this.mState == 1 && !TextUtils.isEmpty(str) && i != 0) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _preloadResource(this.mHandle, str, i);
                }
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    public void setStringValue(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _setStringValue(this.mHandle, i, str);
                }
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    private String createFilePathBaseDir(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str.charAt(str.length() - 1) == '/') {
            str3 = str + str2;
        } else {
            str3 = str + "/" + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str3;
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mState == 1 && this.mHandler != null) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i;
            aVMDLDataLoaderNotifyInfo.code = (long) i2;
            aVMDLDataLoaderNotifyInfo.logInfo = str;
            aVMDLDataLoaderNotifyInfo.logToJson();
            switch (i) {
                case 0:
                    aVMDLDataLoaderNotifyInfo.logType = "media_loader";
                    break;
                case 1:
                    aVMDLDataLoaderNotifyInfo.logType = "own_vdp";
                    break;
            }
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            obtainMessage.sendToTarget();
        }
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState == 1 && this.mHandler != null) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i;
            aVMDLDataLoaderNotifyInfo.parameter = j;
            aVMDLDataLoaderNotifyInfo.code = (long) i2;
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            obtainMessage.what = i;
            obtainMessage.sendToTarget();
        }
    }
}
