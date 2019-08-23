package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MyHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64492a;

    /* renamed from: b  reason: collision with root package name */
    private a f64493b;

    public interface a {
        void a();
    }

    public MyHorizontalScrollView(Context context) {
        super(context);
    }

    public void setListener(a aVar) {
        this.f64493b = aVar;
    }

    public MyHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f64492a, false, 73107, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f64492a, false, 73107, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (getScrollX() >= getChildAt(0).getMeasuredWidth() - getMeasuredWidth() && this.f64493b != null) {
            this.f64493b.a();
        }
    }
}
