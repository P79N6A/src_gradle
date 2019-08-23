package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43180a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43181b;

    m(DiscoverFragment discoverFragment) {
        this.f43181b = discoverFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43180a, false, 37548, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43180a, false, 37548, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        DiscoverFragment discoverFragment = this.f43181b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, discoverFragment, DiscoverFragment.f42863a, false, 37534, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            DiscoverFragment discoverFragment2 = discoverFragment;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, discoverFragment2, DiscoverFragment.f42863a, false, 37534, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (discoverFragment.isViewValid()) {
            discoverFragment.b(false);
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, discoverFragment, DiscoverFragment.f42863a, false, 37540, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                DiscoverFragment discoverFragment3 = discoverFragment;
                PatchProxy.accessDispatch(new Object[]{(byte) 0}, discoverFragment3, DiscoverFragment.f42863a, false, 37540, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                if (discoverFragment.mRefreshLayout.isEnabled()) {
                    discoverFragment.mRefreshLayout.setRefreshing(false);
                }
                if (discoverFragment.f42867e != null && discoverFragment.f42867e.isEnabled()) {
                    discoverFragment.f42867e.setRefreshing(false);
                }
            }
            if (discoverFragment.mStatusView != null) {
                if (booleanValue) {
                    discoverFragment.mStatusView.b(true);
                    return;
                }
                discoverFragment.mStatusView.a(true);
            }
        }
    }
}
