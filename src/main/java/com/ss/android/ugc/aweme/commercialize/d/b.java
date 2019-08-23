package com.ss.android.ugc.aweme.commercialize.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.model.StoryResponse;

public class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38653a;

    /* renamed from: b  reason: collision with root package name */
    static StoryResponse.a f38654b;

    /* renamed from: c  reason: collision with root package name */
    private c f38655c;

    private b() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38653a, false, 30986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38653a, false, 30986, new Class[0], Void.TYPE);
            return;
        }
        this.f38655c.a(f38654b);
    }

    public static void a(StoryResponse.a aVar) {
        f38654b = aVar;
    }

    public static b a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f38653a, true, 30982, new Class[]{Context.class}, b.class)) {
            return new b(context2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{context2}, null, f38653a, true, 30982, new Class[]{Context.class}, b.class);
    }

    private b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f38653a, false, 30984, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f38653a, false, 30984, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        d dVar = new d(context2);
        dVar.setPadding((int) UIUtils.dip2Px(context2, 16.0f), (int) UIUtils.dip2Px(context2, 2.0f), 0, 0);
        a aVar = new a();
        aVar.a(dVar);
        this.f38655c = new c(dVar, aVar);
    }

    public final void a(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f38653a, false, 30985, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f38653a, false, 30985, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(this.f38655c.c());
        if (indexOfChild != 0) {
            if (indexOfChild > 0) {
                viewGroup.removeView(this.f38655c.c());
            }
            viewGroup.addView(this.f38655c.c(), 0);
            View childAt = viewGroup.getChildAt(1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin -= (int) UIUtils.dip2Px(viewGroup.getContext(), 9.0f);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }
}
