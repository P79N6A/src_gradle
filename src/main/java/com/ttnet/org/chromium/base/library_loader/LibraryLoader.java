package com.ttnet.org.chromium.base.library_loader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.CommandLine;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.MainDex;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

@MainDex
@JNINamespace("base::android")
public class LibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static volatile LibraryLoader sInstance;
    private static NativeLibraryPreloader sLibraryPreloader;
    private static final Object sLock = new Object();
    private boolean mCommandLineSwitched;
    private volatile boolean mInitialized;
    private boolean mIsUsingBrowserSharedRelros;
    private long mLibraryLoadTimeMs;
    private int mLibraryPreloaderStatus = -1;
    private final int mLibraryProcessType;
    private boolean mLibraryWasLoadedFromApk;
    private boolean mLoadAtFixedAddressFailed;
    private boolean mLoaded;
    private final AtomicBoolean mPrefetchLibraryHasBeenCalled;

    public static native boolean nativeForkAndPrefetchNativeLibrary();

    private native String nativeGetVersionNumber();

    private native void nativeInitCommandLine(String[] strArr);

    private native boolean nativeLibraryLoaded();

    public static native int nativePercentageOfResidentNativeLibraryCode();

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(boolean z, boolean z2, int i, long j);

    private native void nativeRecordLibraryPreloaderBrowserHistogram(int i);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(boolean z, boolean z2, long j);

    private native void nativeRegisterLibraryPreloaderRendererHistogram(int i);

    public void onNativeInitializationComplete() {
        recordBrowserProcessHistogram();
    }

    private int getLibraryLoadFromApkStatus() {
        if (this.mLibraryWasLoadedFromApk) {
            return 3;
        }
        return 0;
    }

    public void loadNow() throws ProcessInitException {
        loadNowOverrideApplicationContext(ContextUtils.getApplicationContext());
    }

    @CalledByNative
    public static int getLibraryProcessType() {
        if (sInstance == null) {
            return 0;
        }
        return sInstance.mLibraryProcessType;
    }

    public static boolean isInitialized() {
        if (sInstance == null || !sInstance.mInitialized) {
            return false;
        }
        return true;
    }

    public void initialize() throws ProcessInitException {
        synchronized (sLock) {
            initializeAlreadyLocked();
        }
    }

    public void switchCommandLineForWebView() {
        synchronized (sLock) {
            ensureCommandLineSwitchedAlreadyLocked();
        }
    }

    private void ensureCommandLineSwitchedAlreadyLocked() {
        if (!this.mCommandLineSwitched) {
            nativeInitCommandLine(CommandLine.getJavaSwitchesOrNull());
            CommandLine.enableNativeProxy();
            this.mCommandLineSwitched = true;
            ContextUtils.initApplicationContextForNative();
        }
    }

    public void asyncPrefetchLibrariesToMemory() {
        final boolean compareAndSet = this.mPrefetchLibraryHasBeenCalled.compareAndSet(false, true);
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                boolean z;
                String str;
                TraceEvent.begin("LibraryLoader.asyncPrefetchLibrariesToMemory");
                int nativePercentageOfResidentNativeLibraryCode = LibraryLoader.nativePercentageOfResidentNativeLibraryCode();
                boolean z2 = false;
                if (!compareAndSet || nativePercentageOfResidentNativeLibraryCode >= 90) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    boolean nativeForkAndPrefetchNativeLibrary = LibraryLoader.nativeForkAndPrefetchNativeLibrary();
                    if (!nativeForkAndPrefetchNativeLibrary) {
                        Log.w("LibraryLoader", "Forking a process to prefetch the native library failed.", new Object[0]);
                    }
                    z2 = nativeForkAndPrefetchNativeLibrary;
                }
                RecordHistogram.initialize();
                if (z) {
                    RecordHistogram.recordBooleanHistogram("LibraryLoader.PrefetchStatus", z2);
                }
                if (nativePercentageOfResidentNativeLibraryCode != -1) {
                    StringBuilder sb = new StringBuilder("LibraryLoader.PercentageOfResidentCodeBeforePrefetch");
                    if (compareAndSet) {
                        str = ".ColdStartup";
                    } else {
                        str = ".WarmStartup";
                    }
                    sb.append(str);
                    RecordHistogram.recordPercentageHistogram(sb.toString(), nativePercentageOfResidentNativeLibraryCode);
                }
                TraceEvent.end("LibraryLoader.asyncPrefetchLibrariesToMemory");
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void ensureInitialized() throws ProcessInitException {
        synchronized (sLock) {
            if (!this.mInitialized) {
                loadAlreadyLocked(ContextUtils.getApplicationContext());
                initializeAlreadyLocked();
            }
        }
    }

    private void recordBrowserProcessHistogram() {
        Linker.getInstance();
        if (Linker.isUsed()) {
            nativeRecordChromiumAndroidLinkerBrowserHistogram(this.mIsUsingBrowserSharedRelros, this.mLoadAtFixedAddressFailed, getLibraryLoadFromApkStatus(), this.mLibraryLoadTimeMs);
        }
        if (sLibraryPreloader != null) {
            nativeRecordLibraryPreloaderBrowserHistogram(this.mLibraryPreloaderStatus);
        }
    }

    private void initializeAlreadyLocked() throws ProcessInitException {
        if (!this.mInitialized) {
            ensureCommandLineSwitchedAlreadyLocked();
            if (nativeLibraryLoaded()) {
                Log.i("LibraryLoader", String.format("Expected native library version number \"%s\", actual native library version number \"%s\"", new Object[]{NativeLibraries.sVersionNumber, nativeGetVersionNumber()}), new Object[0]);
                if (NativeLibraries.sVersionNumber.equals(nativeGetVersionNumber())) {
                    TraceEvent.registerNativeEnabledObserver();
                    this.mInitialized = true;
                    return;
                }
                throw new ProcessInitException(3);
            }
            Log.e("LibraryLoader", "error calling nativeLibraryLoaded", new Object[0]);
            throw new ProcessInitException(1);
        }
    }

    private LibraryLoader(int i) {
        this.mLibraryProcessType = i;
        this.mPrefetchLibraryHasBeenCalled = new AtomicBoolean();
    }

    public static void setNativeLibraryPreloader(NativeLibraryPreloader nativeLibraryPreloader) {
        synchronized (sLock) {
            sLibraryPreloader = nativeLibraryPreloader;
        }
    }

    public void loadNowOverrideApplicationContext(Context context) throws ProcessInitException {
        synchronized (sLock) {
            if (this.mLoaded) {
                if (context != ContextUtils.getApplicationContext()) {
                    throw new IllegalStateException("Attempt to load again from alternate context.");
                }
            }
            loadAlreadyLocked(context);
        }
    }

    public static LibraryLoader get(int i) throws ProcessInitException {
        synchronized (sLock) {
            if (sInstance == null) {
                LibraryLoader libraryLoader = new LibraryLoader(i);
                sInstance = libraryLoader;
                return libraryLoader;
            } else if (sInstance.mLibraryProcessType == i) {
                LibraryLoader libraryLoader2 = sInstance;
                return libraryLoader2;
            } else {
                throw new ProcessInitException(2);
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    private void loadAlreadyLocked(Context context) throws ProcessInitException {
        try {
            if (!this.mLoaded) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (Linker.isUsed()) {
                    Linker instance = Linker.getInstance();
                    instance.prepareLibraryLoad();
                    for (String str : NativeLibraries.LIBRARIES) {
                        if (!instance.isChromiumLinkerLibrary(str)) {
                            String str2 = null;
                            String mapLibraryName = System.mapLibraryName(str);
                            if (Linker.isInZipFile()) {
                                str2 = context.getApplicationInfo().sourceDir;
                                Log.i("LibraryLoader", "Loading " + str + " from within " + str2, new Object[0]);
                            } else {
                                Log.i("LibraryLoader", "Loading " + str, new Object[0]);
                            }
                            loadLibrary(instance, str2, mapLibraryName);
                        }
                    }
                    instance.finishLibraryLoad();
                } else {
                    if (sLibraryPreloader != null) {
                        this.mLibraryPreloaderStatus = sLibraryPreloader.loadLibrary(context);
                    }
                    for (String loadLibrary : NativeLibraries.LIBRARIES) {
                        System.loadLibrary(loadLibrary);
                    }
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.mLibraryLoadTimeMs = uptimeMillis2 - uptimeMillis;
                Log.i("LibraryLoader", String.format("Time to load native libraries: %d ms (timestamps %d-%d)", new Object[]{Long.valueOf(this.mLibraryLoadTimeMs), Long.valueOf(uptimeMillis % 10000), Long.valueOf(uptimeMillis2 % 10000)}), new Object[0]);
                this.mLoaded = true;
            }
        } catch (UnsatisfiedLinkError e2) {
            throw new ProcessInitException(2, e2);
        }
    }

    public void registerRendererProcessHistogram(boolean z, boolean z2) {
        Linker.getInstance();
        if (Linker.isUsed()) {
            nativeRegisterChromiumAndroidLinkerRendererHistogram(z, z2, this.mLibraryLoadTimeMs);
        }
        if (sLibraryPreloader != null) {
            nativeRegisterLibraryPreloaderRendererHistogram(this.mLibraryPreloaderStatus);
        }
    }

    private void loadLibrary(Linker linker, @Nullable String str, String str2) {
        if (linker.isUsingBrowserSharedRelros()) {
            this.mIsUsingBrowserSharedRelros = true;
            try {
                linker.loadLibrary(str, str2);
            } catch (UnsatisfiedLinkError unused) {
                Log.w("LibraryLoader", "Failed to load native library with shared RELRO, retrying without", new Object[0]);
                this.mLoadAtFixedAddressFailed = true;
                linker.loadLibraryNoFixedAddress(str, str2);
            }
        } else {
            linker.loadLibrary(str, str2);
        }
        if (str != null) {
            this.mLibraryWasLoadedFromApk = true;
        }
    }
}
