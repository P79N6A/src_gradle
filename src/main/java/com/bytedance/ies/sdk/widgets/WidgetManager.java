package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
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
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class WidgetManager extends Fragment {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public static ChangeQuickRedirect changeQuickRedirect;
    public AsyncLayoutInflater asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public FragmentManager.FragmentLifecycleCallbacks parentDestroyedCallback = new FragmentManager.FragmentLifecycleCallbacks() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, changeQuickRedirect, false, 15235, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, changeQuickRedirect, false, 15235, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
                return;
            }
            if (fragment == WidgetManager.this.parentFragment) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(WidgetManager.this.parentDestroyedCallback);
                fragment.getChildFragmentManager().beginTransaction().remove(WidgetManager.this).commitNowAllowingStateLoss();
            }
        }
    };
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public Widget.WidgetCallback widgetCallback = new Widget.WidgetCallback() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Fragment getFragment() {
            return WidgetManager.this;
        }

        public void startActivity(Intent intent) {
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 15229, new Class[]{Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 15229, new Class[]{Intent.class}, Void.TYPE);
                return;
            }
            WidgetManager.this.startActivity(intent2);
        }

        public <T extends ViewModel> T getViewModel(Class<T> cls) {
            if (PatchProxy.isSupport(new Object[]{cls}, this, changeQuickRedirect, false, 15233, new Class[]{Class.class}, ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls}, this, changeQuickRedirect, false, 15233, new Class[]{Class.class}, ViewModel.class);
            } else if (WidgetManager.this.parentFragment != null) {
                return ViewModelProviders.of(WidgetManager.this.parentFragment).get(cls);
            } else {
                return ViewModelProviders.of(WidgetManager.this.getActivity()).get(cls);
            }
        }

        public void startActivity(Intent intent, @Nullable Bundle bundle) {
            Intent intent2 = intent;
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{intent2, bundle2}, this, changeQuickRedirect, false, 15230, new Class[]{Intent.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent2, bundle2}, this, changeQuickRedirect, false, 15230, new Class[]{Intent.class, Bundle.class}, Void.TYPE);
                return;
            }
            WidgetManager.this.startActivity(intent2, bundle2);
        }

        public void startActivityForResult(Intent intent, int i) {
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 15231, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 15231, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            WidgetManager.this.startActivityForResult(intent2, i);
        }

        public <T extends ViewModel> T getViewModel(Class<T> cls, @NonNull ViewModelProvider.Factory factory) {
            if (PatchProxy.isSupport(new Object[]{cls, factory}, this, changeQuickRedirect, false, 15234, new Class[]{Class.class, ViewModelProvider.Factory.class}, ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls, factory}, this, changeQuickRedirect, false, 15234, new Class[]{Class.class, ViewModelProvider.Factory.class}, ViewModel.class);
            } else if (WidgetManager.this.parentFragment != null) {
                return ViewModelProviders.of(WidgetManager.this.parentFragment, factory).get(cls);
            } else {
                return ViewModelProviders.of(WidgetManager.this.getActivity(), factory).get(cls);
            }
        }

        public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
            Intent intent2 = intent;
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 15232, new Class[]{Intent.class, Integer.TYPE, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 15232, new Class[]{Intent.class, Integer.TYPE, Bundle.class}, Void.TYPE);
                return;
            }
            WidgetManager.this.startActivityForResult(intent2, i, bundle2);
        }
    };
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public List<Widget> widgets = new CopyOnWriteArrayList();

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15225, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.dataCenter = null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = configuration;
        if (PatchProxy.isSupport(new Object[]{configuration2}, this, changeQuickRedirect, false, 15227, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration2}, this, changeQuickRedirect, false, 15227, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        for (Widget onConfigurationChanged : this.widgets) {
            onConfigurationChanged.onConfigurationChanged(configuration2);
        }
    }

    public WidgetManager setDataCenter(DataCenter dataCenter2) {
        if (PatchProxy.isSupport(new Object[]{dataCenter2}, this, changeQuickRedirect, false, 15219, new Class[]{DataCenter.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{dataCenter2}, this, changeQuickRedirect, false, 15219, new Class[]{DataCenter.class}, WidgetManager.class);
        }
        this.dataCenter = dataCenter2;
        for (Widget widget : this.widgets) {
            widget.dataCenter = dataCenter2;
        }
        return this;
    }

    public WidgetManager unload(Widget widget) {
        if (PatchProxy.isSupport(new Object[]{widget}, this, changeQuickRedirect, false, 15224, new Class[]{Widget.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{widget}, this, changeQuickRedirect, false, 15224, new Class[]{Widget.class}, WidgetManager.class);
        } else if (widget == null) {
            return this;
        } else {
            getLifecycle().removeObserver(widget);
            if (widget.isViewValid) {
                switch (getLifecycle().getCurrentState()) {
                    case DESTROYED:
                        if (!widget.isDestroyed) {
                            widget.onDestroy();
                            break;
                        }
                        break;
                    case CREATED:
                        widget.onDestroy();
                        break;
                    case STARTED:
                        widget.onStop();
                        widget.onDestroy();
                        break;
                    case RESUMED:
                        widget.onPause();
                        widget.onStop();
                        widget.onDestroy();
                        break;
                }
            }
            widget.containerView = null;
            widget.context = null;
            widget.widgetCallback = null;
            widget.dataCenter = null;
            this.widgets.remove(widget);
            if (this.widgetViewGroupHashMap.containsKey(widget)) {
                this.widgetViewGroupHashMap.get(widget).removeAllViews();
                this.widgetViewGroupHashMap.remove(widget);
            }
            return this;
        }
    }

    public WidgetManager load(Widget widget) {
        if (PatchProxy.isSupport(new Object[]{widget}, this, changeQuickRedirect, false, 15223, new Class[]{Widget.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{widget}, this, changeQuickRedirect, false, 15223, new Class[]{Widget.class}, WidgetManager.class);
        } else if (widget == null) {
            return this;
        } else {
            widget.setWidgetCallback(this.widgetCallback);
            widget.context = this.context;
            widget.dataCenter = this.dataCenter;
            this.widgets.add(widget);
            getLifecycle().addObserver(widget);
            return this;
        }
    }

    public static WidgetManager of(Fragment fragment, View view) {
        Fragment fragment2 = fragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{fragment2, view2}, null, changeQuickRedirect, true, 15217, new Class[]{Fragment.class, View.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{fragment2, view2}, null, changeQuickRedirect, true, 15217, new Class[]{Fragment.class, View.class}, WidgetManager.class);
        }
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(null, fragment2, view2, fragment.getContext());
        return widgetManager;
    }

    public WidgetManager load(@IdRes int i, Widget widget) {
        Widget widget2 = widget;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), widget2}, this, changeQuickRedirect, false, 15220, new Class[]{Integer.TYPE, Widget.class}, WidgetManager.class)) {
            return load(i, widget2, true);
        }
        return (WidgetManager) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), widget2}, this, changeQuickRedirect, false, 15220, new Class[]{Integer.TYPE, Widget.class}, WidgetManager.class);
    }

    public static WidgetManager of(FragmentActivity fragmentActivity, View view) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, view2}, null, changeQuickRedirect, true, 15216, new Class[]{FragmentActivity.class, View.class}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, view2}, null, changeQuickRedirect, true, 15216, new Class[]{FragmentActivity.class, View.class}, WidgetManager.class);
        }
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(fragmentActivity2, null, view2, fragmentActivity2);
        return widgetManager;
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        Widget widget2 = widget;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{widget2, viewGroup, view2}, this, changeQuickRedirect, false, 15222, new Class[]{Widget.class, ViewGroup.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{widget2, viewGroup, view2}, this, changeQuickRedirect, false, 15222, new Class[]{Widget.class, ViewGroup.class, View.class}, Void.TYPE);
        } else if (widget2.containerView != null) {
            widget2.contentView = view2;
            if (!(viewGroup == null || view2 == null)) {
                viewGroup.addView(view);
            }
            this.widgets.add(widget2);
            getLifecycle().addObserver(widget2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, changeQuickRedirect, false, 15226, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, changeQuickRedirect, false, 15226, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        for (Widget onActivityResult : this.widgets) {
            onActivityResult.onActivityResult(i, i2, intent2);
        }
    }

    public WidgetManager load(@IdRes int i, Widget widget, boolean z) {
        Widget widget2 = widget;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), widget2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15221, new Class[]{Integer.TYPE, Widget.class, Boolean.TYPE}, WidgetManager.class)) {
            return (WidgetManager) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), widget2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15221, new Class[]{Integer.TYPE, Widget.class, Boolean.TYPE}, WidgetManager.class);
        } else if (widget2 == null) {
            return this;
        } else {
            widget.setWidgetCallback(this.widgetCallback);
            widget2.context = this.context;
            widget2.dataCenter = this.dataCenter;
            int i2 = i;
            ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(i);
            widget2.containerView = viewGroup;
            this.widgetViewGroupHashMap.put(widget, viewGroup);
            if (widget.getLayoutId() == 0) {
                continueLoad(widget, viewGroup, null);
                return this;
            } else if (z) {
                this.asyncLayoutInflater.inflate(widget.getLayoutId(), viewGroup, new WidgetManager$$Lambda$0(this, widget, viewGroup));
                return this;
            } else {
                continueLoad(widget, viewGroup, this.syncLayoutInflater.inflate(widget.getLayoutId(), viewGroup, false));
                return this;
            }
        }
    }

    public void config(FragmentActivity fragmentActivity, Fragment fragment, View view, Context context2) {
        FragmentManager fragmentManager;
        Fragment fragment2 = fragment;
        View view2 = view;
        Context context3 = context2;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, fragment2, view2, context3}, this, changeQuickRedirect, false, 15218, new Class[]{FragmentActivity.class, Fragment.class, View.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, fragment2, view2, context3}, this, changeQuickRedirect, false, 15218, new Class[]{FragmentActivity.class, Fragment.class, View.class, Context.class}, Void.TYPE);
        } else if (!this.configured) {
            if (fragmentActivity != null) {
                fragmentManager = fragmentActivity.getSupportFragmentManager();
            } else if (fragment2 != null) {
                fragmentManager = fragment.getChildFragmentManager();
            } else {
                return;
            }
            this.parentFragment = fragment2;
            this.contentView = view2;
            this.context = context3;
            this.asyncLayoutInflater = new AsyncLayoutInflater(context3);
            this.syncLayoutInflater = LayoutInflater.from(context2);
            if (!(fragment2 == null || fragment.getFragmentManager() == null)) {
                fragment.getFragmentManager().registerFragmentLifecycleCallbacks(this.parentDestroyedCallback, false);
            }
            fragmentManager.beginTransaction().add((Fragment) this, TAG).commitNowAllowingStateLoss();
            this.configured = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$load$0$WidgetManager(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!isRemoving() && !isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            continueLoad(widget, viewGroup, view);
        }
    }
}
