package com.ss.android.ugc.aweme.notification.bean;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R&\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/bean/VoteNotice;", "", "()V", "imageUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getImageUrl", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setImageUrl", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "mergeCount", "", "getMergeCount", "()I", "setMergeCount", "(I)V", "optionText", "", "getOptionText", "()Ljava/lang/String;", "setOptionText", "(Ljava/lang/String;)V", "refType", "refType$annotations", "getRefType", "setRefType", "relationLabel", "Lcom/ss/android/ugc/aweme/feed/model/RelationDynamicLabel;", "getRelationLabel", "()Lcom/ss/android/ugc/aweme/feed/model/RelationDynamicLabel;", "setRelationLabel", "(Lcom/ss/android/ugc/aweme/feed/model/RelationDynamicLabel;)V", "schemaUrl", "getSchemaUrl", "setSchemaUrl", "userList", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "RefType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteNotice {
    @SerializedName("from_user")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public List<? extends User> f57986a;
    @SerializedName("image_url")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public UrlModel f57987b;
    @SerializedName("option_text")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f57988c;
    @SerializedName("merge_count")

    /* renamed from: d  reason: collision with root package name */
    public int f57989d;
    @SerializedName("relation_label")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public RelationDynamicLabel f57990e;
    @SerializedName("schema_url")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f57991f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/bean/VoteNotice$RefType;", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface RefType {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3699a = a.f3700a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/bean/VoteNotice$RefType$Companion;", "", "()V", "TYPE_UNDEFINED", "", "TYPE_VIDEO", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f3700a = new a();

            private a() {
            }
        }
    }
}
