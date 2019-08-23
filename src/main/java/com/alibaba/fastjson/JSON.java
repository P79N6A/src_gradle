package com.alibaba.fastjson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class JSON {
    private static final TypeAdapter<Boolean> booleanAsIntAdapter = new TypeAdapter<Boolean>() {
        public final Boolean read(JsonReader jsonReader) throws IOException {
            boolean z;
            JsonToken peek = jsonReader.peek();
            switch (AnonymousClass3.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()]) {
                case 1:
                    return Boolean.valueOf(jsonReader.nextBoolean());
                case 2:
                    jsonReader.nextNull();
                    return null;
                case 3:
                    try {
                        if (jsonReader.nextInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException((Throwable) e2);
                    }
                case 4:
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                default:
                    throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + peek);
            }
        }

        public final void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            if (bool == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(bool);
            }
        }
    };
    private static final TypeAdapter<Integer> intAsBooleanAdapter = new TypeAdapter<Integer>() {
        public final Integer read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            switch (AnonymousClass3.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()]) {
                case 1:
                    return Integer.valueOf(jsonReader.nextBoolean() ? 1 : 0);
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
                    return Integer.valueOf(Boolean.parseBoolean(jsonReader.nextString()) ? 1 : 0);
                default:
                    throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + peek);
            }
        }

        public final void write(JsonWriter jsonWriter, Integer num) throws IOException {
            if (num == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value((Number) num);
            }
        }
    };

    /* renamed from: com.alibaba.fastjson.JSON$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.AnonymousClass3.<clinit>():void");
        }
    }

    static Gson createAdapterGson() {
        return createAdapterGsonBuilder().create();
    }

    public static GsonBuilder createAdapterGsonBuilder() {
        return new GsonBuilder().registerTypeAdapter(Boolean.class, booleanAsIntAdapter).registerTypeAdapter(Boolean.TYPE, booleanAsIntAdapter).registerTypeAdapter(Integer.class, intAsBooleanAdapter).registerTypeAdapter(Integer.TYPE, intAsBooleanAdapter).setLenient();
    }

    @Deprecated
    public static Gson createAdapterGsonFromGsonBuilder(GsonBuilder gsonBuilder) {
        return gsonBuilder.create();
    }

    public static String toJSONString(Object obj) {
        return createAdapterGson().toJson(obj);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        try {
            return (List) createAdapterGson().fromJson(str, (Type) C$Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, cls));
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        Gson createAdapterGson = createAdapterGson();
        if (cls == null) {
            return new JSONObject();
        }
        return createAdapterGson.fromJson(str, cls);
    }
}
