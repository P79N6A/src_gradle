package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.r;

public class ProfileEditSignatureFragment extends ProfileEditInputFragment implements r {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f62220c;

    /* renamed from: d  reason: collision with root package name */
    public String f62221d;

    /* renamed from: e  reason: collision with root package name */
    public a f62222e;

    /* renamed from: f  reason: collision with root package name */
    private ad f62223f;
    @BindView(2131497340)
    DmtStatusView mDmtStatusView;
    @BindView(2131494166)
    EditText mSignatureInput;
    @BindView(2131498146)
    TextView mSignatureLengthHint;

    public interface a {
        void a(String str);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62220c, false, 68814, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62220c, false, 68814, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (getActivity() instanceof EditSelfBriefActivity) {
            KeyboardUtils.c(this.mSignatureInput);
            this.mDmtStatusView.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f62220c, false, 68808, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62220c, false, 68808, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!(getActivity() instanceof EditSelfBriefActivity)) {
            return super.f();
        } else {
            if (e()) {
                new a.C0185a(getContext()).a((int) C0906R.string.c12, (DialogInterface.OnClickListener) new cz(this)).b((int) C0906R.string.aja, (DialogInterface.OnClickListener) new da(this)).b((int) C0906R.string.c1b).a().a();
            } else {
                KeyboardUtils.c(this.mSignatureInput);
                getActivity().finish();
            }
            return true;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62220c, false, 68811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62220c, false, 68811, new Class[0], Void.TYPE);
        } else if (getActivity() instanceof EditSelfBriefActivity) {
            String trim = this.mSignatureInput.getText().toString().trim();
            if (!TextUtils.equals(trim, d.a().getCurUser().getSignature())) {
                if (PatchProxy.isSupport(new Object[]{trim}, this, f62220c, false, 68810, new Class[]{String.class}, String.class)) {
                    trim = (String) PatchProxy.accessDispatch(new Object[]{trim}, this, f62220c, false, 68810, new Class[]{String.class}, String.class);
                } else {
                    while (trim.contains("\n\n")) {
                        trim = trim.replaceAll("\n\n", "\n");
                    }
                }
                int length = trim.length() - 1;
                if (length >= 0 && trim.charAt(length) == 10) {
                    trim = trim.substring(0, length);
                }
                this.f62223f.b(trim);
                this.mDmtStatusView.d();
            }
        } else {
            if (this.f62222e != null) {
                this.f62222e.a(this.mSignatureInput.getText().toString().trim());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface) {
        if (a()) {
            b();
        } else {
            dialogInterface.dismiss();
        }
    }

    public static ProfileEditSignatureFragment a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f62220c, true, 68805, new Class[]{String.class}, ProfileEditSignatureFragment.class)) {
            return (ProfileEditSignatureFragment) PatchProxy.accessDispatch(new Object[]{str2}, null, f62220c, true, 68805, new Class[]{String.class}, ProfileEditSignatureFragment.class);
        }
        ProfileEditSignatureFragment profileEditSignatureFragment = new ProfileEditSignatureFragment();
        Bundle bundle = new Bundle();
        bundle.putString("signature", str2);
        profileEditSignatureFragment.setArguments(bundle);
        return profileEditSignatureFragment;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62220c, false, 68806, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62220c, false, 68806, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f62221d = getArguments().getString("signature");
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62220c, false, 68809, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62220c, false, 68809, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i2 = 242 - i;
        if (i2 <= 10) {
            TextView textView = this.mSignatureLengthHint;
            if (i2 < 0) {
                i2 = 0;
            }
            textView.setText(String.valueOf(i2));
            this.mSignatureLengthHint.setVisibility(0);
            return;
        }
        this.mSignatureLengthHint.setVisibility(8);
    }

    public final void a(User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f62220c, false, 68812, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f62220c, false, 68812, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getActivity() instanceof EditSelfBriefActivity) {
            d.a().getCurUser().setSignature(user.getSignature());
            KeyboardUtils.c(this.mSignatureInput);
            this.mDmtStatusView.setVisibility(8);
            getActivity().finish();
        }
    }

    public final void a(Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, f62220c, false, 68813, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, f62220c, false, 68813, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getActivity() instanceof EditSelfBriefActivity) {
            KeyboardUtils.c(this.mSignatureInput);
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bsd);
            this.mDmtStatusView.setVisibility(8);
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62220c, false, 68815, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f62220c, false, 68815, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (getActivity() instanceof EditSelfBriefActivity) {
            KeyboardUtils.c(this.mSignatureInput);
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), str).a();
            this.mDmtStatusView.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62220c, false, 68807, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62220c, false, 68807, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.pq, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        this.h = (ButtonTitleBar) inflate.findViewById(C0906R.id.d3m);
        this.h.setTitle((CharSequence) getString(C0906R.string.a__));
        this.mSignatureInput.setText(this.f62221d);
        this.f62223f = new ad();
        this.f62223f.h = this;
        if (getActivity() instanceof EditSelfBriefActivity) {
            this.mDmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
        }
        if (this.f62221d != null) {
            i = this.f62221d.length();
        }
        this.mSignatureInput.setSelection(i);
        a(this.mSignatureInput.length());
        this.h.getStartBtn().setOnClickListener(new cx(this));
        this.h.getEndBtn().setOnClickListener(new cy(this));
        d();
        this.mSignatureInput.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62224a;

            /* renamed from: b  reason: collision with root package name */
            String f62225b = "";

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                if (PatchProxy.isSupport(new Object[]{editable}, this, f62224a, false, 68821, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f62224a, false, 68821, new Class[]{Editable.class}, Void.TYPE);
                } else if (ProfileEditSignatureFragment.this.mSignatureInput.getLineCount() > 11) {
                    String obj = editable.toString();
                    int selectionStart = ProfileEditSignatureFragment.this.mSignatureInput.getSelectionStart();
                    if (selectionStart != ProfileEditSignatureFragment.this.mSignatureInput.getSelectionEnd() || selectionStart >= obj.length() || selectionStart <= 0) {
                        str2 = obj.substring(0, editable.length() - 1);
                    } else {
                        str2 = obj.substring(0, selectionStart - 1) + obj.substring(selectionStart);
                    }
                    this.f62225b = str2;
                    ProfileEditSignatureFragment.this.mSignatureInput.setText(str2);
                    ProfileEditSignatureFragment.this.mSignatureInput.setSelection(ProfileEditSignatureFragment.this.mSignatureInput.getText().length());
                } else {
                    if (editable != null) {
                        str = editable.toString();
                    } else {
                        str = "";
                    }
                    this.f62225b = str;
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62224a, false, 68820, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62224a, false, 68820, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                ProfileEditSignatureFragment.this.a(ProfileEditSignatureFragment.this.mSignatureInput, 242);
                if (!TextUtils.equals(charSequence.toString(), ProfileEditSignatureFragment.this.f62221d)) {
                    ProfileEditSignatureFragment.this.c();
                } else {
                    ProfileEditSignatureFragment.this.d();
                }
                ProfileEditSignatureFragment.this.a(ProfileEditSignatureFragment.this.mSignatureInput.length());
            }
        });
        return inflate;
    }
}
