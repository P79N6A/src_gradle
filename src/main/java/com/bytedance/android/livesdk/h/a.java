package com.bytedance.android.livesdk.h;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15485a = null;

    /* renamed from: f  reason: collision with root package name */
    private static int f15486f = 300;

    /* renamed from: b  reason: collision with root package name */
    public TextView f15487b;

    /* renamed from: c  reason: collision with root package name */
    public View f15488c;

    /* renamed from: d  reason: collision with root package name */
    private View f15489d;

    /* renamed from: e  reason: collision with root package name */
    private View f15490e;
    private List<ViewPropertyAnimator> g = new ArrayList();

    public final void onBackPressed() {
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f15485a, false, 9154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15485a, false, 9154, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, b.f15501a, true, 9162, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, b.f15501a, true, 9162, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        for (ViewPropertyAnimator next : this.g) {
            if (next != null) {
                next.cancel();
            }
        }
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f15485a, false, 9153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15485a, false, 9153, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        a("no_wifi_alert");
        this.f15489d.setAlpha(0.0f);
        this.f15490e.setTranslationY(ak.a(getContext(), 20.0f));
        this.g.add(this.f15489d.animate().alpha(1.0f).setDuration((long) f15486f));
        this.g.add(this.f15490e.animate().translationY(0.0f).setDuration((long) f15486f));
        for (ViewPropertyAnimator next : this.g) {
            if (next != null) {
                next.start();
            }
        }
    }

    public a(@NonNull Context context) {
        super(context, C0906R.style.w9);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f15485a, false, 9155, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f15485a, false, 9155, new Class[]{String.class}, Void.TYPE);
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
            hashMap.put("alert_type", "popup");
        }
        com.bytedance.android.livesdk.j.a.a().a(str2, hashMap, new j());
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15485a, false, 9151, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15485a, false, 9151, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f15489d = LayoutInflater.from(getContext()).inflate(C0906R.layout.ah0, null);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -1);
            getWindow().setDimAmount(0.0f);
        }
        setContentView(this.f15489d);
        if (PatchProxy.isSupport(new Object[0], this, f15485a, false, 9152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15485a, false, 9152, new Class[0], Void.TYPE);
            return;
        }
        this.f15490e = findViewById(C0906R.id.zf);
        this.f15487b = (TextView) findViewById(C0906R.id.d74);
        this.f15488c = findViewById(C0906R.id.d6u);
        this.f15487b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15491a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f15492c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f15491a, true, 9157, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f15491a, true, 9157, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("LiveMobileFlowDialog.java", AnonymousClass1.class);
                f15492c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.flow.LiveMobileFlowDialog$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 70);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f15491a, false, 9156, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f15491a, false, 9156, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f15492c, this, this, view));
                a.this.a("no_wifi_continue");
                a.this.dismiss();
                com.bytedance.android.livesdk.w.b.aL.a(Long.valueOf(System.currentTimeMillis()));
            }
        });
        this.f15488c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15494a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f15495c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f15494a, true, 9159, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f15494a, true, 9159, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("LiveMobileFlowDialog.java", AnonymousClass2.class);
                f15495c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.flow.LiveMobileFlowDialog$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 79);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f15494a, false, 9158, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f15494a, false, 9158, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f15495c, this, this, view));
                a.this.a("no_wifi_byte_free");
                com.bytedance.android.livesdk.v.j.q().f().a(a.this.getContext(), c.b(TTLiveSDKContext.getHostService().b().a().c()));
            }
        });
        this.f15487b.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15497a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f15497a, false, 9160, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f15497a, false, 9160, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            a.this.f15487b.setTextColor(a.this.getContext().getResources().getColor(C0906R.color.a7p));
                            break;
                        case 1:
                            break;
                    }
                }
                a.this.f15487b.setTextColor(a.this.getContext().getResources().getColor(C0906R.color.a7o));
                return false;
            }
        });
        this.f15488c.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15499a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f15499a, false, 9161, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f15499a, false, 9161, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            a.this.f15488c.setAlpha(0.5f);
                            break;
                        case 1:
                            break;
                    }
                }
                a.this.f15488c.setAlpha(1.0f);
                return false;
            }
        });
    }
}
