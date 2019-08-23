package com.bytedance.crash.runtime;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.crash.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f19558a;

    public final String a() {
        String c2 = j.a().c();
        if (TextUtils.isEmpty(c2) || PushConstants.PUSH_TYPE_NOTIFY.equals(c2)) {
            return this.f19558a.getString("device_id", PushConstants.PUSH_TYPE_NOTIFY);
        }
        return c2;
    }

    public k(Context context) {
        this.f19558a = c.a(context, "npth", 0);
    }
}
