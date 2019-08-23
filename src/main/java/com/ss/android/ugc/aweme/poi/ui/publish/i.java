package com.ss.android.ugc.aweme.poi.ui.publish;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.IPOIService;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;

public final /* synthetic */ class i implements IPOIService.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60873a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60874b;

    i(b bVar) {
        this.f60874b = bVar;
    }

    public final void a(IPOIService.c cVar, PoiStruct poiStruct, String str) {
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{cVar, poiStruct2, str}, this, f60873a, false, 66667, new Class[]{IPOIService.c.class, PoiStruct.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, poiStruct2, str}, this, f60873a, false, 66667, new Class[]{IPOIService.c.class, PoiStruct.class, String.class}, Void.TYPE);
            return;
        }
        b bVar = this.f60874b;
        String a2 = p.a(poiStruct2, "keyword");
        String str2 = TextUtils.isEmpty(a2) ? "default_search_poi" : "search_poi";
        PoiStruct poiStruct3 = "NULL".equalsIgnoreCase(poiStruct.getPoiId()) ? null : poiStruct2;
        bVar.a(poiStruct3);
        if (poiStruct3 != null) {
            String a3 = p.a(poiStruct2, "order");
            if (TextUtils.isEmpty(a3)) {
                a3 = "-1";
            }
            bVar.a(str2, a2, a3, p.a(poiStruct2, "logpb"), str, poiStruct);
        }
    }
}
