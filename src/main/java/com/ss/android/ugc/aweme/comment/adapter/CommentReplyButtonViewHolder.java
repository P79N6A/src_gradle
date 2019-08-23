package com.ss.android.ugc.aweme.comment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.ui.d;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.i18n.b;
import org.jetbrains.annotations.NotNull;

public class CommentReplyButtonViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36287a;

    /* renamed from: b  reason: collision with root package name */
    public CommentReplyButtonStruct f36288b;

    /* renamed from: c  reason: collision with root package name */
    private View f36289c;
    @BindView(2131493990)
    View mDivider;
    @BindView(2131494789)
    ImageView mImgCollapse;
    @BindView(2131494790)
    ImageView mImgExpand;
    @BindView(2131495287)
    LinearLayout mLayoutButton;
    @BindView(2131495288)
    DmtLoadingLayout mLayoutLoading;
    @BindView(2131498091)
    DmtTextView mTvTitle;

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f36287a, false, 27227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36287a, false, 27227, new Class[0], Void.TYPE);
            return;
        }
        this.mLayoutButton.setVisibility(8);
        this.mLayoutLoading.setVisibility(0);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36287a, false, 27224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36287a, false, 27224, new Class[0], Void.TYPE);
            return;
        }
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mTvTitle.setText(String.format(this.mTvTitle.getResources().getString(C0906R.string.bz_), new Object[]{b.a((long) (this.f36288b.getReplyCommentTotal() - this.f36288b.getExpandSize()))}));
        this.mImgExpand.setVisibility(0);
        this.mImgCollapse.setVisibility(8);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36287a, false, 27225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36287a, false, 27225, new Class[0], Void.TYPE);
            return;
        }
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mTvTitle.setText(C0906R.string.bza);
        this.mImgExpand.setVisibility(0);
        this.mImgCollapse.setVisibility(8);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f36287a, false, 27226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36287a, false, 27226, new Class[0], Void.TYPE);
            return;
        }
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mTvTitle.setText(C0906R.string.bz9);
        this.mImgExpand.setVisibility(8);
        this.mImgCollapse.setVisibility(0);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36287a, false, 27222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36287a, false, 27222, new Class[0], Void.TYPE);
        } else if (this.f36288b.getReplyCommentTotal() > this.f36288b.getTopSize() || this.f36288b.getButtonStatus() == 4) {
            switch (this.f36288b.getButtonStatus()) {
                case 0:
                    a(true);
                    b();
                    return;
                case 1:
                    a(true);
                    c();
                    return;
                case 2:
                    if (this.f36288b != null) {
                        int expandSize = this.f36288b.getExpandSize();
                        this.f36288b.setReplyCommentTotal(expandSize);
                        if (expandSize <= this.f36288b.getTopSize()) {
                            a(4);
                            return;
                        }
                    }
                    a(true);
                    d();
                    return;
                case 3:
                    a(true);
                    e();
                    return;
                case 4:
                    a(false);
                    e();
                    break;
            }
        } else {
            a(4);
        }
    }

    public final void a(CommentReplyButtonStruct commentReplyButtonStruct) {
        CommentReplyButtonStruct commentReplyButtonStruct2 = commentReplyButtonStruct;
        if (PatchProxy.isSupport(new Object[]{commentReplyButtonStruct2}, this, f36287a, false, 27220, new Class[]{CommentReplyButtonStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commentReplyButtonStruct2}, this, f36287a, false, 27220, new Class[]{CommentReplyButtonStruct.class}, Void.TYPE);
        } else if (commentReplyButtonStruct2 != null) {
            this.f36288b = commentReplyButtonStruct2;
            a();
        }
    }

    private void a(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36287a, false, 27223, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36287a, false, 27223, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f36289c.getVisibility() != 0) {
            z2 = false;
        }
        if (z ^ z2) {
            if (z) {
                this.f36289c.getLayoutParams().height = (int) UIUtils.dip2Px(GlobalContext.getContext(), 28.0f);
                this.f36289c.setVisibility(0);
                return;
            }
            this.f36289c.getLayoutParams().height = 0;
            this.f36289c.setVisibility(8);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f36287a, false, 27221, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f36287a, false, 27221, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f36288b != null) {
            this.f36288b.setButtonStatus(i);
        }
        a();
    }

    public CommentReplyButtonViewHolder(View view, final CommentViewHolder.a aVar) {
        super(view);
        this.f36289c = view;
        ButterKnife.bind((Object) this, view);
        view.setOnTouchListener(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36290a;

            public final void a(@NotNull View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36290a, false, 27229, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36290a, false, 27229, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (!(CommentReplyButtonViewHolder.this.f36288b == null || aVar == null || CommentReplyButtonViewHolder.this.f36288b.getButtonStatus() == 3)) {
                    aVar.a(CommentReplyButtonViewHolder.this.f36288b, CommentReplyButtonViewHolder.this.getAdapterPosition());
                }
            }
        });
        this.mLayoutLoading.setProgressBarInfo(u.a(28.0d));
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f36287a, false, 27228, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36287a, false, 27228, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((a.b().a() instanceof ForwardDetailActivity) || (a.b().a() instanceof OriginDetailActivity)) {
            z = true;
        }
        if (z) {
            this.mTvTitle.setTextColor(view.getResources().getColor(C0906R.color.zx));
            this.mImgCollapse.setImageResource(2130839268);
            this.mImgExpand.setImageResource(2130839270);
            this.mDivider.setBackgroundResource(2130837882);
        }
    }
}
