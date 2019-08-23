package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
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

public class ProfileEditNicknameFragment extends ProfileEditInputFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f62207c;

    /* renamed from: d  reason: collision with root package name */
    public String f62208d;

    /* renamed from: e  reason: collision with root package name */
    public a f62209e;
    @BindView(2131494987)
    ImageView mClearAllBtn;
    @BindView(2131494160)
    EditText mNicknameInput;
    @BindView(2131498146)
    TextView mNicknameLengthHint;

    public interface a {
        void a(String str);
    }

    @OnClick({2131494987})
    public void onClearInput() {
        if (PatchProxy.isSupport(new Object[0], this, f62207c, false, 68795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62207c, false, 68795, new Class[0], Void.TYPE);
            return;
        }
        this.mNicknameInput.setText("");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62207c, false, 68796, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62207c, false, 68796, new Class[0], Void.TYPE);
            return;
        }
        if (this.f62209e != null) {
            this.f62209e.a(this.mNicknameInput.getText().toString().trim());
            if (PatchProxy.isSupport(new Object[0], this, ProfileDetailEditFragment.f62133a, false, 68660, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, ProfileDetailEditFragment.f62133a, false, 68660, new Class[0], Void.TYPE);
            } else if (this.f62134b != null) {
                this.f62134b.a();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62207c, false, 68793, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62207c, false, 68793, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f62208d = getArguments().getString("old_nickname");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62207c, false, 68794, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62207c, false, 68794, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.pp, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f62207c, false, 68797, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f62207c, false, 68797, new Class[]{View.class}, Void.TYPE);
        } else {
            this.h = (ButtonTitleBar) inflate.findViewById(C0906R.id.d3m);
            this.h.setTitle((int) C0906R.string.a_e);
            if (this.f62208d != null) {
                this.mNicknameInput.setText(this.f62208d);
            }
            this.mNicknameInput.setSelection(this.mNicknameInput.getText().length());
            this.mNicknameInput.addTextChangedListener(new TextWatcher() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62210a;

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (PatchProxy.isSupport(new Object[]{editable}, this, f62210a, false, 68801, new Class[]{Editable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{editable}, this, f62210a, false, 68801, new Class[]{Editable.class}, Void.TYPE);
                    } else if (editable.length() > 0) {
                        if (!TextUtils.equals(editable.toString(), ProfileEditNicknameFragment.this.f62208d)) {
                            ProfileEditNicknameFragment.this.c();
                        } else {
                            ProfileEditNicknameFragment.this.d();
                        }
                        ProfileEditNicknameFragment.this.mClearAllBtn.setVisibility(0);
                    } else {
                        ProfileEditNicknameFragment.this.d();
                        ProfileEditNicknameFragment.this.mClearAllBtn.setVisibility(8);
                    }
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62210a, false, 68800, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62210a, false, 68800, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    ProfileEditNicknameFragment.this.a(ProfileEditNicknameFragment.this.mNicknameInput, 20);
                    ProfileEditNicknameFragment.this.mNicknameLengthHint.setText(ProfileEditNicknameFragment.this.getString(C0906R.string.s2, Integer.valueOf(ProfileEditNicknameFragment.this.mNicknameInput.length()), 20));
                }
            });
            TextView textView = this.mNicknameLengthHint;
            Object[] objArr = new Object[2];
            if (TextUtils.isEmpty(this.f62208d)) {
                i = 0;
            } else {
                i = this.f62208d.length();
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = 20;
            textView.setText(getString(C0906R.string.s2, objArr));
            this.h.getStartBtn().setOnClickListener(new cv(this));
            this.h.getEndBtn().setOnClickListener(new cw(this));
            d();
            this.mNicknameInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62212a;

                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f62212a, false, 68802, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f62212a, false, 68802, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                    } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                        return false;
                    } else {
                        return true;
                    }
                }
            });
        }
        return inflate;
    }
}
