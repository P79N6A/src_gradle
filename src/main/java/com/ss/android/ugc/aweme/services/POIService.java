package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.poi.IPOIService;
import com.ss.android.ugc.aweme.poi.b.c;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.search.POISearchDialog;
import com.ss.android.ugc.aweme.poi.ui.publish.PoiContext;

@Keep
public class POIService implements IPOIService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public PoiStruct poiContext2PoiStruct(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71472, new Class[]{String.class}, PoiStruct.class)) {
            return (PoiStruct) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71472, new Class[]{String.class}, PoiStruct.class);
        }
        PoiContext unserializeFromJson = PoiContext.unserializeFromJson(str);
        if (unserializeFromJson == null) {
            return null;
        }
        PoiStruct poiStruct = new PoiStruct();
        poiStruct.poiId = unserializeFromJson.mSelectPoiId;
        poiStruct.poiName = unserializeFromJson.mSelectPoiName;
        return poiStruct;
    }

    public String poiStruct2PoiContext(@NonNull PoiStruct poiStruct) {
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{poiStruct2}, this, changeQuickRedirect, false, 71471, new Class[]{PoiStruct.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{poiStruct2}, this, changeQuickRedirect, false, 71471, new Class[]{PoiStruct.class}, String.class);
        }
        PoiContext poiContext = new PoiContext();
        poiContext.mSelectPoiId = poiStruct2.poiId;
        poiContext.mSelectPoiName = poiStruct2.poiName;
        return m.d().toJson((Object) poiContext);
    }

    static final /* synthetic */ void lambda$getPOISearchDialog$0$POIService(IPOIService.b bVar, POISearchDialog pOISearchDialog, c cVar) {
        IPOIService.c cVar2;
        if (cVar.f59744a == 2) {
            cVar2 = IPOIService.c.RESULT_MANUAL;
        } else {
            cVar2 = IPOIService.c.RESULT_DEFAULT;
        }
        if (cVar.f59745b != null) {
            bVar.a(cVar2, cVar.f59745b, pOISearchDialog.b());
            return;
        }
        PoiStruct poiStruct = new PoiStruct();
        poiStruct.setPoiId("NULL");
        bVar.a(cVar2, poiStruct, pOISearchDialog.b());
    }

    public Dialog getPOISearchDialog(Activity activity, Bundle bundle, IPOIService.b bVar) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        IPOIService.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2, bVar2}, this, changeQuickRedirect, false, 71470, new Class[]{Activity.class, Bundle.class, IPOIService.b.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{activity2, bundle2, bVar2}, this, changeQuickRedirect, false, 71470, new Class[]{Activity.class, Bundle.class, IPOIService.b.class}, Dialog.class);
        }
        POISearchDialog pOISearchDialog = new POISearchDialog(activity2, bundle2);
        pOISearchDialog.setOwnerActivity(activity2);
        pOISearchDialog.f3744b = new POIService$$Lambda$0(bVar2, pOISearchDialog);
        return pOISearchDialog;
    }
}
