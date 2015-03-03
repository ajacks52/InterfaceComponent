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

        TextView tv1 = (TextView) view.findViewById(R.id.textView2);

        Button button1 = (Button) view.findViewById(R.id.button1);
        Button button2 = (Button) view.findViewById(R.id.button2);
        Button button3 = (Button) view.findViewById(R.id.button3);

        tv1.setText("Fragment # "+mPage+" \n\nTextView, you can edit me in " +
                "the onCreateView method of the PageFragment class. Give me a slide.");

        switch (mPage)
        {
            /* inflate 2 views */
            case 2: button1.setVisibility(View.VISIBLE);
                break;
            /* inflate 3 views */
            case 3: button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                break;
            /* inflate 4 views */
            case 4:
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                break;
            default: // don't do anything
        }


        return view;
    }
}