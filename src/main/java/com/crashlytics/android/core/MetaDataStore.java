package com.crashlytics.android.core;

import io.fabric.sdk.android.services.b.i;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class MetaDataStore {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File filesDir;

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    private static String keysDataToJson(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    private static String userDataToJson(final UserMetaData userMetaData) throws JSONException {
        return new JSONObject() {
            {
                put("userId", userMetaData.id);
                put("userName", userMetaData.name);
                put("userEmail", userMetaData.email);
            }
        }.toString();
    }

    private static UserMetaData jsonToUserData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new UserMetaData(valueOrNull(jSONObject, "userId"), valueOrNull(jSONObject, "userName"), valueOrNull(jSONObject, "userEmail"));
    }

    public File getKeysFileForSession(String str) {
        File file = this.filesDir;
        return new File(file, str + "keys.meta");
    }

    public File getUserDataFileForSession(String str) {
        File file = this.filesDir;
        return new File(file, str + "user.meta");
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    public Map<String, String> readKeyData(String str) {
        File keysFileForSession = getKeysFileForSession(str);
        if (!keysFileForSession.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(keysFileForSession);
            try {
                Map<String, String> jsonToKeysData = jsonToKeysData(i.a((InputStream) fileInputStream2));
                i.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
                return jsonToKeysData;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
                return Collections.emptyMap();
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
            i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    public UserMetaData readUserData(String str) {
        File userDataFileForSession = getUserDataFileForSession(str);
        if (!userDataFileForSession.exists()) {
            return UserMetaData.EMPTY;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(userDataFileForSession);
            try {
                UserMetaData jsonToUserData = jsonToUserData(i.a((InputStream) fileInputStream2));
                i.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
                return jsonToUserData;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
                return UserMetaData.EMPTY;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
            i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return UserMetaData.EMPTY;
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    public void writeKeyData(String str, Map<String, String> map) {
        File keysFileForSession = getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String keysDataToJson = keysDataToJson(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(keysFileForSession), UTF_8));
            try {
                bufferedWriter2.write(keysDataToJson);
                bufferedWriter2.flush();
                i.a((Closeable) bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception unused) {
                bufferedWriter = bufferedWriter2;
                i.a((Closeable) bufferedWriter, "Failed to close key/value metadata file.");
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                i.a((Closeable) bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
            i.a((Closeable) bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) bufferedWriter, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void writeUserData(String str, UserMetaData userMetaData) {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String userDataToJson = userDataToJson(userMetaData);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            try {
                bufferedWriter2.write(userDataToJson);
                bufferedWriter2.flush();
                i.a((Closeable) bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception unused) {
                bufferedWriter = bufferedWriter2;
                i.a((Closeable) bufferedWriter, "Failed to close user metadata file.");
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                i.a((Closeable) bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
            i.a((Closeable) bufferedWriter, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) bufferedWriter, "Failed to close user metadata file.");
            throw th;
        }
    }
}
