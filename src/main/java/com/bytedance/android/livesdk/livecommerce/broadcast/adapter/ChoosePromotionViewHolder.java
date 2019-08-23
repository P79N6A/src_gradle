package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.c.f;
import com.bytedance.android.livesdk.livecommerce.view.ChoosePromotionCheckbox;
import com.bytedance.android.livesdk.livecommerce.view.ECPriceView;
import com.bytedance.android.livesdk.livecommerce.view.ECPromotionImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ChoosePromotionViewHolder extends PromotionViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15988a;

    /* renamed from: b  reason: collision with root package name */
    private ChoosePromotionCheckbox f15989b;

    /* renamed from: c  reason: collision with root package name */
    private ECPromotionImageView f15990c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f15991d;

    /* renamed from: e  reason: collision with root package name */
    private ECPriceView f15992e;

    /* renamed from: f  reason: collision with root package name */
    private a f15993f;
    private int g;
    private e h;

    public interface a {
        void a(Context context, e eVar, int i, boolean z);
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f15988a, false, 10504, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f15988a, false, 10504, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i > 0) {
            this.f15989b.setNum(i);
            this.f15989b.setChecked(true);
        } else {
            this.f15989b.setChecked(false);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15988a, false, 10505, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15988a, false, 10505, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view == this.itemView) {
            this.f15993f.a(view.getContext(), this.h, this.g, !this.f15989b.isChecked());
        }
    }

    public ChoosePromotionViewHolder(@NonNull ViewGroup viewGroup, a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.le, viewGroup, false));
        this.f15993f = aVar;
        if (PatchProxy.isSupport(new Object[0], this, f15988a, false, 10501, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15988a, false, 10501, new Class[0], Void.TYPE);
        } else {
            this.f15989b = (ChoosePromotionCheckbox) this.itemView.findViewById(C0906R.id.a1k);
            ChoosePromotionCheckbox choosePromotionCheckbox = this.f15989b;
            if (PatchProxy.isSupport(new Object[0], choosePromotionCheckbox, ChoosePromotionCheckbox.f16224a, false, 10761, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], choosePromotionCheckbox, ChoosePromotionCheckbox.f16224a, false, 10761, new Class[0], Void.TYPE);
            } else {
                choosePromotionCheckbox.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16230a;

                    public final void onGlobalLayout() {
                        int i;
                        if (PatchProxy.isSupport(new Object[0], this, f16230a, false, 10762, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f16230a, false, 10762, new Class[0], Void.TYPE);
                            return;
                        }
                        ChoosePromotionCheckbox.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        ViewGroup.LayoutParams layoutParams = ChoosePromotionCheckbox.this.getLayoutParams();
                        Context context = ChoosePromotionCheckbox.this.getContext();
                        if (!(layoutParams == null || context == null)) {
                            if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                                i = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 20.0f);
                            } else {
                                i = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 24.0f);
                            }
                            layoutParams.height = i;
                            layoutParams.width = i;
                            ChoosePromotionCheckbox.this.setLayoutParams(layoutParams);
                        }
                    }
                });
            }
            this.f15990c = (ECPromotionImageView) this.itemView.findViewById(C0906R.id.bya);
            this.f15991d = (TextView) this.itemView.findViewById(C0906R.id.dgt);
            this.f15992e = (ECPriceView) this.itemView.findViewById(C0906R.id.a8e);
            this.f15989b.setClickable(false);
        }
        this.itemView.setOnClickListener(this);
    }

    public final void a(f fVar, int i, boolean z) {
        SpannableString spannableString;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f15988a, false, 10502, new Class[]{f.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, Integer.valueOf(i), Byte.valueOf(z)}, this, f15988a, false, 10502, new Class[]{f.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (fVar2 instanceof e) {
            this.h = (e) fVar2;
            this.g = i;
            if (z) {
                a(this.h.h);
                return;
            }
            com.bytedance.android.livesdk.livecommerce.b.a.a(this.f15990c, this.h.n, this.h.f16130e);
            TextView textView = this.f15991d;
            Context context = this.itemView.getContext();
            e eVar = this.h;
            if (PatchProxy.isSupport(new Object[]{context, eVar}, this, f15988a, false, 10503, new Class[]{Context.class, e.class}, SpannableString.class)) {
                spannableString = (SpannableString) PatchProxy.accessDispatch(new Object[]{context, eVar}, this, f15988a, false, 10503, new Class[]{Context.class, e.class}, SpannableString.class);
            } else if (TextUtils.isEmpty(eVar.g)) {
                spannableString = new SpannableString(eVar.f16126a);
            } else {
                spannableString = new SpannableString("#" + eVar.f16126a);
                int color = context.getResources().getColor(C0906R.color.l5);
                com.bytedance.android.livesdk.livecommerce.e.a aVar = new com.bytedance.android.livesdk.livecommerce.e.a(context, context.getResources().getString(C0906R.string.a9i), color, color);
                aVar.a(11.0f);
                if (PatchProxy.isSupport(new Object[]{spannableString, aVar, 0, 1, 33}, null, a.f16026a, true, 10506, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{spannableString, aVar, 0, 1, 33}, null, a.f16026a, true, 10506, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    spannableString.setSpan(aVar, 0, 1, 33);
                }
            }
            textView.setText(spannableString);
            this.f15992e.setPriceText(this.h.o);
            this.f15989b.setEnabled(TextUtils.isEmpty(this.h.g));
            a(this.h.h);
        }
    }
}
