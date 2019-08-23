package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.s;
import com.ss.android.ugc.aweme.freeflowcard.freeflowmember.b;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.af;
import kotlinx.coroutines.au;
import kotlinx.coroutines.bk;
import kotlinx.coroutines.g;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u0006\u0010\u001d\u001a\u00020\u000fJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010'\u001a\u00020\u001f2\b\b\u0002\u0010(\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeMemberManager;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "IMSICode", "", "IMSI_MONITOR_KEY", "KEY_IMSI_CODE", "KEY_IS_FLOW_CARD", "LAST_UPDATE_TIME", "REPO_NAME", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "isFlowCard", "", "isInUpdating", "keva", "Lcom/bytedance/keva/Keva;", "getKeva", "()Lcom/bytedance/keva/Keva;", "keva$delegate", "Lkotlin/Lazy;", "lastUpdateTime", "", "checkHasFreeFlow", "freeFlowResponse", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "isFirstUpdateToday", "isFreeFlowCard", "loadLocalData", "", "monitorImsi", "imsi", "needUpdate", "onEvent", "event", "Lcom/ss/android/ugc/aweme/common/net/NetworkChangeEvent;", "saveData", "tryUpdate", "fromRetry", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3323a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3324b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final a f3325c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile String f3326d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f3327e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile long f3328f;
    /* access modifiers changed from: private */
    public static volatile boolean g;
    private static final Lazy h = LazyKt.lazy(C0576a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/keva/Keva;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.freeflowmember.a$a  reason: collision with other inner class name */
    static final class C0576a extends Lambda implements Function0<Keva> {
        public static final C0576a INSTANCE = new C0576a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0576a() {
            super(0);
        }

        public final Keva invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46108, new Class[0], Keva.class)) {
                return Keva.getRepoSync("free_member_manager", 0);
            }
            return (Keva) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46108, new Class[0], Keva.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "FreeMemberManager.kt", c = {54}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.freeflowcard.freeflowmember.FreeMemberManager$tryUpdate$1")
    static final class b extends k implements Function2<af, c<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $fromRetry;
        Object L$0;
        int label;
        private af p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, c cVar) {
            super(2, cVar);
            this.$fromRetry = z;
        }

        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            c<?> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 46110, new Class[]{Object.class, c.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 46110, new Class[]{Object.class, c.class}, c.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "completion");
            b bVar = new b(this.$fromRetry, cVar2);
            bVar.p$ = (af) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Object obj3 = obj;
            if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 46111, new Class[]{Object.class, Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 46111, new Class[]{Object.class, Object.class}, Object.class);
            }
            return ((b) create(obj3, (c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2;
            b bVar;
            int i;
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46109, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46109, new Class[]{Object.class}, Object.class);
            }
            Object a2 = kotlin.coroutines.a.b.a();
            switch (this.label) {
                case 0:
                    af afVar = this.p$;
                    a.g = true;
                    b.a aVar = b.f48651b;
                    if (!PatchProxy.isSupport(new Object[0], aVar, b.a.f48652a, false, 46114, new Class[0], b.class)) {
                        b.a aVar2 = aVar;
                        if (PatchProxy.isSupport(new Object[0], aVar2, b.a.f48652a, false, 46115, new Class[0], Integer.TYPE)) {
                            i = ((Integer) PatchProxy.accessDispatch(new Object[0], aVar2, b.a.f48652a, false, 46115, new Class[0], Integer.TYPE)).intValue();
                        } else {
                            String a3 = s.a(GlobalContext.getContext());
                            if (a3 == null) {
                                a3 = "";
                            }
                            if (Intrinsics.areEqual((Object) "46000", (Object) a3) || Intrinsics.areEqual((Object) "46002", (Object) a3) || Intrinsics.areEqual((Object) "46007", (Object) a3)) {
                                i = 3;
                            } else if (Intrinsics.areEqual((Object) "46001", (Object) a3) || Intrinsics.areEqual((Object) "46006", (Object) a3) || Intrinsics.areEqual((Object) "46009", (Object) a3)) {
                                i = 2;
                            } else if (Intrinsics.areEqual((Object) "46003", (Object) a3) || Intrinsics.areEqual((Object) "46005", (Object) a3) || Intrinsics.areEqual((Object) "46011", (Object) a3)) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                        }
                        switch (i) {
                            case 1:
                                bVar = d.f48664d;
                                break;
                            case 2:
                                bVar = e.f48666d;
                                break;
                            case 3:
                                bVar = c.f48656d;
                                break;
                            default:
                                bVar = b.C0577b.f48654d;
                                break;
                        }
                    } else {
                        bVar = (b) PatchProxy.accessDispatch(new Object[0], aVar, b.a.f48652a, false, 46114, new Class[0], b.class);
                    }
                    this.L$0 = afVar;
                    this.label = 1;
                    obj2 = bVar.a((c<? super FreeFlowResponse>) this);
                    if (obj2 == a2) {
                        return a2;
                    }
                    break;
                case 1:
                    obj2 = obj;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FreeFlowResponse freeFlowResponse = (FreeFlowResponse) obj2;
            if ((freeFlowResponse.getFromLocalError() || freeFlowResponse.getStatusCode() != 0) && !this.$fromRetry) {
                a.f3325c.a(true);
            } else {
                a.f3325c.a(freeFlowResponse);
            }
            a.g = false;
            return Unit.INSTANCE;
        }
    }

    private final Keva c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3323a, false, 46099, new Class[0], Keva.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3323a, false, 46099, new Class[0], Keva.class);
        } else {
            value = h.getValue();
        }
        return (Keva) value;
    }

    private a() {
    }

    @NotNull
    public final e a() {
        return f.INSTANCE;
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = f3327e;
        }
        return z;
    }

    private final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3323a, false, 46104, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3323a, false, 46104, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (g || NetworkUtils.isWifi(GlobalContext.getContext())) {
            return false;
        } else {
            String a2 = com.ss.android.ugc.aweme.flow.manager.impl.f.a(GlobalContext.getContext());
            if (a2 == null) {
                a2 = "";
            }
            a(a2);
            if (e() || !TextUtils.equals(a2, f3326d)) {
                return true;
            }
            return false;
        }
    }

    private final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f3323a, false, 46106, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3323a, false, 46106, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (System.currentTimeMillis() > f3328f + TimeUnit.DAYS.toMillis(1)) {
            return true;
        } else {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(f3328f);
            int i = instance.get(5);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(System.currentTimeMillis());
            if (i != instance2.get(5)) {
                return true;
            }
            return false;
        }
    }

    static {
        a aVar = new a();
        f3325c = aVar;
        f3326d = "";
        f3328f = -1;
        if (PatchProxy.isSupport(new Object[0], aVar, f3323a, false, 46103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, f3323a, false, 46103, new Class[0], Void.TYPE);
        } else {
            String string = aVar.c().getString("last_imsi_code", "");
            if (string == null) {
                string = "";
            }
            f3326d = string;
            f3327e = aVar.c().getBoolean("is_flow_card", false);
            f3328f = aVar.c().getLong("last_update_time", -1);
        }
        bg.c(aVar);
    }

    private final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3323a, false, 46105, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3323a, false, 46105, new Class[]{String.class}, Void.TYPE);
            return;
        }
        n.a("imsi_fetch_success_rate", TextUtils.isEmpty(str) ? 1 : 0, (JSONObject) null);
    }

    @Subscribe
    public final void onEvent(@NotNull com.ss.android.ugc.aweme.common.net.a aVar) {
        com.ss.android.ugc.aweme.common.net.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3323a, false, 46107, new Class[]{com.ss.android.ugc.aweme.common.net.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3323a, false, 46107, new Class[]{com.ss.android.ugc.aweme.common.net.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        if (aVar2.f40269d == com.ss.android.ugc.aweme.common.net.a.f40267b && d()) {
            a(false);
        }
    }

    public final void a(FreeFlowResponse freeFlowResponse) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{freeFlowResponse}, this, f3323a, false, 46101, new Class[]{FreeFlowResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{freeFlowResponse}, this, f3323a, false, 46101, new Class[]{FreeFlowResponse.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            a aVar = f3325c;
            if (PatchProxy.isSupport(new Object[]{freeFlowResponse}, aVar, f3323a, false, 46102, new Class[]{FreeFlowResponse.class}, Boolean.TYPE)) {
                Object[] objArr = {freeFlowResponse};
                a aVar2 = aVar;
                z = ((Boolean) PatchProxy.accessDispatch(objArr, aVar2, f3323a, false, 46102, new Class[]{FreeFlowResponse.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (freeFlowResponse.isOrderFlow() && !freeFlowResponse.getFromLocalError()) {
                    if (freeFlowResponse.getStatusCode() == 0) {
                        if (freeFlowResponse.getThreshold() > 0) {
                        }
                    }
                }
                z = false;
            }
            f3327e = z;
            String a2 = com.ss.android.ugc.aweme.flow.manager.impl.f.a(GlobalContext.getContext());
            if (a2 == null) {
                a2 = "";
            }
            f3326d = a2;
            f3328f = System.currentTimeMillis();
        }
        c().storeString("last_imsi_code", f3326d);
        c().storeBoolean("is_flow_card", f3327e);
        c().storeLong("last_update_time", f3328f);
    }

    public final void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3323a, false, 46100, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3323a, false, 46100, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (d() || z2) {
            bk unused = g.a(this, au.c(), null, new b(z2, null), 2);
        }
    }
}
