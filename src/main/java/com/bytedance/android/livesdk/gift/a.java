package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdkapi.host.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14692a;

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f14692a, true, 9223, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f14692a, true, 9223, new Class[]{Long.TYPE}, String.class);
        }
        b findGiftById = GiftManager.inst().findGiftById(j2);
        if (findGiftById == null) {
            return "";
        }
        ImageModel imageModel = findGiftById.f15103b;
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() <= 0) {
            return "";
        }
        return ((e) com.bytedance.android.live.utility.b.a(e.class)).b(imageModel.getUrls().get(0));
    }

    public static void b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f14692a, true, 9224, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f14692a, true, 9224, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        b findGiftById = GiftManager.inst().findGiftById(j2);
        if (findGiftById != null) {
            ImageModel imageModel = findGiftById.f15103b;
            if (!(imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() <= 0)) {
                ((e) com.bytedance.android.live.utility.b.a(e.class)).a(imageModel.getUrls().get(0));
            }
        }
    }
}
