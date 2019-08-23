package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.ss.android.ugc.aweme.discover.ui.as;

public class SearchMixMiniAppViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42600c;

    /* renamed from: d  reason: collision with root package name */
    public as f42601d;

    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f42600c, false, 36907, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f42600c, false, 36907, new Class[0], View.class);
        } else if (this.f42601d != null) {
            return this.f42601d.b();
        } else {
            return null;
        }
    }

    public SearchMixMiniAppViewHolder(View view, Context context) {
        super(view);
        this.f42601d = new as(view, context);
    }
}
