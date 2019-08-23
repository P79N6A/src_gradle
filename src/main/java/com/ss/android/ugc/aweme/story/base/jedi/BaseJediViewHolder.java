package com.ss.android.ugc.aweme.story.base.jedi;

import android.arch.lifecycle.ViewModelProvider;
import android.view.View;
import com.bytedance.jedi.arch.ae;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/jedi/BaseJediViewHolder;", "ITEM", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/story/base/jedi/ReflectViewModelFactory;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/story/base/jedi/ReflectViewModelFactory;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseJediViewHolder<ITEM, VH extends StoryViewHolder<? extends VH, ITEM>> extends StoryViewHolder<VH, ITEM> implements ae<b> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final b f71937a = new b();

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.f71937a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseJediViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }
}
