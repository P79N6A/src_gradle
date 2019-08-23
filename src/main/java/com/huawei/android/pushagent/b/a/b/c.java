package com.huawei.android.pushagent.b.a.b;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.e;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    Socket f25055a;

    public c(Context context) {
    }

    public void a() throws Exception {
        if (this.f25055a != null) {
            this.f25055a.close();
        }
    }

    public boolean a(Socket socket) {
        e.a("PushLogAC2815", "enter NormalChannel:init(" + socket.getRemoteSocketAddress() + ")");
        if (!socket.isConnected()) {
            e.d("PushLogAC2815", "when init SSL Channel, socket is not ready:" + socket);
            return false;
        }
        this.f25055a = socket;
        return true;
    }

    public boolean a(byte[] bArr) throws Exception {
        if (this.f25055a == null || this.f25055a.getOutputStream() == null) {
            e.d("PushLogAC2815", "when call send, socket is not ready!!");
            return false;
        }
        this.f25055a.getOutputStream().write(bArr);
        this.f25055a.getOutputStream().flush();
        return true;
    }

    public boolean b() {
        return this.f25055a != null && this.f25055a.isConnected();
    }

    public Socket c() {
        return this.f25055a;
    }

    public InputStream d() {
        if (this.f25055a != null) {
            try {
                return this.f25055a.getInputStream();
            } catch (IOException e2) {
                e.c("PushLogAC2815", "call socket.getInputStream cause:" + e2.toString(), e2);
            }
        }
        return null;
    }
}
