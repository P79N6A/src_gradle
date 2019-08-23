package com.ss.android.ugc.aweme.filter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxEffectNetListResponseTypeAdapter;", "Lcom/google/gson/TypeAdapterFactory;", "()V", "create", "Lcom/google/gson/TypeAdapter;", "T", "gson", "Lcom/google/gson/Gson;", "type", "Lcom/google/gson/reflect/TypeToken;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FilterBoxEffectNetListResponseTypeAdapter implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47352a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0002\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/filter/FilterBoxEffectNetListResponseTypeAdapter$create$1", "Lcom/google/gson/TypeAdapter;", "read", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TypeAdapter f47354b;

        a(TypeAdapter typeAdapter) {
            this.f47354b = typeAdapter;
        }

        public final T read(@Nullable JsonReader jsonReader) {
            JsonReader jsonReader2 = jsonReader;
            if (!PatchProxy.isSupport(new Object[]{jsonReader2}, this, f47353a, false, 44126, new Class[]{JsonReader.class}, Object.class)) {
                return this.f47354b.read(jsonReader2);
            }
            return PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f47353a, false, 44126, new Class[]{JsonReader.class}, Object.class);
        }

        public final void write(@Nullable JsonWriter jsonWriter, T t) {
            JsonWriter jsonWriter2 = jsonWriter;
            if (PatchProxy.isSupport(new Object[]{jsonWriter2, t}, this, f47353a, false, 44125, new Class[]{JsonWriter.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jsonWriter2, t}, this, f47353a, false, 44125, new Class[]{JsonWriter.class, Object.class}, Void.TYPE);
                return;
            }
            TypeAdapter typeAdapter = this.f47354b;
            if (t != null) {
                typeAdapter.write(jsonWriter2, (n) t);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.FilterBoxEffectNetListResponse2");
        }
    }

    @Nullable
    public final <T> TypeAdapter<T> create(@Nullable Gson gson, @NotNull TypeToken<T> typeToken) {
        TypeToken<T> typeToken2 = typeToken;
        if (PatchProxy.isSupport(new Object[]{gson, typeToken2}, this, f47352a, false, 44124, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class)) {
            return (TypeAdapter) PatchProxy.accessDispatch(new Object[]{gson, typeToken2}, this, f47352a, false, 44124, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
        }
        Intrinsics.checkParameterIsNotNull(typeToken2, "type");
        if (!Intrinsics.areEqual((Object) typeToken.getRawType(), (Object) m.class)) {
            return null;
        }
        return new a<>(new GsonBuilder().registerTypeAdapterFactory(new FilterEffectTypeAdapterFactory()).create().getAdapter(n.class));
    }
}
