package com.ss.android.ugc.aweme.base.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.d;
import com.ss.android.ugc.aweme.base.mvvm.e;
import java.lang.reflect.Constructor;
import java.util.List;

public class SingleTypeAdapter<B extends e, V extends d> extends RecyclerView.Adapter<BaseViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35190a;

    /* renamed from: b  reason: collision with root package name */
    private Constructor<V> f35191b;

    /* renamed from: c  reason: collision with root package name */
    private final List<B> f35192c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f35193d;

    public long getItemId(int i) {
        return 0;
    }

    private V a() {
        if (PatchProxy.isSupport(new Object[0], this, f35190a, false, 25600, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f35190a, false, 25600, new Class[0], d.class);
        }
        try {
            return (d) this.f35191b.newInstance(new Object[]{this.f35193d});
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f35190a, false, 25599, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35190a, false, 25599, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f35192c != null) {
            return this.f35192c.size();
        } else {
            return 0;
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f35190a, false, 25598, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f35190a, false, 25598, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        baseViewHolder.f35176a.bind((e) this.f35192c.get(i));
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35190a, false, 25597, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class)) {
            return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35190a, false, 25597, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class);
        }
        d a2 = a();
        a2.create(this.f35193d, viewGroup2);
        return new BaseViewHolder(a2);
    }
}
