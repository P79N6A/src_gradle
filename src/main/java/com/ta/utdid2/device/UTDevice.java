package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.b.a.i;

public class UTDevice {
    public static String getUtdid(Context context) {
        a b2 = b.b(context);
        if (b2 == null || i.a(b2.f())) {
            return "ffffffffffffffffffffffff";
        }
        return b2.f();
    }

    public static String getUtdidForUpdate(Context context) {
        String h = c.a(context).h();
        if (h == null || i.a(h)) {
            return "ffffffffffffffffffffffff";
        }
        return h;
    }
}
