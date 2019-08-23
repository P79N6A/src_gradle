package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$initView$8", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryRecordFragment$initView$8 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73822a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StoryRecordFragment f73823b;

    StoryRecordFragment$initView$8(StoryRecordFragment storyRecordFragment) {
        this.f73823b = storyRecordFragment;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f73822a, false, 85647, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f73822a, false, 85647, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        e eVar = this.f73823b.k;
        if (eVar != null && eVar.b()) {
            StoryRecordLayout c2 = StoryRecordFragment.c(this.f73823b);
            if (i == 0) {
                z = true;
            }
            c2.setEnabled(z);
        }
    }
}
