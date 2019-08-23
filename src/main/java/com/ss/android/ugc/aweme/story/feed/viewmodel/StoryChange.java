package com.ss.android.ugc.aweme.story.feed.viewmodel;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StoryChange extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72992a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.arch.widgets.base.b<UserStory> f72993b = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.arch.widgets.base.b<HashMap<String, Integer>> f72994c = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.api.model.b> f72995d = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();

    public static abstract class a implements Observer<com.ss.android.ugc.aweme.story.api.model.b> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f72996c;

        public abstract void a(com.ss.android.ugc.aweme.story.api.model.b bVar);

        public /* synthetic */ void onChanged(@Nullable Object obj) {
            com.ss.android.ugc.aweme.story.api.model.b bVar = (com.ss.android.ugc.aweme.story.api.model.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f72996c, false, 84398, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f72996c, false, 84398, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
                return;
            }
            a(bVar);
        }
    }

    public static abstract class b implements Observer<UserStory> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f72997c;

        public abstract void a(UserStory userStory);

        public /* synthetic */ void onChanged(@Nullable Object obj) {
            UserStory userStory = (UserStory) obj;
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f72997c, false, 84399, new Class[]{UserStory.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory}, this, f72997c, false, 84399, new Class[]{UserStory.class}, Void.TYPE);
                return;
            }
            a(userStory);
        }
    }

    public static void a(FragmentActivity fragmentActivity, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, aVar2}, null, f72992a, true, 84388, new Class[]{FragmentActivity.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, aVar2}, null, f72992a, true, 84388, new Class[]{FragmentActivity.class, a.class}, Void.TYPE);
        } else if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            a(fragmentActivity).f72995d.removeObserver(aVar2);
        }
    }

    public static void a(FragmentActivity fragmentActivity, b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, bVar2}, null, f72992a, true, 84390, new Class[]{FragmentActivity.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, bVar2}, null, f72992a, true, 84390, new Class[]{FragmentActivity.class, b.class}, Void.TYPE);
        } else if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            a(fragmentActivity).f72993b.removeObserver(bVar2);
        }
    }

    public static void a(FragmentActivity fragmentActivity, String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, str2, Integer.valueOf(i)}, null, f72992a, true, 84396, new Class[]{FragmentActivity.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, str2, Integer.valueOf(i)}, null, f72992a, true, 84396, new Class[]{FragmentActivity.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            a(a(fragmentActivity).f72994c, str2, i);
        }
    }

    private static void a(com.ss.android.ugc.aweme.arch.widgets.base.b<HashMap<String, Integer>> bVar, String str, int i) {
        com.ss.android.ugc.aweme.arch.widgets.base.b<HashMap<String, Integer>> bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bVar2, str2, Integer.valueOf(i)}, null, f72992a, true, 84397, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.b.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, str2, Integer.valueOf(i)}, null, f72992a, true, 84397, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.b.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = (HashMap) bVar.getValue();
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        hashMap.put(str2, Integer.valueOf(i));
        bVar2.setValue(hashMap);
    }

    public static StoryChange a(@NonNull FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f72992a, true, 84384, new Class[]{FragmentActivity.class}, StoryChange.class)) {
            return (StoryChange) c.a(fragmentActivity).get(StoryChange.class);
        }
        return (StoryChange) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f72992a, true, 84384, new Class[]{FragmentActivity.class}, StoryChange.class);
    }

    public static com.ss.android.ugc.aweme.story.api.model.b b(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f72992a, true, 84391, new Class[]{FragmentActivity.class}, com.ss.android.ugc.aweme.story.api.model.b.class)) {
            return (com.ss.android.ugc.aweme.story.api.model.b) a(fragmentActivity).f72995d.getValue();
        }
        return (com.ss.android.ugc.aweme.story.api.model.b) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f72992a, true, 84391, new Class[]{FragmentActivity.class}, com.ss.android.ugc.aweme.story.api.model.b.class);
    }

    public static UserStory c(@NonNull FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f72992a, true, 84392, new Class[]{FragmentActivity.class}, UserStory.class)) {
            return (UserStory) a(fragmentActivity).f72993b.getValue();
        }
        return (UserStory) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f72992a, true, 84392, new Class[]{FragmentActivity.class}, UserStory.class);
    }

    public static UserStory a(FragmentActivity fragmentActivity, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, str2}, null, f72992a, true, 84393, new Class[]{FragmentActivity.class, String.class}, UserStory.class)) {
            return (UserStory) PatchProxy.accessDispatch(new Object[]{fragmentActivity, str2}, null, f72992a, true, 84393, new Class[]{FragmentActivity.class, String.class}, UserStory.class);
        } else if (fragmentActivity == null) {
            return null;
        } else {
            com.ss.android.ugc.aweme.story.feed.model.a aVar = (com.ss.android.ugc.aweme.story.feed.model.a) LifeFeedModel.a(fragmentActivity).c().getValue();
            if (!(aVar == null || aVar.getUserStoryList() == null)) {
                List<UserStory> userStoryList = aVar.getUserStoryList();
                int size = userStoryList.size();
                for (int i = 0; i < size; i++) {
                    if (TextUtils.equals(str2, g.a(userStoryList.get(i)))) {
                        return userStoryList.get(i);
                    }
                }
            }
            return null;
        }
    }

    public static void a(@NonNull FragmentActivity fragmentActivity, com.ss.android.ugc.aweme.story.api.model.b bVar) {
        com.ss.android.ugc.aweme.story.api.model.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, bVar2}, null, f72992a, true, 84385, new Class[]{FragmentActivity.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, bVar2}, null, f72992a, true, 84385, new Class[]{FragmentActivity.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
            return;
        }
        Iterator<UserStory> it2 = ((com.ss.android.ugc.aweme.story.feed.model.a) LifeFeedModel.a(fragmentActivity).c().getValue()).getUserStoryList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            UserStory next = it2.next();
            if (next.getAwemeList() != null && next.getAwemeList().contains(bVar2)) {
                if (!g.a((UserStory) a(fragmentActivity).f72993b.getValue(), next)) {
                    a(fragmentActivity).f72993b.setValue(next);
                }
            }
        }
        a(fragmentActivity).f72995d.setValue(bVar2);
        com.ss.android.ugc.aweme.story.base.a.a.a().a("STORY_CHANGE", com.ss.android.ugc.aweme.story.api.model.b.class).setValue(bVar2);
    }

    public static void a(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, a aVar) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, lifecycleOwner2, aVar2}, null, f72992a, true, 84387, new Class[]{FragmentActivity.class, LifecycleOwner.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, lifecycleOwner2, aVar2}, null, f72992a, true, 84387, new Class[]{FragmentActivity.class, LifecycleOwner.class, a.class}, Void.TYPE);
        } else if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            a(fragmentActivity).f72995d.observe(lifecycleOwner2, aVar2);
        }
    }

    public static void a(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, b bVar) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, lifecycleOwner2, bVar2}, null, f72992a, true, 84389, new Class[]{FragmentActivity.class, LifecycleOwner.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, lifecycleOwner2, bVar2}, null, f72992a, true, 84389, new Class[]{FragmentActivity.class, LifecycleOwner.class, b.class}, Void.TYPE);
        } else if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            a(fragmentActivity).f72993b.observe(lifecycleOwner2, bVar2);
        }
    }
}
