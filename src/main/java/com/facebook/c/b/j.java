package com.facebook.c.b;

import com.facebook.c.c.c;
import com.facebook.c.c.e;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f23375a;

    /* renamed from: b  reason: collision with root package name */
    public final float[][][] f23376b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<e> f23377a;

        /* renamed from: b  reason: collision with root package name */
        public float[][][] f23378b;
    }

    public j(List<e> list, float[][][] fArr) {
        this.f23375a = e.a(list);
        this.f23376b = (float[][][]) c.a(fArr, c.a(fArr, this.f23375a.size()), "timing_curves");
    }
}
