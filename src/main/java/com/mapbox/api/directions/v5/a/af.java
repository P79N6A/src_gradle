package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class af extends p {

    public static final class a extends TypeAdapter<aw> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26180a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26181b;

        /* renamed from: c  reason: collision with root package name */
        private final Gson f26182c;

        public a(Gson gson) {
            this.f26182c = gson;
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            Double d2 = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1880056090) {
                        if (hashCode != 156781895) {
                            if (hashCode == 713287674 && nextName.equals("distanceAlongGeometry")) {
                                c2 = 0;
                            }
                        } else if (nextName.equals("announcement")) {
                            c2 = 1;
                        }
                    } else if (nextName.equals("ssmlAnnouncement")) {
                        c2 = 2;
                    }
                    switch (c2) {
                        case 0:
                            TypeAdapter<Double> typeAdapter = this.f26180a;
                            if (typeAdapter == null) {
                                typeAdapter = this.f26182c.getAdapter(Double.class);
                                this.f26180a = typeAdapter;
                            }
                            d2 = (Double) typeAdapter.read(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.f26181b;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f26182c.getAdapter(String.class);
                                this.f26181b = typeAdapter2;
                            }
                            str = (String) typeAdapter2.read(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<String> typeAdapter3 = this.f26181b;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f26182c.getAdapter(String.class);
                                this.f26181b = typeAdapter3;
                            }
                            str2 = (String) typeAdapter3.read(jsonReader);
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
            return new af(d2, str, str2);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            aw awVar = (aw) obj;
            if (awVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("distanceAlongGeometry");
            if (awVar.distanceAlongGeometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter = this.f26180a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26182c.getAdapter(Double.class);
                    this.f26180a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, awVar.distanceAlongGeometry());
            }
            jsonWriter.name("announcement");
            if (awVar.announcement() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26181b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26182c.getAdapter(String.class);
                    this.f26181b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, awVar.announcement());
            }
            jsonWriter.name("ssmlAnnouncement");
            if (awVar.ssmlAnnouncement() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26181b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26182c.getAdapter(String.class);
                    this.f26181b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, awVar.ssmlAnnouncement());
            }
            jsonWriter.endObject();
        }
    }

    af(@Nullable Double d2, @Nullable String str, @Nullable String str2) {
        super(d2, str, str2);
    }
}
