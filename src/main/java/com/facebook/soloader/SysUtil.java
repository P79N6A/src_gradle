package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class SysUtil {

    static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @DoNotOptimize
        public static String[] getSupportedAbis() {
            return Build.SUPPORTED_ABIS;
        }

        @DoNotOptimize
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e2) {
                if (e2.errno != OsConstants.EOPNOTSUPP && e2.errno != OsConstants.ENOSYS && e2.errno != OsConstants.EINVAL) {
                    throw new IOException(e2.toString(), e2);
                }
            }
        }
    }

    public static String[] getSupportedAbis() {
        if (Build.VERSION.SDK_INT >= 21) {
            return LollipopSysdeps.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    public static void deleteOrThrow(File file) throws IOException {
        if (!file.delete()) {
            throw new IOException("could not delete file " + file);
        }
    }

    public static int getAppVersionCode(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static void dumbDeleteRecursive(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File dumbDeleteRecursive : listFiles) {
                    dumbDeleteRecursive(dumbDeleteRecursive);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("could not delete: " + file);
        }
    }

    static void mkdirOrThrow(File file) throws IOException {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r3 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        com.google.a.a.a.a.a.a.a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void fsyncRecursive(java.io.File r3) throws java.io.IOException {
        /*
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x002d
            java.io.File[] r0 = r3.listFiles()
            if (r0 == 0) goto L_0x0019
            r3 = 0
        L_0x000d:
            int r1 = r0.length
            if (r3 >= r1) goto L_0x0018
            r1 = r0[r3]
            fsyncRecursive(r1)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0018:
            return
        L_0x0019:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot list directory "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x002d:
            java.lang.String r0 = r3.getPath()
            java.lang.String r1 = "_lock"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x005f
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r3 = 0
            java.io.FileDescriptor r1 = r0.getFD()     // Catch:{ Throwable -> 0x004e }
            r1.sync()     // Catch:{ Throwable -> 0x004e }
            r0.close()
            return
        L_0x004c:
            r1 = move-exception
            goto L_0x0050
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0050:
            if (r3 == 0) goto L_0x005b
            r0.close()     // Catch:{ Throwable -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r0 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.lang.Throwable) r0)
            goto L_0x005e
        L_0x005b:
            r0.close()
        L_0x005e:
            throw r1
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.fsyncRecursive(java.io.File):void");
    }

    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
        }
    }

    public static int findAbiScore(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static byte[] makeApkDepBlock(File file, Context context) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 1);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(getAppVersionCode(context));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    static int copyBytes(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }
}
