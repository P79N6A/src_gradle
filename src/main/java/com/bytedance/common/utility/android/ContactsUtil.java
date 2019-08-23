package com.bytedance.common.utility.android;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringEncryptUtils;
import com.bytedance.common.utility.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactsUtil {
    private static final Pattern sTrimPattern = Pattern.compile("[^+0-9]");

    public static class PhoneContacts {
        public String contactId;
        public String contactName;
        public List<String> phoneNumbers = new ArrayList();

        public PhoneContacts() {
        }

        public JSONObject toJson() {
            if (StringUtils.isEmpty(this.contactName) || Lists.isEmpty(this.phoneNumbers) || StringUtils.isEmpty(this.contactId)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("contact_name", this.contactName);
                jSONObject.put("contact_id", this.contactId);
                JSONArray jSONArray = new JSONArray();
                for (String put : this.phoneNumbers) {
                    jSONArray.put(put);
                }
                jSONObject.put("contact_number", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public JSONObject toNumberJsonWithEncrypt() {
            if (StringUtils.isEmpty(this.contactName) || this.phoneNumbers.isEmpty() || this.phoneNumbers.size() == 0 || StringUtils.isEmpty(this.contactId)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                for (String encryptBySHA256 : this.phoneNumbers) {
                    String encryptBySHA2562 = StringEncryptUtils.encryptBySHA256(encryptBySHA256);
                    if (!StringUtils.isEmpty(encryptBySHA2562)) {
                        jSONArray.put(encryptBySHA2562);
                    }
                }
                jSONObject.put("mobiles", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public PhoneContacts(String str, String str2) {
            this.contactId = str;
            this.contactName = str2;
        }
    }

    public static String getHashedLocalMobile(TelephonyManager telephonyManager) {
        String line1Number = telephonyManager.getLine1Number();
        if (TextUtils.isEmpty(line1Number)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(Pattern.compile("^(\\+86)?(1\\d{10})$"), "$2"));
        if (!TextUtils.isEmpty(filterPhoneNumber(line1Number, arrayList))) {
            return StringEncryptUtils.encryptBySHA256(line1Number);
        }
        return "";
    }

    public static String getLocalMobile(TelephonyManager telephonyManager) {
        String line1Number = telephonyManager.getLine1Number();
        if (TextUtils.isEmpty(line1Number)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(Pattern.compile("^(\\+86)?(1\\d{10})$"), "$2"));
        return filterPhoneNumber(line1Number, arrayList);
    }

    private static String filterPhoneNumber(String str, List<Pair<Pattern, String>> list) {
        if (list == null || list.size() == 0 || StringUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = sTrimPattern.matcher(str).replaceAll("");
        for (Pair next : list) {
            Matcher matcher = ((Pattern) next.first).matcher(replaceAll);
            if (matcher.matches()) {
                return matcher.replaceAll((String) next.second);
            }
        }
        return null;
    }
}
