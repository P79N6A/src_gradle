package com.ss.android.ugc.aweme.user;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0003R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "", "uid", "", "shortId", "uniqueId", "nickname", "avatarUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getNickname", "getShortId", "getUid", "getUniqueId", "convert", "Lcom/ss/android/ugc/aweme/profile/model/User;", "userName", "Companion", "accountapi_release"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75288a;
    public static final C0785a g = new C0785a((byte) 0);
    @SerializedName("uid")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f75289b;
    @SerializedName("short_id")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f75290c;
    @SerializedName("unique_id")
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f75291d;
    @SerializedName("nickname")
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f75292e;
    @SerializedName("avatar_url")
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final String f75293f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/user/SignificantUserInfo$Companion;", "", "()V", "from", "Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "u", "Lcom/ss/android/account/BDAccountUserEntity;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "accountapi_release"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.user.a$a  reason: collision with other inner class name */
    public static final class C0785a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75294a;

        private C0785a() {
        }

        public /* synthetic */ C0785a(byte b2) {
            this();
        }

        @NotNull
        public final a a(@NotNull User user) {
            String str;
            User user2 = user;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{user2}, this, f75294a, false, 87486, new Class[]{User.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{user2}, this, f75294a, false, 87486, new Class[]{User.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(user2, "u");
            String uid = user.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "u.uid");
            String shortId = user.getShortId();
            Intrinsics.checkExpressionValueIsNotNull(shortId, "u.shortId");
            String uniqueId = user.getUniqueId();
            Intrinsics.checkExpressionValueIsNotNull(uniqueId, "u.uniqueId");
            String nickname = user.getNickname();
            Intrinsics.checkExpressionValueIsNotNull(nickname, "u.nickname");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                Intrinsics.checkExpressionValueIsNotNull(avatarThumb, "u.avatarThumb");
                Collection urlList = avatarThumb.getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    Intrinsics.checkExpressionValueIsNotNull(avatarThumb2, "u.avatarThumb");
                    str = avatarThumb2.getUrlList().get(0);
                    String str2 = str;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "if (u.avatarThumb == nul… u.avatarThumb.urlList[0]");
                    a aVar = new a(uid, shortId, uniqueId, nickname, str2);
                    return aVar;
                }
            }
            str = "";
            String str22 = str;
            Intrinsics.checkExpressionValueIsNotNull(str22, "if (u.avatarThumb == nul… u.avatarThumb.urlList[0]");
            a aVar2 = new a(uid, shortId, uniqueId, nickname, str22);
            return aVar2;
        }
    }

    public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "shortId");
        Intrinsics.checkParameterIsNotNull(str3, "uniqueId");
        Intrinsics.checkParameterIsNotNull(str4, "nickname");
        Intrinsics.checkParameterIsNotNull(str5, "avatarUrl");
        this.f75289b = str;
        this.f75290c = str2;
        this.f75291d = str3;
        this.f75292e = str4;
        this.f75293f = str5;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, int i) {
        this(str, "", "", "", "");
    }
}
