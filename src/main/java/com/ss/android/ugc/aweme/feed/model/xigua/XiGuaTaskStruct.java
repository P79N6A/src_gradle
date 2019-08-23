package com.ss.android.ugc.aweme.feed.model.xigua;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.io.Serializable;

public class XiGuaTaskStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    static final long serialVersionUID = 18;
    @SerializedName("desc")
    public String desc;
    @SerializedName("entrance_url")
    public String entranceUrl;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("is_xigua_task")
    public boolean isXiGuaTask;
    @SerializedName("jump_url")
    public String jumpUrl;
    @SerializedName("switch_type")
    public int switchType;
    @SerializedName("title")
    public String title;

    public String getDesc() {
        return this.desc;
    }

    public String getEntranceUrl() {
        return this.entranceUrl;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isXiGuaTask() {
        return this.isXiGuaTask;
    }

    public boolean isShowInEvening() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41510, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41510, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isXiGuaTask() && AbTestManager.a().y() == 3) {
            z = true;
        }
        return z;
    }

    public boolean isShowInPoi() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41508, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41508, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isXiGuaTask() || AbTestManager.a().y() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isShowInRedPacket() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41509, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41509, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isXiGuaTask() && AbTestManager.a().y() == 2) {
            z = true;
        }
        return z;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEntranceUrl(String str) {
        this.entranceUrl = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setXiGuaTask(boolean z) {
        this.isXiGuaTask = z;
    }
}
