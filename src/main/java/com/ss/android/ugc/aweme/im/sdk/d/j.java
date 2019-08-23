package com.ss.android.ugc.aweme.im.sdk.d;

import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001c\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/core/SecUidOfIMUserManager;", "", "()V", "mObserver", "Lcom/bytedance/im/core/model/IDBMemberObserver;", "mUidSecIdMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getSecUid", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "uid", "getSecUidByUid", "subscribe", "", "syncSecUidToMain", "unsubscribe", "updateIMUserSecId", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51267a;

    /* renamed from: b  reason: collision with root package name */
    static i f51268b;

    /* renamed from: c  reason: collision with root package name */
    static ConcurrentHashMap<String, String> f51269c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final j f51270d = new j();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/im/core/model/Member;", "kotlin.jvm.PlatformType", "", "onInsertOrUpdate"}, k = 3, mv = {1, 1, 15})
    static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51271a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f51272b = new a();

        a() {
        }

        public final void h(List<m> list) {
            List<m> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f51271a, false, 51786, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f51271a, false, 51786, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
            for (m mVar : list2) {
                Intrinsics.checkExpressionValueIsNotNull(mVar, "member");
                if (mVar.getUid() > 0 && !TextUtils.isEmpty(mVar.getSecUid()) && mVar.getConversationType() != d.a.f20887b) {
                    IMUser b2 = e.a().b(String.valueOf(mVar.getUid()));
                    if (b2 != null) {
                        if (TextUtils.isEmpty(b2.getSecUid())) {
                            b2.setSecUid(mVar.getSecUid());
                            e.a().a(b2);
                        }
                        String uid = b2.getUid();
                        Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
                        String a2 = e.a(Long.parseLong(uid));
                        if (!TextUtils.isEmpty(a2)) {
                            Intrinsics.checkExpressionValueIsNotNull(a2, "sessionId");
                            if (PatchProxy.isSupport(new Object[]{a2}, null, i.f51262a, true, 51774, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{a2}, null, i.f51262a, true, 51774, new Class[]{String.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(a2, "sessionId");
                                List<String> list3 = i.f51264c;
                                if (list3 != null && list3.contains(a2)) {
                                    List<String> list4 = i.f51264c;
                                    if (list4 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    list4.remove(a2);
                                }
                            }
                        }
                    } else {
                        j jVar = j.f51270d;
                        String valueOf = String.valueOf(mVar.getUid());
                        String secUid = mVar.getSecUid();
                        Intrinsics.checkExpressionValueIsNotNull(secUid, "member.secUid");
                        j.f51269c.put(valueOf, secUid);
                    }
                }
            }
        }
    }

    private j() {
    }

    @Nullable
    public final String b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51267a, false, 51783, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f51267a, false, 51783, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str2)) {
            return "";
        } else {
            String str3 = (String) f51269c.get(str2);
            if (TextUtils.isEmpty(str3)) {
                return "";
            }
            return str3;
        }
    }

    public final void c(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51267a, false, 51785, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f51267a, false, 51785, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            String a2 = a(e.a().b(str2), str2);
            a a3 = a.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeImManager.instance()");
            a3.e().putSecUidToMap(str2, a2);
        }
    }

    @Nullable
    public final String a(@Nullable String str) {
        String str2;
        String str3 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f51267a, false, 51782, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f51267a, false, 51782, new Class[]{String.class}, String.class);
        }
        String b2 = b(str);
        CharSequence charSequence = b2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            IMUser b3 = e.a().b(str3);
            if (b3 != null) {
                str2 = b3.getSecUid();
            } else {
                str2 = null;
            }
            b2 = str2;
        }
        return b2;
    }

    @Nullable
    public final String b(@Nullable IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, f51267a, false, 51781, new Class[]{IMUser.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iMUser}, this, f51267a, false, 51781, new Class[]{IMUser.class}, String.class);
        } else if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return "";
        } else if (TextUtils.isEmpty(iMUser.getSecUid())) {
            IMUser b2 = e.a().b(iMUser.getUid());
            if (b2 != null && !TextUtils.isEmpty(b2.getSecUid())) {
                return b2.getSecUid();
            }
            return b(iMUser.getUid());
        } else {
            return iMUser.getSecUid();
        }
    }

    public final void a(@Nullable IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, f51267a, false, 51780, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser}, this, f51267a, false, 51780, new Class[]{IMUser.class}, Void.TYPE);
        } else if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid()) && !TextUtils.isEmpty(iMUser.getSecUid())) {
            if (!TextUtils.isEmpty(iMUser.getSecUid())) {
                String uid = iMUser.getUid();
                Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
                String secUid = iMUser.getSecUid();
                Intrinsics.checkExpressionValueIsNotNull(secUid, "user.secUid");
                f51269c.put(uid, secUid);
            }
            IMUser b2 = e.a().b(iMUser.getUid());
            if (b2 != null && TextUtils.isEmpty(b2.getSecUid())) {
                b2.setSecUid(iMUser.getSecUid());
                e.a().a(b2);
            }
        }
    }

    @Nullable
    public final String a(@Nullable IMUser iMUser, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{iMUser, str2}, this, f51267a, false, 51784, new Class[]{IMUser.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iMUser, str2}, this, f51267a, false, 51784, new Class[]{IMUser.class, String.class}, String.class);
        } else if (iMUser == null) {
            return b(str2);
        } else {
            return b(iMUser);
        }
    }
}
