package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.ISecurity;
import anet.channel.security.c;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.Map;

public final class Config {
    public static final Config DEFAULT_CONFIG = new Builder().setTag("[default]").setAppkey("[default]").setEnv(ENV.ONLINE).build();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Config> f1108a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f1109b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f1110c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ENV f1111d = ENV.ONLINE;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ISecurity f1112e;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f1113a;

        /* renamed from: b  reason: collision with root package name */
        private String f1114b;

        /* renamed from: c  reason: collision with root package name */
        private ENV f1115c = ENV.ONLINE;

        /* renamed from: d  reason: collision with root package name */
        private String f1116d;

        /* renamed from: e  reason: collision with root package name */
        private String f1117e;

        public Config build() {
            if (!TextUtils.isEmpty(this.f1114b)) {
                for (Config config : Config.f1108a.values()) {
                    if (config.f1111d == this.f1115c && config.f1110c.equals(this.f1114b)) {
                        ALog.w("awcn.Config", "duplicated config exist!", null, "appkey", this.f1114b, "env", this.f1115c);
                        if (!TextUtils.isEmpty(this.f1113a)) {
                            synchronized (Config.f1108a) {
                                Config.f1108a.put(this.f1113a, config);
                            }
                        }
                        return config;
                    }
                }
                Config config2 = new Config();
                String unused = config2.f1110c = this.f1114b;
                ENV unused2 = config2.f1111d = this.f1115c;
                if (TextUtils.isEmpty(this.f1113a)) {
                    String unused3 = config2.f1109b = StringUtils.concatString(this.f1114b, ClassUtils.INNER_CLASS_SEPARATOR, this.f1115c.toString());
                } else {
                    String unused4 = config2.f1109b = this.f1113a;
                }
                if (!TextUtils.isEmpty(this.f1117e)) {
                    ISecurity unused5 = config2.f1112e = c.a().createNonSecurity(this.f1117e);
                } else {
                    ISecurity unused6 = config2.f1112e = c.a().createSecurity(this.f1116d);
                }
                synchronized (Config.f1108a) {
                    Config.f1108a.put(config2.f1109b, config2);
                }
                return config2;
            }
            throw new RuntimeException("appkey can not be null or empty!");
        }

        public Builder setAppSecret(String str) {
            this.f1117e = str;
            return this;
        }

        public Builder setAppkey(String str) {
            this.f1114b = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            this.f1116d = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            this.f1115c = env;
            return this;
        }

        public Builder setTag(String str) {
            this.f1113a = str;
            return this;
        }
    }

    public final String getAppkey() {
        return this.f1110c;
    }

    public final ENV getEnv() {
        return this.f1111d;
    }

    public final ISecurity getSecurity() {
        return this.f1112e;
    }

    public final String getTag() {
        return this.f1109b;
    }

    public final String toString() {
        return this.f1109b;
    }

    protected Config() {
    }

    public static Config getConfigByTag(String str) {
        Config config;
        synchronized (f1108a) {
            config = f1108a.get(str);
        }
        return config;
    }

    public static Config getConfig(String str, ENV env) {
        synchronized (f1108a) {
            for (Config next : f1108a.values()) {
                if (next.f1111d == env && next.f1110c.equals(str)) {
                    return next;
                }
            }
            return null;
        }
    }
}
