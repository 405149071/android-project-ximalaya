package com.venn.zhufengfm.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.venn.zhufengfm.app.R;

public class CustomFragment extends Fragment {


	public CustomFragment() {
		// Required empty public constructor
	}


	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_custom, container, false);
	}


}
