package com.ss.android.ugc.aweme.im.sdk.d;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.im.sdk.relations.a.b;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationResponse;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.y;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@WorkerThread
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51207a;

    /* renamed from: b  reason: collision with root package name */
    public a f51208b;

    /* renamed from: c  reason: collision with root package name */
    private int f51209c;

    /* renamed from: d  reason: collision with root package name */
    private long f51210d;

    /* renamed from: e  reason: collision with root package name */
    private long f51211e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f51212f;
    private int g;

    public interface a {
    }

    private c() {
        this.f51209c = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    }

    @Nullable
    public static Runnable a() {
        if (PatchProxy.isSupport(new Object[0], null, f51207a, true, 51711, new Class[0], Runnable.class)) {
            return (Runnable) PatchProxy.accessDispatch(new Object[0], null, f51207a, true, 51711, new Class[0], Runnable.class);
        }
        return a(false);
    }

    @Nullable
    private RelationResponse b() {
        if (PatchProxy.isSupport(new Object[0], this, f51207a, false, 51709, new Class[0], RelationResponse.class)) {
            return (RelationResponse) PatchProxy.accessDispatch(new Object[0], this, f51207a, false, 51709, new Class[0], RelationResponse.class);
        }
        RelationResponse relationResponse = null;
        try {
            relationResponse = (RelationResponse) r.a().getSpotlightRelation(this.f51209c, 1, this.f51211e, this.f51210d).get();
        } catch (InterruptedException | NullPointerException | ExecutionException unused) {
        }
        if (relationResponse == null) {
            RelationResponse relationResponse2 = new RelationResponse();
            relationResponse2.setHasMore(0);
            return relationResponse2;
        }
        this.f51211e = relationResponse.getMinTime();
        return relationResponse;
    }

    public final void run() {
        char c2;
        int i;
        IMUser iMUser;
        boolean z;
        char c3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f51207a, false, 51708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51207a, false, 51708, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51212f) {
            synchronized (com.ss.android.ugc.aweme.im.sdk.h.c.a.class) {
                com.ss.android.ugc.aweme.im.sdk.h.c.a.a().f();
            }
        }
        ArrayList arrayList = new ArrayList();
        this.f51211e = System.currentTimeMillis();
        RelationResponse b2 = b();
        if (b2.getFollowings() != null) {
            arrayList.addAll(b2.getFollowings());
            this.g += b2.getFollowings().size();
        }
        while (true) {
            c2 = 1;
            if (b2.getHasMore() != 1) {
                break;
            }
            b2 = b();
            if (b2.getFollowings() != null) {
                arrayList.addAll(b2.getFollowings());
                this.g += b2.getFollowings().size();
            }
        }
        if (this.f51212f && this.g <= 0) {
            synchronized (com.ss.android.ugc.aweme.im.sdk.h.c.a.class) {
                com.ss.android.ugc.aweme.im.sdk.h.c.a.a().f();
            }
        }
        String currentLocaleLanguage = a.a().e().getCurrentLocaleLanguage();
        String b3 = y.b();
        if (!TextUtils.equals(currentLocaleLanguage, b3)) {
            a.a().e().setCurrentLocaleLanguage(b3);
            b a2 = b.a();
            Locale a3 = y.a();
            if (PatchProxy.isSupport(new Object[]{a3}, a2, b.f52031a, false, 53015, new Class[]{Locale.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a3}, a2, b.f52031a, false, 53015, new Class[]{Locale.class}, Void.TYPE);
            } else if (!TextUtils.equals(a2.f52033b.getLanguage(), a3.getLanguage())) {
                a2.b();
            }
            this.f51212f = true;
        }
        if (this.f51212f) {
            com.ss.android.ugc.aweme.im.sdk.h.c.a.a().a((List<IMUser>) arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            List h = com.ss.android.ugc.aweme.im.sdk.h.c.a.a().h();
            HashMap hashMap = new HashMap(arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                hashMap.put(((IMUser) arrayList.get(i2)).getUid(), Integer.valueOf(i2));
            }
            int i3 = 0;
            while (i3 < h.size()) {
                IMUser iMUser2 = (IMUser) h.get(i3);
                Integer num = (Integer) hashMap.get(iMUser2.getUid());
                if (num != null) {
                    IMUser iMUser3 = (IMUser) arrayList.get(num.intValue());
                    Object[] objArr = new Object[2];
                    objArr[c3] = iMUser2;
                    objArr[c2] = iMUser3;
                    ChangeQuickRedirect changeQuickRedirect = f51207a;
                    Class[] clsArr = new Class[2];
                    clsArr[c3] = IMUser.class;
                    clsArr[c2] = IMUser.class;
                    IMUser iMUser4 = iMUser3;
                    IMUser iMUser5 = iMUser2;
                    i = i3;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 51710, clsArr, Boolean.TYPE)) {
                        IMUser iMUser6 = iMUser4;
                        iMUser = iMUser6;
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser5, iMUser6}, this, f51207a, false, 51710, new Class[]{IMUser.class, IMUser.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        iMUser = iMUser4;
                        if (TextUtils.equals(iMUser5.getDisplayName(), iMUser5.getDisplayName()) && iMUser5.getAvatarThumb() != null && ((iMUser.getAvatarThumb() == null || iMUser5.getAvatarThumb().equals(iMUser.getAvatarThumb())) && !TextUtils.isEmpty(iMUser5.getSortWeight()) && !TextUtils.isEmpty(iMUser5.getInitialLetter()) && !TextUtils.isEmpty(iMUser5.getRemarkPinyin()) && !TextUtils.isEmpty(iMUser5.getRemarkInitial()) && !TextUtils.isEmpty(iMUser5.getNickNamePinyin()) && !TextUtils.isEmpty(iMUser5.getNickNameInitial()))) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        arrayList2.add(iMUser);
                    } else {
                        arrayList3.add(iMUser);
                    }
                    hashMap.remove(iMUser.getUid());
                } else {
                    i = i3;
                    arrayList4.add(iMUser2);
                }
                i3 = i + 1;
                c3 = 0;
                c2 = 1;
            }
            for (Map.Entry value : hashMap.entrySet()) {
                IMUser iMUser7 = (IMUser) arrayList.get(((Integer) value.getValue()).intValue());
                com.ss.android.ugc.aweme.im.sdk.h.c.a.a().b(iMUser7);
                arrayList2.add(iMUser7);
            }
            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                ((IMUser) arrayList4.get(i4)).setFollowStatus(0);
            }
            arrayList3.addAll(arrayList4);
            com.ss.android.ugc.aweme.im.sdk.h.c.a.a().a((List<IMUser>) arrayList2);
            com.ss.android.ugc.aweme.im.sdk.h.c.a.a().b((List<IMUser>) arrayList3);
        }
        o.a().d(System.currentTimeMillis());
        if (this.f51208b != null) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51213a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f51213a, false, 51713, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51213a, false, 51713, new Class[0], Void.TYPE);
                    }
                }
            });
        }
    }

    private c(boolean z) {
        this.f51209c = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        this.f51212f = true;
    }

    @Nullable
    public static Runnable a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f51207a, true, 51712, new Class[]{Boolean.TYPE}, Runnable.class)) {
            return (Runnable) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f51207a, true, 51712, new Class[]{Boolean.TYPE}, Runnable.class);
        } else if (z) {
            o.a().d(0);
            return new c(true);
        } else if (o.a().m()) {
            return new c();
        } else {
            return null;
        }
    }
}
