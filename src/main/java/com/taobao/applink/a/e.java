package com.taobao.applink.a;

import android.content.Context;
import com.taobao.applink.f.a.b;

public class e extends d {
    public void a() {
        if (this.f79147c != null) {
            this.f79147c.a("{\"result\":true}");
        }
    }

    public void a(Context context) {
    }

    public void a(Context context, b bVar) {
        this.f79147c = bVar;
    }

    public void a(Exception exc) {
        if (this.f79147c != null) {
            this.f79147c.a("{\"result\":false}");
        }
    }
}
