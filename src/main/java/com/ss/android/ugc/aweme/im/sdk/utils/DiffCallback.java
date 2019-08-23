package com.ss.android.ugc.aweme.im.sdk.utils;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class DiffCallback extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52455a;

    /* renamed from: b  reason: collision with root package name */
    private final List f52456b;

    /* renamed from: c  reason: collision with root package name */
    private final List f52457c;

    public int getNewListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f52455a, false, 53373, new Class[0], Integer.TYPE)) {
            return this.f52457c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52455a, false, 53373, new Class[0], Integer.TYPE)).intValue();
    }

    public int getOldListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f52455a, false, 53372, new Class[0], Integer.TYPE)) {
            return this.f52456b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52455a, false, 53372, new Class[0], Integer.TYPE)).intValue();
    }

    public DiffCallback(List list, List list2) {
        this.f52456b = list;
        this.f52457c = list2;
    }

    public boolean areContentsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f52455a, false, 53375, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return this.f52456b.get(i).equals(this.f52457c.get(i2));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f52455a, false, 53375, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean areItemsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f52455a, false, 53374, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return this.f52456b.get(i).equals(this.f52457c.get(i2));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f52455a, false, 53374, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
