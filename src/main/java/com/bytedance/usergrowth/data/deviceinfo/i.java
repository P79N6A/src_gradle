package com.bytedance.usergrowth.data.deviceinfo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.usergrowth.data.a.a.d;
import com.bytedance.usergrowth.data.a.a.e;
import com.bytedance.usergrowth.data.a.a.g;
import com.bytedance.usergrowth.data.a.b.f;
import com.bytedance.usergrowth.data.a.c;
import com.bytedance.usergrowth.data.deviceinfo.h;

public class i implements f.a, e {

    /* renamed from: a  reason: collision with root package name */
    private Handler f22891a = new f(Looper.getMainLooper(), this);

    /* renamed from: b  reason: collision with root package name */
    private boolean f22892b;

    /* renamed from: c  reason: collision with root package name */
    private long f22893c;

    /* renamed from: d  reason: collision with root package name */
    private h f22894d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22895e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22896f = true;
    private boolean g;

    static d a() {
        return (d) c.a(d.class);
    }

    static g b() {
        return (g) c.a(g.class);
    }

    static e c() {
        return (e) c.a(e.class);
    }

    public final void a(boolean z) {
        this.f22895e = true;
    }

    public final void b(boolean z) {
        this.f22892b = true;
    }

    public final void a(Context context) {
        if (this.f22892b && !this.g) {
            this.g = true;
            a().execute(new c(context, this, this.f22895e, this.f22896f));
        }
        if (this.f22893c > 0 && !this.f22891a.hasMessages(1)) {
            h hVar = new h(context, 10000, this, this.f22891a);
            this.f22894d = hVar;
            this.f22891a.sendEmptyMessage(1);
        }
    }

    public final void a(Message message) {
        if (message != null && message.what == 1 && this.f22893c > 0) {
            a().execute(new h.a(this.f22894d, (byte) 0));
            this.f22891a.sendEmptyMessageDelayed(1, this.f22893c);
        }
    }
}
