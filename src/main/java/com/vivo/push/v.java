package com.vivo.push;

import android.content.Context;
import com.vivo.push.b.n;
import com.vivo.push.util.o;

public abstract class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Context f81705a;

    /* renamed from: b  reason: collision with root package name */
    private int f81706b = -1;

    /* renamed from: c  reason: collision with root package name */
    private y f81707c;

    /* access modifiers changed from: protected */
    public abstract void a(y yVar);

    public final int a() {
        return this.f81706b;
    }

    public final void run() {
        if (this.f81705a != null && !(this.f81707c instanceof n)) {
            Context context = this.f81705a;
            o.a(context, "[执行指令]" + this.f81707c);
        }
        a(this.f81707c);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        if (this.f81707c == null) {
            str = "[null]";
        } else {
            str = this.f81707c.toString();
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public v(y yVar) {
        this.f81707c = yVar;
        this.f81706b = yVar.b();
        if (this.f81706b >= 0) {
            this.f81705a = p.a().h();
            return;
        }
        throw new IllegalArgumentException("PushTask need a > 0 task id.");
    }
}
