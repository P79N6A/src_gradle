package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class NumberInputDialogFragment extends SimpleInputDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11735a;

    /* renamed from: b  reason: collision with root package name */
    public int f11736b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f11737c = Integer.MAX_VALUE;

    public final void a(boolean z, int i) {
    }

    public final boolean a() {
        return false;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11735a, false, 6297, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f11735a, false, 6297, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11735a, false, 6296, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11735a, false, 6296, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f11736b = getArguments().getInt("live.intent.extra.MIN", Integer.MIN_VALUE);
        this.f11737c = getArguments().getInt("live.intent.extra.MAX", Integer.MAX_VALUE);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f11735a, false, 6298, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f11735a, false, 6298, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.g.setInputType(2);
        this.g.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11738a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f11738a, false, 6299, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f11738a, false, 6299, new Class[]{Editable.class}, Void.TYPE);
                } else if (TextUtils.isEmpty(editable)) {
                    NumberInputDialogFragment.this.h.setEnabled(false);
                } else {
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt < NumberInputDialogFragment.this.f11736b) {
                            NumberInputDialogFragment.this.g.setText(String.valueOf(NumberInputDialogFragment.this.f11736b));
                            NumberInputDialogFragment.this.g.setSelection(NumberInputDialogFragment.this.g.getText().length());
                        } else if (parseInt > NumberInputDialogFragment.this.f11737c) {
                            NumberInputDialogFragment.this.g.setText(String.valueOf(NumberInputDialogFragment.this.f11737c));
                            NumberInputDialogFragment.this.g.setSelection(NumberInputDialogFragment.this.g.getText().length());
                        }
                        NumberInputDialogFragment.this.h.setEnabled(true);
                    } catch (NumberFormatException unused) {
                        NumberInputDialogFragment.this.h.setEnabled(false);
                    }
                }
            }
        });
        this.h.setEnabled(false);
    }
}
