package com.bytedance.ies.geckoclient.d;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static OkHttpClient.Builder f20726a = new OkHttpClient.Builder();

    /* renamed from: b  reason: collision with root package name */
    public static OkHttpClient.Builder f20727b = new OkHttpClient.Builder();

    /* renamed from: c  reason: collision with root package name */
    private static OkHttpClient f20728c;

    /* renamed from: d  reason: collision with root package name */
    private static OkHttpClient f20729d;

    public d() {
        f20728c = f20726a.build();
        f20729d = f20727b.build();
    }

    private static void a(BufferedSink bufferedSink) {
        if (bufferedSink != null) {
            try {
                bufferedSink.flush();
                bufferedSink.close();
            } catch (IOException unused) {
            }
        }
    }

    public final String a(String str, String str2) throws Exception {
        Response execute = f20728c.newCall(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2)).build()).execute();
        if (execute.code() == 200) {
            return execute.body().string();
        }
        throw new NetworkErrorException("status code = " + execute.code());
    }

    public final String a(String str, List<Pair<String, String>> list) throws Exception {
        FormBody.Builder builder = new FormBody.Builder();
        if (list.size() > 0) {
            for (Pair next : list) {
                builder.add((String) next.first, (String) next.second);
            }
        }
        Response execute = f20728c.newCall(new Request.Builder().url(str).post(builder.build()).build()).execute();
        if (execute.code() == 200) {
            return execute.body().string();
        }
        throw new NetworkErrorException("status code = " + execute.code());
    }

    public final boolean b(String str, String str2) throws Exception {
        Request.Builder builder = new Request.Builder();
        builder.get().url(str);
        Response execute = f20729d.newCall(builder.build()).execute();
        ResponseBody body = execute.body();
        BufferedSource source = body.source();
        long contentLength = body.contentLength();
        new StringBuilder("contentLength:").append(contentLength);
        try {
            BufferedSink buffer = Okio.buffer(Okio.sink(new File(str2)));
            long j = 0;
            long j2 = -1;
            long j3 = -1;
            while (true) {
                try {
                    long read = source.read(buffer.buffer(), 2048);
                    if (read != j2) {
                        j += read;
                        long j4 = (long) ((int) ((1000 * j) / contentLength));
                        if (j4 - j3 >= 1) {
                            StringBuilder sb = new StringBuilder("download progress:");
                            sb.append(j4 / 10);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(j4 % 10);
                            j3 = j4;
                        }
                        j2 = -1;
                    } else {
                        try {
                            break;
                        } catch (Exception e2) {
                            Exception exc = e2;
                            a(buffer);
                            throw exc;
                        }
                    }
                } catch (IOException e3) {
                    a(buffer);
                    throw e3;
                }
            }
            buffer.writeAll(source);
            a(buffer);
            if (execute.code() == 200) {
                return true;
            }
            throw new NetworkErrorException("status code = " + execute.code());
        } catch (FileNotFoundException e4) {
            a(null);
            throw e4;
        }
    }
}
