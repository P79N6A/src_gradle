package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J,\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/MonitorNavigationBar;", "", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "initHeight", "", "(Landroid/app/Activity;I)V", "naviBarHeight", "monitor", "", "condition", "Lkotlin/Function0;", "", "function", "Lkotlin/Function1;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class cv {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66703a;

    /* renamed from: b  reason: collision with root package name */
    public int f66704b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f66705c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Boolean> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final boolean invoke() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66706a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cv f66707b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f66708c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function1 f66709d;

        b(cv cvVar, Function0 function0, Function1 function1) {
            this.f66707b = cvVar;
            this.f66708c = function0;
            this.f66709d = function1;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f66706a, false, 74236, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f66706a, false, 74236, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (fc.d(this.f66707b.f66705c) != this.f66707b.f66704b && ((Boolean) this.f66708c.invoke()).booleanValue()) {
                this.f66707b.f66704b = fc.d(this.f66707b.f66705c);
                this.f66709d.invoke(Integer.valueOf(this.f66707b.f66704b));
            }
        }
    }

    @JvmOverloads
    public final void a(@NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f66703a, false, 74235, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f66703a, false, 74235, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        a(a.INSTANCE, function12);
    }

    public cv(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f66705c = activity;
        this.f66704b = fc.d(this.f66705c);
    }

    public cv(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f66705c = activity;
        this.f66704b = i;
    }

    @JvmOverloads
    public final void a(@NotNull Function0<Boolean> function0, @NotNull Function1<? super Integer, Unit> function1) {
        if (PatchProxy.isSupport(new Object[]{function0, function1}, this, f66703a, false, 74234, new Class[]{Function0.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0, function1}, this, f66703a, false, 74234, new Class[]{Function0.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "condition");
        Intrinsics.checkParameterIsNotNull(function1, "function");
        this.f66705c.findViewById(16908290).addOnLayoutChangeListener(new b(this, function0, function1));
    }
}
