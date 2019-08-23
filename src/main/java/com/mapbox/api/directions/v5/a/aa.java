package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class aa extends k {

    public static final class a extends TypeAdapter<ar> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f26156a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26157b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f26158c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26159d;

        public a(Gson gson) {
            this.f26159d = gson;
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            Integer num = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -284840886) {
                        if (hashCode != 3387192) {
                            if (hashCode != 3594628) {
                                if (hashCode == 109641799 && nextName.equals("speed")) {
                                    c2 = 0;
                                }
                            } else if (nextName.equals("unit")) {
                                c2 = 1;
                            }
                        } else if (nextName.equals("none")) {
                            c2 = 3;
                        }
                    } else if (nextName.equals("unknown")) {
                        c2 = 2;
                    }
                    switch (c2) {
                        case 0:
                            TypeAdapter<Integer> typeAdapter = this.f26156a;
                            if (typeAdapter == null) {
                                typeAdapter = this.f26159d.getAdapter(Integer.class);
                                this.f26156a = typeAdapter;
                            }
                            num = (Integer) typeAdapter.read(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.f26157b;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f26159d.getAdapter(String.class);
                                this.f26157b = typeAdapter2;
                            }
                            str = (String) typeAdapter2.read(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<Boolean> typeAdapter3 = this.f26158c;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f26159d.getAdapter(Boolean.class);
                                this.f26158c = typeAdapter3;
                            }
                            bool = (Boolean) typeAdapter3.read(jsonReader);
                            break;
                        case 3:
                            TypeAdapter<Boolean> typeAdapter4 = this.f26158c;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.f26159d.getAdapter(Boolean.class);
                                this.f26158c = typeAdapter4;
                            }
                            bool2 = (Boolean) typeAdapter4.read(jsonReader);
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
            return new aa(num, str, bool, bool2);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            ar arVar = (ar) obj;
            if (arVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("speed");
            if (arVar.speed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter = this.f26156a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26159d.getAdapter(Integer.class);
                    this.f26156a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, arVar.speed());
            }
            jsonWriter.name("unit");
            if (arVar.unit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26157b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26159d.getAdapter(String.class);
                    this.f26157b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, arVar.unit());
            }
            jsonWriter.name("unknown");
            if (arVar.unknown() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter3 = this.f26158c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26159d.getAdapter(Boolean.class);
                    this.f26158c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, arVar.unknown());
            }
            jsonWriter.name("none");
            if (arVar.none() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter4 = this.f26158c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26159d.getAdapter(Boolean.class);
                    this.f26158c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, arVar.none());
            }
            jsonWriter.endObject();
        }
    }

    aa(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(num, str, bool, bool2);
    }
}
