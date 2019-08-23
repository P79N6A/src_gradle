package com.airbnb.lottie.d;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.Pair;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4809a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4810b;

    /* renamed from: c  reason: collision with root package name */
    private final b f4811c;

    @Nullable
    @WorkerThread
    private LottieComposition b() {
        j jVar;
        Pair a2 = this.f4811c.a();
        if (a2 == null) {
            return null;
        }
        a aVar = (a) a2.first;
        InputStream inputStream = (InputStream) a2.second;
        if (aVar == a.Zip) {
            jVar = f.a(new ZipInputStream(inputStream), this.f4810b);
        } else {
            jVar = f.a(inputStream, this.f4810b);
        }
        if (jVar.f4882a != null) {
            return (LottieComposition) jVar.f4882a;
        }
        return null;
    }

    @WorkerThread
    public final j<LottieComposition> a() {
        LottieComposition b2 = b();
        if (b2 != null) {
            return new j<>(b2);
        }
        StringBuilder sb = new StringBuilder("Animation for ");
        sb.append(this.f4810b);
        sb.append(" not found in cache. Fetching from network.");
        return c();
    }

    @WorkerThread
    private j<LottieComposition> c() {
        a aVar;
        j<LottieComposition> jVar;
        try {
            new StringBuilder("Fetching ").append(this.f4810b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f4810b).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    String contentType = httpURLConnection.getContentType();
                    char c2 = 65535;
                    int hashCode = contentType.hashCode();
                    boolean z = false;
                    if (hashCode != -1248325150) {
                        if (hashCode == -43840953) {
                            if (contentType.equals("application/json")) {
                                c2 = 1;
                            }
                        }
                    } else if (contentType.equals("application/zip")) {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        aVar = a.Json;
                        jVar = f.a((InputStream) new FileInputStream(new File(this.f4811c.a(httpURLConnection.getInputStream(), aVar).getAbsolutePath())), this.f4810b);
                    } else {
                        aVar = a.Zip;
                        jVar = f.a(new ZipInputStream(new FileInputStream(this.f4811c.a(httpURLConnection.getInputStream(), aVar))), this.f4810b);
                    }
                    if (jVar.f4882a != null) {
                        b bVar = this.f4811c;
                        File file = new File(bVar.f4807a.getCacheDir(), b.a(bVar.f4808b, aVar, true));
                        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                        boolean renameTo = file.renameTo(file2);
                        StringBuilder sb = new StringBuilder("Copying temp file to real file (");
                        sb.append(file2);
                        sb.append(")");
                        if (!renameTo) {
                            d.a("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ClassUtils.PACKAGE_SEPARATOR);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Completed fetch from network. Success: ");
                    if (jVar.f4882a != null) {
                        z = true;
                    }
                    sb2.append(z);
                    return jVar;
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb3.append(readLine);
                    sb3.append(10);
                } else {
                    return new j<>((Throwable) new IllegalArgumentException("Unable to fetch " + this.f4810b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + sb3));
                }
            }
        } catch (IOException e2) {
            return new j<>((Throwable) e2);
        }
    }

    public c(Context context, String str) {
        this.f4809a = context.getApplicationContext();
        this.f4810b = str;
        this.f4811c = new b(this.f4809a, str);
    }
}
