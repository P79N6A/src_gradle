package com.bytedance.sdk.account.b.b;

import android.os.Bundle;
import com.bytedance.sdk.account.b.a.b;
import com.bytedance.sdk.account.b.c.c;

public final class a implements b {
    public final boolean a(int i, Bundle bundle, com.bytedance.sdk.account.b.a.a aVar) {
        if (bundle == null || aVar == null) {
            return false;
        }
        if (i == 1) {
            c.a aVar2 = new c.a(bundle);
            if (!aVar2.checkArgs()) {
                return false;
            }
            if (aVar2.f22263e != null) {
                aVar2.f22263e = aVar2.f22263e.replace(" ", "");
            }
            if (aVar2.g != null) {
                aVar2.g = aVar2.g.replace(" ", "");
            }
            if (aVar2.f22264f != null) {
                aVar2.f22264f = aVar2.f22264f.replace(" ", "");
            }
            aVar.onReq(aVar2);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            c.b bVar = new c.b(bundle);
            if (!bVar.checkArgs()) {
                return false;
            }
            aVar.onResp(bVar);
            return true;
        }
    }
}
