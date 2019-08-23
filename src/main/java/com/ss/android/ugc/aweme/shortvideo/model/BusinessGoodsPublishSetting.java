package com.ss.android.ugc.aweme.shortvideo.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;

@Keep
public class BusinessGoodsPublishSetting implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BusinessGoodsPublishModel> goodsPublishModels;
    private String userId;

    public List<BusinessGoodsPublishModel> getGoodsPublishModels() {
        return this.goodsPublishModels;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77620, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77620, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.userId != null) {
            i = this.userId.hashCode();
        }
        return i;
    }

    public void setGoodsPublishModels(List<BusinessGoodsPublishModel> list) {
        this.goodsPublishModels = list;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 77619, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 77619, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusinessGoodsPublishSetting businessGoodsPublishSetting = (BusinessGoodsPublishSetting) obj;
            if (this.userId != null) {
                return this.userId.equals(businessGoodsPublishSetting.userId);
            }
            if (businessGoodsPublishSetting.userId == null) {
                return true;
            }
            return false;
        }
    }
}
