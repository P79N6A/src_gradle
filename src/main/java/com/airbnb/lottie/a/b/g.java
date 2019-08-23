package com.airbnb.lottie.a.b;

import android.graphics.Path;
import com.airbnb.lottie.c.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<l, Path>> f4651a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a<Integer, Integer>> f4652b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.airbnb.lottie.c.b.g> f4653c;

    public g(List<com.airbnb.lottie.c.b.g> list) {
        this.f4653c = list;
        this.f4651a = new ArrayList(list.size());
        this.f4652b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f4651a.add(list.get(i).f4722b.a());
            this.f4652b.add(list.get(i).f4723c.a());
        }
    }
}
