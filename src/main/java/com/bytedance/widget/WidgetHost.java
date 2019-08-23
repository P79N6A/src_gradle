package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RestrictTo;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0015J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0002\b\u0018J\"\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000fJ\r\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J\u001e\u0010&\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0002\b(J/\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0002\b-J%\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000fR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/bytedance/widget/WidgetHost;", "Landroid/support/v4/app/Fragment;", "()V", "activityResultRequests", "Ljava/util/HashMap;", "", "Lcom/bytedance/widget/Widget;", "Lkotlin/collections/HashMap;", "managerMap", "", "Landroid/arch/lifecycle/Lifecycle;", "Lcom/bytedance/widget/WidgetManager;", "myParentFragment", "widgetManagerCallbackList", "", "Lcom/bytedance/widget/WidgetHost$WidgetLoadStateCallback;", "dispatchWidgetLoaded", "", "widget", "dispatchWidgetLoaded$widget_release", "dispatchWidgetUnloaded", "dispatchWidgetUnloaded$widget_release", "get", "lifecycle", "get$widget_release", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "registerWidgetLoadStateCallback", "callback", "requireWidgetContext", "Landroid/content/Context;", "requireWidgetContext$widget_release", "requireWidgetHost", "", "requireWidgetHost$widget_release", "set", "manager", "set$widget_release", "startActivityForResult", "intent", "options", "Landroid/os/Bundle;", "startActivityForResult$widget_release", "unregisterWidgetLoadStateCallback", "Companion", "WidgetLoadStateCallback", "widget_release"}, k = 1, mv = {1, 1, 15})
public final class WidgetHost extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final String f22898c = WidgetHost.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    public static final a f22899d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Fragment f22900a;

    /* renamed from: b  reason: collision with root package name */
    final List<Object> f22901b = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, Widget> f22902e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final Map<Lifecycle, a> f22903f = new WeakHashMap();
    private HashMap g;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/widget/WidgetHost$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "createHost", "Lcom/bytedance/widget/WidgetHost;", "activity", "Landroid/support/v4/app/FragmentActivity;", "fragment", "Landroid/support/v4/app/Fragment;", "createHost$widget_release", "of", "widget", "Lcom/bytedance/widget/Widget;", "widget_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final Context a() {
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        return requireContext;
    }

    @NotNull
    public final Object b() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        Object requireHost = requireHost();
        Intrinsics.checkExpressionValueIsNotNull(requireHost, "requireHost()");
        return requireHost;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.g != null) {
            this.g.clear();
        }
    }

    @Nullable
    public final a a(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        return this.f22903f.get(lifecycle);
    }

    public final void a(@NotNull Widget widget) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        Iterator it2 = this.f22901b.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        if (widget.f2336e) {
            widget.f2336e = false;
        }
    }

    public final void a(@NotNull Lifecycle lifecycle, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(aVar, "manager");
        this.f22903f.put(lifecycle, aVar);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f22902e.get(Integer.valueOf(i));
        this.f22902e.remove(Integer.valueOf(i));
    }
}
