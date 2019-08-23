package com.ss.android.ugc.aweme.commerce;

import com.google.common.collect.az;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

@JsonAdapter(JsonTypeAdapter.class)
public class CommerceInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("challenge_list")
    public String challengeList;
    @SerializedName("head_image_url")
    public UrlModel headImageUrl;
    @SerializedName("offline_info_list")
    public List<d> offlineInfoList;
    @SerializedName("quick_shop_name")
    public String quickShopName;
    @SerializedName("quick_shop_url")
    public String quickShopUrl;
    @SerializedName("site_id")
    public String siteId;
    @SerializedName("smart_phone")
    public e smartPhone;

    static final class JsonTypeAdapter implements JsonDeserializer<CommerceInfo>, JsonSerializer<CommerceInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36659a;

        JsonTypeAdapter() {
        }

        public final /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonDeserializationContext jsonDeserializationContext2 = jsonDeserializationContext;
            if (PatchProxy.isSupport(new Object[]{jsonElement, type, jsonDeserializationContext2}, this, f36659a, false, 27888, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, CommerceInfo.class)) {
                return (CommerceInfo) PatchProxy.accessDispatch(new Object[]{jsonElement, type, jsonDeserializationContext2}, this, f36659a, false, 27888, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, CommerceInfo.class);
            }
            CommerceInfo commerceInfo = new CommerceInfo();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("head_image_url");
            if (asJsonObject2 != null) {
                commerceInfo.headImageUrl = (UrlModel) jsonDeserializationContext2.deserialize(asJsonObject2, UrlModel.class);
            }
            JsonArray asJsonArray = asJsonObject.getAsJsonArray("offline_info_list");
            if (asJsonArray != null) {
                commerceInfo.offlineInfoList = az.a((E[]) (Object[]) jsonDeserializationContext2.deserialize(asJsonArray, d[].class));
            }
            JsonElement jsonElement2 = asJsonObject.get("challenge_list");
            if (jsonElement2 != null) {
                commerceInfo.challengeList = jsonElement2.toString();
            }
            JsonElement jsonElement3 = asJsonObject.get("quick_shop_url");
            if (jsonElement3 != null) {
                commerceInfo.quickShopUrl = jsonElement3.getAsString();
            }
            JsonElement jsonElement4 = asJsonObject.get("quick_shop_name");
            if (jsonElement4 != null) {
                commerceInfo.quickShopName = jsonElement4.getAsString();
            }
            JsonElement jsonElement5 = asJsonObject.get("site_id");
            if (jsonElement5 != null) {
                commerceInfo.siteId = jsonElement5.getAsString();
            }
            JsonObject asJsonObject3 = asJsonObject.getAsJsonObject("smart_phone");
            if (asJsonObject3 != null) {
                commerceInfo.smartPhone = (e) jsonDeserializationContext2.deserialize(asJsonObject3, e.class);
            }
            return commerceInfo;
        }

        public final /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonSerializationContext jsonSerializationContext2 = jsonSerializationContext;
            CommerceInfo commerceInfo = (CommerceInfo) obj;
            if (PatchProxy.isSupport(new Object[]{commerceInfo, type, jsonSerializationContext2}, this, f36659a, false, 27889, new Class[]{CommerceInfo.class, Type.class, JsonSerializationContext.class}, JsonElement.class)) {
                return (JsonElement) PatchProxy.accessDispatch(new Object[]{commerceInfo, type, jsonSerializationContext2}, this, f36659a, false, 27889, new Class[]{CommerceInfo.class, Type.class, JsonSerializationContext.class}, JsonElement.class);
            }
            JsonObject jsonObject = new JsonObject();
            if (commerceInfo.headImageUrl != null) {
                jsonObject.add("head_image_url", jsonSerializationContext2.serialize(commerceInfo.headImageUrl));
            }
            if (commerceInfo.offlineInfoList != null) {
                jsonObject.add("offline_info_list", jsonSerializationContext2.serialize(commerceInfo.offlineInfoList));
            }
            if (commerceInfo.challengeList != null) {
                jsonObject.add("challenge_list", commerceInfo.getChallengeList());
            }
            if (commerceInfo.quickShopUrl != null) {
                jsonObject.add("quick_shop_url", jsonSerializationContext2.serialize(commerceInfo.getQuickShopUrl()));
            }
            if (commerceInfo.quickShopName != null) {
                jsonObject.add("quick_shop_name", jsonSerializationContext2.serialize(commerceInfo.getQuickShopName()));
            }
            if (commerceInfo.siteId != null) {
                jsonObject.add("site_id", jsonSerializationContext2.serialize(commerceInfo.getSiteId()));
            }
            if (commerceInfo.smartPhone != null) {
                jsonObject.add("smart_phone", jsonSerializationContext2.serialize(commerceInfo.getSmartPhone()));
            }
            return jsonObject;
        }
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public List<d> getOfflineInfoList() {
        return this.offlineInfoList;
    }

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public e getSmartPhone() {
        return this.smartPhone;
    }

    public JsonArray getChallengeList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27886, new Class[0], JsonArray.class)) {
            return (JsonArray) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27886, new Class[0], JsonArray.class);
        }
        if (this.challengeList != null) {
            try {
                return new JsonParser().parse(this.challengeList).getAsJsonArray();
            } catch (JsonSyntaxException unused) {
            }
        }
        return null;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setOfflineInfoList(List<d> list) {
        this.offlineInfoList = list;
    }

    public void setSmartPhone(e eVar) {
        this.smartPhone = eVar;
    }

    public void setChallengeList(JsonArray jsonArray) {
        if (PatchProxy.isSupport(new Object[]{jsonArray}, this, changeQuickRedirect, false, 27887, new Class[]{JsonArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jsonArray}, this, changeQuickRedirect, false, 27887, new Class[]{JsonArray.class}, Void.TYPE);
        } else if (jsonArray != null) {
            this.challengeList = jsonArray.toString();
        } else {
            this.challengeList = null;
        }
    }
}
