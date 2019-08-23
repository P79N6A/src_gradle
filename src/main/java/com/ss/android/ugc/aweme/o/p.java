package com.ss.android.ugc.aweme.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.b.c;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.search.POISearchDialog;
import com.ss.android.ugc.aweme.port.in.ae;

public final /* synthetic */ class p implements POISearchDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58304a;

    /* renamed from: b  reason: collision with root package name */
    private final ae.b f58305b;

    /* renamed from: c  reason: collision with root package name */
    private final POISearchDialog f58306c;

    p(ae.b bVar, POISearchDialog pOISearchDialog) {
        this.f58305b = bVar;
        this.f58306c = pOISearchDialog;
    }

    public final void onPOIChanged(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f58304a, false, 54692, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f58304a, false, 54692, new Class[]{c.class}, Void.TYPE);
            return;
        }
        ae.b bVar = this.f58305b;
        POISearchDialog pOISearchDialog = this.f58306c;
        if (cVar.f59745b != null) {
            bVar.a(cVar.f59745b.toStickerPoiStruct(), pOISearchDialog.b());
            return;
        }
        PoiStruct poiStruct = new PoiStruct();
        poiStruct.setPoiId("NULL");
        bVar.a(poiStruct.toStickerPoiStruct(), pOISearchDialog.b());
    }
}
