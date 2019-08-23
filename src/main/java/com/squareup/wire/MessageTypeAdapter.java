package com.squareup.wire;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
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

public class MessageTypeAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends TypeAdapter<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final Gson gson;
    private final RuntimeMessageAdapter<M, B> messageAdapter;

    @Nullable
    public M read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        TypeAdapter<JsonElement> adapter = this.gson.getAdapter(JsonElement.class);
        Message.Builder newBuilder = this.messageAdapter.newBuilder();
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            FieldBinding fieldBinding = this.fieldBindings.get(jsonReader.nextName());
            if (fieldBinding == null) {
                jsonReader.skipValue();
            } else {
                fieldBinding.set(newBuilder, parseValue(fieldBinding, (JsonElement) adapter.read(jsonReader)));
            }
        }
        jsonReader.endObject();
        return newBuilder.build();
    }

    private void emitUint64(Long l, JsonWriter jsonWriter) throws IOException {
        if (l.longValue() < 0) {
            jsonWriter.value((Number) POWER_64.add(BigInteger.valueOf(l.longValue())));
        } else {
            jsonWriter.value((Number) l);
        }
    }

    MessageTypeAdapter(Gson gson2, TypeToken<M> typeToken) {
        this.gson = gson2;
        this.messageAdapter = WireFiledWorkaround.create(typeToken.getRawType());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
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

    private Object parseValue(FieldBinding<?, ?> fieldBinding, JsonElement jsonElement) {
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
            return this.gson.fromJson(jsonElement, fieldBinding.singleAdapter().javaType);
        } else if (jsonElement.isJsonNull()) {
            return Collections.emptyMap();
        } else {
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
}
