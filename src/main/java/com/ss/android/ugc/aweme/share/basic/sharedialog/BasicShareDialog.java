package com.ss.android.ugc.aweme.share.basic.sharedialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Window;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class BasicShareDialog<T extends Activity> extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64712a;

    /* renamed from: b  reason: collision with root package name */
    protected T f64713b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f64714c;

    public int a() {
        return C0906R.style.r9;
    }

    public void b() {
    }

    @OnClick({2131493210})
    @Optional
    public void onBackClick() {
        if (PatchProxy.isSupport(new Object[0], this, f64712a, false, 73423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64712a, false, 73423, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f64712a, false, 73422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64712a, false, 73422, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.f64714c = false;
    }

    @OnClick({2131497689})
    public void onTouchOutside() {
        if (PatchProxy.isSupport(new Object[0], this, f64712a, false, 73421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64712a, false, 73421, new Class[0], Void.TYPE);
            return;
        }
        if (isShowing()) {
            cancel();
        }
    }

    public BasicShareDialog(@NonNull T t) {
        super(t, C0906R.style.tx);
        this.f64713b = t;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64712a, false, 73419, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64712a, false, 73419, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.h8);
        ButterKnife.bind((Dialog) this);
        if (PatchProxy.isSupport(new Object[0], this, f64712a, false, 73420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64712a, false, 73420, new Class[0], Void.TYPE);
        } else {
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(a());
                window.setLayout(-1, -1);
            }
        }
        b();
        this.f64714c = true;
    }
}
