package com.bytedance.android.livesdk.gift.holder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.gift.model.a.h;
import com.bytedance.android.livesdk.gift.q;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdk.widget.CountDownTextView;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public class PropPanelViewHolder extends BaseGiftPanelViewHolder<h> implements View.OnClickListener {
    public static ChangeQuickRedirect p;
    public a q;
    public SendGiftAnimationView r;
    private final CountDownTextView s;
    private final TextView t;
    private View u;

    public PropPanelViewHolder(View view) {
        super(view);
        this.t = (TextView) view.findViewById(C0906R.id.dc_);
        this.s = (CountDownTextView) view.findViewById(C0906R.id.dkh);
        this.s.setCountDownListener(new CountDownTextView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15025a;

            public final void a(@NotNull TextView textView) {
                if (PatchProxy.isSupport(new Object[]{textView}, this, f15025a, false, 9740, new Class[]{TextView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textView}, this, f15025a, false, 9740, new Class[]{TextView.class}, Void.TYPE);
                    return;
                }
                q.a().b();
            }
        });
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, p, false, 9735, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, p, false, 9735, new Class[]{String.class}, Void.TYPE);
        } else if (this.j.getWidth() > 0) {
            int width = (this.j.getWidth() - this.s.getPaddingLeft()) - this.s.getPaddingRight();
            float textSize = this.s.getTextSize();
            TextPaint paint = this.s.getPaint();
            while (paint.measureText(str) > ((float) width)) {
                textSize -= 1.0f;
                paint.setTextSize(textSize);
            }
            this.s.setTextSize(textSize / this.s.getContext().getResources().getDisplayMetrics().scaledDensity);
        }
    }

    public void onClick(View view) {
        Prop prop;
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 9738, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 9738, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.f_ && (view instanceof SendGiftAnimationView)) {
            if (this.q == null || !(this.q.f15098d instanceof Prop)) {
                prop = null;
            } else {
                prop = (Prop) this.q.f15098d;
            }
            if (prop != null && prop.count > 0) {
                ((SendGiftAnimationView) view).a(0.7f);
                if (this.n != null) {
                    this.n.a(this, this.q);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, p, false, 9737, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, p, false, 9737, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!com.bytedance.android.live.uikit.a.a.f()) {
            super.a(z);
        } else if (this.q != null && (this.q.f15098d instanceof Prop)) {
            if (z) {
                this.r.a();
                this.r.a((Prop) this.q.f15098d);
                this.u.setVisibility(8);
                this.r.setVisibility(0);
                this.r.a(1.08f);
                this.r.setOnClickListener(this);
                return;
            }
            this.u.setVisibility(0);
            this.r.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void a(@NonNull h hVar) {
        boolean z;
        String str;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, p, false, 9733, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, p, false, 9733, new Class[]{h.class}, Void.TYPE);
            return;
        }
        super.a(hVar);
        this.q = hVar2;
        this.u = this.j.findViewById(C0906R.id.yx);
        this.r = (SendGiftAnimationView) this.j.findViewById(C0906R.id.f_);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
            this.t.setText(ac.a((int) C0906R.string.d3s, Integer.valueOf(((Prop) hVar2.f15098d).count)));
        }
        if (((Prop) hVar2.f15098d).nextExpire > 0) {
            long currentTimeMillis = ((Prop) hVar2.f15098d).nextExpire - ((System.currentTimeMillis() / 1000) + ((Prop) hVar2.f15098d).getNowTimeDiff());
            if (currentTimeMillis <= 0) {
                str = this.g.getResources().getString(C0906R.string.d3t, new Object[]{"00:00"});
                z = true;
            } else {
                if (currentTimeMillis < 3600) {
                    String string = this.g.getResources().getString(C0906R.string.d3t, new Object[]{ah.a(currentTimeMillis)});
                    CountDownTextView countDownTextView = this.s;
                    CountDownTextView countDownTextView2 = countDownTextView;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.d3t), new Long(currentTimeMillis), 0L}, countDownTextView, CountDownTextView.f18208a, false, 14357, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
                        CountDownTextView countDownTextView3 = countDownTextView2;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.d3t), new Long(currentTimeMillis), 0L}, countDownTextView3, CountDownTextView.f18208a, false, 14357, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
                    } else {
                        long j = (currentTimeMillis - 0) + 1;
                        if (j > 0) {
                            Observable observeOn = b.a(0, 1, TimeUnit.SECONDS).take(j).observeOn(AndroidSchedulers.mainThread());
                            CountDownTextView.b bVar = new CountDownTextView.b(countDownTextView2, C0906R.string.d3t, currentTimeMillis, 0);
                            countDownTextView2.f18209b = observeOn.subscribe(bVar, CountDownTextView.c.f18217a);
                        }
                    }
                    str = string;
                } else if (currentTimeMillis < 86400) {
                    int i = (int) (currentTimeMillis / 3600);
                    str = this.g.getResources().getQuantityString(C0906R.plurals.u, i, new Object[]{Integer.valueOf(i)});
                } else {
                    int i2 = (int) (currentTimeMillis / 86400);
                    str = this.g.getResources().getQuantityString(C0906R.plurals.t, i2, new Object[]{Integer.valueOf(i2)});
                }
                z = false;
            }
            this.s.setText(str);
            if (com.bytedance.android.live.uikit.a.a.g()) {
                a(str);
            }
            this.s.setVisibility(0);
        } else {
            this.s.setVisibility(4);
            z = false;
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            this.k.setText(ac.a((int) C0906R.string.d3s, Integer.valueOf(((Prop) hVar2.f15098d).count)));
            this.l.setVisibility(8);
        } else if (hVar.a() <= 0) {
            this.k.setText(C0906R.string.d38);
            this.l.setVisibility(8);
        }
        if (hVar2.f15097c || ((Prop) hVar2.f15098d).count <= 0 || z) {
            this.j.setAlpha(0.32f);
        } else {
            this.j.setAlpha(1.0f);
        }
    }

    public final /* synthetic */ void a(@NonNull com.bytedance.android.livesdk.gift.model.a.b bVar, @NonNull List list) {
        h hVar = (h) bVar;
        if (PatchProxy.isSupport(new Object[]{hVar, list}, this, p, false, 9734, new Class[]{h.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, list}, this, p, false, 9734, new Class[]{h.class, List.class}, Void.TYPE);
            return;
        }
        for (String str : ((Bundle) list.get(0)).keySet()) {
            char c2 = 65535;
            if (str.hashCode() == 586503955 && str.equals("key_prop_count")) {
                c2 = 0;
            }
            if (c2 == 0) {
                this.t.setText(ac.a((int) C0906R.string.d3s, Integer.valueOf(((Prop) hVar.f15098d).count)));
                if (((Prop) hVar.f15098d).count <= 0) {
                    hVar.f15096b = false;
                    this.j.setAlpha(0.32f);
                } else {
                    hVar.f15096b = true;
                    this.j.setAlpha(1.0f);
                }
                a(hVar.f15096b);
            }
        }
    }
}
