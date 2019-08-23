package org.android.spdy;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class SpdyAgent {
    private static Object domainHashLock = new Object();
    private static HashMap<String, Integer> domainHashMap = new HashMap<>();
    public static volatile boolean enableDebug;
    public static volatile boolean enableTimeGaurd;
    private static volatile SpdyAgent gSingleInstance = null;
    private static volatile boolean loadSucc = false;
    private static Object lock = new Object();
    private static final Lock r;
    private static final ReentrantReadWriteLock rwLock;
    private static int totalDomain = 0;
    private static final Lock w = rwLock.writeLock();
    private AccsSSLCallback accsSSLCallback;
    private long agentNativePtr;
    private AtomicBoolean closed = new AtomicBoolean();
    private String proxyPassword = null;
    private String proxyUsername = null;
    private HashMap<String, SpdySession> sessionMgr = new HashMap<>(5);
    private LinkedList<SpdySession> sessionQueue = new LinkedList<>();

    private native int closeSessionN(long j);

    private static native int configIpStackModeN(int i);

    private native int configLogFileN(String str, int i, int i2);

    private native int configLogFileN(String str, int i, int i2, int i3);

    private static void crashReporter(int i) {
    }

    private native long createSessionN(long j, SpdySession spdySession, int i, byte[] bArr, char c2, byte[] bArr2, char c3, byte[] bArr3, byte[] bArr4, Object obj, int i2, int i3, int i4, byte[] bArr5);

    private native int freeAgent(long j);

    private void getPerformance(SpdySession spdySession, SslPermData sslPermData) {
    }

    private native long getSession(long j, byte[] bArr, char c2);

    private native long initAgent(int i, int i2, int i3);

    @Deprecated
    public static void inspect(String str) {
    }

    private native void logFileCloseN();

    private native void logFileFlushN();

    private native int setConTimeout(long j, int i);

    private native int setSessionKind(long j, int i);

    public final void close() {
    }

    @Deprecated
    public final void switchAccsServer(int i) {
    }

    public static boolean checkLoadSucc() {
        return loadSucc;
    }

    public final HashMap<String, SpdySession> getAllSession() {
        return this.sessionMgr;
    }

    public final void logFileFlush() {
        if (loadSucc) {
            logFileFlushN();
        }
    }

    public final void logFileClose() {
        if (loadSucc) {
            logFileFlushN();
            logFileCloseN();
        }
    }

    private void agentIsOpen() {
        if (!this.closed.get()) {
            checkLoadSo();
            return;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_ASYNC_CLOSE", -1104);
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        rwLock = reentrantReadWriteLock;
        r = reentrantReadWriteLock.readLock();
    }

    private void checkLoadSo() throws SpdyErrorException {
        if (!loadSucc) {
            try {
                synchronized (lock) {
                    if (!loadSucc) {
                        loadSucc = SoInstallMgrSdk.initSo("tnet-3.1.14", 1);
                        this.agentNativePtr = initAgent(0, 0, 0);
                    } else {
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        if (!loadSucc) {
            throw new SpdyErrorException("TNET_JNI_ERR_LOAD_SO_FAIL", -1108);
        }
    }

    /* access modifiers changed from: package-private */
    public final int closeSession(long j) {
        return closeSessionN(j);
    }

    @Deprecated
    public final int setConnectTimeOut(int i) {
        agentIsOpen();
        try {
            return setConTimeout(this.agentNativePtr, i);
        } catch (UnsatisfiedLinkError unused) {
            return 0;
        }
    }

    @Deprecated
    public final int setSessionKind(SpdySessionKind spdySessionKind) {
        agentIsOpen();
        try {
            return setSessionKind(this.agentNativePtr, spdySessionKind.getint());
        } catch (UnsatisfiedLinkError unused) {
            return -1;
        }
    }

    public static int configIpStackMode(int i) {
        spduLog.Logi("tnet-jni", "[configIpStackMode] - " + i);
        return configIpStackModeN(i);
    }

    private byte[] getSSLMeta(SpdySession spdySession) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[getSSLMeta] - session is null");
            return null;
        } else if (spdySession.intenalcb != null) {
            return spdySession.intenalcb.getSSLMeta(spdySession);
        } else {
            spduLog.Logi("tnet-jni", "[getSSLMeta] - session.intenalcb is null");
            return null;
        }
    }

    static void tableListJudge(int i) {
        if (i >= 5242880) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i, -1102);
        }
    }

    /* access modifiers changed from: package-private */
    public final void removeSession(SpdySession spdySession) {
        w.lock();
        try {
            this.sessionQueue.remove(spdySession);
        } finally {
            w.unlock();
        }
    }

    public final void setAccsSslCallback(AccsSSLCallback accsSSLCallback2) {
        spduLog.Logi("tnet-jni", "[setAccsSslCallback] - " + accsSSLCallback2.getClass());
        this.accsSSLCallback = accsSSLCallback2;
    }

    private int getDomainHashIndex(String str) {
        Integer num;
        synchronized (domainHashLock) {
            num = domainHashMap.get(str);
            if (num == null) {
                HashMap<String, Integer> hashMap = domainHashMap;
                int i = totalDomain + 1;
                totalDomain = i;
                hashMap.put(str, Integer.valueOf(i));
                num = Integer.valueOf(totalDomain);
            }
        }
        return num.intValue();
    }

    static String[] mapToByteArray(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        String[] strArr = new String[(map.size() * 2)];
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr[i + 1] = (String) next.getValue();
            i += 2;
        }
        return strArr;
    }

    static Map<String, List<String>> stringArrayToMap(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap(5);
        int i = 0;
        while (true) {
            int i2 = i + 2;
            if (i2 <= strArr.length) {
                if (strArr[i] == null) {
                    break;
                }
                int i3 = i + 1;
                if (strArr[i3] == null) {
                    break;
                }
                List list = (List) hashMap.get(strArr[i]);
                if (list == null) {
                    list = new ArrayList(1);
                    hashMap.put(strArr[i], list);
                }
                list.add(strArr[i3]);
                i = i2;
            } else {
                return hashMap;
            }
        }
        return null;
    }

    static void headJudge(Map<String, String> map) {
        if (map != null) {
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                InvlidCharJudge(str.getBytes(), str2.getBytes());
                i += str.length() + 1 + str2.length();
                securityCheck(i, str2.length());
            }
        }
    }

    static String mapBodyToString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            return null;
        }
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            sb.append(str);
            sb.append('=');
            sb.append(str2);
            sb.append('&');
            i += str.length() + 1 + str2.length();
            tableListJudge(i);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public final SpdySession createSession(SessionInfo sessionInfo) throws SpdyErrorException {
        return createSession(sessionInfo.getAuthority(), sessionInfo.getDomain(), sessionInfo.getSessonUserData(), sessionInfo.getSessionCb(), null, sessionInfo.getMode(), sessionInfo.getPubKeySeqNum(), sessionInfo.getConnectionTimeoutMs(), sessionInfo.getCertHost());
    }

    public final void setProxyUsernamePassword(String str, String str2) {
        this.proxyUsername = str;
        this.proxyPassword = str2;
    }

    private byte[] getSSLPublicKey(int i, byte[] bArr) {
        if (this.accsSSLCallback != null) {
            return this.accsSSLCallback.getSSLPublicKey(i, bArr);
        }
        spduLog.Logd("tnet-jni", "[getSSLPublicKey] - accsSSLCallback is null.");
        return null;
    }

    private int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[putSSLMeta] - session is null");
            return -1;
        } else if (spdySession.intenalcb != null) {
            return spdySession.intenalcb.putSSLMeta(spdySession, bArr);
        } else {
            spduLog.Logi("tnet-jni", "[putSSLMeta] - session.intenalcb is null");
            return -1;
        }
    }

    static void InvlidCharJudge(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 255) < 32 || (bArr[i] & 255) > 126) {
                bArr[i] = 63;
            }
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if ((bArr2[i2] & 255) < 32 || (bArr2[i2] & 255) > 126) {
                bArr2[i2] = 63;
            }
        }
    }

    private void bioPingRecvCallback(SpdySession spdySession, int i) {
        spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.bioPingRecvCallback(spdySession, i);
        }
    }

    static byte[] dataproviderToByteArray(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider) {
        byte[] bArr;
        headJudge(spdyRequest.getHeaders());
        if (spdyDataProvider == null) {
            return null;
        }
        String mapBodyToString = mapBodyToString(spdyDataProvider.postBody);
        if (mapBodyToString != null) {
            bArr = mapBodyToString.getBytes();
        } else {
            bArr = spdyDataProvider.data;
        }
        if (bArr == null || bArr.length < 5242880) {
            return bArr;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + bArr.length, -1102);
    }

    static void securityCheck(int i, int i2) {
        if (i >= 32768) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i, -1102);
        } else if (i2 >= 8192) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:value=" + i2, -1102);
        }
    }

    private void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdySessionConnectCB(spdySession, superviseConnectInfo);
        }
    }

    public final int configLogFile(String str, int i, int i2) {
        if (loadSucc) {
            return configLogFileN(str, i, i2);
        }
        return -1;
    }

    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind) throws UnsatisfiedLinkError, SpdyErrorException {
        if (gSingleInstance == null) {
            synchronized (lock) {
                if (gSingleInstance == null) {
                    gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, null);
                }
            }
        }
        return gSingleInstance;
    }

    private void spdyPingRecvCallback(SpdySession spdySession, int i, Object obj) {
        spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyPingRecvCallback(spdySession, (long) i, obj);
        }
    }

    private void spdyRequestRecvCallback(SpdySession spdySession, int i, int i2) {
        long j = ((long) i) & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyRequestRecvCallback(spdySession, j, i2);
        }
    }

    private void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        spduLog.Logi("tnet-jni", "[spdySessionFailedError] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session is null");
        } else {
            try {
                if (spdySession.intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session.intenalcb is null");
                } else {
                    spdySession.intenalcb.spdySessionFailedError(spdySession, i, obj);
                }
            } finally {
                spdySession.cleanUp();
            }
        }
        spdySession.releasePptr();
    }

    private void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session is null");
            return;
        }
        try {
            if (spdySession.intenalcb == null) {
                spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session.intenalcb is null");
            } else {
                spdySession.intenalcb.spdySessionOnWritable(spdySession, obj, i);
            }
        } catch (Throwable th) {
            spduLog.Loge("tnet-jni", "[spdySessionOnWritable] - exception:" + th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void clearSpdySession(String str, String str2, int i) {
        if (str != null) {
            w.lock();
            if (str != null) {
                try {
                    HashMap<String, SpdySession> hashMap = this.sessionMgr;
                    hashMap.remove(str + str2 + i);
                } catch (Throwable th) {
                    w.unlock();
                    throw th;
                }
            }
            w.unlock();
        }
    }

    @Deprecated
    public final SpdySession createSession(String str, Object obj, SessionCb sessionCb, int i) throws SpdyErrorException {
        return createSession(str, "", obj, sessionCb, null, i, 0);
    }

    public final int configLogFile(String str, int i, int i2, int i3) {
        if (loadSucc) {
            return configLogFileN(str, i, i2, i3);
        }
        return -1;
    }

    @Deprecated
    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback2) throws UnsatisfiedLinkError, SpdyErrorException {
        if (gSingleInstance == null) {
            synchronized (lock) {
                if (gSingleInstance == null) {
                    gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, accsSSLCallback2);
                }
            }
        }
        return gSingleInstance;
    }

    private void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyCustomControlFrameFailCallback(spdySession, obj, i, i2);
        }
    }

    private void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - errorCode = " + i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session is null");
        } else {
            try {
                if (spdySession.intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session.intenalcb is null");
                } else {
                    spdySession.intenalcb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i);
                }
            } finally {
                spdySession.cleanUp();
            }
        }
        spdySession.releasePptr();
    }

    private void spdyStreamResponseRecv(SpdySession spdySession, int i, String[] strArr, int i2) {
        spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - ");
        Map<String, List<String>> stringArrayToMap = stringArrayToMap(strArr);
        long j = ((long) i) & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyOnStreamResponse(spdySession, j, stringArrayToMap, i2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private SpdyAgent(android.content.Context r3, org.android.spdy.SpdyVersion r4, org.android.spdy.SpdySessionKind r5, org.android.spdy.AccsSSLCallback r6) throws java.lang.UnsatisfiedLinkError {
        /*
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 5
            r0.<init>(r1)
            r2.sessionMgr = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.sessionQueue = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.closed = r0
            r0 = 0
            r2.proxyUsername = r0
            r2.proxyPassword = r0
            org.android.spdy.SoInstallMgrSdk.init(r3)     // Catch:{ Throwable -> 0x002a }
            java.lang.String r3 = "tnet-3.1.14"
            r0 = 1
            boolean r3 = org.android.spdy.SoInstallMgrSdk.initSo(r3, r0)     // Catch:{ Throwable -> 0x002a }
            loadSucc = r3     // Catch:{ Throwable -> 0x002a }
        L_0x002a:
            int r3 = r4.getInt()     // Catch:{ UnsatisfiedLinkError -> 0x0040 }
            int r4 = r5.getint()     // Catch:{ UnsatisfiedLinkError -> 0x0040 }
            org.android.spdy.SslVersion r5 = org.android.spdy.SslVersion.SLIGHT_VERSION_V1     // Catch:{ UnsatisfiedLinkError -> 0x0040 }
            int r5 = r5.getint()     // Catch:{ UnsatisfiedLinkError -> 0x0040 }
            long r3 = r2.initAgent(r3, r4, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0040 }
            r2.agentNativePtr = r3     // Catch:{ UnsatisfiedLinkError -> 0x0040 }
            r2.accsSSLCallback = r6     // Catch:{ UnsatisfiedLinkError -> 0x0040 }
        L_0x0040:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.closed
            r4 = 0
            r3.set(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SpdyAgent.<init>(android.content.Context, org.android.spdy.SpdyVersion, org.android.spdy.SpdySessionKind, org.android.spdy.AccsSSLCallback):void");
    }

    @Deprecated
    public final SpdySession createSession(String str, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i) throws SpdyErrorException {
        return createSession(str, "", obj, sessionCb, sslCertcb, i, 0);
    }

    private void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, int i, SpdyByteArray spdyByteArray, int i2) {
        spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - ");
        long j = 4294967295L & ((long) i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyDataChunkRecvCB(spdySession, z, j, spdyByteArray, i2);
        }
    }

    private void spdyDataRecvCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - ");
        long j = 4294967295L & ((long) i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyDataRecvCallback(spdySession, z, j, i2, i3);
        }
    }

    private void spdyDataSendCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        long j = 4294967295L & ((long) i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyDataSendCallback(spdySession, z, j, i2, i3);
        }
    }

    private void spdyStreamCloseCallback(SpdySession spdySession, int i, int i2, int i3, SuperviseData superviseData) {
        spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - ");
        long j = ((long) i) & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyStreamCloseCallback(spdySession, j, i2, i3, superviseData);
        }
    }

    @Deprecated
    public final SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, int i) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, null, i, 0);
    }

    @Deprecated
    public final SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i) throws SpdyErrorException {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, (SslCertcb) null, i);
    }

    private void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session is null");
        } else if (spdySession.intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyCustomControlFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr);
        }
    }

    @Deprecated
    public final SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i, i2, -1);
    }

    public final SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i, int i2) throws SpdyErrorException {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, null, i, i2);
    }

    @Deprecated
    public final SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i) throws SpdyErrorException {
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, 0, spdyRequest.getConnectionTimeoutMs());
        SpdyRequest spdyRequest2 = spdyRequest;
        SpdyDataProvider spdyDataProvider2 = spdyDataProvider;
        Object obj3 = obj2;
        Spdycb spdycb2 = spdycb;
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    public final SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2, int i3) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i, i2, i3, null);
    }

    @Deprecated
    public final SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, i2, spdyRequest.getConnectionTimeoutMs());
        SpdyRequest spdyRequest2 = spdyRequest;
        SpdyDataProvider spdyDataProvider2 = spdyDataProvider;
        Object obj3 = obj2;
        Spdycb spdycb2 = spdycb;
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0180 A[Catch:{ all -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0185 A[Catch:{ all -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018a A[Catch:{ all -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.android.spdy.SpdySession createSession(java.lang.String r25, java.lang.String r26, java.lang.Object r27, org.android.spdy.SessionCb r28, org.android.spdy.SslCertcb r29, int r30, int r31, int r32, java.lang.String r33) throws org.android.spdy.SpdyErrorException {
        /*
            r24 = this;
            r15 = r24
            r0 = r25
            r14 = r26
            r13 = r30
            if (r0 == 0) goto L_0x01f1
            java.lang.String r1 = "/"
            java.lang.String[] r1 = r0.split(r1)
            r17 = 0
            r2 = r1[r17]
            java.lang.String r3 = ":"
            java.lang.String[] r11 = r2.split(r3)
            java.lang.String r2 = "0.0.0.0"
            byte[] r2 = r2.getBytes()
            int r3 = r1.length
            r12 = 1
            if (r3 == r12) goto L_0x003f
            r1 = r1[r12]
            java.lang.String r2 = ":"
            java.lang.String[] r1 = r1.split(r2)
            r2 = r1[r17]
            byte[] r2 = r2.getBytes()
            r1 = r1[r12]
            int r1 = java.lang.Integer.parseInt(r1)
            char r1 = (char) r1
            r10 = r0
            r18 = r1
            r16 = r2
            goto L_0x0055
        L_0x003f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = "/0.0.0.0:0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10 = r1
            r16 = r2
            r18 = 0
        L_0x0055:
            r24.agentIsOpen()
            java.util.concurrent.locks.Lock r1 = r
            r1.lock()
            java.util.HashMap<java.lang.String, org.android.spdy.SpdySession> r1 = r15.sessionMgr     // Catch:{ all -> 0x01e9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e9 }
            r2.<init>()     // Catch:{ all -> 0x01e9 }
            r2.append(r10)     // Catch:{ all -> 0x01e9 }
            r2.append(r14)     // Catch:{ all -> 0x01e9 }
            r2.append(r13)     // Catch:{ all -> 0x01e9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e9 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x01e9 }
            org.android.spdy.SpdySession r1 = (org.android.spdy.SpdySession) r1     // Catch:{ all -> 0x01e9 }
            java.util.HashMap<java.lang.String, org.android.spdy.SpdySession> r2 = r15.sessionMgr     // Catch:{ all -> 0x01e9 }
            int r2 = r2.size()     // Catch:{ all -> 0x01e9 }
            r3 = 50
            if (r2 < r3) goto L_0x0083
            r2 = 1
            goto L_0x0084
        L_0x0083:
            r2 = 0
        L_0x0084:
            java.util.concurrent.locks.Lock r3 = r
            r3.unlock()
            if (r2 != 0) goto L_0x01de
            if (r1 == 0) goto L_0x0091
            r1.increRefCount()
            return r1
        L_0x0091:
            java.util.concurrent.locks.Lock r1 = w
            r1.lock()
            r19 = 0
            java.util.HashMap<java.lang.String, org.android.spdy.SpdySession> r1 = r15.sessionMgr     // Catch:{ Throwable -> 0x00b3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b3 }
            r2.<init>()     // Catch:{ Throwable -> 0x00b3 }
            r2.append(r10)     // Catch:{ Throwable -> 0x00b3 }
            r2.append(r14)     // Catch:{ Throwable -> 0x00b3 }
            r2.append(r13)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00b3 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Throwable -> 0x00b3 }
            org.android.spdy.SpdySession r1 = (org.android.spdy.SpdySession) r1     // Catch:{ Throwable -> 0x00b3 }
            goto L_0x00b5
        L_0x00b3:
            r1 = r19
        L_0x00b5:
            if (r1 == 0) goto L_0x00c0
            java.util.concurrent.locks.Lock r0 = w
            r0.unlock()
            r1.increRefCount()
            return r1
        L_0x00c0:
            org.android.spdy.SpdySession r9 = new org.android.spdy.SpdySession     // Catch:{ all -> 0x01d6 }
            r2 = 0
            r1 = r9
            r4 = r24
            r5 = r10
            r6 = r26
            r7 = r28
            r8 = r30
            r20 = r9
            r9 = r31
            r21 = r10
            r10 = r27
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01d6 }
            if (r33 != 0) goto L_0x00de
            r22 = r19
            goto L_0x00e4
        L_0x00de:
            byte[] r1 = r33.getBytes()     // Catch:{ all -> 0x01d6 }
            r22 = r1
        L_0x00e4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d6 }
            r1.<init>()     // Catch:{ all -> 0x01d6 }
            r1.append(r14)     // Catch:{ all -> 0x01d6 }
            r1.append(r13)     // Catch:{ all -> 0x01d6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d6 }
            int r5 = r15.getDomainHashIndex(r1)     // Catch:{ all -> 0x01d6 }
            java.lang.String r1 = r15.proxyUsername     // Catch:{ all -> 0x01d6 }
            if (r1 == 0) goto L_0x0138
            java.lang.String r1 = r15.proxyPassword     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x0138
            long r2 = r15.agentNativePtr     // Catch:{ all -> 0x0133 }
            r1 = r11[r17]     // Catch:{ all -> 0x0133 }
            byte[] r6 = r1.getBytes()     // Catch:{ all -> 0x0133 }
            r1 = r11[r12]     // Catch:{ all -> 0x0133 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0133 }
            char r7 = (char) r1     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = r15.proxyUsername     // Catch:{ all -> 0x0133 }
            byte[] r10 = r1.getBytes()     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = r15.proxyPassword     // Catch:{ all -> 0x0133 }
            byte[] r11 = r1.getBytes()     // Catch:{ all -> 0x0133 }
            r1 = r24
            r4 = r20
            r8 = r16
            r9 = r18
            r23 = 1
            r12 = r27
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r22
            long r1 = r1.createSessionN(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0133 }
            goto L_0x0163
        L_0x0133:
            r0 = move-exception
            r1 = r24
            goto L_0x01d8
        L_0x0138:
            r23 = 1
            r15 = r24
            long r2 = r15.agentNativePtr     // Catch:{ all -> 0x01d6 }
            r1 = r11[r17]     // Catch:{ all -> 0x01d6 }
            byte[] r6 = r1.getBytes()     // Catch:{ all -> 0x01d6 }
            r1 = r11[r23]     // Catch:{ all -> 0x01d6 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x01d6 }
            char r7 = (char) r1
            r10 = 0
            r11 = 0
            r1 = r24
            r4 = r20
            r8 = r16
            r9 = r18
            r12 = r27
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r22
            long r1 = r1.createSessionN(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0133 }
        L_0x0163:
            java.lang.String r3 = "tnet-jni"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = " create new session: "
            r4.<init>(r5)     // Catch:{ all -> 0x0133 }
            r4.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0133 }
            org.android.spdy.spduLog.Logi(r3, r0)     // Catch:{ all -> 0x0133 }
            r3 = 1
            long r5 = r1 & r3
            r7 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0185
            long r0 = r1 >> r23
            int r0 = (int) r0     // Catch:{ all -> 0x0133 }
            r1 = r7
            goto L_0x0186
        L_0x0185:
            r0 = 0
        L_0x0186:
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01b8
            r3 = r20
            r3.setSessionNativePtr(r1)     // Catch:{ all -> 0x0133 }
            r1 = r24
            java.util.HashMap<java.lang.String, org.android.spdy.SpdySession> r0 = r1.sessionMgr     // Catch:{ all -> 0x01b6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            r2.<init>()     // Catch:{ all -> 0x01b6 }
            r4 = r21
            r2.append(r4)     // Catch:{ all -> 0x01b6 }
            r4 = r26
            r2.append(r4)     // Catch:{ all -> 0x01b6 }
            r4 = r30
            r2.append(r4)     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b6 }
            r0.put(r2, r3)     // Catch:{ all -> 0x01b6 }
            java.util.LinkedList<org.android.spdy.SpdySession> r0 = r1.sessionQueue     // Catch:{ all -> 0x01b6 }
            r0.add(r3)     // Catch:{ all -> 0x01b6 }
            r19 = r3
            goto L_0x01bc
        L_0x01b6:
            r0 = move-exception
            goto L_0x01d8
        L_0x01b8:
            r1 = r24
            if (r0 != 0) goto L_0x01c2
        L_0x01bc:
            java.util.concurrent.locks.Lock r0 = w
            r0.unlock()
            return r19
        L_0x01c2:
            org.android.spdy.SpdyErrorException r2 = new org.android.spdy.SpdyErrorException     // Catch:{ all -> 0x01b6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            java.lang.String r4 = "create session error: "
            r3.<init>(r4)     // Catch:{ all -> 0x01b6 }
            r3.append(r0)     // Catch:{ all -> 0x01b6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01b6 }
            r2.<init>((java.lang.String) r3, (int) r0)     // Catch:{ all -> 0x01b6 }
            throw r2     // Catch:{ all -> 0x01b6 }
        L_0x01d6:
            r0 = move-exception
            r1 = r15
        L_0x01d8:
            java.util.concurrent.locks.Lock r2 = w
            r2.unlock()
            throw r0
        L_0x01de:
            r1 = r15
            org.android.spdy.SpdyErrorException r0 = new org.android.spdy.SpdyErrorException
            r2 = -1105(0xfffffffffffffbaf, float:NaN)
            java.lang.String r3 = "SPDY_SESSION_EXCEED_MAXED: session count exceed max"
            r0.<init>((java.lang.String) r3, (int) r2)
            throw r0
        L_0x01e9:
            r0 = move-exception
            r1 = r15
            java.util.concurrent.locks.Lock r2 = r
            r2.unlock()
            throw r0
        L_0x01f1:
            r1 = r15
            org.android.spdy.SpdyErrorException r0 = new org.android.spdy.SpdyErrorException
            r2 = -1102(0xfffffffffffffbb2, float:NaN)
            java.lang.String r3 = "SPDY_JNI_ERR_INVALID_PARAM"
            r0.<init>((java.lang.String) r3, (int) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SpdyAgent.createSession(java.lang.String, java.lang.String, java.lang.Object, org.android.spdy.SessionCb, org.android.spdy.SslCertcb, int, int, int, java.lang.String):org.android.spdy.SpdySession");
    }
}
