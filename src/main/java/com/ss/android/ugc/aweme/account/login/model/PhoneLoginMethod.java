package com.ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.e.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0014H\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/PhoneLoginMethod;", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "Landroid/os/Parcelable;", "uid", "", "loginMethodName", "Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;", "countryCodeName", "countryCode", "nationalNumber", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "phoneNumber", "Lcom/ss/android/ugc/aweme/account/login/utils/PhoneNumberUtil$PhoneNumber;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;Lcom/ss/android/ugc/aweme/account/login/utils/PhoneNumberUtil$PhoneNumber;)V", "getPhoneNumber", "()Lcom/ss/android/ugc/aweme/account/login/utils/PhoneNumberUtil$PhoneNumber;", "describeContents", "", "parseNumber", "str", "writeToParcel", "", "flags", "CREATOR", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class PhoneLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final a.C0407a phoneNumber;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/PhoneLoginMethod$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/account/login/model/PhoneLoginMethod;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/account/login/model/PhoneLoginMethod;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a implements Parcelable.Creator<PhoneLoginMethod> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32255a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PhoneLoginMethod[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f32255a, false, 20291, new Class[]{Parcel.class}, PhoneLoginMethod.class)) {
                return (PhoneLoginMethod) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f32255a, false, 20291, new Class[]{Parcel.class}, PhoneLoginMethod.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new PhoneLoginMethod(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final a.C0407a getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(@NotNull Parcel parcel) {
        this(parcel.readString() == null ? "" : parcel.readString(), LoginMethodName.valueOf(parcel.readString() == null ? "DEFAULT" : parcel.readString()), new a.C0407a());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.phoneNumber.setCountryIso(parcel.readString() == null ? "" : parcel.readString());
        this.phoneNumber.setCountryCode(parcel.readInt());
        this.phoneNumber.setNationalNumber(parcel.readLong());
    }

    private final String parseNumber(String str) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 20289, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 20289, new Class[]{String.class}, String.class);
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (int i = 0; i < charSequence.length(); i++) {
                int digit = Character.digit(charSequence.charAt(i), 10);
                if (digit != -1) {
                    sb.append(digit);
                }
            }
        }
        if (sb.length() != 0) {
            z2 = false;
        }
        if (z2) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
        return sb2;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20290, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20290, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(getUid());
        parcel.writeString(getLoginMethodName().name());
        CharSequence countryIso = this.phoneNumber.getCountryIso();
        if (countryIso == null || countryIso.length() == 0) {
            z = true;
        }
        if (z) {
            Locale locale = Locale.CHINA;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINA");
            parcel.writeString(locale.getCountry());
        } else {
            parcel.writeString(this.phoneNumber.getCountryIso());
        }
        parcel.writeInt(this.phoneNumber.getCountryCode());
        parcel.writeLong(this.phoneNumber.getNationalNumber());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(@NotNull String str, @NotNull LoginMethodName loginMethodName, @NotNull a.C0407a aVar) {
        super(str, loginMethodName, null, 4, null);
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(loginMethodName, "loginMethodName");
        Intrinsics.checkParameterIsNotNull(aVar, "phoneNumber");
        this.phoneNumber = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, a.C0407a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? LoginMethodName.PHONE_SMS : loginMethodName, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(@NotNull String str, @NotNull LoginMethodName loginMethodName, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this(str, loginMethodName, new a.C0407a());
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(loginMethodName, "loginMethodName");
        Intrinsics.checkParameterIsNotNull(str2, "countryCodeName");
        Intrinsics.checkParameterIsNotNull(str3, "countryCode");
        Intrinsics.checkParameterIsNotNull(str4, "nationalNumber");
        this.phoneNumber.setCountryIso(str2);
        this.phoneNumber.setCountryCode(Integer.parseInt(parseNumber(str3)));
        this.phoneNumber.setNationalNumber(Long.parseLong(parseNumber(str4)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? LoginMethodName.PHONE_SMS : loginMethodName, (i & 4) != 0 ? "" : str2, str3, str4);
    }
}
