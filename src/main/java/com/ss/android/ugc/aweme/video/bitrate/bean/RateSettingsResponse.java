package com.ss.android.ugc.aweme.video.bitrate.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class RateSettingsResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("adaptive_gear_group")
    private b adaptiveGearGroup;
    @SerializedName("auto_bitrate_params")
    private a autoBitrateSet;
    @SerializedName("bandwidth_map")
    private List<BandwidthSet> bandwidthSet;
    @SerializedName("default_gear_group")
    private String defaultGearGroup;
    @SerializedName("definition_gear_group")
    private b definitionGearGroup;
    @SerializedName("flow_gear_group")
    private b flowGearGroup;
    @SerializedName("gear_set")
    private List<GearSet> gearSet;

    public b getAdaptiveGearGroup() {
        return this.adaptiveGearGroup;
    }

    public a getAutoBitrateSet() {
        return this.autoBitrateSet;
    }

    public List<BandwidthSet> getBandwidthSet() {
        return this.bandwidthSet;
    }

    public String getDefaultGearGroup() {
        return this.defaultGearGroup;
    }

    public b getDefinitionGearGroup() {
        return this.definitionGearGroup;
    }

    public b getFlowGearGroup() {
        return this.flowGearGroup;
    }

    public List<GearSet> getGearSet() {
        return this.gearSet;
    }

    public boolean isValid() {
        if (this.adaptiveGearGroup == null || (this.gearSet == null && this.bandwidthSet == null && this.autoBitrateSet == null)) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89082, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89082, new Class[0], String.class);
        }
        return "RateSettingsResponse{flowGearGroup=" + this.flowGearGroup + ", adaptiveGearGroup=" + this.adaptiveGearGroup + ", defaultGearGroup='" + this.defaultGearGroup + '\'' + ", definitionGearGroup=" + this.definitionGearGroup + ", gearSet=" + this.gearSet + ", bandwidthSet=" + this.bandwidthSet + ", autoBitrateSet=" + this.autoBitrateSet + '}';
    }

    public void setAdaptiveGearGroup(b bVar) {
        this.adaptiveGearGroup = bVar;
    }

    public void setAutoBitrateSet(a aVar) {
        this.autoBitrateSet = aVar;
    }

    public void setBandwidthSet(List<BandwidthSet> list) {
        this.bandwidthSet = list;
    }

    public void setDefaultGearGroup(String str) {
        this.defaultGearGroup = str;
    }

    public void setDefinitionGearGroup(b bVar) {
        this.definitionGearGroup = bVar;
    }

    public void setFlowGearGroup(b bVar) {
        this.flowGearGroup = bVar;
    }

    public void setGearSet(List<GearSet> list) {
        this.gearSet = list;
    }
}
