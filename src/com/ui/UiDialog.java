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

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

public class UiDialog {

	public void show(Context context, String title, String message) {
		new AlertDialog.Builder(context)
				.setTitle("Delete entry")
				.setMessage("Are you sure you want to delete this entry?")
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// continue with delete
							}
						})
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// do nothing
					}
				}).show();
	}
	
//	public ProgressDialog showProgressDialog(Context context, 
//												View view) {
		
	public ProgressDialog showProgressDialog(Context context) {		
		return new ProgressDialog(context);
//		ProgressDialog progressDialog = new ProgressDialog(context);
//		progressDialog.setTitle("Wait");
//		progressDialog.setMessage("Loading...");		
////		progressDialog.addContentView(view, view.getLayoutParams());
//		
//		progressDialog.setIndeterminate(true);
//		progressDialog.setCancelable(false);
//		progressDialog.show();
//		progressDialog.setContentView(view);
//		return progressDialog;
	}
}
