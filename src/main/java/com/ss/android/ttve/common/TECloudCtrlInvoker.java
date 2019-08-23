package com.ss.android.ttve.common;

import com.ss.android.ttve.nativePort.b;

public class TECloudCtrlInvoker {
    public native int nativeVerifyJson(byte[] bArr, byte[] bArr2);

    static {
        b.a();
    }
}
