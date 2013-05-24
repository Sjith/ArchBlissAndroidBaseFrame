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

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public class UiLayoutInflater {
	
//	public View getLayoutView(Context context, int layoutId) {
//		LayoutInflater inflater = LayoutInflater.from(context);
//		return (View) inflater.inflate(layoutId, null);
//	}
	
	public View getLayoutView(Context context, int layoutId) {
		LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		return (View) infalInflater.inflate(layoutId, null);
	}
	
//	public LayoutParams getLayoutParamsMatchParent() {
//		return new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
//	}
//	
}
