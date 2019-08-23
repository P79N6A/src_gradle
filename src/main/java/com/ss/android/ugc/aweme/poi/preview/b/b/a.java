package com.ss.android.ugc.aweme.poi.preview.b.b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.b.c;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60137a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<View> f60138b = new SparseArray<>();

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60137a, false, 65411, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60137a, false, 65411, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f60138b.get(i);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60137a, false, 65412, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60137a, false, 65412, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f60138b.get(i);
        if (view != null) {
            view.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    public final void a(int i, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = frameLayout;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), frameLayout2}, this, f60137a, false, 65409, new Class[]{Integer.TYPE, FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), frameLayout2}, this, f60137a, false, 65409, new Class[]{Integer.TYPE, FrameLayout.class}, Void.TYPE);
            return;
        }
        Context context = frameLayout.getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(context);
        dmtLoadingLayout.setLayoutParams(layoutParams);
        frameLayout2.addView(dmtLoadingLayout, frameLayout.getChildCount());
        this.f60138b.put(i, dmtLoadingLayout);
        dmtLoadingLayout.setVisibility(0);
    }
}
