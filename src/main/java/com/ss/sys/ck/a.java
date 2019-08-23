package com.ss.sys.ck;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends AlertDialog {

    /* renamed from: a  reason: collision with root package name */
    public C0838a f78532a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f78533b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f78534c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ScrollView f78535d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f78536e;

    /* renamed from: f  reason: collision with root package name */
    private Button f78537f;
    private Button g;
    private String h = "";
    private String i = "";
    private String j = "";

    /* renamed from: com.ss.sys.ck.a$a  reason: collision with other inner class name */
    public interface C0838a {
        void a();

        void b();
    }

    public a(Context context, String str, String str2, String str3) {
        super(context, C0906R.style.ug);
        setCanceledOnTouchOutside(false);
        this.f78533b = context;
        this.h = str;
        this.i = str2;
        this.j = str3;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0906R.layout.ex);
        this.f78534c = (TextView) findViewById(C0906R.id.eb);
        this.f78535d = (ScrollView) findViewById(C0906R.id.e_);
        this.f78536e = (TextView) findViewById(C0906R.id.e9);
        this.f78537f = (Button) findViewById(C0906R.id.ea);
        this.g = (Button) findViewById(C0906R.id.e8);
        if (!TextUtils.isEmpty(this.h)) {
            this.f78536e.setText(this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.f78537f.setText(this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            this.g.setText(this.j);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.f78536e.setLayoutParams(layoutParams);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f78533b).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.widthPixels <= 480) {
            this.f78536e.setTextSize(15.0f);
        }
        final int i2 = displayMetrics.heightPixels;
        this.f78535d.post(new Runnable() {
            public final void run() {
                ScrollView a2;
                LinearLayout.LayoutParams layoutParams;
                new StringBuilder("mMsgScroll.getMeasuredHeight()=").append(a.this.f78535d.getMeasuredHeight());
                if (a.this.f78535d.getMeasuredHeight() > i2 / 2) {
                    a2 = a.this.f78535d;
                    layoutParams = new LinearLayout.LayoutParams(displayMetrics.widthPixels - (a.this.f78533b.getResources().getDimensionPixelOffset(C0906R.dimen.br) * 2), i2 / 2);
                } else {
                    a2 = a.this.f78535d;
                    layoutParams = new LinearLayout.LayoutParams(displayMetrics.widthPixels - (a.this.f78533b.getResources().getDimensionPixelOffset(C0906R.dimen.br) * 2), -2);
                }
                a2.setLayoutParams(layoutParams);
            }
        });
        this.f78537f.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                a.this.dismiss();
                if (a.this.f78532a != null) {
                    a.this.f78532a.b();
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                a.this.dismiss();
                if (a.this.f78532a != null) {
                    a.this.f78532a.a();
                }
            }
        });
    }
}
