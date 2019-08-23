package com.ss.android.ugc.aweme.port.internal;

import a.g;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61174a;

    /* renamed from: b  reason: collision with root package name */
    private final Fragment f61175b;

    /* renamed from: c  reason: collision with root package name */
    private final View f61176c;

    i(Fragment fragment, View view) {
        this.f61175b = fragment;
        this.f61176c = view;
    }

    public final Object then(a.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f61174a, false, 67188, new Class[]{a.i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f61174a, false, 67188, new Class[]{a.i.class}, Object.class);
        }
        Fragment fragment = this.f61175b;
        View view = this.f61176c;
        if (iVar.b() && fragment.isAdded()) {
            RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(fragment.getResources(), (Bitmap) iVar.e());
            create.setCornerRadius(UIUtils.dip2Px(fragment.getContext(), 2.0f));
            view.setBackground(new LayerDrawable(new Drawable[]{create, ContextCompat.getDrawable(fragment.getContext(), 2130837823)}));
        }
        return null;
    }
}
