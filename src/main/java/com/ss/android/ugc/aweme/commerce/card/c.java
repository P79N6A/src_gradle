package com.ss.android.ugc.aweme.commerce.card;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.h;

public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36823a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceCardViewPagerAdapter f36824b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f36825c;

    /* renamed from: d  reason: collision with root package name */
    private final h f36826d;

    c(CommerceCardViewPagerAdapter commerceCardViewPagerAdapter, ImageView imageView, h hVar) {
        this.f36824b = commerceCardViewPagerAdapter;
        this.f36825c = imageView;
        this.f36826d = hVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f36823a, false, 28022, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f36823a, false, 28022, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        CommerceCardViewPagerAdapter commerceCardViewPagerAdapter = this.f36824b;
        ImageView imageView = this.f36825c;
        h hVar = this.f36826d;
        if (motionEvent.getAction() == 0) {
            imageView.animate().alpha(commerceCardViewPagerAdapter.f36807e).setInterpolator(new LinearInterpolator()).setDuration(150).start();
        } else if (motionEvent.getAction() == 1) {
            imageView.setAlpha(1.0f);
            if (commerceCardViewPagerAdapter.f36805c != null) {
                commerceCardViewPagerAdapter.f36805c.a(hVar);
            }
        } else if (motionEvent.getAction() == 3) {
            imageView.setAlpha(1.0f);
        }
        return true;
    }
}
