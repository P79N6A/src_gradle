package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"walk", "Lkotlin/io/FileTreeWalk;", "Ljava/io/File;", "direction", "Lkotlin/io/FileWalkDirection;", "walkBottomUp", "walkTopDown", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/io/FilesKt")
public class j extends i {
    @NotNull
    public static final e walkBottomUp(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$walkBottomUp");
        return FilesKt.walk(file, g.BOTTOM_UP);
    }

    @NotNull
    public static final e walkTopDown(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$walkTopDown");
        return FilesKt.walk(file, g.TOP_DOWN);
    }

    @NotNull
    public static final e walk(@NotNull File file, @NotNull g gVar) {
        Intrinsics.checkParameterIsNotNull(file, "$this$walk");
        Intrinsics.checkParameterIsNotNull(gVar, "direction");
        return new e(file, gVar);
    }

    public static /* synthetic */ e walk$default(File file, g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = g.TOP_DOWN;
        }
        return FilesKt.walk(file, gVar);
    }
}
