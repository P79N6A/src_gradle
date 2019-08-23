package com.ss.android.ugc.aweme.newfollow.vh;

import android.graphics.Outline;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewOutlineProvider;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.newfollow.e.a;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedArticleViewHolder;

public class FlowFeedArticleItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57516a;

    /* renamed from: b  reason: collision with root package name */
    public FlowFeedArticleViewHolder.a f57517b;

    /* renamed from: c  reason: collision with root package name */
    public a f57518c;
    @BindView(2131494750)
    public RemoteImageView mImgCover;
    @BindView(2131497796)
    public DmtTextView mTvReadCount;
    @BindView(2131497797)
    public DmtTextView mTvSource;
    @BindView(2131497798)
    public DmtTextView mTvTitle;

    public FlowFeedArticleItemViewHolder(View view, FlowFeedArticleViewHolder.a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mImgCover.setOutlineProvider(new ViewOutlineProvider() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57519a;

                @RequiresApi(api = 21)
                public final void getOutline(View view, Outline outline) {
                    if (PatchProxy.isSupport(new Object[]{view, outline}, this, f57519a, false, 62152, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, outline}, this, f57519a, false, 62152, new Class[]{View.class, Outline.class}, Void.TYPE);
                        return;
                    }
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), UIUtils.dip2Px(FlowFeedArticleItemViewHolder.this.mImgCover.getContext(), 2.0f));
                }
            });
            this.mImgCover.setClipToOutline(true);
        }
        this.f57517b = aVar;
    }
}
