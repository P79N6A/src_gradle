package com.bytedance.b.a.a.c;

import com.bytedance.b.a.a.c.b;
import com.bytedance.b.a.a.f.b;
import com.bytedance.b.a.a.g.d;
import java.util.List;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public C0144a f19140a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19141b;

    /* renamed from: com.bytedance.b.a.a.c.a$a  reason: collision with other inner class name */
    public interface C0144a {
        List<b> a(int i, int i2, int i3, List<Integer> list);
    }

    public final void e() {
        h();
    }

    public final synchronized void b() {
        super.b();
        if (this.f19141b) {
            h();
        }
    }

    private synchronized void h() {
        if (this.f19148f == b.a.STARTED) {
            this.g.post(new Runnable() {
                public final void run() {
                    a.this.f19147e.a(a.this.f19140a.a(a.this.f19147e.r, a.this.f19147e.s, a.this.f19147e.f19191f, a.this.f19147e.g));
                }
            });
        }
    }

    public final synchronized void a(int i) {
        super.a(i);
        if (this.f19141b) {
            h();
        }
    }

    public final synchronized void c(int i) {
        super.c(i);
        if (this.f19141b) {
            h();
        }
    }

    public a(com.bytedance.b.a.a.f.a aVar, d dVar, C0144a aVar2) {
        this(aVar, dVar, null, aVar2);
    }

    private a(com.bytedance.b.a.a.f.a aVar, d dVar, com.bytedance.b.a.a.a.b bVar, C0144a aVar2) {
        super(aVar, dVar, null);
        this.f19141b = true;
        this.f19140a = aVar2;
    }
}
