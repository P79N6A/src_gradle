package com.ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0013H\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/TPLoginMethod;", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "uid", "", "platform", "userInfo", "Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo;)V", "getPlatform", "()Ljava/lang/String;", "getUserInfo", "()Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo;", "setUserInfo", "(Lcom/ss/android/ugc/aweme/account/login/model/TPUserInfo;)V", "describeContents", "", "updateUserInfo", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "writeToParcel", "flags", "CREATOR", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class TPLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String platform;
    @NotNull
    private TPUserInfo userInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/TPLoginMethod$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/account/login/model/TPLoginMethod;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/account/login/model/TPLoginMethod;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a implements Parcelable.Creator<TPLoginMethod> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32256a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TPLoginMethod[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f32256a, false, 20295, new Class[]{Parcel.class}, TPLoginMethod.class)) {
                return (TPLoginMethod) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f32256a, false, 20295, new Class[]{Parcel.class}, TPLoginMethod.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new TPLoginMethod(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final TPUserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TPLoginMethod(@org.jetbrains.annotations.NotNull android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = r6.readString()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
        L_0x000d:
            java.lang.String r1 = r6.readString()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = ""
        L_0x0015:
            java.lang.Class<com.ss.android.ugc.aweme.account.login.model.TPUserInfo> r2 = com.ss.android.ugc.aweme.account.login.model.TPUserInfo.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r6.readParcelable(r2)
            com.ss.android.ugc.aweme.account.login.model.TPUserInfo r2 = (com.ss.android.ugc.aweme.account.login.model.TPUserInfo) r2
            if (r2 != 0) goto L_0x002c
            com.ss.android.ugc.aweme.account.login.model.TPUserInfo r2 = new com.ss.android.ugc.aweme.account.login.model.TPUserInfo
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r2.<init>(r3, r4)
        L_0x002c:
            r5.<init>(r0, r1, r2)
            java.util.Date r0 = new java.util.Date
            long r1 = r6.readLong()
            r0.<init>(r1)
            r5.setExpires(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.TPLoginMethod.<init>(android.os.Parcel):void");
    }

    public final void setUserInfo(@NotNull TPUserInfo tPUserInfo) {
        TPUserInfo tPUserInfo2 = tPUserInfo;
        if (PatchProxy.isSupport(new Object[]{tPUserInfo2}, this, changeQuickRedirect, false, 20294, new Class[]{TPUserInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tPUserInfo2}, this, changeQuickRedirect, false, 20294, new Class[]{TPUserInfo.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(tPUserInfo2, "<set-?>");
        this.userInfo = tPUserInfo2;
    }

    public final void updateUserInfo(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 20292, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 20292, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        if (!(true ^ Intrinsics.areEqual((Object) user.getUid(), (Object) getUid()))) {
            this.userInfo = TPUserInfo.CREATOR.a(user2);
        }
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20293, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20293, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(getUid());
        parcel.writeString(this.platform);
        parcel.writeParcelable(this.userInfo, i);
        parcel.writeLong(getExpires().getTime());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TPLoginMethod(@NotNull String str, @NotNull String str2, @NotNull TPUserInfo tPUserInfo) {
        super(str, LoginMethodName.THIRD_PARTY, null, 4, null);
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "platform");
        Intrinsics.checkParameterIsNotNull(tPUserInfo, "userInfo");
        this.platform = str2;
        this.userInfo = tPUserInfo;
    }
}
