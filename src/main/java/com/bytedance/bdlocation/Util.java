package com.bytedance.bdlocation;

import android.location.Location;
import com.bytedance.bdlocation.utils.BDLocationDeserializer;
import com.bytedance.bdlocation.utils.BDLocationSerializer;
import com.bytedance.bdlocation.utils.LocationDeserializer;
import com.bytedance.bdlocation.utils.LocationSerializer;
import com.bytedance.bdlocation.utils.f;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Collection;

public class Util {
    public static Gson sGson = new GsonBuilder().addDeserializationExclusionStrategy(new f()).addSerializationExclusionStrategy(new f()).registerTypeHierarchyAdapter(Location.class, new LocationSerializer()).registerTypeHierarchyAdapter(Location.class, new LocationDeserializer()).registerTypeHierarchyAdapter(BDLocation.class, new BDLocationSerializer()).registerTypeHierarchyAdapter(BDLocation.class, new BDLocationDeserializer()).create();

    public static boolean isEmpty(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
