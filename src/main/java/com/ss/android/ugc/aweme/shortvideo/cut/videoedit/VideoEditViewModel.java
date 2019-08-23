package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.v4.util.Pair;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.e;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.tools.am;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class VideoEditViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66560a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Integer> f66561b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<Boolean> f66562c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Float> f66563d = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    public MutableLiveData<Long> f66564e = new MutableLiveData<>();

    /* renamed from: f  reason: collision with root package name */
    public MutableLiveData<Void> f66565f = new MutableLiveData<>();
    public MutableLiveData<Void> g = new MutableLiveData<>();
    public MutableLiveData<Void> h = new MutableLiveData<>();
    public MutableLiveData<Void> i = new MutableLiveData<>();
    public MutableLiveData<Void> j = new MutableLiveData<>();
    public MutableLiveData<Void> k = new MutableLiveData<>();
    public MutableLiveData<Void> l = new MutableLiveData<>();
    public MutableLiveData<Float> m = new MutableLiveData<>();
    public MutableLiveData<Pair<Integer, Integer>> n = new MutableLiveData<>();
    public MutableLiveData<Void> o = new MutableLiveData<>();
    public MutableLiveData<Void> p = new MutableLiveData<>();
    public MutableLiveData<h> q = new MutableLiveData<>();
    public MutableLiveData<com.ss.android.ugc.aweme.shortvideo.cut.model.a> r = new MutableLiveData<>();
    public a s;
    private HashMap<String, Integer> t = new HashMap<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface CutState {
    }

    public interface a {
        void a(h hVar);

        void b(h hVar);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66560a, false, 75976, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66560a, false, 75976, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f66562c.setValue(Boolean.valueOf(z));
    }

    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f66560a, false, 75978, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f66560a, false, 75978, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f66564e.setValue(Long.valueOf(j2));
    }

    public final void a(List<com.ss.android.ugc.aweme.music.b.a.a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f66560a, false, 75993, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f66560a, false, 75993, new Class[]{List.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (Lists.notEmpty(list)) {
            for (com.ss.android.ugc.aweme.music.b.a.a hVar : list) {
                arrayList.add(new h(hVar));
            }
        }
        com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar = new com.ss.android.ugc.aweme.shortvideo.cut.model.a();
        aVar.setVideoSegmentList(arrayList);
        aVar.totalSpeed = am.NORMAL.value();
        a(aVar);
    }

    public final void a(e eVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i2)}, this, f66560a, false, 76002, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i2)}, this, f66560a, false, 76002, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        h hVar = ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList().get(i2);
        hVar.f66499f = eVar.f66488d;
        hVar.f66497d = eVar.f66485a;
        hVar.f66498e = eVar.f66486b;
        hVar.k = eVar.f66487c;
        if (this.s != null) {
            this.s.a(hVar);
        }
    }

    public final List<h> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f66560a, false, 75996, new Class[0], List.class)) {
            return ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f66560a, false, 75996, new Class[0], List.class);
    }

    public final List<h> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f66560a, false, 75998, new Class[0], List.class)) {
            return ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f66560a, false, 75998, new Class[0], List.class);
    }

    public final float d() {
        if (!PatchProxy.isSupport(new Object[0], this, f66560a, false, 75999, new Class[0], Float.TYPE)) {
            return ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).totalSpeed;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66560a, false, 75999, new Class[0], Float.TYPE)).floatValue();
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f66560a, false, 76005, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66560a, false, 76005, new Class[0], Boolean.TYPE)).booleanValue();
        }
        for (h hVar : ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList()) {
            if (hVar.f66499f != am.NORMAL.value()) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66560a, false, 75982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66560a, false, 75982, new Class[0], Void.TYPE);
            return;
        }
        this.j.setValue(null);
    }

    private void a(com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar) {
        com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f66560a, false, 75992, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f66560a, false, 75992, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.model.a.class}, Void.TYPE);
            return;
        }
        this.r.setValue(aVar2);
    }

    public final int a(String str) {
        String str2 = str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f66560a, false, 75997, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f66560a, false, 75997, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        for (h hVar : ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList()) {
            if (hVar.f66495b.equals(str2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66560a, false, 75995, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66560a, false, 75995, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        h hVar = ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList().get(i2);
        if (this.t.containsKey(hVar.f66495b)) {
            return this.t.get(hVar.f66495b).intValue();
        }
        return 0;
    }

    public final h c(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66560a, false, 76001, new Class[]{Integer.TYPE}, h.class)) {
            return ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList().get(i2);
        }
        return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66560a, false, 76001, new Class[]{Integer.TYPE}, h.class);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f66560a, false, 76004, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f66560a, false, 76004, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Iterator<h> it2 = ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            h next = it2.next();
            if (next.f66495b.equals(str)) {
                if (this.s != null) {
                    this.s.b(next);
                }
                next.j = true;
            }
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66560a, false, 75977, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66560a, false, 75977, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f66563d.setValue(Float.valueOf(f2));
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66560a, false, 75975, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66560a, false, 75975, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f66561b.setValue(Integer.valueOf(i2));
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66560a, false, 75994, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66560a, false, 75994, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.t.put(((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.r.getValue()).getVideoSegmentList().get(i2).f66495b, Integer.valueOf(i3));
    }
}
