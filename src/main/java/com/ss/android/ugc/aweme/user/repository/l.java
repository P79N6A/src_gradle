package com.ss.android.ugc.aweme.user.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "requestId", "", "type", "", "(Lcom/ss/android/ugc/aweme/profile/model/User;Ljava/lang/String;I)V", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setUser", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75397a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public User f75398b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f75399c;

    /* renamed from: d  reason: collision with root package name */
    public int f75400d;

    private l(@NotNull User user, @NotNull String str, int i) {
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        this.f75398b = user;
        this.f75399c = str;
        this.f75400d = i;
    }

    public /* synthetic */ l(User user, String str, int i, int i2) {
        this(user, str, 0);
    }
}
