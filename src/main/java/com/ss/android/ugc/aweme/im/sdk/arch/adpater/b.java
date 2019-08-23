package com.ss.android.ugc.aweme.im.sdk.arch.adpater;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0016J*\u0010\u0011\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013H\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DiffableAdapter;", "T", "", "mDiffer", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/AsyncListDiffer;", "getMDiffer", "()Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/AsyncListDiffer;", "getCurrentList", "", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "notifyDataSetChanged", "", "list", "submitList", "callback", "Lkotlin/Function0;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface b<T> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50137a;
    }

    @NotNull
    a<T> a();

    void a(@Nullable List<? extends T> list, @Nullable Function0<Unit> function0);
}
