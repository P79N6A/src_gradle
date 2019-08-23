package com.ss.android.ugc.aweme.wallet.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class WalletEntranceResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("banner")
    private a banner;
    @SerializedName("can_enter_banner")
    private boolean canEnterBanner;
    @SerializedName("cells")
    private List<b> cells;
    @SerializedName("my_wallet")
    private c myWallet;
    @SerializedName("show_banner")
    private boolean showBanner;

    public static class a {
        @SerializedName("page_url_android")

        /* renamed from: a  reason: collision with root package name */
        public String f76569a;
        @SerializedName("bg_img_url_android")

        /* renamed from: b  reason: collision with root package name */
        public String f76570b;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76571a;
        @SerializedName("id")

        /* renamed from: b  reason: collision with root package name */
        public int f76572b;
        @SerializedName("event")

        /* renamed from: c  reason: collision with root package name */
        public String f76573c;
        @SerializedName("title")

        /* renamed from: d  reason: collision with root package name */
        public String f76574d;
        @SerializedName("description")

        /* renamed from: e  reason: collision with root package name */
        public String f76575e;
        @SerializedName("link")

        /* renamed from: f  reason: collision with root package name */
        public String f76576f;
        @SerializedName("icon")
        public String g;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f76571a, false, 89800, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f76571a, false, 89800, new Class[0], String.class);
            }
            return "Cell{id=" + this.f76572b + ", event='" + this.f76573c + '\'' + ", title='" + this.f76574d + '\'' + ", description='" + this.f76575e + '\'' + ", link='" + this.f76576f + '\'' + ", icon='" + this.g + '\'' + '}';
        }
    }

    public static class c {
        @SerializedName("diamond_count")

        /* renamed from: a  reason: collision with root package name */
        public int f76577a;
    }

    public a getBanner() {
        return this.banner;
    }

    public List<b> getCells() {
        return this.cells;
    }

    public c getMyWallet() {
        return this.myWallet;
    }

    public boolean isCanEnterBanner() {
        return this.canEnterBanner;
    }

    public boolean isShowBanner() {
        return this.showBanner;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89799, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89799, new Class[0], String.class);
        }
        return "WalletEntranceResponse{showBanner=" + this.showBanner + ", canEnterBanner=" + this.canEnterBanner + ", banner=" + this.banner + ", myWallet=" + this.myWallet + ", cells=" + this.cells + ", status_code=" + this.status_code + '}';
    }

    public void setBanner(a aVar) {
        this.banner = aVar;
    }

    public void setCanEnterBanner(boolean z) {
        this.canEnterBanner = z;
    }

    public void setCells(List<b> list) {
        this.cells = list;
    }

    public void setMyWallet(c cVar) {
        this.myWallet = cVar;
    }

    public void setShowBanner(boolean z) {
        this.showBanner = z;
    }
}
