package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.d.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.concurrent.CountDownLatch;

public class RankingListVideoItemViewHolder extends AnimatedViewHolder<Aweme> implements a<HotVideoItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49933a;

    /* renamed from: b  reason: collision with root package name */
    public long f49934b;

    /* renamed from: c  reason: collision with root package name */
    public CountDownLatch f49935c;

    /* renamed from: d  reason: collision with root package name */
    public f<Aweme> f49936d;

    /* renamed from: e  reason: collision with root package name */
    private HotVideoItem f49937e;
    private boolean k;
    private int l;
    @BindView(2131493162)
    TextView mAuthorName;
    @BindView(2131494645)
    View mContentContainer;
    @BindView(2131494643)
    TextView mHotVideoOrder;
    @BindView(2131494644)
    View mPlaceHolder;
    @BindView(2131498479)
    MentionTextView mVideoTitle;
    @BindView(2131494646)
    TextView mViewCount;

    public final void a() {
    }

    public final void c_(boolean z) {
        this.k = z;
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49933a, false, 49885, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49933a, false, 49885, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49933a, false, 49882, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49933a, false, 49882, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.k || this.f49937e == null || this.f49937e.getAweme() == null)) {
            this.f49936d.a(this.f49937e.getAweme(), i);
        }
    }

    public RankingListVideoItemViewHolder(View view, f<Aweme> fVar) {
        this(view, fVar, 1);
    }

    public final /* synthetic */ void a_(Object obj, int i) {
        long j;
        final int i2 = i;
        HotVideoItem hotVideoItem = (HotVideoItem) obj;
        if (PatchProxy.isSupport(new Object[]{hotVideoItem, Integer.valueOf(i)}, this, f49933a, false, 49883, new Class[]{HotVideoItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotVideoItem, Integer.valueOf(i)}, this, f49933a, false, 49883, new Class[]{HotVideoItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b.a(this.itemView.getContext(), this.mHotVideoOrder, i2);
        if (!(hotVideoItem == null || hotVideoItem.getAweme() == null)) {
            b.b(this.itemView.getContext(), this.mVideoTitle, hotVideoItem.getLabel());
            if (this.l == 3) {
                b.a(this.mViewCount, hotVideoItem.getHotValue());
                Drawable drawable = ContextCompat.getDrawable(this.itemView.getContext(), 2130839655);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.mViewCount.setCompoundDrawables(drawable, null, null, null);
                }
            } else {
                TextView textView = this.mViewCount;
                String hotValue = hotVideoItem.getHotValue();
                if (PatchProxy.isSupport(new Object[]{textView, hotValue}, null, b.f49723a, true, 49813, new Class[]{TextView.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textView, hotValue}, null, b.f49723a, true, 49813, new Class[]{TextView.class, String.class}, Void.TYPE);
                } else {
                    try {
                        j = Long.parseLong(hotValue);
                    } catch (NumberFormatException unused) {
                        j = 0;
                    }
                    textView.setText(textView.getContext().getString(C0906R.string.cng, new Object[]{com.ss.android.ugc.aweme.i18n.b.a(j)}));
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{hotVideoItem, Integer.valueOf(i)}, this, f49933a, false, 49884, new Class[]{HotVideoItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotVideoItem, Integer.valueOf(i)}, this, f49933a, false, 49884, new Class[]{HotVideoItem.class, Integer.TYPE}, Void.TYPE);
        } else if (hotVideoItem == null || hotVideoItem.getAweme() == null || hotVideoItem.getAweme().getAuthor() == null) {
            this.mPlaceHolder.setVisibility(0);
            this.mContentContainer.setVisibility(8);
        } else {
            this.f49937e = hotVideoItem;
            final Aweme aweme = this.f49937e.getAweme();
            this.mContentContainer.setVisibility(0);
            this.mPlaceHolder.setVisibility(8);
            this.mAuthorName.setText(aweme.getAuthor().getNickname());
            AbTestManager.a();
            if (!aweme.isHashTag()) {
                com.ss.android.ugc.aweme.newfollow.a.b.h(aweme);
            }
            this.mVideoTitle.setText(aweme.getDesc());
            this.mVideoTitle.setSpanColor(this.mVideoTitle.getCurrentTextColor());
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f49933a, false, 49886, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, this, f49933a, false, 49886, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                Video video = aweme.getVideo();
                if (video != null) {
                    if (this.k) {
                        this.i = true;
                        this.h.a(video.getCover());
                        this.h.setImageLoadFinishListener(new b(this));
                    } else if (e() && a(video.getDynamicCover())) {
                        this.i = true;
                        this.h.a(video.getDynamicCover());
                        this.h.setImageLoadFinishListener(new c(this));
                    } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                        this.h.setImageResource(C0906R.color.a0k);
                    } else {
                        c.b(this.h, video.getCover());
                    }
                }
            }
            this.mContentContainer.setOnTouchListener(new ai() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49938a;

                public final void b(View view, MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49938a, false, 49890, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49938a, false, 49890, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    } else if (System.currentTimeMillis() - RankingListVideoItemViewHolder.this.f49934b >= 500) {
                        RankingListVideoItemViewHolder.this.f49934b = System.currentTimeMillis();
                        if (aweme.getAuthor() != null) {
                            RankingListVideoItemViewHolder.this.f49936d.b(aweme, i2);
                        }
                    }
                }
            });
        }
    }

    public RankingListVideoItemViewHolder(View view, f<Aweme> fVar, int i) {
        super(view);
        this.f49936d = fVar;
        this.l = i;
        ButterKnife.bind((Object) this, view);
        if (PatchProxy.isSupport(new Object[0], this, f49933a, false, 49887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49933a, false, 49887, new Class[0], Void.TYPE);
            return;
        }
        this.h = (AnimatedImageView) this.itemView.findViewById(C0906R.id.drv);
        if (Build.VERSION.SDK_INT >= 21) {
            this.h.setOutlineProvider(new ViewOutlineProvider() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49942a;

                @RequiresApi(api = 21)
                public final void getOutline(View view, Outline outline) {
                    if (PatchProxy.isSupport(new Object[]{view, outline}, this, f49942a, false, 49891, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, outline}, this, f49942a, false, 49891, new Class[]{View.class, Outline.class}, Void.TYPE);
                        return;
                    }
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), UIUtils.dip2Px(RankingListVideoItemViewHolder.this.h.getContext(), 2.0f));
                }
            });
            this.h.setClipToOutline(true);
        }
    }
}
