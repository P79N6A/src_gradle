package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.f;
import com.vivo.push.util.o;
import com.vivo.push.util.y;
import java.util.ArrayList;
import java.util.List;

public final class a extends d<com.vivo.push.model.a> {
    /* access modifiers changed from: protected */
    public final String a() {
        return "com.vivo.pushservice.back_up";
    }

    public final int b() {
        com.vivo.push.model.a c2 = c("push_mode");
        if (c2 == null || TextUtils.isEmpty(c2.b())) {
            return -1;
        }
        try {
            return Integer.parseInt(c2.b());
        } catch (Exception unused) {
            return -1;
        }
    }

    public a(Context context) {
        super(context);
    }

    public static boolean a(int i) {
        if (i == -1) {
            return y.b("persist.sys.log.ctrl", "no").equals("yes");
        }
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) throws Exception {
        return new String(f.a(f.a(f81582a), f.a(f81583b), Base64.decode(str, 2)), "utf-8");
    }

    public final com.vivo.push.model.a c(String str) {
        synchronized (f81584c) {
            for (com.vivo.push.model.a aVar : this.f81585d) {
                if (!TextUtils.isEmpty(aVar.a()) && aVar.a().equals(str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public final List<com.vivo.push.model.a> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String trim : str.trim().split("@#")) {
                String trim2 = trim.trim();
                String[] split = trim2.trim().split(",");
                if (split.length >= 2) {
                    try {
                        arrayList.add(new com.vivo.push.model.a(split[0], trim2.substring(split[0].length() + 1)));
                    } catch (Exception e2) {
                        o.d("AppConfigSettings", "str2Clients E: ".concat(String.valueOf(e2)));
                    }
                }
            }
        }
        return arrayList;
    }
}
