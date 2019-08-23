package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SearchHistoryItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41811a;

    /* renamed from: b  reason: collision with root package name */
    private SearchHistoryItemViewHolder f41812b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41811a, false, 35797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41811a, false, 35797, new Class[0], Void.TYPE);
            return;
        }
        SearchHistoryItemViewHolder searchHistoryItemViewHolder = this.f41812b;
        if (searchHistoryItemViewHolder != null) {
            this.f41812b = null;
            searchHistoryItemViewHolder.mDeleteView = null;
            searchHistoryItemViewHolder.mContentView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SearchHistoryItemViewHolder_ViewBinding(SearchHistoryItemViewHolder searchHistoryItemViewHolder, View view) {
        this.f41812b = searchHistoryItemViewHolder;
        searchHistoryItemViewHolder.mDeleteView = Utils.findRequiredView(view, C0906R.id.b0f, "field 'mDeleteView'");
        searchHistoryItemViewHolder.mContentView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.da0, "field 'mContentView'", TextView.class);
    }
}
