package com.ss.android.ugc.aweme.commerce.floatvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.o;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n*\u0001\u0012\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u000bJ\u0014\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\u0017\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rJ\u0006\u0010\u0019\u001a\u00020\u000bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox;", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/AwemePlayerBox;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mResetCB", "Lkotlin/Function0;", "", "progressChecker", "Lkotlin/Function1;", "", "timer", "Ljava/util/Timer;", "timerTask", "com/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox$timerTask$1", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox$timerTask$1;", "checkProgress", "onResetState", "callback", "queryProgress", "checker", "stopCheckProgress", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36926b;

    /* renamed from: d  reason: collision with root package name */
    public static final a f36927d = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public Function1<? super Long, Unit> f36928c;

    /* renamed from: e  reason: collision with root package name */
    private Function0<Unit> f36929e;

    /* renamed from: f  reason: collision with root package name */
    private final b f36930f;
    private final Timer g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox$Companion;", "", "()V", "QUERY_INTERVAL", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox$timerTask$1", "Ljava/util/TimerTask;", "run", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36931a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f36932b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36933a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f36934b;

            a(b bVar) {
                this.f36934b = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f36933a, false, 28211, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f36933a, false, 28211, new Class[0], Void.TYPE);
                    return;
                }
                Function1<? super Long, Unit> function1 = this.f36934b.f36932b.f36928c;
                if (function1 != null) {
                    o b2 = o.b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "PlayerManager.inst()");
                    function1.invoke(Long.valueOf(b2.c()));
                }
            }
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f36931a, false, 28210, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36931a, false, 28210, new Class[0], Void.TYPE);
                return;
            }
            this.f36932b.post(new a(this));
        }

        b(h hVar) {
            this.f36932b = hVar;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f36926b, false, 28207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36926b, false, 28207, new Class[0], Void.TYPE);
            return;
        }
        this.g.cancel();
        Function0<Unit> function0 = this.f36929e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f36926b, false, 28206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36926b, false, 28206, new Class[0], Void.TYPE);
            return;
        }
        Function1<? super Long, Unit> function1 = this.f36928c;
        if (function1 != null) {
            o b2 = o.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "PlayerManager.inst()");
            function1.invoke(Long.valueOf(b2.c()));
        }
        this.g.schedule(this.f36930f, 200, 200);
    }

    public final void a(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f36926b, false, 28205, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f36926b, false, 28205, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        this.f36929e = function02;
    }

    public final void a(@NotNull Function1<? super Long, Unit> function1) {
        Function1<? super Long, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f36926b, false, 28204, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f36926b, false, 28204, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "checker");
        this.f36928c = function12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private h(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f36930f = new b(this);
        this.g = new Timer();
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }
}
