package anet.channel.session;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1295a;

    c(String str) {
        this.f1295a = str;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f1295a, sSLSession);
    }
}
