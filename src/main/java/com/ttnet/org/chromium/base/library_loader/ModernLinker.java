package com.ttnet.org.chromium.base.library_loader;

import android.os.Bundle;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.PathUtils;
import com.ttnet.org.chromium.base.annotations.SuppressFBWarnings;
import com.ttnet.org.chromium.base.library_loader.Linker;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;

public class ModernLinker extends Linker {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long mBaseLoadAddress = -1;
    private long mCurrentLoadAddress = -1;
    private boolean mInBrowserProcess = true;
    private boolean mInitialized;
    private HashMap<String, Linker.LibInfo> mLoadedLibraries;
    private boolean mPrepareLibraryLoadCalled;
    private HashMap<String, Linker.LibInfo> mSharedRelros;
    private Bundle mSharedRelrosBundle;
    private boolean mWaitForSharedRelros;

    private static native boolean nativeCreateSharedRelro(String str, long j, String str2, Linker.LibInfo libInfo);

    private static native String nativeGetCpuAbi();

    private static native boolean nativeLoadLibrary(String str, long j, Linker.LibInfo libInfo);

    public boolean isUsingBrowserSharedRelros() {
        return false;
    }

    static Linker create() {
        return new ModernLinker();
    }

    private ModernLinker() {
    }

    private void ensureInitializedLocked() {
        if (!this.mInitialized) {
            loadLinkerJniLibrary();
            this.mInitialized = true;
        }
    }

    public void disableSharedRelros() {
        synchronized (this.mLock) {
            this.mInBrowserProcess = false;
            this.mWaitForSharedRelros = false;
        }
    }

    public long getBaseLoadAddress() {
        long j;
        synchronized (this.mLock) {
            ensureInitializedLocked();
            setupBaseLoadAddressLocked();
            j = this.mBaseLoadAddress;
        }
        return j;
    }

    @SuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    private void waitForSharedRelrosLocked() {
        if (this.mSharedRelros == null) {
            while (this.mSharedRelros == null) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private void setupBaseLoadAddressLocked() {
        if (this.mBaseLoadAddress == -1) {
            this.mBaseLoadAddress = getRandomBaseLoadAddress();
        }
        if (this.mBaseLoadAddress == 0) {
            Log.w("LibraryLoader", "Disabling shared RELROs due address space pressure", new Object[0]);
            this.mWaitForSharedRelros = false;
        }
    }

    public void finishLibraryLoad() {
        synchronized (this.mLock) {
            if (!this.mInBrowserProcess && this.mSharedRelros != null) {
                closeLibInfoMap(this.mSharedRelros);
                this.mSharedRelros = null;
            }
            if (NativeLibraries.sEnableLinkerTests) {
                runTestRunnerClassForTesting(0, this.mInBrowserProcess);
            }
        }
    }

    public Bundle getSharedRelros() {
        synchronized (this.mLock) {
            if (!this.mInBrowserProcess) {
                return null;
            }
            if (this.mSharedRelrosBundle == null && this.mSharedRelros != null) {
                this.mSharedRelrosBundle = createBundleFromLibInfoMap(this.mSharedRelros);
            }
            Bundle bundle = this.mSharedRelrosBundle;
            return bundle;
        }
    }

    public void prepareLibraryLoad() {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (this.mInBrowserProcess) {
                setupBaseLoadAddressLocked();
                this.mSharedRelros = new HashMap<>();
            }
            this.mLoadedLibraries = new HashMap<>();
            this.mCurrentLoadAddress = this.mBaseLoadAddress;
            this.mPrepareLibraryLoadCalled = true;
        }
    }

    public void initServiceProcess(long j) {
        synchronized (this.mLock) {
            this.mInBrowserProcess = false;
            this.mWaitForSharedRelros = true;
            this.mBaseLoadAddress = j;
        }
    }

    public void useSharedRelros(Bundle bundle) {
        synchronized (this.mLock) {
            this.mSharedRelros = createLibInfoMapFromBundle(bundle);
            this.mLock.notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void loadLibraryImpl(@Nullable String str, String str2, boolean z) {
        String str3;
        long j;
        long j2;
        String str4;
        String str5 = str;
        String str6 = str2;
        synchronized (this.mLock) {
            if (str5 != null) {
                String nativeGetCpuAbi = nativeGetCpuAbi();
                str3 = str5 + "!/lib/" + nativeGetCpuAbi + "/crazy." + str6;
            } else {
                str3 = str6;
            }
            if (!this.mLoadedLibraries.containsKey(str3)) {
                if (this.mInBrowserProcess || !this.mWaitForSharedRelros || !z) {
                    j = 0;
                } else {
                    j = this.mCurrentLoadAddress;
                    if (j > this.mBaseLoadAddress + 201326592) {
                        String str7 = "Load address outside reservation, for: " + str6;
                        Log.e("LibraryLoader", str7, new Object[0]);
                        throw new UnsatisfiedLinkError(str7);
                    }
                }
                Linker.LibInfo libInfo = new Linker.LibInfo();
                if (this.mInBrowserProcess && this.mCurrentLoadAddress != 0) {
                    if (nativeCreateSharedRelro(str3, this.mCurrentLoadAddress, PathUtils.getDataDirectory() + "/RELRO:" + str6, libInfo)) {
                        this.mSharedRelros.put(str3, libInfo);
                    } else {
                        Log.w("LibraryLoader", "Unable to create shared relro: " + r10, new Object[0]);
                    }
                } else if (!this.mInBrowserProcess && this.mCurrentLoadAddress != 0 && this.mWaitForSharedRelros) {
                    waitForSharedRelrosLocked();
                    if (this.mSharedRelros.containsKey(str3)) {
                        libInfo = this.mSharedRelros.get(str3);
                    }
                }
                if (nativeLoadLibrary(str3, j, libInfo)) {
                    if (NativeLibraries.sEnableLinkerTests) {
                        if (this.mInBrowserProcess) {
                            str4 = "BROWSER_LIBRARY_ADDRESS";
                        } else {
                            str4 = "RENDERER_LIBRARY_ADDRESS";
                        }
                        Log.i("LibraryLoader", String.format(Locale.US, "%s: %s %x", new Object[]{str4, str6, Long.valueOf(libInfo.mLoadAddress)}), new Object[0]);
                        j2 = 0;
                    } else {
                        j2 = 0;
                    }
                    if (!(j == j2 || this.mCurrentLoadAddress == j2)) {
                        this.mCurrentLoadAddress = libInfo.mLoadAddress + libInfo.mLoadSize + 16777216;
                    }
                    this.mLoadedLibraries.put(str3, libInfo);
                    return;
                }
                String str8 = "Unable to load library: " + str3;
                Log.e("LibraryLoader", str8, new Object[0]);
                throw new UnsatisfiedLinkError(str8);
            }
        }
    }
}
