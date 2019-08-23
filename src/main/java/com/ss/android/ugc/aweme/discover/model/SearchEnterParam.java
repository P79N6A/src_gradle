package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class SearchEnterParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    static final long serialVersionUID = 42;
    @Nullable
    private String enterSearchFrom;
    @Nullable
    private String groupId;
    @Nullable
    private String previousPage;

    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String enterSearchFrom;
        private String groupId;
        private String previousPage;

        public SearchEnterParam build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37080, new Class[0], SearchEnterParam.class)) {
                return (SearchEnterParam) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37080, new Class[0], SearchEnterParam.class);
            }
            SearchEnterParam searchEnterParam = new SearchEnterParam();
            searchEnterParam.setEnterSearchFrom(this.enterSearchFrom);
            searchEnterParam.setPreviousPage(this.previousPage);
            searchEnterParam.setGroupId(this.groupId);
            return searchEnterParam;
        }

        public Builder enterSearchFrom(String str) {
            this.enterSearchFrom = str;
            return this;
        }

        public Builder groupId(String str) {
            this.groupId = str;
            return this;
        }

        public Builder previousPage(String str) {
            this.previousPage = str;
            return this;
        }
    }

    @Nullable
    public String getEnterSearchFrom() {
        return this.enterSearchFrom;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public static Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 37079, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 37079, new Class[0], Builder.class);
        }
        return new Builder();
    }

    public void setEnterSearchFrom(@Nullable String str) {
        this.enterSearchFrom = str;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setPreviousPage(String str) {
        this.previousPage = str;
    }
}
