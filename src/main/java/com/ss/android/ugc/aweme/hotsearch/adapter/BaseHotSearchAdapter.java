package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.hotsearch.viewholder.HotSearchFootViewHolder;
import com.ss.android.ugc.aweme.hotsearch.viewholder.UpdateTimeViewHolder;
import com.ss.android.ugc.aweme.hotsearch.viewholder.a;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseHotSearchAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49652a;

    /* renamed from: b  reason: collision with root package name */
    protected List<T> f49653b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f49654c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f49655d;

    /* renamed from: e  reason: collision with root package name */
    public String f49656e = "";

    /* access modifiers changed from: package-private */
    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    public abstract T b();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49652a, false, 49595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49652a, false, 49595, new Class[0], Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(b());
        }
        a((List<T>) arrayList);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f49652a, false, 49591, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49652a, false, 49591, new Class[0], Integer.TYPE)).intValue();
        } else if (CollectionUtils.isEmpty(this.f49653b)) {
            return 0;
        } else {
            return this.f49653b.size() + 2;
        }
    }

    BaseHotSearchAdapter(Context context) {
        this.f49654c = context;
        this.f49653b = new ArrayList();
    }

    public final T a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49652a, false, 49594, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49652a, false, 49594, new Class[]{Integer.TYPE}, Object.class);
        } else if (CollectionUtils.isEmpty(this.f49653b) || i >= this.f49653b.size() || i < 0) {
            return null;
        } else {
            return this.f49653b.get(i);
        }
    }

    public int getItemViewType(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49652a, false, 49592, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49652a, false, 49592, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i2 == 0) {
            return 1;
        } else {
            if (i2 == this.f49653b.size() + 1) {
                return 3;
            }
            return 0;
        }
    }

    public final void a(List<T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f49652a, false, 49593, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f49652a, false, 49593, new Class[]{List.class}, Void.TYPE);
        } else if (this.f49653b != null && !CollectionUtils.isEmpty(list)) {
            this.f49653b.clear();
            this.f49653b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49652a, false, 49590, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49652a, false, 49590, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getItemViewType(i2)) {
            case 0:
                a aVar = (a) viewHolder;
                int i3 = i2 - 1;
                aVar.a_(a(i3), i3);
                if (this.f49655d) {
                    aVar.a(i2);
                    break;
                }
                break;
            case 1:
                UpdateTimeViewHolder updateTimeViewHolder = (UpdateTimeViewHolder) viewHolder;
                String str = this.f49656e;
                if (PatchProxy.isSupport(new Object[]{str}, updateTimeViewHolder, UpdateTimeViewHolder.f49957a, false, 49899, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, updateTimeViewHolder, UpdateTimeViewHolder.f49957a, false, 49899, new Class[]{String.class}, Void.TYPE);
                    break;
                } else if (TextUtils.isEmpty(str)) {
                    updateTimeViewHolder.f49959c.setText(updateTimeViewHolder.itemView.getResources().getString(C0906R.string.b4z, new Object[]{""}));
                    updateTimeViewHolder.f49958b.startAnimation(updateTimeViewHolder.f49960d);
                    break;
                } else {
                    updateTimeViewHolder.f49958b.clearAnimation();
                    updateTimeViewHolder.f49958b.setVisibility(8);
                    updateTimeViewHolder.f49959c.setText(updateTimeViewHolder.itemView.getResources().getString(C0906R.string.b4z, new Object[]{str}));
                    return;
                }
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f49652a, false, 49589, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f49652a, false, 49589, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i2 == 3) {
            return new HotSearchFootViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vh, viewGroup2, false));
        } else {
            switch (i2) {
                case 0:
                    return a(viewGroup);
                case 1:
                    return new UpdateTimeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vn, viewGroup2, false));
                default:
                    return null;
            }
        }
    }
}
