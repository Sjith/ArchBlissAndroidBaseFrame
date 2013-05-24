/*
 * Copyright (C) 2013 Arch Bliss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.ui;

import android.content.Context;

public class UiSharePreference {
	// SharedPreferences.Editor editor = context.getSharedPreferences(zlass, Context.MODE_PRIVATE).edit();
	
	public static final String zlass = UiSharePreference.class.toString();
	
	public void add(Context context, String key, String value) {
		context.getSharedPreferences(zlass, Context.MODE_PRIVATE).edit().putString(key, value).commit();			
	}
	
	public String getString(Context context, String key, String defValue) {
		return (String) context.getSharedPreferences(zlass, Context.MODE_PRIVATE).getString(key, defValue);			
	}
	
	public void remove(Context context, String key) {
		context.getSharedPreferences(zlass, Context.MODE_PRIVATE).edit().remove(key).commit();		
	}
	
	public void clearAll(Context context) {
		context.getSharedPreferences(zlass, Context.MODE_PRIVATE).edit().clear().commit();				
	}
}
