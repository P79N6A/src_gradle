package com.bytedance.android.livesdk.gift.holder;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class BaseGiftPanelViewHolder<T extends a> extends BasePanelViewHolder<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15010a;

    /* renamed from: b  reason: collision with root package name */
    protected HSImageView f15011b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f15012c;

    /* renamed from: d  reason: collision with root package name */
    protected View f15013d;

    /* renamed from: e  reason: collision with root package name */
    protected View f15014e;
    private View p;
    private SpecialCombView q;
    private ComboTarget r;

    public ComboTarget a() {
        return this.r;
    }

    public BaseGiftPanelViewHolder(View view) {
        super(view);
        this.f15013d = view.findViewById(C0906R.id.cmv);
        this.f15014e = view.findViewById(C0906R.id.ajv);
        this.f15012c = (ImageView) view.findViewById(C0906R.id.a4r);
        this.f15011b = (HSImageView) view.findViewById(C0906R.id.a4s);
        this.p = view.findViewById(C0906R.id.ju);
        this.q = (SpecialCombView) view.findViewById(C0906R.id.co2);
    }

    public void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15010a, false, 9721, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15010a, false, 9721, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f15014e != null) {
            View view = this.f15014e;
            if (z) {
                i = 2130840751;
            }
            view.setBackgroundResource(i);
        }
    }

    public void a(@NonNull T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f15010a, false, 9720, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f15010a, false, 9720, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(t);
        if (!com.bytedance.android.livesdkapi.a.a.f18614b || com.bytedance.android.live.uikit.a.a.j()) {
            int i = C0906R.string.cue;
            if ((t.f15098d instanceof b) && ((b) t.f15098d).f15106e == 5 && com.bytedance.android.live.uikit.a.a.f()) {
                i = C0906R.string.cug;
            }
            this.k.setText(this.g.getString(i, new Object[]{Integer.valueOf(t.a())}));
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            if (t.e()) {
                this.k.setText(String.valueOf(t.b()));
                this.l.setBackgroundResource(2130841186);
            } else {
                this.k.setText(String.valueOf(t.a()));
            }
        }
        this.f15011b.setVisibility(8);
        if (t.p() != null && Lists.notEmpty(t.p().getUrls())) {
            this.f15011b.setVisibility(0);
            k.a(this.f15011b, t.p(), (q.a) new q.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15015a;

                public final void a(ImageModel imageModel) {
                }

                public final void a(ImageModel imageModel, Exception exc) {
                    if (PatchProxy.isSupport(new Object[]{imageModel, exc}, this, f15015a, false, 9723, new Class[]{ImageModel.class, Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageModel, exc}, this, f15015a, false, 9723, new Class[]{ImageModel.class, Exception.class}, Void.TYPE);
                        return;
                    }
                    BaseGiftPanelViewHolder.this.f15011b.setVisibility(8);
                }

                public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f15015a, false, 9722, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f15015a, false, 9722, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = BaseGiftPanelViewHolder.this.f15011b.getLayoutParams();
                    layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                    BaseGiftPanelViewHolder.this.f15011b.setLayoutParams(layoutParams);
                    BaseGiftPanelViewHolder.this.f15011b.setVisibility(0);
                }
            });
        }
        if (!t.c() || ((t.m() != null && !TextUtils.isEmpty(t.m().getUri())) || ((((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.a()).intValue() == 1 && com.bytedance.android.live.uikit.a.a.a()) || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.j()))) {
            this.f15013d.setVisibility(8);
        } else {
            this.f15013d.setVisibility(0);
            if (com.bytedance.android.live.uikit.a.a.g()) {
                this.f15013d.setBackgroundResource(2130840739);
            } else {
                this.f15013d.setBackgroundResource(2130840738);
            }
        }
        a(t.f15096b);
        boolean a2 = ((e) com.bytedance.android.live.utility.b.a(e.class)).a(t.n());
        if (!t.f15097c || t.d() || !a2) {
            this.j.setAlpha(1.0f);
        } else {
            this.j.setAlpha(0.32f);
        }
        if (this.r == null) {
            this.r = new ComboTarget(this.q, this.p);
        }
        this.r.hideAll();
    }
}
