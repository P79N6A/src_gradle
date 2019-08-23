package com.huawei.android.pushagent.b.a.b;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.a.f;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;

public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private Context f25056a;

    /* renamed from: b  reason: collision with root package name */
    private SSLSocket f25057b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f25058c;

    /* renamed from: d  reason: collision with root package name */
    private OutputStream f25059d;

    public d(Context context) {
        this.f25056a = context;
    }

    public synchronized void a() {
        e.a("PushLogAC2815", "enter SSLPushChannel:close()");
        try {
            if (this.f25058c != null) {
                this.f25058c.close();
            }
        } catch (IOException e2) {
            try {
                e.c("PushLogAC2815", "close dis error: " + e2.toString(), e2);
            } catch (Throwable th) {
                this.f25058c = null;
                throw th;
            }
        }
        this.f25058c = null;
        try {
            if (this.f25059d != null) {
                this.f25059d.close();
            }
        } catch (IOException e3) {
            e.c("PushLogAC2815", "close dos error: " + e3.toString(), e3);
        }
        this.f25059d = null;
        try {
            if (this.f25057b != null && !this.f25057b.isClosed()) {
                this.f25057b.close();
            }
            this.f25057b = null;
        } catch (IOException e4) {
            e.c("PushLogAC2815", "close socket error: " + e4.toString(), e4);
            this.f25057b = null;
        }
    }

    public boolean a(Socket socket) throws Exception {
        if (socket == null || !socket.isConnected()) {
            e.d("PushLogAC2815", "when init SSL Channel, socket is not ready:" + socket);
            return false;
        }
        e.a("PushLogAC2815", "enter SSLChannel:init(" + socket.getRemoteSocketAddress() + ")");
        SSLContext instance = SSLContext.getInstance("TLS");
        TrustManagerFactory instance2 = TrustManagerFactory.getInstance("X509");
        KeyStore instance3 = KeyStore.getInstance("BKS");
        InputStream open = this.f25056a.getAssets().open("rootca_0727.bks");
        try {
            open.reset();
            instance3.load(open, f.b((Context) null, com.huawei.android.pushagent.utils.a.d.b()).toCharArray());
            if (open != null) {
                open.close();
            }
            instance2.init(instance3);
            instance.init(null, instance2.getTrustManagers(), null);
            InetAddress inetAddress = socket.getInetAddress();
            if (inetAddress == null) {
                return false;
            }
            new InetSocketAddress(inetAddress, socket.getPort());
            Socket createSocket = instance.getSocketFactory().createSocket(socket, inetAddress.getHostAddress(), socket.getPort(), true);
            if (createSocket instanceof SSLSocket) {
                this.f25057b = (SSLSocket) createSocket;
            }
            if (this.f25057b == null) {
                return false;
            }
            this.f25057b.setEnabledCipherSuites(d.a.a());
            e.a("PushLogAC2815", "server ip:" + r3.getAddress().getHostAddress() + ",server port:" + r3.getPort() + ",socket ip:" + this.f25057b.getLocalAddress().getHostAddress() + ",socket port:" + this.f25057b.getLocalPort() + ",pkgName:" + this.f25056a.getPackageName());
            this.f25058c = this.f25057b.getInputStream();
            this.f25059d = this.f25057b.getOutputStream();
            this.f25057b.setSoTimeout(0);
            return true;
        } catch (Exception e2) {
            throw e2;
        } catch (Throwable th) {
            if (open != null) {
                open.close();
            }
            throw th;
        }
    }

    public boolean a(byte[] bArr) throws Exception {
        try {
            if (this.f25059d == null || bArr == null) {
                e.d("PushLogAC2815", "when send msg:" + Arrays.toString(bArr) + " dos is null, or msg is null");
                return false;
            }
            this.f25059d.write(bArr);
            this.f25059d.flush();
            return true;
        } catch (Exception e2) {
            e.c("PushLogAC2815", "call send cause:" + e2.toString(), e2);
            a();
        }
    }

    public boolean b() {
        return (this.f25057b == null || !this.f25057b.isConnected() || this.f25058c == null || this.f25059d == null) ? false : true;
    }

    public Socket c() {
        return this.f25057b;
    }

    public InputStream d() {
        return this.f25058c;
    }
}
