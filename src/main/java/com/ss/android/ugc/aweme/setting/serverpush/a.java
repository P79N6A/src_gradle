package com.ss.android.ugc.aweme.setting.serverpush;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.feed.k.i;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.setting.serverpush.b.e;
import com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.ao;
import kotlinx.coroutines.au;
import kotlinx.coroutines.bd;
import kotlinx.coroutines.bk;
import kotlinx.coroutines.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager;", "", "()V", "presenter", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;", "getPresenter", "()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "staticCallbackList", "", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "tempCallback", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "registerCallback", "callback", "registerStaticCallback", "syncPUshSettingData", "isFromRetry", "", "PushSettingCallback", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64014a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f64015b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;"))};

    /* renamed from: c  reason: collision with root package name */
    static List<C0028a> f64016c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    static C0028a f64017d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f64018e;

    /* renamed from: f  reason: collision with root package name */
    private static final Lazy f64019f = LazyKt.lazy(b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a$a  reason: collision with other inner class name */
    public interface C0028a {
        void a(@NotNull c cVar);

        void a(@NotNull Exception exc);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<e> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final e invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72293, new Class[0], e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72293, new Class[0], e.class);
            }
            e eVar = new e();
            eVar.a(new com.ss.android.ugc.aweme.setting.serverpush.b.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64024a;

                public final void d_(@NotNull Exception exc) {
                    Exception exc2 = exc;
                    if (PatchProxy.isSupport(new Object[]{exc2}, this, f64024a, false, 72295, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc2}, this, f64024a, false, 72295, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(exc2, "e");
                    a.f64018e.a(exc2);
                }

                public final void a(@NotNull c cVar) {
                    c cVar2 = cVar;
                    if (PatchProxy.isSupport(new Object[]{cVar2}, this, f64024a, false, 72294, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar2}, this, f64024a, false, 72294, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(cVar2, "settings");
                    a aVar = a.f64018e;
                    if (PatchProxy.isSupport(new Object[]{cVar2}, aVar, a.f64014a, false, 72290, new Class[]{c.class}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{cVar2}, aVar2, a.f64014a, false, 72290, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(cVar2, "settings");
                    for (C0028a a2 : a.f64016c) {
                        a2.a(cVar2);
                    }
                    C0028a aVar3 = a.f64017d;
                    if (aVar3 != null) {
                        aVar3.a(cVar2);
                    }
                    a.f64017d = null;
                }
            });
            return eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "PushSettingsManager.kt", c = {82}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.setting.serverpush.PushSettingsManager$syncPUshSettingData$1")
    static final class c extends k implements Function2<af, kotlin.coroutines.c<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ C0028a $callback;
        Object L$0;
        int label;
        private af p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C0028a aVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$callback = aVar;
        }

        @NotNull
        public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
            kotlin.coroutines.c<?> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 72297, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class)) {
                return (kotlin.coroutines.c) PatchProxy.accessDispatch(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 72297, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "completion");
            c cVar3 = new c(this.$callback, cVar2);
            cVar3.p$ = (af) obj;
            return cVar3;
        }

        public final Object invoke(Object obj, Object obj2) {
            Object obj3 = obj;
            if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 72298, new Class[]{Object.class, Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 72298, new Class[]{Object.class, Object.class}, Object.class);
            }
            return ((c) create(obj3, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2;
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 72296, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 72296, new Class[]{Object.class}, Object.class);
            }
            Object a2 = kotlin.coroutines.a.b.a();
            switch (this.label) {
                case 0:
                    af afVar = this.p$;
                    long millis = TimeUnit.SECONDS.toMillis(1);
                    this.L$0 = afVar;
                    this.label = 1;
                    if (millis <= 0) {
                        obj2 = Unit.INSTANCE;
                    } else {
                        l lVar = new l(kotlin.coroutines.a.b.a(this), 1);
                        kotlinx.coroutines.k kVar = lVar;
                        kotlin.coroutines.e context = kVar.getContext();
                        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
                        e.b bVar = context.get(d.f83521b);
                        if (!(bVar instanceof ao)) {
                            bVar = null;
                        }
                        ao aoVar = (ao) bVar;
                        if (aoVar == null) {
                            aoVar = ak.f83799a;
                        }
                        aoVar.a(millis, kVar);
                        obj2 = lVar.b();
                        if (obj2 == kotlin.coroutines.a.b.a()) {
                            g.b(this);
                        }
                    }
                    if (obj2 == a2) {
                        return a2;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.f64018e.a(this.$callback, true);
            return Unit.INSTANCE;
        }
    }

    private final com.ss.android.ugc.aweme.setting.serverpush.b.e a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f64014a, false, 72289, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.e.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f64014a, false, 72289, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.e.class);
        } else {
            value = f64019f.getValue();
        }
        return (com.ss.android.ugc.aweme.setting.serverpush.b.e) value;
    }

    private a() {
    }

    static {
        a aVar = new a();
        f64018e = aVar;
        if (PatchProxy.isSupport(new Object[0], aVar, f64014a, false, 72287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, f64014a, false, 72287, new Class[0], Void.TYPE);
        } else {
            aVar.a((C0028a) new i());
            C0028a a2 = com.ss.android.ugc.aweme.story.shootvideo.publish.a.a.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "DuoshanPushSettingCallba….getPushSettingCallback()");
            aVar.a(a2);
            aVar.a((C0028a) com.ss.android.ugc.aweme.setting.commentfilter.b.a.f63900a);
            aVar.a(WhoCanSeeMyLikeListActivity.g);
            aVar.a((C0028a) ParentalPlatformManager.f2599b);
            aVar.a((C0028a) com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d);
            aVar.a((C0028a) com.ss.android.ugc.aweme.setting.c.a.f63861b);
        }
    }

    private final void a(C0028a aVar) {
        C0028a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f64014a, false, 72288, new Class[]{C0028a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f64014a, false, 72288, new Class[]{C0028a.class}, Void.TYPE);
            return;
        }
        f64016c.add(aVar2);
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f64014a, false, 72291, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f64014a, false, 72291, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        for (C0028a a2 : f64016c) {
            a2.a(exc2);
        }
        C0028a aVar = f64017d;
        if (aVar != null) {
            aVar.a(exc2);
        }
        f64017d = null;
    }

    public final void a(@Nullable C0028a aVar, boolean z) {
        C0028a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64014a, false, 72292, new Class[]{C0028a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z)}, this, f64014a, false, 72292, new Class[]{C0028a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        f64017d = aVar2;
        try {
            a().a(new Object[0]);
        } catch (Exception unused) {
            if (!z) {
                bk unused2 = kotlinx.coroutines.g.a(bd.f83876a, au.b(), null, new c(aVar2, null), 2);
                return;
            }
            a(new Exception());
        }
    }
}
