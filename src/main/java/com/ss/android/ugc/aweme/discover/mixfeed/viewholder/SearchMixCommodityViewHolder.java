package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.a.h;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.discover.ui.ar;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.utils.bg;

public class SearchMixCommodityViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42593c;

    /* renamed from: d  reason: collision with root package name */
    public ar f42594d;

    public final View a() {
        return this.itemView;
    }

    public SearchMixCommodityViewHolder(View view) {
        super(view);
        this.f42594d = new ar(view, view.getContext(), new ap.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42595a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f42595a, false, 36901, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42595a, false, 36901, new Class[0], Void.TYPE);
                    return;
                }
                bg.a(new h(aw.h));
            }
        });
    }
}
