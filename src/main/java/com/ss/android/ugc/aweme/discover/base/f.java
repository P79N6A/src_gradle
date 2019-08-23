package com.ss.android.ugc.aweme.discover.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.discover.mixfeed.a;
import com.ss.android.ugc.aweme.discover.mixfeed.b;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Commodity;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/Reducer;", "", "()V", "addCustomVideoTitle", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "searchMixFeedList", "addRequestId", "", "data", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeedList;", "doSomeAfterMerge", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42169a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f42170b = new f();

    private f() {
    }

    @NotNull
    public final List<a> b(@NotNull List<? extends a> list) {
        List<? extends a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f42169a, false, 36172, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, f42169a, false, 36172, new Class[]{List.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "searchMixFeedList");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((a) list2.get(i)).getFeedType() == 65280 && ((a) list2.get(i)).getAweme() != null) {
                Aweme aweme = ((a) list2.get(i)).getAweme();
                if (aweme == null) {
                    Intrinsics.throwNpe();
                }
                aweme.setAwemePosition(i);
            }
        }
        return list2;
    }

    @NotNull
    public final List<a> a(@NotNull List<? extends a> list) {
        boolean z;
        List<? extends a> list2 = list;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f42169a, false, 36170, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, f42169a, false, 36170, new Class[]{List.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "searchMixFeedList");
        Collection arrayList = new ArrayList();
        for (Object next : list2) {
            if (((a) next).getFeedType() != 65465) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<a> mutableList = CollectionsKt.toMutableList((Collection<? extends T>) (List) arrayList);
        List<Number> arrayList2 = new ArrayList<>();
        boolean z2 = false;
        int i2 = 0;
        for (a aVar : mutableList) {
            if (!z2 && aVar.a()) {
                com.bytedance.g.c.a.a(arrayList2, Integer.valueOf(i2));
            }
            z2 = aVar.a();
            i2++;
        }
        for (Number intValue : arrayList2) {
            int intValue2 = intValue.intValue();
            a aVar2 = new a();
            aVar2.setFeedType(65465);
            aVar2.f42541b = k.h().getString(C0906R.string.dra);
            mutableList.add(intValue2 + i, aVar2);
            i++;
        }
        return mutableList;
    }

    public final void a(@NotNull b bVar) {
        int i;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f42169a, false, 36171, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f42169a, false, 36171, new Class[]{b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "data");
        List<a> list = bVar2.f42549d;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            a aVar = bVar2.f42549d.get(i2);
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.s = bVar2.logPb;
            if (aVar.getFeedType() == 65280) {
                Aweme aweme = aVar.getAweme();
                if (com.ss.android.ugc.aweme.newfollow.a.b.i(aweme)) {
                    Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(aweme);
                    com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                    StringBuilder sb = new StringBuilder();
                    if (a2 == null) {
                        Intrinsics.throwNpe();
                    }
                    sb.append(a2.getAid());
                    sb.append(9);
                    a3.a(sb.toString(), bVar.getRequestId(), i2);
                    aVar.setAweme(a2);
                    bVar2.f42549d.set(i2, aVar);
                    a2.setRequestId(bVar.getRequestId());
                    if (a2.getAwemeType() == 13) {
                        Aweme forwardItem = a2.getForwardItem();
                        if (forwardItem != null) {
                            forwardItem.setRepostFromGroupId(a2.getAid());
                            forwardItem.setRepostFromUserId(a2.getAuthorUid());
                            Aweme a4 = com.ss.android.ugc.aweme.feed.a.a().a(forwardItem);
                            com.ss.android.ugc.aweme.feed.a a5 = com.ss.android.ugc.aweme.feed.a.a();
                            StringBuilder sb2 = new StringBuilder();
                            if (a4 == null) {
                                Intrinsics.throwNpe();
                            }
                            sb2.append(a4.getAid());
                            sb2.append(1);
                            a5.a(sb2.toString(), bVar.getRequestId(), i2);
                            a4.setRequestId(bVar.getRequestId());
                        }
                    }
                }
            }
            if (aVar.getFeedType() == 65458) {
                for (SearchUser next : aVar.f42543d) {
                    Intrinsics.checkExpressionValueIsNotNull(next, AllStoryActivity.f73306b);
                    if (next.user != null) {
                        User user = next.user;
                        Intrinsics.checkExpressionValueIsNotNull(user, "user.user");
                        user.setRequestId(bVar.getRequestId());
                    }
                }
            }
            if (aVar.getFeedType() == 65456) {
                for (SearchChallenge next2 : aVar.f42545f) {
                    if (next2 != null) {
                        next2.setRequestId(bVar.getRequestId());
                        if (next2.getChallenge() != null) {
                            Challenge challenge = next2.getChallenge();
                            Intrinsics.checkExpressionValueIsNotNull(challenge, "challenge.challenge");
                            challenge.setRequestId(bVar.getRequestId());
                        }
                    }
                }
            }
            if (aVar.getFeedType() == 65457) {
                for (Music next3 : aVar.f42544e) {
                    if (next3 != null) {
                        next3.setRequestId(bVar.getRequestId());
                    }
                }
            }
            if (aVar.getFeedType() == 65463) {
                for (SearchCommodity next4 : aVar.l) {
                    if (next4 != null) {
                        Commodity commodity = next4.getCommodity();
                        if (commodity != null) {
                            commodity.setLogPb(bVar2.logPb);
                        }
                    }
                }
            }
        }
    }
}
