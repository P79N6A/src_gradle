package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailSaveData;", "", "usersLeft", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "loadMoreParamsLeft", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;", "usersRight", "loadMoreParamsRight", "(Ljava/util/List;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;Ljava/util/List;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;)V", "getLoadMoreParamsLeft", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;", "setLoadMoreParamsLeft", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;)V", "getLoadMoreParamsRight", "setLoadMoreParamsRight", "getUsersLeft", "()Ljava/util/List;", "setUsersLeft", "(Ljava/util/List;)V", "getUsersRight", "setUsersRight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69896a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<User> f69897b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public c f69898c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public List<User> f69899d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public c f69900e;

    public d() {
        this(null, null, null, null, 15);
    }

    public final void a(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f69896a, false, 79518, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f69896a, false, 79518, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "<set-?>");
        this.f69898c = cVar2;
    }

    public final void b(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f69896a, false, 79519, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f69896a, false, 79519, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "<set-?>");
        this.f69900e = cVar2;
    }

    private d(@Nullable List<User> list, @NotNull c cVar, @Nullable List<User> list2, @NotNull c cVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, "loadMoreParamsLeft");
        Intrinsics.checkParameterIsNotNull(cVar2, "loadMoreParamsRight");
        this.f69897b = list;
        this.f69898c = cVar;
        this.f69899d = list2;
        this.f69900e = cVar2;
    }

    public /* synthetic */ d(List list, c cVar, List list2, c cVar2, int i) {
        this(null, new c(0, false), null, new c(0, false));
    }
}
