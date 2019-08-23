package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.ss.android.ugc.aweme.discover.ui.au;

public class SearchMixPoiViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42620c;

    /* renamed from: d  reason: collision with root package name */
    public au f42621d;

    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f42620c, false, 36931, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f42620c, false, 36931, new Class[0], View.class);
        } else if (this.f42621d != null) {
            return this.f42621d.b();
        } else {
            return null;
        }
    }

    public SearchMixPoiViewHolder(View view, Context context) {
        super(view);
        this.f42621d = new au(view, context);
        View findViewById = view.findViewById(C0906R.id.axu);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) UIUtils.dip2Px(context, 16.0f);
        layoutParams.rightMargin = (int) UIUtils.dip2Px(context, 16.0f);
        findViewById.setLayoutParams(layoutParams);
        if (this.f42621d.f3077d != null) {
            this.f42621d.f3077d.setFontType(c.g);
        }
    }
}
