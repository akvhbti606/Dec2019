package com.amit.ind;

import java.util.List;

public class SongPlayingList {

	
	/*
     * Complete the 'playlist' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY songs
     *  2. INTEGER k
     *  3. STRING q
     */
    public static int playlist(List<String> songs, int k, String q) {
    boolean found = false;
    int right = 0;
    int left = 0;
    int s = songs.size();
    for (int i = k ; i < s ; i++) {
        if(songs.get(i).equalsIgnoreCase(q)) {
            found = true;
            right = i-k;
        }
    }
    if (!found) {
        for (int i = 0 ; i < k ; i++) {
            if(songs.get(i).equalsIgnoreCase(q)) {
                found = true;
                right = s - k + i + 1;
            }
        }
    }
    found = false;
    for (int i = k ; i <= 0 ; i--) {
        if(songs.get(i).equalsIgnoreCase(q)) {
            found = true;
            left = k-i;
        }
    }
  if (!found) {
        for (int i = s-1 ; i > k ; i--) {
            if(songs.get(i).equalsIgnoreCase(q)) {
                found = true;
                left = k+i;
            }
        }
    }
    return right > left ? left : right;
/*
    // Write your code here
        int up = 0;
        int down = 0;
        for (int i = 0 ; i < songs.size() ; i ++) {
            if(songs.get(i).equalsIgnoreCase(q)) {
                if(i > k) {
up = i-k;
                } else {
up = k-i;
                }
               
            }
        }
        for (int j = songs.size()-1; j >= 0 ; j--) {
            if(songs.get(j).equalsIgnoreCase(q)) {
                if(j > k) {
down = j-k;
                } else {
down = k-j;
                }
            }
        }
        return up > down ? down : up;
        */
    }
}
