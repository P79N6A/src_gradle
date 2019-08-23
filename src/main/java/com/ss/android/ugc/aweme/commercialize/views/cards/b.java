package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;

public final /* synthetic */ class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40046a;

    /* renamed from: b  reason: collision with root package name */
    private final a f40047b;

    /* renamed from: c  reason: collision with root package name */
    private final View f40048c;

    /* renamed from: d  reason: collision with root package name */
    private final j f40049d;

    /* renamed from: e  reason: collision with root package name */
    private final AdHalfWebPageContainer f40050e;

    /* renamed from: f  reason: collision with root package name */
    private final int f40051f;

    b(a aVar, View view, j jVar, AdHalfWebPageContainer adHalfWebPageContainer, int i) {
        this.f40047b = aVar;
        this.f40048c = view;
        this.f40049d = jVar;
        this.f40050e = adHalfWebPageContainer;
        this.f40051f = i;
    }

    public final void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f40046a, false, 33043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40046a, false, 33043, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f40047b;
        View view = this.f40048c;
        j jVar = this.f40049d;
        AdHalfWebPageContainer adHalfWebPageContainer = this.f40050e;
        int i = this.f40051f;
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (aVar.m != 0) {
            if (aVar.m != rect.height()) {
                if (aVar.m - rect.height() > 20) {
                    jVar.b(true);
                    adHalfWebPageContainer.animate().translationY(adHalfWebPageContainer.getTranslationY() - ((float) ((v.b((View) adHalfWebPageContainer).bottom - rect.bottom) + 30))).setDuration(100).start();
                } else if (rect.height() - aVar.m > 20) {
                    jVar.b(false);
                    adHalfWebPageContainer.animate().translationY((((float) (view.getHeight() - i)) / 2.0f) - ((float) adHalfWebPageContainer.getTop())).setDuration(100).start();
                }
            }
        }
        aVar.m = rect.height();
    }
}
