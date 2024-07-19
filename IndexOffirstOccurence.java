class Solution {
    public int strStr(String haystack, String needle) {
        int l = 0;
        int r = needle.length();
        while (r <= haystack.length()) {
            for (int i = 0; i < needle.length(); i++) {
                if (haystack.charAt(l + i) == needle.charAt(i)) {
                    if (i == needle.length() - 1) {
                        return l;
                    }
                    continue;
                } else {
                    l++;
                    r++;
                    break;
                }
            }
        }
        return -1;
    }
}

// class Solution {
// public int strStr(String haystack, String needle) {
// if (haystack.length() < needle.length()) {
// return -1;
// }

// for (int i = 0; i <= haystack.length() - needle.length(); i++) {
// if (haystack.substring(i, i + needle.length()).equals(needle)) {
// return i;
// }
// }

// return -1;
// }
// }
