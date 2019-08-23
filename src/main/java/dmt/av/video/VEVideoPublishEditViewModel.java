package dmt.av.video;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.y;
import com.ss.android.ugc.aweme.n.a;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.a.b;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import java.util.ArrayList;

public class VEVideoPublishEditViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82807a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<v> f82808b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<EffectPointModel> f82809c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private MutableLiveData<u> f82810d;

    /* renamed from: e  reason: collision with root package name */
    private MutableLiveData<t> f82811e;

    /* renamed from: f  reason: collision with root package name */
    private MutableLiveData<o> f82812f;
    private MutableLiveData<h> g;
    private f<p> h;
    private MutableLiveData<s> i;
    private h<x> j;
    private MutableLiveData<VEVolumeChangeOp> k;
    private MutableLiveData<r> l;
    private MutableLiveData<Boolean> m;
    private MutableLiveData<a> n;
    private MutableLiveData<v> o;
    private MutableLiveData<w> p;
    private MutableLiveData<VEEffectSelectOp> q;
    private MutableLiveData<Boolean> r;
    private MutableLiveData<Float> s;
    private h<j> t;
    private MutableLiveData<AudioEffectParam> u;
    private MutableLiveData<Boolean> v;
    private MutableLiveData<b> w;

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92117, new Class[0], Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = new MutableLiveData<>();
            this.g.setValue(y.a());
        }
    }

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92120, new Class[0], Void.TYPE);
            return;
        }
        if (this.h == null) {
            this.h = new f<>();
        }
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92121, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = new MutableLiveData<>();
        }
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92123, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new h<>();
        }
    }

    private void y() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92125, new Class[0], Void.TYPE);
            return;
        }
        if (this.k == null) {
            this.k = new MutableLiveData<>();
        }
    }

    @NonNull
    public final MutableLiveData<u> a() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92104, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92104, new Class[0], MutableLiveData.class);
        }
        if (this.f82810d == null) {
            this.f82810d = new MutableLiveData<>();
        }
        return this.f82810d;
    }

    @NonNull
    public final h<j> b() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92105, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92105, new Class[0], h.class);
        }
        if (this.t == null) {
            this.t = new h<>();
        }
        return this.t;
    }

    @NonNull
    public final MutableLiveData<AudioEffectParam> c() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92106, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92106, new Class[0], MutableLiveData.class);
        }
        if (this.u == null) {
            this.u = new MutableLiveData<>();
        }
        return this.u;
    }

    @NonNull
    public final MutableLiveData<t> d() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92107, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92107, new Class[0], MutableLiveData.class);
        }
        if (this.f82811e == null) {
            this.f82811e = new MutableLiveData<>();
        }
        return this.f82811e;
    }

    @NonNull
    public final MutableLiveData<v> e() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92108, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92108, new Class[0], MutableLiveData.class);
        }
        if (this.o == null) {
            this.o = new MutableLiveData<>();
        }
        return this.o;
    }

    @NonNull
    public final MutableLiveData<w> f() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92109, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92109, new Class[0], MutableLiveData.class);
        }
        if (this.p == null) {
            this.p = new MutableLiveData<>();
        }
        return this.p;
    }

    @NonNull
    public final MutableLiveData<VEEffectSelectOp> g() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92110, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92110, new Class[0], MutableLiveData.class);
        }
        if (this.q == null) {
            this.q = new MutableLiveData<>();
        }
        return this.q;
    }

    @NonNull
    public final MutableLiveData<Float> h() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92111, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92111, new Class[0], MutableLiveData.class);
        }
        if (this.s == null) {
            this.s = new MutableLiveData<>();
        }
        return this.s;
    }

    @NonNull
    public final MutableLiveData<Boolean> i() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92112, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92112, new Class[0], MutableLiveData.class);
        }
        if (this.r == null) {
            this.r = new MutableLiveData<>();
        }
        return this.r;
    }

    @NonNull
    public final MutableLiveData<o> j() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92114, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92114, new Class[0], MutableLiveData.class);
        }
        if (this.f82812f == null) {
            this.f82812f = new MutableLiveData<>();
        }
        return this.f82812f;
    }

    @NonNull
    public final LiveData<h> k() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92115, new Class[0], LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92115, new Class[0], LiveData.class);
        }
        u();
        return this.g;
    }

    @NonNull
    public final f<p> l() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92118, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92118, new Class[0], f.class);
        }
        v();
        return this.h;
    }

    @NonNull
    public final MutableLiveData<s> m() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92119, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92119, new Class[0], MutableLiveData.class);
        }
        w();
        return this.i;
    }

    @NonNull
    public final h<x> n() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92122, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92122, new Class[0], h.class);
        }
        x();
        return this.j;
    }

    @NonNull
    public final MutableLiveData<VEVolumeChangeOp> o() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92124, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92124, new Class[0], MutableLiveData.class);
        }
        y();
        return this.k;
    }

    @NonNull
    public final MutableLiveData<r> p() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92126, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92126, new Class[0], MutableLiveData.class);
        }
        if (this.l == null) {
            this.l = new MutableLiveData<>();
        }
        return this.l;
    }

    @NonNull
    public final MutableLiveData<Boolean> q() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92127, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92127, new Class[0], MutableLiveData.class);
        }
        if (this.m == null) {
            this.m = new MutableLiveData<>();
        }
        return this.m;
    }

    @NonNull
    public final MutableLiveData<a> r() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92128, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92128, new Class[0], MutableLiveData.class);
        }
        if (this.n == null) {
            this.n = new MutableLiveData<>();
        }
        return this.n;
    }

    public final MutableLiveData<Boolean> s() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92129, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92129, new Class[0], MutableLiveData.class);
        }
        if (this.v == null) {
            this.v = new MutableLiveData<>();
            this.v.setValue(Boolean.FALSE);
        }
        return this.v;
    }

    @NonNull
    public final MutableLiveData<b> t() {
        if (PatchProxy.isSupport(new Object[0], this, f82807a, false, 92130, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f82807a, false, 92130, new Class[0], MutableLiveData.class);
        }
        if (this.w == null) {
            this.w = new MutableLiveData<>();
        }
        return this.w;
    }

    public final void a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f82807a, false, 92116, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f82807a, false, 92116, new Class[]{h.class}, Void.TYPE);
            return;
        }
        u();
        this.g.setValue(hVar2);
    }
}
