package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class RecyclableWidgetManager extends WidgetManager {
    private static final IWidgetProvider DEFAULT_WIDGET_PROVIDER = new IWidgetProvider() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final <T extends IRecyclableWidget> T provide(Class<T> cls) {
            if (PatchProxy.isSupport(new Object[]{cls}, this, changeQuickRedirect, false, 15202, new Class[]{Class.class}, IRecyclableWidget.class)) {
                return (IRecyclableWidget) PatchProxy.accessDispatch(new Object[]{cls}, this, changeQuickRedirect, false, 15202, new Class[]{Class.class}, IRecyclableWidget.class);
            }
            try {
                return (IRecyclableWidget) cls.newInstance();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(e3);
            }
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private IWidgetProvider mWidgetProvider = DEFAULT_WIDGET_PROVIDER;

    public List<Widget> getWidgetList() {
        return this.widgets;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> T load(android.view.ViewGroup r17, java.lang.Class<T> r18, boolean r19, java.lang.Object[] r20) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r9 = r18
            r10 = r20
            r11 = 4
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r12 = 0
            r1[r12] = r0
            r13 = 1
            r1[r13] = r9
            java.lang.Byte r2 = java.lang.Byte.valueOf(r19)
            r14 = 2
            r1[r14] = r2
            r15 = 3
            r1[r15] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r6[r12] = r2
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r6[r13] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r14] = r2
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            r6[r15] = r2
            java.lang.Class<com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r7 = com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.class
            r4 = 0
            r5 = 15197(0x3b5d, float:2.1296E-41)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x006c
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r12] = r0
            r1[r13] = r9
            java.lang.Byte r0 = java.lang.Byte.valueOf(r19)
            r1[r14] = r0
            r1[r15] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15197(0x3b5d, float:2.1296E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            r6[r12] = r0
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r14] = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r6[r15] = r0
            java.lang.Class<com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r7 = com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.class
            r2 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r0 = (com.bytedance.ies.sdk.widgets.LiveRecyclableWidget) r0
            return r0
        L_0x006c:
            com.bytedance.ies.sdk.widgets.IWidgetProvider r1 = r8.mWidgetProvider
            com.bytedance.ies.sdk.widgets.IRecyclableWidget r1 = r1.provide(r9)
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r1 = (com.bytedance.ies.sdk.widgets.LiveRecyclableWidget) r1
            r1.setArgs(r10)
            com.bytedance.ies.sdk.widgets.Widget$WidgetCallback r2 = r8.widgetCallback
            r1.setWidgetCallback(r2)
            android.content.Context r2 = r8.context
            r1.context = r2
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r8.dataCenter
            r1.dataCenter = r2
            r1.containerView = r0
            java.util.Map r2 = r8.widgetViewGroupHashMap
            r2.put(r1, r0)
            boolean r2 = r1.isInitialized()
            if (r2 == 0) goto L_0x00bc
            boolean r2 = r1.startWithMergeTag()
            if (r2 == 0) goto L_0x009d
            android.view.View r0 = r1.contentView
            r8.continueLoadForMergeTag(r1, r0)
            goto L_0x00a2
        L_0x009d:
            android.view.View r2 = r1.contentView     // Catch:{ Exception -> 0x00a3 }
            r8.continueLoad(r1, r0, r2)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a2:
            return r1
        L_0x00a3:
            r0 = move-exception
            android.view.LayoutInflater r1 = r8.syncLayoutInflater
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1, r0)
            throw r2
        L_0x00bc:
            int r2 = r1.getLayoutId()
            if (r2 != 0) goto L_0x00c7
            r2 = 0
            r8.continueLoad(r1, r0, r2)
            return r1
        L_0x00c7:
            if (r19 == 0) goto L_0x00d8
            android.support.v4.view.AsyncLayoutInflater r2 = r8.asyncLayoutInflater
            int r3 = r1.getLayoutId()
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager$$Lambda$0 r4 = new com.bytedance.ies.sdk.widgets.RecyclableWidgetManager$$Lambda$0
            r4.<init>(r8, r1, r0)
            r2.inflate(r3, r0, r4)
            return r1
        L_0x00d8:
            boolean r2 = r1.startWithMergeTag()
            if (r2 == 0) goto L_0x00ec
            android.view.LayoutInflater r2 = r8.syncLayoutInflater
            int r3 = r1.getLayoutId()
            android.view.View r0 = r2.inflate(r3, r0, r13)
            r8.continueLoadForMergeTag(r1, r0)
            return r1
        L_0x00ec:
            android.view.LayoutInflater r2 = r8.syncLayoutInflater
            int r3 = r1.getLayoutId()
            android.view.View r2 = r2.inflate(r3, r0, r12)
            r8.continueLoad(r1, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.load(android.view.ViewGroup, java.lang.Class, boolean, java.lang.Object[]):com.bytedance.ies.sdk.widgets.LiveRecyclableWidget");
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, changeQuickRedirect, false, 15198, new Class[]{Class.class}, LiveRecyclableWidget.class)) {
            return (LiveRecyclableWidget) PatchProxy.accessDispatch(new Object[]{cls}, this, changeQuickRedirect, false, 15198, new Class[]{Class.class}, LiveRecyclableWidget.class);
        }
        T t = (LiveRecyclableWidget) this.mWidgetProvider.provide(cls);
        t.setWidgetCallback(this.widgetCallback);
        t.context = this.context;
        t.dataCenter = this.dataCenter;
        this.widgets.add(t);
        getLifecycle().addObserver(t);
        return t;
    }

    public void setWidgetProvider(IWidgetProvider iWidgetProvider) {
        this.mWidgetProvider = iWidgetProvider;
    }

    private void continueLoadForMergeTag(Widget widget, View view) {
        Widget widget2 = widget;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{widget2, view2}, this, changeQuickRedirect, false, 15199, new Class[]{Widget.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{widget2, view2}, this, changeQuickRedirect, false, 15199, new Class[]{Widget.class, View.class}, Void.TYPE);
        } else if (widget2.containerView != null) {
            widget2.contentView = view2;
            this.widgets.add(widget2);
            getLifecycle().addObserver(widget2);
        }
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view) {
        Fragment fragment2 = fragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{fragment2, view2}, null, changeQuickRedirect, true, 15191, new Class[]{Fragment.class, View.class}, RecyclableWidgetManager.class)) {
            return (RecyclableWidgetManager) PatchProxy.accessDispatch(new Object[]{fragment2, view2}, null, changeQuickRedirect, true, 15191, new Class[]{Fragment.class, View.class}, RecyclableWidgetManager.class);
        }
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager();
        recyclableWidgetManager.config(null, fragment2, view2, fragment.getContext());
        return recyclableWidgetManager;
    }

    public static RecyclableWidgetManager of(FragmentActivity fragmentActivity, View view) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, view2}, null, changeQuickRedirect, true, 15190, new Class[]{FragmentActivity.class, View.class}, RecyclableWidgetManager.class)) {
            return (RecyclableWidgetManager) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, view2}, null, changeQuickRedirect, true, 15190, new Class[]{FragmentActivity.class, View.class}, RecyclableWidgetManager.class);
        }
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager();
        recyclableWidgetManager.config(fragmentActivity2, null, view2, fragmentActivity2);
        return recyclableWidgetManager;
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cls2}, this, changeQuickRedirect, false, 15192, new Class[]{Integer.TYPE, Class.class}, LiveRecyclableWidget.class)) {
            return load(i, cls2, true);
        }
        return (LiveRecyclableWidget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cls2}, this, changeQuickRedirect, false, 15192, new Class[]{Integer.TYPE, Class.class}, LiveRecyclableWidget.class);
    }

    public <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls) {
        ViewGroup viewGroup2 = viewGroup;
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, cls2}, this, changeQuickRedirect, false, 15195, new Class[]{ViewGroup.class, Class.class}, LiveRecyclableWidget.class)) {
            return load(viewGroup2, cls2, true);
        }
        return (LiveRecyclableWidget) PatchProxy.accessDispatch(new Object[]{viewGroup2, cls2}, this, changeQuickRedirect, false, 15195, new Class[]{ViewGroup.class, Class.class}, LiveRecyclableWidget.class);
    }

    private <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, cls2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15196, new Class[]{ViewGroup.class, Class.class, Boolean.TYPE}, LiveRecyclableWidget.class)) {
            return load(viewGroup2, (Class) cls2, z, (Object[]) null);
        }
        return (LiveRecyclableWidget) PatchProxy.accessDispatch(new Object[]{viewGroup2, cls2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15196, new Class[]{ViewGroup.class, Class.class, Boolean.TYPE}, LiveRecyclableWidget.class);
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        Widget widget2 = widget;
        if (PatchProxy.isSupport(new Object[]{widget2, viewGroup, view}, this, changeQuickRedirect, false, 15200, new Class[]{Widget.class, ViewGroup.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{widget2, viewGroup, view}, this, changeQuickRedirect, false, 15200, new Class[]{Widget.class, ViewGroup.class, View.class}, Void.TYPE);
        } else if (widget2.containerView != null) {
            if (view != null) {
                UIUtils.detachFromParent(view);
            }
            super.continueLoad(widget, viewGroup, view);
        }
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cls2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15193, new Class[]{Integer.TYPE, Class.class, Boolean.TYPE}, LiveRecyclableWidget.class)) {
            return load(i, cls2, z, (Object[]) null);
        }
        return (LiveRecyclableWidget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cls2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15193, new Class[]{Integer.TYPE, Class.class, Boolean.TYPE}, LiveRecyclableWidget.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> T load(int r16, java.lang.Class<T> r17, boolean r18, java.lang.Object[] r19) {
        /*
            r15 = this;
            r7 = r15
            r8 = r17
            r9 = r19
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r11 = 0
            r0[r11] = r1
            r12 = 1
            r0[r12] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r18)
            r13 = 2
            r0[r13] = r1
            r14 = 3
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r14] = r1
            java.lang.Class<com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r6 = com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.class
            r3 = 0
            r4 = 15194(0x3b5a, float:2.1291E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r11] = r1
            r0[r12] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r18)
            r0[r13] = r1
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 15194(0x3b5a, float:2.1291E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r14] = r1
            java.lang.Class<com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r6 = com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r0 = (com.bytedance.ies.sdk.widgets.LiveRecyclableWidget) r0
            return r0
        L_0x006f:
            android.view.View r0 = r7.contentView
            r1 = r16
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = r18
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r0 = r15.load((android.view.ViewGroup) r0, (java.lang.Class) r8, (boolean) r1, (java.lang.Object[]) r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.load(int, java.lang.Class, boolean, java.lang.Object[]):com.bytedance.ies.sdk.widgets.LiveRecyclableWidget");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$load$0$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!isRemoving() && !isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            continueLoad(liveRecyclableWidget, viewGroup, view);
        }
    }
}
