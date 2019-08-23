package com.ss.android.ugc.aweme.shortvideo.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BusinessGoodsPublishModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String draftId;
    public String title;
    public String videoPath;

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77618, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77618, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.videoPath != null) {
            i = this.videoPath.hashCode();
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 77617, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 77617, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusinessGoodsPublishModel businessGoodsPublishModel = (BusinessGoodsPublishModel) obj;
            if (this.videoPath != null) {
                return this.videoPath.equals(businessGoodsPublishModel.videoPath);
            }
            if (businessGoodsPublishModel.videoPath == null) {
                return true;
            }
            return false;
        }
    }

    public BusinessGoodsPublishModel(String str, String str2) {
        this.draftId = str;
        this.title = str2;
    }

    public BusinessGoodsPublishModel(String str, String str2, String str3) {
        this.draftId = str;
        this.title = str2;
        this.videoPath = str3;
    }
}
