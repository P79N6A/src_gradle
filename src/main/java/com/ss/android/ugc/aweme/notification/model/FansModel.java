package com.ss.android.ugc.aweme.notification.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import com.ss.android.ugc.aweme.notification.bean.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0002J!\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019\"\u00020\u001aH\u0014¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010!\u001a\u00020\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0002H\u0002J\u0006\u0010#\u001a\u00020\u0016J\b\u0010$\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/model/FansModel;", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/notification/bean/Notice;", "fromPush", "", "unreadCount", "", "(ZI)V", "isLoadMore", "()Z", "setLoadMore", "(Z)V", "mCachedIds", "", "", "mFansList", "", "Lcom/ss/android/ugc/aweme/notification/bean/BaseNotice;", "mMaxTime", "", "mMinTime", "appendCachedFans", "", "checkParams", "params", "", "", "([Ljava/lang/Object;)Z", "fetchFans", "maxTime", "minTime", "handleData", "data", "loadMore", "preHandleData", "refresh", "saveLogPb", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FansModel extends a<Notice> {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean fromPush;
    public boolean isLoadMore;
    private final Set<String> mCachedIds = new HashSet();
    public List<BaseNotice> mFansList = new ArrayList();
    private long mMaxTime;
    private long mMinTime;
    private final int unreadCount;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/model/FansModel$Companion;", "", "()V", "COUNT", "", "DEFAULT_UNREAD_COUNT", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean checkParams(@NotNull Object... objArr) {
        Object obj = objArr;
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 63105, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 63105, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "params");
        return true;
    }

    private final void appendCachedFans() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63104, new Class[0], Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new FansModel$appendCachedFans$1(this), 0);
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63102, new Class[0], Void.TYPE);
            return;
        }
        this.isLoadMore = true;
        if (true ^ this.mFansList.isEmpty()) {
            appendCachedFans();
        } else {
            fetchFans(this.mMaxTime, this.mMinTime);
        }
    }

    public final void refresh() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63101, new Class[0], Void.TYPE);
            return;
        }
        this.isLoadMore = false;
        this.mMaxTime = 0;
        this.mMinTime = 0;
        fetchFans(this.mMaxTime, this.mMinTime);
    }

    private final void saveLogPb() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63107, new Class[0], Void.TYPE);
            return;
        }
        for (BaseNotice baseNotice : ((Notice) this.mData).items) {
            baseNotice.logPbBean = ((Notice) this.mData).logPbBean;
        }
    }

    public final void handleData(@Nullable Notice notice) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{notice}, this, changeQuickRedirect, false, 63106, new Class[]{Notice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{notice}, this, changeQuickRedirect, false, 63106, new Class[]{Notice.class}, Void.TYPE);
        } else if (notice == null) {
            this.mData = null;
        } else {
            if (this.isLoadMore) {
                this.mMaxTime = notice.maxTime;
                this.mMinTime = notice.minTime;
            } else {
                preHandleData(notice);
                Collection collection = notice.items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.mMaxTime = notice.maxTime;
                    this.mMinTime = notice.minTime;
                }
            }
            Collection collection2 = notice.items;
            if (collection2 != null && !collection2.isEmpty()) {
                z2 = false;
            }
            if (z2) {
                notice.hasMore = false;
            }
            this.mData = notice;
            saveLogPb();
        }
    }

    private final void preHandleData(Notice notice) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{notice}, this, changeQuickRedirect, false, 63108, new Class[]{Notice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{notice}, this, changeQuickRedirect, false, 63108, new Class[]{Notice.class}, Void.TYPE);
            return;
        }
        List<BaseNotice> list = notice.items;
        CollectionsKt.drop(this.mCachedIds, 2);
        if (!this.fromPush || this.unreadCount != 0) {
            if (!this.mCachedIds.isEmpty()) {
                Intrinsics.checkExpressionValueIsNotNull(list, "list");
                Iterable<BaseNotice> iterable = list;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    i2 = 0;
                    for (BaseNotice baseNotice : iterable) {
                        Set<String> set = this.mCachedIds;
                        Intrinsics.checkExpressionValueIsNotNull(baseNotice, AdvanceSetting.NETWORK_TYPE);
                        if (!set.contains(baseNotice.nid)) {
                            i2++;
                            if (i2 < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                } else {
                    i2 = 0;
                }
            } else {
                i2 = this.unreadCount;
            }
            i = Math.max(3, i2);
        } else {
            i = 20;
        }
        Intrinsics.checkExpressionValueIsNotNull(list, "list");
        Collection collection = this.mCachedIds;
        for (BaseNotice baseNotice2 : list) {
            Intrinsics.checkExpressionValueIsNotNull(baseNotice2, AdvanceSetting.NETWORK_TYPE);
            String str = baseNotice2.nid;
            if (str != null) {
                collection.add(str);
            }
        }
        if (list.size() > i) {
            List<BaseNotice> arrayList = new ArrayList<>();
            arrayList.addAll(list.subList(0, i));
            arrayList.add(new c(0));
            notice.items = arrayList;
            List<BaseNotice> arrayList2 = new ArrayList<>();
            arrayList2.addAll(list.subList(i, list.size()));
            this.mFansList = arrayList2;
        } else if (list.size() == 0) {
            notice.hasMore = false;
            notice.items = CollectionsKt.mutableListOf(new c(2));
        } else {
            List<BaseNotice> arrayList3 = new ArrayList<>();
            arrayList3.addAll(list);
            if (notice.hasMore) {
                arrayList3.add(new c(0));
            }
            notice.items = arrayList3;
        }
    }

    public FansModel(boolean z, int i) {
        this.fromPush = z;
        this.unreadCount = i;
    }

    private final void fetchFans(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 63103, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 63103, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.mIsLoading = true;
        m.a().a(this.mHandler, new FansModel$fetchFans$1(j3, j4), 0);
    }
}
