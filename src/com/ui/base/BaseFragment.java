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


package com.ui.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {
	
	public abstract BaseObjectFragment onBaseCreateView(BaseObjectFragment baseObjectFragment);
	
	@Override
    public View onCreateView(LayoutInflater layoutInflater, 
    							ViewGroup viewGroup, 
    							Bundle bundle) {	
		super.onCreate(bundle);		
		BaseObjectFragment baseObjectFragment = (BaseObjectFragment) this.onBaseCreateView(new BaseObjectFragment(
																						bundle,
																						this.getActivity().getIntent(),
																						this.getActivity(),												
																						this.getActivity().getAssets(),
																						layoutInflater, 
																						viewGroup));		
		return baseObjectFragment.getView();		
    }	
	
	public BaseObjectFragment setContentView(BaseObjectFragment baseObjectFragment, int framgentLayoutId) {
		baseObjectFragment.setView(baseObjectFragment.layoutInflater.inflate(framgentLayoutId, 
																				baseObjectFragment.viewGroup, 
																				false));
		return baseObjectFragment;
	}
}