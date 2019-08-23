package com.ss.android.ugc.aweme.challenge.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SearchAwemeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35339a;

    /* renamed from: b  reason: collision with root package name */
    private SearchAwemeViewHolder f35340b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35339a, false, 25800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35339a, false, 25800, new Class[0], Void.TYPE);
            return;
        }
        SearchAwemeViewHolder searchAwemeViewHolder = this.f35340b;
        if (searchAwemeViewHolder != null) {
            this.f35340b = null;
            searchAwemeViewHolder.mTitleView = null;
            searchAwemeViewHolder.mDescView = null;
            searchAwemeViewHolder.mJoinCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SearchAwemeViewHolder_ViewBinding(SearchAwemeViewHolder searchAwemeViewHolder, View view) {
        this.f35340b = searchAwemeViewHolder;
        searchAwemeViewHolder.mTitleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitleView'", TextView.class);
        searchAwemeViewHolder.mDescView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3m, "field 'mDescView'", TextView.class);
        searchAwemeViewHolder.mJoinCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.b6s, "field 'mJoinCountView'", TextView.class);
        searchAwemeViewHolder.margin = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.cl);
    }
}
