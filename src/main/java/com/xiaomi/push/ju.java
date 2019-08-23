package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.kc;
import com.xiaomi.push.km;
import com.xiaomi.push.service.bh;

public class ju {
    public static short a(Context context, jg jgVar) {
        int a2 = g.a(context, jgVar.f698b).a();
        int i = ai.b(context) ? 4 : 0;
        return (short) ((ai.a(context) ? 8 : 0) + a2 + 0 + i + (bh.a(context, jgVar) ? 16 : 0));
    }

    public static <T extends jv<T, ?>> void a(T t, byte[] bArr) {
        if (bArr != null) {
            new jz(new km.a(true, true, bArr.length)).a(t, bArr);
            return;
        }
        throw new ka("the message byte is empty.");
    }

    public static <T extends jv<T, ?>> byte[] a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new kb(new kc.a()).a(t);
        } catch (ka e2) {
            b.a("convertThriftObjectToBytes catch TException.", (Throwable) e2);
            return null;
        }
    }
}
