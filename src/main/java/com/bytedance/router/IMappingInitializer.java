package com.bytedance.router;

import java.util.Map;

public interface IMappingInitializer {
    void init(Map<String, String> map);
}
