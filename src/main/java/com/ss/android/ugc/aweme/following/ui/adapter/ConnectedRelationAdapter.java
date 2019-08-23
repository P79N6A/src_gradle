package com.ss.android.ugc.aweme.following.ui.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.v7.util.DiffUtil;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationTitleViewHolder;
import com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder;
import com.ss.android.ugc.aweme.following.ui.viewmodel.e;
import com.ss.android.ugc.aweme.following.ui.viewmodel.f;
import com.ss.android.ugc.aweme.friends.ui.an;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J8\u0010\u000b\u001a\u00020\f2.\u0010\r\u001a*\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0010\u0012\u0002\b\u00030\u000f0\u000ej\u0014\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0010\u0012\u0002\b\u00030\u000f`\u0011H\u0014¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseMultiTypeAdapter;", "", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Landroid/arch/lifecycle/LifecycleOwner;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "getBasicItemViewType", "", "position", "registerFactories", "", "registry", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryRegistry;", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/bytedance/adapter/multitype/ViewHolderFactoryRegistry;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationAdapter extends JediBaseMultiTypeAdapter<Object> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48067f = null;
    public static final int g = 1;
    public static final int h = 2;
    public static final a i = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter$Companion;", "", "()V", "ITEM_TYPE_FOLLOW", "", "getITEM_TYPE_FOLLOW", "()I", "ITEM_TYPE_RECOMMEND", "getITEM_TYPE_RECOMMEND", "ITEM_TYPE_TITLE", "getITEM_TYPE_TITLE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static int a() {
            return ConnectedRelationAdapter.g;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<ViewGroup, ConnectedRelationViewHolder> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        @NotNull
        public final ConnectedRelationViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 45069, new Class[]{ViewGroup.class}, ConnectedRelationViewHolder.class)) {
                return (ConnectedRelationViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 45069, new Class[]{ViewGroup.class}, ConnectedRelationViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            return new ConnectedRelationViewHolder(new com.ss.android.ugc.aweme.following.ui.view.a(context, null, 0, 6));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<ViewGroup, ConnectedRelationViewHolder> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        @NotNull
        public final ConnectedRelationViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 45070, new Class[]{ViewGroup.class}, ConnectedRelationViewHolder.class)) {
                return (ConnectedRelationViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 45070, new Class[]{ViewGroup.class}, ConnectedRelationViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            return new ConnectedRelationViewHolder(new an(context, null, 0, 6));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationTitleViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<ViewGroup, ConnectedRelationTitleViewHolder> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(1);
        }

        @NotNull
        public final ConnectedRelationTitleViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 45071, new Class[]{ViewGroup.class}, ConnectedRelationTitleViewHolder.class)) {
                return (ConnectedRelationTitleViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 45071, new Class[]{ViewGroup.class}, ConnectedRelationTitleViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return new ConnectedRelationTitleViewHolder(viewGroup2);
        }
    }

    public final void a(@NotNull com.bytedance.jedi.ext.adapter.multitype.d<JediViewHolder<? extends com.bytedance.jedi.arch.d, ?>> dVar) {
        com.bytedance.jedi.ext.adapter.multitype.d<JediViewHolder<? extends com.bytedance.jedi.arch.d, ?>> dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f48067f, false, 45067, new Class[]{com.bytedance.jedi.ext.adapter.multitype.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f48067f, false, 45067, new Class[]{com.bytedance.jedi.ext.adapter.multitype.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "registry");
        dVar2.a(0, b.INSTANCE);
        dVar2.a(g, c.INSTANCE);
        dVar2.a(h, d.INSTANCE);
    }

    public final int getBasicItemViewType(int i2) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48067f, false, 45068, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48067f, false, 45068, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, JediBaseMultiTypeAdapter.f34636a, false, 24504, new Class[]{Integer.TYPE}, Object.class)) {
            obj = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, JediBaseMultiTypeAdapter.f34636a, false, 24504, new Class[]{Integer.TYPE}, Object.class);
        } else {
            obj = a.C0194a.a((com.bytedance.jedi.arch.ext.list.a<T>) this, i2);
        }
        if (obj instanceof e) {
            return h;
        }
        if (obj instanceof f) {
            return ((f) obj).f48216b;
        }
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ConnectedRelationAdapter(@NotNull LifecycleOwner lifecycleOwner, @Nullable e.b bVar) {
        super(lifecycleOwner, (DiffUtil.ItemCallback) new RelationUserDiff(), bVar);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
    }

    public /* synthetic */ ConnectedRelationAdapter(LifecycleOwner lifecycleOwner, e.b bVar, int i2) {
        this(lifecycleOwner, null);
    }
}
