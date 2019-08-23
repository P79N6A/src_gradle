package com.bytedance.android.live.base.model.user;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Map;

@Keep
public class FansClubData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @SerializedName("anchor_id")
    public long anchorId;
    @SerializedName("available_gift_ids")
    public List<Long> availableGiftIds;
    @SerializedName("badge")
    public UserBadge badge;
    @SerializedName("club_name")
    public String clubName;
    @SerializedName("level")
    public int level;
    @SerializedName("user_fans_club_status")
    public int userFansClubStatus;

    @Keep
    public static class UserBadge {
        public Map<Integer, ImageModel> icons;
        public String title;
    }

    public static boolean isValid(FansClubData fansClubData) {
        FansClubData fansClubData2 = fansClubData;
        if (PatchProxy.isSupport(new Object[]{fansClubData2}, null, changeQuickRedirect, true, 84, new Class[]{FansClubData.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fansClubData2}, null, changeQuickRedirect, true, 84, new Class[]{FansClubData.class}, Boolean.TYPE)).booleanValue();
        } else if (fansClubData2 == null || TextUtils.isEmpty(fansClubData2.clubName)) {
            return false;
        } else {
            return true;
        }
    }
}
