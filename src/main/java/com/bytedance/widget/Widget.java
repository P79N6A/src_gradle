package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Intent;
import android.support.annotation.CallSuper;
import android.view.View;
import com.bytedance.widget.a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5J\r\u00106\u001a\u000204H\u0001¢\u0006\u0002\b7J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u00020;H\u0016J\"\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020!2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u000204H\u0017J\b\u0010B\u001a\u000204H\u0017J\b\u0010C\u001a\u000204H\u0017J\b\u0010D\u001a\u000204H\u0017J\b\u0010E\u001a\u000204H\u0017J\b\u0010F\u001a\u000204H\u0017J\r\u0010G\u001a\u000204H\u0001¢\u0006\u0002\bHJ\r\u0010I\u001a\u00020*H\u0000¢\u0006\u0002\bJJ\r\u0010K\u001a\u000204H\u0001¢\u0006\u0002\bLJ\u0015\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0002\bOJ\u0015\u0010\u0014\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\bPJ\r\u0010Q\u001a\u000204H\u0001¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u0002042\u0006\u0010T\u001a\u00020@H\u0004J\u001a\u0010S\u001a\u0002042\u0006\u0010T\u001a\u00020@2\b\u0010U\u001a\u0004\u0018\u00010VH\u0004J\u0018\u0010W\u001a\u0002042\u0006\u0010T\u001a\u00020@2\u0006\u0010=\u001a\u00020!H\u0004J\"\u0010W\u001a\u0002042\u0006\u0010T\u001a\u00020@2\u0006\u0010=\u001a\u00020!2\b\u0010U\u001a\u0004\u0018\u00010VH\u0004J\r\u0010X\u001a\u000204H\u0001¢\u0006\u0002\bYR\u001b\u0010\u0004\u001a\u00020\u00058@X\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020!8WX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u00102¨\u0006Z"}, d2 = {"Lcom/bytedance/widget/Widget;", "Landroid/arch/lifecycle/LifecycleObserver;", "Landroid/arch/lifecycle/LifecycleOwner;", "()V", "childWidgetManager", "Lcom/bytedance/widget/WidgetManager;", "getChildWidgetManager$widget_release", "()Lcom/bytedance/widget/WidgetManager;", "childWidgetManager$delegate", "Lkotlin/Lazy;", "container", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "setContainer", "(Landroid/view/ViewGroup;)V", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "isDestroyed", "", "isDestroyed$widget_release", "()Z", "setDestroyed$widget_release", "(Z)V", "isFirstLoaded", "isFirstLoadedInternal", "isFirstLoadedInternal$widget_release", "setFirstLoadedInternal$widget_release", "layoutId", "", "getLayoutId", "()I", "lifecycleRegistry", "Landroid/arch/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroid/arch/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "widgetHost", "Lcom/bytedance/widget/WidgetHost;", "getWidgetHost$widget_release", "()Lcom/bytedance/widget/WidgetHost;", "setWidgetHost$widget_release", "(Lcom/bytedance/widget/WidgetHost;)V", "widgetManager", "getWidgetManager$widget_release", "setWidgetManager$widget_release", "(Lcom/bytedance/widget/WidgetManager;)V", "create", "", "create$widget_release", "destroy", "destroy$widget_release", "getHost", "", "getLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "onDestroy", "onPause", "onResume", "onStart", "onStop", "pause", "pause$widget_release", "requireWidgetHost", "requireWidgetHost$widget_release", "resume", "resume$widget_release", "setContainerView", "containerView", "setContainerView$widget_release", "setContentView$widget_release", "start", "start$widget_release", "startActivity", "intent", "options", "Landroid/os/Bundle;", "startActivityForResult", "stop", "stop$widget_release", "widget_release"}, k = 1, mv = {1, 1, 15})
public class Widget implements LifecycleObserver, LifecycleOwner {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2332a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Widget.class), "childWidgetManager", "getChildWidgetManager$widget_release()Lcom/bytedance/widget/WidgetManager;"))};
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public WidgetHost f2333b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2334c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public View f2335d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2336e = true;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f2337f = LazyKt.lazy(new b(this));
    @NotNull
    private final Lazy g = LazyKt.lazy(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/widget/WidgetManager;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<a> {
        final /* synthetic */ Widget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Widget widget) {
            super(0);
            this.this$0 = widget;
        }

        @NotNull
        public final a invoke() {
            return a.C0242a.a(this.this$0.getLifecycle(), this.this$0.ak_(), this.this$0.f2335d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LifecycleRegistry;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ Widget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Widget widget) {
            super(0);
            this.this$0 = widget;
        }

        @NotNull
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    private final LifecycleRegistry l() {
        return (LifecycleRegistry) this.f2337f.getValue();
    }

    @CallSuper
    public void aj_() {
        this.f2334c = false;
    }

    @CallSuper
    public void h() {
    }

    @CallSuper
    public void i() {
        this.f2334c = true;
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return l();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create$widget_release() {
        aj_();
        l().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$widget_release() {
        i();
        l().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @NotNull
    public final Object j() {
        return ak_().b();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause$widget_release() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume$widget_release() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void start$widget_release() {
        h();
        l().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void stop$widget_release() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @NotNull
    public final WidgetHost ak_() {
        WidgetHost widgetHost = this.f2333b;
        if (widgetHost != null) {
            return widgetHost;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void a(@NotNull Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        ak_().startActivity(intent);
    }
}
