package com.ss.android.ugc.aweme.filter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class EffectFilterDiff extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47331a;

    /* renamed from: b  reason: collision with root package name */
    private List<h> f47332b;

    /* renamed from: c  reason: collision with root package name */
    private List<h> f47333c;

    public int getNewListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f47331a, false, 44053, new Class[0], Integer.TYPE)) {
            return this.f47333c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47331a, false, 44053, new Class[0], Integer.TYPE)).intValue();
    }

    public int getOldListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f47331a, false, 44052, new Class[0], Integer.TYPE)) {
            return this.f47332b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47331a, false, 44052, new Class[0], Integer.TYPE)).intValue();
    }

    public EffectFilterDiff(List<h> list, List<h> list2) {
        this.f47332b = list;
        this.f47333c = list2;
    }

    public boolean areContentsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47331a, false, 44055, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return this.f47332b.get(i).equals(this.f47333c.get(i2));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47331a, false, 44055, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean areItemsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47331a, false, 44054, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47331a, false, 44054, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i == i2 || this.f47332b.get(i).f47598b == this.f47333c.get(i2).f47598b) {
            return true;
        } else {
            return false;
        }
    }
}
