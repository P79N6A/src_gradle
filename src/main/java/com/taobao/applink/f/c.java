package com.taobao.applink.f;

import android.text.TextUtils;
import android.webkit.WebView;
import com.taobao.applink.f.a.b;
import java.util.List;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebView f79187a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f79188b;

    c(b bVar, WebView webView) {
        this.f79188b = bVar;
        this.f79187a = webView;
    }

    public void a(String str) {
        try {
            List f2 = f.f(str);
            if (f2 != null && f2.size() != 0) {
                for (int i = 0; i < f2.size(); i++) {
                    f fVar = (f) f2.get(i);
                    String a2 = fVar.a();
                    if (!TextUtils.isEmpty(a2)) {
                        ((b) this.f79188b.f79183b.get(a2)).a(fVar.b());
                        this.f79188b.f79183b.remove(a2);
                    } else {
                        String c2 = fVar.c();
                        (!TextUtils.isEmpty(fVar.e()) ? (com.taobao.applink.f.a.c) this.f79188b.f79184c.get(fVar.e()) : this.f79188b.f79185d).a(fVar.d(), !TextUtils.isEmpty(c2) ? new d(this, c2) : new e(this));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
