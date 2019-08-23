package com.bytedance.crash.runtime;

import com.bytedance.crash.i.d;
import com.bytedance.crash.runtime.i;

public final class c {
    public static long a(int i) {
        String[] e2 = d.e("/proc/self/task/" + i + "/stat");
        if (e2 == null) {
            return -1;
        }
        return (Long.parseLong(e2[11]) * i.a.a()) + (Long.parseLong(e2[12]) * i.a.a());
    }
}
