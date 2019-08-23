package com.ss.android.ugc.aweme.poi.rn;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.rn.VideoViewManager;

public final /* synthetic */ class e implements VideoViewManager.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60305a;

    /* renamed from: b  reason: collision with root package name */
    static final VideoViewManager.a f60306b = new e();

    private e() {
    }

    public final void a(String str, c cVar) {
        if (PatchProxy.isSupport(new Object[]{str, cVar}, this, f60305a, false, 65675, new Class[]{String.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, cVar}, this, f60305a, false, 65675, new Class[]{String.class, c.class}, Void.TYPE);
            return;
        }
        ((UIManagerModule) ((ReactContext) cVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new a(cVar.getId(), str));
    }
}
