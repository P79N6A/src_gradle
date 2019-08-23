package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.q;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Set;

public class GiftPanelTabWidget extends Widget implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15331a;

    /* renamed from: b  reason: collision with root package name */
    View f15332b;

    /* renamed from: c  reason: collision with root package name */
    View f15333c;

    /* renamed from: d  reason: collision with root package name */
    GiftDialogViewModel f15334d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f15335e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f15336f;
    private TextView g;
    private View h;

    public int getLayoutId() {
        return C0906R.layout.agb;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15331a, false, 10076, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15331a, false, 10076, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f15334d != null) {
            this.f15334d.a(this);
        }
    }

    public void onCreate() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f15331a, false, 10068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15331a, false, 10068, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (this.dataCenter != null) {
            this.f15334d = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
            if (this.f15334d != null) {
                if (PatchProxy.isSupport(new Object[0], this, f15331a, false, 10069, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f15331a, false, 10069, new Class[0], Void.TYPE);
                } else {
                    if (this.f15334d.i) {
                        this.contentView.setAlpha(0.3f);
                        this.contentView.setEnabled(false);
                    }
                    this.containerView.setVisibility(0);
                    this.f15335e = (TextView) this.contentView.findViewById(C0906R.id.d4y);
                    this.f15336f = (TextView) this.contentView.findViewById(C0906R.id.d4x);
                    this.g = (TextView) this.contentView.findViewById(C0906R.id.d4z);
                    this.f15332b = this.contentView.findViewById(C0906R.id.c8_);
                    this.f15333c = this.contentView.findViewById(C0906R.id.c89);
                    this.h = this.contentView.findViewById(C0906R.id.a1z);
                    this.h.setVisibility(0);
                    if (a.f()) {
                        this.f15336f.setVisibility(8);
                        Boolean bool = (Boolean) LiveSettingKeys.SHOW_PROP_PACKET.a();
                        TextView textView = this.g;
                        if (bool == null || !bool.booleanValue()) {
                            i = 8;
                        }
                        textView.setVisibility(i);
                    } else if (a.b()) {
                        this.f15336f.setVisibility(8);
                        this.g.setVisibility(8);
                    } else if (a.g()) {
                        this.f15336f.setVisibility(8);
                    }
                    this.f15335e.setOnClickListener(this);
                    this.f15336f.setOnClickListener(this);
                    this.g.setOnClickListener(this);
                    this.containerView.post(new aa(this));
                }
                this.f15334d.k.observe(this, new y(this));
                this.f15334d.l.observe(this, new z(this));
            }
        }
    }

    private void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f15331a, false, 10073, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f15331a, false, 10073, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float x = this.h.getX();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.h, "x", new float[]{x, f2});
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15331a, false, 10070, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15331a, false, 10070, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.d4y) {
            a(ab.GIFT);
        } else if (view.getId() == C0906R.id.d4x) {
            a(ab.FANS_CLUB_GIFT);
        } else {
            if (view.getId() == C0906R.id.d4z) {
                a(ab.PROP);
                q a2 = q.a();
                if (PatchProxy.isSupport(new Object[0], a2, q.f15399a, false, 9312, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a2, q.f15399a, false, 9312, new Class[0], Void.TYPE);
                } else {
                    Set set = (Set) b.K.a();
                    for (Prop next : a2.f15401b) {
                        if (next.reddotTip && !set.contains(Long.valueOf(next.id))) {
                            set.add(Long.valueOf(next.id));
                        }
                    }
                    b.K.a(set);
                }
                this.f15332b.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ab abVar) {
        boolean z;
        boolean z2;
        int i;
        float f2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{abVar}, this, f15331a, false, 10071, new Class[]{ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar}, this, f15331a, false, 10071, new Class[]{ab.class}, Void.TYPE);
        } else if (this.f15334d.j.getValue() != abVar) {
            TextView textView = this.f15335e;
            if (abVar == ab.GIFT) {
                z = true;
            } else {
                z = false;
            }
            a(textView, z);
            TextView textView2 = this.f15336f;
            if (abVar == ab.FANS_CLUB_GIFT) {
                z2 = true;
            } else {
                z2 = false;
            }
            a(textView2, z2);
            TextView textView3 = this.g;
            if (abVar != ab.PROP) {
                z3 = false;
            }
            a(textView3, z3);
            int width = this.h.getWidth();
            switch (abVar) {
                case GIFT:
                    f2 = this.f15335e.getX();
                    i = this.f15335e.getWidth();
                    break;
                case FANS_CLUB_GIFT:
                    f2 = this.f15336f.getX();
                    i = this.f15336f.getWidth();
                    break;
                case PROP:
                    f2 = this.g.getX();
                    i = this.g.getWidth();
                    break;
                default:
                    return;
            }
            int i2 = (i - width) / 2;
            if (i2 < 0) {
                i2 = 0;
            }
            a(f2 + ((float) i2));
            this.f15334d.s.postValue(null);
            this.f15334d.t.postValue(null);
            this.f15334d.n.postValue(Boolean.FALSE);
            this.f15334d.j.postValue(abVar);
        }
    }

    private void a(TextView textView, boolean z) {
        int i;
        TextView textView2 = textView;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{textView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f15331a, false, 10072, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Byte.valueOf(z)}, this, f15331a, false, 10072, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Resources resources = this.context.getResources();
        if (z2) {
            i = C0906R.color.aic;
        } else {
            i = C0906R.color.afi;
        }
        textView2.setTextColor(resources.getColor(i));
        if (a.d()) {
            textView2.setTypeface(null, z2 ? 1 : 0);
        }
    }
}
