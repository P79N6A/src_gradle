package com.ttnet.org.chromium.base.library_loader;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.AccessedByNative;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class Linker {
    private static Linker sSingleton;
    private static Object sSingletonLock = new Object();
    protected final Object mLock = new Object();
    protected int mMemoryDeviceConfig;
    private String mTestRunnerClassName;

    public static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = new Parcelable.Creator<LibInfo>() {
            public final LibInfo[] newArray(int i) {
                return new LibInfo[i];
            }

            public final LibInfo createFromParcel(Parcel parcel) {
                return new LibInfo(parcel);
            }
        };
        @AccessedByNative
        public long mLoadAddress;
        @AccessedByNative
        public long mLoadSize;
        @AccessedByNative
        public int mRelroFd;
        @AccessedByNative
        public long mRelroSize;
        @AccessedByNative
        public long mRelroStart;

        public int describeContents() {
            return 1;
        }

        public LibInfo() {
            this.mRelroFd = -1;
        }

        public void close() {
            if (this.mRelroFd >= 0) {
                try {
                    ParcelFileDescriptor.adoptFd(this.mRelroFd).close();
                } catch (IOException unused) {
                }
                this.mRelroFd = -1;
            }
        }

        public String toString() {
            return String.format(Locale.US, "[load=0x%x-0x%x relro=0x%x-0x%x fd=%d]", new Object[]{Long.valueOf(this.mLoadAddress), Long.valueOf(this.mLoadAddress + this.mLoadSize), Long.valueOf(this.mRelroStart), Long.valueOf(this.mRelroStart + this.mRelroSize), Integer.valueOf(this.mRelroFd)});
        }

        public LibInfo(Parcel parcel) {
            int i;
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            if (parcelFileDescriptor == null) {
                i = -1;
            } else {
                i = parcelFileDescriptor.detachFd();
            }
            this.mRelroFd = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (this.mRelroFd >= 0) {
                parcel.writeLong(this.mLoadAddress);
                parcel.writeLong(this.mLoadSize);
                parcel.writeLong(this.mRelroStart);
                parcel.writeLong(this.mRelroSize);
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.mRelroFd);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (IOException e2) {
                    Log.e("LibraryLoader", "Can't write LibInfo file descriptor to parcel", e2);
                }
            }
        }
    }

    public interface TestRunner {
        boolean runChecks(int i, boolean z);
    }

    private static native long nativeGetRandomBaseLoadAddress();

    public abstract void disableSharedRelros();

    public abstract void finishLibraryLoad();

    public abstract long getBaseLoadAddress();

    public abstract Bundle getSharedRelros();

    public abstract void initServiceProcess(long j);

    public abstract boolean isUsingBrowserSharedRelros();

    /* access modifiers changed from: package-private */
    public abstract void loadLibraryImpl(@Nullable String str, String str2, boolean z);

    public abstract void prepareLibraryLoad();

    public abstract void useSharedRelros(Bundle bundle);

    public static boolean areTestsEnabled() {
        return NativeLibraries.sEnableLinkerTests;
    }

    public static boolean isInZipFile() {
        return NativeLibraries.sUseLibraryInZipFile;
    }

    public static boolean isUsed() {
        return NativeLibraries.sUseLinker;
    }

    protected static void loadLinkerJniLibrary() {
        System.loadLibrary("chromium_android_linker");
    }

    /* access modifiers changed from: protected */
    public long getRandomBaseLoadAddress() {
        return nativeGetRandomBaseLoadAddress();
    }

    protected Linker() {
    }

    private static void assertLinkerTestsAreEnabled() {
        if (!NativeLibraries.sEnableLinkerTests) {
            throw new AssertionError("Testing method called in non-testing context");
        }
    }

    public final String getTestRunnerClassNameForTesting() {
        String str;
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            str = this.mTestRunnerClassName;
        }
        return str;
    }

    public static final Linker getInstance() {
        Linker linker;
        boolean z;
        synchronized (sSingletonLock) {
            if (sSingleton == null) {
                String str = ContextUtils.getApplicationContext().getApplicationInfo().className;
                if (str == null || !str.contains("incrementalinstall")) {
                    z = false;
                } else {
                    z = true;
                }
                if (Build.VERSION.SDK_INT < 23 || z) {
                    sSingleton = LegacyLinker.create();
                } else {
                    sSingleton = ModernLinker.create();
                }
                Log.i("LibraryLoader", "Using linker: " + sSingleton.getClass().getName(), new Object[0]);
            }
            linker = sSingleton;
        }
        return linker;
    }

    public final int getImplementationForTesting() {
        boolean z;
        assertLinkerTestsAreEnabled();
        synchronized (sSingletonLock) {
            if (sSingleton == this) {
                z = true;
            } else {
                z = false;
            }
            assertForTesting(z);
            if (sSingleton instanceof ModernLinker) {
                return 2;
            }
            if (sSingleton instanceof LegacyLinker) {
                return 1;
            }
            Log.wtf("LibraryLoader", "Invalid linker: " + sSingleton.getClass().getName(), new Object[0]);
            assertForTesting(false);
            return 0;
        }
    }

    public boolean isChromiumLinkerLibrary(String str) {
        return str.equals("chromium_android_linker");
    }

    private static void assertForTesting(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    public void closeLibInfoMap(HashMap<String, LibInfo> hashMap) {
        for (Map.Entry<String, LibInfo> value : hashMap.entrySet()) {
            ((LibInfo) value.getValue()).close();
        }
    }

    public final void setTestRunnerClassNameForTesting(String str) {
        boolean z;
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            if (this.mTestRunnerClassName == null) {
                z = true;
            } else {
                z = false;
            }
            assertForTesting(z);
            this.mTestRunnerClassName = str;
        }
    }

    /* access modifiers changed from: protected */
    public Bundle createBundleFromLibInfoMap(HashMap<String, LibInfo> hashMap) {
        Bundle bundle = new Bundle(hashMap.size());
        for (Map.Entry next : hashMap.entrySet()) {
            bundle.putParcelable((String) next.getKey(), (Parcelable) next.getValue());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public HashMap<String, LibInfo> createLibInfoMapFromBundle(Bundle bundle) {
        HashMap<String, LibInfo> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, (LibInfo) bundle.getParcelable(str));
        }
        return hashMap;
    }

    public final void setMemoryDeviceConfigForTesting(int i) {
        boolean z;
        assertLinkerTestsAreEnabled();
        boolean z2 = false;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        assertForTesting(z);
        synchronized (this.mLock) {
            if (this.mMemoryDeviceConfig == 0) {
                z2 = true;
            }
            assertForTesting(z2);
            this.mMemoryDeviceConfig = i;
        }
    }

    public static final void setImplementationForTesting(int i) {
        boolean z;
        boolean z2;
        assertLinkerTestsAreEnabled();
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        assertForTesting(z);
        synchronized (sSingletonLock) {
            if (sSingleton == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            assertForTesting(z2);
            if (i == 2) {
                sSingleton = ModernLinker.create();
            } else if (i == 1) {
                sSingleton = LegacyLinker.create();
            }
            Log.i("LibraryLoader", "Forced linker: " + sSingleton.getClass().getName(), new Object[0]);
        }
    }

    public void loadLibrary(@Nullable String str, String str2) {
        loadLibraryImpl(str, str2, true);
    }

    public void loadLibraryNoFixedAddress(@Nullable String str, String str2) {
        loadLibraryImpl(str, str2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setupForTesting(int r4, java.lang.String r5) {
        /*
            assertLinkerTestsAreEnabled()
            java.lang.Object r0 = sSingletonLock
            monitor-enter(r0)
            com.ttnet.org.chromium.base.library_loader.Linker r1 = sSingleton     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0014
            setImplementationForTesting(r4)     // Catch:{ all -> 0x003c }
            com.ttnet.org.chromium.base.library_loader.Linker r4 = sSingleton     // Catch:{ all -> 0x003c }
            r4.setTestRunnerClassNameForTesting(r5)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0014:
            com.ttnet.org.chromium.base.library_loader.Linker r1 = sSingleton     // Catch:{ all -> 0x003c }
            int r1 = r1.getImplementationForTesting()     // Catch:{ all -> 0x003c }
            r2 = 0
            r3 = 1
            if (r1 != r4) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            assertForTesting(r4)     // Catch:{ all -> 0x003c }
            com.ttnet.org.chromium.base.library_loader.Linker r4 = sSingleton     // Catch:{ all -> 0x003c }
            java.lang.String r4 = r4.getTestRunnerClassNameForTesting()     // Catch:{ all -> 0x003c }
            if (r5 != 0) goto L_0x0033
            if (r4 != 0) goto L_0x002f
            r2 = 1
        L_0x002f:
            assertForTesting(r2)     // Catch:{ all -> 0x003c }
            goto L_0x003a
        L_0x0033:
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x003c }
            assertForTesting(r4)     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.Linker.setupForTesting(int, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public final void runTestRunnerClassForTesting(int i, boolean z) {
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            if (this.mTestRunnerClassName == null) {
                Log.wtf("LibraryLoader", "Linker runtime tests not set up for this process", new Object[0]);
                assertForTesting(false);
            }
            TestRunner testRunner = null;
            try {
                testRunner = (TestRunner) Class.forName(this.mTestRunnerClassName).newInstance();
            } catch (Exception e2) {
                Log.wtf("LibraryLoader", "Could not instantiate test runner class by name", e2);
                assertForTesting(false);
            }
            if (!testRunner.runChecks(i, z)) {
                Log.wtf("LibraryLoader", "Linker runtime tests failed in this process", new Object[0]);
                assertForTesting(false);
            }
            Log.i("LibraryLoader", "All linker tests passed", new Object[0]);
        }
    }
}