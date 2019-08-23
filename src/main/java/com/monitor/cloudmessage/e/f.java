package com.monitor.cloudmessage.e;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class f {
    public static long[] a() {
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = (long) statFs.getBlockSize();
            jArr[0] = ((((long) statFs.getBlockCount()) * blockSize) / 1024) / 1024;
            jArr[1] = ((blockSize * ((long) statFs.getAvailableBlocks())) / 1024) / 1024;
        }
        return jArr;
    }

    public static String[] b() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String[] strArr = {"null", "null", "null", "null"};
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/version");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
            } catch (IOException unused) {
                c.a(bufferedReader2);
                c.a(fileReader);
                strArr[1] = Build.VERSION.RELEASE;
                strArr[2] = Build.MODEL;
                strArr[3] = Build.DISPLAY;
                return strArr;
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
                c.a(bufferedReader);
                c.a(fileReader);
                throw th;
            }
            try {
                strArr[0] = bufferedReader.readLine().split("\\s+")[2];
                c.a(bufferedReader);
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                c.a(bufferedReader2);
                c.a(fileReader);
                strArr[1] = Build.VERSION.RELEASE;
                strArr[2] = Build.MODEL;
                strArr[3] = Build.DISPLAY;
                return strArr;
            } catch (Throwable th2) {
                th = th2;
                c.a(bufferedReader);
                c.a(fileReader);
                throw th;
            }
        } catch (IOException unused3) {
            fileReader = null;
            c.a(bufferedReader2);
            c.a(fileReader);
            strArr[1] = Build.VERSION.RELEASE;
            strArr[2] = Build.MODEL;
            strArr[3] = Build.DISPLAY;
            return strArr;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            fileReader = null;
            c.a(bufferedReader);
            c.a(fileReader);
            throw th;
        }
        c.a(fileReader);
        strArr[1] = Build.VERSION.RELEASE;
        strArr[2] = Build.MODEL;
        strArr[3] = Build.DISPLAY;
        return strArr;
    }

    public static String[] c() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String[] strArr = {"", ""};
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
            } catch (IOException unused) {
                c.a(bufferedReader2);
                c.a(fileReader);
                return strArr;
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
                c.a(bufferedReader);
                c.a(fileReader);
                throw th;
            }
            try {
                String[] split = bufferedReader.readLine().split("\\s+");
                for (int i = 2; i < split.length; i++) {
                    strArr[0] = strArr[0] + split[i] + " ";
                }
                String[] split2 = bufferedReader.readLine().split("\\s+");
                strArr[1] = strArr[1] + split2[2];
                c.a(bufferedReader);
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                c.a(bufferedReader2);
                c.a(fileReader);
                return strArr;
            } catch (Throwable th2) {
                th = th2;
                c.a(bufferedReader);
                c.a(fileReader);
                throw th;
            }
        } catch (IOException unused3) {
            fileReader = null;
            c.a(bufferedReader2);
            c.a(fileReader);
            return strArr;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            fileReader = null;
            c.a(bufferedReader);
            c.a(fileReader);
            throw th;
        }
        c.a(fileReader);
        return strArr;
    }
}
