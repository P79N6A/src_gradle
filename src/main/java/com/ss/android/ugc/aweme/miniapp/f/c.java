package com.ss.android.ugc.aweme.miniapp.f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.amap.api.location.CoordinateConverter;
import com.amap.api.location.DPoint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.miniapp_api.b.a;
import com.ss.android.ugc.aweme.poi.model.ag;
import com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements com.ss.android.ugc.aweme.miniapp_api.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3584a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.f.c$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55751a = new int[a.C0643a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.ugc.aweme.miniapp_api.b.a$a[] r0 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55751a = r0
                int[] r0 = f55751a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.miniapp_api.b.a$a r1 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.GPS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f55751a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.miniapp_api.b.a$a r1 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.BAIDU     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f55751a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.miniapp_api.b.a$a r1 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.GOOGLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f55751a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.miniapp_api.b.a$a r1 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.ALIYUN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f55751a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.ugc.aweme.miniapp_api.b.a$a r1 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.MAPABC     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f55751a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.ugc.aweme.miniapp_api.b.a$a r1 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.SOSOMAP     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f55751a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.ugc.aweme.miniapp_api.b.a$a r1 = com.ss.android.ugc.aweme.miniapp_api.b.a.C0643a.MAPBAR     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.f.c.AnonymousClass1.<clinit>():void");
        }
    }

    public final JSONObject b(Activity activity) {
        if (!PatchProxy.isSupport(new Object[]{activity}, this, f3584a, false, 59417, new Class[]{Activity.class}, JSONObject.class)) {
            return com.ss.android.common.d.c.a((Context) activity).d();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{activity}, this, f3584a, false, 59417, new Class[]{Activity.class}, JSONObject.class);
    }

    public final JSONObject c(Activity activity) {
        if (!PatchProxy.isSupport(new Object[]{activity}, this, f3584a, false, 59418, new Class[]{Activity.class}, JSONObject.class)) {
            return com.ss.android.common.d.c.a((Context) activity).d();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{activity}, this, f3584a, false, 59418, new Class[]{Activity.class}, JSONObject.class);
    }

    public final void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f3584a, false, 59416, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f3584a, false, 59416, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        com.ss.android.common.d.c a2 = com.ss.android.common.d.c.a((Context) activity);
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.common.d.c.f2441a, false, 15846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.common.d.c.f2441a, false, 15846, new Class[0], Void.TYPE);
            return;
        }
        a2.g.a(false, false);
        a2.c(false);
    }

    public final void a(Activity activity, a aVar) {
        Activity activity2 = activity;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, this, f3584a, false, 59415, new Class[]{Activity.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, this, f3584a, false, 59415, new Class[]{Activity.class, a.class}, Void.TYPE);
            return;
        }
        ag agVar = new ag();
        agVar.name = aVar2.f55982a;
        agVar.address = aVar2.f55983b;
        agVar.zoom = 14.0f;
        agVar.latitude = aVar2.f55986e;
        agVar.longitude = aVar2.f55985d;
        if (PatchProxy.isSupport(new Object[]{activity2, agVar}, null, PoiRouteActivity.f60478a, true, 66128, new Class[]{Context.class, ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, agVar}, null, PoiRouteActivity.f60478a, true, 66128, new Class[]{Context.class, ag.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2, agVar, (byte) 0}, null, PoiRouteActivity.f60478a, true, 66129, new Class[]{Context.class, ag.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, agVar, (byte) 0}, null, PoiRouteActivity.f60478a, true, 66129, new Class[]{Context.class, ag.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, PoiRouteActivity.class);
        intent.putExtra("poi_latlng", agVar);
        intent.putExtra("poi_route_from_poi", false);
        activity2.startActivity(intent);
    }

    private DPoint a(Activity activity, DPoint dPoint, a.C0643a aVar) {
        CoordinateConverter.CoordType coordType;
        DPoint dPoint2;
        Activity activity2 = activity;
        DPoint dPoint3 = dPoint;
        if (PatchProxy.isSupport(new Object[]{activity2, dPoint3, aVar}, this, f3584a, false, 59420, new Class[]{Activity.class, DPoint.class, a.C0643a.class}, DPoint.class)) {
            return (DPoint) PatchProxy.accessDispatch(new Object[]{activity2, dPoint3, aVar}, this, f3584a, false, 59420, new Class[]{Activity.class, DPoint.class, a.C0643a.class}, DPoint.class);
        }
        CoordinateConverter coordinateConverter = new CoordinateConverter(activity2);
        switch (AnonymousClass1.f55751a[aVar.ordinal()]) {
            case 1:
                coordType = CoordinateConverter.CoordType.GPS;
                break;
            case 2:
                coordType = CoordinateConverter.CoordType.BAIDU;
                break;
            case 3:
                coordType = CoordinateConverter.CoordType.GOOGLE;
                break;
            case 4:
                coordType = CoordinateConverter.CoordType.ALIYUN;
                break;
            case 5:
                coordType = CoordinateConverter.CoordType.MAPABC;
                break;
            case 6:
                coordType = CoordinateConverter.CoordType.SOSOMAP;
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                coordType = CoordinateConverter.CoordType.MAPBAR;
                break;
            default:
                coordType = null;
                break;
        }
        coordinateConverter.from(coordType);
        try {
            coordinateConverter.coord(dPoint3);
            dPoint2 = coordinateConverter.convert();
        } catch (Exception unused) {
            dPoint2 = null;
        }
        return dPoint2;
    }

    public final void a(@NonNull JSONObject jSONObject, Activity activity, a.C0643a aVar) {
        JSONObject jSONObject2 = jSONObject;
        Activity activity2 = activity;
        a.C0643a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, activity2, aVar2}, this, f3584a, false, 59419, new Class[]{JSONObject.class, Activity.class, a.C0643a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, activity2, aVar2}, this, f3584a, false, 59419, new Class[]{JSONObject.class, Activity.class, a.C0643a.class}, Void.TYPE);
            return;
        }
        DPoint a2 = a(activity2, new DPoint(Double.valueOf(jSONObject2.optDouble("latitude")).doubleValue(), Double.valueOf(jSONObject2.optDouble("longitude")).doubleValue()), aVar2);
        if (a2 != null) {
            try {
                jSONObject2.put("longitude", a2.getLongitude());
                jSONObject2.put("latitude", a2.getLatitude());
            } catch (JSONException unused) {
            }
        }
    }
}
