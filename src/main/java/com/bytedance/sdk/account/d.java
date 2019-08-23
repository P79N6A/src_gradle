package com.bytedance.sdk.account;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.f;

public abstract class d<T extends c<K>, K extends f> extends b<T> {
    /* renamed from: a */
    public abstract void g(T t);

    public abstract void a(T t, int i);

    public final /* bridge */ /* synthetic */ String e(BaseApiResponse baseApiResponse) {
        c cVar = (c) baseApiResponse;
        if (cVar == null || cVar.f22251a == null) {
            return null;
        }
        return cVar.f22251a.i;
    }

    public final /* bridge */ /* synthetic */ boolean b(BaseApiResponse baseApiResponse) {
        c cVar = (c) baseApiResponse;
        if (cVar == null || cVar.f22251a == null) {
            return false;
        }
        T t = cVar.f22251a;
        if (t.g <= 1100 || t.g >= 1199) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean d(BaseApiResponse baseApiResponse) {
        c cVar = (c) baseApiResponse;
        if (cVar == null || cVar.f22251a == null) {
            return false;
        }
        T t = cVar.f22251a;
        if (t.g == 1104 || t.g == 1105) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean c(BaseApiResponse baseApiResponse) {
        c cVar = (c) baseApiResponse;
        if (cVar == null || cVar.f22251a == null) {
            return false;
        }
        T t = cVar.f22251a;
        if ((t.g == 1101 || t.g == 1102 || t.g == 1103) && !TextUtils.isEmpty(t.i)) {
            return true;
        }
        return false;
    }
}
