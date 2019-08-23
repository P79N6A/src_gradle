package com.facebook.c.b;

import android.graphics.Matrix;
import android.util.SparseArray;
import com.facebook.c.c.c;
import com.facebook.c.c.e;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f23379a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23380b;

    /* renamed from: c  reason: collision with root package name */
    public final List<f> f23381c;

    /* renamed from: d  reason: collision with root package name */
    public final List<d> f23382d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f23383e;

    /* renamed from: f  reason: collision with root package name */
    public final int f23384f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23385a;

        /* renamed from: b  reason: collision with root package name */
        public int f23386b;

        /* renamed from: c  reason: collision with root package name */
        public List<f> f23387c;

        /* renamed from: d  reason: collision with root package name */
        public List<d> f23388d;

        /* renamed from: e  reason: collision with root package name */
        public float[] f23389e;

        /* renamed from: f  reason: collision with root package name */
        public int f23390f;
    }

    public final void a(SparseArray<Matrix> sparseArray, float f2) {
        int size = this.f23382d.size();
        for (int i = 0; i < size; i++) {
            d dVar = this.f23382d.get(i);
            Matrix matrix = sparseArray.get(dVar.f23341a);
            matrix.reset();
            if (dVar.a() != null) {
                dVar.a().a(matrix);
            }
            int size2 = dVar.f23343c.size();
            for (int i2 = 0; i2 < size2; i2++) {
                dVar.f23343c.get(i2).f23332f.a(f2, matrix);
            }
            if (dVar.f23342b > 0) {
                matrix.postConcat(sparseArray.get(dVar.f23342b));
            }
        }
    }

    private k(int i, int i2, List<f> list, List<d> list2, float[] fArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer valueOf = Integer.valueOf(i);
        boolean z4 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f23379a = ((Integer) c.a(valueOf, z, "frame_rate")).intValue();
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f23380b = ((Integer) c.a(valueOf2, z2, "animation_frame_count")).intValue();
        List a2 = e.a(list);
        if (list.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f23381c = (List) c.a(a2, z3, "features");
        List a3 = com.facebook.c.c.a.a(list2);
        this.f23382d = (List) c.a(e.a(a3), c.a(a3), "animation_groups");
        if (fArr.length == 2 && fArr[0] > 0.0f && fArr[1] > 0.0f) {
            z4 = true;
        }
        this.f23383e = (float[]) c.a(fArr, z4, "canvas_size");
        this.f23384f = i3;
    }

    public /* synthetic */ k(int i, int i2, List list, List list2, float[] fArr, int i3, byte b2) {
        this(i, i2, list, list2, fArr, i3);
    }
}
