package com.ss.android.ugc.gamora.a;

import com.bytedance.scene.e;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\b¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\n"}, d2 = {"findSiblingByTag", "T", "Lcom/bytedance/scene/Scene;", "tag", "", "(Lcom/bytedance/scene/Scene;Ljava/lang/String;)Lcom/bytedance/scene/Scene;", "hide", "", "Lcom/bytedance/scene/group/GroupScene;", "show", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class c {
    public static final boolean a(@NotNull com.bytedance.scene.group.c cVar, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$show");
        Intrinsics.checkParameterIsNotNull(str, "tag");
        e a2 = cVar.a(str);
        if (a2 == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "findSceneByTag<Scene>(tag) ?: return false");
        cVar.c(a2);
        return true;
    }

    public static final boolean b(@NotNull com.bytedance.scene.group.c cVar, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$hide");
        Intrinsics.checkParameterIsNotNull(str, "tag");
        e a2 = cVar.a(str);
        if (a2 == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "findSceneByTag<Scene>(tag) ?: return false");
        cVar.b(a2);
        return true;
    }
}
