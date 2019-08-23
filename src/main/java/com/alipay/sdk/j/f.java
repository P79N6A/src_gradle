package com.alipay.sdk.j;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.alipay.b.a.b;

public final class f extends b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f5532a;

    public final void a(boolean z, String str) throws RemoteException {
    }

    public final boolean a() throws RemoteException {
        return false;
    }

    f(d dVar) {
        this.f5532a = dVar;
    }

    public final void a(String str, String str2, int i, Bundle bundle) throws RemoteException {
        Intent intent = new Intent("android.intent.action.MAIN", null);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putInt("CallingPid", i);
            intent.putExtras(bundle);
        } catch (Exception unused) {
        }
        intent.setClassName(str, str2);
        if (this.f5532a.f5525a != null) {
            this.f5532a.f5525a.startActivity(intent);
        }
    }
}
