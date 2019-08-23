package com.ss.optimizer.live.sdk.a;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final String f78394a;

    /* renamed from: b  reason: collision with root package name */
    final String f78395b;

    /* renamed from: c  reason: collision with root package name */
    final b f78396c;

    /* renamed from: d  reason: collision with root package name */
    final List<Pair<String, String>> f78397d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f78398a;

        /* renamed from: b  reason: collision with root package name */
        public String f78399b;

        /* renamed from: c  reason: collision with root package name */
        public String f78400c;

        /* renamed from: d  reason: collision with root package name */
        public int f78401d;

        /* renamed from: e  reason: collision with root package name */
        public b f78402e;

        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    static class b implements b {
        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final String a(String str) throws Exception {
            throw new RuntimeException("no implementation");
        }

        public final String a(String str, byte[] bArr, String str2, String str3) throws Exception {
            throw new RuntimeException("no implementation");
        }
    }

    private c(a aVar) {
        String str;
        this.f78394a = aVar.f78398a;
        if (aVar.f78399b == null) {
            str = "http://i.snssdk.com";
        } else {
            str = aVar.f78399b;
        }
        this.f78395b = str;
        if (aVar.f78402e == null) {
            this.f78396c = new b((byte) 0);
        } else {
            this.f78396c = aVar.f78402e;
        }
        this.f78397d = new ArrayList();
        if (this.f78394a != null) {
            this.f78397d.add(Pair.create("ProjectKey", this.f78394a));
        }
        if (aVar.f78400c != null) {
            this.f78397d.add(Pair.create("DeviceId", aVar.f78400c));
        }
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
