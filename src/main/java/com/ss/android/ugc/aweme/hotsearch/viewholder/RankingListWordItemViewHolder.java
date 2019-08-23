package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.hotsearch.a.d;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.d.b;
import com.ss.android.ugc.bytex.a.a.a;

public class RankingListWordItemViewHolder extends RecyclerView.ViewHolder implements a<HotSearchItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49946a;

    /* renamed from: b  reason: collision with root package name */
    public long f49947b;

    /* renamed from: c  reason: collision with root package name */
    public f<HotSearchItem> f49948c;

    /* renamed from: d  reason: collision with root package name */
    private HotSearchItem f49949d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f49950e;
    @BindView(2131495526)
    View mContentContainer;
    @BindView(2131497858)
    TextView mContentView;
    @BindView(2131497867)
    TextView mCountView;
    @BindView(2131498521)
    View mImagePlaceHolder;
    @BindView(2131495067)
    RemoteImageView mImageView;
    @BindView(2131498033)
    TextView mNumView;
    @BindView(2131495573)
    View mPlaceHolder;
    @BindView(2131495556)
    View mRootView;

    public final void c_(boolean z) {
        this.f49950e = z;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49946a, false, 49893, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49946a, false, 49893, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f49950e || this.f49949d == null || this.f49949d.getWord() == null)) {
            this.f49948c.a(this.f49949d, i);
        }
    }

    public RankingListWordItemViewHolder(View view, f<HotSearchItem> fVar) {
        super(view);
        this.f49948c = fVar;
        ButterKnife.bind((Object) this, view);
    }

    public final /* synthetic */ void a_(Object obj, int i) {
        Drawable drawable;
        final int i2 = i;
        final HotSearchItem hotSearchItem = (HotSearchItem) obj;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i)}, this, f49946a, false, 49894, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i)}, this, f49946a, false, 49894, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b.a(this.itemView.getContext(), this.mNumView, i2);
        if (hotSearchItem != null && !hotSearchItem.isPlaceholder()) {
            b.a(this.mCountView, hotSearchItem.getHotValue());
            if (hotSearchItem.getType() == 0) {
                if (com.ss.android.ugc.aweme.discover.helper.b.b()) {
                    Context context = this.itemView.getContext();
                    TextView textView = this.mContentView;
                    int label = hotSearchItem.getLabel();
                    if (PatchProxy.isSupport(new Object[]{context, textView, Integer.valueOf(label)}, null, b.f49723a, true, 49811, new Class[]{Context.class, TextView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context, textView, Integer.valueOf(label)}, null, b.f49723a, true, 49811, new Class[]{Context.class, TextView.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        if (label <= 0 || label > d.f49651b.length) {
                            drawable = null;
                        } else {
                            drawable = a.a(context.getResources(), d.f49651b[label - 1]);
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
                    }
                } else {
                    b.b(this.itemView.getContext(), this.mContentView, hotSearchItem.getLabel());
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i)}, this, f49946a, false, 49895, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i)}, this, f49946a, false, 49895, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (com.ss.android.ugc.aweme.discover.helper.b.b()) {
            this.mImageView.setVisibility(0);
            this.mImagePlaceHolder.setVisibility(0);
            layoutParams.height = (int) UIUtils.dip2Px(this.itemView.getContext(), 52.0f);
        } else {
            this.mImageView.setVisibility(8);
            this.mImagePlaceHolder.setVisibility(8);
            layoutParams.height = (int) UIUtils.dip2Px(this.itemView.getContext(), 48.0f);
        }
        if (hotSearchItem == null || hotSearchItem.isPlaceholder()) {
            this.mPlaceHolder.setVisibility(0);
            this.mContentContainer.setVisibility(4);
            return;
        }
        this.f49949d = hotSearchItem;
        this.mPlaceHolder.setVisibility(8);
        this.mContentContainer.setVisibility(0);
        c.b(this.mImageView, hotSearchItem.getUrlModel());
        StringBuilder sb = new StringBuilder();
        if (hotSearchItem.getType() == 1) {
            sb.append("#");
        }
        sb.append(hotSearchItem.getWord());
        this.mContentView.setText(sb.toString());
        this.mContentContainer.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49951a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49951a, false, 49896, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49951a, false, 49896, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                } else if (System.currentTimeMillis() - RankingListWordItemViewHolder.this.f49947b >= 500) {
                    RankingListWordItemViewHolder.this.f49947b = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(hotSearchItem.getWord())) {
                        RankingListWordItemViewHolder.this.f49948c.b(hotSearchItem, i2);
                    }
                }
            }
        });
    }
}
