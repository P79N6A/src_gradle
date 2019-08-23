package com.huawei.android.pushagent.utils.a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class g extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f25171a;

    public g(SSLSocketFactory sSLSocketFactory) {
        this.f25171a = sSLSocketFactory;
    }

    private void a(Socket socket) {
        e.a("PushLogSC2815", "enter setEnableSafeCipherSuites");
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            if (enabledCipherSuites == null || enabledCipherSuites.length == 0) {
                e.c("PushLogSC2815", "Current enabled cipherSuites is invalid!");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                if (!str.contains("RC4")) {
                    arrayList.add(str);
                }
            }
            sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            return;
        }
        e.d("PushLogSC2815", "socket is not instanceof SSLSocket");
    }

    public Socket createSocket() throws IOException {
        Socket createSocket = this.f25171a.createSocket();
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Socket createSocket = this.f25171a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        Socket createSocket = this.f25171a.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f25171a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f25171a.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f25171a.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.f25171a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f25171a.getSupportedCipherSuites();
    }
}
