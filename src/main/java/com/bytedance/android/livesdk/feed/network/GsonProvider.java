package com.bytedance.android.livesdk.feed.network;

import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.network.response.RequestError;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.feed.services.FeedItemDeserializer;
import com.bytedance.android.livesdk.feed.services.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class GsonProvider implements b.C0103b<Gson> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14288a;

    static abstract class AbsJsonDeserializer<T> implements JsonDeserializer<T> {

        /* renamed from: a  reason: collision with root package name */
        protected Gson f14290a;

        public AbsJsonDeserializer(Gson gson) {
            this.f14290a = gson;
        }
    }

    static class BaseListResponseDeserializer extends AbsJsonDeserializer<com.bytedance.android.live.core.network.response.a> {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f14291b;

        public BaseListResponseDeserializer(Gson gson) {
            super(gson);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonElement jsonElement2 = jsonElement;
            Type type2 = type;
            if (PatchProxy.isSupport(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14291b, false, 8778, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, com.bytedance.android.live.core.network.response.a.class)) {
                return (com.bytedance.android.live.core.network.response.a) PatchProxy.accessDispatch(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14291b, false, 8778, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, com.bytedance.android.live.core.network.response.a.class);
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            int asInt = asJsonObject.get("status_code").getAsInt();
            if (asInt == 0) {
                return (com.bytedance.android.live.core.network.response.a) this.f14290a.fromJson(jsonElement, type2);
            }
            com.bytedance.android.live.core.network.response.a aVar = new com.bytedance.android.live.core.network.response.a();
            aVar.f7866a = asInt;
            aVar.f7869d = (RequestError) this.f14290a.fromJson(asJsonObject.get("data"), RequestError.class);
            if (type2 instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                if (actualTypeArguments.length <= 1) {
                    aVar.f7868c = (Extra) this.f14290a.fromJson(asJsonObject.get(PushConstants.EXTRA), Extra.class);
                } else {
                    aVar.f7868c = (Extra) this.f14290a.fromJson(asJsonObject.get(PushConstants.EXTRA), actualTypeArguments[1]);
                }
            } else {
                aVar.f7868c = (Extra) this.f14290a.fromJson(asJsonObject.get(PushConstants.EXTRA), Extra.class);
            }
            return aVar;
        }
    }

    static class BaseResponseDeserializer extends AbsJsonDeserializer<com.bytedance.android.live.core.network.response.b> {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f14292b;

        BaseResponseDeserializer(Gson gson) {
            super(gson);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonElement jsonElement2 = jsonElement;
            Type type2 = type;
            if (PatchProxy.isSupport(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14292b, false, 8779, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, com.bytedance.android.live.core.network.response.b.class)) {
                return (com.bytedance.android.live.core.network.response.b) PatchProxy.accessDispatch(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14292b, false, 8779, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, com.bytedance.android.live.core.network.response.b.class);
            }
            com.bytedance.android.live.core.network.response.b bVar = (com.bytedance.android.live.core.network.response.b) this.f14290a.fromJson(jsonElement, type2);
            if (bVar.f7870a != 0) {
                bVar.f7873d = (RequestError) this.f14290a.fromJson(jsonElement.getAsJsonObject().get("data"), RequestError.class);
            }
            return bVar;
        }
    }

    static class ListResponseDeserializer extends AbsJsonDeserializer<c> {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f14293b;

        public ListResponseDeserializer(Gson gson) {
            super(gson);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonElement jsonElement2 = jsonElement;
            Type type2 = type;
            if (PatchProxy.isSupport(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14293b, false, 8782, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14293b, false, 8782, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, c.class);
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            int asInt = asJsonObject.get("status_code").getAsInt();
            if (asInt == 0) {
                return (c) this.f14290a.fromJson(jsonElement, type2);
            }
            c cVar = new c();
            cVar.f7866a = asInt;
            cVar.f7868c = (Extra) this.f14290a.fromJson(asJsonObject.get(PushConstants.EXTRA), Extra.class);
            cVar.f7869d = (RequestError) this.f14290a.fromJson(asJsonObject.get("data"), RequestError.class);
            return cVar;
        }
    }

    static class ResponseDeserializer extends AbsJsonDeserializer<d> {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f14294b;

        ResponseDeserializer(Gson gson) {
            super(gson);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonElement jsonElement2 = jsonElement;
            Type type2 = type;
            if (PatchProxy.isSupport(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14294b, false, 8783, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14294b, false, 8783, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, d.class);
            }
            d dVar = (d) this.f14290a.fromJson(jsonElement, type2);
            if (dVar.f7870a != 0) {
                dVar.f7873d = (RequestError) this.f14290a.fromJson(jsonElement.getAsJsonObject().get("data"), RequestError.class);
            }
            return dVar;
        }
    }

    static class RoomDeserializer implements JsonDeserializer<Room> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14295a;

        /* renamed from: b  reason: collision with root package name */
        private Gson f14296b;

        private RoomDeserializer() {
            this.f14296b = com.bytedance.android.live.a.a();
        }

        /* synthetic */ RoomDeserializer(byte b2) {
            this();
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonElement jsonElement2 = jsonElement;
            Type type2 = type;
            if (PatchProxy.isSupport(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14295a, false, 8784, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Room.class)) {
                return (Room) PatchProxy.accessDispatch(new Object[]{jsonElement2, type2, jsonDeserializationContext}, this, f14295a, false, 8784, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Room.class);
            }
            Room room = (Room) this.f14296b.fromJson(jsonElement2, type2);
            room.init();
            return room;
        }
    }

    static class a extends TypeAdapter<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14297a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{jsonReader}, this, f14297a, false, 8781, new Class[]{JsonReader.class}, Boolean.class)) {
                return (Boolean) PatchProxy.accessDispatch(new Object[]{jsonReader}, this, f14297a, false, 8781, new Class[]{JsonReader.class}, Boolean.class);
            }
            JsonToken peek = jsonReader.peek();
            switch (peek) {
                case BOOLEAN:
                    return Boolean.valueOf(jsonReader.nextBoolean());
                case NULL:
                    jsonReader.nextNull();
                    return null;
                case NUMBER:
                    if (jsonReader.nextInt() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                default:
                    throw new JsonParseException("Expected BOOLEAN or NUMBER but was " + peek);
            }
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            JsonWriter jsonWriter2 = jsonWriter;
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{jsonWriter2, bool}, this, f14297a, false, 8780, new Class[]{JsonWriter.class, Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jsonWriter2, bool}, this, f14297a, false, 8780, new Class[]{JsonWriter.class, Boolean.class}, Void.TYPE);
            } else if (bool == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter2.value(bool.booleanValue());
            }
        }
    }

    @NonNull
    public final b.C0103b.a<Gson> a(b.C0103b.a<Gson> aVar) {
        Map map;
        b.C0103b.a<Gson> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f14288a, false, 8776, new Class[]{b.C0103b.a.class}, b.C0103b.a.class)) {
            return (b.C0103b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14288a, false, 8776, new Class[]{b.C0103b.a.class}, b.C0103b.a.class);
        }
        GsonBuilder fieldNamingPolicy = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        if (PatchProxy.isSupport(new Object[0], null, f14288a, true, 8777, new Class[0], Map.class)) {
            map = (Map) PatchProxy.accessDispatch(new Object[0], null, f14288a, true, 8777, new Class[0], Map.class);
        } else {
            map = new HashMap();
            map.put(Room.class, new RoomDeserializer((byte) 0));
            map.put(FeedItem.class, new FeedItemDeserializer());
            map.put(Boolean.class, new a((byte) 0));
            map.put(Boolean.TYPE, new a((byte) 0));
        }
        if (map != null) {
            for (Type type : map.keySet()) {
                fieldNamingPolicy.registerTypeAdapter(type, map.get(type));
            }
        }
        GsonBuilder fieldNamingPolicy2 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        if (map != null) {
            for (Type type2 : map.keySet()) {
                fieldNamingPolicy2.registerTypeAdapter(type2, map.get(type2));
            }
        }
        Gson create = fieldNamingPolicy2.create();
        fieldNamingPolicy.registerTypeAdapter(com.bytedance.android.live.core.network.response.b.class, new BaseResponseDeserializer(create));
        fieldNamingPolicy.registerTypeAdapter(d.class, new ResponseDeserializer(create));
        fieldNamingPolicy.registerTypeAdapter(com.bytedance.android.live.core.network.response.a.class, new BaseListResponseDeserializer(create));
        fieldNamingPolicy.registerTypeAdapter(c.class, new ListResponseDeserializer(create));
        return aVar2.a(fieldNamingPolicy.create()).a();
    }
}
