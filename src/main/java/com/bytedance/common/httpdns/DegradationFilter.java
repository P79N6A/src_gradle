package com.bytedance.common.httpdns;

public interface DegradationFilter {
    boolean shouldDegradeHttpDNS(String str);
}
