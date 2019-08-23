package com.vivo.push.c;

import android.text.TextUtils;
import android.util.Base64;
import com.google.a.a.a.a.a.a;
import com.vivo.push.p;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.o;
import com.vivo.push.util.s;
import com.vivo.push.v;
import com.vivo.push.y;
import java.security.PublicKey;

public abstract class aa extends v {

    /* renamed from: b  reason: collision with root package name */
    protected PushMessageCallback f81532b;

    aa(y yVar) {
        super(yVar);
    }

    public final void a(PushMessageCallback pushMessageCallback) {
        this.f81532b = pushMessageCallback;
    }

    public final boolean a(PublicKey publicKey, String str, String str2) {
        if (!p.a().d()) {
            o.d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        } else if (publicKey == null) {
            o.d("OnVerifyCallBackCommand", "vertify key is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            o.d("OnVerifyCallBackCommand", "contentTag is null");
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                o.d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
                if (s.a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                    o.d("OnVerifyCallBackCommand", "vertify id is success");
                    return true;
                }
                o.d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(String.valueOf(str)));
                o.c(this.f81705a, "vertify fail srcDigest is ".concat(String.valueOf(str)));
                return false;
            } catch (Exception e2) {
                a.b(e2);
                o.d("OnVerifyCallBackCommand", "vertify exception");
                return false;
            }
        } else {
            o.d("OnVerifyCallBackCommand", "vertify id is null");
            return false;
        }
    }
}
