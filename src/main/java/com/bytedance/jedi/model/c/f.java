package com.bytedance.jedi.model.c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u0007*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0007B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/jedi/model/datasource/Optional;", "T", "", "element", "(Ljava/lang/Object;)V", "some", "()Ljava/lang/Object;", "Companion", "model_release"}, k = 1, mv = {1, 1, 15})
public final class f<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final f f21556a = new f(new Object());

    /* renamed from: b  reason: collision with root package name */
    public static final a f21557b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final Object f21558c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/jedi/model/datasource/Optional$Companion;", "", "()V", "None", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "getNone", "()Lcom/bytedance/jedi/model/datasource/Optional;", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        @NotNull
        public static f a() {
            return f.f21556a;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Nullable
    public final T a() {
        if (Intrinsics.areEqual((Object) this, (Object) f21556a)) {
            return null;
        }
        return this.f21558c;
    }

    public f(@NotNull Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "element");
        this.f21558c = obj;
    }
}
