package com.mapbox.api.matrix.v1.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.a.an;
import java.io.IOException;
import java.util.List;

public final class b extends a {

    public static final class a extends TypeAdapter<c> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26360a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<an>> f26361b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<Double[]>> f26362c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26363d;

        public a(Gson gson) {
            this.f26363d = gson;
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
            List list3 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -2021876808) {
                        if (hashCode != -1622842017) {
                            if (hashCode != -1375584731) {
                                if (hashCode == 3059181 && nextName.equals("code")) {
                                    c2 = 0;
                                }
                            } else if (nextName.equals("destinations")) {
                                c2 = 1;
                            }
                        } else if (nextName.equals("durations")) {
                            c2 = 3;
                        }
                    } else if (nextName.equals("sources")) {
                        c2 = 2;
                    }
                    switch (c2) {
                        case 0:
                            TypeAdapter<String> typeAdapter = this.f26360a;
                            if (typeAdapter == null) {
                                typeAdapter = this.f26363d.getAdapter(String.class);
                                this.f26360a = typeAdapter;
                            }
                            str = (String) typeAdapter.read(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<List<an>> typeAdapter2 = this.f26361b;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f26363d.getAdapter(TypeToken.getParameterized(List.class, an.class));
                                this.f26361b = typeAdapter2;
                            }
                            list = (List) typeAdapter2.read(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<List<an>> typeAdapter3 = this.f26361b;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f26363d.getAdapter(TypeToken.getParameterized(List.class, an.class));
                                this.f26361b = typeAdapter3;
                            }
                            list2 = (List) typeAdapter3.read(jsonReader);
                            break;
                        case 3:
                            TypeAdapter<List<Double[]>> typeAdapter4 = this.f26362c;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.f26363d.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                                this.f26362c = typeAdapter4;
                            }
                            list3 = (List) typeAdapter4.read(jsonReader);
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
            return new b(str, list, list2, list3);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            c cVar = (c) obj;
            if (cVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (cVar.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26360a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26363d.getAdapter(String.class);
                    this.f26360a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, cVar.code());
            }
            jsonWriter.name("destinations");
            if (cVar.destinations() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<an>> typeAdapter2 = this.f26361b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26363d.getAdapter(TypeToken.getParameterized(List.class, an.class));
                    this.f26361b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, cVar.destinations());
            }
            jsonWriter.name("sources");
            if (cVar.sources() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<an>> typeAdapter3 = this.f26361b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26363d.getAdapter(TypeToken.getParameterized(List.class, an.class));
                    this.f26361b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, cVar.sources());
            }
            jsonWriter.name("durations");
            if (cVar.durations() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double[]>> typeAdapter4 = this.f26362c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26363d.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                    this.f26362c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, cVar.durations());
            }
            jsonWriter.endObject();
        }
    }

    b(String str, @Nullable List<an> list, @Nullable List<an> list2, @Nullable List<Double[]> list3) {
        super(str, list, list2, list3);
    }
}
