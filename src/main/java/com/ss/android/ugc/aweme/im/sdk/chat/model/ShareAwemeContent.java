package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;

@Keep
public class ShareAwemeContent extends BaseContent {
    private static String AWEME_MSG_HINT = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    int awemeType;
    @SerializedName("content_name")
    String contentName;
    @SerializedName("content_thumb")
    UrlModel contentThumb;
    @SerializedName("cover_url")
    UrlModel coverUrl;
    @SerializedName("cover_height")
    float height;
    @SerializedName("itemId")
    String itemId;
    @SerializedName("content_title")
    String title;
    @SerializedName("uid")
    String user;
    @SerializedName("cover_width")
    float width;

    public int getAwemeType() {
        return this.awemeType;
    }

    public String getContentName() {
        return this.contentName;
    }

    public UrlModel getContentThumb() {
        return this.contentThumb;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public float getHeight() {
        return this.height;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser() {
        return this.user;
    }

    public float getWidth() {
        return this.width;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51141, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51141, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "aweme";
        shareStruct.awemeType = getAwemeType();
        shareStruct.videoCover = getCoverUrl();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51139, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51139, new Class[0], String.class);
        }
        super.getMsgHint();
        return AWEME_MSG_HINT;
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51138, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(AWEME_MSG_HINT)) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                AWEME_MSG_HINT = context.getString(C0906R.string.axk);
            }
        }
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setContentName(String str) {
        this.contentName = str;
    }

    public void setContentThumb(UrlModel urlModel) {
        this.contentThumb = urlModel;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setHeight(float f2) {
        this.height = f2;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public void setWidth(float f2) {
        this.width = f2;
    }

    public static ShareAwemeContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51140, new Class[]{IShareService.ShareStruct.class}, ShareAwemeContent.class)) {
            return (ShareAwemeContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51140, new Class[]{IShareService.ShareStruct.class}, ShareAwemeContent.class);
        }
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        shareAwemeContent.setUser(shareStruct2.uid4Share);
        shareAwemeContent.setItemId(shareStruct2.itemIdStr);
        shareAwemeContent.setCoverUrl(shareStruct2.videoCover);
        shareAwemeContent.setContentThumb(shareStruct2.thumb4Share);
        shareAwemeContent.setContentName(shareStruct2.authorName);
        shareAwemeContent.setWidth((float) shareStruct2.awemeWidth);
        shareAwemeContent.setHeight((float) shareStruct2.awemeHeight);
        shareAwemeContent.setAwemeType(0);
        shareAwemeContent.setType(800);
        if (shareStruct2.extraParams != null) {
            shareAwemeContent.setTitle(shareStruct2.extraParams.get("desc"));
        }
        return shareAwemeContent;
    }
}
