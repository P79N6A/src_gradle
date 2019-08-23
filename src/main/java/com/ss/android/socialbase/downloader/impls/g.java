package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class g implements IDownloadHttpService {
    public final IDownloadHttpConnection downloadWithConnection(int i, String str, List<HttpHeader> list) throws IOException {
        final GZIPInputStream gZIPInputStream;
        OkHttpClient h = b.h();
        if (h != null) {
            Request.Builder url = new Request.Builder().url(str);
            if (list != null && list.size() > 0) {
                for (HttpHeader next : list) {
                    url.addHeader(next.getName(), d.c(next.getValue()));
                }
            }
            final Call newCall = h.newCall(url.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                final ResponseBody body = execute.body();
                if (body == null) {
                    return null;
                }
                InputStream byteStream = body.byteStream();
                String header = execute.header("Content-Encoding");
                if (header == null || !"gzip".equalsIgnoreCase(header) || (byteStream instanceof GZIPInputStream)) {
                    gZIPInputStream = byteStream;
                } else {
                    gZIPInputStream = new GZIPInputStream(byteStream);
                }
                AnonymousClass1 r0 = new IDownloadHttpConnection() {
                    public final InputStream getInputStream() throws IOException {
                        return gZIPInputStream;
                    }

                    public final int a() throws IOException {
                        return execute.code();
                    }

                    public final void b() {
                        if (newCall != null && !newCall.isCanceled()) {
                            newCall.cancel();
                        }
                    }

                    public final void end() {
                        try {
                            if (body != null) {
                                body.close();
                            }
                            if (newCall != null && !newCall.isCanceled()) {
                                newCall.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    public final String a(String str) {
                        return execute.header(str);
                    }
                };
                return r0;
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
