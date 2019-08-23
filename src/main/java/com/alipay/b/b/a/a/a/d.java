package com.alipay.b.b.a.a.a;

import com.alipay.a.a.e;
import com.alipay.b.b.a.a.c;
import java.lang.reflect.Type;
import org.json.JSONObject;

public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    public final Object a() {
        try {
            String str = new String(this.f5237b);
            StringBuilder sb = new StringBuilder("threadid = ");
            sb.append(Thread.currentThread().getId());
            sb.append("; rpc response:  ");
            sb.append(str);
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultStatus");
            if (i == 1000) {
                return this.f5236a == String.class ? jSONObject.optString("result") : e.a(jSONObject.optString("result"), this.f5236a);
            }
            throw new c(Integer.valueOf(i), jSONObject.optString("tips"));
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("response  =");
            sb2.append(new String(this.f5237b));
            sb2.append(":");
            sb2.append(e2);
            throw new c((Integer) 10, sb2.toString() == null ? "" : e2.getMessage());
        }
    }
}
