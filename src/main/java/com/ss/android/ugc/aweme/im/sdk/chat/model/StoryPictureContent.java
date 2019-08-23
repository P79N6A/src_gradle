package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j;
import com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a;
import com.ss.android.ugc.aweme.im.sdk.utils.aa;
import com.ss.android.ugc.aweme.im.sdk.utils.e;
import com.ss.android.ugc.aweme.im.sdk.utils.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class StoryPictureContent extends BaseContent {
    public static String STORY_PICTURE_HINT = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("check_pics")
    List<String> checkPics;
    @SerializedName("check_texts")
    List<String> checkTexts;
    String compressPath;
    @SerializedName("from_gallery")
    int fromGallery;
    @SerializedName("cover_height")
    int height;
    @SerializedName("mass_msg")
    int massMsg;
    @SerializedName("md5")
    String md5;
    String picturePath;
    boolean sendRaw;
    @SerializedName("resource_url")
    a url;
    @SerializedName("cover_width")
    int width;

    public List<String> getCheckPics() {
        return this.checkPics;
    }

    public List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public String getCompressPath() {
        return this.compressPath;
    }

    public int getFromGallery() {
        return this.fromGallery;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMassMsg() {
        return this.massMsg;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSendRaw() {
        return this.sendRaw;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51184, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51184, new Class[0], String.class);
        }
        super.getMsgHint();
        return STORY_PICTURE_HINT;
    }

    public UrlModel getUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51185, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51185, new Class[0], UrlModel.class);
        } else if (this.url == null) {
            return null;
        } else {
            return a.convert(this.url);
        }
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51183, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(STORY_PICTURE_HINT)) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                STORY_PICTURE_HINT = context.getString(C0906R.string.aym);
            }
        }
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51187, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51187, new Class[0], IShareService.ShareStruct.class);
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

    public void setCheckPics(List<String> list) {
        this.checkPics = list;
    }

    public void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public void setCompressPath(String str) {
        this.compressPath = str;
    }

    public void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMassMsg(int i) {
        this.massMsg = i;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPicturePath(String str) {
        this.picturePath = str;
    }

    public void setSendRaw(boolean z) {
        this.sendRaw = z;
    }

    public void setUrl(a aVar) {
        this.url = aVar;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static StoryPictureContent obtain(j jVar) {
        String str;
        FileInputStream fileInputStream;
        if (PatchProxy.isSupport(new Object[]{jVar}, null, changeQuickRedirect, true, 51186, new Class[]{j.class}, StoryPictureContent.class)) {
            return (StoryPictureContent) PatchProxy.accessDispatch(new Object[]{jVar}, null, changeQuickRedirect, true, 51186, new Class[]{j.class}, StoryPictureContent.class);
        }
        StoryPictureContent storyPictureContent = new StoryPictureContent();
        String path = jVar.getPath();
        if (PatchProxy.isSupport(new Object[]{path}, null, w.f52667a, true, 53516, new Class[]{String.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{path}, null, w.f52667a, true, 53516, new Class[]{String.class}, String.class);
        } else {
            File file = new File(path);
            if (file.length() > 524288) {
                if (PatchProxy.isSupport(new Object[]{path}, null, e.f52582a, true, 53353, new Class[]{String.class}, FileInputStream.class)) {
                    fileInputStream = (FileInputStream) PatchProxy.accessDispatch(new Object[]{path}, null, e.f52582a, true, 53353, new Class[]{String.class}, FileInputStream.class);
                } else {
                    fileInputStream = e.a(new File(path));
                }
                str = aa.a(e.a((InputStream) fileInputStream));
            } else {
                str = aa.a(file);
            }
        }
        storyPictureContent.setMd5(str);
        storyPictureContent.setFromGallery(jVar.getFromGallery());
        storyPictureContent.setCheckTexts(jVar.getCheckTexts());
        storyPictureContent.setPicturePath(jVar.getPath());
        storyPictureContent.setHeight(jVar.getHeight());
        storyPictureContent.setWidth(jVar.getWith());
        storyPictureContent.setMassMsg(0);
        storyPictureContent.setType(2700);
        return storyPictureContent;
    }
}
