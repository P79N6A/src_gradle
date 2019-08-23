package com.ss.android.ugc.aweme.music.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ChallengeTitleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56179a;

    /* renamed from: b  reason: collision with root package name */
    private ChallengeTitleViewHolder f56180b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56179a, false, 59871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56179a, false, 59871, new Class[0], Void.TYPE);
            return;
        }
        ChallengeTitleViewHolder challengeTitleViewHolder = this.f56180b;
        if (challengeTitleViewHolder != null) {
            this.f56180b = null;
            challengeTitleViewHolder.title = null;
            challengeTitleViewHolder.rootLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ChallengeTitleViewHolder_ViewBinding(ChallengeTitleViewHolder challengeTitleViewHolder, View view) {
        this.f56180b = challengeTitleViewHolder;
        challengeTitleViewHolder.title = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.rv, "field 'title'", TextView.class);
        challengeTitleViewHolder.rootLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.rw, "field 'rootLayout'", LinearLayout.class);
    }
}
