package com.ss.android.ugc.aweme.story.friends.a;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/util/LoadingAninmationUtils;", "", "()V", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73052a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\"\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ*\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/util/LoadingAninmationUtils$Companion;", "", "()V", "hideLoading", "", "mIvAnimation", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "mAvatarRing", "Landroid/view/View;", "showLoading", "isRead", "", "isShowUploadEror", "showPublishAnimation", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73053a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@Nullable AnimationImageView animationImageView, @Nullable View view, boolean z) {
            AnimationImageView animationImageView2 = animationImageView;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{animationImageView2, view2, (byte) 0}, this, f73053a, false, 84635, new Class[]{AnimationImageView.class, View.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animationImageView2, view2, (byte) 0}, this, f73053a, false, 84635, new Class[]{AnimationImageView.class, View.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (animationImageView2 != null) {
                animationImageView2.setVisibility(0);
            }
            if (animationImageView2 != null && animationImageView.isAnimating()) {
                animationImageView.cancelAnimation();
            }
            if (animationImageView2 != null) {
                animationImageView2.setAnimation("story_unread_loading_upload_lottie.json");
            }
            if (animationImageView2 != null) {
                animationImageView.playAnimation();
            }
            if (animationImageView2 != null) {
                animationImageView2.loop(true);
            }
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }
}
