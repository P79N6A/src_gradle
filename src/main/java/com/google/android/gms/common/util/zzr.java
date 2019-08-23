package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class zzr {
    private static String zzaJW;
    private static final int zzaJX = Process.myPid();

    private static String zzaD(int i) {
        String str;
        BufferedReader bufferedReader;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        BufferedReader bufferedReader2 = null;
        if (i <= 0) {
            return null;
        }
        try {
            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = new BufferedReader(new FileReader(sb.toString()));
            try {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                str = bufferedReader.readLine().trim();
                zzn.closeQuietly(bufferedReader);
            } catch (IOException unused) {
                zzn.closeQuietly(bufferedReader);
                str = null;
                return str;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                zzn.closeQuietly(bufferedReader2);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            zzn.closeQuietly(bufferedReader);
            str = null;
            return str;
        } catch (Throwable th2) {
            th = th2;
            zzn.closeQuietly(bufferedReader2);
            throw th;
        }
        return str;
    }

    public static String zzsf() {
        if (zzaJW == null) {
            zzaJW = zzaD(zzaJX);
        }
        return zzaJW;
    }
}
