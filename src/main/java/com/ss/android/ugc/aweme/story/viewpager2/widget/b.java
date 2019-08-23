package com.ss.android.ugc.aweme.story.viewpager2.widget;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import java.util.Locale;

public final class b extends ViewPager2.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74452a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager2.b f74453b;

    /* renamed from: c  reason: collision with root package name */
    private final LinearLayoutManager f74454c;

    public final void a(int i) {
    }

    public final void b(int i) {
    }

    b(LinearLayoutManager linearLayoutManager) {
        this.f74454c = linearLayoutManager;
    }

    public final void a(int i, float f2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f74452a, false, 86541, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f74452a, false, 86541, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f74453b != null) {
            float f3 = -f2;
            int i3 = 0;
            while (i3 < this.f74454c.getChildCount()) {
                View childAt = this.f74454c.getChildAt(i3);
                if (childAt != null) {
                    this.f74453b.b(childAt, ((float) (this.f74454c.getPosition(childAt) - i)) + f3);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f74454c.getChildCount())}));
                }
            }
        }
    }
}
