package com.testapp.ic.content;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.testapp.ic.R;

/**
 * Created on 2/27/15.
 */
public class PageFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);

        TextView textView1 = (TextView) view;
        textView1.setText("Fragment #" + mPage);




//        for (String key : titles.keySet()) {
//            View row = inflater.inflate(R.layout.row, vg, false);
//            TextView label = (TextView) row.findViewById(R.id.textView1);
//            label.setText(key);
//            TextView value = (TextView) row.findViewById(R.id.textView2);
//            value.setText(getArg(key));
//            vg.addView(row);
//        }
        return view;
    }
}