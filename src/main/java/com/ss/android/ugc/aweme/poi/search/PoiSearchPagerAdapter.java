package com.ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.poi.search.a;
import java.util.ArrayList;
import java.util.List;

public class PoiSearchPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60327a;

    /* renamed from: b  reason: collision with root package name */
    a f60328b;

    /* renamed from: c  reason: collision with root package name */
    a f60329c;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f60330d = new ArrayList();

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f60327a, false, 65743, new Class[0], Integer.TYPE)) {
            return this.f60330d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60327a, false, 65743, new Class[0], Integer.TYPE)).intValue();
    }

    public final a a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60327a, false, 65745, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60327a, false, 65745, new Class[]{Integer.TYPE}, a.class);
        } else if (i2 >= 0 && i2 < getCount()) {
            return this.f60330d.get(i2);
        } else {
            return null;
        }
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60327a, false, 65744, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60327a, false, 65744, new Class[]{Integer.TYPE}, CharSequence.class);
        }
        switch (i) {
            case 0:
                return o.b(C0906R.string.bpe);
            case 1:
                return o.b(C0906R.string.bpf);
            default:
                return "";
        }
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60327a, false, 65741, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60327a, false, 65741, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        viewGroup.addView(this.f60330d.get(i));
        return this.f60330d.get(i);
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f60327a, false, 65742, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f60327a, false, 65742, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        viewGroup2.removeView((View) obj);
    }

    public PoiSearchPagerAdapter(Context context, String str, boolean z, a.C0027a aVar) {
        this.f60328b = new e(context, str, z);
        this.f60328b.setHideImmListener(aVar);
        this.f60330d.add(this.f60328b);
        if (z) {
            this.f60329c = new f(context, str, z);
            this.f60329c.setHideImmListener(aVar);
            this.f60330d.add(this.f60329c);
        }
    }
}
