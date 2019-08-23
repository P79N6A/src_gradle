package com.ss.android.ugc.aweme.notification.model;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.friends.api.RecommendApi;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.notification.bean.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\tJ!\u0010$\u001a\u00020\u00102\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'H\u0014¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u0004H\u0002J\u0012\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010-\u001a\u00020!J\u0006\u0010.\u001a\u00020!R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/model/FansRecommendModel;", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "contactPermission", "", "locationPermission", "(II)V", "cachedList", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getCachedList", "()Ljava/util/List;", "setCachedList", "(Ljava/util/List;)V", "cursor", "isLoadMore", "", "()Z", "setLoadMore", "(Z)V", "mRecommendApi", "Lcom/ss/android/ugc/aweme/friends/api/RecommendApi;", "kotlin.jvm.PlatformType", "getMRecommendApi", "()Lcom/ss/android/ugc/aweme/friends/api/RecommendApi;", "mRecommendApi$delegate", "Lkotlin/Lazy;", "mReportId", "", "getMReportId", "()Ljava/lang/String;", "mReportId$delegate", "appendCachedRecommends", "", "blockRecommend", "user", "checkParams", "params", "", "", "([Ljava/lang/Object;)Z", "fetchRecommendList", "count", "handleData", "data", "loadMoreRecommendList", "refreshRecommendList", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FansRecommendModel extends a<RecommendList> {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansRecommendModel.class), "mReportId", "getMReportId()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansRecommendModel.class), "mRecommendApi", "getMRecommendApi()Lcom/ss/android/ugc/aweme/friends/api/RecommendApi;"))};
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public List<? extends User> cachedList = CollectionsKt.emptyList();
    private final int contactPermission;
    private volatile int cursor;
    public boolean isLoadMore;
    private final int locationPermission;
    private final Lazy mRecommendApi$delegate = LazyKt.lazy(FansRecommendModel$mRecommendApi$2.INSTANCE);
    private final Lazy mReportId$delegate = LazyKt.lazy(FansRecommendModel$mReportId$2.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/model/FansRecommendModel$Companion;", "", "()V", "COUNT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final RecommendApi getMRecommendApi() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63112, new Class[0], RecommendApi.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63112, new Class[0], RecommendApi.class);
        } else {
            value = this.mRecommendApi$delegate.getValue();
        }
        return (RecommendApi) value;
    }

    private final String getMReportId() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63111, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63111, new Class[0], String.class);
        } else {
            value = this.mReportId$delegate.getValue();
        }
        return (String) value;
    }

    public final boolean checkParams(@NotNull Object... objArr) {
        Object obj = objArr;
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 63114, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 63114, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "params");
        return true;
    }

    private final void appendCachedRecommends() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63118, new Class[0], Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new FansRecommendModel$appendCachedRecommends$1(this), 0);
    }

    public final void refreshRecommendList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63116, new Class[0], Void.TYPE);
            return;
        }
        this.cursor = 0;
        this.isLoadMore = false;
        fetchRecommendList(20);
    }

    public final void loadMoreRecommendList() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63117, new Class[0], Void.TYPE);
            return;
        }
        this.isLoadMore = true;
        Collection collection = this.cachedList;
        if (collection == null || collection.isEmpty()) {
            z = true;
        }
        if (!z) {
            appendCachedRecommends();
        } else {
            fetchRecommendList(20);
        }
    }

    public final void setCachedList(@NotNull List<? extends User> list) {
        List<? extends User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 63113, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 63113, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.cachedList = list2;
    }

    private final void fetchRecommendList(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 63119, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 63119, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        getMRecommendApi().recommendList(Integer.valueOf(i), Integer.valueOf(this.cursor), null, 9, null, Integer.valueOf(this.contactPermission), getMReportId(), Integer.valueOf(this.locationPermission), null).a((g<TResult, TContinuationResult>) new com.ss.android.ugc.aweme.net.m<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public final void blockRecommend(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 63115, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 63115, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        getMRecommendApi().dislikeRecommend(user.getUid());
    }

    public final void handleData(@Nullable RecommendList recommendList) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, changeQuickRedirect, false, 63120, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, changeQuickRedirect, false, 63120, new Class[]{RecommendList.class}, Void.TYPE);
            return;
        }
        super.handleData(recommendList);
        if (recommendList != null) {
            if (!this.isLoadMore) {
                List<User> userList = recommendList.getUserList();
                Intrinsics.checkExpressionValueIsNotNull(userList, "userList");
                if ((!userList.isEmpty()) && !(recommendList.getUserList().get(0) instanceof b)) {
                    recommendList.getUserList().add(0, new b());
                }
            }
            this.cursor = recommendList.cursor;
            Collection userList2 = recommendList.getUserList();
            if (userList2 != null && !userList2.isEmpty()) {
                z = false;
            }
            if (z) {
                recommendList.hasMore = false;
            }
            this.mData = recommendList;
            ai a2 = ai.a();
            Object obj = this.mData;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            String str = ((RecommendList) obj).rid;
            Object obj2 = this.mData;
            Intrinsics.checkExpressionValueIsNotNull(obj2, "mData");
            a2.a(str, ((RecommendList) obj2).logPb);
        }
    }

    public FansRecommendModel(int i, int i2) {
        this.contactPermission = i;
        this.locationPermission = i2;
    }
}
