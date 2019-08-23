package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.a.g;
import com.ss.android.ugc.aweme.im.sdk.widget.CircleProgressTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0014J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StoryVideoSendViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StoryVideoReceiveViewHolder;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "uploadProgressIcon", "Lcom/ss/android/ugc/aweme/im/sdk/chat/net/video/VideoProgressIcon;", "uploadProgressView", "Lcom/ss/android/ugc/aweme/im/sdk/widget/CircleProgressTextView;", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryVideoContent;", "position", "bindStatusIv", "initViewRefs", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryVideoSendViewHolder extends StoryVideoReceiveViewHolder {
    public static ChangeQuickRedirect p;
    private g q;
    private CircleProgressTextView r;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 51645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 51645, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) this.itemView.findViewById(C0906R.id.cv9);
        View findViewById = this.itemView.findViewById(C0906R.id.b6c);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_upload_progress)");
        this.r = (CircleProgressTextView) findViewById;
        CircleProgressTextView circleProgressTextView = this.r;
        if (circleProgressTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadProgressView");
        }
        this.q = new g(circleProgressTextView, e(), this.j);
    }

    public final void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, p, false, 51646, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, p, false, 51646, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryVideoSendViewHolder(@NotNull View view, int i) {
        super(view, i);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    public final void a(@Nullable n nVar, @Nullable n nVar2, @Nullable StoryVideoContent storyVideoContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, storyVideoContent, Integer.valueOf(i)}, this, p, false, 51647, new Class[]{n.class, n.class, StoryVideoContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, storyVideoContent, Integer.valueOf(i)}, this, p, false, 51647, new Class[]{n.class, n.class, StoryVideoContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, storyVideoContent, i);
        g gVar = this.q;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadProgressIcon");
        }
        gVar.a(this.m);
        if (PatchProxy.isSupport(new Object[0], this, p, false, 51648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 51648, new Class[0], Void.TYPE);
        } else {
            n nVar3 = this.m;
            Intrinsics.checkExpressionValueIsNotNull(nVar3, "currentMessage");
            if (nVar3.getMsgStatus() == 3) {
                this.j.setImageResource(2130840085);
                this.j.setTag(50331648, 6);
                this.j.setTag(67108864, this.m);
                ImageView imageView = this.j;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "statusIv");
                imageView.setVisibility(0);
            } else {
                ImageView imageView2 = this.j;
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "statusIv");
                imageView2.setVisibility(8);
            }
        }
        this.i.setTag(50331648, 28);
    }
}
