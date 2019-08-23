package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import a.g;
import a.i;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.e;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0014J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002R\u0019\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\u00120\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n \n*\u0004\u0018\u00010\u00120\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0017\u001a\n \n*\u0004\u0018\u00010\u00180\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/SelfStoryReplyReceiveViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/SelfStoryReplyContent;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "mStoryCoverImage", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "getMStoryCoverImage", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mStoryPlayableImage", "Landroid/widget/ImageView;", "getMStoryPlayableImage", "()Landroid/widget/ImageView;", "mStoryReplyText", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMStoryReplyText", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mStoryReplyTitle", "getMStoryReplyTitle", "mStoryUnplayableLayout", "Landroid/widget/LinearLayout;", "getMStoryUnplayableLayout", "()Landroid/widget/LinearLayout;", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "position", "initViewRefs", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "updateStoryState", "state", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class SelfStoryReplyReceiveViewHolder extends BaseViewHolder<SelfStoryReplyContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51093a;

    /* renamed from: b  reason: collision with root package name */
    public final DmtTextView f51094b;
    public final RemoteImageView p;
    public final DmtTextView q;
    public final ImageView r;
    public final LinearLayout s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then", "com/ss/android/ugc/aweme/im/sdk/chat/viewholder/SelfStoryReplyReceiveViewHolder$bind$1$1"}, k = 3, mv = {1, 1, 15})
    static final class a<TTaskResult, TContinuationResult> implements g<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SelfStoryReplyReceiveViewHolder f51096b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f51097c;

        a(SelfStoryReplyReceiveViewHolder selfStoryReplyReceiveViewHolder, n nVar) {
            this.f51096b = selfStoryReplyReceiveViewHolder;
            this.f51097c = nVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f51095a, false, 51518, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f51095a, false, 51518, new Class[]{i.class}, Void.class);
            }
            SelfStoryReplyReceiveViewHolder selfStoryReplyReceiveViewHolder = this.f51096b;
            if (iVar == null || !iVar.b() || ((Boolean) iVar.e()).booleanValue()) {
                z = false;
            }
            selfStoryReplyReceiveViewHolder.a(z);
            return null;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51093a, false, 51514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51093a, false, 51514, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
    }

    public void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51093a, false, 51515, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51093a, false, 51515, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.n.a(this.i);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51093a, false, 51517, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51093a, false, 51517, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((SelfStoryReplyContent) this.k).setStoryState(z);
        if (z) {
            if (((SelfStoryReplyContent) this.k).getStoryContent().getStoryCover() != null) {
                c.b(this.p, ((SelfStoryReplyContent) this.k).getStoryContent().getStoryCover());
            } else {
                this.p.setImageURI("");
            }
            ImageView imageView = this.r;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mStoryPlayableImage");
            imageView.setVisibility(0);
            LinearLayout linearLayout = this.s;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mStoryUnplayableLayout");
            linearLayout.setVisibility(8);
            return;
        }
        this.p.setImageURI("");
        ImageView imageView2 = this.r;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "mStoryPlayableImage");
        imageView2.setVisibility(8);
        LinearLayout linearLayout2 = this.s;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mStoryUnplayableLayout");
        linearLayout2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelfStoryReplyReceiveViewHolder(@NotNull View view, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f51094b = (DmtTextView) view.findViewById(C0906R.id.cw7);
        this.p = (RemoteImageView) view.findViewById(C0906R.id.b5o);
        this.q = (DmtTextView) view.findViewById(C0906R.id.djz);
        this.r = (ImageView) view.findViewById(C0906R.id.b5p);
        this.s = (LinearLayout) view.findViewById(C0906R.id.b5q);
    }

    public void a(@Nullable n nVar, @Nullable n nVar2, @Nullable SelfStoryReplyContent selfStoryReplyContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        SelfStoryReplyContent selfStoryReplyContent2 = selfStoryReplyContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, selfStoryReplyContent2, Integer.valueOf(i)}, this, f51093a, false, 51516, new Class[]{n.class, n.class, SelfStoryReplyContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, selfStoryReplyContent2, Integer.valueOf(i)}, this, f51093a, false, 51516, new Class[]{n.class, n.class, SelfStoryReplyContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar3, nVar4, selfStoryReplyContent2, i);
        if (!(selfStoryReplyContent2 == null || nVar3 == null)) {
            this.f51094b.setText(C0906R.string.ayq);
            if (nVar.getLocalExt() == null || !nVar.getLocalExt().containsKey("story_state_unexpected")) {
                Object tag = nVar3.getTag(220224);
                if (tag == null || Intrinsics.areEqual(tag, (Object) "story_state_net_error")) {
                    String storyId = selfStoryReplyContent.getStoryContent().getStoryId();
                    if (storyId != null) {
                        r.a(storyId, nVar3).a((g<TResult, TContinuationResult>) new a<TResult,TContinuationResult>(this, nVar3), i.f1052b);
                    }
                } else if (Intrinsics.areEqual(tag, (Object) "story_state_checked")) {
                    a(true);
                }
            } else {
                a(false);
            }
            if (TextUtils.isEmpty(selfStoryReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.q;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mStoryReplyText");
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.q;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "mStoryReplyText");
                dmtTextView2.setVisibility(0);
                com.ss.android.ugc.aweme.im.sdk.d.a a2 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeImManager.instance()");
                com.ss.android.ugc.aweme.im.service.c e2 = a2.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "AwemeImManager.instance().proxy");
                if (e2.getIMSetting().f52879b == 1) {
                    String storyReplyText = selfStoryReplyContent.getStoryReplyText();
                    if (storyReplyText == null) {
                        Intrinsics.throwNpe();
                    }
                    if (storyReplyText.length() <= 1024) {
                        e.a(this.q, selfStoryReplyContent.getStoryReplyText(), this.h, selfStoryReplyContent2.isCard, nVar.getMsgId());
                    }
                }
                DmtTextView dmtTextView3 = this.q;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "mStoryReplyText");
                dmtTextView3.setText(selfStoryReplyContent.getStoryReplyText());
            }
        }
        this.i.setTag(50331648, 32);
        this.i.setTag(117440512, this.p);
        this.i.setTag(67108864, nVar3);
    }
}
