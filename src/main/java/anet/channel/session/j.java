package anet.channel.session;

import anet.channel.util.ALog;
import org.android.spdy.AccsSSLCallback;

public class j implements AccsSSLCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f1305a;

    j(TnetSpdySession tnetSpdySession) {
        this.f1305a = tnetSpdySession;
    }

    public byte[] getSSLPublicKey(int i, byte[] bArr) {
        byte[] bArr2;
        try {
            bArr2 = this.f1305a.G.decrypt(this.f1305a.f1124a, "ASE128", "tnet_pksg_key", bArr);
            if (bArr2 != null) {
                try {
                    if (ALog.isPrintLog(2)) {
                        ALog.i("getSSLPublicKey", null, "decrypt", new String(bArr2));
                    }
                } catch (Throwable th) {
                    th = th;
                    ALog.e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
                    return bArr2;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bArr2 = null;
            ALog.e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
            return bArr2;
        }
        return bArr2;
    }
}
