package com.bytedance.boost_multidex;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Environment;
import com.bytedance.boost_multidex.DexHolder;
import com.ss.android.ugc.aweme.q.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class DexInstallProcessor {
    private static Random gRandom;
    private AssetManager mAssetManager;
    private boolean mDoCheckSum;
    public File mLockFile;
    private Method mOpenNonAssetMethod;
    private SharedPreferences mPreferences;

    DexInstallProcessor(Context context) {
        gRandom = new Random();
        this.mDoCheckSum = gRandom.nextInt(3) == 0;
        Monitor monitor = Monitor.get();
        monitor.logInfo("Do checksum " + this.mDoCheckSum);
        this.mAssetManager = context.getAssets();
        try {
            this.mOpenNonAssetMethod = Utility.findMethod(this.mAssetManager.getClass(), "openNonAsset", String.class);
        } catch (NoSuchMethodException e2) {
            Monitor.get().logWarning("Cound not find openNonAsset", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkFileValid(java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12, java.io.File r13, boolean r14) {
        /*
            r8 = this;
            boolean r0 = r13.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0021
            com.bytedance.boost_multidex.Monitor r9 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "File does not exist! "
            r10.<init>(r11)
            java.lang.String r11 = r13.getPath()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.logWarning(r10)
            return r1
        L_0x0021:
            android.content.SharedPreferences r0 = r8.mPreferences
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r12)
            r2.append(r10)
            java.lang.String r12 = r2.toString()
            r2 = -1
            long r4 = r0.getLong(r12, r2)
            long r6 = r13.lastModified()
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x006f
            com.bytedance.boost_multidex.Monitor r12 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid file:  (key \""
            r13.<init>(r14)
            r13.append(r9)
            r13.append(r11)
            r13.append(r10)
            java.lang.String r9 = "\"), expected modification time: "
            r13.append(r9)
            r13.append(r4)
            java.lang.String r9 = ", modification time: "
            r13.append(r9)
            r13.append(r6)
            java.lang.String r9 = r13.toString()
            r12.logWarning(r9)
            return r1
        L_0x006f:
            r4 = 0
            java.lang.String r12 = "dex.checksum."
            boolean r12 = r12.equals(r11)
            r0 = 1
            if (r12 == 0) goto L_0x008d
            if (r14 == 0) goto L_0x0081
            long r4 = com.bytedance.boost_multidex.Utility.doZipCheckSum(r13)     // Catch:{ IOException -> 0x008c }
            goto L_0x0099
        L_0x0081:
            boolean r12 = r8.mDoCheckSum     // Catch:{ IOException -> 0x008c }
            if (r12 == 0) goto L_0x008a
            long r4 = com.bytedance.boost_multidex.Utility.doFileCheckSum(r13)     // Catch:{ IOException -> 0x008c }
            goto L_0x0099
        L_0x008a:
            r12 = 0
            goto L_0x009a
        L_0x008c:
            return r1
        L_0x008d:
            java.lang.String r12 = "odex.checksum."
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x00e5
            long r4 = r13.length()
        L_0x0099:
            r12 = 1
        L_0x009a:
            if (r12 == 0) goto L_0x00e4
            android.content.SharedPreferences r12 = r8.mPreferences
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r11)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            long r12 = r12.getLong(r13, r2)
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x00e4
            com.bytedance.boost_multidex.Monitor r14 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid file:  (key \""
            r0.<init>(r2)
            r0.append(r9)
            r0.append(r11)
            r0.append(r10)
            java.lang.String r9 = "\"), expected checksum: "
            r0.append(r9)
            r0.append(r12)
            java.lang.String r9 = ", file checksum: "
            r0.append(r9)
            r0.append(r4)
            java.lang.String r9 = r0.toString()
            r14.logWarning(r9)
            return r1
        L_0x00e4:
            return r0
        L_0x00e5:
            com.bytedance.boost_multidex.Monitor r9 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "unsupported checksum key: "
            r10.<init>(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.logWarning(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.DexInstallProcessor.checkFileValid(java.lang.String, int, java.lang.String, java.lang.String, java.io.File, boolean):boolean");
    }

    private void doAfterInstall(final String str, List<DexHolder> list) {
        Monitor.get().logInfo("Do more after installing...");
        for (final DexHolder next : list) {
            if ((next instanceof DexHolder.ZipOpt) || (next instanceof DexHolder.DexOpt)) {
                Monitor monitor = Monitor.get();
                monitor.logInfo("Skip final holder " + next.toString());
            } else {
                Monitor.get().doOptAfterInstall(new Runnable() {
                    public void run() {
                        DexHolder dexHolder;
                        Throwable th;
                        DexHolder dexHolder2 = next;
                        while (dexHolder2 != null) {
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException unused) {
                            }
                            long freeSpace = Environment.getDataDirectory().getFreeSpace();
                            if (freeSpace < 50000000) {
                                Monitor monitor = Monitor.get();
                                monitor.logWarning("Free space is too small: " + freeSpace + ", compare to 150000000");
                                return;
                            }
                            Monitor monitor2 = Monitor.get();
                            monitor2.logInfo("Free space is enough: " + freeSpace + ", continue...");
                            Monitor monitor3 = Monitor.get();
                            monitor3.logDebug("Process holder, " + dexHolder2);
                            try {
                                Locker locker = new Locker(DexInstallProcessor.this.mLockFile);
                                locker.lock();
                                try {
                                    long nanoTime = System.nanoTime();
                                    dexHolder = dexHolder2.toFasterHolder();
                                    if (dexHolder != null) {
                                        try {
                                            long nanoTime2 = System.nanoTime() - nanoTime;
                                            DexHolder.StoreInfo info = dexHolder.getInfo();
                                            Monitor monitor4 = Monitor.get();
                                            monitor4.logDebug("Put info, " + info.index + " file is " + info.file.getPath());
                                            DexInstallProcessor.this.putSecondaryDexInfo(str, info.index, info.file, info.type);
                                            Monitor.get().reportAfterInstall(nanoTime2, freeSpace, Environment.getDataDirectory().getFreeSpace() - freeSpace, dexHolder.toString());
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    locker.close();
                                    dexHolder2 = dexHolder;
                                } catch (Throwable th3) {
                                    th = th3;
                                    dexHolder2 = dexHolder;
                                    Monitor.get().logErrorAfterInstall("Fail to be faster", th);
                                    Result.get().unFatalThrowable.add(th);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                Monitor.get().logErrorAfterInstall("Fail to be faster", th);
                                Result.get().unFatalThrowable.add(th);
                            }
                        }
                    }
                });
            }
        }
    }

    private File getValidDexFile(String str, File file, int i) {
        if (!checkFileValid(str, i, "dex.checksum.", "dex.time.", file, false)) {
            return null;
        }
        return file;
    }

    private File getValidOptDexFile(String str, File file, int i) {
        if (!file.exists()) {
            Monitor monitor = Monitor.get();
            monitor.logInfo("opt file does not exist: " + file.getPath());
            return null;
        } else if (!checkFileValid(str, i, "odex.checksum.", "odex.time.", file, false)) {
            return null;
        } else {
            return file;
        }
    }

    private void installSecondaryDexes(String str, ClassLoader classLoader, List<DexHolder> list) {
        ArrayList<DexHolder> arrayList = new ArrayList<>();
        DexLoader.create(Build.VERSION.SDK_INT).install(classLoader, list, arrayList);
        for (DexHolder info : arrayList) {
            DexHolder.StoreInfo info2 = info.getInfo();
            Monitor monitor = Monitor.get();
            monitor.logDebug("Put info " + info2.index + ", file is " + info2.file.getPath());
            try {
                putSecondaryDexInfo(str, info2.index, info2.file, info2.type);
            } catch (IOException e2) {
                Monitor.get().logErrorAfterInstall("Fail to store dex info", e2);
                Result.get().unFatalThrowable.add(e2);
            }
        }
    }

    private boolean isZipFileValid(String str, File file, int i) {
        return checkFileValid(str, i, "dex.checksum.", "dex.time.", file, true);
    }

    private DexHolder obtainDexObject(int i, File file, File file2, File file3, File file4, String str) {
        int i2 = i;
        File file5 = file;
        File file6 = file4;
        String str2 = str;
        SharedPreferences sharedPreferences = this.mPreferences;
        int i3 = sharedPreferences.getInt(str2 + "dex.obj.type" + i, Utility.isBetterUseApkBuf() ^ true ? 1 : 0);
        if (i3 == 3) {
            File file7 = new File(file6, str2 + i + ".zip");
            File file8 = new File(file6, str2 + i + ".odex");
            if (isZipFileValid(str2, file7, i)) {
                return new DexHolder.ZipOpt(i, file7, file8);
            }
            ZipFile zipFile = new ZipFile(file);
            DexHolder.ZipOpt obtainValidZipDex = obtainValidZipDex(str, i, file7, file8, zipFile, zipFile.getEntry("classes" + i + ".dex"));
            zipFile.close();
            return obtainValidZipDex;
        }
        File file9 = file2;
        File file10 = new File(file2, str2 + i + ".dex");
        File file11 = file3;
        File file12 = new File(file3, str2 + i + ".odex");
        if (i3 == 2) {
            File validDexFile = getValidDexFile(str2, file10, i);
            if (validDexFile != null) {
                File validOptDexFile = getValidOptDexFile(str2, file12, i);
                if (validOptDexFile != null) {
                    return new DexHolder.DexOpt(i, validDexFile, validOptDexFile, false);
                }
                if (!BoostNative.isSupportFastLoad()) {
                    return new DexHolder.DexOpt(i, validDexFile, file12, true);
                }
                i3 = 1;
            } else if (BoostNative.isSupportFastLoad()) {
                i3 = 0;
            } else {
                ZipFile zipFile2 = new ZipFile(file);
                File obtainEntryFileInApk = obtainEntryFileInApk(zipFile2, zipFile2.getEntry("classes" + i + ".dex"), file10);
                putSecondaryDexInfo(str2, i, obtainEntryFileInApk, 2);
                return new DexHolder.DexOpt(i, obtainEntryFileInApk, file12, true);
            }
        }
        if (i3 == 1) {
            File validDexFile2 = getValidDexFile(str2, file10, i);
            if (!BoostNative.isSupportFastLoad()) {
                if (validDexFile2 == null) {
                    ZipFile zipFile3 = new ZipFile(file);
                    validDexFile2 = obtainEntryFileInApk(zipFile3, zipFile3.getEntry("classes" + i + ".dex"), file10);
                    putSecondaryDexInfo(str2, i, validDexFile2, 2);
                }
                return new DexHolder.DexOpt(i, validDexFile2, file12, true);
            } else if (validDexFile2 != null) {
                return new DexHolder.DexBuffer(i, validDexFile2, file12);
            } else {
                i3 = 0;
            }
        }
        if (i3 != 0) {
            return null;
        }
        if (!BoostNative.isSupportFastLoad()) {
            Monitor.get().logError("Do not support apk buf!");
        }
        ZipFile zipFile4 = new ZipFile(file);
        DexHolder.ApkBuffer apkBuffer = new DexHolder.ApkBuffer(i, obtainEntryBytesInApk(zipFile4, zipFile4.getEntry("classes" + i + ".dex")), file10, file12);
        zipFile4.close();
        return apkBuffer;
    }

    @SuppressLint({"ApplySharedPref"})
    private List<DexHolder> obtainDexObjectList(String str, File file, File file2, File file3, File file4, File file5, Result result) {
        boolean z;
        Result result2;
        ZipFile zipFile;
        int i;
        ArrayList arrayList;
        String str2;
        Object dexOpt;
        String str3 = str;
        File file6 = file5;
        long doZipCheckSum = Utility.doZipCheckSum(file);
        long lastModified = file.lastModified();
        String str4 = str3 + ".timestamp";
        String str5 = str3 + ".crc";
        String str6 = str3 + ".dex.number";
        if (this.mPreferences.getLong(str4, -1) == lastModified && this.mPreferences.getLong(str5, -1) == doZipCheckSum) {
            result2 = result;
            z = false;
        } else {
            result2 = result;
            z = true;
        }
        result2.modified = z;
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            Utility.clearDirFiles(file3);
            Utility.clearDirFiles(file4);
            Utility.clearDirFiles(file5);
            ZipFile zipFile2 = new ZipFile(file);
            int i2 = 2;
            while (true) {
                ZipEntry entry = zipFile2.getEntry("classes" + i2 + ".dex");
                if (entry != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(i2);
                    String str7 = str6;
                    sb.append(".dex");
                    File file7 = new File(file3, sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(i2);
                    long j = doZipCheckSum;
                    sb2.append(".odex");
                    File file8 = new File(file4, sb2.toString());
                    if (BoostNative.isSupportFastLoad()) {
                        if (Utility.isBetterUseApkBuf()) {
                            arrayList2.add(new DexHolder.ApkBuffer(i2, obtainEntryBytesInApk(zipFile2, entry), file7, file8));
                        } else {
                            File obtainEntryFileInApk = obtainEntryFileInApk(zipFile2, entry, file7);
                            putSecondaryDexInfo(str3, i2, obtainEntryFileInApk, 1);
                            dexOpt = new DexHolder.DexBuffer(i2, obtainEntryFileInApk, file8);
                            arrayList2.add(dexOpt);
                        }
                    } else if (Environment.getDataDirectory().getFreeSpace() > 150000000) {
                        File obtainEntryFileInApk2 = obtainEntryFileInApk(zipFile2, entry, file7);
                        putSecondaryDexInfo(str3, i2, obtainEntryFileInApk2, 2);
                        dexOpt = new DexHolder.DexOpt(i2, obtainEntryFileInApk2, file8, true);
                        arrayList2.add(dexOpt);
                    } else {
                        i = i2;
                        zipFile = zipFile2;
                        ZipEntry zipEntry = entry;
                        File file9 = new File(file6, str3 + i2 + ".zip");
                        ArrayList arrayList3 = arrayList2;
                        File file10 = new File(file6, str3 + i2 + ".odex");
                        arrayList = arrayList3;
                        str2 = str7;
                        arrayList.add(obtainValidZipDex(str, i, file9, file10, zipFile, zipEntry));
                        i2 = i + 1;
                        str6 = str2;
                        arrayList2 = arrayList;
                        zipFile2 = zipFile;
                        doZipCheckSum = j;
                        str3 = str;
                        file6 = file5;
                    }
                    i = i2;
                    zipFile = zipFile2;
                    arrayList = arrayList2;
                    str2 = str7;
                    i2 = i + 1;
                    str6 = str2;
                    arrayList2 = arrayList;
                    zipFile2 = zipFile;
                    doZipCheckSum = j;
                    str3 = str;
                    file6 = file5;
                } else {
                    ArrayList arrayList4 = arrayList2;
                    zipFile2.close();
                    SharedPreferences.Editor edit = this.mPreferences.edit();
                    edit.putInt(str6, i2 - 1);
                    edit.putLong(str4, lastModified);
                    edit.putLong(str5, doZipCheckSum);
                    edit.commit();
                    return arrayList4;
                }
            }
        } else {
            File file11 = file;
            File file12 = file4;
            ArrayList arrayList5 = arrayList2;
            int i3 = this.mPreferences.getInt(str6, 0);
            int i4 = 2;
            while (i4 <= i3) {
                arrayList5.add(obtainDexObject(i4, file, file3, file4, file5, str));
                i4++;
                File file13 = file;
            }
            return arrayList5;
        }
    }

    private byte[] obtainEntryBytesInApk(ZipFile zipFile, ZipEntry zipEntry) {
        if (this.mOpenNonAssetMethod != null) {
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = (InputStream) this.mOpenNonAssetMethod.invoke(this.mAssetManager, new Object[]{zipEntry.getName()});
                try {
                    byte[] obtainBytesFromInputStream = Utility.obtainBytesFromInputStream(inputStream2);
                    Utility.closeQuietly(inputStream2);
                    return obtainBytesFromInputStream;
                } catch (Exception e2) {
                    InputStream inputStream3 = inputStream2;
                    e = e2;
                    inputStream = inputStream3;
                    try {
                        Monitor.get().logWarning("Fail to invoke openNonAssert", e);
                        Utility.closeQuietly(inputStream);
                        Monitor.get().logWarning("Fall to direct unzip");
                        return Utility.obtainEntryBytesInZip(zipFile, zipEntry);
                    } catch (Throwable th) {
                        th = th;
                        Utility.closeQuietly(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    Utility.closeQuietly(inputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                Monitor.get().logWarning("Fail to invoke openNonAssert", e);
                Utility.closeQuietly(inputStream);
                Monitor.get().logWarning("Fall to direct unzip");
                return Utility.obtainEntryBytesInZip(zipFile, zipEntry);
            }
        }
        Monitor.get().logWarning("Fall to direct unzip");
        return Utility.obtainEntryBytesInZip(zipFile, zipEntry);
    }

    private File obtainEntryFileInApk(ZipFile zipFile, ZipEntry zipEntry, File file) {
        if (this.mOpenNonAssetMethod != null) {
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = (InputStream) this.mOpenNonAssetMethod.invoke(this.mAssetManager, new Object[]{zipEntry.getName()});
                try {
                    File obtainEntryFileFromInputStream = Utility.obtainEntryFileFromInputStream(inputStream2, file);
                    Utility.closeQuietly(inputStream2);
                    return obtainEntryFileFromInputStream;
                } catch (Exception e2) {
                    InputStream inputStream3 = inputStream2;
                    e = e2;
                    inputStream = inputStream3;
                    try {
                        Monitor.get().logWarning("Fail to invoke openNonAssert", e);
                        Utility.closeQuietly(inputStream);
                        return Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
                    } catch (Throwable th) {
                        th = th;
                        Utility.closeQuietly(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    Utility.closeQuietly(inputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                Monitor.get().logWarning("Fail to invoke openNonAssert", e);
                Utility.closeQuietly(inputStream);
                return Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
            }
        }
        return Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
    }

    private DexHolder.ZipOpt obtainValidZipDex(String str, int i, File file, File file2, ZipFile zipFile, ZipEntry zipEntry) {
        Utility.obtainZipForEntryFileInZip(zipFile, zipEntry, file);
        putSecondaryDexInfo(str, i, file, 3);
        return new DexHolder.ZipOpt(i, file, file2);
    }

    /* access modifiers changed from: package-private */
    public void doInstallation(Context context, File file, Result result) {
        File filesDir = context.getFilesDir();
        if (!filesDir.exists()) {
            Utility.mkdirChecked(filesDir);
        }
        Utility.clearDirFiles(new File(filesDir.getParent(), "code_cache/secondary-dexes"));
        File ensureDirCreated = Utility.ensureDirCreated(filesDir, "boost_multidex");
        File ensureDirCreated2 = Utility.ensureDirCreated(ensureDirCreated, "dex_cache");
        File ensureDirCreated3 = Utility.ensureDirCreated(ensureDirCreated, "odex_cache");
        File ensureDirCreated4 = Utility.ensureDirCreated(ensureDirCreated, "zip_cache");
        result.setDirs("boost.", filesDir, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4);
        this.mLockFile = new File(ensureDirCreated, "boost_multidex.lock");
        Locker locker = new Locker(this.mLockFile);
        locker.lock();
        try {
            this.mPreferences = c.a(context, "boost_multidex.version", 0);
            result.freeSpaceBefore = Environment.getDataDirectory().getFreeSpace();
            List<DexHolder> obtainDexObjectList = obtainDexObjectList("boost.", file, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4, result);
            installSecondaryDexes("boost.", context.getClassLoader(), obtainDexObjectList);
            locker.close();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            result.freeSpaceAfter = freeSpace;
            if (freeSpace < 50000000) {
                Monitor monitor = Monitor.get();
                monitor.logWarning("Free space is too small: " + freeSpace + ", compare to 50000000");
            } else if (Utility.isMainProcess(context)) {
                doAfterInstall("boost.", obtainDexObjectList);
            } else {
                Monitor.get().logInfo("Finish do install");
            }
        } catch (Throwable th) {
            locker.close();
            throw th;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public void putSecondaryDexInfo(String str, int i, File file, int i2) {
        SharedPreferences.Editor edit = this.mPreferences.edit();
        boolean endsWith = file.getPath().endsWith(".odex");
        String str2 = endsWith ? "odex.checksum." : "dex.checksum.";
        long doZipCheckSum = i2 == 3 ? Utility.doZipCheckSum(file) : i2 == 2 ? file.length() : Utility.doFileCheckSum(file);
        edit.putLong(str + str2 + i, doZipCheckSum);
        String str3 = endsWith ? "odex.time." : "dex.time.";
        long lastModified = file.lastModified();
        edit.putLong(str + str3 + i, lastModified);
        edit.putInt(str + "dex.obj.type" + i, i2);
        Monitor monitor = Monitor.get();
        monitor.logInfo("Put key " + str + str2 + i + " checksum=" + doZipCheckSum + ", time=" + lastModified);
        edit.commit();
    }
}
