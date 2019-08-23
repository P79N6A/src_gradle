package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class al implements av {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47496a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterScrollerModule f47497b;

    al(FilterScrollerModule filterScrollerModule) {
        this.f47497b = filterScrollerModule;
    }

    public final void a(h hVar, boolean z) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f47496a, false, 44350, new Class[]{h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, Byte.valueOf(z)}, this, f47496a, false, 44350, new Class[]{h.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        FilterScrollerModule filterScrollerModule = this.f47497b;
        if (z) {
            filterScrollerModule.l = null;
            FilterViewModel.a(filterScrollerModule.f3235e, hVar2);
            return;
        }
        filterScrollerModule.l = hVar2;
        AppCompatActivity appCompatActivity = filterScrollerModule.f3235e;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, hVar2}, null, FilterViewModel.f47453a, true, 44410, new Class[]{AppCompatActivity.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity, hVar2}, null, FilterViewModel.f47453a, true, 44410, new Class[]{AppCompatActivity.class, h.class}, Void.TYPE);
            return;
        }
        ((FilterViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity).get(FilterViewModel.class)).b().postValue(hVar2);
    }
}
