package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class c extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new c();
    public static ChangeQuickRedirect changeQuickRedirect;

    c() {
    }

    public final String getName() {
        return "listState";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36757, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(SearchMusicListState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36757, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 36758, new Class[]{Object.class}, Object.class)) {
            return ((SearchMusicListState) obj).getListState();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 36758, new Class[]{Object.class}, Object.class);
    }
}
