package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.jedi.model.c.f;
import com.bytedance.jedi.model.e.a;
import com.bytedance.jedi.model.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJF\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0015J \u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d0\u001c0\u001bJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0 0\u001b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\f2\u0006\u0010#\u001a\u00020\u000fJ\u001e\u0010$\u001a\b\u0012\u0004\u0012\u0002H%0\f\"\u0004\b\u0000\u0010%*\b\u0012\u0004\u0012\u0002H%0\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/UserRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "userCache", "Lcom/ss/android/ugc/aweme/user/repository/UserCache;", "(Lcom/ss/android/ugc/aweme/user/repository/UserCache;)V", "followFetcher", "Lcom/ss/android/ugc/aweme/user/repository/FollowFetcher;", "remarkFetcher", "Lcom/ss/android/ugc/aweme/user/repository/RemarkFetcher;", "removeFollowerFetcher", "Lcom/ss/android/ugc/aweme/user/repository/RemoveFollowerFetcher;", "commitRemark", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/profile/model/CommitRemarkNameResponse;", "userId", "", "remarkName", "follow", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "secUserId", "type", "", "channelId", "from", "itemId", "fromPreviousPage", "observeAllUsers", "Lio/reactivex/Observable;", "", "Lkotlin/Pair;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "observeUser", "Lcom/bytedance/jedi/model/datasource/Optional;", "removeFollower", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "uid", "toSingle", "T", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75392a;

    /* renamed from: b  reason: collision with root package name */
    public final f f75393b = new f();

    /* renamed from: c  reason: collision with root package name */
    final g f75394c;

    /* renamed from: d  reason: collision with root package name */
    private final d f75395d = new d();

    /* renamed from: e  reason: collision with root package name */
    private final a f75396e = new a();

    public h(@NotNull g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "userCache");
        this.f75394c = gVar;
        a(this.f75396e.a(), this.f75394c.a(), a.b.a(a.b.C0214a.INSTANCE, AnonymousClass1.INSTANCE));
        a(this.f75393b.a(), this.f75394c.a(), a.b.a(a.b.C0214a.INSTANCE, AnonymousClass2.INSTANCE));
        a(this.f75395d.a(), this.f75394c.a(), a.b.a(a.b.C0214a.INSTANCE, AnonymousClass3.INSTANCE));
    }

    @NotNull
    public final Observable<f<User>> a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75392a, false, 87685, new Class[]{String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, this, f75392a, false, 87685, new Class[]{String.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        return this.f75394c.a().a(str2);
    }

    @NotNull
    public final Single<FollowStatus> a(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @Nullable String str3, int i4) {
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, Integer.valueOf(i4)}, this, f75392a, false, 87682, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{str4, str5, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, Integer.valueOf(i4)}, this, f75392a, false, 87682, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "userId");
        Intrinsics.checkParameterIsNotNull(str5, "secUserId");
        a aVar = this.f75396e;
        b bVar = new b(str, str2, i, i2, i3, str3, i4);
        Single<FollowStatus> fromObservable = Single.fromObservable(aVar.a(bVar));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(fo…emId, fromPreviousPage)))");
        return fromObservable;
    }
}
