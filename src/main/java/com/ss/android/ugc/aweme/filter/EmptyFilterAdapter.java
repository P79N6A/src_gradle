package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class EmptyFilterAdapter extends AbsPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47334a;

    /* renamed from: b  reason: collision with root package name */
    public List<h> f47335b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f47336c;

    /* renamed from: d  reason: collision with root package name */
    private List<h> f47337d = new ArrayList();

    public int getCount() {
        return Integer.MAX_VALUE;
    }

    public final List<h> a() {
        if (this.f47336c) {
            return this.f47335b;
        }
        return this.f47337d;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47334a, false, 44064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47334a, false, 44064, new Class[0], Void.TYPE);
            return;
        }
        notifyDataSetChanged();
    }

    public EmptyFilterAdapter(Context context) {
        super(context, LayoutInflater.from(context));
    }

    public final void a(List<h> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f47334a, false, 44066, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47334a, false, 44066, new Class[]{List.class}, Void.TYPE);
        } else if (this.f47335b.size() != list.size()) {
            this.f47335b.clear();
            this.f47335b.addAll(list);
            if (this.f47336c) {
                b();
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47334a, false, 44067, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47334a, false, 44067, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f47336c != z) {
            this.f47336c = z;
            b();
        }
    }

    public final void a(List<h> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f47334a, false, 44065, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f47334a, false, 44065, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.f47337d.size() != list.size()) {
            this.f47337d.clear();
            this.f47337d.addAll(list);
            if (!this.f47336c && z) {
                b();
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f47334a, false, 44063, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f47334a, false, 44063, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        }
        if (view == null) {
            view2 = new View(viewGroup.getContext());
        } else {
            view2 = view;
        }
        return view2;
    }
}
