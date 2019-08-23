package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fh {

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82011a;

        /* renamed from: a  reason: collision with other field name */
        private List<String> f327a = Collections.emptyList();

        /* renamed from: a  reason: collision with other field name */
        private boolean f328a;

        /* renamed from: b  reason: collision with root package name */
        private int f82012b;

        /* renamed from: b  reason: collision with other field name */
        private boolean f329b;

        /* renamed from: c  reason: collision with root package name */
        private int f82013c = -1;

        /* renamed from: c  reason: collision with other field name */
        private boolean f330c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f82014d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f82015e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f82016f;

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }

        public static a b(b bVar) {
            return new a().a(bVar);
        }

        public final int a() {
            if (this.f82013c < 0) {
                b();
            }
            return this.f82013c;
        }

        public final a a(int i) {
            this.f328a = true;
            this.f82011a = i;
            return this;
        }

        public final a a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 8) {
                    a(bVar.c());
                } else if (a2 == 16) {
                    a(bVar.a());
                } else if (a2 == 24) {
                    b(bVar.b());
                } else if (a2 == 32) {
                    b(bVar.a());
                } else if (a2 == 42) {
                    a(bVar.a());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final a a(String str) {
            if (str != null) {
                if (this.f327a.isEmpty()) {
                    this.f327a = new ArrayList();
                }
                this.f327a.add(str);
                return this;
            }
            throw new NullPointerException();
        }

        public final a a(boolean z) {
            this.f329b = true;
            this.f330c = z;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final List<String> m230a() {
            return this.f327a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.b(1, c());
            }
            if (c()) {
                cVar.a(2, b());
            }
            if (d()) {
                cVar.a(3, d());
            }
            if (f()) {
                cVar.a(4, e());
            }
            for (String a2 : a()) {
                cVar.a(5, a2);
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m231a() {
            return this.f328a;
        }

        public final int b() {
            int i = 0;
            int b2 = a() ? c.b(1, c()) + 0 : 0;
            if (c()) {
                b2 += c.a(2, b());
            }
            if (d()) {
                b2 += c.a(3, d());
            }
            if (f()) {
                b2 += c.a(4, e());
            }
            for (String a2 : a()) {
                i += c.a(a2);
            }
            int size = b2 + i + (a().size() * 1);
            this.f82013c = size;
            return size;
        }

        public final a b(int i) {
            this.f82014d = true;
            this.f82012b = i;
            return this;
        }

        public final a b(boolean z) {
            this.f82015e = true;
            this.f82016f = z;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m232b() {
            return this.f330c;
        }

        public final int c() {
            return this.f82011a;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m233c() {
            return this.f329b;
        }

        public final int d() {
            return this.f82012b;
        }

        /* renamed from: d  reason: collision with other method in class */
        public final boolean m234d() {
            return this.f82014d;
        }

        public final int e() {
            return this.f327a.size();
        }

        /* renamed from: e  reason: collision with other method in class */
        public final boolean m235e() {
            return this.f82016f;
        }

        public final boolean f() {
            return this.f82015e;
        }
    }
}
