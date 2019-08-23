package com.ss.android.ugc.aweme.poi.ui.comment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.poi.adapter.PoiCommentImageAdapter;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.o;
import com.ss.android.ugc.aweme.poi.widget.ExpandableTextView;
import java.util.List;

public class PoiCommentPresenter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60579a;

    /* renamed from: b  reason: collision with root package name */
    public PoiCommentImageAdapter f60580b;

    /* renamed from: c  reason: collision with root package name */
    public Context f60581c;

    /* renamed from: d  reason: collision with root package name */
    public Unbinder f60582d;

    /* renamed from: e  reason: collision with root package name */
    public int f60583e;
    @BindView(2131496204)
    public AvatarImageView mAvatarImg;
    @BindView(2131496208)
    public View mDivider;
    @BindView(2131496212)
    public LinearLayout mImagesLayout;
    @BindView(2131496211)
    public RecyclerView mImagesList;
    @BindView(2131496206)
    public ExpandableTextView mTxtContainer;
    @BindView(2131496205)
    public DmtTextView mTxtFrom;
    @BindView(2131496214)
    public DmtTextView mTxtPrice;
    @BindView(2131496216)
    public DmtTextView mTxtUserName;

    @OnClick({2131496216, 2131496204})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60579a, false, 66286, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60579a, false, 66286, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view.getId();
    }

    public void a(o oVar, c cVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{oVar, cVar}, this, f60579a, false, 66284, new Class[]{o.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar, cVar}, this, f60579a, false, 66284, new Class[]{o.class, c.class}, Void.TYPE);
            return;
        }
        int screenWidth = (int) (((((float) UIUtils.getScreenWidth(this.f60581c)) - (UIUtils.dip2Px(this.f60581c, 16.0f) * 2.0f)) - ((float) (this.f60583e * 2))) / 3.0f);
        int min = Math.min(3, oVar.getImages().size());
        int size = oVar.getImages().size();
        List<UrlModel> subList = oVar.getImages().subList(0, Math.min(size, 12));
        int i2 = 0;
        while (i2 < min) {
            View inflate = LayoutInflater.from(this.f60581c).inflate(C0906R.layout.sw, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(screenWidth, screenWidth);
            if (i2 > 0) {
                layoutParams.leftMargin = this.f60583e;
            }
            this.mImagesLayout.addView(inflate, layoutParams);
            RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(C0906R.id.bzq);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.bzp);
            com.ss.android.ugc.aweme.base.c.a(remoteImageView, oVar.getImages().get(i2), screenWidth, screenWidth);
            if (i2 < min - 1 || i2 >= size - 1) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(i);
                textView.setText(String.valueOf(size));
            }
            e eVar = r0;
            e eVar2 = new e(this, cVar, subList, i2, min);
            remoteImageView.setOnClickListener(eVar);
            i2++;
            i = 0;
        }
    }
}
