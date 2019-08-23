package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class KeyboardShadowView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11526a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f11527b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11528c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11529d;

    /* renamed from: e  reason: collision with root package name */
    private int f11530e;

    /* renamed from: f  reason: collision with root package name */
    private a f11531f;

    public interface a {
        void a();
    }

    public KeyboardShadowView(Context context) {
        super(context);
    }

    public void setCallback(a aVar) {
        this.f11531f = aVar;
    }

    public void setShowStatusBar(boolean z) {
        this.f11529d = z;
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f11526a, false, 5804, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f11526a, false, 5804, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        this.f11527b = activity;
        this.f11528c = g.a(activity);
        this.f11530e = UIUtils.getStatusBarHeight(activity);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f11526a, false, 5805, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f11526a, false, 5805, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f11527b == null) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            if (this.f11529d || this.f11528c) {
                motionEvent.offsetLocation(0.0f, (float) this.f11530e);
            }
            Fragment findFragmentByTag = ((FragmentActivity) this.f11527b).getSupportFragmentManager().findFragmentByTag("AbsInteractionFragment");
            if (findFragmentByTag == null) {
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    if (this.f11531f != null) {
                        this.f11531f.a();
                    }
                    return false;
                }
                z = this.f11527b.dispatchTouchEvent(motionEvent);
            } else if (findFragmentByTag instanceof DialogFragment) {
                Dialog dialog = ((DialogFragment) findFragmentByTag).getDialog();
                if (dialog != null) {
                    Window window = dialog.getWindow();
                    if (window != null) {
                        z = window.superDispatchTouchEvent(motionEvent);
                    }
                }
            }
            return z;
        }
    }

    public KeyboardShadowView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardShadowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public KeyboardShadowView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
