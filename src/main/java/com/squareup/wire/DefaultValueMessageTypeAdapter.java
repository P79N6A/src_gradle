package com.squareup.wire;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import com.taobao.android.dexposed.ClassUtils;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class DefaultValueMessageTypeAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends TypeAdapter<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final M defaultValue;
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final Gson gson;
    private final WireDeserializeErrorListener listener;
    private final RuntimeMessageAdapter<M, B> messageAdapter;
    private final String path;
    private final TypeToken<M> type;

    @Nullable
    public M read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        TypeAdapter<JsonElement> adapter = this.gson.getAdapter(JsonElement.class);
        Message.Builder newBuilder = this.defaultValue.newBuilder();
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            FieldBinding fieldBinding = this.fieldBindings.get(nextName);
            if (fieldBinding == null) {
                jsonReader.skipValue();
            } else {
                try {
                    Object parseValue = parseValue(fieldBinding, (JsonElement) adapter.read(jsonReader), nextName, fieldBinding.getFromBuilder(newBuilder));
                    if (parseValue == null && fieldBinding.label == WireField.Label.REQUIRED) {
                        onDeserializeError(new IllegalStateException(nextName + " is null"), nextName);
                    } else {
                        fieldBinding.set(newBuilder, parseValue);
                    }
                } catch (Throwable th) {
                    onDeserializeError(th, nextName);
                }
            }
        }
        jsonReader.endObject();
        try {
            return newBuilder.build();
        } catch (Exception e2) {
            onDeserializeError(e2, null);
            throw e2;
        }
    }

    private void emitUint64(Long l, JsonWriter jsonWriter) throws IOException {
        if (l.longValue() < 0) {
            jsonWriter.value((Number) POWER_64.add(BigInteger.valueOf(l.longValue())));
        } else {
            jsonWriter.value((Number) l);
        }
    }

    private void onDeserializeError(Throwable th, String str) {
        if (this.listener != null) {
            if (!TextUtils.isEmpty(this.path)) {
                str = this.path + ClassUtils.PACKAGE_SEPARATOR + str;
            }
            this.listener.onError(this.type.getRawType(), str, th);
        }
    }

    public void write(JsonWriter jsonWriter, @Nullable M m) throws IOException {
        if (m == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                jsonWriter.name(fieldBinding.name);
                emitJson(jsonWriter, obj, fieldBinding.singleAdapter(), fieldBinding.label);
            }
        }
        jsonWriter.endObject();
    }

    private void emitJson(JsonWriter jsonWriter, Object obj, ProtoAdapter<?> protoAdapter, WireField.Label label) throws IOException {
        if (protoAdapter != ProtoAdapter.UINT64) {
            this.gson.toJson(obj, (Type) obj.getClass(), jsonWriter);
        } else if (label.isRepeated()) {
            List list = (List) obj;
            jsonWriter.beginArray();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                emitUint64((Long) list.get(i), jsonWriter);
            }
            jsonWriter.endArray();
        } else {
            emitUint64((Long) obj, jsonWriter);
        }
    }

    private <T> Object fromJson(JsonElement jsonElement, Class<T> cls, String str, Object obj) throws JsonSyntaxException {
        TypeAdapter<T> adapter = this.gson.getAdapter(cls);
        if (obj == null || !Message.class.isAssignableFrom(cls) || (!(adapter instanceof MessageTypeAdapter) && !(adapter instanceof DefaultValueMessageTypeAdapter))) {
            return this.gson.fromJson(jsonElement, cls);
        }
        Message message = (Message) obj;
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonElement);
        boolean isLenient = jsonTreeReader.isLenient();
        jsonTreeReader.setLenient(true);
        try {
            jsonTreeReader.peek();
            TypeToken<T> typeToken = TypeToken.get(cls);
            Gson gson2 = this.gson;
            if (!TextUtils.isEmpty(this.path)) {
                str = this.path + ClassUtils.PACKAGE_SEPARATOR + str;
            }
            DefaultValueMessageTypeAdapter defaultValueMessageTypeAdapter = new DefaultValueMessageTypeAdapter(gson2, typeToken, str, message, this.listener);
            Object read = defaultValueMessageTypeAdapter.read(jsonTreeReader);
            jsonTreeReader.setLenient(isLenient);
            return read;
        } catch (EOFException e2) {
            if (1 != 0) {
                jsonTreeReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (IOException e4) {
            throw new JsonSyntaxException((Throwable) e4);
        } catch (AssertionError e5) {
            throw new JsonSyntaxException("AssertionError (GSON 2.8.5): " + e5.getMessage(), e5);
        } catch (Throwable th) {
            jsonTreeReader.setLenient(isLenient);
            throw th;
        }
    }

    private Object parseValue(FieldBinding<?, ?> fieldBinding, JsonElement jsonElement, String str, Object obj) {
        if (fieldBinding.label.isRepeated()) {
            if (jsonElement.isJsonNull()) {
                return Collections.emptyList();
            }
            Class<?> cls = fieldBinding.singleAdapter().javaType;
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            ArrayList arrayList = new ArrayList(asJsonArray.size());
            Iterator<JsonElement> it2 = asJsonArray.iterator();
            while (it2.hasNext()) {
                arrayList.add(this.gson.fromJson(it2.next(), cls));
            }
            return arrayList;
        } else if (!fieldBinding.isMap()) {
            return fromJson(jsonElement, fieldBinding.singleAdapter().javaType, str, obj);
        } else {
            if (jsonElement.isJsonNull()) {
                return Collections.emptyMap();
            }
            Class<?> cls2 = fieldBinding.keyAdapter().javaType;
            Class<?> cls3 = fieldBinding.singleAdapter().javaType;
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            LinkedHashMap linkedHashMap = new LinkedHashMap(asJsonObject.size());
            for (Map.Entry next : asJsonObject.entrySet()) {
                linkedHashMap.put(this.gson.fromJson((String) next.getKey(), cls2), this.gson.fromJson((JsonElement) next.getValue(), cls3));
            }
            return linkedHashMap;
        }
    }

    DefaultValueMessageTypeAdapter(Gson gson2, TypeToken<M> typeToken, String str, M m, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.gson = gson2;
        this.messageAdapter = WireFiledWorkaround.create(typeToken.getRawType());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
        this.type = typeToken;
        this.defaultValue = m;
        this.path = str;
        this.listener = wireDeserializeErrorListener;
    }
}
