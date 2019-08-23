package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.poi.widget.MerchantAvatarImageView;

public class GotCouponDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60627a;
    @BindView(2131493187)
    MerchantAvatarImageView avatarImageView;

    /* renamed from: b  reason: collision with root package name */
    a f60628b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f60629c;
    @BindView(2131494568)
    RemoteImageView headImageIv;
    @BindView(2131494569)
    ImageView headImageIvBg;
    @BindView(2131495759)
    DmtTextView merchantNameTv;
    @BindView(2131497854)
    TextView tvCongrats;
    @BindView(2131497955)
    TextView tvISee;
    @BindView(2131498191)
    DmtTextView tvTitle;
    @BindView(2131498408)
    View vMask;

    public GotCouponDialog(Activity activity) {
        super(activity, C0906R.style.su);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f60627a, false, 66333, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f60627a, false, 66333, new Class[]{a.class}, Void.TYPE);
            return;
        }
        b(aVar);
        show();
    }

    private void b(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f60627a, false, 66334, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f60627a, false, 66334, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f60628b = aVar;
        if (this.f60629c) {
            c cVar = aVar.f60645b;
            com.ss.android.ugc.aweme.base.c.b(this.headImageIv, cVar.getHeadImageUrl());
            com.ss.android.ugc.aweme.base.c.b(this.avatarImageView, cVar.getLogoImageUrl());
            if (cVar.isDefaultHeadImage()) {
                this.headImageIvBg.setVisibility(8);
            } else {
                this.headImageIvBg.setVisibility(0);
            }
            this.merchantNameTv.setText(cVar.getMerchantName());
            this.tvTitle.setText(cVar.getTitle());
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60627a, false, 66330, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60627a, false, 66330, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.j7);
        if (PatchProxy.isSupport(new Object[0], this, f60627a, false, 66331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60627a, false, 66331, new Class[0], Void.TYPE);
            return;
        }
        this.f60629c = true;
        ButterKnife.bind((Dialog) this);
        if (PatchProxy.isSupport(new Object[0], this, f60627a, false, 66332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60627a, false, 66332, new Class[0], Void.TYPE);
        } else {
            float dimensionPixelOffset = (float) getContext().getResources().getDimensionPixelOffset(C0906R.dimen.d5);
            ((GenericDraweeHierarchy) this.headImageIv.getHierarchy()).setRoundingParams(RoundingParams.fromCornersRadii(dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f));
            ((GenericDraweeHierarchy) this.headImageIv.getHierarchy()).setPlaceholderImage((Drawable) new ColorDrawable(ContextCompat.getColor(getContext(), C0906R.color.ib)), ScalingUtils.ScaleType.CENTER_CROP);
            this.vMask.setBackground(v.a(GradientDrawable.Orientation.TOP_BOTTOM, 0, ContextCompat.getColor(getContext(), C0906R.color.cu)));
            this.tvTitle.setFontType("");
            this.merchantNameTv.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20595b);
            this.tvISee.setBackground(v.a(ContextCompat.getColor(getContext(), C0906R.color.xy), (float) u.a(2.0d)));
            this.tvISee.setOnClickListener(new d(this));
            com.ss.android.ugc.aweme.utils.c.a(this.tvISee);
        }
        if (this.f60628b != null) {
            b(this.f60628b);
        }
    }
}
