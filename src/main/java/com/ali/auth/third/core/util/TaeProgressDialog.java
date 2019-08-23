package com.ali.auth.third.core.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class TaeProgressDialog extends ProgressDialog {

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f4991a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f4992b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f4993c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4994d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4995e;

    public TaeProgressDialog(Context context) {
        super(context);
    }

    public TaeProgressDialog(Context context, int i) {
        super(context, i);
    }

    private void a() {
        this.f4992b.setText(this.f4993c);
        int i = 8;
        if (this.f4993c == null || "".equals(this.f4993c)) {
            this.f4992b.setVisibility(8);
        }
        ProgressBar progressBar = this.f4991a;
        if (this.f4995e) {
            i = 0;
        }
        progressBar.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ResourceUtils.getIdentifier("layout", "com_taobao_tae_sdk_progress_dialog"));
        getWindow().setBackgroundDrawableResource(17170445);
        this.f4991a = (ProgressBar) findViewById(16908301);
        this.f4992b = (TextView) findViewById(ResourceUtils.getIdentifier("id", "com_taobao_tae_sdk_progress_dialog_message"));
        a();
        setIndeterminate(this.f4994d);
    }

    public void setIndeterminate(boolean z) {
        if (this.f4991a != null) {
            this.f4991a.setIndeterminate(z);
        } else {
            this.f4994d = z;
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.f4993c = charSequence;
    }

    public void setProgressVisiable(boolean z) {
        this.f4995e = z;
    }
}
