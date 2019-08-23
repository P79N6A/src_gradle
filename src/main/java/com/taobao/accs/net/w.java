package com.taobao.accs.net;

import com.taobao.accs.utl.UtilityImpl;
import org.android.spdy.AccsSSLCallback;

public class w implements AccsSSLCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f79042a;

    w(s sVar) {
        this.f79042a = sVar;
    }

    public byte[] getSSLPublicKey(int i, byte[] bArr) {
        return UtilityImpl.a(this.f79042a.f78992d, this.f79042a.m, this.f79042a.f78990b, bArr);
    }
}
