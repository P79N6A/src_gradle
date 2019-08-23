package com.bytedance.android.livesdk.feed.services;

import com.bytedance.android.live.a;
import com.bytedance.android.live.base.model.d;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Type;

public class FeedItemDeserializer implements JsonDeserializer<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14379a;

    /* renamed from: b  reason: collision with root package name */
    private Gson f14380b = a.a();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public FeedItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Type type2;
        JsonElement jsonElement2 = jsonElement;
        JsonDeserializationContext jsonDeserializationContext2 = jsonDeserializationContext;
        if (PatchProxy.isSupport(new Object[]{jsonElement2, type, jsonDeserializationContext2}, this, f14379a, false, 8897, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, FeedItem.class)) {
            return (FeedItem) PatchProxy.accessDispatch(new Object[]{jsonElement2, type, jsonDeserializationContext2}, this, f14379a, false, 8897, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, FeedItem.class);
        }
        try {
            FeedItem feedItem = (FeedItem) this.f14380b.fromJson(jsonElement2, FeedItem.class);
            JsonElement jsonElement3 = jsonElement.getAsJsonObject().get("data");
            int i = feedItem.type;
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        type2 = Room.class;
                        break;
                    default:
                        type2 = Media.class;
                        break;
                }
            } else {
                type2 = com.bytedance.android.live.base.model.b.a.class;
            }
            feedItem.item = (d) jsonDeserializationContext2.deserialize(jsonElement3, type2);
            return feedItem;
        } catch (Exception unused) {
            throw new JsonParseException("error type");
        }
    }
}
