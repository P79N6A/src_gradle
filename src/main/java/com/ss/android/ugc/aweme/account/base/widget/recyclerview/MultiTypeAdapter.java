package com.ss.android.ugc.aweme.account.base.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.d;
import com.ss.android.ugc.aweme.base.mvvm.e;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

public class MultiTypeAdapter<T extends e> extends RecyclerView.Adapter<BaseViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31797a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f31798b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f31799c;

    /* renamed from: d  reason: collision with root package name */
    private Map<Class, Integer> f31800d;

    /* renamed from: e  reason: collision with root package name */
    private List<Constructor> f31801e;

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f31797a, false, 19808, new Class[0], Integer.TYPE)) {
            return this.f31798b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f31797a, false, 19808, new Class[0], Integer.TYPE)).intValue();
    }

    private Object a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f31797a, false, 19803, new Class[]{Integer.TYPE}, Object.class)) {
            return this.f31798b.get(i);
        }
        return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f31797a, false, 19803, new Class[]{Integer.TYPE}, Object.class);
    }

    public int getItemViewType(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f31797a, false, 19806, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f31797a, false, 19806, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int itemViewType = super.getItemViewType(i);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f31797a, false, 19807, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f31797a, false, 19807, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            Integer num = this.f31800d.get(a(i).getClass());
            if (num != null) {
                i2 = num.intValue();
            } else {
                throw new NullPointerException("No corresponding View match " + a(i).getClass().getName());
            }
        }
        return itemViewType + i2;
    }

    private d a(int i, ViewGroup viewGroup) {
        d dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), viewGroup}, this, f31797a, false, 19811, new Class[]{Integer.TYPE, ViewGroup.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), viewGroup}, this, f31797a, false, 19811, new Class[]{Integer.TYPE, ViewGroup.class}, d.class);
        }
        try {
            dVar = (d) this.f31801e.get(i).newInstance(new Object[]{this.f31799c});
            try {
                dVar.create(this.f31799c, viewGroup);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            dVar = null;
        }
        return dVar;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f31797a, false, 19805, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f31797a, false, 19805, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        baseViewHolder.f31795a.bind((e) this.f31798b.get(i));
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f31797a, false, 19804, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class)) {
            return new BaseViewHolder(a(i, viewGroup2));
        }
        return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f31797a, false, 19804, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class);
    }
}
