package com.ss.android.ugc.aweme.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ey;

public class DraftItemView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43415a;

    /* renamed from: b  reason: collision with root package name */
    Scroller f43416b;

    /* renamed from: c  reason: collision with root package name */
    int f43417c;

    /* renamed from: d  reason: collision with root package name */
    boolean f43418d;

    /* renamed from: e  reason: collision with root package name */
    private View f43419e;

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f43415a, false, 38456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43415a, false, 38456, new Class[0], Void.TYPE);
            return;
        }
        if (this.f43416b.computeScrollOffset()) {
            scrollTo(this.f43416b.getCurrX(), this.f43416b.getCurrY());
            invalidate();
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f43415a, false, 38457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43415a, false, 38457, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f43419e = getChildAt(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f43419e.getLayoutParams();
        this.f43417c = layoutParams.width + (layoutParams.rightMargin * 2);
        if (ey.a(getContext())) {
            this.f43417c = -this.f43417c;
        }
    }

    public DraftItemView(Context context) {
        this(context, null);
    }

    public DraftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43416b = new Scroller(context);
    }
}
