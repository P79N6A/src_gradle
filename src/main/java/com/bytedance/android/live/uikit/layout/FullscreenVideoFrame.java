package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FullscreenVideoFrame extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8553a;

    /* renamed from: b  reason: collision with root package name */
    private a f8554b;

    public interface a {
        void a();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8553a, false, 1936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8553a, false, 1936, new Class[0], Void.TYPE);
            return;
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setListener(a aVar) {
        this.f8554b = aVar;
    }

    public FullscreenVideoFrame(Context context) {
        super(context);
        a();
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f8553a, false, 1937, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f8553a, false, 1937, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        } else {
            if (this.f8554b != null) {
                this.f8554b.a();
            }
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f8553a, false, 1938, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f8553a, false, 1938, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (i == 4) {
            return true;
        } else {
            return super.onKeyUp(i, keyEvent);
        }
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
