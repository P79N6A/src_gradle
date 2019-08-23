package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.chooser.f;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j;

@Keep
public class OnlyPictureContent extends BaseContent {
    private static String ONLY_PICTURE_GINT = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("compress_path")
    String compressPath;
    @SerializedName("cover_height")
    int height;
    @SerializedName("mime")
    String mime;
    @SerializedName("local_path")
    String picturePath;
    @SerializedName("send_raw")
    boolean sendRaw;
    @SerializedName("resource_url")
    UrlModel url;
    @SerializedName("cover_width")
    int width;

    public String getCompressPath() {
        return this.compressPath;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMime() {
        return this.mime;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSendRaw() {
        return this.sendRaw;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51129, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51129, new Class[0], String.class);
        }
        super.getMsgHint();
        return ONLY_PICTURE_GINT;
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51128, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(ONLY_PICTURE_GINT)) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                ONLY_PICTURE_GINT = context.getString(C0906R.string.axn);
            }
        }
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51132, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51132, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "pic";
        shareStruct.videoCover = getUrl();
        if (shareStruct.videoCover == null) {
            shareStruct.videoCover = new UrlModel();
            UrlModel urlModel = shareStruct.videoCover;
            urlModel.setUri("file://" + getPicturePath());
        }
        shareStruct.awemeWidth = getWidth();
        shareStruct.awemeHeight = getHeight();
        return shareStruct;
    }

    public void setCompressPath(String str) {
        this.compressPath = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setPicturePath(String str) {
        this.picturePath = str;
    }

    public void setSendRaw(boolean z) {
        this.sendRaw = z;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static OnlyPictureContent obtain(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, changeQuickRedirect, true, 51130, new Class[]{f.class}, OnlyPictureContent.class)) {
            return (OnlyPictureContent) PatchProxy.accessDispatch(new Object[]{fVar2}, null, changeQuickRedirect, true, 51130, new Class[]{f.class}, OnlyPictureContent.class);
        }
        OnlyPictureContent onlyPictureContent = new OnlyPictureContent();
        onlyPictureContent.setPicturePath(fVar2.f27990b);
        onlyPictureContent.setWidth(fVar2.i);
        onlyPictureContent.setHeight(fVar2.j);
        onlyPictureContent.setMime(fVar2.g);
        return onlyPictureContent;
    }

    public static OnlyPictureContent obtain(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, null, changeQuickRedirect, true, 51131, new Class[]{j.class}, OnlyPictureContent.class)) {
            return (OnlyPictureContent) PatchProxy.accessDispatch(new Object[]{jVar}, null, changeQuickRedirect, true, 51131, new Class[]{j.class}, OnlyPictureContent.class);
        }
        OnlyPictureContent onlyPictureContent = new OnlyPictureContent();
        onlyPictureContent.setPicturePath(jVar.getPath());
        onlyPictureContent.setWidth(jVar.getWith());
        onlyPictureContent.setHeight(jVar.getHeight());
        onlyPictureContent.setMime(jVar.getMime());
        return onlyPictureContent;
    }
}
