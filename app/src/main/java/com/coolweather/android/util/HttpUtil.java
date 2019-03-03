package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        LogUtil.d("HttpUtil",address);
        Request request = new Request.Builder().url(address).build();
        LogUtil.d("HttpUtil","13111");
        client.newCall(request).enqueue(callback);
        LogUtil.d("HttpUtil","233311");
    }
}
