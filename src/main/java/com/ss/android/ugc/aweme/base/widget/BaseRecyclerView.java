package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;

public class BaseRecyclerView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35064a;

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f35065b;

    public int getEndItemIndex() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f35064a, false, 25373, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35064a, false, 25373, new Class[0], Integer.TYPE)).intValue();
        }
        if (!a()) {
            i = getAdapter().getItemCount() - 1;
        }
        return i;
    }

    public int getFirstPosition() {
        if (PatchProxy.isSupport(new Object[0], this, f35064a, false, 25384, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35064a, false, 25384, new Class[0], Integer.TYPE)).intValue();
        } else if (getChildCount() <= 0) {
            return -1;
        } else {
            return getChildAdapterPosition(getChildAt(0));
        }
    }

    public int getStartItemIndex() {
        if (PatchProxy.isSupport(new Object[0], this, f35064a, false, 25374, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35064a, false, 25374, new Class[0], Integer.TYPE)).intValue();
        } else if (!a()) {
            return 0;
        } else {
            return getAdapter().getItemCount() - 1;
        }
    }

    public boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35064a, false, 25375, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35064a, false, 25375, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            z = ((StaggeredGridLayoutManager) getLayoutManager()).getReverseLayout();
        } else if (getLayoutManager() instanceof LinearLayoutManager) {
            z = ((LinearLayoutManager) getLayoutManager()).getReverseLayout();
        }
        return z;
    }

    public int getLastPosition() {
        if (PatchProxy.isSupport(new Object[0], this, f35064a, false, 25385, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35064a, false, 25385, new Class[0], Integer.TYPE)).intValue();
        } else if (getChildCount() <= 0) {
            return -1;
        } else {
            return getChildAdapterPosition(getChildAt(getChildCount() - 1));
        }
    }

    public BaseRecyclerView(Context context) {
        super(context);
    }

    public void setTranslationY(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35064a, false, 25379, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35064a, false, 25379, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.setTranslationY(f2);
        if (this.f35065b != null) {
            Iterator<Object> it2 = this.f35065b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
