package com.airbnb.lottie.d;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f4807a;

    /* renamed from: b  reason: collision with root package name */
    final String f4808b;

    /* access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    public final Pair<a, InputStream> a() {
        a aVar;
        try {
            String str = this.f4808b;
            File file = new File(this.f4807a.getCacheDir(), a(str, a.Json, false));
            if (!file.exists()) {
                file = new File(this.f4807a.getCacheDir(), a(str, a.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.getAbsolutePath().endsWith(".zip")) {
                    aVar = a.Zip;
                } else {
                    aVar = a.Json;
                }
                StringBuilder sb = new StringBuilder("Cache hit for ");
                sb.append(this.f4808b);
                sb.append(" at ");
                sb.append(file.getAbsolutePath());
                return new Pair<>(aVar, fileInputStream);
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    b(Context context, String str) {
        this.f4807a = context.getApplicationContext();
        this.f4808b = str;
    }

    /* access modifiers changed from: package-private */
    public final File a(InputStream inputStream, a aVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(this.f4807a.getCacheDir(), a(this.f4808b, aVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    static String a(String str, a aVar, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = aVar.extension;
        } else {
            str2 = aVar.tempExtension();
        }
        sb.append(str2);
        return sb.toString();
    }
}
