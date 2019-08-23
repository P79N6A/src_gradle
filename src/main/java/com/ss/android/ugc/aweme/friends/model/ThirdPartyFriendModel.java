package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.d.d;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ap;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class ThirdPartyFriendModel extends d<Friend> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Set<String> invitedContacts;
    private final String accessToken;
    private final FriendApi friendApi;
    private HashMap<String, ContactModel> hashContactsMap;
    private boolean isSensitiveRegion;
    private final String platform;
    private final String secretAccessToken;

    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    private i<FriendList<Friend>> uploadContacts() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46656, new Class[0], i.class)) {
            return i.a((Callable<TResult>) new ThirdPartyFriendModel$$Lambda$3<TResult>(this)).c(new ThirdPartyFriendModel$$Lambda$4(this));
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46656, new Class[0], i.class);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$4$ThirdPartyFriendModel() throws Exception {
        List<DouyinContactModel> a2 = ap.a(com.ss.android.ugc.aweme.app.i.a().getContext());
        if (CollectionUtils.isEmpty(a2)) {
            return new UploadContactsResult();
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        for (DouyinContactModel next : a2) {
            for (String next2 : next.phoneNumber) {
                if (!TextUtils.isEmpty(next2)) {
                    String str = next.name;
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    ContactModel contactModel = new ContactModel(next2, str);
                    HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                    hashMap.put(DigestUtils.toHexString(instance.digest(next.nationalNumber(next2).getBytes("UTF-8"))) + DigestUtils.toHexString(instance.digest(str.getBytes("UTF-8"))), contactModel);
                }
            }
        }
        return UploadContactsApi.a(a2, 1);
    }

    public ThirdPartyFriendModel(String str) {
        this(str, null, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$fetchList$3$ThirdPartyFriendModel(i iVar) throws Exception {
        ((FriendList) iVar.e()).friends = sortByFollowStatus(((FriendList) iVar.e()).friends);
        return iVar.e();
    }

    public void addInvitedContact(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 46659, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 46659, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SystemSmsInvitedCacheHelper.addInvitedContact(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i lambda$fetchList$1$ThirdPartyFriendModel(i iVar) throws Exception {
        if (!this.isSensitiveRegion) {
            return this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken).c(new ThirdPartyFriendModel$$Lambda$6(this, iVar));
        }
        if (!iVar.d()) {
            iVar.getClass();
            return i.a(ThirdPartyFriendModel$$Lambda$5.get$Lambda(iVar));
        }
        throw iVar.f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$fetchList$2$ThirdPartyFriendModel(i iVar) throws Exception {
        FriendList friendList = (FriendList) ((List) iVar.e()).get(0);
        FriendList friendList2 = (FriendList) ((List) iVar.e()).get(1);
        if (this.isSensitiveRegion) {
            return friendList2;
        }
        friendList.friends = insertUnRegisteredContacts(sortByFollowStatus(friendList.friends), friendList2.friends);
        return friendList;
    }

    private <T extends User> List<Friend> sortByFollowStatus(List<T> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 46657, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 46657, new Class[]{List.class}, List.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int i2 = 0;
            int i3 = 0;
            for (T t : list) {
                if (t.getFollowStatus() == 0) {
                    arrayList.add(i, Friend.copyFrom(t));
                    i++;
                    i2++;
                    i3++;
                } else if (t.getFollowStatus() == 4) {
                    arrayList.add(i2, Friend.copyFrom(t));
                    i2++;
                    i3++;
                } else if (t.getFollowStatus() == 1) {
                    arrayList.add(i3, Friend.copyFrom(t));
                    i3++;
                } else {
                    arrayList.add(Friend.copyFrom(t));
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$uploadContacts$5$ThirdPartyFriendModel(i iVar) throws Exception {
        ArrayList arrayList;
        UploadContactsResult uploadContactsResult = (UploadContactsResult) iVar.e();
        List<ContactModel> list = uploadContactsResult.contacts;
        boolean z = false;
        if (!CollectionUtils.isEmpty(list)) {
            arrayList = new ArrayList(list.size());
            int i = 0;
            for (ContactModel next : list) {
                HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                ContactModel contactModel = hashMap.get(next.phoneNumber + next.name);
                if (contactModel != null) {
                    next.phoneNumber = contactModel.phoneNumber;
                    next.name = contactModel.name;
                }
                Friend friend = new Friend(next.phoneNumber);
                friend.setNickname(next.name);
                if (SystemSmsInvitedCacheHelper.contains(next.phoneNumber)) {
                    friend.setInvited(true);
                    arrayList.add(friend);
                } else {
                    arrayList.add(i, friend);
                    i++;
                }
            }
        } else {
            arrayList = null;
        }
        List<Friend> sortByFollowStatus = sortByFollowStatus(uploadContactsResult.users);
        FriendList friendList = new FriendList();
        friendList.friends = insertUnRegisteredContacts(sortByFollowStatus, arrayList);
        if (sortByFollowStatus != null) {
            z = true;
        }
        this.isSensitiveRegion = z;
        SharePrefCache.inst().getIsContactsUploaded().a(Boolean.TRUE);
        return friendList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$null$0$ThirdPartyFriendModel(i iVar, i iVar2) throws Exception {
        ((FriendList) iVar2.e()).friends = insertUnRegisteredContacts(sortByFollowStatus(((FriendList) iVar2.e()).friends), ((FriendList) iVar.e()).friends);
        return (FriendList) iVar2.e();
    }

    private List<Friend> insertUnRegisteredContacts(List<Friend> list, List<Friend> list2) {
        List<Friend> list3 = list;
        List<Friend> list4 = list2;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46658, new Class[]{List.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46658, new Class[]{List.class, List.class}, List.class);
        } else if (CollectionUtils.isEmpty(list2)) {
            return list3;
        } else {
            if (CollectionUtils.isEmpty(list)) {
                return list4;
            }
            int size = list.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (list3.get(size).getFollowStatus() == 0) {
                    i = size + 1;
                    break;
                } else {
                    size--;
                }
            }
            list3.addAll(i, list4);
            return list3;
        }
    }

    public ThirdPartyFriendModel(String str, String str2, String str3) {
        this.hashContactsMap = new HashMap<>();
        this.platform = str;
        this.accessToken = str2;
        this.secretAccessToken = str3;
        this.friendApi = (FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FriendApi.class);
    }

    public void fetchList(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46655, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46655, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.platform.equals("contact")) {
            this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken).c(new ThirdPartyFriendModel$$Lambda$2(this)).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        } else if (!((Boolean) SharePrefCache.inst().getIsContactsUploaded().c()).booleanValue()) {
            uploadContacts().b((g<TResult, i<TContinuationResult>>) new ThirdPartyFriendModel$$Lambda$0<TResult,i<TContinuationResult>>(this)).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            i.a((Collection<? extends i<TResult>>) Arrays.asList(new i[]{this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken), uploadContacts()})).c(new ThirdPartyFriendModel$$Lambda$1(this)).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
