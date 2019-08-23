package com.bytedance.frameworks.core.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.frameworks.core.a.b.e;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static HandlerThread f19944c;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f19945a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public Handler f19946b;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f19947d = new Runnable() {
        public final void run() {
            d.this.f19946b.sendEmptyMessage(13);
            d.this.f19946b.sendEmptyMessage(14);
            if (d.this.f19945a != null && !d.this.f19945a.isEmpty()) {
                for (a a2 : d.this.f19945a) {
                    a2.a();
                }
            }
            d.this.f19946b.postDelayed(this, ea.f66827f);
        }
    };

    public interface a {
        void a();
    }

    public final void a(e eVar) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = eVar;
        this.f19946b.sendMessage(obtain);
    }

    public final void a(boolean z) {
        Message obtain = Message.obtain();
        obtain.what = 9;
        obtain.obj = Boolean.valueOf(z);
        this.f19946b.sendMessage(obtain);
    }

    public d(Context context, String str) {
        if (f19944c == null) {
            HandlerThread handlerThread = new HandlerThread("monitorlib", 5);
            f19944c = handlerThread;
            handlerThread.start();
        }
        this.f19946b = new g(f19944c.getLooper(), context, str);
        this.f19946b.sendEmptyMessage(1);
        this.f19946b.post(this.f19947d);
    }

    public final void a(String str, String str2, String str3, boolean z, boolean z2) {
        Message obtain = Message.obtain();
        obtain.what = 10;
        obtain.arg1 = z2 ? 1 : 0;
        obtain.obj = new com.bytedance.frameworks.core.a.b.d().a(str).b(str2).c(str3).a(z);
        this.f19946b.sendMessage(obtain);
    }
}
