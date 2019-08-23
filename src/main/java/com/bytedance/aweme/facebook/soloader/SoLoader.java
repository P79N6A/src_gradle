package com.bytedance.aweme.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {
    static final boolean SYSTRACE_LIBRARY_LOADING;
    @Nullable
    @GuardedBy("sSoSourcesLock")
    private static ApplicationSoSource sApplicationSoSource;
    @Nullable
    @GuardedBy("sSoSourcesLock")
    private static UnpackingSoSource[] sBackupSoSources;
    @GuardedBy("sSoSourcesLock")
    private static int sFlags;
    private static final Set<String> sLoadedAndMergedLibraries = Collections.newSetFromMap(new ConcurrentHashMap());
    @GuardedBy("SoLoader.class")
    private static final HashSet<String> sLoadedLibraries = new HashSet<>();
    @GuardedBy("SoLoader.class")
    private static final Map<String, Object> sLoadingLibraries = new HashMap();
    @Nullable
    static SoFileLoader sSoFileLoader;
    @Nullable
    @GuardedBy("sSoSourcesLock")
    private static SoSource[] sSoSources = null;
    private static final ReentrantReadWriteLock sSoSourcesLock = new ReentrantReadWriteLock();
    private static int sSoSourcesVersion = 0;
    @Nullable
    private static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;

    @DoNotOptimize
    @TargetApi(14)
    static class Api14Utils {
        private Api14Utils() {
        }

        public static String getClassLoaderLdLoadLibrary() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e2) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e2);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        WrongAbiError(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    public static void deinitForTest() {
        setSoSources(null);
    }

    public static void setInTestMode() {
        setSoSources(new SoSource[]{new NoopSoSource()});
    }

    static void resetStatus() {
        synchronized (SoLoader.class) {
            sLoadedLibraries.clear();
            sLoadingLibraries.clear();
            sSoFileLoader = null;
        }
        setSoSources(null);
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        SYSTRACE_LIBRARY_LOADING = z;
    }

    private static void assertInitialized() {
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    @Nullable
    private static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    public static String makeLdLibraryPath() {
        sSoSourcesLock.readLock().lock();
        try {
            assertInitialized();
            ArrayList arrayList = new ArrayList();
            SoSource[] soSourceArr = sSoSources;
            for (SoSource addToLdLibraryPath : soSourceArr) {
                addToLdLibraryPath.addToLdLibraryPath(arrayList);
            }
            return TextUtils.join(":", arrayList);
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    private static int makePrepareFlags() {
        int i;
        sSoSourcesLock.writeLock().lock();
        try {
            if ((sFlags & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            return i;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static boolean areSoSourcesAbisSupported() {
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources == null) {
                return false;
            }
            String[] supportedAbis = SysUtil.getSupportedAbis();
            for (SoSource soSourceAbis : sSoSources) {
                String[] soSourceAbis2 = soSourceAbis.getSoSourceAbis();
                for (int i = 0; i < soSourceAbis2.length; i++) {
                    boolean z = false;
                    for (int i2 = 0; i2 < supportedAbis.length && !z; i2++) {
                        z = soSourceAbis2[i].equals(supportedAbis[i2]);
                    }
                    if (!z) {
                        sSoSourcesLock.readLock().unlock();
                        return false;
                    }
                }
            }
            sSoSourcesLock.readLock().unlock();
            return true;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    static void setSoFileLoader(SoFileLoader soFileLoader) {
        sSoFileLoader = soFileLoader;
    }

    public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper systemLoadLibraryWrapper) {
        sSystemLoadLibraryWrapper = systemLoadLibraryWrapper;
    }

    public static boolean loadLibrary(String str) {
        return loadLibrary(str, 0);
    }

    public static File unpackLibraryAndDependencies(String str) throws UnsatisfiedLinkError {
        assertInitialized();
        try {
            return unpackLibraryBySoName(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static synchronized void initSoLoader(@Nullable SoFileLoader soFileLoader) {
        final boolean z;
        String str;
        synchronized (SoLoader.class) {
            if (soFileLoader != null) {
                sSoFileLoader = soFileLoader;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method nativeLoadRuntimeMethod = getNativeLoadRuntimeMethod();
            if (nativeLoadRuntimeMethod != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = Api14Utils.getClassLoaderLdLoadLibrary();
            } else {
                str = null;
            }
            final String str2 = str;
            final String makeNonZipPath = makeNonZipPath(str2);
            AnonymousClass1 r1 = new SoFileLoader() {
                private String getLibHash(String str) {
                    FileInputStream fileInputStream;
                    Throwable th;
                    try {
                        File file = new File(str);
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        fileInputStream = new FileInputStream(file);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read > 0) {
                                instance.update(bArr, 0, read);
                            } else {
                                String format = String.format("%32x", new Object[]{new BigInteger(1, instance.digest())});
                                fileInputStream.close();
                                return format;
                            }
                        }
                    } catch (IOException e2) {
                        return e2.toString();
                    } catch (SecurityException e3) {
                        return e3.toString();
                    } catch (NoSuchAlgorithmException e4) {
                        return e4.toString();
                    } catch (Throwable th2) {
                        a.a(th, th2);
                    }
                    throw th;
                }

                public final void load(String str, int i) {
                    boolean z;
                    String str2;
                    String str3;
                    if (z) {
                        if ((i & 4) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str2 = str2;
                        } else {
                            str2 = makeNonZipPath;
                        }
                        try {
                            synchronized (runtime) {
                                str3 = (String) nativeLoadRuntimeMethod.invoke(runtime, new Object[]{str, SoLoader.class.getClassLoader(), str2});
                                if (str3 != null) {
                                    throw new UnsatisfiedLinkError(str3);
                                }
                            }
                            if (str3 == null) {
                            }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                            throw new RuntimeException("Error: Cannot load " + str, e2);
                        }
                    } else {
                        System.load(str);
                    }
                }
            };
            sSoFileLoader = r1;
        }
    }

    @Nullable
    public static String makeNonZipPath(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    static void setSoSources(SoSource[] soSourceArr) {
        sSoSourcesLock.writeLock().lock();
        try {
            sSoSources = soSourceArr;
            sSoSourcesVersion++;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    static File unpackLibraryBySoName(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        int i = 0;
        while (i < sSoSources.length) {
            try {
                File unpackLibrary = sSoSources[i].unpackLibrary(str);
                if (unpackLibrary != null) {
                    return unpackLibrary;
                }
                i++;
            } finally {
                sSoSourcesLock.readLock().unlock();
            }
        }
        sSoSourcesLock.readLock().unlock();
        throw new FileNotFoundException(str);
    }

    public static void prependSoSource(SoSource soSource) throws IOException {
        sSoSourcesLock.writeLock().lock();
        try {
            assertInitialized();
            soSource.prepare(makePrepareFlags());
            SoSource[] soSourceArr = new SoSource[(sSoSources.length + 1)];
            soSourceArr[0] = soSource;
            System.arraycopy(sSoSources, 0, soSourceArr, 1, sSoSources.length);
            sSoSources = soSourceArr;
            sSoSourcesVersion++;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static void init(Context context, int i) throws IOException {
        init(context, i, null);
    }

    public static void init(Context context, boolean z) {
        try {
            init(context, z ? 1 : 0);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean loadLibrary(String str, int i) throws UnsatisfiedLinkError {
        String str2;
        boolean z;
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    assertInitialized();
                } else {
                    synchronized (SoLoader.class) {
                        z = !sLoadedLibraries.contains(str);
                        if (z) {
                            if (sSystemLoadLibraryWrapper != null) {
                                sSystemLoadLibraryWrapper.loadLibrary(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    sSoSourcesLock.readLock().unlock();
                    return z;
                }
            }
            sSoSourcesLock.readLock().unlock();
            String mapLibName = MergedSoMapping.mapLibName(str);
            if (mapLibName != null) {
                str2 = mapLibName;
            } else {
                str2 = str;
            }
            return loadLibraryBySoName(System.mapLibraryName(str2), str, mapLibName, i | 2, null);
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    static void loadLibraryBySoName(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        loadLibraryBySoName(str, null, null, i, threadPolicy);
    }

    private static void init(Context context, int i, @Nullable SoFileLoader soFileLoader) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            initSoLoader(soFileLoader);
            initSoSources(context, i, soFileLoader);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX INFO: finally extract failed */
    private static void doLoadLibraryBySoName(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources != null) {
                sSoSourcesLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.beginTraceSection("SoLoader.loadLibrary[" + str + "]");
                }
                int i2 = 0;
                do {
                    try {
                        sSoSourcesLock.readLock().lock();
                        int i3 = sSoSourcesVersion;
                        int i4 = 0;
                        while (true) {
                            if (i2 != 0) {
                                break;
                            }
                            try {
                                if (i4 >= sSoSources.length) {
                                    break;
                                }
                                int loadLibrary = sSoSources[i4].loadLibrary(str, i, threadPolicy);
                                if (loadLibrary == 3) {
                                    try {
                                        if (sBackupSoSources != null) {
                                            UnpackingSoSource[] unpackingSoSourceArr = sBackupSoSources;
                                            int length = unpackingSoSourceArr.length;
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= length) {
                                                    i2 = loadLibrary;
                                                    break;
                                                }
                                                UnpackingSoSource unpackingSoSource = unpackingSoSourceArr[i5];
                                                unpackingSoSource.prepare(str);
                                                int loadLibrary2 = unpackingSoSource.loadLibrary(str, i, threadPolicy);
                                                if (loadLibrary2 == 1) {
                                                    i2 = loadLibrary2;
                                                    break;
                                                }
                                                i5++;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = loadLibrary;
                                        sSoSourcesLock.readLock().unlock();
                                        throw th;
                                    }
                                }
                                i4++;
                                i2 = loadLibrary;
                            } catch (Throwable th2) {
                                th = th2;
                                sSoSourcesLock.readLock().unlock();
                                throw th;
                            }
                        }
                        sSoSourcesLock.readLock().unlock();
                        if ((i & 2) == 2 && i2 == 0) {
                            sSoSourcesLock.writeLock().lock();
                            if (sApplicationSoSource != null && sApplicationSoSource.checkAndMaybeUpdate()) {
                                sSoSourcesVersion++;
                            }
                            if (sSoSourcesVersion != i3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            sSoSourcesLock.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th3) {
                        if (SYSTRACE_LIBRARY_LOADING) {
                            Api18TraceUtils.endSection();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
                        }
                        throw th3;
                    }
                } while (z2);
                if (SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
                }
                return;
            }
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } catch (Throwable th4) {
            sSoSourcesLock.readLock().unlock();
            throw th4;
        }
    }

    private static void initSoSources(Context context, int i, @Nullable SoFileLoader soFileLoader) throws IOException {
        boolean z;
        int i2;
        int i3;
        sSoSourcesLock.writeLock().lock();
        try {
            if (sSoSources == null) {
                sFlags = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (String file : split) {
                    arrayList.add(new DirectorySoSource(new File(file), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        sBackupSoSources = null;
                        arrayList.add(0, new ExoSoSource(context, "aweme-lib-main"));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) == 0 || (applicationInfo.flags & SearchJediMixFeedAdapter.f42517f) != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2 = 0;
                        } else {
                            if (Build.VERSION.SDK_INT <= 17) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            sApplicationSoSource = new ApplicationSoSource(context, i3);
                            arrayList.add(0, sApplicationSoSource);
                            i2 = 1;
                        }
                        if ((sFlags & 8) != 0) {
                            sBackupSoSources = null;
                        } else {
                            File file2 = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new ApkSoSource(context, file2, "aweme-lib-main", i2));
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    arrayList2.add(new ApkSoSource(context, new File(strArr[i4]), "aweme-lib-" + i5, i2));
                                    i4++;
                                    i5++;
                                }
                            }
                            sBackupSoSources = (UnpackingSoSource[]) arrayList2.toArray(new UnpackingSoSource[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                SoSource[] soSourceArr = (SoSource[]) arrayList.toArray(new SoSource[arrayList.size()]);
                int makePrepareFlags = makePrepareFlags();
                int length2 = soSourceArr.length;
                while (true) {
                    int i6 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    soSourceArr[i6].prepare(makePrepareFlags);
                    length2 = i6;
                }
                sSoSources = soSourceArr;
                sSoSourcesVersion++;
            }
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r2 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = com.bytedance.aweme.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (sLoadedLibraries.contains(r6) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r8 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r2 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        doLoadLibraryBySoName(r6, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        r9 = com.bytedance.aweme.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        sLoadedLibraries.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005f, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0064, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0065, code lost:
        r7 = r6.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0069, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0078, code lost:
        throw new com.bytedance.aweme.facebook.soloader.SoLoader.WrongAbiError(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0079, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x007a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0080, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0084, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x008a, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0092, code lost:
        if (sLoadedAndMergedLibraries.contains(r7) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0094, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0096, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0097, code lost:
        if (r8 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0099, code lost:
        if (r6 != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x009d, code lost:
        if (SYSTRACE_LIBRARY_LOADING == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x009f, code lost:
        com.bytedance.aweme.facebook.soloader.Api18TraceUtils.beginTraceSection("MergedSoMapping.invokeJniOnload[" + r7 + "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        com.bytedance.aweme.facebook.soloader.MergedSoMapping.invokeJniOnload(r7);
        sLoadedAndMergedLibraries.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00bf, code lost:
        if (SYSTRACE_LIBRARY_LOADING == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00c1, code lost:
        com.bytedance.aweme.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00c5, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00c8, code lost:
        if (SYSTRACE_LIBRARY_LOADING != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00ca, code lost:
        com.bytedance.aweme.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00cd, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00ce, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00cf, code lost:
        if (r2 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00d1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00d2, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00d4, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean loadLibraryBySoName(java.lang.String r6, @android.support.annotation.Nullable java.lang.String r7, @android.support.annotation.Nullable java.lang.String r8, int r9, @android.support.annotation.Nullable android.os.StrictMode.ThreadPolicy r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.util.Set<java.lang.String> r0 = sLoadedAndMergedLibraries
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.Class<com.bytedance.aweme.facebook.soloader.SoLoader> r0 = com.bytedance.aweme.facebook.soloader.SoLoader.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r2 = sLoadedLibraries     // Catch:{ all -> 0x00d5 }
            boolean r2 = r2.contains(r6)     // Catch:{ all -> 0x00d5 }
            r3 = 1
            if (r2 == 0) goto L_0x0022
            if (r8 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            return r1
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r4 = sLoadingLibraries     // Catch:{ all -> 0x00d5 }
            boolean r4 = r4.containsKey(r6)     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r4 = sLoadingLibraries     // Catch:{ all -> 0x00d5 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x003c
        L_0x0032:
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x00d5 }
            r4.<init>()     // Catch:{ all -> 0x00d5 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = sLoadingLibraries     // Catch:{ all -> 0x00d5 }
            r5.put(r6, r4)     // Catch:{ all -> 0x00d5 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            monitor-enter(r4)
            if (r2 != 0) goto L_0x0086
            java.lang.Class<com.bytedance.aweme.facebook.soloader.SoLoader> r0 = com.bytedance.aweme.facebook.soloader.SoLoader.class
            monitor-enter(r0)     // Catch:{ all -> 0x0084 }
            java.util.HashSet<java.lang.String> r5 = sLoadedLibraries     // Catch:{ all -> 0x0081 }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x0051
            if (r8 != 0) goto L_0x0050
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            return r1
        L_0x0050:
            r2 = 1
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0086
            doLoadLibraryBySoName(r6, r9, r10)     // Catch:{ IOException -> 0x007a, UnsatisfiedLinkError -> 0x0064 }
            java.lang.Class<com.bytedance.aweme.facebook.soloader.SoLoader> r9 = com.bytedance.aweme.facebook.soloader.SoLoader.class
            monitor-enter(r9)     // Catch:{ all -> 0x0084 }
            java.util.HashSet<java.lang.String> r10 = sLoadedLibraries     // Catch:{ all -> 0x0061 }
            r10.add(r6)     // Catch:{ all -> 0x0061 }
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            goto L_0x0086
        L_0x0061:
            r6 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x0064:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r8 = "unexpected e_machine:"
            boolean r7 = r7.contains(r8)     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0079
            com.bytedance.aweme.facebook.soloader.SoLoader$WrongAbiError r7 = new com.bytedance.aweme.facebook.soloader.SoLoader$WrongAbiError     // Catch:{ all -> 0x0084 }
            r7.<init>(r6)     // Catch:{ all -> 0x0084 }
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x0079:
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x007a:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x0084 }
            r7.<init>(r6)     // Catch:{ all -> 0x0084 }
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x0081:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r6 = move-exception
            goto L_0x00d3
        L_0x0086:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x0096
            java.util.Set<java.lang.String> r6 = sLoadedAndMergedLibraries     // Catch:{ all -> 0x0084 }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0096
            r6 = 1
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            if (r8 == 0) goto L_0x00ce
            if (r6 != 0) goto L_0x00ce
            boolean r6 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x00b5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = "MergedSoMapping.invokeJniOnload["
            r6.<init>(r8)     // Catch:{ all -> 0x0084 }
            r6.append(r7)     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = "]"
            r6.append(r8)     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0084 }
            com.bytedance.aweme.facebook.soloader.Api18TraceUtils.beginTraceSection(r6)     // Catch:{ all -> 0x0084 }
        L_0x00b5:
            com.bytedance.aweme.facebook.soloader.MergedSoMapping.invokeJniOnload(r7)     // Catch:{ all -> 0x00c5 }
            java.util.Set<java.lang.String> r6 = sLoadedAndMergedLibraries     // Catch:{ all -> 0x00c5 }
            r6.add(r7)     // Catch:{ all -> 0x00c5 }
            boolean r6 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x00ce
            com.bytedance.aweme.facebook.soloader.Api18TraceUtils.endSection()     // Catch:{ all -> 0x0084 }
            goto L_0x00ce
        L_0x00c5:
            r6 = move-exception
            boolean r7 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x00cd
            com.bytedance.aweme.facebook.soloader.Api18TraceUtils.endSection()     // Catch:{ all -> 0x0084 }
        L_0x00cd:
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x00ce:
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x00d2
            return r3
        L_0x00d2:
            return r1
        L_0x00d3:
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            throw r6
        L_0x00d5:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.aweme.facebook.soloader.SoLoader.loadLibraryBySoName(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
