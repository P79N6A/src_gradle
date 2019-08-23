package com.ss.android.ugc.aweme.utils;

import a.i;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.service.model.g;
import java.lang.reflect.Field;

public final class dv {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75779a;

    static final /* synthetic */ Object a(Snackbar snackbar) throws Exception {
        if (snackbar.isShown()) {
            snackbar.dismiss();
        }
        try {
            Class<?> cls = Class.forName("android.support.design.widget.BaseTransientBottomBar$SnackbarBaseLayout");
            Field declaredField = cls.getDeclaredField("accessibilityManager");
            declaredField.setAccessible(true);
            if (declaredField.get(snackbar.getView()) == null || !(declaredField.get(snackbar.getView()) instanceof AccessibilityManager)) {
                return null;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) declaredField.get(snackbar.getView());
            Field declaredField2 = cls.getDeclaredField("touchExplorationStateChangeListener");
            declaredField2.setAccessible(true);
            if (declaredField2.get(snackbar.getView()) == null || !(declaredField2.get(snackbar.getView()) instanceof AccessibilityManagerCompat.TouchExplorationStateChangeListener)) {
                return null;
            }
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, (AccessibilityManagerCompat.TouchExplorationStateChangeListener) declaredField2.get(snackbar.getView()));
            return null;
        } catch (Exception unused) {
        }
    }

    private static String a(g gVar) {
        String str;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, null, f75779a, true, 88552, new Class[]{g.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{gVar2}, null, f75779a, true, 88552, new Class[]{g.class}, String.class);
        }
        if (gVar2.isMulti) {
            str = GlobalContext.getContext().getString(C0906R.string.alt, new Object[]{gVar2.contact.getDisplayName()});
        } else {
            str = GlobalContext.getContext().getString(C0906R.string.als, new Object[]{gVar2.contact.getDisplayName()});
        }
        return str;
    }

    public static void a(Context context, View view, g gVar) {
        Context context2 = context;
        View view2 = view;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{context2, view2, gVar2}, null, f75779a, true, 88550, new Class[]{Context.class, View.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, view2, gVar2}, null, f75779a, true, 88550, new Class[]{Context.class, View.class, g.class}, Void.TYPE);
        } else if (context2 != null && view2 != null && gVar2 != null) {
            String a2 = a(gVar);
            if (!TextUtils.isEmpty(a2)) {
                Snackbar make = Snackbar.make(view2, (CharSequence) "", -2);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) make.getView();
                snackbarLayout.setPadding(0, 0, 0, 0);
                ((TextView) snackbarLayout.findViewById(C0906R.id.csi)).setVisibility(4);
                View inflate = LayoutInflater.from(context).inflate(C0906R.layout.ad7, snackbarLayout);
                ((TextView) inflate.findViewById(C0906R.id.dfh)).setText(a2);
                inflate.setOnClickListener(new dw(context2, gVar2, make));
                i.a(500).a((a.g<TResult, TContinuationResult>) new dx<TResult,TContinuationResult>(make), i.f1052b);
                i.a(5000).a((a.g<TResult, TContinuationResult>) new dy<TResult,TContinuationResult>(make), i.f1052b);
            }
        }
    }
}
