package com.bytedance.crash.i;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.io.IOUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.delete()) {
            return false;
        }
        return true;
    }

    public static boolean a(@NonNull File file, boolean z) {
        boolean z2;
        if (file.isFile()) {
            return a(file);
        }
        boolean z3 = true;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int i = 0;
            boolean z4 = true;
            while (listFiles != null && i < listFiles.length) {
                if (listFiles[i].isFile()) {
                    z2 = a(listFiles[i]);
                } else {
                    z2 = a(listFiles[i], true);
                }
                z4 &= z2;
                i++;
            }
            z3 = z4 & a(file);
        }
        return z3;
    }

    public static String b(String str) throws IOException {
        return a(str, (String) null);
    }

    public static boolean a(File file) {
        if (!file.exists() || !file.delete()) {
            return false;
        }
        return true;
    }

    @Nullable
    public static Map<String, String> b(File file) {
        FileInputStream fileInputStream;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                Set<String> stringPropertyNames = properties.stringPropertyNames();
                HashMap hashMap = new HashMap();
                for (String next : stringPropertyNames) {
                    hashMap.put(next, properties.getProperty(next));
                }
                f.a((Closeable) fileInputStream);
                return hashMap;
            } catch (IOException unused) {
                f.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                f.a((Closeable) fileInputStream);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
            f.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            f.a((Closeable) fileInputStream);
            throw th;
        }
    }

    public static com.bytedance.crash.e.d c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(b(str));
            com.bytedance.crash.e.d dVar = new com.bytedance.crash.e.d();
            dVar.f19423a = jSONObject.optString(PushConstants.WEB_URL);
            dVar.f19424b = jSONObject.optJSONObject("body");
            dVar.f19425c = jSONObject.optString("dump_file");
            dVar.f19426d = jSONObject.optBoolean("encrypt", false);
            return dVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static String[] e(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            try {
                String readLine = bufferedReader.readLine();
                int indexOf = readLine.indexOf(")");
                if (indexOf > 0) {
                    readLine = readLine.substring(indexOf + 2);
                }
                String[] split = readLine.split(" ");
                f.a((Closeable) bufferedReader);
                return split;
            } catch (Exception unused) {
                f.a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                f.a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
            f.a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            f.a((Closeable) bufferedReader2);
            throw th;
        }
    }

    public static com.bytedance.crash.e.d d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(b(str));
            com.bytedance.crash.e.d dVar = new com.bytedance.crash.e.d();
            dVar.f19428f = jSONObject.optString("aid");
            dVar.f19427e = jSONObject.optString("did");
            dVar.g = jSONObject.optString("processName");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                dVar.h = arrayList;
            }
            return dVar;
        } catch (IOException | JSONException unused) {
            return null;
        }
    }

    public static JSONArray b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null) {
            for (String put : str.split(str2)) {
                jSONArray.put(put);
            }
        }
        return jSONArray;
    }

    public static String a(String str, String str2) throws IOException {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        if (str2 != null) {
                            sb.append(str2);
                        }
                    } else {
                        f.a((Closeable) bufferedReader2);
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    f.a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            f.a((Closeable) bufferedReader);
            throw th;
        }
    }

    public static ArrayList<HashMap<String, String>> a(File file, String str, String str2) {
        BufferedReader bufferedReader;
        ArrayList<HashMap<String, String>> arrayList = null;
        if (file == null || !file.exists() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!readLine.equals("\n")) {
                        String[] split = readLine.split(str);
                        if (split != null) {
                            HashMap hashMap = new HashMap();
                            for (String split2 : split) {
                                String[] split3 = split2.split(str2);
                                if (split3 != null && split3.length == 2) {
                                    hashMap.put(split3[0], split3[1]);
                                }
                            }
                            if (hashMap.size() > 0) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                }
                                arrayList.add(hashMap);
                            }
                        }
                    }
                } catch (FileNotFoundException | IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    IOUtils.close((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (FileNotFoundException | IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            IOUtils.close((Closeable) bufferedReader);
            throw th;
        }
        IOUtils.close((Closeable) bufferedReader);
        return arrayList;
    }

    public static void a(Context context, String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(" ");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(" ");
            if (str2 == null) {
                str2 = "null";
            }
            sb.append(str2);
            sb.append("\n");
            a(h.d(context), sb.toString(), true);
        } catch (IOException unused) {
        }
    }

    public static void a(@NonNull File file, @NonNull String str, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str)) {
            file.getParentFile().mkdirs();
            try {
                fileOutputStream = new FileOutputStream(file, z);
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.flush();
                    f.a((Closeable) fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    f.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                f.a((Closeable) fileOutputStream);
                throw th;
            }
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return a(file, str, str2, jSONObject, (String) null, z);
    }

    public static String a(File file, String str, String str2, String str3, String str4, List<String> list) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", str3);
            jSONObject.put("did", str2);
            jSONObject.put("processName", str4);
            jSONObject.put("alogFiles", new JSONArray(list));
            a(file2, jSONObject.toString(), false);
        } catch (IOException | JSONException unused) {
        }
        return file2.getAbsolutePath();
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(PushConstants.WEB_URL, str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z);
            a(file2, jSONObject2.toString(), false);
        } catch (IOException | JSONException unused) {
        }
        return file2.getAbsolutePath();
    }
}
