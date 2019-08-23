package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.data.PoiCardStruct;
import java.io.Serializable;

public final class m implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_show")
    public int isShow;
    @SerializedName("url")
    public String url;

    public final int getIsShow() {
        return this.isShow;
    }

    public final String getUrl() {
        return this.url;
    }

    public final PoiCardStruct toStickerPoiCard() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65026, new Class[0], PoiCardStruct.class)) {
            return (PoiCardStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65026, new Class[0], PoiCardStruct.class);
        }
        PoiCardStruct poiCardStruct = new PoiCardStruct();
        poiCardStruct.setIsShow(Integer.valueOf(this.isShow));
        poiCardStruct.setUrl(this.url);
        return poiCardStruct;
    }

    public final void setIsShow(int i) {
        this.isShow = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void fromStickerPoiStruct(PoiCardStruct poiCardStruct) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{poiCardStruct}, this, changeQuickRedirect, false, 65027, new Class[]{PoiCardStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiCardStruct}, this, changeQuickRedirect, false, 65027, new Class[]{PoiCardStruct.class}, Void.TYPE);
        } else if (poiCardStruct != null) {
            if (poiCardStruct.getIsShow() != null) {
                i = poiCardStruct.getIsShow().intValue();
            }
            this.isShow = i;
            this.url = poiCardStruct.getUrl();
        }
    }
}
