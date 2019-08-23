package com.bytedance.boost_multidex;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class Utility {
    static void clearDirFiles(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            Monitor.get().logWarning("Failed to list secondary dex dir content (" + file.getPath() + ").");
            return;
        }
        for (File length : listFiles) {
            Monitor monitor = Monitor.get();
            monitor.logInfo("Trying to delete old file " + length.getPath() + " of size " + length.length());
            if (!listFiles[r1].delete()) {
                Monitor.get().logWarning("Failed to delete old file " + length.getPath());
            } else {
                Monitor.get().logInfo("Deleted old file " + length.getPath());
            }
        }
    }

    static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Monitor.get().logWarning("Failed to close resource", e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long doFileCheckSum(java.io.File r6) {
        /*
            boolean r0 = r6.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0022
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "File is not exist: "
            r3.<init>(r4)
            java.lang.String r6 = r6.getPath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r0.logInfo(r6)
            return r1
        L_0x0022:
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            boolean r0 = r0.isEnableNativeCheckSum()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r6.getPath()     // Catch:{ Throwable -> 0x0035 }
            long r3 = com.bytedance.boost_multidex.BoostNative.obtainCheckSum(r0)     // Catch:{ Throwable -> 0x0035 }
            goto L_0x0050
        L_0x0035:
            r0 = move-exception
            com.bytedance.boost_multidex.Monitor r3 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to native obtainCheckSum in "
            r4.<init>(r5)
            java.lang.String r5 = r6.getPath()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.logWarning(r4, r0)
        L_0x004f:
            r3 = r1
        L_0x0050:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008b
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r1 = "Fall back to java impl"
            r0.logWarning(r1)
            r0 = 0
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]
            java.util.zip.CheckedInputStream r2 = new java.util.zip.CheckedInputStream     // Catch:{ all -> 0x0086 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0086 }
            r3.<init>(r6)     // Catch:{ all -> 0x0086 }
            java.util.zip.Adler32 r6 = new java.util.zip.Adler32     // Catch:{ all -> 0x0086 }
            r6.<init>()     // Catch:{ all -> 0x0086 }
            r2.<init>(r3, r6)     // Catch:{ all -> 0x0086 }
        L_0x0071:
            int r6 = r2.read(r1)     // Catch:{ all -> 0x0083 }
            if (r6 >= 0) goto L_0x0071
            java.util.zip.Checksum r6 = r2.getChecksum()     // Catch:{ all -> 0x0083 }
            long r3 = r6.getValue()     // Catch:{ all -> 0x0083 }
            closeQuietly(r2)
            goto L_0x008b
        L_0x0083:
            r6 = move-exception
            r0 = r2
            goto L_0x0087
        L_0x0086:
            r6 = move-exception
        L_0x0087:
            closeQuietly(r0)
            throw r6
        L_0x008b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.Utility.doFileCheckSum(java.io.File):long");
    }

    static long doZipCheckSum(File file) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile.length() - 22;
                if (length >= 0) {
                    long j = length - 65536;
                    if (j < 0) {
                        j = 0;
                    }
                    int reverseBytes = Integer.reverseBytes(101010256);
                    while (true) {
                        randomAccessFile.seek(length);
                        if (randomAccessFile.readInt() != reverseBytes) {
                            length--;
                            if (length < j) {
                                throw new ZipException("End Of Central Directory signature not found");
                            }
                        } else {
                            randomAccessFile.skipBytes(2);
                            randomAccessFile.skipBytes(2);
                            randomAccessFile.skipBytes(2);
                            randomAccessFile.skipBytes(2);
                            long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                            CRC32 crc32 = new CRC32();
                            randomAccessFile.seek(4294967295L & ((long) Integer.reverseBytes(randomAccessFile.readInt())));
                            byte[] bArr = new byte[8192];
                            int read = randomAccessFile.read(bArr, 0, (int) Math.min(8192, reverseBytes2));
                            while (read != -1) {
                                crc32.update(bArr, 0, read);
                                reverseBytes2 -= (long) read;
                                if (reverseBytes2 == 0) {
                                    break;
                                }
                                read = randomAccessFile.read(bArr, 0, (int) Math.min(8192, reverseBytes2));
                            }
                            long value = crc32.getValue();
                            closeQuietly(randomAccessFile);
                            return value;
                        }
                    }
                } else {
                    throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
                }
            } catch (Throwable th) {
                th = th;
                closeQuietly(randomAccessFile);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            closeQuietly(randomAccessFile);
            throw th;
        }
    }

    static File ensureDirCreated(File file, String str) {
        File file2 = new File(file, str);
        mkdirChecked(file2);
        return file2;
    }

    static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj.getClass(), str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    static Constructor findConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    static Field findField(Class<?> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }

    static Field findFieldRecursively(Class<?> cls, String str) {
        Class cls2 = cls;
        while (cls2 != null) {
            try {
                return findField(cls2, str);
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }

    static Method findMethodRecursively(Class<?> cls, String str, Class<?>... clsArr) {
        Class cls2 = cls;
        while (cls2 != null) {
            try {
                return findMethod(cls2, str, clsArr);
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    private static String getCurProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    static boolean isBetterUseApkBuf() {
        Runtime runtime = Runtime.getRuntime();
        long freeSpace = Environment.getDataDirectory().getFreeSpace();
        long maxMemory = runtime.maxMemory() - runtime.totalMemory();
        Monitor monitor = Monitor.get();
        monitor.logInfo("Memory remains " + maxMemory + ", free space " + freeSpace);
        return maxMemory > 128000000 || freeSpace < 50000000;
    }

    static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        return (curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName());
    }

    static void mkdirChecked(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Monitor monitor = Monitor.get();
                monitor.logError("Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Monitor monitor2 = Monitor.get();
                monitor2.logError("Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    static byte[] obtainBytesFromInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            closeQuietly(byteArrayOutputStream);
        }
    }

    static byte[] obtainBytesInFile(File file) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file.getPath(), "r");
            try {
                byte[] bArr = new byte[((int) randomAccessFile.length())];
                randomAccessFile.readFully(bArr);
                closeQuietly(randomAccessFile);
                return bArr;
            } catch (IOException e2) {
                e = e2;
                try {
                    Monitor.get().logWarning("Fail to get bytes of file", e);
                    closeQuietly(randomAccessFile);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    closeQuietly(randomAccessFile);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
            Monitor.get().logWarning("Fail to get bytes of file", e);
            closeQuietly(randomAccessFile);
            return null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            closeQuietly(randomAccessFile);
            throw th;
        }
    }

    static byte[] obtainEntryBytesInZip(ZipFile zipFile, ZipEntry zipEntry) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        int i = 3;
        e = null;
        while (i > 0) {
            try {
                InputStream inputStream3 = zipFile.getInputStream(zipEntry);
                try {
                    byte[] obtainBytesFromInputStream = obtainBytesFromInputStream(inputStream3);
                    closeQuietly(inputStream3);
                    return obtainBytesFromInputStream;
                } catch (IOException e2) {
                    IOException iOException = e2;
                    inputStream = inputStream3;
                    e = iOException;
                    closeQuietly(inputStream);
                    i--;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream3;
                    closeQuietly(inputStream2);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                inputStream = null;
                closeQuietly(inputStream);
                i--;
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(inputStream2);
                throw th;
            }
        }
        throw e;
    }

    static File obtainEntryFileFromInputStream(InputStream inputStream, File file) {
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        Monitor monitor = Monitor.get();
        monitor.logInfo("Extracting " + createTempFile.getPath());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            if (createTempFile.setReadOnly()) {
                Monitor monitor2 = Monitor.get();
                monitor2.logInfo("Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } finally {
            closeQuietly(fileOutputStream);
            createTempFile.delete();
        }
    }

    /* JADX INFO: finally extract failed */
    static File obtainEntryFileInZip(ZipFile zipFile, ZipEntry zipEntry, File file) {
        IOException iOException = null;
        int i = 3;
        while (i > 0) {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                File obtainEntryFileFromInputStream = obtainEntryFileFromInputStream(inputStream, file);
                closeQuietly(inputStream);
                return obtainEntryFileFromInputStream;
            } catch (IOException e2) {
                closeQuietly(inputStream);
                i--;
                iOException = e2;
            } catch (Throwable th) {
                closeQuietly(inputStream);
                throw th;
            }
        }
        throw iOException;
    }

    static void obtainZipForEntryFileInZip(ZipFile zipFile, ZipEntry zipEntry, File file) {
        ZipOutputStream zipOutputStream;
        IOException iOException = null;
        int i = 3;
        while (i > 0) {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            File createTempFile = File.createTempFile("tmp-", ".zip", file.getParentFile());
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Monitor.get().logInfo("Renaming to " + file.getPath());
                    if (createTempFile.renameTo(file)) {
                        closeQuietly(inputStream);
                        createTempFile.delete();
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (IOException e2) {
                closeQuietly(inputStream);
                createTempFile.delete();
                i--;
                iOException = e2;
            } catch (Throwable th) {
                closeQuietly(inputStream);
                createTempFile.delete();
                throw th;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    static boolean storeBytesToFile(byte[] bArr, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                closeQuietly(fileOutputStream2);
                return true;
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Monitor.get().logError("fail to store bytes to file", e);
                    closeQuietly(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Monitor.get().logError("fail to store bytes to file", e);
            closeQuietly(fileOutputStream);
            return false;
        }
    }
}
