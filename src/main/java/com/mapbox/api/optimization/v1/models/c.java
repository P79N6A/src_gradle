package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.a.am;
import java.io.IOException;
import java.util.List;

public final class c extends a {

    public static final class a extends TypeAdapter<e> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26371a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<f>> f26372b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<am>> f26373c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26374d;

        public a(Gson gson) {
            this.f26374d = gson;
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List list = null;
            List list2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3059181) {
                        if (hashCode != 110629102) {
                            if (hashCode == 241170578 && nextName.equals("waypoints")) {
                                c2 = 1;
                            }
                        } else if (nextName.equals("trips")) {
                            c2 = 2;
                        }
                    } else if (nextName.equals("code")) {
                        c2 = 0;
                    }
                    switch (c2) {
                        case 0:
                            TypeAdapter<String> typeAdapter = this.f26371a;
                            if (typeAdapter == null) {
                                typeAdapter = this.f26374d.getAdapter(String.class);
                                this.f26371a = typeAdapter;
                            }
                            str = (String) typeAdapter.read(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<List<f>> typeAdapter2 = this.f26372b;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f26374d.getAdapter(TypeToken.getParameterized(List.class, f.class));
                                this.f26372b = typeAdapter2;
                            }
                            list = (List) typeAdapter2.read(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<List<am>> typeAdapter3 = this.f26373c;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f26374d.getAdapter(TypeToken.getParameterized(List.class, am.class));
                                this.f26373c = typeAdapter3;
                            }
                            list2 = (List) typeAdapter3.read(jsonReader);
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
            return new c(str, list, list2);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            e eVar = (e) obj;
            if (eVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (eVar.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26371a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26374d.getAdapter(String.class);
                    this.f26371a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, eVar.code());
            }
            jsonWriter.name("waypoints");
            if (eVar.waypoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<f>> typeAdapter2 = this.f26372b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26374d.getAdapter(TypeToken.getParameterized(List.class, f.class));
                    this.f26372b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, eVar.waypoints());
            }
            jsonWriter.name("trips");
            if (eVar.trips() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<am>> typeAdapter3 = this.f26373c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26374d.getAdapter(TypeToken.getParameterized(List.class, am.class));
                    this.f26373c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, eVar.trips());
            }
            jsonWriter.endObject();
        }
    }

    c(@Nullable String str, @Nullable List<f> list, @Nullable List<am> list2) {
        super(str, list, list2);
    }
}
