package com.sjh.spring.letsbe09.utils

class StringUtil {

    private StringUtil () {}

    static String lpad (String str, int len, String addStr) {
        String result = str
        int templen = len - result.length();
        for (int i = 0; i < templen; i++) {
            result = addStr + result
        }
        return result
    }

}
