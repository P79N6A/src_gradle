package com.ss.android.ugc.aweme;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.bytedance.sdk.account.k.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedList;
import java.util.List;

public class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33200a;

    /* renamed from: b  reason: collision with root package name */
    static aa f33201b;

    /* renamed from: c  reason: collision with root package name */
    static List<IAccountUserService.a> f33202c = new LinkedList();

    public static Application a() {
        return b.f34450b;
    }

    public static <T> T a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, null, f33200a, true, 19509, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls}, null, f33200a, true, 19509, new Class[]{Class.class}, Object.class);
        }
        aa aaVar = f33201b;
        if (!PatchProxy.isSupport(new Object[]{cls}, aaVar, aa.f31572a, false, 19502, new Class[]{Class.class}, Object.class)) {
            return b.a(cls);
        }
        return PatchProxy.accessDispatch(new Object[]{cls}, aaVar, aa.f31572a, false, 19502, new Class[]{Class.class}, Object.class);
    }

    public static void a(@Nullable b bVar, String str) {
        b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bVar2, str2}, null, f33200a, true, 19514, new Class[]{b.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, str2}, null, f33200a, true, 19514, new Class[]{b.class, String.class}, Void.TYPE);
            return;
        }
        f33201b.a(bVar2, str2);
    }

    public static void a(@IAccountUserService.UserChangeType int i, @Nullable User user, @Nullable User user2, @Nullable Bundle bundle) {
        User user3 = user;
        User user4 = user2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user3, user4, bundle2}, null, f33200a, true, 19512, new Class[]{Integer.TYPE, User.class, User.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user3, user4, bundle2}, null, f33200a, true, 19512, new Class[]{Integer.TYPE, User.class, User.class, Bundle.class}, Void.TYPE);
            return;
        }
        LinkedList<IAccountUserService.a> linkedList = new LinkedList<>();
        synchronized (ae.class) {
            linkedList.addAll(f33202c);
        }
        for (IAccountUserService.a a2 : linkedList) {
            a2.a(i, user3, user4, bundle2);
        }
    }
}
