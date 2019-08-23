package com.ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/AccountPassLoginMethod;", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "uid", "", "loginMethodName", "Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;", "name", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class AccountPassLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String name;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/AccountPassLoginMethod$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/account/login/model/AccountPassLoginMethod;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/account/login/model/AccountPassLoginMethod;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a implements Parcelable.Creator<AccountPassLoginMethod> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32254a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AccountPassLoginMethod[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f32254a, false, 20270, new Class[]{Parcel.class}, AccountPassLoginMethod.class)) {
                return (AccountPassLoginMethod) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f32254a, false, 20270, new Class[]{Parcel.class}, AccountPassLoginMethod.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new AccountPassLoginMethod(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccountPassLoginMethod(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = r4.readString()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
        L_0x000d:
            java.lang.String r1 = r4.readString()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "DEFAULT"
        L_0x0015:
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.valueOf(r1)
            java.lang.String r2 = r4.readString()
            if (r2 != 0) goto L_0x0021
            java.lang.String r2 = ""
        L_0x0021:
            r3.<init>(r0, r1, r2)
            java.util.Date r0 = new java.util.Date
            long r1 = r4.readLong()
            r0.<init>(r1)
            r3.setExpires(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20269, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20269, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
        parcel2.writeString(getUid());
        parcel2.writeString(getLoginMethodName().name());
        parcel2.writeString(this.name);
        parcel2.writeLong(getExpires().getTime());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountPassLoginMethod(@NotNull String str, @NotNull LoginMethodName loginMethodName, @NotNull String str2) {
        super(str, loginMethodName, null, 4, null);
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(loginMethodName, "loginMethodName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.name = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? LoginMethodName.EMAIL_PASS : loginMethodName, str2);
    }
}
