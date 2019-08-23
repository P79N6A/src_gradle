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
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class SearchMiniAppViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41828a;

    /* renamed from: b  reason: collision with root package name */
    private SearchMiniAppViewHolder f41829b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41828a, false, 35816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41828a, false, 35816, new Class[0], Void.TYPE);
            return;
        }
        SearchMiniAppViewHolder searchMiniAppViewHolder = this.f41829b;
        if (searchMiniAppViewHolder != null) {
            this.f41829b = null;
            searchMiniAppViewHolder.mAvatarIV = null;
            searchMiniAppViewHolder.mAvatarSmallIV = null;
            searchMiniAppViewHolder.mTitleTV = null;
            searchMiniAppViewHolder.mSummaryTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SearchMiniAppViewHolder_ViewBinding(SearchMiniAppViewHolder searchMiniAppViewHolder, View view) {
        this.f41829b = searchMiniAppViewHolder;
        searchMiniAppViewHolder.mAvatarIV = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ayr, "field 'mAvatarIV'", RemoteImageView.class);
        searchMiniAppViewHolder.mAvatarSmallIV = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ayu, "field 'mAvatarSmallIV'", RemoteImageView.class);
        searchMiniAppViewHolder.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.deo, "field 'mTitleTV'", TextView.class);
        searchMiniAppViewHolder.mSummaryTV = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.den, "field 'mSummaryTV'", TextView.class);
    }
}
