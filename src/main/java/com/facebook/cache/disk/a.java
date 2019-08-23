package com.facebook.cache.disk;

import com.facebook.cache.disk.c;

public final class a implements g {
    public final f a() {
        return new f() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                long b2 = ((c.C0253c) obj).b();
                long b3 = ((c.C0253c) obj2).b();
                if (b2 < b3) {
                    return -1;
                }
                if (b3 == b2) {
                    return 0;
                }
                return 1;
            }
        };
    }
}
