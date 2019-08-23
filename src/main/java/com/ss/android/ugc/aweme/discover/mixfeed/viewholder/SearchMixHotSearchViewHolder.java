package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;

public class SearchMixHotSearchViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42597c;

    /* renamed from: d  reason: collision with root package name */
    public Context f42598d;

    /* renamed from: e  reason: collision with root package name */
    public DmtTextView f42599e;

    public final View a() {
        return this.itemView;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42597c, false, 36903, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42597c, false, 36903, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
        if (z) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.height = 0;
            layoutParams.width = 0;
        }
        this.itemView.setLayoutParams(layoutParams);
    }

    public SearchMixHotSearchViewHolder(View view, Context context) {
        super(view);
        this.f42598d = context;
        this.f42599e = (DmtTextView) view.findViewById(C0906R.id.da0);
    }
}
