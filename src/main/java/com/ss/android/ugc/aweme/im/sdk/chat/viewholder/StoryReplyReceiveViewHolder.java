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
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001eH\u0002R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StoryReplyReceiveViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryReplyContent;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "mStoryCoverImage", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mStoryPlayableImage", "Landroid/widget/ImageView;", "mStoryReplyText", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mStoryUnplayableLayout", "Landroid/widget/LinearLayout;", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "position", "callStateTaskFromNet", "initViewRefs", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "updateStoryCover", "storyState", "", "updateStoryState", "state", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class StoryReplyReceiveViewHolder extends BaseViewHolder<StoryReplyContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51145a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51146b;
    private DmtTextView p;
    private LinearLayout q;
    private ImageView r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class a<TTaskResult, TContinuationResult> implements g<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51147a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryReplyReceiveViewHolder f51148b;

        a(StoryReplyReceiveViewHolder storyReplyReceiveViewHolder) {
            this.f51148b = storyReplyReceiveViewHolder;
        }

        public final /* synthetic */ Object then(i iVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f51147a, false, 51635, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f51147a, false, 51635, new Class[]{i.class}, Void.class);
            }
            StoryReplyReceiveViewHolder storyReplyReceiveViewHolder = this.f51148b;
            if (iVar == null || !iVar.b() || ((Boolean) iVar.e()).booleanValue()) {
                z = false;
            }
            storyReplyReceiveViewHolder.a(z);
            return null;
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51145a, false, 51629, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51145a, false, 51629, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        View findViewById = this.itemView.findViewById(C0906R.id.b5o);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_story_cover)");
        this.f51146b = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(C0906R.id.djz);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_story_reply)");
        this.p = (DmtTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(C0906R.id.b5q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_story_unplayable)");
        this.q = (LinearLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(C0906R.id.b5p);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.iv_story_playable)");
        this.r = (ImageView) findViewById4;
        this.i = this.itemView.findViewById(C0906R.id.yp);
    }

    private final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51145a, false, 51634, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51145a, false, 51634, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            if (((StoryReplyContent) this.k).getStoryContent().getStoryCover() != null) {
                RemoteImageView remoteImageView = this.f51146b;
                if (remoteImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
                }
                c.b(remoteImageView, ((StoryReplyContent) this.k).getStoryContent().getStoryCover());
            } else {
                RemoteImageView remoteImageView2 = this.f51146b;
                if (remoteImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
                }
                remoteImageView2.setImageURI("");
            }
            ImageView imageView = this.r;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryPlayableImage");
            }
            imageView.setVisibility(0);
            LinearLayout linearLayout = this.q;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryUnplayableLayout");
            }
            linearLayout.setVisibility(8);
        } else {
            RemoteImageView remoteImageView3 = this.f51146b;
            if (remoteImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
            }
            remoteImageView3.setImageURI("");
            ImageView imageView2 = this.r;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryPlayableImage");
            }
            imageView2.setVisibility(8);
            LinearLayout linearLayout2 = this.q;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryUnplayableLayout");
            }
            linearLayout2.setVisibility(0);
        }
    }

    public void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51145a, false, 51630, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51145a, false, 51630, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        if (onClickListener != null) {
            this.n.a(this.i);
            this.i.setOnClickListener(onClickListener);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51145a, false, 51633, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51145a, false, 51633, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((StoryReplyContent) this.k).setStoryState(z);
        b(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryReplyReceiveViewHolder(@NotNull View view, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    public void a(@Nullable n nVar, @Nullable n nVar2, @Nullable StoryReplyContent storyReplyContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        StoryReplyContent storyReplyContent2 = storyReplyContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, storyReplyContent2, Integer.valueOf(i)}, this, f51145a, false, 51631, new Class[]{n.class, n.class, StoryReplyContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, storyReplyContent2, Integer.valueOf(i)}, this, f51145a, false, 51631, new Class[]{n.class, n.class, StoryReplyContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar3, nVar4, storyReplyContent2, i);
        if (!(nVar3 == null || storyReplyContent2 == null)) {
            if (nVar.getLocalExt() == null || !nVar.getLocalExt().containsKey("story_state_unexpected")) {
                Object tag = nVar3.getTag(220224);
                if (tag == null || Intrinsics.areEqual(tag, (Object) "story_state_net_error")) {
                    if (PatchProxy.isSupport(new Object[]{nVar3}, this, f51145a, false, 51632, new Class[]{n.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{nVar3}, this, f51145a, false, 51632, new Class[]{n.class}, Void.TYPE);
                    } else {
                        nVar3.setTag(220224, "story_state_checking");
                        r.a(((StoryReplyContent) this.k).getStoryContent().getStoryId(), nVar3).a((g<TResult, TContinuationResult>) new a<TResult,TContinuationResult>(this), i.f1052b);
                    }
                } else if (Intrinsics.areEqual(tag, (Object) "story_state_checked")) {
                    a(true);
                }
            } else {
                a(false);
            }
            if (TextUtils.isEmpty(storyReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.p;
                if (dmtTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStoryReplyText");
                }
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.p;
                if (dmtTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStoryReplyText");
                }
                dmtTextView2.setVisibility(0);
                com.ss.android.ugc.aweme.im.sdk.d.a a2 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeImManager.instance()");
                com.ss.android.ugc.aweme.im.service.c e2 = a2.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "AwemeImManager.instance().proxy");
                if (e2.getIMSetting().f52879b == 1) {
                    String storyReplyText = storyReplyContent.getStoryReplyText();
                    if (storyReplyText == null) {
                        Intrinsics.throwNpe();
                    }
                    if (storyReplyText.length() <= 1024) {
                        DmtTextView dmtTextView3 = this.p;
                        if (dmtTextView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mStoryReplyText");
                        }
                        e.a(dmtTextView3, storyReplyContent.getStoryReplyText(), this.h, storyReplyContent2.isCard, nVar.getMsgId());
                    }
                }
                DmtTextView dmtTextView4 = this.p;
                if (dmtTextView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStoryReplyText");
                }
                dmtTextView4.setText(storyReplyContent.getStoryReplyText());
            }
            this.i.setTag(50331648, 25);
            View view = this.i;
            RemoteImageView remoteImageView = this.f51146b;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryCoverImage");
            }
            view.setTag(117440512, remoteImageView);
            this.i.setTag(67108864, nVar3);
        }
    }
}
