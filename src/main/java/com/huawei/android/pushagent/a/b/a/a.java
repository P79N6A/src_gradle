package com.huawei.android.pushagent.a.b.a;

import com.huawei.android.pushagent.a.b.b;
import com.huawei.android.pushagent.a.b.c;
import com.huawei.android.pushagent.a.b.d;
import com.huawei.android.pushagent.a.b.e;
import com.huawei.android.pushagent.a.b.f;
import com.huawei.android.pushagent.a.b.h;
import com.huawei.android.pushagent.a.b.i;
import com.huawei.android.pushagent.a.b.j;
import com.huawei.android.pushagent.a.b.k;
import com.huawei.android.pushagent.a.b.l;
import com.huawei.android.pushagent.a.b.m;
import com.huawei.android.pushagent.a.b.n;
import com.huawei.android.pushagent.a.b.o;
import com.huawei.android.pushagent.a.b.p;
import com.huawei.android.pushagent.a.b.q;
import java.io.InputStream;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap f24956a;

    static {
        HashMap hashMap = new HashMap();
        f24956a = hashMap;
        hashMap.put((byte) -47, f.class);
        f24956a.put((byte) -37, k.class);
        f24956a.put((byte) -45, d.class);
        f24956a.put((byte) -33, i.class);
        f24956a.put((byte) -35, o.class);
        f24956a.put((byte) -41, q.class);
        f24956a.put((byte) -96, l.class);
        f24956a.put((byte) -48, e.class);
        f24956a.put((byte) -38, j.class);
        f24956a.put((byte) -46, c.class);
        f24956a.put((byte) -34, h.class);
        f24956a.put((byte) -36, n.class);
        f24956a.put((byte) -42, p.class);
        f24956a.put((byte) -95, m.class);
        f24956a.put((byte) -92, b.class);
        f24956a.put((byte) -91, b.class);
        f24956a.put((byte) -90, b.class);
        f24956a.put((byte) -89, b.class);
    }

    public static b a(Byte b2, InputStream inputStream) throws InstantiationException, IllegalAccessException, Exception {
        if (f24956a.containsKey(b2)) {
            b bVar = (b) ((Class) f24956a.get(b2)).newInstance();
            if (bVar.a() == -1) {
                bVar.b(b2.byteValue());
            }
            b a2 = bVar.a(inputStream);
            if (a2 != null) {
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "after decode msg:" + com.huawei.android.pushagent.utils.a.a(a2.a()));
            } else {
                com.huawei.android.pushagent.utils.a.e.d("PushLogAC2815", "call " + bVar.getClass().getSimpleName() + " decode failed!");
            }
            return a2;
        }
        com.huawei.android.pushagent.utils.a.e.d("PushLogAC2815", "cmdId:" + b2 + " is not exist, all:" + f24956a.keySet());
        throw new InstantiationException("cmdId:" + b2 + " is not register");
    }
}
