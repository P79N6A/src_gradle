package com.ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71134a;

    /* renamed from: b  reason: collision with root package name */
    private static BusinessGoodsPublishSetting f71135b;

    public static void a() {
        f71135b = null;
    }

    private static synchronized BusinessGoodsPublishSetting c() {
        synchronized (h.class) {
            if (PatchProxy.isSupport(new Object[0], null, f71134a, true, 80859, new Class[0], BusinessGoodsPublishSetting.class)) {
                BusinessGoodsPublishSetting businessGoodsPublishSetting = (BusinessGoodsPublishSetting) PatchProxy.accessDispatch(new Object[0], null, f71134a, true, 80859, new Class[0], BusinessGoodsPublishSetting.class);
                return businessGoodsPublishSetting;
            }
            if (f71135b == null) {
                Iterator<BusinessGoodsPublishSetting> it2 = b().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        BusinessGoodsPublishSetting next = it2.next();
                        try {
                            if (((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID().equals(next.getUserId())) {
                                f71135b = next;
                                break;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            BusinessGoodsPublishSetting businessGoodsPublishSetting2 = f71135b;
            return businessGoodsPublishSetting2;
        }
    }

    private static List<BusinessGoodsPublishSetting> b() {
        if (PatchProxy.isSupport(new Object[0], null, f71134a, true, 80858, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f71134a, true, 80858, new Class[0], List.class);
        }
        String str = (String) x.a().j().c();
        if (!TextUtils.isEmpty(str)) {
            return (List) new Gson().fromJson(str, new TypeToken<List<BusinessGoodsPublishSetting>>() {
            }.getType());
        }
        return new ArrayList();
    }

    public static void a(BusinessGoodsPublishModel businessGoodsPublishModel) {
        BusinessGoodsPublishModel businessGoodsPublishModel2 = businessGoodsPublishModel;
        if (PatchProxy.isSupport(new Object[]{businessGoodsPublishModel2}, null, f71134a, true, 80862, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{businessGoodsPublishModel2}, null, f71134a, true, 80862, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE);
            return;
        }
        BusinessGoodsPublishSetting c2 = c();
        if (c2 == null) {
            c2 = new BusinessGoodsPublishSetting();
            c2.setUserId(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        }
        List goodsPublishModels = c2.getGoodsPublishModels();
        if (goodsPublishModels == null) {
            goodsPublishModels = new ArrayList();
        } else {
            goodsPublishModels.remove(businessGoodsPublishModel2);
        }
        if (businessGoodsPublishModel2 != null) {
            goodsPublishModels.add(businessGoodsPublishModel2);
        }
        c2.setGoodsPublishModels(goodsPublishModels);
        a(c2);
    }

    public static BusinessGoodsPublishModel b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f71134a, true, 80863, new Class[]{String.class}, BusinessGoodsPublishModel.class)) {
            return (BusinessGoodsPublishModel) PatchProxy.accessDispatch(new Object[]{str2}, null, f71134a, true, 80863, new Class[]{String.class}, BusinessGoodsPublishModel.class);
        } else if (c() == null) {
            return null;
        } else {
            for (BusinessGoodsPublishModel businessGoodsPublishModel : f71135b.getGoodsPublishModels()) {
                if (businessGoodsPublishModel != null && !TextUtils.isEmpty(str) && str2.equals(businessGoodsPublishModel.videoPath)) {
                    return businessGoodsPublishModel;
                }
            }
            return null;
        }
    }

    private static void a(BusinessGoodsPublishSetting businessGoodsPublishSetting) {
        BusinessGoodsPublishSetting businessGoodsPublishSetting2 = businessGoodsPublishSetting;
        if (PatchProxy.isSupport(new Object[]{businessGoodsPublishSetting2}, null, f71134a, true, 80861, new Class[]{BusinessGoodsPublishSetting.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{businessGoodsPublishSetting2}, null, f71134a, true, 80861, new Class[]{BusinessGoodsPublishSetting.class}, Void.TYPE);
            return;
        }
        List<BusinessGoodsPublishSetting> b2 = b();
        b2.remove(businessGoodsPublishSetting2);
        b2.add(businessGoodsPublishSetting2);
        x.a().j().a(new Gson().toJson((Object) b2));
        f71135b = businessGoodsPublishSetting2;
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f71134a, true, 80860, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f71134a, true, 80860, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            BusinessGoodsPublishSetting c2 = c();
            if (c2 != null) {
                List goodsPublishModels = c2.getGoodsPublishModels();
                if (goodsPublishModels != null && goodsPublishModels.size() != 0) {
                    Iterator it2 = goodsPublishModels.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        BusinessGoodsPublishModel businessGoodsPublishModel = (BusinessGoodsPublishModel) it2.next();
                        if (businessGoodsPublishModel != null && str2.equals(businessGoodsPublishModel.videoPath)) {
                            goodsPublishModels.remove(businessGoodsPublishModel);
                            break;
                        }
                    }
                    c2.setGoodsPublishModels(goodsPublishModels);
                    List<BusinessGoodsPublishSetting> b2 = b();
                    b2.remove(c2);
                    b2.add(c2);
                    x.a().j().a(new Gson().toJson((Object) b2));
                }
            }
        }
    }
}
