package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/model/VerifyTypeAction;", "", "actionType", "", "toastKey", "", "link", "(ILjava/lang/String;Ljava/lang/String;)V", "getActionType", "()I", "getLink", "()Ljava/lang/String;", "getToastKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VerifyTypeAction {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action_type")
    public final int actionType;
    @Nullable
    public final String link;
    @SerializedName("toast_key")
    @Nullable
    public final String toastKey;

    public static /* synthetic */ VerifyTypeAction copy$default(VerifyTypeAction verifyTypeAction, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = verifyTypeAction.actionType;
        }
        if ((i2 & 2) != 0) {
            str = verifyTypeAction.toastKey;
        }
        if ((i2 & 4) != 0) {
            str2 = verifyTypeAction.link;
        }
        return verifyTypeAction.copy(i, str, str2);
    }

    @NotNull
    public final VerifyTypeAction copy(int i, @Nullable String str, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, changeQuickRedirect, false, 72256, new Class[]{Integer.TYPE, String.class, String.class}, VerifyTypeAction.class)) {
            return new VerifyTypeAction(i, str3, str4);
        }
        return (VerifyTypeAction) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, changeQuickRedirect, false, 72256, new Class[]{Integer.TYPE, String.class, String.class}, VerifyTypeAction.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 72259, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 72259, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof VerifyTypeAction) {
                VerifyTypeAction verifyTypeAction = (VerifyTypeAction) obj;
                if (!(this.actionType == verifyTypeAction.actionType) || !Intrinsics.areEqual((Object) this.toastKey, (Object) verifyTypeAction.toastKey) || !Intrinsics.areEqual((Object) this.link, (Object) verifyTypeAction.link)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72258, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72258, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.actionType * 31;
        String str = this.toastKey;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.link;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72257, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72257, new Class[0], String.class);
        }
        return "VerifyTypeAction(actionType=" + this.actionType + ", toastKey=" + this.toastKey + ", link=" + this.link + ")";
    }

    public VerifyTypeAction(int i, @Nullable String str, @Nullable String str2) {
        this.actionType = i;
        this.toastKey = str;
        this.link = str2;
    }
}
