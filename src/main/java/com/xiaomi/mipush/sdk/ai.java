package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.fy;
import com.xiaomi.push.io;

public final class ai implements fy.a {
    ai() {
    }

    public final void a(Context context, io ioVar) {
        MiTinyDataClient.upload(context, ioVar);
    }
}
