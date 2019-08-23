package com.ss.android.ugc.aweme;

import a.i;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.account.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.f;
import com.ss.android.ugc.aweme.ae;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.main.h.e;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.a;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.user.d;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

@Keep
public class AccountUserService implements IAccountUserService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean mHastInitialized;

    static final /* synthetic */ String lambda$refreshPassportUserInfo$1$AccountUserService(Throwable th) throws Exception {
        return "";
    }

    public String getAvatarUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19337, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19337, new Class[0], String.class);
        }
        d dVar = d.f75329c;
        a d2 = dVar.d(dVar.f());
        if (d2 != null) {
            return d2.f75293f;
        }
        return "";
    }

    public User getCurUser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19328, new Class[0], User.class)) {
            return c.a().b();
        }
        return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19328, new Class[0], User.class);
    }

    public String getCurUserId() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19335, new Class[0], String.class)) {
            return c.a().e();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19335, new Class[0], String.class);
    }

    public String getNickName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19338, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19338, new Class[0], String.class);
        }
        d dVar = d.f75329c;
        a d2 = dVar.d(dVar.f());
        if (d2 != null) {
            return d2.f75292e;
        }
        return "";
    }

    public String getSessionKey() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19336, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19336, new Class[0], String.class);
        }
        d dVar = d.f75329c;
        d.a c2 = dVar.c(dVar.f());
        if (c2 != null) {
            return c2.f75336c;
        }
        return "";
    }

    public boolean hasUpdated() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19368, new Class[0], Boolean.TYPE)) {
            return c.a().f75319b;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19368, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19327, new Class[0], Void.TYPE);
            return;
        }
        if (!this.mHastInitialized) {
            this.mHastInitialized = true;
            ae.f33201b = new aa();
            addUserChangeListener(b.f34454f);
        }
    }

    public boolean isLogin() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19329, new Class[0], Boolean.TYPE)) {
            return c.a().c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19329, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isNewUser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19388, new Class[0], Boolean.TYPE)) {
            return ae.f33201b.f31573b;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19388, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void setUserBanned() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19382, new Class[0], Void.TYPE);
            return;
        }
        init();
        c.a().f();
    }

    static final /* synthetic */ String lambda$refreshPassportUserInfo$0$AccountUserService() throws Exception {
        com.bytedance.sdk.account.c cVar;
        if (PatchProxy.isSupport(new Object[0], null, ae.f33200a, true, 19513, new Class[0], com.bytedance.sdk.account.c.class)) {
            cVar = (com.bytedance.sdk.account.c) PatchProxy.accessDispatch(new Object[0], null, ae.f33200a, true, 19513, new Class[0], com.bytedance.sdk.account.c.class);
        } else {
            aa aaVar = ae.f33201b;
            if (PatchProxy.isSupport(new Object[0], aaVar, aa.f31572a, false, 19501, new Class[0], com.bytedance.sdk.account.c.class)) {
                cVar = (com.bytedance.sdk.account.c) PatchProxy.accessDispatch(new Object[0], aaVar, aa.f31572a, false, 19501, new Class[0], com.bytedance.sdk.account.c.class);
            } else {
                cVar = b.f34451c.c();
            }
        }
        return cVar.a(Integer.MAX_VALUE, f.f32225b);
    }

    public void accountUserClear() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19415, new Class[0], Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, ae.f33200a, true, 19516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, ae.f33200a, true, 19516, new Class[0], Void.TYPE);
        } else {
            aa aaVar = ae.f33201b;
            if (PatchProxy.isSupport(new Object[0], aaVar, aa.f31572a, false, 19505, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aaVar, aa.f31572a, false, 19505, new Class[0], Void.TYPE);
                return;
            }
            i.a(ad.f33194b);
        }
    }

    @NonNull
    public List<String> allUidList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19340, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19340, new Class[0], List.class);
        }
        c a2 = c.a();
        if (!PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87505, new Class[0], List.class)) {
            return d.f75329c.h();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87505, new Class[0], List.class);
    }

    public boolean getAuthGoods() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19380, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19380, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (((c.a().b().getAuthorityStatus() >> 1) & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public String getLastUid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19366, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19366, new Class[0], String.class);
        }
        c a2 = c.a();
        if (!PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87575, new Class[0], String.class)) {
            return d.f75329c.g();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87575, new Class[0], String.class);
    }

    public int getVerifyStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19381, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19381, new Class[0], Integer.TYPE)).intValue();
        }
        c a2 = c.a();
        if (!PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87556, new Class[0], Integer.TYPE)) {
            return a2.b().verifyStatus;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87556, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean hasCommerceVideoRights() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19386, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19386, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c a2 = c.a();
        if (!PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87558, new Class[0], Boolean.TYPE)) {
            return a2.b().isWithItemCommerceEntry();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87558, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isOnCommerceWhiteList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19385, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19385, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c a2 = c.a();
        if (!PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87557, new Class[0], Boolean.TYPE)) {
            return a2.b().isWithCommerceEntry();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87557, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void queryUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19402, new Class[0], Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87543, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a((Handler) a2.f75322e, "https://aweme.snssdk.com/aweme/v1/user/", false, (int) SearchJediMixFeedAdapter.f42516e);
    }

    @SuppressLint({"CheckResult"})
    public void refreshPassportUserInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19342, new Class[0], Void.TYPE);
            return;
        }
        if (isLogin()) {
            init();
            Flowable.fromCallable(d.f41032b).onErrorReturn(e.f43501b).subscribeOn(Schedulers.io()).subscribe(f.f43883b);
        }
    }

    public boolean shouldRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19367, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19367, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87527, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87527, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!a2.f75319b || ((a2.f75321d >= 0 && System.currentTimeMillis() - a2.f75321d >= 180000) || a2.f75320c)) {
            return true;
        } else {
            return false;
        }
    }

    public void updateFbExpireTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19393, new Class[0], Void.TYPE);
            return;
        }
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87563, new Class[0], Void.TYPE);
            return;
        }
        a2.b().setFbExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        d.f75329c.i();
    }

    public void updateTwExpireTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19394, new Class[0], Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87564, new Class[0], Void.TYPE);
            return;
        }
        a2.b().setTwExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        d.f75329c.i();
    }

    public void updateYoutubeExpireTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19395, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19395, new Class[0], Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87565, new Class[0], Void.TYPE);
            return;
        }
        a2.b().setYoutubeExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        d.f75329c.i();
    }

    public void checkIn() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19410, new Class[0], Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87550, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87550, new Class[0], Void.TYPE);
            return;
        }
        WeakHandler weakHandler = a2.f75322e;
        if (PatchProxy.isSupport(new Object[]{weakHandler, "https://aweme.snssdk.com/aweme/v1/check/in/", 113}, null, com.ss.android.ugc.aweme.user.b.a.f75298a, true, 87645, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{weakHandler, "https://aweme.snssdk.com/aweme/v1/check/in/", 113}, null, com.ss.android.ugc.aweme.user.b.a.f75298a, true, 87645, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(weakHandler, new Callable("https://aweme.snssdk.com/aweme/v1/check/in/") {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75312a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f75313b;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f75312a, false, 87651, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f75312a, false, 87651, new Class[0], Object.class);
                }
                ((e) ae.a(e.class)).b(this.f75313b);
                return null;
            }

            {
                this.f75313b = r1;
            }
        }, 113);
    }

    public boolean isOldUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19334, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19334, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87503, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87503, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User b2 = a2.b();
        if (PatchProxy.isSupport(new Object[]{b2}, null, com.ss.android.ugc.aweme.user.util.a.f75402a, true, 87747, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{b2}, null, com.ss.android.ugc.aweme.user.util.a.f75402a, true, 87747, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (b2 == null || b2.getCreateTime() < 1506787200) {
            return true;
        } else {
            return false;
        }
    }

    static final /* synthetic */ void lambda$refreshPassportUserInfo$2$AccountUserService(String str) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            new b.a();
            ae.a(b.a.b(jSONObject), "refresh passport user info");
        }
    }

    public a findSignificanUserInfo(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19341, new Class[]{String.class}, a.class)) {
            return d.f75329c.d(str2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19341, new Class[]{String.class}, a.class);
    }

    public void setUserLogicDelete(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19383, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19383, new Class[]{String.class}, Void.TYPE);
            return;
        }
        init();
        c.a().a(str2);
    }

    public void updateCurUser(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 19343, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 19343, new Class[]{User.class}, Void.TYPE);
            return;
        }
        init();
        c.a().a(user2);
    }

    public void updateUserInfo(@Nullable com.bytedance.sdk.account.k.b bVar) {
        com.bytedance.sdk.account.k.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 19414, new Class[]{com.bytedance.sdk.account.k.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 19414, new Class[]{com.bytedance.sdk.account.k.b.class}, Void.TYPE);
            return;
        }
        init();
        ae.a(bVar2, "service update user info");
    }

    public void addUserChangeListener(@NonNull IAccountUserService.a aVar) {
        IAccountUserService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 19325, new Class[]{IAccountUserService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 19325, new Class[]{IAccountUserService.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, ae.f33200a, true, 19510, new Class[]{IAccountUserService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, ae.f33200a, true, 19510, new Class[]{IAccountUserService.a.class}, Void.TYPE);
            return;
        }
        synchronized (ae.class) {
            if (!ae.f33202c.contains(aVar2)) {
                ae.f33202c.add(aVar2);
            }
        }
    }

    public boolean isNullUid(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19339, new Class[]{String.class}, Boolean.TYPE)) {
            return d.f75329c.f(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19339, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public void queryUserSync(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 19384, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 19384, new Class[]{User.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{user2}, a2, c.f75317a, false, 87570, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, a2, c.f75317a, false, 87570, new Class[]{User.class}, Void.TYPE);
            return;
        }
        a2.a(user2);
        ae.a(10, null, user2, null);
    }

    public void removeUserChangeListener(@NonNull IAccountUserService.a aVar) {
        IAccountUserService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 19326, new Class[]{IAccountUserService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 19326, new Class[]{IAccountUserService.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, ae.f33200a, true, 19511, new Class[]{IAccountUserService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, ae.f33200a, true, 19511, new Class[]{IAccountUserService.a.class}, Void.TYPE);
            return;
        }
        synchronized (ae.class) {
            ae.f33202c.remove(aVar2);
        }
    }

    public void updateCurCover(List<UrlModel> list) {
        List<UrlModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 19351, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 19351, new Class[]{List.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{list2}, a2, c.f75317a, false, 87514, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, a2, c.f75317a, false, 87514, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a2.b().setCoverUrls(list2);
        d.f75329c.i();
    }

    public void updateInsId(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19379, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19379, new Class[]{String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, c.f75317a, false, 87569, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, a2, c.f75317a, false, 87569, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a2.b().setInsId(str2);
        d.f75329c.i();
    }

    public void updateLeaveTime(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 19363, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 19363, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (a2.f75321d != -1) {
            j2 = a2.f75321d;
        }
        a2.f75321d = j2;
    }

    public void clear(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19413, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19413, new Class[]{String.class}, Void.TYPE);
            return;
        }
        init();
        com.ss.android.ugc.aweme.account.terminal.a.b(com.ss.android.ugc.aweme.account.terminal.a.a() + "|clear:" + str2);
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[0], a2, c.f75317a, false, 87554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, c.f75317a, false, 87554, new Class[0], Void.TYPE);
            return;
        }
        a2.f75319b = false;
        a2.b(d.f75329c.f());
        a2.f75320c = false;
        a2.f75321d = -1;
    }

    public FollowerDetail getCurUserFollowDetail(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19364, new Class[]{String.class}, FollowerDetail.class)) {
            return (FollowerDetail) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19364, new Class[]{String.class}, FollowerDetail.class);
        }
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, c.f75317a, false, 87572, new Class[]{String.class}, FollowerDetail.class)) {
            return (FollowerDetail) PatchProxy.accessDispatch(new Object[]{str2}, a2, c.f75317a, false, 87572, new Class[]{String.class}, FollowerDetail.class);
        }
        if (a2.b().getFollowerDetailList() != null) {
            for (FollowerDetail next : a2.b().getFollowerDetailList()) {
                if (TextUtils.equals(next.getPackageName(), str2)) {
                    return next;
                }
            }
        }
        return null;
    }

    public boolean isUserEmpty(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, changeQuickRedirect, false, 19330, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, changeQuickRedirect, false, 19330, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        }
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{user}, a2, c.f75317a, false, 87498, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, a2, c.f75317a, false, 87498, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{user}, null, com.ss.android.ugc.aweme.user.util.a.f75402a, true, 87746, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, com.ss.android.ugc.aweme.user.util.a.f75402a, true, 87746, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || user.getUid() == null || user.getAvatarLarger() == null || user.getAvatarMedium() == null || user.getAvatarThumb() == null || user.getShortId() == null || user.getBirthday() == null || user.getNickname() == null || user.getSignature() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void setCurUser(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 19333, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 19333, new Class[]{User.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{user2}, a2, c.f75317a, false, 87502, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, a2, c.f75317a, false, 87502, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(user.getUid())) {
            d.f75329c.a(user2);
            a2.f75319b = true;
            a2.f75320c = false;
            a2.f75321d = -1;
            if (user2 != null) {
                d.f75329c.b(user.getUid());
            }
            a2.d();
        }
    }

    public void setWithCommerceNewbieTask(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19365, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19365, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87559, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87559, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setWithCommerceNewbieTask(z);
        d.f75329c.i();
    }

    public void updateCurAllowStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19356, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19356, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87520, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87520, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setAllowStatus(i);
        d.f75329c.i();
    }

    public void updateCurAwemeCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19354, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19354, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87518, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87518, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int awemeCount = a2.b().getAwemeCount() + i;
        if (awemeCount < 0) {
            awemeCount = 0;
        }
        a2.b().setAwemeCount(awemeCount);
        d.f75329c.i();
    }

    public void updateCurCanChangeSchoolInfo(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19361, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19361, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87525, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87525, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setCanModifySchoolInfo(z);
        a2.f75319b = true;
        d.f75329c.i();
    }

    public void updateCurDongtaiCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19355, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19355, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87519, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87519, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int dongtaiCount = a2.b().getDongtaiCount() + i;
        if (dongtaiCount < 0) {
            dongtaiCount = 0;
        }
        a2.b().setDongtaiCount(dongtaiCount);
        d.f75329c.i();
    }

    public void updateCurFavoritingCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19359, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19359, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87523, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87523, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setFavoritingCount(a2.b().getFavoritingCount() + i);
        d.f75329c.i();
    }

    public void updateCurFollowerCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19353, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19353, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87516, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87516, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setFollowerCount(a2.b().getFollowerCount() + i);
        d.f75329c.i();
    }

    public void updateCurFollowingCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19352, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19352, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87515, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87515, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int followingCount = a2.b().getFollowingCount() + i;
        if (followingCount < 0) {
            followingCount = 0;
        }
        a2.b().setFollowingCount(followingCount);
        d.f75329c.i();
    }

    public void updateCurHideFollowingFollowerList(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19358, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19358, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87522, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87522, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setHideFollowingFollowerList(i);
        d.f75329c.i();
    }

    public void updateCurHideSearch(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19357, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19357, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87521, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87521, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setHideSearch(z);
        d.f75329c.i();
    }

    public void updateCurNickname(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19344, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19344, new Class[]{String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, c.f75317a, false, 87507, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, a2, c.f75317a, false, 87507, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(a2.b().getNickname(), str2)) {
            a2.b().setNickname(str2);
            a2.f75319b = true;
            d.f75329c.i();
            ae.a(6, null, a2.b(), null);
        }
    }

    public void updateCurSecret(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19347, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19347, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87510, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87510, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (a2.b().isSecret() != z2) {
            a2.b().setSecret(z2);
            a2.f75319b = true;
            d.f75329c.i();
        }
    }

    public void updateCurSignature(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19349, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19349, new Class[]{String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, c.f75317a, false, 87512, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, a2, c.f75317a, false, 87512, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(a2.b().getSignature(), str2)) {
            a2.b().setSignature(str2);
            a2.f75319b = true;
            d.f75329c.i();
        }
    }

    public void updateCurUserId(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19346, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19346, new Class[]{String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, c.f75317a, false, 87509, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, a2, c.f75317a, false, 87509, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(a2.b().getUniqueId(), str2)) {
            a2.b().setUniqueId(str2);
            a2.f75319b = true;
            d.f75329c.i();
        }
    }

    public void updateHasFacebookToken(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19387, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19387, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87560, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87560, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setHasFacebookToken(z);
        d.f75329c.i();
    }

    public void updateHasTwitterToken(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19389, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19389, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87561, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87561, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setHasTwitterToken(z);
        d.f75329c.i();
    }

    public void updateHasYoutubeToken(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19390, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19390, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87562, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87562, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setHasYoutubeToken(z);
        d.f75329c.i();
    }

    public void updateMinor(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19405, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19405, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87517, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87517, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setMinor(z);
        d.f75329c.i();
    }

    public void updateNotifyPrivateAccount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19362, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19362, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87526, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87526, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setNotifyPrivateAccount(i);
        d.f75329c.i();
    }

    public void updateShieldCommentNotice(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19398, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19398, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87568, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87568, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setShieldCommentNotice(i);
        d.f75329c.i();
    }

    public void updateShieldDiggNotice(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19396, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19396, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87566, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87566, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setShieldDiggNotice(i);
        d.f75329c.i();
    }

    public void updateShieldFollowNotice(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19397, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19397, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, c.f75317a, false, 87567, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87567, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setShieldFollowNotice(i);
        d.f75329c.i();
    }

    public void updateWeiboBindStatus(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19332, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19332, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, c.f75317a, false, 87501, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87501, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setBindedWeibo(z);
        d.f75329c.i();
    }

    public void updateWeiboName(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19331, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19331, new Class[]{String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, c.f75317a, false, 87500, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, a2, c.f75317a, false, 87500, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(a2.b().getWeiboNickname(), str2)) {
            a2.b().setWeiboNickname(str2);
            a2.f75319b = true;
            d.f75329c.i();
        }
    }

    public void queryUser(Handler handler) {
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2}, this, changeQuickRedirect, false, 19403, new Class[]{Handler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2}, this, changeQuickRedirect, false, 19403, new Class[]{Handler.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2}, a2, c.f75317a, false, 87544, new Class[]{Handler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2}, a2, c.f75317a, false, 87544, new Class[]{Handler.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "https://aweme.snssdk.com/aweme/v1/user/", false, (int) SearchJediMixFeedAdapter.f42516e);
    }

    public void delete(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 19412, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 19412, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        init();
        com.ss.android.ugc.aweme.account.terminal.a.b(com.ss.android.ugc.aweme.account.terminal.a.a() + "|delete:" + str4);
        c.a().b(str3);
    }

    public User queryUser(String str, boolean z) throws Exception {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19404, new Class[]{String.class, Boolean.TYPE}, User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, changeQuickRedirect, false, 19404, new Class[]{String.class, Boolean.TYPE}, User.class);
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z)}, a2, c.f75317a, false, 87545, new Class[]{String.class, Boolean.TYPE}, User.class)) {
            Object[] objArr = {str, Byte.valueOf(z)};
            return (User) PatchProxy.accessDispatch(objArr, a2, c.f75317a, false, 87545, new Class[]{String.class, Boolean.TYPE}, User.class);
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "https://aweme.snssdk.com/aweme/v1/user/";
        } else {
            str2 = str;
        }
        return com.ss.android.ugc.aweme.user.b.a(str2, z);
    }

    public void syncWeiboBindStatus(Handler handler, boolean z) {
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19391, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 19391, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, Byte.valueOf(z)}, a2, c.f75317a, false, 87538, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87538, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "is_binded_weibo", String.valueOf(z ? 1 : 0), 119);
    }

    public void updateAllowStatus(Handler handler, int i) {
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19392, new Class[]{Handler.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19392, new Class[]{Handler.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, Integer.valueOf(i)}, a2, c.f75317a, false, 87539, new Class[]{Handler.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87539, new Class[]{Handler.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "allow_status", String.valueOf(i), 5);
    }

    public void updateAvatarUri(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19376, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19376, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, a2, c.f75317a, false, 87535, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            Object[] objArr = {handler2, str2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87535, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "avatar_uri", str2, 4);
    }

    public void updateCurBirthday(String str, @User.BirthdayHideLevel int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19345, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19345, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, a2, c.f75317a, false, 87508, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect2;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, 87508, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(a2.b().getBirthday(), str2) || i2 != a2.b().getBirthdayHideLevel()) {
            a2.b().setBirthday(str2);
            a2.b().setBirthdayHideLevel(i2);
            a2.f75319b = true;
            d.f75329c.i();
        }
    }

    public void updateCurGender(int i, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 19348, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 19348, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, a2, c.f75317a, false, 87511, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87511, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (a2.b().getGender() != i3) {
            a2.b().setGender(i3);
            a2.b().setShowGenderStrategy(i);
            a2.f75319b = true;
            d.f75329c.i();
        }
    }

    public void updateGender(Handler handler, Map<String, String> map) {
        Handler handler2 = handler;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19372, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19372, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, a2, c.f75317a, false, 87531, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            Object[] objArr = {handler2, map2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87531, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, map2, 1);
    }

    public void updateId(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19374, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19374, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, a2, c.f75317a, false, 87533, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            Object[] objArr = {handler2, str2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87533, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "unique_id", str2, 116);
    }

    public void updateInsId(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19378, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19378, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, a2, c.f75317a, false, 87537, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            Object[] objArr = {handler2, str2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87537, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "ins_id", str2, 6);
    }

    public void updateLanguage(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19373, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19373, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, a2, c.f75317a, false, 87532, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            Object[] objArr = {handler2, str2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87532, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "language_change", str2, 124);
    }

    public void updateLocation(Handler handler, Map<String, String> map) {
        Handler handler2 = handler;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19399, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19399, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, a2, c.f75317a, false, 87540, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            Object[] objArr = {handler2, map2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87540, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, map2, 7);
    }

    public void updateNickName(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19370, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19370, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, a2, c.f75317a, false, 87529, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            Object[] objArr = {handler2, str2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87529, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "nickname", str2, 0);
    }

    public void updateSchool(Handler handler, Map<String, String> map) {
        Handler handler2 = handler;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19400, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19400, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, a2, c.f75317a, false, 87541, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            Object[] objArr = {handler2, map2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87541, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, map2, 8);
    }

    public void updateSecret(Handler handler, boolean z) {
        String str;
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19375, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 19375, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, Byte.valueOf(z)}, a2, c.f75317a, false, 87534, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87534, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "secret", str, 122);
    }

    public void updateSignature(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19371, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, changeQuickRedirect, false, 19371, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, a2, c.f75317a, false, 87530, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            Object[] objArr = {handler2, str2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87530, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, "signature", str2, 2);
    }

    public void updateUserInfo(Handler handler, Map<String, String> map) {
        Handler handler2 = handler;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19401, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, map2}, this, changeQuickRedirect, false, 19401, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, map2}, a2, c.f75317a, false, 87542, new Class[]{Handler.class, Map.class}, Void.TYPE)) {
            Object[] objArr = {handler2, map2};
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, 87542, new Class[]{Handler.class, Map.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, map2, SearchJediMixFeedAdapter.f42516e);
    }

    public void registerNotice(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19411, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19411, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, a2, c.f75317a, false, 87551, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            c cVar = a2;
            PatchProxy.accessDispatch(objArr2, cVar, c.f75317a, false, 87551, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        WeakHandler weakHandler = a2.f75322e;
        if (PatchProxy.isSupport(new Object[]{weakHandler, str2, Integer.valueOf(i), 114}, null, com.ss.android.ugc.aweme.user.b.a.f75298a, true, 87646, new Class[]{Handler.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{weakHandler, str2, Integer.valueOf(i), 114}, null, com.ss.android.ugc.aweme.user.b.a.f75298a, true, 87646, new Class[]{Handler.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(weakHandler, new Callable(str2, i) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75314a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f75315b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f75316c;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f75314a, false, 87652, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f75314a, false, 87652, new Class[0], Object.class);
                }
                ((e) ae.a(e.class)).a(this.f75315b, this.f75316c);
                return null;
            }

            {
                this.f75315b = r1;
                this.f75316c = r2;
            }
        }, 114);
    }

    public void updateBirthday(Handler handler, String str, @User.BirthdayHideLevel int i) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19369, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19369, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2, Integer.valueOf(i)}, a2, c.f75317a, false, 87528, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect2;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, 87528, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("birthday", str2);
        hashMap.put("birthday_hide_level", String.valueOf(i));
        com.ss.android.ugc.aweme.user.b.a.a(handler2, hashMap, 3);
    }

    public void updateCoverUri(Handler handler, String str, int i) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19377, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19377, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str2, Integer.valueOf(i)}, a2, c.f75317a, false, 87536, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = c.f75317a;
            Object[] objArr2 = objArr;
            c cVar = a2;
            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect2;
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, 87536, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("cover_uri", str2);
        hashMap.put("cover_source", String.valueOf(i));
        com.ss.android.ugc.aweme.user.b.a.a(handler2, hashMap, 10);
    }

    public void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        UrlModel urlModel4 = urlModel;
        UrlModel urlModel5 = urlModel2;
        UrlModel urlModel6 = urlModel3;
        if (PatchProxy.isSupport(new Object[]{urlModel4, urlModel5, urlModel6}, this, changeQuickRedirect, false, 19350, new Class[]{UrlModel.class, UrlModel.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel4, urlModel5, urlModel6}, this, changeQuickRedirect, false, 19350, new Class[]{UrlModel.class, UrlModel.class, UrlModel.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{urlModel4, urlModel5, urlModel6}, a2, c.f75317a, false, 87513, new Class[]{UrlModel.class, UrlModel.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel4, urlModel5, urlModel6}, a2, c.f75317a, false, 87513, new Class[]{UrlModel.class, UrlModel.class, UrlModel.class}, Void.TYPE);
            return;
        }
        User b2 = a2.b();
        if (b2.getAvatarThumb() == null || b2.getAvatarMedium() == null || b2.getAvatarLarger() == null || (urlModel4 != null && !TextUtils.equals(b2.getAvatarThumb().getUri(), urlModel.getUri()) && urlModel5 != null && !TextUtils.equals(b2.getAvatarMedium().getUri(), urlModel2.getUri()) && urlModel6 != null && !TextUtils.equals(b2.getAvatarLarger().getUri(), urlModel3.getUri()))) {
            b2.setAvatarThumb(urlModel4);
            b2.setAvatarMedium(urlModel5);
            b2.setAvatarLarger(urlModel6);
            d.f75329c.i();
            ae.a(7, null, b2, null);
        }
    }

    public void uploadCover(Handler handler, String str, int i, String str2) {
        Handler handler2 = handler;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{handler2, str3, Integer.valueOf(i), str4}, this, changeQuickRedirect, false, 19409, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, Integer.valueOf(i), str4}, this, changeQuickRedirect, false, 19409, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str3, Integer.valueOf(i), str4}, a2, c.f75317a, false, 87549, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, Integer.valueOf(i), str4}, a2, c.f75317a, false, 87549, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, str3, i, str4, 126);
    }

    public void uploadVideoAvatar(Handler handler, String str, int i, String str2) {
        Handler handler2 = handler;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{handler2, str3, Integer.valueOf(i), str4}, this, changeQuickRedirect, false, 19407, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, Integer.valueOf(i), str4}, this, changeQuickRedirect, false, 19407, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{handler2, str3, Integer.valueOf(i), str4}, a2, c.f75317a, false, 87547, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, Integer.valueOf(i), str4}, a2, c.f75317a, false, 87547, new Class[]{Handler.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler2, str3, i, str4, 121);
    }

    public void uploadAvatar(Handler handler, String str, int i, String str2, List<com.ss.android.http.a.b.e> list) {
        if (PatchProxy.isSupport(new Object[]{handler, str, Integer.valueOf(i), str2, list}, this, changeQuickRedirect, false, 19406, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, List.class}, Void.TYPE)) {
            Object[] objArr = {handler, str, Integer.valueOf(i), str2, list};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 19406, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, List.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        Object[] objArr3 = {handler, str, Integer.valueOf(i), str2, list};
        if (PatchProxy.isSupport(objArr3, a2, c.f75317a, false, 87546, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler, str, Integer.valueOf(i), str2, list}, a2, c.f75317a, false, 87546, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, List.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler, str, i, str2, list, 111);
    }

    public void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 19360, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str4, str5, str6, Integer.valueOf(i), Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 19360, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        Object[] objArr3 = {str4, str5, str6, Integer.valueOf(i), Integer.valueOf(i2)};
        if (PatchProxy.isSupport(objArr3, a2, c.f75317a, false, 87524, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6, Integer.valueOf(i), Integer.valueOf(i2)}, a2, c.f75317a, false, 87524, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.b().setSchoolName(str4);
        a2.b().setCollegeName(str5);
        a2.b().setEnrollYear(str6);
        a2.b().setEducation(i);
        a2.b().setSchoolInfoShowRange(i2);
        a2.f75319b = true;
        d.f75329c.i();
    }

    public void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3) {
        String str4 = str3;
        if (PatchProxy.isSupport(new Object[]{handler, str, Integer.valueOf(i), str2, str4}, this, changeQuickRedirect, false, 19408, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {handler, str, Integer.valueOf(i), str2, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 19408, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        init();
        c a2 = c.a();
        Object[] objArr3 = {handler, str, Integer.valueOf(i), str2, str4};
        if (PatchProxy.isSupport(objArr3, a2, c.f75317a, false, 87548, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler, str, Integer.valueOf(i), str2, str4}, a2, c.f75317a, false, 87548, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.ss.android.http.a.b.e("source", str4));
        com.ss.android.ugc.aweme.user.b.a.a(handler, str, i, str2, arrayList, 125);
    }
}
