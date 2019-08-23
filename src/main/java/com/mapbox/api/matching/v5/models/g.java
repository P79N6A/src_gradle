package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class g extends c {

    public static final class a extends TypeAdapter<k> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26348a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<j>> f26349b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<l>> f26350c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26351d;

        public a(Gson gson) {
            this.f26351d = gson;
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
            List list = null;
            List list2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3059181) {
                        if (hashCode != 614650902) {
                            if (hashCode != 954925063) {
                                if (hashCode == 1050248808 && nextName.equals("tracepoints")) {
                                    c2 = 3;
                                }
                            } else if (nextName.equals("message")) {
                                c2 = 1;
                            }
                        } else if (nextName.equals("matchings")) {
                            c2 = 2;
                        }
                    } else if (nextName.equals("code")) {
                        c2 = 0;
                    }
                    switch (c2) {
                        case 0:
                            TypeAdapter<String> typeAdapter = this.f26348a;
                            if (typeAdapter == null) {
                                typeAdapter = this.f26351d.getAdapter(String.class);
                                this.f26348a = typeAdapter;
                            }
                            str = (String) typeAdapter.read(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.f26348a;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f26351d.getAdapter(String.class);
                                this.f26348a = typeAdapter2;
                            }
                            str2 = (String) typeAdapter2.read(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<List<j>> typeAdapter3 = this.f26349b;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f26351d.getAdapter(TypeToken.getParameterized(List.class, j.class));
                                this.f26349b = typeAdapter3;
                            }
                            list = (List) typeAdapter3.read(jsonReader);
                            break;
                        case 3:
                            TypeAdapter<List<l>> typeAdapter4 = this.f26350c;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.f26351d.getAdapter(TypeToken.getParameterized(List.class, l.class));
                                this.f26350c = typeAdapter4;
                            }
                            list2 = (List) typeAdapter4.read(jsonReader);
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
            return new g(str, str2, list, list2);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            k kVar = (k) obj;
            if (kVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (kVar.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26348a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26351d.getAdapter(String.class);
                    this.f26348a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, kVar.code());
            }
            jsonWriter.name("message");
            if (kVar.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26348a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26351d.getAdapter(String.class);
                    this.f26348a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, kVar.message());
            }
            jsonWriter.name("matchings");
            if (kVar.matchings() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<j>> typeAdapter3 = this.f26349b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26351d.getAdapter(TypeToken.getParameterized(List.class, j.class));
                    this.f26349b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, kVar.matchings());
            }
            jsonWriter.name("tracepoints");
            if (kVar.tracepoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<l>> typeAdapter4 = this.f26350c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26351d.getAdapter(TypeToken.getParameterized(List.class, l.class));
                    this.f26350c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, kVar.tracepoints());
            }
            jsonWriter.endObject();
        }
    }

    g(String str, @Nullable String str2, @Nullable List<j> list, @Nullable List<l> list2) {
        super(str, str2, list, list2);
    }
}
