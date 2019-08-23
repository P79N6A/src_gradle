package com.ss.android.ugc.aweme.im.sdk.chat.net.a;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/net/video/VideoParam;", "Ljava/io/Serializable;", "()V", "checkPic", "", "getCheckPic", "()Ljava/lang/String;", "setCheckPic", "(Ljava/lang/String;)V", "checkTexts", "", "getCheckTexts", "()Ljava/util/List;", "setCheckTexts", "(Ljava/util/List;)V", "fromGallery", "", "getFromGallery", "()I", "setFromGallery", "(I)V", "height", "getHeight", "setHeight", "srcVideoMD5", "getSrcVideoMD5", "setSrcVideoMD5", "thumbnailPath", "getThumbnailPath", "setThumbnailPath", "videoPath", "getVideoPath", "setVideoPath", "width", "getWidth", "setWidth", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String checkPic;
    @Nullable
    private List<String> checkTexts;
    private int fromGallery;
    private int height;
    @Nullable
    private String srcVideoMD5;
    @Nullable
    private String thumbnailPath;
    @Nullable
    private String videoPath;
    private int width;

    @Nullable
    public final String getCheckPic() {
        return this.checkPic;
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
    public final String getSrcVideoMD5() {
        return this.srcVideoMD5;
    }

    @Nullable
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    @Nullable
    public final String getVideoPath() {
        return this.videoPath;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setCheckPic(@Nullable String str) {
        this.checkPic = str;
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

    public final void setSrcVideoMD5(@Nullable String str) {
        this.srcVideoMD5 = str;
    }

    public final void setThumbnailPath(@Nullable String str) {
        this.thumbnailPath = str;
    }

    public final void setVideoPath(@Nullable String str) {
        this.videoPath = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
