package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.LinkedList;

public abstract class MultiTypePagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect l;
    protected final LinkedList<View>[] m;
    protected final LayoutInflater n;
    protected final Context o;
    public final int p;

    public abstract int a(int i);

    public abstract int a(View view);

    public abstract View a(int i, View view, ViewGroup viewGroup);

    public void b(View view) {
    }

    public void c(View view) {
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, l, false, 40568, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, l, false, 40568, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        View view = null;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 40569, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 40569, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int a2 = a(i);
            if (a2 < 0 || a2 >= this.p) {
                a.a(new Exception("getItemViewType must return a number which is form 0 to " + (this.p - 1)));
            } else {
                i2 = a2;
            }
        }
        if (!this.m[i2].isEmpty()) {
            view = this.m[i2].removeFirst();
        }
        View a3 = a(i, view, viewGroup);
        if (a3.getParent() != null) {
            try {
                ((ViewGroup) a3.getParent()).removeView(a3);
            } catch (Exception e2) {
                a.a(e2);
            }
        }
        viewGroup.addView(a3);
        b(a3);
        return a3;
    }

    public MultiTypePagerAdapter(Context context, LayoutInflater layoutInflater, int i) {
        this.n = layoutInflater;
        this.o = context;
        this.p = i;
        LinkedList<View>[] linkedListArr = new LinkedList[i];
        for (int i2 = 0; i2 < i; i2++) {
            linkedListArr[i2] = new LinkedList<>();
        }
        this.m = linkedListArr;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, l, false, 40570, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, l, false, 40570, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
        } else if (obj != null) {
            View view = (View) obj;
            try {
                viewGroup.removeView(view);
            } catch (Exception e2) {
                a.a(e2);
            }
            this.m[a(view)].add(view);
            c(view);
        }
    }
}
