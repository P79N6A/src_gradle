package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedLastWatchItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mHintText", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "followFeed", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeed;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowFeedLastWatchItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57566a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f57567c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final DmtTextView f57568b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedLastWatchItemViewHolder$Companion;", "", "()V", "createViewHolder", "Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedLastWatchItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57570a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFeedLastWatchItemViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57569a;

            public final void onViewDetachedFromWindow(@Nullable View view) {
            }

            public final void onViewAttachedToWindow(@Nullable View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57569a, false, 62224, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57569a, false, 62224, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.newfollow.g.a.e();
            }
        });
        View findViewById = view.findViewById(C0906R.id.dlm);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_watch_history)");
        this.f57568b = (DmtTextView) findViewById;
    }
}
