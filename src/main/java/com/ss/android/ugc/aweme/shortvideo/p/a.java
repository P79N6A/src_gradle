package com.ss.android.ugc.aweme.shortvideo.p;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/typeadapter/BooleanAsIntTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "", "()V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Integer;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Integer;)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends TypeAdapter<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68813a;

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: a */
    public Integer read(@NotNull JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        if (PatchProxy.isSupport(new Object[]{jsonReader2}, this, f68813a, false, 80116, new Class[]{JsonReader.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f68813a, false, 80116, new Class[]{JsonReader.class}, Integer.class);
        }
        Intrinsics.checkParameterIsNotNull(jsonReader2, "in");
        JsonToken peek = jsonReader.peek();
        if (peek != null) {
            switch (b.f68814a[peek.ordinal()]) {
                case 1:
                    if (jsonReader.nextBoolean()) {
                        return 1;
                    }
                    return 0;
                case 2:
                    jsonReader.nextNull();
                    return null;
                case 3:
                    try {
                        return Integer.valueOf(jsonReader.nextInt());
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException((Throwable) e2);
                    }
                case 4:
                    if (Boolean.parseBoolean(jsonReader.nextString())) {
                        return 1;
                    }
                    return 0;
            }
        }
        throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + peek);
    }

    public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        JsonWriter jsonWriter2 = jsonWriter;
        Integer num = (Integer) obj;
        if (PatchProxy.isSupport(new Object[]{jsonWriter2, num}, this, f68813a, false, 80115, new Class[]{JsonWriter.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jsonWriter2, num}, this, f68813a, false, 80115, new Class[]{JsonWriter.class, Integer.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(jsonWriter2, "out");
        if (num == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter2.value((Number) num);
        }
    }
}
