package com.amap.api.services.a;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class db {

    /* renamed from: a  reason: collision with root package name */
    private static db f6798a;

    public interface a {
        URLConnection a(Proxy proxy, URL url);
    }

    public static db a() {
        if (f6798a == null) {
            f6798a = new db();
        }
        return f6798a;
    }

    public byte[] a(dg dgVar) throws be {
        try {
            di a2 = a(dgVar, true);
            if (a2 != null) {
                return a2.f6817a;
            }
            return null;
        } catch (be e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new be("未知的错误");
        }
    }

    public byte[] b(dg dgVar) throws be {
        try {
            di a2 = a(dgVar, false);
            if (a2 != null) {
                return a2.f6817a;
            }
            return null;
        } catch (be e2) {
            throw e2;
        } catch (Throwable th) {
            bx.a(th, "bm", "msp");
            throw new be("未知的错误");
        }
    }

    /* access modifiers changed from: protected */
    public void c(dg dgVar) throws be {
        if (dgVar == null) {
            throw new be("requeust is null");
        } else if (dgVar.i() == null || "".equals(dgVar.i())) {
            throw new be("request url is empty");
        }
    }

    public di a(dg dgVar, boolean z) throws be {
        Proxy proxy;
        try {
            c(dgVar);
            if (dgVar.h == null) {
                proxy = null;
            } else {
                proxy = dgVar.h;
            }
            return new de(dgVar.f6816f, dgVar.g, proxy, z).a(dgVar.m(), dgVar.e(), dgVar.n());
        } catch (be e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new be("未知的错误");
        }
    }
}
