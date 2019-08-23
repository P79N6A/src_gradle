package com.ss.android.ugc.aweme.share.invitefriends.textcode;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.basic.texttoken.TextTokenDialogDelegate;
import com.ss.android.ugc.aweme.share.c.h;
import com.ss.android.ugc.aweme.share.c.i;
import com.ss.android.ugc.aweme.share.invitefriends.textcode.a;
import com.ss.android.ugc.aweme.u.ae;
import java.util.Map;

public class InviteFriendsWithTextTokenDialog extends BottomSheetDialog implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65168a;

    /* renamed from: b  reason: collision with root package name */
    public a.C0703a f65169b;

    /* renamed from: c  reason: collision with root package name */
    private TextTokenDialogDelegate f65170c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f65171d;

    /* renamed from: e  reason: collision with root package name */
    private a f65172e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f65173f;
    @BindView(2131494950)
    AvatarWithBorderView mAvatarImageView;
    @BindView(2131493938)
    Button mConfirmButton;
    @BindView(2131493914)
    TextView mDescriptionTextView;
    @BindView(2131497544)
    TextView mTextTokenTextView;
    @BindView(2131497590)
    TextView mTitleTextView;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f65178a;

        /* renamed from: b  reason: collision with root package name */
        public String f65179b;

        /* renamed from: c  reason: collision with root package name */
        public String f65180c;
    }

    public final boolean c() {
        return this.f65171d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65168a, false, 73606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65168a, false, 73606, new Class[0], Void.TYPE);
            return;
        }
        this.f65170c.b();
        this.mTextTokenTextView.setAlpha(0.34f);
    }

    @OnClick({2131493574})
    public void onCloseClick() {
        if (PatchProxy.isSupport(new Object[0], this, f65168a, false, 73612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65168a, false, 73612, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f65168a, false, 73613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65168a, false, 73613, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f65171d = false;
    }

    @OnClick({2131493938})
    public void onConfirmClick() {
        if (PatchProxy.isSupport(new Object[0], this, f65168a, false, 73611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65168a, false, 73611, new Class[0], Void.TYPE);
        } else if (this.f65169b.b()) {
            new h(this.f65173f).a(this.f65172e.f65178a).a().a(this.f65169b.c()).c().a();
            dismiss();
        } else {
            this.f65169b.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65168a, false, 73607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65168a, false, 73607, new Class[0], Void.TYPE);
            return;
        }
        TextTokenDialogDelegate textTokenDialogDelegate = this.f65170c;
        if (PatchProxy.isSupport(new Object[0], textTokenDialogDelegate, TextTokenDialogDelegate.f64725a, false, 73429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], textTokenDialogDelegate, TextTokenDialogDelegate.f64725a, false, 73429, new Class[0], Void.TYPE);
        } else {
            textTokenDialogDelegate.f64728c.setText(C0906R.string.b3_);
            textTokenDialogDelegate.f64728c.setTextColor(textTokenDialogDelegate.f64727b.getResources().getColor(C0906R.color.i1));
            textTokenDialogDelegate.f64729d.setEnabled(true);
            textTokenDialogDelegate.f64729d.setText(textTokenDialogDelegate.f64727b.getResources().getString(C0906R.string.b37, new Object[]{textTokenDialogDelegate.f64730e}));
        }
        this.mTextTokenTextView.setAlpha(1.0f);
        r.a("qr_code_generate", (Map) new d().a("enter_from", this.f65172e.f65180c).a("platform", i.a(this.f65172e.f65178a)).a("qr_code_type", "code").f34114b);
        new ae().a(this.f65172e.f65180c).b(i.a(this.f65172e.f65178a)).c("code").e();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65168a, false, 73609, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f65168a, false, 73609, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TextTokenDialogDelegate textTokenDialogDelegate = this.f65170c;
        if (PatchProxy.isSupport(new Object[]{str2}, textTokenDialogDelegate, TextTokenDialogDelegate.f64725a, false, 73431, new Class[]{String.class}, Void.TYPE)) {
            TextTokenDialogDelegate textTokenDialogDelegate2 = textTokenDialogDelegate;
            PatchProxy.accessDispatch(new Object[]{str2}, textTokenDialogDelegate2, TextTokenDialogDelegate.f64725a, false, 73431, new Class[]{String.class}, Void.TYPE);
            return;
        }
        textTokenDialogDelegate.mTextTokenTextView.setText(str2);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65168a, false, 73610, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f65168a, false, 73610, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TextTokenDialogDelegate textTokenDialogDelegate = this.f65170c;
        if (PatchProxy.isSupport(new Object[]{str2}, textTokenDialogDelegate, TextTokenDialogDelegate.f64725a, false, 73432, new Class[]{String.class}, Void.TYPE)) {
            TextTokenDialogDelegate textTokenDialogDelegate2 = textTokenDialogDelegate;
            PatchProxy.accessDispatch(new Object[]{str2}, textTokenDialogDelegate2, TextTokenDialogDelegate.f64725a, false, 73432, new Class[]{String.class}, Void.TYPE);
            return;
        }
        textTokenDialogDelegate.mTextTokenTextView.setText(str2);
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f65168a, false, 73608, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f65168a, false, 73608, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        TextTokenDialogDelegate textTokenDialogDelegate = this.f65170c;
        if (PatchProxy.isSupport(new Object[0], textTokenDialogDelegate, TextTokenDialogDelegate.f64725a, false, 73430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], textTokenDialogDelegate, TextTokenDialogDelegate.f64725a, false, 73430, new Class[0], Void.TYPE);
        } else {
            textTokenDialogDelegate.f64728c.setText(C0906R.string.b3a);
            textTokenDialogDelegate.f64728c.setTextColor(textTokenDialogDelegate.f64727b.getResources().getColor(C0906R.color.ix));
            textTokenDialogDelegate.mTextTokenTextView.setText(C0906R.string.c6l);
            textTokenDialogDelegate.f64729d.setEnabled(true);
            textTokenDialogDelegate.f64729d.setText(C0906R.string.c02);
        }
        this.mTextTokenTextView.setAlpha(1.0f);
        if (th2 != null) {
            com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), th2);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65168a, false, 73604, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65168a, false, 73604, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.jf);
        ButterKnife.bind((Dialog) this);
        TextTokenDialogDelegate textTokenDialogDelegate = new TextTokenDialogDelegate(this, this.f65173f, this.mConfirmButton, this.mDescriptionTextView, this.f65172e.f65178a, this.f65172e.f65179b);
        this.f65170c = textTokenDialogDelegate;
        if (PatchProxy.isSupport(new Object[0], this, f65168a, false, 73605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65168a, false, 73605, new Class[0], Void.TYPE);
        } else {
            int screenHeight = UIUtils.getScreenHeight(getContext()) - UIUtils.getStatusBarHeight(getContext());
            Window window = getWindow();
            if (window != null) {
                if (screenHeight == 0) {
                    screenHeight = -1;
                }
                window.setLayout(-1, screenHeight);
                window.setGravity(80);
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.gravity = 80;
                getWindow().setAttributes(attributes);
                window.findViewById(C0906R.id.a3z).setBackgroundDrawable(new ColorDrawable(0));
                setCanceledOnTouchOutside(true);
            }
            setOnShowListener(new DialogInterface.OnShowListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65174a;

                public final void onShow(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f65174a, false, 73614, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f65174a, false, 73614, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    InviteFriendsWithTextTokenDialog.this.f65169b.a();
                }
            });
            setOnDismissListener(new DialogInterface.OnDismissListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65176a;

                public final void onDismiss(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f65176a, false, 73615, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f65176a, false, 73615, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    InviteFriendsWithTextTokenDialog.this.f65169b.d();
                }
            });
            c.b(this.mAvatarImageView, com.ss.android.ugc.aweme.account.d.a().getCurUser().getAvatarThumb());
            this.mTitleTextView.setText(getContext().getString(C0906R.string.b3c, new Object[]{this.f65172e.f65179b}));
            this.f65170c.a();
        }
        this.f65171d = true;
        this.f65169b = new c(this);
    }

    public InviteFriendsWithTextTokenDialog(@NonNull Activity activity, a aVar) {
        super(activity, C0906R.style.rd);
        this.f65173f = activity;
        this.f65172e = aVar;
    }
}
