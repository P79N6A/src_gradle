package com.ss.android.ugc.aweme.account.login;

import a.i;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.w;
import com.ss.android.ugc.aweme.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0007J\u0012\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/LoginMethodManager;", "", "()V", "initDone", "", "loginMethods", "", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "checkPhoneMethod", "m", "destroy", "", "dump", "enable", "filterValidMethod", "init", "Lbolts/Task;", "", "latestLoginMethod", "baseLoginMethod", "latestLoginMethodExcept", "methodName", "Lcom/ss/android/ugc/aweme/account/login/model/LoginMethodName;", "updateLoginMethodByUserId", "userId", "", "curTime", "", "updateUserInfo", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32230a;

    /* renamed from: b  reason: collision with root package name */
    public static List<BaseLoginMethod> f32231b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f32232c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f32233d = new g();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 13})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32234a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f32235b = new a();

        a() {
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f32234a, false, 20092, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32234a, false, 20092, new Class[0], Void.TYPE);
            } else {
                ((k) z.a(w.b(), k.class)).a(new Gson().toJson((Object) g.f32231b));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "call"}, k = 3, mv = {1, 1, 13})
    static final class b<V> implements Callable<List<? extends BaseLoginMethod>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32236a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f32237b = new b();

        b() {
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f32236a, false, 20093, new Class[0], List.class)) {
                return g.f32231b;
            }
            return (List) PatchProxy.accessDispatch(new Object[0], this, f32236a, false, 20093, new Class[0], List.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "call"}, k = 3, mv = {1, 1, 13})
    static final class c<V> implements Callable<List<? extends BaseLoginMethod>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32238a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f32239b = new c();

        c() {
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f32238a, false, 20094, new Class[0], List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[0], this, f32238a, false, 20094, new Class[0], List.class);
            }
            g gVar = g.f32233d;
            if (g.f32232c) {
                return g.f32231b;
            }
            JsonElement parse = new JsonParser().parse(((k) z.a(w.b(), k.class)).b("[]"));
            if (parse != null) {
                Gson gson = new Gson();
                for (JsonElement jsonElement : (JsonArray) parse) {
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement, AdvanceSetting.NETWORK_TYPE);
                    JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("loginMethodName");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement2, "it.asJsonObject[\"loginMethodName\"]");
                    String asString = jsonElement2.getAsString();
                    if (Intrinsics.areEqual((Object) asString, (Object) LoginMethodName.EMAIL_PASS.name()) || Intrinsics.areEqual((Object) asString, (Object) LoginMethodName.USER_NAME_PASS.name())) {
                        AnonymousClass1 r3 = AnonymousClass1.INSTANCE;
                        Object fromJson = gson.fromJson(jsonElement, AccountPassLoginMethod.class);
                        Intrinsics.checkExpressionValueIsNotNull(fromJson, "gson.fromJson(it, Accoun…sLoginMethod::class.java)");
                        r3.invoke((BaseLoginMethod) fromJson);
                    } else if (Intrinsics.areEqual((Object) asString, (Object) LoginMethodName.PHONE_NUMBER_PASS.name()) || Intrinsics.areEqual((Object) asString, (Object) LoginMethodName.PHONE_SMS.name())) {
                        AnonymousClass1 r32 = AnonymousClass1.INSTANCE;
                        Object fromJson2 = gson.fromJson(jsonElement, PhoneLoginMethod.class);
                        Intrinsics.checkExpressionValueIsNotNull(fromJson2, "gson.fromJson(it, PhoneLoginMethod::class.java)");
                        r32.invoke((BaseLoginMethod) fromJson2);
                    } else if (Intrinsics.areEqual((Object) asString, (Object) LoginMethodName.THIRD_PARTY.name())) {
                        AnonymousClass1 r33 = AnonymousClass1.INSTANCE;
                        Object fromJson3 = gson.fromJson(jsonElement, TPLoginMethod.class);
                        Intrinsics.checkExpressionValueIsNotNull(fromJson3, "gson.fromJson(it, TPLoginMethod::class.java)");
                        r33.invoke((BaseLoginMethod) fromJson3);
                    } else if (Intrinsics.areEqual((Object) asString, (Object) LoginMethodName.DEFAULT.name())) {
                        AnonymousClass1 r34 = AnonymousClass1.INSTANCE;
                        Object fromJson4 = gson.fromJson(jsonElement, BaseLoginMethod.class);
                        Intrinsics.checkExpressionValueIsNotNull(fromJson4, "gson.fromJson(it, BaseLoginMethod::class.java)");
                        r34.invoke((BaseLoginMethod) fromJson4);
                    }
                }
                g.f32233d.d();
                g gVar2 = g.f32233d;
                g.f32232c = true;
                return g.f32231b;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonArray");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class d extends Lambda implements Function1<BaseLoginMethod, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BaseLoginMethod $baseLoginMethod;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaseLoginMethod baseLoginMethod) {
            super(1);
            this.$baseLoginMethod = baseLoginMethod;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((BaseLoginMethod) obj));
        }

        public final boolean invoke(@NotNull BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            if (PatchProxy.isSupport(new Object[]{baseLoginMethod2}, this, changeQuickRedirect, false, 20096, new Class[]{BaseLoginMethod.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{baseLoginMethod2}, this, changeQuickRedirect, false, 20096, new Class[]{BaseLoginMethod.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(baseLoginMethod2, AdvanceSetting.NETWORK_TYPE);
            if (baseLoginMethod.getLoginMethodName() == this.$baseLoginMethod.getLoginMethodName()) {
                return true;
            }
            return false;
        }
    }

    private g() {
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f32230a, false, 20090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32230a, false, 20090, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) a.f32235b);
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f32230a, false, 20081, new Class[0], Boolean.TYPE)) {
            return ((k) z.a(w.b(), k.class)).b(true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32230a, false, 20081, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    @NotNull
    public static final i<List<BaseLoginMethod>> b() {
        if (PatchProxy.isSupport(new Object[0], null, f32230a, true, 20083, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f32230a, true, 20083, new Class[0], i.class);
        }
        if (f32232c) {
            i<List<BaseLoginMethod>> a2 = i.a((Callable<TResult>) b.f32237b);
            Intrinsics.checkExpressionValueIsNotNull(a2, "bolts.Task.callInBackgro…@Callable loginMethods })");
            return a2;
        }
        i<List<BaseLoginMethod>> a3 = i.a((Callable<TResult>) c.f32239b);
        Intrinsics.checkExpressionValueIsNotNull(a3, "bolts.Task.callInBackgro…ethods\n                })");
        return a3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod c() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f32230a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod> r7 = com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod.class
            r2 = 0
            r4 = 1
            r5 = 20085(0x4e75, float:2.8145E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f32230a
            r5 = 1
            r6 = 20085(0x4e75, float:2.8145E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod> r8 = com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r0
            return r0
        L_0x0026:
            com.ss.android.ugc.aweme.account.login.g r0 = f32233d
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x003a
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = new com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x003a:
            com.ss.android.ugc.aweme.account.login.g r0 = f32233d
            r0.d()
            java.util.List<com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod> r0 = f32231b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x004f
            r0 = 0
            goto L_0x0079
        L_0x004f:
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r2 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r2
            java.util.Date r2 = r2.getExpires()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x005c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r4 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r4
            java.util.Date r4 = r4.getExpires()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L_0x005c
            r1 = r3
            r2 = r4
            goto L_0x005c
        L_0x0078:
            r0 = r1
        L_0x0079:
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r0
            if (r0 != 0) goto L_0x0088
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = new com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.g.c():com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod");
    }

    public final void d() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f32230a, false, 20089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32230a, false, 20089, new Class[0], Void.TYPE);
            return;
        }
        Iterable iterable = f32231b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((BaseLoginMethod) it2.next()).isExpired()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            Collection arrayList = new ArrayList();
            for (Object next : f32231b) {
                BaseLoginMethod baseLoginMethod = (BaseLoginMethod) next;
                if (!baseLoginMethod.isExpired() || baseLoginMethod.getLoginMethodName() == LoginMethodName.DEFAULT) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            f32231b = CollectionsKt.toMutableList((Collection<? extends T>) (List) arrayList);
            e();
        }
    }

    @JvmStatic
    public static final void a(@NotNull BaseLoginMethod baseLoginMethod) {
        BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
        if (PatchProxy.isSupport(new Object[]{baseLoginMethod2}, null, f32230a, true, 20086, new Class[]{BaseLoginMethod.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseLoginMethod2}, null, f32230a, true, 20086, new Class[]{BaseLoginMethod.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseLoginMethod2, "baseLoginMethod");
        CollectionsKt.removeAll(f32231b, (Function1<? super T, Boolean>) new d<Object,Boolean>(baseLoginMethod2));
        f32231b.add(baseLoginMethod2);
        f32233d.e();
        if (h.f32240a) {
            Iterator<BaseLoginMethod> it2 = f32231b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f32230a, true, 20088, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, null, f32230a, true, 20088, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        Collection arrayList = new ArrayList();
        for (Object next : f32231b) {
            if (Intrinsics.areEqual((Object) ((BaseLoginMethod) next).getUid(), (Object) user.getUid())) {
                arrayList.add(next);
            }
        }
        for (BaseLoginMethod updateUserInfo : (List) arrayList) {
            updateUserInfo.updateUserInfo(user2);
        }
        f32233d.e();
    }
}
