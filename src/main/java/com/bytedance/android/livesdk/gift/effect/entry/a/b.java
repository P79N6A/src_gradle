package com.bytedance.android.livesdk.gift.effect.entry.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.effect.entry.e.a;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14815a;

    public final a a(as asVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ImageModel imageModel;
        int i5;
        as asVar2 = asVar;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{asVar2}, this, f14815a, false, 9434, new Class[]{as.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{asVar2}, this, f14815a, false, 9434, new Class[]{as.class}, a.class);
        }
        String d2 = asVar.d();
        String c2 = asVar.c();
        User user = asVar2.f16486c;
        if (user == null) {
            return new a(0, "", "");
        }
        long id = user.getId();
        String nickName = user.getNickName();
        int level = user.getLevel();
        ImageModel avatarThumb = user.getAvatarThumb();
        String str = "";
        if (avatarThumb != null && !CollectionUtils.isEmpty(avatarThumb.getUrls())) {
            str = avatarThumb.getUrls().get(0);
        }
        String str2 = "";
        if (user.getUserHonor() == null || user.getUserHonor().j() == null || Lists.isEmpty(user.getUserHonor().j().getUrls())) {
            i = 0;
        } else {
            str2 = user.getUserHonor().j().getUrls().get(0);
            i = user.getUserHonor().m();
        }
        if (asVar2.j > 100) {
            int i7 = asVar2.j;
            i2 = i7 % 10;
            i3 = (i7 / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) % 10;
        } else {
            i3 = 0;
            i2 = -1;
        }
        String str3 = "";
        ImageModel imageModel2 = null;
        if (user.getFansClub() != null) {
            FansClubData data = user.getFansClub().getData();
            Map<Integer, FansClubData> preferData = user.getFansClub().getPreferData();
            if (!FansClubData.isValid(data) && preferData != null && !preferData.isEmpty()) {
                data = preferData.get(1);
            }
            FansClubData fansClubData = data;
            if (FansClubData.isValid(fansClubData)) {
                int i8 = fansClubData.level;
                str3 = fansClubData.clubName;
                if (fansClubData.badge != null && fansClubData.badge.icons != null && !fansClubData.badge.icons.isEmpty()) {
                    Iterator<Integer> it2 = fansClubData.badge.icons.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Iterator<Integer> it3 = it2;
                        i5 = i8;
                        ImageModel imageModel3 = fansClubData.badge.icons.get(it2.next());
                        if (imageModel3 != null) {
                            imageModel2 = imageModel3;
                            break;
                        }
                        it2 = it3;
                        i8 = i5;
                    }
                }
                i5 = i8;
                i4 = fansClubData.userFansClubStatus;
                imageModel = imageModel2;
                i6 = i5;
                return new a(id, nickName, str).b(level).b(d2).c(str2).c(i).d(c2).d(i2).e(i3).a((long) i6).a(str3).a(imageModel).a(i4).a(asVar.l);
            }
        }
        imageModel = null;
        i4 = 0;
        return new a(id, nickName, str).b(level).b(d2).c(str2).c(i).d(c2).d(i2).e(i3).a((long) i6).a(str3).a(imageModel).a(i4).a(asVar.l);
    }
}
