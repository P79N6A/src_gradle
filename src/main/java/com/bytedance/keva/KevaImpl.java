package com.bytedance.keva;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class KevaImpl extends Keva {
    static final Executor sExecutor;
    public static final KevaMonitor sMonitor;
    private static final KevaImpl sPortedSpRepo;
    private static final HashMap<String, KevaImpl> sRepoMap = new HashMap<>();
    private static final File sSharedPrefsDir;
    private final List<Keva.OnChangeListener> mChangeListeners = new ArrayList();
    private long mHandle;
    private volatile boolean mLoaded;
    private volatile int mMode;
    public String mName;
    private final HashMap<String, KevaValueWrapper> mValueMap = new HashMap<>();

    static class KevaValueWrapper {
        volatile boolean loaded;
        volatile long offset;
        volatile int type;
        volatile Object value;

        private KevaValueWrapper() {
        }
    }

    interface PrivateConstants {
    }

    private static native void checkReportException(long j);

    private static native void clear(long j);

    private static native boolean delete(String str);

    private static native void dump(long j);

    private static native void erase(long j, String str, long j2);

    private static native byte[] fetchBytes(long j, String str, long j2, int i, byte[] bArr);

    private static native int fetchInt(long j, String str, long j2, int i);

    private static native String fetchString(long j, String str, long j2, String str2);

    private static native String[] fetchStringArray(long j, String str, long j2, int i, String[] strArr);

    static void forceInitImpl() {
    }

    private static native void initialize(String str);

    private native long loadRepo(String str, int i, boolean z);

    private static native long storeBoolean(long j, String str, long j2, boolean z);

    private static native long storeBytes(long j, String str, long j2, byte[] bArr, int i);

    private static native long storeDouble(long j, String str, long j2, double d2);

    private static native long storeFloat(long j, String str, long j2, float f2);

    private static native long storeInt(long j, String str, long j2, int i);

    private static native long storeLong(long j, String str, long j2, long j3);

    private static native long storeString(long j, String str, long j2, String str2);

    private static native long storeStringArray(long j, String str, long j2, String[] strArr, int i);

    public String name() {
        return this.mName;
    }

    private void awaitLoadedLocked() {
        while (!this.mLoaded) {
            try {
                wait(3000);
            } catch (InterruptedException unused) {
            }
        }
    }

    public void dumpNative() {
        synchronized (this) {
            awaitLoadedLocked();
            dump(this.mHandle);
        }
    }

    public void clear() {
        synchronized (this) {
            awaitLoadedLocked();
            this.mValueMap.clear();
            clear(this.mHandle);
        }
    }

    public int calculateSize() {
        int i;
        synchronized (this) {
            awaitLoadedLocked();
            i = 0;
            for (Map.Entry<String, KevaValueWrapper> value : this.mValueMap.entrySet()) {
                if (((KevaValueWrapper) value.getValue()).offset != 0) {
                    i++;
                }
            }
        }
        return i;
    }

    static {
        KevaBuilder instance = KevaBuilder.getInstance();
        KevaBuilder.clearInstance();
        KevaMonitor kevaMonitor = instance.mMonitor;
        if (kevaMonitor == null) {
            kevaMonitor = new KevaMonitor();
        }
        sMonitor = kevaMonitor;
        kevaMonitor.loadLibrary("keva");
        File filesDir = instance.mContext.getFilesDir();
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        File file = instance.mWorkDir;
        if (file == null) {
            file = new File(filesDir, "keva");
        }
        sSharedPrefsDir = new File(filesDir.getParent(), "shared_prefs");
        if (!file.exists() && !file.mkdirs()) {
            KevaMonitor kevaMonitor2 = sMonitor;
            kevaMonitor2.reportThrowable(1, null, null, null, new IllegalStateException("fail to create work dir " + file.getPath()));
        }
        initialize(file.getAbsolutePath());
        String str = instance.mPortedRepoName;
        if (str == null) {
            str = "keva_porting_sp";
        }
        sPortedSpRepo = new KevaImpl(str, 0);
        Executor executor = instance.mExecutor;
        if (executor != null) {
            sExecutor = executor;
            return;
        }
        int max = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        sExecutor = threadPoolExecutor;
    }

    public void dump() {
        synchronized (this) {
            awaitLoadedLocked();
            KevaMonitor kevaMonitor = sMonitor;
            kevaMonitor.logDebug("start dumping keva " + this.mName + ", size=" + String.valueOf(this.mValueMap.size()));
            for (Map.Entry next : this.mValueMap.entrySet()) {
                KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) next.getValue();
                KevaMonitor kevaMonitor2 = sMonitor;
                kevaMonitor2.logDebug("key: " + ((String) next.getKey()) + ", value: " + kevaValueWrapper.value + ", offset: " + kevaValueWrapper.offset + ", loaded: " + kevaValueWrapper.loaded);
            }
        }
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        synchronized (this) {
            awaitLoadedLocked();
            for (Map.Entry next : this.mValueMap.entrySet()) {
                KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) next.getValue();
                if (kevaValueWrapper.offset != 0) {
                    String str = (String) next.getKey();
                    try {
                        if (!kevaValueWrapper.loaded) {
                            int i = kevaValueWrapper.type;
                            if (i == 23) {
                                throw new UnsupportedOperationException("keva has not implemented utf8");
                            } else if (i != 39) {
                                if (i != 55) {
                                    switch (i) {
                                        case 6:
                                            kevaValueWrapper.value = fetchString(this.mHandle, str, kevaValueWrapper.offset, null);
                                            break;
                                        case e.l /*7*/:
                                            kevaValueWrapper.value = fetchBytes(this.mHandle, str, kevaValueWrapper.offset, 0, null);
                                            break;
                                        default:
                                            throw new UnsupportedOperationException("keva has not implemented type " + kevaValueWrapper.type);
                                    }
                                } else {
                                    kevaValueWrapper.value = new HashSet(Arrays.asList(fetchStringArray(this.mHandle, str, kevaValueWrapper.offset, 3, null)));
                                }
                                kevaValueWrapper.loaded = true;
                            } else {
                                throw new UnsupportedOperationException("keva has not implemented utf16");
                            }
                        }
                        hashMap.put(str, kevaValueWrapper.value);
                    } catch (RuntimeException e2) {
                        RuntimeException runtimeException = e2;
                        sMonitor.reportThrowable(2, this.mName, str, Long.valueOf(kevaValueWrapper.offset), runtimeException);
                    }
                }
            }
        }
        return hashMap;
    }

    private void doPortingFromSpAsync(final Context context) {
        synchronized (this) {
            sExecutor.execute(new Runnable() {
                public void run() {
                    KevaImpl.this.doPortingFromSp(context);
                    synchronized (KevaImpl.this) {
                        KevaImpl.this.notifyAll();
                    }
                }
            });
        }
    }

    private void initAsync(final boolean z) {
        synchronized (this) {
            sExecutor.execute(new Runnable() {
                public void run() {
                    KevaImpl.this.init(z);
                    synchronized (KevaImpl.this) {
                        KevaImpl.this.notifyAll();
                    }
                }
            });
        }
    }

    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            this.mChangeListeners.add(onChangeListener);
        }
    }

    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            this.mChangeListeners.remove(onChangeListener);
        }
    }

    private static boolean existSharedPrefs(String str) {
        File file = sSharedPrefsDir;
        return new File(file, str + ".xml").exists();
    }

    public static boolean isRepoPorted(String str) {
        if (sPortedSpRepo.mHandle == 0) {
            sPortedSpRepo.init(true);
        }
        return sPortedSpRepo.getBoolean(str, false);
    }

    public boolean contains(String str) {
        boolean z;
        synchronized (this) {
            awaitLoadedLocked();
            KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
            if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    private KevaValueWrapper awaitLoadedAndObtainWrapperLocked(String str) {
        while (!this.mLoaded) {
            try {
                wait(3000);
            } catch (InterruptedException unused) {
            }
        }
        KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        if (kevaValueWrapper != null) {
            return kevaValueWrapper;
        }
        KevaValueWrapper kevaValueWrapper2 = new KevaValueWrapper();
        this.mValueMap.put(str, kevaValueWrapper2);
        return kevaValueWrapper2;
    }

    private void checkMode(int i) {
        if (this.mHandle != 0) {
            synchronized (this) {
                if (this.mMode != i) {
                    KevaMonitor kevaMonitor = sMonitor;
                    String str = this.mName;
                    kevaMonitor.reportThrowable(1, str, null, null, new IllegalStateException("mode is different: " + this.mMode + " != " + i));
                }
            }
        }
    }

    public void erase(String str) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            awaitLoadedLocked();
            KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
            if (kevaValueWrapper != null) {
                erase(this.mHandle, str, kevaValueWrapper.offset);
                kevaValueWrapper.value = null;
                kevaValueWrapper.offset = 0;
                kevaValueWrapper.loaded = true;
            }
        }
    }

    public void init(boolean z) {
        synchronized (this) {
            if (this.mHandle == 0) {
                this.mHandle = loadRepo(this.mName, this.mMode, z);
                if (this.mHandle == 0) {
                    KevaMonitor kevaMonitor = sMonitor;
                    String str = this.mName;
                    kevaMonitor.reportWarning(1, str, null, null, "free space is " + Environment.getDataDirectory().getFreeSpace());
                } else {
                    try {
                        checkReportException(this.mHandle);
                    } catch (RuntimeException e2) {
                        sMonitor.reportThrowable(1, this.mName, null, null, e2);
                    }
                }
                this.mLoaded = true;
            }
        }
    }

    public void doPortingFromSp(Context context) {
        synchronized (this) {
            boolean delete = delete(this.mName);
            sMonitor.logDebug("poring load empty repo >> " + this.mName);
            this.mHandle = loadRepo(this.mName, this.mMode, false);
            if (this.mHandle == 0) {
                sMonitor.reportWarning(1, this.mName, null, null, "free space is " + Environment.getDataDirectory().getFreeSpace());
                this.mLoaded = true;
                return;
            }
            try {
                checkReportException(this.mHandle);
            } catch (RuntimeException e2) {
                sMonitor.reportThrowable(1, this.mName, null, null, e2);
            }
            if (!delete) {
                clear();
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.mName, 0);
            sMonitor.logDebug("poring get sp >> " + this.mName);
            Map<String, ?> all = sharedPreferences.getAll();
            sMonitor.logDebug("poring get all value >> " + this.mName);
            for (Map.Entry next : all.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    if ("".equals(str)) {
                        str = null;
                    }
                    sMonitor.logDebug("poring process key: " + str + ", value: " + value + " >> " + this.mName);
                    KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
                    this.mValueMap.put(str, kevaValueWrapper);
                    try {
                        if (value instanceof Boolean) {
                            kevaValueWrapper.offset = storeBoolean(this.mHandle, str, kevaValueWrapper.offset, ((Boolean) value).booleanValue());
                        } else if (value instanceof Integer) {
                            kevaValueWrapper.offset = storeInt(this.mHandle, str, kevaValueWrapper.offset, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            kevaValueWrapper.offset = storeLong(this.mHandle, str, kevaValueWrapper.offset, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            kevaValueWrapper.offset = storeFloat(this.mHandle, str, kevaValueWrapper.offset, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            kevaValueWrapper.offset = storeString(this.mHandle, str, kevaValueWrapper.offset, (String) value);
                        } else if (value instanceof Set) {
                            Set set = (Set) value;
                            String[] strArr = new String[set.size()];
                            set.toArray(strArr);
                            kevaValueWrapper.offset = storeStringArray(this.mHandle, str, kevaValueWrapper.offset, strArr, 3);
                        } else {
                            sMonitor.reportThrowable(1, this.mName, str, value, new IllegalStateException("do not support type: " + value.getClass()));
                        }
                        kevaValueWrapper.value = value;
                        kevaValueWrapper.loaded = true;
                    } catch (RuntimeException e3) {
                        sMonitor.reportThrowable(3, this.mName, str, value, e3);
                    }
                }
            }
            sMonitor.logDebug("poring set ported repo >> " + this.mName);
            sPortedSpRepo.storeBoolean(this.mName, true);
            this.mLoaded = true;
        }
    }

    public static KevaImpl getRepo(String str, int i) {
        return getRepoImpl(str, i, false);
    }

    public static Keva getRepoSync(String str, int i) {
        return getRepoImpl(str, i, true);
    }

    public byte[] getBytes(String str, byte[] bArr) {
        return fetchBytes(str, bArr, 0);
    }

    public String getString(String str, String str2) {
        return fetchString(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return fetchStringSet(str, set);
    }

    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, 0);
    }

    private KevaImpl(String str, int i) {
        this.mName = str;
        this.mMode = i;
    }

    private void notifyChangeListeners(Keva keva, String str) {
        if (this.mChangeListeners.size() != 0) {
            for (Keva.OnChangeListener onChanged : this.mChangeListeners) {
                onChanged.onChanged(keva, str);
            }
        }
    }

    public double getDouble(String str, double d2) {
        try {
            return ((Double) fetchObject(str, Double.valueOf(d2))).doubleValue();
        } catch (Exception e2) {
            String str2 = str;
            sMonitor.reportThrowable(2, this.mName, str2, Double.valueOf(d2), e2);
            return d2;
        }
    }

    public float getFloat(String str, float f2) {
        try {
            return ((Float) fetchObject(str, Float.valueOf(f2))).floatValue();
        } catch (Exception e2) {
            String str2 = str;
            sMonitor.reportThrowable(2, this.mName, str2, Float.valueOf(f2), e2);
            return f2;
        }
    }

    public long getLong(String str, long j) {
        try {
            return ((Long) fetchObject(str, Long.valueOf(j))).longValue();
        } catch (Exception e2) {
            String str2 = str;
            sMonitor.reportThrowable(2, this.mName, str2, Long.valueOf(j), e2);
            return j;
        }
    }

    private Object fetchObject(String str, Object obj) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            awaitLoadedLocked();
            KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
            if (kevaValueWrapper != null) {
                if (kevaValueWrapper.offset != 0) {
                    obj = kevaValueWrapper.value;
                }
            }
        }
        return obj;
    }

    public boolean getBoolean(String str, boolean z) {
        Exception exc;
        Object obj;
        try {
            Object fetchObject = fetchObject(str, Boolean.valueOf(z));
            try {
                return ((Boolean) fetchObject).booleanValue();
            } catch (Exception e2) {
                exc = e2;
                obj = fetchObject;
                sMonitor.reportThrowable(2, this.mName, str, obj, exc);
                return z;
            }
        } catch (Exception e3) {
            obj = null;
            exc = e3;
            sMonitor.reportThrowable(2, this.mName, str, obj, exc);
            return z;
        }
    }

    public int getInt(String str, int i) {
        RuntimeException runtimeException;
        Object obj;
        try {
            Object fetchObject = fetchObject(str, Integer.valueOf(i));
            try {
                return ((Integer) fetchObject).intValue();
            } catch (RuntimeException e2) {
                runtimeException = e2;
                obj = fetchObject;
                sMonitor.reportThrowable(2, this.mName, str, obj, runtimeException);
                erase(str);
                return i;
            }
        } catch (RuntimeException e3) {
            obj = null;
            runtimeException = e3;
            sMonitor.reportThrowable(2, this.mName, str, obj, runtimeException);
            erase(str);
            return i;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void storeStringSet(java.lang.String r9, java.util.Set<java.lang.String> r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0009
            r9 = 0
        L_0x0009:
            monitor-enter(r8)
            com.bytedance.keva.KevaImpl$KevaValueWrapper r7 = r8.awaitLoadedAndObtainWrapperLocked(r9)     // Catch:{ all -> 0x002d }
            int r0 = r10.size()     // Catch:{ RuntimeException -> 0x002b }
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ RuntimeException -> 0x002b }
            r10.toArray(r5)     // Catch:{ RuntimeException -> 0x002b }
            long r0 = r8.mHandle     // Catch:{ RuntimeException -> 0x002b }
            long r3 = r7.offset     // Catch:{ RuntimeException -> 0x002b }
            r6 = 3
            r2 = r9
            long r0 = storeStringArray(r0, r2, r3, r5, r6)     // Catch:{ RuntimeException -> 0x002b }
            r7.offset = r0     // Catch:{ RuntimeException -> 0x002b }
            r7.value = r10     // Catch:{ RuntimeException -> 0x002b }
            r10 = 1
            r7.loaded = r10     // Catch:{ RuntimeException -> 0x002b }
            r8.notifyChangeListeners(r8, r9)     // Catch:{ RuntimeException -> 0x002b }
        L_0x002b:
            monitor-exit(r8)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x002d }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.storeStringSet(java.lang.String, java.util.Set):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String fetchString(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0009
            r8 = 0
        L_0x0009:
            monitor-enter(r7)
            r7.awaitLoadedLocked()     // Catch:{ all -> 0x004b }
            java.util.HashMap<java.lang.String, com.bytedance.keva.KevaImpl$KevaValueWrapper> r0 = r7.mValueMap     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x004b }
            r6 = r0
            com.bytedance.keva.KevaImpl$KevaValueWrapper r6 = (com.bytedance.keva.KevaImpl.KevaValueWrapper) r6     // Catch:{ all -> 0x004b }
            if (r6 == 0) goto L_0x0049
            long r0 = r6.offset     // Catch:{ all -> 0x004b }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0021
            goto L_0x0049
        L_0x0021:
            boolean r0 = r6.loaded     // Catch:{ RuntimeException -> 0x003a }
            if (r0 != 0) goto L_0x0034
            long r0 = r7.mHandle     // Catch:{ RuntimeException -> 0x003a }
            long r3 = r6.offset     // Catch:{ RuntimeException -> 0x003a }
            r2 = r8
            r5 = r9
            java.lang.String r0 = fetchString(r0, r2, r3, r5)     // Catch:{ RuntimeException -> 0x003a }
            r6.value = r0     // Catch:{ RuntimeException -> 0x003a }
            r0 = 1
            r6.loaded = r0     // Catch:{ RuntimeException -> 0x003a }
        L_0x0034:
            java.lang.Object r0 = r6.value     // Catch:{ RuntimeException -> 0x003a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x003a }
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            return r0
        L_0x003a:
            r0 = move-exception
            r5 = r0
            com.bytedance.keva.KevaMonitor r0 = sMonitor     // Catch:{ all -> 0x004b }
            r1 = 2
            java.lang.String r2 = r7.mName     // Catch:{ all -> 0x004b }
            java.lang.Object r4 = r6.value     // Catch:{ all -> 0x004b }
            r3 = r8
            r0.reportThrowable(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x004b }
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            return r9
        L_0x0049:
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            return r9
        L_0x004b:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.fetchString(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Set<java.lang.String> fetchStringSet(java.lang.String r9, java.util.Set<java.lang.String> r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0009
            r9 = 0
        L_0x0009:
            monitor-enter(r8)
            r8.awaitLoadedLocked()     // Catch:{ all -> 0x0055 }
            java.util.HashMap<java.lang.String, com.bytedance.keva.KevaImpl$KevaValueWrapper> r0 = r8.mValueMap     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0055 }
            r7 = r0
            com.bytedance.keva.KevaImpl$KevaValueWrapper r7 = (com.bytedance.keva.KevaImpl.KevaValueWrapper) r7     // Catch:{ all -> 0x0055 }
            if (r7 == 0) goto L_0x0053
            long r0 = r7.offset     // Catch:{ all -> 0x0055 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0021
            goto L_0x0053
        L_0x0021:
            boolean r0 = r7.loaded     // Catch:{ RuntimeException -> 0x0044 }
            if (r0 != 0) goto L_0x003e
            long r0 = r8.mHandle     // Catch:{ RuntimeException -> 0x0044 }
            long r3 = r7.offset     // Catch:{ RuntimeException -> 0x0044 }
            r5 = 3
            r6 = 0
            r2 = r9
            java.lang.String[] r0 = fetchStringArray(r0, r2, r3, r5, r6)     // Catch:{ RuntimeException -> 0x0044 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ RuntimeException -> 0x0044 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ RuntimeException -> 0x0044 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0044 }
            r7.value = r1     // Catch:{ RuntimeException -> 0x0044 }
            r0 = 1
            r7.loaded = r0     // Catch:{ RuntimeException -> 0x0044 }
        L_0x003e:
            java.lang.Object r0 = r7.value     // Catch:{ RuntimeException -> 0x0044 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ RuntimeException -> 0x0044 }
            monitor-exit(r8)     // Catch:{ all -> 0x0055 }
            return r0
        L_0x0044:
            r0 = move-exception
            r5 = r0
            com.bytedance.keva.KevaMonitor r0 = sMonitor     // Catch:{ all -> 0x0055 }
            r1 = 2
            java.lang.String r2 = r8.mName     // Catch:{ all -> 0x0055 }
            java.lang.Object r4 = r7.value     // Catch:{ all -> 0x0055 }
            r3 = r9
            r0.reportThrowable(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0055 }
            monitor-exit(r8)     // Catch:{ all -> 0x0055 }
            return r10
        L_0x0053:
            monitor-exit(r8)     // Catch:{ all -> 0x0055 }
            return r10
        L_0x0055:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0055 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.fetchStringSet(java.lang.String, java.util.Set):java.util.Set");
    }

    public void storeBoolean(String str, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper awaitLoadedAndObtainWrapperLocked = awaitLoadedAndObtainWrapperLocked(str);
            if (!awaitLoadedAndObtainWrapperLocked.loaded || awaitLoadedAndObtainWrapperLocked.value == null || !awaitLoadedAndObtainWrapperLocked.value.equals(Boolean.valueOf(z))) {
                try {
                    awaitLoadedAndObtainWrapperLocked.offset = storeBoolean(this.mHandle, str, awaitLoadedAndObtainWrapperLocked.offset, z);
                    awaitLoadedAndObtainWrapperLocked.value = Boolean.valueOf(z);
                    awaitLoadedAndObtainWrapperLocked.loaded = true;
                    notifyChangeListeners(this, str);
                } catch (RuntimeException e2) {
                    sMonitor.reportThrowable(3, this.mName, str, Boolean.valueOf(z), e2);
                }
            }
        }
    }

    public void storeDouble(String str, double d2) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper awaitLoadedAndObtainWrapperLocked = awaitLoadedAndObtainWrapperLocked(str);
            if (!awaitLoadedAndObtainWrapperLocked.loaded || awaitLoadedAndObtainWrapperLocked.value == null || !awaitLoadedAndObtainWrapperLocked.value.equals(Double.valueOf(d2))) {
                try {
                    awaitLoadedAndObtainWrapperLocked.offset = storeDouble(this.mHandle, str, awaitLoadedAndObtainWrapperLocked.offset, d2);
                    awaitLoadedAndObtainWrapperLocked.value = Double.valueOf(d2);
                    awaitLoadedAndObtainWrapperLocked.loaded = true;
                    notifyChangeListeners(this, str);
                } catch (RuntimeException e2) {
                    sMonitor.reportThrowable(3, this.mName, str, Double.valueOf(d2), e2);
                }
            }
        }
    }

    public void storeFloat(String str, float f2) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper awaitLoadedAndObtainWrapperLocked = awaitLoadedAndObtainWrapperLocked(str);
            if (!awaitLoadedAndObtainWrapperLocked.loaded || awaitLoadedAndObtainWrapperLocked.value == null || !awaitLoadedAndObtainWrapperLocked.value.equals(Float.valueOf(f2))) {
                try {
                    awaitLoadedAndObtainWrapperLocked.offset = storeFloat(this.mHandle, str, awaitLoadedAndObtainWrapperLocked.offset, f2);
                    awaitLoadedAndObtainWrapperLocked.value = Float.valueOf(f2);
                    awaitLoadedAndObtainWrapperLocked.loaded = true;
                    notifyChangeListeners(this, str);
                } catch (RuntimeException e2) {
                    sMonitor.reportThrowable(3, this.mName, str, Float.valueOf(f2), e2);
                }
            }
        }
    }

    public void storeInt(String str, int i) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper awaitLoadedAndObtainWrapperLocked = awaitLoadedAndObtainWrapperLocked(str);
            if (!awaitLoadedAndObtainWrapperLocked.loaded || awaitLoadedAndObtainWrapperLocked.value == null || !awaitLoadedAndObtainWrapperLocked.value.equals(Integer.valueOf(i))) {
                try {
                    awaitLoadedAndObtainWrapperLocked.offset = storeInt(this.mHandle, str, awaitLoadedAndObtainWrapperLocked.offset, i);
                    awaitLoadedAndObtainWrapperLocked.value = Integer.valueOf(i);
                    awaitLoadedAndObtainWrapperLocked.loaded = true;
                    notifyChangeListeners(this, str);
                } catch (RuntimeException e2) {
                    sMonitor.reportThrowable(3, this.mName, str, Integer.valueOf(i), e2);
                }
            }
        }
    }

    public void storeLong(String str, long j) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper awaitLoadedAndObtainWrapperLocked = awaitLoadedAndObtainWrapperLocked(str);
            if (!awaitLoadedAndObtainWrapperLocked.loaded || awaitLoadedAndObtainWrapperLocked.value == null || !awaitLoadedAndObtainWrapperLocked.value.equals(Long.valueOf(j))) {
                try {
                    awaitLoadedAndObtainWrapperLocked.offset = storeLong(this.mHandle, str, awaitLoadedAndObtainWrapperLocked.offset, j);
                    awaitLoadedAndObtainWrapperLocked.value = Long.valueOf(j);
                    awaitLoadedAndObtainWrapperLocked.loaded = true;
                    notifyChangeListeners(this, str);
                } catch (RuntimeException e2) {
                    sMonitor.reportThrowable(3, this.mName, str, Long.valueOf(j), e2);
                }
            }
        }
    }

    public void storeString(String str, String str2) {
        int i;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper awaitLoadedAndObtainWrapperLocked = awaitLoadedAndObtainWrapperLocked(str);
            if (!awaitLoadedAndObtainWrapperLocked.loaded || awaitLoadedAndObtainWrapperLocked.value == null || !awaitLoadedAndObtainWrapperLocked.value.equals(str2)) {
                try {
                    awaitLoadedAndObtainWrapperLocked.offset = storeString(this.mHandle, str, awaitLoadedAndObtainWrapperLocked.offset, str2);
                    awaitLoadedAndObtainWrapperLocked.value = str2;
                    awaitLoadedAndObtainWrapperLocked.loaded = true;
                    notifyChangeListeners(this, str);
                } catch (RuntimeException e2) {
                    sMonitor.reportThrowable(3, this.mName, str, str2, e2);
                }
            } else {
                return;
            }
        }
        if (str2 != null) {
            i = str2.length();
        } else {
            i = 0;
        }
        reportBigValue(str, str2, i);
    }

    public static KevaImpl getRepoFromSp(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, false);
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, true);
    }

    /* access modifiers changed from: package-private */
    public void addMapBoolWhenLoading(String str, boolean z, long j) {
        addMapObjectWhenLoading(str, Boolean.valueOf(z), j);
    }

    /* access modifiers changed from: package-private */
    public void addMapDoubleWhenLoading(String str, double d2, long j) {
        addMapObjectWhenLoading(str, Double.valueOf(d2), j);
    }

    /* access modifiers changed from: package-private */
    public void addMapFloatWhenLoading(String str, float f2, long j) {
        addMapObjectWhenLoading(str, Float.valueOf(f2), j);
    }

    /* access modifiers changed from: package-private */
    public void addMapIntWhenLoading(String str, int i, long j) {
        addMapObjectWhenLoading(str, Integer.valueOf(i), j);
    }

    /* access modifiers changed from: package-private */
    public void addMapLongWhenLoading(String str, long j, long j2) {
        addMapObjectWhenLoading(str, Long.valueOf(j), j2);
    }

    private void reportBigValue(final String str, final Object obj, final int i) {
        if (i > 2048) {
            sExecutor.execute(new Runnable() {
                public void run() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str = KevaImpl.this.mName;
                    String str2 = str;
                    Object obj = obj;
                    kevaMonitor.reportWarning(3, str, str2, obj, "value too big, size=" + i);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void addMapOffsetWhenLoading(String str, long j, int i) {
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        this.mValueMap.put(str, kevaValueWrapper);
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
    }

    /* access modifiers changed from: package-private */
    public void addMapObjectWhenLoading(String str, Object obj, long j) {
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        this.mValueMap.put(str, kevaValueWrapper);
        kevaValueWrapper.value = obj;
        kevaValueWrapper.offset = j;
        kevaValueWrapper.loaded = true;
    }

    private static KevaImpl getRepoImpl(String str, int i, boolean z) {
        KevaImpl kevaImpl;
        boolean z2;
        synchronized (sRepoMap) {
            kevaImpl = sRepoMap.get(str);
            if (kevaImpl == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                kevaImpl = new KevaImpl(str, i);
                sRepoMap.put(str, kevaImpl);
            }
        }
        if (!z2) {
            kevaImpl.checkMode(i);
        } else if (z) {
            kevaImpl.init(false);
        } else {
            kevaImpl.initAsync(false);
        }
        return kevaImpl;
    }

    private void storeBytes(String str, byte[] bArr, int i) {
        int i2;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper awaitLoadedAndObtainWrapperLocked = awaitLoadedAndObtainWrapperLocked(str);
            try {
                awaitLoadedAndObtainWrapperLocked.offset = storeBytes(this.mHandle, str, awaitLoadedAndObtainWrapperLocked.offset, bArr, i);
                awaitLoadedAndObtainWrapperLocked.value = bArr;
                awaitLoadedAndObtainWrapperLocked.loaded = true;
                notifyChangeListeners(this, str);
            } catch (RuntimeException e2) {
                sMonitor.reportThrowable(3, this.mName, str, bArr, e2);
            }
        }
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        reportBigValue(str, bArr, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] fetchBytes(java.lang.String r9, byte[] r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0009
            r9 = 0
        L_0x0009:
            monitor-enter(r8)
            r8.awaitLoadedLocked()     // Catch:{ all -> 0x004e }
            java.util.HashMap<java.lang.String, com.bytedance.keva.KevaImpl$KevaValueWrapper> r0 = r8.mValueMap     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x004e }
            r7 = r0
            com.bytedance.keva.KevaImpl$KevaValueWrapper r7 = (com.bytedance.keva.KevaImpl.KevaValueWrapper) r7     // Catch:{ all -> 0x004e }
            if (r7 == 0) goto L_0x004c
            long r0 = r7.offset     // Catch:{ all -> 0x004e }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0021
            goto L_0x004c
        L_0x0021:
            boolean r0 = r7.loaded     // Catch:{ RuntimeException -> 0x003d }
            if (r0 != 0) goto L_0x0035
            long r0 = r8.mHandle     // Catch:{ RuntimeException -> 0x003d }
            long r3 = r7.offset     // Catch:{ RuntimeException -> 0x003d }
            r2 = r9
            r5 = r11
            r6 = r10
            byte[] r11 = fetchBytes(r0, r2, r3, r5, r6)     // Catch:{ RuntimeException -> 0x003d }
            r7.value = r11     // Catch:{ RuntimeException -> 0x003d }
            r11 = 1
            r7.loaded = r11     // Catch:{ RuntimeException -> 0x003d }
        L_0x0035:
            java.lang.Object r11 = r7.value     // Catch:{ RuntimeException -> 0x003d }
            byte[] r11 = (byte[]) r11     // Catch:{ RuntimeException -> 0x003d }
            byte[] r11 = (byte[]) r11     // Catch:{ RuntimeException -> 0x003d }
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            return r11
        L_0x003d:
            r11 = move-exception
            r5 = r11
            com.bytedance.keva.KevaMonitor r0 = sMonitor     // Catch:{ all -> 0x004e }
            r1 = 2
            java.lang.String r2 = r8.mName     // Catch:{ all -> 0x004e }
            java.lang.Object r4 = r7.value     // Catch:{ all -> 0x004e }
            r3 = r9
            r0.reportThrowable(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x004e }
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            return r10
        L_0x004c:
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            return r10
        L_0x004e:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.fetchBytes(java.lang.String, byte[], int):byte[]");
    }

    private static KevaImpl getRepoFromSpImpl(Context context, String str, int i, boolean z) {
        KevaImpl kevaImpl;
        boolean z2 = true;
        if (!existSharedPrefs(str)) {
            if (sPortedSpRepo.mHandle == 0) {
                sPortedSpRepo.init(true);
            }
            sPortedSpRepo.storeBoolean(str, true);
            return getRepo(str, i);
        } else if (isRepoPorted(str)) {
            return getRepo(str, i);
        } else {
            KevaMonitor kevaMonitor = sMonitor;
            kevaMonitor.logDebug("do poring from sp: " + str);
            synchronized (sRepoMap) {
                kevaImpl = sRepoMap.get(str);
                if (kevaImpl != null) {
                    z2 = false;
                }
                if (z2) {
                    kevaImpl = new KevaImpl(str, i);
                    sRepoMap.put(str, kevaImpl);
                }
            }
            if (!z2) {
                kevaImpl.checkMode(i);
            } else if (z) {
                kevaImpl.doPortingFromSp(context);
            } else {
                kevaImpl.doPortingFromSpAsync(context);
            }
            return kevaImpl;
        }
    }
}
