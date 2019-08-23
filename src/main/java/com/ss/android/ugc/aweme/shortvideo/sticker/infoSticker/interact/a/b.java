package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.IPOIService;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.services.IAVService;
import java.util.Map;

public final /* synthetic */ class b implements IPOIService.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69839a;

    /* renamed from: b  reason: collision with root package name */
    private final a f69840b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f69841c;

    b(a aVar, Activity activity) {
        this.f69840b = aVar;
        this.f69841c = activity;
    }

    public final void a(IPOIService.c cVar, PoiStruct poiStruct, String str) {
        String str2;
        IPOIService.c cVar2 = cVar;
        PoiStruct poiStruct2 = poiStruct;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, poiStruct2, str3}, this, f69839a, false, 79788, new Class[]{IPOIService.c.class, PoiStruct.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, poiStruct2, str3}, this, f69839a, false, 79788, new Class[]{IPOIService.c.class, PoiStruct.class, String.class}, Void.TYPE);
            return;
        }
        a aVar = this.f69840b;
        Activity activity = this.f69841c;
        if (aVar.f69832b != null) {
            aVar.f69832b.a(cVar2, poiStruct2, str3);
            if (PatchProxy.isSupport(new Object[]{activity, poiStruct2, str3}, aVar, a.f69830a, false, 79785, new Class[]{Activity.class, PoiStruct.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, poiStruct2, str3}, aVar, a.f69830a, false, 79785, new Class[]{Activity.class, PoiStruct.class, String.class}, Void.TYPE);
            } else if (activity != null && !activity.isFinishing()) {
                String detectIsFromEditOrStory = ((IAVService) ServiceManager.get().getService(IAVService.class)).detectIsFromEditOrStory(activity);
                String a2 = p.a(poiStruct2, "keyword");
                String str4 = TextUtils.isEmpty(a2) ? "default_search_poi" : "search_poi";
                if (("NULL".equalsIgnoreCase(poiStruct.getPoiId()) ? null : poiStruct2) != null) {
                    String a3 = p.a(poiStruct2, "order");
                    if (PatchProxy.isSupport(new Object[]{activity}, aVar, a.f69830a, false, 79787, new Class[]{Activity.class}, String.class)) {
                        str2 = (String) PatchProxy.accessDispatch(new Object[]{activity}, aVar, a.f69830a, false, 79787, new Class[]{Activity.class}, String.class);
                    } else {
                        Map trickyMapByActivity = ((IAVService) ServiceManager.get().getService(IAVService.class)).getTrickyMapByActivity(activity);
                        str2 = (trickyMapByActivity == null || !trickyMapByActivity.containsKey("creation_id")) ? "" : (String) trickyMapByActivity.get("creation_id");
                    }
                    if (TextUtils.isEmpty(a3)) {
                        a3 = "-1";
                    }
                    if (PatchProxy.isSupport(new Object[]{str2, detectIsFromEditOrStory, str4, a2, a3, str3, poiStruct2}, aVar, a.f69830a, false, 79786, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, PoiStruct.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, detectIsFromEditOrStory, str4, a2, a3, str3, poiStruct2}, aVar, a.f69830a, false, 79786, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, PoiStruct.class}, Void.TYPE);
                        return;
                    }
                    d a4 = d.a();
                    a4.a("enter_from", detectIsFromEditOrStory).a("creation_id", str2).a("poi_type", String.valueOf(poiStruct2.iconType)).a("poi_id", poiStruct2.poiId).a("enter_method", str4).a("content_type", "video").a("log_pb", p.a(poiStruct2, "logpb")).a("order", a3).a("key_word", a2).a("is_media_location", poiStruct.isCandidate()).a("distance_info", poiStruct.getDistance()).a("search_region_type", str3);
                    h.a(poiStruct2, "choose_poi", a4);
                }
            }
        }
    }
}
