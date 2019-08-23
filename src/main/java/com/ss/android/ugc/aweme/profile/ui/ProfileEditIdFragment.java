package com.ss.android.ugc.aweme.profile.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.cc;

public class ProfileEditIdFragment extends ProfileEditInputFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f62185c;

    /* renamed from: d  reason: collision with root package name */
    public String f62186d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f62187e;

    /* renamed from: f  reason: collision with root package name */
    public a f62188f;
    @BindView(2131494987)
    ImageView mClearAllBtn;
    @BindView(2131493778)
    TextView mCopyButton;
    @BindView(2131497957)
    TextView mIdEditHintText;
    @BindView(2131494157)
    EditText mIdInput;

    public interface a {
        void a(String str);
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f62185c, false, 68762, new Class[0], Boolean.TYPE)) {
            return cc.a(this.mIdInput.getText().toString(), getContext());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62185c, false, 68762, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62185c, false, 68763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62185c, false, 68763, new Class[0], Void.TYPE);
            return;
        }
        if (this.f62188f != null) {
            this.f62188f.a(this.mIdInput.getText().toString());
        }
    }

    @OnClick({2131494987})
    public void onClearInput() {
        if (PatchProxy.isSupport(new Object[0], this, f62185c, false, 68760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62185c, false, 68760, new Class[0], Void.TYPE);
            return;
        }
        this.mIdInput.setText("");
    }

    @OnClick({2131493778})
    public void copyId() {
        if (PatchProxy.isSupport(new Object[0], this, f62185c, false, 68761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62185c, false, 68761, new Class[0], Void.TYPE);
            return;
        }
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setText(this.mIdInput.getText());
        com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.ao3).a();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62185c, false, 68758, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62185c, false, 68758, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f62186d = getArguments().getString("douyin_id");
            this.f62187e = getArguments().getBoolean("is_id_edited");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62185c, false, 68759, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62185c, false, 68759, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.pn, viewGroup2, false);
        this.h = (ButtonTitleBar) inflate.findViewById(C0906R.id.d3m);
        this.h.setTitle((CharSequence) getString(C0906R.string.a_c));
        ButterKnife.bind((Object) this, inflate);
        this.mIdInput.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62189a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f62189a, false, 68767, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f62189a, false, 68767, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                if (ProfileEditIdFragment.this.f62187e) {
                    if (editable.length() > 0) {
                        if (!TextUtils.equals(editable.toString(), ProfileEditIdFragment.this.f62186d)) {
                            ProfileEditIdFragment.this.c();
                        } else {
                            ProfileEditIdFragment.this.d();
                        }
                        ProfileEditIdFragment.this.mClearAllBtn.setVisibility(0);
                        return;
                    }
                    ProfileEditIdFragment.this.d();
                    ProfileEditIdFragment.this.mClearAllBtn.setVisibility(8);
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62189a, false, 68766, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62189a, false, 68766, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                ProfileEditIdFragment.this.a(ProfileEditIdFragment.this.mIdInput, 16);
            }
        });
        this.mIdInput.setText(this.f62186d);
        this.mIdInput.setSelection(this.mIdInput.getText().length());
        this.h.getStartBtn().setOnClickListener(new cn(this));
        this.h.getEndBtn().setOnClickListener(new co(this));
        if (!this.f62187e) {
            if (PatchProxy.isSupport(new Object[0], this, f62185c, false, 68756, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f62185c, false, 68756, new Class[0], Void.TYPE);
            } else {
                this.mIdInput.setEnabled(false);
                this.mIdInput.setFocusable(false);
                this.mIdInput.setFocusableInTouchMode(false);
            }
            this.mClearAllBtn.setVisibility(8);
            this.mCopyButton.setVisibility(0);
            this.mIdEditHintText.setText(getString(C0906R.string.ao0));
            if (PatchProxy.isSupport(new Object[0], this, ProfileEditInputFragment.g, false, 68773, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, ProfileEditInputFragment.g, false, 68773, new Class[0], Void.TYPE);
            } else {
                d();
                this.h.getEndBtn().setVisibility(8);
            }
        } else {
            this.mCopyButton.setVisibility(8);
            this.mIdEditHintText.setText(getString(C0906R.string.ao7));
            d();
        }
        return inflate;
    }
}
