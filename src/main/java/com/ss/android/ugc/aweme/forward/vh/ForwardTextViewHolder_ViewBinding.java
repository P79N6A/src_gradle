package com.ss.android.ugc.aweme.forward.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ForwardTextViewHolder_ViewBinding extends BaseForwardViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48371b;

    /* renamed from: c  reason: collision with root package name */
    private ForwardTextViewHolder f48372c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48371b, false, 45639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48371b, false, 45639, new Class[0], Void.TYPE);
            return;
        }
        ForwardTextViewHolder forwardTextViewHolder = this.f48372c;
        if (forwardTextViewHolder != null) {
            this.f48372c = null;
            forwardTextViewHolder.mContentView = null;
            forwardTextViewHolder.mDynamicStub = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ForwardTextViewHolder_ViewBinding(ForwardTextViewHolder forwardTextViewHolder, View view) {
        super(forwardTextViewHolder, view);
        this.f48372c = forwardTextViewHolder;
        forwardTextViewHolder.mContentView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.da0, "field 'mContentView'", TextView.class);
        forwardTextViewHolder.mDynamicStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
    }
}
