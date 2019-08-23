package com.squareup.wire;

import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import okio.ByteString;

public final class WireTypeAdapterFactory implements TypeAdapterFactory {
    private final Map<Class, Pair<Message, WireDeserializeErrorListener>> defaultValue = new HashMap();

    public final void registerDefaultValue(Message message, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.defaultValue.put(message.getClass(), new Pair(message, wireDeserializeErrorListener));
    }

    @Nullable
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (rawType.equals(ByteString.class)) {
            return new ByteStringTypeAdapter();
        }
        Pair pair = this.defaultValue.get(rawType);
        if (pair != null) {
            DefaultValueMessageTypeAdapter defaultValueMessageTypeAdapter = new DefaultValueMessageTypeAdapter(gson, typeToken, "", (Message) pair.first, (WireDeserializeErrorListener) pair.second);
            return defaultValueMessageTypeAdapter;
        } else if (Message.class.isAssignableFrom(rawType)) {
            return new MessageTypeAdapter(gson, typeToken);
        } else {
            return null;
        }
    }
}
