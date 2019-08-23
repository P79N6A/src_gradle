package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;

public class StickerEmojiContent extends EmojiContent {
    public static ChangeQuickRedirect changeQuickRedirect;

    public UrlModel getLocalUrl() {
        return null;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51182, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51182, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "gif";
        shareStruct.videoCover = getUrl();
        shareStruct.awemeType = getType();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51180, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51180, new Class[0], String.class);
        }
        return "[" + GlobalContext.getContext().getString(C0906R.string.ar2) + "]";
    }

    public static StickerEmojiContent obtain(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, null, changeQuickRedirect, true, 51181, new Class[]{a.class}, StickerEmojiContent.class)) {
            return (StickerEmojiContent) PatchProxy.accessDispatch(new Object[]{aVar}, null, changeQuickRedirect, true, 51181, new Class[]{a.class}, StickerEmojiContent.class);
        }
        StickerEmojiContent stickerEmojiContent = new StickerEmojiContent();
        stickerEmojiContent.setUrl(aVar.getAnimateUrl());
        stickerEmojiContent.setImageId(aVar.getId());
        stickerEmojiContent.setDisplayName(aVar.getRealDisplayName());
        stickerEmojiContent.setImageType(aVar.getAnimateType());
        stickerEmojiContent.setPackageId(aVar.getResourcesId());
        stickerEmojiContent.setVersion(aVar.getVersion());
        stickerEmojiContent.setWidth(aVar.getWidth());
        stickerEmojiContent.setHeight(aVar.getHeight());
        return stickerEmojiContent;
    }
}
