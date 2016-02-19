package com.yurasavchuk.simplehtmlparser.application.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.yurasavchuk.simplehtmlparser.R;
import com.yurasavchuk.simplehtmlparser.datacontroller.Callback;
import com.yurasavchuk.simplehtmlparser.datacontroller.StartupLiteController;
import com.yurasavchuk.simplehtmlparser.datacontroller.model.StartupLiteModel;

import java.util.ArrayList;

/**
 * Created by android on 18.02.16.
 */
public class StartupListFragment extends Fragment {

    private ListView mListView;
    private Button mExportButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartupLiteController.getList(mCallback);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.startup_list_fragment, container, false);
        mListView = (ListView) rootView.findViewById(R.id.listView);
        mExportButton = (Button) rootView.findViewById(R.id.exportButton);
        mExportButton.setOnClickListener(mOnClickListener);
        return rootView;
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    private Callback<ArrayList<StartupLiteModel>> mCallback = new Callback<ArrayList<StartupLiteModel>>() {
        @Override
        public void onResult(ArrayList<StartupLiteModel> result) {

        }

        @Override
        public void onError(String message) {

        }
    };
}
