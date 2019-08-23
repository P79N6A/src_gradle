package com.bytedance.android.livesdk.livecommerce.broadcast.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;

public class PromotionTouchHelperCallback extends ItemTouchHelper.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16099a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView.Adapter f16100b;

    /* renamed from: c  reason: collision with root package name */
    private a f16101c;

    /* renamed from: d  reason: collision with root package name */
    private List<e> f16102d;

    public interface a {
        boolean a();
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public boolean isLongPressDragEnabled() {
        if (PatchProxy.isSupport(new Object[0], this, f16099a, false, 10632, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16099a, false, 10632, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f16101c != null) {
            return this.f16101c.a();
        } else {
            return false;
        }
    }

    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{recyclerView, viewHolder}, this, f16099a, false, 10634, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, viewHolder}, this, f16099a, false, 10634, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.clearView(recyclerView, viewHolder);
        int size = this.f16102d.size();
        while (i < size) {
            i++;
            this.f16102d.get(i).h = i;
        }
        this.f16100b.notifyDataSetChanged();
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{recyclerView, viewHolder}, this, f16099a, false, 10630, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView, viewHolder}, this, f16099a, false, 10630, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE)).intValue();
        }
        if (viewHolder.getAdapterPosition() != 0) {
            i = 3;
        }
        return makeMovementFlags(i, 0);
    }

    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f16099a, false, 10633, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f16099a, false, 10633, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSelectedChanged(viewHolder, i);
    }

    public PromotionTouchHelperCallback(RecyclerView.Adapter adapter, List<e> list, a aVar) {
        this.f16100b = adapter;
        this.f16102d = list;
        this.f16101c = aVar;
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, viewHolder, viewHolder2}, this, f16099a, false, 10631, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView, viewHolder, viewHolder2}, this, f16099a, false, 10631, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f16102d != null) {
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (adapterPosition < adapterPosition2) {
                int i = adapterPosition;
                while (i < adapterPosition2) {
                    int i2 = i + 1;
                    Collections.swap(this.f16102d, i, i2);
                    i = i2;
                }
            } else {
                for (int i3 = adapterPosition; i3 > adapterPosition2; i3--) {
                    Collections.swap(this.f16102d, i3, i3 - 1);
                }
            }
            if (this.f16100b != null) {
                this.f16100b.notifyItemMoved(adapterPosition, adapterPosition2);
            }
        }
        return true;
    }
}
