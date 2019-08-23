package com.airbnb.lottie.c.a;

import com.airbnb.lottie.g.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<a<V>> f4696a;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f4696a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f4696a.toArray()));
        }
        return sb.toString();
    }

    n(List<a<V>> list) {
        this.f4696a = list;
    }

    n(V v) {
        this(Collections.singletonList(new a(v)));
    }
}
