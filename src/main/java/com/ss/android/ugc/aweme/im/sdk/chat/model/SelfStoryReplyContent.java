package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/SelfStoryReplyContent;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "()V", "storyContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryContent;", "getStoryContent", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryContent;", "setStoryContent", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryContent;)V", "storyReplyText", "", "getStoryReplyText", "()Ljava/lang/String;", "setStoryReplyText", "(Ljava/lang/String;)V", "storyState", "", "getStoryState", "()Z", "setStoryState", "(Z)V", "generateShareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "tryInit", "", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SelfStoryReplyContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("story")
    @NotNull
    private StoryContent storyContent = new StoryContent();
    @SerializedName("text")
    @Nullable
    private String storyReplyText;
    @SerializedName("story_state")
    private boolean storyState = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/SelfStoryReplyContent$Companion;", "", "()V", "fromShareStruct", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/SelfStoryReplyContent;", "storyStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SelfStoryReplyContent fromShareStruct(@NotNull IShareService.ShareStruct shareStruct) {
            IShareService.ShareStruct shareStruct2 = shareStruct;
            if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, changeQuickRedirect, false, 51137, new Class[]{IShareService.ShareStruct.class}, SelfStoryReplyContent.class)) {
                return (SelfStoryReplyContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, changeQuickRedirect, false, 51137, new Class[]{IShareService.ShareStruct.class}, SelfStoryReplyContent.class);
            }
            Intrinsics.checkParameterIsNotNull(shareStruct2, "storyStruct");
            SelfStoryReplyContent selfStoryReplyContent = new SelfStoryReplyContent();
            selfStoryReplyContent.setStoryReplyText(shareStruct2.shareText);
            selfStoryReplyContent.getStoryContent().setStoryId(shareStruct2.itemIdStr);
            selfStoryReplyContent.getStoryContent().setStoryCover(shareStruct2.videoCover);
            selfStoryReplyContent.getStoryContent().setVideoHeight(shareStruct2.awemeHeight);
            selfStoryReplyContent.getStoryContent().setVideoWidth(shareStruct2.awemeWidth);
            return selfStoryReplyContent;
        }
    }

    @JvmStatic
    @NotNull
    public static final SelfStoryReplyContent fromShareStruct(@NotNull IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (!PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51136, new Class[]{IShareService.ShareStruct.class}, SelfStoryReplyContent.class)) {
            return Companion.fromShareStruct(shareStruct2);
        }
        return (SelfStoryReplyContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51136, new Class[]{IShareService.ShareStruct.class}, SelfStoryReplyContent.class);
    }

    @NotNull
    public final StoryContent getStoryContent() {
        return this.storyContent;
    }

    @Nullable
    public final String getStoryReplyText() {
        return this.storyReplyText;
    }

    public final boolean getStoryState() {
        return this.storyState;
    }

    public final void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51134, new Class[0], Void.TYPE);
            return;
        }
        super.tryInit();
        this.msgHint = this.storyReplyText;
    }

    @NotNull
    public final IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51135, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51135, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.shareText = this.storyReplyText;
        shareStruct.itemIdStr = this.storyContent.getStoryId();
        shareStruct.videoCover = this.storyContent.getStoryCover();
        shareStruct.awemeWidth = this.storyContent.getVideoWidth();
        shareStruct.awemeHeight = this.storyContent.getVideoHeight();
        shareStruct.itemType = "story_self_reply";
        return shareStruct;
    }

    public final void setStoryReplyText(@Nullable String str) {
        this.storyReplyText = str;
    }

    public final void setStoryState(boolean z) {
        this.storyState = z;
    }

    public final void setStoryContent(@NotNull StoryContent storyContent2) {
        StoryContent storyContent3 = storyContent2;
        if (PatchProxy.isSupport(new Object[]{storyContent3}, this, changeQuickRedirect, false, 51133, new Class[]{StoryContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storyContent3}, this, changeQuickRedirect, false, 51133, new Class[]{StoryContent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storyContent3, "<set-?>");
        this.storyContent = storyContent3;
    }
}
