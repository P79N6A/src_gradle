package com.ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestUser;", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setUser", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SuggestUser {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("user_info")
    @Nullable
    public User user;

    public SuggestUser() {
        this(null, 1, null);
    }

    public static /* synthetic */ SuggestUser copy$default(SuggestUser suggestUser, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = suggestUser.user;
        }
        return suggestUser.copy(user2);
    }

    @NotNull
    public final SuggestUser copy(@Nullable User user2) {
        User user3 = user2;
        if (!PatchProxy.isSupport(new Object[]{user3}, this, changeQuickRedirect, false, 37142, new Class[]{User.class}, SuggestUser.class)) {
            return new SuggestUser(user3);
        }
        return (SuggestUser) PatchProxy.accessDispatch(new Object[]{user3}, this, changeQuickRedirect, false, 37142, new Class[]{User.class}, SuggestUser.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37145, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof SuggestUser) && Intrinsics.areEqual((Object) this.user, (Object) ((SuggestUser) obj).user));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37145, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37144, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37144, new Class[0], Integer.TYPE)).intValue();
        }
        User user2 = this.user;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37143, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37143, new Class[0], String.class);
        }
        return "SuggestUser(user=" + this.user + ")";
    }

    public SuggestUser(@Nullable User user2) {
        this.user = user2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuggestUser(User user2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user2);
    }
}
