package com.ss.android.ugc.aweme.services.story;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Keep;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.port.in.IAVStoryProxyService;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J$\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J8\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J0\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J0\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J8\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/services/story/AVStoryProxyServiceImpl;", "Lcom/ss/android/ugc/aweme/port/in/IAVStoryProxyService;", "()V", "detectIsFromEditOrStory", "", "context", "Landroid/content/Context;", "getTrickyMapByActivity", "", "", "startStoryEditActivity", "", "activity", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "startStorySettingActivity", "enterType", "", "theme", "screenfull", "", "isSubPage", "isCanSlideFinish", "fullscreen", "topMargin", "startStorySettingActivityForView", "viewGroup", "Landroid/view/ViewGroup;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVStoryProxyServiceImpl implements IAVStoryProxyService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public final String detectIsFromEditOrStory(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71584, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71584, new Class[]{Context.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        String str = "";
        if (context2 instanceof VEVideoPublishEditActivity) {
            str = "video_edit_page";
        } else if (context2 instanceof VideoStoryEditPublishActivity) {
            str = "story_edit_page";
        }
        return str;
    }

    @Nullable
    public final Map<Object, Object> getTrickyMapByActivity(@Nullable Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71583, new Class[]{Context.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71583, new Class[]{Context.class}, Map.class);
        } else if (context2 instanceof VEVideoPublishEditActivity) {
            return ((VEVideoPublishEditActivity) context2).Q();
        } else {
            if (context2 instanceof VideoStoryEditPublishActivity) {
                return ((VideoStoryEditPublishActivity) context2).f();
            }
            return null;
        }
    }

    public final void startStoryEditActivity(@NotNull Activity activity, @NotNull Intent intent) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2}, this, changeQuickRedirect, false, 71589, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2}, this, changeQuickRedirect, false, 71589, new Class[]{Activity.class, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(intent2, "intent");
        VideoStoryEditPublishActivity.a(activity2, intent2, 0);
    }

    public final void startStorySettingActivity(@NotNull Activity activity, int i, int i2, int i3, boolean z) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71586, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, changeQuickRedirect, false, 71586, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        StorySettingActivity.a(activity, i, i2, i3, z);
    }

    public final void startStorySettingActivity(@NotNull Activity activity, int i, int i2, boolean z, int i3) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 71585, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 71585, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        StorySettingActivity.a(activity, i, i2, z, i3);
    }

    public final void startStorySettingActivityForView(@NotNull Activity activity, int i, int i2, boolean z, int i3, @NotNull ViewGroup viewGroup) {
        Activity activity2 = activity;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3), viewGroup2}, this, changeQuickRedirect, false, 71588, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, ViewGroup.class}, Void.TYPE)) {
            Object[] objArr = {activity2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3), viewGroup2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 71588, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, ViewGroup.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
        StorySettingActivity.a(activity, i, i2, z, i3, viewGroup);
    }

    public final void startStorySettingActivity(@NotNull Activity activity, int i, int i2, boolean z, boolean z2, boolean z3) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71587, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, changeQuickRedirect, false, 71587, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        StorySettingActivity.a(activity, i, i2, z, z2, z3);
    }
}
