package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.video.o;

public final class cb extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54698a;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f54699d;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f54700b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54701c;

    /* renamed from: e  reason: collision with root package name */
    private RemoteImageView f54702e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f54703f;
    private TextView g;
    private TextView h;
    private View i;
    private boolean j;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f54698a, true, 57726, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54698a, true, 57726, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!d.a().isLogin() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        SharePrefCache inst = SharePrefCache.inst();
        int currentTimeMillis = (int) ((System.currentTimeMillis() - ((Long) inst.getUploadContactsNoticeLastShowTime().c()).longValue()) / 1000);
        if (((Boolean) inst.getConfirmUploadContacts().c()).booleanValue() || ((Integer) inst.getUploadContactsNoticeShowCount().c()).intValue() >= ((Integer) inst.getUploadContactsPolicyTimes().c()).intValue() || currentTimeMillis <= ((Integer) inst.getUploadContactsPolicyInterval().c()).intValue()) {
            return false;
        }
        return true;
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f54698a, false, 57725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54698a, false, 57725, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, cf.f54712a, true, 57732, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, cf.f54712a, true, 57732, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        f54699d = false;
        if (this.j || this.f54701c == null) {
            if (!o.v()) {
                o.b().f();
                return;
            }
            com.ss.android.ugc.playerkit.videoview.a.a().S();
        }
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f54698a, false, 57724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54698a, false, 57724, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        com.bytedance.ies.dmt.ui.b.a.a(true, this.i);
        f54699d = true;
        if (!o.v()) {
            this.j = o.b().a();
            o.b().h();
        } else {
            this.j = com.ss.android.ugc.playerkit.videoview.a.a().b();
            com.ss.android.ugc.playerkit.videoview.a.a().T();
        }
        r.onEvent(MobClick.obtain().setEventName("friend_alert").setLabelName("show"));
        SharePrefCache inst = SharePrefCache.inst();
        inst.getUploadContactsNoticeShowCount().a(Integer.valueOf(((Integer) inst.getUploadContactsNoticeShowCount().c()).intValue() + 1));
        inst.getUploadContactsNoticeLastShowTime().a(Long.valueOf(System.currentTimeMillis()));
    }

    public cb(Context context) {
        this(context, null);
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f54698a, false, 57722, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f54698a, false, 57722, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.kp);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = com.bytedance.ies.dmt.ui.b.a.f20279f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        getWindow().setWindowAnimations(0);
        this.f54702e = (RemoteImageView) findViewById(C0906R.id.brn);
        this.f54703f = (TextView) findViewById(C0906R.id.title);
        this.g = (TextView) findViewById(C0906R.id.bmn);
        this.h = (TextView) findViewById(C0906R.id.c8d);
        this.h.getPaint().setFlags(8);
        b.a(this.h, 0.75f);
        this.i = findViewById(C0906R.id.chu);
        if (!TextUtils.isEmpty((CharSequence) SharePrefCache.inst().getUploadContactsPolicyPic().c())) {
            c.a(this.f54702e, (String) SharePrefCache.inst().getUploadContactsPolicyPic().c());
        }
        if (!TextUtils.isEmpty((CharSequence) SharePrefCache.inst().getUploadContactsPolicyCaption().c())) {
            this.f54703f.setText((CharSequence) SharePrefCache.inst().getUploadContactsPolicyCaption().c());
        }
        if (!TextUtils.isEmpty((CharSequence) SharePrefCache.inst().getUploadContactsPolicyText().c())) {
            this.g.setText((CharSequence) SharePrefCache.inst().getUploadContactsPolicyText().c());
        }
        ((TextView) findViewById(C0906R.id.bmn)).setMovementMethod(new ScrollingMovementMethod());
        findViewById(C0906R.id.c8d).setOnClickListener(new cc(this));
        findViewById(C0906R.id.y0).setOnClickListener(new cd(this));
        findViewById(C0906R.id.q2).setOnClickListener(new ce(this));
    }

    public cb(Context context, String str) {
        super(context, C0906R.style.t4);
        this.f54700b = (Activity) context;
        this.f54701c = str;
    }

    public final boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent}, this, f54698a, false, 57723, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent}, this, f54698a, false, 57723, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 == 4 || super.onKeyDown(i2, keyEvent)) {
            return true;
        } else {
            return false;
        }
    }
}
