package com.bytedance.android.livesdk.browser.fragment;

import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class TTLiveBrowserFragment$$Lambda$0 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9360a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9361b;

    TTLiveBrowserFragment$$Lambda$0(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9361b = tTLiveBrowserFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (!PatchProxy.isSupport(new Object[]{menuItem2}, this, f9360a, false, 3535, new Class[]{MenuItem.class}, Boolean.TYPE)) {
            return this.f9361b.a(menuItem2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{menuItem2}, this, f9360a, false, 3535, new Class[]{MenuItem.class}, Boolean.TYPE)).booleanValue();
    }
}
