package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.d.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.presenter.u;
import com.ss.android.ugc.aweme.profile.s;
import com.ss.android.ugc.aweme.utils.ex;

public abstract class UpdateUserInfoDialog extends AppCompatDialog implements r {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f62375d;

    /* renamed from: e  reason: collision with root package name */
    s f62376e;

    /* renamed from: f  reason: collision with root package name */
    protected ad f62377f;
    protected User g;
    boolean h;
    @BindView(2131493585)
    ImageView mClose;
    @BindView(2131493727)
    TextView mConfirmUpdate;
    @BindView(2131495892)
    EditText mNickNameEditText;

    public final void a(boolean z) {
    }

    public abstract void c();

    public abstract int d();

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62375d, false, 69077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62375d, false, 69077, new Class[0], Void.TYPE);
            return;
        }
        this.g = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        this.f62376e = new s();
    }

    /* access modifiers changed from: package-private */
    public final String f() {
        if (PatchProxy.isSupport(new Object[0], this, f62375d, false, 69081, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f62375d, false, 69081, new Class[0], String.class);
        }
        String string = d.a().getString(C0906R.string.c3b);
        String str = (String) SharePrefCache.inst().getUpdateUserTipContent().c();
        if (TextUtils.isEmpty(str)) {
            str = o.b(C0906R.string.a4b);
        }
        return str + string;
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62375d, false, 69079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62375d, false, 69079, new Class[0], Void.TYPE);
            return;
        }
        this.mConfirmUpdate.setOnClickListener(new eb(this));
        this.mClose.setOnClickListener(new ec(this));
        if (PatchProxy.isSupport(new Object[0], this, f62375d, false, 69080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62375d, false, 69080, new Class[0], Void.TYPE);
            return;
        }
        String i = ex.i(this.g);
        this.mNickNameEditText.setText(i);
        if (!TextUtils.isEmpty(i)) {
            this.mNickNameEditText.setSelection(i.length());
        }
        this.mNickNameEditText.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62378a;

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62378a, false, 69090, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62378a, false, 69090, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                UpdateUserInfoDialog updateUserInfoDialog = UpdateUserInfoDialog.this;
                EditText editText = UpdateUserInfoDialog.this.mNickNameEditText;
                if (PatchProxy.isSupport(new Object[]{editText, 20}, updateUserInfoDialog, UpdateUserInfoDialog.f62375d, false, 69087, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr = {editText, 20};
                    ChangeQuickRedirect changeQuickRedirect = UpdateUserInfoDialog.f62375d;
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    PatchProxy.accessDispatch(objArr, updateUserInfoDialog, changeQuickRedirect2, false, 69087, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Editable text = editText.getText();
                if (text.length() > 20) {
                    a.b(d.a(), d.a().getString(C0906R.string.bau, new Object[]{"20"})).a();
                    int selectionEnd = Selection.getSelectionEnd(text);
                    editText.setText(text.toString().substring(0, 20));
                    Editable text2 = editText.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f62375d, false, 69086, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f62375d, false, 69086, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!m.a(str)) {
            a.c(d.a(), (int) C0906R.string.bgz).a();
            return true;
        } else if (str.length() <= 20) {
            return false;
        } else {
            a.b(d.a(), d.a().getString(C0906R.string.bau, new Object[]{"20"})).a();
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62375d, false, 69076, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62375d, false, 69076, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(d());
        ButterKnife.bind((Dialog) this);
        a();
        b();
        if (PatchProxy.isSupport(new Object[0], this, f62375d, false, 69078, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62375d, false, 69078, new Class[0], Void.TYPE);
            return;
        }
        this.f62377f = new ad();
        this.f62377f.h = this;
    }

    UpdateUserInfoDialog(Context context, boolean z) {
        super(context);
        this.h = z;
    }

    public final void a(Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, f62375d, false, 69084, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, f62375d, false, 69084, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.c(d.a(), (int) C0906R.string.dof).a();
    }

    public final void a(User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f62375d, false, 69082, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f62375d, false, 69082, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dismiss();
        a.c(d.a(), (int) C0906R.string.dog).a();
        if (PatchProxy.isSupport(new Object[0], this, f62375d, false, 69083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62375d, false, 69083, new Class[0], Void.TYPE);
            return;
        }
        new u().a(new Object[0]);
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62375d, false, 69085, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f62375d, false, 69085, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.c(d.a(), str2).a();
    }
}
