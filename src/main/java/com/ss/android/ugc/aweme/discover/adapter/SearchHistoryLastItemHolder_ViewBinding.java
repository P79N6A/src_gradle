package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SearchHistoryLastItemHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41820a;

    /* renamed from: b  reason: collision with root package name */
    private SearchHistoryLastItemHolder f41821b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41820a, false, 35801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41820a, false, 35801, new Class[0], Void.TYPE);
            return;
        }
        SearchHistoryLastItemHolder searchHistoryLastItemHolder = this.f41821b;
        if (searchHistoryLastItemHolder != null) {
            this.f41821b = null;
            searchHistoryLastItemHolder.mTipView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SearchHistoryLastItemHolder_ViewBinding(SearchHistoryLastItemHolder searchHistoryLastItemHolder, View view) {
        this.f41821b = searchHistoryLastItemHolder;
        searchHistoryLastItemHolder.mTipView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.di6, "field 'mTipView'", DmtTextView.class);
    }
}
