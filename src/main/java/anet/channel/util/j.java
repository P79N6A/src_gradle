package anet.channel.util;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class j extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f1453a = "awcn.TlsSniSocketFactory";

    /* renamed from: b  reason: collision with root package name */
    private Method f1454b;

    /* renamed from: c  reason: collision with root package name */
    private String f1455c;

    public Socket createSocket() throws IOException {
        return null;
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return null;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return null;
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return null;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return null;
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    public j(String str) {
        this.f1455c = str;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        if (this.f1455c == null) {
            this.f1455c = str;
        }
        if (ALog.isPrintLog(1)) {
            ALog.i("awcn.TlsSniSocketFactory", "customized createSocket", null, "host", this.f1455c);
        }
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        if (Build.VERSION.SDK_INT >= 17) {
            sSLCertificateSocketFactory.setHostname(sSLSocket, this.f1455c);
        } else {
            try {
                if (this.f1454b == null) {
                    this.f1454b = sSLSocket.getClass().getMethod("setHostname", new Class[]{String.class});
                    this.f1454b.setAccessible(true);
                }
                this.f1454b.invoke(sSLSocket, new Object[]{this.f1455c});
            } catch (Exception e2) {
                ALog.w("awcn.TlsSniSocketFactory", "SNI not useable", null, e2, new Object[0]);
            }
        }
        SSLSession session = sSLSocket.getSession();
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.TlsSniSocketFactory", null, null, "SSLSession PeerHost", session.getPeerHost());
        }
        return sSLSocket;
    }
}
