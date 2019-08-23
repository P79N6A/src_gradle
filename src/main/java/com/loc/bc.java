package com.loc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public final class bc extends bd {
    public bc() {
    }

    public bc(bd bdVar) {
        super(bdVar);
    }

    /* access modifiers changed from: protected */
    public final byte[] a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
        stringBuffer.append(" ");
        stringBuffer.append(UUID.randomUUID().toString());
        stringBuffer.append(" ");
        if (stringBuffer.length() != 53) {
            return new byte[0];
        }
        byte[] a2 = di.a(stringBuffer.toString());
        byte[] bArr2 = new byte[(a2.length + bArr.length)];
        System.arraycopy(a2, 0, bArr2, 0, a2.length);
        System.arraycopy(bArr, 0, bArr2, a2.length, bArr.length);
        return bArr2;
    }
}
