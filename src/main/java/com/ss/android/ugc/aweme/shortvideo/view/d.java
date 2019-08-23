package com.ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.ProgressDialog;
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
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f71293b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f71294a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f71295c = true;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f71296d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f71297e;

    /* renamed from: f  reason: collision with root package name */
    private String f71298f;
    private long g;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(C0906R.id.b2w);
        if (circularProgressView != null) {
            circularProgressView.b();
        }
        super.dismiss();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71293b, false, 81220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71293b, false, 81220, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.c7k);
        if (findViewById != null) {
            if (this.f71295c) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f71293b, false, 81216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71293b, false, 81216, new Class[0], Void.TYPE);
            return;
        }
        e eVar = new e(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eVar.run();
        } else {
            a.b(eVar);
        }
    }

    public d(Context context) {
        super(context, 3);
    }

    public void setIndeterminate(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71293b, false, 81214, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71293b, false, 81214, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setIndeterminate(z);
        if (this.f71294a) {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(C0906R.id.b2w);
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(C0906R.id.c7k);
            if (z) {
                i = 4;
            }
            textView.setVisibility(i);
        }
    }

    public void setMessage(CharSequence charSequence) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f71293b, false, 81215, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f71293b, false, 81215, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        super.setMessage(charSequence);
        if (this.f71294a) {
            TextView textView = (TextView) findViewById(C0906R.id.bmn);
            if (textView != null) {
                textView.setText(charSequence);
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                }
                textView.setVisibility(i);
            }
        }
        this.f71296d = charSequence;
    }

    public void setProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71293b, false, 81212, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71293b, false, 81212, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setProgress(i);
        TextView textView = (TextView) findViewById(C0906R.id.c7k);
        if (textView != null) {
            textView.setText(i + "%");
        }
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(C0906R.id.b2w);
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71293b, false, 81211, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71293b, false, 81211, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a2v);
        this.f71294a = true;
        setMessage(this.f71296d);
        setIndeterminate(false);
        String str = this.f71298f;
        if (PatchProxy.isSupport(new Object[]{str}, this, f71293b, false, 81219, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f71293b, false, 81219, new Class[]{String.class}, Void.TYPE);
        } else {
            if (this.f71294a) {
                TextView textView = (TextView) findViewById(C0906R.id.d36);
                if (textView != null && !StringUtils.isEmpty(str)) {
                    textView.setText(str);
                    UIUtils.setViewVisibility(textView, 0);
                }
            }
            this.f71298f = str;
        }
        if (this.f71297e != null) {
            Drawable drawable = this.f71297e;
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f71293b, false, 81221, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f71293b, false, 81221, new Class[]{Drawable.class}, Void.TYPE);
            } else {
                if (this.f71294a) {
                    View findViewById = findViewById(C0906R.id.chu);
                    if (findViewById != null) {
                        findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(getContext(), 2130837823)}));
                    }
                }
                this.f71297e = drawable;
            }
        }
        setOnKeyListener(this);
        this.g = System.currentTimeMillis();
    }

    public d(Context context, byte b2) {
        super(context, 3);
    }

    public static d b(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f71293b, true, 81217, new Class[]{Context.class, String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f71293b, true, 81217, new Class[]{Context.class, String.class}, d.class);
        }
        d dVar = new d(context2, (byte) 0);
        dVar.setCancelable(false);
        dVar.setIndeterminate(false);
        dVar.setMax(100);
        if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
            dVar.show();
        }
        dVar.setMessage(str2);
        dVar.a();
        return dVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f71293b, false, 81222, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f71293b, false, 81222, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.g) / 1000);
            } catch (JSONException unused) {
            }
            n.a("ug_save_video_click_back", jSONObject);
        }
        return false;
    }
}
