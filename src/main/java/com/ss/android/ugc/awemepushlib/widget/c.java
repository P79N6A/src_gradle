package com.ss.android.ugc.awemepushlib.widget;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.awemepushlib.widget.a;

public class c extends Activity implements a.C0804a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77126a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f77127b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f77126a, false, 90457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77126a, false, 90457, new Class[0], Void.TYPE);
            return;
        }
        this.f77127b.removeAllViews();
        finish();
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f77126a, false, 90456, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f77126a, false, 90456, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f77126a, false, 90455, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f77126a, false, 90455, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            try {
                finish();
                return true;
            } catch (Throwable unused) {
                finish();
                return true;
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f77126a, false, 90454, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f77126a, false, 90454, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(32);
        window.addFlags(262144);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity |= 48;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("message_from", -1);
        com.ss.android.ugc.awemepushlib.a.c cVar = (com.ss.android.ugc.awemepushlib.a.c) intent.getSerializableExtra("message_obj");
        if (cVar == null) {
            finish();
            return;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("__targetIntent__");
        if (intent2 == null) {
            finish();
            return;
        }
        a aVar = new a(this, intExtra, cVar, (Bitmap) intent.getParcelableExtra("__bitmap__"), intent2, intent.getLongExtra("__showTime__", 6000), false, 11);
        aVar.setDismissListener(this);
        this.f77127b = new FrameLayout(this);
        this.f77127b.addView(aVar, new FrameLayout.LayoutParams(-1, -2));
        setContentView(this.f77127b, new ViewGroup.LayoutParams(-1, -1));
    }
}
