package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

public class UMFrUtils {
    private static String mDefaultEnvelopeDir = "envelope";
    private static String mDefaultEnvelopeDirPath = null;
    private static Object mEnvelopeBuildTimeLock = new Object();
    private static Object mEnvelopeFileLock = new Object();

    public static long getLastInstantBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong("last_instant_build_time", 0);
        }
        return j;
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong("last_successful_build_time", 0);
        }
        return j;
    }

    public static boolean removeEnvelopeFile(File file) {
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        boolean delete = file.delete();
                        return delete;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    private static void updateLastInstantBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong("last_instant_build_time", System.currentTimeMillis()).commit();
        }
    }

    private static void updateLastSuccessfulBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong("last_successful_build_time", System.currentTimeMillis()).commit();
        }
    }

    public static int envelopeFileNumber(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            File file = new File(getEnvelopeDirPath(context));
            synchronized (mEnvelopeFileLock) {
                if (file.isDirectory()) {
                    String[] list = file.list();
                    if (list != null) {
                        int length = list.length;
                        return length;
                    }
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        return 0;
    }

    public static String getCreateTimeFromFileName(String str) {
        Context appContext = UMModuleRegister.getAppContext();
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(95) + 1;
        try {
            return str.substring(indexOf, str.indexOf(95, indexOf));
        } catch (IndexOutOfBoundsException e2) {
            UMCrashManager.reportCrash(appContext, e2);
            return "";
        }
    }

    public static String getCurrentProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager == null) {
                return "";
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return "";
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File getEnvelopeFile(final android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = getEnvelopeDirPath(r4)
            r1.<init>(r2)
            java.lang.Object r2 = mEnvelopeFileLock
            monitor-enter(r2)
            java.io.File[] r1 = r1.listFiles()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027
            int r3 = r1.length     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x001a
            goto L_0x0027
        L_0x001a:
            com.umeng.commonsdk.framework.UMFrUtils$2 r0 = new com.umeng.commonsdk.framework.UMFrUtils$2     // Catch:{ all -> 0x0029 }
            r0.<init>(r4)     // Catch:{ all -> 0x0029 }
            java.util.Arrays.sort(r1, r0)     // Catch:{ all -> 0x0029 }
            r4 = 0
            r4 = r1[r4]     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return r4
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.getEnvelopeFile(android.content.Context):java.io.File");
    }

    public static String getSubProcessName(Context context) {
        String str = "";
        try {
            String currentProcessName = getCurrentProcessName(context);
            int indexOf = currentProcessName.indexOf(":");
            if (indexOf >= 0) {
                str = currentProcessName.substring(indexOf + 1);
            }
            if (indexOf < 0) {
                return currentProcessName.substring(context.getPackageName().length() + 1, currentProcessName.length());
            }
            return str;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return str;
        }
    }

    public static boolean isOnline(Context context) {
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnectedOrConnecting();
                    }
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
        }
        return false;
    }

    public static String getEnvelopeDirPath(Context context) {
        String str;
        synchronized (mEnvelopeFileLock) {
            try {
                if (mDefaultEnvelopeDirPath == null) {
                    mDefaultEnvelopeDirPath = context.getFilesDir().getAbsolutePath() + "/." + mDefaultEnvelopeDir;
                }
                File file = new File(mDefaultEnvelopeDirPath);
                if (!file.exists() && !file.mkdir()) {
                    ULog.d("--->>> Create Envelope Directory failed!!!");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
            str = mDefaultEnvelopeDirPath;
        }
        return str;
    }

    public static String getLegacyEnvelopeDir(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                ULog.d("--->>> getEnvelopeDir: can't get process name, use default envelope directory.");
                return mDefaultEnvelopeDir;
            } else if (runningAppProcesses.size() == 0) {
                return mDefaultEnvelopeDir;
            } else {
                try {
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (next.pid == Process.myPid()) {
                            String replace = next.processName.replace(':', '_');
                            ULog.d("--->>> getEnvelopeDir: use current process name as envelope directory.");
                            return replace;
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
        return mDefaultEnvelopeDir;
    }

    public static byte[] toByteArray(String str) throws IOException {
        FileChannel fileChannel;
        IOException e2;
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            try {
                fileChannel = new RandomAccessFile(str, "r").getChannel();
                try {
                    MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size()).load();
                    System.out.println(load.isLoaded());
                    bArr = new byte[((int) fileChannel.size())];
                    if (load.remaining() > 0) {
                        load.get(bArr, 0, load.remaining());
                    }
                    try {
                        fileChannel.close();
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(appContext, th);
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        UMCrashManager.reportCrash(appContext, e2);
                        throw e2;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileChannel.close();
                        } catch (Throwable th3) {
                            UMCrashManager.reportCrash(appContext, th3);
                        }
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e2 = e4;
                fileChannel = null;
                UMCrashManager.reportCrash(appContext, e2);
                throw e2;
            } catch (Throwable th4) {
                th = th4;
                fileChannel = null;
                fileChannel.close();
                throw th;
            }
        }
        return bArr;
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
        if (context != null) {
            try {
                String legacyEnvelopeDir = getLegacyEnvelopeDir(context);
                if (!TextUtils.isEmpty(legacyEnvelopeDir) && !legacyEnvelopeDir.equals(mDefaultEnvelopeDir)) {
                    File file = new File(context.getFilesDir().getAbsolutePath() + "/." + legacyEnvelopeDir);
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles == null || listFiles.length == 0) {
                            try {
                                if (file.isDirectory()) {
                                    file.delete();
                                }
                            } catch (Throwable th) {
                                UMCrashManager.reportCrash(context, th);
                            }
                        } else {
                            String envelopeDirPath = getEnvelopeDirPath(context);
                            for (File renameTo : listFiles) {
                                renameTo.renameTo(new File(envelopeDirPath + "/" + listFiles[r3].getName()));
                            }
                            if (file.isDirectory()) {
                                file.delete();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context, th2);
            }
        }
    }

    private static long getDistanceDays(long j, long j2) {
        long j3;
        if (j < j2) {
            j3 = j2 - j;
        } else {
            j3 = j - j2;
        }
        return j3 / 86400000;
    }

    private static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", new Class[]{String.class}).invoke(context, new Object[]{str})).intValue() != 0) {
                    return false;
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(applicationContext, th);
                return false;
            }
        } else {
            try {
                if (applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName()) != 0) {
                    return false;
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(applicationContext, th2);
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean hasEnvelopeFile(android.content.Context r6, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r7) {
        /*
            java.lang.String r0 = "a"
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            if (r7 != r1) goto L_0x0008
            java.lang.String r0 = "i"
        L_0x0008:
            java.io.File r7 = new java.io.File
            java.lang.String r1 = getEnvelopeDirPath(r6)
            r7.<init>(r1)
            java.lang.Object r1 = mEnvelopeFileLock
            monitor-enter(r1)
            r2 = 0
            java.io.File[] r7 = r7.listFiles()     // Catch:{ Throwable -> 0x0039 }
            if (r7 == 0) goto L_0x0035
            int r3 = r7.length     // Catch:{ Throwable -> 0x0039 }
            if (r3 != 0) goto L_0x001f
            goto L_0x0035
        L_0x001f:
            int r3 = r7.length     // Catch:{ Throwable -> 0x0039 }
            r4 = 0
        L_0x0021:
            if (r4 >= r3) goto L_0x003d
            r5 = r7[r4]     // Catch:{ Throwable -> 0x0039 }
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x0039 }
            boolean r5 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x0039 }
            if (r5 == 0) goto L_0x0032
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            r6 = 1
            return r6
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0035:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            return r2
        L_0x0037:
            r6 = move-exception
            goto L_0x003f
        L_0x0039:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)     // Catch:{ all -> 0x0037 }
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            return r2
        L_0x003f:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void removeRedundantEnvelopeFiles(final android.content.Context r5, int r6) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getEnvelopeDirPath(r5)
            r0.<init>(r1)
            java.lang.Object r1 = mEnvelopeFileLock
            monitor-enter(r1)
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004d
            int r2 = r0.length     // Catch:{ all -> 0x004f }
            if (r2 > r6) goto L_0x0016
            goto L_0x004d
        L_0x0016:
            com.umeng.commonsdk.framework.UMFrUtils$1 r2 = new com.umeng.commonsdk.framework.UMFrUtils$1     // Catch:{ all -> 0x004f }
            r2.<init>(r5)     // Catch:{ all -> 0x004f }
            java.util.Arrays.sort(r0, r2)     // Catch:{ all -> 0x004f }
            int r2 = r0.length     // Catch:{ all -> 0x004f }
            if (r2 <= r6) goto L_0x004b
            r2 = 0
        L_0x0022:
            int r3 = r0.length     // Catch:{ Throwable -> 0x0047 }
            int r3 = r3 - r6
            if (r2 >= r3) goto L_0x004b
            r3 = r0[r2]     // Catch:{ Throwable -> 0x0047 }
            boolean r3 = r3.delete()     // Catch:{ Throwable -> 0x0047 }
            if (r3 != 0) goto L_0x0044
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0047 }
            java.lang.String r4 = "--->>> remove ["
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0047 }
            r3.append(r2)     // Catch:{ Throwable -> 0x0047 }
            java.lang.String r4 = "] file fail."
            r3.append(r4)     // Catch:{ Throwable -> 0x0047 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0047 }
            com.umeng.commonsdk.statistics.common.ULog.d((java.lang.String) r3)     // Catch:{ Throwable -> 0x0047 }
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x0047:
            r6 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch:{ all -> 0x004f }
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            return
        L_0x004d:
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.removeRedundantEnvelopeFiles(android.content.Context, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[SYNTHETIC, Splitter:B:28:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[SYNTHETIC, Splitter:B:36:0x0068] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int saveEnvelopeFile(android.content.Context r5, java.lang.String r6, byte[] r7) {
        /*
            r0 = 101(0x65, float:1.42E-43)
            if (r7 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = getEnvelopeDirPath(r5)
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Object r2 = mEnvelopeFileLock
            monitor-enter(r2)
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0056 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0056 }
            r4.write(r7)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
            r4.close()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
            com.umeng.commonsdk.statistics.internal.a r7 = com.umeng.commonsdk.statistics.internal.a.a((android.content.Context) r5)     // Catch:{ all -> 0x006c }
            boolean r7 = r7.a((java.lang.String) r6)     // Catch:{ all -> 0x006c }
            com.umeng.commonsdk.statistics.internal.a r0 = com.umeng.commonsdk.statistics.internal.a.a((android.content.Context) r5)     // Catch:{ all -> 0x006c }
            boolean r6 = r0.b(r6)     // Catch:{ all -> 0x006c }
            if (r7 == 0) goto L_0x0046
            updateLastSuccessfulBuildTime(r5)     // Catch:{ all -> 0x006c }
        L_0x0046:
            if (r6 == 0) goto L_0x004b
            updateLastInstantBuildTime(r5)     // Catch:{ all -> 0x006c }
        L_0x004b:
            r5 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            return r5
        L_0x004e:
            r6 = move-exception
            r3 = r4
            goto L_0x0066
        L_0x0051:
            r6 = move-exception
            r3 = r4
            goto L_0x0057
        L_0x0054:
            r6 = move-exception
            goto L_0x0066
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0064
            r3.close()     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r6 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch:{ all -> 0x006c }
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            return r0
        L_0x0066:
            if (r3 == 0) goto L_0x0072
            r3.close()     // Catch:{ Throwable -> 0x006e }
            goto L_0x0072
        L_0x006c:
            r5 = move-exception
            goto L_0x0073
        L_0x006e:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r7)     // Catch:{ all -> 0x006c }
        L_0x0072:
            throw r6     // Catch:{ all -> 0x006c }
        L_0x0073:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.saveEnvelopeFile(android.content.Context, java.lang.String, byte[]):int");
    }
}
