package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.f;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CutMultiVideoViewModel extends ViewModel implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66179a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Pair<Integer, Integer>> f66180b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, Integer> f66181c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Long> f66182d = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    public MutableLiveData<Long> f66183e = new MutableLiveData<>();

    /* renamed from: f  reason: collision with root package name */
    public MutableLiveData<Float> f66184f = new MutableLiveData<>();
    public MutableLiveData<Void> g = new MutableLiveData<>();
    public MutableLiveData<h> h = new MutableLiveData<>();
    public MutableLiveData<Pair<Integer, Integer>> i = new MutableLiveData<>();
    public MutableLiveData<Void> j = new MutableLiveData<>();
    public MutableLiveData<Void> k = new MutableLiveData<>();
    public MutableLiveData<f> l = new MutableLiveData<>();
    public boolean m;
    public int n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SwapState {
    }

    public final void a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f66179a, false, 75494, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f66179a, false, 75494, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.h.setValue(hVar2);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66179a, false, 75489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66179a, false, 75489, new Class[0], Void.TYPE);
            return;
        }
        this.f66180b.setValue(Pair.create(0, 0));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66179a, false, 75493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66179a, false, 75493, new Class[0], Void.TYPE);
            return;
        }
        this.g.setValue(null);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f66179a, false, 75496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66179a, false, 75496, new Class[0], Void.TYPE);
            return;
        }
        this.j.setValue(null);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f66179a, false, 75497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66179a, false, 75497, new Class[0], Void.TYPE);
            return;
        }
        this.k.setValue(null);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66179a, false, 75492, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66179a, false, 75492, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f66184f.setValue(Float.valueOf(f2));
    }

    public final void a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f66179a, false, 75487, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f66179a, false, 75487, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.l.setValue(fVar2);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66179a, false, 75495, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66179a, false, 75495, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.setValue(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public final void a(long j2, List<h> list) {
        int i2;
        long j3 = j2;
        List<h> list2 = list;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), list2}, this, f66179a, false, 75498, new Class[]{Long.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), list2}, this, f66179a, false, 75498, new Class[]{Long.TYPE, List.class}, Void.TYPE);
            return;
        }
        this.f66182d.setValue(Long.valueOf(j2));
        if (this.f66180b.getValue() != null) {
            i2 = ((Integer) ((Pair) this.f66180b.getValue()).second).intValue();
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!list2.get(i4).j) {
                arrayList.add(list2.get(i4));
            }
        }
        long j4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= arrayList.size()) {
                break;
            }
            j4 += ((h) arrayList.get(i5)).f66496c;
            if (j4 > j3) {
                i3 = i5;
                break;
            }
            i5++;
        }
        if (j3 > 0) {
            this.f66180b.setValue(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public final void a(long j2, List<h> list, float f2) {
        int i2;
        long j3 = j2;
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), list2, Float.valueOf(f2)}, this, f66179a, false, 75499, new Class[]{Long.TYPE, List.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), list2, Float.valueOf(f2)}, this, f66179a, false, 75499, new Class[]{Long.TYPE, List.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f66183e.setValue(Long.valueOf(j2));
        if (this.f66180b.getValue() != null) {
            i2 = ((Integer) ((Pair) this.f66180b.getValue()).second).intValue();
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!list2.get(i3).j) {
                arrayList.add(list2.get(i3));
            }
        }
        long j4 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            h hVar = (h) arrayList.get(i4);
            j4 = (long) (((float) j4) + (((float) (hVar.f66498e - hVar.f66497d)) / (hVar.f66499f * f2)));
            if (j4 > j3) {
                this.f66180b.setValue(Pair.create(Integer.valueOf(i2), Integer.valueOf(i4)));
                return;
            }
        }
    }
}
