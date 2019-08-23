package com.bytedance.android.livesdk.h;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public final class c extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15502a;

    /* renamed from: b  reason: collision with root package name */
    public View f15503b;

    /* renamed from: c  reason: collision with root package name */
    private View f15504c;

    /* renamed from: d  reason: collision with root package name */
    private View f15505d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f15506e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private Runnable f15507f = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15508a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f15508a, false, 9169, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f15508a, false, 9169, new Class[0], Void.TYPE);
                return;
            }
            c.this.dismiss();
        }
    };
    private List<ViewPropertyAnimator> g = new ArrayList();

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f15502a, false, 9167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15502a, false, 9167, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (isShowing()) {
            dismiss();
        }
        if (this.f15506e != null) {
            this.f15506e.removeCallbacks(this.f15507f);
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f15502a, false, 9166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15502a, false, 9166, new Class[0], Void.TYPE);
            return;
        }
        for (ViewPropertyAnimator next : this.g) {
            if (next != null) {
                next.cancel();
            }
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, d.f15515a, true, 9173, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, d.f15515a, true, 9173, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f15502a, false, 9165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15502a, false, 9165, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        a("no_wifi_toast");
        this.f15504c.setAlpha(0.0f);
        this.f15505d.setTranslationY(ak.a(getContext(), 20.0f));
        this.g.add(this.f15504c.animate().alpha(1.0f).setDuration(300));
        this.g.add(this.f15505d.animate().translationY(0.0f).setDuration(300));
        for (ViewPropertyAnimator next : this.g) {
            if (next != null) {
                next.start();
            }
        }
        if (this.f15506e != null) {
            this.f15506e.postDelayed(this.f15507f, 4000);
        }
    }

    public c(@NonNull Context context) {
        super(context, C0906R.style.w9);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f15502a, false, 9168, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f15502a, false, 9168, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String c2 = TTLiveSDKContext.getHostService().b().a().c();
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(PushConstants.WEB_URL, URLEncoder.encode(c2, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            hashMap.put(PushConstants.WEB_URL, "");
        }
        hashMap.put("telecom_carrier", e.a(getContext()));
        hashMap.put("enter_from", "live");
        if (TextUtils.equals(str2, "no_wifi_byte_free")) {
            hashMap.put("alert_type", "toast");
        }
        com.bytedance.android.livesdk.j.a.a().a(str2, hashMap, new j());
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15502a, false, 9163, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15502a, false, 9163, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f15504c = LayoutInflater.from(getContext()).inflate(C0906R.layout.ah1, null);
        if (getWindow() != null) {
            getWindow().setLayout(-2, -2);
            getWindow().addFlags(8);
            getWindow().setDimAmount(0.0f);
        }
        setContentView(this.f15504c);
        if (PatchProxy.isSupport(new Object[0], this, f15502a, false, 9164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15502a, false, 9164, new Class[0], Void.TYPE);
            return;
        }
        this.f15505d = findViewById(C0906R.id.zf);
        this.f15503b = findViewById(C0906R.id.d6u);
        this.f15503b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15510a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f15511c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f15510a, true, 9171, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f15510a, true, 9171, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("LiveMobileFlowDialogNew.java", AnonymousClass2.class);
                f15511c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.flow.LiveMobileFlowDialogNew$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 78);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f15510a, false, 9170, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f15510a, false, 9170, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f15511c, this, this, view));
                c.this.a("no_wifi_byte_free");
                com.bytedance.android.livesdk.v.j.q().f().a(c.this.getContext(), com.bytedance.android.livesdk.browser.c.c.b(TTLiveSDKContext.getHostService().b().a().c()));
            }
        });
        this.f15503b.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15513a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f15513a, false, 9172, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f15513a, false, 9172, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            c.this.f15503b.setAlpha(0.5f);
                            break;
                        case 1:
                            break;
                    }
                }
                c.this.f15503b.setAlpha(1.0f);
                return false;
            }
        });
    }
}
