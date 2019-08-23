package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.IPOIService;
import com.ss.android.ugc.aweme.poi.b.c;
import com.ss.android.ugc.aweme.poi.search.POISearchDialog;

public final /* synthetic */ class POIService$$Lambda$0 implements POISearchDialog.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IPOIService.b arg$1;
    private final POISearchDialog arg$2;

    POIService$$Lambda$0(IPOIService.b bVar, POISearchDialog pOISearchDialog) {
        this.arg$1 = bVar;
        this.arg$2 = pOISearchDialog;
    }

    public final void onPOIChanged(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 71473, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 71473, new Class[]{c.class}, Void.TYPE);
            return;
        }
        POIService.lambda$getPOISearchDialog$0$POIService(this.arg$1, this.arg$2, cVar);
    }
}
