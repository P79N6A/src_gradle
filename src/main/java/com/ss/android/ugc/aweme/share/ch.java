package com.ss.android.ugc.aweme.share;

import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public final class ch {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64947a;

    public static void a(ImageView imageView) {
        int i;
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2}, null, f64947a, true, 73341, new Class[]{ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2}, null, f64947a, true, 73341, new Class[]{ImageView.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, f64947a, true, 73342, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, f64947a, true, 73342, new Class[0], Integer.TYPE)).intValue();
        } else {
            AbTestModel d2 = AbTestManager.a().d();
            if (d2 != null && d2.shareButtonStyleUnite == 1) {
                if (a.b()) {
                    i = 2130838979;
                } else if (a.c()) {
                    i = 2130838978;
                }
            }
            i = 0;
        }
        if (i != 0) {
            imageView2.setImageResource(i);
        }
    }
}
