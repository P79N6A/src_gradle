package com.umeng.analytics.social;

import android.text.TextUtils;
import com.umeng.analytics.pro.by;
import java.util.Locale;

public class UMPlatformData {

    /* renamed from: a  reason: collision with root package name */
    private UMedia f80708a;

    /* renamed from: b  reason: collision with root package name */
    private String f80709b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f80710c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f80711d;

    /* renamed from: e  reason: collision with root package name */
    private GENDER f80712e;

    public enum GENDER {
        MALE(0) {
            public final String toString() {
                return String.format(Locale.US, "Male:%d", new Object[]{Integer.valueOf(this.value)});
            }
        },
        FEMALE(1) {
            public final String toString() {
                return String.format(Locale.US, "Female:%d", new Object[]{Integer.valueOf(this.value)});
            }
        };
        
        public int value;

        private GENDER(int i) {
            this.value = i;
        }
    }

    public enum UMedia {
        SINA_WEIBO {
            public final String toString() {
                return "sina";
            }
        },
        TENCENT_WEIBO {
            public final String toString() {
                return "tencent";
            }
        },
        TENCENT_QZONE {
            public final String toString() {
                return "qzone";
            }
        },
        TENCENT_QQ {
            public final String toString() {
                return "qq";
            }
        },
        WEIXIN_FRIENDS {
            public final String toString() {
                return "wxsesion";
            }
        },
        WEIXIN_CIRCLE {
            public final String toString() {
                return "wxtimeline";
            }
        },
        RENREN {
            public final String toString() {
                return "renren";
            }
        },
        DOUBAN {
            public final String toString() {
                return "douban";
            }
        }
    }

    public GENDER getGender() {
        return this.f80712e;
    }

    public UMedia getMeida() {
        return this.f80708a;
    }

    public String getName() {
        return this.f80711d;
    }

    public String getUsid() {
        return this.f80709b;
    }

    public String getWeiboId() {
        return this.f80710c;
    }

    public boolean isValid() {
        if (this.f80708a == null || TextUtils.isEmpty(this.f80709b)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "UMPlatformData [meida=" + this.f80708a + ", usid=" + this.f80709b + ", weiboId=" + this.f80710c + ", name=" + this.f80711d + ", gender=" + this.f80712e + "]";
    }

    public void setGender(GENDER gender) {
        this.f80712e = gender;
    }

    public void setName(String str) {
        this.f80711d = str;
    }

    public void setWeiboId(String str) {
        this.f80710c = str;
    }

    public UMPlatformData(UMedia uMedia, String str) {
        if (uMedia == null || TextUtils.isEmpty(str)) {
            by.e("parameter is not valid");
            return;
        }
        this.f80708a = uMedia;
        this.f80709b = str;
    }
}
