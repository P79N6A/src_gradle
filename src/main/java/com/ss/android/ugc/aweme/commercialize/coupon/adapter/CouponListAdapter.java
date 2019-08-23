package com.ss.android.ugc.aweme.commercialize.coupon.adapter;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.coupon.model.a;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.common.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CouponListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38560a;

    /* renamed from: c  reason: collision with root package name */
    public static int f38561c;

    /* renamed from: b  reason: collision with root package name */
    public List<c> f38562b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f38563d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f38564e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f38565f = new ArrayList();
    private WeakReference<Activity> g;

    static class CouponListViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38566a;

        /* renamed from: b  reason: collision with root package name */
        TextView f38567b;

        /* renamed from: c  reason: collision with root package name */
        Context f38568c;

        /* renamed from: d  reason: collision with root package name */
        TextView f38569d;

        /* renamed from: e  reason: collision with root package name */
        TextView f38570e;

        /* renamed from: f  reason: collision with root package name */
        AvatarImageView f38571f;
        RemoteImageView g;
        WeakReference<Activity> h;
        ImageView i;

        CouponListViewHolder(View view, WeakReference<Activity> weakReference) {
            super(view);
            this.f38568c = view.getContext();
            this.h = weakReference;
            if (PatchProxy.isSupport(new Object[]{view}, this, f38566a, false, 30435, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38566a, false, 30435, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f38567b = (TextView) view.findViewById(C0906R.id.d41);
            this.f38569d = (TextView) view.findViewById(C0906R.id.bml);
            this.f38570e = (TextView) view.findViewById(C0906R.id.cv_);
            this.f38571f = (AvatarImageView) view.findViewById(C0906R.id.i4);
            this.g = (RemoteImageView) view.findViewById(C0906R.id.an2);
            this.i = (ImageView) view.findViewById(C0906R.id.asr);
        }
    }

    static class ShowExpiredCouponHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38572a;

        /* renamed from: b  reason: collision with root package name */
        View f38573b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<Activity> f38574c;

        ShowExpiredCouponHolder(@NonNull View view, WeakReference<Activity> weakReference) {
            super(view);
            this.f38573b = view;
            this.f38574c = weakReference;
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f38560a, false, 30431, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38560a, false, 30431, new Class[0], Integer.TYPE)).intValue();
        } else if (!this.f38564e || this.f38563d) {
            return this.f38562b.size();
        } else {
            return this.f38562b.size() + 1;
        }
    }

    public CouponListAdapter(Activity activity) {
        this.g = new WeakReference<>(activity);
    }

    public final void a(List<c> list) {
        List<c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f38560a, false, 30432, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f38560a, false, 30432, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f38562b = list2;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38560a, false, 30428, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38560a, false, 30428, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (!this.f38564e || this.f38563d || i != getItemCount() - 1) {
            return 0;
        } else {
            return 1;
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f38560a, false, 30427, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f38560a, false, 30427, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            return new ShowExpiredCouponHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.hv, viewGroup, false), this.g);
        } else {
            return new CouponListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ta, viewGroup, false), this.g);
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        String str3;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f38560a, false, 30429, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f38560a, false, 30429, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 < getItemCount()) {
            if (!this.f38564e || this.f38563d || i2 != getItemCount() - 1) {
                c cVar = this.f38562b.get(i2);
                if (viewHolder2 instanceof CouponListViewHolder) {
                    CouponListViewHolder couponListViewHolder = (CouponListViewHolder) viewHolder2;
                    boolean z = this.f38564e;
                    if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, couponListViewHolder, CouponListViewHolder.f38566a, false, 30436, new Class[]{c.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        CouponListViewHolder couponListViewHolder2 = couponListViewHolder;
                        PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i), Byte.valueOf(z)}, couponListViewHolder2, CouponListViewHolder.f38566a, false, 30436, new Class[]{c.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    } else if (cVar != null) {
                        couponListViewHolder.f38569d.setText(cVar.getMerchantName());
                        couponListViewHolder.f38567b.setText(cVar.getTitle());
                        if (cVar.getStatus() != a.StatusValid.value) {
                            couponListViewHolder.f38570e.setVisibility(0);
                            couponListViewHolder.f38570e.setBackground(com.ss.android.ugc.bytex.a.a.a.a(couponListViewHolder.f38568c.getResources(), 2130837901));
                            couponListViewHolder.f38570e.setText(com.ss.android.ugc.aweme.commercialize.coupon.a.a(couponListViewHolder.f38570e.getContext(), cVar.getStatus(), false));
                        } else if (TextUtils.isEmpty(cVar.hintText)) {
                            couponListViewHolder.f38570e.setVisibility(8);
                        } else {
                            couponListViewHolder.f38570e.setVisibility(0);
                            couponListViewHolder.f38570e.setBackground(com.ss.android.ugc.bytex.a.a.a.a(couponListViewHolder.f38568c.getResources(), 2130837898));
                            couponListViewHolder.f38570e.setText(cVar.hintText);
                        }
                        com.ss.android.ugc.aweme.base.c.b(couponListViewHolder.f38571f, cVar.getLogoImageUrl());
                        com.ss.android.ugc.aweme.base.c.b(couponListViewHolder.g, cVar.getHeadImageUrl());
                        if (cVar.isDefaultHeadImage()) {
                            couponListViewHolder.i.setVisibility(8);
                            couponListViewHolder.f38569d.setShadowLayer(UIUtils.dip2Px(couponListViewHolder.f38568c, 1.5f), 0.0f, UIUtils.dip2Px(couponListViewHolder.f38568c, 0.5f), couponListViewHolder.f38568c.getResources().getColor(C0906R.color.xm));
                            couponListViewHolder.f38567b.setShadowLayer(UIUtils.dip2Px(couponListViewHolder.f38568c, 1.5f), 0.0f, UIUtils.dip2Px(couponListViewHolder.f38568c, 0.5f), couponListViewHolder.f38568c.getResources().getColor(C0906R.color.xm));
                        } else {
                            couponListViewHolder.i.setVisibility(0);
                            couponListViewHolder.i.setImageResource(2130837897);
                            couponListViewHolder.i.setAlpha(1.0f);
                            couponListViewHolder.f38569d.setShadowLayer(0.0f, 0.0f, 0.0f, couponListViewHolder.f38568c.getResources().getColor(C0906R.color.xm));
                            couponListViewHolder.f38567b.setShadowLayer(0.0f, 0.0f, 0.0f, couponListViewHolder.f38568c.getResources().getColor(C0906R.color.xm));
                        }
                        couponListViewHolder.itemView.setOnClickListener(new a(couponListViewHolder, cVar, i2, z));
                    }
                }
                Context context = viewHolder2.itemView.getContext();
                if (PatchProxy.isSupport(new Object[]{context, cVar}, this, f38560a, false, 30434, new Class[]{Context.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, cVar}, this, f38560a, false, 30434, new Class[]{Context.class, c.class}, Void.TYPE);
                } else if (!(context == null || cVar == null)) {
                    String codeId = cVar.getCodeId();
                    if (!this.f38565f.contains(codeId)) {
                        this.f38565f.add(codeId);
                        d a2 = d.a();
                        if (this.f38564e) {
                            str = "card_bag";
                        } else {
                            str = "invalid_card_bag";
                        }
                        d a3 = a2.a("enter_from", str);
                        if (this.f38564e) {
                            str2 = "card_bag";
                        } else {
                            str2 = "invalid_card_bag";
                        }
                        d a4 = a3.a("previous_page", str2).a("coupon_id", cVar.getCouponId());
                        if (this.f38564e) {
                            str3 = "click_card_bag";
                        } else {
                            str3 = "click_invalid_card_bag";
                        }
                        r.a("show_coupon", (Map) a4.a("enter_method", str3).a("coupon_type", com.ss.android.ugc.aweme.commercialize.coupon.a.a(context, cVar.getStatus(), true)).a("source_type", com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar)).f34114b);
                    }
                }
            } else if (viewHolder2 instanceof ShowExpiredCouponHolder) {
                ShowExpiredCouponHolder showExpiredCouponHolder = (ShowExpiredCouponHolder) viewHolder2;
                if (PatchProxy.isSupport(new Object[0], showExpiredCouponHolder, ShowExpiredCouponHolder.f38572a, false, 30439, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], showExpiredCouponHolder, ShowExpiredCouponHolder.f38572a, false, 30439, new Class[0], Void.TYPE);
                } else {
                    showExpiredCouponHolder.f38573b.setOnClickListener(new b(showExpiredCouponHolder));
                }
            }
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i), list}, this, f38560a, false, 30430, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i), list}, this, f38560a, false, 30430, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
        } else {
            onBindViewHolder(viewHolder, i);
            if (viewHolder2 instanceof CouponListViewHolder) {
                CouponListViewHolder couponListViewHolder = (CouponListViewHolder) viewHolder2;
                if (PatchProxy.isSupport(new Object[0], couponListViewHolder, CouponListViewHolder.f38566a, false, 30437, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], couponListViewHolder, CouponListViewHolder.f38566a, false, 30437, new Class[0], Void.TYPE);
                    return;
                }
                View view = couponListViewHolder.itemView;
                if (PatchProxy.isSupport(new Object[]{view}, null, com.ss.android.ugc.aweme.commercialize.coupon.views.a.f38635a, true, 30467, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, null, com.ss.android.ugc.aweme.commercialize.coupon.views.a.f38635a, true, 30467, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                view.postDelayed(new Runnable(view) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f38636a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ View f38637b;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f38636a, false, 30468, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f38636a, false, 30468, new Class[0], Void.TYPE);
                            return;
                        }
                        ObjectAnimator.ofFloat(this.f38637b, "alpha", new float[]{1.0f, 0.5f, 1.0f}).setDuration(600).start();
                    }

                    {
                        this.f38637b = r1;
                    }
                }, (long) view.getContext().getResources().getInteger(C0906R.integer.h));
            }
        }
    }
}
