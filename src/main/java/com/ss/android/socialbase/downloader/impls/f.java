package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.c;
import com.ss.android.socialbase.downloader.network.d;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class f implements d {
    public final c a(String str, List<HttpHeader> list) throws IOException {
        OkHttpClient h = b.h();
        if (h != null) {
            Request.Builder head = new Request.Builder().url(str).head();
            if (list != null && list.size() > 0) {
                for (HttpHeader next : list) {
                    head.addHeader(next.getName(), com.ss.android.socialbase.downloader.e.d.c(next.getValue()));
                }
            }
            final Call newCall = h.newCall(head.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                return new c() {
                    public final int a() throws IOException {
                        return execute.code();
                    }

                    public final void b() {
                        if (newCall != null && !newCall.isCanceled()) {
                            newCall.cancel();
                        }
                    }

                    public final String a(String str) {
                        return execute.header(str);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
