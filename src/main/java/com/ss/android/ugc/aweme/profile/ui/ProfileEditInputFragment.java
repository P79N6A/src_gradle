package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class ProfileEditInputFragment extends ProfileDetailEditFragment {
    public static ChangeQuickRedirect g;
    ButtonTitleBar h;

    public boolean a() {
        return true;
    }

    public abstract void b();

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 68771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 68771, new Class[0], Void.TYPE);
            return;
        }
        this.h.getEndBtn().setAlpha(1.0f);
        this.h.getEndBtn().setClickable(true);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 68772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 68772, new Class[0], Void.TYPE);
            return;
        }
        this.h.getEndBtn().setAlpha(0.34f);
        this.h.getEndBtn().setClickable(false);
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 68774, new Class[0], Boolean.TYPE)) {
            return this.h.getEndBtn().isClickable();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 68774, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 68775, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 68775, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (e()) {
            new a.C0185a(getContext()).a((int) C0906R.string.c12, (DialogInterface.OnClickListener) new cp(this)).b((int) C0906R.string.aja, (DialogInterface.OnClickListener) new cq(this)).b((int) C0906R.string.c1b).a().a();
        } else {
            dismiss();
        }
        return true;
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 68776, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 68776, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.fu);
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 68777, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 68777, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new cr(this));
        onCreateDialog.getWindow().setSoftInputMode(4);
        return onCreateDialog;
    }

    public final void a(EditText editText, int i) {
        EditText editText2 = editText;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{editText2, Integer.valueOf(i)}, this, g, false, 68778, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText2, Integer.valueOf(i)}, this, g, false, 68778, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Editable text = editText.getText();
        if (text.length() > i2) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), getString(C0906R.string.bau, String.valueOf(i))).a();
            int selectionEnd = Selection.getSelectionEnd(text);
            editText2.setText(text.toString().substring(0, i2));
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
        }
    }
}
