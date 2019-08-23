package com.ss.android.ugc.aweme.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import java.util.ArrayList;
import java.util.List;

public class SummonFriendAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48757a;

    /* renamed from: b  reason: collision with root package name */
    public List<SummonFriendItem> f48758b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f48759c;

    /* renamed from: d  reason: collision with root package name */
    public String f48760d;

    /* renamed from: e  reason: collision with root package name */
    private String f48761e;

    /* renamed from: f  reason: collision with root package name */
    private int f48762f;

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f48757a, false, 46352, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48757a, false, 46352, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f48758b == null) {
            return 0;
        } else {
            return this.f48758b.size();
        }
    }

    public final void a(List<SummonFriendItem> list) {
        List<SummonFriendItem> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f48757a, false, 46349, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f48757a, false, 46349, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f48758b = list2;
        notifyDataSetChanged();
    }

    public int getBasicItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48757a, false, 46353, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f48758b.get(i).type;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48757a, false, 46353, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public SummonFriendAdapter(String str, int i) {
        this.f48761e = str;
        this.f48762f = i;
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48763a;

            public void onChanged() {
                if (PatchProxy.isSupport(new Object[0], this, f48763a, false, 46354, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48763a, false, 46354, new Class[0], Void.TYPE);
                    return;
                }
                SummonFriendAdapter.this.f48759c = SummonFriendAdapter.this.getItemCount();
            }

            public void onItemRangeChanged(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48763a, false, 46355, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48763a, false, 46355, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                SummonFriendAdapter.this.f48759c = SummonFriendAdapter.this.getItemCount();
            }

            public void onItemRangeInserted(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48763a, false, 46356, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48763a, false, 46356, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                SummonFriendAdapter.this.f48759c = SummonFriendAdapter.this.getItemCount();
            }

            public void onItemRangeRemoved(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48763a, false, 46357, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48763a, false, 46357, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                SummonFriendAdapter.this.f48759c = SummonFriendAdapter.this.getItemCount();
            }

            public void onItemRangeMoved(int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48763a, false, 46358, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48763a, false, 46358, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                SummonFriendAdapter.this.f48759c = SummonFriendAdapter.this.getItemCount();
            }
        });
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f48757a, false, 46351, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f48757a, false, 46351, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i != 2) {
            return new SummonFriendViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a12, viewGroup, false), this.f48761e, this.f48762f);
        } else {
            return new SummonFriendLabelViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a11, viewGroup, false));
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48757a, false, 46348, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48757a, false, 46348, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i2) != 2) {
            ((SummonFriendViewHolder) viewHolder).a(this.f48758b.get(i2), this.f48760d);
        } else {
            SummonFriendLabelViewHolder summonFriendLabelViewHolder = (SummonFriendLabelViewHolder) viewHolder;
            String str = this.f48758b.get(i2).label;
            if (PatchProxy.isSupport(new Object[]{str}, summonFriendLabelViewHolder, SummonFriendLabelViewHolder.f48765a, false, 46359, new Class[]{String.class}, Void.TYPE)) {
                SummonFriendLabelViewHolder summonFriendLabelViewHolder2 = summonFriendLabelViewHolder;
                PatchProxy.accessDispatch(new Object[]{str}, summonFriendLabelViewHolder2, SummonFriendLabelViewHolder.f48765a, false, 46359, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                summonFriendLabelViewHolder.f48766b.setText(str);
            }
        }
    }
}
