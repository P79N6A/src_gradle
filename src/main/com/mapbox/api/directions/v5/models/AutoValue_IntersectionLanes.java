package com.mapbox.api.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_IntersectionLanes extends $AutoValue_IntersectionLanes {
  AutoValue_IntersectionLanes(@Nullable Boolean valid, @Nullable List<String> indications) {
    super(valid, indications);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<IntersectionLanes> {
    private volatile TypeAdapter<Boolean> boolean__adapter;
    private volatile TypeAdapter<List<String>> list__string_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, IntersectionLanes object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("valid");
      if (object.valid() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
        if (boolean__adapter == null) {
          this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
        }
        boolean__adapter.write(jsonWriter, object.valid());
      }
      jsonWriter.name("indications");
      if (object.indications() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
        if (list__string_adapter == null) {
          this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
        }
        list__string_adapter.write(jsonWriter, object.indications());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public IntersectionLanes read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      Boolean valid = null;
      List<String> indications = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "valid": {
            TypeAdapter<Boolean> boolean__adapter = this.boolean__adapter;
            if (boolean__adapter == null) {
              this.boolean__adapter = boolean__adapter = gson.getAdapter(Boolean.class);
            }
            valid = boolean__adapter.read(jsonReader);
            break;
          }
          case "indications": {
            TypeAdapter<List<String>> list__string_adapter = this.list__string_adapter;
            if (list__string_adapter == null) {
              this.list__string_adapter = list__string_adapter = (TypeAdapter<List<String>>) gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            }
            indications = list__string_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_IntersectionLanes(valid, indications);
    }
  }
}
