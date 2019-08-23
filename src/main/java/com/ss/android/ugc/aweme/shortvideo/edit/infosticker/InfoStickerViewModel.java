package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;
import dmt.av.video.w;

public class InfoStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67216a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<s> f67217b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<w> f67218c;

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Boolean> f67219d;

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67216a, false, 76863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67216a, false, 76863, new Class[0], Void.TYPE);
            return;
        }
        if (this.f67217b == null) {
            this.f67217b = new MutableLiveData<>();
        }
    }

    public final MutableLiveData<s> a() {
        if (PatchProxy.isSupport(new Object[0], this, f67216a, false, 76861, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f67216a, false, 76861, new Class[0], MutableLiveData.class);
        }
        c();
        return this.f67217b;
    }

    public final MutableLiveData<w> b() {
        if (PatchProxy.isSupport(new Object[0], this, f67216a, false, 76862, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f67216a, false, 76862, new Class[0], MutableLiveData.class);
        }
        if (this.f67218c == null) {
            this.f67218c = new MutableLiveData<>();
        }
        return this.f67218c;
    }
}
