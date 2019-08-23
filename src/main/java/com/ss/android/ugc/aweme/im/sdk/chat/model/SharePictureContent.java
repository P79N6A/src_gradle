package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

@Keep
public class SharePictureContent extends ShareAwemeContent {
    private static String PICTURE_MSG_HINT = "";
    public static ChangeQuickRedirect changeQuickRedirect;

    public int getAwemeType() {
        this.awemeType = 2;
        return 2;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51166, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51166, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "aweme";
        shareStruct.awemeType = getAwemeType();
        shareStruct.videoCover = getCoverUrl();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51164, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51164, new Class[0], String.class);
        }
        super.getMsgHint();
        return PICTURE_MSG_HINT;
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51163, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(PICTURE_MSG_HINT)) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                PICTURE_MSG_HINT = context.getString(C0906R.string.axo);
            }
        }
    }

    public static SharePictureContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51165, new Class[]{IShareService.ShareStruct.class}, SharePictureContent.class)) {
            return (SharePictureContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51165, new Class[]{IShareService.ShareStruct.class}, SharePictureContent.class);
        }
        SharePictureContent sharePictureContent = new SharePictureContent();
        sharePictureContent.setUser(shareStruct2.uid4Share);
        sharePictureContent.setItemId(shareStruct2.itemIdStr);
        sharePictureContent.setCoverUrl(shareStruct2.videoCover);
        sharePictureContent.setContentThumb(shareStruct2.thumb4Share);
        sharePictureContent.setContentName(shareStruct2.authorName);
        sharePictureContent.setWidth((float) shareStruct2.awemeWidth);
        sharePictureContent.setHeight((float) shareStruct2.awemeHeight);
        sharePictureContent.setAwemeType(2);
        sharePictureContent.setType(800);
        sharePictureContent.setTitle(shareStruct2.title);
        return sharePictureContent;
    }
}
