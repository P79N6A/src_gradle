package com.ss.android.ugc.effectmanager.common.b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f77308a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f77309b = Charset.forName("UTF-8");

    static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    static boolean b(File file) {
        try {
            a(file);
            return file.delete();
        } catch (IOException unused) {
            return false;
        }
    }

    static long c(File file) {
        long j;
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        long j2 = 0;
        for (int i = 0; i < length; i++) {
            if (listFiles[i].isFile()) {
                j = listFiles[i].length();
            } else {
                j = c(listFiles[i]);
            }
            j2 += j;
        }
        return j2;
    }

    static void a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
