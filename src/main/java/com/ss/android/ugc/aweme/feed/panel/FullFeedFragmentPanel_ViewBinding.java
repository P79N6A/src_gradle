package com.ss.android.ugc.aweme.feed.panel;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FullFeedFragmentPanel_ViewBinding extends BaseListFragmentPanel_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45694a;

    /* renamed from: c  reason: collision with root package name */
    private FullFeedFragmentPanel f45695c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f45694a, false, 41901, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45694a, false, 41901, new Class[0], Void.TYPE);
            return;
        }
        FullFeedFragmentPanel fullFeedFragmentPanel = this.f45695c;
        if (fullFeedFragmentPanel != null) {
            this.f45695c = null;
            fullFeedFragmentPanel.mLayout = null;
            fullFeedFragmentPanel.newGuideStub = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FullFeedFragmentPanel_ViewBinding(FullFeedFragmentPanel fullFeedFragmentPanel, View view) {
        super(fullFeedFragmentPanel, view);
        this.f45695c = fullFeedFragmentPanel;
        fullFeedFragmentPanel.mLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.acz, "field 'mLayout'", ViewGroup.class);
        fullFeedFragmentPanel.newGuideStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cwu, "field 'newGuideStub'", ViewStub.class);
    }
}
