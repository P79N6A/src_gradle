package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.resources.a;
import java.io.File;
import java.util.ArrayList;

@Keep
public class EmojiContent extends BaseContent {
    private static String BIG_EMOJI_MESSAGE_HINT = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("height")
    int height;
    @SerializedName("image_id")
    private long imageId;
    @SerializedName("image_type")
    private String imageType;
    @SerializedName("package_id")
    private long packageId;
    @SerializedName("url")
    UrlModel url;
    @SerializedName("version")
    private String version;
    @SerializedName("width")
    int width;

    public String getDisplayName() {
        return this.displayName;
    }

    public int getHeight() {
        return this.height;
    }

    public long getImageId() {
        return this.imageId;
    }

    public String getImageType() {
        return this.imageType;
    }

    public long getPackageId() {
        return this.packageId;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51116, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51116, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "gif";
        shareStruct.videoCover = getUrl();
        shareStruct.awemeType = getType();
        return shareStruct;
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51113, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(BIG_EMOJI_MESSAGE_HINT)) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                BIG_EMOJI_MESSAGE_HINT = context.getString(C0906R.string.apa);
            }
        }
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51114, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51114, new Class[0], String.class);
        } else if (501 == getType()) {
            return "[" + GlobalContext.getContext().getString(C0906R.string.ar2) + "]";
        } else if (!StringUtils.isEmpty(getDisplayName())) {
            return "[" + getDisplayName() + "]";
        } else {
            super.getMsgHint();
            return BIG_EMOJI_MESSAGE_HINT;
        }
    }

    public UrlModel getLocalUrl() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51112, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51112, new Class[0], UrlModel.class);
        } else if (getType() == 502) {
            return null;
        } else {
            if (getType() == 501) {
                str = a.a(0, PushConstants.PUSH_TYPE_NOTIFY, this.imageId, this.imageType);
            } else {
                str = a.a(this.packageId, this.version, this.imageId, this.imageType);
            }
            if (!new File(str).exists()) {
                return null;
            }
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.add("file://" + str);
            urlModel.setUrlList(arrayList);
            urlModel.setUri("file://" + str);
            return urlModel;
        }
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageId(long j) {
        this.imageId = j;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setPackageId(long j) {
        this.packageId = j;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static EmojiContent obtain(com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, null, changeQuickRedirect, true, 51115, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, EmojiContent.class)) {
            return (EmojiContent) PatchProxy.accessDispatch(new Object[]{aVar}, null, changeQuickRedirect, true, 51115, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, EmojiContent.class);
        }
        EmojiContent emojiContent = new EmojiContent();
        emojiContent.setUrl(aVar.getAnimateUrl());
        emojiContent.setImageId(aVar.getId());
        emojiContent.setDisplayName(aVar.getRealDisplayName());
        emojiContent.setImageType(aVar.getAnimateType());
        emojiContent.setPackageId(aVar.getResourcesId());
        emojiContent.setVersion(aVar.getVersion());
        emojiContent.setWidth(aVar.getWidth());
        emojiContent.setHeight(aVar.getHeight());
        if (aVar.getStickerType() == 2) {
            emojiContent.setType(501);
        } else if (aVar.getStickerType() == 3) {
            emojiContent.setType(502);
        } else {
            emojiContent.setType(500);
        }
        return emojiContent;
    }
}
