package com.meizu.cloud.pushsdk.b.c;

import com.meizu.cloud.pushsdk.b.c.k;
import com.meizu.cloud.pushsdk.b.g.b;
import com.meizu.cloud.pushsdk.b.g.c;
import com.meizu.cloud.pushsdk.b.g.f;
import com.meizu.cloud.pushsdk.b.h.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    a f26914a = new a(null);

    private static l a(final HttpURLConnection httpURLConnection) throws IOException {
        if (!httpURLConnection.getDoInput()) {
            return null;
        }
        final c a2 = f.a(f.a(a(httpURLConnection.getResponseCode()) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()));
        return new l() {
            public final c a() {
                return a2;
            }
        };
    }

    static void a(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        switch (iVar.c()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, iVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                b(httpURLConnection, iVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("PATCH");
                b(httpURLConnection, iVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    protected static boolean a(int i) {
        return i >= 200 && i < 300;
    }

    private HttpURLConnection b(i iVar) throws IOException {
        String fVar = iVar.a().toString();
        HttpURLConnection a2 = a(new URL(fVar));
        a2.setConnectTimeout(60000);
        a2.setReadTimeout(60000);
        a2.setUseCaches(false);
        a2.setDoInput(true);
        if (iVar.f() && fVar.startsWith("https://api-push.meizu.com")) {
            ((HttpsURLConnection) a2).setSSLSocketFactory(this.f26914a);
        }
        return a2;
    }

    private static void b(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        j e2 = iVar.e();
        if (e2 != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", e2.a().toString());
            b a2 = f.a(f.a(httpURLConnection.getOutputStream()));
            e2.a(a2);
            a2.close();
        }
    }

    public k a(i iVar) throws IOException {
        HttpURLConnection b2 = b(iVar);
        for (String next : iVar.d().b()) {
            String a2 = iVar.a(next);
            com.meizu.cloud.pushsdk.b.a.a.b("current header name " + next + " value " + a2);
            b2.addRequestProperty(next, a2);
        }
        a(b2, iVar);
        int responseCode = b2.getResponseCode();
        return new k.a().a(responseCode).a(iVar.d()).a(b2.getResponseMessage()).a(iVar).a(a(b2)).a();
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }
}
