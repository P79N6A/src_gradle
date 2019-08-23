package com.ss.android.ugc.aweme.festival.christmas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.bizactivity.AnimateDraweeView;

public class FestivalHomePageView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47220a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f47221b;

    /* renamed from: c  reason: collision with root package name */
    private View f47222c;

    /* renamed from: d  reason: collision with root package name */
    private AnimateDraweeView f47223d;

    /* renamed from: e  reason: collision with root package name */
    private a f47224e;

    public interface a {
    }

    public AnimateDraweeView getHomePageIconView() {
        return this.f47223d;
    }

    public void setCloseClickListener(a aVar) {
        this.f47224e = aVar;
    }

    public FestivalHomePageView(@NonNull Context context) {
        this(context, null);
    }

    public FestivalHomePageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FestivalHomePageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f47220a, false, 43903, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f47220a, false, 43903, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f47222c = LayoutInflater.from(context).inflate(C0906R.layout.a_4, this, false);
        this.f47221b = (ImageView) this.f47222c.findViewById(C0906R.id.azy);
        this.f47223d = (AnimateDraweeView) this.f47222c.findViewById(C0906R.id.b24);
        addView(this.f47222c);
    }
}
