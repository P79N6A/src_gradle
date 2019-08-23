package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ECLottieAnimationView extends LottieAnimationView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16270a;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f16270a, false, 10803, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16270a, false, 10803, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        cancelAnimation();
    }

    public ECLottieAnimationView(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f16270a, false, 10801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16270a, false, 10801, new Class[0], Void.TYPE);
            return;
        }
        setImageFolder("images");
    }

    private void setImageFolder(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16270a, false, 10802, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16270a, false, 10802, new Class[]{String.class}, Void.TYPE);
            return;
        }
        setImageAssetsFolder(str);
    }
}
