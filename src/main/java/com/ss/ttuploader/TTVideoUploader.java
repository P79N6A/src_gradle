package com.ss.ttuploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

public class TTVideoUploader implements Handler.Callback {
    private static boolean IsErrored = true;
    int currentType;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private TTVideoUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private static native void _close(long j);

    private final native long _create(int i);

    private static native String _getStringValue(long j, int i);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setObject(long j, int i, Object obj);

    private static native void _setPoster(long j, float f2);

    private static native void _setStringValue(long j, int i, String str);

    private static native void _start(long j);

    private static native String _stop(long j);

    public static boolean isError() {
        return IsErrored;
    }

    static {
        try {
            System.loadLibrary("ttvideouploader");
        } catch (Throwable unused) {
        }
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                _close(this.mHandle);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void start() {
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                addLogToManager(_stop(this.mHandle));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public TTVideoUploader() throws Exception {
        try {
            this.mHandle = _create(0);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            this.mState = 0;
            return;
        }
        throw new Exception("create native uploader fail");
    }

    public void setCurrentType(int i) {
        this.currentType = i;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTVideoUploaderListener tTVideoUploaderListener) {
        this.mListener = tTVideoUploaderListener;
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setPathName(String str) {
        setStringValue(0, str);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    public void setVideoUploadDomain(String str) {
        setStringValue(3, str);
    }

    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
        return jSONObject;
    }

    private void setDeviceID(long j) {
        if (this.mHandle != 0 && j > 0) {
            _setInt64Value(this.mHandle, 66, j);
        }
    }

    private void setTraceId(String str) {
        if (this.mHandle != 0 && str != null && !str.isEmpty()) {
            _setStringValue(this.mHandle, 69, str);
        }
    }

    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        if (this.mListener == null) {
            return true;
        }
        TTVideoInfo tTVideoInfo = (TTVideoInfo) message.obj;
        if (tTVideoInfo != null) {
            j = tTVideoInfo.mProgress;
        } else {
            j = 0;
        }
        this.mListener.onNotify(i, j, tTVideoInfo);
        return true;
    }

    public void setAliveMaxFailTime(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 22, i);
        }
    }

    public void setAuthorization(String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, 15, str);
        }
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (mapToString != null) {
                setStringValue(56, mapToString);
            }
        }
    }

    public void setEnableExternDNS(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 21, i);
        }
    }

    public void setEnableExternNet(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 26, i);
        }
    }

    public void setEnableFiletryHttps(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 25, i);
        }
    }

    public void setEnableHttps(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 19, i);
        }
    }

    public void setEnableKeepAlive(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 20, i);
        }
    }

    public void setEnableMutiTask(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 29, i);
        }
    }

    public void setEnablePostMethod(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 23, i);
        }
    }

    public void setEnableQuic(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 28, i);
        }
    }

    public void setEnableServerHost(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 17, i);
        }
    }

    public void setEnableUpHost(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 18, i);
        }
    }

    public void setExternFileReader(TTExternFileReader tTExternFileReader) {
        if (this.mHandle != 0 && tTExternFileReader != null) {
            _setObject(this.mHandle, 200, tTExternFileReader);
        }
    }

    public void setFileRetryCount(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 6, i);
        }
    }

    public void setMaxFailTime(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 13, i);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader) {
        if (this.mHandle != 0 && tTMediaDataReader != null) {
            _setObject(this.mHandle, 201, tTMediaDataReader);
        }
    }

    public void setOpenBoe(boolean z) {
        if (this.mHandle != 0) {
            if (z) {
                _setIntValue(this.mHandle, 67, 1);
            } else {
                _setIntValue(this.mHandle, 67, 0);
            }
        }
    }

    public void setOpenResume(boolean z) {
        if (this.mHandle != 0) {
            if (z) {
                _setIntValue(this.mHandle, 70, 1);
            } else {
                _setIntValue(this.mHandle, 70, 0);
            }
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (!TextUtils.isEmpty(mapToString)) {
                setStringValue(55, mapToString);
            }
        }
    }

    public void setPoster(float f2) {
        if (this.mHandle != 0 && f2 >= 0.0f) {
            _setPoster(this.mHandle, f2);
        }
    }

    public void setServerParameter(String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, 16, str);
        }
    }

    public void setSliceReTryCount(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 5, i);
        }
    }

    public void setSliceSize(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 8, i);
        }
    }

    public void setSliceTimeout(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 7, i);
        }
    }

    public void setSocketNum(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 9, i);
        }
    }

    public void setTTExternLoader(TTExternNetLoader tTExternNetLoader) {
        if (this.mHandle != 0 && tTExternNetLoader != null) {
            _setObject(this.mHandle, 27, tTExternNetLoader);
        }
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 24, i);
        }
    }

    public void setTranTimeOutUnit(int i) {
        if (this.mHandle != 0 && i > 0) {
            _setIntValue(this.mHandle, 64, i);
        }
    }

    public void setUserRefrence(String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, 62, str);
        }
    }

    public void setVideoObjectType(String str) {
        if (this.mHandle != 0 && str != null && !str.equals("")) {
            setStringValue(54, str);
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            JSONObject mapToJSON = TTUploadUtil.mapToJSON(treeMap);
            if (mapToJSON != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("custom_config", mapToJSON);
                    String jSONObject2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        setStringValue(63, jSONObject2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        if (map.get(69) == null || !(map.get(69) instanceof String)) {
            if (map.get(66) != null && (map.get(66) instanceof Long)) {
                long longValue = ((Long) map.get(66)).longValue();
                if (longValue > 0) {
                    setDeviceID(longValue);
                }
            }
            return;
        }
        String str = (String) map.get(69);
        if (str != null && !str.isEmpty()) {
            setTraceId(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TTVideoUploader(int r5) throws java.lang.Exception {
        /*
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.mState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.mReadWritedLock = r0
            r0 = 0
            r4.mListener = r0
            r4.setCurrentType(r5)
            r0 = 0
            if (r5 == 0) goto L_0x001d
            r2 = 1
            if (r5 == r2) goto L_0x001d
            r2 = 3
            if (r5 != r2) goto L_0x0024
        L_0x001d:
            long r2 = r4._create(r5)     // Catch:{ Throwable -> 0x0024 }
            r4.mHandle = r2     // Catch:{ Throwable -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r4.mHandle = r0
        L_0x0026:
            long r2 = r4.mHandle
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0059
            android.os.Looper r5 = android.os.Looper.myLooper()
            if (r5 == 0) goto L_0x003a
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r4)
            r4.mHandler = r5
            goto L_0x0045
        L_0x003a:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0, r4)
            r4.mHandler = r5
        L_0x0045:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r4.mReadWritedLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()
            r4.mReadLock = r5
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r4.mReadWritedLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()
            r4.mWriteLock = r5
            r5 = 0
            r4.mState = r5
            return
        L_0x0059:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r0 = "create native uploader fail"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTVideoUploader.<init>(int):void");
    }

    public void setStringValue(int i, String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, i, str);
        }
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mListener != null) {
            this.mListener.onLog(i, i2, str);
        }
    }

    public void onNotify(int i, long j, int i2) {
        int i3 = i;
        if (this.mState == 1) {
            TTVideoInfo tTVideoInfo = null;
            switch (i3) {
                case 0:
                    this.mEndTime = System.currentTimeMillis();
                    String _getStringValue = _getStringValue(this.mHandle, 10);
                    String _getStringValue2 = _getStringValue(this.mHandle, 11);
                    String _getStringValue3 = _getStringValue(this.mHandle, 12);
                    String _getStringValue4 = _getStringValue(this.mHandle, c.f69428f);
                    String _getStringValue5 = _getStringValue(this.mHandle, 51);
                    String _getStringValue6 = _getStringValue(this.mHandle, 50);
                    String _getStringValue7 = _getStringValue(this.mHandle, 52);
                    String _getStringValue8 = _getStringValue(this.mHandle, 53);
                    String _getStringValue9 = _getStringValue(this.mHandle, 57);
                    String _getStringValue10 = _getStringValue(this.mHandle, 58);
                    String _getStringValue11 = _getStringValue(this.mHandle, 59);
                    String _getStringValue12 = _getStringValue(this.mHandle, 68);
                    if (this.currentType == 1) {
                        tTVideoInfo = new TTVideoInfo(_getStringValue5, _getStringValue6, _getStringValue7, _getStringValue8, j, _getStringValue9, _getStringValue10, _getStringValue11);
                    } else {
                        tTVideoInfo = new TTVideoInfo(_getStringValue, _getStringValue2, _getStringValue3, j, _getStringValue4, _getStringValue12);
                    }
                    tTVideoInfo.mLog = addLogToManager(_getStringValue(this.mHandle, 100));
                    this.mState = 3;
                    break;
                case 1:
                    tTVideoInfo = new TTVideoInfo(null, null, null, j, null, null);
                    break;
                case 2:
                    String _getStringValue13 = _getStringValue(this.mHandle, 100);
                    TTVideoInfo tTVideoInfo2 = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
                    addLogToManager(_getStringValue13);
                    this.mState = 2;
                    tTVideoInfo = tTVideoInfo2;
                    break;
            }
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i3;
            obtainMessage.obj = tTVideoInfo;
            obtainMessage.sendToTarget();
        }
    }
}
