package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.nio.ByteBuffer;

public final class gn extends gj {
    public gn() {
        a("PING", (String) null);
        a(PushConstants.PUSH_TYPE_NOTIFY);
        a(0);
    }

    /* access modifiers changed from: package-private */
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        return a().length == 0 ? byteBuffer : super.a(byteBuffer);
    }

    public final int c() {
        if (a().length == 0) {
            return 0;
        }
        return super.c();
    }
}
