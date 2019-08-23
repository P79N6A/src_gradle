package com.bytedance.android.livesdk.chatroom.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class h extends Dialog implements a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13490a;

    /* renamed from: b  reason: collision with root package name */
    boolean f13491b;

    /* renamed from: c  reason: collision with root package name */
    int[] f13492c;

    /* renamed from: d  reason: collision with root package name */
    View f13493d;

    /* renamed from: e  reason: collision with root package name */
    TextView f13494e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13495f;
    private Spannable g;
    private Handler h = new a(this);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13490a, false, 7839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13490a, false, 7839, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f13495f) {
            this.h.removeMessages(0);
            this.h.sendEmptyMessageDelayed(0, 3000);
        }
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13490a, false, 7840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13490a, false, 7840, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f13491b = true;
        if (!this.f13495f) {
            this.h.sendEmptyMessageDelayed(0, 3000);
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13490a, false, 7841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13490a, false, 7841, new Class[0], Void.TYPE);
            return;
        }
        this.f13491b = false;
        this.h.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    public final void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f13490a, false, 7838, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f13490a, false, 7838, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 0) {
            if (this.f13491b) {
                dismiss();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13490a, false, 7836, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13490a, false, 7836, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.ag2);
        if (getWindow() != null) {
            getWindow().setFlags(1024, 1024);
            getWindow().setLayout(-1, -1);
            getWindow().setGravity(80);
        }
        findViewById(C0906R.id.y9).setOnClickListener(new i(this));
        this.f13493d = findViewById(C0906R.id.fv);
        this.f13494e = (TextView) findViewById(C0906R.id.d35);
        this.f13494e.setText(this.g);
        this.f13494e.post(new j(this));
    }

    public h(@NonNull Context context, boolean z, Spannable spannable, int[] iArr) {
        super(context, C0906R.style.vp);
        this.f13495f = z;
        this.g = spannable;
        this.f13492c = iArr;
    }
}
