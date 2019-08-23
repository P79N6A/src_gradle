package com.ss.android.ugc.aweme.story.friends;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModelFactory;", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "type", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "getType", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements ViewModelProvider.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73047a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final h f73048b;

    public a(@NotNull h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "type");
        this.f73048b = hVar;
    }

    public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f73047a, false, 84511, new Class[]{Class.class}, ViewModel.class)) {
            return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f73047a, false, 84511, new Class[]{Class.class}, ViewModel.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
        return (ViewModel) new UserStoryListViewModel(this.f73048b);
    }
}
