package com.ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "userName", "", "avatarUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getUserName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class TPUserInfo implements Parcelable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String avatarUrl;
    @NotNull
    private final String userName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0007J\u001d\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "from", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a implements Parcelable.Creator<TPUserInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32257a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TPUserInfo[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f32257a, false, 20302, new Class[]{Parcel.class}, TPUserInfo.class)) {
                return (TPUserInfo) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f32257a, false, 20302, new Class[]{Parcel.class}, TPUserInfo.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new TPUserInfo(parcel2);
        }

        @JvmStatic
        @NotNull
        public final TPUserInfo a(@NotNull User user) {
            String str;
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{user2}, this, f32257a, false, 20303, new Class[]{User.class}, TPUserInfo.class)) {
                return (TPUserInfo) PatchProxy.accessDispatch(new Object[]{user2}, this, f32257a, false, 20303, new Class[]{User.class}, TPUserInfo.class);
            }
            Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
            String nickname = user.getNickname();
            Intrinsics.checkExpressionValueIsNotNull(nickname, "user.nickname");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                Intrinsics.checkExpressionValueIsNotNull(avatarThumb, "user.avatarThumb");
                if (avatarThumb.getUrlList() != null) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    Intrinsics.checkExpressionValueIsNotNull(avatarThumb2, "user.avatarThumb");
                    if (!avatarThumb2.getUrlList().isEmpty()) {
                        UrlModel avatarThumb3 = user.getAvatarThumb();
                        Intrinsics.checkExpressionValueIsNotNull(avatarThumb3, "user.avatarThumb");
                        str = avatarThumb3.getUrlList().get(0);
                        Intrinsics.checkExpressionValueIsNotNull(str, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
                        return new TPUserInfo(nickname, str);
                    }
                }
            }
            str = "";
            Intrinsics.checkExpressionValueIsNotNull(str, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
            return new TPUserInfo(nickname, str);
        }
    }

    @NotNull
    public static /* synthetic */ TPUserInfo copy$default(TPUserInfo tPUserInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tPUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = tPUserInfo.avatarUrl;
        }
        return tPUserInfo.copy(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final TPUserInfo from(@NotNull User user) {
        User user2 = user;
        if (!PatchProxy.isSupport(new Object[]{user2}, null, changeQuickRedirect, true, 20301, new Class[]{User.class}, TPUserInfo.class)) {
            return CREATOR.a(user2);
        }
        return (TPUserInfo) PatchProxy.accessDispatch(new Object[]{user2}, null, changeQuickRedirect, true, 20301, new Class[]{User.class}, TPUserInfo.class);
    }

    @NotNull
    public final String component1() {
        return this.userName;
    }

    @NotNull
    public final String component2() {
        return this.avatarUrl;
    }

    @NotNull
    public final TPUserInfo copy(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 20297, new Class[]{String.class, String.class}, TPUserInfo.class)) {
            return (TPUserInfo) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 20297, new Class[]{String.class, String.class}, TPUserInfo.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "userName");
        Intrinsics.checkParameterIsNotNull(str4, "avatarUrl");
        return new TPUserInfo(str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 20300, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 20300, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof TPUserInfo) {
                TPUserInfo tPUserInfo = (TPUserInfo) obj;
                if (!Intrinsics.areEqual((Object) this.userName, (Object) tPUserInfo.userName) || !Intrinsics.areEqual((Object) this.avatarUrl, (Object) tPUserInfo.avatarUrl)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 20299, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 20299, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.userName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 20298, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 20298, new Class[0], String.class);
        }
        return "TPUserInfo(userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ")";
    }

    @NotNull
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TPUserInfo(@org.jetbrains.annotations.NotNull android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = r2.readString()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
        L_0x000d:
            java.lang.String r2 = r2.readString()
            if (r2 != 0) goto L_0x0015
            java.lang.String r2 = ""
        L_0x0015:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.TPUserInfo.<init>(android.os.Parcel):void");
    }

    public TPUserInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "avatarUrl");
        this.userName = str;
        this.avatarUrl = str2;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20296, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20296, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.userName);
        parcel.writeString(this.avatarUrl);
    }
}
