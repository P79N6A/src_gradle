package com.ss.android.ugc.aweme.share.basic.texttoken;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TextTokenDialogDelegate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64725a;

    /* renamed from: f  reason: collision with root package name */
    private static Typeface f64726f;

    /* renamed from: b  reason: collision with root package name */
    public Activity f64727b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f64728c;

    /* renamed from: d  reason: collision with root package name */
    public Button f64729d;

    /* renamed from: e  reason: collision with root package name */
    public String f64730e;
    private int g;
    @BindView(2131497544)
    public TextView mTextTokenTextView;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64725a, false, 73427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64725a, false, 73427, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.mTextTokenTextView;
        if (PatchProxy.isSupport(new Object[]{textView}, null, f64725a, true, 73433, new Class[]{TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView}, null, f64725a, true, 73433, new Class[]{TextView.class}, Void.TYPE);
        } else {
            if (f64726f == null) {
                try {
                    f64726f = Typeface.createFromAsset(textView.getContext().getAssets(), "DINCond-BoldAlternate.otf");
                } catch (Exception unused) {
                }
            }
            if (f64726f != null) {
                textView.setTypeface(f64726f);
            }
        }
        b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64725a, false, 73428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64725a, false, 73428, new Class[0], Void.TYPE);
            return;
        }
        this.f64728c.setText(C0906R.string.b3b);
        this.f64728c.setTextColor(this.f64727b.getResources().getColor(C0906R.color.i1));
        this.f64729d.setEnabled(false);
        this.f64729d.setText(this.f64727b.getResources().getString(C0906R.string.b37, new Object[]{this.f64730e}));
    }

    public TextTokenDialogDelegate(Dialog dialog, Activity activity, Button button, TextView textView, int i, String str) {
        ButterKnife.bind((Object) this, dialog);
        this.f64727b = activity;
        this.f64729d = button;
        this.f64728c = textView;
        this.g = i;
        this.f64730e = str;
    }
}
