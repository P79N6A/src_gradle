package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public class ShareRankingListContent extends BaseContent {
    protected static String AWEME_MSG_HINT = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("update_time")
    String lastUpdateTime;

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51173, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51173, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "ranking";
        shareStruct.awemeType = getType();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51171, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51171, new Class[0], String.class);
        }
        super.getMsgHint();
        return AWEME_MSG_HINT;
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51170, new Class[0], Void.TYPE);
            return;
        }
        Context context = GlobalContext.getContext();
        if (context != null) {
            int type = getType();
            if (type != 2301) {
                switch (type) {
                    case 1801:
                        AWEME_MSG_HINT = context.getString(C0906R.string.axp);
                        return;
                    case 1802:
                        AWEME_MSG_HINT = context.getString(C0906R.string.axq);
                        return;
                    case 1803:
                        AWEME_MSG_HINT = context.getString(C0906R.string.axm);
                        return;
                }
            } else {
                AWEME_MSG_HINT = GlobalContext.getContext().getString(C0906R.string.axl);
            }
        }
    }

    public void setLastUpdateTime(String str) {
        this.lastUpdateTime = str;
    }

    public static ShareRankingListContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51172, new Class[]{IShareService.ShareStruct.class}, ShareRankingListContent.class)) {
            return (ShareRankingListContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51172, new Class[]{IShareService.ShareStruct.class}, ShareRankingListContent.class);
        }
        ShareRankingListContent shareRankingListContent = new ShareRankingListContent();
        if (shareStruct2.extraParams != null) {
            shareRankingListContent.lastUpdateTime = shareStruct2.extraParams.get("update_time");
        }
        shareRankingListContent.type = shareStruct2.awemeType;
        return shareRankingListContent;
    }
}
