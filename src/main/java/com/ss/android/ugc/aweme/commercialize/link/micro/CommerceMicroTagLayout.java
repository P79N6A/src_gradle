package com.ss.android.ugc.aweme.commercialize.link.micro;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.link.video.a;
import com.ss.android.ugc.aweme.miniapp_api.model.f;

public class CommerceMicroTagLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38974a;

    /* renamed from: b  reason: collision with root package name */
    public a f38975b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38974a, false, 30895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38974a, false, 30895, new Class[0], Void.TYPE);
            return;
        }
        removeAllViews();
        this.f38975b = null;
    }

    public CommerceMicroTagLayout(Context context) {
        super(context);
    }

    public CommerceMicroTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @MainThread
    public final void a(@NonNull f fVar, @NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{fVar, aVar}, this, f38974a, false, 30894, new Class[]{f.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, aVar}, this, f38974a, false, 30894, new Class[]{f.class, a.class}, Void.TYPE);
            return;
        }
        this.f38975b = new a(getContext());
        this.f38975b.setCommerceTagCallBack(aVar);
        this.f38975b.a(fVar, aVar);
        removeAllViews();
        addView(this.f38975b);
    }

    public CommerceMicroTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
