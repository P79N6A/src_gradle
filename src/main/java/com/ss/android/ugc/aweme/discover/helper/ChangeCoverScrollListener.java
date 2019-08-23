package com.ss.android.ugc.aweme.discover.helper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter;
import com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;

public class ChangeCoverScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42282a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f42283b;

    public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        boolean z;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42282a, false, 36295, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42282a, false, 36295, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f42282a, false, 36297, new Class[]{RecyclerView.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f42282a, false, 36297, new Class[]{RecyclerView.class}, Boolean.TYPE)).booleanValue();
        } else {
            ImageView imageView = (ImageView) recyclerView.findViewById(C0906R.id.b29);
            if (imageView != null) {
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                if (iArr[1] * 2 > UIUtils.getScreenHeight(GlobalContext.getContext())) {
                    z = true;
                }
            }
            z = false;
        }
        if (z != this.f42283b) {
            if (PatchProxy.isSupport(new Object[]{recyclerView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42282a, false, 36296, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView2, Byte.valueOf(z)}, this, f42282a, false, 36296, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
            } else if (recyclerView2 != null) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(2);
                if ((findViewHolderForAdapterPosition instanceof HotVideoViewHolder) && findViewHolderForAdapterPosition.getItemViewType() == CategoryListAdapter.a.b()) {
                    this.f42283b = z;
                    ((HotVideoViewHolder) findViewHolderForAdapterPosition).a(z);
                }
            }
        }
    }
}
