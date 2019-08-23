package com.ss.android.ugc.aweme.commerce.preview.api.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "()V", "commentUrl", "", "getCommentUrl", "()Ljava/lang/String;", "setCommentUrl", "(Ljava/lang/String;)V", "comments", "", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse$Comment;", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "tags", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse$CommentTag;", "getTags", "setTags", "total", "", "getTotal", "()I", "setTotal", "(I)V", "canBeShow", "", "Comment", "CommentTag", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends com.ss.android.ugc.aweme.commerce.service.d.a {
    @SerializedName("tags")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public List<C0472b> f37326a;
    @SerializedName("comments")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<a> f37327b;
    @SerializedName("total")

    /* renamed from: c  reason: collision with root package name */
    public int f37328c;
    @SerializedName("comment_url")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f37329d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse$Comment;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "getId", "setId", "photos", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getPhotos", "()Ljava/util/List;", "setPhotos", "(Ljava/util/List;)V", "userAvatar", "getUserAvatar", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setUserAvatar", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "userName", "getUserName", "setUserName", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        @SerializedName("id")
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public String f37330a = "";
        @SerializedName("content")
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public String f37331b = "";
        @SerializedName("user_name")
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public String f37332c = "";
        @SerializedName("user_avatar")
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public UrlModel f37333d;
        @SerializedName("photos")
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public List<? extends UrlModel> f37334e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse$CommentTag;", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "tagId", "", "getTagId", "()Ljava/lang/String;", "setTagId", "(Ljava/lang/String;)V", "tagName", "getTagName", "setTagName", "tagUrl", "getTagUrl", "setTagUrl", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.api.a.b$b  reason: collision with other inner class name */
    public static final class C0472b {
        @SerializedName("tag_id")
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public String f37335a = "";
        @SerializedName("count")

        /* renamed from: b  reason: collision with root package name */
        public int f37336b;
        @SerializedName("tag_name")
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public String f37337c = "";
        @SerializedName("tag_url")
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public String f37338d = "";
    }
}
