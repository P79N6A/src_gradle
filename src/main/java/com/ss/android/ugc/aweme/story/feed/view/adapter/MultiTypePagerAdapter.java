package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;

public abstract class MultiTypePagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4146a;

    /* renamed from: b  reason: collision with root package name */
    protected final LinkedList<View>[] f4147b;

    /* renamed from: c  reason: collision with root package name */
    protected final LayoutInflater f4148c;

    /* renamed from: d  reason: collision with root package name */
    protected final Context f4149d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4150e = 4;

    public abstract int a(int i);

    public abstract int a(View view);

    public abstract View a(int i, View view, ViewGroup viewGroup);

    public void b(View view) {
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public MultiTypePagerAdapter(Context context, LayoutInflater layoutInflater) {
        this.f4148c = layoutInflater;
        this.f4149d = context;
        LinkedList<View>[] linkedListArr = new LinkedList[4];
        for (int i = 0; i < 4; i++) {
            linkedListArr[i] = new LinkedList<>();
        }
        this.f4147b = linkedListArr;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f4146a, false, 83893, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f4146a, false, 83893, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        View view = null;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f4146a, false, 83894, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f4146a, false, 83894, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int a2 = a(i);
            if (a2 >= 0 && a2 < 4) {
                i2 = a2;
            }
        }
        if (!this.f4147b[i2].isEmpty()) {
            view = this.f4147b[i2].removeFirst();
        }
        View a3 = a(i, view, viewGroup);
        if (a3.getParent() != null) {
            ((ViewGroup) a3.getParent()).removeView(a3);
        }
        viewGroup.addView(a3);
        return a3;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f4146a, false, 83895, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f4146a, false, 83895, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
        } else if (obj != null) {
            View view = (View) obj;
            try {
                viewGroup.removeView(view);
            } catch (Exception unused) {
            }
            this.f4147b[a(view)].add(view);
            b(view);
        }
    }
}
