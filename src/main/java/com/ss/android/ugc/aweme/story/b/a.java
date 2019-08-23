package com.ss.android.ugc.aweme.story.b;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.story.api.b.a;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.detail.c;
import com.ss.android.ugc.aweme.story.detail.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/story/services/StoryRingService;", "Lcom/ss/android/ugc/aweme/story/api/IStoryRingService;", "()V", "createAvatarOpenStoryRequest", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest;", "context", "Landroid/content/Context;", "params", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "avatarView", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$OnPreloadListener;", "createStoryCircleHelper", "Lcom/ss/android/ugc/aweme/story/api/userstory/IStoryCircleHelper;", "circleView", "loadingView", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71879a;

    @NotNull
    public final b a(@NotNull View view, @NotNull View view2, @NotNull AnimationImageView animationImageView) {
        View view3 = view;
        View view4 = view2;
        AnimationImageView animationImageView2 = animationImageView;
        if (PatchProxy.isSupport(new Object[]{view3, view4, animationImageView2}, this, f71879a, false, 85104, new Class[]{View.class, View.class, AnimationImageView.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{view3, view4, animationImageView2}, this, f71879a, false, 85104, new Class[]{View.class, View.class, AnimationImageView.class}, b.class);
        }
        Intrinsics.checkParameterIsNotNull(view3, "avatarView");
        Intrinsics.checkParameterIsNotNull(view4, "circleView");
        Intrinsics.checkParameterIsNotNull(animationImageView2, "loadingView");
        return new e(view3, view4, animationImageView2);
    }

    @NotNull
    public final com.ss.android.ugc.aweme.story.api.b.a a(@NotNull Context context, @NotNull f fVar, @NotNull View view, @NotNull a.c cVar) {
        Context context2 = context;
        f fVar2 = fVar;
        View view2 = view;
        a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, fVar2, view2, cVar2}, this, f71879a, false, 85103, new Class[]{Context.class, f.class, View.class, a.c.class}, com.ss.android.ugc.aweme.story.api.b.a.class)) {
            Object[] objArr = {context2, fVar2, view2, cVar2};
            return (com.ss.android.ugc.aweme.story.api.b.a) PatchProxy.accessDispatch(objArr, this, f71879a, false, 85103, new Class[]{Context.class, f.class, View.class, a.c.class}, com.ss.android.ugc.aweme.story.api.b.a.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(fVar2, "params");
        Intrinsics.checkParameterIsNotNull(view2, "avatarView");
        Intrinsics.checkParameterIsNotNull(cVar2, "listener");
        return new c(context2, fVar2, view2, cVar2);
    }
}
