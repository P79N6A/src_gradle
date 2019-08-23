package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0014J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StoryReplySendViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StoryReplyReceiveViewHolder;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "mStatusIcon", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;", "mStoryReplyStatusText", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryReplyContent;", "position", "initViewRefs", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryReplySendViewHolder extends StoryReplyReceiveViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51149b;
    private DmtTextView p;
    private c q;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51149b, false, 51636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51149b, false, 51636, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        View findViewById = this.itemView.findViewById(C0906R.id.dk0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_story_reply_status)");
        this.p = (DmtTextView) findViewById;
        this.j = (ImageView) this.itemView.findViewById(C0906R.id.cv9);
        this.q = new c(this.j);
    }

    public final void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51149b, false, 51637, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51149b, false, 51637, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryReplySendViewHolder(@NotNull View view, int i) {
        super(view, i);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    public final void a(@Nullable n nVar, @Nullable n nVar2, @Nullable StoryReplyContent storyReplyContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, storyReplyContent, Integer.valueOf(i)}, this, f51149b, false, 51638, new Class[]{n.class, n.class, StoryReplyContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, storyReplyContent, Integer.valueOf(i)}, this, f51149b, false, 51638, new Class[]{n.class, n.class, StoryReplyContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, storyReplyContent, i);
        if (storyReplyContent == null || TextUtils.isEmpty(storyReplyContent.getStoryReplyText())) {
            DmtTextView dmtTextView = this.p;
            if (dmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryReplyStatusText");
            }
            dmtTextView.setVisibility(8);
        } else {
            DmtTextView dmtTextView2 = this.p;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryReplyStatusText");
            }
            dmtTextView2.setText(storyReplyContent.getStoryReplyText());
            DmtTextView dmtTextView3 = this.p;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryReplyStatusText");
            }
            dmtTextView3.setVisibility(4);
        }
        c cVar = this.q;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusIcon");
        }
        cVar.a(this.m);
    }
}
