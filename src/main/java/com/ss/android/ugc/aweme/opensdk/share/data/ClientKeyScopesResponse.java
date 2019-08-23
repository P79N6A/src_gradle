package com.ss.android.ugc.aweme.opensdk.share.data;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class ClientKeyScopesResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DataBean data;

    @Keep
    public static class DataBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String app_name;
        private List<ScopesBean> scopes;

        @Keep
        public static class ScopesBean {
            public static ChangeQuickRedirect changeQuickRedirect;
            private String desc;
            private String name;

            public String getDesc() {
                return this.desc;
            }

            public String getName() {
                return this.name;
            }

            public void setDesc(String str) {
                this.desc = str;
            }

            public void setName(String str) {
                this.name = str;
            }
        }

        public String getAppName() {
            return this.app_name;
        }

        public List<ScopesBean> getScopes() {
            return this.scopes;
        }

        public void setAppName(String str) {
            this.app_name = str;
        }

        public void setScopes(List<ScopesBean> list) {
            this.scopes = list;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
