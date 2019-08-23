package com.ss.android.message.sswo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public class SswoActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30050a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<SswoActivity> f30051b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f30050a, false, 18113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30050a, false, 18113, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30050a, false, 18114, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30050a, false, 18114, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f30050a, true, 18106, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30050a, true, 18106, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (f30051b != null) {
                SswoActivity sswoActivity = (SswoActivity) f30051b.get();
                if (sswoActivity != null) {
                    return sswoActivity.isFinishing();
                }
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f30050a, false, 18108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30050a, false, 18108, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f30050a, false, 18112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30050a, false, 18112, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f30050a, false, 18109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30050a, false, 18109, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        Logger.debug();
        if (f30051b != null && ((SswoActivity) f30051b.get()) == this) {
            f30051b.clear();
            f30051b = null;
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f30050a, false, 18107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30050a, false, 18107, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (!a.a(this).c() && !isFinishing()) {
            finish();
        }
    }

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f30050a, true, 18105, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f30050a, true, 18105, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            if (f30051b != null) {
                SswoActivity sswoActivity = (SswoActivity) f30051b.get();
                if (sswoActivity != null && !sswoActivity.isFinishing()) {
                    sswoActivity.finish();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f30050a, false, 18110, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f30050a, false, 18110, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!isFinishing()) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f30050a, false, 18111, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f30050a, false, 18111, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!isFinishing()) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f30050a, false, 18102, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f30050a, false, 18102, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onCreate", true);
        super.onCreate(bundle);
        Logger.debug();
        if (PatchProxy.isSupport(new Object[0], this, f30050a, false, 18103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30050a, false, 18103, new Class[0], Void.TYPE);
        } else {
            try {
                Window window = getWindow();
                window.setGravity(51);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = 35;
                attributes.y = 0;
                attributes.height = 1;
                attributes.width = 1;
                window.setAttributes(attributes);
            } catch (Throwable unused) {
            }
        }
        f30051b = new WeakReference<>(this);
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onCreate", false);
    }
}
