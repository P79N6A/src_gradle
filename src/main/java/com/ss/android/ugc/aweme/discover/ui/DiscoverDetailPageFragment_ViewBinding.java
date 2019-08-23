package com.ss.android.ugc.aweme.discover.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment_ViewBinding;

public class DiscoverDetailPageFragment_ViewBinding extends DetailPageFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f42828b;

    /* renamed from: c  reason: collision with root package name */
    private DiscoverDetailPageFragment f42829c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f42828b, false, 37466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42828b, false, 37466, new Class[0], Void.TYPE);
            return;
        }
        DiscoverDetailPageFragment discoverDetailPageFragment = this.f42829c;
        if (discoverDetailPageFragment != null) {
            this.f42829c = null;
            discoverDetailPageFragment.mDiscoverExpandView = null;
            discoverDetailPageFragment.mDiscoverShootView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DiscoverDetailPageFragment_ViewBinding(DiscoverDetailPageFragment discoverDetailPageFragment, View view) {
        super(discoverDetailPageFragment, view);
        this.f42829c = discoverDetailPageFragment;
        discoverDetailPageFragment.mDiscoverExpandView = (DiscoverExpandView) Utils.findRequiredViewAsType(view, C0906R.id.a4_, "field 'mDiscoverExpandView'", DiscoverExpandView.class);
        discoverDetailPageFragment.mDiscoverShootView = (DiscoverShootView) Utils.findRequiredViewAsType(view, C0906R.id.drb, "field 'mDiscoverShootView'", DiscoverShootView.class);
    }
}
