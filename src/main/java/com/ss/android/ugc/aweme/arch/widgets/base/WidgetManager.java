package com.ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.AsyncLayoutInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WidgetManager extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34362a;

    /* renamed from: e  reason: collision with root package name */
    private static final String f34363e = WidgetManager.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    public Fragment f34364b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f34365c;

    /* renamed from: d  reason: collision with root package name */
    FragmentManager.FragmentLifecycleCallbacks f34366d = new FragmentManager.FragmentLifecycleCallbacks() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34370a;

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f34370a, false, 23861, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f34370a, false, 23861, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
                return;
            }
            if (fragment == WidgetManager.this.f34364b) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(WidgetManager.this.f34366d);
                fragment.getChildFragmentManager().beginTransaction().remove(WidgetManager.this).commitNowAllowingStateLoss();
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private Widget.a f34367f = new Widget.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34368a;

        public final LifecycleOwner a() {
            return WidgetManager.this;
        }

        public final WidgetManager c() {
            return WidgetManager.this;
        }

        public final Activity b() {
            if (!PatchProxy.isSupport(new Object[0], this, f34368a, false, 23860, new Class[0], Activity.class)) {
                return WidgetManager.this.getActivity();
            }
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f34368a, false, 23860, new Class[0], Activity.class);
        }

        public final void a(Intent intent, int i) {
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i)}, this, f34368a, false, 23854, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i)}, this, f34368a, false, 23854, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            WidgetManager.this.startActivityForResult(intent2, i);
        }
    };
    private View g;
    private Context h;
    private AsyncLayoutInflater i;
    private LayoutInflater j;
    private List<Widget> k = new CopyOnWriteArrayList();

    public final WidgetManager a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, f34362a, false, 23842, new Class[]{DataCenter.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{dataCenter}, this, f34362a, false, 23842, new Class[]{DataCenter.class}, WidgetManager.class);
        }
        this.f34365c = dataCenter;
        for (Widget widget : this.k) {
            widget.g = dataCenter;
        }
        return this;
    }

    public final void a(Widget widget, View view, View view2) {
        Widget widget2 = widget;
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{widget2, view3, view4}, this, f34362a, false, 23845, new Class[]{Widget.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{widget2, view3, view4}, this, f34362a, false, 23845, new Class[]{Widget.class, View.class, View.class}, Void.TYPE);
            return;
        }
        widget2.f2711f = view4;
        if ((view3 instanceof ViewGroup) && view4 != null) {
            ((ViewGroup) view3).addView(view4);
        }
        this.k.add(widget2);
        getLifecycle().addObserver(widget2);
    }

    public final WidgetManager a(Widget widget) {
        if (PatchProxy.isSupport(new Object[]{widget}, this, f34362a, false, 23849, new Class[]{Widget.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{widget}, this, f34362a, false, 23849, new Class[]{Widget.class}, WidgetManager.class);
        } else if (widget == null) {
            return this;
        } else {
            widget.h = this.f34367f;
            widget.f2709d = this.h;
            widget.g = this.f34365c;
            this.k.add(widget);
            getLifecycle().addObserver(widget);
            return this;
        }
    }

    public static WidgetManager a(Fragment fragment, View view) {
        Fragment fragment2 = fragment;
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{fragment2, view2}, null, f34362a, true, 23840, new Class[]{Fragment.class, View.class}, WidgetManager.class)) {
            return a(null, fragment2, view2, fragment.getContext());
        }
        return (WidgetManager) PatchProxy.accessDispatch(new Object[]{fragment2, view2}, null, f34362a, true, 23840, new Class[]{Fragment.class, View.class}, WidgetManager.class);
    }

    public final WidgetManager b(@IdRes int i2, Widget widget) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), widget}, this, f34362a, false, 23846, new Class[]{Integer.TYPE, Widget.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), widget}, this, f34362a, false, 23846, new Class[]{Integer.TYPE, Widget.class}, WidgetManager.class);
        } else if (widget == null) {
            return this;
        } else {
            return a(this.g.findViewById(i2), widget);
        }
    }

    public static WidgetManager a(FragmentActivity fragmentActivity, View view) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2, view2}, null, f34362a, true, 23839, new Class[]{FragmentActivity.class, View.class}, WidgetManager.class)) {
            return a(fragmentActivity2, null, view2, fragmentActivity2);
        }
        return (WidgetManager) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, view2}, null, f34362a, true, 23839, new Class[]{FragmentActivity.class, View.class}, WidgetManager.class);
    }

    public final WidgetManager a(@IdRes int i2, final Widget widget) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), widget}, this, f34362a, false, 23843, new Class[]{Integer.TYPE, Widget.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), widget}, this, f34362a, false, 23843, new Class[]{Integer.TYPE, Widget.class}, WidgetManager.class);
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), widget, (byte) 1}, this, f34362a, false, 23844, new Class[]{Integer.TYPE, Widget.class, Boolean.TYPE}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), widget, (byte) 1}, this, f34362a, false, 23844, new Class[]{Integer.TYPE, Widget.class, Boolean.TYPE}, WidgetManager.class);
        } else if (widget == null) {
            return this;
        } else {
            widget.h = this.f34367f;
            widget.f2709d = this.h;
            widget.g = this.f34365c;
            final ViewGroup viewGroup = (ViewGroup) this.g.findViewById(i2);
            widget.f2710e = viewGroup;
            if (widget.b() == 0) {
                a(widget, viewGroup, null);
                return this;
            }
            this.i.inflate(widget.b(), viewGroup, new AsyncLayoutInflater.OnInflateFinishedListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34372a;

                public void onInflateFinished(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), viewGroup}, this, f34372a, false, 23862, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), viewGroup}, this, f34372a, false, 23862, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE);
                    } else if (!WidgetManager.this.isRemoving() && !WidgetManager.this.isDetached() && WidgetManager.this.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                        WidgetManager.this.a(widget, viewGroup, view);
                    }
                }
            });
            return this;
        }
    }

    public final WidgetManager a(View view, Widget widget) {
        if (PatchProxy.isSupport(new Object[]{view, widget}, this, f34362a, false, 23847, new Class[]{View.class, Widget.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{view, widget}, this, f34362a, false, 23847, new Class[]{View.class, Widget.class}, WidgetManager.class);
        } else if (widget == null) {
            return this;
        } else {
            widget.h = this.f34367f;
            widget.f2709d = this.h;
            widget.g = this.f34365c;
            widget.f2711f = view;
            this.k.add(widget);
            getLifecycle().addObserver(widget);
            return this;
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f34362a, false, 23851, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f34362a, false, 23851, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        for (Widget a2 : this.k) {
            a2.a(i2, i3, intent2);
        }
    }

    private static WidgetManager a(FragmentActivity fragmentActivity, Fragment fragment, View view, Context context) {
        FragmentManager fragmentManager;
        Fragment fragment2 = fragment;
        View view2 = view;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, fragment2, view2, context2}, null, f34362a, true, 23841, new Class[]{FragmentActivity.class, Fragment.class, View.class, Context.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{fragmentActivity, fragment2, view2, context2}, null, f34362a, true, 23841, new Class[]{FragmentActivity.class, Fragment.class, View.class, Context.class}, WidgetManager.class);
        }
        if (fragmentActivity != null) {
            fragmentManager = fragmentActivity.getSupportFragmentManager();
        } else if (fragment2 == null) {
            return null;
        } else {
            fragmentManager = fragment.getChildFragmentManager();
        }
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.f34364b = fragment2;
        widgetManager.g = view2;
        widgetManager.h = context2;
        widgetManager.i = new AsyncLayoutInflater(widgetManager.h);
        widgetManager.j = LayoutInflater.from(widgetManager.h);
        if (!(fragment2 == null || fragment.getFragmentManager() == null)) {
            fragment.getFragmentManager().registerFragmentLifecycleCallbacks(widgetManager.f34366d, false);
        }
        fragmentManager.beginTransaction().add((Fragment) widgetManager, f34363e).commitNowAllowingStateLoss();
        return widgetManager;
    }
}
