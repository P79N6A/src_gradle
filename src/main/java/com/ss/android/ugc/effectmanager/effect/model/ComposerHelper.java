package com.ss.android.ugc.effectmanager.effect.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.effectmanager.common.f.d;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class ComposerHelper {
    private static List<String> serverURLs;

    @NonNull
    public static List<String> getServerUrls() {
        return serverURLs;
    }

    static {
        ArrayList arrayList = new ArrayList();
        serverURLs = arrayList;
        arrayList.add("https://sf1-hscdn-tos.pstatp.com/obj/ies.fe.effect/");
        serverURLs.add("https://sf3-hscdn-tos.pstatp.com/obj/ies.fe.effect/");
        serverURLs.add("https://sf6-hscdn-tos.pstatp.com/obj/ies.fe.effect/");
    }

    public static void setServerUrls(@NonNull List<String> list) {
        serverURLs = list;
    }

    public static int versionCompare(@NonNull String str, @NonNull String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        if (i >= split.length || i >= split2.length) {
            return Integer.signum(split.length - split2.length);
        }
        return Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
    }

    @Nullable
    public static ComposerNode parseComposerMaterial(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        try {
            JSONArray jSONArray = new JSONObject(d.c(str + File.separator + "config.json")).getJSONObject("effect").getJSONArray("Link");
            if (jSONArray.length() <= 0) {
                return null;
            }
            String string = jSONArray.getJSONObject(0).getString("path");
            if (!jSONArray.getJSONObject(0).getString("type").toLowerCase().equals("composer")) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(d.c(str + File.separator + string + "content.json"));
            ComposerNode composerNode = new ComposerNode();
            composerNode.tag_name = "root";
            composerNode.UI_name = "Composer";
            composerNode.type = 4;
            JSONObject jSONObject2 = jSONObject.getJSONObject(PushConstants.CONTENT);
            composerNode.children = new ArrayList();
            JSONArray jSONArray2 = jSONObject2.getJSONArray("nodes");
            for (int i = 0; i < jSONArray2.length(); i++) {
                ComposerNode parseComposerNode = parseComposerNode(jSONArray2.getJSONObject(i), str2, str3);
                if (parseComposerNode != null) {
                    parseComposerNode.parent = composerNode;
                }
                composerNode.children.add(parseComposerNode);
            }
            return composerNode;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static ComposerNode parseComposerNode(@NonNull JSONObject jSONObject, @NonNull String str, String str2) {
        try {
            ComposerNode composerNode = new ComposerNode();
            composerNode.type = jSONObject.getInt("type");
            composerNode.file = jSONObject.optString("file", "");
            composerNode.icon = "https://sf1-hscdn-tos.pstatp.com/obj/ies.fe.effect/" + jSONObject.optString("icon", null);
            composerNode.UI_name = jSONObject.optString("UI_name", null);
            composerNode.tag_name = jSONObject.getString("tag_name");
            composerNode.default_value = (float) jSONObject.optDouble("default_value", 0.0d);
            composerNode.min_value = (float) jSONObject.optDouble("min_value", 0.0d);
            composerNode.max_value = (float) jSONObject.optDouble("max_value", 0.0d);
            composerNode.switch_mode = jSONObject.optInt("switch_mode", 0);
            if (jSONObject.has("nodes")) {
                composerNode.children = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("nodes");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ComposerNode parseComposerNode = parseComposerNode(jSONArray.getJSONObject(i), str, str2);
                    if (parseComposerNode != null) {
                        parseComposerNode.parent = composerNode;
                        composerNode.children.add(parseComposerNode);
                    }
                }
                if (composerNode.children.size() == 0 || (composerNode.children.size() == 1 && composerNode.children.get(0).type == -1)) {
                    return null;
                }
            } else {
                List<String> serverUrls = getServerUrls();
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = serverUrls.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next() + composerNode.file);
                }
                UrlModel urlModel = new UrlModel();
                urlModel.url_list = arrayList;
                urlModel.uri = composerNode.file;
                Effect effect = new Effect();
                effect.file_url = urlModel;
                effect.id = composerNode.file;
                effect.effect_id = composerNode.file;
                effect.zipPath = str2 + File.separator + effect.id + ".zip";
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(File.separator);
                sb.append(effect.id);
                effect.unzipPath = sb.toString();
                composerNode.effect = effect;
                JSONObject optJSONObject = jSONObject.optJSONObject("extra_info");
                String str3 = PushConstants.PUSH_TYPE_NOTIFY;
                if (optJSONObject != null) {
                    str3 = optJSONObject.optString("version", PushConstants.PUSH_TYPE_NOTIFY);
                }
                if (versionCompare(str, str3) < 0) {
                    return null;
                }
            }
            return composerNode;
        } catch (Exception unused) {
            return null;
        }
    }
}
