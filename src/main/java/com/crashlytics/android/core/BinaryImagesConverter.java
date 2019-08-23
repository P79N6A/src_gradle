package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BinaryImagesConverter {
    private final Context context;
    private final FileIdStrategy fileIdStrategy;

    interface FileIdStrategy {
        String createId(File file) throws IOException;
    }

    private File getLibraryFile(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return correctDataPath(file);
        }
        return file;
    }

    /* access modifiers changed from: package-private */
    public byte[] convert(BufferedReader bufferedReader) throws IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(bufferedReader));
    }

    private static byte[] generateBinaryImagesJsonString(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException unused) {
            return new byte[0];
        }
    }

    private static boolean isRelevant(ProcMapEntry procMapEntry) {
        if (procMapEntry.perms.indexOf(120) == -1 || procMapEntry.path.indexOf(47) == -1) {
            return false;
        }
        return true;
    }

    private static String joinMapsEntries(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    private JSONArray parseProcMapsJsonFromStream(BufferedReader bufferedReader) throws IOException {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject jsonFromMapEntryString = jsonFromMapEntryString(readLine);
            if (jsonFromMapEntryString != null) {
                jSONArray.put(jsonFromMapEntryString);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] convert(String str) throws IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromString(str));
    }

    private File correctDataPath(File file) {
        if (Build.VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith("/data")) {
            try {
                file = new File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return file;
    }

    private JSONObject jsonFromMapEntryString(String str) {
        ProcMapEntry parse = ProcMapEntryParser.parse(str);
        if (parse == null || !isRelevant(parse)) {
            return null;
        }
        try {
            try {
                return createBinaryImageJson(this.fileIdStrategy.createId(getLibraryFile(parse.path)), parse);
            } catch (JSONException unused) {
                return null;
            }
        } catch (IOException unused2) {
            new StringBuilder("Could not generate ID for file ").append(parse.path);
            return null;
        }
    }

    private JSONArray parseProcMapsJsonFromString(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = joinMapsEntries(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String jsonFromMapEntryString : split) {
                JSONObject jsonFromMapEntryString2 = jsonFromMapEntryString(jsonFromMapEntryString);
                if (jsonFromMapEntryString2 != null) {
                    jSONArray.put(jsonFromMapEntryString2);
                }
            }
            return jSONArray;
        } catch (JSONException unused) {
            return jSONArray;
        }
    }

    BinaryImagesConverter(Context context2, FileIdStrategy fileIdStrategy2) {
        this.context = context2;
        this.fileIdStrategy = fileIdStrategy2;
    }

    private static JSONObject createBinaryImageJson(String str, ProcMapEntry procMapEntry) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", procMapEntry.address);
        jSONObject.put("size", procMapEntry.size);
        jSONObject.put("name", procMapEntry.path);
        jSONObject.put("uuid", str);
        return jSONObject;
    }
}
