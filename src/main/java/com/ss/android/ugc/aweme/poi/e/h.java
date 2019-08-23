package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.f;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.u.aa;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59792a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r25, java.lang.String[] r26, java.lang.String r27, java.lang.String r28, com.ss.android.ugc.aweme.poi.c r29) {
        /*
            r1 = r25
            r6 = r26
            r0 = 5
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r2 = 0
            r7[r2] = r1
            r14 = 1
            r7[r14] = r6
            r15 = 2
            r7[r15] = r27
            r16 = 3
            r7[r16] = r28
            r17 = 4
            r7[r17] = r29
            com.meituan.robust.ChangeQuickRedirect r9 = f59792a
            java.lang.Class[] r12 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r12[r2] = r8
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r12[r14] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r15] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r16] = r8
            java.lang.Class<com.ss.android.ugc.aweme.poi.c> r8 = com.ss.android.ugc.aweme.poi.c.class
            r12[r17] = r8
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = 0
            r10 = 1
            r11 = 66829(0x1050d, float:9.3647E-41)
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x0072
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r1
            r7[r14] = r6
            r7[r15] = r27
            r7[r16] = r28
            r7[r17] = r29
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = f59792a
            r21 = 1
            r22 = 66829(0x1050d, float:9.3647E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r2] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r16] = r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.c> r1 = com.ss.android.ugc.aweme.poi.c.class
            r0[r17] = r1
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r7
            r23 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x0072:
            if (r6 == 0) goto L_0x0094
            int r0 = r6.length
            if (r0 != 0) goto L_0x0078
            goto L_0x0094
        L_0x0078:
            com.ss.android.ugc.aweme.common.ui.a r7 = new com.ss.android.ugc.aweme.common.ui.a
            r7.<init>(r1)
            com.ss.android.ugc.aweme.poi.e.j r8 = new com.ss.android.ugc.aweme.poi.e.j
            r0 = r8
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r27
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a((java.lang.CharSequence[]) r6, (android.content.DialogInterface.OnClickListener) r8)
            r7.b()
            return
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.e.h.a(android.content.Context, java.lang.String[], java.lang.String, java.lang.String, com.ss.android.ugc.aweme.poi.c):void");
    }

    public static void a(String str, String str2, c cVar) {
        String str3 = str;
        String str4 = str2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, cVar2}, null, f59792a, true, 66834, new Class[]{String.class, String.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, cVar2}, null, f59792a, true, 66834, new Class[]{String.class, String.class, c.class}, Void.TYPE);
            return;
        }
        a(cVar2, "poi_map_operation", d.a().a("enter_from", "poi_page").a("action_type", str4).a("enter_method", str3).a("poi_type", cVar.getPoiType()).a("poi_id", cVar.getPoiId()).a("group_id", cVar.getAwemeId()).a("previous_page", cVar.getPreviousPage()));
    }

    public static void a(Aweme aweme, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{aweme, str2, dVar2}, null, f59792a, true, 66837, new Class[]{Aweme.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2, dVar2}, null, f59792a, true, 66837, new Class[]{Aweme.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (aweme != null) {
            dVar2.a("poi_backend_type", aa.f(aweme));
            if (aweme.getPoiStruct() != null) {
                a(aweme.getPoiStruct().getCityCode(), dVar2);
                dVar2.a("poi_id", aweme.getPoiStruct().getPoiId());
                dVar2.a("poi_type", aweme.getPoiStruct().getTypeCode());
            }
        }
        r.a(str2, (Map) dVar2.f34114b);
    }

    public static void a(c cVar, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{cVar, str2, dVar2}, null, f59792a, true, 66839, new Class[]{c.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str2, dVar2}, null, f59792a, true, 66839, new Class[]{c.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.getBackendType())) {
                dVar2.a("poi_backend_type", cVar.getBackendType());
            }
            a(cVar.getPoiCity(), dVar2);
        }
        r.a(str2, (Map) dVar2.f34114b);
    }

    public static void a(a aVar, String str, d dVar) {
        a aVar2 = aVar;
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, dVar2}, null, f59792a, true, 66841, new Class[]{a.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, dVar2}, null, f59792a, true, 66841, new Class[]{a.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            if (!TextUtils.isEmpty(aVar2.n)) {
                dVar2.a("poi_backend_type", aVar2.n);
            }
            a(aVar2.o, dVar2);
        }
        r.a(str2, (Map) dVar2.f34114b);
    }

    public static void a(SimplePoiInfoStruct simplePoiInfoStruct, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct, str2, dVar2}, null, f59792a, true, 66842, new Class[]{SimplePoiInfoStruct.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct, str2, dVar2}, null, f59792a, true, 66842, new Class[]{SimplePoiInfoStruct.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (simplePoiInfoStruct != null) {
            if (!TextUtils.isEmpty(simplePoiInfoStruct.getPoiBackendType())) {
                dVar2.a("poi_backend_type", simplePoiInfoStruct.getPoiBackendType());
            }
            a(simplePoiInfoStruct.getCityCode(), dVar2);
        }
        r.a(str2, (Map) dVar2.f34114b);
    }

    public static void a(l lVar, String str, d dVar) {
        l lVar2 = lVar;
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{lVar2, str2, dVar2}, null, f59792a, true, 66843, new Class[]{l.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar2, str2, dVar2}, null, f59792a, true, 66843, new Class[]{l.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (lVar2 != null) {
            if (!TextUtils.isEmpty(lVar2.backendType)) {
                dVar2.a("poi_backend_type", lVar2.backendType);
            }
            a(lVar2.cityCode, dVar2);
        }
        r.a(str2, (Map) dVar2.f34114b);
    }

    private static void a(PoiDetail poiDetail, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{poiDetail, str2, dVar2}, null, f59792a, true, 66845, new Class[]{PoiDetail.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiDetail, str2, dVar2}, null, f59792a, true, 66845, new Class[]{PoiDetail.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (poiDetail != null) {
            if (!TextUtils.isEmpty(poiDetail.getBackendType())) {
                dVar2.a("poi_backend_type", poiDetail.getBackendType());
            }
            a(poiDetail.getCityCode(), dVar2);
        }
        r.a(str2, (Map) dVar2.f34114b);
    }

    public static void a(PoiStruct poiStruct, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{poiStruct, str2, dVar2}, null, f59792a, true, 66846, new Class[]{PoiStruct.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct, str2, dVar2}, null, f59792a, true, 66846, new Class[]{PoiStruct.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (poiStruct != null) {
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                dVar2.a("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            a(poiStruct.getCityCode(), dVar2);
        }
        r.a(str2, (Map) dVar2.f34114b);
    }

    public static void a(HashMap<String, String> hashMap, c cVar) {
        HashMap<String, String> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{hashMap2, cVar}, null, f59792a, true, 66848, new Class[]{HashMap.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap2, cVar}, null, f59792a, true, 66848, new Class[]{HashMap.class, c.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(cVar.getBackendType())) {
            hashMap2.put("poi_backend_type", cVar.getBackendType());
        }
        if (!TextUtils.isEmpty(cVar.getPoiCity())) {
            hashMap2.put("poi_city", cVar.getPoiCity());
            hashMap2.put("poi_device_samecity", cVar.getPoiCity().equalsIgnoreCase(com.ss.android.ugc.aweme.feed.c.d()) ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        }
    }

    public static void a(String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str2, dVar2}, null, f59792a, true, 66849, new Class[]{String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, dVar2}, null, f59792a, true, 66849, new Class[]{String.class, d.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            dVar2.a("poi_city", str2);
            dVar2.a("poi_device_samecity", str2.equalsIgnoreCase(com.ss.android.ugc.aweme.feed.c.d()) ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        }
    }

    public static HashMap<String, String> a(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f59792a, true, 66850, new Class[]{Aweme.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{aweme}, null, f59792a, true, 66850, new Class[]{Aweme.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(aweme == null || aweme.getPoiStruct() == null)) {
            hashMap.put("poi_id", aa.e(aweme));
            hashMap.put("poi_channel", aa.b());
            PoiStruct poiStruct = aweme.getPoiStruct();
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                hashMap.put("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            if (!TextUtils.isEmpty(poiStruct.getCityCode())) {
                hashMap.put("poi_city", poiStruct.getCityCode());
                if (poiStruct.getCityCode().equalsIgnoreCase(com.ss.android.ugc.aweme.feed.c.d())) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                hashMap.put("poi_device_samecity", str);
            }
        }
        return hashMap;
    }

    static void a(Context context, PoiDetail poiDetail) {
        Context context2 = context;
        PoiDetail poiDetail2 = poiDetail;
        if (PatchProxy.isSupport(new Object[]{context2, poiDetail2}, null, f59792a, true, 66833, new Class[]{Context.class, PoiDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, poiDetail2}, null, f59792a, true, 66833, new Class[]{Context.class, PoiDetail.class}, Void.TYPE);
            return;
        }
        IIMService a2 = b.a(false);
        if (b.b() && a2 != null) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(poiDetail.getEnterpriseId());
            iMUser.setNickName(poiDetail.getEnterpriseTitle());
            iMUser.setAvatarThumb(poiDetail.getEnterpriseThumb());
            iMUser.setEnterpriseVerifyReason(poiDetail.getEnterpriseVerifyReason());
            iMUser.setSignature(poiDetail.getEnterpriseSignature());
            iMUser.setCommerceUserLevel(1);
            a2.startChat(context2, iMUser);
            f.a(poiDetail.getEnterpriseId());
            a(poiDetail2, "enter_chat", d.a().a("enter_from", "poi_page").a("enter_method", "click_poi_contact_method").a("poi_id", poiDetail.getPoiId()).a("poi_type", poiDetail.getTypeCode()).a("to_user_id", poiDetail.getEnterpriseId()));
        }
    }

    public static Bitmap a(Context context, PoiStruct poiStruct, p.a aVar) {
        if (!PatchProxy.isSupport(new Object[]{context, poiStruct, aVar}, null, f59792a, true, 66826, new Class[]{Context.class, PoiStruct.class, p.a.class}, Bitmap.class)) {
            return BitmapFactory.decodeResource(context.getResources(), 2130839743);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{context, poiStruct, aVar}, null, f59792a, true, 66826, new Class[]{Context.class, PoiStruct.class, p.a.class}, Bitmap.class);
    }

    public static void b(c cVar, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{cVar, str2, dVar2}, null, f59792a, true, 66840, new Class[]{c.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str2, dVar2}, null, f59792a, true, 66840, new Class[]{c.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.getBackendType())) {
                dVar2.a("poi_backend_type", cVar.getBackendType());
            }
            a(cVar.getPoiCity(), dVar2);
        }
        r.a(str2, aa.a(dVar2.f34114b));
    }

    public static void b(Aweme aweme, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{aweme, str2, dVar2}, null, f59792a, true, 66838, new Class[]{Aweme.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2, dVar2}, null, f59792a, true, 66838, new Class[]{Aweme.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (aweme != null) {
            dVar2.a("poi_backend_type", aa.f(aweme));
            if (aweme.getPoiStruct() != null) {
                a(aweme.getPoiStruct().getCityCode(), dVar2);
                dVar2.a("poi_id", aweme.getPoiStruct().getPoiId());
                dVar2.a("poi_type", aweme.getPoiStruct().getTypeCode());
            }
        }
        r.a(str2, aa.a(dVar2.f34114b));
    }

    public static void b(PoiStruct poiStruct, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{poiStruct, str2, dVar2}, null, f59792a, true, 66847, new Class[]{PoiStruct.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct, str2, dVar2}, null, f59792a, true, 66847, new Class[]{PoiStruct.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (poiStruct != null) {
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                dVar2.a("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            a(poiStruct.getCityCode(), dVar2);
        }
        r.a(str2, aa.a(dVar2.f34114b));
    }

    public static void a(Context context, String str, String str2, String str3) {
        String str4;
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str5, str6, str7}, null, f59792a, true, 66851, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str5, str6, str7};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f59792a, true, 66851, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(context)) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.bgf).a();
        } else if (str5.startsWith("http")) {
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse(str));
            intent.putExtra("bundle_user_webview_title", true);
            context2.startActivity(intent);
        } else {
            if (str5.contains("__enter_from__")) {
                str4 = str5.replace("__enter_from__", str6);
            } else {
                str4 = str5;
            }
            if (str4.contains("__enter_method__")) {
                str4 = str4.replace("__enter_method__", str7);
            }
            com.ss.android.ugc.aweme.ag.h.a().a(str4);
        }
    }

    static void b(Context context, String str, String str2, String str3, c cVar) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6, cVar2}, null, f59792a, true, 66830, new Class[]{Context.class, String.class, String.class, String.class, c.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f59792a, true, 66830, new Class[]{Context.class, String.class, String.class, String.class, c.class}, Void.TYPE);
            return;
        }
        a(cVar2, "poi_call", d.a().a("enter_from", str6).a("shop_id", "").a("poi_type", cVar.getPoiType()).a("poi_id", cVar.getPoiId()).a("group_id", cVar.getAwemeId()).a("previous_page", cVar.getPreviousPage()).a("click_method", str5));
        context2.startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str4, null)));
    }

    public static void a(Context context, String str, String str2, String str3, c cVar) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6, cVar2}, null, f59792a, true, 66828, new Class[]{Context.class, String.class, String.class, String.class, c.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f59792a, true, 66828, new Class[]{Context.class, String.class, String.class, String.class, c.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            a(context2, str4.split(";"), str5, str6, cVar2);
        }
    }
}
