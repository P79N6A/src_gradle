package com.ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;

public final class ak implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar_url")
    public String avatar;
    @SerializedName("claim_url")
    public String claimUrl;
    @SerializedName("enterprise_verify_reason")
    public String enterpriseVerifyReason;
    @SerializedName("owner_id")
    public String id;
    @SerializedName("owner_name")
    public String name;
    @SerializedName("open_day")
    public String openDay;
    @SerializedName("open_time")
    public String openTime;
    @SerializedName("signature")
    public String signature;

    public final String appendBusinessTime(String[] strArr, String str) {
        if (PatchProxy.isSupport(new Object[]{strArr, str}, this, changeQuickRedirect, false, 65134, new Class[]{String[].class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{strArr, str}, this, changeQuickRedirect, false, 65134, new Class[]{String[].class, String.class}, String.class);
        } else if (StringUtils.isEmpty(this.openDay) || strArr == null) {
            return this.openTime;
        } else {
            StringBuilder sb = new StringBuilder();
            String[] split = this.openDay.split(",");
            if (split.length > strArr.length) {
                return this.openTime;
            }
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < split.length; i3++) {
                if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equalsIgnoreCase(split[i3])) {
                    if (i < 0) {
                        sb.append(strArr[i3]);
                        i = i3;
                    }
                    if (i3 >= split.length - 1) {
                        i2 = i3;
                    } else {
                        i2 = i3;
                    }
                }
                if (i != i2) {
                    sb.append(str);
                    sb.append(strArr[i2]);
                }
                sb.append(",");
                i = -1;
                i2 = -1;
            }
            if (sb.length() > 0) {
                if (sb.lastIndexOf(",") == sb.length() - 1) {
                    sb.replace(sb.lastIndexOf(","), sb.length(), " ");
                } else {
                    sb.append(" ");
                }
            }
            if (!StringUtils.isEmpty(this.openTime)) {
                sb.append(this.openTime);
            }
            return sb.toString();
        }
    }
}
