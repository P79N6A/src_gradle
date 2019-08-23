package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.net.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u00109\u001a\u0004\u0018\u00010:J\b\u0010;\u001a\u00020<H\u0016R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R \u0010$\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0010\"\u0004\b5\u0010\u0012¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryVideoContent;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "()V", "checkPics", "", "", "getCheckPics", "()Ljava/util/List;", "setCheckPics", "(Ljava/util/List;)V", "checkTexts", "getCheckTexts", "setCheckTexts", "fromGallery", "", "getFromGallery", "()I", "setFromGallery", "(I)V", "height", "getHeight", "setHeight", "localCheckPic", "getLocalCheckPic", "()Ljava/lang/String;", "setLocalCheckPic", "(Ljava/lang/String;)V", "localPoster", "getLocalPoster", "setLocalPoster", "localVideo", "getLocalVideo", "setLocalVideo", "massMsg", "getMassMsg", "setMassMsg", "md5", "getMd5", "setMd5", "poster", "Lcom/ss/android/ugc/aweme/im/sdk/chat/net/upload/EncryptUrlModel;", "getPoster", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/net/upload/EncryptUrlModel;", "setPoster", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/net/upload/EncryptUrlModel;)V", "video", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/EncryptedVideoContent;", "getVideo", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/model/EncryptedVideoContent;", "setVideo", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/model/EncryptedVideoContent;)V", "width", "getWidth", "setWidth", "generateShareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "getCheckPicList", "getDisplayPoster", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "tryInit", "", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryVideoContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("check_pics")
    @Nullable
    private List<String> checkPics;
    @SerializedName("check_texts")
    @Nullable
    private List<String> checkTexts;
    @SerializedName("from_gallery")
    private int fromGallery;
    @SerializedName("height")
    private int height;
    @Nullable
    private transient String localCheckPic;
    @Nullable
    private transient String localPoster;
    @Nullable
    private transient String localVideo;
    @SerializedName("mass_msg")
    private int massMsg;
    @SerializedName("md5")
    @Nullable
    private String md5;
    @SerializedName("poster")
    @Nullable
    private a poster;
    @SerializedName("video")
    @Nullable
    private EncryptedVideoContent video;
    @SerializedName("width")
    private int width;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryVideoContent$Companion;", "", "()V", "COUNT_OF_ATTACHMENT", "", "KEY_VIDEO", "", "fromShareStruct", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryVideoContent;", "storyVideoStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "obtain", "videoParam", "Lcom/ss/android/ugc/aweme/im/sdk/chat/net/video/VideoParam;", "obtainAttachmentList", "", "Lcom/bytedance/im/core/model/Attachment;", "storyVideoContent", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final StoryVideoContent fromShareStruct(@NotNull IShareService.ShareStruct shareStruct) {
            IShareService.ShareStruct shareStruct2 = shareStruct;
            if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, changeQuickRedirect, false, 51201, new Class[]{IShareService.ShareStruct.class}, StoryVideoContent.class)) {
                return (StoryVideoContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, changeQuickRedirect, false, 51201, new Class[]{IShareService.ShareStruct.class}, StoryVideoContent.class);
            }
            Intrinsics.checkParameterIsNotNull(shareStruct2, "storyVideoStruct");
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setPoster((a) shareStruct2.videoCover);
            storyVideoContent.setHeight(shareStruct2.awemeHeight);
            storyVideoContent.setWidth(shareStruct2.awemeWidth);
            if (shareStruct2.extraParams != null && shareStruct2.extraParams.containsKey("video")) {
                storyVideoContent.setVideo((EncryptedVideoContent) l.a(shareStruct2.extraParams.get("video"), EncryptedVideoContent.class));
            }
            return storyVideoContent;
        }

        @JvmStatic
        @NotNull
        public final StoryVideoContent obtain(@NotNull f fVar) {
            f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 51202, new Class[]{f.class}, StoryVideoContent.class)) {
                return (StoryVideoContent) PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 51202, new Class[]{f.class}, StoryVideoContent.class);
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "videoParam");
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setCheckTexts(fVar.getCheckTexts());
            storyVideoContent.setLocalCheckPic(fVar.getCheckPic());
            storyVideoContent.setLocalPoster(fVar.getThumbnailPath());
            storyVideoContent.setFromGallery(fVar.getFromGallery());
            storyVideoContent.setLocalVideo(fVar.getVideoPath());
            storyVideoContent.setMd5(fVar.getSrcVideoMD5());
            storyVideoContent.setHeight(fVar.getHeight());
            storyVideoContent.setWidth(fVar.getWidth());
            storyVideoContent.setMassMsg(0);
            return storyVideoContent;
        }

        @JvmStatic
        @Nullable
        public final List<com.bytedance.im.core.d.a> obtainAttachmentList(@NotNull StoryVideoContent storyVideoContent) {
            StoryVideoContent storyVideoContent2 = storyVideoContent;
            if (PatchProxy.isSupport(new Object[]{storyVideoContent2}, this, changeQuickRedirect, false, 51203, new Class[]{StoryVideoContent.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{storyVideoContent2}, this, changeQuickRedirect, false, 51203, new Class[]{StoryVideoContent.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(storyVideoContent2, "storyVideoContent");
            com.bytedance.im.core.d.a aVar = new com.bytedance.im.core.d.a();
            com.bytedance.im.core.d.a aVar2 = new com.bytedance.im.core.d.a();
            com.bytedance.im.core.d.a aVar3 = new com.bytedance.im.core.d.a();
            aVar.setIndex(0);
            aVar2.setIndex(1);
            aVar3.setIndex(2);
            aVar.setLocalPath(storyVideoContent.getLocalCheckPic());
            aVar2.setLocalPath(storyVideoContent.getLocalVideo());
            aVar3.setLocalPath(storyVideoContent.getLocalPoster());
            List<com.bytedance.im.core.d.a> arrayList = new ArrayList<>();
            arrayList.add(aVar);
            arrayList.add(aVar2);
            arrayList.add(aVar3);
            return arrayList;
        }
    }

    @JvmStatic
    @NotNull
    public static final StoryVideoContent fromShareStruct(@NotNull IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (!PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51198, new Class[]{IShareService.ShareStruct.class}, StoryVideoContent.class)) {
            return Companion.fromShareStruct(shareStruct2);
        }
        return (StoryVideoContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51198, new Class[]{IShareService.ShareStruct.class}, StoryVideoContent.class);
    }

    @JvmStatic
    @NotNull
    public static final StoryVideoContent obtain(@NotNull f fVar) {
        f fVar2 = fVar;
        if (!PatchProxy.isSupport(new Object[]{fVar2}, null, changeQuickRedirect, true, 51199, new Class[]{f.class}, StoryVideoContent.class)) {
            return Companion.obtain(fVar2);
        }
        return (StoryVideoContent) PatchProxy.accessDispatch(new Object[]{fVar2}, null, changeQuickRedirect, true, 51199, new Class[]{f.class}, StoryVideoContent.class);
    }

    @JvmStatic
    @Nullable
    public static final List<com.bytedance.im.core.d.a> obtainAttachmentList(@NotNull StoryVideoContent storyVideoContent) {
        StoryVideoContent storyVideoContent2 = storyVideoContent;
        if (!PatchProxy.isSupport(new Object[]{storyVideoContent2}, null, changeQuickRedirect, true, 51200, new Class[]{StoryVideoContent.class}, List.class)) {
            return Companion.obtainAttachmentList(storyVideoContent2);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{storyVideoContent2}, null, changeQuickRedirect, true, 51200, new Class[]{StoryVideoContent.class}, List.class);
    }

    @Nullable
    public final List<String> getCheckPics() {
        return this.checkPics;
    }

    @Nullable
    public final List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public final int getFromGallery() {
        return this.fromGallery;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getLocalCheckPic() {
        return this.localCheckPic;
    }

    @Nullable
    public final String getLocalPoster() {
        return this.localPoster;
    }

    @Nullable
    public final String getLocalVideo() {
        return this.localVideo;
    }

    public final int getMassMsg() {
        return this.massMsg;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final a getPoster() {
        return this.poster;
    }

    @Nullable
    public final EncryptedVideoContent getVideo() {
        return this.video;
    }

    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final List<String> getCheckPicList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51195, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51195, new Class[0], List.class);
        }
        if (this.checkPics == null) {
            this.checkPics = new ArrayList();
        }
        List<String> list = this.checkPics;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        return list;
    }

    @Nullable
    public final UrlModel getDisplayPoster() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51194, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51194, new Class[0], UrlModel.class);
        } else if (this.poster == null) {
            return null;
        } else {
            return a.convert(this.poster);
        }
    }

    public final void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51196, new Class[0], Void.TYPE);
            return;
        }
        this.msgHint = GlobalContext.getContext().getString(C0906R.string.ays);
    }

    @NotNull
    public final IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51197, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51197, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.videoCover = this.poster;
        shareStruct.awemeHeight = this.height;
        shareStruct.awemeWidth = this.width;
        if (this.video != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            String a2 = l.a(this.video);
            Intrinsics.checkExpressionValueIsNotNull(a2, "GsonUtil.toJsonString(video)");
            hashMap.put("video", a2);
            shareStruct.extraParams = hashMap;
        }
        shareStruct.itemType = "story_video";
        return shareStruct;
    }

    public final void setCheckPics(@Nullable List<String> list) {
        this.checkPics = list;
    }

    public final void setCheckTexts(@Nullable List<String> list) {
        this.checkTexts = list;
    }

    public final void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setLocalCheckPic(@Nullable String str) {
        this.localCheckPic = str;
    }

    public final void setLocalPoster(@Nullable String str) {
        this.localPoster = str;
    }

    public final void setLocalVideo(@Nullable String str) {
        this.localVideo = str;
    }

    public final void setMassMsg(int i) {
        this.massMsg = i;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setPoster(@Nullable a aVar) {
        this.poster = aVar;
    }

    public final void setVideo(@Nullable EncryptedVideoContent encryptedVideoContent) {
        this.video = encryptedVideoContent;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
