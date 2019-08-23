package com.ss.android.ugc.aweme.global.config.settings;

import a.i;
import com.alibaba.fastjson.JSON;
import com.aweme.storage.e;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueBuilder;
import com.squareup.wire.WireDeserializeErrorListener;
import com.squareup.wire.WireTypeAdapterFactory;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.global.config.settings._default.AbstractSettingsGroup;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class SettingsUtil {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49523a;

    static final class JsonObjectDeserializer implements JsonDeserializer<JsonStubWillConvertToString> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49524a;

        JsonObjectDeserializer() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JsonStubWillConvertToString deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonStubWillConvertToString jsonStubWillConvertToString;
            if (PatchProxy.isSupport(new Object[]{jsonElement, type, jsonDeserializationContext}, this, f49524a, false, 47597, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, JsonStubWillConvertToString.class)) {
                return (JsonStubWillConvertToString) PatchProxy.accessDispatch(new Object[]{jsonElement, type, jsonDeserializationContext}, this, f49524a, false, 47597, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, JsonStubWillConvertToString.class);
            }
            try {
                jsonStubWillConvertToString = new JsonStubWillConvertToString.Builder().jsonobj_convert_string(jsonElement.toString()).build();
            } catch (Exception e2) {
                SettingsUtil.a(e2);
                jsonStubWillConvertToString = null;
            }
            return jsonStubWillConvertToString;
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49525a;

        a() {
        }

        /* access modifiers changed from: package-private */
        public final IESSettings a(List<AbstractSettingsGroup> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f49525a, false, 47594, new Class[]{List.class}, IESSettings.class)) {
                return (IESSettings) PatchProxy.accessDispatch(new Object[]{list}, this, f49525a, false, 47594, new Class[]{List.class}, IESSettings.class);
            }
            DefaultValueBuilder defaultValueBuilder = new DefaultValueBuilder(new IESSettings.Builder());
            for (AbstractSettingsGroup addDefaultSettingGroup : list) {
                defaultValueBuilder.addDefaultSettingGroup(addDefaultSettingGroup);
            }
            return (IESSettings) defaultValueBuilder.build();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49526a;

        /* renamed from: b  reason: collision with root package name */
        public Gson f49527b;

        b(IESSettings iESSettings, List<AbstractSettingsGroup> list) {
            WireTypeAdapterFactory wireTypeAdapterFactory = new WireTypeAdapterFactory();
            WireDeserializeErrorListener wireDeserializeErrorListener = SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0.$instance;
            wireTypeAdapterFactory.registerDefaultValue(iESSettings, wireDeserializeErrorListener);
            for (AbstractSettingsGroup registerOptionalObjectDefaultValue : list) {
                registerOptionalObjectDefaultValue.registerOptionalObjectDefaultValue(wireTypeAdapterFactory, wireDeserializeErrorListener);
            }
            if (PatchProxy.isSupport(new Object[]{wireTypeAdapterFactory}, this, f49526a, false, 47599, new Class[]{WireTypeAdapterFactory.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{wireTypeAdapterFactory}, this, f49526a, false, 47599, new Class[]{WireTypeAdapterFactory.class}, Void.TYPE);
                return;
            }
            this.f49527b = JSON.createAdapterGsonBuilder().registerTypeAdapterFactory(wireTypeAdapterFactory).registerTypeAdapter(JsonStubWillConvertToString.class, new JsonObjectDeserializer()).create();
        }
    }

    public static void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, null, f49523a, true, 47587, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, null, f49523a, true, 47587, new Class[]{Throwable.class}, Void.TYPE);
        } else if (th != null && th.getMessage() != null) {
        }
    }

    private static String b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, null, f49523a, true, 47591, new Class[]{Throwable.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{th2}, null, f49523a, true, 47591, new Class[]{Throwable.class}, String.class);
        } else if (th2 == null) {
            return "";
        } else {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                com.google.a.a.a.a.a.a.a(th2, printWriter);
                return stringWriter.toString();
            } finally {
                printWriter.close();
            }
        }
    }

    static final /* synthetic */ String a(String str, Throwable th, String str2) throws Exception {
        String b2 = e.b(str);
        if (b2 == null) {
            b2 = "";
        }
        if (th != null) {
            a(str2, str2, th, b2, 1);
        } else {
            a(str2, str2, null, b2, 0);
        }
        return null;
    }

    public static void a(Throwable th, String str, String str2) {
        Throwable th2 = th;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{th2, str3, str4}, null, f49523a, true, 47589, new Class[]{Throwable.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2, str3, str4}, null, f49523a, true, 47589, new Class[]{Throwable.class, String.class, String.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new i<TResult>(str4, th2, str3));
    }

    static final /* synthetic */ String a(String str, Throwable th, String str2, IESSettings iESSettings) throws Exception {
        String b2 = e.b(str);
        if (b2 == null) {
            b2 = "";
        }
        if (th != null) {
            a(str2, str2, th, b2, 1);
        }
        if (iESSettings != null) {
            a(str2, str2, null, b2, 0);
        }
        return null;
    }

    public static void a(String str, String str2, Throwable th, String str3, int i) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, th, str6, Integer.valueOf(i)}, null, f49523a, true, 47590, new Class[]{String.class, String.class, Throwable.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str4, str5, th, str6, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f49523a, true, 47590, new Class[]{String.class, String.class, Throwable.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("classDesc", str4);
            jSONObject.put("errorField", str5);
            jSONObject.put("errorDesc", b(th));
            jSONObject.put("jsonDesc", str6);
            jSONObject.put("status", i);
            n.a("aweme_settings_error_log", jSONObject);
        } catch (Exception unused) {
            a(th);
        }
    }
}
