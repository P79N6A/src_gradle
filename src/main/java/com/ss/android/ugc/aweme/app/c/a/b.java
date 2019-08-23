package com.ss.android.ugc.aweme.app.c.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.e;
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

public final class b implements IDownloadHttpService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33981a;

    public final IDownloadHttpConnection downloadWithConnection(int i, String str, List<HttpHeader> list) throws IOException {
        final GZIPInputStream gZIPInputStream;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, list}, this, f33981a, false, 23363, new Class[]{Integer.TYPE, String.class, List.class}, IDownloadHttpConnection.class)) {
            return (IDownloadHttpConnection) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, list}, this, f33981a, false, 23363, new Class[]{Integer.TYPE, String.class, List.class}, IDownloadHttpConnection.class);
        } else if (!e.a(str)) {
            return null;
        } else {
            OkHttpClient h = com.ss.android.socialbase.downloader.downloader.b.h();
            if (h != null) {
                Request.Builder url = new Request.Builder().url(str2);
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
                    AnonymousClass1 r4 = new IDownloadHttpConnection() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33982a;

                        public final InputStream getInputStream() throws IOException {
                            return gZIPInputStream;
                        }

                        public final int a() throws IOException {
                            if (!PatchProxy.isSupport(new Object[0], this, f33982a, false, 23365, new Class[0], Integer.TYPE)) {
                                return execute.code();
                            }
                            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33982a, false, 23365, new Class[0], Integer.TYPE)).intValue();
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f33982a, false, 23366, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f33982a, false, 23366, new Class[0], Void.TYPE);
                                return;
                            }
                            if (newCall != null && !newCall.isCanceled()) {
                                newCall.cancel();
                            }
                        }

                        public final void end() {
                            if (PatchProxy.isSupport(new Object[0], this, f33982a, false, 23367, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f33982a, false, 23367, new Class[0], Void.TYPE);
                                return;
                            }
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
                            String str2 = str;
                            if (!PatchProxy.isSupport(new Object[]{str2}, this, f33982a, false, 23364, new Class[]{String.class}, String.class)) {
                                return execute.header(str2);
                            }
                            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f33982a, false, 23364, new Class[]{String.class}, String.class);
                        }
                    };
                    return r4;
                }
                throw new IOException("can't get response");
            }
            throw new IOException("can't get httpClient");
        }
    }
}
