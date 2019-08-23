package com.ss.android.ugc.aweme.discover.base;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper$mInnerObserver$1", "Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeChanged", "positionStart", "", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HeaderAndFooterWrapper$mInnerObserver$1 extends RecyclerView.AdapterDataObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42116a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeaderAndFooterWrapper f42117b;

    public final void onChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f42116a, false, 36118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42116a, false, 36118, new Class[0], Void.TYPE);
            return;
        }
        this.f42117b.notifyDataSetChanged();
    }

    HeaderAndFooterWrapper$mInnerObserver$1(HeaderAndFooterWrapper headerAndFooterWrapper) {
        this.f42117b = headerAndFooterWrapper;
    }

    public final void onItemRangeChanged(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42116a, false, 36119, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42116a, false, 36119, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42117b.notifyItemRangeChanged(this.f42117b.a() + i, i2);
    }

    public final void onItemRangeInserted(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42116a, false, 36121, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42116a, false, 36121, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42117b.notifyItemRangeInserted(this.f42117b.a() + i, i2);
    }

    public final void onItemRangeRemoved(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42116a, false, 36122, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42116a, false, 36122, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42117b.notifyItemRangeRemoved(this.f42117b.a() + i, i2);
    }

    public final void onItemRangeMoved(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42116a, false, 36123, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42116a, false, 36123, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42117b.notifyItemMoved(this.f42117b.a() + i, this.f42117b.a() + i2);
    }

    public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f42116a, false, 36120, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f42116a, false, 36120, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        int i3 = i2;
        this.f42117b.notifyItemRangeChanged(this.f42117b.a() + i, i2, obj2);
    }
}
