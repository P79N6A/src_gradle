package com.ss.android.ugc.aweme.shortvideo.game;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class GameResultViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67848a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67849b;

    /* renamed from: c  reason: collision with root package name */
    private MutableLiveData<Pair<Boolean, Integer>> f67850c;

    /* renamed from: d  reason: collision with root package name */
    private MutableLiveData<Integer> f67851d;

    public final MutableLiveData<Pair<Boolean, Integer>> a() {
        if (PatchProxy.isSupport(new Object[0], this, f67848a, false, 77361, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f67848a, false, 77361, new Class[0], MutableLiveData.class);
        }
        if (this.f67850c == null) {
            this.f67850c = new MutableLiveData<>();
        }
        return this.f67850c;
    }

    public final MutableLiveData<Integer> b() {
        if (PatchProxy.isSupport(new Object[0], this, f67848a, false, 77362, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f67848a, false, 77362, new Class[0], MutableLiveData.class);
        }
        if (this.f67851d == null) {
            this.f67851d = new MutableLiveData<>();
        }
        return this.f67851d;
    }
}
