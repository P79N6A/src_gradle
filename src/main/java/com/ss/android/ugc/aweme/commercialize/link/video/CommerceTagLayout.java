package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.commercialize.model.j;
import javax.annotation.Nonnull;

public class CommerceTagLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38982a;

    /* renamed from: b  reason: collision with root package name */
    public n f38983b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38982a, false, 30909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38982a, false, 30909, new Class[0], Void.TYPE);
            return;
        }
        removeAllViews();
        this.f38983b = null;
    }

    public CommerceTagLayout(Context context) {
        super(context);
    }

    public CommerceTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @MainThread
    public final void a(@Nonnull j jVar, @NonNull o oVar) {
        if (PatchProxy.isSupport(new Object[]{jVar, oVar}, this, f38982a, false, 30908, new Class[]{j.class, o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar, oVar}, this, f38982a, false, 30908, new Class[]{j.class, o.class}, Void.TYPE);
            return;
        }
        if (!a.a()) {
            switch (jVar.feedShowType) {
                case 1:
                    this.f38983b = new w(getContext());
                    break;
                case 2:
                    this.f38983b = new s(getContext());
                    break;
                default:
                    this.f38983b = new p(getContext());
                    break;
            }
        } else {
            switch (jVar.feedShowType) {
                case 1:
                    this.f38983b = new j(getContext());
                    break;
                case 2:
                    this.f38983b = new f(getContext());
                    break;
                default:
                    this.f38983b = new c(getContext());
                    break;
            }
        }
        this.f38983b.setLinkTagCallBack(oVar);
        this.f38983b.a(jVar, oVar, this);
        removeAllViews();
        addView(this.f38983b.c());
    }

    public CommerceTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
