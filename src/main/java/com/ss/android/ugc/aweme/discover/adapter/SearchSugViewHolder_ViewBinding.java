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

public class SearchSugViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41895a;

    /* renamed from: b  reason: collision with root package name */
    private SearchSugViewHolder f41896b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41895a, false, 35913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41895a, false, 35913, new Class[0], Void.TYPE);
            return;
        }
        SearchSugViewHolder searchSugViewHolder = this.f41896b;
        if (searchSugViewHolder != null) {
            this.f41896b = null;
            searchSugViewHolder.mSugView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SearchSugViewHolder_ViewBinding(SearchSugViewHolder searchSugViewHolder, View view) {
        this.f41896b = searchSugViewHolder;
        searchSugViewHolder.mSugView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dk2, "field 'mSugView'", TextView.class);
    }
}
