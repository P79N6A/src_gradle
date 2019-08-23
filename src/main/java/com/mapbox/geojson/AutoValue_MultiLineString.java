package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class AutoValue_MultiLineString extends C$AutoValue_MultiLineString {

    public static final class GsonTypeAdapter extends TypeAdapter<MultiLineString> {
        private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
        private final Gson gson;
        private volatile TypeAdapter<List<List<Point>>> list__list__point_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson2) {
            this.gson = gson2;
        }

        public final MultiLineString read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List list = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3017257) {
                        if (hashCode != 3575610) {
                            if (hashCode == 1871919611 && nextName.equals("coordinates")) {
                                c2 = 2;
                            }
                        } else if (nextName.equals("type")) {
                            c2 = 0;
                        }
                    } else if (nextName.equals("bbox")) {
                        c2 = 1;
                    }
                    switch (c2) {
                        case 0:
                            TypeAdapter<String> typeAdapter = this.string_adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter;
                            }
                            str = (String) typeAdapter.read(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBox_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                                this.boundingBox_adapter = typeAdapter2;
                            }
                            boundingBox = (BoundingBox) typeAdapter2.read(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<List<List<Point>>> typeAdapter3 = this.list__list__point_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, Point.class).getType()));
                                this.list__list__point_adapter = typeAdapter3;
                            }
                            list = (List) typeAdapter3.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return new AutoValue_MultiLineString(str, boundingBox, list);
        }

        public final void write(JsonWriter jsonWriter, MultiLineString multiLineString) throws IOException {
            if (multiLineString == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (multiLineString.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, multiLineString.type());
            }
            jsonWriter.name("bbox");
            if (multiLineString.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBox_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBox_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, multiLineString.bbox());
            }
            jsonWriter.name("coordinates");
            if (multiLineString.coordinates() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<List<Point>>> typeAdapter3 = this.list__list__point_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, Point.class).getType()));
                    this.list__list__point_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, multiLineString.coordinates());
            }
            jsonWriter.endObject();
        }
    }

    AutoValue_MultiLineString(String str, @Nullable BoundingBox boundingBox, List<List<Point>> list) {
        super(str, boundingBox, list);
    }
}
