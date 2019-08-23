package com.ss.android.ugc.aweme.account.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/model/CachedUserAgeInfo;", "Ljava/io/Serializable;", "birthday", "", "userMode", "", "(Ljava/lang/String;I)V", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "getUserMode", "()I", "setUserMode", "(I)V", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class CachedUserAgeInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String birthday;
    private int userMode;

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getUserMode() {
        return this.userMode;
    }

    public final void setBirthday(@Nullable String str) {
        this.birthday = str;
    }

    public final void setUserMode(int i) {
        this.userMode = i;
    }

    public CachedUserAgeInfo(@Nullable String str, int i) {
        this.birthday = str;
        this.userMode = i;
    }
}
