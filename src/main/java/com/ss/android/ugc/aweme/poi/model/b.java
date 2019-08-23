package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.data.Address;
import java.io.Serializable;

public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address")
    public String address;
    @SerializedName("city")
    public String city;
    @SerializedName("city_code")
    public String cityCode;
    @SerializedName("country")
    public String country;
    @SerializedName("country_code")
    public String countryCode;
    @SerializedName("district")
    public String district;
    @SerializedName("province")
    public String province;
    @SerializedName("simple_addr")
    public String simpleAddr;

    public final String getAddress() {
        return this.address;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getSimpleAddr() {
        return this.simpleAddr;
    }

    public final Address toStickerPoiCard() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64995, new Class[0], Address.class)) {
            return (Address) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64995, new Class[0], Address.class);
        }
        Address address2 = new Address();
        address2.setProvice(this.province);
        address2.setCity(this.city);
        address2.setDistrict(this.district);
        address2.setAddress(this.address);
        address2.setSimpleAddr(this.simpleAddr);
        return address2;
    }

    public final void fromStickerPoiStruct(Address address2) {
        if (PatchProxy.isSupport(new Object[]{address2}, this, changeQuickRedirect, false, 64996, new Class[]{Address.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{address2}, this, changeQuickRedirect, false, 64996, new Class[]{Address.class}, Void.TYPE);
        } else if (address2 != null) {
            this.province = address2.getProvice();
            this.city = address2.getCity();
            this.district = address2.getDistrict();
            this.address = address2.getAddress();
            this.simpleAddr = address2.getSimpleAddr();
        }
    }
}
