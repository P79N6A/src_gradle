package com.bytedance.android.live.uikit.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;

public abstract class AbsPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8712a;

    /* renamed from: b  reason: collision with root package name */
    protected final LinkedList<View> f8713b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    protected final LayoutInflater f8714c;

    /* renamed from: d  reason: collision with root package name */
    protected final Context f8715d;

    public abstract View a(int i, View view, ViewGroup viewGroup);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public AbsPagerAdapter(Context context, LayoutInflater layoutInflater) {
        this.f8714c = layoutInflater;
        this.f8715d = context;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8712a, false, 2471, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8712a, false, 2471, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        View view = null;
        if (!this.f8713b.isEmpty()) {
            view = this.f8713b.removeFirst();
        }
        View a2 = a(i, view, viewGroup);
        viewGroup.addView(a2);
        return a2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f8712a, false, 2472, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f8712a, false, 2472, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
        } else if (obj != null) {
            View view = (View) obj;
            viewGroup2.removeView(view);
            this.f8713b.add(view);
        }
    }
}
