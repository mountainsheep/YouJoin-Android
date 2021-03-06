package me.zq.youjoin.fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.zq.youjoin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends BaseFragment {


    @Bind(R.id.sessionlist)
    ListView sessionlist;
    @Bind(R.id.add_msg_fab)
    FloatingActionButton addMsgFab;

    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        ButterKnife.bind(this, view);

        addMsgFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        TextView emptyView = new TextView(getActivity());
        emptyView.setText(getString(R.string.hint_nodata));
        emptyView.setPadding(20, 20, 0, 0);
        ViewGroup parentView = (ViewGroup) sessionlist.getParent();
        parentView.addView(emptyView, 2);
        sessionlist.setEmptyView(emptyView);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
