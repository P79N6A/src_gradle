package com.ss.android.ugc.aweme.base.arch;

import com.bytedance.viewholder.typesafe.b;
import com.bytedance.widget.ext.list.ItemWidget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.bytedance.widget.ext.list.d;
import com.bytedance.widget.ext.list.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b'\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H$R!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/BaseWidgetListAdapter;", "VH", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/base/arch/BaseTypeSafeAdapter;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManagerOwner;", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "(Lcom/bytedance/widget/WidgetManager;)V", "manager", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;", "getManager", "()Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;", "manager$delegate", "Lkotlin/Lazy;", "createItemWidget", "Lcom/bytedance/widget/ext/list/ItemWidget;", "viewType", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@Deprecated(level = kotlin.a.WARNING, message = "use JediBaseRawAdapter")
public abstract class BaseWidgetListAdapter<VH extends ItemWidgetViewHolder<?>> extends BaseTypeSafeAdapter<VH> implements e<VH> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f2725c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2726d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseWidgetListAdapter.class), "manager", "getManager()Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;"))};
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f2727e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;", "VH", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<d<VH>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.bytedance.widget.a $widgetManager;
        final /* synthetic */ BaseWidgetListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseWidgetListAdapter baseWidgetListAdapter, com.bytedance.widget.a aVar) {
            super(0);
            this.this$0 = baseWidgetListAdapter;
            this.$widgetManager = aVar;
        }

        @NotNull
        public final d<VH> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24424, new Class[0], d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24424, new Class[0], d.class);
            }
            d<VH> dVar = new d<>(this.$widgetManager, new Function1<Integer, ItemWidget<?, ? extends VH>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                @NotNull
                public final ItemWidget<?, ? extends VH> invoke(int i) {
                    if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24425, new Class[]{Integer.TYPE}, ItemWidget.class)) {
                        return this.this$0.this$0.b(this.this$0.this$0.getItemViewType(this.this$0.this$0.d() + i));
                    }
                    return (ItemWidget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24425, new Class[]{Integer.TYPE}, ItemWidget.class);
                }
            });
            this.this$0.a((b<VH>) dVar);
            return dVar;
        }
    }

    @NotNull
    public abstract ItemWidget<?, ? extends VH> b(int i);

    @NotNull
    /* renamed from: b */
    public final d<VH> c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2725c, false, 24423, new Class[0], d.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2725c, false, 24423, new Class[0], d.class);
        } else {
            value = this.f2727e.getValue();
        }
        return (d) value;
    }

    public BaseWidgetListAdapter(@NotNull com.bytedance.widget.a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
        this.f2727e = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new a<Object>(this, aVar));
    }
}
