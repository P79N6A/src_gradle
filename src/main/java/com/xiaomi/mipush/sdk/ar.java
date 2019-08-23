package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aw;
import com.xiaomi.push.i;
import com.xiaomi.push.ik;
import com.xiaomi.push.iz;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jf;
import com.xiaomi.push.jg;
import com.xiaomi.push.jj;
import com.xiaomi.push.jl;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.jp;
import com.xiaomi.push.jr;
import com.xiaomi.push.jt;
import com.xiaomi.push.ju;
import com.xiaomi.push.jv;
import java.nio.ByteBuffer;

public class ar {
    protected static <T extends jv<T, ?>> jg a(Context context, T t, ik ikVar) {
        return a(context, t, ikVar, !ikVar.equals(ik.Registration), context.getPackageName(), d.a(context).a());
    }

    protected static <T extends jv<T, ?>> jg a(Context context, T t, ik ikVar, boolean z, String str, String str2) {
        byte[] bArr;
        String str3;
        byte[] a2 = ju.a(t);
        if (a2 == null) {
            str3 = "invoke convertThriftObjectToBytes method, return null.";
        } else {
            jg jgVar = new jg();
            if (z) {
                String d2 = d.a(context).d();
                if (TextUtils.isEmpty(d2)) {
                    str3 = "regSecret is empty, return null";
                } else {
                    try {
                        bArr = i.b(aw.a(d2), a2);
                    } catch (Exception unused) {
                        b.d("encryption error. ");
                    }
                    iz izVar = new iz();
                    izVar.f618a = 5;
                    izVar.f619a = "fakeid";
                    jgVar.a(izVar);
                    jgVar.a(ByteBuffer.wrap(bArr));
                    jgVar.a(ikVar);
                    jgVar.b(true);
                    jgVar.b(str);
                    jgVar.a(z);
                    jgVar.a(str2);
                    return jgVar;
                }
            }
            bArr = a2;
            iz izVar2 = new iz();
            izVar2.f618a = 5;
            izVar2.f619a = "fakeid";
            jgVar.a(izVar2);
            jgVar.a(ByteBuffer.wrap(bArr));
            jgVar.a(ikVar);
            jgVar.b(true);
            jgVar.b(str);
            jgVar.a(z);
            jgVar.a(str2);
            return jgVar;
        }
        b.a(str3);
        return null;
    }

    public static jv a(Context context, jg jgVar) {
        byte[] bArr;
        if (jgVar.b()) {
            try {
                bArr = i.a(aw.a(d.a(context).d()), jgVar.a());
            } catch (Exception e2) {
                throw new v("the aes decrypt failed.", e2);
            }
        } else {
            bArr = jgVar.a();
        }
        jv a2 = a(jgVar.a(), jgVar.f699b);
        if (a2 != null) {
            ju.a(a2, bArr);
        }
        return a2;
    }

    private static jv a(ik ikVar, boolean z) {
        switch (as.f81761a[ikVar.ordinal()]) {
            case 1:
                return new jl();
            case 2:
                return new jr();
            case 3:
                return new jp();
            case 4:
                return new jt();
            case 5:
                return new jn();
            case 6:
                return new ja();
            case e.l:
                return new jf();
            case 8:
                return new jm();
            case 9:
                if (z) {
                    return new jj();
                }
                jb jbVar = new jb();
                jbVar.a(true);
                return jbVar;
            case 10:
                return new jf();
            default:
                return null;
        }
    }
}
