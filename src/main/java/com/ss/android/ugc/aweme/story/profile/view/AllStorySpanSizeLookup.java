package com.ss.android.ugc.aweme.story.profile.view;

import android.support.v7.widget.GridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.profile.a.a;
import com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/AllStorySpanSizeLookup;", "Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;", "adapter", "Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;", "(Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;", "getSpanSize", "", "position", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AllStorySpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73325a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final AllStoryAdapter f73326b;

    public AllStorySpanSizeLookup(@NotNull AllStoryAdapter allStoryAdapter) {
        Intrinsics.checkParameterIsNotNull(allStoryAdapter, "adapter");
        this.f73326b = allStoryAdapter;
    }

    public final int getSpanSize(int i) {
        LifeStoryItem lifeStoryItem;
        int i2 = i;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73325a, false, 84929, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73325a, false, 84929, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        List data = this.f73326b.getData();
        if (data != null) {
            i3 = data.size();
        }
        if (i2 >= i3) {
            return 3;
        }
        if (data != null) {
            lifeStoryItem = (LifeStoryItem) data.get(i2);
        } else {
            lifeStoryItem = null;
        }
        List a2 = a.a(i2, data);
        if (a2.size() == 1) {
            return 3;
        }
        if (!Intrinsics.areEqual((Object) (LifeStoryItem) a2.get(a2.size() - 1), (Object) lifeStoryItem)) {
            return 1;
        }
        int size = a2.size() % 3;
        if (size == 0) {
            size = 3;
        }
        return (3 - size) + 1;
    }
}
