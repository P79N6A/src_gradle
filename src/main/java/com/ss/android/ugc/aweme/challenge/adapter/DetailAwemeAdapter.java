package com.ss.android.ugc.aweme.challenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

public class DetailAwemeAdapter extends AnimatedAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f35328f;
    public boolean g;
    private String i;
    private d j;
    private b<AnimatedViewHolder> k;

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f35328f, false, 25784, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35328f, false, 25784, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        } else {
            return getBasicItemCount();
        }
    }

    private List<Integer> a(List<Aweme> list) {
        List<Aweme> list2 = list;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f35328f, false, 25783, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, f35328f, false, 25783, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int max = Math.max(0, this.mPreviousCount - 1); max < size; max++) {
            Aweme aweme = list2.get(max);
            aweme.setOriginalPos(max);
            if (aweme.getIsTop() == 1) {
                list2.remove(aweme);
                list2.add(i2, aweme);
                i2++;
                arrayList.add(Integer.valueOf(max));
            }
        }
        return arrayList;
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f35328f, false, 25780, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f35328f, false, 25780, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (this.g && viewHolder.getItemViewType() == 0 && this.k != null) {
            this.k.a((DetailAwemeViewHolder) viewHolder);
        }
    }

    public void setData(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f35328f, false, 25781, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f35328f, false, 25781, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.mPreviousCount = 0;
        if (TextUtils.equals(this.i, "challenge")) {
            this.mItems = list;
            a(this.mItems);
            super.setData(this.mItems);
            return;
        }
        super.setData(list);
    }

    public void setDataAfterLoadMore(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f35328f, false, 25782, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f35328f, false, 25782, new Class[]{List.class}, Void.TYPE);
        } else if (TextUtils.equals(this.i, "challenge")) {
            this.mItems = list;
            List<Integer> a2 = a(this.mItems);
            super.setDataAfterLoadMore(list);
            if (a2 != null && a2.size() > 0) {
                notifyItemRangeInserted(0, a2.size());
            }
        } else {
            super.setDataAfterLoadMore(list);
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f35328f, false, 25778, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f35328f, false, 25778, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((DetailAwemeViewHolder) viewHolder).a((Aweme) this.mItems.get(i2), i2, this.g);
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f35328f, false, 25779, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new DetailAwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.td, viewGroup, false), this.i, this.j);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f35328f, false, 25779, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public DetailAwemeAdapter(String str, d dVar, b<AnimatedViewHolder> bVar) {
        this.i = str;
        this.j = dVar;
        this.k = bVar;
    }
}
