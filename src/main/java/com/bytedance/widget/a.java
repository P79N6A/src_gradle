package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.AsyncLayoutInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0016J\"\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bytedance/widget/WidgetManager;", "", "widgetHost", "Lcom/bytedance/widget/WidgetHost;", "contentView", "Landroid/view/View;", "parentLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "(Lcom/bytedance/widget/WidgetHost;Landroid/view/View;Landroid/arch/lifecycle/Lifecycle;)V", "asyncLayoutInflater", "Landroid/support/v4/view/AsyncLayoutInflater;", "getAsyncLayoutInflater", "()Landroid/support/v4/view/AsyncLayoutInflater;", "asyncLayoutInflater$delegate", "Lkotlin/Lazy;", "syncLayoutInflater", "Landroid/view/LayoutInflater;", "getSyncLayoutInflater", "()Landroid/view/LayoutInflater;", "syncLayoutInflater$delegate", "widgetViewGroupHashMap", "Ljava/util/HashMap;", "Lcom/bytedance/widget/Widget;", "Landroid/view/ViewGroup;", "Lkotlin/collections/HashMap;", "widgets", "Ljava/util/concurrent/CopyOnWriteArrayList;", "continueLoad", "", "widget", "parentView", "load", "stubId", "", "asyncInflate", "", "unload", "Companion", "widget_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f22909a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "asyncLayoutInflater", "getAsyncLayoutInflater()Landroid/support/v4/view/AsyncLayoutInflater;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "syncLayoutInflater", "getSyncLayoutInflater()Landroid/view/LayoutInflater;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final C0242a f22910e = new C0242a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final CopyOnWriteArrayList<Widget> f22911b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final WidgetHost f22912c;

    /* renamed from: d  reason: collision with root package name */
    public final Lifecycle f22913d;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f22914f = LazyKt.lazy(new b(this));
    private final Lazy g = LazyKt.lazy(new c(this));
    private final HashMap<Widget, ViewGroup> h = new HashMap<>();
    private final View i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/bytedance/widget/WidgetManager$Companion;", "", "()V", "create", "Lcom/bytedance/widget/WidgetManager;", "fragmentActivity", "Landroid/support/v4/app/FragmentActivity;", "fragment", "Landroid/support/v4/app/Fragment;", "rootView", "Landroid/view/View;", "of", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "widgetHost", "Lcom/bytedance/widget/WidgetHost;", "activity", "widget", "Lcom/bytedance/widget/Widget;", "widget_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.widget.a$a  reason: collision with other inner class name */
    public static final class C0242a {
        private C0242a() {
        }

        public /* synthetic */ C0242a(byte b2) {
            this();
        }

        @NotNull
        public final a a(@NotNull Fragment fragment, @Nullable View view) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            if (fragment == null) {
                Intrinsics.throwNpe();
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "fragment!!.childFragmentManager");
            Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(WidgetHost.f22898c);
            if (!(findFragmentByTag instanceof WidgetHost)) {
                findFragmentByTag = null;
            }
            WidgetHost widgetHost = (WidgetHost) findFragmentByTag;
            if (widgetHost == null) {
                widgetHost = new WidgetHost();
                widgetHost.f22900a = fragment;
                if (fragment != null) {
                    FragmentManager fragmentManager = fragment.getFragmentManager();
                    if (fragmentManager != null) {
                        fragmentManager.registerFragmentLifecycleCallbacks(new WidgetHost$Companion$createHost$1$1(widgetHost), false);
                    }
                }
                childFragmentManager.beginTransaction().add((Fragment) widgetHost, WidgetHost.f22898c).commitNowAllowingStateLoss();
            }
            Lifecycle lifecycle = widgetHost.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "it.lifecycle");
            return a(lifecycle, widgetHost, view);
        }

        @NotNull
        public static a a(@NotNull Lifecycle lifecycle, @NotNull WidgetHost widgetHost, @Nullable View view) {
            Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
            Intrinsics.checkParameterIsNotNull(widgetHost, "widgetHost");
            a a2 = widgetHost.a(lifecycle);
            if (a2 != null) {
                return a2;
            }
            a aVar = new a(widgetHost, view, lifecycle);
            widgetHost.a(lifecycle, aVar);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/support/v4/view/AsyncLayoutInflater;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<AsyncLayoutInflater> {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @NotNull
        public final AsyncLayoutInflater invoke() {
            return new AsyncLayoutInflater(this.this$0.f22912c.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<LayoutInflater> {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final LayoutInflater invoke() {
            return LayoutInflater.from(this.this$0.f22912c.a());
        }
    }

    @NotNull
    public final a a(@NotNull Widget widget) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        if (this.f22911b.contains(widget)) {
            return this;
        }
        widget.f2333b = this.f22912c;
        this.f22911b.add(widget);
        this.f22912c.a(widget);
        this.f22913d.addObserver(widget);
        return this;
    }

    @NotNull
    public final a b(@NotNull Widget widget) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        this.f22913d.removeObserver(widget);
        switch (b.f22915a[this.f22913d.getCurrentState().ordinal()]) {
            case 2:
                if (!widget.f2334c) {
                    widget.destroy$widget_release();
                    break;
                }
                break;
            case 3:
                widget.destroy$widget_release();
                break;
            case 4:
                widget.stop$widget_release();
                widget.destroy$widget_release();
                break;
            case 5:
                widget.pause$widget_release();
                widget.stop$widget_release();
                widget.destroy$widget_release();
                break;
        }
        widget.f2333b = null;
        this.f22911b.remove(widget);
        if (this.h.containsKey(widget)) {
            ViewGroup viewGroup = this.h.get(widget);
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            viewGroup.removeAllViews();
            this.h.remove(widget);
        }
        WidgetHost widgetHost = this.f22912c;
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        Iterator it2 = widgetHost.f22901b.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        return this;
    }

    public a(@NotNull WidgetHost widgetHost, @Nullable View view, @NotNull Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(widgetHost, "widgetHost");
        Intrinsics.checkParameterIsNotNull(lifecycle, "parentLifecycle");
        this.f22912c = widgetHost;
        this.i = view;
        this.f22913d = lifecycle;
    }
}
