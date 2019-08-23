package com.ss.android.ugc.aweme.detail.panel;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel_ViewBinding;

public class DetailFragmentPanel_ViewBinding extends BaseListFragmentPanel_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41328a;

    /* renamed from: c  reason: collision with root package name */
    private DetailFragmentPanel f41329c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41328a, false, 34991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41328a, false, 34991, new Class[0], Void.TYPE);
            return;
        }
        DetailFragmentPanel detailFragmentPanel = this.f41329c;
        if (detailFragmentPanel != null) {
            this.f41329c = null;
            detailFragmentPanel.mLayout = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DetailFragmentPanel_ViewBinding(DetailFragmentPanel detailFragmentPanel, View view) {
        super(detailFragmentPanel, view);
        this.f41329c = detailFragmentPanel;
        detailFragmentPanel.mLayout = Utils.findRequiredView(view, C0906R.id.chy, "field 'mLayout'");
    }
}
