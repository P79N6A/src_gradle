package com.ss.android.websocket.a.a;

import java.net.ProtocolException;

public final class b {
    static void a(int i, boolean z) throws ProtocolException {
        String str;
        if (i < 1000 || i >= 5000) {
            str = "Code must be in range [1000,5000): " + i;
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            str = null;
        } else {
            str = "Code " + i + " is reserved and may not be used.";
        }
        if (str == null) {
            return;
        }
        if (z) {
            throw new IllegalArgumentException(str);
        }
        throw new ProtocolException(str);
    }

    static void a(byte[] bArr, long j, byte[] bArr2, long j2) {
        int length = bArr2.length;
        int i = 0;
        while (((long) i) < j) {
            bArr[i] = (byte) (bArr2[(int) (j2 % ((long) length))] ^ bArr[i]);
            i++;
            j2++;
        }
    }
}
