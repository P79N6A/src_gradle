package com.ss.android.ugc.aweme.im.sdk.chat;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.arch.adpater.BaseDiffableAdapter;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.im.sdk.utils.az;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J@\u0010\u0014\u001a\u00020\r28\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006R@\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/GreetEmojiAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/BaseDiffableAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/GreetEmojiViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/resources/model/Emoji;", "()V", "mClickListener", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "listener", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GreetEmojiAdapter extends BaseDiffableAdapter<GreetEmojiViewHolder, a> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f50204b;

    /* renamed from: c  reason: collision with root package name */
    public Function2<? super View, ? super Integer, Unit> f50205c;

    public GreetEmojiAdapter() {
        super(null, 1);
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        GreetEmojiViewHolder greetEmojiViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50204b, false, 50291, new Class[]{ViewGroup.class, Integer.TYPE}, GreetEmojiViewHolder.class)) {
            greetEmojiViewHolder = (GreetEmojiViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50204b, false, 50291, new Class[]{ViewGroup.class, Integer.TYPE}, GreetEmojiViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            greetEmojiViewHolder = new GreetEmojiViewHolder(viewGroup2);
        }
        return greetEmojiViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        GreetEmojiViewHolder greetEmojiViewHolder = (GreetEmojiViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{greetEmojiViewHolder, Integer.valueOf(i)}, this, f50204b, false, 50292, new Class[]{GreetEmojiViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{greetEmojiViewHolder, Integer.valueOf(i)}, this, f50204b, false, 50292, new Class[]{GreetEmojiViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(greetEmojiViewHolder, "holder");
        a aVar = (a) a(i);
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, greetEmojiViewHolder, GreetEmojiViewHolder.f50206a, false, 50293, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
                GreetEmojiViewHolder greetEmojiViewHolder2 = greetEmojiViewHolder;
                PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, greetEmojiViewHolder2, GreetEmojiViewHolder.f50206a, false, 50293, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(aVar, "emoji");
                az.b(greetEmojiViewHolder.f50207b, aVar.getAnimateUrl());
            }
            greetEmojiViewHolder.f50208c = this.f50205c;
        }
    }
}
