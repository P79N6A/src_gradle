package com.alipay.b.b.a.a.a;

import com.alipay.a.a.f;
import com.alipay.b.b.a.a.c;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    private int f5240c;

    /* renamed from: d  reason: collision with root package name */
    private Object f5241d;

    public e(int i, String str, Object obj) {
        super(str, obj);
        this.f5240c = i;
    }

    public final void a(Object obj) {
        this.f5241d = obj;
    }

    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f5241d != null) {
                arrayList.add(new BasicNameValuePair("extParam", f.a(this.f5241d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f5238a));
            arrayList.add(new BasicNameValuePair("id", this.f5240c));
            new StringBuilder("mParams is:").append(this.f5239b);
            arrayList.add(new BasicNameValuePair("requestData", this.f5239b == null ? "[]" : f.a(this.f5239b)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("request  =");
            sb.append(this.f5239b);
            sb.append(":");
            sb.append(e2);
            throw new c(9, sb.toString() == null ? "" : e2.getMessage(), e2);
        }
    }
}
