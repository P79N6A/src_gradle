package com.bytedance.widget.ext.list;

import com.bytedance.viewholder.typesafe.TypeSafeAdapter;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b'\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H$R!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemWidgetAdapter;", "VH", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/bytedance/viewholder/typesafe/TypeSafeAdapter;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManagerOwner;", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "(Lcom/bytedance/widget/WidgetManager;)V", "manager", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;", "getManager", "()Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;", "manager$delegate", "Lkotlin/Lazy;", "createItemWidget", "Lcom/bytedance/widget/ext/list/ItemWidget;", "viewType", "", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
@Deprecated(level = a.WARNING, message = "do not use ItemWidget, use JediViewHolder instead")
public abstract class ItemWidgetAdapter<VH extends ItemWidgetViewHolder<?>> extends TypeSafeAdapter<VH> implements e<VH> {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2339b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ItemWidgetAdapter.class), "manager", "getManager()Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;"))};
}
