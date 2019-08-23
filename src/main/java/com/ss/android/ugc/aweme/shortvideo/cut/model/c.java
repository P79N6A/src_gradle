package com.ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.ak;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66476a;

    /* renamed from: b  reason: collision with root package name */
    HashMap<String, Float> f66477b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, Float> f66478c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public long f66479d;

    /* renamed from: e  reason: collision with root package name */
    public long f66480e;

    /* renamed from: f  reason: collision with root package name */
    public float f66481f;
    public long g;
    public float h;
    public long i;
    public long j;
    private float k;

    public final long a(int i2) {
        if (i2 == 2 || i2 == 0) {
            return this.f66480e;
        }
        return this.f66479d;
    }

    public c(List<h> list, float f2) {
        this.k = f2;
        for (h next : list) {
            this.f66477b.put(next.f66495b, Float.valueOf(next.f66499f));
        }
    }

    public final void a(String str, float f2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2)}, this, f66476a, false, 75849, new Class[]{String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2)}, this, f66476a, false, 75849, new Class[]{String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f66477b.put(str2, Float.valueOf(f2));
    }

    private static long b(List<h> list, float f2) {
        if (PatchProxy.isSupport(new Object[]{list, Float.valueOf(f2)}, null, f66476a, true, 75848, new Class[]{List.class, Float.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{list, Float.valueOf(f2)}, null, f66476a, true, 75848, new Class[]{List.class, Float.TYPE}, Long.TYPE)).longValue();
        } else if (Lists.isEmpty(list)) {
            ai.c("videoSegmentList is empty");
            return 0;
        } else {
            float f3 = 0.0f;
            for (h next : list) {
                if (!next.j) {
                    f3 += ((float) (next.f66498e - next.f66497d)) / (next.f66499f * f2);
                }
            }
            return (long) f3;
        }
    }

    public final void a(List<h> list, float f2) {
        int i2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{list, Float.valueOf(f2)}, this, f66476a, false, 75843, new Class[]{List.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Float.valueOf(f2)}, this, f66476a, false, 75843, new Class[]{List.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f66479d = b(list, f2);
        this.g = ak.a(this.f66479d);
        StringBuilder sb = new StringBuilder("videoMultiDur: ");
        sb.append(this.f66479d);
        sb.append(" maxCutDuration is ");
        sb.append(this.g);
        sb.append(" videoSize is ");
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        sb.append(i2);
        ai.c(sb.toString());
        if (this.i > 0) {
            this.g = Math.min(this.f66479d, this.i);
        }
        this.f66481f = ((float) this.g) / this.k;
        float f4 = this.f66481f;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f4)}, null, ak.f66355a, true, 75510, new Class[]{Float.TYPE}, Float.TYPE)) {
            f3 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f4)}, null, ak.f66355a, true, 75510, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        } else {
            f3 = (((float) ff.a()) * 1.0f) / f4;
        }
        this.h = f3;
        if (this.j > 0) {
            this.h = ((float) this.j) / this.f66481f;
        }
        for (Map.Entry next : this.f66477b.entrySet()) {
            this.f66478c.put(next.getKey(), Float.valueOf(this.f66481f * ((Float) next.getValue()).floatValue() * f2));
        }
    }

    public final float a(List<h> list, long j2, float f2) {
        List<h> list2 = list;
        long j3 = j2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list2, new Long(j3), Float.valueOf(f2)}, this, f66476a, false, 75845, new Class[]{List.class, Long.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{list2, new Long(j3), Float.valueOf(f2)}, this, f66476a, false, 75845, new Class[]{List.class, Long.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!list2.get(i3).j) {
                arrayList.add(list2.get(i3));
            }
        }
        int i4 = 0;
        float f3 = 0.0f;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            h hVar = (h) arrayList.get(i4);
            if (j3 <= hVar.f66496c) {
                i2 = i4;
                break;
            }
            f3 += ((float) (hVar.f66498e - hVar.f66497d)) / ((hVar.f66499f * f2) * this.f66481f);
            j3 -= hVar.f66496c;
            i4++;
        }
        if (arrayList.isEmpty()) {
            return f3;
        }
        return f3 + (((float) (j3 - ((h) arrayList.get(i2)).f66497d)) / ((((h) arrayList.get(i2)).f66499f * f2) * this.f66481f));
    }

    public final long a(List<h> list, float f2, float f3) {
        List<h> list2 = list;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list2, Float.valueOf(f2), Float.valueOf(f3)}, this, f66476a, false, 75844, new Class[]{List.class, Float.TYPE, Float.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{list2, Float.valueOf(f2), Float.valueOf(f3)}, this, f66476a, false, 75844, new Class[]{List.class, Float.TYPE, Float.TYPE}, Long.TYPE)).longValue();
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!list2.get(i3).j) {
                arrayList.add(list2.get(i3));
            }
        }
        long j2 = 0;
        float f4 = f2;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            h hVar = (h) arrayList.get(i4);
            j2 += hVar.f66496c;
            if (f4 <= ((float) (hVar.f66498e - hVar.f66497d)) / (hVar.f66499f * f3)) {
                i2 = i4;
                break;
            }
            f4 -= ((float) (hVar.f66498e - hVar.f66497d)) / (hVar.f66499f * f3);
            i4++;
        }
        if (i4 == arrayList.size()) {
            return (j2 - ((h) arrayList.get(i2)).f66496c) + ((h) arrayList.get(i2)).f66498e;
        }
        return (long) (((float) ((j2 - ((h) arrayList.get(i2)).f66496c) + ((h) arrayList.get(i2)).f66497d)) + (f4 * ((h) arrayList.get(i2)).f66499f * f3));
    }

    public final int b(List<h> list, float f2, float f3) {
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Float.valueOf(f2), Float.valueOf(f3)}, this, f66476a, false, 75847, new Class[]{List.class, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list2, Float.valueOf(f2), Float.valueOf(f3)}, this, f66476a, false, 75847, new Class[]{List.class, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        float f4 = 0.0f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            h hVar = list2.get(i2);
            f4 += ((float) (hVar.f66498e - hVar.f66497d)) / (hVar.f66499f * f3);
            if (f2 <= f4) {
                return i2;
            }
        }
        return list.size() - 1;
    }

    public final void a(long j2, String str, float f2, int i2) {
        float f3;
        long j3 = j2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), str2, Float.valueOf(f2), Integer.valueOf(i2)}, this, f66476a, false, 75842, new Class[]{Long.TYPE, String.class, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), str2, Float.valueOf(f2), Integer.valueOf(i2)}, this, f66476a, false, 75842, new Class[]{Long.TYPE, String.class, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        long j4 = (long) (((float) j3) / f2);
        this.f66480e = j4;
        this.g = ak.a(j4);
        ai.c("path: " + str2 + " maxCutDuration is " + this.g);
        if (this.i > 0) {
            this.g = Math.min(this.i, this.f66480e);
        }
        this.f66481f = ((float) this.g) / this.k;
        if (i2 == 0) {
            float f4 = this.f66481f;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f4)}, null, ak.f66355a, true, 75511, new Class[]{Float.TYPE}, Float.TYPE)) {
                f3 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f4)}, null, ak.f66355a, true, 75511, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
            } else {
                f3 = (((float) ff.a()) * 1.0f) / f4;
            }
            this.h = f3;
        } else {
            this.h = 500.0f / this.f66481f;
        }
        if (this.j > 0) {
            this.h = ((float) this.j) / this.f66481f;
        }
        this.f66478c.put(str2, Float.valueOf(this.f66481f * f2));
    }
}
