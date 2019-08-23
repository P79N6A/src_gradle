package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CommonToastLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13356a;

    /* renamed from: b  reason: collision with root package name */
    private a f13357b;

    public interface a {
        void a(CommonToastLayout commonToastLayout);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13356a, false, 7804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13356a, false, 7804, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.f13357b != null) {
            this.f13357b.a(this);
        }
    }

    public void setOnDetachListener(a aVar) {
        this.f13357b = aVar;
    }

    public CommonToastLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
