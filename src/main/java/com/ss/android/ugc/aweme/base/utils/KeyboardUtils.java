package com.ss.android.ugc.aweme.base.utils;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class KeyboardUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35007a;

    /* renamed from: b  reason: collision with root package name */
    public static List<ClearCursorDecorator> f35008b = new ArrayList(2);

    /* renamed from: c  reason: collision with root package name */
    public static List<AndroidBug5497Workaround> f35009c = new ArrayList(2);

    /* renamed from: d  reason: collision with root package name */
    private static final int f35010d = u.a(73.0d);

    static class AndroidBug5497Workaround implements LifecycleObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f2791a;

        /* renamed from: b  reason: collision with root package name */
        View f2792b;

        /* renamed from: c  reason: collision with root package name */
        a f2793c;

        /* renamed from: d  reason: collision with root package name */
        private ViewTreeObserver.OnGlobalLayoutListener f2794d;

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            if (PatchProxy.isSupport(new Object[0], this, f2791a, false, 25238, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2791a, false, 25238, new Class[0], Void.TYPE);
                return;
            }
            Iterator<AndroidBug5497Workaround> it2 = KeyboardUtils.f35009c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AndroidBug5497Workaround next = it2.next();
                if (next == this) {
                    KeyboardUtils.f35009c.remove(next);
                    break;
                }
            }
            if (this.f2792b.getViewTreeObserver() != null && this.f2792b.getViewTreeObserver().isAlive()) {
                this.f2792b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f2794d);
            }
            this.f2792b = null;
            this.f2794d = null;
            this.f2793c = null;
        }

        private AndroidBug5497Workaround(LifecycleOwner lifecycleOwner, View view, a aVar) {
            lifecycleOwner.getLifecycle().addObserver(this);
            this.f2793c = aVar;
            this.f2794d = new i(this);
            this.f2792b = view.getRootView();
            this.f2792b.getViewTreeObserver().addOnGlobalLayoutListener(this.f2794d);
        }

        /* synthetic */ AndroidBug5497Workaround(LifecycleOwner lifecycleOwner, View view, a aVar, byte b2) {
            this(lifecycleOwner, view, aVar);
        }
    }

    public static class ClearCursorDecorator implements LifecycleObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f2795a;

        /* renamed from: b  reason: collision with root package name */
        public EditText f2796b;

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            if (PatchProxy.isSupport(new Object[0], this, f2795a, false, 25240, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2795a, false, 25240, new Class[0], Void.TYPE);
                return;
            }
            this.f2796b = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f35008b) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f35008b.remove(this);
                }
            }
        }

        public ClearCursorDecorator(LifecycleOwner lifecycleOwner, EditText editText) {
            LifecycleOwner lifecycleOwner2 = lifecycleOwner;
            EditText editText2 = editText;
            lifecycleOwner.getLifecycle().addObserver(this);
            this.f2796b = editText2;
            AnonymousClass1 r3 = new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35011a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f35011a, false, 25242, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f35011a, false, 25242, new Class[0], Void.TYPE);
                    }
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f35011a, false, 25241, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f35011a, false, 25241, new Class[0], Void.TYPE);
                    } else if (ClearCursorDecorator.this.f2796b.isFocused()) {
                        ViewParent parent = ClearCursorDecorator.this.f2796b.getParent();
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (!view.isFocusableInTouchMode()) {
                                view.setFocusableInTouchMode(true);
                            }
                        }
                        ClearCursorDecorator.this.f2796b.clearFocus();
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, editText2, r3}, null, KeyboardUtils.f35007a, true, 25236, new Class[]{LifecycleOwner.class, View.class, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, editText2, r3}, null, KeyboardUtils.f35007a, true, 25236, new Class[]{LifecycleOwner.class, View.class, a.class}, Void.TYPE);
                return;
            }
            KeyboardUtils.f35009c.add(new AndroidBug5497Workaround(lifecycleOwner2, editText2, r3, (byte) 0));
        }
    }

    public interface a {
        void a();

        void b();
    }

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f35007a, true, 25224, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f35007a, true, 25224, new Class[]{View.class}, Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) GlobalContext.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view2, 2);
        }
    }

    public static void b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f35007a, true, 25225, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f35007a, true, 25225, new Class[]{View.class}, Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) GlobalContext.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view2, 1);
        }
    }

    public static void c(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, null, f35007a, true, 25226, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, null, f35007a, true, 25226, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) GlobalContext.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
