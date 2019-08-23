package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003R+\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR%\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR1\u0010\u000f\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/ListListener;", "T", "RECEIVER", "", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public interface c<T, RECEIVER> {
    @NotNull
    Function1<RECEIVER, Unit> a();

    @NotNull
    Function2<RECEIVER, Throwable, Unit> b();

    @NotNull
    Function2<RECEIVER, List<? extends T>, Unit> c();
}
