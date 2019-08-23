package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.im.core.d.a;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ac;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StoryVideoReceiveViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryVideoContent;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "mNoticeText", "Landroid/widget/TextView;", "mStoryCoverImage", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mStoryPlayableImage", "Landroid/widget/ImageView;", "getMStoryPlayableImage", "()Landroid/widget/ImageView;", "setMStoryPlayableImage", "(Landroid/widget/ImageView;)V", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "position", "initViewRefs", "measureContentSize", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class StoryVideoReceiveViewHolder extends BaseViewHolder<StoryVideoContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51150a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f51151b;
    private RemoteImageView p;
    private TextView q;

    @NotNull
    public final ImageView e() {
        if (PatchProxy.isSupport(new Object[0], this, f51150a, false, 51639, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f51150a, false, 51639, new Class[0], ImageView.class);
        }
        ImageView imageView = this.f51151b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStoryPlayableImage");
        }
        return imageView;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51150a, false, 51641, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51150a, false, 51641, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        View findViewById = this.itemView.findViewById(C0906R.id.b5p);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_story_playable)");
        this.f51151b = (ImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(C0906R.id.b5o);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.iv_story_cover)");
        this.p = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(C0906R.id.brq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.notice_tv)");
        this.q = (TextView) findViewById3;
        this.i = this.itemView.findViewById(C0906R.id.yp);
    }

    public void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51150a, false, 51642, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51150a, false, 51642, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        if (onClickListener != null) {
            this.n.a(this.i);
            this.i.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryVideoReceiveViewHolder(@NotNull View view, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    public void a(@Nullable n nVar, @Nullable n nVar2, @Nullable StoryVideoContent storyVideoContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        StoryVideoContent storyVideoContent2 = storyVideoContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, storyVideoContent2, Integer.valueOf(i)}, this, f51150a, false, 51643, new Class[]{n.class, n.class, StoryVideoContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, storyVideoContent2, Integer.valueOf(i)}, this, f51150a, false, 51643, new Class[]{n.class, n.class, StoryVideoContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar3, nVar4, storyVideoContent2, i);
        if (PatchProxy.isSupport(new Object[0], this, f51150a, false, 51644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51150a, false, 51644, new Class[0], Void.TYPE);
        } else {
            RemoteImageView remoteImageView = this.p;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
            }
            Integer[] a2 = ac.a(remoteImageView, (float) ((StoryVideoContent) this.k).getWidth(), (float) ((StoryVideoContent) this.k).getHeight());
            RemoteImageView remoteImageView2 = this.p;
            if (remoteImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
            }
            ViewGroup.LayoutParams layoutParams = remoteImageView2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = a2[0].intValue();
                layoutParams2.height = a2[1].intValue();
                RemoteImageView remoteImageView3 = this.p;
                if (remoteImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
                }
                remoteImageView3.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (!(nVar3 == null || storyVideoContent2 == null)) {
            if (nVar.getAttachments() != null && nVar.getAttachments().size() >= 3) {
                List<a> attachments = nVar.getAttachments();
                Intrinsics.checkExpressionValueIsNotNull(attachments, "msg.attachments");
                for (a aVar : attachments) {
                    if (aVar != null) {
                        if (TextUtils.isEmpty(storyVideoContent.getLocalVideo()) && aVar.getIndex() == 1) {
                            storyVideoContent2.setLocalVideo(aVar.getLocalPath());
                        } else if (TextUtils.isEmpty(storyVideoContent.getLocalPoster()) && aVar.getIndex() == 2) {
                            storyVideoContent2.setLocalPoster(aVar.getLocalPath());
                        }
                    }
                    if (!TextUtils.isEmpty(storyVideoContent.getLocalVideo())) {
                        TextUtils.isEmpty(storyVideoContent.getLocalPoster());
                    }
                }
            }
            UrlModel a3 = com.ss.android.ugc.aweme.im.sdk.chat.c.a.a(storyVideoContent.getDisplayPoster(), storyVideoContent.getLocalPoster());
            RemoteImageView remoteImageView4 = this.p;
            if (remoteImageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
            }
            c.b(remoteImageView4, a3);
            this.i.setTag(50331648, 29);
            View view = this.i;
            RemoteImageView remoteImageView5 = this.p;
            if (remoteImageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
            }
            view.setTag(67108864, remoteImageView5);
        }
    }
}
