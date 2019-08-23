package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.m;
import com.xiaomi.push.au;

public class at {
    public static AbstractPushManager a(Context context, f fVar) {
        return b(context, fVar);
    }

    private static AbstractPushManager b(Context context, f fVar) {
        m.a a2 = m.a(fVar);
        if (a2 == null || TextUtils.isEmpty(a2.f81801a) || TextUtils.isEmpty(a2.f81802b)) {
            return null;
        }
        return (AbstractPushManager) au.a(a2.f81801a, a2.f81802b, context);
    }
}
