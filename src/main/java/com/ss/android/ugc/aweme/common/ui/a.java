package com.ss.android.ugc.aweme.common.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.ListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40281a;

    /* renamed from: b  reason: collision with root package name */
    AlertDialog.Builder f40282b;

    /* renamed from: c  reason: collision with root package name */
    private Context f40283c;

    public final AlertDialog a() {
        if (!PatchProxy.isSupport(new Object[0], this, f40281a, false, 33481, new Class[0], AlertDialog.class)) {
            return this.f40282b.create();
        }
        return (AlertDialog) PatchProxy.accessDispatch(new Object[0], this, f40281a, false, 33481, new Class[0], AlertDialog.class);
    }

    public final AlertDialog b() {
        if (!PatchProxy.isSupport(new Object[0], this, f40281a, false, 33482, new Class[0], AlertDialog.class)) {
            return this.f40282b.show();
        }
        return (AlertDialog) PatchProxy.accessDispatch(new Object[0], this, f40281a, false, 33482, new Class[0], AlertDialog.class);
    }

    public a(Context context) {
        this.f40283c = context;
        this.f40282b = new AlertDialog.Builder(context, C0906R.style.q9);
    }

    public final void a(DialogInterface.OnCancelListener onCancelListener) {
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        if (PatchProxy.isSupport(new Object[]{onCancelListener2}, this, f40281a, false, 33474, new Class[]{DialogInterface.OnCancelListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCancelListener2}, this, f40281a, false, 33474, new Class[]{DialogInterface.OnCancelListener.class}, Void.TYPE);
            return;
        }
        this.f40282b.setOnCancelListener(onCancelListener2);
    }

    public final void a(DialogInterface.OnDismissListener onDismissListener) {
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        if (PatchProxy.isSupport(new Object[]{onDismissListener2}, this, f40281a, false, 33475, new Class[]{DialogInterface.OnDismissListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onDismissListener2}, this, f40281a, false, 33475, new Class[]{DialogInterface.OnDismissListener.class}, Void.TYPE);
            return;
        }
        this.f40282b.setOnDismissListener(onDismissListener2);
    }

    public final void a(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f40281a, false, 33479, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f40281a, false, 33479, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.f40282b.setTitle(charSequence2);
    }

    public final void a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        ListAdapter listAdapter2 = listAdapter;
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{listAdapter2, onClickListener2}, this, f40281a, false, 33476, new Class[]{ListAdapter.class, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{listAdapter2, onClickListener2}, this, f40281a, false, 33476, new Class[]{ListAdapter.class, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f40282b.setAdapter(listAdapter2, onClickListener2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.CharSequence[] r20, android.content.DialogInterface.OnClickListener r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f40281a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.CharSequence[]> r4 = java.lang.CharSequence[].class
            r8[r10] = r4
            java.lang.Class<android.content.DialogInterface$OnClickListener> r4 = android.content.DialogInterface.OnClickListener.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 33473(0x82c1, float:4.6906E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f40281a
            r15 = 0
            r16 = 33473(0x82c1, float:4.6906E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.CharSequence[]> r1 = java.lang.CharSequence[].class
            r0[r10] = r1
            java.lang.Class<android.content.DialogInterface$OnClickListener> r1 = android.content.DialogInterface.OnClickListener.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            r2 = r19
            android.support.v7.app.AlertDialog$Builder r3 = r2.f40282b
            r3.setItems((java.lang.CharSequence[]) r0, (android.content.DialogInterface.OnClickListener) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.ui.a.a(java.lang.CharSequence[], android.content.DialogInterface$OnClickListener):void");
    }
}
