package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.livesdk.gift.effect.entry.a.b;
import com.bytedance.android.livesdk.gift.effect.entry.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class EnterAnimationView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14855a;

    /* renamed from: b  reason: collision with root package name */
    public a f14856b;

    /* renamed from: c  reason: collision with root package name */
    public b f14857c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14858d;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14855a, false, 9491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14855a, false, 9491, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (PatchProxy.isSupport(new Object[0], this, f14855a, false, 9492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14855a, false, 9492, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f14856b;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f14822a, false, 9453, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f14822a, false, 9453, new Class[0], Void.TYPE);
            return;
        }
        aVar.f14823b.clear();
        while (aVar.f14824c.getChildCount() > 0) {
            ViewGroup viewGroup = (ViewGroup) aVar.f14824c.getChildAt(0);
            UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(C0906R.id.dur);
            if (userEnterLevelView != null) {
                userEnterLevelView.r = true;
            }
            aVar.f14824c.removeView(viewGroup);
        }
        if (aVar.f14827f != null) {
            aVar.f14827f.cancel();
            aVar.f14827f = null;
        }
        aVar.g = 0;
    }

    public EnterAnimationView(@NonNull Context context) {
        this(context, null);
    }

    public void setChildMarginBottom(int i) {
        if (this.f14856b != null) {
            this.f14856b.f14826e = i;
        }
    }

    public void setUserEventListener(e eVar) {
        if (this.f14856b != null) {
            this.f14856b.f14825d = eVar;
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14855a, false, 9488, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14855a, false, 9488, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
            return;
        }
        if (this.f14858d && !(aVar.l == null && aVar.j == -1)) {
            this.f14856b.a(aVar);
        }
    }

    public EnterAnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onVisibilityChanged(@NonNull View view, int i) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f14855a, false, 9490, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f14855a, false, 9490, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        }
        this.f14858d = z;
    }

    public EnterAnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.f14858d = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, f14855a, false, 9487, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f14855a, false, 9487, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f14856b = new a(context, this);
        this.f14857c = new b();
    }
}
