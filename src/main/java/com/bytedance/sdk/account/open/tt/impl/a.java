package com.bytedance.sdk.account.open.tt.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.account.a.b.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static c f22523a;

    public static com.bytedance.sdk.account.open.tt.a.a a(Context context) {
        return new b(context, com.bytedance.sdk.account.a.b.a.a(context, f22523a));
    }

    public static boolean a(c cVar) {
        if (TextUtils.isEmpty(cVar.f22233a)) {
            return false;
        }
        f22523a = cVar;
        return true;
    }
}
