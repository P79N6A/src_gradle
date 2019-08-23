package com.ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$AllFriends;", "call"}, k = 3, mv = {1, 1, 15})
final class AtFriendsViewModel$loadAllFriends$1<V> implements Callable<TResult> {
    public static final AtFriendsViewModel$loadAllFriends$1 INSTANCE = new AtFriendsViewModel$loadAllFriends$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    AtFriendsViewModel$loadAllFriends$1() {
    }

    @NotNull
    public final AtFriendsViewModel.Companion.AllFriends call() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46588, new Class[0], AtFriendsViewModel.Companion.AllFriends.class)) {
            return (AtFriendsViewModel.Companion.AllFriends) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46588, new Class[0], AtFriendsViewModel.Companion.AllFriends.class);
        }
        IIMService a2 = b.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "IM.get()");
        List<IMUser> allFollowIMUsers = a2.getAllFollowIMUsers();
        if (allFollowIMUsers == null) {
            allFollowIMUsers = CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (Object next : allFollowIMUsers) {
            IMUser iMUser = (IMUser) next;
            Intrinsics.checkExpressionValueIsNotNull(iMUser, AdvanceSetting.NETWORK_TYPE);
            String uid = iMUser.getUid();
            IAccountUserService a3 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            if (true ^ Intrinsics.areEqual((Object) uid, (Object) a3.getCurUserId())) {
                arrayList.add(next);
            }
        }
        List<IMUser> list = (List) arrayList;
        List arrayList2 = new ArrayList();
        try {
            List<User> list2 = SummonFriendApi.a().users;
            if (list2 != null && (!list2.isEmpty())) {
                for (User user : list2) {
                    if (arrayList2.size() < 10) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            IMUser iMUser2 = (IMUser) obj;
                            Intrinsics.checkExpressionValueIsNotNull(iMUser2, AdvanceSetting.NETWORK_TYPE);
                            String uid2 = iMUser2.getUid();
                            Intrinsics.checkExpressionValueIsNotNull(user, AllStoryActivity.f73306b);
                            if (Intrinsics.areEqual((Object) uid2, (Object) user.getUid())) {
                                break;
                            }
                        }
                        IMUser iMUser3 = (IMUser) obj;
                        if (iMUser3 == null) {
                            iMUser3 = b.a(user);
                            Intrinsics.checkExpressionValueIsNotNull(iMUser3, "IM.convert(user)");
                        }
                        arrayList2.add(iMUser3);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList2.size() < 10) {
            IIMService a4 = b.a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "IM.get()");
            List<IMUser> recentIMUsers = a4.getRecentIMUsers();
            if (recentIMUsers != null) {
                for (IMUser iMUser4 : recentIMUsers) {
                    if (arrayList2.size() < 10 && !arrayList2.contains(iMUser4)) {
                        Intrinsics.checkExpressionValueIsNotNull(iMUser4, "imUser");
                        String uid3 = iMUser4.getUid();
                        IAccountUserService a5 = d.a();
                        Intrinsics.checkExpressionValueIsNotNull(a5, "AccountUserProxyService.get()");
                        if (!Intrinsics.areEqual((Object) uid3, (Object) a5.getCurUserId())) {
                            arrayList2.add(iMUser4);
                        }
                    }
                }
            }
        }
        List arrayList3 = new ArrayList();
        List arrayList4 = new ArrayList();
        List arrayList5 = new ArrayList();
        for (IMUser iMUser5 : list) {
            Intrinsics.checkExpressionValueIsNotNull(iMUser5, AdvanceSetting.NETWORK_TYPE);
            if (iMUser5.getFollowStatus() == 2 && list.size() >= 10) {
                arrayList3.add(iMUser5);
            }
            if (arrayList4.isEmpty() || !TextUtils.equals((CharSequence) arrayList4.get(arrayList4.size() - 1), iMUser5.getInitialLetter())) {
                String initialLetter = iMUser5.getInitialLetter();
                Intrinsics.checkExpressionValueIsNotNull(initialLetter, "it.initialLetter");
                arrayList4.add(initialLetter);
                arrayList5.add(1);
            } else {
                int size = arrayList5.size() - 1;
                arrayList5.set(size, Integer.valueOf(((Number) arrayList5.get(size)).intValue() + 1));
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList4.add(0, "Friend");
            arrayList5.add(0, Integer.valueOf(arrayList3.size()));
        }
        if (!arrayList2.isEmpty()) {
            arrayList4.add(0, "Recent");
            arrayList5.add(0, Integer.valueOf(arrayList2.size()));
        }
        AtFriendsViewModel.Companion.AllFriends allFriends = new AtFriendsViewModel.Companion.AllFriends(arrayList2, arrayList3, list, arrayList4, arrayList5);
        return allFriends;
    }
}
