package com.taobao.tlog.adapter;

import android.content.Context;
import com.taobao.tao.log.upload.FileUploadListener;
import com.taobao.tao.log.upload.LogFileUploadManager;
import java.util.HashMap;
import java.util.Map;

public class TLogFileUploader {
    private static boolean isValid;

    @Deprecated
    public static void uploadLogFile(Context context, Map<String, Object> map) {
    }

    static {
        try {
            Class.forName("com.taobao.tao.log.TLog");
            isValid = true;
        } catch (ClassNotFoundException unused) {
            isValid = false;
        }
    }

    public static void uploadLogFile(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        uploadLogFile(context, (Map<String, Object>) hashMap);
    }

    @Deprecated
    public static void uploadLogFile(Context context, Map<String, Object> map, String str) {
        if (isValid) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                Object obj = map.get("type");
                if (!(obj instanceof String) || !"exception".equalsIgnoreCase((String) obj)) {
                    for (Map.Entry next : map.entrySet()) {
                        String str2 = (String) next.getKey();
                        if (next.getValue() instanceof String) {
                            hashMap.put(str2, (String) next.getValue());
                        }
                    }
                } else {
                    return;
                }
            }
            new LogFileUploadManager(context).uploadWithFilePrefix("FEEDBACK", "taobao4android_feedback_21646297", hashMap, new FileUploadListener() {
                public final void onError(String str, String str2, String str3) {
                }

                public final void onSucessed(String str, String str2) {
                }
            });
        }
    }

    public static void uploadLogFile(Context context, String str, String str2, Map<String, String> map) {
        new LogFileUploadManager(context).uploadWithFilePrefix(str, str2, map, new FileUploadListener() {
            public final void onError(String str, String str2, String str3) {
            }

            public final void onSucessed(String str, String str2) {
            }
        });
    }

    public void uploadWithFilePath(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        new LogFileUploadManager(context).uploadWithFilePath(str, str2, str3, str4, map, new FileUploadListener() {
            public void onError(String str, String str2, String str3) {
            }

            public void onSucessed(String str, String str2) {
            }
        });
    }
}
