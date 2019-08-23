package com.ss.android.ugc.aweme.commerce.floatvideo;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36910a;

    /* renamed from: b  reason: collision with root package name */
    private final FloatVideoBrowsePresenter f36911b;

    b(FloatVideoBrowsePresenter floatVideoBrowsePresenter) {
        this.f36911b = floatVideoBrowsePresenter;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36910a, false, 28188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36910a, false, 28188, new Class[0], Void.TYPE);
            return;
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f36911b;
        if (PatchProxy.isSupport(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28181, new Class[0], Void.TYPE);
            return;
        }
        floatVideoBrowsePresenter.f36903f = floatVideoBrowsePresenter.f36901d.getMeasuredWidth();
        floatVideoBrowsePresenter.f36902e = ((float) floatVideoBrowsePresenter.f36901d.getMeasuredHeight()) / ((float) floatVideoBrowsePresenter.f36903f);
        if (floatVideoBrowsePresenter.g == 1) {
            if (PatchProxy.isSupport(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28184, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28184, new Class[0], Void.TYPE);
            } else if (floatVideoBrowsePresenter.d() >= floatVideoBrowsePresenter.f36902e || floatVideoBrowsePresenter.d() <= 1.0f) {
                floatVideoBrowsePresenter.f36900c.getLayoutParams().height = (int) (((float) floatVideoBrowsePresenter.f36901d.getMeasuredWidth()) * floatVideoBrowsePresenter.d());
                floatVideoBrowsePresenter.f36900c.requestLayout();
            } else {
                floatVideoBrowsePresenter.f36900c.getLayoutParams().width = (int) (((float) floatVideoBrowsePresenter.f36901d.getMeasuredHeight()) / floatVideoBrowsePresenter.d());
                floatVideoBrowsePresenter.f36900c.requestLayout();
            }
        } else if (floatVideoBrowsePresenter.g == 2) {
            if (PatchProxy.isSupport(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28183, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28183, new Class[0], Void.TYPE);
            } else {
                ViewGroup.LayoutParams layoutParams = floatVideoBrowsePresenter.f36901d.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = floatVideoBrowsePresenter.f36900c.getLayoutParams();
                if (floatVideoBrowsePresenter.d() >= 1.0f) {
                    layoutParams2.height = floatVideoBrowsePresenter.h.f53896b;
                    layoutParams2.width = (int) (((float) layoutParams2.height) / floatVideoBrowsePresenter.d());
                    layoutParams.height = floatVideoBrowsePresenter.h.f53896b;
                    layoutParams.width = Math.max(layoutParams2.width, floatVideoBrowsePresenter.h.f53895a);
                } else {
                    layoutParams2.width = floatVideoBrowsePresenter.h.f53895a;
                    layoutParams2.height = (int) (((float) layoutParams2.width) * floatVideoBrowsePresenter.d());
                    layoutParams.width = floatVideoBrowsePresenter.h.f53895a;
                    layoutParams.height = Math.max(layoutParams2.height, floatVideoBrowsePresenter.h.f53896b);
                }
                floatVideoBrowsePresenter.f36901d.requestLayout();
            }
        } else if (floatVideoBrowsePresenter.g == 3) {
            if (PatchProxy.isSupport(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28182, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28182, new Class[0], Void.TYPE);
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = floatVideoBrowsePresenter.f36901d.getLayoutParams();
            layoutParams3.width = floatVideoBrowsePresenter.f36901d.getMeasuredWidth();
            layoutParams3.height = floatVideoBrowsePresenter.f36901d.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams4 = floatVideoBrowsePresenter.f36900c.getLayoutParams();
            layoutParams4.width = layoutParams3.width;
            layoutParams4.height = layoutParams3.height;
            floatVideoBrowsePresenter.f36901d.requestLayout();
        }
    }
}
