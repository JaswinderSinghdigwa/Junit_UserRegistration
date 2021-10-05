package com.bl.moodanalyzer;

/**
 * Purpose  - Mood Analyser for user
 * @author  - Jaswinder Singh
 * @version - 16.0
 * @since   - 03-10-2021
 */

public class MoodAnalyser {

    public static boolean analyseMood(String moodanalyser) {
        if (moodanalyser.toLowerCase().contains("happy")) {
            return true;
        } else if (moodanalyser.toLowerCase().contains("sad")) {
            return false;
        } else return (Boolean) null;
    }
}