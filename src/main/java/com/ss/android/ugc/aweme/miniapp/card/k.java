package com.ss.android.ugc.aweme.miniapp.card;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;

public final /* synthetic */ class k implements MicroAppVideoCardView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55657a;

    /* renamed from: b  reason: collision with root package name */
    private final j f55658b;

    k(j jVar) {
        this.f55658b = jVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55657a, false, 59206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55657a, false, 59206, new Class[0], Void.TYPE);
            return;
        }
        j jVar = this.f55658b;
        if (PatchProxy.isSupport(new Object[]{270L}, jVar, j.f55651a, false, 59204, new Class[]{Long.TYPE}, Void.TYPE)) {
            j jVar2 = jVar;
            PatchProxy.accessDispatch(new Object[]{270L}, jVar2, j.f55651a, false, 59204, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        MicroAppVideoCardView microAppVideoCardView = jVar.f55652b;
        if (PatchProxy.isSupport(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59191, new Class[0], Void.TYPE);
        } else {
            microAppVideoCardView.f55627b = false;
            a.a(microAppVideoCardView, 200, microAppVideoCardView.getTranslationX(), (float) (-(microAppVideoCardView.getWidth() + ((ViewGroup.MarginLayoutParams) microAppVideoCardView.getLayoutParams()).leftMargin)), 0.0f, 0.0f);
            microAppVideoCardView.animate().alpha(0.0f).withStartAction(new h(microAppVideoCardView)).setDuration(200).withEndAction(new i(microAppVideoCardView)).start();
        }
        jVar.f55652b.postDelayed(new m(jVar), 270);
    }
}
