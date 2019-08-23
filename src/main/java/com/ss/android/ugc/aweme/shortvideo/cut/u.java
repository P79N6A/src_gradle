package com.ss.android.ugc.aweme.shortvideo.cut;

import android.animation.ValueAnimator;
import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66518a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66519b;

    u(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66519b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66518a, false, 75460, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66518a, false, 75460, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66519b;
        Pair pair = (Pair) obj;
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75406, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            CutMultiVideoActivity cutMultiVideoActivity2 = cutMultiVideoActivity;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, cutMultiVideoActivity2, CutMultiVideoActivity.f66139a, false, 75406, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (cutMultiVideoActivity.z != 2 && cutMultiVideoActivity.z != 0) {
            int a2 = cutMultiVideoActivity.f66144f.a(cutMultiVideoActivity.videoRecyclerView, intValue);
            int a3 = cutMultiVideoActivity.f66144f.a(cutMultiVideoActivity.videoRecyclerView, intValue2);
            cutMultiVideoActivity.f66144f.f66328c = intValue2;
            if (a2 == -1 || a3 == -1) {
                cutMultiVideoActivity.animDot.setTranslationX(0.0f);
                cutMultiVideoActivity.animDot.setVisibility(4);
                return;
            }
            cutMultiVideoActivity.animDot.setVisibility(0);
            float f2 = (float) a2;
            cutMultiVideoActivity.animDot.setX(f2);
            if (a2 != a3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, (float) a3});
                ofFloat.setDuration(500);
                ofFloat.addUpdateListener(new k(cutMultiVideoActivity));
                ofFloat.start();
            }
        }
    }
}
