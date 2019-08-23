package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ttnet.org.chromium.base.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;

@VisibleForTesting
@JNINamespace("cronet")
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = CronetLibraryLoader.class.getSimpleName();
    private static volatile boolean sInitStarted = false;
    private static final HandlerThread sInitThread = new HandlerThread("CronetInit");
    private static volatile boolean sInitThreadInitDone = false;
    private static final Object sLoadLock = new Object();

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    private static boolean onInitThread() {
        if (sInitThread.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    static void ensureInitializedOnInitThread(Context context) {
        if (!sInitThreadInitDone) {
            NetworkChangeNotifier.init(context);
            NetworkChangeNotifier.registerToReceiveNotificationsAlways();
            nativeCronetInitOnInitThread();
            sInitThreadInitDone = true;
        }
    }

    public static void postToInitThread(Runnable runnable) {
        if (onInitThread()) {
            runnable.run();
        } else {
            new Handler(sInitThread.getLooper()).post(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void ensureInitialized(final android.content.Context r6, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl r7) {
        /*
            java.lang.Object r0 = sLoadLock
            monitor-enter(r0)
            boolean r1 = sInitStarted     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return
        L_0x0009:
            r1 = 1
            sInitStarted = r1     // Catch:{ all -> 0x007d }
            com.ttnet.org.chromium.base.ContextUtils.initApplicationContext(r6)     // Catch:{ all -> 0x007d }
            com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$LibraryLoader r2 = r7.libraryLoader()     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x001f
            com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$LibraryLoader r7 = r7.libraryLoader()     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "sscronet"
            r7.loadLibrary(r2)     // Catch:{ all -> 0x007d }
            goto L_0x0024
        L_0x001f:
            java.lang.String r7 = "sscronet"
            java.lang.System.loadLibrary(r7)     // Catch:{ all -> 0x007d }
        L_0x0024:
            com.ttnet.org.chromium.base.ContextUtils.initApplicationContextForNative()     // Catch:{ all -> 0x007d }
            java.lang.String r7 = "58.0.2991.0"
            java.lang.String r2 = nativeGetCronetVersion()     // Catch:{ all -> 0x007d }
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x007d }
            r2 = 0
            r3 = 2
            if (r7 == 0) goto L_0x0065
            java.lang.String r7 = TAG     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "Cronet version: %s, arch: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x007d }
            java.lang.String r5 = "58.0.2991.0"
            r3[r2] = r5     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "os.arch"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x007d }
            r3[r1] = r2     // Catch:{ all -> 0x007d }
            com.ttnet.org.chromium.base.Log.i(r7, r4, r3)     // Catch:{ all -> 0x007d }
            boolean r7 = sInitThreadInitDone     // Catch:{ all -> 0x007d }
            if (r7 != 0) goto L_0x0063
            android.os.HandlerThread r7 = sInitThread     // Catch:{ all -> 0x007d }
            boolean r7 = r7.isAlive()     // Catch:{ all -> 0x007d }
            if (r7 != 0) goto L_0x005b
            android.os.HandlerThread r7 = sInitThread     // Catch:{ all -> 0x007d }
            r7.start()     // Catch:{ all -> 0x007d }
        L_0x005b:
            com.ttnet.org.chromium.net.impl.CronetLibraryLoader$1 r7 = new com.ttnet.org.chromium.net.impl.CronetLibraryLoader$1     // Catch:{ all -> 0x007d }
            r7.<init>(r6)     // Catch:{ all -> 0x007d }
            postToInitThread(r7)     // Catch:{ all -> 0x007d }
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return
        L_0x0065:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x007d }
            java.lang.String r7 = "Expected Cronet version number %s, actual version number %s."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "58.0.2991.0"
            r3[r2] = r4     // Catch:{ all -> 0x007d }
            java.lang.String r2 = nativeGetCronetVersion()     // Catch:{ all -> 0x007d }
            r3[r1] = r2     // Catch:{ all -> 0x007d }
            java.lang.String r7 = java.lang.String.format(r7, r3)     // Catch:{ all -> 0x007d }
            r6.<init>(r7)     // Catch:{ all -> 0x007d }
            throw r6     // Catch:{ all -> 0x007d }
        L_0x007d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetLibraryLoader.ensureInitialized(android.content.Context, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl):void");
    }
}
