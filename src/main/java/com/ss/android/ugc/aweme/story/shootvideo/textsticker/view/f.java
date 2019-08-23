package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74368a;

    /* renamed from: b  reason: collision with root package name */
    public View f74369b;

    /* renamed from: c  reason: collision with root package name */
    public int f74370c;

    /* renamed from: d  reason: collision with root package name */
    public a f74371d;

    /* renamed from: e  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f74372e = new ViewTreeObserver.OnGlobalLayoutListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74373a;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f74373a, false, 86340, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74373a, false, 86340, new Class[0], Void.TYPE);
                return;
            }
            Rect rect = new Rect();
            f.this.f74369b.getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            ai.a("softKeyBoard Height:" + height);
            if (f.this.f74370c == 0) {
                f.this.f74370c = height;
            } else if (f.this.f74370c != height) {
                if (f.this.f74370c - height > 200) {
                    if (f.this.f74371d != null) {
                        f.this.f74371d.a(f.this.f74370c - height);
                    }
                    f.this.f74370c = height;
                    return;
                }
                if (height - f.this.f74370c > 200) {
                    if (f.this.f74371d != null) {
                        f.this.f74371d.b(height - f.this.f74370c);
                    }
                    f.this.f74370c = height;
                }
                f.this.f74370c = height;
            }
        }
    };

    public interface a {
        void a(int i);

        void b(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74368a, false, 86338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74368a, false, 86338, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f74369b == null || this.f74372e == null)) {
            this.f74369b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f74372e);
        }
        this.f74371d = null;
    }

    public f(Activity activity) {
        this.f74369b = activity.getWindow().getDecorView();
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f74368a, false, 86339, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f74368a, false, 86339, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f74371d = aVar;
        if (!(this.f74369b == null || this.f74372e == null)) {
            this.f74369b.getViewTreeObserver().addOnGlobalLayoutListener(this.f74372e);
        }
    }
}
