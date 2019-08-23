package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.squareup.picasso.i;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;
import java.io.InputStream;

public final class q extends x {

    /* renamed from: a  reason: collision with root package name */
    private final i f27434a;

    /* renamed from: b  reason: collision with root package name */
    private final z f27435b;

    static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean a(v vVar) {
        String scheme = vVar.f27464d.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    public final x.a b(v vVar) throws IOException {
        s.d dVar;
        i.a a2 = this.f27434a.a(vVar.f27464d, vVar.f27463c);
        if (a2.f27421c) {
            dVar = s.d.DISK;
        } else {
            dVar = s.d.NETWORK;
        }
        Bitmap bitmap = a2.f27420b;
        if (bitmap != null) {
            return new x.a(bitmap, dVar);
        }
        InputStream inputStream = a2.f27419a;
        if (inputStream == null) {
            return null;
        }
        if (dVar == s.d.DISK && a2.f27422d == 0) {
            ad.a(inputStream);
            throw new a("Received response with 0 content-length header.");
        }
        if (dVar == s.d.NETWORK && a2.f27422d > 0) {
            z zVar = this.f27435b;
            zVar.f27486c.sendMessage(zVar.f27486c.obtainMessage(4, Long.valueOf(a2.f27422d)));
        }
        return new x.a(inputStream, dVar);
    }

    public q(i iVar, z zVar) {
        this.f27434a = iVar;
        this.f27435b = zVar;
    }
}
