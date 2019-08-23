package com.ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends AlertDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71277a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f71278b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f71279c;

    /* renamed from: d  reason: collision with root package name */
    public C0742a f71280d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f71281e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f71282f;
    public View g;
    private CharSequence h;
    private boolean i;
    private int j;
    private Drawable k;
    private String l;
    private long m;
    private int n = 100;
    private CircularProgressView o;
    private TextView p;
    private TextView q;
    private com.ss.android.ugc.aweme.share.viewmodel.a r;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$a  reason: collision with other inner class name */
    public interface C0742a {
        void a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        if (this.o == null) {
            this.o = (CircularProgressView) findViewById(C0906R.id.b2w);
        }
        this.o.b();
        super.dismiss();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71277a, false, 81201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71277a, false, 81201, new Class[0], Void.TYPE);
            return;
        }
        if (this.f71279c) {
            if (this.f71278b) {
                this.q.setVisibility(0);
                return;
            }
            this.q.setVisibility(4);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f71277a, false, 81196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71277a, false, 81196, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bVar.run();
        } else {
            com.ss.android.b.a.a.a.b(bVar);
        }
        this.r.a(false);
    }

    private a(Context context) {
        super(context, 3);
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71277a, false, 81199, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71277a, false, 81199, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f71279c) {
            this.o.setMaxProgress((float) i2);
        }
        this.n = i2;
    }

    public void setMessage(CharSequence charSequence) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f71277a, false, 81195, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f71277a, false, 81195, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.f71279c) {
            this.f71281e.setText(charSequence);
            TextView textView = this.f71281e;
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
        this.h = charSequence;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71277a, false, 81193, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71277a, false, 81193, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f71279c) {
            TextView textView = this.q;
            textView.setText(i2 + "%");
            this.o.setProgress((float) i2);
        }
        this.j = i2;
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71277a, false, 81194, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71277a, false, 81194, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f71279c) {
            this.o.setIndeterminate(z);
            TextView textView = this.q;
            if (z) {
                i2 = 4;
            }
            textView.setVisibility(i2);
        }
        this.i = z;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71277a, false, 81191, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71277a, false, 81191, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a2t);
        if (PatchProxy.isSupport(new Object[0], this, f71277a, false, 81192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71277a, false, 81192, new Class[0], Void.TYPE);
        } else {
            this.g = findViewById(C0906R.id.chu);
            this.f71281e = (TextView) findViewById(C0906R.id.bmn);
            this.o = (CircularProgressView) findViewById(C0906R.id.b2w);
            this.p = (TextView) findViewById(C0906R.id.d36);
            this.f71282f = (ImageView) findViewById(C0906R.id.q4);
            this.q = (TextView) findViewById(C0906R.id.c7k);
        }
        this.f71279c = true;
        this.r = com.ss.android.ugc.aweme.share.viewmodel.a.a(getContext());
        this.r.a(true);
        setMessage(this.h);
        a(this.i);
        b(this.n);
        a(this.j);
        String str = this.l;
        if (PatchProxy.isSupport(new Object[]{str}, this, f71277a, false, 81200, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f71277a, false, 81200, new Class[]{String.class}, Void.TYPE);
        } else {
            if (this.f71279c && this.p != null && !StringUtils.isEmpty(str)) {
                this.p.setText(str);
                UIUtils.setViewVisibility(this.p, 0);
            }
            this.l = str;
        }
        b();
        if (this.k != null) {
            Drawable drawable = this.k;
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f71277a, false, 81202, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f71277a, false, 81202, new Class[]{Drawable.class}, Void.TYPE);
            } else {
                if (this.f71279c) {
                    this.g.setBackground(new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(getContext(), 2130837823)}));
                }
                this.k = drawable;
            }
        }
        setOnKeyListener(this);
        this.m = System.currentTimeMillis();
    }

    public static a a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f71277a, true, 81197, new Class[]{Context.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f71277a, true, 81197, new Class[]{Context.class, String.class}, a.class);
        }
        a aVar = new a(context2);
        aVar.setCancelable(false);
        aVar.a(false);
        aVar.b(100);
        aVar.setMessage(str2);
        aVar.b();
        if ((context2 instanceof Activity) && ((!(context2 instanceof AbsActivity) || ((AbsActivity) context2).isActive()) && !((Activity) context2).isFinishing())) {
            aVar.show();
        }
        return aVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i2), keyEvent}, this, f71277a, false, 81204, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i2), keyEvent}, this, f71277a, false, 81204, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (i2 == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.m) / 1000);
            } catch (JSONException unused) {
            }
            n.a("ug_save_video_click_back", jSONObject);
        }
        return false;
    }

    public final void a(boolean z, float f2, Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{(byte) 1, Float.valueOf(f2), context2}, this, f71277a, false, 81203, new Class[]{Boolean.TYPE, Float.TYPE, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1, Float.valueOf(f2), context2}, this, f71277a, false, 81203, new Class[]{Boolean.TYPE, Float.TYPE, Context.class}, Void.TYPE);
            return;
        }
        if (this.f71279c) {
            final ImageView imageView = (ImageView) findViewById(C0906R.id.q4);
            if (imageView != null) {
                float f3 = f2;
                imageView.setAlpha(f2);
                imageView.setVisibility(0);
                View findViewById = findViewById(C0906R.id.a22);
                if (findViewById != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 1;
                    layoutParams.setMargins(0, 0, 0, (int) UIUtils.dip2Px(context2, 10.0f));
                    findViewById.setLayoutParams(layoutParams);
                }
                imageView.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71283a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f71283a, false, 81207, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f71283a, false, 81207, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        imageView.setAlpha(0.5f);
                        if (a.this.f71280d != null) {
                            a.this.f71280d.a();
                        }
                    }
                });
            }
        }
    }
}
