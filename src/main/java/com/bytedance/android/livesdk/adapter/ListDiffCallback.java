package com.bytedance.android.livesdk.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class ListDiffCallback extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8914a;

    /* renamed from: b  reason: collision with root package name */
    private final List<?> f8915b;

    /* renamed from: c  reason: collision with root package name */
    private final List<?> f8916c;

    public int getNewListSize() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f8914a, false, 3052, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8914a, false, 3052, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f8916c != null) {
            i = this.f8916c.size();
        }
        return i;
    }

    public int getOldListSize() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f8914a, false, 3051, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8914a, false, 3051, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f8915b != null) {
            i = this.f8915b.size();
        }
        return i;
    }

    public ListDiffCallback(List<?> list, List<?> list2) {
        this.f8915b = list;
        this.f8916c = list2;
    }

    public boolean areContentsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8914a, false, 3054, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8914a, false, 3054, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!(this.f8915b.get(i) instanceof d) || !(this.f8916c.get(i2) instanceof d)) {
            return false;
        } else {
            return ((d) this.f8915b.get(i)).b(this.f8916c.get(i2));
        }
    }

    public boolean areItemsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8914a, false, 3053, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8914a, false, 3053, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if ((this.f8915b.get(i) instanceof d) && (this.f8916c.get(i2) instanceof d)) {
            return ((d) this.f8915b.get(i)).a(this.f8916c.get(i2));
        } else {
            if (this.f8915b.get(i) == this.f8916c.get(i2)) {
                return true;
            }
            return false;
        }
    }
}
