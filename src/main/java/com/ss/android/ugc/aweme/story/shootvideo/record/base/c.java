package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import android.arch.lifecycle.LifecycleOwner;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.b.a.d;
import com.ss.android.ugc.aweme.filter.ac;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.local.UploadButton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;", "", "contentView", "Landroid/widget/FrameLayout;", "extraLayout", "filterViewPagerSupplier", "Lcom/ss/android/ugc/aweme/filter/FilterModule$ViewPagerSupplier;", "gesturePresenter", "Lcom/ss/android/ugc/aweme/shortvideo/gesture/defult/DefaultGesturePresenter;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "listenableActivityRegistry", "Lcom/ss/android/ugc/aweme/base/activity/ListenableActivityRegistry;", "recordSurfaceProvider", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/RecordSurfaceProvider;", "shootWaySupplier", "Lcom/ss/android/ugc/aweme/base/fp/compat/SupplierC;", "Lorg/json/JSONObject;", "shortVideoContextViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;", "uploadBtn", "Lcom/ss/android/ugc/aweme/shortvideo/local/UploadButton;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface c {
    @NotNull
    FrameLayout F();

    @NotNull
    d<JSONObject> G();

    @NotNull
    LifecycleOwner H();

    @NotNull
    ShortVideoContextViewModel I();

    @NotNull
    e J();

    @NotNull
    FrameLayout b();

    @NotNull
    UploadButton c();

    @NotNull
    DefaultGesturePresenter d();

    @NotNull
    ac.d m();

    @NotNull
    com.ss.android.ugc.aweme.story.shootvideo.record.d p();
}
