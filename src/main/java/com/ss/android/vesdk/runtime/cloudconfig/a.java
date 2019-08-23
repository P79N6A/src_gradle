package com.ss.android.vesdk.runtime.cloudconfig;

import android.support.annotation.NonNull;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements c {
    public final Map<String, String> a(@NonNull JSONObject jSONObject) {
        try {
            if (jSONObject.getInt("code") != 0) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            HashMap hashMap = new HashMap();
            if (jSONObject2.has("record_camera_type")) {
                int i = jSONObject2.getInt("record_camera_type");
                if (i > 0) {
                    hashMap.put("record_camera_type", String.valueOf(i));
                } else {
                    hashMap.put("record_camera_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
            } else {
                hashMap.put("record_camera_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (jSONObject2.has("record_camera_compat_level")) {
                int i2 = jSONObject2.getInt("record_camera_compat_level");
                if (i2 >= 0) {
                    hashMap.put("record_camera_compat_level", String.valueOf(i2));
                } else {
                    hashMap.put("record_camera_compat_level", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
            } else {
                hashMap.put("record_camera_compat_level", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (jSONObject2.has("record_video_sw_crf")) {
                int i3 = jSONObject2.getInt("record_video_sw_crf");
                if (i3 <= 0 || i3 > 50) {
                    hashMap.put("record_video_sw_crf", "15");
                } else {
                    hashMap.put("record_video_sw_crf", String.valueOf(i3));
                }
            } else {
                hashMap.put("record_video_sw_crf", "15");
            }
            if (jSONObject2.has("record_video_sw_maxrate")) {
                int i4 = jSONObject2.getInt("record_video_sw_maxrate");
                if (i4 < 100000 || i4 > 100000000) {
                    hashMap.put("record_video_sw_maxrate", "15000000");
                } else {
                    hashMap.put("record_video_sw_maxrate", String.valueOf(i4));
                }
            } else {
                hashMap.put("record_video_sw_maxrate", "15000000");
            }
            if (jSONObject2.has("record_video_sw_preset")) {
                int i5 = jSONObject2.getInt("record_video_sw_preset");
                if (i5 < 0 || i5 > 9) {
                    hashMap.put("record_video_sw_preset", PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    hashMap.put("record_video_sw_preset", String.valueOf(i5));
                }
            } else {
                hashMap.put("record_video_sw_preset", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("record_video_sw_gop")) {
                int i6 = jSONObject2.getInt("record_video_sw_gop");
                if (i6 > 0) {
                    hashMap.put("record_video_sw_gop", String.valueOf(i6));
                } else {
                    hashMap.put("record_video_sw_gop", "35");
                }
            } else {
                hashMap.put("record_video_sw_gop", "35");
            }
            if (jSONObject2.has("record_video_sw_qp")) {
                int i7 = jSONObject2.getInt("record_video_sw_qp");
                if (i7 <= 0 || i7 > 50) {
                    hashMap.put("record_video_sw_qp", "15");
                } else {
                    hashMap.put("record_video_sw_qp", String.valueOf(i7));
                }
            } else {
                hashMap.put("record_video_sw_qp", "15");
            }
            if (jSONObject2.has("record_sw_bitrate_mode")) {
                int i8 = jSONObject2.getInt("record_sw_bitrate_mode");
                if (i8 < 0 || i8 > 2) {
                    hashMap.put("record_sw_bitrate_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                } else {
                    hashMap.put("record_sw_bitrate_mode", String.valueOf(i8));
                }
            } else {
                hashMap.put("record_sw_bitrate_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (jSONObject2.has("record_video_hw_bitrate")) {
                int i9 = jSONObject2.getInt("record_video_hw_bitrate");
                if (i9 > 0) {
                    hashMap.put("record_video_hw_bitrate", String.valueOf(i9));
                } else {
                    hashMap.put("record_video_hw_bitrate", "4194304");
                }
            } else {
                hashMap.put("record_video_hw_bitrate", "4194304");
            }
            if (jSONObject2.has("record_encode_mode")) {
                int i10 = jSONObject2.getInt("record_encode_mode");
                if (i10 != 0) {
                    if (i10 != 1) {
                        hashMap.put("record_encode_mode", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                }
                hashMap.put("record_encode_mode", String.valueOf(i10));
            } else {
                hashMap.put("record_encode_mode", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("record_hw_bitrate_mode")) {
                int i11 = jSONObject2.getInt("record_hw_bitrate_mode");
                if (i11 >= 0) {
                    hashMap.put("record_hw_bitrate_mode", String.valueOf(i11));
                } else {
                    hashMap.put("record_hw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
                }
            } else {
                hashMap.put("record_hw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("record_hw_profile")) {
                int i12 = jSONObject2.getInt("record_hw_profile");
                if (i12 >= 0) {
                    hashMap.put("record_hw_profile", String.valueOf(i12));
                } else {
                    hashMap.put("record_hw_profile", PushConstants.PUSH_TYPE_NOTIFY);
                }
            } else {
                hashMap.put("record_hw_profile", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("record_resolution_width")) {
                int i13 = jSONObject2.getInt("record_resolution_width");
                if (i13 % 16 != 0 || i13 < 160 || i13 > 5120) {
                    hashMap.put("record_resolution_width", "576");
                } else {
                    hashMap.put("record_resolution_width", String.valueOf(i13));
                }
            } else {
                hashMap.put("record_resolution_width", "576");
            }
            if (jSONObject2.has("record_resolution_height")) {
                int i14 = jSONObject2.getInt("record_resolution_height");
                if (i14 % 16 != 0 || i14 < 160 || i14 > 5120) {
                    hashMap.put("record_resolution_height", "1024");
                } else {
                    hashMap.put("record_resolution_height", String.valueOf(i14));
                }
            } else {
                hashMap.put("record_resolution_height", "1024");
            }
            if (jSONObject2.has("import_video_sw_crf")) {
                int i15 = jSONObject2.getInt("import_video_sw_crf");
                if (i15 <= 0 || i15 > 50) {
                    hashMap.put("import_video_sw_crf", "15");
                } else {
                    hashMap.put("import_video_sw_crf", String.valueOf(i15));
                }
            } else {
                hashMap.put("import_video_sw_crf", "15");
            }
            if (jSONObject2.has("import_video_sw_maxrate")) {
                int i16 = jSONObject2.getInt("import_video_sw_maxrate");
                if (i16 < 100000 || i16 > 100000000) {
                    hashMap.put("import_video_sw_maxrate", "15000000");
                } else {
                    hashMap.put("import_video_sw_maxrate", String.valueOf(i16));
                }
            } else {
                hashMap.put("import_video_sw_maxrate", "15000000");
            }
            if (jSONObject2.has("import_video_sw_preset")) {
                int i17 = jSONObject2.getInt("import_video_sw_preset");
                if (i17 < 0 || i17 > 9) {
                    hashMap.put("import_video_sw_preset", PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    hashMap.put("import_video_sw_preset", String.valueOf(i17));
                }
            } else {
                hashMap.put("import_video_sw_preset", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("import_video_sw_gop")) {
                int i18 = jSONObject2.getInt("import_video_sw_gop");
                if (i18 > 0) {
                    hashMap.put("import_video_sw_gop", String.valueOf(i18));
                } else {
                    hashMap.put("import_video_sw_gop", "35");
                }
            } else {
                hashMap.put("import_video_sw_gop", "35");
            }
            if (jSONObject2.has("import_video_sw_qp")) {
                int i19 = jSONObject2.getInt("import_video_sw_qp");
                if (i19 <= 0 || i19 > 50) {
                    hashMap.put("import_video_sw_qp", "15");
                } else {
                    hashMap.put("import_video_sw_qp", String.valueOf(i19));
                }
            } else {
                hashMap.put("import_video_sw_qp", "15");
            }
            if (jSONObject2.has("import_sw_bitrate_mode")) {
                int i20 = jSONObject2.getInt("import_sw_bitrate_mode");
                if (i20 < 0 || i20 > 2) {
                    hashMap.put("import_sw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    hashMap.put("import_sw_bitrate_mode", String.valueOf(i20));
                }
            } else {
                hashMap.put("import_sw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("import_encode_mode")) {
                int i21 = jSONObject2.getInt("import_encode_mode");
                if (i21 != 0) {
                    if (i21 != 1) {
                        hashMap.put("import_encode_mode", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                }
                hashMap.put("import_encode_mode", String.valueOf(i21));
            } else {
                hashMap.put("import_encode_mode", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("import_video_hw_bitrate")) {
                int i22 = jSONObject2.getInt("import_video_hw_bitrate");
                if (i22 > 0) {
                    hashMap.put("import_video_hw_bitrate", String.valueOf(i22));
                } else {
                    hashMap.put("import_video_hw_bitrate", "4194304");
                }
            } else {
                hashMap.put("import_video_hw_bitrate", "4194304");
            }
            if (jSONObject2.has("import_hw_bitrate_mode")) {
                int i23 = jSONObject2.getInt("import_hw_bitrate_mode");
                if (i23 >= 0) {
                    hashMap.put("import_hw_bitrate_mode", String.valueOf(i23));
                } else {
                    hashMap.put("import_hw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
                }
            } else {
                hashMap.put("import_hw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("import_hw_profile")) {
                int i24 = jSONObject2.getInt("import_hw_profile");
                if (i24 >= 0) {
                    hashMap.put("import_hw_profile", String.valueOf(i24));
                } else {
                    hashMap.put("import_hw_profile", PushConstants.PUSH_TYPE_NOTIFY);
                }
            } else {
                hashMap.put("import_hw_profile", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("import_shorter_pixels")) {
                int i25 = jSONObject2.getInt("import_shorter_pixels");
                if (i25 % 16 != 0 || i25 < 160 || i25 > 5120) {
                    hashMap.put("import_shorter_pixels", "576");
                } else {
                    hashMap.put("import_shorter_pixels", String.valueOf(i25));
                }
            } else {
                hashMap.put("import_shorter_pixels", "576");
            }
            if (jSONObject2.has("synthetic_video_sw_crf")) {
                int i26 = jSONObject2.getInt("synthetic_video_sw_crf");
                if (i26 <= 0 || i26 > 50) {
                    hashMap.put("synthetic_video_sw_crf", "15");
                } else {
                    hashMap.put("synthetic_video_sw_crf", String.valueOf(i26));
                }
            } else {
                hashMap.put("synthetic_video_sw_crf", "15");
            }
            if (jSONObject2.has("synthetic_video_sw_maxrate")) {
                int i27 = jSONObject2.getInt("synthetic_video_sw_maxrate");
                if (i27 < 100000 || i27 > 100000000) {
                    hashMap.put("synthetic_video_sw_maxrate", "15000000");
                } else {
                    hashMap.put("synthetic_video_sw_maxrate", String.valueOf(i27));
                }
            } else {
                hashMap.put("synthetic_video_sw_maxrate", "15000000");
            }
            if (jSONObject2.has("synthetic_video_sw_preset")) {
                int i28 = jSONObject2.getInt("synthetic_video_sw_preset");
                if (i28 < 0 || i28 > 9) {
                    hashMap.put("synthetic_video_sw_preset", PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    hashMap.put("synthetic_video_sw_preset", String.valueOf(i28));
                }
            } else {
                hashMap.put("synthetic_video_sw_preset", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("synthetic_video_sw_gop")) {
                int i29 = jSONObject2.getInt("synthetic_video_sw_gop");
                if (i29 > 0) {
                    hashMap.put("synthetic_video_sw_gop", String.valueOf(i29));
                } else {
                    hashMap.put("synthetic_video_sw_gop", "35");
                }
            } else {
                hashMap.put("synthetic_video_sw_gop", "35");
            }
            if (jSONObject2.has("synthetic_video_sw_qp")) {
                int i30 = jSONObject2.getInt("synthetic_video_sw_qp");
                if (i30 <= 0 || i30 > 50) {
                    hashMap.put("synthetic_video_sw_qp", "15");
                } else {
                    hashMap.put("synthetic_video_sw_qp", String.valueOf(i30));
                }
            } else {
                hashMap.put("synthetic_video_sw_qp", "15");
            }
            if (jSONObject2.has("synthetic_sw_bitrate_mode")) {
                int i31 = jSONObject2.getInt("synthetic_sw_bitrate_mode");
                if (i31 < 0 || i31 > 2) {
                    hashMap.put("synthetic_sw_bitrate_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                } else {
                    hashMap.put("synthetic_sw_bitrate_mode", String.valueOf(i31));
                }
            } else {
                hashMap.put("synthetic_sw_bitrate_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (jSONObject2.has("synthetic_encode_mode")) {
                int i32 = jSONObject2.getInt("synthetic_encode_mode");
                if (i32 != 0) {
                    if (i32 != 1) {
                        hashMap.put("synthetic_encode_mode", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                }
                hashMap.put("synthetic_encode_mode", String.valueOf(i32));
            } else {
                hashMap.put("synthetic_encode_mode", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("synthetic_video_hw_bitrate")) {
                int i33 = jSONObject2.getInt("synthetic_video_hw_bitrate");
                if (i33 >= 0) {
                    hashMap.put("synthetic_video_hw_bitrate", String.valueOf(i33));
                } else {
                    hashMap.put("synthetic_video_hw_bitrate", "4194304");
                }
            } else {
                hashMap.put("synthetic_video_hw_bitrate", "4194304");
            }
            if (jSONObject2.has("synthetic_hw_bitrate_mode")) {
                int i34 = jSONObject2.getInt("synthetic_hw_bitrate_mode");
                if (i34 >= 0) {
                    hashMap.put("synthetic_hw_bitrate_mode", String.valueOf(i34));
                } else {
                    hashMap.put("synthetic_hw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
                }
            } else {
                hashMap.put("synthetic_hw_bitrate_mode", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("synthetic_hw_profile")) {
                int i35 = jSONObject2.getInt("synthetic_hw_profile");
                if (i35 >= 0) {
                    hashMap.put("synthetic_hw_profile", String.valueOf(i35));
                } else {
                    hashMap.put("synthetic_hw_profile", PushConstants.PUSH_TYPE_NOTIFY);
                }
            } else {
                hashMap.put("synthetic_hw_profile", PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (jSONObject2.has("earphone_echo_normal")) {
                int i36 = jSONObject2.getInt("earphone_echo_normal");
                if (i36 != 0) {
                    if (i36 != 1) {
                        hashMap.put("earphone_echo_normal", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    }
                }
                hashMap.put("earphone_echo_normal", String.valueOf(i36));
            } else {
                hashMap.put("earphone_echo_normal", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (jSONObject2.has("earphone_echo_aaudio")) {
                int i37 = jSONObject2.getInt("earphone_echo_aaudio");
                if (i37 != 0) {
                    if (i37 != 1) {
                        hashMap.put("earphone_echo_aaudio", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    }
                }
                hashMap.put("earphone_echo_aaudio", String.valueOf(i37));
            } else {
                hashMap.put("earphone_echo_aaudio", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (jSONObject2.has("earphone_echo_huawei")) {
                int i38 = jSONObject2.getInt("earphone_echo_huawei");
                if (i38 != 0) {
                    if (i38 != 1) {
                        hashMap.put("earphone_echo_huawei", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    }
                }
                hashMap.put("earphone_echo_huawei", String.valueOf(i38));
            } else {
                hashMap.put("earphone_echo_huawei", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(Map<String, String> map, @NonNull e eVar) {
        eVar.f78121a = 1;
        eVar.f78122b = 1;
        eVar.f78123c = 15;
        eVar.f78124d = 15000000;
        eVar.f78125e = 0;
        eVar.f78126f = 35;
        eVar.g = 15;
        eVar.h = 1;
        eVar.i = 4194304;
        eVar.j = 0;
        eVar.k = 0;
        eVar.l = 0;
        eVar.m = 576;
        eVar.n = 1024;
        eVar.o = 15;
        eVar.p = 15000000;
        eVar.q = 0;
        eVar.r = 35;
        eVar.s = 15;
        eVar.t = 0;
        eVar.u = 0;
        eVar.v = 4194304;
        eVar.w = 0;
        eVar.x = 0;
        eVar.y = 576;
        eVar.z = 15;
        eVar.A = 15000000;
        eVar.B = 0;
        eVar.C = 35;
        eVar.D = 15;
        eVar.E = 1;
        eVar.F = 0;
        eVar.G = 4194304;
        eVar.H = 0;
        eVar.I = 0;
        eVar.J = 1;
        eVar.K = 1;
        eVar.L = 1;
        if (map.containsKey("record_camera_type")) {
            eVar.f78121a = Integer.parseInt(map.get("record_camera_type"));
        }
        if (map.containsKey("record_camera_compat_level")) {
            eVar.f78122b = Integer.parseInt(map.get("record_camera_compat_level"));
        }
        if (map.containsKey("record_video_sw_crf")) {
            eVar.f78123c = Integer.parseInt(map.get("record_video_sw_crf"));
        }
        if (map.containsKey("record_video_sw_maxrate")) {
            eVar.f78124d = Integer.parseInt(map.get("record_video_sw_maxrate"));
        }
        if (map.containsKey("record_video_sw_preset")) {
            eVar.f78125e = Integer.parseInt(map.get("record_video_sw_preset"));
        }
        if (map.containsKey("record_video_sw_gop")) {
            eVar.f78126f = Integer.parseInt(map.get("record_video_sw_gop"));
        }
        if (map.containsKey("record_video_sw_qp")) {
            eVar.g = Integer.parseInt(map.get("record_video_sw_qp"));
        }
        if (map.containsKey("record_sw_bitrate_mode")) {
            eVar.h = Integer.parseInt(map.get("record_sw_bitrate_mode"));
        }
        if (map.containsKey("record_video_hw_bitrate")) {
            eVar.i = Integer.parseInt(map.get("record_video_hw_bitrate"));
        }
        if (map.containsKey("record_encode_mode")) {
            eVar.j = Integer.parseInt(map.get("record_encode_mode"));
        }
        if (map.containsKey("record_hw_bitrate_mode")) {
            eVar.k = Integer.parseInt(map.get("record_hw_bitrate_mode"));
        }
        if (map.containsKey("record_hw_profile")) {
            eVar.l = Integer.parseInt(map.get("record_hw_profile"));
        }
        if (map.containsKey("record_resolution_width")) {
            eVar.m = Integer.parseInt(map.get("record_resolution_width"));
        }
        if (map.containsKey("record_resolution_height")) {
            eVar.n = Integer.parseInt(map.get("record_resolution_height"));
        }
        if (map.containsKey("import_video_sw_crf")) {
            eVar.o = Integer.parseInt(map.get("import_video_sw_crf"));
        }
        if (map.containsKey("import_video_sw_maxrate")) {
            eVar.p = Integer.parseInt(map.get("import_video_sw_maxrate"));
        }
        if (map.containsKey("import_video_sw_preset")) {
            eVar.q = Integer.parseInt(map.get("import_video_sw_preset"));
        }
        if (map.containsKey("import_video_sw_gop")) {
            eVar.r = Integer.parseInt(map.get("import_video_sw_gop"));
        }
        if (map.containsKey("import_video_sw_qp")) {
            eVar.s = Integer.parseInt(map.get("import_video_sw_qp"));
        }
        if (map.containsKey("import_sw_bitrate_mode")) {
            eVar.t = Integer.parseInt(map.get("import_sw_bitrate_mode"));
        }
        if (map.containsKey("import_encode_mode")) {
            eVar.u = Integer.parseInt(map.get("import_encode_mode"));
        }
        if (map.containsKey("import_video_hw_bitrate")) {
            eVar.v = Integer.parseInt(map.get("import_video_hw_bitrate"));
        }
        if (map.containsKey("import_hw_bitrate_mode")) {
            eVar.w = Integer.parseInt(map.get("import_hw_bitrate_mode"));
        }
        if (map.containsKey("import_hw_profile")) {
            eVar.x = Integer.parseInt(map.get("import_hw_profile"));
        }
        if (map.containsKey("import_shorter_pixels")) {
            eVar.y = Integer.parseInt(map.get("import_shorter_pixels"));
        }
        if (map.containsKey("synthetic_video_sw_crf")) {
            eVar.z = Integer.parseInt(map.get("synthetic_video_sw_crf"));
        }
        if (map.containsKey("synthetic_video_sw_maxrate")) {
            eVar.A = Integer.parseInt(map.get("synthetic_video_sw_maxrate"));
        }
        if (map.containsKey("synthetic_video_sw_preset")) {
            eVar.B = Integer.parseInt(map.get("synthetic_video_sw_preset"));
        }
        if (map.containsKey("synthetic_video_sw_gop")) {
            eVar.C = Integer.parseInt(map.get("synthetic_video_sw_gop"));
        }
        if (map.containsKey("synthetic_video_sw_qp")) {
            eVar.D = Integer.parseInt(map.get("synthetic_video_sw_qp"));
        }
        if (map.containsKey("synthetic_sw_bitrate_mode")) {
            eVar.E = Integer.parseInt(map.get("synthetic_sw_bitrate_mode"));
        }
        if (map.containsKey("synthetic_encode_mode")) {
            eVar.F = Integer.parseInt(map.get("synthetic_encode_mode"));
        }
        if (map.containsKey("synthetic_video_hw_bitrate")) {
            eVar.G = Integer.parseInt(map.get("synthetic_video_hw_bitrate"));
        }
        if (map.containsKey("synthetic_hw_bitrate_mode")) {
            eVar.H = Integer.parseInt(map.get("synthetic_hw_bitrate_mode"));
        }
        if (map.containsKey("synthetic_hw_profile")) {
            eVar.I = Integer.parseInt(map.get("synthetic_hw_profile"));
        }
        if (map.containsKey("earphone_echo_normal")) {
            eVar.J = Integer.parseInt(map.get("earphone_echo_normal"));
        }
        if (map.containsKey("earphone_echo_aaudio")) {
            eVar.K = Integer.parseInt(map.get("earphone_echo_aaudio"));
        }
        if (map.containsKey("earphone_echo_huawei")) {
            eVar.L = Integer.parseInt(map.get("earphone_echo_huawei"));
        }
    }
}
