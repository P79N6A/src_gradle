package com.facebook.c.b;

import com.facebook.c.c.e;
import com.facebook.c.c.f;
import java.util.ArrayList;
import java.util.List;

public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f23366a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23367b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23368a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f23369b;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<f> f23370a;

        public b(List<String> list) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(f.a(list.get(i)));
            }
            this.f23370a = e.a(arrayList);
        }
    }

    public final int a() {
        return this.f23367b;
    }

    public h(int i, List<String> list) {
        this.f23367b = i;
        this.f23366a = new b(list);
    }
}
