package com.duckduckgo.mobile.android.util;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DDGControlVar {
	
	public static SCREEN START_SCREEN = SCREEN.SCR_STORIES;	// stories
	
	public static boolean hasUpdatedFeed = false;
	public static String regionString = "wt-wt";	// world traveler (none) as default
	
	public static String sourceJSON = null;
	public static String storiesJSON = null;
	public static Map<String,String> simpleSourceMap = null;
	public static Set<String> defaultSourceSet = null;
	
	public static String targetSource = null; 
	
	public static boolean useDefaultSources = true;
	public static boolean hasUpdatedSources = false;
	
	public static Set<String> readArticles = new HashSet<String>(); 
	
	public static boolean homeScreenShowing = true;
	
	public static boolean includeAppsInSearch = false;
	public static boolean alwaysUseExternalBrowser = false;
	public static boolean isAutocompleteActive = true;
	
	public static int fontProgress = DDGConstants.FONT_SEEKBAR_MID;	// over scale 0-10
	public static int fontPrevProgress = DDGConstants.FONT_SEEKBAR_MID;	// over scale 0-10
	public static int mainTextSize, prevMainTextSize;
	public static int recentTextSize, prevRecentTextSize; 
	public static int webViewTextSize = -1, prevWebViewTextSize = -1;
	public static int ptrHeaderSize, prevPtrHeaderSize;
	public static int ptrSubHeaderSize, prevPtrSubHeaderSize;
	public static int leftTitleTextSize, prevLeftTitleTextSize;
	
//	public static TaskCompleteSignal taskCompleteSignal = new TaskCompleteSignal();
	
	public static boolean hasAppsIndexed = false;
}
