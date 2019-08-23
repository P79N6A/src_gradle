package com.ss.android.ugc.aweme.music.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ShowLessViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56255a;

    /* renamed from: b  reason: collision with root package name */
    private ShowLessViewHolder f56256b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56255a, false, 59948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56255a, false, 59948, new Class[0], Void.TYPE);
            return;
        }
        ShowLessViewHolder showLessViewHolder = this.f56256b;
        if (showLessViewHolder != null) {
            this.f56256b = null;
            showLessViewHolder.tvShowLess = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ShowLessViewHolder_ViewBinding(ShowLessViewHolder showLessViewHolder, View view) {
        this.f56256b = showLessViewHolder;
        showLessViewHolder.tvShowLess = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.dj0, "field 'tvShowLess'", LinearLayout.class);
    }
}
