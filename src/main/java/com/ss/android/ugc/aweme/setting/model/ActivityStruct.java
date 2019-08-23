package com.ss.android.ugc.aweme.setting.model;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public class ActivityStruct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_sticker_id_array")
    public ArrayList<String> activityStickerIdArray;
    @SerializedName("comment_icon")
    public UrlModel commentIcon;
    @SerializedName("digg_icon")
    public UrlModel diggIcon;
    @SerializedName("hash_tags")
    public ArrayList<String> hashTags;
    @SerializedName("in_activity")
    public boolean inActivity;
    @SerializedName("activity_name")
    public String name;
    @SerializedName("shot_icon")
    public UrlModel publishIcon;
    @SerializedName("share_icon")
    public UrlModel shareIcon;
    @SerializedName("share_tip_icon")
    public UrlModel shareTipIcon;
    @SerializedName("watermark_struct")
    public WatermarkStruct struct;
    @SerializedName("undigg_icon")
    public UrlModel undiggIcon;

    public class WatermarkStruct {
        @SerializedName("end_watermark_string")
        public String endWatermarkString;
        @SerializedName("end_watermark_substring")
        public String endWatermarkSubstring;
        @SerializedName("fps")
        public String fps;
        @SerializedName("md5")
        public String md5;
        @SerializedName("resource_url")
        public UrlModel waterResource;

        public WatermarkStruct() {
        }
    }

    @NonNull
    public ArrayList<String> getActivityStickerIdArray() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72227, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72227, new Class[0], ArrayList.class);
        } else if (this.activityStickerIdArray == null) {
            return new ArrayList<>();
        } else {
            return this.activityStickerIdArray;
        }
    }
}
