package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/Factory;", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "SimpleViewHolderState", "ViewModel", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class Factory implements ViewModelProvider.Factory {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\u0018\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/Factory$SimpleViewHolderState;", "Lcom/bytedance/jedi/arch/State;", "trigger", "", "(Lkotlin/Unit;)V", "Lkotlin/Unit;", "component1", "copy", "(Lkotlin/Unit;)Lcom/bytedance/jedi/ext/adapter/Factory$SimpleViewHolderState;", "equals", "", "other", "", "hashCode", "", "toString", "", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
    static final class SimpleViewHolderState implements x {
        private final Unit trigger;

        public SimpleViewHolderState() {
            this(null, 1, null);
        }

        private final void component1() {
        }

        public static /* synthetic */ SimpleViewHolderState copy$default(SimpleViewHolderState simpleViewHolderState, Unit unit, int i, Object obj) {
            if ((i & 1) != 0) {
                unit = simpleViewHolderState.trigger;
            }
            return simpleViewHolderState.copy(unit);
        }

        @NotNull
        public final SimpleViewHolderState copy(@NotNull Unit unit) {
            Intrinsics.checkParameterIsNotNull(unit, "trigger");
            return new SimpleViewHolderState(unit);
        }

        public final boolean equals(@Nullable Object obj) {
            return this == obj || ((obj instanceof SimpleViewHolderState) && Intrinsics.areEqual((Object) this.trigger, (Object) ((SimpleViewHolderState) obj).trigger));
        }

        public final int hashCode() {
            Unit unit = this.trigger;
            if (unit != null) {
                return unit.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            return "SimpleViewHolderState(trigger=" + this.trigger + ")";
        }

        public SimpleViewHolderState(@NotNull Unit unit) {
            Intrinsics.checkParameterIsNotNull(unit, "trigger");
            this.trigger = unit;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SimpleViewHolderState(Unit unit, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Unit.INSTANCE : unit);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/Factory$ViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/ext/adapter/Factory$SimpleViewHolderState;", "()V", "defaultState", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
    static final class ViewModel extends JediViewModel<SimpleViewHolderState> {
        public final /* synthetic */ x c() {
            return new SimpleViewHolderState(null, 1, null);
        }
    }

    public final <T extends android.arch.lifecycle.ViewModel> T create(@NotNull Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        return (android.arch.lifecycle.ViewModel) new ViewModel();
    }
}
