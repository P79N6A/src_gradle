package com.ss.android.ugc.aweme.shortvideo.sticker;

import a.g;
import a.i;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70169a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f70170b;

    /* renamed from: c  reason: collision with root package name */
    public AvatarImageView f70171c;

    /* renamed from: d  reason: collision with root package name */
    public DmtTextView f70172d;

    /* renamed from: e  reason: collision with root package name */
    public DmtTextView f70173e;

    /* renamed from: f  reason: collision with root package name */
    public Context f70174f;
    HashMap<String, e> g = new HashMap<>();
    Effect h;

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70169a, false, 78663, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70169a, false, 78663, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }

    n(@NonNull LinearLayout linearLayout, Context context) {
        this.f70170b = linearLayout;
        this.f70174f = context;
        this.f70171c = (AvatarImageView) linearLayout.findViewById(C0906R.id.b_w);
        this.f70172d = (DmtTextView) linearLayout.findViewById(C0906R.id.b_x);
        this.f70173e = (DmtTextView) linearLayout.findViewById(C0906R.id.b_v);
        this.f70170b.setOnClickListener(this);
        this.f70170b.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70175a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f70175a, false, 78667, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70175a, false, 78667, new Class[0], Void.TYPE);
                    return;
                }
                n.this.f70173e.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
                int i = n.this.f70171c.getLayoutParams().width;
                int measuredWidth = n.this.f70173e.getMeasuredWidth();
                n.this.f70172d.setMaxWidth((int) (((float) ((p.b(n.this.f70174f) - i) - measuredWidth)) - UIUtils.dip2Px(n.this.f70174f, 106.0f)));
            }
        });
    }

    public final void a(@Nullable Effect effect, l lVar) {
        if (PatchProxy.isSupport(new Object[]{effect, null}, this, f70169a, false, 78662, new Class[]{Effect.class, l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, null}, this, f70169a, false, 78662, new Class[]{Effect.class, l.class}, Void.TYPE);
        } else if (effect == null || c.a()) {
            this.f70170b.setVisibility(8);
        } else {
            this.h = effect;
            if (ae.b(effect)) {
                i.a((Callable<TResult>) new o<TResult>(effect)).a((g<TResult, TContinuationResult>) new p<TResult,TContinuationResult>(this, effect, null), i.f1052b);
            } else {
                this.f70170b.setVisibility(8);
            }
        }
    }
}
