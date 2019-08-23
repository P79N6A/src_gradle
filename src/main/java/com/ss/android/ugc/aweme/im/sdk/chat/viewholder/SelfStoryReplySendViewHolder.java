package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\u00110\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/SelfStoryReplySendViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/SelfStoryReplyReceiveViewHolder;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "mStatusIcon", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;", "getMStatusIcon", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;", "mStatusIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getMStatusIv", "()Landroid/widget/ImageView;", "mStoryReplyStatusText", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMStoryReplyStatusText", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/SelfStoryReplyContent;", "position", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SelfStoryReplySendViewHolder extends SelfStoryReplyReceiveViewHolder {
    public static ChangeQuickRedirect t;
    public final DmtTextView u;
    public final ImageView v;
    @NotNull
    public final c w = new c(this.v);

    public final void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, t, false, 51519, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, t, false, 51519, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.v.setOnClickListener(onClickListener);
        this.n.a(this.v);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelfStoryReplySendViewHolder(@NotNull View view, int i) {
        super(view, i);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.u = (DmtTextView) view.findViewById(C0906R.id.dk0);
        this.v = (ImageView) view.findViewById(C0906R.id.cv9);
    }

    public final void a(@Nullable n nVar, @Nullable n nVar2, @Nullable SelfStoryReplyContent selfStoryReplyContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, selfStoryReplyContent, Integer.valueOf(i)}, this, t, false, 51520, new Class[]{n.class, n.class, SelfStoryReplyContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, selfStoryReplyContent, Integer.valueOf(i)}, this, t, false, 51520, new Class[]{n.class, n.class, SelfStoryReplyContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, selfStoryReplyContent, i);
        this.f51094b.setText(C0906R.string.ayr);
        if (selfStoryReplyContent != null) {
            if (TextUtils.isEmpty(selfStoryReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.u;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mStoryReplyStatusText");
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.u;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "mStoryReplyStatusText");
                dmtTextView2.setText(selfStoryReplyContent.getStoryReplyText());
                DmtTextView dmtTextView3 = this.u;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "mStoryReplyStatusText");
                dmtTextView3.setVisibility(4);
            }
        }
        this.w.a(this.m);
    }
}
