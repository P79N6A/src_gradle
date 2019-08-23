package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;

public abstract class KeyboardAwareDialog extends BaseDialogFragment implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72844a;

    /* renamed from: b  reason: collision with root package name */
    private WeakHandler f72845b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f72846c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private boolean f72847d;

    public void a() {
    }

    public abstract void a(View view);

    public void b() {
    }

    public abstract KeyboardAwareEditText c();

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f72844a, false, 84162, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72844a, false, 84162, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f72845b.sendEmptyMessageDelayed(1, 100);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f72844a, false, 84163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72844a, false, 84163, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.f72845b.removeMessages(1);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72844a, false, 84160, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72844a, false, 84160, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f72845b = new WeakHandler(this);
    }

    public void handleMsg(Message message) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{message}, this, f72844a, false, 84166, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f72844a, false, 84166, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 1) {
            if (PatchProxy.isSupport(new Object[0], this, f72844a, false, 84164, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72844a, false, 84164, new Class[0], Void.TYPE);
            } else {
                Window window = getDialog().getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = -1;
                    window.setAttributes(attributes);
                    this.f72846c.setEmpty();
                    window.getDecorView().getWindowVisibleDisplayFrame(this.f72846c);
                    float screenHeight = (float) (UIUtils.getScreenHeight(getContext()) - (this.f72846c.bottom - this.f72846c.top));
                    if (PatchProxy.isSupport(new Object[0], this, f72844a, false, 84165, new Class[0], Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[0], this, f72844a, false, 84165, new Class[0], Float.TYPE)).floatValue();
                    } else {
                        f2 = Math.max(((float) UIUtils.getScreenHeight(getContext())) * 0.16666667f, (float) ((int) UIUtils.dip2Px(getContext(), 73.0f)));
                    }
                    if (screenHeight > f2) {
                        if (!this.f72847d) {
                            this.f72847d = true;
                            b();
                        }
                    } else if (this.f72847d) {
                        this.f72847d = false;
                        a();
                    }
                }
            }
            this.f72845b.sendEmptyMessageDelayed(1, 50);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f72844a, false, 84161, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f72844a, false, 84161, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        a(view);
        if (c() != null) {
            c().setOnKeyBoardHideListener(new b(this));
        }
    }
}
