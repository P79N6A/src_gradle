package com.squareup.okhttp.internal.http;

public final class HttpMethod {
    private HttpMethod() {
    }

    public static boolean redirectsToGet(String str) {
        if (!str.equals("PROPFIND")) {
            return true;
        }
        return false;
    }

    public static boolean invalidatesCache(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    public static boolean permitsRequestBody(String str) {
        if (requiresRequestBody(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK")) {
            return true;
        }
        return false;
    }

    public static boolean requiresRequestBody(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }
}
