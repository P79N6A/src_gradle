package com.huawei.android.pushagent.b.a.b;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.a.f;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.security.SecureRandom;

public class a implements b {

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f25041b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static byte[] f25042c;

    /* renamed from: a  reason: collision with root package name */
    protected Socket f25043a;

    /* renamed from: d  reason: collision with root package name */
    private Context f25044d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f25045e;

    /* renamed from: com.huawei.android.pushagent.b.a.b.a$a  reason: collision with other inner class name */
    class C0289a extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        private InputStream f25047b;

        /* renamed from: c  reason: collision with root package name */
        private byte[] f25048c;

        /* renamed from: d  reason: collision with root package name */
        private int f25049d;

        public C0289a(InputStream inputStream) {
            this.f25047b = inputStream;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            if (r4.f25048c == null) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            if (r4.f25048c.length <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            if (r4.f25049d >= r4.f25048c.length) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r0 = r4.f25048c;
            r1 = r4.f25049d;
            r4.f25049d = r1 + 1;
            r0 = r0[r1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
            return r0 & 255;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "bufferByte has read end , need read bytes from socket");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
            r4.f25048c = null;
            r4.f25049d = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            if (r4.f25047b == null) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            r0 = r4.f25047b.read();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
            if (-1 != r0) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
            r0 = "PushLogAC2815";
            r1 = "read -1 from inputstream";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
            com.huawei.android.pushagent.utils.a.e.c(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
            if (48 != r0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
            r4.f25048c = com.huawei.android.pushagent.utils.a.a.f.b(com.huawei.android.pushagent.b.a.b.a.b(r4.f25047b), com.huawei.android.pushagent.b.a.b.a.e());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
            if (r4.f25048c == null) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
            if (r4.f25048c.length != 0) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
            r0 = r4.f25048c;
            r1 = r4.f25049d;
            r4.f25049d = r1 + 1;
            r0 = r0[r1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
            r0 = "PushLogAC2815";
            r1 = "ase decrypt serverkey error";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            r0 = "PushLogAC2815";
            r1 = "read secure message error, return -1";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
            r0 = "PushLogAC2815";
            r1 = "secureInputStream is null, return -1";
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int read() throws java.io.IOException {
            /*
                r4 = this;
                com.huawei.android.pushagent.b.a.b.a r0 = com.huawei.android.pushagent.b.a.b.a.this
                monitor-enter(r0)
                com.huawei.android.pushagent.b.a.b.a r1 = com.huawei.android.pushagent.b.a.b.a.this     // Catch:{ all -> 0x008c }
                boolean r1 = r1.f25045e     // Catch:{ all -> 0x008c }
                r2 = -1
                if (r1 != 0) goto L_0x0015
                java.lang.String r1 = "PushLogAC2815"
                java.lang.String r3 = "secure socket is not initialized, can not read any data"
                com.huawei.android.pushagent.utils.a.e.c(r1, r3)     // Catch:{ all -> 0x008c }
                monitor-exit(r0)     // Catch:{ all -> 0x008c }
                return r2
            L_0x0015:
                monitor-exit(r0)     // Catch:{ all -> 0x008c }
                byte[] r0 = r4.f25048c
                if (r0 == 0) goto L_0x003a
                byte[] r0 = r4.f25048c
                int r0 = r0.length
                if (r0 <= 0) goto L_0x003a
                int r0 = r4.f25049d
                byte[] r1 = r4.f25048c
                int r1 = r1.length
                if (r0 >= r1) goto L_0x0033
                byte[] r0 = r4.f25048c
                int r1 = r4.f25049d
                int r2 = r1 + 1
                r4.f25049d = r2
                byte r0 = r0[r1]
            L_0x0030:
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            L_0x0033:
                java.lang.String r0 = "PushLogAC2815"
                java.lang.String r1 = "bufferByte has read end , need read bytes from socket"
                com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            L_0x003a:
                r0 = 0
                r4.f25048c = r0
                r0 = 0
                r4.f25049d = r0
                java.io.InputStream r0 = r4.f25047b
                if (r0 == 0) goto L_0x0087
                java.io.InputStream r0 = r4.f25047b
                int r0 = r0.read()
                if (r2 != r0) goto L_0x0054
                java.lang.String r0 = "PushLogAC2815"
                java.lang.String r1 = "read -1 from inputstream"
            L_0x0050:
                com.huawei.android.pushagent.utils.a.e.c(r0, r1)
                return r2
            L_0x0054:
                r1 = 48
                if (r1 != r0) goto L_0x0082
                java.io.InputStream r0 = r4.f25047b
                byte[] r0 = com.huawei.android.pushagent.b.a.b.a.c((java.io.InputStream) r0)
                byte[] r1 = com.huawei.android.pushagent.b.a.b.a.f25042c
                byte[] r0 = com.huawei.android.pushagent.utils.a.a.f.b((byte[]) r0, (byte[]) r1)
                r4.f25048c = r0
                byte[] r0 = r4.f25048c
                if (r0 == 0) goto L_0x007d
                byte[] r0 = r4.f25048c
                int r0 = r0.length
                if (r0 != 0) goto L_0x0072
                goto L_0x007d
            L_0x0072:
                byte[] r0 = r4.f25048c
                int r1 = r4.f25049d
                int r2 = r1 + 1
                r4.f25049d = r2
                byte r0 = r0[r1]
                goto L_0x0030
            L_0x007d:
                java.lang.String r0 = "PushLogAC2815"
                java.lang.String r1 = "ase decrypt serverkey error"
                goto L_0x0050
            L_0x0082:
                java.lang.String r0 = "PushLogAC2815"
                java.lang.String r1 = "read secure message error, return -1"
                goto L_0x0050
            L_0x0087:
                java.lang.String r0 = "PushLogAC2815"
                java.lang.String r1 = "secureInputStream is null, return -1"
                goto L_0x0050
            L_0x008c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008c }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.a.b.a.C0289a.read():int");
        }
    }

    public a(Context context) {
        this.f25044d = context;
    }

    public static void a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = 0;
        while (i < bArr.length) {
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (-1 != read) {
                i += read;
            } else {
                throw new IOException("read -1 reached");
            }
        }
    }

    private byte[] a(Context context) throws IOException {
        byte T = (byte) com.huawei.android.pushagent.b.b.a.a(context).T();
        String U = com.huawei.android.pushagent.b.b.a.a(context).U();
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        e.a("PushLogAC2815", "ready to send SecureChannelReqMessage, save clientKey for decode serverKey");
        b(bArr);
        byte[] a2 = f.a(bArr, U);
        if (a2 == null) {
            e.c("PushLogAC2815", "rsa encrypr clientKey error");
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(20);
        byteArrayOutputStream.write(com.huawei.android.pushagent.utils.a.b(a2.length + 1 + 1 + 2));
        byteArrayOutputStream.write(T);
        byteArrayOutputStream.write(a2);
        return byteArrayOutputStream.toByteArray();
    }

    public static synchronized void b(byte[] bArr) {
        synchronized (a.class) {
            if (bArr != null) {
                if (bArr.length != 0) {
                    f25041b = new byte[bArr.length];
                    System.arraycopy(bArr, 0, f25041b, 0, bArr.length);
                    return;
                }
            }
            e.a("PushLogAC2815", "key is null");
        }
    }

    private boolean b(Socket socket) {
        String str;
        String str2;
        if (socket == null) {
            str = "PushLogAC2815";
            str2 = "socket is null";
        } else if (socket.isConnected()) {
            return true;
        } else {
            str = "PushLogAC2815";
            str2 = "when init Channel, socket is not ready";
        }
        e.c(str, str2);
        return false;
    }

    public static synchronized void c(byte[] bArr) {
        synchronized (a.class) {
            if (bArr != null) {
                if (bArr.length != 0) {
                    f25042c = new byte[bArr.length];
                    System.arraycopy(bArr, 0, f25042c, 0, bArr.length);
                    return;
                }
            }
            e.a("PushLogAC2815", "key is null");
        }
    }

    /* access modifiers changed from: private */
    public static byte[] c(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[2];
        a(inputStream, bArr);
        byte[] bArr2 = new byte[(com.huawei.android.pushagent.utils.a.c(bArr) - 3)];
        a(inputStream, bArr2);
        return bArr2;
    }

    private static byte[] d(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(48);
        byte[] a2 = f.a(bArr, f25042c);
        if (a2 == null || a2.length == 0) {
            e.a("PushLogAC2815", "aes encrypt pushMsgData error");
            return new byte[0];
        }
        byteArrayOutputStream.write(com.huawei.android.pushagent.utils.a.b(a2.length + 1 + 2));
        byteArrayOutputStream.write(a2);
        return byteArrayOutputStream.toByteArray();
    }

    private static synchronized byte[] f() {
        byte[] bArr;
        synchronized (a.class) {
            bArr = f25041b;
        }
        return bArr;
    }

    public synchronized void a() {
        e.a("PushLogAC2815", "enter pushChannel:close()");
        this.f25045e = false;
        try {
            if (this.f25043a == null) {
                e.c("PushLogAC2815", "socket is null, not need close");
                this.f25043a = null;
                return;
            }
            if (!this.f25043a.isClosed()) {
                this.f25043a.close();
            } else {
                e.c("PushLogAC2815", "socket has been closed");
            }
            this.f25043a = null;
        } catch (IOException e2) {
            try {
                e.c("PushLogAC2815", "close socket error: " + e2.toString(), e2);
            } finally {
                this.f25043a = null;
            }
        }
    }

    public synchronized boolean a(Socket socket) {
        String str;
        String str2;
        String str3;
        String str4;
        if (!b(socket)) {
            a();
            return false;
        }
        this.f25043a = socket;
        try {
            byte[] a2 = a(this.f25044d);
            OutputStream outputStream = this.f25043a.getOutputStream();
            if (outputStream == null) {
                str3 = "PushLogAC2815";
                str4 = "outputStream is null";
            } else if (a2.length == 0) {
                str3 = "PushLogAC2815";
                str4 = "data is null";
            } else {
                outputStream.write(a2);
                outputStream.flush();
                InputStream inputStream = this.f25043a.getInputStream();
                if (b(socket)) {
                    int read = inputStream.read();
                    if (-1 == read) {
                        str = "PushLogAC2815";
                        str2 = " read -1 when init secure channel, socket maybe closed";
                    } else if (21 == read) {
                        byte[] a3 = a(inputStream);
                        if (a3 != null) {
                            c(f.b(a3, f()));
                            this.f25045e = true;
                            return true;
                        }
                        str = "PushLogAC2815";
                        str2 = "get server key error";
                    } else {
                        str = "PushLogAC2815";
                        str2 = "cmdId is not CMD_SECUREKEYEXCHANGE_RSP";
                    }
                    e.a(str, str2);
                }
                a();
                return false;
            }
            e.c(str3, str4);
        } catch (Exception e2) {
            e.c("PushLogAC2815", "call send cause:" + e2.toString(), e2);
        }
        a();
        return false;
    }

    public synchronized boolean a(byte[] bArr) throws Exception {
        if (this.f25043a == null) {
            e.c("PushLogAC2815", "socket is null");
            return false;
        } else if (!this.f25045e) {
            e.c("PushLogAC2815", "secure socket is not initialized, can not write any data");
            a();
            return false;
        } else {
            try {
                byte[] d2 = d(bArr);
                OutputStream outputStream = this.f25043a.getOutputStream();
                if (outputStream == null) {
                    e.c("PushLogAC2815", "outputStream is null");
                    return false;
                } else if (d2.length == 0) {
                    e.c("PushLogAC2815", "data is null");
                    return false;
                } else {
                    outputStream.write(d2);
                    outputStream.flush();
                    return true;
                }
            } catch (Exception e2) {
                e.c("PushLogAC2815", "call send cause:" + e2.toString(), e2);
                a();
                return false;
            }
        }
    }

    public byte[] a(InputStream inputStream) throws Exception {
        a(inputStream, new byte[2]);
        byte[] bArr = new byte[1];
        a(inputStream, bArr);
        byte b2 = bArr[0];
        e.a("PushLogAC2815", "result is " + b2);
        if (b2 == 0) {
            byte[] bArr2 = new byte[32];
            a(inputStream, bArr2);
            return bArr2;
        }
        e.c("PushLogAC2815", "secure key exchange error");
        return null;
    }

    public boolean b() {
        if (this.f25043a != null) {
            return this.f25043a.isConnected();
        }
        e.c("PushLogAC2815", "socket is null");
        return false;
    }

    public Socket c() {
        return this.f25043a;
    }

    public InputStream d() {
        try {
            if (this.f25043a != null) {
                return new C0289a(this.f25043a.getInputStream());
            }
            e.c("PushLogAC2815", "socket is null");
            return null;
        } catch (IOException e2) {
            e.c("PushLogAC2815", "call socket.getInputStream cause:" + e2.toString(), e2);
        }
    }
}
