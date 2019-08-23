package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.b.c;
import com.ss.android.ugc.aweme.friends.c.a;
import com.ss.android.ugc.aweme.friends.d.d;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.utils.ah;
import com.ss.android.ugc.aweme.utils.ao;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.cf;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

public class InviteContactFriendsModel extends d<Friend> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FriendApi friendApi = ((FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FriendApi.class));
    private HashMap<String, ContactModel> hashContactsMap = new HashMap<>();
    public List<Integer> mIndexCounts = new ArrayList();
    public List<String> mIndexLetters = new ArrayList();
    private InvitedContactCacher sInvitedContactCacher = new InvitedContactCacher(604800000);

    public static class ContactFriend extends Friend {
        public static ChangeQuickRedirect changeQuickRedirect;
        String firstName;
        String lastName;
        public int originIndex;
        public String section;
        String url;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getOriginIndex() {
            return this.originIndex;
        }

        public String getSection() {
            return this.section;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46632, new Class[0], Integer.TYPE)) {
                return super.hashCode();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46632, new Class[0], Integer.TYPE)).intValue();
        }

        public ContactFriend(String str) {
            super(str);
        }

        public void setFirstName(String str) {
            this.firstName = str;
        }

        public void setLastName(String str) {
            this.lastName = str;
        }

        public void setOriginIndex(int i) {
            this.originIndex = i;
        }

        public void setSection(String str) {
            this.section = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public boolean equals(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, changeQuickRedirect, false, 46631, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, changeQuickRedirect, false, 46631, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (obj2 instanceof ContactFriend) {
                ContactFriend contactFriend = (ContactFriend) obj2;
                if (!TextUtils.equals(getSocialName(), contactFriend.getSocialName()) || !TextUtils.equals(getNickname(), contactFriend.getNickname())) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    public interface IFetchShareConfigCallback {
        void onFailed();

        void onSuccess(com.ss.android.ugc.aweme.friends.b.d dVar);
    }

    public interface InviteFriendsCallback {
        void onFailed(String str);

        void onSuccess();
    }

    static class InvitedContactCacher {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Map<String, Long> invited;
        private final long mExpiredTime;
        private final Object mLock = new Object();
        private Runnable mSaveRunnable = new InviteContactFriendsModel$InvitedContactCacher$$Lambda$0(this);

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$new$1$InviteContactFriendsModel$InvitedContactCacher() {
            i.a((Callable<TResult>) new InviteContactFriendsModel$InvitedContactCacher$$Lambda$1<TResult>(this));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:11|12|(1:14)(1:15)|16|(4:18|(4:21|(2:27|40)|28|19)|39|29)|30|31|(1:33)) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00b2 */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void delayInit() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 46635(0xb62b, float:6.535E-41)
                r2 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 46635(0xb62b, float:6.535E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                java.lang.Object r1 = r11.mLock
                monitor-enter(r1)
                java.util.Map<java.lang.String, java.lang.Long> r2 = r11.invited     // Catch:{ all -> 0x00bf }
                if (r2 == 0) goto L_0x002e
                monitor-exit(r1)     // Catch:{ all -> 0x00bf }
                return
            L_0x002e:
                com.ss.android.ugc.aweme.friends.c.a r9 = com.ss.android.ugc.aweme.friends.c.a.a()     // Catch:{ Exception -> 0x00b2 }
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00b2 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.friends.c.a.f48843a     // Catch:{ Exception -> 0x00b2 }
                r5 = 0
                r6 = 46671(0xb64f, float:6.54E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00b2 }
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b2 }
                if (r2 == 0) goto L_0x0059
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00b2 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.friends.c.a.f48843a     // Catch:{ Exception -> 0x00b2 }
                r5 = 0
                r6 = 46671(0xb64f, float:6.54E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00b2 }
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r3 = r9
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b2 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b2 }
                goto L_0x0063
            L_0x0059:
                android.content.SharedPreferences r2 = r9.f48844b     // Catch:{ Exception -> 0x00b2 }
                java.lang.String r3 = "contact_invited"
                java.lang.String r4 = ""
                java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ Exception -> 0x00b2 }
            L_0x0063:
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00b2 }
                if (r3 != 0) goto L_0x00b2
                java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x00b2 }
                r3.<init>()     // Catch:{ Exception -> 0x00b2 }
                r11.invited = r3     // Catch:{ Exception -> 0x00b2 }
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x00b2 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x00b2 }
            L_0x0075:
                int r2 = r3.length()     // Catch:{ Exception -> 0x00b2 }
                if (r0 >= r2) goto L_0x00ad
                org.json.JSONObject r2 = r3.optJSONObject(r0)     // Catch:{ Exception -> 0x00b2 }
                java.lang.String r4 = "social_name"
                java.lang.String r4 = r2.optString(r4)     // Catch:{ Exception -> 0x00b2 }
                java.lang.String r5 = "invited_time"
                long r5 = r2.optLong(r5)     // Catch:{ Exception -> 0x00b2 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00b2 }
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00b2 }
                if (r2 != 0) goto L_0x00aa
                r9 = 0
                int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r2 <= 0) goto L_0x00aa
                boolean r2 = r11.hasExpired(r5, r7)     // Catch:{ Exception -> 0x00b2 }
                if (r2 != 0) goto L_0x00aa
                java.util.Map<java.lang.String, java.lang.Long> r2 = r11.invited     // Catch:{ Exception -> 0x00b2 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x00b2 }
                r2.put(r4, r5)     // Catch:{ Exception -> 0x00b2 }
            L_0x00aa:
                int r0 = r0 + 1
                goto L_0x0075
            L_0x00ad:
                java.lang.Runnable r0 = r11.mSaveRunnable     // Catch:{ Exception -> 0x00b2 }
                r0.run()     // Catch:{ Exception -> 0x00b2 }
            L_0x00b2:
                java.util.Map<java.lang.String, java.lang.Long> r0 = r11.invited     // Catch:{ all -> 0x00bf }
                if (r0 != 0) goto L_0x00bd
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x00bf }
                r0.<init>()     // Catch:{ all -> 0x00bf }
                r11.invited = r0     // Catch:{ all -> 0x00bf }
            L_0x00bd:
                monitor-exit(r1)     // Catch:{ all -> 0x00bf }
                return
            L_0x00bf:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00bf }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InvitedContactCacher.delayInit():void");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object lambda$null$0$InviteContactFriendsModel$InvitedContactCacher() throws Exception {
            if (this.invited == null) {
                SharePrefCache.inst().setInvitedContacts("");
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            Iterator<Map.Entry<String, Long>> it2 = this.invited.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry next = it2.next();
                if (hasExpired(((Long) next.getValue()).longValue(), currentTimeMillis)) {
                    it2.remove();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("social_name", next.getKey());
                    jSONObject.put("invited_time", next.getValue());
                    jSONArray.put(jSONObject);
                }
            }
            a a2 = a.a();
            String jSONArray2 = jSONArray.toString();
            if (PatchProxy.isSupport(new Object[]{jSONArray2}, a2, a.f48843a, false, 46670, new Class[]{String.class}, Void.TYPE)) {
                a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{jSONArray2}, aVar, a.f48843a, false, 46670, new Class[]{String.class}, Void.TYPE);
            } else {
                a2.f48844b.edit().putString("contact_invited", jSONArray2).apply();
            }
            return null;
        }

        InvitedContactCacher(long j) {
            this.mExpiredTime = j;
        }

        public void add(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 46634, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 46634, new Class[]{String.class}, Void.TYPE);
                return;
            }
            delayInit();
            synchronized (this.mLock) {
                this.invited.put(str, Long.valueOf(System.currentTimeMillis()));
                this.mSaveRunnable.run();
            }
        }

        private boolean hasExpired(long j, long j2) {
            if (j + this.mExpiredTime <= j2) {
                return true;
            }
            return false;
        }

        public boolean contains(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 46633, new Class[]{String.class, Long.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 46633, new Class[]{String.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
            }
            delayInit();
            if (!this.invited.containsKey(str) || hasExpired(this.invited.get(str).longValue(), j2)) {
                return false;
            }
            return true;
        }
    }

    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    private i<FriendList<ContactFriend>> uploadContacts() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46608, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46608, new Class[0], i.class);
        }
        AtomicReference atomicReference = new AtomicReference();
        return i.a((Callable<TResult>) new InviteContactFriendsModel$$Lambda$1<TResult>(this, atomicReference)).c(new InviteContactFriendsModel$$Lambda$2(this, atomicReference));
    }

    static final /* synthetic */ i lambda$fetchList$0$InviteContactFriendsModel(i iVar) throws Exception {
        if (!iVar.d()) {
            iVar.getClass();
            return i.a(InviteContactFriendsModel$$Lambda$9.get$Lambda(iVar));
        }
        throw iVar.f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$fetchShareConfig$8$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback) throws Exception {
        com.ss.android.ugc.aweme.friends.b.d dVar;
        try {
            dVar = (com.ss.android.ugc.aweme.friends.b.d) com.ss.android.ugc.aweme.friends.api.a.a().getInviteContactFriendsSettings().get();
        } catch (Throwable unused) {
            dVar = null;
        }
        if (dVar != null) {
            this.mHandler.post(new InviteContactFriendsModel$$Lambda$7(iFetchShareConfigCallback, dVar));
        }
        return null;
    }

    public InviteContactFriendsModel(String str) {
    }

    public void addInvitedContact(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 46613, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 46613, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.sInvitedContactCacher != null) {
            this.sInvitedContactCacher.add(str);
        }
    }

    public static Key getKey(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 46619, new Class[]{String.class}, Key.class)) {
            return (Key) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 46619, new Class[]{String.class}, Key.class);
        }
        try {
            return new SecretKeySpec(str.getBytes(), "AES");
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public void fetchShareConfig(IFetchShareConfigCallback iFetchShareConfigCallback) {
        IFetchShareConfigCallback iFetchShareConfigCallback2 = iFetchShareConfigCallback;
        if (PatchProxy.isSupport(new Object[]{iFetchShareConfigCallback2}, this, changeQuickRedirect, false, 46616, new Class[]{IFetchShareConfigCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFetchShareConfigCallback2}, this, changeQuickRedirect, false, 46616, new Class[]{IFetchShareConfigCallback.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new InviteContactFriendsModel$$Lambda$6<TResult>(this, iFetchShareConfigCallback2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$1$InviteContactFriendsModel(AtomicReference atomicReference) throws Exception {
        atomicReference.set(ap.a(com.ss.android.ugc.aweme.app.i.a().getContext(), "sort_key", true));
        List<DouyinContactModel> list = ((ao) atomicReference.get()).f75519a;
        filterInvalidVal(list);
        if (CollectionUtils.isEmpty(list)) {
            return new UploadContactsResult();
        }
        encodeAndAddToCache((ao) atomicReference.get());
        if (CollectionUtils.isEmpty(list)) {
            return new UploadContactsResult();
        }
        return UploadContactsApi.a(list, 1);
    }

    @WorkerThread
    public c shortenUrl(String str) throws ExecutionException, InterruptedException {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 46617, new Class[]{String.class}, c.class)) {
            return (c) com.ss.android.ugc.aweme.friends.api.a.a().shortenUrl(str2).get();
        }
        return (c) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 46617, new Class[]{String.class}, c.class);
    }

    private void encodeAndAddToCache(ao aoVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{aoVar}, this, changeQuickRedirect, false, 46612, new Class[]{ao.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aoVar}, this, changeQuickRedirect, false, 46612, new Class[]{ao.class}, Void.TYPE);
            return;
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        this.hashContactsMap.clear();
        for (DouyinContactModel next : aoVar.f75519a) {
            for (String next2 : next.phoneNumber) {
                if (!TextUtils.isEmpty(next2)) {
                    String str = next.name;
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    ContactModel contactModel = new ContactModel(next2, str);
                    contactModel.url = next.mImageUrl;
                    contactModel.firstName = next.givenName;
                    contactModel.lastName = next.familyName;
                    contactModel.originIndex = i;
                    contactModel.mSection = next.section;
                    HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                    hashMap.put(DigestUtils.toHexString(instance.digest(next.nationalNumber(next2).getBytes("UTF-8"))) + DigestUtils.toHexString(instance.digest(str.getBytes("UTF-8"))), contactModel);
                }
            }
            i++;
        }
    }

    private void filterInvalidVal(List<DouyinContactModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 46609, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 46609, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Iterator<DouyinContactModel> it2 = list.iterator();
        while (it2.hasNext()) {
            DouyinContactModel next = it2.next();
            if (StringUtils.isEmpty(next.name) || next.phoneNumber.isEmpty()) {
                it2.remove();
            } else if (!StringUtils.isEmpty(next.familyName) || !StringUtils.isEmpty(next.givenName)) {
                Iterator<String> it3 = next.phoneNumber.iterator();
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    try {
                        if (StringUtils.isEmpty(next2)) {
                            it3.remove();
                        } else if (next2.charAt(0) != '+' && (next2.length() < 2 || next2.length() > 17 || !next2.matches("[0-9.-]+"))) {
                            it3.remove();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (next.phoneNumber.isEmpty()) {
                    it2.remove();
                }
            } else {
                it2.remove();
            }
        }
    }

    private void sortWithContactIndex(List<ContactFriend> list) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 46611, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 46611, new Class[]{List.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ContactFriend> it2 = list.iterator();
        while (it2.hasNext()) {
            ContactFriend next = it2.next();
            if (TextUtils.equals(next.section, "#") || TextUtils.equals(next.section, "…") || next.section == null || TextUtils.isEmpty(next.section.trim())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                it2.remove();
                next.setSection("#");
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList, InviteContactFriendsModel$$Lambda$3.$instance);
        Collections.sort(list, InviteContactFriendsModel$$Lambda$4.$instance);
        list.addAll(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ContactFriend next2 : list) {
            if (next2 != null) {
                String section = next2.getSection();
                if (!linkedHashMap.containsKey(section)) {
                    linkedHashMap.put(section, 1);
                } else {
                    linkedHashMap.put(section, Integer.valueOf(((Integer) linkedHashMap.get(section)).intValue() + 1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : linkedHashMap.keySet()) {
            arrayList2.add(str);
            arrayList3.add(linkedHashMap.get(str));
        }
        this.mIndexLetters = arrayList2;
        this.mIndexCounts = arrayList3;
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$4$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        return contactFriend.originIndex - contactFriend2.originIndex;
    }

    static final /* synthetic */ void lambda$null$7$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback, com.ss.android.ugc.aweme.friends.b.d dVar) {
        if (iFetchShareConfigCallback != null) {
            if (dVar != null) {
                iFetchShareConfigCallback.onSuccess(dVar);
                return;
            }
            iFetchShareConfigCallback.onFailed();
        }
    }

    private static String encryptAES(String str, String str2) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 46618, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 46618, new Class[]{String.class, String.class}, String.class);
        }
        byte[] bytes = str3.getBytes("UTF-8");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        try {
            instance.init(1, getKey(str2), new IvParameterSpec(str4.getBytes("UTF-8")));
            return Base64.encodeToString(instance.doFinal(bytes), 2);
        } catch (InvalidAlgorithmParameterException unused) {
            return "";
        }
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$3$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        char charAt = contactFriend.getNickname().toLowerCase().charAt(0);
        char charAt2 = contactFriend2.getNickname().toLowerCase().charAt(0);
        if (charAt < 'a' || charAt > 'z') {
            if (charAt2 >= 'a' && charAt2 <= 'z') {
                return 1;
            }
            if (charAt < '0' || charAt > '9') {
                if (charAt2 < '0' || charAt2 > '9') {
                    return contactFriend.originIndex - contactFriend2.originIndex;
                }
                return 1;
            } else if (charAt2 < '0' || charAt2 > '9') {
                return -1;
            } else {
                return charAt - charAt2;
            }
        } else if (charAt2 < 'a' || charAt2 > 'z') {
            return -1;
        } else {
            return contactFriend.originIndex - contactFriend2.originIndex;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$uploadContacts$2$InviteContactFriendsModel(AtomicReference atomicReference, i iVar) throws Exception {
        ArrayList arrayList;
        List<ContactModel> list = ((UploadContactsResult) iVar.e()).contacts;
        if (!CollectionUtils.isEmpty(list)) {
            arrayList = new ArrayList(list.size());
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            for (ContactModel next : list) {
                HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                ContactModel contactModel = hashMap.get(next.phoneNumber + next.name);
                if (contactModel != null) {
                    next.phoneNumber = contactModel.phoneNumber;
                    next.name = contactModel.name;
                }
                ContactFriend contactFriend = new ContactFriend(next.phoneNumber);
                contactFriend.setNickname(next.name);
                if (contactModel != null) {
                    contactFriend.setFirstName(contactModel.firstName);
                    contactFriend.setLastName(contactModel.lastName);
                    contactFriend.setOriginIndex(contactModel.originIndex);
                    contactFriend.setSection(contactModel.mSection);
                    String str = contactModel.url;
                    if (!StringUtils.isEmpty(str)) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setHeight(-1);
                        urlModel.setWidth(-1);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(str);
                        urlModel.setUrlList(arrayList2);
                        contactFriend.setAvatarThumb(urlModel);
                    }
                }
                if (!arrayList.contains(contactFriend)) {
                    if (this.sInvitedContactCacher.contains(next.phoneNumber, currentTimeMillis)) {
                        contactFriend.setInvited(true);
                        arrayList.add(contactFriend);
                    } else {
                        arrayList.add(i, contactFriend);
                        i++;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        FriendList friendList = new FriendList();
        sort((ao) atomicReference.get(), arrayList);
        friendList.friends = arrayList;
        return friendList;
    }

    private void sort(ao aoVar, List<ContactFriend> list) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ao aoVar2 = aoVar;
        List<ContactFriend> list2 = list;
        if (PatchProxy.isSupport(new Object[]{aoVar2, list2}, this, changeQuickRedirect, false, 46610, new Class[]{ao.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aoVar2, list2}, this, changeQuickRedirect, false, 46610, new Class[]{ao.class, List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            if (aoVar2.f75521c == null || aoVar2.f75520b == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (PatchProxy.isSupport(new Object[0], null, cf.f75678a, true, 88367, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, cf.f75678a, true, 88367, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    for (ContactFriend next : list) {
                        String nickname = next.getNickname();
                        if (PatchProxy.isSupport(new Object[]{nickname, (byte) 1}, null, ah.f75494a, true, 88070, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                            str = (String) PatchProxy.accessDispatch(new Object[]{nickname, (byte) 1}, null, ah.f75494a, true, 88070, new Class[]{String.class, Boolean.TYPE}, String.class);
                        } else {
                            String str2 = "#";
                            if (!TextUtils.isEmpty(nickname)) {
                                char charAt = nickname.charAt(0);
                                if (PatchProxy.isSupport(new Object[]{Character.valueOf(charAt)}, null, ah.f75494a, true, 88064, new Class[]{Character.TYPE}, Boolean.TYPE)) {
                                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(charAt)}, null, ah.f75494a, true, 88064, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
                                } else {
                                    if (charAt < 19968 || charAt > 40869) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (!z5) {
                                        if (PatchProxy.isSupport(new Object[]{Character.valueOf(charAt)}, null, ah.f75494a, true, 88060, new Class[]{Character.TYPE}, Boolean.TYPE)) {
                                            z6 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(charAt)}, null, ah.f75494a, true, 88060, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
                                        } else if (Character.isUpperCase(charAt) || Character.isLowerCase(charAt)) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (!z6) {
                                            z3 = false;
                                        }
                                    }
                                    z3 = true;
                                }
                                if (z3) {
                                    str2 = ah.c(nickname).substring(0, 1).toUpperCase();
                                    if (TextUtils.isEmpty(str2)) {
                                        str = nickname.substring(0, 1).toUpperCase();
                                    }
                                } else {
                                    if (PatchProxy.isSupport(new Object[]{Character.valueOf(charAt)}, null, ah.f75494a, true, 88065, new Class[]{Character.TYPE}, Boolean.TYPE)) {
                                        z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(charAt)}, null, ah.f75494a, true, 88065, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
                                    } else if (ah.a(charAt) || ah.b(charAt)) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 || ah.a(nickname)) {
                                        str = "#";
                                    } else {
                                        str = "#";
                                    }
                                }
                            }
                            str = str2;
                        }
                        next.setSection(str);
                    }
                }
            }
            sortWithContactIndex(list2);
        }
    }

    static final /* synthetic */ void lambda$null$5$InviteContactFriendsModel(boolean z, InviteFriendsCallback inviteFriendsCallback, String str) {
        if (z) {
            inviteFriendsCallback.onSuccess();
        } else {
            inviteFriendsCallback.onFailed(str);
        }
    }

    public void fetchList(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46607, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46607, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        uploadContacts().b(InviteContactFriendsModel$$Lambda$0.$instance).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public void inviteFriends(String str, List<ContactModel> list, InviteFriendsCallback inviteFriendsCallback) {
        String str2 = str;
        List<ContactModel> list2 = list;
        InviteFriendsCallback inviteFriendsCallback2 = inviteFriendsCallback;
        if (PatchProxy.isSupport(new Object[]{str2, list2, inviteFriendsCallback2}, this, changeQuickRedirect, false, 46614, new Class[]{String.class, List.class, InviteFriendsCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2, inviteFriendsCallback2}, this, changeQuickRedirect, false, 46614, new Class[]{String.class, List.class, InviteFriendsCallback.class}, Void.TYPE);
            return;
        }
        inviteFriends(str2, list2, null, inviteFriendsCallback2);
    }

    public void inviteFriends(String str, List<ContactModel> list, String str2, InviteFriendsCallback inviteFriendsCallback) {
        if (PatchProxy.isSupport(new Object[]{str, list, str2, inviteFriendsCallback}, this, changeQuickRedirect, false, 46615, new Class[]{String.class, List.class, String.class, InviteFriendsCallback.class}, Void.TYPE)) {
            Object[] objArr = {str, list, str2, inviteFriendsCallback};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 46615, new Class[]{String.class, List.class, String.class, InviteFriendsCallback.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
            try {
                InviteContactFriendsModel$$Lambda$5 inviteContactFriendsModel$$Lambda$5 = new InviteContactFriendsModel$$Lambda$5(this, list, str, str2, inviteFriendsCallback);
                i.a((Callable<TResult>) inviteContactFriendsModel$$Lambda$5);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object lambda$inviteFriends$6$InviteContactFriendsModel(java.util.List r6, java.lang.String r7, java.lang.String r8, com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback r9) throws java.lang.Exception {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            boolean r3 = com.ss.android.g.a.a()     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x004e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x008b }
            r3.<init>()     // Catch:{ Exception -> 0x008b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x008b }
        L_0x0012:
            boolean r4 = r6.hasNext()     // Catch:{ Exception -> 0x008b }
            if (r4 == 0) goto L_0x0026
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.model.ContactModel r4 = (com.ss.android.ugc.aweme.friends.model.ContactModel) r4     // Catch:{ Exception -> 0x008b }
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = r4.phoneNumber     // Catch:{ Exception -> 0x008b }
            r3.put(r4)     // Catch:{ Exception -> 0x008b }
            goto L_0x0012
        L_0x0026:
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = "J?I7iAd=3j9AM1P="
            java.lang.String r6 = encryptAES(r6, r3)     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.api.FriendApi r3 = com.ss.android.ugc.aweme.friends.api.a.a()     // Catch:{ Exception -> 0x008b }
            com.google.common.util.concurrent.q r6 = r3.inviteBySms(r7, r8, r6)     // Catch:{ Exception -> 0x008b }
            java.lang.Object r6 = r6.get()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.api.c r6 = (com.ss.android.ugc.aweme.friends.api.c) r6     // Catch:{ Exception -> 0x008b }
            if (r6 == 0) goto L_0x004b
            java.lang.String r7 = "success"
            java.lang.String r6 = r6.f48830a     // Catch:{ Exception -> 0x008b }
            boolean r6 = android.text.TextUtils.equals(r7, r6)     // Catch:{ Exception -> 0x008b }
            if (r6 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r6 = r1
            goto L_0x008d
        L_0x004e:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x008b }
            r8.<init>()     // Catch:{ Exception -> 0x008b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x008b }
        L_0x0057:
            boolean r3 = r6.hasNext()     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r6.next()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.model.ContactModel r3 = (com.ss.android.ugc.aweme.friends.model.ContactModel) r3     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0057
            java.lang.String r3 = r3.phoneNumber     // Catch:{ NumberFormatException -> 0x0057 }
            r8.add(r3)     // Catch:{ NumberFormatException -> 0x0057 }
            goto L_0x0057
        L_0x006b:
            com.ss.android.ugc.aweme.friends.api.FriendApi r6 = com.ss.android.ugc.aweme.friends.api.a.a()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = ","
            java.lang.String r8 = android.text.TextUtils.join(r3, r8)     // Catch:{ Exception -> 0x008b }
            com.google.common.util.concurrent.q r6 = r6.inviteBySmsDouyin(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.Object r6 = r6.get()     // Catch:{ Exception -> 0x008b }
            com.ss.android.ugc.aweme.friends.api.c r6 = (com.ss.android.ugc.aweme.friends.api.c) r6     // Catch:{ Exception -> 0x008b }
            if (r6 == 0) goto L_0x0086
            int r7 = r6.f48831b     // Catch:{ Exception -> 0x008b }
            if (r7 != 0) goto L_0x0086
            goto L_0x004c
        L_0x0086:
            if (r6 == 0) goto L_0x008b
            java.lang.String r6 = r6.f48830a     // Catch:{ Exception -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r6 = r1
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r9 != 0) goto L_0x0090
            return r1
        L_0x0090:
            com.bytedance.common.utility.collection.WeakHandler r7 = r5.mHandler
            com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$8 r8 = new com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$8
            r8.<init>(r0, r9, r6)
            r7.post(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.lambda$inviteFriends$6$InviteContactFriendsModel(java.util.List, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InviteFriendsCallback):java.lang.Object");
    }
}
