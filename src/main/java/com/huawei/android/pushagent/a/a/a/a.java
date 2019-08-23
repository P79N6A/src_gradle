package com.huawei.android.pushagent.a.a.a;

import com.huawei.android.pushagent.a.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.io.InputStream;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap f24946a;

    static {
        HashMap hashMap = new HashMap();
        f24946a = hashMap;
        hashMap.put((byte) 1, com.huawei.android.pushagent.a.a.a.class);
        f24946a.put((byte) 2, b.class);
    }

    public static b a(Byte b2, InputStream inputStream) throws InstantiationException, IllegalAccessException, Exception {
        if (f24946a.containsKey(b2)) {
            b bVar = (b) ((Class) f24946a.get(b2)).newInstance();
            b a2 = bVar.a(inputStream);
            if (a2 != null) {
                e.b("PushLogAC2815", "after decode msg:" + a2);
            } else {
                e.d("PushLogAC2815", "call " + bVar.getClass().getSimpleName() + " decode failed!");
            }
            return a2;
        }
        e.d("PushLogAC2815", "cmdId:" + b2 + " is not exist, all:" + f24946a.keySet());
        throw new InstantiationException("cmdId:" + b2 + " is not register");
    }
}
