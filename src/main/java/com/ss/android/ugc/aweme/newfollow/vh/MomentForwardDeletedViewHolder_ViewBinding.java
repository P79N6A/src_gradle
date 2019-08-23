package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder_ViewBinding;

public class MomentForwardDeletedViewHolder_ViewBinding extends BaseForwardViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57653b;

    /* renamed from: c  reason: collision with root package name */
    private MomentForwardDeletedViewHolder f57654c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57653b, false, 62623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57653b, false, 62623, new Class[0], Void.TYPE);
            return;
        }
        MomentForwardDeletedViewHolder momentForwardDeletedViewHolder = this.f57654c;
        if (momentForwardDeletedViewHolder != null) {
            this.f57654c = null;
            momentForwardDeletedViewHolder.mContentView = null;
            momentForwardDeletedViewHolder.mDynamicStub = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MomentForwardDeletedViewHolder_ViewBinding(MomentForwardDeletedViewHolder momentForwardDeletedViewHolder, View view) {
        super(momentForwardDeletedViewHolder, view);
        this.f57654c = momentForwardDeletedViewHolder;
        momentForwardDeletedViewHolder.mContentView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.da0, "field 'mContentView'", DmtTextView.class);
        momentForwardDeletedViewHolder.mDynamicStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
    }
}
