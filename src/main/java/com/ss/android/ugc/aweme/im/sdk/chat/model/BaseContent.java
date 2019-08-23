package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.io.Serializable;

@Keep
public class BaseContent implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ext")
    SystemContent extContent;
    @SerializedName("is_card")
    public boolean isCard;
    protected String msgHint = "";
    @SerializedName("prev_id")
    Long prevId;
    @SerializedName("root_id")
    Long rootId;
    @SerializedName("aweType")
    int type;

    public IShareService.ShareStruct generateShareStruct() {
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public void tryInit() {
    }

    public int getType() {
        return this.type;
    }

    public SystemContent getExtContent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51100, new Class[0], SystemContent.class)) {
            return (SystemContent) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51100, new Class[0], SystemContent.class);
        }
        setSystem(this.extContent);
        return this.extContent;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51099, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51099, new Class[0], String.class);
        }
        tryInit();
        return this.msgHint;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setExtContent(SystemContent systemContent) {
        SystemContent systemContent2 = systemContent;
        if (PatchProxy.isSupport(new Object[]{systemContent2}, this, changeQuickRedirect, false, 51101, new Class[]{SystemContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{systemContent2}, this, changeQuickRedirect, false, 51101, new Class[]{SystemContent.class}, Void.TYPE);
            return;
        }
        setSystem(systemContent);
        this.extContent = systemContent2;
    }

    public void setSystem(SystemContent systemContent) {
        SystemContent systemContent2 = systemContent;
        if (PatchProxy.isSupport(new Object[]{systemContent2}, this, changeQuickRedirect, false, 51102, new Class[]{SystemContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{systemContent2}, this, changeQuickRedirect, false, 51102, new Class[]{SystemContent.class}, Void.TYPE);
            return;
        }
        if (systemContent2 != null) {
            systemContent2.setType(100);
        }
    }

    public static void wrapForward(BaseContent baseContent, long j) {
        BaseContent baseContent2 = baseContent;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{baseContent2, new Long(j2)}, null, changeQuickRedirect, true, 51103, new Class[]{BaseContent.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseContent2, new Long(j2)}, null, changeQuickRedirect, true, 51103, new Class[]{BaseContent.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (baseContent2 != null && j2 > 0) {
            baseContent2.prevId = Long.valueOf(j);
            if (baseContent2.rootId == null || baseContent2.rootId.longValue() <= 0) {
                baseContent2.rootId = Long.valueOf(j);
            }
        }
    }
}
