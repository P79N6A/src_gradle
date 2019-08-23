package com.bytedance.jedi.model.i;

import com.bytedance.jedi.model.h.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ%\u0010\u0013\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0000¢\u0006\u0002\b\u0018R\u0017\u0010\u0003\u001a\u00020\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/jedi/model/util/JediModelPlugins;", "", "()V", "dataSourceFinder", "Lcom/bytedance/jedi/model/util/DataSourceFinder;", "dataSourceFinder$annotations", "getDataSourceFinder", "()Lcom/bytedance/jedi/model/util/DataSourceFinder;", "isLoggable", "", "()Z", "setLoggable", "(Z)V", "loggers", "", "Lcom/bytedance/jedi/model/util/IJediModelLogger;", "addSyncLog", "", "jediModelLogger", "onEvent", "tracePoint", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "onEvent$model_release", "model_release"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2303a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f2304b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final List<c> f2305c = CollectionsKt.mutableListOf(k.h);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final b f2306d = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/jedi/model/util/JediModelPlugins$dataSourceFinder$1", "Lcom/bytedance/jedi/model/util/DataSourceFinder;", "find", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "", "key", "", "findAll", "", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements b {
        a() {
        }
    }

    private f() {
    }

    public static void a(@NotNull com.bytedance.jedi.model.h.a<?> aVar, @NotNull b<?> bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "tracePoint");
        Intrinsics.checkParameterIsNotNull(bVar, "traceable");
        if (f2303a && bVar.b() != null) {
            for (c a2 : f2305c) {
                a2.a(aVar, bVar);
            }
        }
    }
}
