package com.ss.android.ugc.aweme.newfollow;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FavoriteTitleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57052a;

    /* renamed from: b  reason: collision with root package name */
    private FavoriteTitleViewHolder f57053b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57052a, false, 61008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57052a, false, 61008, new Class[0], Void.TYPE);
            return;
        }
        FavoriteTitleViewHolder favoriteTitleViewHolder = this.f57053b;
        if (favoriteTitleViewHolder != null) {
            this.f57053b = null;
            favoriteTitleViewHolder.mFavoriteCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FavoriteTitleViewHolder_ViewBinding(FavoriteTitleViewHolder favoriteTitleViewHolder, View view) {
        this.f57053b = favoriteTitleViewHolder;
        favoriteTitleViewHolder.mFavoriteCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.acm, "field 'mFavoriteCountView'", TextView.class);
    }
}
