package com.ss.android.ugc.aweme.feedback.a.a;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.g;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bJ \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0017¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager;", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/IRuntimeBehaviorService;", "()V", "deleteExpiredEntityByType", "", "type", "", "time", "", "event", "msg", "feedbackRecordEnable", "", "getDataBaseHelper", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorDataBaseHelper;", "getSupportStrategy", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/strategy/AbsBehaviorStrategy;", "getValidEntityByType", "", "Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorEntity;", "validTime", "insert", "loadResult", "", "Companion", "SingletonHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47125a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static b f47126b = C0567b.f47129a;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final List<com.ss.android.ugc.aweme.feedback.a.a.a.a> f47127c = CollectionsKt.listOf(new com.ss.android.ugc.aweme.feedback.a.a.a.b());

    /* renamed from: d  reason: collision with root package name */
    public static final a f47128d = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager;", "getInstance", "()Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager;", "setInstance", "(Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager;)V", "strategyList", "", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/strategy/AbsBehaviorStrategy;", "getStrategyList", "()Ljava/util/List;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        @NotNull
        public static b a() {
            return b.f47126b;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager;", "getHolder", "()Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/RuntimeBehaviorManager;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.feedback.a.a.b$b  reason: collision with other inner class name */
    static final class C0567b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        static final b f47129a = new b((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final C0567b f47130b = new C0567b();

        private C0567b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class c<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f47132b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f47133c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f47134d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f47135e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feedback.a.a.a.a f47136f;

        c(b bVar, String str, String str2, long j, com.ss.android.ugc.aweme.feedback.a.a.a.a aVar) {
            this.f47132b = bVar;
            this.f47133c = str;
            this.f47134d = str2;
            this.f47135e = j;
            this.f47136f = aVar;
        }

        public final /* synthetic */ Object call() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f47131a, false, 43874, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47131a, false, 43874, new Class[0], Void.TYPE);
            } else {
                b bVar = this.f47132b;
                String str = this.f47133c;
                String str2 = this.f47134d;
                long j = this.f47135e;
                if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j)}, bVar, b.f47125a, false, 43869, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j)}, bVar2, b.f47125a, false, 43869, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
                    i = 2;
                } else {
                    i = 2;
                    com.ss.android.ugc.aweme.runtime.behavior.c cVar = new com.ss.android.ugc.aweme.runtime.behavior.c(str, j, str2);
                    a a2 = bVar.a();
                    if (PatchProxy.isSupport(new Object[]{cVar}, a2, a.f47117a, false, 43862, new Class[]{com.ss.android.ugc.aweme.runtime.behavior.c.class}, Void.TYPE)) {
                        a aVar = a2;
                        PatchProxy.accessDispatch(new Object[]{cVar}, aVar, a.f47117a, false, 43862, new Class[]{com.ss.android.ugc.aweme.runtime.behavior.c.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(cVar, "entity");
                        a2.f47120b.a().a(cVar);
                    }
                }
                b bVar3 = this.f47132b;
                String str3 = this.f47133c;
                long b2 = this.f47135e - this.f47136f.b();
                Object[] objArr = new Object[i];
                objArr[0] = str3;
                objArr[1] = new Long(b2);
                ChangeQuickRedirect changeQuickRedirect = b.f47125a;
                Class[] clsArr = new Class[i];
                clsArr[0] = String.class;
                clsArr[1] = Long.TYPE;
                if (PatchProxy.isSupport(objArr, bVar3, changeQuickRedirect, false, 43870, clsArr, Void.TYPE)) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = str3;
                    objArr2[1] = new Long(b2);
                    ChangeQuickRedirect changeQuickRedirect2 = b.f47125a;
                    Class[] clsArr2 = new Class[i];
                    clsArr2[0] = String.class;
                    clsArr2[1] = Long.TYPE;
                    PatchProxy.accessDispatch(objArr2, bVar3, changeQuickRedirect2, false, 43870, clsArr2, Void.TYPE);
                } else {
                    a a3 = bVar3.a();
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = str3;
                    objArr3[1] = new Long(b2);
                    ChangeQuickRedirect changeQuickRedirect3 = a.f47117a;
                    Class[] clsArr3 = new Class[i];
                    clsArr3[0] = String.class;
                    clsArr3[1] = Long.TYPE;
                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, 43860, clsArr3, Void.TYPE)) {
                        Object[] objArr4 = new Object[i];
                        objArr4[0] = str3;
                        objArr4[1] = new Long(b2);
                        ChangeQuickRedirect changeQuickRedirect4 = a.f47117a;
                        Class[] clsArr4 = new Class[i];
                        clsArr4[0] = String.class;
                        clsArr4[1] = Long.TYPE;
                        PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, 43860, clsArr4, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str3, "type");
                        a3.f47120b.a().b(str3, b2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    private b() {
    }

    /* access modifiers changed from: package-private */
    public final a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f47125a, false, 43864, new Class[0], a.class)) {
            return a.f47118c;
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f47125a, false, 43864, new Class[0], a.class);
    }

    public final boolean b() {
        Boolean bool;
        if (PatchProxy.isSupport(new Object[0], this, f47125a, false, 43868, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47125a, false, 43868, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            bool = b2.bS();
            Intrinsics.checkExpressionValueIsNotNull(bool, "SettingsReader.get().feedbackRecordEnable");
        } catch (Exception unused) {
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    private final com.ss.android.ugc.aweme.feedback.a.a.a.a b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f47125a, false, 43872, new Class[]{String.class}, com.ss.android.ugc.aweme.feedback.a.a.a.a.class)) {
            return (com.ss.android.ugc.aweme.feedback.a.a.a.a) PatchProxy.accessDispatch(new Object[]{str2}, this, f47125a, false, 43872, new Class[]{String.class}, com.ss.android.ugc.aweme.feedback.a.a.a.a.class);
        }
        for (com.ss.android.ugc.aweme.feedback.a.a.a.a next : f47127c) {
            if (next.a(str2)) {
                return next;
            }
        }
        return null;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f47125a, false, 43865, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f47125a, false, 43865, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "type");
        a(str2, "");
    }

    @NotNull
    public final List<com.ss.android.ugc.aweme.runtime.behavior.c> a(@NotNull String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f47125a, false, 43871, new Class[]{String.class, Long.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f47125a, false, 43871, new Class[]{String.class, Long.TYPE}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "type");
        a a2 = a();
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, a2, a.f47117a, false, 43859, new Class[]{String.class, Long.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, a2, a.f47117a, false, 43859, new Class[]{String.class, Long.TYPE}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "type");
        return a2.f47120b.a().a(str2, j2);
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f47125a, false, 43866, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f47125a, false, 43866, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "type");
        Intrinsics.checkParameterIsNotNull(str4, "msg");
        if (b()) {
            long currentTimeMillis = System.currentTimeMillis();
            com.ss.android.ugc.aweme.feedback.a.a.a.a b2 = b(str);
            if (b2 != null) {
                c cVar = new c(this, str, str2, currentTimeMillis, b2);
                i.a((Callable<TResult>) cVar, (Executor) i.f1051a);
                return;
            }
            throw new Exception(str3 + " 是不支持的运行时动作上报类型，请检查你的代码或联系 zhaoxuan.li");
        }
    }
}
