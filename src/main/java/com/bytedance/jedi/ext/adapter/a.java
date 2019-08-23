package com.bytedance.jedi.ext.adapter;

import android.support.annotation.RestrictTo;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.widget.Widget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001ah\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0012\b\u0000\u0010\u000b*\f\u0012\u0004\u0012\u0002H\u000b\u0012\u0002\b\u00030\f\"\u0010\b\u0001\u0010\n\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000e0\r\"\b\b\u0002\u0010\u000e*\u00020\u000f*\u0002H\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\n0\u00112\u000e\b\u0006\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\b¢\u0006\u0002\u0010\u0015\u001ah\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0012\b\u0000\u0010\u000b*\f\u0012\u0004\u0012\u0002H\u000b\u0012\u0002\b\u00030\f\"\u0010\b\u0001\u0010\n\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000e0\r\"\b\b\u0002\u0010\u000e*\u00020\u000f*\u0002H\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\n0\u00112\u000e\b\u0006\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\b¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007\u001a\u0001\u0010\u001b\u001a\u0002H\n\"\u001a\b\u0000\u0010\u000b*\f\u0012\u0004\u0012\u0002H\u000b\u0012\u0002\b\u00030\f*\u0006\u0012\u0002\b\u00030\u001c\"\u0010\b\u0001\u0010\n\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000e0\r\"\b\b\u0002\u0010\u000e*\u00020\u000f*\u0002H\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\n0\u00112\u000e\b\u0006\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0019\b\n\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000e0\u001e¢\u0006\u0002\b\u001fH\b¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"activityFinder", "Landroid/support/v4/app/FragmentActivity;", "host", "", "findHost", "findWidgetHost", "Lcom/bytedance/widget/WidgetHost;", "target", "activityViewModel", "Lkotlin/Lazy;", "VM", "T", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "viewModelClass", "Lkotlin/reflect/KClass;", "keyFactory", "Lkotlin/Function0;", "", "(Lcom/bytedance/jedi/ext/adapter/JediViewHolder;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "hostViewModel", "of", "Lcom/bytedance/widget/WidgetManager;", "Lcom/bytedance/widget/WidgetManager$Companion;", "viewHolder", "viewModel", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "argumentsAcceptor", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lcom/bytedance/jedi/ext/adapter/JediViewHolder;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/bytedance/jedi/arch/JediViewModel;", "ext_adapter_release"}, k = 2, mv = {1, 1, 15})
public final class a {
    @NotNull
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public static final Object a(@NotNull Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "host");
        if (obj instanceof Widget) {
            return ((Widget) obj).j();
        }
        if (obj instanceof JediViewHolder) {
            return a(((JediViewHolder) obj).k());
        }
        if ((obj instanceof Fragment) || (obj instanceof FragmentActivity)) {
            return obj;
        }
        throw new IllegalStateException();
    }
}
