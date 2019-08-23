package com.bytedance.crash.h;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.crash.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.ea;

public final class c extends a {
    public final void run() {
        String c2 = j.a().c();
        if (TextUtils.isEmpty(c2) || PushConstants.PUSH_TYPE_NOTIFY.equals(c2)) {
            a(this.f19460c);
            return;
        }
        j.c().f19558a.edit().putString("device_id", c2).apply();
        new StringBuilder("[DeviceIdTask] did is ").append(c2);
    }

    c(Handler handler, long j, long j2) {
        super(handler, 0, ea.f66827f);
    }
}
