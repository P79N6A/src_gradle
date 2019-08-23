package com.bytedance.apm.k;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public final class r<E extends Comparable> {

    /* renamed from: a  reason: collision with root package name */
    private PriorityQueue<E> f19041a;

    /* renamed from: b  reason: collision with root package name */
    private int f19042b;

    public final List<E> a() {
        ArrayList arrayList = new ArrayList(this.f19041a);
        Collections.sort(arrayList);
        return arrayList;
    }

    public r(int i) {
        if (i > 0) {
            this.f19042b = i;
            this.f19041a = new PriorityQueue<>(i, new Comparator<E>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Comparable) obj).compareTo((Comparable) obj2);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(E e2) {
        if (this.f19041a.size() < this.f19042b) {
            this.f19041a.add(e2);
            return;
        }
        if (e2.compareTo((Comparable) this.f19041a.peek()) > 0) {
            this.f19041a.poll();
            this.f19041a.add(e2);
        }
    }
}
