package com.google.common.b;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
public abstract class a<K, V> implements b<K, V> {

    /* renamed from: com.google.common.b.a$a  reason: collision with other inner class name */
    public static final class C0279a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final h f24426a = i.a();

        /* renamed from: b  reason: collision with root package name */
        private final h f24427b = i.a();

        /* renamed from: c  reason: collision with root package name */
        private final h f24428c = i.a();

        /* renamed from: d  reason: collision with root package name */
        private final h f24429d = i.a();

        /* renamed from: e  reason: collision with root package name */
        private final h f24430e = i.a();

        /* renamed from: f  reason: collision with root package name */
        private final h f24431f = i.a();

        public final void a() {
            this.f24431f.increment();
        }

        public final e b() {
            e eVar = new e(this.f24426a.sum(), this.f24427b.sum(), this.f24428c.sum(), this.f24429d.sum(), this.f24430e.sum(), this.f24431f.sum());
            return eVar;
        }

        public final void b(int i) {
            this.f24427b.add((long) i);
        }

        public final void a(int i) {
            this.f24426a.add((long) i);
        }

        public final void b(long j) {
            this.f24429d.increment();
            this.f24430e.add(j);
        }

        public final void a(long j) {
            this.f24428c.increment();
            this.f24430e.add(j);
        }

        public final void a(b bVar) {
            e b2 = bVar.b();
            this.f24426a.add(b2.f24443a);
            this.f24427b.add(b2.f24444b);
            this.f24428c.add(b2.f24445c);
            this.f24429d.add(b2.f24446d);
            this.f24430e.add(b2.f24447e);
            this.f24431f.add(b2.f24448f);
        }
    }

    public interface b {
        void a();

        void a(int i);

        void a(long j);

        e b();

        void b(int i);

        void b(long j);
    }
}
