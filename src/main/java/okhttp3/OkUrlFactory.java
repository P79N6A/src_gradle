package okhttp3;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import okhttp3.internal.URLFilter;
import okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.internal.huc.OkHttpsURLConnection;

public final class OkUrlFactory implements Cloneable, URLStreamHandlerFactory {
    private OkHttpClient client;
    private URLFilter urlFilter;

    public final OkHttpClient client() {
        return this.client;
    }

    public final OkUrlFactory clone() {
        return new OkUrlFactory(this.client);
    }

    public final OkUrlFactory setClient(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void setUrlFilter(URLFilter uRLFilter) {
        this.urlFilter = uRLFilter;
    }

    public OkUrlFactory(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public final HttpURLConnection open(URL url) {
        return open(url, this.client.proxy());
    }

    public final URLStreamHandler createURLStreamHandler(final String str) {
        if (str.equals("http") || str.equals("https")) {
            return new URLStreamHandler() {
                /* access modifiers changed from: protected */
                public int getDefaultPort() {
                    if (str.equals("http")) {
                        return 80;
                    }
                    if (str.equals("https")) {
                        return 443;
                    }
                    throw new AssertionError();
                }

                /* access modifiers changed from: protected */
                public URLConnection openConnection(URL url) {
                    return OkUrlFactory.this.open(url);
                }

                /* access modifiers changed from: protected */
                public URLConnection openConnection(URL url, Proxy proxy) {
                    return OkUrlFactory.this.open(url, proxy);
                }
            };
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final HttpURLConnection open(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        OkHttpClient build = this.client.newBuilder().proxy(proxy).build();
        if (protocol.equals("http")) {
            return new OkHttpURLConnection(url, build, this.urlFilter);
        }
        if (protocol.equals("https")) {
            return new OkHttpsURLConnection(url, build, this.urlFilter);
        }
        throw new IllegalArgumentException("Unexpected protocol: " + protocol);
    }
}
