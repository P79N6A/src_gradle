package com.ss.android.ugc.aweme.story.base.utils;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\n\u0010\u000b\u001a\u00020\f*\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/utils/StoryDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "getChangePayload", "", "getName", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryDiffer extends DiffUtil.ItemCallback<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71941a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        if (PatchProxy.isSupport(new Object[]{cVar, cVar2}, this, f71941a, false, 82298, new Class[]{c.class, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar, cVar2}, this, f71941a, false, 82298, new Class[]{c.class, c.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cVar, "oldItem");
        Intrinsics.checkParameterIsNotNull(cVar2, "newItem");
        return false;
    }

    public final /* synthetic */ Object getChangePayload(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        if (PatchProxy.isSupport(new Object[]{cVar, cVar2}, this, f71941a, false, 82297, new Class[]{c.class, c.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cVar, cVar2}, this, f71941a, false, 82297, new Class[]{c.class, c.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(cVar, "oldItem");
        Intrinsics.checkParameterIsNotNull(cVar2, "newItem");
        return super.getChangePayload(cVar, cVar2);
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        String str;
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        if (PatchProxy.isSupport(new Object[]{cVar, cVar2}, this, f71941a, false, 82296, new Class[]{c.class, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar, cVar2}, this, f71941a, false, 82296, new Class[]{c.class, c.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cVar, "oldItem");
        Intrinsics.checkParameterIsNotNull(cVar2, "newItem");
        if ((cVar instanceof UserStory) && (cVar2 instanceof UserStory)) {
            User user = ((UserStory) cVar).getUser();
            String str2 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            User user2 = ((UserStory) cVar2).getUser();
            if (user2 != null) {
                str2 = user2.getUid();
            }
            return Intrinsics.areEqual((Object) str, (Object) str2);
        } else if (!(cVar instanceof com.ss.android.ugc.aweme.story.feed.model.c) || !(cVar2 instanceof com.ss.android.ugc.aweme.story.feed.model.c) || ((com.ss.android.ugc.aweme.story.feed.model.c) cVar).f72668a != ((com.ss.android.ugc.aweme.story.feed.model.c) cVar2).f72668a) {
            return false;
        } else {
            return true;
        }
    }
}
