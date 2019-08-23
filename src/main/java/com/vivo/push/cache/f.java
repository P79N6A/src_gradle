package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.model.a;
import com.vivo.push.util.o;
import java.util.ArrayList;
import java.util.List;

public final class f extends d<a> {
    /* access modifiers changed from: protected */
    public final String a() {
        return "com.vivo.pushservice.other";
    }

    public f(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) throws Exception {
        return new String(com.vivo.push.util.f.a(com.vivo.push.util.f.a(f81582a), com.vivo.push.util.f.a(f81583b), Base64.decode(str, 2)), "utf-8");
    }

    public final String c(String str) {
        synchronized (f81584c) {
            for (a aVar : this.f81585d) {
                if (!TextUtils.isEmpty(aVar.a()) && aVar.a().equals(str)) {
                    String b2 = aVar.b();
                    return b2;
                }
            }
            return null;
        }
    }

    public final List<a> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String trim : str.trim().split("@#")) {
            String trim2 = trim.trim();
            String[] split = trim2.trim().split(",");
            if (split.length >= 2) {
                try {
                    arrayList.add(new a(split[0], trim2.substring(split[0].length() + 1)));
                } catch (Exception e2) {
                    o.d("PushConfigSettings", "str2Clients E: ".concat(String.valueOf(e2)));
                }
            }
        }
        return arrayList;
    }
}
