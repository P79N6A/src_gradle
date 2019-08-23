package com.mapbox.api.geocoding.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class f extends c {

    public static final class a extends TypeAdapter<i> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26322a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<String>> f26323b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<h>> f26324c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26325d;

        public a(Gson gson) {
            this.f26325d = gson;
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
            String str2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -309882753) {
                        if (hashCode != -290659267) {
                            if (hashCode != 3575610) {
                                if (hashCode == 107944136 && nextName.equals("query")) {
                                    c2 = 1;
                                }
                            } else if (nextName.equals("type")) {
                                c2 = 0;
                            }
                        } else if (nextName.equals("features")) {
                            c2 = 2;
                        }
                    } else if (nextName.equals("attribution")) {
                        c2 = 3;
                    }
                    switch (c2) {
                        case 0:
                            TypeAdapter<String> typeAdapter = this.f26322a;
                            if (typeAdapter == null) {
                                typeAdapter = this.f26325d.getAdapter(String.class);
                                this.f26322a = typeAdapter;
                            }
                            str = (String) typeAdapter.read(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<List<String>> typeAdapter2 = this.f26323b;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f26325d.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.f26323b = typeAdapter2;
                            }
                            list = (List) typeAdapter2.read(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<List<h>> typeAdapter3 = this.f26324c;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f26325d.getAdapter(TypeToken.getParameterized(List.class, h.class));
                                this.f26324c = typeAdapter3;
                            }
                            list2 = (List) typeAdapter3.read(jsonReader);
                            break;
                        case 3:
                            TypeAdapter<String> typeAdapter4 = this.f26322a;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.f26325d.getAdapter(String.class);
                                this.f26322a = typeAdapter4;
                            }
                            str2 = (String) typeAdapter4.read(jsonReader);
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
            return new f(str, list, list2, str2);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            i iVar = (i) obj;
            if (iVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (iVar.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26322a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26325d.getAdapter(String.class);
                    this.f26322a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, iVar.type());
            }
            jsonWriter.name("query");
            if (iVar.query() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter2 = this.f26323b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26325d.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.f26323b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, iVar.query());
            }
            jsonWriter.name("features");
            if (iVar.features() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<h>> typeAdapter3 = this.f26324c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26325d.getAdapter(TypeToken.getParameterized(List.class, h.class));
                    this.f26324c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, iVar.features());
            }
            jsonWriter.name("attribution");
            if (iVar.attribution() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f26322a;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26325d.getAdapter(String.class);
                    this.f26322a = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, iVar.attribution());
            }
            jsonWriter.endObject();
        }
    }

    f(String str, List<String> list, List<h> list2, String str2) {
        super(str, list, list2, str2);
    }
}
