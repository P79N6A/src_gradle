package com.ss.android.vesdk.filterparam;

import android.support.annotation.Keep;
import java.util.HashMap;

@Keep
public class VEComposerFilterParam extends b {
    public int mode;
    public String[] nodePath;
    public HashMap<String, Object> nodeValueMap;
    public int orderType;
    public String[] reloadNodePath;
    public String resPath = "";

    public VEComposerFilterParam() {
        this.filterName = "composer filter";
        this.filterType = 18;
    }
}
