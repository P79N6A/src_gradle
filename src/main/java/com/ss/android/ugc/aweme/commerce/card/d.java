package com.ss.android.ugc.aweme.commerce.card;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.h;

public final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36827a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceCardViewPagerAdapter f36828b;

    /* renamed from: c  reason: collision with root package name */
    private final LinearLayout f36829c;

    /* renamed from: d  reason: collision with root package name */
    private final h f36830d;

    d(CommerceCardViewPagerAdapter commerceCardViewPagerAdapter, LinearLayout linearLayout, h hVar) {
        this.f36828b = commerceCardViewPagerAdapter;
        this.f36829c = linearLayout;
        this.f36830d = hVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f36827a, false, 28023, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f36827a, false, 28023, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        CommerceCardViewPagerAdapter commerceCardViewPagerAdapter = this.f36828b;
        LinearLayout linearLayout = this.f36829c;
        h hVar = this.f36830d;
        if (motionEvent.getAction() == 0) {
            linearLayout.animate().alpha(commerceCardViewPagerAdapter.f36807e).setInterpolator(new LinearInterpolator()).setDuration(150).start();
        } else if (motionEvent.getAction() == 1) {
            linearLayout.setAlpha(1.0f);
            if (commerceCardViewPagerAdapter.f36804b != null) {
                commerceCardViewPagerAdapter.f36804b.a(hVar);
            }
        } else if (motionEvent.getAction() == 3) {
            linearLayout.setAlpha(1.0f);
        }
        return true;
    }
}
