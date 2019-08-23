package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.g;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68796a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f68797b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68798c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoRecordingOperationPanelFragment f68799d;

    /* renamed from: e  reason: collision with root package name */
    private final TabHost f68800e;

    o(Object obj, int i, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, TabHost tabHost) {
        this.f68797b = obj;
        this.f68798c = i;
        this.f68799d = shortVideoRecordingOperationPanelFragment;
        this.f68800e = tabHost;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68796a, false, 73917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68796a, false, 73917, new Class[0], Void.TYPE);
            return;
        }
        Object obj = this.f68797b;
        int i = this.f68798c;
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = this.f68799d;
        TabHost tabHost = this.f68800e;
        ai.a("BottomTabPresenter dispatchEvent BottomTabIndexChangeEvent");
        g gVar = new g(null, obj, 1, i);
        gVar.f74765f = true;
        shortVideoRecordingOperationPanelFragment.q().a((Object) tabHost, (bc) gVar);
        shortVideoRecordingOperationPanelFragment.k().a((Object) tabHost, (bc) gVar);
    }
}
