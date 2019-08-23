package com.ss.android.ugc.aweme.friends.adapter;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.ss.android.ugc.aweme.utils.dp;

public class RecommendAwemeViewHolder extends AnimatedViewHolder<RecommendAwemeItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48747a;

    /* renamed from: b  reason: collision with root package name */
    int f48748b;

    /* renamed from: c  reason: collision with root package name */
    public a f48749c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f48750d;

    public interface a {
        void a(String str, int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48747a, false, 46327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48747a, false, 46327, new Class[0], Void.TYPE);
        } else if (e() && a(((RecommendAwemeItem) this.g).getDynamicCover())) {
            this.i = true;
            this.h.a(((RecommendAwemeItem) this.g).getDynamicCover());
            this.h.setImageLoadFinishListener(new o(this));
        } else if (((RecommendAwemeItem) this.g).getCover() == null || ((RecommendAwemeItem) this.g).getCover().getUrlList() == null || ((RecommendAwemeItem) this.g).getCover().getUrlList().size() == 0 || TextUtils.isEmpty(((RecommendAwemeItem) this.g).getCover().getUrlList().get(0))) {
            c.a((RemoteImageView) this.h, (int) C0906R.color.a0k);
        } else {
            c.a((RemoteImageView) this.h, ((RecommendAwemeItem) this.g).getCover(), this.f48748b, this.f48748b);
        }
    }

    RecommendAwemeViewHolder(View view) {
        super(view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.asf);
        this.f48750d = (ImageView) view.findViewById(C0906R.id.at6);
    }

    public final void a(RecommendAwemeItem recommendAwemeItem, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{recommendAwemeItem, Integer.valueOf(i)}, this, f48747a, false, 46329, new Class[]{RecommendAwemeItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendAwemeItem, Integer.valueOf(i)}, this, f48747a, false, 46329, new Class[]{RecommendAwemeItem.class, Integer.TYPE}, Void.TYPE);
        } else if (recommendAwemeItem != null) {
            this.g = recommendAwemeItem;
            ImageView imageView = this.f48750d;
            if (!TextUtils.equals(recommendAwemeItem.getMediaType(), PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            a();
            ((GenericDraweeHierarchy) this.h.getHierarchy()).setRoundingParams(RoundingParams.fromCornersRadius((float) u.a(2.0d)));
            if (Build.VERSION.SDK_INT >= 21) {
                this.h.setOutlineProvider(new dp(u.a(2.0d)));
                this.h.setClipToOutline(true);
            }
            this.h.setOnClickListener(new p(this, i));
        }
    }
}
