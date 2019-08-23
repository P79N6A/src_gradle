package com.ss.android.ugc.aweme;

import a.i;
import android.support.annotation.Nullable;
import com.bytedance.sdk.account.k.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.e.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.a;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.user.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.json.JSONObject;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31572a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31573b;

    public aa() {
        if (c.a().c()) {
            i.a(ab.f31577b, (Executor) a.a());
        } else {
            com.ss.android.ugc.aweme.account.terminal.a.b("not login");
        }
    }

    static final /* synthetic */ Object a() throws Exception {
        Object obj;
        d dVar = d.f75329c;
        if (PatchProxy.isSupport(new Object[0], dVar, d.f75327a, false, 87583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], dVar, d.f75327a, false, 87583, new Class[0], Void.TYPE);
        } else {
            String f2 = dVar.f();
            synchronized (d.a()) {
                Iterator it2 = d.f75329c.d().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual((Object) ((d.c) obj).f75348c, (Object) f2)) {
                        break;
                    }
                }
                d.c cVar = (d.c) obj;
                if (cVar != null) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(User.class);
                    if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                        if (cVar.a().f75341b) {
                            cVar.a().a();
                        } else {
                            cVar.a().a();
                        }
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(d.a.class))) {
                        cVar.b().a();
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(com.ss.android.ugc.aweme.user.a.class))) {
                        cVar.c().a();
                    }
                }
            }
            com.ss.android.ugc.aweme.account.terminal.a.f32778d.b(dVar.f());
        }
        return null;
    }

    public final void a(@Nullable b bVar, String str) {
        com.ss.android.ugc.aweme.user.a aVar;
        Object accessDispatch;
        JSONObject jSONObject;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, str}, this, f31572a, false, 19504, new Class[]{b.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, str}, this, f31572a, false, 19504, new Class[]{b.class, String.class}, Void.TYPE);
            return;
        }
        if (bVar2 != null && bVar2.f22516a != 0) {
            if (PatchProxy.isSupport(new Object[]{bVar2}, null, com.ss.android.ugc.aweme.account.i.a.f31982a, true, 20033, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, null, com.ss.android.ugc.aweme.account.i.a.f31982a, true, 20033, new Class[]{b.class}, Void.TYPE);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "on update user info");
                if (bVar2 != null) {
                    jSONObject = bVar2.f22521f;
                } else {
                    jSONObject = null;
                }
                hashMap.put("rawJson", String.valueOf(String.valueOf(jSONObject)));
                com.ss.android.ugc.aweme.account.i.a aVar2 = com.ss.android.ugc.aweme.account.i.a.f31983b;
                String hashMap2 = hashMap.toString();
                Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
                aVar2.c(hashMap2);
            }
            this.f31573b = bVar2.f22518c;
            com.ss.android.account.b bVar3 = (com.ss.android.account.b) bVar2;
            com.ss.android.sdk.b.b.a().a(bVar3, ae.a());
            d.f75329c.a(String.valueOf(bVar2.f22516a));
            d.f75329c.a(d.a.a(bVar3.f22516a, bVar3.f22519d, bVar3.g, bVar3.D));
            d dVar = d.f75329c;
            if (PatchProxy.isSupport(new Object[]{bVar3}, null, com.ss.android.ugc.aweme.user.a.f75288a, true, 87485, new Class[]{com.ss.android.account.b.class}, com.ss.android.ugc.aweme.user.a.class)) {
                accessDispatch = PatchProxy.accessDispatch(new Object[]{bVar3}, null, com.ss.android.ugc.aweme.user.a.f75288a, true, 87485, new Class[]{com.ss.android.account.b.class}, com.ss.android.ugc.aweme.user.a.class);
            } else {
                a.C0785a aVar3 = com.ss.android.ugc.aweme.user.a.g;
                if (PatchProxy.isSupport(new Object[]{bVar3}, aVar3, a.C0785a.f75294a, false, 87487, new Class[]{com.ss.android.account.b.class}, com.ss.android.ugc.aweme.user.a.class)) {
                    accessDispatch = PatchProxy.accessDispatch(new Object[]{bVar3}, aVar3, a.C0785a.f75294a, false, 87487, new Class[]{com.ss.android.account.b.class}, com.ss.android.ugc.aweme.user.a.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(bVar3, "u");
                    String valueOf = String.valueOf(bVar3.f22516a);
                    String str2 = bVar3.g;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "u.userName");
                    String str3 = bVar3.i;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "u.avatarUrl");
                    com.ss.android.ugc.aweme.user.a aVar4 = new com.ss.android.ugc.aweme.user.a(valueOf, "", "", str2, str3);
                    aVar = aVar4;
                    dVar.a(aVar);
                    com.ss.android.ugc.aweme.account.i.a.b("synchronous_check");
                    i.a((Callable<TResult>) new ac<TResult>(bVar2), (Executor) com.ss.android.ugc.aweme.e.a.a());
                }
            }
            aVar = (com.ss.android.ugc.aweme.user.a) accessDispatch;
            dVar.a(aVar);
            com.ss.android.ugc.aweme.account.i.a.b("synchronous_check");
            i.a((Callable<TResult>) new ac<TResult>(bVar2), (Executor) com.ss.android.ugc.aweme.e.a.a());
        }
    }
}
