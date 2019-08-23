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

public final class AutoValue_FeatureCollection extends C$AutoValue_FeatureCollection {

    public static final class GsonTypeAdapter extends TypeAdapter<FeatureCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Feature>> list__feature_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson2) {
            this.gson = gson2;
        }

        public final FeatureCollection read(JsonReader jsonReader) throws IOException {
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
                    if (hashCode != -290659267) {
                        if (hashCode != 3017257) {
                            if (hashCode == 3575610 && nextName.equals("type")) {
                                c2 = 0;
                            }
                        } else if (nextName.equals("bbox")) {
                            c2 = 1;
                        }
                    } else if (nextName.equals("features")) {
                        c2 = 2;
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
                            TypeAdapter<List<Feature>> typeAdapter3 = this.list__feature_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                                this.list__feature_adapter = typeAdapter3;
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
            return new AutoValue_FeatureCollection(str, boundingBox, list);
        }

        public final void write(JsonWriter jsonWriter, FeatureCollection featureCollection) throws IOException {
            if (featureCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (featureCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, featureCollection.type());
            }
            jsonWriter.name("bbox");
            if (featureCollection.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBox_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBox_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, featureCollection.bbox());
            }
            jsonWriter.name("features");
            if (featureCollection.features() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Feature>> typeAdapter3 = this.list__feature_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                    this.list__feature_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, featureCollection.features());
            }
            jsonWriter.endObject();
        }
    }

    AutoValue_FeatureCollection(String str, @Nullable BoundingBox boundingBox, @Nullable List<Feature> list) {
        super(str, boundingBox, list);
    }
}
