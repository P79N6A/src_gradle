package com.ss.android.ugc.aweme.story.b;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.story.a.a;
import com.ss.android.ugc.aweme.story.api.b.c;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.h;
import com.ss.android.ugc.aweme.story.detail.f;
import com.ss.android.ugc.aweme.story.friends.UserStoryListWidget;
import com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J.\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016JB\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/services/StoryService;", "Lcom/ss/android/ugc/aweme/story/api/IStoryService;", "()V", "buildStoryDetailIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "params", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "userStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "createProfileStoryWidget", "Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;", "createStoryHeadView", "Lcom/ss/android/ugc/aweme/story/api/userstory/IUserStoryListView;", "context", "Landroid/content/Context;", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "getUserStoryReadState", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lcom/ss/android/ugc/aweme/story/api/userstory/UserStoryReadState;", "onLogout", "", "startStoryDetailActivity", "requestCode", "", "avatar", "Landroid/view/View;", "bg", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71880a;

    @NotNull
    public final Widget a() {
        if (!PatchProxy.isSupport(new Object[0], this, f71880a, false, 85110, new Class[0], Widget.class)) {
            return new MyProfileStoryWidget();
        }
        return (Widget) PatchProxy.accessDispatch(new Object[0], this, f71880a, false, 85110, new Class[0], Widget.class);
    }

    @NotNull
    public final com.ss.android.ugc.aweme.arch.widgets.base.b<d> b() {
        if (PatchProxy.isSupport(new Object[0], this, f71880a, false, 85106, new Class[0], com.ss.android.ugc.aweme.arch.widgets.base.b.class)) {
            return (com.ss.android.ugc.aweme.arch.widgets.base.b) PatchProxy.accessDispatch(new Object[0], this, f71880a, false, 85106, new Class[0], com.ss.android.ugc.aweme.arch.widgets.base.b.class);
        }
        f a2 = f.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "StoryDetailHelper.getInstance()");
        com.ss.android.ugc.aweme.arch.widgets.base.b<d> bVar = a2.f72433e;
        Intrinsics.checkExpressionValueIsNotNull(bVar, "StoryDetailHelper.getInstance().userStoryReadState");
        return bVar;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f71880a, false, 85111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71880a, false, 85111, new Class[0], Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, a.f71771a, true, 85015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, a.f71771a, true, 85015, new Class[0], Void.TYPE);
        } else {
            a.f71772b.c();
            a.f71773c.c();
        }
    }

    @NotNull
    public final Intent a(@Nullable Activity activity, @Nullable com.ss.android.ugc.aweme.story.api.model.f fVar, @Nullable UserStory userStory) {
        Activity activity2 = activity;
        com.ss.android.ugc.aweme.story.api.model.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{activity2, fVar2, null}, this, f71880a, false, 85105, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, fVar2, null}, this, f71880a, false, 85105, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class}, Intent.class);
        }
        Intent a2 = f.a(activity2, fVar2, (UserStory) null);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StoryDetailHelper.buildS…ivity, params, userStory)");
        return a2;
    }

    @NotNull
    public final c a(@NotNull Context context, @NotNull h hVar, @NotNull LifecycleOwner lifecycleOwner) {
        Context context2 = context;
        h hVar2 = hVar;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{context2, hVar2, lifecycleOwner2}, this, f71880a, false, 85107, new Class[]{Context.class, h.class, LifecycleOwner.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{context2, hVar2, lifecycleOwner2}, this, f71880a, false, 85107, new Class[]{Context.class, h.class, LifecycleOwner.class}, c.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(hVar2, "params");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
        return new UserStoryListWidget(context2, hVar2, lifecycleOwner2);
    }

    public final void a(@Nullable Activity activity, @Nullable com.ss.android.ugc.aweme.story.api.model.f fVar, @Nullable UserStory userStory, int i) {
        Activity activity2 = activity;
        com.ss.android.ugc.aweme.story.api.model.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{activity2, fVar2, null, -1}, this, f71880a, false, 85108, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {activity2, fVar2, null, -1};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f71880a, false, 85108, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        f.a(activity2, fVar2, null, -1);
    }

    public final void a(@Nullable Activity activity, @Nullable com.ss.android.ugc.aweme.story.api.model.f fVar, @Nullable UserStory userStory, int i, @Nullable View view, @Nullable View view2) {
        if (PatchProxy.isSupport(new Object[]{activity, fVar, null, 220, null, view2}, this, f71880a, false, 85109, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE, View.class, View.class}, Void.TYPE)) {
            Object[] objArr = {activity, fVar, null, 220, null, view2};
            PatchProxy.accessDispatch(objArr, this, f71880a, false, 85109, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE, View.class, View.class}, Void.TYPE);
            return;
        }
        f.a(activity, fVar, (UserStory) null, 220, (View) null, view2);
    }
}
