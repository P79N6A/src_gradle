package com.ss.android.ugc.aweme.discover.hotspot;

import android.arch.lifecycle.LifecycleOwner;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.arch.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotInfoViewHolder;", "Lcom/ss/android/ugc/aweme/discover/hotspot/SpotBaseViewHolder;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "itemView", "Landroid/view/View;", "(Landroid/arch/lifecycle/LifecycleOwner;Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "getLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "bind", "", "spot", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "onCreate", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SpotInfoViewHolder extends SpotBaseViewHolder {
    public static ChangeQuickRedirect h;
    @NotNull
    public LifecycleOwner i;
    @NotNull
    public final View j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<f, HotSearchItem, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SpotInfoViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SpotInfoViewHolder spotInfoViewHolder) {
            super(2);
            this.this$0 = spotInfoViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((f) obj, (HotSearchItem) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull f fVar, @Nullable HotSearchItem hotSearchItem) {
            f fVar2 = fVar;
            HotSearchItem hotSearchItem2 = hotSearchItem;
            if (PatchProxy.isSupport(new Object[]{fVar2, hotSearchItem2}, this, changeQuickRedirect, false, 36558, new Class[]{f.class, HotSearchItem.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, hotSearchItem2}, this, changeQuickRedirect, false, 36558, new Class[]{f.class, HotSearchItem.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            if (hotSearchItem2 != null) {
                SpotInfoViewHolder spotInfoViewHolder = this.this$0;
                if (PatchProxy.isSupport(new Object[]{hotSearchItem2}, spotInfoViewHolder, SpotInfoViewHolder.h, false, 36554, new Class[]{HotSearchItem.class}, Void.TYPE)) {
                    Object[] objArr = {hotSearchItem2};
                    SpotInfoViewHolder spotInfoViewHolder2 = spotInfoViewHolder;
                    PatchProxy.accessDispatch(objArr, spotInfoViewHolder2, SpotInfoViewHolder.h, false, 36554, new Class[]{HotSearchItem.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(hotSearchItem2, "spot");
                    ImageView imageView = (ImageView) spotInfoViewHolder.j.findViewById(C0906R.id.ctk);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.spot_fire");
                    imageView.setVisibility(0);
                    DmtTextView dmtTextView = (DmtTextView) spotInfoViewHolder.j.findViewById(C0906R.id.ctm);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.spot_name");
                    dmtTextView.setText(hotSearchItem.getWord());
                    DmtTextView dmtTextView2 = (DmtTextView) spotInfoViewHolder.j.findViewById(C0906R.id.ctn);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "itemView.spot_rank");
                    dmtTextView2.setText(spotInfoViewHolder.j.getContext().getString(C0906R.string.amo, new Object[]{Integer.valueOf(hotSearchItem.getPosition())}));
                    com.ss.android.ugc.aweme.hotsearch.d.b.a((DmtTextView) spotInfoViewHolder.j.findViewById(C0906R.id.cto), hotSearchItem.getHotValue());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SpotInfoViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SpotInfoViewHolder spotInfoViewHolder) {
            super(2);
            this.this$0 = spotInfoViewHolder;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull f fVar, boolean z) {
            f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 36561, new Class[]{f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 36561, new Class[]{f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            com.ss.android.ugc.aweme.discover.hotspot.b.b.a(this.this$0.j, z, 400);
        }
    }

    public final void aj_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 36553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 36553, new Class[0], Void.TYPE);
            return;
        }
        super.aj_();
        Disposable unused = a(f(), h.INSTANCE, c(), false, new a(this));
        Disposable unused2 = a(f(), i.INSTANCE, c(), false, new b(this));
    }

    public SpotInfoViewHolder(@NotNull LifecycleOwner lifecycleOwner, @NotNull View view) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.i = lifecycleOwner;
        this.j = view;
    }
}
