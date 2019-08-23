package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MvChoosePhotoPageTransformer implements ViewPager.PageTransformer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68547a;

    public void transformPage(@NonNull View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f68547a, false, 77986, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f68547a, false, 77986, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        float f3 = -f2;
        view2.setTranslationX(((float) view.getWidth()) * f3);
        if (view.getId() == C0906R.id.e1) {
            view2.setTranslationY(f3 * ((float) view.getHeight()));
        } else {
            view2.setTranslationY(0.0f);
        }
    }
}
