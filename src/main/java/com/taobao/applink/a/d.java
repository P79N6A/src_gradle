package com.taobao.applink.a;

import android.content.Context;
import com.taobao.applink.f.a.b;

public abstract class d {

    /* renamed from: c  reason: collision with root package name */
    public b f79147c;

    public abstract void a();

    public abstract void a(Context context);

    public abstract void a(Context context, b bVar);

    public abstract void a(Exception exc);

    public void b(Context context, b bVar) {
        if (bVar != null) {
            a(context, bVar);
        } else {
            a(context);
        }
    }
}
