package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a;
import java.io.IOException;
import java.io.InputStream;

public class k extends b {
    public k() {
        super(c());
    }

    public static byte c() {
        return -37;
    }

    public b a(InputStream inputStream) throws IOException {
        return this;
    }

    public byte[] b() {
        return new byte[]{this.f24957a};
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HeartBeatRspMessage[cmdId:");
        stringBuffer.append(a.a(this.f24957a));
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
