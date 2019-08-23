package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.live.feedpage.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0006J\b\u0010\u001d\u001a\u00020\u0006H\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/FollowLiveSkyLightViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "enterLiveCallBack", "Lkotlin/Function0;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "context", "Landroid/content/Context;", "mAvatarBorderViewController", "Lcom/ss/android/ugc/aweme/feed/ui/AvatarBorderViewController;", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "mLiveCircleView", "Lcom/ss/android/ugc/aweme/feed/ui/LiveCircleView;", "mRoomItem", "Lcom/ss/android/ugc/aweme/live/feedpage/RoomItem;", "mTvName", "Landroid/widget/TextView;", "bindView", "roomItem", "isFirstScene", "", "doShowUpAnimation", "endAnimation", "logLiveHeadShow", "setItemViewAlpha", "startAnimation", "watchLive", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowLiveSkyLightViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44730a;
    public static final a i = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    AnimatedImageView f44731b;

    /* renamed from: c  reason: collision with root package name */
    TextView f44732c;

    /* renamed from: d  reason: collision with root package name */
    Context f44733d;

    /* renamed from: e  reason: collision with root package name */
    LiveCircleView f44734e;

    /* renamed from: f  reason: collision with root package name */
    g f44735f;
    com.ss.android.ugc.aweme.feed.ui.a g = new com.ss.android.ugc.aweme.feed.ui.a(true, this.f44731b, this.f44731b, this.f44734e);
    final Function0<Unit> h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/FollowLiveSkyLightViewHolder$Companion;", "", "()V", "VIEW_HOLDER_TRANSLATION", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowLiveSkyLightViewHolder(@NotNull final View view, @NotNull Function0<Unit> function0) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(function0, "enterLiveCallBack");
        this.h = function0;
        View findViewById = view.findViewById(C0906R.id.b08);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_cover)");
        this.f44731b = (AnimatedImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.df7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.f44732c = (TextView) findViewById2;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f44733d = context;
        View findViewById3 = view.findViewById(C0906R.id.b2q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_live_circle)");
        this.f44734e = (LiveCircleView) findViewById3;
        this.f44731b.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44736a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FollowLiveSkyLightViewHolder f44737b;

            {
                this.f44737b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44736a, false, 40533, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44736a, false, 40533, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    FollowLiveSkyLightViewHolder followLiveSkyLightViewHolder = this.f44737b;
                    if (PatchProxy.isSupport(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40527, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40527, new Class[0], Void.TYPE);
                        return;
                    }
                    g gVar = followLiveSkyLightViewHolder.f44735f;
                    if (gVar != null) {
                        String str = gVar.f53404a;
                        Room room = gVar.f53405b;
                        if (room != null) {
                            Rect rect = new Rect();
                            int[] intArray = ArraysKt.toIntArray(new Integer[]{0, 0});
                            followLiveSkyLightViewHolder.itemView.getLocationOnScreen(intArray);
                            rect.left = intArray[0];
                            rect.top = intArray[1];
                            rect.right = intArray[0] + followLiveSkyLightViewHolder.f44731b.getMeasuredWidth();
                            rect.bottom = intArray[1] + followLiveSkyLightViewHolder.f44731b.getMeasuredHeight();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("story_live_source_rect", rect);
                            bundle.putString("live.intent.extra.REQUEST_ID", str);
                            bundle.putString("enter_method", "live_cover");
                            bundle.putLong("anchor_id", room.getOwnerUserId());
                            bundle.putString("live.intent.extra.ENTER_TYPE", "click");
                            com.ss.android.ugc.aweme.live.a.a(followLiveSkyLightViewHolder.f44733d, room.getId(), bundle, "homepage_follow");
                            followLiveSkyLightViewHolder.h.invoke();
                        }
                    }
                }
            }
        });
        this.f44731b.setOnTouchListener(com.ss.android.ugc.aweme.story.friends.a.a.a());
    }
}
