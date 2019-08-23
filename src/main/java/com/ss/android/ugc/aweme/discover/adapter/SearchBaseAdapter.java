package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;

public abstract class SearchBaseAdapter<T> extends RecyclerHeaderViewAdapter<T> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f41777f;
    protected s g;
    public String h;

    public int getLoadMoreHeight(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, f41777f, false, 35769, new Class[]{View.class}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(view.getContext(), 45.0f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f41777f, false, 35769, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public SearchBaseAdapter(s sVar, String str) {
        this.g = sVar;
        this.h = str;
    }
}
