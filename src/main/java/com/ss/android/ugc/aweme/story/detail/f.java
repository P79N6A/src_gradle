package com.ss.android.ugc.aweme.story.detail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.detail.b.e;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.c.g;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72429a;

    /* renamed from: b  reason: collision with root package name */
    public UserStory f72430b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.feed.model.a f72431c;

    /* renamed from: d  reason: collision with root package name */
    public String f72432d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.arch.widgets.base.b<d> f72433e;

    /* renamed from: f  reason: collision with root package name */
    private List<b> f72434f;

    public interface b {
        void a(e eVar);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static f f72438a = new f((byte) 0);
    }

    public static f a() {
        return a.f72438a;
    }

    public final void a(com.ss.android.ugc.aweme.story.feed.model.a aVar) {
        final com.ss.android.ugc.aweme.story.feed.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f72429a, false, 83118, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f72429a, false, 83118, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE);
        } else if (aVar2 == null || aVar.getUserStoryList() == null || aVar.getUserStoryList().isEmpty()) {
        } else {
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72435a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f72435a, false, 83130, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72435a, false, 83130, new Class[0], Void.TYPE);
                        return;
                    }
                    for (UserStory userStory : aVar2.getUserStoryList()) {
                        f fVar = f.this;
                        String a2 = g.a(userStory);
                        boolean b2 = g.b(userStory);
                        if (PatchProxy.isSupport(new Object[]{a2, Byte.valueOf(b2 ? (byte) 1 : 0)}, fVar, f.f72429a, false, 83119, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                            f fVar2 = fVar;
                            PatchProxy.accessDispatch(new Object[]{a2, Byte.valueOf(b2)}, fVar2, f.f72429a, false, 83119, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                        } else {
                            d dVar = new d();
                            dVar.f71831a = a2;
                            dVar.f71832b = b2;
                            fVar.f72433e.postValue(dVar);
                        }
                    }
                }
            });
        }
    }

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f72429a, false, 83120, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f72429a, false, 83120, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f72432d = str;
        int size = this.f72434f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f72434f.get(i2).a(new e(i, str));
        }
    }

    private f() {
        this.f72433e = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();
        this.f72434f = new LinkedList();
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f72429a, false, 83121, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f72429a, false, 83121, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (!this.f72434f.contains(bVar)) {
            this.f72434f.add(bVar);
        }
    }

    public final void b(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f72429a, false, 83122, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f72429a, false, 83122, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f72434f.remove(bVar2);
    }

    @NotNull
    public static Intent a(@Nullable Activity activity, @Nullable com.ss.android.ugc.aweme.story.api.model.f fVar, @Nullable UserStory userStory) {
        Activity activity2 = activity;
        com.ss.android.ugc.aweme.story.api.model.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{activity2, fVar2, userStory}, null, f72429a, true, 83123, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, fVar2, userStory}, null, f72429a, true, 83123, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class}, Intent.class);
        }
        Intent intent = new Intent(activity2, StoryDetailActivity.class);
        intent.putExtra("transition_has_avatar", false);
        intent.putExtra("extra_story_detail_params", fVar2);
        return intent;
    }

    private static Bundle a(Activity activity, View view, View view2) {
        ActivityOptionsCompat activityOptionsCompat;
        Activity activity2 = activity;
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{activity2, view3, view4}, null, f72429a, true, 83129, new Class[]{Activity.class, View.class, View.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{activity2, view3, view4}, null, f72429a, true, 83129, new Class[]{Activity.class, View.class, View.class}, Bundle.class);
        } else if (activity2 == null || view4 == null) {
            return null;
        } else {
            if (view3 == null) {
                activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(activity2, new Pair(view4, "transition_params_bg"));
            } else if (view4 == null) {
                activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(activity2, new Pair(view3, "transition_params_avatar"));
            } else {
                activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(activity2, new Pair(view4, "transition_params_bg"), new Pair(view3, "transition_params_avatar"));
            }
            return activityOptionsCompat.toBundle();
        }
    }

    public static void a(Activity activity, com.ss.android.ugc.aweme.story.api.model.f fVar, UserStory userStory, int i) {
        if (PatchProxy.isSupport(new Object[]{activity, fVar, userStory, Integer.valueOf(i)}, null, f72429a, true, 83124, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, fVar, userStory, Integer.valueOf(i)}, null, f72429a, true, 83124, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(activity, fVar, userStory, i, (View) null, (View) null);
    }

    public static void a(Activity activity, com.ss.android.ugc.aweme.story.api.model.f fVar, UserStory userStory, int i, View view, View view2) {
        Activity activity2 = activity;
        com.ss.android.ugc.aweme.story.api.model.f fVar2 = fVar;
        UserStory userStory2 = userStory;
        View view3 = view;
        View view4 = view2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity2, fVar2, userStory2, Integer.valueOf(i), view3, view4}, null, f72429a, true, 83125, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE, View.class, View.class}, Void.TYPE)) {
            Object[] objArr = {activity2, fVar2, userStory2, Integer.valueOf(i), view3, view4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f72429a, true, 83125, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, UserStory.class, Integer.TYPE, View.class, View.class}, Void.TYPE);
        } else if (activity2 != null) {
            a().f72430b = userStory2;
            Intent intent = new Intent(activity2, StoryDetailActivity.class);
            Bundle a2 = a(activity2, view3, view4);
            if (a2 != null) {
                fVar2.hasTransition = true;
            } else if (view3 != null) {
                int[] iArr = new int[2];
                view3.getLocationOnScreen(iArr);
                iArr[0] = iArr[0] + (view.getMeasuredWidth() / 2);
                iArr[1] = iArr[1] + (view.getMeasuredHeight() / 2);
                intent.putExtra("open_with_avatar", true);
                intent.putExtra("avatar_location", iArr);
            }
            if (view3 != null) {
                z = true;
            }
            intent.putExtra("transition_has_avatar", z);
            intent.putExtra("extra_story_detail_params", fVar2);
            activity2.startActivityForResult(intent, i, a2);
        }
    }

    public static void a(Activity activity, com.ss.android.ugc.aweme.story.api.model.f fVar, com.ss.android.ugc.aweme.story.feed.model.a aVar, int i, View view, View view2) {
        Activity activity2 = activity;
        com.ss.android.ugc.aweme.story.api.model.f fVar2 = fVar;
        com.ss.android.ugc.aweme.story.feed.model.a aVar2 = aVar;
        View view3 = view;
        View view4 = view2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity2, fVar2, aVar2, -1, view3, view4}, null, f72429a, true, 83128, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, com.ss.android.ugc.aweme.story.feed.model.a.class, Integer.TYPE, View.class, View.class}, Void.TYPE)) {
            Object[] objArr = {activity2, fVar2, aVar2, -1, view3, view4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f72429a, true, 83128, new Class[]{Activity.class, com.ss.android.ugc.aweme.story.api.model.f.class, com.ss.android.ugc.aweme.story.feed.model.a.class, Integer.TYPE, View.class, View.class}, Void.TYPE);
        } else if (activity2 != null) {
            a().f72431c = aVar2;
            Intent intent = new Intent(activity2, StoryDetailActivity.class);
            Bundle a2 = a(activity2, view3, view4);
            if (a2 != null) {
                fVar2.hasTransition = true;
            }
            if (view3 != null) {
                z = true;
            }
            intent.putExtra("transition_has_avatar", z);
            intent.putExtra("extra_story_detail_params", fVar2);
            activity2.startActivityForResult(intent, -1, a2);
        }
    }
}
