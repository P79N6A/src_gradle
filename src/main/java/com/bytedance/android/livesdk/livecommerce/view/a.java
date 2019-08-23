package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.d.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class a extends FrameLayout implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16287a;

    /* renamed from: b  reason: collision with root package name */
    public List<View.OnClickListener> f16288b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Context f16289c;

    public final View getView() {
        return this;
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f16287a, false, 10794, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f16287a, false, 10794, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        if (this.f16288b != null) {
            this.f16288b.add(onClickListener);
        }
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f16287a, false, 10793, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f16287a, false, 10793, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        throw new IllegalStateException("use addOnClickListener(OnClickListener) instead !!");
    }

    public a(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f16287a, false, 10791, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16287a, false, 10791, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f16289c = context;
        super.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16290a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f16290a, false, 10796, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f16290a, false, 10796, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (a.this.f16288b != null) {
                    for (int i = 0; i < a.this.f16288b.size(); i++) {
                        a.this.f16288b.get(i).onClick(a.this.getView());
                    }
                }
            }
        });
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16287a, false, 10792, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16287a, false, 10792, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
            ImageView imageView = new ImageView(this.f16289c);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setImageResource(2130838617);
            addView(imageView);
        } else if (z) {
            ImageView imageView2 = new ImageView(this.f16289c);
            int a2 = com.bytedance.android.livesdk.livecommerce.f.a.a(this.f16289c, 36.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            layoutParams.gravity = 17;
            imageView2.setLayoutParams(layoutParams);
            imageView2.setImageResource(2130838618);
            addView(imageView2);
        } else {
            ECLottieAnimationView eCLottieAnimationView = new ECLottieAnimationView(this.f16289c);
            eCLottieAnimationView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            eCLottieAnimationView.setAnimation("live_shopping_entrance_lottie.json");
            eCLottieAnimationView.playAnimation();
            eCLottieAnimationView.loop(true);
            addView(eCLottieAnimationView);
        }
    }
}
