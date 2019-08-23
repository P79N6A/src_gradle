package com.bytedance.sdk.account.a.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.account.a.a.b;

public final class a {
    public static b a(Context context, c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f22233a)) {
            return new b(context, cVar, null);
        }
        throw new IllegalStateException("no init client key");
    }
}
