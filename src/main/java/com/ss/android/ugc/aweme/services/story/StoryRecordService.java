package com.ss.android.ugc.aweme.services.story;

import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/services/story/StoryRecordService;", "Lcom/ss/android/ugc/aweme/services/story/IStoryRecordService;", "()V", "convertFragment", "Lcom/ss/android/ugc/aweme/services/story/IStoryRecordService$IStoryRecordFragment;", "fragment", "Landroid/support/v4/app/Fragment;", "create", "bundle", "Landroid/os/Bundle;", "isStoryRecording", "", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryRecordService implements IStoryRecordService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final boolean isStoryRecording() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71590, new Class[0], Boolean.TYPE)) {
            return StoryRecordFragment.l;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71590, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public final IStoryRecordService.IStoryRecordFragment convertFragment(@Nullable Fragment fragment) {
        if (fragment instanceof IStoryRecordService.IStoryRecordFragment) {
            return (IStoryRecordService.IStoryRecordFragment) fragment;
        }
        return null;
    }

    @NotNull
    public final IStoryRecordService.IStoryRecordFragment create(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 71591, new Class[]{Bundle.class}, IStoryRecordService.IStoryRecordFragment.class)) {
            return (IStoryRecordService.IStoryRecordFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 71591, new Class[]{Bundle.class}, IStoryRecordService.IStoryRecordFragment.class);
        }
        Intrinsics.checkParameterIsNotNull(bundle2, "bundle");
        return StoryRecordFragment.m.a(bundle2);
    }
}
