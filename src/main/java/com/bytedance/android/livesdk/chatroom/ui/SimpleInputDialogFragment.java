package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.livesdk.chatroom.event.u;
import com.bytedance.android.livesdk.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SimpleInputDialogFragment extends DialogFragment {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f11776d;

    /* renamed from: a  reason: collision with root package name */
    private final View.OnLayoutChangeListener f11777a = new View.OnLayoutChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11782a;

        /* renamed from: c  reason: collision with root package name */
        private float f11784c = -1.0f;

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f11782a, false, 6439, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f11782a, false, 6439, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (SimpleInputDialogFragment.this.i != null) {
                if (this.f11784c < 0.0f) {
                    this.f11784c = ((float) SimpleInputDialogFragment.this.getResources().getDisplayMetrics().heightPixels) * 0.75f;
                }
                if (((float) i9) < this.f11784c) {
                    if (!SimpleInputDialogFragment.this.f11780e) {
                        SimpleInputDialogFragment.this.f11780e = true;
                        SimpleInputDialogFragment.this.i.setVisibility(0);
                        SimpleInputDialogFragment.this.a(true, i8 - i9);
                    }
                } else if (SimpleInputDialogFragment.this.f11780e) {
                    SimpleInputDialogFragment.this.f11780e = false;
                    SimpleInputDialogFragment.this.i.setVisibility(4);
                    try {
                        SimpleInputDialogFragment.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    SimpleInputDialogFragment.this.a(false, 0);
                }
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private boolean f11778b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11779c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11780e = false;

    /* renamed from: f  reason: collision with root package name */
    public a f11781f = null;
    protected EditText g;
    protected View h;
    public View i;
    protected String j = null;
    protected int k = 0;
    protected boolean l = false;

    public interface a {
        void a(String str);

        void b(String str);
    }

    public boolean a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        if (isAdded()) {
            s.a(getContext(), this.g);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11776d, false, 6432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11776d, false, 6432, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            s.b(getContext(), this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        String str;
        if (this.f11781f != null) {
            if (this.g.getText() == null) {
                str = "";
            } else {
                str = this.g.getText().toString().trim();
            }
            this.f11781f.a(str);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f11776d, false, 6427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11776d, false, 6427, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.i.removeOnLayoutChangeListener(this.f11777a);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f11776d, false, 6428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11776d, false, 6428, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f11778b) {
            this.f11778b = false;
            b(200, 1, 5);
            return;
        }
        this.g.postDelayed(new ew(this), 50);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i2) {
        if (i2 != 6) {
            return false;
        }
        if (this.h.isEnabled()) {
            this.h.performClick();
        }
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11776d, false, 6431, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11776d, false, 6431, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        this.f11778b = this.f11780e;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11776d, false, 6433, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11776d, false, 6433, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (isAdded() && !TextUtils.isEmpty(str)) {
            this.g.setText(str);
            this.g.setSelection(str.length());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11776d, false, 6423, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11776d, false, 6423, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11776d, false, 6422, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11776d, false, 6422, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.j = getArguments().getString("live.intent.extra.HINT", null);
            this.k = getArguments().getInt("live.intent.extra.MAX_LENGTH", 0);
            this.l = getArguments().getBoolean("live.intent.extra.TOUCH_MODAL", false);
            this.f11779c = getArguments().getBoolean("live.intent.extra.IS_BROADCASTER", false);
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11776d, false, 6424, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f11776d, false, 6424, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (!this.f11779c && !g.a(getActivity())) {
                window.addFlags(1024);
            }
            if (!this.l) {
                window.addFlags(32);
                window.clearFlags(2);
            }
        }
        return onCreateDialog;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f11776d, false, 6430, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f11776d, false, 6430, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.f11781f != null) {
            if (this.g.getText() == null) {
                str = "";
            } else {
                str = this.g.getText().toString().trim();
            }
            this.f11781f.b(str);
            this.f11781f = null;
            this.f11780e = false;
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f11776d, false, 6426, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f11776d, false, 6426, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            a(getArguments().getString("live.intent.extra.INPUT"));
        }
        this.g.setOnEditorActionListener(new eu(this));
        this.h.setOnClickListener(new ev(this));
    }

    public void a(boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f11776d, false, 6434, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2)}, this, f11776d, false, 6434, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new u(i2, z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j2, int i2, int i3) {
        if (isResumed() && this.f11780e) {
            s.a(getContext(), this.g);
            b(j2, i2 + 1, i3);
        }
    }

    private void b(long j2, int i2, int i3) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11776d, false, 6429, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11776d, false, 6429, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.g != null && i2 <= i3) {
            EditText editText = this.g;
            ex exVar = new ex(this, j2, i2, i3);
            editText.postDelayed(exVar, j3);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        InputFilter[] inputFilterArr;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f11776d, false, 6425, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f11776d, false, 6425, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.i = LayoutInflater.from(getContext()).inflate(C0906R.layout.aii, viewGroup, false);
        this.i.addOnLayoutChangeListener(this.f11777a);
        this.g = (EditText) this.i.findViewById(C0906R.id.a30);
        this.h = this.i.findViewById(C0906R.id.cnp);
        KeyboardShadowView keyboardShadowView = (KeyboardShadowView) this.i.findViewById(C0906R.id.duk);
        if (a()) {
            keyboardShadowView.setActivity(getActivity());
        } else {
            keyboardShadowView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11785a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f11785a, false, 6440, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f11785a, false, 6440, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    SimpleInputDialogFragment.this.f11780e = false;
                    SimpleInputDialogFragment.this.i.setVisibility(4);
                    try {
                        SimpleInputDialogFragment.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    SimpleInputDialogFragment.this.a(false, 0);
                }
            });
        }
        this.g.setHint(this.j);
        if (this.k > 0) {
            InputFilter[] filters = this.g.getFilters();
            if (filters == null || filters.length == 0) {
                inputFilterArr = new InputFilter[1];
            } else {
                inputFilterArr = new InputFilter[(filters.length + 1)];
                for (int i2 = 0; i2 < filters.length; i2++) {
                    inputFilterArr[i2] = filters[i2];
                }
            }
            inputFilterArr[inputFilterArr.length - 1] = new InputFilter.LengthFilter(this.k);
            this.g.setFilters(inputFilterArr);
        }
        this.i.findViewById(C0906R.id.a31).getLayoutParams().width = getResources().getDisplayMetrics().widthPixels;
        return this.i;
    }
}
