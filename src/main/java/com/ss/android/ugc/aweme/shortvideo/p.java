package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.g;

public final /* synthetic */ class p implements TabHost.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68810a;

    /* renamed from: b  reason: collision with root package name */
    private final TabHost f68811b;

    /* renamed from: c  reason: collision with root package name */
    private final ShortVideoRecordingOperationPanelFragment f68812c;

    p(TabHost tabHost, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f68811b = tabHost;
        this.f68812c = shortVideoRecordingOperationPanelFragment;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f68810a, false, 73918, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f68810a, false, 73918, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        TabHost tabHost = this.f68811b;
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = this.f68812c;
        g gVar = new g(tabHost.a(i), tabHost.a(i2), i, i2);
        shortVideoRecordingOperationPanelFragment.q().a((Object) tabHost, (bc) gVar);
        shortVideoRecordingOperationPanelFragment.k().a((Object) tabHost, (bc) gVar);
    }
}
