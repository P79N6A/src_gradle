package com.ss.android.ugc.aweme.account.login.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "", "uid", "", "loginMethodName", "Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;", "expires", "Ljava/util/Date;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;Ljava/util/Date;)V", "getExpires", "()Ljava/util/Date;", "setExpires", "(Ljava/util/Date;)V", "getLoginMethodName", "()Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;", "getUid", "()Ljava/lang/String;", "isExpired", "", "updateUserInfo", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public class BaseLoginMethod {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private Date expires;
    @NotNull
    private final LoginMethodName loginMethodName;
    @NotNull
    private final String uid;

    public BaseLoginMethod() {
        this(null, null, null, 7, null);
    }

    public void updateUserInfo(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 20272, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 20272, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
    }

    @NotNull
    public Date getExpires() {
        return this.expires;
    }

    @NotNull
    public LoginMethodName getLoginMethodName() {
        return this.loginMethodName;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final boolean isExpired() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 20271, new Class[0], Boolean.TYPE)) {
            return new Date().after(getExpires());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 20271, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void setExpires(@NotNull Date date) {
        Date date2 = date;
        if (PatchProxy.isSupport(new Object[]{date2}, this, changeQuickRedirect, false, 20273, new Class[]{Date.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{date2}, this, changeQuickRedirect, false, 20273, new Class[]{Date.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(date2, "<set-?>");
        this.expires = date2;
    }

    public BaseLoginMethod(@NotNull String str, @NotNull LoginMethodName loginMethodName2, @NotNull Date date) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(loginMethodName2, "loginMethodName");
        Intrinsics.checkParameterIsNotNull(date, "expires");
        this.uid = str;
        this.loginMethodName = loginMethodName2;
        this.expires = date;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseLoginMethod(String str, LoginMethodName loginMethodName2, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LoginMethodName.DEFAULT : loginMethodName2, (i & 4) != 0 ? new Date(System.currentTimeMillis() + 2592000000L) : date);
    }
}
